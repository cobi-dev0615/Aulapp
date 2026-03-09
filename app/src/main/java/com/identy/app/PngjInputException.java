package com.identy.app;

import android.content.Context;
import android.util.Base64;
import com.android.volley.toolbox.HurlStack;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/* loaded from: classes2.dex */
public final class PngjInputException extends HurlStack {
    Context a;

    public PngjInputException(Context context) {
        this.a = context;
    }

    @Override // com.android.volley.toolbox.HurlStack
    public final HttpURLConnection createConnection(URL url) throws java.io.IOException {
        Properties properties;
        try {
            InputStream open = this.a.getAssets().open("identylm.properties");
            properties = new Properties();
            try {
                properties.load(open);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            properties = null;
        }
        if (properties == null) {
            return (HttpURLConnection) url.openConnection();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(properties.getProperty("host"), Integer.valueOf(properties.getProperty("port")).intValue())));
        String property = properties.getProperty("username");
        String property2 = properties.getProperty("password");
        if (property != null && property2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(property);
            sb.append(":");
            sb.append(property2);
            byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
            StringBuilder sb2 = new StringBuilder("Basic ");
            sb2.append(Base64.encodeToString(bytes, 2));
            String obj = sb2.toString();
            httpURLConnection.setRequestProperty("Proxy-Authorization", obj);
            httpURLConnection.setRequestProperty("Authorization", obj);
        }
        return httpURLConnection;
    }
}
