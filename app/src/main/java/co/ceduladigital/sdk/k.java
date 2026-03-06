package co.ceduladigital.sdk;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import com.ncorti.slidetoact.SlideToActIconUtil;
import com.ncorti.slidetoact.SlideToActView;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                SlideToActIconUtil.m19createIconAnimator$lambda0((Drawable) this.b, (SlideToActView) this.c, valueAnimator);
                break;
            default:
                ((ViewPropertyAnimatorUpdateListener) this.b).onAnimationUpdate((View) this.c);
                break;
        }
    }
}
