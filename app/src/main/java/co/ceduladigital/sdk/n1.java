package co.ceduladigital.sdk;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.FragmentKt;
import com.gse.aulapp.util.Parameters;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import com.karumi.dexter.BuildConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class n1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClassPracticeBeforeFragment b;

    public /* synthetic */ n1(ClassPracticeBeforeFragment classPracticeBeforeFragment, int i) {
        this.a = i;
        this.b = classPracticeBeforeFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentActivity activity;
        switch (this.a) {
            case 0:
                ClassPracticeBeforeFragment this$0 = this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.h) {
                    PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
                    Context requireContext = this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    String sessionIdByTimeService = companion.getSessionIdByTimeService(requireContext);
                    Context requireContext2 = this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    String startClassOrExam = companion.getStartClassOrExam(requireContext2);
                    if (startClassOrExam == null || startClassOrExam.length() == 0 || sessionIdByTimeService == null || sessionIdByTimeService.length() == 0 || !Intrinsics.areEqual(this$0.f, sessionIdByTimeService)) {
                        Context requireContext3 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                        companion.saveStartClassOrExam(requireContext3, BuildConfig.FLAVOR);
                        Parameters.INSTANCE.setINITIAL_TIME(0L);
                    }
                    String str = this$0.f;
                    if (str != null && str.length() != 0 && (activity = this$0.getActivity()) != null) {
                        PermissionHelper.INSTANCE.validateNotificationPermissionFlow(activity, new q1(activity, this$0));
                    }
                } else {
                    String str2 = this$0.f;
                    if (str2 != null) {
                        ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this$0.b;
                        if (classPracticeBeforeViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            classPracticeBeforeViewModel = null;
                        }
                        Context requireContext4 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                        classPracticeBeforeViewModel.exitValidation(requireContext4, str2, FragmentKt.findNavController(this$0));
                    }
                }
                break;
            default:
                ClassPracticeBeforeFragment this$02 = this.b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                String str3 = this$02.f;
                if (str3 != null) {
                    ClassPracticeBeforeViewModel classPracticeBeforeViewModel2 = this$02.b;
                    if (classPracticeBeforeViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        classPracticeBeforeViewModel2 = null;
                    }
                    Context requireContext5 = this$02.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                    classPracticeBeforeViewModel2.exitValidation(requireContext5, str3, FragmentKt.findNavController(this$02));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
