package com.gse.aulapp.io;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.gse.aulapp.io.model.dto.GeneralDecrypt;
import com.gse.aulapp.io.model.request.GeneralEncryptRequest;
import com.gse.aulapp.io.model.response.GeneralEncryptResponse;
import com.gse.aulapp.io.util.InterceptorUtil;
import com.gse.aulapp.lib.encryption_gse.encryptJwe.EcCryptKeys;
import com.gse.aulapp.lib.encryption_gse.encryptJwe.model.ResultEncryptKeys;
import com.gse.aulapp.util.PreferenceUtil;
import com.karumi.dexter.BuildConfig;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u0000 )2\u00020\u0001:\u0001)B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u000bJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u001b\u0010!\u001a\u0004\u0018\u00010\u00152\b\u0010 \u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b!\u0010\u0018J#\u0010\"\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(¨\u0006*"}, d2 = {"Lcom/gse/aulapp/io/ServiceInterceptorK;", "Lokhttp3/Interceptor;", "Landroid/content/Context;", "context", "Lokhttp3/Headers;", "mandatoryHeaders", "<init>", "(Landroid/content/Context;Lokhttp3/Headers;)V", "Lokhttp3/Request;", "request", "validateHeaders", "(Lokhttp3/Request;)Lokhttp3/Request;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "validateRequest", "(Lokhttp3/Interceptor$Chain;Lokhttp3/Request;)Lokhttp3/Response;", "requestUpdatedEncrypt", "Lokhttp3/RequestBody;", "updateBody", "(Lokhttp3/Request;)Lokhttp3/RequestBody;", BuildConfig.FLAVOR, "value", "encryptValue", "(Ljava/lang/String;)Ljava/lang/String;", "jsonPayload", "encrypt", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "response", "validateResponse", "(Lokhttp3/Response;)Lokhttp3/Response;", "getUpdateResponseBody", "jwe", "decryptValue", "decrypt", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lokhttp3/Headers;", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nServiceInterceptorK.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServiceInterceptorK.kt\ncom/gse/aulapp/io/ServiceInterceptorK\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,242:1\n1863#2,2:243\n*S KotlinDebug\n*F\n+ 1 ServiceInterceptorK.kt\ncom/gse/aulapp/io/ServiceInterceptorK\n*L\n53#1:243,2\n*E\n"})
/* loaded from: classes.dex */
public final class ServiceInterceptorK implements Interceptor {
    private final Context context;
    private final Headers mandatoryHeaders;

