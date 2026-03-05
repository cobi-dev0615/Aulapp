package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/gse/aulapp/model/dto/LessonDto;", "Landroid/os/Parcelable;", "lessonID", BuildConfig.FLAVOR, "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLessonID", "()Ljava/lang/String;", "setLessonID", "(Ljava/lang/String;)V", "getName", "setName", "describeContents", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LessonDto implements Parcelable {
    public static final Parcelable.Creator<LessonDto> CREATOR = new Creator();
    private String lessonID;
    private String name;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LessonDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LessonDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LessonDto(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LessonDto[] newArray(int i) {
            return new LessonDto[i];
        }
    }

    public LessonDto(String str, String str2) {
        this.lessonID = str;
        this.name = str2;
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
        this.lessonID = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.lessonID);
        dest.writeString(this.name);
    }
}
