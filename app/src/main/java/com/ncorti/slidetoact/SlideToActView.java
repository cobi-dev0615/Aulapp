package com.ncorti.slidetoact;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.TextViewCompat;
import co.ceduladigital.sdk.p8;
import co.ceduladigital.sdk.s;
import co.ceduladigital.sdk.y0;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentClassInCourseBinding;
import com.gse.aulapp.view.fragment.ClassInCourseFragment;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import com.karumi.dexter.BuildConfig;
import com.ncorti.slidetoact.SlideToActView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\r\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 µ\u00012\u00020\u0001:\fµ\u0001¶\u0001·\u0001¸\u0001¹\u0001º\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#J\u001f\u0010'\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\f2\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010-J\u0017\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0019H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u0010-J\u0017\u00103\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0019H\u0002¢\u0006\u0004\b3\u00101J\u000f\u00104\u001a\u00020\fH\u0002¢\u0006\u0004\b4\u0010-J\u000f\u00105\u001a\u00020\fH\u0003¢\u0006\u0004\b5\u0010-R\u0016\u00106\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010<\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010:R\u0016\u0010>\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010:R\u0016\u0010?\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010:R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010:R\u0014\u0010A\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010:R*\u0010D\u001a\u00020B2\u0006\u0010C\u001a\u00020B8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010J\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010:\u001a\u0004\bK\u0010L\"\u0004\bM\u0010+R*\u0010N\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010:\u001a\u0004\bO\u0010L\"\u0004\bP\u0010+R*\u0010Q\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010:\u001a\u0004\bR\u0010L\"\u0004\bS\u0010+R*\u0010T\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010:\u001a\u0004\bU\u0010L\"\u0004\bV\u0010+R\"\u0010X\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010^\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010[\"\u0004\b`\u0010]R*\u0010a\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\ba\u0010:\u001a\u0004\bb\u0010L\"\u0004\bc\u0010+R*\u0010d\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bd\u0010:\u001a\u0004\be\u0010L\"\u0004\bf\u0010+R*\u0010g\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bg\u0010:\u001a\u0004\bh\u0010L\"\u0004\bi\u0010+R$\u0010j\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bj\u0010:\"\u0004\bk\u0010+R$\u0010l\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bl\u0010:\"\u0004\bm\u0010+R\u0016\u0010n\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u00107R\u0016\u0010o\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u00107R$\u0010p\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bp\u0010:\"\u0004\bq\u0010+R\u0016\u0010r\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u00107R\u0016\u0010s\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u00107R\u0014\u0010t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010:R\u0016\u0010u\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010:R\u0016\u0010v\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u00107R\u0016\u0010w\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010:R\u0016\u0010y\u001a\u00020x8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010{\u001a\u00020x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010zR\u0016\u0010|\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R+\u0010~\u001a\u00020\u00062\u0006\u0010C\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0013\n\u0004\b~\u0010:\u001a\u0004\b\u007f\u0010L\"\u0005\b\u0080\u0001\u0010+R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001a\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008b\u0001R\u0016\u0010\u008d\u0001\u001a\u00020$8\u0002X\u0082D¢\u0006\u0007\n\u0005\b\u008d\u0001\u00107R\u0018\u0010\u008e\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u00107R\u0018\u0010\u008f\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010}R\u0018\u0010\u0090\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010}R&\u0010\u0091\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010}\u001a\u0005\b\u0091\u0001\u0010\u001b\"\u0005\b\u0092\u0001\u00101R.\u0010\u0093\u0001\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010}\u001a\u0005\b\u0093\u0001\u0010\u001b\"\u0005\b\u0094\u0001\u00101R&\u0010\u0095\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010}\u001a\u0005\b\u0095\u0001\u0010\u001b\"\u0005\b\u0096\u0001\u00101R&\u0010\u0097\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010}\u001a\u0005\b\u0097\u0001\u0010\u001b\"\u0005\b\u0098\u0001\u00101R,\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R,\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R,\u0010¨\u0001\u001a\u0005\u0018\u00010§\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R,\u0010¯\u0001\u001a\u0005\u0018\u00010®\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001¨\u0006»\u0001"}, d2 = {"Lcom/ncorti/slidetoact/SlideToActView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "xmlAttrs", BuildConfig.FLAVOR, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", BuildConfig.FLAVOR, "onMeasure", "(II)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", BuildConfig.FLAVOR, "performClick", "()Z", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "completed", "withAnimation", "setCompleted", "(ZZ)V", BuildConfig.FLAVOR, "x", "y", "checkInsideButton", "(FF)Z", "inc", "increasePosition", "(I)V", "startAnimationComplete", "()V", "setBaseState", "state", "setCompletedNotAnimated", "(Z)V", "setCompleteState", "setCompletedAnimated", "startAnimationReset", "handleVibration", "mDesiredSliderHeightDp", "F", "mDesiredSliderWidthDp", "mDesiredSliderHeight", "I", "mDesiredSliderWidth", "mAreaHeight", "mAreaWidth", "mActualAreaWidth", "mBorderRadius", "mActualAreaMargin", "mOriginAreaMargin", BuildConfig.FLAVOR, "value", "text", "Ljava/lang/CharSequence;", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "typeFace", "getTypeFace", "()I", "setTypeFace", "textAppearance", "getTextAppearance", "setTextAppearance", "outerColor", "getOuterColor", "setOuterColor", "innerColor", "getInnerColor", "setInnerColor", BuildConfig.FLAVOR, "animDuration", "J", "getAnimDuration", "()J", "setAnimDuration", "(J)V", "bumpVibration", "getBumpVibration", "setBumpVibration", "textColor", "getTextColor", "setTextColor", "iconColor", "getIconColor", "setIconColor", "sliderIcon", "getSliderIcon", "setSliderIcon", "mPosition", "setMPosition", "mEffectivePosition", "setMEffectivePosition", "mTextYPosition", "mTextXPosition", "mTextSize", "setMTextSize", "mPositionPerc", "mPositionPercInv", "mIconMargin", "mArrowMargin", "mArrowAngle", "mTickMargin", "Landroid/graphics/drawable/Drawable;", "mDrawableArrow", "Landroid/graphics/drawable/Drawable;", "mDrawableTick", "mFlagDrawTick", "Z", "completeIcon", "getCompleteIcon", "setCompleteIcon", "Landroid/graphics/Paint;", "mOuterPaint", "Landroid/graphics/Paint;", "mInnerPaint", "mTextPaint", "Landroid/widget/TextView;", "mTextView", "Landroid/widget/TextView;", "Landroid/graphics/RectF;", "mInnerRect", "Landroid/graphics/RectF;", "mOuterRect", "mGraceValue", "mLastX", "mFlagMoving", "mIsCompleted", "isLocked", "setLocked", "isReversed", "setReversed", "isRotateIcon", "setRotateIcon", "isAnimateCompletion", "setAnimateCompletion", "Lcom/ncorti/slidetoact/SlideToActView$OnSlideCompleteListener;", "onSlideCompleteListener", "Lcom/ncorti/slidetoact/SlideToActView$OnSlideCompleteListener;", "getOnSlideCompleteListener", "()Lcom/ncorti/slidetoact/SlideToActView$OnSlideCompleteListener;", "setOnSlideCompleteListener", "(Lcom/ncorti/slidetoact/SlideToActView$OnSlideCompleteListener;)V", "Lcom/ncorti/slidetoact/SlideToActView$OnSlideToActAnimationEventListener;", "onSlideToActAnimationEventListener", "Lcom/ncorti/slidetoact/SlideToActView$OnSlideToActAnimationEventListener;", "getOnSlideToActAnimationEventListener", "()Lcom/ncorti/slidetoact/SlideToActView$OnSlideToActAnimationEventListener;", "setOnSlideToActAnimationEventListener", "(Lcom/ncorti/slidetoact/SlideToActView$OnSlideToActAnimationEventListener;)V", "Lcom/ncorti/slidetoact/SlideToActView$OnSlideResetListener;", "onSlideResetListener", "Lcom/ncorti/slidetoact/SlideToActView$OnSlideResetListener;", "getOnSlideResetListener", "()Lcom/ncorti/slidetoact/SlideToActView$OnSlideResetListener;", "setOnSlideResetListener", "(Lcom/ncorti/slidetoact/SlideToActView$OnSlideResetListener;)V", "Lcom/ncorti/slidetoact/SlideToActView$OnSlideUserFailedListener;", "onSlideUserFailedListener", "Lcom/ncorti/slidetoact/SlideToActView$OnSlideUserFailedListener;", "getOnSlideUserFailedListener", "()Lcom/ncorti/slidetoact/SlideToActView$OnSlideUserFailedListener;", "setOnSlideUserFailedListener", "(Lcom/ncorti/slidetoact/SlideToActView$OnSlideUserFailedListener;)V", "Companion", "OnSlideCompleteListener", "OnSlideResetListener", "OnSlideToActAnimationEventListener", "OnSlideUserFailedListener", "SlideToActOutlineProvider", "slidetoact_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SlideToActView extends View {
    private long animDuration;
    private long bumpVibration;
    private int completeIcon;
    private int iconColor;
    private int innerColor;
    private boolean isAnimateCompletion;
    private boolean isLocked;
    private boolean isReversed;
    private boolean isRotateIcon;
    private int mActualAreaMargin;
    private int mActualAreaWidth;
    private int mAreaHeight;
    private int mAreaWidth;
    private float mArrowAngle;
    private int mArrowMargin;
    private int mBorderRadius;
    private int mDesiredSliderHeight;
    private float mDesiredSliderHeightDp;
    private int mDesiredSliderWidth;
    private float mDesiredSliderWidthDp;
    private Drawable mDrawableArrow;
    private Drawable mDrawableTick;
    private int mEffectivePosition;
    private boolean mFlagDrawTick;
    private boolean mFlagMoving;
    private final float mGraceValue;
    private final int mIconMargin;
    private final Paint mInnerPaint;
    private RectF mInnerRect;
    private boolean mIsCompleted;
    private float mLastX;
    private final int mOriginAreaMargin;
    private final Paint mOuterPaint;
    private RectF mOuterRect;
    private int mPosition;
    private float mPositionPerc;
    private float mPositionPercInv;
    private Paint mTextPaint;
    private int mTextSize;
    private TextView mTextView;
    private float mTextXPosition;
    private float mTextYPosition;
    private int mTickMargin;
    private OnSlideCompleteListener onSlideCompleteListener;
    private int outerColor;
    private int sliderIcon;
    private CharSequence text;
    private int textAppearance;
    private int textColor;
    private int typeFace;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ncorti/slidetoact/SlideToActView$OnSlideCompleteListener;", BuildConfig.FLAVOR, "slidetoact_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnSlideCompleteListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ncorti/slidetoact/SlideToActView$OnSlideResetListener;", BuildConfig.FLAVOR, "slidetoact_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnSlideResetListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ncorti/slidetoact/SlideToActView$OnSlideToActAnimationEventListener;", BuildConfig.FLAVOR, "slidetoact_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnSlideToActAnimationEventListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/ncorti/slidetoact/SlideToActView$OnSlideUserFailedListener;", BuildConfig.FLAVOR, "slidetoact_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface OnSlideUserFailedListener {
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ncorti/slidetoact/SlideToActView$SlideToActOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "(Lcom/ncorti/slidetoact/SlideToActView;)V", "getOutline", BuildConfig.FLAVOR, "view", "Landroid/view/View;", "outline", "Landroid/graphics/Outline;", "slidetoact_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class SlideToActOutlineProvider extends ViewOutlineProvider {
        public SlideToActOutlineProvider() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view == null || outline == null) {
                return;
            }
            outline.setRoundRect(SlideToActView.this.mActualAreaWidth, 0, SlideToActView.this.mAreaWidth - SlideToActView.this.mActualAreaWidth, SlideToActView.this.mAreaHeight, SlideToActView.this.mBorderRadius);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToActView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean checkInsideButton(float x, float y) {
        if (0.0f >= y) {
            return false;
        }
        int i = this.mAreaHeight;
        if (y >= i) {
            return false;
        }
        int i2 = this.mEffectivePosition;
        return ((float) i2) < x && x < ((float) (i + i2));
    }

    private final void handleVibration() {
        Vibrator vibrator;
        if (this.bumpVibration > 0 && ContextCompat.checkSelfPermission(getContext(), "android.permission.VIBRATE") == 0) {
            if (Build.VERSION.SDK_INT >= 31) {
                Object systemService = getContext().getSystemService("vibrator_manager");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
                vibrator = s.h(systemService).getDefaultVibrator();
            } else {
                Object systemService2 = getContext().getSystemService("vibrator");
                Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                vibrator = (Vibrator) systemService2;
            }
            Intrinsics.checkNotNullExpressionValue(vibrator, "if (Build.VERSION.SDK_IN…CE) as Vibrator\n        }");
            vibrator.vibrate(VibrationEffect.createOneShot(this.bumpVibration, -1));
        }
    }

    private final void increasePosition(int inc) {
        setMPosition(this.isReversed ? this.mPosition - inc : this.mPosition + inc);
        if (this.mPosition < 0) {
            setMPosition(0);
        }
        int i = this.mPosition;
        int i2 = this.mAreaWidth;
        int i3 = this.mAreaHeight;
        if (i > i2 - i3) {
            setMPosition(i2 - i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onTouchEvent$lambda-2, reason: not valid java name */
    public static final void m21onTouchEvent$lambda2(SlideToActView this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.setMPosition(((Integer) animatedValue).intValue());
        this$0.invalidate();
    }

    private final void setBaseState() {
        setMPosition(0);
        this.mActualAreaMargin = this.mOriginAreaMargin;
        this.mActualAreaWidth = 0;
        this.mArrowMargin = this.mIconMargin;
        this.mIsCompleted = false;
        setEnabled(true);
        this.mFlagDrawTick = false;
    }

    private final void setCompleteState() {
        setMPosition(this.mAreaWidth - this.mAreaHeight);
        this.mActualAreaMargin = this.mAreaHeight / 2;
        this.mActualAreaWidth = this.mPosition / 2;
        this.mIsCompleted = true;
        setEnabled(false);
        SlideToActIconUtil.INSTANCE.startIconAnimation$slidetoact_release(this.mDrawableTick);
        this.mFlagDrawTick = true;
        this.mTickMargin = this.mIconMargin;
        invalidateOutline();
    }

    private final void setCompletedAnimated(boolean state) {
        if (!state) {
            if (this.mIsCompleted) {
                startAnimationReset();
            }
        } else {
            if (this.mIsCompleted) {
                return;
            }
            setEnabled(false);
            startAnimationComplete();
        }
    }

    private final void setCompletedNotAnimated(boolean state) {
        if (state) {
            setCompleteState();
        } else {
            setBaseState();
        }
    }

    private final void setMEffectivePosition(int i) {
        if (this.isReversed) {
            i = (this.mAreaWidth - this.mAreaHeight) - i;
        }
        this.mEffectivePosition = i;
    }

    private final void setMPosition(int i) {
        this.mPosition = i;
        if (this.mAreaWidth - this.mAreaHeight == 0) {
            this.mPositionPerc = 0.0f;
            this.mPositionPercInv = 1.0f;
        } else {
            float f = i;
            this.mPositionPerc = f / (this.mAreaWidth - this.mAreaHeight);
            this.mPositionPercInv = 1 - (f / (this.mAreaWidth - this.mAreaHeight));
            setMEffectivePosition(i);
        }
    }

    private final void setMTextSize(int i) {
        this.mTextSize = i;
        this.mTextView.setTextSize(0, i);
        this.mTextPaint.set(this.mTextView.getPaint());
    }

    private final void startAnimationComplete() {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator finalPositionAnimator = ValueAnimator.ofInt(this.mPosition, this.mAreaWidth - this.mAreaHeight);
        finalPositionAnimator.addUpdateListener(new p8(this, 1));
        ValueAnimator marginAnimator = ValueAnimator.ofInt(this.mActualAreaMargin, ((int) (this.mInnerRect.width() / 2)) + this.mActualAreaMargin);
        marginAnimator.addUpdateListener(new p8(this, 2));
        marginAnimator.setInterpolator(new AnticipateOvershootInterpolator(2.0f));
        ValueAnimator areaAnimator = ValueAnimator.ofInt(0, (this.mAreaWidth - this.mAreaHeight) / 2);
        areaAnimator.addUpdateListener(new p8(this, 3));
        ValueAnimator createIconAnimator = SlideToActIconUtil.INSTANCE.createIconAnimator(this, this.mDrawableTick, new p8(this, 4));
        ArrayList arrayList = new ArrayList();
        if (this.mPosition < this.mAreaWidth - this.mAreaHeight) {
            Intrinsics.checkNotNullExpressionValue(finalPositionAnimator, "finalPositionAnimator");
            arrayList.add(finalPositionAnimator);
        }
        if (this.isAnimateCompletion) {
            Intrinsics.checkNotNullExpressionValue(marginAnimator, "marginAnimator");
            arrayList.add(marginAnimator);
            Intrinsics.checkNotNullExpressionValue(areaAnimator, "areaAnimator");
            arrayList.add(areaAnimator);
            arrayList.add(createIconAnimator);
        }
        Object[] array = arrayList.toArray(new Animator[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Animator[] animatorArr = (Animator[]) array;
        animatorSet.playSequentially((Animator[]) Arrays.copyOf(animatorArr, animatorArr.length));
        animatorSet.setDuration(this.animDuration);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.ncorti.slidetoact.SlideToActView$startAnimationComplete$4
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator p0) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator p0) {
                SlideToActView.this.mIsCompleted = true;
                SlideToActView.this.getOnSlideToActAnimationEventListener();
                SlideToActView.OnSlideCompleteListener onSlideCompleteListener = SlideToActView.this.getOnSlideCompleteListener();
                if (onSlideCompleteListener != null) {
                    SlideToActView view = SlideToActView.this;
                    y0 y0Var = (y0) onSlideCompleteListener;
                    y0Var.getClass();
                    Intrinsics.checkNotNullParameter(view, "view");
                    ClassInCourseFragment classInCourseFragment = y0Var.a;
                    FragmentClassInCourseBinding fragmentClassInCourseBinding = classInCourseFragment.a;
                    Intrinsics.checkNotNull(fragmentClassInCourseBinding);
                    if (!fragmentClassInCourseBinding.includeQuestionCard.approveRadioButton.isChecked()) {
                        FragmentClassInCourseBinding fragmentClassInCourseBinding2 = classInCourseFragment.a;
                        Intrinsics.checkNotNull(fragmentClassInCourseBinding2);
                        if (!fragmentClassInCourseBinding2.includeQuestionCard.rejectRadioButton.isChecked()) {
                            ClassInCourseFragment.b(classInCourseFragment);
                            String string = classInCourseFragment.getString(R.string.txt_select_question_state);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            Toast.makeText(classInCourseFragment.requireActivity(), string, 0).show();
                            return;
                        }
                    }
                    FragmentClassInCourseBinding fragmentClassInCourseBinding3 = classInCourseFragment.a;
                    Intrinsics.checkNotNull(fragmentClassInCourseBinding3);
                    fragmentClassInCourseBinding3.includeQuestionCard.statusCheck.clearCheck();
                    FragmentClassInCourseBinding fragmentClassInCourseBinding4 = classInCourseFragment.a;
                    Intrinsics.checkNotNull(fragmentClassInCourseBinding4);
                    fragmentClassInCourseBinding4.includeQuestionCard.nextButtonSwipe.setLocked(false);
                    ClassInCourseViewModel classInCourseViewModel = classInCourseFragment.b;
                    if (classInCourseViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        classInCourseViewModel = null;
                    }
                    classInCourseViewModel.moveToNextQuestion();
                    ClassInCourseFragment.b(classInCourseFragment);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator p0) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator p0) {
                SlideToActView.this.getOnSlideToActAnimationEventListener();
            }
        });
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startAnimationComplete$lambda-3, reason: not valid java name */
    public static final void m22startAnimationComplete$lambda3(SlideToActView this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.setMPosition(((Integer) animatedValue).intValue());
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startAnimationComplete$lambda-4, reason: not valid java name */
    public static final void m23startAnimationComplete$lambda4(SlideToActView this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.mActualAreaMargin = ((Integer) animatedValue).intValue();
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startAnimationComplete$lambda-5, reason: not valid java name */
    public static final void m24startAnimationComplete$lambda5(SlideToActView this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.mActualAreaWidth = ((Integer) animatedValue).intValue();
        this$0.invalidateOutline();
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startAnimationComplete$lambda-6, reason: not valid java name */
    public static final void m25startAnimationComplete$lambda6(SlideToActView this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mFlagDrawTick) {
            return;
        }
        this$0.mFlagDrawTick = true;
        this$0.mTickMargin = this$0.mIconMargin;
    }

    private final void startAnimationReset() {
        this.mIsCompleted = false;
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofInt = ValueAnimator.ofInt(this.mTickMargin, this.mAreaWidth / 2);
        ofInt.addUpdateListener(new p8(this, 5));
        ValueAnimator ofInt2 = ValueAnimator.ofInt(this.mActualAreaWidth, 0);
        ofInt2.addUpdateListener(new p8(this, 6));
        ValueAnimator ofInt3 = ValueAnimator.ofInt(this.mPosition, 0);
        ofInt3.addUpdateListener(new p8(this, 7));
        ValueAnimator ofInt4 = ValueAnimator.ofInt(this.mActualAreaMargin, this.mOriginAreaMargin);
        ofInt4.addUpdateListener(new p8(this, 8));
        ofInt4.setInterpolator(new AnticipateOvershootInterpolator(2.0f));
        ValueAnimator ofInt5 = ValueAnimator.ofInt(this.mArrowMargin, this.mIconMargin);
        ofInt5.addUpdateListener(new p8(this, 9));
        ofInt4.setInterpolator(new OvershootInterpolator(2.0f));
        if (this.isAnimateCompletion) {
            animatorSet.playSequentially(ofInt, ofInt2, ofInt3, ofInt4, ofInt5);
        } else {
            animatorSet.playSequentially(ofInt3);
        }
        animatorSet.setDuration(this.animDuration);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.ncorti.slidetoact.SlideToActView$startAnimationReset$6
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator p0) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator p0) {
                Drawable drawable;
                SlideToActView.this.setEnabled(true);
                SlideToActIconUtil slideToActIconUtil = SlideToActIconUtil.INSTANCE;
                drawable = SlideToActView.this.mDrawableTick;
                slideToActIconUtil.stopIconAnimation$slidetoact_release(drawable);
                SlideToActView.this.getOnSlideToActAnimationEventListener();
                SlideToActView.this.getOnSlideResetListener();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator p0) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator p0) {
                SlideToActView.this.getOnSlideToActAnimationEventListener();
            }
        });
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startAnimationReset$lambda-10, reason: not valid java name */
    public static final void m26startAnimationReset$lambda10(SlideToActView this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.mActualAreaMargin = ((Integer) animatedValue).intValue();
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startAnimationReset$lambda-11, reason: not valid java name */
    public static final void m27startAnimationReset$lambda11(SlideToActView this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.mArrowMargin = ((Integer) animatedValue).intValue();
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startAnimationReset$lambda-7, reason: not valid java name */
    public static final void m28startAnimationReset$lambda7(SlideToActView this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.mTickMargin = ((Integer) animatedValue).intValue();
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startAnimationReset$lambda-8, reason: not valid java name */
    public static final void m29startAnimationReset$lambda8(SlideToActView this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.mFlagDrawTick = false;
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.mActualAreaWidth = ((Integer) animatedValue).intValue();
        this$0.invalidateOutline();
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startAnimationReset$lambda-9, reason: not valid java name */
    public static final void m30startAnimationReset$lambda9(SlideToActView this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.setMPosition(((Integer) animatedValue).intValue());
        this$0.invalidate();
    }

    public final long getAnimDuration() {
        return this.animDuration;
    }

    public final long getBumpVibration() {
        return this.bumpVibration;
    }

    public final int getCompleteIcon() {
        return this.completeIcon;
    }

    public final int getIconColor() {
        return this.iconColor;
    }

    public final int getInnerColor() {
        return this.innerColor;
    }

    public final OnSlideCompleteListener getOnSlideCompleteListener() {
        return this.onSlideCompleteListener;
    }

    public final OnSlideResetListener getOnSlideResetListener() {
        return null;
    }

    public final OnSlideToActAnimationEventListener getOnSlideToActAnimationEventListener() {
        return null;
    }

    public final OnSlideUserFailedListener getOnSlideUserFailedListener() {
        return null;
    }

    public final int getOuterColor() {
        return this.outerColor;
    }

    public final int getSliderIcon() {
        return this.sliderIcon;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final int getTextAppearance() {
        return this.textAppearance;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTypeFace() {
        return this.typeFace;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        RectF rectF = this.mOuterRect;
        int i = this.mActualAreaWidth;
        rectF.set(i, 0.0f, this.mAreaWidth - i, this.mAreaHeight);
        RectF rectF2 = this.mOuterRect;
        int i2 = this.mBorderRadius;
        canvas.drawRoundRect(rectF2, i2, i2, this.mOuterPaint);
        this.mTextPaint.setAlpha((int) (KotlinVersion.MAX_COMPONENT_VALUE * this.mPositionPercInv));
        TransformationMethod transformationMethod = this.mTextView.getTransformationMethod();
        Drawable drawable = null;
        CharSequence transformation = transformationMethod != null ? transformationMethod.getTransformation(this.text, this.mTextView) : null;
        if (transformation == null) {
            transformation = this.text;
        }
        CharSequence charSequence = transformation;
        canvas.drawText(charSequence, 0, charSequence.length(), this.mTextXPosition, this.mTextYPosition, this.mTextPaint);
        int i3 = this.mAreaHeight;
        int i4 = this.mActualAreaMargin;
        float f = (i3 - (i4 * 2)) / i3;
        RectF rectF3 = this.mInnerRect;
        int i5 = this.mEffectivePosition;
        rectF3.set(i4 + i5, i4, (i5 + i3) - i4, i3 - i4);
        RectF rectF4 = this.mInnerRect;
        int i6 = this.mBorderRadius;
        canvas.drawRoundRect(rectF4, i6 * f, i6 * f, this.mInnerPaint);
        canvas.save();
        if (this.isReversed) {
            canvas.scale(-1.0f, 1.0f, this.mInnerRect.centerX(), this.mInnerRect.centerY());
        }
        if (this.isRotateIcon) {
            float f2 = (-180) * this.mPositionPerc;
            this.mArrowAngle = f2;
            canvas.rotate(f2, this.mInnerRect.centerX(), this.mInnerRect.centerY());
        }
        Drawable drawable2 = this.mDrawableArrow;
        if (drawable2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDrawableArrow");
            drawable2 = null;
        }
        RectF rectF5 = this.mInnerRect;
        int i7 = (int) rectF5.left;
        int i8 = this.mArrowMargin;
        drawable2.setBounds(i7 + i8, ((int) rectF5.top) + i8, ((int) rectF5.right) - i8, ((int) rectF5.bottom) - i8);
        Drawable drawable3 = this.mDrawableArrow;
        if (drawable3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDrawableArrow");
            drawable3 = null;
        }
        int i9 = drawable3.getBounds().left;
        Drawable drawable4 = this.mDrawableArrow;
        if (drawable4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDrawableArrow");
            drawable4 = null;
        }
        if (i9 <= drawable4.getBounds().right) {
            Drawable drawable5 = this.mDrawableArrow;
            if (drawable5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDrawableArrow");
                drawable5 = null;
            }
            int i10 = drawable5.getBounds().top;
            Drawable drawable6 = this.mDrawableArrow;
            if (drawable6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDrawableArrow");
                drawable6 = null;
            }
            if (i10 <= drawable6.getBounds().bottom) {
                Drawable drawable7 = this.mDrawableArrow;
                if (drawable7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mDrawableArrow");
                } else {
                    drawable = drawable7;
                }
                drawable.draw(canvas);
            }
        }
        canvas.restore();
        Drawable drawable8 = this.mDrawableTick;
        int i11 = this.mActualAreaWidth;
        int i12 = this.mTickMargin;
        drawable8.setBounds(i11 + i12, i12, (this.mAreaWidth - i12) - i11, this.mAreaHeight - i12);
        SlideToActIconUtil.INSTANCE.tintIconCompat$slidetoact_release(this.mDrawableTick, this.innerColor);
        if (this.mFlagDrawTick) {
            this.mDrawableTick.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(this.mDesiredSliderWidth, size);
        } else if (mode == 0) {
            size = this.mDesiredSliderWidth;
        } else if (mode != 1073741824) {
            size = this.mDesiredSliderWidth;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(this.mDesiredSliderHeight, size2);
        } else if (mode2 == 0) {
            size2 = this.mDesiredSliderHeight;
        } else if (mode2 != 1073741824) {
            size2 = this.mDesiredSliderHeight;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        this.mAreaWidth = w;
        this.mAreaHeight = h;
        this.mBorderRadius = h / 2;
        float f = 2;
        this.mTextXPosition = w / f;
        this.mTextYPosition = (h / f) - ((this.mTextPaint.ascent() + this.mTextPaint.descent()) / f);
        setMPosition(0);
        setCompletedNotAnimated(this.mIsCompleted);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (event != null && event.getAction() == 0) {
            performClick();
        }
        if (event == null || !isEnabled()) {
            return super.onTouchEvent(event);
        }
        int action = event.getAction();
        if (action != 0) {
            if (action == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                int i = this.mPosition;
                if ((i > 0 && this.isLocked) || (i > 0 && this.mPositionPerc < this.mGraceValue)) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(i, 0);
                    ofInt.setDuration(this.animDuration);
                    ofInt.addUpdateListener(new p8(this, 0));
                    ofInt.start();
                } else if (i > 0 && this.mPositionPerc >= this.mGraceValue) {
                    setEnabled(false);
                    startAnimationComplete();
                }
                this.mFlagMoving = false;
                return true;
            }
            if (action == 2 && this.mFlagMoving) {
                boolean z = this.mPositionPerc < 1.0f;
                float x = event.getX() - this.mLastX;
                this.mLastX = event.getX();
                increasePosition((int) x);
                invalidate();
                if (this.bumpVibration > 0 && z && this.mPositionPerc == 1.0f) {
                    handleVibration();
                    return true;
                }
            }
        } else if (checkInsideButton(event.getX(), event.getY())) {
            this.mFlagMoving = true;
            this.mLastX = event.getX();
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public final void setAnimDuration(long j) {
        this.animDuration = j;
    }

    public final void setAnimateCompletion(boolean z) {
        this.isAnimateCompletion = z;
    }

    public final void setBumpVibration(long j) {
        this.bumpVibration = j;
    }

    public final void setCompleteIcon(int i) {
        this.completeIcon = i;
        if (i != 0) {
            SlideToActIconUtil slideToActIconUtil = SlideToActIconUtil.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            this.mDrawableTick = slideToActIconUtil.loadIconCompat$slidetoact_release(context, i);
            invalidate();
        }
    }

    public final void setCompleted(boolean completed, boolean withAnimation) {
        if (withAnimation) {
            setCompletedAnimated(completed);
        } else {
            setCompletedNotAnimated(completed);
        }
    }

    public final void setIconColor(int i) {
        this.iconColor = i;
        Drawable drawable = this.mDrawableArrow;
        if (drawable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDrawableArrow");
            drawable = null;
        }
        DrawableCompat.setTint(drawable, i);
        invalidate();
    }

    public final void setInnerColor(int i) {
        this.innerColor = i;
        this.mInnerPaint.setColor(i);
        invalidate();
    }

    public final void setLocked(boolean z) {
        this.isLocked = z;
    }

    public final void setOnSlideCompleteListener(OnSlideCompleteListener onSlideCompleteListener) {
        this.onSlideCompleteListener = onSlideCompleteListener;
    }

    public final void setOnSlideResetListener(OnSlideResetListener onSlideResetListener) {
    }

    public final void setOnSlideToActAnimationEventListener(OnSlideToActAnimationEventListener onSlideToActAnimationEventListener) {
    }

    public final void setOnSlideUserFailedListener(OnSlideUserFailedListener onSlideUserFailedListener) {
    }

    public final void setOuterColor(int i) {
        this.outerColor = i;
        this.mOuterPaint.setColor(i);
        invalidate();
    }

    public final void setReversed(boolean z) {
        this.isReversed = z;
        setMPosition(this.mPosition);
        invalidate();
    }

    public final void setRotateIcon(boolean z) {
        this.isRotateIcon = z;
    }

    public final void setSliderIcon(int i) {
        this.sliderIcon = i;
        if (i != 0) {
            Drawable drawable = ResourcesCompat.getDrawable(getContext().getResources(), i, getContext().getTheme());
            if (drawable != null) {
                this.mDrawableArrow = drawable;
                DrawableCompat.setTint(drawable, this.iconColor);
            }
            invalidate();
        }
    }

    public final void setText(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.text = value;
        this.mTextView.setText(value);
        this.mTextPaint.set(this.mTextView.getPaint());
        invalidate();
    }

    public final void setTextAppearance(int i) {
        this.textAppearance = i;
        if (i != 0) {
            TextViewCompat.setTextAppearance(this.mTextView, i);
            this.mTextPaint.set(this.mTextView.getPaint());
            this.mTextPaint.setColor(this.mTextView.getCurrentTextColor());
        }
    }

    public final void setTextColor(int i) {
        this.textColor = i;
        this.mTextView.setTextColor(i);
        this.mTextPaint.setColor(this.textColor);
        invalidate();
    }

    public final void setTypeFace(int i) {
        this.typeFace = i;
        this.mTextView.setTypeface(Typeface.create("sans-serif-light", i));
        this.mTextPaint.set(this.mTextView.getPaint());
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToActView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SlideToActView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R$attr.slideToActViewStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SlideToActView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mDesiredSliderHeightDp = 72.0f;
        this.mDesiredSliderWidthDp = 280.0f;
        this.mBorderRadius = -1;
        String str = BuildConfig.FLAVOR;
        this.text = BuildConfig.FLAVOR;
        this.animDuration = 300L;
        int i2 = R$drawable.slidetoact_ic_arrow;
        this.sliderIcon = i2;
        this.mTextYPosition = -1.0f;
        this.mTextXPosition = -1.0f;
        this.mPositionPercInv = 1.0f;
        this.mOuterPaint = new Paint(1);
        this.mInnerPaint = new Paint(1);
        this.mTextPaint = new Paint(1);
        this.mGraceValue = 0.8f;
        this.isRotateIcon = true;
        this.isAnimateCompletion = true;
        TextView textView = new TextView(context);
        this.mTextView = textView;
        TextPaint paint = textView.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "mTextView.paint");
        this.mTextPaint = paint;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.SlideToActView, i, R$style.SlideToActView);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.theme.obtainStyl….SlideToActView\n        )");
        try {
            this.mDesiredSliderHeight = (int) TypedValue.applyDimension(1, this.mDesiredSliderHeightDp, getResources().getDisplayMetrics());
            this.mDesiredSliderWidth = (int) TypedValue.applyDimension(1, this.mDesiredSliderWidthDp, getResources().getDisplayMetrics());
            int color = ContextCompat.getColor(getContext(), R$color.slidetoact_defaultAccent);
            int color2 = ContextCompat.getColor(getContext(), R$color.slidetoact_white);
            this.mDesiredSliderHeight = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SlideToActView_slider_height, this.mDesiredSliderHeight);
            this.mBorderRadius = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SlideToActView_border_radius, -1);
            int i3 = R$styleable.SlideToActView_outer_color;
            int color3 = obtainStyledAttributes.getColor(i3, color);
            int i4 = R$styleable.SlideToActView_inner_color;
            int color4 = obtainStyledAttributes.getColor(i4, color2);
            int i5 = R$styleable.SlideToActView_text_color;
            if (obtainStyledAttributes.hasValue(i5)) {
                color2 = obtainStyledAttributes.getColor(i5, color2);
            } else if (obtainStyledAttributes.hasValue(i4)) {
                color2 = color4;
            }
            String string = obtainStyledAttributes.getString(R$styleable.SlideToActView_text);
            if (string != null) {
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.styleable.SlideToActView_text) ?: \"\"");
                str = string;
            }
            setText(str);
            setTypeFace(obtainStyledAttributes.getInt(R$styleable.SlideToActView_text_style, 0));
            setMTextSize(obtainStyledAttributes.getDimensionPixelSize(R$styleable.SlideToActView_text_size, obtainStyledAttributes.getResources().getDimensionPixelSize(R$dimen.slidetoact_default_text_size)));
            setTextColor(color2);
            setTextAppearance(obtainStyledAttributes.getResourceId(R$styleable.SlideToActView_text_appearance, 0));
            this.isLocked = obtainStyledAttributes.getBoolean(R$styleable.SlideToActView_slider_locked, false);
            setReversed(obtainStyledAttributes.getBoolean(R$styleable.SlideToActView_slider_reversed, false));
            this.isRotateIcon = obtainStyledAttributes.getBoolean(R$styleable.SlideToActView_rotate_icon, true);
            this.isAnimateCompletion = obtainStyledAttributes.getBoolean(R$styleable.SlideToActView_animate_completion, true);
            this.animDuration = obtainStyledAttributes.getInteger(R$styleable.SlideToActView_animation_duration, 300);
            this.bumpVibration = obtainStyledAttributes.getInt(R$styleable.SlideToActView_bump_vibration, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SlideToActView_area_margin, obtainStyledAttributes.getResources().getDimensionPixelSize(R$dimen.slidetoact_default_area_margin));
            this.mOriginAreaMargin = dimensionPixelSize;
            this.mActualAreaMargin = dimensionPixelSize;
            setSliderIcon(obtainStyledAttributes.getResourceId(R$styleable.SlideToActView_slider_icon, i2));
            int i6 = R$styleable.SlideToActView_slider_icon_color;
            if (obtainStyledAttributes.hasValue(i6)) {
                color = obtainStyledAttributes.getColor(i6, color);
            } else if (obtainStyledAttributes.hasValue(i3)) {
                color = color3;
            }
            int resourceId = obtainStyledAttributes.getResourceId(R$styleable.SlideToActView_complete_icon, R$drawable.slidetoact_animated_ic_check);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.SlideToActView_icon_margin, obtainStyledAttributes.getResources().getDimensionPixelSize(R$dimen.slidetoact_default_icon_margin));
            this.mIconMargin = dimensionPixelSize2;
            this.mArrowMargin = dimensionPixelSize2;
            this.mTickMargin = dimensionPixelSize2;
            this.mIsCompleted = obtainStyledAttributes.getBoolean(R$styleable.SlideToActView_state_complete, false);
            obtainStyledAttributes.recycle();
            int i7 = this.mActualAreaMargin;
            int i8 = this.mEffectivePosition;
            this.mInnerRect = new RectF(i7 + i8, i7, (i8 + this.mAreaHeight) - i7, this.mAreaHeight - i7);
            int i9 = this.mActualAreaWidth;
            this.mOuterRect = new RectF(i9, 0.0f, this.mAreaWidth - i9, this.mAreaHeight);
            this.mDrawableTick = SlideToActIconUtil.INSTANCE.loadIconCompat$slidetoact_release(context, resourceId);
            this.mTextPaint.setTextAlign(Paint.Align.CENTER);
            setOuterColor(color3);
            setInnerColor(color4);
            setIconColor(color);
            setOutlineProvider(new SlideToActOutlineProvider());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
