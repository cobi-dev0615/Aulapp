package com.gse.aulapp.model.request;

import android.os.Parcelable;
import androidx.annotation.Keep;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\u0003H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/gse/aulapp/model/request/ExamRequestGeneral;", "Landroid/os/Parcelable;", "email", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "toString", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ExamRequestGeneral implements Parcelable {
    private transient String email;

    /* JADX WARN: Multi-variable type inference failed */
    public ExamRequestGeneral() {
        this(null, 1, null);
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public String toString() {
        return a.m("ExamRequestGeneral{email=", getEmail(), "}");
    }

    public ExamRequestGeneral(String str) {
        this.email = str;
    }

    public /* synthetic */ ExamRequestGeneral(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
