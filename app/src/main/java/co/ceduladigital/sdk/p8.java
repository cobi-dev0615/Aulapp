package co.ceduladigital.sdk;

import android.animation.ValueAnimator;
import com.ncorti.slidetoact.SlideToActView;

/* loaded from: classes2.dex */
public final /* synthetic */ class p8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SlideToActView b;

    public /* synthetic */ p8(SlideToActView slideToActView, int i) {
        this.a = i;
        this.b = slideToActView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                SlideToActView.m21onTouchEvent$lambda2(this.b, valueAnimator);
                break;
            case 1:
                SlideToActView.m22startAnimationComplete$lambda3(this.b, valueAnimator);
                break;
            case 2:
                SlideToActView.m23startAnimationComplete$lambda4(this.b, valueAnimator);
                break;
            case 3:
                SlideToActView.m24startAnimationComplete$lambda5(this.b, valueAnimator);
                break;
            case 4:
                SlideToActView.m25startAnimationComplete$lambda6(this.b, valueAnimator);
                break;
            case 5:
                SlideToActView.m28startAnimationReset$lambda7(this.b, valueAnimator);
                break;
            case 6:
                SlideToActView.m29startAnimationReset$lambda8(this.b, valueAnimator);
                break;
            case 7:
                SlideToActView.m30startAnimationReset$lambda9(this.b, valueAnimator);
                break;
            case 8:
                SlideToActView.m26startAnimationReset$lambda10(this.b, valueAnimator);
                break;
            default:
                SlideToActView.m27startAnimationReset$lambda11(this.b, valueAnimator);
                break;
        }
    }
}
