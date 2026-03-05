package com.gse.aulapp.model.response;

import co.ceduladigital.sdk.q;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/gse/aulapp/model/response/ErrorResult;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "success", BuildConfig.FLAVOR, "message", "code", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getSuccess", "()Z", "Ljava/lang/String;", "getMessage", "getCode", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ErrorResult {
    private final String code;
    private final String message;
    private final boolean success;

    public ErrorResult(boolean z, String str, String str2) {
        this.success = z;
        this.message = str;
        this.code = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResult)) {
            return false;
        }
        ErrorResult errorResult = (ErrorResult) other;
        return this.success == errorResult.success && Intrinsics.areEqual(this.message, errorResult.message) && Intrinsics.areEqual(this.code, errorResult.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.success) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.code;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        boolean z = this.success;
        String str = this.message;
        String str2 = this.code;
        StringBuilder sb = new StringBuilder("ErrorResult(success=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str);
        sb.append(", code=");
        return q.j(str2, ")", sb);
    }
}
