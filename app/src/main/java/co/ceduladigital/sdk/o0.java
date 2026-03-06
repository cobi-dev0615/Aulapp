package co.ceduladigital.sdk;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.gse.aulapp.databinding.FragmentClassInCourseBinding;
import com.gse.aulapp.view.fragment.ClassInCourseFragment;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o0(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                LinearLayoutManager layoutManager = (LinearLayoutManager) this.b;
                Intrinsics.checkNotNullParameter(layoutManager, "$layoutManager");
                ClassInCourseFragment this$0 = (ClassInCourseFragment) this.c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FragmentClassInCourseBinding fragmentClassInCourseBinding = this$0.a;
                Intrinsics.checkNotNull(fragmentClassInCourseBinding);
                RecyclerView recyclerView = fragmentClassInCourseBinding.rvQuestions;
                ClassInCourseViewModel classInCourseViewModel = this$0.b;
                if (classInCourseViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    classInCourseViewModel = null;
                }
                layoutManager.smoothScrollToPosition(recyclerView, null, classInCourseViewModel.getCurrentIndex());
                break;
            case 1:
                throw new UnsupportedOperationException("Not decompiled");
            case 2:
                throw new UnsupportedOperationException("Not decompiled");
            case 3:
                throw new UnsupportedOperationException("Not decompiled");
            case 4:
                // Stubbed: MultiInstanceInvalidationClient$callback$1.onInvalidation$lambda$0
                throw new UnsupportedOperationException("Decompiled stub");
            case 5:
                throw new UnsupportedOperationException("Not decompiled");
            case 6:
                // Stubbed: SidecarWindowBackend.WindowLayoutChangeCallbackWrapper
                throw new UnsupportedOperationException("Decompiled stub");
            case 7:
                throw new UnsupportedOperationException("Not decompiled");
            default:
                throw new UnsupportedOperationException("Not decompiled");
        }
    }
}
