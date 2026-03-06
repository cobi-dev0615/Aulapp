package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.gse.aulapp.databinding.FragmentFirstLoginBinding;
import com.gse.aulapp.feature.core.util.RandomControllerUtil;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.CenterDto;
import com.gse.aulapp.model.dto.LoginObject;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumFinger;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.gse.aulapp.model.repository.BiometrixRepository;
import com.gse.aulapp.model.repository.ChangeCenterRepository;
import com.gse.aulapp.model.repository.LoginRepository;
import com.gse.aulapp.model.repository.PasswordRecoveryRepository;
import com.gse.aulapp.model.repository.RefreshTokenRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.request.BiometrixRequest;
import com.gse.aulapp.model.request.LoginRequest;
import com.gse.aulapp.model.request.RefreshTokenRequest;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.ErrorResult;
import com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.NetworkUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.TemplatesUtil;
import com.gse.aulapp.viewmodel.FirstLoginViewModel;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJJ\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u00112\b\u00103\u001a\u0004\u0018\u00010\u00112\b\u00104\u001a\u0004\u0018\u00010\u00112\f\u00105\u001a\b\u0012\u0004\u0012\u00020706J\u001a\u00108\u001a\u0002092\u0006\u0010,\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\u001a\u0010=\u001a\u0002092\u0006\u0010,\u001a\u00020:2\b\u0010>\u001a\u0004\u0018\u00010?H\u0002J2\u0010@\u001a\u0002012 \u0010A\u001a\u001c\u0012\u0004\u0012\u00020C\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00110B\u0018\u00010B2\u0006\u0010E\u001a\u00020CH\u0002J\u0016\u0010F\u001a\u0002092\u0006\u0010,\u001a\u00020:2\u0006\u00102\u001a\u00020\u0011J0\u0010G\u001a\u0002092\u0006\u0010H\u001a\u00020\u00112\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\b\u00103\u001a\u0004\u0018\u00010\u00112\u0006\u0010I\u001a\u00020-H\u0002Jd\u0010J\u001a\u00020+2\u0006\u00100\u001a\u0002012\f\u00105\u001a\b\u0012\u0004\u0012\u000207062\u0006\u0010K\u001a\u00020\u00112\u0006\u0010I\u001a\u00020-2\u0006\u0010>\u001a\u00020?2\u0006\u0010.\u001a\u00020/2\b\u00103\u001a\u0004\u0018\u00010\u00112\u0006\u0010L\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u00010\u00112\b\u00102\u001a\u0004\u0018\u00010\u0011H\u0002J\u0016\u0010M\u001a\u00020+2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u000207J\u0016\u0010Q\u001a\u00020+2\u0006\u0010I\u001a\u00020-2\u0006\u0010R\u001a\u00020SJ\u001a\u0010T\u001a\u00020U2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00112\b\u0010V\u001a\u0004\u0018\u00010\u0011JF\u0010W\u001a\u0004\u0018\u00010\u00112\u0006\u0010,\u001a\u00020:2\b\u0010X\u001a\u0004\u0018\u00010\u00112 \u0010Y\u001a\u001c\u0012\u0004\u0012\u00020C\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00110B\u0018\u00010B2\u0006\u0010Z\u001a\u00020CH\u0002J\u000e\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^J\u0012\u0010_\u001a\u0004\u0018\u00010\u00112\u0006\u0010]\u001a\u00020^H\u0002J\u0016\u0010`\u001a\u00020C2\u0006\u0010a\u001a\u0002012\u0006\u0010b\u001a\u00020CR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00160\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a¨\u0006c"}, d2 = {"Lcom/gse/aulapp/viewmodel/FirstLoginViewModel;", "Landroidx/lifecycle/ViewModel;", "loginRepository", "Lcom/gse/aulapp/model/repository/LoginRepository;", "tokenRefreshRepository", "Lcom/gse/aulapp/model/repository/RefreshTokenRepository;", "passwordRecoveryRepository", "Lcom/gse/aulapp/model/repository/PasswordRecoveryRepository;", "changeCenterRepository", "Lcom/gse/aulapp/model/repository/ChangeCenterRepository;", "biometrixRepository", "Lcom/gse/aulapp/model/repository/BiometrixRepository;", "sessionRepository", "Lcom/gse/aulapp/model/repository/SessionRepository;", "<init>", "(Lcom/gse/aulapp/model/repository/LoginRepository;Lcom/gse/aulapp/model/repository/RefreshTokenRepository;Lcom/gse/aulapp/model/repository/PasswordRecoveryRepository;Lcom/gse/aulapp/model/repository/ChangeCenterRepository;Lcom/gse/aulapp/model/repository/BiometrixRepository;Lcom/gse/aulapp/model/repository/SessionRepository;)V", "tag", BuildConfig.FLAVOR, "alertDialog", "Landroid/app/AlertDialog;", "_message", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/gse/aulapp/model/data/statusControl/Status;", "message", "Lkotlinx/coroutines/flow/SharedFlow;", "getMessage", "()Lkotlinx/coroutines/flow/SharedFlow;", "_messagePasswordRecovery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "messagePasswordRecovery", "Lkotlinx/coroutines/flow/StateFlow;", "getMessagePasswordRecovery", "()Lkotlinx/coroutines/flow/StateFlow;", "_messageRefreshToken", "messageRefreshToken", "getMessageRefreshToken", "_messageRefreshTokenCEA", "messageRefreshTokenCEA", "getMessageRefreshTokenCEA", "_messageBiometrix", "messageBiometrix", "getMessageBiometrix", "validateLogin", BuildConfig.FLAVOR, "context", "Landroid/app/Activity;", "binding", "Lcom/gse/aulapp/databinding/FragmentFirstLoginBinding;", "firstLogin", BuildConfig.FLAVOR, "email", "numberDocument", "selectedCEA", "centerListCEA", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/CenterDto;", "refreshToken", "Lkotlinx/coroutines/Job;", "Landroid/content/Context;", "tokenRefreshRequest", "Lcom/gse/aulapp/model/request/RefreshTokenRequest;", "login", "loginRequest", "Lcom/gse/aulapp/model/request/LoginRequest;", "validateFinger", "map", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "Lcom/gse/aulapp/model/enumerate/EnumFinger;", "enum", "recoverPassword", "refreshTokenCEA", "ceaSelected", "activity", "validateFirstLogin", "ceaBox", "userOrDocumentBox", "selectItem", "autoComplete", "Landroid/widget/AutoCompleteTextView;", "itemSelected", "initBiometrix", "request", "Lcom/gse/aulapp/model/request/BiometrixRequest;", "getErrorEndpoint", "Lcom/gse/aulapp/model/response/ErrorResponse;", "code", "callSaveTemplate", "userId", "backendMap", "hand", "setUserInfo", "Lcom/gse/aulapp/receptions/feature/core/model/dto/UserInfoDto;", "response", "Lcom/gse/aulapp/model/dto/LoginObject;", "validatePath", "reportHand", "fullEnrollment", "handValidate", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FirstLoginViewModel extends ViewModel {
    private final MutableSharedFlow<Status> _message;
    private final MutableSharedFlow<Status> _messageBiometrix;
    private final MutableStateFlow<Status> _messagePasswordRecovery;
    private final MutableSharedFlow<Status> _messageRefreshToken;
    private final MutableSharedFlow<Status> _messageRefreshTokenCEA;
    private AlertDialog alertDialog;
    private final BiometrixRepository biometrixRepository;
    private ChangeCenterRepository changeCenterRepository;
    private LoginRepository loginRepository;
    private final SharedFlow<Status> message;
    private final SharedFlow<Status> messageBiometrix;
    private final StateFlow<Status> messagePasswordRecovery;
    private final SharedFlow<Status> messageRefreshToken;
    private final SharedFlow<Status> messageRefreshTokenCEA;
    private PasswordRecoveryRepository passwordRecoveryRepository;
    private final SessionRepository sessionRepository;
    private final String tag;
    private RefreshTokenRepository tokenRefreshRepository;

    public FirstLoginViewModel(LoginRepository loginRepository, RefreshTokenRepository tokenRefreshRepository, PasswordRecoveryRepository passwordRecoveryRepository, ChangeCenterRepository changeCenterRepository, BiometrixRepository biometrixRepository, SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(tokenRefreshRepository, "tokenRefreshRepository");
        Intrinsics.checkNotNullParameter(passwordRecoveryRepository, "passwordRecoveryRepository");
        Intrinsics.checkNotNullParameter(changeCenterRepository, "changeCenterRepository");
        Intrinsics.checkNotNullParameter(biometrixRepository, "biometrixRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.loginRepository = loginRepository;
        this.tokenRefreshRepository = tokenRefreshRepository;
        this.passwordRecoveryRepository = passwordRecoveryRepository;
        this.changeCenterRepository = changeCenterRepository;
        this.biometrixRepository = biometrixRepository;
        this.sessionRepository = sessionRepository;
        this.tag = "FirstLoginViewModel";
        MutableSharedFlow<Status> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow(0, 1, (BufferOverflow) null);
        this._message = MutableSharedFlow$default;
        this.message = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableStateFlow<Status> MutableStateFlow = StateFlowKt.MutableStateFlow(Status.Empty.INSTANCE);
        this._messagePasswordRecovery = MutableStateFlow;
        this.messagePasswordRecovery = MutableStateFlow;
        MutableSharedFlow<Status> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow(0, 1, (BufferOverflow) null);
        this._messageRefreshToken = MutableSharedFlow$default2;
        this.messageRefreshToken = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<Status> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow(0, 1, (BufferOverflow) null);
        this._messageRefreshTokenCEA = MutableSharedFlow$default3;
        this.messageRefreshTokenCEA = FlowKt.asSharedFlow(MutableSharedFlow$default3);
        MutableSharedFlow<Status> MutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow(0, 1, (BufferOverflow) null);
        this._messageBiometrix = MutableSharedFlow$default4;
        this.messageBiometrix = FlowKt.asSharedFlow(MutableSharedFlow$default4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String callSaveTemplate(Context context, String userId, Map<EnumHandsAulapp, Map<EnumFinger, String>> backendMap, EnumHandsAulapp hand) {
        if (backendMap != null && !backendMap.isEmpty()) {
            Map<EnumFinger, String> map = backendMap.get(hand);
            Integer valueOf = map != null ? Integer.valueOf(map.size()) : null;
            Intrinsics.checkNotNull(valueOf);
            if (valueOf.intValue() > 0) {
                return TemplatesUtil.INSTANCE.saveTemplateFromBackend(context, backendMap, userId, hand);
            }
        }
        return null;
    }

    private final Job login(Context context, LoginRequest loginRequest) {
        Job launch$default;
        launch$default = BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new FirstLoginViewModel$login$1(this, loginRequest, context, null));
        return launch$default;
    }

    private final Job refreshToken(Context context, RefreshTokenRequest tokenRefreshRequest) {
        Job launch$default;
        launch$default = BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new FirstLoginViewModel$refreshToken$1(this, tokenRefreshRequest, context, null));
        return launch$default;
    }

    private final Job refreshTokenCEA(String ceaSelected, List<CenterDto> centerListCEA, String numberDocument, Activity activity) {
        Job launch$default;
        launch$default = BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new FirstLoginViewModel$refreshTokenCEA$1(this, ceaSelected, centerListCEA, numberDocument, activity, null));
        return launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean validateFinger(Map<EnumHandsAulapp, Map<EnumFinger, String>> map, EnumHandsAulapp r5) {
        Map<EnumFinger, String> map2;
        Map<EnumFinger, String> map3;
        Map<EnumFinger, String> map4;
        Map<EnumFinger, String> map5;
        return (map == null || (map2 = map.get(r5)) == null || !map2.containsKey(EnumFinger.LITTLE) || map == null || (map3 = map.get(r5)) == null || !map3.containsKey(EnumFinger.RING) || map == null || (map4 = map.get(r5)) == null || !map4.containsKey(EnumFinger.INDEX) || map == null || (map5 = map.get(r5)) == null || !map5.containsKey(EnumFinger.MIDDLE)) ? false : true;
    }

    private final void validateFirstLogin(boolean firstLogin, List<CenterDto> centerListCEA, String ceaBox, Activity activity, LoginRequest loginRequest, FragmentFirstLoginBinding binding, String numberDocument, String userOrDocumentBox, String selectedCEA, String email) {
        boolean equalsResult;
        boolean equalsResult2;
        CenterDto cea = PreferenceUtil.INSTANCE.getCEA(activity);
        if (firstLogin) {
            if (centerListCEA.isEmpty() || centerListCEA.size() <= 1) {
                login(activity, loginRequest);
                return;
            } else {
                refreshTokenCEA(ceaBox, centerListCEA, userOrDocumentBox, activity);
                return;
            }
        }
        if (firstLogin) {
            throw new NoWhenBranchMatchedException();
        }
        equalsResult = StringsKt.equals(numberDocument, userOrDocumentBox, false);
        if (!equalsResult) {
            refreshToken(activity, new RefreshTokenRequest(BuildConfig.FLAVOR));
            return;
        }
        if (ceaBox.length() > 0) {
            equalsResult2 = StringsKt.equals(selectedCEA, cea != null ? cea.getName() : null, false);
            if (equalsResult2) {
                refreshToken(activity, new RefreshTokenRequest(String.valueOf(email)));
                return;
            } else {
                refreshToken(activity, new RefreshTokenRequest(BuildConfig.FLAVOR));
                return;
            }
        }
        centerListCEA.size();
        if (centerListCEA.size() > 1) {
            refreshToken(activity, new RefreshTokenRequest(BuildConfig.FLAVOR));
        } else {
            refreshToken(activity, new RefreshTokenRequest(String.valueOf(email)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateLogin$lambda$0(FirstLoginViewModel this$0, Activity context, boolean z, List centerListCEA, String ceaBox, LoginRequest loginRequest, FragmentFirstLoginBinding binding, String str, String userOrDocumentBox, String str2, String str3, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(centerListCEA, "$centerListCEA");
        Intrinsics.checkNotNullParameter(ceaBox, "$ceaBox");
        Intrinsics.checkNotNullParameter(loginRequest, "$loginRequest");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(userOrDocumentBox, "$userOrDocumentBox");
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
            this$0.validateFirstLogin(z, centerListCEA, ceaBox, context, loginRequest, binding, str, userOrDocumentBox, str2, str3);
        }
    }

    private final String validatePath(LoginObject response) {
        String pathDocumentHandLeft = response.getPathDocumentHandLeft();
        return (pathDocumentHandLeft == null || pathDocumentHandLeft.length() == 0) ? response.getPathDocumentHandRight() : response.getPathDocumentHandLeft();
    }

    public final ErrorResponse getErrorEndpoint(String message, String code) {
        return new ErrorResponse(null, new ErrorResult(false, message, code), null, 5, null);
    }

    public final SharedFlow<Status> getMessage() {
        return this.message;
    }

    public final SharedFlow<Status> getMessageBiometrix() {
        return this.messageBiometrix;
    }

    public final StateFlow<Status> getMessagePasswordRecovery() {
        return this.messagePasswordRecovery;
    }

    public final SharedFlow<Status> getMessageRefreshToken() {
        return this.messageRefreshToken;
    }

    public final SharedFlow<Status> getMessageRefreshTokenCEA() {
        return this.messageRefreshTokenCEA;
    }

    public final void initBiometrix(Activity activity, BiometrixRequest request) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(request, "request");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new FirstLoginViewModel$initBiometrix$1(this, activity, request, null));
    }

    public final Job recoverPassword(Context context, String email) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(email, "email");
        launch$default = BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new FirstLoginViewModel$recoverPassword$1(this, email, context, null));
        return launch$default;
    }

    public final EnumHandsAulapp reportHand(boolean fullEnrollment, EnumHandsAulapp handValidate) {
        Intrinsics.checkNotNullParameter(handValidate, "handValidate");
        return fullEnrollment ? handValidate == EnumHandsAulapp.BOTH ? RandomControllerUtil.INSTANCE.randomHandsVerify() : handValidate : EnumHandsAulapp.LEFT;
    }

    public final void selectItem(AutoCompleteTextView autoComplete, CenterDto itemSelected) {
        Intrinsics.checkNotNullParameter(autoComplete, "autoComplete");
        Intrinsics.checkNotNullParameter(itemSelected, "itemSelected");
        autoComplete.setText(itemSelected.getName());
    }

    public final UserInfoDto setUserInfo(LoginObject response) {
        Intrinsics.checkNotNullParameter(response, "response");
        String validatePath = validatePath(response);
        EnumHandsAulapp validateExistsHands = TemplatesUtil.INSTANCE.validateExistsHands(validatePath);
        String fullName = response.getFullName();
        String str = fullName == null ? BuildConfig.FLAVOR : fullName;
        EnumUserProfile role = response.getRole();
        String email = response.getEmail();
        String str2 = email == null ? BuildConfig.FLAVOR : email;
        String documentNumber = response.getDocumentNumber();
        String str3 = documentNumber == null ? BuildConfig.FLAVOR : documentNumber;
        String docType = response.getDocType();
        String str4 = docType == null ? BuildConfig.FLAVOR : docType;
        Boolean fullEnrollment = response.getFullEnrollment();
        Boolean bool = Boolean.TRUE;
        boolean areEqual = Intrinsics.areEqual(fullEnrollment, bool);
        String str5 = validatePath == null ? BuildConfig.FLAVOR : validatePath;
        EnumHandsAulapp reportHand = reportHand(Intrinsics.areEqual(response.getFullEnrollment(), bool), validateExistsHands);
        String userId = response.getUserId();
        return new UserInfoDto(userId == null ? BuildConfig.FLAVOR : userId, str3, role, str, str2, str4, areEqual, str5, null, reportHand, null, 1280, null);
    }

    public final void validateLogin(final Activity context, final FragmentFirstLoginBinding binding, final boolean firstLogin, final String email, final String numberDocument, final String selectedCEA, final List<CenterDto> centerListCEA) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(centerListCEA, "centerListCEA");
        String valueOf = String.valueOf(binding.tietTextInputUserPassword.getText());
        final String valueOf2 = String.valueOf(binding.tietTextInputUserLogin.getText());
        final String obj = binding.includeDropdownCea.actv.getText().toString();
        final LoginRequest loginRequest = new LoginRequest(valueOf2, valueOf);
        if (NetworkUtil.INSTANCE.isNetworkAvailable(context)) {
            validateFirstLogin(firstLogin, centerListCEA, obj, context, loginRequest, binding, numberDocument, valueOf2, selectedCEA, email);
            return;
        }
        AlertDialog showErrorDialog$default = DialogUtil.Companion.showErrorDialog$default(DialogUtil.INSTANCE, context, EnumDialogType.DIALOG_TYPE_OFFLINE_ERROR, null, null, null, false, new View.OnClickListener() { // from class: co.ceduladigital.sdk.r5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FirstLoginViewModel.validateLogin$lambda$0(FirstLoginViewModel.this, context, firstLogin, centerListCEA, obj, loginRequest, binding, numberDocument, valueOf2, selectedCEA, email, view);
            }
        }, 12, null);
        this.alertDialog = showErrorDialog$default;
        if (showErrorDialog$default == null) {
            Intrinsics.throwUninitializedPropertyAccessException("alertDialog");
            showErrorDialog$default = null;
        }
        showErrorDialog$default.show();
    }
}
