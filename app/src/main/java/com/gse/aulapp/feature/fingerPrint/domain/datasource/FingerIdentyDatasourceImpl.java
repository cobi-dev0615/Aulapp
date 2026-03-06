package com.gse.aulapp.feature.fingerPrint.domain.datasource;

import androidx.fragment.app.FragmentActivity;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.feature.fingerPrint.infrastructure.datasource.FingerPrintDataSource;
import com.gse.aulapp.model.data.DataFailure;
import com.gse.aulapp.model.enumerate.EnumBiometricMoments;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.enumerate.EnumStatusFingerPrintBiometric;
import com.gse.aulapp.util.Either;
import com.gse.aulapp.util.FingerPrintBiometricUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.identy.Attempt;
import com.identy.IdentyError;
import com.identy.IdentyResponse;
import com.identy.IdentyResponseListener;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import defpackage.FingerPrintResponse;
import defpackage.a;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0096@¢\u0006\u0002\u0010\u0010JD\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/gse/aulapp/feature/fingerPrint/domain/datasource/FingerIdentyDatasourceImpl;", "Lcom/gse/aulapp/feature/fingerPrint/infrastructure/datasource/FingerPrintDataSource;", "<init>", "()V", "tag", BuildConfig.FLAVOR, "callVerificationFingerPrint", "Lcom/gse/aulapp/util/Either;", "Lcom/gse/aulapp/model/data/DataFailure;", "LFingerPrintResponse;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "userId", "hand", "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "urlDocument", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callIdentyFinger", "isEnroll", "Lcom/gse/aulapp/model/enumerate/EnumBiometricMoments;", "pathDocument", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;Lcom/gse/aulapp/model/enumerate/EnumBiometricMoments;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateHandKey", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FingerIdentyDatasourceImpl implements FingerPrintDataSource {
    private final String tag = "FingerIdentyDatasourceImpl";

    private final Object callIdentyFinger(final FragmentActivity fragmentActivity, String str, final EnumHandsAulapp enumHandsAulapp, EnumBiometricMoments enumBiometricMoments, final String str2, Continuation<? super Either<DataFailure, FingerPrintResponse>> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        FingerPrintBiometricUtil.INSTANCE.identyFingerPrint(fragmentActivity, str, enumHandsAulapp, new IdentyResponseListener() { // from class: com.gse.aulapp.feature.fingerPrint.domain.datasource.FingerIdentyDatasourceImpl$callIdentyFinger$2$1
            @Override // com.identy.IdentyResponseListener
            public void onAttempt(Hand p0, int p1, Map<Finger, ? extends Attempt> p2) {
            }

            @Override // com.identy.IdentyResponseListener
            public void onErrorResponse(IdentyError error, HashSet<String> p1) {
                LogSendUtil.INSTANCE.setLog(fragmentActivity, q.i("Finger error: ", error != null ? error.getMessage() : null), null, false);
                if (error == null) {
                    Continuation<Either<DataFailure, FingerPrintResponse>> continuation2 = safeContinuation;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m35constructorimpl(new Either.Left(new DataFailure(0, BuildConfig.FLAVOR, 1, null))));
                } else {
                    Continuation<Either<DataFailure, FingerPrintResponse>> continuation3 = safeContinuation;
                    String message = error.getMessage();
                    Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
                    continuation3.resumeWith(Result.m35constructorimpl(new Either.Left(new DataFailure(0, message, 1, null))));
                }
            }

            @Override // com.identy.IdentyResponseListener
            public void onResponse(IdentyResponse identyResponse, HashSet<String> p1) {
                String validateHandKey;
                JSONObject json;
                String unused;
                try {
                    JSONObject jSONObject = new JSONObject(String.valueOf((identyResponse == null || (json = identyResponse.toJson()) == null) ? null : json.get("verify_result")));
                    validateHandKey = FingerIdentyDatasourceImpl.this.validateHandKey(enumHandsAulapp);
                    if (Boolean.parseBoolean(jSONObject.get(validateHandKey).toString())) {
                        safeContinuation.resumeWith(Result.m35constructorimpl(new Either.Right(new FingerPrintResponse(EnumStatusFingerPrintBiometric.ON_SUCCESS, str2, enumHandsAulapp))));
                        return;
                    }
                    LogSendUtil.INSTANCE.setLog(fragmentActivity, "Fail verify hands: " + enumHandsAulapp.name() + " response: " + jSONObject + "}", null, false);
                    Continuation<Either<DataFailure, FingerPrintResponse>> continuation2 = safeContinuation;
                    Result.Companion companion = Result.INSTANCE;
                    continuation2.resumeWith(Result.m35constructorimpl(new Either.Left(new DataFailure(0, "Error en la verificación", 1, null))));
                } catch (Exception e) {
                    unused = FingerIdentyDatasourceImpl.this.tag;
                    e.getMessage();
                    LogSendUtil.INSTANCE.setLog(fragmentActivity, a.m("Exception in converter response: ", e.getMessage(), "}"), "callIdentyFinger onResponse", true);
                }
            }
        }, enumBiometricMoments, str2 == null ? BuildConfig.FLAVOR : str2);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String validateHandKey(EnumHandsAulapp hand) {
        return hand == EnumHandsAulapp.LEFT ? "left_4f" : "right_4f";
    }

    @Override // com.gse.aulapp.feature.fingerPrint.infrastructure.datasource.FingerPrintDataSource
    public Object callVerificationFingerPrint(FragmentActivity fragmentActivity, String str, EnumHandsAulapp enumHandsAulapp, String str2, Continuation<? super Either<DataFailure, FingerPrintResponse>> continuation) {
        return callIdentyFinger(fragmentActivity, str, enumHandsAulapp, EnumBiometricMoments.VERIFY, str2, continuation);
    }
}
