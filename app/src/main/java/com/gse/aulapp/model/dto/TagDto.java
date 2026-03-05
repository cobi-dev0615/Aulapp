package com.gse.aulapp.model.dto;

import co.ceduladigital.sdk.y7;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/gse/aulapp/model/dto/TagDto;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "vehicleId", "serialTag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getVehicleId", "setVehicleId", "(Ljava/lang/String;)V", "getSerialTag", "setSerialTag", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TagDto {
    private String serialTag;
    private String vehicleId;

    public TagDto(String vehicleId, String serialTag) {
        Intrinsics.checkNotNullParameter(vehicleId, "vehicleId");
        Intrinsics.checkNotNullParameter(serialTag, "serialTag");
        this.vehicleId = vehicleId;
        this.serialTag = serialTag;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagDto)) {
            return false;
        }
        TagDto tagDto = (TagDto) other;
        return Intrinsics.areEqual(this.vehicleId, tagDto.vehicleId) && Intrinsics.areEqual(this.serialTag, tagDto.serialTag);
    }

    public final String getSerialTag() {
        return this.serialTag;
    }

    public final String getVehicleId() {
        return this.vehicleId;
    }

    public int hashCode() {
        return this.serialTag.hashCode() + (this.vehicleId.hashCode() * 31);
    }

    public String toString() {
        return y7.p("TagDto(vehicleId=", this.vehicleId, ", serialTag=", this.serialTag, ")");
    }
}