    public ServiceInterceptorK(Context context, Headers headers) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.mandatoryHeaders = headers;
    }

    private final String decrypt(Context context, String jwe) {
        ResultEncryptKeys decrypt;
        if (jwe == null) {
            return null;
        }
        try {
            decrypt = EcCryptKeys.INSTANCE.decrypt(context, jwe);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        if (decrypt instanceof ResultEncryptKeys.DataResult) {
            ((ResultEncryptKeys.DataResult) decrypt).getPublicKey();
            ((ResultEncryptKeys.DataResult) decrypt).getValue();
            return ((ResultEncryptKeys.DataResult) decrypt).getValue();
        }
        if (!(decrypt instanceof ResultEncryptKeys.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        Objects.toString(((ResultEncryptKeys.Failure) decrypt).getE());
        return null;
    }

    private final String decryptValue(String jwe) {
        try {
            return decrypt(this.context, jwe);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private final String encrypt(Context context, String jsonPayload) {
        try {
            Log.d("ServiceInterceptorK", "Encrypting payload (first 100 chars): " + jsonPayload.substring(0, Math.min(jsonPayload.length(), 100)));
            EcCryptKeys.Companion companion = EcCryptKeys.INSTANCE;
            companion.initializeKeysByAssetsPath("aulapp_pub.pem");
            ResultEncryptKeys encrypt = companion.encrypt(context, jsonPayload);
            if (!(encrypt instanceof ResultEncryptKeys.DataResult)) {
                if (!(encrypt instanceof ResultEncryptKeys.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                Log.e("ServiceInterceptorK", "Encryption failed: " + Objects.toString(((ResultEncryptKeys.Failure) encrypt).getE()));
                return null;
            }
            ((ResultEncryptKeys.DataResult) encrypt).getPublicKey();
            ((ResultEncryptKeys.DataResult) encrypt).getValue();
            GeneralEncryptRequest generalEncryptRequest = new GeneralEncryptRequest(((ResultEncryptKeys.DataResult) encrypt).getPublicKey(), ((ResultEncryptKeys.DataResult) encrypt).getValue());
            Gson gson = new Gson();
            generalEncryptRequest.toString();
            ((ResultEncryptKeys.DataResult) encrypt).getPublicKey();
            ((ResultEncryptKeys.DataResult) encrypt).getValue();
            return gson.toJson(generalEncryptRequest, GeneralEncryptRequest.class);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private final String encryptValue(String value) {
        try {
            return encrypt(this.context, value);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private final Response getUpdateResponseBody(Response response) {
        String str = null;
        MediaType contentType = null;
        try {
            ResponseBody body = response.body();
            if (body == null) {
                Log.d("ServiceInterceptorK", "Response body is null, returning original response");
                return response;
            }
            contentType = body.contentType();
            str = body.string();
            if (str == null || str.isEmpty()) {
                Log.d("ServiceInterceptorK", "Response body string is null/empty");
                return response.newBuilder().body(ResponseBody.create(str != null ? str : "", contentType)).build();
            }
            Log.d("ServiceInterceptorK", "Response body (first 200 chars): " + str.substring(0, Math.min(str.length(), 200)));
            Gson gson = new Gson();
            GeneralEncryptResponse generalEncryptResponse = gson.fromJson(str, GeneralEncryptResponse.class);
            if (generalEncryptResponse == null || generalEncryptResponse.getResult() == null) {
                Log.d("ServiceInterceptorK", "Could not parse as GeneralEncryptResponse or result is null, returning original body");
                return response.newBuilder().body(ResponseBody.create(str, contentType)).build();
            }
            String decryptValue = decryptValue(generalEncryptResponse.getResult());
            if (decryptValue == null) {
                Log.d("ServiceInterceptorK", "Decryption returned null, returning original body");
                return response.newBuilder().body(ResponseBody.create(str, contentType)).build();
            }
            Log.d("ServiceInterceptorK", "Decryption successful, decrypted (first 200 chars): " + decryptValue.substring(0, Math.min(decryptValue.length(), 200)));
            generalEncryptResponse.setResult(decryptValue);
            JsonObject asJsonObject = JsonParser.parseString(decryptValue).getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
            String json = gson.toJson(new GeneralDecrypt(generalEncryptResponse, asJsonObject));
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return response.newBuilder().body(ResponseBody.create(json, contentType)).build();
        } catch (Exception e) {
            Log.e("ServiceInterceptorK", "Error processing response: " + e.getMessage(), e);
            // If we consumed the body, rebuild with the string we read
            if (str != null) {
                return response.newBuilder().body(ResponseBody.create(str, contentType)).build();
            }
            return response;
        }
    }

    private final Request requestUpdatedEncrypt(Request request) {
        return request.newBuilder().method(request.method(), updateBody(request)).build();
    }

    private final RequestBody updateBody(Request request) {
        String encryptValue;
        RequestBody body = request.body();
        try {
            String bodyToString = InterceptorUtil.INSTANCE.bodyToString(request);
            if (bodyToString != null && bodyToString.length() != 0 && (encryptValue = encryptValue(bodyToString)) != null && encryptValue.length() != 0) {
                return RequestBody.create(encryptValue, body != null ? body.contentType() : null);
            }
            return body;
        } catch (Exception e) {
            e.getMessage();
            return body;
        }
    }

    private final Request validateHeaders(Request request) {
        try {
            Headers.Builder newBuilder = request.headers().newBuilder();
            Headers headers = this.mandatoryHeaders;
            if (headers != null && headers.size() > 0) {
                for (Pair<? extends String, ? extends String> pair : this.mandatoryHeaders) {
                    newBuilder.add(pair.getFirst(), pair.getSecond());
                }
            }
            if (request.header("No-Authentication") == null) {
                PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
                newBuilder = newBuilder.add("Authorization", "Bearer " + (companion.getTokenTemporal(this.context) == null ? companion.getToken(this.context) : companion.getTokenTemporal(this.context)));
            }
            Headers build = newBuilder.build();
            Objects.toString(build);
            return request.newBuilder().headers(build).build();
        } catch (Exception e) {
            e.getMessage();
            return request;
        }
    }

    private final Response validateRequest(Interceptor.Chain chain, Request request) throws IOException {
        return chain.proceed(requestUpdatedEncrypt(request));
    }

    private final Response validateResponse(Response response) {
        return getUpdateResponseBody(response);
    }

    /**
     * For non-encrypted endpoints (KEY_PRIVATE_CONFIDENTIAL), the API returns a flat JSON response.
     * The app models expect the data wrapped in {"statusCode":...,"result":{...}}.
     * This method wraps the flat response into the expected format.
     */
    private final Response wrapFlatResponse(Response response) {
        String str = null;
        MediaType contentType = null;
        try {
            ResponseBody body = response.body();
            if (body == null) {
                return response;
            }
            contentType = body.contentType();
            str = body.string();
            if (str == null || str.isEmpty()) {
                return response.newBuilder().body(ResponseBody.create(str != null ? str : "", contentType)).build();
            }
            // Wrap the flat response: {"statusCode": <code>, "result": <original_body>}
            String wrapped = "{\"statusCode\":" + response.code() + ",\"result\":" + str + "}";
            Log.d("ServiceInterceptorK", "Wrapped flat response for non-encrypted endpoint");
            return response.newBuilder().body(ResponseBody.create(wrapped, contentType)).build();
        } catch (Exception e) {
            Log.e("ServiceInterceptorK", "Error wrapping response: " + e.getMessage(), e);
            if (str != null) {
                return response.newBuilder().body(ResponseBody.create(str, contentType)).build();
            }
            return response;
        }
    }

    /**
     * For non-encrypted endpoints (KEY_PRIVATE_CONFIDENTIAL), rewrite the URL
     * from /api/v2/ to /api/ since the v2 endpoints require server-side encryption.
     */
    private final Request rewriteUrlForPlainEndpoint(Request request) {
        String url = request.url().toString();
        String newUrl = url.replace("/api/v2/", "/api/");
        if (!url.equals(newUrl)) {
            Log.d("ServiceInterceptorK", "Rewriting URL: " + url + " -> " + newUrl);
            return request.newBuilder().url(newUrl).build();
        }
        return request;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request validateHeaders = validateHeaders(chain.request());
        if (validateHeaders.header("KEY_PRIVATE_CONFIDENTIAL") == null) {
            return validateResponse(validateRequest(chain, validateHeaders));
        } else {
            // Non-encrypted endpoint: rewrite URL to /api/ (skip v2 encryption middleware),
            // skip client-side encryption/decryption, and wrap successful responses
            Request rewritten = rewriteUrlForPlainEndpoint(validateHeaders);
            Response response = chain.proceed(rewritten);
            if (response.isSuccessful()) {
                return wrapFlatResponse(response);
            }
            return response;
        }
    }
}
