package co.ceduladigital.sdk;

import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.FragmentKt;
import com.gse.aulapp.databinding.FragmentClassInCourseBinding;
import com.gse.aulapp.view.fragment.ClassInCourseFragment;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class r0 implements FlowCollector {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    ClassInCourseFragment classInCourseFragment = (ClassInCourseFragment) this.b;
                    ClassInCourseViewModel classInCourseViewModel = classInCourseFragment.b;
                    ClassInCourseViewModel classInCourseViewModel2 = null;
                    String str = null;
                    if (classInCourseViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        classInCourseViewModel = null;
                    }
                    if (classInCourseViewModel.isExtraTime().getValue().booleanValue()) {
                        ClassInCourseViewModel classInCourseViewModel3 = classInCourseFragment.b;
                        if (classInCourseViewModel3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            classInCourseViewModel3 = null;
                        }
                        FragmentActivity activity = classInCourseFragment.getActivity();
                        String str2 = classInCourseFragment.c;
                        if (str2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                        } else {
                            str = str2;
                        }
                        classInCourseViewModel3.dialogExtraTimeClass(activity, str, FragmentKt.findNavController(classInCourseFragment));
                    } else {
                        FragmentActivity activity2 = classInCourseFragment.getActivity();
                        if (activity2 != null) {
                            ClassInCourseViewModel classInCourseViewModel4 = classInCourseFragment.b;
                            if (classInCourseViewModel4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            } else {
                                classInCourseViewModel2 = classInCourseViewModel4;
                            }
                            classInCourseViewModel2.dialogMaxTimeClass(activity2);
                        }
                    }
                }
                break;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                FragmentClassInCourseBinding fragmentClassInCourseBinding = ((ClassInCourseFragment) this.b).a;
                Intrinsics.checkNotNull(fragmentClassInCourseBinding);
                if (booleanValue) {
                    fragmentClassInCourseBinding.floatingActionButtonCloseClass.setVisibility(8);
                    fragmentClassInCourseBinding.btnEndClass.setVisibility(0);
                } else {
                    fragmentClassInCourseBinding.floatingActionButtonCloseClass.setVisibility(0);
                    fragmentClassInCourseBinding.btnEndClass.setVisibility(8);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    FragmentClassInCourseBinding fragmentClassInCourseBinding2 = (FragmentClassInCourseBinding) this.b;
                    fragmentClassInCourseBinding2.btnEndClass.setVisibility(0);
                    fragmentClassInCourseBinding2.floatingActionButtonCloseClass.setVisibility(8);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
