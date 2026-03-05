package co.ceduladigital.sdk;

import android.app.AlertDialog;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.lifecycle.SavedStateHandle;
import com.gse.aulapp.model.data.statusControl.BiometrixResult;
import com.gse.aulapp.model.dto.StepProfile;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.request.SessionInstructorRequest;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.NetworkUtil;
import com.gse.aulapp.util.ValidationFlowManager;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import com.karumi.dexter.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class p1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClassPracticeBeforeFragment b;

    public /* synthetic */ p1(ClassPracticeBeforeFragment classPracticeBeforeFragment, int i) {
        this.a = i;
        this.b = classPracticeBeforeFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        NavBackStackEntry currentBackStackEntry;
        SavedStateHandle savedStateHandle;
        switch (this.a) {
            case 0:
                String datetime = (String) obj;
                ClassPracticeBeforeFragment this$0 = this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(datetime, "datetime");
                Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(datetime);
                if (parse == null || (str = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(parse)) == null) {
                    str = BuildConfig.FLAVOR;
                }
                SessionInstructorRequest sessionInstructorRequest = new SessionInstructorRequest(str, str);
                ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this$0.b;
                if (classPracticeBeforeViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    classPracticeBeforeViewModel = null;
                }
                Context requireContext = this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                FragmentActivity requireActivity = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                classPracticeBeforeViewModel.validateTimeSessionFromApi(requireContext, requireActivity, this$0.f, sessionInstructorRequest, this$0.h, this$0.j, FragmentKt.findNavController(this$0));
                break;
            case 1:
                StepProfile it = (StepProfile) obj;
                ClassPracticeBeforeFragment this$02 = this.b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (NetworkUtil.INSTANCE.isNetworkAvailable(this$02.requireContext())) {
                    this$02.h(it);
                } else {
                    DialogUtil.Companion companion = DialogUtil.INSTANCE;
                    FragmentActivity activity = this$02.getActivity();
                    Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type android.app.Activity");
                    AlertDialog showInformationDialogValidationExam = companion.showInformationDialogValidationExam(activity, EnumDialogType.NETWORK_ACCESS_ERROR, false, true, new f0(this$02, it, 2), null);
                    this$02.m = showInformationDialogValidationExam;
                    if (showInformationDialogValidationExam != null) {
                        Intrinsics.checkNotNull(showInformationDialogValidationExam);
                        showInformationDialogValidationExam.show();
                    }
                }
                break;
            default:
                BiometrixResult result = (BiometrixResult) obj;
                ClassPracticeBeforeFragment this$03 = this.b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(result, "result");
                NavController navController = this$03.o;
                if (navController != null && (currentBackStackEntry = navController.getCurrentBackStackEntry()) != null && (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) != null) {
                }
                int i = s1.$EnumSwitchMapping$0[result.getStatus().ordinal()];
                if (i == 1 || i == 2) {
                    ValidationFlowManager validationFlowManager = this$03.p;
                    if (validationFlowManager != null) {
                        validationFlowManager.moveToNextValidation();
                    }
                    this$03.i();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
