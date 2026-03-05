package com.gse.aulapp.io.model.dto;

import androidx.annotation.Keep;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.gse.aulapp.io.model.response.GeneralResponse;
import java.io.Serializable;

@Keep
/* loaded from: classes.dex */
public class GeneralDecrypt extends GeneralResponse implements Serializable {

    @SerializedName("result")
    @Expose
    private JsonObject result;

    public GeneralDecrypt(GeneralResponse generalResponse, JsonObject jsonObject) {
        super(generalResponse.getStatusCode(), generalResponse.getStatusMessage(), generalResponse.getMessage());
        this.result = jsonObject;
    }

    public JsonObject getResult() {
        return this.result;
    }

    public void setResult(JsonObject jsonObject) {
        this.result = jsonObject;
    }

    @Override // com.gse.aulapp.io.model.response.GeneralResponse
    public String toString() {
        return "GeneralDecrypt{statusCode=" + getStatusCode() + ", statusMessage='" + getStatusMessage() + "', message='" + getMessage() + "'result=" + this.result + '}';
    }

    public GeneralDecrypt(int i, String str, String str2, JsonObject jsonObject) {
        super(i, str, str2);
        this.result = jsonObject;
    }
}
