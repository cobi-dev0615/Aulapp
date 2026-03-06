package com.gse.aulapp.viewmodel;

import android.app.AlertDialog;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.gse.aulapp.databinding.FragmentLoginBinding;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.repository.LoginRepository;
import com.gse.aulapp.model.request.LoginRequest;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.NetworkUtil;
import com.gse.aulapp.viewmodel.LoginViewModel;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0!8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/gse/aulapp/viewmodel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/gse/aulapp/model/repository/LoginRepository;", "loginRepository", "<init>", "(Lcom/gse/aulapp/model/repository/LoginRepository;)V", "Landroidx/fragment/app/FragmentActivity;", "context", "Lcom/gse/aulapp/model/request/LoginRequest;", "loginRequest", "Lcom/gse/aulapp/databinding/FragmentLoginBinding;", "binding", "Landroidx/navigation/NavController;", "findNavController", BuildConfig.FLAVOR, "validateLogin", "(Landroidx/fragment/app/FragmentActivity;Lcom/gse/aulapp/model/request/LoginRequest;Lcom/gse/aulapp/databinding/FragmentLoginBinding;Landroidx/navigation/NavController;)V", "Lkotlinx/coroutines/Job;", "login", "(Landroidx/fragment/app/FragmentActivity;Lcom/gse/aulapp/model/request/LoginRequest;Lcom/gse/aulapp/databinding/FragmentLoginBinding;Landroidx/navigation/NavController;)Lkotlinx/coroutines/Job;", "continueLogin", "(Landroidx/fragment/app/FragmentActivity;Lcom/gse/aulapp/databinding/FragmentLoginBinding;Landroidx/navigation/NavController;)V", "Lcom/gse/aulapp/model/repository/LoginRepository;", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "Landroid/app/AlertDialog;", "alertDialog", "Landroid/app/AlertDialog;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/gse/aulapp/model/data/statusControl/Status;", "_message", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "message", "Lkotlinx/coroutines/flow/StateFlow;", "getMessage", "()Lkotlinx/coroutines/flow/StateFlow;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LoginViewModel extends ViewModel {
    private final String TAG;
    private final MutableStateFlow<Status> _message;
    private AlertDialog alertDialog;
    private LoginRepository loginRepository;
    private final StateFlow<Status> message;

    public LoginViewModel(LoginRepository loginRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        this.loginRepository = loginRepository;
        this.TAG = Reflection.getOrCreateKotlinClass(LoginViewModel.class).getSimpleName();
        MutableStateFlow<Status> MutableStateFlow = StateFlowKt.MutableStateFlow(Status.Empty.INSTANCE);
        this._message = MutableStateFlow;
        this.message = MutableStateFlow;
    }

    private final Job login(FragmentActivity context, LoginRequest loginRequest, FragmentLoginBinding binding, NavController findNavController) {
        Job launch$default;
        launch$default = BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new LoginViewModel$login$1(this, loginRequest, context, binding, null));
        return launch$default;
    }

    private final void validateLogin(final FragmentActivity context, final LoginRequest loginRequest, final FragmentLoginBinding binding, final NavController findNavController) {
        if (NetworkUtil.INSTANCE.isNetworkAvailable(context)) {
            login(context, loginRequest, binding, findNavController);
        } else {
            this.alertDialog = DialogUtil.Companion.showErrorDialog$default(DialogUtil.INSTANCE, context, EnumDialogType.DIALOG_TYPE_OFFLINE_ERROR, null, null, null, false, new View.OnClickListener() { // from class: co.ceduladigital.sdk.x6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoginViewModel.validateLogin$lambda$0(LoginViewModel.this, context, loginRequest, binding, findNavController, view);
                }
            }, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateLogin$lambda$0(LoginViewModel this$0, FragmentActivity context, LoginRequest loginRequest, FragmentLoginBinding binding, NavController findNavController, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(loginRequest, "$loginRequest");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        if (this$0.alertDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alertDialog");
        }
        if (NetworkUtil.INSTANCE.isNetworkAvailable(context)) {
            AlertDialog alertDialog = this$0.alertDialog;
            AlertDialog alertDialog2 = null;
            if (alertDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("alertDialog");
                alertDialog = null;
            }
            if (alertDialog.isShowing()) {
                AlertDialog alertDialog3 = this$0.alertDialog;
                if (alertDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("alertDialog");
                } else {
                    alertDialog2 = alertDialog3;
                }
                alertDialog2.dismiss();
            }
            this$0.login(context, loginRequest, binding, findNavController);
        }
    }

    public final void continueLogin(FragmentActivity context, FragmentLoginBinding binding, NavController findNavController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        validateLogin(context, new LoginRequest(String.valueOf(binding.tietTextInputUserLogin.getText()), String.valueOf(binding.tietTextInputPasswordLogin.getText())), binding, findNavController);
    }

    public final StateFlow<Status> getMessage() {
        return this.message;
    }
}
