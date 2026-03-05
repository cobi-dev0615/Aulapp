package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import androidx.navigation.NavController;
import androidx.view.ViewModel;
import androidx.view.ViewModelKt;
import co.ceduladigital.sdk.r2;
import co.ceduladigital.sdk.r7;
import com.gse.aulapp.databinding.FragmentPasswordRecoverBinding;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.repository.PasswordRecoveryRepository;
import com.gse.aulapp.model.request.PasswordRecoveryRequest;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.NetworkUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/gse/aulapp/viewmodel/PasswordRecoverViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/gse/aulapp/model/repository/PasswordRecoveryRepository;", "passwordRecoveryRepository", "<init>", "(Lcom/gse/aulapp/model/repository/PasswordRecoveryRepository;)V", "Landroid/content/Context;", "context", "Lcom/gse/aulapp/databinding/FragmentPasswordRecoverBinding;", "binding", "Landroidx/navigation/NavController;", "navController", BuildConfig.FLAVOR, "callAPIPasswordRecovery", "(Landroid/content/Context;Lcom/gse/aulapp/databinding/FragmentPasswordRecoverBinding;Landroidx/navigation/NavController;)V", "Landroid/app/Activity;", "initPasswordRecovery", "(Landroid/app/Activity;Lcom/gse/aulapp/databinding/FragmentPasswordRecoverBinding;Landroidx/navigation/NavController;)V", BuildConfig.FLAVOR, "complete", "callDialog", "(ZLandroid/content/Context;)V", "Lcom/gse/aulapp/model/repository/PasswordRecoveryRepository;", "Landroid/app/AlertDialog;", "alertDialog", "Landroid/app/AlertDialog;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/gse/aulapp/model/data/statusControl/Status;", "_message", "Lkotlinx/coroutines/flow/MutableStateFlow;", "dialog", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PasswordRecoverViewModel extends ViewModel {
    private final MutableStateFlow<Status> _message;
    private AlertDialog alertDialog;
    private AlertDialog dialog;
    private PasswordRecoveryRepository passwordRecoveryRepository;

    public PasswordRecoverViewModel(PasswordRecoveryRepository passwordRecoveryRepository) {
        Intrinsics.checkNotNullParameter(passwordRecoveryRepository, "passwordRecoveryRepository");
        this.passwordRecoveryRepository = passwordRecoveryRepository;
        this._message = StateFlowKt.MutableStateFlow(Status.Empty.INSTANCE);
    }

    private final void callAPIPasswordRecovery(Context context, FragmentPasswordRecoverBinding binding, NavController navController) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PasswordRecoverViewModel$callAPIPasswordRecovery$1(this, new PasswordRecoveryRequest(String.valueOf(binding.tietTextInputUserRecovery.getText())), context, binding, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void callDialog$lambda$1(PasswordRecoverViewModel this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AlertDialog alertDialog = this$0.dialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPasswordRecovery$lambda$0(PasswordRecoverViewModel this$0, Activity context, FragmentPasswordRecoverBinding binding, NavController navController, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(navController, "$navController");
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
            this$0.callAPIPasswordRecovery(context, binding, navController);
        }
    }

    public final void callDialog(boolean complete, Context context) {
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        AlertDialog showInformationFullDialogPasswordRecovery$default = DialogUtil.Companion.showInformationFullDialogPasswordRecovery$default(companion, (Activity) context, complete, null, null, false, new r2(this, 9), 12, null);
        this.dialog = showInformationFullDialogPasswordRecovery$default;
        if (showInformationFullDialogPasswordRecovery$default != null) {
            showInformationFullDialogPasswordRecovery$default.show();
        }
    }

    public final void initPasswordRecovery(Activity context, FragmentPasswordRecoverBinding binding, NavController navController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (NetworkUtil.INSTANCE.isNetworkAvailable(context)) {
            callAPIPasswordRecovery(context, binding, navController);
        } else {
            this.alertDialog = DialogUtil.Companion.showErrorDialog$default(DialogUtil.INSTANCE, context, EnumDialogType.DIALOG_TYPE_OFFLINE_ERROR, null, null, null, false, new r7(this, context, binding, navController, 3), 12, null);
        }
    }
}
