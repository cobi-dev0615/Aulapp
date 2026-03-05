package com.gse.aulapp.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import co.ceduladigital.sdk.a4;
import co.ceduladigital.sdk.k1;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.r2;
import co.ceduladigital.sdk.z3;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.gse.aulapp.R;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.util.UIHelper;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/DialogUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DialogUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "DialogUtil";
    private static Dialog dialogLoading;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012JW\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u001cJc\u0010!\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b!\u0010\"JK\u0010$\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b$\u0010%JG\u0010&\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b&\u0010'J7\u0010)\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b)\u0010*JA\u0010,\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010+\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b,\u0010-JO\u0010.\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u0002012\u0006\u0010\u0005\u001a\u0002002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b2\u00103J-\u00107\u001a\u0002012\u0006\u0010\u0005\u001a\u0002002\u0006\u00104\u001a\u00020\f2\u0006\u00105\u001a\u00020\f2\u0006\u00106\u001a\u00020\f¢\u0006\u0004\b7\u00108J%\u0010;\u001a\u0002012\u0006\u00109\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0016¢\u0006\u0004\b;\u0010<Jc\u0010=\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b=\u0010\"J'\u0010?\u001a\u0002012\u0006\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010>¢\u0006\u0004\b?\u0010@J'\u0010A\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\bA\u0010BJW\u0010!\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010C\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b!\u0010DR\u001f\u0010F\u001a\n E*\u0004\u0018\u00010\b0\b8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR$\u0010K\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\bS\u0010RR\u0014\u0010T\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\bT\u0010RR\u0014\u0010U\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\bU\u0010RR\u0014\u0010V\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\bV\u0010RR\u0014\u0010W\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\bW\u0010RR\u0014\u0010X\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\bX\u0010RR\u0014\u0010Y\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\bY\u0010RR\u0014\u0010Z\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\bZ\u0010RR\u0014\u0010[\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010RR\u0014\u0010\\\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\\\u0010RR\u0014\u0010]\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010RR\u0014\u0010^\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b^\u0010RR\u0014\u0010_\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b_\u0010RR\u0014\u0010`\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b`\u0010R¨\u0006a"}, d2 = {"Lcom/gse/aulapp/util/DialogUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/app/Activity;", "context", "Lcom/gse/aulapp/model/enumerate/EnumDialogType;", "type", BuildConfig.FLAVOR, "message", "code", "messageException", BuildConfig.FLAVOR, "cancelable", "Landroid/view/View$OnClickListener;", "listener", "Landroid/app/AlertDialog;", "showErrorDialog", "(Landroid/app/Activity;Lcom/gse/aulapp/model/enumerate/EnumDialogType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/view/View$OnClickListener;)Landroid/app/AlertDialog;", "content", "titleContent", "titleBtnContent", BuildConfig.FLAVOR, "dialogType", "isCancelable", "listenerOk", "listenerError", "showInformationDialog", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLandroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/AlertDialog;", "title", "titleButtonOk", "titleButtonError", "drawableImage", "showInformationFullDialog", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/AlertDialog;", "complete", "showInformationFullDialogPermission", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumDialogType;ZZLandroid/view/View$OnClickListener;)Landroid/app/AlertDialog;", "showInformationFullDialogPasswordRecovery", "(Landroid/app/Activity;ZLjava/lang/String;Ljava/lang/String;ZLandroid/view/View$OnClickListener;)Landroid/app/AlertDialog;", "selectedDialog", "showInformationFullDialogBiometricRegistrationResponse", "(Landroid/app/Activity;Lcom/gse/aulapp/model/enumerate/EnumDialogType;ZZLandroid/view/View$OnClickListener;)Landroid/app/AlertDialog;", "listenerCancel", "showInformationDialogValidationExam", "(Landroid/app/Activity;Lcom/gse/aulapp/model/enumerate/EnumDialogType;ZZLandroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)Landroid/app/AlertDialog;", "showInformationDialogPassExam", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;Landroid/view/View$OnClickListener;)Landroid/app/AlertDialog;", "Landroid/content/Context;", BuildConfig.FLAVOR, "showErrorGeneralDialogGlobal", "(Landroid/content/Context;Ljava/lang/String;)V", "show", "isTransparent", "showImage", "showDialogProgressGlobal", "(Landroid/content/Context;ZZZ)V", "activity", "bottom", "showToastAlert", "(Landroid/app/Activity;Ljava/lang/String;I)V", "showInformationFullDialogError", "Lkotlin/Function0;", "showGlobalDialogController", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "showDialogTimeout", "(Landroid/app/Activity;ZLandroid/view/View$OnClickListener;)Landroid/app/AlertDialog;", "isWarning", "(Landroid/app/Activity;Lcom/gse/aulapp/model/enumerate/EnumDialogType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLandroid/view/View$OnClickListener;)Landroid/app/AlertDialog;", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "Landroid/app/Dialog;", "dialogLoading", "Landroid/app/Dialog;", "getDialogLoading", "()Landroid/app/Dialog;", "setDialogLoading", "(Landroid/app/Dialog;)V", "DIALOG_TYPE_GENERAL_ERROR", "I", "DIALOG_TYPE_OFFLINE_ERROR", "DIALOG_TYPE_ERROR_APP", "DIALOG_TYPE_CONFIRMATION_APP", "DIALOG_BACK_CLASS", "DIALOG_WAIT_TIME", "DIALOG_EXAM_NOT_APPROVED", "DIALOG_EXAM_APPROVED", "DIALOG_CLOSE_CLASS_BEFORE_TIME", "DIALOG_CLOSE_CLASS_INCOMPLETE", "DIALOG_EXTRA_CLASS_TIME_ALARM", "DIALOG_IS_EMULATOR_OR_DEVELOPER_MODE", "DIALOG_ERROR_MESSAGE_BIOMETRIC", "DIALOG_TYPE_WITHOUT_BIOMETRIC_APP", "DIALOG_TIME_PASSED", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumDialogType.values().length];
                try {
                    iArr[EnumDialogType.LEFT_HAND_BIOMETRIC_RECORD_SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumDialogType.RIGHT_HAND_BIOMETRIC_RECORD_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumDialogType.VERIFY_LEFT_HAND_BIOMETRIC_RECORD_SUCCESS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumDialogType.VERIFY_RIGHT_HAND_BIOMETRIC_RECORD_SUCCESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[EnumDialogType.BIOMETRIC_RECORD_REGISTERED_VERIFIED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[EnumDialogType.BIOMETRIC_READING_ERROR.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[EnumDialogType.HAND_CHANGE_ERROR.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[EnumDialogType.HAND_CHANGE_ERROR_RIGHT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[EnumDialogType.BIOMETRIC_REGISTER_INCOMPLETE.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[EnumDialogType.ENTRY_EXAM_SUCESS.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[EnumDialogType.ENTRY_EXAM_INSTRUCTOR.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[EnumDialogType.EXIT_EXAM_SUCESS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[EnumDialogType.EXIT_EXAM_INSTRUCTOR.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[EnumDialogType.TIME_FOR_FINISH_EXAM.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[EnumDialogType.EXCEPTION_BIOMETRIC_BOTH.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[EnumDialogType.PHOTO_RECORD_SUCCESS.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[EnumDialogType.PHOTO_RECORD_FAIL.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[EnumDialogType.VERIFY_LEFT_HAND_BIOMETRIC_RECORD_SUCCESS_QR.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[EnumDialogType.VERIFY_RIGHT_HAND_BIOMETRIC_RECORD_SUCCESS_QR.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[EnumDialogType.SUCCESS_REGISTRATION_BIOMETRIC_LEFT.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[EnumDialogType.SUCCESS_REGISTRATION_BIOMETRIC_RIGHT.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[EnumDialogType.SUCCESS_REGISTRATION_BIOMETRIC_PROCESS.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                try {
                    iArr[EnumDialogType.SUCCESS_REGISTRATION_VERIFY_PROCESS.ordinal()] = 23;
                } catch (NoSuchFieldError unused23) {
                }
                try {
                    iArr[EnumDialogType.SUCCESS_VERIFICATION_HANDS.ordinal()] = 24;
                } catch (NoSuchFieldError unused24) {
                }
                try {
                    iArr[EnumDialogType.SUCCESS_VERIFY_BIOMETRIC_LEFT.ordinal()] = 25;
                } catch (NoSuchFieldError unused25) {
                }
                try {
                    iArr[EnumDialogType.SUCCESS_VERIFY_BIOMETRIC_RIGHT.ordinal()] = 26;
                } catch (NoSuchFieldError unused26) {
                }
                try {
                    iArr[EnumDialogType.FAIL_REGISTRATION_BIOMETRIC.ordinal()] = 27;
                } catch (NoSuchFieldError unused27) {
                }
                try {
                    iArr[EnumDialogType.FAIL_CONNECTION_REGISTRATION_BIOMETRIC.ordinal()] = 28;
                } catch (NoSuchFieldError unused28) {
                }
                try {
                    iArr[EnumDialogType.FAIL_REGISTRATION_LEFT_HAND_ENROLL.ordinal()] = 29;
                } catch (NoSuchFieldError unused29) {
                }
                try {
                    iArr[EnumDialogType.FAIL_REGISTRATION_LEFT_HAND_VERIFY.ordinal()] = 30;
                } catch (NoSuchFieldError unused30) {
                }
                try {
                    iArr[EnumDialogType.FAIL_REGISTRATION_RIGHT_HAND_ENROLL.ordinal()] = 31;
                } catch (NoSuchFieldError unused31) {
                }
                try {
                    iArr[EnumDialogType.FAIL_REGISTRATION_RIGHT_HAND_VERIFY.ordinal()] = 32;
                } catch (NoSuchFieldError unused32) {
                }
                try {
                    iArr[EnumDialogType.WELCOME_TO_APP_MESSAGE.ordinal()] = 33;
                } catch (NoSuchFieldError unused33) {
                }
                try {
                    iArr[EnumDialogType.CHECK_LEFT_HAND.ordinal()] = 34;
                } catch (NoSuchFieldError unused34) {
                }
                try {
                    iArr[EnumDialogType.CHECK_RIGHT_HAND.ordinal()] = 35;
                } catch (NoSuchFieldError unused35) {
                }
                try {
                    iArr[EnumDialogType.SUCCESS_REGISTERED_DOCUMENTS_FACE.ordinal()] = 36;
                } catch (NoSuchFieldError unused36) {
                }
                try {
                    iArr[EnumDialogType.SUCCESS_REGISTERED_FACE.ordinal()] = 37;
                } catch (NoSuchFieldError unused37) {
                }
                try {
                    iArr[EnumDialogType.EXCEPTION_BIOMETRIC_ENROLL_LEFT_HAND.ordinal()] = 38;
                } catch (NoSuchFieldError unused38) {
                }
                try {
                    iArr[EnumDialogType.EXCEPTION_BIOMETRIC_VERIFY_LEFT_HAND.ordinal()] = 39;
                } catch (NoSuchFieldError unused39) {
                }
                try {
                    iArr[EnumDialogType.EXCEPTION_BIOMETRIC_ENROLL_RIGHT_HAND.ordinal()] = 40;
                } catch (NoSuchFieldError unused40) {
                }
                try {
                    iArr[EnumDialogType.EXCEPTION_BIOMETRIC_VERIFY_RIGHT_HAND.ordinal()] = 41;
                } catch (NoSuchFieldError unused41) {
                }
                try {
                    iArr[EnumDialogType.FAIL_REGISTERED_DOCUMENTS_FACE.ordinal()] = 42;
                } catch (NoSuchFieldError unused42) {
                }
                try {
                    iArr[EnumDialogType.FAIL_REGISTERED_FACE.ordinal()] = 43;
                } catch (NoSuchFieldError unused43) {
                }
                try {
                    iArr[EnumDialogType.NETWORK_ERROR.ordinal()] = 44;
                } catch (NoSuchFieldError unused44) {
                }
                try {
                    iArr[EnumDialogType.DIALOG_TYPE_GENERAL_ERROR.ordinal()] = 45;
                } catch (NoSuchFieldError unused45) {
                }
                try {
                    iArr[EnumDialogType.DIALOG_TYPE_OFFLINE_ERROR.ordinal()] = 46;
                } catch (NoSuchFieldError unused46) {
                }
                try {
                    iArr[EnumDialogType.DIALOG_TYPE_ERROR_APP.ordinal()] = 47;
                } catch (NoSuchFieldError unused47) {
                }
                try {
                    iArr[EnumDialogType.DIALOG_TYPE_CONFIRMATION_APP.ordinal()] = 48;
                } catch (NoSuchFieldError unused48) {
                }
                try {
                    iArr[EnumDialogType.ERROR_OTHER_DEVICE.ordinal()] = 49;
                } catch (NoSuchFieldError unused49) {
                }
                try {
                    iArr[EnumDialogType.WARNING_NFC_DISABLE.ordinal()] = 50;
                } catch (NoSuchFieldError unused50) {
                }
                try {
                    iArr[EnumDialogType.WARNING_NFC_NOT_FOUND.ordinal()] = 51;
                } catch (NoSuchFieldError unused51) {
                }
                try {
                    iArr[EnumDialogType.DIALOG_BACK_CLASS.ordinal()] = 52;
                } catch (NoSuchFieldError unused52) {
                }
                try {
                    iArr[EnumDialogType.SUCCESS_REGISTERED_FACE_WITH_OUT_HANDS.ordinal()] = 53;
                } catch (NoSuchFieldError unused53) {
                }
                try {
                    iArr[EnumDialogType.IS_EMULATOR_OR_DEVELOPER_MODE.ordinal()] = 54;
                } catch (NoSuchFieldError unused54) {
                }
                try {
                    iArr[EnumDialogType.DIALOG_ERROR_MESSAGE_BIOMETRIC.ordinal()] = 55;
                } catch (NoSuchFieldError unused55) {
                }
                try {
                    iArr[EnumDialogType.DIALOG_TYPE_WITHOUT_BIOMETRIC_APP.ordinal()] = 56;
                } catch (NoSuchFieldError unused56) {
                }
                try {
                    iArr[EnumDialogType.DIALOG_TIME_PASSED.ordinal()] = 57;
                } catch (NoSuchFieldError unused57) {
                }
                try {
                    iArr[EnumDialogType.DIALOG_WITH_MESSAGE.ordinal()] = 58;
                } catch (NoSuchFieldError unused58) {
                }
                try {
                    iArr[EnumDialogType.FAIL_CONNECTION_SYNC_EXAM.ordinal()] = 59;
                } catch (NoSuchFieldError unused59) {
                }
                try {
                    iArr[EnumDialogType.NETWORK_ACCESS_ERROR.ordinal()] = 60;
                } catch (NoSuchFieldError unused60) {
                }
                try {
                    iArr[EnumDialogType.PENDING_EXAM_FOR_FINISH.ordinal()] = 61;
                } catch (NoSuchFieldError unused61) {
                }
                try {
                    iArr[EnumDialogType.CLASS_IN_PROGRESS.ordinal()] = 62;
                } catch (NoSuchFieldError unused62) {
                }
                try {
                    iArr[EnumDialogType.CLASS_TIME_EXTRA_FINISHED.ordinal()] = 63;
                } catch (NoSuchFieldError unused63) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AlertDialog showErrorDialog$default(Companion companion, Activity activity, EnumDialogType enumDialogType, String str, String str2, String str3, boolean z, View.OnClickListener onClickListener, int i, Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            if ((i & 16) != 0) {
                str3 = null;
            }
            return companion.showErrorDialog(activity, enumDialogType, str, str2, str3, z, onClickListener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showGlobalDialogController$lambda$6(Function0 function0, View view) {
            if (function0 != null) {
                function0.invoke();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showGlobalDialogController$lambda$7(View view) {
            Dialog dialogLoading = DialogUtil.INSTANCE.getDialogLoading();
            if (dialogLoading != null) {
                dialogLoading.cancel();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showInformationFullDialog$lambda$0(BottomSheetDialog bottomSheetDialog, View view) {
            Intrinsics.checkNotNullParameter(bottomSheetDialog, "$bottomSheetDialog");
            bottomSheetDialog.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showInformationFullDialog$lambda$2(AlertDialog alertDialog, View view) {
            Intrinsics.checkNotNullParameter(alertDialog, "$alertDialog");
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showInformationFullDialogBiometricRegistrationResponse$lambda$1(AlertDialog alertDialog, View view) {
            Intrinsics.checkNotNullParameter(alertDialog, "$alertDialog");
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showInformationFullDialogError$lambda$3(BottomSheetDialog bottomSheetDialog, View view) {
            Intrinsics.checkNotNullParameter(bottomSheetDialog, "$bottomSheetDialog");
            bottomSheetDialog.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showInformationFullDialogError$lambda$4(AlertDialog alertDialog, View view) {
            Intrinsics.checkNotNullParameter(alertDialog, "$alertDialog");
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showInformationFullDialogError$lambda$5(AlertDialog alertDialog, View view) {
            Intrinsics.checkNotNullParameter(alertDialog, "$alertDialog");
            alertDialog.dismiss();
        }

        public static /* synthetic */ AlertDialog showInformationFullDialogPasswordRecovery$default(Companion companion, Activity activity, boolean z, String str, String str2, boolean z2, View.OnClickListener onClickListener, int i, Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                str2 = null;
            }
            return companion.showInformationFullDialogPasswordRecovery(activity, z, str, str2, z2, onClickListener);
        }

        public final Dialog getDialogLoading() {
            return DialogUtil.dialogLoading;
        }

        public final String getTAG() {
            return DialogUtil.TAG;
        }

        public final void setDialogLoading(Dialog dialog) {
            DialogUtil.dialogLoading = dialog;
        }

        public final void showDialogProgressGlobal(Context context, boolean show, boolean isTransparent, boolean showImage) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Dialog dialogLoading = getDialogLoading();
                int i = R.color.dialog_background;
                if (dialogLoading == null) {
                    setDialogLoading(new Dialog(context, android.R.style.Theme.Black));
                    View inflate = LayoutInflater.from(context).inflate(R.layout.loading_layout, (ViewGroup) null);
                    Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                    Dialog dialogLoading2 = getDialogLoading();
                    Intrinsics.checkNotNull(dialogLoading2);
                    dialogLoading2.requestWindowFeature(1);
                    Dialog dialogLoading3 = getDialogLoading();
                    Intrinsics.checkNotNull(dialogLoading3);
                    Window window = dialogLoading3.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawableResource(R.color.transparent);
                    }
                    Dialog dialogLoading4 = getDialogLoading();
                    Intrinsics.checkNotNull(dialogLoading4);
                    dialogLoading4.setContentView(inflate);
                    View findViewById = inflate.findViewById(R.id.iv_loading);
                    Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
                    ImageView imageView = (ImageView) findViewById;
                    if (showImage) {
                        Glide.with(context.getApplicationContext()).load(Integer.valueOf(R.drawable.ic_loading)).into(imageView);
                    }
                    imageView.setVisibility(showImage ? 0 : 8);
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.cl_loading);
                    if (isTransparent) {
                        i = R.color.transparent;
                    }
                    constraintLayout.setBackgroundResource(i);
                } else {
                    if (show) {
                        Dialog dialogLoading5 = getDialogLoading();
                        Intrinsics.checkNotNull(dialogLoading5);
                        if (dialogLoading5.isShowing()) {
                            return;
                        }
                    }
                    Dialog dialogLoading6 = getDialogLoading();
                    Intrinsics.checkNotNull(dialogLoading6);
                    View findViewById2 = dialogLoading6.findViewById(R.id.iv_loading);
                    Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
                    ImageView imageView2 = (ImageView) findViewById2;
                    if (showImage) {
                        Glide.with(context.getApplicationContext()).load(Integer.valueOf(R.drawable.ic_loading)).into(imageView2);
                    }
                    imageView2.setVisibility(showImage ? 0 : 8);
                    Dialog dialogLoading7 = getDialogLoading();
                    Intrinsics.checkNotNull(dialogLoading7);
                    View findViewById3 = dialogLoading7.findViewById(R.id.cl_loading);
                    Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) findViewById3;
                    if (isTransparent) {
                        i = R.color.transparent;
                    }
                    constraintLayout2.setBackgroundResource(i);
                }
                Dialog dialogLoading8 = getDialogLoading();
                Intrinsics.checkNotNull(dialogLoading8);
                dialogLoading8.setCancelable(false);
                if (show) {
                    try {
                        Dialog dialogLoading9 = getDialogLoading();
                        Intrinsics.checkNotNull(dialogLoading9);
                        dialogLoading9.show();
                        return;
                    } catch (Exception unused) {
                        Dialog dialogLoading10 = getDialogLoading();
                        Intrinsics.checkNotNull(dialogLoading10);
                        dialogLoading10.dismiss();
                        setDialogLoading(null);
                        return;
                    }
                }
                try {
                    Dialog dialogLoading11 = getDialogLoading();
                    Intrinsics.checkNotNull(dialogLoading11);
                    dialogLoading11.dismiss();
                    setDialogLoading(null);
                    return;
                } catch (Exception unused2) {
                    Dialog dialogLoading12 = getDialogLoading();
                    Intrinsics.checkNotNull(dialogLoading12);
                    dialogLoading12.dismiss();
                    setDialogLoading(null);
                    return;
                }
            } catch (Exception e) {
                getTAG();
                e.getMessage();
            }
            getTAG();
            e.getMessage();
        }

        public final AlertDialog showDialogTimeout(Activity context, boolean cancelable, View.OnClickListener listenerOk) {
            Intrinsics.checkNotNullParameter(context, "context");
            AlertDialog.Builder builder = new AlertDialog.Builder(context, android.R.style.Theme.Material.Light.NoActionBar.Fullscreen);
            LayoutInflater layoutInflater = context.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
            View inflate = layoutInflater.inflate(R.layout.dialog_fullscreen_layout, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_dialog_icon);
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_dialog_message);
            View findViewById = inflate.findViewById(R.id.btn_dialog_ok);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
            MaterialButton materialButton = (MaterialButton) findViewById;
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.dialog_fullscreen);
            builder.setView(inflate);
            builder.setCancelable(cancelable);
            AlertDialog create = builder.create();
            materialButton.setVisibility(0);
            relativeLayout.setBackgroundResource(R.color.dialog_error_background);
            textView.setText(context.getString(R.string.dialog_fullscreen_title_qr_error));
            q.w(context, R.string.dialog_message_timeout_complete, textView2, imageView, R.drawable.ic_error_password_recovery);
            String string = context.getString(R.string.dialog_fullscreen_title_button_qr_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ButtonUtil.INSTANCE.customThirdButton(materialButton, string, false);
            materialButton.setOnClickListener(listenerOk);
            return create;
        }

        public final AlertDialog showErrorDialog(Activity context, EnumDialogType type, String message, String code, String messageException, boolean cancelable, View.OnClickListener listener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(type, "type");
            return showInformationFullDialog(context, type, code, messageException, message, cancelable, true, listener);
        }

        public final void showErrorGeneralDialogGlobal(Context context, String message) {
            Intrinsics.checkNotNullParameter(context, "context");
            getTAG();
        }

        public final void showGlobalDialogController(Activity context, Function0<Unit> listenerOk) {
            Intrinsics.checkNotNullParameter(context, "context");
            setDialogLoading(showInformationDialog(context, context.getString(R.string.title_dialog_message), context.getString(R.string.title_dialog_back), context.getString(R.string.btn_title_continue), 4, false, new r2(listenerOk, 1), new k1(3)));
            Dialog dialogLoading = getDialogLoading();
            Intrinsics.checkNotNull(dialogLoading, "null cannot be cast to non-null type android.app.Dialog");
            dialogLoading.show();
        }

        public final AlertDialog showInformationDialog(Activity context, String content, String titleContent, String titleBtnContent, int dialogType, boolean isCancelable, View.OnClickListener listenerOk, View.OnClickListener listenerError) {
            Intrinsics.checkNotNullParameter(context, "context");
            Integer valueOf = Integer.valueOf(R.drawable.ic_clock_warning);
            switch (dialogType) {
                case 2:
                    return showInformationFullDialog(context, titleContent, content, isCancelable, titleBtnContent, null, Integer.valueOf(R.drawable.ic_error_password_recovery), listenerOk, null);
                case 3:
                    return showInformationFullDialog(context, titleContent, content, isCancelable, titleBtnContent, null, Integer.valueOf(R.drawable.ic_success_password_recovery), listenerOk, null);
                case 4:
                    return showInformationFullDialogError(context, titleContent, content, isCancelable, titleBtnContent, context.getString(R.string.title_dialog_cancel_link), valueOf, listenerOk, listenerError);
                case 5:
                    return showInformationFullDialogError(context, titleContent, content, isCancelable, titleBtnContent, null, valueOf, listenerOk, null);
                case 6:
                    return showInformationFullDialogError(context, titleContent, content, isCancelable, titleBtnContent, null, Integer.valueOf(R.drawable.ic_access_denied), listenerOk, null);
                case 7:
                    return showInformationDialogPassExam(context, titleContent, content, isCancelable, titleBtnContent, Integer.valueOf(R.drawable.ic_success_process), listenerOk);
                case 8:
                    return showInformationFullDialogError(context, titleContent, content, isCancelable, titleBtnContent, null, valueOf, listenerOk, null);
                case 9:
                    return showInformationFullDialogError(context, titleContent, content, isCancelable, titleBtnContent, null, Integer.valueOf(R.drawable.ic_close_warning), listenerOk, null);
                case 10:
                    return showInformationFullDialogError(context, titleContent, content, isCancelable, titleBtnContent, null, valueOf, listenerOk, listenerError);
                default:
                    return showErrorDialog$default(this, context, EnumDialogType.DIALOG_TYPE_GENERAL_ERROR, null, null, null, false, null, 12, null);
            }
        }

        public final AlertDialog showInformationDialogPassExam(Activity context, String title, String message, boolean cancelable, String titleButtonOk, Integer drawableImage, View.OnClickListener listenerOk) {
            Intrinsics.checkNotNullParameter(context, "context");
            AlertDialog.Builder builder = new AlertDialog.Builder(context, android.R.style.Theme.Material.Light.NoActionBar.Fullscreen);
            LayoutInflater layoutInflater = context.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
            View inflate = layoutInflater.inflate(R.layout.dialog_fullscreen_layout, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_dialog_icon);
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_dialog_message);
            View findViewById = inflate.findViewById(R.id.btn_dialog_ok);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
            MaterialButton materialButton = (MaterialButton) findViewById;
            ((RelativeLayout) inflate.findViewById(R.id.dialog_fullscreen)).setBackgroundResource(R.color.dialog_success_background);
            if (drawableImage != null) {
                imageView.setImageResource(drawableImage.intValue());
            }
            textView.setText(title);
            textView2.setText(message);
            materialButton.setText(titleButtonOk);
            builder.setView(inflate);
            builder.setCancelable(cancelable);
            AlertDialog create = builder.create();
            ButtonUtil.INSTANCE.customThirdButton(materialButton, materialButton.getText().toString(), true);
            materialButton.setOnClickListener(listenerOk);
            return create;
        }

        public final AlertDialog showInformationDialogValidationExam(Activity context, EnumDialogType selectedDialog, boolean complete, boolean cancelable, View.OnClickListener listenerOk, View.OnClickListener listenerCancel) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(selectedDialog, "selectedDialog");
            AlertDialog.Builder builder = new AlertDialog.Builder(context, android.R.style.Theme.Material.Light.NoActionBar.Fullscreen);
            LayoutInflater layoutInflater = context.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
            View inflate = layoutInflater.inflate(R.layout.dialog_fullscreen_layout, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_dialog_icon);
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_dialog_message);
            View findViewById = inflate.findViewById(R.id.btn_dialog_ok);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
            MaterialButton materialButton = (MaterialButton) findViewById;
            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_dialog_error);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.dialog_fullscreen);
            if (complete) {
                relativeLayout.setBackgroundResource(R.color.dialog_success_background);
                ButtonUtil.INSTANCE.customThirdButton(materialButton, materialButton.getText().toString(), complete);
            } else {
                relativeLayout.setBackgroundResource(R.color.dialog_error_background);
                ButtonUtil.INSTANCE.customThirdButton(materialButton, materialButton.getText().toString(), complete);
            }
            int i = WhenMappings.$EnumSwitchMapping$0[selectedDialog.ordinal()];
            if (i != 14) {
                switch (i) {
                    case 59:
                        textView3.setVisibility(8);
                        textView.setText(context.getString(R.string.dialog_fullscreen_fail_connection_endpoint_title));
                        imageView.setImageResource(R.drawable.ic_close_warning);
                        textView2.setText(context.getString(R.string.dialog_fullscreen_fail_connection_endpoint_text));
                        materialButton.setText(context.getString(R.string.dialog_fullscreen_fail_connection_endpoint_title_button));
                        break;
                    case 60:
                        q.w(context, R.string.title_network_error_access, textView, imageView, R.drawable.ic_network_access_error);
                        q.v(context, R.string.txt_network_error_access, textView2, R.string.dialog_fullscreen_fail_connection_endpoint_title_button, materialButton);
                        break;
                    case 61:
                        textView3.setVisibility(8);
                        textView.setText(context.getString(R.string.dialog_fullscreen_sync_pending_for_finish_title));
                        imageView.setImageResource(R.drawable.ic_close_warning);
                        textView2.setText(context.getString(R.string.dialog_fullscreen_sync_pending_for_finish_text));
                        materialButton.setText(context.getString(R.string.dialog_fullscreen_sync_pending_for_finish_title_button));
                        break;
                    case 62:
                        textView3.setVisibility(8);
                        textView.setText(context.getString(R.string.dialog_fullscreen_exist_class_in_progress_title));
                        imageView.setImageResource(R.drawable.ic_close_warning);
                        textView2.setText(context.getString(R.string.dialog_fullscreen_exist_class_in_progress_text));
                        materialButton.setText(context.getString(R.string.dialog_fullscreen_exist_class_in_progress_title_button));
                        break;
                    case 63:
                        textView3.setVisibility(8);
                        textView.setText(context.getString(R.string.dialog_fullscreen_class_time_extra_finished_title));
                        imageView.setImageResource(R.drawable.ic_clock_warning);
                        textView2.setText(context.getString(R.string.dialog_fullscreen_class_time_extra_finished_text));
                        materialButton.setText(context.getString(R.string.dialog_fullscreen_class_time_extra_finished_title_button));
                        break;
                }
            } else {
                q.w(context, R.string.dialog_fullscreen_validation_exit_exam_title_error, textView, imageView, R.drawable.ic_biometric_record_error);
                q.v(context, R.string.dialog_fullscreen_lack_time_finish_exam, textView2, R.string.dialog_fullscreen_validation_exit_exam_title_button_error, materialButton);
            }
            builder.setView(inflate);
            builder.setCancelable(cancelable);
            AlertDialog create = builder.create();
            materialButton.setOnClickListener(listenerOk);
            textView3.setOnClickListener(listenerCancel);
            return create;
        }

        public final AlertDialog showInformationFullDialog(Activity context, String title, String message, boolean cancelable, String titleButtonOk, String titleButtonError, Integer drawableImage, View.OnClickListener listenerOk, View.OnClickListener listenerError) {
            Intrinsics.checkNotNullParameter(context, "context");
            AlertDialog.Builder builder = new AlertDialog.Builder(context, android.R.style.Theme.Material.Light.NoActionBar.Fullscreen);
            LayoutInflater layoutInflater = context.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
            View inflate = layoutInflater.inflate(R.layout.dialog_fullscreen_layout, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_dialog_icon);
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_dialog_message);
            View findViewById = inflate.findViewById(R.id.btn_dialog_ok);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
            MaterialButton materialButton = (MaterialButton) findViewById;
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
            View inflate2 = layoutInflater.inflate(R.layout.bottom_sheet_options, (ViewGroup) null);
            bottomSheetDialog.setCancelable(cancelable);
            bottomSheetDialog.setContentView(inflate2);
            builder.setView(inflate);
            builder.setCancelable(cancelable);
            AlertDialog create = builder.create();
            if (drawableImage == null || drawableImage.intValue() == 0) {
                imageView.setImageResource(R.drawable.ic_loading);
            } else {
                imageView.setImageResource(drawableImage.intValue());
            }
            if (title == null || title.length() <= 0) {
                textView.setVisibility(4);
                textView.setText(BuildConfig.FLAVOR);
            } else {
                textView.setVisibility(0);
                textView.setText(title);
            }
            if (message == null || message.length() <= 0) {
                textView2.setVisibility(4);
                textView2.setText(BuildConfig.FLAVOR);
            } else {
                textView2.setVisibility(0);
                textView2.setText(message);
            }
            if (titleButtonOk == null || titleButtonOk.length() <= 0) {
                materialButton.setVisibility(4);
                ButtonUtil.INSTANCE.customPrimaryButton(materialButton, BuildConfig.FLAVOR);
            } else {
                materialButton.setVisibility(0);
                ButtonUtil.INSTANCE.customPrimaryButton(materialButton, titleButtonOk);
                materialButton.setOnClickListener(listenerOk != null ? listenerOk : new a4(bottomSheetDialog, 1));
            }
            if (titleButtonError != null && titleButtonError.length() > 0) {
                materialButton.setVisibility(0);
            }
            return create;
        }

        public final AlertDialog showInformationFullDialogBiometricRegistrationResponse(Activity context, EnumDialogType selectedDialog, boolean cancelable, boolean complete, View.OnClickListener listenerOk) {
            String replaceFirst$default;
            String replaceFirst$default2;
            String replaceFirst$default3;
            String replaceFirst$default4;
            String replaceFirst$default5;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(selectedDialog, "selectedDialog");
            AlertDialog.Builder builder = new AlertDialog.Builder(context, android.R.style.Theme.Material.Light.NoActionBar.Fullscreen);
            LayoutInflater layoutInflater = context.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
            View inflate = layoutInflater.inflate(R.layout.dialog_fullscreen_layout, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_dialog_icon);
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_dialog_message);
            View findViewById = inflate.findViewById(R.id.btn_dialog_ok);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
            MaterialButton materialButton = (MaterialButton) findViewById;
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.dialog_fullscreen);
            if (complete) {
                relativeLayout.setBackgroundResource(R.color.dialog_success_background);
                ButtonUtil.INSTANCE.customThirdButton(materialButton, materialButton.getText().toString(), complete);
            } else {
                relativeLayout.setBackgroundResource(R.color.dialog_error_background);
                ButtonUtil.INSTANCE.customThirdButton(materialButton, materialButton.getText().toString(), complete);
            }
            selectedDialog.name();
            switch (WhenMappings.$EnumSwitchMapping$0[selectedDialog.ordinal()]) {
                case 1:
                    q.w(context, R.string.dialog_fullscreen_left_hand_biometric_register_title_success, textView, imageView, R.drawable.ic_biometric_record_success);
                    q.v(context, R.string.dialog_fullscreen_left_hand_biometric_register_content_text_success, textView2, R.string.dialog_fullscreen_left_hand_biometric_register_title_button_success, materialButton);
                    break;
                case 2:
                    q.w(context, R.string.dialog_fullscreen_right_hand_biometric_register_title_success, textView, imageView, R.drawable.ic_biometric_record_success);
                    q.v(context, R.string.dialog_fullscreen_right_hand_biometric_register_content_text_success, textView2, R.string.dialog_fullscreen_right_hand_biometric_register_title_button_success, materialButton);
                    break;
                case 3:
                    q.w(context, R.string.dialog_fullscreen_verify_left_hand_biometric_register_title_success, textView, imageView, R.drawable.ic_biometric_record_success);
                    q.v(context, R.string.dialog_fullscreen_verify_left_hand_biometric_register_content_text_success, textView2, R.string.dialog_fullscreen_verify_left_hand_biometric_register_title_button_success, materialButton);
                    break;
                case 4:
                    q.w(context, R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_success, textView, imageView, R.drawable.ic_biometric_record_success);
                    q.v(context, R.string.dialog_fullscreen_verify_right_hand_biometric_register_content_text_success, textView2, R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success, materialButton);
                    break;
                case 5:
                    q.w(context, R.string.dialog_fullscreen_biometric_register_complete_title_success, textView, imageView, R.drawable.ic_biometric_record_registered_and_verified);
                    q.v(context, R.string.dialog_fullscreen_biometric_register_complete_content_text_success, textView2, R.string.dialog_fullscreen_biometric_register_complete_title_button_success, materialButton);
                    break;
                case 6:
                    q.w(context, R.string.dialog_fullscreen_left_hand_biometric_register_title_error, textView, imageView, R.drawable.ic_biometric_record_error);
                    q.v(context, R.string.dialog_fullscreen_left_hand_biometric_register_content_text_error, textView2, R.string.dialog_fullscreen_left_hand_biometric_register_title_button_error, materialButton);
                    break;
                case 7:
                    q.w(context, R.string.dialog_fullscreen_right_hand_biometric_register_title_error, textView, imageView, R.drawable.ic_biometric_record_error);
                    String string = context.getString(R.string.dialog_fullscreen_right_hand_biometric_register_content_text_error);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    replaceFirst$default = StringsKt__StringsJVMKt.replaceFirst$default(string, "[mano]", "izquierda", false, 4, (Object) null);
                    replaceFirst$default2 = StringsKt__StringsJVMKt.replaceFirst$default(replaceFirst$default, "[mano]", "derecha", false, 4, (Object) null);
                    textView2.setText(replaceFirst$default2);
                    materialButton.setText(context.getString(R.string.dialog_fullscreen_right_hand_biometric_register_title_button_error));
                    break;
                case 8:
                    q.w(context, R.string.dialog_fullscreen_right_hand_biometric_register_title_error, textView, imageView, R.drawable.ic_biometric_record_error);
                    String string2 = context.getString(R.string.dialog_fullscreen_right_hand_biometric_register_content_text_error);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    replaceFirst$default3 = StringsKt__StringsJVMKt.replaceFirst$default(string2, "[mano]", "derecha", false, 4, (Object) null);
                    replaceFirst$default4 = StringsKt__StringsJVMKt.replaceFirst$default(replaceFirst$default3, "[mano]", "izquierda", false, 4, (Object) null);
                    textView2.setText(replaceFirst$default4);
                    materialButton.setText(context.getString(R.string.dialog_fullscreen_right_hand_biometric_register_title_button_error));
                    break;
                case 9:
                    q.w(context, R.string.dialog_fullscreen_biometric_register_incomplete_title_error, textView, imageView, R.drawable.ic_biometric_record_error);
                    q.v(context, R.string.dialog_fullscreen_biometric_register_incomplete_content_text_error, textView2, R.string.dialog_fullscreen_biometric_register_incomplete_title_button_error, materialButton);
                    break;
                case 10:
                    q.w(context, R.string.dialog_fullscreen_validation_entry_exam_title_sucess, textView, imageView, R.drawable.ic_biometric_record_success);
                    q.v(context, R.string.dialog_fullscreen_validation_entry_exam_sucess, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 11:
                    q.w(context, R.string.dialog_fullscreen_validation_entry_exam_title_sucess, textView, imageView, R.drawable.ic_biometric_record_success);
                    q.v(context, R.string.dialog_fullscreen_validation_entry_exam_sucess_instructor, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 12:
                    q.w(context, R.string.dialog_fullscreen_validation_exit_exam_title_succes, textView, imageView, R.drawable.ic_biometric_record_success);
                    q.v(context, R.string.dialog_fullscreen_validation_exit_exam_success, textView2, R.string.dialog_fullscreen_validation_exit_exam_title_button_sucess, materialButton);
                    break;
                case 13:
                    q.w(context, R.string.dialog_fullscreen_validation_exit_exam_title_succes, textView, imageView, R.drawable.ic_biometric_record_success);
                    q.v(context, R.string.dialog_fullscreen_validation_exit_exam_instructor_succes, textView2, R.string.dialog_fullscreen_validation_exit_exam_title_button_sucess, materialButton);
                    break;
                case 14:
                    q.w(context, R.string.dialog_fullscreen_validation_exit_exam_title_error, textView, imageView, R.drawable.ic_biometric_record_error);
                    q.v(context, R.string.dialog_fullscreen_lack_time_finish_exam, textView2, R.string.dialog_fullscreen_validation_exit_exam_title_button_error, materialButton);
                    break;
                case 15:
                    q.w(context, R.string.dialog_fullscreen_validation_exit_exam_title_error, textView, imageView, R.drawable.ic_biometric_record_error);
                    q.v(context, R.string.dialog_fullscreen_exception_biometric_both, textView2, R.string.dialog_fullscreen_validation_exit_exam_title_button_error, materialButton);
                    break;
                case 16:
                    q.w(context, R.string.dialog_fullscreen_photo_register_complete_title_success, textView, imageView, R.drawable.ic_photo_record_success);
                    q.v(context, R.string.dialog_fullscreen_photo_register_complete_content_text_success, textView2, R.string.dialog_fullscreen_photo_register_complete_title_button_success, materialButton);
                    break;
                case 17:
                    q.w(context, R.string.dialog_fullscreen_validation_exit_exam_title_error, textView, imageView, R.drawable.ic_biometric_record_error);
                    q.v(context, R.string.dialog_fullscreen_exception_biometric_both_fail, textView2, R.string.dialog_fullscreen_photo_register_complete_title_button_success, materialButton);
                    break;
                case 18:
                    q.w(context, R.string.dialog_fullscreen_verify_left_hand_biometric_register_title_success, textView, imageView, R.drawable.ic_biometric_record_success);
                    String string3 = context.getString(R.string.dialog_fullscreen_message_complete_verify_left_qr);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    replaceFirst$default5 = StringsKt__StringsJVMKt.replaceFirst$default(string3, "[mano]", "derecha", false, 4, (Object) null);
                    textView2.setText(replaceFirst$default5);
                    materialButton.setText(context.getString(R.string.dialog_fullscreen_verify_left_hand_biometric_register_title_button_success));
                    break;
                case 19:
                    q.w(context, R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_success, textView, imageView, R.drawable.ic_biometric_record_success);
                    q.v(context, R.string.dialog_fullscreen_message_complete_verify_right_qr, textView2, R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success, materialButton);
                    break;
                case 20:
                    q.w(context, R.string.dialog_text_success_registered_documents_title, textView, imageView, R.drawable.ic_success_enroll);
                    textView2.setText(context.getText(R.string.dialog_text_default_success_enroll));
                    materialButton.setText(context.getString(R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success));
                    break;
                case 21:
                    q.w(context, R.string.dialog_text_success_registered_documents_title, textView, imageView, R.drawable.ic_success_enroll);
                    textView2.setText(context.getText(R.string.dialog_text_default_success_enroll));
                    materialButton.setText(context.getString(R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success));
                    break;
                case 22:
                    q.w(context, R.string.dialog_text_success_registered_documents_title, textView, imageView, R.drawable.ic_success_enroll);
                    q.v(context, R.string.dialog_text_success_registered_process, textView2, R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success, materialButton);
                    break;
                case 23:
                    q.w(context, R.string.dialog_text_perfect_title, textView, imageView, R.drawable.ic_success_enroll);
                    q.v(context, R.string.dialog_text_verify_complete_hand_go_to_home, textView2, R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success, materialButton);
                    break;
                case 24:
                    q.w(context, R.string.dialog_text_perfect_title, textView, imageView, R.drawable.ic_success_enroll);
                    q.v(context, R.string.dialog_text_verify_complete_hand, textView2, R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success, materialButton);
                    break;
                case 25:
                case 26:
                    q.w(context, R.string.dialog_text_success_registered_documents_title, textView, imageView, R.drawable.ic_success_enroll);
                    textView2.setText(context.getText(R.string.dialog_text_default_success_verify));
                    materialButton.setText(context.getString(R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success));
                    break;
                case 27:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.dialog_text_fail_registered_hand_message_2, textView2, R.string.button_title_error_endpoint, materialButton);
                    break;
                case 28:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.dialog_text_fail_registered_hand_message_1, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 29:
                case 30:
                case 31:
                case 32:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.dialog_text_default_error, textView2, R.string.button_title_error_endpoint, materialButton);
                    break;
                case 33:
                    q.w(context, R.string.dialog_text_success_welcome_app_title, textView, imageView, R.drawable.ic_welcome_app);
                    q.v(context, R.string.dialog_text_success_welcome_app_first_paragraph, textView2, R.string.dialog_text_button_fullscreen_welcome, materialButton);
                    relativeLayout.setBackgroundResource(R.color.dialog_background_welcome);
                    ButtonUtil.INSTANCE.customFiveButton(materialButton, materialButton.getText().toString());
                    break;
                case 34:
                    q.w(context, R.string.dialog_text_success_registered_documents_title, textView, imageView, R.drawable.ic_success_enroll);
                    q.v(context, R.string.dialog_check_left_hand, textView2, R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success, materialButton);
                    break;
                case 35:
                    q.w(context, R.string.dialog_text_success_registered_documents_title, textView, imageView, R.drawable.ic_success_enroll);
                    q.v(context, R.string.dialog_check_right_hand, textView2, R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success, materialButton);
                    break;
                case 36:
                    q.w(context, R.string.dialog_text_success_registered_documents_title, textView, imageView, R.drawable.ic_ok_women);
                    q.v(context, R.string.dialog_text_success_registered_documents_face, textView2, R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success, materialButton);
                    break;
                case 37:
                    q.w(context, R.string.dialog_text_success_registered_documents_title, textView, imageView, R.drawable.ic_ok_women);
                    q.v(context, R.string.dialog_text_success_registered_face, textView2, R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success, materialButton);
                    break;
                case 38:
                case 39:
                    q.w(context, R.string.dialog_fullscreen_validation_exit_exam_title_error, textView, imageView, R.drawable.ic_biometric_record_error);
                    q.v(context, R.string.dialog_fullscreen_exception_biometric_left_hand, textView2, R.string.dialog_fullscreen_validation_exit_exam_title_button_error, materialButton);
                    break;
                case 40:
                case 41:
                    q.w(context, R.string.dialog_fullscreen_validation_exit_exam_title_error, textView, imageView, R.drawable.ic_biometric_record_error);
                    q.v(context, R.string.dialog_fullscreen_exception_biometric_right_hand, textView2, R.string.dialog_fullscreen_validation_exit_exam_title_button_error, materialButton);
                    break;
                case 42:
                    q.w(context, R.string.dialog_fullscreen_validation_exit_exam_title_error, textView, imageView, R.drawable.ic_biometric_record_error);
                    q.v(context, R.string.dialog_fullscreen_fail_registered_documents_face, textView2, R.string.dialog_fullscreen_validation_exit_exam_title_button_error, materialButton);
                    break;
                case 43:
                    q.w(context, R.string.dialog_fullscreen_validation_exit_exam_title_error, textView, imageView, R.drawable.ic_biometric_record_error);
                    q.v(context, R.string.dialog_fullscreen_fail_registered_face, textView2, R.string.dialog_fullscreen_validation_exit_exam_title_button_error, materialButton);
                    break;
                case 44:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.dialog_text_fail_registered_hand_message_1, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 45:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.dialog_text_fail_registered_hand_message_1, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 46:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.dialog_text_fail_network, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 47:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.dialog_text_fail_error_app, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 48:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.dialog_text_fail_network, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 49:
                    q.w(context, R.string.title_sessions_active_other_mobile, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.message_sessions_active_other_mobile, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 50:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.message_dialog_warning_nfc_disable, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 51:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.message_dialog_warning_nfc_not_found, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 52:
                    q.w(context, R.string.title_dialog_back, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.title_dialog_message, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 53:
                    q.w(context, R.string.dialog_text_success_registered_documents_title, textView, imageView, R.drawable.ic_ok_women);
                    q.v(context, R.string.dialog_text_success_registered_face_with_out_hands, textView2, R.string.dialog_fullscreen_verify_right_hand_biometric_register_title_button_success, materialButton);
                    break;
            }
            builder.setView(inflate);
            builder.setCancelable(cancelable);
            AlertDialog create = builder.create();
            if (listenerOk != null) {
                materialButton.setOnClickListener(listenerOk);
                return create;
            }
            materialButton.setOnClickListener(new z3(create, 1));
            return create;
        }

        public final AlertDialog showInformationFullDialogError(Activity context, String title, String message, boolean cancelable, String titleButtonOk, String titleButtonError, Integer drawableImage, View.OnClickListener listenerOk, View.OnClickListener listenerError) {
            Intrinsics.checkNotNullParameter(context, "context");
            AlertDialog.Builder builder = new AlertDialog.Builder(context, android.R.style.Theme.Material.Light.NoActionBar.Fullscreen);
            LayoutInflater layoutInflater = context.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
            View inflate = layoutInflater.inflate(R.layout.dialog_fullscreen_layout, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_dialog_icon);
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_dialog_message);
            View findViewById = inflate.findViewById(R.id.btn_dialog_ok);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
            MaterialButton materialButton = (MaterialButton) findViewById;
            View findViewById2 = inflate.findViewById(R.id.tv_dialog_cancel);
            Intrinsics.checkNotNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView3 = (TextView) findViewById2;
            TextView textView4 = (TextView) inflate.findViewById(R.id.tv_dialog_error);
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context);
            View inflate2 = layoutInflater.inflate(R.layout.bottom_sheet_options, (ViewGroup) null);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.dialog_fullscreen);
            bottomSheetDialog.setCancelable(cancelable);
            bottomSheetDialog.setContentView(inflate2);
            relativeLayout.setBackgroundResource(R.color.dialog_error_background);
            textView4.setVisibility(0);
            builder.setView(inflate);
            builder.setCancelable(cancelable);
            AlertDialog create = builder.create();
            if (drawableImage == null || drawableImage.intValue() == 0) {
                imageView.setImageResource(R.drawable.ic_loading);
            } else {
                imageView.setImageResource(drawableImage.intValue());
            }
            if (title == null || title.length() == 0) {
                textView.setVisibility(4);
                textView.setText(BuildConfig.FLAVOR);
            } else {
                textView.setVisibility(0);
                textView.setText(title);
            }
            if (message == null || message.length() == 0) {
                textView2.setVisibility(4);
                textView2.setText(BuildConfig.FLAVOR);
            } else {
                textView2.setVisibility(0);
                textView2.setText(message);
            }
            if (titleButtonOk == null || titleButtonOk.length() == 0) {
                materialButton.setVisibility(4);
                ButtonUtil.INSTANCE.customThirdButton(materialButton, BuildConfig.FLAVOR, false);
            } else {
                materialButton.setVisibility(0);
                ButtonUtil.INSTANCE.customThirdButton(materialButton, titleButtonOk, false);
                materialButton.setOnClickListener(listenerOk == null ? new a4(bottomSheetDialog, 0) : listenerOk);
            }
            if (titleButtonError == null || titleButtonError.length() == 0) {
                textView4.setVisibility(8);
            } else {
                textView4.setVisibility(0);
                textView4.setPaintFlags(8 | textView4.getPaintFlags());
                textView4.setTextColor(ContextCompat.getColor(context, R.color.white));
                textView4.setText(titleButtonError);
                textView4.setOnClickListener(new z3(create, 2));
            }
            if (cancelable) {
                textView3.setVisibility(0);
                textView3.setOnClickListener(new z3(create, 3));
            }
            return create;
        }

        public final AlertDialog showInformationFullDialogPasswordRecovery(Activity context, boolean complete, String message, String code, boolean cancelable, View.OnClickListener listenerOk) {
            Intrinsics.checkNotNullParameter(context, "context");
            AlertDialog.Builder builder = new AlertDialog.Builder(context, android.R.style.Theme.Material.Light.NoActionBar.Fullscreen);
            LayoutInflater layoutInflater = context.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
            View inflate = layoutInflater.inflate(R.layout.dialog_fullscreen_layout, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_dialog_icon);
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_dialog_message);
            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_dialog_code);
            View findViewById = inflate.findViewById(R.id.btn_dialog_ok);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
            MaterialButton materialButton = (MaterialButton) findViewById;
            TextView textView4 = (TextView) inflate.findViewById(R.id.tv_dialog_error);
            TextView textView5 = (TextView) inflate.findViewById(R.id.btn_dialog_error);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.dialog_fullscreen);
            textView3.setVisibility(8);
            builder.setView(inflate);
            builder.setCancelable(cancelable);
            AlertDialog create = builder.create();
            materialButton.setVisibility(0);
            textView5.setVisibility(8);
            textView4.setVisibility(8);
            if (complete) {
                relativeLayout.setBackgroundResource(R.color.dialog_background_welcome);
                textView.setText(context.getString(R.string.dialog_fullscreen_recovery_password_title_success));
                q.w(context, R.string.dialog_fullscreen_recovery_password_content_text_success, textView2, imageView, R.drawable.ic_recovery_pass_ok);
                String string = context.getString(R.string.dialog_fullscreen_recovery_password_title_button_success);
                textView.setTypeface(null, 1);
                UIHelper.Companion companion = UIHelper.INSTANCE;
                Intrinsics.checkNotNull(textView);
                companion.setMargins(textView, 5, 20, 5, 5);
                ButtonUtil.INSTANCE.customFiveButton(materialButton, string);
            } else {
                relativeLayout.setBackgroundResource(R.color.dialog_error_background);
                textView.setText(context.getString(R.string.dialog_fullscreen_recovery_password_title_error));
                textView3.setText((code == null || code.length() == 0) ? BuildConfig.FLAVOR : code);
                textView3.setVisibility(0);
                String string2 = context.getString(R.string.dialog_fullscreen_recovery_password_content_text_error);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                if (message != null && message.length() != 0) {
                    string2 = message;
                }
                textView2.setText(string2);
                imageView.setImageResource(R.drawable.ic_fail_process);
                ButtonUtil.INSTANCE.customSixButton(materialButton, context.getString(R.string.dialog_fullscreen_recovery_password_title_button_error));
            }
            materialButton.setOnClickListener(listenerOk);
            return create;
        }

        public final AlertDialog showInformationFullDialogPermission(Activity context, String title, String message, EnumDialogType type, boolean complete, boolean cancelable, View.OnClickListener listenerOk) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(type, "type");
            AlertDialog.Builder builder = new AlertDialog.Builder(context, android.R.style.Theme.Material.Light.NoActionBar.Fullscreen);
            LayoutInflater layoutInflater = context.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
            View inflate = layoutInflater.inflate(R.layout.dialog_fullscreen_layout, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_dialog_icon);
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_dialog_message);
            View findViewById = inflate.findViewById(R.id.btn_dialog_ok);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
            MaterialButton materialButton = (MaterialButton) findViewById;
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.dialog_fullscreen);
            builder.setView(inflate);
            builder.setCancelable(cancelable);
            AlertDialog create = builder.create();
            if (title == null || title.length() <= 0) {
                textView.setText(context.getString(R.string.dialog_fullscreen_title_permission));
            } else {
                textView.setText(title);
            }
            if (message == null || message.length() <= 0) {
                textView2.setText(context.getString(R.string.dialog_text_fail_registered_hand_message_2));
            } else {
                textView2.setText(message);
            }
            imageView.setImageResource(R.drawable.ic_fail_process);
            materialButton.setText(context.getString(R.string.dialog_fullscreen_permission_title_button_success));
            materialButton.setVisibility(0);
            if (complete) {
                relativeLayout.setBackgroundResource(R.color.dialog_success_background);
            } else {
                relativeLayout.setBackgroundResource(R.color.dialog_error_background);
            }
            ButtonUtil.INSTANCE.customThirdButton(materialButton, materialButton.getText().toString(), complete);
            materialButton.setOnClickListener(listenerOk);
            return create;
        }

        public final void showToastAlert(Activity activity, String message, int bottom) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(message, "message");
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
            View inflate = layoutInflater.inflate(R.layout.toast_alert_layout, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            TextView textView = (TextView) inflate.findViewById(R.id.tv_alert_dialog);
            ((RelativeLayout) inflate.findViewById(R.id.rl_toast_alert)).setPadding(0, 0, 0, bottom);
            if (!UtilString.INSTANCE.isEmpty(message)) {
                textView.setText(message);
            }
            Toast toast = new Toast(activity);
            toast.setGravity(7, 0, 0);
            toast.setDuration(1);
            toast.setView(inflate);
            toast.show();
        }

        private Companion() {
        }

        private final AlertDialog showInformationFullDialog(Activity context, EnumDialogType selectedDialog, String code, String messageException, String message, boolean cancelable, boolean isWarning, View.OnClickListener listenerOk) {
            showDialogProgressGlobal(context, false, false, false);
            AlertDialog.Builder builder = new AlertDialog.Builder(context, android.R.style.Theme.Material.Light.NoActionBar.Fullscreen);
            LayoutInflater layoutInflater = context.getLayoutInflater();
            Intrinsics.checkNotNullExpressionValue(layoutInflater, "getLayoutInflater(...)");
            View inflate = layoutInflater.inflate(R.layout.dialog_fullscreen_layout, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_dialog);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_dialog_icon);
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_dialog_message);
            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_dialog_code);
            View findViewById = inflate.findViewById(R.id.btn_dialog_ok);
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type com.google.android.material.button.MaterialButton");
            MaterialButton materialButton = (MaterialButton) findViewById;
            textView3.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.dialog_fullscreen);
            if (!isWarning) {
                relativeLayout.setBackgroundResource(R.color.dialog_success_background);
            } else {
                relativeLayout.setBackgroundResource(R.color.dialog_error_background);
            }
            ButtonUtil.INSTANCE.customThirdButton(materialButton, materialButton.getText().toString(), !isWarning);
            int i = WhenMappings.$EnumSwitchMapping$0[selectedDialog.ordinal()];
            switch (i) {
                case 45:
                case 47:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.dialog_text_fail_registered_hand_message_2, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 46:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.dialog_text_fail_registered_hand_message_1, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                case 48:
                    q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                    q.v(context, R.string.dialog_text_fail_registered_hand_message_2, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                    break;
                default:
                    switch (i) {
                        case 54:
                            imageView.setImageResource(R.drawable.ic_fail_process);
                            textView2.setText(context.getString(R.string.dialog_fullscreen_is_emulator_rooted_developer));
                            break;
                        case 55:
                            q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                            textView2.setText(message);
                            break;
                        case 56:
                            q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                            textView2.setText(context.getString(R.string.dialog_fullscreen_whitout_biometric_ceas));
                            break;
                        case 57:
                            q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                            textView2.setText(message);
                            break;
                        case 58:
                            q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                            textView3.setText((code == null || code.length() == 0) ? BuildConfig.FLAVOR : code);
                            textView3.setVisibility(0);
                            String string = context.getString(R.string.dialog_text_fail_registered_hand_message_2);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            if (message != null && message.length() != 0) {
                                string = message;
                            }
                            textView2.setText(string);
                            break;
                        default:
                            q.w(context, R.string.dialog_text_fail_registered_hand_title, textView, imageView, R.drawable.ic_fail_process);
                            q.v(context, R.string.dialog_text_fail_registered_hand_message_2, textView2, R.string.dialog_fullscreen_validation_entry_exam_title_button_sucess, materialButton);
                            break;
                    }
            }
            EnumDialogType enumDialogType = EnumDialogType.LEFT_HAND_BIOMETRIC_RECORD_SUCCESS;
            builder.setView(inflate);
            builder.setCancelable(cancelable);
            AlertDialog create = builder.create();
            if (listenerOk != null) {
                materialButton.setOnClickListener(listenerOk);
                return create;
            }
            materialButton.setOnClickListener(new z3(create, 0));
            return create;
        }
    }
}
