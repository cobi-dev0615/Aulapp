package com.gse.aulapp.model.repository;

import android.content.Context;
import com.gse.aulapp.model.data.statusControl.ApiResult;
import com.gse.aulapp.model.request.BiometrixRequest;
import com.gse.aulapp.model.response.BiometrixUrlActionResponse;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/gse/aulapp/model/repository/BiometrixRepository;", BuildConfig.FLAVOR, "<init>", "()V", "getUrlBiometrix", "Lkotlinx/coroutines/flow/Flow;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "Lcom/gse/aulapp/model/response/BiometrixUrlActionResponse;", "context", "Landroid/content/Context;", "request", "Lcom/gse/aulapp/model/request/BiometrixRequest;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BiometrixRepository {
    public final Flow<ApiResult<BiometrixUrlActionResponse>> getUrlBiometrix(Context context, BiometrixRequest request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        return FlowKt.flowOn(FlowKt.flow(new BiometrixRepository$getUrlBiometrix$1(context, request, null)), Dispatchers.getIO());
    }
}
