package com.gse.aulapp.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import co.ceduladigital.sdk.b3;
import com.gse.aulapp.R;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.util.DialogUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/ControllerFinishClassOrExamUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ControllerFinishClassOrExamUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static String TAG;
    private static AlertDialog dialog;
    private static SessionRepository sessionRepository;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJI\u0010\u0014\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\u0017J\u0015\u0010$\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\u0017J\u001d\u0010%\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b%\u0010&J?\u0010)\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/gse/aulapp/util/ControllerFinishClassOrExamUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "sessionID", "Landroidx/navigation/NavController;", "findNavController", "Landroidx/navigation/NavDirections;", "navDirections", BuildConfig.FLAVOR, "showPendingFinish", "(Landroid/content/Context;Ljava/lang/String;Landroidx/navigation/NavController;Landroidx/navigation/NavDirections;)V", BuildConfig.FLAVOR, "pass", BuildConfig.FLAVOR, "approved", "noApproved", "showDialogPassExam", "(Landroid/content/Context;ZIILjava/lang/String;Landroidx/navigation/NavController;Landroidx/navigation/NavDirections;)V", "updateIsFinishedState", "(Ljava/lang/String;)V", "Lcom/gse/aulapp/model/repository/SessionRepository;", "repository", "finishedPracticeClass", "(Landroid/content/Context;Landroidx/navigation/NavController;Ljava/lang/String;Lcom/gse/aulapp/model/repository/SessionRepository;Landroidx/navigation/NavDirections;)V", "saveSessionIdByTimeService", "(Landroid/content/Context;Ljava/lang/String;)V", "isPending", "updateIsPendingState", "(Ljava/lang/String;Ljava/lang/String;)V", "sendPracticeExamSync", "(Landroid/content/Context;Ljava/lang/String;Landroidx/navigation/NavController;Lcom/gse/aulapp/model/repository/SessionRepository;Landroidx/navigation/NavDirections;)V", "updateDateEndClass", "updateIsPendingSync", "navigationTo", "(Landroidx/navigation/NavController;Landroidx/navigation/NavDirections;)V", "Lcom/gse/aulapp/model/dto/SessionDto;", "sessionReceived", "selectTypeClassOrExam", "(Landroid/content/Context;Ljava/lang/String;Landroidx/navigation/NavController;Lcom/gse/aulapp/model/dto/SessionDto;Lcom/gse/aulapp/model/repository/SessionRepository;Landroidx/navigation/NavDirections;)V", "TAG", "Ljava/lang/String;", "Landroid/app/AlertDialog;", "dialog", "Landroid/app/AlertDialog;", "sessionRepository", "Lcom/gse/aulapp/model/repository/SessionRepository;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumClassType.values().length];
                try {
                    iArr[EnumClassType.PRACTICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumClassType.PRACTICE_EXAM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void finishedPracticeClass(Context context, NavController findNavController, String sessionID, SessionRepository repository, NavDirections navDirections) {
            ControllerFinishClassOrExamUtil.sessionRepository = repository;
            updateIsFinishedState(sessionID);
            saveSessionIdByTimeService(context, BuildConfig.FLAVOR);
            updateIsPendingState("1", sessionID);
            updateDateEndClass(sessionID);
            findNavController.navigate(navDirections);
        }

        private final void saveSessionIdByTimeService(Context context, String sessionID) {
            PreferenceUtil.INSTANCE.saveSessionIdByTimeService(context, sessionID);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void showDialogPassExam(Context context, boolean pass, int approved, int noApproved, String sessionID, NavController findNavController, NavDirections navDirections) {
            String t;
            String string;
            int i;
            String str;
            AlertDialog alertDialog = null;
            String valueOf = String.valueOf(context != null ? context.getText(R.string.dialog_fullscreen_pass_exam) : null);
            if (pass) {
                t = StringsKt.t(valueOf, "[PASS]", BuildConfig.FLAVOR);
                Intrinsics.checkNotNull(context);
                string = context.getString(R.string.dialog_fullscreen_pass_exam_approved);
                i = 7;
            } else {
                t = StringsKt.t(valueOf, "[PASS]", " NO");
                Intrinsics.checkNotNull(context);
                string = context.getString(R.string.dialog_fullscreen_pass_exam_not_approved);
                i = 6;
            }
            int i2 = i;
            String t2 = StringsKt.t(StringsKt.t(t, "[APPROVED]", String.valueOf(approved)), "[NOAPPROVED]", String.valueOf(noApproved));
            DialogUtil.Companion companion = DialogUtil.INSTANCE;
            Activity activity = (Activity) context;
            if (string == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleContent");
                str = null;
            } else {
                str = string;
            }
            ControllerFinishClassOrExamUtil.dialog = companion.showInformationDialog(activity, t2, str, activity.getString(R.string.id_continue), i2, false, new b3(sessionID, findNavController, navDirections, 1), null);
            AlertDialog alertDialog2 = ControllerFinishClassOrExamUtil.dialog;
            if (alertDialog2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            } else {
                alertDialog = alertDialog2;
            }
            alertDialog.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showDialogPassExam$lambda$1(String sessionID, NavController findNavController, NavDirections navDirections, View view) {
            Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
            Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
            Intrinsics.checkNotNullParameter(navDirections, "$navDirections");
            Companion companion = ControllerFinishClassOrExamUtil.INSTANCE;
            companion.updateIsFinishedState(sessionID);
            companion.navigationTo(findNavController, navDirections);
            AlertDialog alertDialog = ControllerFinishClassOrExamUtil.dialog;
            if (alertDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                alertDialog = null;
            }
            alertDialog.dismiss();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void showPendingFinish(Context context, String sessionID, NavController findNavController, NavDirections navDirections) {
            DialogUtil.Companion companion = DialogUtil.INSTANCE;
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
            ControllerFinishClassOrExamUtil.dialog = companion.showInformationDialogValidationExam((Activity) context, EnumDialogType.PENDING_EXAM_FOR_FINISH, false, true, new b3(sessionID, findNavController, navDirections, 0), null);
            AlertDialog alertDialog = ControllerFinishClassOrExamUtil.dialog;
            if (alertDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                alertDialog = null;
            }
            alertDialog.show();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showPendingFinish$lambda$0(String sessionID, NavController findNavController, NavDirections navDirections, View view) {
            Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
            Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
            Intrinsics.checkNotNullParameter(navDirections, "$navDirections");
            Companion companion = ControllerFinishClassOrExamUtil.INSTANCE;
            companion.updateIsFinishedState(sessionID);
            companion.navigationTo(findNavController, navDirections);
            AlertDialog alertDialog = ControllerFinishClassOrExamUtil.dialog;
            if (alertDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                alertDialog = null;
            }
            alertDialog.dismiss();
        }

        private final void updateIsFinishedState(String sessionID) {
            BuildersKt.launch(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new ControllerFinishClassOrExamUtil$Companion$updateIsFinishedState$1(sessionID, null));
        }

        private final void updateIsPendingState(String isPending, String sessionID) {
            BuildersKt.launch(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new ControllerFinishClassOrExamUtil$Companion$updateIsPendingState$1(isPending, sessionID, null));
        }

        public final void navigationTo(NavController findNavController, NavDirections navDirections) {
            Intrinsics.checkNotNullParameter(findNavController, "findNavController");
            Intrinsics.checkNotNullParameter(navDirections, "navDirections");
            findNavController.navigate(navDirections);
        }

        public final void selectTypeClassOrExam(Context context, String sessionID, NavController findNavController, SessionDto sessionReceived, SessionRepository repository, NavDirections navDirections) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionID, "sessionID");
            Intrinsics.checkNotNullParameter(findNavController, "findNavController");
            Intrinsics.checkNotNullParameter(repository, "repository");
            Intrinsics.checkNotNullParameter(navDirections, "navDirections");
            int i = WhenMappings.$EnumSwitchMapping$0[EnumClassType.INSTANCE.getEnumByName(sessionReceived != null ? sessionReceived.getType() : null).ordinal()];
            if (i == 1) {
                finishedPracticeClass(context, findNavController, sessionID, repository, navDirections);
            } else if (i != 2) {
                String unused = ControllerFinishClassOrExamUtil.TAG;
            } else {
                sendPracticeExamSync(context, sessionID, findNavController, repository, navDirections);
            }
        }

        public final void sendPracticeExamSync(Context context, String sessionID, NavController findNavController, SessionRepository repository, NavDirections navDirections) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionID, "sessionID");
            Intrinsics.checkNotNullParameter(findNavController, "findNavController");
            Intrinsics.checkNotNullParameter(repository, "repository");
            Intrinsics.checkNotNullParameter(navDirections, "navDirections");
            ControllerFinishClassOrExamUtil.sessionRepository = repository;
            BuildersKt.launch(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new ControllerFinishClassOrExamUtil$Companion$sendPracticeExamSync$1(context, sessionID, repository, findNavController, navDirections, null));
        }

        public final void updateDateEndClass(String sessionID) {
            Intrinsics.checkNotNullParameter(sessionID, "sessionID");
            BuildersKt.launch(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new ControllerFinishClassOrExamUtil$Companion$updateDateEndClass$1(sessionID, null));
        }

        public final void updateIsPendingSync(String sessionID) {
            Intrinsics.checkNotNullParameter(sessionID, "sessionID");
            BuildersKt.launch(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new ControllerFinishClassOrExamUtil$Companion$updateIsPendingSync$1(sessionID, null));
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        String name = companion.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        TAG = name;
    }
}
