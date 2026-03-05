package com.gse.aulapp.model.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.y7;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J,\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R(\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/gse/aulapp/model/request/ExamValidateRequest;", "Landroid/os/Parcelable;", "appointmentsId", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "role", "<init>", "([Ljava/lang/String;Ljava/lang/String;)V", "getAppointmentsId", "()[Ljava/lang/String;", "setAppointmentsId", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "getRole", "()Ljava/lang/String;", "component1", "component2", "copy", "([Ljava/lang/String;Ljava/lang/String;)Lcom/gse/aulapp/model/request/ExamValidateRequest;", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ExamValidateRequest implements Parcelable {
    public static final Parcelable.Creator<ExamValidateRequest> CREATOR = new Creator();

    @SerializedName("appointmentIds")
    private String[] appointmentsId;

    @SerializedName("role")
    private final String role;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExamValidateRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExamValidateRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExamValidateRequest(parcel.createStringArray(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExamValidateRequest[] newArray(int i) {
            return new ExamValidateRequest[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExamValidateRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ExamValidateRequest copy$default(ExamValidateRequest examValidateRequest, String[] strArr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = examValidateRequest.appointmentsId;
        }
        if ((i & 2) != 0) {
            str = examValidateRequest.role;
        }
        return examValidateRequest.copy(strArr, str);
    }

    /* renamed from: component1, reason: from getter */
    public final String[] getAppointmentsId() {
        return this.appointmentsId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    public final ExamValidateRequest copy(String[] appointmentsId, String role) {
        return new ExamValidateRequest(appointmentsId, role);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExamValidateRequest)) {
            return false;
        }
        ExamValidateRequest examValidateRequest = (ExamValidateRequest) other;
        return Intrinsics.areEqual(this.appointmentsId, examValidateRequest.appointmentsId) && Intrinsics.areEqual(this.role, examValidateRequest.role);
    }

    public final String[] getAppointmentsId() {
        return this.appointmentsId;
    }

    public int hashCode() {
        String[] strArr = this.appointmentsId;
        int hashCode = (strArr == null ? 0 : Arrays.hashCode(strArr)) * 31;
        String str = this.role;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setAppointmentsId(String[] strArr) {
        this.appointmentsId = strArr;
    }

    public String toString() {
        return y7.p("ExamValidateRequest(appointmentsId=", Arrays.toString(this.appointmentsId), ", role=", this.role, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringArray(this.appointmentsId);
        dest.writeString(this.role);
    }

    public ExamValidateRequest(String[] strArr, String str) {
        this.appointmentsId = strArr;
        this.role = str;
    }

    public /* synthetic */ ExamValidateRequest(String[] strArr, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : strArr, (i & 2) != 0 ? null : str);
    }
}
