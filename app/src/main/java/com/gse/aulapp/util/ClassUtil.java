package com.gse.aulapp.util;

import android.content.Context;
import co.ceduladigital.sdk.c0;
import co.ceduladigital.sdk.o1;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.model.converter.ConfigurationSessionTypeConverter;
import com.gse.aulapp.model.data.ClassDate;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.enumerate.EnumStatusAppointment;
import com.gse.aulapp.model.enumerate.EnumTimeClass;
import com.gse.aulapp.model.enumerate.EnumTypeConfiguration;
import com.gse.aulapp.util.ClassUtil;
import com.gse.aulapp.util.DateUtil;
import com.karumi.dexter.BuildConfig;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001cJA\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0004H\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010)\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0005H\u0000¢\u0006\u0004\b'\u0010(Ja\u0010/\u001a\u00020-2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010+\u001a\u00020*2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020-0,¢\u0006\u0004\b/\u00100J\u0019\u00104\u001a\u0004\u0018\u00010\u00102\u0006\u00101\u001a\u00020\rH\u0000¢\u0006\u0004\b2\u00103R\u0016\u00105\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/gse/aulapp/util/ClassUtil;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/SessionDto;", "session", "Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;", "configList", "setConfigSession", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Ljava/util/Calendar;", "calendar", BuildConfig.FLAVOR, "getDayStatus", "(Ljava/util/Calendar;)Ljava/lang/String;", "Ljava/util/Date;", "classStartDate", "classEndDate", BuildConfig.FLAVOR, "marginInMinutes", "marginOutMinutes", "statusAppointment", "currentDate", BuildConfig.FLAVOR, "isValidDateTimeClass", "(Ljava/util/Date;Ljava/util/Date;IILjava/lang/String;Ljava/util/Date;)Z", "isYesterday", "(Ljava/util/Calendar;)Z", "isToday", "isTomorrow", "classDetailList", "Lcom/gse/aulapp/util/ClassUtil$FilterType;", "filterType", "Lcom/gse/aulapp/model/data/ClassDate;", "groupClassDetailsByFilterType$app_release", "(Ljava/util/List;Lcom/gse/aulapp/util/ClassUtil$FilterType;Ljava/util/List;)Ljava/util/List;", "groupClassDetailsByFilterType", "classDetail", "isClassEndBeforeToday$app_release", "(Lcom/gse/aulapp/model/dto/SessionDto;)Z", "isClassEndBeforeToday", "Landroid/content/Context;", "context", "Lkotlin/Function1;", BuildConfig.FLAVOR, "onResult", "classStartsSoon", "(Ljava/util/Date;Ljava/util/Date;IILandroid/content/Context;Ljava/util/Date;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "dateString", "parseStringToDate$app_release", "(Ljava/lang/String;)Ljava/util/Date;", "parseStringToDate", "TAG", "Ljava/lang/String;", "showEmptyClass", "Z", "FilterType", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClassUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassUtil.kt\ncom/gse/aulapp/util/ClassUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,335:1\n1485#2:336\n1510#2,3:337\n1513#2,3:347\n1863#2:350\n295#2,2:351\n1864#2:353\n381#3,7:340\n1#4:354\n*S KotlinDebug\n*F\n+ 1 ClassUtil.kt\ncom/gse/aulapp/util/ClassUtil\n*L\n57#1:336\n57#1:337,3\n57#1:347,3\n154#1:350\n159#1:351,2\n154#1:353\n57#1:340,7\n*E\n"})
/* loaded from: classes.dex */
public final class ClassUtil {
    private final String TAG = Reflection.getOrCreateKotlinClass(ClassUtil.class).getSimpleName();
    private boolean showEmptyClass = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/gse/aulapp/util/ClassUtil$FilterType;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "CHIP", "DATE", "DEFAULT", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FilterType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FilterType[] $VALUES;
        public static final FilterType CHIP = new FilterType("CHIP", 0);
        public static final FilterType DATE = new FilterType("DATE", 1);
        public static final FilterType DEFAULT = new FilterType("DEFAULT", 2);

        private static final /* synthetic */ FilterType[] $values() {
            return new FilterType[]{CHIP, DATE, DEFAULT};
        }

        static {
            FilterType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = null; // EnumEntriesKt.enumEntries requires actual enum type
        }

        private FilterType(String str, int i) {
        }

        public static FilterType valueOfString(String str) {
            return (FilterType) Enum.valueOf(FilterType.class, str);
        }

