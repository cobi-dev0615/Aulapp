package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018Jd\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020)J\u0013\u0010*\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020)HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020)R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u00064"}, d2 = {"Lcom/gse/aulapp/model/data/entity/QuestionEntity;", "Landroid/os/Parcelable;", "questionID", BuildConfig.FLAVOR, "testID", "itemID", "answer", "description", "level", "approved", BuildConfig.FLAVOR, "replied", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getQuestionID", "()Ljava/lang/String;", "setQuestionID", "(Ljava/lang/String;)V", "getTestID", "getItemID", "getAnswer", "getDescription", "getLevel", "getApproved", "()Ljava/lang/Boolean;", "setApproved", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getReplied", "setReplied", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/gse/aulapp/model/data/entity/QuestionEntity;", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class QuestionEntity implements Parcelable {
    public static final Parcelable.Creator<QuestionEntity> CREATOR = new Creator();
    private final String answer;
    private Boolean approved;
    private final String description;
    private final String itemID;
    private final String level;
    private String questionID;
    private Boolean replied;
    private final String testID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QuestionEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionEntity createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new QuestionEntity(readString, readString2, readString3, readString4, readString5, readString6, valueOf, bool);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionEntity[] newArray(int i) {
            return new QuestionEntity[i];
        }
    }

    public QuestionEntity(String questionID, String testID, String itemID, String answer, String description, String str, Boolean bool, Boolean bool2) {
        Intrinsics.checkNotNullParameter(questionID, "questionID");
        Intrinsics.checkNotNullParameter(testID, "testID");
        Intrinsics.checkNotNullParameter(itemID, "itemID");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(description, "description");
        this.questionID = questionID;
        this.testID = testID;
        this.itemID = itemID;
        this.answer = answer;
        this.description = description;
        this.level = str;
        this.approved = bool;
        this.replied = bool2;
    }

    public static /* synthetic */ QuestionEntity copy$default(QuestionEntity questionEntity, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionEntity.questionID;
        }
        if ((i & 2) != 0) {
            str2 = questionEntity.testID;
        }
        if ((i & 4) != 0) {
            str3 = questionEntity.itemID;
        }
        if ((i & 8) != 0) {
            str4 = questionEntity.answer;
        }
        if ((i & 16) != 0) {
            str5 = questionEntity.description;
        }
        if ((i & 32) != 0) {
            str6 = questionEntity.level;
        }
        if ((i & 64) != 0) {
            bool = questionEntity.approved;
        }
        if ((i & 128) != 0) {
            bool2 = questionEntity.replied;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str7 = str5;
        String str8 = str6;
        return questionEntity.copy(str, str2, str3, str4, str7, str8, bool3, bool4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuestionID() {
        return this.questionID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTestID() {
        return this.testID;
    }

    /* renamed from: component3, reason: from getter */
    public final String getItemID() {
        return this.itemID;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    /* renamed from: component7, reason: from getter */
    public final Boolean getApproved() {
        return this.approved;
    }

    /* renamed from: component8, reason: from getter */
    public final Boolean getReplied() {
        return this.replied;
    }

    public final QuestionEntity copy(String questionID, String testID, String itemID, String answer, String description, String level, Boolean approved, Boolean replied) {
        Intrinsics.checkNotNullParameter(questionID, "questionID");
        Intrinsics.checkNotNullParameter(testID, "testID");
        Intrinsics.checkNotNullParameter(itemID, "itemID");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(description, "description");
        return new QuestionEntity(questionID, testID, itemID, answer, description, level, approved, replied);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionEntity)) {
            return false;
        }
        QuestionEntity questionEntity = (QuestionEntity) other;
        return Intrinsics.areEqual(this.questionID, questionEntity.questionID) && Intrinsics.areEqual(this.testID, questionEntity.testID) && Intrinsics.areEqual(this.itemID, questionEntity.itemID) && Intrinsics.areEqual(this.answer, questionEntity.answer) && Intrinsics.areEqual(this.description, questionEntity.description) && Intrinsics.areEqual(this.level, questionEntity.level) && Intrinsics.areEqual(this.approved, questionEntity.approved) && Intrinsics.areEqual(this.replied, questionEntity.replied);
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final Boolean getApproved() {
        return this.approved;
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

    public final Boolean getReplied() {
        return this.replied;
    }

    public final String getTestID() {
        return this.testID;
    }

    public int hashCode() {
        int d = x5.d(this.description, x5.d(this.answer, x5.d(this.itemID, x5.d(this.testID, this.questionID.hashCode() * 31, 31), 31), 31), 31);
        String str = this.level;
        int hashCode = (d + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.approved;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.replied;
        return hashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final void setApproved(Boolean bool) {
        this.approved = bool;
    }

    public final void setQuestionID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.questionID = str;
    }

    public final void setReplied(Boolean bool) {
        this.replied = bool;
    }

    public String toString() {
        String str = this.questionID;
        String str2 = this.testID;
        String str3 = this.itemID;
        String str4 = this.answer;
        String str5 = this.description;
        String str6 = this.level;
        Boolean bool = this.approved;
        Boolean bool2 = this.replied;
        StringBuilder r = x5.r("QuestionEntity(questionID=", str, ", testID=", str2, ", itemID=");
        x5.z(r, str3, ", answer=", str4, ", description=");
        x5.z(r, str5, ", level=", str6, ", approved=");
        r.append(bool);
        r.append(", replied=");
        r.append(bool2);
        r.append(")");
        return r.toString();
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
        Boolean bool = this.approved;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
        Boolean bool2 = this.replied;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool2);
        }
    }
}
