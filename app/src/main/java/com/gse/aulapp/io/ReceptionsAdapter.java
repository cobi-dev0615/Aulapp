package com.gse.aulapp.io;

import android.content.Context;
import com.gse.aulapp.util.Parameters;
import com.karumi.dexter.BuildConfig;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/io/ReceptionsAdapter;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ReceptionsAdapter {
    private static ReceptionsApiService API_SERVICE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String TAG = "ReceptionsAdapter";

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\r"}, d2 = {"Lcom/gse/aulapp/io/ReceptionsAdapter$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "API_SERVICE", "Lcom/gse/aulapp/io/ReceptionsApiService;", "TAG", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "Ljava/lang/String;", "getApiService", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReceptionsApiService getApiService(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() { // from class: com.gse.aulapp.io.ReceptionsAdapter$Companion$getApiService$customLogger$1
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String message) {
                    String unused;
                    Intrinsics.checkNotNullParameter(message, "message");
                    unused = ReceptionsAdapter.TAG;
                }
            });
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            builder.connectTimeout(5L, timeUnit);
            builder.writeTimeout(5L, timeUnit);
            builder.readTimeout(5L, timeUnit);
            Headers.Builder builder2 = new Headers.Builder();
            Parameters.Companion companion = Parameters.INSTANCE;
            Headers build = builder2.add("X-App", companion.getX_APP_VALUE()).add("Client", "2.1.4").build();
            if (ReceptionsAdapter.API_SERVICE == null) {
                Retrofit build2 = new Retrofit.Builder().baseUrl(companion.getPARAMETERS_API_SERVER_BASE_URL()).addConverterFactory(GsonConverterFactory.create()).client(builder.addInterceptor(new ServiceInterceptorK(context, build)).addNetworkInterceptor(httpLoggingInterceptor).authenticator(new TokenAuthenticator()).build()).build();
                Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
                ReceptionsAdapter.API_SERVICE = (ReceptionsApiService) build2.create(ReceptionsApiService.class);
            }
            return ReceptionsAdapter.API_SERVICE;
        }

        private Companion() {
        }
    }
}
