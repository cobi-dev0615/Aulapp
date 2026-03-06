package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0003J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0003R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/gse/aulapp/model/dto/WorkedHorsDto;", "Landroid/os/Parcelable;", "hoursDay", BuildConfig.FLAVOR, "hoursMonth", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHoursDay", "()Ljava/lang/Integer;", "setHoursDay", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHoursMonth", "setHoursMonth", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/gse/aulapp/model/dto/WorkedHorsDto;", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", BuildConfig.FLAVOR, "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WorkedHorsDto implements Parcelable {
    public static final Parcelable.Creator<WorkedHorsDto> CREATOR = new Creator();

    @SerializedName("hoursDay")
    private Integer hoursDay;

    @SerializedName("hoursMonth")
    private Integer hoursMonth;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<WorkedHorsDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WorkedHorsDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WorkedHorsDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WorkedHorsDto[] newArray(int i) {
            return new WorkedHorsDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkedHorsDto() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WorkedHorsDto copy$default(WorkedHorsDto workedHorsDto, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = workedHorsDto.hoursDay;
        }
        if ((i & 2) != 0) {
            num2 = workedHorsDto.hoursMonth;
        }
        return workedHorsDto.copy(num, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getHoursDay() {
        return this.hoursDay;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getHoursMonth() {
        return this.hoursMonth;
    }

    public final WorkedHorsDto copy(Integer hoursDay, Integer hoursMonth) {
        return new WorkedHorsDto(hoursDay, hoursMonth);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkedHorsDto)) {
            return false;
        }
        WorkedHorsDto workedHorsDto = (WorkedHorsDto) other;
        return Intrinsics.areEqual(this.hoursDay, workedHorsDto.hoursDay) && Intrinsics.areEqual(this.hoursMonth, workedHorsDto.hoursMonth);
    }

    public int hashCode() {
        Integer num = this.hoursDay;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.hoursMonth;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setHoursDay(Integer num) {
        this.hoursDay = num;
    }

    public final void setHoursMonth(Integer num) {
        this.hoursMonth = num;
    }

    public String toString() {
        return "WorkedHorsDto(hoursDay=" + this.hoursDay + ", hoursMonth=" + this.hoursMonth + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.hoursDay;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
        Integer num2 = this.hoursMonth;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num2);
        }
    }

    public WorkedHorsDto(Integer num, Integer num2) {
        this.hoursDay = num;
        this.hoursMonth = num2;
    }

    public /* synthetic */ WorkedHorsDto(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
