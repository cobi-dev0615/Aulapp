package com.a.e.d;

import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.HttpHeaderParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class PngjBadCrcException extends Request<NetworkResponse> {
    private final String PngjBadCrcException;
    private final String PngjBadSignature;
    private Response.Listener<NetworkResponse> PngjException;
    private Map<String, String> PngjInputException;
    private Response.ErrorListener valueOf;
    private final String values;

    public class values {
        String PngjBadSignature;
        byte[] valueOf;

        public values(String str, byte[] bArr) {
            this.PngjBadSignature = str;
            this.valueOf = bArr;
        }
    }

    public PngjBadCrcException(int i, String str, Response.Listener<NetworkResponse> listener, Response.ErrorListener errorListener) {
        super(1, str, errorListener);
        this.PngjBadCrcException = "--";
        this.PngjBadSignature = "\r\n";
        StringBuilder sb = new StringBuilder("apiclient-");
        sb.append(System.currentTimeMillis());
        this.values = sb.toString();
        this.PngjException = listener;
        this.valueOf = errorListener;
    }

    public abstract Map<String, values> PngjBadCrcException();

    @Override // com.android.volley.Request
    public void deliverError(VolleyError volleyError) {
        this.valueOf.onErrorResponse(volleyError);
    }

    @Override // com.android.volley.Request
    public /* synthetic */ void deliverResponse(NetworkResponse networkResponse) {
        this.PngjException.onResponse(networkResponse);
    }

    @Override // com.android.volley.Request
    public byte[] getBody() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            Map<String, String> params = getParams();
            if (params != null && params.size() > 0) {
                String paramsEncoding = getParamsEncoding();
                try {
                    for (Map.Entry<String, String> entry : params.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        StringBuilder sb = new StringBuilder("--");
                        sb.append(this.values);
                        sb.append("\r\n");
                        dataOutputStream.writeBytes(sb.toString());
                        StringBuilder sb2 = new StringBuilder("Content-Disposition: form-data; name=\"");
                        sb2.append(key);
                        sb2.append("\"\r\n");
                        dataOutputStream.writeBytes(sb2.toString());
                        dataOutputStream.writeBytes("\r\n");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(value);
                        sb3.append("\r\n");
                        dataOutputStream.writeBytes(sb3.toString());
                    }
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("Encoding not supported: ".concat(String.valueOf(paramsEncoding)), e);
                }
            }
            Map<String, values> PngjBadCrcException = PngjBadCrcException();
            if (PngjBadCrcException != null && PngjBadCrcException.size() > 0) {
                for (Map.Entry<String, values> entry2 : PngjBadCrcException.entrySet()) {
                    values value2 = entry2.getValue();
                    String key2 = entry2.getKey();
                    StringBuilder sb4 = new StringBuilder("--");
                    sb4.append(this.values);
                    sb4.append("\r\n");
                    dataOutputStream.writeBytes(sb4.toString());
                    StringBuilder sb5 = new StringBuilder("Content-Disposition: form-data; name=\"");
                    sb5.append(key2);
                    sb5.append("\"; filename=\"");
                    sb5.append(value2.PngjBadSignature);
                    sb5.append("\"\r\n");
                    dataOutputStream.writeBytes(sb5.toString());
                    dataOutputStream.writeBytes("\r\n");
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(value2.valueOf);
                    int min = Math.min(byteArrayInputStream.available(), 1048576);
                    byte[] bArr = new byte[min];
                    int read = byteArrayInputStream.read(bArr, 0, min);
                    while (read > 0) {
                        dataOutputStream.write(bArr, 0, min);
                        min = Math.min(byteArrayInputStream.available(), 1048576);
                        read = byteArrayInputStream.read(bArr, 0, min);
                    }
                    dataOutputStream.writeBytes("\r\n");
                }
            }
            StringBuilder sb6 = new StringBuilder("--");
            sb6.append(this.values);
            sb6.append("--\r\n");
            dataOutputStream.writeBytes(sb6.toString());
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.android.volley.Request
    public String getBodyContentType() {
        StringBuilder sb = new StringBuilder("multipart/form-data;boundary=");
        sb.append(this.values);
        return sb.toString();
    }

    @Override // com.android.volley.Request
    public Response<NetworkResponse> parseNetworkResponse(NetworkResponse networkResponse) {
        try {
            return Response.success(networkResponse, HttpHeaderParser.parseCacheHeaders(networkResponse));
        } catch (Exception e) {
            return Response.error(new ParseError(e));
        }
    }
}
