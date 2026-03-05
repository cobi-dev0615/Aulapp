package com.gse.aulapp.feature.fingerPrint.domain.repository;

import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.feature.fingerPrint.infrastructure.datasource.FingerPrintDataSource;
import com.gse.aulapp.feature.fingerPrint.infrastructure.repository.FingerPrintRepository;
import com.gse.aulapp.model.data.DataFailure;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.util.Either;
import com.karumi.dexter.BuildConfig;
import defpackage.FingerPrintResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/gse/aulapp/feature/fingerPrint/domain/repository/FingerPrintRepositoryImpl;", "Lcom/gse/aulapp/feature/fingerPrint/infrastructure/repository/FingerPrintRepository;", "fingerData", "Lcom/gse/aulapp/feature/fingerPrint/infrastructure/datasource/FingerPrintDataSource;", "<init>", "(Lcom/gse/aulapp/feature/fingerPrint/infrastructure/datasource/FingerPrintDataSource;)V", "callVerificationFingerPrint", "Lcom/gse/aulapp/util/Either;", "Lcom/gse/aulapp/model/data/DataFailure;", "LFingerPrintResponse;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "userId", BuildConfig.FLAVOR, "hand", "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "urlDocument", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FingerPrintRepositoryImpl implements FingerPrintRepository {
    private final FingerPrintDataSource fingerData;

    public FingerPrintRepositoryImpl(FingerPrintDataSource fingerData) {
        Intrinsics.checkNotNullParameter(fingerData, "fingerData");
        this.fingerData = fingerData;
    }

    @Override // com.gse.aulapp.feature.fingerPrint.infrastructure.repository.FingerPrintRepository
    public Object callVerificationFingerPrint(FragmentActivity fragmentActivity, String str, EnumHandsAulapp enumHandsAulapp, String str2, Continuation<? super Either<DataFailure, FingerPrintResponse>> continuation) {
        return this.fingerData.callVerificationFingerPrint(fragmentActivity, str, enumHandsAulapp, str2, continuation);
    }
}
