package co.ceduladigital.sdk;

import androidx.recyclerview.widget.RecyclerView;
import com.gse.aulapp.databinding.FragmentClassBinding;
import com.gse.aulapp.view.fragment.ClassFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l0 extends RecyclerView.OnScrollListener {
    public final /* synthetic */ ClassFragment a;
    public final /* synthetic */ int b;

    public l0(ClassFragment classFragment, int i) {
        this.a = classFragment;
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        ClassFragment classFragment = this.a;
        classFragment.b(recyclerView, this.b);
        FragmentClassBinding fragmentClassBinding = classFragment.c;
        Intrinsics.checkNotNull(fragmentClassBinding);
        fragmentClassBinding.btnTodayClass.setOnClickListener(new i0(classFragment, 4));
    }
}
