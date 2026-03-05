package com.gse.aulapp.model.response;

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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003JV\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020\bJ\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\bHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\bR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00064"}, d2 = {"Lcom/gse/aulapp/model/response/SessionExamVehicleResponse;", "Landroid/os/Parcelable;", "Id", BuildConfig.FLAVOR, "brand", "line", "plates", "model", BuildConfig.FLAVOR, "tagnfc", "Lcom/gse/aulapp/model/response/TagNfcResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/gse/aulapp/model/response/TagNfcResponse;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getBrand", "setBrand", "getLine", "setLine", "getPlates", "setPlates", "getModel", "()Ljava/lang/Integer;", "setModel", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTagnfc", "()Lcom/gse/aulapp/model/response/TagNfcResponse;", "setTagnfc", "(Lcom/gse/aulapp/model/response/TagNfcResponse;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/gse/aulapp/model/response/TagNfcResponse;)Lcom/gse/aulapp/model/response/SessionExamVehicleResponse;", "describeContents", "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionExamVehicleResponse implements Parcelable {
    public static final Parcelable.Creator<SessionExamVehicleResponse> CREATOR = new Creator();

    @SerializedName("_id")
    private String Id;

    @SerializedName("brand")
    private String brand;

    @SerializedName("line")
    private String line;

    @SerializedName("model")
    private Integer model;

    @SerializedName("plates")
    private String plates;

    @SerializedName("tagnfc")
    private TagNfcResponse tagnfc;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionExamVehicleResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionExamVehicleResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SessionExamVehicleResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? TagNfcResponse.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionExamVehicleResponse[] newArray(int i) {
            return new SessionExamVehicleResponse[i];
        }
    }

    public SessionExamVehicleResponse() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SessionExamVehicleResponse copy$default(SessionExamVehicleResponse sessionExamVehicleResponse, String str, String str2, String str3, String str4, Integer num, TagNfcResponse tagNfcResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sessionExamVehicleResponse.Id;
        }
        if ((i & 2) != 0) {
            str2 = sessionExamVehicleResponse.brand;
        }
        if ((i & 4) != 0) {
            str3 = sessionExamVehicleResponse.line;
        }
        if ((i & 8) != 0) {
            str4 = sessionExamVehicleResponse.plates;
        }
        if ((i & 16) != 0) {
            num = sessionExamVehicleResponse.model;
        }
        if ((i & 32) != 0) {
            tagNfcResponse = sessionExamVehicleResponse.tagnfc;
        }
        Integer num2 = num;
        TagNfcResponse tagNfcResponse2 = tagNfcResponse;
        return sessionExamVehicleResponse.copy(str, str2, str3, str4, num2, tagNfcResponse2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.Id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLine() {
        return this.line;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPlates() {
        return this.plates;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getModel() {
        return this.model;
    }

    /* renamed from: component6, reason: from getter */
    public final TagNfcResponse getTagnfc() {
        return this.tagnfc;
    }

    public final SessionExamVehicleResponse copy(String Id, String brand, String line, String plates, Integer model, TagNfcResponse tagnfc) {
        return new SessionExamVehicleResponse(Id, brand, line, plates, model, tagnfc);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionExamVehicleResponse)) {
            return false;
        }
        SessionExamVehicleResponse sessionExamVehicleResponse = (SessionExamVehicleResponse) other;
        return Intrinsics.areEqual(this.Id, sessionExamVehicleResponse.Id) && Intrinsics.areEqual(this.brand, sessionExamVehicleResponse.brand) && Intrinsics.areEqual(this.line, sessionExamVehicleResponse.line) && Intrinsics.areEqual(this.plates, sessionExamVehicleResponse.plates) && Intrinsics.areEqual(this.model, sessionExamVehicleResponse.model) && Intrinsics.areEqual(this.tagnfc, sessionExamVehicleResponse.tagnfc);
    }

    public int hashCode() {
        String str = this.Id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.brand;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.line;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.plates;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.model;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        TagNfcResponse tagNfcResponse = this.tagnfc;
        return hashCode5 + (tagNfcResponse != null ? tagNfcResponse.hashCode() : 0);
    }

    public final void setBrand(String str) {
        this.brand = str;
    }

    public final void setId(String str) {
        this.Id = str;
    }

    public final void setLine(String str) {
        this.line = str;
    }

    public final void setModel(Integer num) {
        this.model = num;
    }

    public final void setPlates(String str) {
        this.plates = str;
    }

    public final void setTagnfc(TagNfcResponse tagNfcResponse) {
        this.tagnfc = tagNfcResponse;
    }

    public String toString() {
        String str = this.Id;
        String str2 = this.brand;
        String str3 = this.line;
        String str4 = this.plates;
        Integer num = this.model;
        TagNfcResponse tagNfcResponse = this.tagnfc;
        StringBuilder r = x5.r("SessionExamVehicleResponse(Id=", str, ", brand=", str2, ", line=");
        x5.z(r, str3, ", plates=", str4, ", model=");
        r.append(num);
        r.append(", tagnfc=");
        r.append(tagNfcResponse);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.Id);
        dest.writeString(this.brand);
        dest.writeString(this.line);
        dest.writeString(this.plates);
        Integer num = this.model;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
        TagNfcResponse tagNfcResponse = this.tagnfc;
        if (tagNfcResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            tagNfcResponse.writeToParcel(dest, flags);
        }
    }

    public SessionExamVehicleResponse(String str, String str2, String str3, String str4, Integer num, TagNfcResponse tagNfcResponse) {
        this.Id = str;
        this.brand = str2;
        this.line = str3;
        this.plates = str4;
        this.model = num;
        this.tagnfc = tagNfcResponse;
    }

    public /* synthetic */ SessionExamVehicleResponse(String str, String str2, String str3, String str4, Integer num, TagNfcResponse tagNfcResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : tagNfcResponse);
    }
}
