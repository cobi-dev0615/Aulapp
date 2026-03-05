package com.gse.aulapp.model.data.statusControl;

import com.gse.aulapp.model.enumerate.EnumApiStatus;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0002\u0016\u0017B7\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/gse/aulapp/model/data/statusControl/ApiResult;", "T", BuildConfig.FLAVOR, "statusCode", BuildConfig.FLAVOR, "status", "Lcom/gse/aulapp/model/enumerate/EnumApiStatus;", "data", "message", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/Integer;Lcom/gse/aulapp/model/enumerate/EnumApiStatus;Ljava/lang/Object;Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStatus", "()Lcom/gse/aulapp/model/enumerate/EnumApiStatus;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "Success", "Failure", "Lcom/gse/aulapp/model/data/statusControl/ApiResult$Failure;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult$Success;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ApiResult<T> {
    private final T data;
    private final String message;
    private final EnumApiStatus status;
    private final Integer statusCode;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/gse/aulapp/model/data/statusControl/ApiResult$Failure;", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "_statusCode", BuildConfig.FLAVOR, "exception", "<init>", "(ILjava/lang/Throwable;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "I", "get_statusCode", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure extends ApiResult {
        private final int _statusCode;
        private final Throwable exception;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(int i, Throwable exception) {
            super(Integer.valueOf(i), EnumApiStatus.ERROR, null, exception.getMessage(), 4, null);
            Intrinsics.checkNotNullParameter(exception, "exception");
            this._statusCode = i;
            this.exception = exception;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return this._statusCode == failure._statusCode && Intrinsics.areEqual(this.exception, failure.exception);
        }

        public int hashCode() {
            return this.exception.hashCode() + (Integer.hashCode(this._statusCode) * 31);
        }

        public String toString() {
            return "Failure(_statusCode=" + this._statusCode + ", exception=" + this.exception + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/gse/aulapp/model/data/statusControl/ApiResult$Success;", "R", "Lcom/gse/aulapp/model/data/statusControl/ApiResult;", BuildConfig.FLAVOR, "_statusCode", "_data", "<init>", "(ILjava/lang/Object;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", "()I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "I", "get_statusCode", "Ljava/lang/Object;", "get_data", "()Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Success<R> extends ApiResult<R> {
        private final R _data;
        private final int _statusCode;

        public Success(int i, R r) {
            super(Integer.valueOf(i), EnumApiStatus.SUCCESS, r, null, 8, null);
            this._statusCode = i;
            this._data = r;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return this._statusCode == success._statusCode && Intrinsics.areEqual(this._data, success._data);
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this._statusCode) * 31;
            R r = this._data;
            return hashCode + (r == null ? 0 : r.hashCode());
        }

        public String toString() {
            return "Success(_statusCode=" + this._statusCode + ", _data=" + this._data + ")";
        }
    }

    public /* synthetic */ ApiResult(Integer num, EnumApiStatus enumApiStatus, Object obj, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, enumApiStatus, obj, str);
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final EnumApiStatus getStatus() {
        return this.status;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    private ApiResult(Integer num, EnumApiStatus enumApiStatus, T t, String str) {
        this.statusCode = num;
        this.status = enumApiStatus;
        this.data = t;
        this.message = str;
    }

    public /* synthetic */ ApiResult(Integer num, EnumApiStatus enumApiStatus, Object obj, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 500 : num, (i & 2) != 0 ? EnumApiStatus.ERROR : enumApiStatus, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : str, null);
    }
}
