package com.gse.aulapp.io.model.response;

import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@Keep
/* loaded from: classes.dex */
public class GeneralEncryptResponse extends GeneralResponse implements Serializable {

    @SerializedName("result")
    @Expose
    private String result;

    public GeneralEncryptResponse(int i, String str, String str2) {
        super(i, str, str2);
    }

    public String getResult() {
        return this.result;
    }

    public void setResult(String str) {
        this.result = str;
    }

    @Override // com.gse.aulapp.io.model.response.GeneralResponse
    public String toString() {
        return q.j(this.result, "'}", new StringBuilder("GeneralEncryptResponse{result='"));
    }
}
