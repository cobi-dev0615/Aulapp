package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/gse/aulapp/model/data/entity/LessonEntity;", "Landroid/os/Parcelable;", "lessonID", BuildConfig.FLAVOR, "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "()V", "getLessonID", "()Ljava/lang/String;", "setLessonID", "(Ljava/lang/String;)V", "getName", "setName", "describeContents", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LessonEntity implements Parcelable {
    public static final Parcelable.Creator<LessonEntity> CREATOR = new Creator();
    private String lessonID;
    private String name;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LessonEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LessonEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LessonEntity(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LessonEntity[] newArray(int i) {
            return new LessonEntity[i];
        }
    }

    public LessonEntity(String lessonID, String name) {
        Intrinsics.checkNotNullParameter(lessonID, "lessonID");
        Intrinsics.checkNotNullParameter(name, "name");
        this.lessonID = lessonID;
        this.name = name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getLessonID() {
        return this.lessonID;
    }

    public final String getName() {
        return this.name;
    }

    public final void setLessonID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lessonID = str;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.lessonID);
        dest.writeString(this.name);
    }

    public LessonEntity() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
    }
}
