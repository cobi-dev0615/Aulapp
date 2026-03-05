package com.gse.aulapp.io.model.response;

import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/gse/aulapp/io/model/response/GeneralResponseDecrypt;", "Landroid/os/Parcelable;", "statusCode", BuildConfig.FLAVOR, "statusMessage", BuildConfig.FLAVOR, "generalMessage", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getStatusCode", "()Ljava/lang/Integer;", "setStatusCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getStatusMessage", "()Ljava/lang/String;", "setStatusMessage", "(Ljava/lang/String;)V", "getGeneralMessage", "setGeneralMessage", "success", BuildConfig.FLAVOR, "getSuccess", "()Ljava/lang/Boolean;", "setSuccess", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "code", "getCode", "setCode", "toString", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class GeneralResponseDecrypt implements Parcelable {
    private transient String code;
    private transient String generalMessage;
    private transient Integer statusCode;
    private transient String statusMessage;
    private transient Boolean success;

    public GeneralResponseDecrypt() {
        this(null, null, null, 7, null);
    }

    public String getCode() {
        return this.code;
    }

    public String getGeneralMessage() {
        return this.generalMessage;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setGeneralMessage(String str) {
        this.generalMessage = str;
    }

    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public void setSuccess(Boolean bool) {
        this.success = bool;
    }

    public String toString() {
        Integer statusCode = getStatusCode();
        String statusMessage = getStatusMessage();
        String generalMessage = getGeneralMessage();
        Boolean success = getSuccess();
        String code = getCode();
        StringBuilder p = x5.p("GeneralResponseDecrypt(statusCode=", statusCode, ", statusMessage=", statusMessage, ", message=");
        p.append(generalMessage);
        p.append(", success=");
        p.append(success);
        p.append(", code=");
        return q.j(code, ")", p);
    }

    public GeneralResponseDecrypt(Integer num, String str, String str2) {
        this.statusCode = num;
        this.statusMessage = str;
        this.generalMessage = str2;
    }

    public /* synthetic */ GeneralResponseDecrypt(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
