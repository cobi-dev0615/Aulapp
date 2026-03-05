package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006 "}, d2 = {"Lcom/gse/aulapp/model/response/QuestionPracticeExam;", "Landroid/os/Parcelable;", "questionID", BuildConfig.FLAVOR, "testID", "itemID", "answer", "description", "level", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQuestionID", "()Ljava/lang/String;", "setQuestionID", "(Ljava/lang/String;)V", "getTestID", "setTestID", "getItemID", "setItemID", "getAnswer", "setAnswer", "getDescription", "setDescription", "getLevel", "setLevel", "describeContents", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class QuestionPracticeExam implements Parcelable {
    public static final Parcelable.Creator<QuestionPracticeExam> CREATOR = new Creator();

    @SerializedName("answer")
    private String answer;

    @SerializedName("description")
    private String description;

    @SerializedName("itemID")
    private String itemID;

    @SerializedName("level")
    private String level;

    @SerializedName("questionID")
    private String questionID;

    @SerializedName("testID")
    private String testID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QuestionPracticeExam> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionPracticeExam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QuestionPracticeExam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionPracticeExam[] newArray(int i) {
            return new QuestionPracticeExam[i];
        }
    }

    public QuestionPracticeExam(String questionID, String str, String itemID, String answer, String description, String level) {
        Intrinsics.checkNotNullParameter(questionID, "questionID");
        Intrinsics.checkNotNullParameter(itemID, "itemID");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(level, "level");
        this.questionID = questionID;
        this.testID = str;
        this.itemID = itemID;
        this.answer = answer;
        this.description = description;
        this.level = level;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getAnswer() {
        return this.answer;
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

    public final String getQuestionID() {
        return this.questionID;
    }

    public final String getTestID() {
        return this.testID;
    }

    public final void setAnswer(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.answer = str;
    }

    public final void setDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    public final void setItemID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.itemID = str;
    }

    public final void setLevel(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.level = str;
    }

    public final void setQuestionID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.questionID = str;
    }

    public final void setTestID(String str) {
        this.testID = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.questionID);
        dest.writeString(this.testID);
        dest.writeString(this.itemID);
        dest.writeString(this.answer);
        dest.writeString(this.description);
        dest.writeString(this.level);
    }
}
