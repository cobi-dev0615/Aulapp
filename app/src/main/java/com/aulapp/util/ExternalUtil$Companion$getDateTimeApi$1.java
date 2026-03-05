package com.gse.aulapp.util;

import android.content.Context;
import co.ceduladigital.sdk.e4;
import com.gse.aulapp.model.enumerate.EnumTimeClass;
import com.gse.aulapp.model.response.TimezoneResponse;
import com.karumi.dexter.BuildConfig;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J$\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/gse/aulapp/util/ExternalUtil$Companion$getDateTimeApi$1", "Lretrofit2/Callback;", "Lcom/gse/aulapp/model/response/TimezoneResponse;", "onResponse", BuildConfig.FLAVOR, "call", "Lretrofit2/Call;", "response", "Lretrofit2/Response;", "onFailure", "t", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExternalUtil$Companion$getDateTimeApi$1 implements Callback<TimezoneResponse> {
    final /* synthetic */ Context $context;
    final /* synthetic */ EnumTimeClass $enumTime;
    final /* synthetic */ Function1<String, Unit> $listener;

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalUtil$Companion$getDateTimeApi$1(Function1<? super String, Unit> function1, Context context, EnumTimeClass enumTimeClass) {
        this.$listener = function1;
        this.$context = context;
        this.$enumTime = enumTimeClass;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFailure$lambda$1(Function1 listener, String datetime) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(datetime, "datetime");
        listener.invoke(datetime);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResponse$lambda$0(Function1 listener, String datetime) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(datetime, "datetime");
        listener.invoke(datetime);
        return Unit.INSTANCE;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call<TimezoneResponse> call, Throwable t) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t, "t");
        ExternalUtil.INSTANCE.getDateTimeBiometrics(this.$context, this.$enumTime, new e4(2, this.$listener));
    }

    @Override // retrofit2.Callback
    public void onResponse(Call<TimezoneResponse> call, Response<TimezoneResponse> response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        if (!response.isSuccessful()) {
            ExternalUtil.INSTANCE.getDateTimeBiometrics(this.$context, this.$enumTime, new e4(3, this.$listener));
            return;
        }
        TimezoneResponse body = response.body();
        String datetime = body != null ? body.getDatetime() : null;
        if (body != null) {
            body.getTimezone();
        }
        if (datetime == null) {
            datetime = ExternalUtil.datetime;
        }
        String format = ZonedDateTime.parse(datetime, DateTimeFormatter.ISO_OFFSET_DATE_TIME).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Function1<String, Unit> function1 = this.$listener;
        Intrinsics.checkNotNull(format);
        function1.invoke(format);
    }
}
