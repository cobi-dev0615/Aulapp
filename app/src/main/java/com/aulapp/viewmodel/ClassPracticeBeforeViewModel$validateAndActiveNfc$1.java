package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.app.AlertDialog;
import android.nfc.Tag;
import android.view.View;
import co.ceduladigital.sdk.p2;
import com.gse.aulapp.databinding.FragmentClassPracticeBeforeBinding;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.NfcUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/gse/aulapp/viewmodel/ClassPracticeBeforeViewModel$validateAndActiveNfc$1", "Lcom/gse/aulapp/util/NfcUtil$NfcCallback;", "onSuccess", BuildConfig.FLAVOR, "tag", "Landroid/nfc/Tag;", "onError", "error", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$validateAndActiveNfc$1 implements NfcUtil.NfcCallback {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ FragmentClassPracticeBeforeBinding $binding;
    final /* synthetic */ boolean $isEnter;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    public ClassPracticeBeforeViewModel$validateAndActiveNfc$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Activity activity, FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding, boolean z) {
        this.this$0 = classPracticeBeforeViewModel;
        this.$activity = activity;
        this.$binding = fragmentClassPracticeBeforeBinding;
        this.$isEnter = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$0(ClassPracticeBeforeViewModel this$0, View view) {
        AlertDialog alertDialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        alertDialog = this$0.dialog;
        if (alertDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        }
        alertDialog.cancel();
    }

    @Override // com.gse.aulapp.util.NfcUtil.NfcCallback
    public void onError(String error) {
        AlertDialog alertDialog;
        AlertDialog alertDialog2;
        Intrinsics.checkNotNullParameter(error, "error");
        ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.this$0;
        classPracticeBeforeViewModel.dialog = DialogUtil.INSTANCE.showInformationFullDialogBiometricRegistrationResponse(this.$activity, EnumDialogType.WARNING_NFC_NOT_FOUND, true, false, new p2(classPracticeBeforeViewModel, 2));
        alertDialog = this.this$0.dialog;
        AlertDialog alertDialog3 = null;
        if (alertDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        }
        if (alertDialog.isShowing()) {
            return;
        }
        alertDialog2 = this.this$0.dialog;
        if (alertDialog2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
        } else {
            alertDialog3 = alertDialog2;
        }
        alertDialog3.show();
    }

    @Override // com.gse.aulapp.util.NfcUtil.NfcCallback
    public void onSuccess(Tag tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new ClassPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1(tag, this.this$0, this.$activity, this.$binding, this.$isEnter, null), 3, null);
    }
}
