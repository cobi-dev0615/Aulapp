package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.IOException;

/* loaded from: classes2.dex */
final class GifInfoHandle {
    private volatile long gifInfoPtr;

    static {
        LibraryLoader.loadLibrary();
    }

    public GifInfoHandle(String str) {
        this.gifInfoPtr = openFile(str);
    }

    public static native int createTempNativeFileDescriptor();

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z);

    private static native void free(long j);

    private static native int getCurrentFrameIndex(long j);

    private static native int getCurrentLoop(long j);

    private static native int getCurrentPosition(long j);

    private static native int getDuration(long j);

    private static native int getHeight(long j);

    private static native int getLoopCount(long j);

    private static native int getNativeErrorCode(long j);

    private static int getNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z) {
        try {
            int createTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, createTempNativeFileDescriptor);
            return createTempNativeFileDescriptor;
        } finally {
            if (z) {
                Os.close(fileDescriptor);
            }
        }
    }

    private static native int getNumberOfFrames(long j);

    private static native long[] getSavedState(long j);

    private static native int getWidth(long j);

    private static native boolean isOpaque(long j);

    public static native long openFile(String str);

    private static long openFileDescriptor(FileDescriptor fileDescriptor, long j, boolean z) {
        int nativeFileDescriptor;
        if (Build.VERSION.SDK_INT > 27) {
            try {
                nativeFileDescriptor = getNativeFileDescriptor(fileDescriptor, z);
            } catch (Exception e) {
                throw new GifIOException(GifError.OPEN_FAILED.errorCode, e.getMessage());
            }
        } else {
            nativeFileDescriptor = extractNativeFileDescriptor(fileDescriptor, z);
        }
        return openNativeFileDescriptor(nativeFileDescriptor, j);
    }

    public static native long openNativeFileDescriptor(int i, long j);

    public static GifInfoHandle openUri(ContentResolver contentResolver, Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new GifInfoHandle(uri.getPath());
        }
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return new GifInfoHandle(openAssetFileDescriptor);
        }
        throw new IOException("Could not open AssetFileDescriptor for " + uri);
    }

    private static native long renderFrame(long j, Bitmap bitmap);

    private static native boolean reset(long j);

    private static native long restoreRemainder(long j);

    private static native int restoreSavedState(long j, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j);

    private static native void seekToTime(long j, int i, Bitmap bitmap);

    private static native void setLoopCount(long j, char c);

    public void finalize() {
        try {
            recycle();
        } finally {
            super.finalize();
        }
    }

    public synchronized int getCurrentFrameIndex() {
        return getCurrentFrameIndex(this.gifInfoPtr);
    }

    public synchronized int getCurrentLoop() {
        return getCurrentLoop(this.gifInfoPtr);
    }

    public synchronized int getCurrentPosition() {
        return getCurrentPosition(this.gifInfoPtr);
    }

    public synchronized int getDuration() {
        return getDuration(this.gifInfoPtr);
    }

    public synchronized int getHeight() {
        return getHeight(this.gifInfoPtr);
    }

    public synchronized int getLoopCount() {
        return getLoopCount(this.gifInfoPtr);
    }

    public synchronized int getNativeErrorCode() {
        return getNativeErrorCode(this.gifInfoPtr);
    }

    public synchronized int getNumberOfFrames() {
        return getNumberOfFrames(this.gifInfoPtr);
    }

    public synchronized long[] getSavedState() {
        return getSavedState(this.gifInfoPtr);
    }

    public synchronized int getWidth() {
        return getWidth(this.gifInfoPtr);
    }

    public synchronized boolean isOpaque() {
        return isOpaque(this.gifInfoPtr);
    }

    public synchronized boolean isRecycled() {
        return this.gifInfoPtr == 0;
    }

    public synchronized void recycle() {
        free(this.gifInfoPtr);
        this.gifInfoPtr = 0L;
    }

    public synchronized long renderFrame(Bitmap bitmap) {
        return renderFrame(this.gifInfoPtr, bitmap);
    }

    public synchronized boolean reset() {
        return reset(this.gifInfoPtr);
    }

    public synchronized long restoreRemainder() {
        return restoreRemainder(this.gifInfoPtr);
    }

    public synchronized int restoreSavedState(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.gifInfoPtr, jArr, bitmap);
    }

    public synchronized void saveRemainder() {
        saveRemainder(this.gifInfoPtr);
    }

    public synchronized void seekToTime(int i, Bitmap bitmap) {
        seekToTime(this.gifInfoPtr, i, bitmap);
    }

    public void setLoopCount(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.gifInfoPtr, (char) i);
        }
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) {
        try {
            this.gifInfoPtr = openFileDescriptor(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }
}
