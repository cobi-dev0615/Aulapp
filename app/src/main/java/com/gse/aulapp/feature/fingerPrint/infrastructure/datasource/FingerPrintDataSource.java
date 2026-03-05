package com.gse.aulapp.feature.fingerPrint.infrastructure.datasource;

import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.model.data.DataFailure;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.util.Either;
import com.karumi.dexter.BuildConfig;
import defpackage.FingerPrintResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH¦@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/gse/aulapp/feature/fingerPrint/infrastructure/datasource/FingerPrintDataSource;", BuildConfig.FLAVOR, "callVerificationFingerPrint", "Lcom/gse/aulapp/util/Either;", "Lcom/gse/aulapp/model/data/DataFailure;", "LFingerPrintResponse;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "userId", BuildConfig.FLAVOR, "hand", "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "urlDocument", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FingerPrintDataSource {
    Object callVerificationFingerPrint(FragmentActivity fragmentActivity, String str, EnumHandsAulapp enumHandsAulapp, String str2, Continuation<? super Either<DataFailure, FingerPrintResponse>> continuation);
}
