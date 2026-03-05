package co.ceduladigital.sdk;

import android.view.View;
import androidx.camera.view.PreviewView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.a) {
            case 0:
                ((CarouselLayoutManager) this.b).lambda$new$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            default:
                ((PreviewView) this.b).lambda$new$0(view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }
}
