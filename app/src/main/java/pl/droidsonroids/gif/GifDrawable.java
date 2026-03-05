package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.widget.MediaController;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class GifDrawable extends Drawable implements Animatable, MediaController.MediaPlayerControl {
    final Bitmap mBuffer;
    private final Rect mDstRect;
    final ScheduledThreadPoolExecutor mExecutor;
    final InvalidationHandler mInvalidationHandler;
    final boolean mIsRenderingTriggeredOnDraw;
    volatile boolean mIsRunning;
    final ConcurrentLinkedQueue<Object> mListeners;
    final GifInfoHandle mNativeInfoHandle;
    long mNextFrameRenderTime;
    protected final Paint mPaint;
    private final RenderTask mRenderTask;
    ScheduledFuture<?> mRenderTaskSchedule;
    private int mScaledHeight;
    private int mScaledWidth;
    private final Rect mSrcRect;
    private ColorStateList mTint;
    private PorterDuffColorFilter mTintFilter;
    private PorterDuff.Mode mTintMode;

    public GifDrawable(Resources resources, int i) {
        this(resources.openRawResourceFd(i));
        float densityScale = GifViewUtils.getDensityScale(resources, i);
        this.mScaledHeight = (int) (this.mNativeInfoHandle.getHeight() * densityScale);
        this.mScaledWidth = (int) (this.mNativeInfoHandle.getWidth() * densityScale);
    }

    private void cancelPendingRenderTask() {
        ScheduledFuture<?> scheduledFuture = this.mRenderTaskSchedule;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.mInvalidationHandler.removeMessages(-1);
    }

    private void scheduleNextRender() {
        if (this.mIsRenderingTriggeredOnDraw && this.mIsRunning) {
            long j = this.mNextFrameRenderTime;
            if (j != Long.MIN_VALUE) {
                long max = Math.max(0L, j - SystemClock.uptimeMillis());
                this.mNextFrameRenderTime = Long.MIN_VALUE;
                this.mExecutor.remove(this.mRenderTask);
                this.mRenderTaskSchedule = this.mExecutor.schedule(this.mRenderTask, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    private void shutdown() {
        this.mIsRunning = false;
        this.mInvalidationHandler.removeMessages(-1);
        this.mNativeInfoHandle.recycle();
    }

    private PorterDuffColorFilter updateTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return getNumberOfFrames() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return getNumberOfFrames() > 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        if (this.mTintFilter == null || this.mPaint.getColorFilter() != null) {
            z = false;
        } else {
            this.mPaint.setColorFilter(this.mTintFilter);
            z = true;
        }
        canvas.drawBitmap(this.mBuffer, this.mSrcRect, this.mDstRect, this.mPaint);
        if (z) {
            this.mPaint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mPaint.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.mPaint.getColorFilter();
    }

    public int getCurrentFrameIndex() {
        return this.mNativeInfoHandle.getCurrentFrameIndex();
    }

    public int getCurrentLoop() {
        int currentLoop = this.mNativeInfoHandle.getCurrentLoop();
        return (currentLoop == 0 || currentLoop < this.mNativeInfoHandle.getLoopCount()) ? currentLoop : currentLoop - 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return this.mNativeInfoHandle.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return this.mNativeInfoHandle.getDuration();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mScaledHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mScaledWidth;
    }

    public int getNumberOfFrames() {
        return this.mNativeInfoHandle.getNumberOfFrames();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (!this.mNativeInfoHandle.isOpaque() || this.mPaint.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        scheduleNextRender();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.mIsRunning;
    }

    public boolean isRecycled() {
        return this.mNativeInfoHandle.isRecycled();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.mIsRunning;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.mTint;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.mDstRect.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.mTint;
        if (colorStateList == null || (mode = this.mTintMode) == null) {
            return false;
        }
        this.mTintFilter = updateTintFilter(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        stop();
    }

    public void reset() {
        this.mExecutor.execute(new SafeRunnable(this) { // from class: pl.droidsonroids.gif.GifDrawable.1
            @Override // pl.droidsonroids.gif.SafeRunnable
            public void doWork() {
                if (GifDrawable.this.mNativeInfoHandle.reset()) {
                    GifDrawable.this.start();
                }
            }
        });
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(final int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.mExecutor.execute(new SafeRunnable(this) { // from class: pl.droidsonroids.gif.GifDrawable.2
            @Override // pl.droidsonroids.gif.SafeRunnable
            public void doWork() {
                GifDrawable gifDrawable = GifDrawable.this;
                gifDrawable.mNativeInfoHandle.seekToTime(i, gifDrawable.mBuffer);
                this.mGifDrawable.mInvalidationHandler.sendEmptyMessageAtTime(-1, 0L);
            }
        });
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mPaint.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mPaint.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.mPaint.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.mPaint.setFilterBitmap(z);
        invalidateSelf();
    }

    public void setLoopCount(int i) {
        this.mNativeInfoHandle.setLoopCount(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.mTint = colorStateList;
        this.mTintFilter = updateTintFilter(colorStateList, this.mTintMode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.mTintMode = mode;
        this.mTintFilter = updateTintFilter(this.mTint, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (!this.mIsRenderingTriggeredOnDraw) {
            if (z) {
                if (z2) {
                    reset();
                }
                if (visible) {
                    start();
                    return visible;
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
        synchronized (this) {
            try {
                if (this.mIsRunning) {
                    return;
                }
                this.mIsRunning = true;
                startAnimation(this.mNativeInfoHandle.restoreRemainder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void startAnimation(long j) {
        if (this.mIsRenderingTriggeredOnDraw) {
            this.mNextFrameRenderTime = 0L;
            this.mInvalidationHandler.sendEmptyMessageAtTime(-1, 0L);
        } else {
            cancelPendingRenderTask();
            this.mRenderTaskSchedule = this.mExecutor.schedule(this.mRenderTask, Math.max(j, 0L), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            try {
                if (this.mIsRunning) {
                    this.mIsRunning = false;
                    cancelPendingRenderTask();
                    this.mNativeInfoHandle.saveRemainder();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        Locale locale = Locale.ENGLISH;
        return "GIF: size: " + this.mNativeInfoHandle.getWidth() + "x" + this.mNativeInfoHandle.getHeight() + ", frames: " + this.mNativeInfoHandle.getNumberOfFrames() + ", error: " + this.mNativeInfoHandle.getNativeErrorCode();
    }

    public GifDrawable(AssetFileDescriptor assetFileDescriptor) {
        this(new GifInfoHandle(assetFileDescriptor), null, null, true);
    }

    public GifDrawable(ContentResolver contentResolver, Uri uri) {
        this(GifInfoHandle.openUri(contentResolver, uri), null, null, true);
    }

    public GifDrawable(GifInfoHandle gifInfoHandle, GifDrawable gifDrawable, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z) {
        this.mIsRunning = true;
        this.mNextFrameRenderTime = Long.MIN_VALUE;
        this.mDstRect = new Rect();
        this.mPaint = new Paint(6);
        this.mListeners = new ConcurrentLinkedQueue<>();
        RenderTask renderTask = new RenderTask(this);
        this.mRenderTask = renderTask;
        this.mIsRenderingTriggeredOnDraw = z;
        this.mExecutor = scheduledThreadPoolExecutor == null ? GifRenderingExecutor.getInstance() : scheduledThreadPoolExecutor;
        this.mNativeInfoHandle = gifInfoHandle;
        Bitmap bitmap = null;
        if (gifDrawable != null) {
            synchronized (gifDrawable.mNativeInfoHandle) {
                try {
                    if (!gifDrawable.mNativeInfoHandle.isRecycled() && gifDrawable.mNativeInfoHandle.getHeight() >= gifInfoHandle.getHeight() && gifDrawable.mNativeInfoHandle.getWidth() >= gifInfoHandle.getWidth()) {
                        gifDrawable.shutdown();
                        bitmap = gifDrawable.mBuffer;
                        bitmap.eraseColor(0);
                    }
                } finally {
                }
            }
        }
        if (bitmap == null) {
            this.mBuffer = Bitmap.createBitmap(gifInfoHandle.getWidth(), gifInfoHandle.getHeight(), Bitmap.Config.ARGB_8888);
        } else {
            this.mBuffer = bitmap;
        }
        this.mBuffer.setHasAlpha(!gifInfoHandle.isOpaque());
        this.mSrcRect = new Rect(0, 0, gifInfoHandle.getWidth(), gifInfoHandle.getHeight());
        this.mInvalidationHandler = new InvalidationHandler(this);
        renderTask.doWork();
        this.mScaledWidth = gifInfoHandle.getWidth();
        this.mScaledHeight = gifInfoHandle.getHeight();
    }
}
