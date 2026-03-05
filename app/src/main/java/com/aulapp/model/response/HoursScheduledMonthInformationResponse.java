package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JK\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/gse/aulapp/model/response/HoursScheduledMonthInformationResponse;", "Landroid/os/Parcelable;", "centerID", BuildConfig.FLAVOR, "centerName", "centerAddress", "centerPhoneNumber", "collectionType", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/HoursScheduledCollectionTypeResponse;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCenterID", "()Ljava/lang/String;", "getCenterName", "getCenterAddress", "getCenterPhoneNumber", "getCollectionType", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HoursScheduledMonthInformationResponse implements Parcelable {
    public static final Parcelable.Creator<HoursScheduledMonthInformationResponse> CREATOR = new Creator();

    @SerializedName("centerAddress")
    private final String centerAddress;

    @SerializedName("centerID")
    private final String centerID;

    @SerializedName("centerName")
    private final String centerName;

    @SerializedName("centerPhoneNumber")
    private final String centerPhoneNumber;

    @SerializedName("collectionType")
    private final List<HoursScheduledCollectionTypeResponse> collectionType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HoursScheduledMonthInformationResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoursScheduledMonthInformationResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = q.b(HoursScheduledCollectionTypeResponse.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new HoursScheduledMonthInformationResponse(readString, readString2, readString3, readString4, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HoursScheduledMonthInformationResponse[] newArray(int i) {
            return new HoursScheduledMonthInformationResponse[i];
        }
    }

    public HoursScheduledMonthInformationResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ HoursScheduledMonthInformationResponse copy$default(HoursScheduledMonthInformationResponse hoursScheduledMonthInformationResponse, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hoursScheduledMonthInformationResponse.centerID;
        }
        if ((i & 2) != 0) {
            str2 = hoursScheduledMonthInformationResponse.centerName;
        }
        if ((i & 4) != 0) {
            str3 = hoursScheduledMonthInformationResponse.centerAddress;
        }
        if ((i & 8) != 0) {
            str4 = hoursScheduledMonthInformationResponse.centerPhoneNumber;
        }
        if ((i & 16) != 0) {
            list = hoursScheduledMonthInformationResponse.collectionType;
        }
        List list2 = list;
        String str5 = str3;
        return hoursScheduledMonthInformationResponse.copy(str, str2, str5, str4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCenterID() {
        return this.centerID;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCenterName() {
        return this.centerName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCenterAddress() {
        return this.centerAddress;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCenterPhoneNumber() {
        return this.centerPhoneNumber;
    }

    public final List<HoursScheduledCollectionTypeResponse> component5() {
        return this.collectionType;
    }

    public final HoursScheduledMonthInformationResponse copy(String centerID, String centerName, String centerAddress, String centerPhoneNumber, List<HoursScheduledCollectionTypeResponse> collectionType) {
        return new HoursScheduledMonthInformationResponse(centerID, centerName, centerAddress, centerPhoneNumber, collectionType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HoursScheduledMonthInformationResponse)) {
            return false;
        }
        HoursScheduledMonthInformationResponse hoursScheduledMonthInformationResponse = (HoursScheduledMonthInformationResponse) other;
        return Intrinsics.areEqual(this.centerID, hoursScheduledMonthInformationResponse.centerID) && Intrinsics.areEqual(this.centerName, hoursScheduledMonthInformationResponse.centerName) && Intrinsics.areEqual(this.centerAddress, hoursScheduledMonthInformationResponse.centerAddress) && Intrinsics.areEqual(this.centerPhoneNumber, hoursScheduledMonthInformationResponse.centerPhoneNumber) && Intrinsics.areEqual(this.collectionType, hoursScheduledMonthInformationResponse.collectionType);
    }

    public final String getCenterAddress() {
        return this.centerAddress;
    }

    public final String getCenterID() {
        return this.centerID;
    }

    public final String getCenterName() {
        return this.centerName;
    }

    public final String getCenterPhoneNumber() {
        return this.centerPhoneNumber;
    }

    public final List<HoursScheduledCollectionTypeResponse> getCollectionType() {
        return this.collectionType;
    }

    public int hashCode() {
        String str = this.centerID;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.centerName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.centerAddress;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.centerPhoneNumber;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<HoursScheduledCollectionTypeResponse> list = this.collectionType;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.centerID;
        String str2 = this.centerName;
        String str3 = this.centerAddress;
        String str4 = this.centerPhoneNumber;
        List<HoursScheduledCollectionTypeResponse> list = this.collectionType;
        StringBuilder r = x5.r("HoursScheduledMonthInformationResponse(centerID=", str, ", centerName=", str2, ", centerAddress=");
        x5.z(r, str3, ", centerPhoneNumber=", str4, ", collectionType=");
        r.append(list);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.centerID);
        dest.writeString(this.centerName);
        dest.writeString(this.centerAddress);
        dest.writeString(this.centerPhoneNumber);
        List<HoursScheduledCollectionTypeResponse> list = this.collectionType;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<HoursScheduledCollectionTypeResponse> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public HoursScheduledMonthInformationResponse(String str, String str2, String str3, String str4, List<HoursScheduledCollectionTypeResponse> list) {
        this.centerID = str;
        this.centerName = str2;
        this.centerAddress = str3;
        this.centerPhoneNumber = str4;
        this.collectionType = list;
    }

    public /* synthetic */ HoursScheduledMonthInformationResponse(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list);
    }
}
