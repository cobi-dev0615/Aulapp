package co.ceduladigital.sdk;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.databinding.FragmentClassPracticeBeforeBinding;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import com.karumi.dexter.BuildConfig;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class i2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ClassPracticeBeforeFragment a;
    public final /* synthetic */ Status b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(Status status, ClassPracticeBeforeFragment classPracticeBeforeFragment, Continuation continuation) {
        super(2, continuation);
        this.a = classPracticeBeforeFragment;
        this.b = status;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i2(this.b, this.a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ClassPracticeBeforeFragment classPracticeBeforeFragment = this.a;
        if (classPracticeBeforeFragment.b == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding = classPracticeBeforeFragment.c;
        Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding);
        if (fragmentClassPracticeBeforeBinding != null) {
            Status status = this.b;
            if (status instanceof Status.Loading) {
                classPracticeBeforeFragment.callGlobalLoading(true);
            } else {
                boolean z = status instanceof Status.Success;
                String str4 = classPracticeBeforeFragment.a;
                if (z) {
                    classPracticeBeforeFragment.callGlobalLoading(false);
                    Status.Success success = (Status.Success) status;
                    if (!(success.getData() instanceof String)) {
                        Boxing.boxInt(Log.e(str4, "Status Default"));
                    } else if (((CharSequence) success.getData()).length() > 0) {
                        ClassPracticeBeforeViewModel classPracticeBeforeViewModel = classPracticeBeforeFragment.b;
                        if (classPracticeBeforeViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            classPracticeBeforeViewModel = null;
                        }
                        Context requireContext = classPracticeBeforeFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        String str5 = classPracticeBeforeFragment.f;
                        Intrinsics.checkNotNull(str5);
                        classPracticeBeforeViewModel.updateSessionStatusAppointment(requireContext, str5, (String) success.getData());
                    } else {
                        Objects.toString(status);
                        FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding2 = classPracticeBeforeFragment.c;
                        Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding2);
                        fragmentClassPracticeBeforeBinding2.primaryButtonClass.getRoot().setEnabled(false);
                    }
                } else if (status instanceof Status.Exception) {
                    classPracticeBeforeFragment.callGlobalLoading(false);
                    Status.Exception exception = (Status.Exception) status;
                    Object data = exception.getData();
                    boolean z2 = data instanceof ErrorResponse;
                    String str6 = BuildConfig.FLAVOR;
                    if (z2) {
                        str3 = ((ErrorResponse) exception.getData()).getResult().getMessage();
                        if (str3 == null) {
                            str3 = "Ha ocurrido un error interno en la aplicación, estamos trabajando para solucionarlo.";
                        }
                        String code = ((ErrorResponse) exception.getData()).getResult().getCode();
                        if (code != null) {
                            str6 = code;
                        }
                    } else if (data instanceof String) {
                        str3 = (String) exception.getData();
                    } else {
                        str = BuildConfig.FLAVOR;
                        str2 = str;
                        ClassPracticeBeforeFragment.c(this.a, EnumDialogType.DIALOG_WITH_MESSAGE, str, str2, new t1(9), 8);
                    }
                    str = str3;
                    str2 = str6;
                    ClassPracticeBeforeFragment.c(this.a, EnumDialogType.DIALOG_WITH_MESSAGE, str, str2, new t1(9), 8);
                } else if (status instanceof Status.Failure) {
                    classPracticeBeforeFragment.callGlobalLoading(false);
                    FragmentActivity activity = classPracticeBeforeFragment.getActivity();
                    String message = ((Status.Failure) status).getE().getMessage();
                    Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type android.app.Activity");
                    ClassPracticeBeforeFragment.b(classPracticeBeforeFragment, activity, message);
                } else {
                    Boxing.boxInt(Log.e(str4, "fail collect"));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
