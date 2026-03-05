package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J@\u0010\u0019\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR0\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006("}, d2 = {"Lcom/gse/aulapp/model/request/AssistSyncRequest;", "Landroid/os/Parcelable;", "route", "Lkotlin/collections/ArrayList;", "Lcom/gse/aulapp/model/request/RouteSyncRequest;", "Ljava/util/ArrayList;", "initClassTime", BuildConfig.FLAVOR, "endClassTime", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "getRoute", "()Ljava/util/ArrayList;", "setRoute", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "getInitClassTime", "()Ljava/lang/String;", "setInitClassTime", "(Ljava/lang/String;)V", "getEndClassTime", "setEndClassTime", "component1", "component2", "component3", "copy", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)Lcom/gse/aulapp/model/request/AssistSyncRequest;", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AssistSyncRequest implements Parcelable {
    public static final Parcelable.Creator<AssistSyncRequest> CREATOR = new Creator();

    @SerializedName("endClassTime")
    private String endClassTime;

    @SerializedName("initClassTime")
    private String initClassTime;

    @SerializedName("route")
    private ArrayList<RouteSyncRequest> route;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AssistSyncRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssistSyncRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = q.b(RouteSyncRequest.CREATOR, parcel, arrayList, i, 1);
            }
            return new AssistSyncRequest(arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssistSyncRequest[] newArray(int i) {
            return new AssistSyncRequest[i];
        }
    }

    public AssistSyncRequest() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssistSyncRequest copy$default(AssistSyncRequest assistSyncRequest, ArrayList arrayList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = assistSyncRequest.route;
        }
        if ((i & 2) != 0) {
            str = assistSyncRequest.initClassTime;
        }
        if ((i & 4) != 0) {
            str2 = assistSyncRequest.endClassTime;
        }
        return assistSyncRequest.copy(arrayList, str, str2);
    }

    public final ArrayList<RouteSyncRequest> component1() {
        return this.route;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInitClassTime() {
        return this.initClassTime;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEndClassTime() {
        return this.endClassTime;
    }

    public final AssistSyncRequest copy(ArrayList<RouteSyncRequest> route, String initClassTime, String endClassTime) {
        Intrinsics.checkNotNullParameter(route, "route");
        return new AssistSyncRequest(route, initClassTime, endClassTime);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssistSyncRequest)) {
            return false;
        }
        AssistSyncRequest assistSyncRequest = (AssistSyncRequest) other;
        return Intrinsics.areEqual(this.route, assistSyncRequest.route) && Intrinsics.areEqual(this.initClassTime, assistSyncRequest.initClassTime) && Intrinsics.areEqual(this.endClassTime, assistSyncRequest.endClassTime);
    }

    public final String getEndClassTime() {
        return this.endClassTime;
    }

    public final String getInitClassTime() {
        return this.initClassTime;
    }

    public final ArrayList<RouteSyncRequest> getRoute() {
        return this.route;
    }

    public int hashCode() {
        int hashCode = this.route.hashCode() * 31;
        String str = this.initClassTime;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endClassTime;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setEndClassTime(String str) {
        this.endClassTime = str;
    }

    public final void setInitClassTime(String str) {
        this.initClassTime = str;
    }

    public final void setRoute(ArrayList<RouteSyncRequest> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.route = arrayList;
    }

    public String toString() {
        ArrayList<RouteSyncRequest> arrayList = this.route;
        String str = this.initClassTime;
        String str2 = this.endClassTime;
        StringBuilder sb = new StringBuilder("AssistSyncRequest(route=");
        sb.append(arrayList);
        sb.append(", initClassTime=");
        sb.append(str);
        sb.append(", endClassTime=");
        return q.j(str2, ")", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ArrayList<RouteSyncRequest> arrayList = this.route;
        dest.writeInt(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            RouteSyncRequest routeSyncRequest = arrayList.get(i);
            i++;
            routeSyncRequest.writeToParcel(dest, flags);
        }
        dest.writeString(this.initClassTime);
        dest.writeString(this.endClassTime);
    }

    public AssistSyncRequest(ArrayList<RouteSyncRequest> route, String str, String str2) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.route = route;
        this.initClassTime = str;
        this.endClassTime = str2;
    }

    public /* synthetic */ AssistSyncRequest(ArrayList arrayList, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
