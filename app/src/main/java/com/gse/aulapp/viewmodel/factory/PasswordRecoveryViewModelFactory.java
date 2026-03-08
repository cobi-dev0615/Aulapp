package com.gse.aulapp.viewmodel.factory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.gse.aulapp.model.repository.PasswordRecoveryRepository;
import com.gse.aulapp.viewmodel.PasswordRecoverViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u0006\u001a\u0002H\u0007\"\b\b\u0000\u0010\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00070\nH\u0016¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/gse/aulapp/viewmodel/factory/PasswordRecoveryViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "passwordRecoveryRepository", "Lcom/gse/aulapp/model/repository/PasswordRecoveryRepository;", "<init>", "(Lcom/gse/aulapp/model/repository/PasswordRecoveryRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PasswordRecoveryViewModelFactory implements ViewModelProvider.Factory {
    private final PasswordRecoveryRepository passwordRecoveryRepository;

    public PasswordRecoveryViewModelFactory(PasswordRecoveryRepository passwordRecoveryRepository) {
        Intrinsics.checkNotNullParameter(passwordRecoveryRepository, "passwordRecoveryRepository");
        this.passwordRecoveryRepository = passwordRecoveryRepository;
    }

    @SuppressWarnings("unchecked")
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) new PasswordRecoverViewModel(this.passwordRecoveryRepository);
    }
}
