package co.ceduladigital.sdk;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import com.gse.aulapp.databinding.FragmentClassInCourseBinding;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.view.fragment.ClassInCourseFragment;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class p0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClassInCourseFragment b;
    public final /* synthetic */ FragmentClassInCourseBinding c;

    public /* synthetic */ p0(FragmentClassInCourseBinding fragmentClassInCourseBinding, ClassInCourseFragment classInCourseFragment) {
        this.a = 0;
        this.c = fragmentClassInCourseBinding;
        this.b = classInCourseFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                FragmentClassInCourseBinding binding = this.c;
                Intrinsics.checkNotNullParameter(binding, "$binding");
                ClassInCourseFragment this$0 = this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                binding.includeChronometer.tvTimer.setText(str);
                ClassInCourseViewModel classInCourseViewModel = this$0.b;
                ClassInCourseViewModel classInCourseViewModel2 = null;
                if (classInCourseViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    classInCourseViewModel = null;
                }
                Intrinsics.checkNotNull(str);
                classInCourseViewModel.initValidateSlider(str, binding);
                FragmentActivity activity = this$0.getActivity();
                if (activity != null) {
                    ClassInCourseViewModel classInCourseViewModel3 = this$0.b;
                    if (classInCourseViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        classInCourseViewModel3 = null;
                    }
                    NavController findNavController = FragmentKt.findNavController(this$0);
                    String str2 = this$0.c;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                        str2 = null;
                    }
                    classInCourseViewModel3.validateFinishedClass(activity, str, findNavController, str2);
                }
                FragmentActivity activity2 = this$0.getActivity();
                if (activity2 != null) {
                    DialogNormalUtil dialogNormalUtil = new DialogNormalUtil();
                    ClassInCourseViewModel classInCourseViewModel4 = this$0.b;
                    if (classInCourseViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        classInCourseViewModel2 = classInCourseViewModel4;
                    }
                    dialogNormalUtil.updateDialogExamInfo(activity2, classInCourseViewModel2, str);
                }
                break;
            default:
                Float f = (Float) obj;
                ClassInCourseFragment this$02 = this.b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                FragmentClassInCourseBinding binding2 = this.c;
                Intrinsics.checkNotNullParameter(binding2, "$binding");
                Context context = this$02.getContext();
                ClassInCourseViewModel classInCourseViewModel5 = null;
                if (context != null) {
                    ClassInCourseViewModel classInCourseViewModel6 = this$02.b;
                    if (classInCourseViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        classInCourseViewModel6 = null;
                    }
                    FragmentActivity requireActivity = this$02.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    classInCourseViewModel6.validateIsMock(context, requireActivity);
                }
                if (f.floatValue() < binding2.includeChronometer.sliderTimer.getValueTo()) {
                    binding2.includeChronometer.sliderTimer.setValue(f.floatValue());
                } else {
                    ClassInCourseViewModel classInCourseViewModel7 = this$02.b;
                    if (classInCourseViewModel7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        classInCourseViewModel5 = classInCourseViewModel7;
                    }
                    classInCourseViewModel5.validateSliderExtra(binding2);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ p0(ClassInCourseFragment classInCourseFragment, FragmentClassInCourseBinding fragmentClassInCourseBinding) {
        this.a = 1;
        this.b = classInCourseFragment;
        this.c = fragmentClassInCourseBinding;
    }
}
