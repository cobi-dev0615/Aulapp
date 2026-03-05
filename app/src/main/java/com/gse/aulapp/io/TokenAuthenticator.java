package com.gse.aulapp.io;

import android.content.Context;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.RefreshTokenUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\u000f"}, d2 = {"Lcom/gse/aulapp/io/TokenAuthenticator;", "Lokhttp3/Authenticator;", "<init>", "()V", "authenticate", "Lokhttp3/Request;", "route", "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "getAccessToken", BuildConfig.FLAVOR, "validateReTry", "responseCount", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTokenAuthenticator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenAuthenticator.kt\ncom/gse/aulapp/io/TokenAuthenticator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* loaded from: classes.dex */
public final class TokenAuthenticator implements Authenticator {
    private final void getAccessToken() {
        RefreshTokenUtil.Companion companion = RefreshTokenUtil.INSTANCE;
        Context applicationContext = GeneralApp.INSTANCE.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        companion.refreshToken(applicationContext);
    }

    private final int responseCount(Response response) {
        int i = 1;
        while (true) {
            Response priorResponse = response.getPriorResponse();
            if (priorResponse != null) {
                response = priorResponse;
            } else {
                priorResponse = null;
            }
            if (priorResponse == null) {
                return i;
            }
            i++;
        }
    }

    private final Request validateReTry(Response response) {
        if (responseCount(response) >= 3) {
            return null;
        }
        PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
        Context applicationContext = GeneralApp.INSTANCE.getInstance().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return response.getRequest().newBuilder().header("Authorization", q.i("Bearer ", companion.getToken(applicationContext))).build();
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) {
        Request validateReTry;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.getCode() != 401) {
            return null;
        }
        synchronized (this) {
            PreferenceUtil.INSTANCE.clearToken(GeneralApp.INSTANCE.getInstance().getApplicationContext());
            getAccessToken();
            validateReTry = validateReTry(response);
        }
        return validateReTry;
    }
}
