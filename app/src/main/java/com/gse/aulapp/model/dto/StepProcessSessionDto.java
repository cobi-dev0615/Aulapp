package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u001dR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u001a\u0004\b\u0007\u0010#\"\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/gse/aulapp/model/dto/StepProcessSessionDto;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "sessionID", "type", "status", BuildConfig.FLAVOR, "isEntry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/os/Parcel;", "dest", BuildConfig.FLAVOR, "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionID", "setSessionID", "(Ljava/lang/String;)V", "getType", "setType", "getStatus", "setStatus", "Z", "()Z", "setEntry", "(Z)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class StepProcessSessionDto implements Parcelable {
    public static final Parcelable.Creator<StepProcessSessionDto> CREATOR = new Creator();
    private boolean isEntry;
    private String sessionID;
    private String status;
    private String type;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StepProcessSessionDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StepProcessSessionDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StepProcessSessionDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StepProcessSessionDto[] newArray(int i) {
            return new StepProcessSessionDto[i];
        }
    }

    public StepProcessSessionDto(String sessionID, String type, String status, boolean z) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        this.sessionID = sessionID;
        this.type = type;
        this.status = status;
        this.isEntry = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StepProcessSessionDto)) {
            return false;
        }
        StepProcessSessionDto stepProcessSessionDto = (StepProcessSessionDto) other;
        return Intrinsics.areEqual(this.sessionID, stepProcessSessionDto.sessionID) && Intrinsics.areEqual(this.type, stepProcessSessionDto.type) && Intrinsics.areEqual(this.status, stepProcessSessionDto.status) && this.isEntry == stepProcessSessionDto.isEntry;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isEntry) + x5.d(this.status, x5.d(this.type, this.sessionID.hashCode() * 31, 31), 31);
    }

    /* renamed from: isEntry, reason: from getter */
    public final boolean getIsEntry() {
        return this.isEntry;
    }

    public String toString() {
        String str = this.sessionID;
        String str2 = this.type;
        String str3 = this.status;
        boolean z = this.isEntry;
        StringBuilder r = x5.r("StepProcessSessionDto(sessionID=", str, ", type=", str2, ", status=");
        r.append(str3);
        r.append(", isEntry=");
        r.append(z);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.sessionID);
        dest.writeString(this.type);
        dest.writeString(this.status);
        dest.writeInt(this.isEntry ? 1 : 0);
    }
}
