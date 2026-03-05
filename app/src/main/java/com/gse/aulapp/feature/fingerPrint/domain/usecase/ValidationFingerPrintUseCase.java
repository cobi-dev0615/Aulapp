package com.gse.aulapp.feature.fingerPrint.domain.usecase;

import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.feature.fingerPrint.domain.datasource.FingerIdentyDatasourceImpl;
import com.gse.aulapp.feature.fingerPrint.domain.repository.FingerPrintRepositoryImpl;
import com.gse.aulapp.feature.fingerPrint.infrastructure.repository.FingerPrintRepository;
import com.gse.aulapp.model.data.DataFailure;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.util.Either;
import com.karumi.dexter.BuildConfig;
import defpackage.FingerPrintResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/feature/fingerPrint/domain/usecase/ValidationFingerPrintUseCase;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ValidationFingerPrintUseCase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static FingerPrintRepository fingerRepository = new FingerPrintRepositoryImpl(new FingerIdentyDatasourceImpl());

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/gse/aulapp/feature/fingerPrint/domain/usecase/ValidationFingerPrintUseCase$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "fingerRepository", "Lcom/gse/aulapp/feature/fingerPrint/infrastructure/repository/FingerPrintRepository;", "validationFingerPrint", "Lcom/gse/aulapp/util/Either;", "Lcom/gse/aulapp/model/data/DataFailure;", "LFingerPrintResponse;", "fragment", "Landroidx/fragment/app/FragmentActivity;", "hand", "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "userId", BuildConfig.FLAVOR, "urlDocument", "(Landroidx/fragment/app/FragmentActivity;Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object validationFingerPrint(FragmentActivity fragmentActivity, EnumHandsAulapp enumHandsAulapp, String str, String str2, Continuation<? super Either<DataFailure, FingerPrintResponse>> continuation) {
            return ValidationFingerPrintUseCase.fingerRepository.callVerificationFingerPrint(fragmentActivity, str, enumHandsAulapp, str2, continuation);
        }

        private Companion() {
        }
    }
}
