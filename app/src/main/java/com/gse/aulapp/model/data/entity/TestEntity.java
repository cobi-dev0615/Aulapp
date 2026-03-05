package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.y7;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001a"}, d2 = {"Lcom/gse/aulapp/model/data/entity/TestEntity;", "Landroid/os/Parcelable;", "testID", BuildConfig.FLAVOR, "sessionID", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTestID", "()Ljava/lang/String;", "getSessionID", "component1", "component2", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TestEntity implements Parcelable {
    public static final Parcelable.Creator<TestEntity> CREATOR = new Creator();
    private final String sessionID;
    private final String testID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TestEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TestEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TestEntity(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TestEntity[] newArray(int i) {
            return new TestEntity[i];
        }
    }

    public TestEntity(String testID, String sessionID) {
        Intrinsics.checkNotNullParameter(testID, "testID");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        this.testID = testID;
        this.sessionID = sessionID;
    }

    public static /* synthetic */ TestEntity copy$default(TestEntity testEntity, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = testEntity.testID;
        }
        if ((i & 2) != 0) {
            str2 = testEntity.sessionID;
        }
        return testEntity.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTestID() {
        return this.testID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    public final TestEntity copy(String testID, String sessionID) {
        Intrinsics.checkNotNullParameter(testID, "testID");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        return new TestEntity(testID, sessionID);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestEntity)) {
            return false;
        }
        TestEntity testEntity = (TestEntity) other;
        return Intrinsics.areEqual(this.testID, testEntity.testID) && Intrinsics.areEqual(this.sessionID, testEntity.sessionID);
    }

    public int hashCode() {
        return this.sessionID.hashCode() + (this.testID.hashCode() * 31);
    }

    public String toString() {
        return y7.p("TestEntity(testID=", this.testID, ", sessionID=", this.sessionID, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.testID);
        dest.writeString(this.sessionID);
    }
}
