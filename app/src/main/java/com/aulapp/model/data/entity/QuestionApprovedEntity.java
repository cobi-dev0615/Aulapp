package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/gse/aulapp/model/data/entity/QuestionApprovedEntity;", "Landroid/os/Parcelable;", "sessionID", BuildConfig.FLAVOR, "questionID", "approved", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "()V", "getSessionID", "()Ljava/lang/String;", "setSessionID", "(Ljava/lang/String;)V", "getQuestionID", "setQuestionID", "getApproved", "()Z", "setApproved", "(Z)V", "component1", "component2", "component3", "copy", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class QuestionApprovedEntity implements Parcelable {
    public static final Parcelable.Creator<QuestionApprovedEntity> CREATOR = new Creator();
    private boolean approved;
    private String questionID;
    private String sessionID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QuestionApprovedEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionApprovedEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QuestionApprovedEntity(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionApprovedEntity[] newArray(int i) {
            return new QuestionApprovedEntity[i];
        }
    }

    public QuestionApprovedEntity(String sessionID, String questionID, boolean z) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(questionID, "questionID");
        this.sessionID = sessionID;
        this.questionID = questionID;
        this.approved = z;
    }

    public static /* synthetic */ QuestionApprovedEntity copy$default(QuestionApprovedEntity questionApprovedEntity, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionApprovedEntity.sessionID;
        }
        if ((i & 2) != 0) {
            str2 = questionApprovedEntity.questionID;
        }
        if ((i & 4) != 0) {
            z = questionApprovedEntity.approved;
        }
        return questionApprovedEntity.copy(str, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionID() {
        return this.sessionID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuestionID() {
        return this.questionID;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getApproved() {
        return this.approved;
    }

    public final QuestionApprovedEntity copy(String sessionID, String questionID, boolean approved) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(questionID, "questionID");
        return new QuestionApprovedEntity(sessionID, questionID, approved);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionApprovedEntity)) {
            return false;
        }
        QuestionApprovedEntity questionApprovedEntity = (QuestionApprovedEntity) other;
        return Intrinsics.areEqual(this.sessionID, questionApprovedEntity.sessionID) && Intrinsics.areEqual(this.questionID, questionApprovedEntity.questionID) && this.approved == questionApprovedEntity.approved;
    }

    public final boolean getApproved() {
        return this.approved;
    }

    public final String getQuestionID() {
        return this.questionID;
    }

    public final String getSessionID() {
        return this.sessionID;
    }

    public int hashCode() {
        return Boolean.hashCode(this.approved) + x5.d(this.questionID, this.sessionID.hashCode() * 31, 31);
    }

    public final void setApproved(boolean z) {
        this.approved = z;
    }

    public final void setQuestionID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.questionID = str;
    }

    public final void setSessionID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionID = str;
    }

    public String toString() {
        String str = this.sessionID;
        String str2 = this.questionID;
        boolean z = this.approved;
        StringBuilder r = x5.r("QuestionApprovedEntity(sessionID=", str, ", questionID=", str2, ", approved=");
        r.append(z);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sessionID);
        dest.writeString(this.questionID);
        dest.writeInt(this.approved ? 1 : 0);
    }

    public QuestionApprovedEntity() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, false);
    }
}
