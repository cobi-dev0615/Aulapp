package com.gse.aulapp.util;

import android.app.Activity;
import android.content.Context;
import co.ceduladigital.sdk.e4;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.io.ReceptionsApiService;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumTimeClass;
import com.gse.aulapp.model.enumerate.EnumTypeDateTimeAcquisition;
import com.gse.aulapp.model.repository.DatetimeRepository;
import com.gse.aulapp.util.DialogUtil;
import com.karumi.dexter.BuildConfig;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.GlobalScope;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/ExternalUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ExternalUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static DatetimeRepository datetimeRepository = new DatetimeRepository();
    private static String datetime = BuildConfig.FLAVOR;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\t0\u000fJ;\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\t0\u000fH\u0002J;\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\t0\u000fH\u0002J\u000e\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/gse/aulapp/util/ExternalUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "datetimeRepository", "Lcom/gse/aulapp/model/repository/DatetimeRepository;", "datetime", BuildConfig.FLAVOR, "getDateTime", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "enumTime", "Lcom/gse/aulapp/model/enumerate/EnumTimeClass;", "listener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "getDateTimeApi", "getDateTimeBiometrics", "addSecondsToDate", "dateString", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumTypeDateTimeAcquisition.values().length];
                try {
                    iArr[EnumTypeDateTimeAcquisition.API.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumTypeDateTimeAcquisition.BACKEND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumTypeDateTimeAcquisition.LOCAL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumTypeDateTimeAcquisition.TRUST_DATE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit getDateTime$lambda$0(Function1 listener, String dateTime) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(dateTime, "dateTime");
            listener.invoke(dateTime);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit getDateTime$lambda$1(Function1 listener, String dateTime) {
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(dateTime, "dateTime");
            listener.invoke(dateTime);
            return Unit.INSTANCE;
        }

        private final void getDateTimeApi(Context context, EnumTimeClass enumTime, Function1<? super String, Unit> listener) {
            if (NetworkUtil.INSTANCE.isNetworkAvailable(context)) {
                ((ReceptionsApiService) new Retrofit.Builder().baseUrl("https://worldtimeapi.org/api/timezone/").addConverterFactory(GsonConverterFactory.create()).build().create(ReceptionsApiService.class)).getDatetimeWordTime().enqueue(new ExternalUtil$Companion$getDateTimeApi$1(listener, context, enumTime));
                return;
            }
            ExternalUtil.datetime = GpsUtil.INSTANCE.getDateTime(context);
            String str = ExternalUtil.datetime;
            Intrinsics.checkNotNull(str);
            listener.invoke(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void getDateTimeBiometrics(Context context, EnumTimeClass enumTime, Function1<? super String, Unit> listener) {
            Context context2;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                context2 = context;
            } catch (Exception e) {
                e = e;
                context2 = context;
            }
            try {
                BuildersKt.launch$default(GlobalScope.INSTANCE, null, null, new ExternalUtil$Companion$getDateTimeBiometrics$1(context2, objectRef, objectRef2, enumTime, listener, null), 3, null);
            } catch (Exception e2) {
                e = e2;
                LogSendUtil.INSTANCE.setLog(context2, q.i("datetime exception: ", e.getMessage()), "datetime", true);
                DialogUtil.Companion companion = DialogUtil.INSTANCE;
                Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
                DialogUtil.Companion.showErrorDialog$default(companion, (Activity) context2, EnumDialogType.DIALOG_TYPE_GENERAL_ERROR, null, null, e.getMessage(), false, null, 12, null);
            }
        }

        public final String addSecondsToDate(String dateString) {
            Intrinsics.checkNotNullParameter(dateString, "dateString");
            DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            try {
                try {
                    String format = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).format(ofPattern);
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    return format;
                } catch (DateTimeParseException unused) {
                    String format2 = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")).withSecond(0).format(ofPattern);
                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                    return format2;
                }
            } catch (DateTimeParseException unused2) {
                return dateString;
            }
        }

        public final void getDateTime(Context context, EnumTimeClass enumTime, Function1<? super String, Unit> listener) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(enumTime, "enumTime");
            Intrinsics.checkNotNullParameter(listener, "listener");
            int i = WhenMappings.$EnumSwitchMapping$0[Parameters.INSTANCE.getTYPE_DATETIME_ACQUISITION().ordinal()];
            if (i == 1) {
                getDateTimeApi(context, enumTime, new e4(0, listener));
                return;
            }
            if (i == 2) {
                getDateTimeBiometrics(context, enumTime, new e4(1, listener));
                return;
            }
            if (i == 3) {
                String date = new Date().toString();
                Intrinsics.checkNotNullExpressionValue(date, "toString(...)");
                String format = ZonedDateTime.parse(date, DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss 'GMT'XXX yyyy", Locale.US)).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                Intrinsics.checkNotNull(format);
                listener.invoke(format);
                return;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Object trustedTimeClient = GeneralApp.INSTANCE.getTrustedTimeClient();
            Long computeCurrentUnixEpochMillis = trustedTimeClient != null ? ((com.google.android.gms.time.TrustedTimeClient) trustedTimeClient).computeCurrentUnixEpochMillis() : null;
            if (computeCurrentUnixEpochMillis != null) {
                String format2 = Instant.ofEpochMilli(computeCurrentUnixEpochMillis.longValue()).atZone(ZoneId.of("America/Bogota")).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                Intrinsics.checkNotNull(format2);
                listener.invoke(format2);
            } else {
                String date2 = new Date().toString();
                Intrinsics.checkNotNullExpressionValue(date2, "toString(...)");
                String format3 = ZonedDateTime.parse(date2, DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss 'GMT'XXX yyyy", Locale.US)).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                Intrinsics.checkNotNull(format3);
                listener.invoke(format3);
            }
        }

        private Companion() {
        }
    }
}
