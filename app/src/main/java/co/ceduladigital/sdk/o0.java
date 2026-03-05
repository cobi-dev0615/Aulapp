package co.ceduladigital.sdk;

import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.MultiInstanceInvalidationClient$callback$1;
import androidx.room.TransactionExecutor;
import androidx.lifecycle.DispatchQueue;
import androidx.window.layout.SidecarWindowBackend;
import androidx.window.layout.WindowLayoutInfo;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
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
                DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1((DispatchQueue) this.b, (Runnable) this.c);
                break;
            case 2:
                FragmentStrictMode.handlePolicyViolation$lambda$1((String) this.b, (Violation) this.c);
                break;
            case 3:
                ((JobInfoSchedulerService) this.b).lambda$onStartJob$0((JobParameters) this.c);
                break;
            case 4:
                MultiInstanceInvalidationClient$callback$1.onInvalidation$lambda$0((MultiInstanceInvalidationClient) this.b, (String[]) this.c);
                break;
            case 5:
                ((ResourcesCompat.FontCallback) this.b).lambda$callbackSuccessAsync$0((Typeface) this.c);
                break;
            case 6:
                SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m6accept$lambda0((SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) this.b, (WindowLayoutInfo) this.c);
                break;
            case 7:
                TransactionExecutor.execute$lambda$1$lambda$0((Runnable) this.b, (TransactionExecutor) this.c);
                break;
            default:
                ((ViewTransition) this.b).lambda$applyTransition$0((View[]) this.c);
                break;
        }
    }
}
