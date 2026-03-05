package com.gse.aulapp.viewmodel.factory;

import androidx.view.ViewModel;
import androidx.view.ViewModelProvider;
import com.gse.aulapp.model.repository.HistoricRecordPermissionsChangeRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.viewmodel.HomeViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fH\u0016¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/gse/aulapp/viewmodel/factory/HomeViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "sessionRepository", "Lcom/gse/aulapp/model/repository/SessionRepository;", "sessionHistoricRecordPermissionsChangeRepository", "Lcom/gse/aulapp/model/repository/HistoricRecordPermissionsChangeRepository;", "<init>", "(Lcom/gse/aulapp/model/repository/SessionRepository;Lcom/gse/aulapp/model/repository/HistoricRecordPermissionsChangeRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomeViewModelFactory implements ViewModelProvider.Factory {
    private final HistoricRecordPermissionsChangeRepository sessionHistoricRecordPermissionsChangeRepository;
    private final SessionRepository sessionRepository;

    public HomeViewModelFactory(SessionRepository sessionRepository, HistoricRecordPermissionsChangeRepository sessionHistoricRecordPermissionsChangeRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(sessionHistoricRecordPermissionsChangeRepository, "sessionHistoricRecordPermissionsChangeRepository");
        this.sessionRepository = sessionRepository;
        this.sessionHistoricRecordPermissionsChangeRepository = sessionHistoricRecordPermissionsChangeRepository;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return new HomeViewModel(this.sessionRepository, this.sessionHistoricRecordPermissionsChangeRepository);
    }
}
