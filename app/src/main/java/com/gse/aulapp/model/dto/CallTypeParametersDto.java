package com.gse.aulapp.model.dto;

import android.os.Parcel;
import android.os.Parcelable;
import co.ceduladigital.sdk.q;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/gse/aulapp/model/dto/CallTypeParametersDto;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/CallTypeDto;", "callTypeList", "<init>", "(Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", BuildConfig.FLAVOR, "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getCallTypeList", "()Ljava/util/List;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CallTypeParametersDto implements Parcelable {
    public static final Parcelable.Creator<CallTypeParametersDto> CREATOR = new Creator();
    private final List<CallTypeDto> callTypeList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CallTypeParametersDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallTypeParametersDto createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = q.b(CallTypeDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new CallTypeParametersDto(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CallTypeParametersDto[] newArray(int i) {
            return new CallTypeParametersDto[i];
        }
    }

    public CallTypeParametersDto(List<CallTypeDto> callTypeList) {
        Intrinsics.checkNotNullParameter(callTypeList, "callTypeList");
        this.callTypeList = callTypeList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CallTypeParametersDto) && Intrinsics.areEqual(this.callTypeList, ((CallTypeParametersDto) other).callTypeList);
    }

    public int hashCode() {
        return this.callTypeList.hashCode();
    }

    public String toString() {
        return "CallTypeParametersDto(callTypeList=" + this.callTypeList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<CallTypeDto> list = this.callTypeList;
        dest.writeInt(list.size());
        Iterator<CallTypeDto> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }
}
