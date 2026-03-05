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
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J>\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u001eHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001eR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006)"}, d2 = {"Lcom/gse/aulapp/model/response/TagNfcResponse;", "Landroid/os/Parcelable;", "Id", BuildConfig.FLAVOR, "tagCode", "status", "encrypted", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getTagCode", "setTagCode", "getStatus", "setStatus", "getEncrypted", "()Ljava/lang/Boolean;", "setEncrypted", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/gse/aulapp/model/response/TagNfcResponse;", "describeContents", BuildConfig.FLAVOR, "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TagNfcResponse implements Parcelable {
    public static final Parcelable.Creator<TagNfcResponse> CREATOR = new Creator();

    @SerializedName("_id")
    private String Id;

    @SerializedName("encrypted")
    private Boolean encrypted;

    @SerializedName("status")
    private String status;

    @SerializedName("tagCode")
    private String tagCode;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TagNfcResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagNfcResponse createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TagNfcResponse(readString, readString2, readString3, valueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TagNfcResponse[] newArray(int i) {
            return new TagNfcResponse[i];
        }
    }

    public TagNfcResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TagNfcResponse copy$default(TagNfcResponse tagNfcResponse, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tagNfcResponse.Id;
        }
        if ((i & 2) != 0) {
            str2 = tagNfcResponse.tagCode;
        }
        if ((i & 4) != 0) {
            str3 = tagNfcResponse.status;
        }
        if ((i & 8) != 0) {
            bool = tagNfcResponse.encrypted;
        }
        return tagNfcResponse.copy(str, str2, str3, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.Id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTagCode() {
        return this.tagCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getEncrypted() {
        return this.encrypted;
    }

    public final TagNfcResponse copy(String Id, String tagCode, String status, Boolean encrypted) {
        return new TagNfcResponse(Id, tagCode, status, encrypted);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TagNfcResponse)) {
            return false;
        }
        TagNfcResponse tagNfcResponse = (TagNfcResponse) other;
        return Intrinsics.areEqual(this.Id, tagNfcResponse.Id) && Intrinsics.areEqual(this.tagCode, tagNfcResponse.tagCode) && Intrinsics.areEqual(this.status, tagNfcResponse.status) && Intrinsics.areEqual(this.encrypted, tagNfcResponse.encrypted);
    }

    public int hashCode() {
        String str = this.Id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tagCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.encrypted;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setEncrypted(Boolean bool) {
        this.encrypted = bool;
    }

    public final void setId(String str) {
        this.Id = str;
    }

    public final void setStatus(String str) {
        this.status = str;
    }

    public final void setTagCode(String str) {
        this.tagCode = str;
    }

    public String toString() {
        String str = this.Id;
        String str2 = this.tagCode;
        String str3 = this.status;
        Boolean bool = this.encrypted;
        StringBuilder r = x5.r("TagNfcResponse(Id=", str, ", tagCode=", str2, ", status=");
        r.append(str3);
        r.append(", encrypted=");
        r.append(bool);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.Id);
        dest.writeString(this.tagCode);
        dest.writeString(this.status);
        Boolean bool = this.encrypted;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
    }

    public TagNfcResponse(String str, String str2, String str3, Boolean bool) {
        this.Id = str;
        this.tagCode = str2;
        this.status = str3;
        this.encrypted = bool;
    }

    public /* synthetic */ TagNfcResponse(String str, String str2, String str3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool);
    }
}
