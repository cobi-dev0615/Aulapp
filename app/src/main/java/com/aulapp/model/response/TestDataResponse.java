package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/gse/aulapp/model/response/TestDataResponse;", "Landroid/os/Parcelable;", "test", "Lcom/gse/aulapp/model/response/TestResponse;", "config", "Lcom/gse/aulapp/model/response/ConfigResponse;", "<init>", "(Lcom/gse/aulapp/model/response/TestResponse;Lcom/gse/aulapp/model/response/ConfigResponse;)V", "getTest", "()Lcom/gse/aulapp/model/response/TestResponse;", "setTest", "(Lcom/gse/aulapp/model/response/TestResponse;)V", "getConfig", "()Lcom/gse/aulapp/model/response/ConfigResponse;", "setConfig", "(Lcom/gse/aulapp/model/response/ConfigResponse;)V", "component1", "component2", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TestDataResponse implements Parcelable {
    public static final Parcelable.Creator<TestDataResponse> CREATOR = new Creator();

    @SerializedName("config")
    private ConfigResponse config;

    @SerializedName("test")
    private TestResponse test;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TestDataResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TestDataResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TestDataResponse(parcel.readInt() == 0 ? null : TestResponse.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ConfigResponse.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TestDataResponse[] newArray(int i) {
            return new TestDataResponse[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TestDataResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TestDataResponse copy$default(TestDataResponse testDataResponse, TestResponse testResponse, ConfigResponse configResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            testResponse = testDataResponse.test;
        }
        if ((i & 2) != 0) {
            configResponse = testDataResponse.config;
        }
        return testDataResponse.copy(testResponse, configResponse);
    }

    /* renamed from: component1, reason: from getter */
    public final TestResponse getTest() {
        return this.test;
    }

    /* renamed from: component2, reason: from getter */
    public final ConfigResponse getConfig() {
        return this.config;
    }

    public final TestDataResponse copy(TestResponse test, ConfigResponse config) {
        return new TestDataResponse(test, config);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestDataResponse)) {
            return false;
        }
        TestDataResponse testDataResponse = (TestDataResponse) other;
        return Intrinsics.areEqual(this.test, testDataResponse.test) && Intrinsics.areEqual(this.config, testDataResponse.config);
    }

    public final ConfigResponse getConfig() {
        return this.config;
    }

    public final TestResponse getTest() {
        return this.test;
    }

    public int hashCode() {
        TestResponse testResponse = this.test;
        int hashCode = (testResponse == null ? 0 : testResponse.hashCode()) * 31;
        ConfigResponse configResponse = this.config;
        return hashCode + (configResponse != null ? configResponse.hashCode() : 0);
    }

    public final void setConfig(ConfigResponse configResponse) {
        this.config = configResponse;
    }

    public final void setTest(TestResponse testResponse) {
        this.test = testResponse;
    }

    public String toString() {
        return "TestDataResponse(test=" + this.test + ", config=" + this.config + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        TestResponse testResponse = this.test;
        if (testResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            testResponse.writeToParcel(dest, flags);
        }
        ConfigResponse configResponse = this.config;
        if (configResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            configResponse.writeToParcel(dest, flags);
        }
    }

    public TestDataResponse(TestResponse testResponse, ConfigResponse configResponse) {
        this.test = testResponse;
        this.config = configResponse;
    }

    public /* synthetic */ TestDataResponse(TestResponse testResponse, ConfigResponse configResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TestResponse(null, null, 3, null) : testResponse, (i & 2) != 0 ? new ConfigResponse(null, null, null, 7, null) : configResponse);
    }
}
