package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import co.ceduladigital.sdk.q;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010 R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010 R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lcom/gse/aulapp/model/request/PracticeExamRequest;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/request/QuestionsPracticeExamRequest;", "questions", "status", "Lcom/gse/aulapp/model/request/SummaryPracticeExamRequest;", "summary", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/gse/aulapp/model/request/SummaryPracticeExamRequest;)V", "Landroid/os/Parcel;", "dest", BuildConfig.FLAVOR, "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "Ljava/util/List;", "getQuestions", "()Ljava/util/List;", "setQuestions", "(Ljava/util/List;)V", "getStatus", "setStatus", "Lcom/gse/aulapp/model/request/SummaryPracticeExamRequest;", "getSummary", "()Lcom/gse/aulapp/model/request/SummaryPracticeExamRequest;", "setSummary", "(Lcom/gse/aulapp/model/request/SummaryPracticeExamRequest;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class PracticeExamRequest implements Parcelable {
    public static final Parcelable.Creator<PracticeExamRequest> CREATOR = new Creator();

    @SerializedName("_id")
    private String id;

    @SerializedName("questions")
    private List<QuestionsPracticeExamRequest> questions;

    @SerializedName("status")
    private String status;

    @SerializedName("summary")
    private SummaryPracticeExamRequest summary;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PracticeExamRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PracticeExamRequest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = q.b(QuestionsPracticeExamRequest.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new PracticeExamRequest(readString, arrayList, parcel.readString(), parcel.readInt() != 0 ? SummaryPracticeExamRequest.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PracticeExamRequest[] newArray(int i) {
            return new PracticeExamRequest[i];
        }
    }

    public PracticeExamRequest(String str, List<QuestionsPracticeExamRequest> list, String str2, SummaryPracticeExamRequest summaryPracticeExamRequest) {
        this.id = str;
        this.questions = list;
        this.status = str2;
        this.summary = summaryPracticeExamRequest;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PracticeExamRequest)) {
            return false;
        }
        PracticeExamRequest practiceExamRequest = (PracticeExamRequest) other;
        return Intrinsics.areEqual(this.id, practiceExamRequest.id) && Intrinsics.areEqual(this.questions, practiceExamRequest.questions) && Intrinsics.areEqual(this.status, practiceExamRequest.status) && Intrinsics.areEqual(this.summary, practiceExamRequest.summary);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<QuestionsPracticeExamRequest> list = this.questions;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.status;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SummaryPracticeExamRequest summaryPracticeExamRequest = this.summary;
        return hashCode3 + (summaryPracticeExamRequest != null ? summaryPracticeExamRequest.hashCode() : 0);
    }

    public String toString() {
        return "PracticeExamRequest(id=" + this.id + ", questions=" + this.questions + ", status=" + this.status + ", summary=" + this.summary + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        List<QuestionsPracticeExamRequest> list = this.questions;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<QuestionsPracticeExamRequest> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.status);
        SummaryPracticeExamRequest summaryPracticeExamRequest = this.summary;
        if (summaryPracticeExamRequest == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            summaryPracticeExamRequest.writeToParcel(dest, flags);
        }
    }
}
