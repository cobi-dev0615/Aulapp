package co.ceduladigital.sdk;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.navigation.DrawerLayoutUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class c4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ c4(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0((DrawerLayout) this.b, valueAnimator);
                break;
            default:
                MaterialMainContainerBackHelper.lambda$createCornerAnimator$0((ClippableRoundedCornerLayout) this.b, valueAnimator);
                break;
        }
    }
}
