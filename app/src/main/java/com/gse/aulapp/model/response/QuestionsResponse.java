package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J=\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001dHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001dR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006)"}, d2 = {"Lcom/gse/aulapp/model/response/QuestionsResponse;", "Landroid/os/Parcelable;", "level", BuildConfig.FLAVOR, "answer", "description", "itemID", "Id", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLevel", "()Ljava/lang/String;", "setLevel", "(Ljava/lang/String;)V", "getAnswer", "setAnswer", "getDescription", "setDescription", "getItemID", "setItemID", "getId", "setId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class QuestionsResponse implements Parcelable {
    public static final Parcelable.Creator<QuestionsResponse> CREATOR = new Creator();

    @SerializedName("_id")
    private String Id;

    @SerializedName("answer")
    private String answer;

    @SerializedName("description")
    private String description;

    @SerializedName("itemID")
    private String itemID;

    @SerializedName("level")
    private String level;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QuestionsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionsResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QuestionsResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionsResponse[] newArray(int i) {
            return new QuestionsResponse[i];
        }
    }

    public QuestionsResponse(String str, String answer, String description, String itemID, String Id) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(itemID, "itemID");
        Intrinsics.checkNotNullParameter(Id, "Id");
        this.level = str;
        this.answer = answer;
        this.description = description;
        this.itemID = itemID;
        this.Id = Id;
    }

    public static /* synthetic */ QuestionsResponse copy$default(QuestionsResponse questionsResponse, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionsResponse.level;
        }
        if ((i & 2) != 0) {
            str2 = questionsResponse.answer;
        }
        if ((i & 4) != 0) {
            str3 = questionsResponse.description;
        }
        if ((i & 8) != 0) {
            str4 = questionsResponse.itemID;
        }
        if ((i & 16) != 0) {
            str5 = questionsResponse.Id;
        }
        String str6 = str5;
        String str7 = str3;
        return questionsResponse.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getItemID() {
        return this.itemID;
    }

    /* renamed from: component5, reason: from getter */
    public final String getId() {
        return this.Id;
    }

    public final QuestionsResponse copy(String level, String answer, String description, String itemID, String Id) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(itemID, "itemID");
        Intrinsics.checkNotNullParameter(Id, "Id");
        return new QuestionsResponse(level, answer, description, itemID, Id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionsResponse)) {
            return false;
        }
        QuestionsResponse questionsResponse = (QuestionsResponse) other;
        return Intrinsics.areEqual(this.level, questionsResponse.level) && Intrinsics.areEqual(this.answer, questionsResponse.answer) && Intrinsics.areEqual(this.description, questionsResponse.description) && Intrinsics.areEqual(this.itemID, questionsResponse.itemID) && Intrinsics.areEqual(this.Id, questionsResponse.Id);
    }

    public int hashCode() {
        String str = this.level;
        return this.Id.hashCode() + x5.d(this.itemID, x5.d(this.description, x5.d(this.answer, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31);
    }

    public final void setAnswer(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.answer = str;
    }

    public final void setDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.Id = str;
    }

    public final void setItemID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.itemID = str;
    }

    public final void setLevel(String str) {
        this.level = str;
    }

    public String toString() {
        String str = this.level;
        String str2 = this.answer;
        String str3 = this.description;
        String str4 = this.itemID;
        String str5 = this.Id;
        StringBuilder r = x5.r("QuestionsResponse(level=", str, ", answer=", str2, ", description=");
        x5.z(r, str3, ", itemID=", str4, ", Id=");
        return q.j(str5, ")", r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.level);
        dest.writeString(this.answer);
        dest.writeString(this.description);
        dest.writeString(this.itemID);
        dest.writeString(this.Id);
    }
}
