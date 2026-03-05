package com.gse.aulapp.util;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.ViewModelKt;
import co.ceduladigital.sdk.k1;
import co.ceduladigital.sdk.x3;
import co.ceduladigital.sdk.y3;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.DialogExamInfoLayoutBinding;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.util.extension.ImageViewExtKt;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J4\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J \u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0016\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006 "}, d2 = {"Lcom/gse/aulapp/util/DialogNormalUtil;", BuildConfig.FLAVOR, "<init>", "()V", "showWelcomeDialog", BuildConfig.FLAVOR, "dialog", "Landroid/app/Dialog;", "nameCea", BuildConfig.FLAVOR, "showDialogNetworkErrosAccess", "context", "Landroid/content/Context;", "descriptionCEA", "buttonCustom", "Landroid/widget/Button;", "showLogoutDialog", "showIsPendingSyncDialog", "showWarningsGPS", "showWarningSignalGPS", "showWarningNFCTAG", "showDialogExamInfo", "viewModel", "Lcom/gse/aulapp/viewmodel/ClassInCourseViewModel;", "time", "createDialogBinding", "Lcom/gse/aulapp/databinding/DialogExamInfoLayoutBinding;", "updateDialogExamInfo", "timer", "updateDialogExamSpeedInfo", "dialogFakeGps", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DialogNormalUtil {
    private static DialogExamInfoLayoutBinding bindingDialogExamInfo;
    private static Dialog dialogExamInfo;
    private static Dialog globalDialog;
    private static Job updateSpeedJob;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final MutableStateFlow<Boolean> dialogExamInfoIsShowing = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJM\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\r\u0010\u0014J9\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u0003J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0003R$\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/gse/aulapp/util/DialogNormalUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/gse/aulapp/model/enumerate/EnumDialogType;", "type", "Lkotlin/Function0;", BuildConfig.FLAVOR, "onButtonClick", BuildConfig.FLAVOR, "nameCea", "showDialog$app_release", "(Landroid/content/Context;Lcom/gse/aulapp/model/enumerate/EnumDialogType;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "showDialog", "Landroid/app/Dialog;", "dialog", "description", "Landroid/view/View$OnClickListener;", "(Landroid/content/Context;Landroid/app/Dialog;Lcom/gse/aulapp/model/enumerate/EnumDialogType;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;)Landroid/app/Dialog;", "urlImageProfile", "nameUserProfile", "showDialogCallUserProfile", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "closeGlobalDialog", "closedDetailsDialog", "globalDialog", "Landroid/app/Dialog;", "getGlobalDialog", "()Landroid/app/Dialog;", "setGlobalDialog", "(Landroid/app/Dialog;)V", "dialogExamInfo", "getDialogExamInfo", "setDialogExamInfo", "Lkotlinx/coroutines/flow/MutableStateFlow;", BuildConfig.FLAVOR, "dialogExamInfoIsShowing", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getDialogExamInfoIsShowing", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/gse/aulapp/databinding/DialogExamInfoLayoutBinding;", "bindingDialogExamInfo", "Lcom/gse/aulapp/databinding/DialogExamInfoLayoutBinding;", "getBindingDialogExamInfo", "()Lcom/gse/aulapp/databinding/DialogExamInfoLayoutBinding;", "setBindingDialogExamInfo", "(Lcom/gse/aulapp/databinding/DialogExamInfoLayoutBinding;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumDialogType.values().length];
                try {
                    iArr[EnumDialogType.WELCOME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumDialogType.LOGOUT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumDialogType.WARNING_FAIL_GPS_NFC_FLIGHT_MODE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumDialogType.WARNING_SIGNAL_GPS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumDialogType.WARNING_NFC_TAG.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumDialogType.IS_PENDING_SYNC.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumDialogType.DIALOG_FAKE_GPS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumDialogType.NETWORK_ACCESS_ERROR.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void showDialog$app_release$default(Companion companion, Context context, EnumDialogType enumDialogType, Function0 function0, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            companion.showDialog$app_release(context, enumDialogType, function0, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showDialog$lambda$0(Dialog dialog, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            dialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showDialog$lambda$1(Dialog dialog, Function0 function0, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            dialog.dismiss();
            if (function0 != null) {
                function0.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showDialogCallUserProfile$lambda$4(Dialog dialog, Function0 function0, View view) {
            Intrinsics.checkNotNullParameter(dialog, "$dialog");
            dialog.dismiss();
            if (function0 != null) {
                function0.invoke();
            }
        }

        public final void closeGlobalDialog() {
            if (getGlobalDialog() != null) {
                Dialog globalDialog = getGlobalDialog();
                Intrinsics.checkNotNull(globalDialog);
                if (globalDialog.isShowing()) {
                    Dialog globalDialog2 = getGlobalDialog();
                    Intrinsics.checkNotNull(globalDialog2);
                    globalDialog2.dismiss();
                    setGlobalDialog(null);
                }
            }
        }

        public final void closedDetailsDialog() {
            if (getDialogExamInfo() != null) {
                Dialog dialogExamInfo = getDialogExamInfo();
                Intrinsics.checkNotNull(dialogExamInfo);
                if (dialogExamInfo.isShowing()) {
                    Dialog dialogExamInfo2 = getDialogExamInfo();
                    Intrinsics.checkNotNull(dialogExamInfo2);
                    dialogExamInfo2.dismiss();
                    getDialogExamInfoIsShowing().setValue(Boolean.FALSE);
                }
            }
        }

        public final DialogExamInfoLayoutBinding getBindingDialogExamInfo() {
            return DialogNormalUtil.bindingDialogExamInfo;
        }

        public final Dialog getDialogExamInfo() {
            return DialogNormalUtil.dialogExamInfo;
        }

        public final MutableStateFlow<Boolean> getDialogExamInfoIsShowing() {
            return DialogNormalUtil.dialogExamInfoIsShowing;
        }

        public final Dialog getGlobalDialog() {
            return DialogNormalUtil.globalDialog;
        }

        public final void setGlobalDialog(Dialog dialog) {
            DialogNormalUtil.globalDialog = dialog;
        }

        public final void showDialog$app_release(Context context, EnumDialogType type, Function0<Unit> onButtonClick, String nameCea) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(type, "type");
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.dialog_normal_screen_layout);
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialog.setCancelable(false);
            View findViewById = dialog.findViewById(R.id.dialog_button_close);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            View findViewById2 = dialog.findViewById(R.id.dialog_button);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            ((ImageView) findViewById).setOnClickListener(new x3(dialog, 0));
            ((Button) findViewById2).setOnClickListener(new y3(dialog, onButtonClick, 0));
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    new DialogNormalUtil().showWelcomeDialog(dialog, nameCea);
                    break;
                case 2:
                    new DialogNormalUtil().showLogoutDialog(dialog);
                    break;
                case 3:
                    new DialogNormalUtil().showWarningsGPS(context);
                    break;
                case 4:
                    new DialogNormalUtil().showWarningSignalGPS(context, dialog);
                    break;
                case 5:
                    new DialogNormalUtil().showWarningNFCTAG(dialog);
                    break;
                case 6:
                    new DialogNormalUtil().showIsPendingSyncDialog(context, dialog);
                    break;
                case 7:
                    new DialogNormalUtil().dialogFakeGps(context, dialog);
                    break;
            }
        }

        public final void showDialogCallUserProfile(Context context, String urlImageProfile, String nameUserProfile, Function0<Unit> onButtonClick) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(urlImageProfile, "urlImageProfile");
            Dialog dialog = new Dialog(context);
            dialog.setContentView(R.layout.dialog_screen_call_user_profile);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
            }
            Window window2 = dialog.getWindow();
            Intrinsics.checkNotNull(window2);
            window2.setBackgroundDrawable(new ColorDrawable(0));
            Window window3 = dialog.getWindow();
            if (window3 != null) {
                window3.setWindowAnimations(R.style.DialogAnimation);
            }
            dialog.setCancelable(true);
            View findViewById = dialog.findViewById(R.id.iv_dialog_image_user_profile);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            ImageView imageView = (ImageView) findViewById;
            View findViewById2 = dialog.findViewById(R.id.tv_dialog_name_user_profile);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            View findViewById3 = dialog.findViewById(R.id.dialog_button_phone);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            ImageButton imageButton = (ImageButton) findViewById3;
            ((TextView) findViewById2).setText(nameUserProfile);
            if (!NetworkUtil.INSTANCE.isNetworkAvailable(context) || urlImageProfile.length() == 0) {
                imageView.setImageResource(R.drawable.ic_image_user_no_connection);
            } else {
                ImageViewExtKt.loadImage(imageView, urlImageProfile);
            }
            imageButton.setOnClickListener(new y3(dialog, onButtonClick, 1));
            dialog.show();
        }

        private Companion() {
        }

        public final Dialog showDialog$app_release(Context context, Dialog dialog, EnumDialogType type, String nameCea, String description, View.OnClickListener onButtonClick) {
            Dialog dialog2;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(type, "type");
            if (dialog != null) {
                dialog.setContentView(R.layout.dialog_normal_screen_layout);
            }
            Window window = dialog != null ? dialog.getWindow() : null;
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialog.setCancelable(false);
            View findViewById = dialog.findViewById(R.id.dialog_button_close);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            View findViewById2 = dialog.findViewById(R.id.dialog_button);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            Button button = (Button) findViewById2;
            ((ImageView) findViewById).setOnClickListener(new x3(dialog, 1));
            if (WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 8) {
                dialog2 = dialog;
                new DialogNormalUtil().showDialogNetworkErrosAccess(context, dialog2, nameCea, description, button);
            } else {
                dialog2 = dialog;
            }
            if (onButtonClick != null) {
                button.setOnClickListener(onButtonClick);
                return dialog2;
            }
            button.setOnClickListener(new x3(dialog2, 2));
            return dialog2;
        }
    }

    private final DialogExamInfoLayoutBinding createDialogBinding(Context context) {
        DialogExamInfoLayoutBinding inflate = DialogExamInfoLayoutBinding.inflate(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialogExamInfo$lambda$0(View view) {
        Dialog dialog = dialogExamInfo;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
        dialogExamInfoIsShowing.setValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialogNetworkErrosAccess(Context context, Dialog dialog, String nameCea, String descriptionCEA, Button buttonCustom) {
        View findViewById = dialog.findViewById(R.id.dialog_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = dialog.findViewById(R.id.dialog_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = dialog.findViewById(R.id.dialog_name_cea);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = dialog.findViewById(R.id.dialog_image);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        Drawable drawable = ResourcesCompat.getDrawable(dialog.getContext().getResources(), R.drawable.ic_network_access_error, null);
        ViewGroup.LayoutParams layoutParams = buttonCustom.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = 80;
        ((ImageView) findViewById4).setImageDrawable(drawable);
        buttonCustom.setVisibility(0);
        buttonCustom.setLayoutParams(marginLayoutParams);
        buttonCustom.setBackgroundColor(ResourceUtil.INSTANCE.getColorResource(context, R.color.dark_green));
        buttonCustom.setText(dialog.getContext().getResources().getString(R.string.button_title_error_endpoint));
        ((TextView) findViewById).setText(nameCea);
        ((TextView) findViewById2).setText(descriptionCEA);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showIsPendingSyncDialog(Context context, Dialog dialog) {
        View findViewById = dialog.findViewById(R.id.dialog_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = dialog.findViewById(R.id.dialog_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = dialog.findViewById(R.id.dialog_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = dialog.findViewById(R.id.dialog_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        Button button = (Button) findViewById4;
        Drawable drawable = ResourcesCompat.getDrawable(dialog.getContext().getResources(), R.drawable.ic_warning_2_type, null);
        ((TextView) findViewById).setVisibility(8);
        ((TextView) findViewById2).setText(dialog.getContext().getString(R.string.txt_dialog_sync));
        ((ImageView) findViewById3).setImageDrawable(drawable);
        button.setText(context.getResources().getString(R.string.action_sync));
        button.setVisibility(0);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showLogoutDialog(Dialog dialog) {
        View findViewById = dialog.findViewById(R.id.dialog_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = dialog.findViewById(R.id.dialog_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = dialog.findViewById(R.id.dialog_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = dialog.findViewById(R.id.dialog_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        Drawable drawable = ResourcesCompat.getDrawable(dialog.getContext().getResources(), R.drawable.ic_dialog_normalscreen_logout, null);
        ((TextView) findViewById).setVisibility(8);
        ((TextView) findViewById2).setText(dialog.getContext().getString(R.string.dialog_normalscreen_logout_description));
        ((ImageView) findViewById3).setImageDrawable(drawable);
        ((Button) findViewById4).setVisibility(0);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWarningNFCTAG(Dialog dialog) {
        View findViewById = dialog.findViewById(R.id.dialog_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = dialog.findViewById(R.id.dialog_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = dialog.findViewById(R.id.dialog_description_part2);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = dialog.findViewById(R.id.dialog_image);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        View findViewById5 = dialog.findViewById(R.id.dialog_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        Drawable drawable = ResourcesCompat.getDrawable(dialog.getContext().getResources(), R.drawable.ic_warning_2_type, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dialog.getContext().getString(R.string.message_dialog_warning_nfc_tag_part_2));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(dialog.getContext().getString(R.string.message_dialog_warning_nfc_tag_part_1));
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(-7829368), 0, spannableStringBuilder2.length(), 34);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 34);
        ((TextView) findViewById).setVisibility(8);
        ((TextView) findViewById2).setText(spannableStringBuilder2);
        ((TextView) findViewById3).setText(spannableStringBuilder);
        ((ImageView) findViewById4).setImageDrawable(drawable);
        ((Button) findViewById5).setVisibility(8);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWarningSignalGPS(Context context, Dialog dialog) {
        View findViewById = dialog.findViewById(R.id.dialog_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = dialog.findViewById(R.id.dialog_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = dialog.findViewById(R.id.dialog_description_part2);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = dialog.findViewById(R.id.dialog_image);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        View findViewById5 = dialog.findViewById(R.id.dialog_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        Drawable drawable = ResourcesCompat.getDrawable(dialog.getContext().getResources(), R.drawable.ic_warning, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dialog.getContext().getString(R.string.message_dialog_warning_signal_gps_part_2));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(dialog.getContext().getString(R.string.message_dialog_warning_signal_gps_part_1));
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(-7829368), 0, spannableStringBuilder2.length(), 34);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.dark_green)), 0, 1, 34);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context, R.color.dark_green)), 50, 54, 34);
        ((TextView) findViewById).setVisibility(8);
        ((TextView) findViewById2).setText(spannableStringBuilder2);
        ((TextView) findViewById3).setText(spannableStringBuilder);
        ((ImageView) findViewById4).setImageDrawable(drawable);
        ((Button) findViewById5).setVisibility(8);
        dialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWarningsGPS(Context context) {
        Dialog dialog = globalDialog;
        if (dialog == null) {
            Dialog dialog2 = new Dialog(context);
            globalDialog = dialog2;
            Intrinsics.checkNotNull(dialog2);
            dialog2.setContentView(R.layout.dialog_normal_screen_layout);
            Dialog dialog3 = globalDialog;
            Intrinsics.checkNotNull(dialog3);
            Window window = dialog3.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            Dialog dialog4 = globalDialog;
            Intrinsics.checkNotNull(dialog4);
            dialog4.setCancelable(false);
        } else {
            Intrinsics.checkNotNull(dialog);
            if (dialog.isShowing()) {
                Dialog dialog5 = globalDialog;
                Intrinsics.checkNotNull(dialog5);
                dialog5.dismiss();
            }
        }
        Dialog dialog6 = globalDialog;
        if (dialog6 != null) {
            Intrinsics.checkNotNull(dialog6);
            View findViewById = dialog6.findViewById(R.id.dialog_title);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            Dialog dialog7 = globalDialog;
            Intrinsics.checkNotNull(dialog7);
            View findViewById2 = dialog7.findViewById(R.id.dialog_description);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            Dialog dialog8 = globalDialog;
            Intrinsics.checkNotNull(dialog8);
            View findViewById3 = dialog8.findViewById(R.id.dialog_description_part2);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
            Dialog dialog9 = globalDialog;
            Intrinsics.checkNotNull(dialog9);
            View findViewById4 = dialog9.findViewById(R.id.dialog_image);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
            Dialog dialog10 = globalDialog;
            Intrinsics.checkNotNull(dialog10);
            View findViewById5 = dialog10.findViewById(R.id.dialog_button);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
            Dialog dialog11 = globalDialog;
            Intrinsics.checkNotNull(dialog11);
            View findViewById6 = dialog11.findViewById(R.id.dialog_button_close);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
            Dialog dialog12 = globalDialog;
            Intrinsics.checkNotNull(dialog12);
            Drawable drawable = ResourcesCompat.getDrawable(dialog12.getContext().getResources(), R.drawable.ic_unsignal, null);
            Dialog dialog13 = globalDialog;
            Intrinsics.checkNotNull(dialog13);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dialog13.getContext().getString(R.string.message_dialog_warning_gps_nff_others_part_2));
            Dialog dialog14 = globalDialog;
            Intrinsics.checkNotNull(dialog14);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(dialog14.getContext().getString(R.string.message_dialog_warning_gps_nff_others_part_1));
            ((TextView) findViewById).setVisibility(8);
            spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 34);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(-7829368), 0, spannableStringBuilder2.length(), 34);
            ((TextView) findViewById2).setText(spannableStringBuilder2);
            ((TextView) findViewById3).setText(spannableStringBuilder);
            ((ImageView) findViewById4).setImageDrawable(drawable);
            ((Button) findViewById5).setVisibility(8);
            ((ImageView) findViewById6).setVisibility(8);
            Dialog dialog15 = globalDialog;
            Intrinsics.checkNotNull(dialog15);
            dialog15.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showWelcomeDialog(Dialog dialog, String nameCea) {
        View findViewById = dialog.findViewById(R.id.dialog_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = dialog.findViewById(R.id.dialog_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = dialog.findViewById(R.id.dialog_name_cea);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = dialog.findViewById(R.id.dialog_image);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        ((ImageView) findViewById4).setImageDrawable(ResourcesCompat.getDrawable(dialog.getContext().getResources(), R.drawable.ic_dialog_normalscreen_welcome, null));
        ((TextView) findViewById).setText(dialog.getContext().getResources().getString(R.string.dialog_normalscreen_welcome_title));
        ((TextView) findViewById2).setText(dialog.getContext().getResources().getString(R.string.dialog_normalscreen_welcome_description));
        if (nameCea != null && nameCea.length() != 0) {
            textView.setVisibility(0);
            textView.setText(nameCea);
        }
        dialog.show();
    }

    private final void updateDialogExamSpeedInfo(ClassInCourseViewModel viewModel) {
        Job launch$default;
        Job job = updateSpeedJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        launch$default = BuildersKt.launch$default(ViewModelKt.getViewModelScope(viewModel), null, null, new DialogNormalUtil$updateDialogExamSpeedInfo$1(viewModel, null), 3, null);
        updateSpeedJob = launch$default;
    }

    public final void dialogFakeGps(Context context, Dialog dialog) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        View findViewById = dialog.findViewById(R.id.dialog_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        View findViewById2 = dialog.findViewById(R.id.dialog_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = dialog.findViewById(R.id.dialog_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = dialog.findViewById(R.id.dialog_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        Button button = (Button) findViewById4;
        View findViewById5 = dialog.findViewById(R.id.dialog_button_close);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        Drawable drawable = ResourcesCompat.getDrawable(dialog.getContext().getResources(), R.drawable.ic_warning_2_type, null);
        ((ImageView) findViewById5).setVisibility(8);
        textView.setVisibility(0);
        textView.setText(context.getString(R.string.dialog_normal_fake_gps_description));
        ((TextView) findViewById2).setText(context.getString(R.string.dialog_normal_fake_gps_title));
        ((ImageView) findViewById3).setImageDrawable(drawable);
        button.setVisibility(8);
        button.setText("Reintentar");
        if (dialog.isShowing()) {
            dialog.dismiss();
        } else {
            dialog.show();
        }
    }

    public final void showDialogExamInfo(Context context, ClassInCourseViewModel viewModel, String time) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        String value = viewModel.getTimeElapsedInService().getValue();
        if (value == null) {
            value = context.getString(R.string.txt_time_formatted_00_00_00);
            Intrinsics.checkNotNullExpressionValue(value, "getString(...)");
        }
        String minimumClassMinutes = viewModel.getMinimumClassMinutes();
        bindingDialogExamInfo = createDialogBinding(context);
        Dialog dialog = new Dialog(context);
        dialogExamInfo = dialog;
        Intrinsics.checkNotNull(dialog);
        DialogExamInfoLayoutBinding dialogExamInfoLayoutBinding = bindingDialogExamInfo;
        Intrinsics.checkNotNull(dialogExamInfoLayoutBinding);
        dialog.setContentView(dialogExamInfoLayoutBinding.getRoot());
        Dialog dialog2 = dialogExamInfo;
        Intrinsics.checkNotNull(dialog2);
        Window window = dialog2.getWindow();
        Intrinsics.checkNotNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        Dialog dialog3 = dialogExamInfo;
        Intrinsics.checkNotNull(dialog3);
        dialog3.setCancelable(false);
        DialogExamInfoLayoutBinding dialogExamInfoLayoutBinding2 = bindingDialogExamInfo;
        Intrinsics.checkNotNull(dialogExamInfoLayoutBinding2);
        dialogExamInfoLayoutBinding2.llExamInfo.setOnClickListener(new k1(2));
        DialogExamInfoLayoutBinding dialogExamInfoLayoutBinding3 = bindingDialogExamInfo;
        Intrinsics.checkNotNull(dialogExamInfoLayoutBinding3);
        TextView textView = dialogExamInfoLayoutBinding3.tvTimer;
        if (value.length() == 0) {
            value = context.getString(R.string.txt_time_formatted_00_00_00);
            Intrinsics.checkNotNull(value);
        }
        textView.setText(value);
        DialogExamInfoLayoutBinding dialogExamInfoLayoutBinding4 = bindingDialogExamInfo;
        Intrinsics.checkNotNull(dialogExamInfoLayoutBinding4);
        TextView textView2 = dialogExamInfoLayoutBinding4.tvMinimunTime;
        String string = context.getResources().getString(R.string.txt_minimum_time);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        textView2.setText(StringsKt.t(string, "[TIME]", minimumClassMinutes));
        Dialog dialog4 = dialogExamInfo;
        Intrinsics.checkNotNull(dialog4);
        dialog4.show();
        dialogExamInfoIsShowing.setValue(Boolean.TRUE);
        updateDialogExamSpeedInfo(viewModel);
        DialogExamInfoLayoutBinding dialogExamInfoLayoutBinding5 = bindingDialogExamInfo;
        Intrinsics.checkNotNull(dialogExamInfoLayoutBinding5);
        viewModel.setDataSessionDetailToDialog$app_release(dialogExamInfoLayoutBinding5, time);
    }

    public final void updateDialogExamInfo(Context context, ClassInCourseViewModel viewModel, String timer) {
        DialogExamInfoLayoutBinding dialogExamInfoLayoutBinding;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        if (!dialogExamInfoIsShowing.getValue().booleanValue() || dialogExamInfo == null || (dialogExamInfoLayoutBinding = bindingDialogExamInfo) == null) {
            return;
        }
        Intrinsics.checkNotNull(dialogExamInfoLayoutBinding);
        dialogExamInfoLayoutBinding.tvTimer.setText(timer);
    }
}
