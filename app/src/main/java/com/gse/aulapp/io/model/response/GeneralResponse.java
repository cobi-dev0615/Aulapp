package com.gse.aulapp.io.model.response;

import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Keep
/* loaded from: classes.dex */
public class GeneralResponse implements Serializable {

    @SerializedName("statusDescription")
    @Expose
    private String message;

    @SerializedName("statusCode")
    @Expose
    private int statusCode;

    @SerializedName("statusMessage")
    @Expose
    private String statusMessage;

    public GeneralResponse(int i, String str, String str2) {
        this.statusCode = i;
        this.statusMessage = str;
        this.message = str2;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatusCode(int i) {
        this.statusCode = i;
    }

    public void setStatusMessage(String str) {
        this.statusMessage = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GeneralResponse{statusCode=");
        sb.append(this.statusCode);
        sb.append(", statusMessage='");
        sb.append(this.statusMessage);
        sb.append("', message='");
        return q.j(this.message, "'}", sb);
    }
}
