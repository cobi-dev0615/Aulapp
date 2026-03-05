package com.gse.aulapp.model.request;

import android.os.Parcelable;
import androidx.annotation.Keep;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/gse/aulapp/model/request/BiometrixGeneralRequest;", "Landroid/os/Parcelable;", "userID", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;)V", "getUserID", "()Ljava/lang/String;", "setUserID", "toString", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BiometrixGeneralRequest implements Parcelable {
    private transient String userID;

    public BiometrixGeneralRequest(String userID) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        this.userID = userID;
    }

    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userID = str;
    }

    public String toString() {
        return a.m("BiometrixGeneralRequest{userID='", getUserID(), "'}");
    }
}