        public static FilterType[] values() {
            return (FilterType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FilterType.values().length];
            try {
                iArr[FilterType.CHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterType.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[EnumStatusAppointment.values().length];
            try {
                iArr2[EnumStatusAppointment.UNDER_DEVELOPMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumStatusAppointment.TO_BE_DEVELOPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static /* synthetic */ void classStartsSoon$default(ClassUtil classUtil, Date date, Date date2, int i, int i2, Context context, Date date3, String str, Function1 function1, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            date3 = null;
        }
        if ((i3 & 64) != 0) {
            str = EnumStatusAppointment.name$default(EnumStatusAppointment.DEFAULT, null, 1, null);
        }
        classUtil.classStartsSoon(date, date2, i, i2, context, date3, str, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit classStartsSoon$lambda$10(ClassUtil this$0, Date classStartDate, Date classEndDate, int i, int i2, String str, Function1 onResult, String dateTime) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(classStartDate, "$classStartDate");
        Intrinsics.checkNotNullParameter(classEndDate, "$classEndDate");
        Intrinsics.checkNotNullParameter(onResult, "$onResult");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Date parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(dateTime);
        if (parse == null) {
            parse = new Date();
        }
        onResult.invoke(Boolean.valueOf(this$0.isValidDateTimeClass(classStartDate, classEndDate, i, i2, str, parse)));
        return Unit.INSTANCE;
    }

    private final String getDayStatus(Calendar calendar) {
        if (isToday(calendar)) {
            String string = GeneralApp.INSTANCE.getInstance().getApplicationContext().getString(R.string.today);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
        if (isYesterday(calendar)) {
            String string2 = GeneralApp.INSTANCE.getInstance().getApplicationContext().getString(R.string.yesterday);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (!isTomorrow(calendar)) {
            return BuildConfig.FLAVOR;
        }
        String string3 = GeneralApp.INSTANCE.getInstance().getApplicationContext().getString(R.string.tomorrow);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable groupClassDetailsByFilterType$lambda$0(SimpleDateFormat dateSimpleFormat, ClassUtil this$0, SessionDto it) {
        Intrinsics.checkNotNullParameter(dateSimpleFormat, "$dateSimpleFormat");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String date = it.getDate();
        Intrinsics.checkNotNull(date);
        Date parseStringToDate$app_release = this$0.parseStringToDate$app_release(date);
        Intrinsics.checkNotNull(parseStringToDate$app_release);
        return dateSimpleFormat.format(parseStringToDate$app_release);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable groupClassDetailsByFilterType$lambda$1(SimpleDateFormat timeFormat, SessionDto it) {
        Intrinsics.checkNotNullParameter(timeFormat, "$timeFormat");
        Intrinsics.checkNotNullParameter(it, "it");
        String start = it.getStart();
        Intrinsics.checkNotNull(start);
        return timeFormat.parse(start);
    }

    private final boolean isToday(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    private final boolean isTomorrow(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(6, 1);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    private final boolean isValidDateTimeClass(Date classStartDate, Date classEndDate, int marginInMinutes, int marginOutMinutes, String statusAppointment, Date currentDate) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(classStartDate);
        calendar.add(12, -marginInMinutes);
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(classStartDate);
        calendar2.add(12, marginOutMinutes);
        Date time2 = calendar2.getTime();
        int i = WhenMappings.$EnumSwitchMapping$1[EnumStatusAppointment.INSTANCE.getEnumByName(statusAppointment).ordinal()];
        return i != 1 ? (i != 2 || currentDate.before(time) || currentDate.after(time2)) ? false : true : (currentDate.before(time) || currentDate.after(classEndDate)) ? false : true;
    }

    private final boolean isYesterday(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(6, -1);
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    private final List<SessionDto> setConfigSession(List<SessionDto> session, List<ConfigurationSessionDto> configList) {
        ConfigurationSessionDto configurationSessionDto;
        Object obj;
        List<SessionDto> mutableList = CollectionsKt.toMutableList((Collection) session);
        for (SessionDto sessionDto : mutableList) {
            EnumTypeConfiguration type = ConfigurationSessionTypeConverter.INSTANCE.getType(sessionDto.getType());
            if (configList != null) {
                Iterator<T> it = configList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    ConfigurationSessionDto configurationSessionDto2 = (ConfigurationSessionDto) next;
                    if (Intrinsics.areEqual(configurationSessionDto2 != null ? configurationSessionDto2.getType() : null, type.name())) {
                        obj = next;
                        break;
                    }
                }
                configurationSessionDto = (ConfigurationSessionDto) obj;
                if (configurationSessionDto != null) {
                    sessionDto.setMinToleranceEntryAfter(Integer.valueOf(configurationSessionDto.getMinToleranceEntryAfter()));
                    sessionDto.setMinToleranceEntryBefore(Integer.valueOf(configurationSessionDto.getMinToleranceEntryBefore()));
                }
            }
            configurationSessionDto = new ConfigurationSessionDto(null, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
            sessionDto.setMinToleranceEntryAfter(Integer.valueOf(configurationSessionDto.getMinToleranceEntryAfter()));
            sessionDto.setMinToleranceEntryBefore(Integer.valueOf(configurationSessionDto.getMinToleranceEntryBefore()));
        }
        return mutableList;
    }

    public final void classStartsSoon(final Date classStartDate, final Date classEndDate, final int marginInMinutes, final int marginOutMinutes, Context context, Date currentDate, final String statusAppointment, final Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(classStartDate, "classStartDate");
        Intrinsics.checkNotNullParameter(classEndDate, "classEndDate");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        if (currentDate == null) {
            ExternalUtil.INSTANCE.getDateTime(context, EnumTimeClass.GET_DATE_TIME, new Function1() { // from class: co.ceduladigital.sdk.s2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit classStartsSoon$lambda$10;
                    ClassUtil classUtil = ClassUtil.this;
                    int i = marginOutMinutes;
                    String str = statusAppointment;
                    classStartsSoon$lambda$10 = ClassUtil.classStartsSoon$lambda$10(classUtil, classStartDate, classEndDate, marginInMinutes, i, str, onResult, (String) obj);
                    return classStartsSoon$lambda$10;
                }
            });
        } else {
            onResult.invoke(Boolean.valueOf(isValidDateTimeClass(classStartDate, classEndDate, marginInMinutes, marginOutMinutes, statusAppointment, currentDate)));
        }
    }

    public final List<ClassDate> groupClassDetailsByFilterType$app_release(List<SessionDto> classDetailList, FilterType filterType, List<ConfigurationSessionDto> configList) {
        List sortedWith;
        Comparable minOrNull;
        Comparable maxOrNull;
        List<SessionDto> list;
        String str;
        int i = 0;
        int i2 = 1;
        Intrinsics.checkNotNullParameter(classDetailList, "classDetailList");
        if (classDetailList.isEmpty()) {
            return CollectionsKt.listOf(new ClassDate());
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        sortedWith = CollectionsKt.sortedWith(classDetailList, ComparisonsKt.compareBy(new o1(simpleDateFormat, this, i2), new c0(new SimpleDateFormat("HH:mm", Locale.getDefault()), 4)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sortedWith) {
            String date = ((SessionDto) obj).getDate();
            Intrinsics.checkNotNull(date);
            String substring = date.substring(0, 10);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            Date parse = simpleDateFormat.parse(substring);
            Object obj2 = linkedHashMap.get(parse);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(parse, obj2);
            }
            ((List) obj2).add(obj);
        }
        minOrNull = CollectionsKt.minOrNull((Iterable<? extends Comparable>) ((Iterable) linkedHashMap.keySet()));
        maxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Comparable>) ((Iterable) linkedHashMap.keySet()));
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList = new ArrayList();
        DateUtil.Companion companion = DateUtil.INSTANCE;
        Date nowDateDate = companion.getNowDateDate(true);
        int i3 = filterType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[filterType.ordinal()];
        if (i3 == 1) {
            this.showEmptyClass = false;
        } else if (i3 == 2) {
            this.showEmptyClass = false;
            if (isClassEndBeforeToday$app_release((SessionDto) sortedWith.get(0))) {
                nowDateDate = parseStringToDate$app_release(String.valueOf(((SessionDto) sortedWith.get(0)).getDate()));
            }
        } else if (i3 == 3) {
            this.showEmptyClass = true;
        }
        Intrinsics.checkNotNull(nowDateDate);
        Date dateNext = companion.getDateNext(companion.getDateInitialDay(nowDateDate, false), 2, 1);
        if (dateNext != null) {
            calendar.setTime(nowDateDate);
            while (calendar.getTime().compareTo(dateNext) <= 0) {
                Date time = calendar.getTime();
                Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
                arrayList.add(time);
                calendar.add(5, 1);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj3 = arrayList.get(i);
            i++;
            Date date2 = (Date) obj3;
            Date parse2 = simpleDateFormat.parse(simpleDateFormat.format(date2));
            if (this.showEmptyClass) {
                list = (List) linkedHashMap.get(parse2 == null ? date2 : parse2);
                if (list == null) {
                    list = CollectionsKt.listOf(new SessionDto());
                }
            } else {
                list = (List) linkedHashMap.get(parse2 == null ? date2 : parse2);
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
            }
            if (!list.isEmpty() || this.showEmptyClass) {
                if (parse2 != null) {
                    date2 = parse2;
                }
                calendar.setTime(date2);
                int i4 = calendar.get(5);
                String displayName = calendar.getDisplayName(2, 2, Locale.getDefault());
                if (displayName != null) {
                    str = displayName.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
                } else {
                    str = null;
                }
                Intrinsics.checkNotNull(calendar);
                arrayList2.add(new ClassDate(i4 + " " + str, getDayStatus(calendar), setConfigSession(list, configList)));
            }
        }
        return arrayList2;
    }

    public final boolean isClassEndBeforeToday$app_release(SessionDto classDetail) {
        String end;
        Intrinsics.checkNotNullParameter(classDetail, "classDetail");
        String date = classDetail.getDate();
        Date date2 = null;
        if (date != null && (end = classDetail.getEnd()) != null) {
            date2 = DateUtil.INSTANCE.getDateFromString(date, end);
        }
        if (date2 == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        return calendar2.before(calendar);
    }

    public final Date parseStringToDate$app_release(String dateString) {
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault()).parse(dateString);
        } catch (ParseException e) {
            System.out.println((Object) ("Error al analizar la fecha: " + e));
            return null;
        }
    }
}
