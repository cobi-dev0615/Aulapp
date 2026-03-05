package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u001a\u0004\b'\u0010$\"\u0004\b(\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010\u0017\"\u0004\b-\u0010.R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/gse/aulapp/model/request/SummaryPracticeExamRequest;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "canceledTest", "Lcom/gse/aulapp/model/request/LevelSummary;", "higth", "medium", "lower", BuildConfig.FLAVOR, "status", BuildConfig.FLAVOR, "score", "<init>", "(Ljava/lang/Boolean;Lcom/gse/aulapp/model/request/LevelSummary;Lcom/gse/aulapp/model/request/LevelSummary;Lcom/gse/aulapp/model/request/LevelSummary;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/os/Parcel;", "dest", "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getCanceledTest", "()Ljava/lang/Boolean;", "setCanceledTest", "(Ljava/lang/Boolean;)V", "Lcom/gse/aulapp/model/request/LevelSummary;", "getHigth", "()Lcom/gse/aulapp/model/request/LevelSummary;", "setHigth", "(Lcom/gse/aulapp/model/request/LevelSummary;)V", "getMedium", "setMedium", "getLower", "setLower", "Ljava/lang/String;", "getStatus", "setStatus", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getScore", "()Ljava/lang/Integer;", "setScore", "(Ljava/lang/Integer;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SummaryPracticeExamRequest implements Parcelable {
    public static final Parcelable.Creator<SummaryPracticeExamRequest> CREATOR = new Creator();

    @SerializedName("canceledTest")
    private Boolean canceledTest;

    @SerializedName("higth")
    private LevelSummary higth;

    @SerializedName("lower")
    private LevelSummary lower;

    @SerializedName("medium")
    private LevelSummary medium;

    @SerializedName("score")
    private Integer score;

    @SerializedName("status")
    private String status;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SummaryPracticeExamRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SummaryPracticeExamRequest createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SummaryPracticeExamRequest(valueOf, parcel.readInt() == 0 ? null : LevelSummary.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LevelSummary.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LevelSummary.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SummaryPracticeExamRequest[] newArray(int i) {
            return new SummaryPracticeExamRequest[i];
        }
    }

    public SummaryPracticeExamRequest(Boolean bool, LevelSummary levelSummary, LevelSummary levelSummary2, LevelSummary levelSummary3, String str, Integer num) {
        this.canceledTest = bool;
        this.higth = levelSummary;
        this.medium = levelSummary2;
        this.lower = levelSummary3;
        this.status = str;
        this.score = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryPracticeExamRequest)) {
            return false;
        }
        SummaryPracticeExamRequest summaryPracticeExamRequest = (SummaryPracticeExamRequest) other;
        return Intrinsics.areEqual(this.canceledTest, summaryPracticeExamRequest.canceledTest) && Intrinsics.areEqual(this.higth, summaryPracticeExamRequest.higth) && Intrinsics.areEqual(this.medium, summaryPracticeExamRequest.medium) && Intrinsics.areEqual(this.lower, summaryPracticeExamRequest.lower) && Intrinsics.areEqual(this.status, summaryPracticeExamRequest.status) && Intrinsics.areEqual(this.score, summaryPracticeExamRequest.score);
    }

    public int hashCode() {
        Boolean bool = this.canceledTest;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        LevelSummary levelSummary = this.higth;
        int hashCode2 = (hashCode + (levelSummary == null ? 0 : levelSummary.hashCode())) * 31;
        LevelSummary levelSummary2 = this.medium;
        int hashCode3 = (hashCode2 + (levelSummary2 == null ? 0 : levelSummary2.hashCode())) * 31;
        LevelSummary levelSummary3 = this.lower;
        int hashCode4 = (hashCode3 + (levelSummary3 == null ? 0 : levelSummary3.hashCode())) * 31;
        String str = this.status;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.score;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "SummaryPracticeExamRequest(canceledTest=" + this.canceledTest + ", higth=" + this.higth + ", medium=" + this.medium + ", lower=" + this.lower + ", status=" + this.status + ", score=" + this.score + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.canceledTest;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
        LevelSummary levelSummary = this.higth;
        if (levelSummary == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            levelSummary.writeToParcel(dest, flags);
        }
        LevelSummary levelSummary2 = this.medium;
        if (levelSummary2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            levelSummary2.writeToParcel(dest, flags);
        }
        LevelSummary levelSummary3 = this.lower;
        if (levelSummary3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            levelSummary3.writeToParcel(dest, flags);
        }
        dest.writeString(this.status);
        Integer num = this.score;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
    }
}
