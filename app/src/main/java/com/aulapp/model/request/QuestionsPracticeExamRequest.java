package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006#"}, d2 = {"Lcom/gse/aulapp/model/request/QuestionsPracticeExamRequest;", "Landroid/os/Parcelable;", "level", BuildConfig.FLAVOR, "answer", "description", "itemID", "_id", "coordinates", "Lcom/gse/aulapp/model/request/CoordinatePracticeExamRequest;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/request/CoordinatePracticeExamRequest;)V", "getLevel", "()Ljava/lang/String;", "setLevel", "(Ljava/lang/String;)V", "getAnswer", "setAnswer", "getDescription", "setDescription", "getItemID", "setItemID", "get_id", "set_id", "getCoordinates", "()Lcom/gse/aulapp/model/request/CoordinatePracticeExamRequest;", "setCoordinates", "(Lcom/gse/aulapp/model/request/CoordinatePracticeExamRequest;)V", "describeContents", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class QuestionsPracticeExamRequest implements Parcelable {
    public static final Parcelable.Creator<QuestionsPracticeExamRequest> CREATOR = new Creator();

    @SerializedName("_id")
    private String _id;

    @SerializedName("answer")
    private String answer;

    @SerializedName("coordinates")
    private CoordinatePracticeExamRequest coordinates;

    @SerializedName("description")
    private String description;

    @SerializedName("itemID")
    private String itemID;

    @SerializedName("level")
    private String level;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QuestionsPracticeExamRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionsPracticeExamRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QuestionsPracticeExamRequest(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : CoordinatePracticeExamRequest.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionsPracticeExamRequest[] newArray(int i) {
            return new QuestionsPracticeExamRequest[i];
        }
    }

    public QuestionsPracticeExamRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final CoordinatePracticeExamRequest getCoordinates() {
        return this.coordinates;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getItemID() {
        return this.itemID;
    }

    public final String getLevel() {
        return this.level;
    }

    public final String get_id() {
        return this._id;
    }

    public final void setAnswer(String str) {
        this.answer = str;
    }

    public final void setCoordinates(CoordinatePracticeExamRequest coordinatePracticeExamRequest) {
        this.coordinates = coordinatePracticeExamRequest;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setItemID(String str) {
        this.itemID = str;
    }

    public final void setLevel(String str) {
        this.level = str;
    }

    public final void set_id(String str) {
        this._id = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.level);
        dest.writeString(this.answer);
        dest.writeString(this.description);
        dest.writeString(this.itemID);
        dest.writeString(this._id);
        CoordinatePracticeExamRequest coordinatePracticeExamRequest = this.coordinates;
        if (coordinatePracticeExamRequest == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            coordinatePracticeExamRequest.writeToParcel(dest, flags);
        }
    }

    public QuestionsPracticeExamRequest(String str, String str2, String str3, String str4, String str5, CoordinatePracticeExamRequest coordinatePracticeExamRequest) {
        this.level = str;
        this.answer = str2;
        this.description = str3;
        this.itemID = str4;
        this._id = str5;
        this.coordinates = coordinatePracticeExamRequest;
    }

    public /* synthetic */ QuestionsPracticeExamRequest(String str, String str2, String str3, String str4, String str5, CoordinatePracticeExamRequest coordinatePracticeExamRequest, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : coordinatePracticeExamRequest);
    }
}
