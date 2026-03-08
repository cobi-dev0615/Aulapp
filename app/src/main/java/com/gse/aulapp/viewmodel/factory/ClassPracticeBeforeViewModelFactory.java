package com.gse.aulapp.viewmodel.factory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.gse.aulapp.model.repository.BiometrixRepository;
import com.gse.aulapp.model.repository.GetEnrollmentInformationRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0017¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/gse/aulapp/viewmodel/factory/ClassPracticeBeforeViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "repository", "Lcom/gse/aulapp/model/repository/SessionRepository;", "enrollmentInformationRepository", "Lcom/gse/aulapp/model/repository/GetEnrollmentInformationRepository;", "biometrixRepository", "Lcom/gse/aulapp/model/repository/BiometrixRepository;", "<init>", "(Lcom/gse/aulapp/model/repository/SessionRepository;Lcom/gse/aulapp/model/repository/GetEnrollmentInformationRepository;Lcom/gse/aulapp/model/repository/BiometrixRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModelFactory implements ViewModelProvider.Factory {
    private final BiometrixRepository biometrixRepository;
    private final GetEnrollmentInformationRepository enrollmentInformationRepository;
    private final SessionRepository repository;

    public ClassPracticeBeforeViewModelFactory(SessionRepository repository, GetEnrollmentInformationRepository enrollmentInformationRepository, BiometrixRepository biometrixRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(enrollmentInformationRepository, "enrollmentInformationRepository");
        Intrinsics.checkNotNullParameter(biometrixRepository, "biometrixRepository");
        this.repository = repository;
        this.enrollmentInformationRepository = enrollmentInformationRepository;
        this.biometrixRepository = biometrixRepository;
    }

    @SuppressWarnings("unchecked")
    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        return (T) new ClassPracticeBeforeViewModel(this.repository, this.enrollmentInformationRepository, this.biometrixRepository);
    }
}
