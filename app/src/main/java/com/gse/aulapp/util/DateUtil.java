package com.gse.aulapp.util;

import com.karumi.dexter.BuildConfig;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/DateUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DateUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "DateUtil";

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b7\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J-\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\tH\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b*\u0010#J\u001d\u0010.\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+¢\u0006\u0004\b0\u0010/J\u0015\u00101\u001a\u00020+2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b1\u00102J'\u00106\u001a\u00020\u00042\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020+H\u0007¢\u0006\u0004\b6\u00107J)\u00108\u001a\u00020\t2\b\u00103\u001a\u0004\u0018\u00010\t2\u0006\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020+H\u0007¢\u0006\u0004\b8\u00109J)\u0010<\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020+¢\u0006\u0004\b<\u00109J\u001f\u0010>\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004¢\u0006\u0004\b>\u0010)J\u0017\u0010@\u001a\u00020\u00042\u0006\u0010?\u001a\u00020\u0004H\u0007¢\u0006\u0004\b@\u0010\u001fJ\u0015\u0010A\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\bA\u0010#J\u0015\u0010C\u001a\u00020\u00042\u0006\u0010B\u001a\u00020+¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\bE\u0010#J\u0017\u0010F\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\bF\u0010GJ\u0017\u0010>\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b>\u0010\u001fR\u001c\u0010I\u001a\n H*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010L\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u0010JR\u0014\u0010M\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bM\u0010JR\u0014\u0010N\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bN\u0010JR\u0014\u0010O\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bO\u0010JR\u0014\u0010P\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\bP\u0010JR\u0014\u0010Q\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010JR\u0014\u0010R\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010JR\u0014\u0010S\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bS\u0010JR\u0014\u0010T\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u0010JR\u0014\u0010U\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bU\u0010JR\u0014\u0010V\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bV\u0010JR\u0014\u0010W\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bW\u0010JR\u0014\u0010X\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bX\u0010JR\u0014\u0010Y\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bY\u0010JR\u0014\u0010Z\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010JR\u0014\u0010[\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b[\u0010JR\u0014\u0010\\\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\\\u0010JR\u0014\u0010]\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b]\u0010JR\u0014\u0010^\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b^\u0010JR\u0014\u0010_\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b_\u0010JR\u0014\u0010`\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b`\u0010JR\u0014\u0010a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\ba\u0010J¨\u0006b"}, d2 = {"Lcom/gse/aulapp/util/DateUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "getNowDate", "()Ljava/lang/String;", BuildConfig.FLAVOR, "initTime", "Ljava/util/Date;", "getNowDateDate", "(Z)Ljava/util/Date;", BuildConfig.FLAVOR, "selection", "uTCSettingDate", "(J)Ljava/util/Date;", "patternDate", "uTCSettingDateToString", "(JLjava/lang/String;)Ljava/lang/String;", "uTCSettingLong", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "date", "Ljava/util/Locale;", "locale", "parseDate", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;)Ljava/util/Date;", "parseDateToString", "(Ljava/util/Date;Ljava/lang/String;)Ljava/lang/String;", "getDateLong", "()Ljava/lang/Long;", "parseDateToString12H", "(Ljava/lang/String;)Ljava/lang/String;", "convert24hTo12h", "dateNow", "getDateRequestFormat", "(Ljava/util/Date;)Ljava/lang/String;", "maxDate", "getDateInitialDay", "(Ljava/util/Date;Z)Ljava/util/Date;", "pattern", "getDateFromPattern", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Date;", "getDateFormatToGeneral", BuildConfig.FLAVOR, "year", "month", "getLastDayOfMonth", "(II)Ljava/lang/String;", "getFirstDayOfMonth", "getMonthNumber", "(Ljava/util/Date;)I", "currentDate", "calendarField", "calendarAmount", "getDateNextRequestFormat", "(Ljava/util/Date;II)Ljava/lang/String;", "getDateNext", "(Ljava/util/Date;II)Ljava/util/Date;", "unit", "value", "addUnitToDate", "time", "getDateFromString", "dateString", "dayMonthByMonth", "getMonthFormat", "currentMonth", "getMonthBySymbols", "(I)Ljava/lang/String;", "getYearByDate", "parseDateLongToString12h", "(Ljava/lang/Long;)Ljava/lang/String;", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "PATTERN_FORMAT_DATE_VIEW", "PATTERN_FORMAT_DATE_GENERAL", "PATTERN_FORMAT_DATE_GENERAL_2", "PATTERN_FORMAT_HH_MM_SS_SSS", "PATTERN_FORMAT_DATE_GENERAL_STRING", "PATTERN_FORMAT_DATE_GENERAL_UTC", "PATTERN_FORMAT_DATE_12H", "PATTERN_FORMAT_DATE_24H", "AM_MAYUS", "AM_MAYUS_2", "AM_MINUS", "PM_MAYUS", "PM_MAYUS_2", "PM_MINUS", "AM", "PM", "PATTERN_FORMAT_DATE_GENERAL_HOUR_MINUTE", "PATTERN_FORMAT_DATE_GENERAL_HOUR_MINUTE_SECONDS", "PATTERN_FORMAT_DATE_GENERAL_HOUR_MINUTE_AM_PM", "PATTERN_FORMAT_DATE_DAY_MONTH", "PATTERN_FORMAT_DATE_MONTH", "PATTERN_FORMAT_DATE_YEAR", "PATTERN_FORMAT_HH_MM_SS", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nDateUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateUtil.kt\ncom/gse/aulapp/util/DateUtil$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,442:1\n1#2:443\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Date getNowDateDate$default(Companion companion, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return companion.getNowDateDate(z);
        }

        public final Date addUnitToDate(Date date, int unit, int value) {
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(unit, value);
            return calendar.getTime();
        }

        public final String convert24hTo12h(String date) {
            String replaceAfterResult;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a", Locale.getDefault());
            String str = null;
            Date parseDate = parseDate(date, "HH:mm", null);
            if (parseDate != null) {
                String format = simpleDateFormat.format(parseDate);
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                replaceAfterResult = StringsKt.replaceAfterResult(format.replace("AM", "am").replace("A.M", "am").replace("PM", "pm").replace("P.M", "pm").replace("p.", "p").replace("a.", "a").replace("m.", "m"), "a", "m", (String) null, 4, (Object) null);
                str = StringsKt.replaceAfterResult(replaceAfterResult, "p", "m", (String) null, 4, (Object) null);
            }
            return str == null ? BuildConfig.FLAVOR : str;
        }

        public final String dayMonthByMonth(String dateString) {
            Intrinsics.checkNotNullParameter(dateString, "dateString");
            String format = new SimpleDateFormat("MMMM", Locale.getDefault()).format(new SimpleDateFormat("dd MMMM", Locale.getDefault()).parse(dateString));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        public final String getDateFormatToGeneral(Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            String format = new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()).format(date);
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        public final Date getDateFromPattern(String date, String pattern) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            try {
                return new SimpleDateFormat(pattern, Locale.getDefault()).parse(date);
            } catch (Exception e) {
                String unused = DateUtil.TAG;
                e.getMessage();
                return null;
            }
        }

        public final Date getDateFromString(String date, String time) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(time, "time");
            try {
                Date parseDate = parseDate(date, "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", null);
                Date parseDate2 = parseDate(time, "HH:mm", null);
                if (parseDate != null && parseDate2 != null) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(parseDate);
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(parseDate2);
                    calendar.set(11, calendar2.get(11));
                    calendar.set(12, calendar2.get(12));
                    calendar.set(13, calendar2.get(13));
                    return calendar.getTime();
                }
                return null;
            } catch (Exception e) {
                String unused = DateUtil.TAG;
                e.getMessage();
                return null;
            }
        }

        public final Date getDateInitialDay(Date maxDate, boolean initTime) {
            Intrinsics.checkNotNullParameter(maxDate, "maxDate");
            Calendar calendar = Calendar.getInstance();
            try {
                calendar.setTime(maxDate);
                if (initTime) {
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                } else {
                    calendar.set(11, 23);
                    calendar.set(12, 59);
                    calendar.set(13, 59);
                }
            } catch (Exception e) {
                String unused = DateUtil.TAG;
                e.getMessage();
            }
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
            return time;
        }

        public final Long getDateLong() {
            return ConverterUtil.INSTANCE.dateToTimestamp(DateUtil.INSTANCE.addUnitToDate(parseDate(parseDateToString(new Date(), "yyyy-MM-dd HH:mm"), "yyyy-MM-dd HH:mm", Locale.getDefault()), 12, 0));
        }

        public final Date getDateNext(Date currentDate, int calendarField, int calendarAmount) {
            try {
                if (currentDate == null) {
                    return getNowDateDate$default(this, false, 1, null);
                }
                Calendar calendar = Calendar.getInstance();
                Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
                calendar.setTime(currentDate);
                calendar.add(calendarField, calendarAmount);
                return calendar.getTime();
            } catch (Exception e) {
                String unused = DateUtil.TAG;
                e.getMessage();
                return getNowDateDate$default(this, false, 1, null);
            }
        }

        public final String getDateNextRequestFormat(Date currentDate, int calendarField, int calendarAmount) {
            Intrinsics.checkNotNullParameter(currentDate, "currentDate");
            try {
                return getDateRequestFormat(getDateNext(currentDate, calendarField, calendarAmount));
            } catch (Exception e) {
                String unused = DateUtil.TAG;
                e.getMessage();
                return getNowDate();
            }
        }

        public final String getDateRequestFormat(String dateNow) {
            Intrinsics.checkNotNullParameter(dateNow, "dateNow");
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY", Locale.getDefault());
                Date parseDate = parseDate(dateNow, "yyyy-MM-dd hh:mm:ss", null);
                String format = parseDate != null ? simpleDateFormat.format(parseDate) : null;
                return format == null ? BuildConfig.FLAVOR : format;
            } catch (Exception unused) {
                return BuildConfig.FLAVOR;
            }
        }

        public final String getFirstDayOfMonth(int year, int month) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, 1);
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
            return getDateFormatToGeneral(time);
        }

        public final String getLastDayOfMonth(int year, int month) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, 1);
            calendar.add(2, 1);
            calendar.add(5, -1);
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
            return getDateFormatToGeneral(time);
        }

        public final String getMonthBySymbols(int currentMonth) {
            String replaceFirst$default;
            String str = new DateFormatSymbols(Locale.getDefault()).getMonths()[currentMonth];
            Intrinsics.checkNotNull(str);
            replaceFirst$default = StringsKt.replaceFirst(str, str.charAt(0), Character.toUpperCase(str.charAt(0)), false);
            return replaceFirst$default;
        }

        public final String getMonthFormat(Date selection) {
            String replaceFirst$default;
            Intrinsics.checkNotNullParameter(selection, "selection");
            String format = new SimpleDateFormat("MMMM", Locale.getDefault()).format(selection);
            Intrinsics.checkNotNull(format);
            replaceFirst$default = StringsKt.replaceFirst(format, format.charAt(0), Character.toUpperCase(format.charAt(0)), false);
            return replaceFirst$default;
        }

        public final int getMonthNumber(Date date) {
            Intrinsics.checkNotNullParameter(date, "date");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            return calendar.get(2);
        }

        public final String getNowDate() {
            String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        public final Date getNowDateDate(boolean initTime) {
            Calendar calendar = Calendar.getInstance();
            if (initTime) {
                try {
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                } catch (Exception e) {
                    String unused = DateUtil.TAG;
                    e.getMessage();
                }
            }
            Date time = calendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
            return time;
        }

        public final String getYearByDate(Date selection) {
            Intrinsics.checkNotNullParameter(selection, "selection");
            String format = new SimpleDateFormat("yyyy").format(selection);
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        public final Date parseDate(String date, String patternDate, Locale locale) {
            SimpleDateFormat simpleDateFormat = locale != null ? new SimpleDateFormat(patternDate, locale) : new SimpleDateFormat(patternDate, Locale.US);
            if (date == null) {
                return null;
            }
            try {
                if (date.length() == 0 || Intrinsics.areEqual(date, BuildConfig.FLAVOR)) {
                    return null;
                }
                return simpleDateFormat.parse(date);
            } catch (ParseException e) {
                String unused = DateUtil.TAG;
                e.getMessage();
                return null;
            }
        }

        public final String parseDateLongToString12h(Long date) {
            String str;
            boolean equals;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm a", Locale.US);
            Date date2 = date != null ? new Date(date.longValue()) : null;
            String format = date2 != null ? simpleDateFormat.format(date2) : null;
            if (date2 != null) {
                String format2 = simpleDateFormat.format(date2);
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                str = StringsKt.takeLast(format2, 2);
            } else {
                str = null;
            }
            equals = StringsKt.equals(str, "AM", true);
            String str2 = equals ? "AM" : "PM";
            if (str != null) {
                String t = format != null ? format.replace(str, str2) : null;
                if (t != null) {
                    return t;
                }
            }
            return new String();
        }

        public final String parseDateToString(Date date, String patternDate) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patternDate, Locale.getDefault());
            if (date != null) {
                return simpleDateFormat.format(date);
            }
            return null;
        }

        public final String parseDateToString12H(String date) {
            if (date != null && date.length() != 0) {
                if (new Regex("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$").matches(date)) {
                    return convert24hTo12h(date);
                }
                if (new Regex("^([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01]) ([01][0-9]|2[0-3]):[0-5][0-9]$").matches(date)) {
                    String substring = date.substring(11);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    return convert24hTo12h(substring);
                }
                if (new Regex("^([0-9]{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01]) ([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]$").matches(date)) {
                    String substring2 = date.substring(11, 16);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    return convert24hTo12h(substring2);
                }
                if (new Regex("^([0-9]{4})\\/(0[1-9]|1[0-2])\\/(0[1-9]|[12][0-9]|3[01]) (0[1-9]|1[0-2]):[0-5][0-9] ?([aApP]\\.?[mM]\\.?)$").matches(date)) {
                    Date parseDate = parseDate(date, "yyyy/MM/dd hh:mm a", null);
                    if (parseDate != null) {
                        String convert24hTo12h = DateUtil.INSTANCE.convert24hTo12h(new SimpleDateFormat("HH:mm", Locale.getDefault()).format(parseDate));
                        if (convert24hTo12h != null) {
                            return convert24hTo12h;
                        }
                    }
                    return BuildConfig.FLAVOR;
                }
                String unused = DateUtil.TAG;
            }
            return BuildConfig.FLAVOR;
        }

        public final Date uTCSettingDate(long selection) {
            Intrinsics.checkNotNullExpressionValue(TimeZone.getDefault(), "getDefault(...)");
            return new Date(selection + (r0.getOffset(new Date().getTime()) * (-1)));
        }

        public final String uTCSettingDateToString(long selection, String patternDate) {
            Intrinsics.checkNotNullParameter(patternDate, "patternDate");
            String parseDateToString = parseDateToString(uTCSettingDate(selection), patternDate);
            return parseDateToString == null ? BuildConfig.FLAVOR : parseDateToString;
        }

        public final Long uTCSettingLong(String selection, String patternDate) {
            Intrinsics.checkNotNullParameter(patternDate, "patternDate");
            Date parseDate = parseDate(selection, patternDate, null);
            if (parseDate == null) {
                return null;
            }
            return Long.valueOf(parseDate.getTime());
        }

        private Companion() {
        }

        public final String getDateRequestFormat(Date dateNow) {
            Intrinsics.checkNotNullParameter(dateNow, "dateNow");
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY", Locale.getDefault());
                Date parseDate = parseDate(dateNow.toString(), "EEE MMM dd HH:mm:ss zzz yyyy", null);
                String format = parseDate != null ? simpleDateFormat.format(parseDate) : null;
                return format == null ? BuildConfig.FLAVOR : format;
            } catch (Exception unused) {
                return BuildConfig.FLAVOR;
            }
        }

        public final String getDateFromString(String date) {
            Intrinsics.checkNotNullParameter(date, "date");
            Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(date);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Intrinsics.checkNotNull(parse, "null cannot be cast to non-null type java.util.Date");
            return simpleDateFormat.format(parse).toString();
        }
    }
}
