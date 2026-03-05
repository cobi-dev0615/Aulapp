package com.gse.aulapp.viewmodel.factory;

import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import com.gse.aulapp.model.repository.BiometrixRepository;
import com.gse.aulapp.model.repository.ChangeCenterRepository;
import com.gse.aulapp.model.repository.LoginRepository;
import com.gse.aulapp.model.repository.PasswordRecoveryRepository;
import com.gse.aulapp.model.repository.RefreshTokenRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.viewmodel.FirstLoginViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0010\u001a\u0002H\u0011\"\b\b\u0000\u0010\u0011*\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00110\u0014H\u0016¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/gse/aulapp/viewmodel/factory/FirstLoginViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "loginRepository", "Lcom/gse/aulapp/model/repository/LoginRepository;", "tokenRefreshRepository", "Lcom/gse/aulapp/model/repository/RefreshTokenRepository;", "passwordRecoveryRepository", "Lcom/gse/aulapp/model/repository/PasswordRecoveryRepository;", "changeCenterRepository", "Lcom/gse/aulapp/model/repository/ChangeCenterRepository;", "biometrixRepository", "Lcom/gse/aulapp/model/repository/BiometrixRepository;", "sessionRepository", "Lcom/gse/aulapp/model/repository/SessionRepository;", "<init>", "(Lcom/gse/aulapp/model/repository/LoginRepository;Lcom/gse/aulapp/model/repository/RefreshTokenRepository;Lcom/gse/aulapp/model/repository/PasswordRecoveryRepository;Lcom/gse/aulapp/model/repository/ChangeCenterRepository;Lcom/gse/aulapp/model/repository/BiometrixRepository;Lcom/gse/aulapp/model/repository/SessionRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FirstLoginViewModelFactory implements ViewModelProvider.Factory {
    private final BiometrixRepository biometrixRepository;
    private final ChangeCenterRepository changeCenterRepository;
    private final LoginRepository loginRepository;
    private final PasswordRecoveryRepository passwordRecoveryRepository;
    private final SessionRepository sessionRepository;
    private final RefreshTokenRepository tokenRefreshRepository;

    public FirstLoginViewModelFactory(LoginRepository loginRepository, RefreshTokenRepository tokenRefreshRepository, PasswordRecoveryRepository passwordRecoveryRepository, ChangeCenterRepository changeCenterRepository, BiometrixRepository biometrixRepository, SessionRepository sessionRepository) {
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
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new FirstLoginViewModel(this.loginRepository, this.tokenRefreshRepository, this.passwordRecoveryRepository, this.changeCenterRepository, this.biometrixRepository, this.sessionRepository);
    }
}
