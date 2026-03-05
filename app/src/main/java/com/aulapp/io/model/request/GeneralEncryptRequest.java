package com.gse.aulapp.io.model.request;

import co.ceduladigital.sdk.q;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes.dex */
public class GeneralEncryptRequest implements Serializable {

    @SerializedName("data")
    @Expose
    private String data;

    @SerializedName("publicKey")
    @Expose
    private String publicKey;

    public GeneralEncryptRequest(String str, String str2) {
        this.publicKey = str;
        this.data = str2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GeneralEncryptRequest{publicKey='");
        sb.append(this.publicKey);
        sb.append("', data='");
        return q.j(this.data, "'}", sb);
    }
}
