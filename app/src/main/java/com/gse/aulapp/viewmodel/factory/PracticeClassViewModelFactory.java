package com.gse.aulapp.viewmodel.factory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.gse.aulapp.model.repository.GpsRepository;
import com.gse.aulapp.model.repository.PracticeClassRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/gse/aulapp/viewmodel/factory/PracticeClassViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "practiceClassRepository", "Lcom/gse/aulapp/model/repository/PracticeClassRepository;", "sessionRepository", "Lcom/gse/aulapp/model/repository/SessionRepository;", "gpsRepository", "Lcom/gse/aulapp/model/repository/GpsRepository;", "<init>", "(Lcom/gse/aulapp/model/repository/PracticeClassRepository;Lcom/gse/aulapp/model/repository/SessionRepository;Lcom/gse/aulapp/model/repository/GpsRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PracticeClassViewModelFactory implements ViewModelProvider.Factory {
    private final GpsRepository gpsRepository;
    private final PracticeClassRepository practiceClassRepository;
    private final SessionRepository sessionRepository;

    public PracticeClassViewModelFactory(PracticeClassRepository practiceClassRepository, SessionRepository sessionRepository, GpsRepository gpsRepository) {
        Intrinsics.checkNotNullParameter(practiceClassRepository, "practiceClassRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(gpsRepository, "gpsRepository");
        this.practiceClassRepository = practiceClassRepository;
        this.sessionRepository = sessionRepository;
        this.gpsRepository = gpsRepository;
    }

    @SuppressWarnings("unchecked")
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) new PracticeClassViewModel(this.practiceClassRepository, this.sessionRepository, this.gpsRepository);
    }
}
