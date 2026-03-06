package com.gse.aulapp.lib.encryption_gse.encryptJwe.model;

import androidx.annotation.Keep;
import co.ceduladigital.sdk.y7;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/gse/aulapp/lib/encryption_gse/encryptJwe/model/ResultEncryptKeys;", BuildConfig.FLAVOR, "<init>", "()V", "DataResult", "Failure", "Lcom/gse/aulapp/lib/encryption_gse/encryptJwe/model/ResultEncryptKeys$DataResult;", "Lcom/gse/aulapp/lib/encryption_gse/encryptJwe/model/ResultEncryptKeys$Failure;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ResultEncryptKeys {

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/gse/aulapp/lib/encryption_gse/encryptJwe/model/ResultEncryptKeys$DataResult;", "Lcom/gse/aulapp/lib/encryption_gse/encryptJwe/model/ResultEncryptKeys;", "publicKey", BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPublicKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DataResult extends ResultEncryptKeys {
        private final String publicKey;
        private final String value;

        public DataResult() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ DataResult copy$default(DataResult dataResult, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dataResult.publicKey;
            }
            if ((i & 2) != 0) {
                str2 = dataResult.value;
            }
            return dataResult.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPublicKey() {
            return this.publicKey;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final DataResult copy(String publicKey, String value) {
            return new DataResult(publicKey, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataResult)) {
                return false;
            }
            DataResult dataResult = (DataResult) other;
            return Intrinsics.areEqual(this.publicKey, dataResult.publicKey) && Intrinsics.areEqual(this.value, dataResult.value);
        }

        public int hashCode() {
            String str = this.publicKey;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.value;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return y7.p("DataResult(publicKey=", this.publicKey, ", value=", this.value, ")");
        }

        public /* synthetic */ DataResult(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public DataResult(String str, String str2) {
            super(null);
            this.publicKey = str;
            this.value = str2;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/gse/aulapp/lib/encryption_gse/encryptJwe/model/ResultEncryptKeys$Failure;", "Lcom/gse/aulapp/lib/encryption_gse/encryptJwe/model/ResultEncryptKeys;", "e", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/Throwable;)V", "getE", "()Ljava/lang/Throwable;", "component1", "copy", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Failure extends ResultEncryptKeys {
        private final Throwable e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Failure(Throwable e) {
            super(null);
            Intrinsics.checkNotNullParameter(e, "e");
            this.e = e;
        }

        public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = failure.e;
            }
            return failure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getE() {
            return this.e;
        }

        public final Failure copy(Throwable e) {
            Intrinsics.checkNotNullParameter(e, "e");
            return new Failure(e);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.e, ((Failure) other).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            return "Failure(e=" + this.e + ")";
        }
    }

    public /* synthetic */ ResultEncryptKeys(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ResultEncryptKeys() {
    }
}
