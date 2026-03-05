package com.gse.aulapp.util;

import android.app.Activity;
import android.content.Context;
import co.ceduladigital.sdk.o1;
import com.gse.aulapp.model.data.entity.SessionEntity;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.enumerate.EnumTimeClass;
import com.gse.aulapp.util.ExternalUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.karumi.dexter.BuildConfig;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/ValidateHoursUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ValidateHoursUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String tag;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\"\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/gse/aulapp/util/ValidateHoursUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "tag", BuildConfig.FLAVOR, "getTag", "()Ljava/lang/String;", "validateStartClass", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "sessionFull", "Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;", "entryTime", "getElapsedTime", "callback", "Lkotlin/Function1;", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit getElapsedTime$lambda$0(Ref.ObjectRef storedStartDate, Function1 callback, String datetime) {
            Intrinsics.checkNotNullParameter(storedStartDate, "$storedStartDate");
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(datetime, "datetime");
            DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime parse = LocalDateTime.parse((CharSequence) storedStartDate.element, ofPattern);
            LocalDateTime parse2 = LocalDateTime.parse(datetime, ofPattern);
            long j = 0;
            if (parse2 != null) {
                long millis = Duration.between(parse, parse2).toMillis();
                if (millis >= 0) {
                    j = millis;
                }
            }
            callback.invoke(Long.valueOf(j));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.CharSequence, java.lang.String] */
        /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
        public final void getElapsedTime(Context context, Function1<? super Long, Unit> callback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? startClassOrExam = PreferenceUtil.INSTANCE.getStartClassOrExam(context);
            objectRef.element = startClassOrExam;
            if (startClassOrExam == 0 || startClassOrExam.length() == 0) {
                callback.invoke(0L);
                return;
            }
            ExternalUtil.Companion companion = ExternalUtil.INSTANCE;
            objectRef.element = companion.addSecondsToDate((String) objectRef.element);
            companion.getDateTime((Activity) context, EnumTimeClass.GET_DATE_TIME, new o1(objectRef, callback, 7));
        }

        public final String getTag() {
            return ValidateHoursUtil.tag;
        }

        public final void validateStartClass(Context context, SessionFull sessionFull, String entryTime) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionFull, "sessionFull");
            Intrinsics.checkNotNullParameter(entryTime, "entryTime");
            PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
            String startClassOrExam = companion.getStartClassOrExam(context);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
            SessionEntity session = sessionFull.getSession();
            Date date = null;
            String id = session != null ? session.getId() : null;
            Intrinsics.checkNotNull(id);
            companion.saveSessionIdByTimeService(context, id);
            if (startClassOrExam == null || startClassOrExam.length() == 0) {
                getTag();
                Parameters.INSTANCE.setINITIAL_TIME(0L);
                companion.saveStartClassOrExam(context, entryTime);
            } else {
                try {
                    date = simpleDateFormat.parse(startClassOrExam);
                } catch (ParseException unused) {
                    getTag();
                }
                if (date == null) {
                    Parameters.INSTANCE.setINITIAL_TIME(0L);
                    getTag();
                }
            }
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("ValidateHoursUtil", "getSimpleName(...)");
        tag = "ValidateHoursUtil";
    }
}
