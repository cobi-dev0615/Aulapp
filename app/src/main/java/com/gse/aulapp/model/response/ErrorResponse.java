package com.gse.aulapp.model.response;

import co.ceduladigital.sdk.q;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/gse/aulapp/model/response/ErrorResponse;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "statusCode", "Lcom/gse/aulapp/model/response/ErrorResult;", "result", BuildConfig.FLAVOR, "url", "<init>", "(Ljava/lang/Integer;Lcom/gse/aulapp/model/response/ErrorResult;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getStatusCode", "()Ljava/lang/Integer;", "Lcom/gse/aulapp/model/response/ErrorResult;", "getResult", "()Lcom/gse/aulapp/model/response/ErrorResult;", "Ljava/lang/String;", "getUrl", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ErrorResponse {
    private final ErrorResult result;
    private final Integer statusCode;
    private final String url;

    public ErrorResponse(Integer num, ErrorResult result, String str) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.statusCode = num;
        this.result = result;
        this.url = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return Intrinsics.areEqual(this.statusCode, errorResponse.statusCode) && Intrinsics.areEqual(this.result, errorResponse.result) && Intrinsics.areEqual(this.url, errorResponse.url);
    }

    public final ErrorResult getResult() {
        return this.result;
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int hashCode = (this.result.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        String str = this.url;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.statusCode;
        ErrorResult errorResult = this.result;
        String str = this.url;
        StringBuilder sb = new StringBuilder("ErrorResponse(statusCode=");
        sb.append(num);
        sb.append(", result=");
        sb.append(errorResult);
        sb.append(", url=");
        return q.j(str, ")", sb);
    }

    public /* synthetic */ ErrorResponse(Integer num, ErrorResult errorResult, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, errorResult, (i & 4) != 0 ? null : str);
    }
}
