package co.ceduladigital.sdk;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
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
@SuppressWarnings({"rawtypes", "unchecked"})
public final class f2 extends SuspendLambda implements Function2<Object, Object, Object> {
    public final /* synthetic */ Status a;
    public final /* synthetic */ ClassPracticeBeforeFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(Status status, ClassPracticeBeforeFragment classPracticeBeforeFragment, Continuation continuation) {
        super(2, continuation);
        this.a = status;
        this.b = classPracticeBeforeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f2(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Status status = this.a;
        boolean z = status instanceof Status.Success;
        ClassPracticeBeforeFragment classPracticeBeforeFragment = this.b;
        if (z) {
            classPracticeBeforeFragment.callGlobalLoading(false);
            Status.Success success = (Status.Success) status;
            if (!(success.getData() instanceof String)) {
                Boxing.boxInt(Log.e(classPracticeBeforeFragment.a, "Status Default"));
            } else if (((CharSequence) success.getData()).length() > 0) {
                ClassPracticeBeforeViewModel classPracticeBeforeViewModel = classPracticeBeforeFragment.b;
                if (classPracticeBeforeViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    classPracticeBeforeViewModel = null;
                }
                Context requireContext = classPracticeBeforeFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                NavController findNavController = FragmentKt.findNavController(classPracticeBeforeFragment);
                String str3 = classPracticeBeforeFragment.f;
                Intrinsics.checkNotNull(str3);
                classPracticeBeforeViewModel.navigateToStartClass(requireContext, findNavController, str3, (String) success.getData());
            } else {
                Objects.toString(status);
                FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding = classPracticeBeforeFragment.c;
                Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding);
                fragmentClassPracticeBeforeBinding.primaryButtonClass.getRoot().setEnabled(false);
            }
        } else if (status instanceof Status.Exception) {
            classPracticeBeforeFragment.callGlobalLoading(false);
            Status.Exception exception = (Status.Exception) status;
            Object data = exception.getData();
            boolean z2 = data instanceof ErrorResponse;
            String str4 = BuildConfig.FLAVOR;
            if (z2) {
                String message = ((ErrorResponse) exception.getData()).getResult().getMessage();
                if (message == null) {
                    message = "Ha ocurrido un error interno en la aplicación, estamos trabajando para solucionarlo.";
                }
                String code = ((ErrorResponse) exception.getData()).getResult().getCode();
                if (code != null) {
                    str4 = code;
                }
                str = message;
            } else if (data instanceof String) {
                str = (String) exception.getData();
            } else {
                str = BuildConfig.FLAVOR;
                str2 = str;
                ClassPracticeBeforeFragment.c(this.b, EnumDialogType.DIALOG_WITH_MESSAGE, str, str2, new t1(8), 8);
            }
            str2 = str4;
            ClassPracticeBeforeFragment.c(this.b, EnumDialogType.DIALOG_WITH_MESSAGE, str, str2, new t1(8), 8);
        } else if (status instanceof Status.Failure) {
            classPracticeBeforeFragment.callGlobalLoading(false);
            FragmentActivity activity = classPracticeBeforeFragment.getActivity();
            String message2 = ((Status.Failure) status).getE().getMessage();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type android.app.Activity");
            ClassPracticeBeforeFragment.b(classPracticeBeforeFragment, activity, message2);
        } else {
            classPracticeBeforeFragment.callGlobalLoading(false);
            Boxing.boxInt(Log.e(classPracticeBeforeFragment.a, "fail collect"));
        }
        return Unit.INSTANCE;
    }
}
