package com.nimbusds.jose.shaded.asm;

import com.karumi.dexter.BuildConfig;
import defpackage.a;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public abstract class ConvertDate {
    public static TimeZone defaultTimeZone;
    static TreeMap<String, Integer> monthsTable = new TreeMap<>(new StringCmpNS());
    static TreeMap<String, Integer> daysTable = new TreeMap<>(new StringCmpNS());
    private static HashSet<String> voidData = new HashSet<>();
    static TreeMap<String, TimeZone> timeZoneMapping = new TreeMap<>();

    public static class StringCmpNS implements Comparator<String> {
        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            return str.compareToIgnoreCase(str2);
        }
    }

    static {
        voidData.add("à");
        voidData.add("at");
        voidData.add("MEZ");
        voidData.add("Uhr");
        voidData.add("h");
        voidData.add("pm");
        voidData.add("PM");
        voidData.add("am");
        voidData.add("AM");
        voidData.add("min");
        voidData.add("um");
        voidData.add("o'clock");
        for (String str : TimeZone.getAvailableIDs()) {
            timeZoneMapping.put(str, TimeZone.getTimeZone(str));
        }
        for (Locale locale : DateFormatSymbols.getAvailableLocales()) {
            if (!"ja".equals(locale.getLanguage()) && !"ko".equals(locale.getLanguage()) && !"zh".equals(locale.getLanguage())) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                String[] months = dateFormatSymbols.getMonths();
                for (int i = 0; i < months.length; i++) {
                    if (months[i].length() != 0) {
                        fillMap(monthsTable, months[i], Integer.valueOf(i));
                    }
                }
                String[] shortMonths = dateFormatSymbols.getShortMonths();
                for (int i2 = 0; i2 < shortMonths.length; i2++) {
                    String str2 = shortMonths[i2];
                    if (str2.length() != 0 && !Character.isDigit(str2.charAt(str2.length() - 1))) {
                        fillMap(monthsTable, shortMonths[i2], Integer.valueOf(i2));
                        fillMap(monthsTable, shortMonths[i2].replace(".", BuildConfig.FLAVOR), Integer.valueOf(i2));
                    }
                }
                String[] weekdays = dateFormatSymbols.getWeekdays();
                for (int i3 = 0; i3 < weekdays.length; i3++) {
                    String str3 = weekdays[i3];
                    if (str3.length() != 0) {
                        fillMap(daysTable, str3, Integer.valueOf(i3));
                        fillMap(daysTable, str3.replace(".", BuildConfig.FLAVOR), Integer.valueOf(i3));
                    }
                }
                String[] shortWeekdays = dateFormatSymbols.getShortWeekdays();
                for (int i4 = 0; i4 < shortWeekdays.length; i4++) {
                    String str4 = shortWeekdays[i4];
                    if (str4.length() != 0) {
                        fillMap(daysTable, str4, Integer.valueOf(i4));
                        fillMap(daysTable, str4.replace(".", BuildConfig.FLAVOR), Integer.valueOf(i4));
                    }
                }
            }
        }
    }

    private static Date addHour(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        if (str == null) {
            if (!stringTokenizer.hasMoreTokens()) {
                return calendar.getTime();
            }
            str = stringTokenizer.nextToken();
        }
        return addHour2(stringTokenizer, calendar, str);
    }

    private static Date addHour2(StringTokenizer stringTokenizer, Calendar calendar, String str) {
        String trySkip;
        String trySkip2;
        String trySkip3;
        calendar.set(11, Integer.parseInt(trySkip(stringTokenizer, str, calendar)));
        if (stringTokenizer.hasMoreTokens() && (trySkip = trySkip(stringTokenizer, stringTokenizer.nextToken(), calendar)) != null) {
            calendar.set(12, Integer.parseInt(trySkip));
            if (stringTokenizer.hasMoreTokens() && (trySkip2 = trySkip(stringTokenizer, stringTokenizer.nextToken(), calendar)) != null) {
                calendar.set(13, Integer.parseInt(trySkip2));
                if (stringTokenizer.hasMoreTokens() && (trySkip3 = trySkip(stringTokenizer, stringTokenizer.nextToken(), calendar)) != null) {
                    String trySkip4 = trySkip(stringTokenizer, trySkip3, calendar);
                    if (trySkip4.length() == 4 && Character.isDigit(trySkip4.charAt(0))) {
                        calendar.set(1, getYear(trySkip4));
                    }
                    return calendar.getTime();
                }
                return calendar.getTime();
            }
            return calendar.getTime();
        }
        return calendar.getTime();
    }

    public static Date convertToDate(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof Number) {
            return new Date(((Number) obj).longValue());
        }
        if (!(obj instanceof String)) {
            throw new RuntimeException("Primitive: Can not convert " + obj.getClass().getName() + " to int");
        }
        StringTokenizer stringTokenizer = new StringTokenizer(((String) obj).replace("p.m.", "pm").replace("a.m.", "am"), " -/:,.+年月日曜時分秒");
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        String nextToken = stringTokenizer.nextToken();
        if (nextToken.length() == 4 && Character.isDigit(nextToken.charAt(0))) {
            return getYYYYMMDD(stringTokenizer, nextToken);
        }
        if (daysTable.containsKey(nextToken)) {
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            nextToken = stringTokenizer.nextToken();
        }
        if (monthsTable.containsKey(nextToken)) {
            return getMMDDYYYY(stringTokenizer, nextToken);
        }
        if (Character.isDigit(nextToken.charAt(0))) {
            return getDDMMYYYY(stringTokenizer, nextToken);
        }
        return null;
    }

    private static void fillMap(TreeMap<String, Integer> treeMap, String str, Integer num) {
        treeMap.put(str, num);
        treeMap.put(str.replace("é", "e").replace("û", "u"), num);
    }

    private static Date getDDMMYYYY(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar newCalandar = newCalandar();
        newCalandar.set(5, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        newCalandar.set(2, parseMonth(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        newCalandar.set(1, getYear(stringTokenizer.nextToken()));
        return addHour(stringTokenizer, newCalandar, null);
    }

    private static Date getMMDDYYYY(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar newCalandar = newCalandar();
        Integer num = monthsTable.get(str);
        if (num == null) {
            throw new NullPointerException(a.m("can not parse ", str, " as month"));
        }
        newCalandar.set(2, num.intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        newCalandar.set(5, Integer.parseInt(stringTokenizer.nextToken()));
        if (!stringTokenizer.hasMoreTokens()) {
            return null;
        }
        String nextToken = stringTokenizer.nextToken();
        if (Character.isLetter(nextToken.charAt(0))) {
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            nextToken = stringTokenizer.nextToken();
        }
        if (nextToken.length() == 4) {
            newCalandar.set(1, getYear(nextToken));
        } else if (nextToken.length() == 2) {
            return addHour2(stringTokenizer, newCalandar, nextToken);
        }
        return addHour(stringTokenizer, newCalandar, null);
    }

    private static Date getYYYYMMDD(StringTokenizer stringTokenizer, String str) {
        GregorianCalendar newCalandar = newCalandar();
        newCalandar.set(1, Integer.parseInt(str));
        if (!stringTokenizer.hasMoreTokens()) {
            return newCalandar.getTime();
        }
        newCalandar.set(2, parseMonth(stringTokenizer.nextToken()).intValue());
        if (!stringTokenizer.hasMoreTokens()) {
            return newCalandar.getTime();
        }
        String nextToken = stringTokenizer.nextToken();
        if (!Character.isDigit(nextToken.charAt(0))) {
            return newCalandar.getTime();
        }
        if (nextToken.length() == 5 && nextToken.charAt(2) == 'T') {
            newCalandar.set(5, Integer.parseInt(nextToken.substring(0, 2)));
            return addHour(stringTokenizer, newCalandar, nextToken.substring(3));
        }
        newCalandar.set(5, Integer.parseInt(nextToken));
        return addHour(stringTokenizer, newCalandar, null);
    }

    private static int getYear(String str) {
        int parseInt = Integer.parseInt(str);
        return parseInt < 100 ? parseInt > 30 ? parseInt + 2000 : parseInt + 1900 : parseInt;
    }

    private static GregorianCalendar newCalandar() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2000, 0, 0, 0, 0, 0);
        TimeZone timeZone = defaultTimeZone;
        if (timeZone != null) {
            gregorianCalendar.setTimeZone(timeZone);
        }
        TimeZone timeZone2 = gregorianCalendar.getTimeZone();
        if (timeZone2 == null) {
            timeZone2 = TimeZone.getDefault();
        }
        gregorianCalendar.setTimeInMillis(-timeZone2.getRawOffset());
        return gregorianCalendar;
    }

    private static Integer parseMonth(String str) {
        if (Character.isDigit(str.charAt(0))) {
            return Integer.valueOf(Integer.parseInt(str) - 1);
        }
        Integer num = monthsTable.get(str);
        if (num != null) {
            return num;
        }
        throw new NullPointerException(a.m("can not parse ", str, " as month"));
    }

    private static String trySkip(StringTokenizer stringTokenizer, String str, Calendar calendar) {
        while (true) {
            TimeZone timeZone = timeZoneMapping.get(str);
            if (timeZone != null) {
                calendar.setTimeZone(timeZone);
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            } else {
                if (!voidData.contains(str)) {
                    return str;
                }
                if (str.equalsIgnoreCase("pm")) {
                    calendar.add(9, 1);
                }
                if (str.equalsIgnoreCase("am")) {
                    calendar.add(9, 0);
                }
                if (!stringTokenizer.hasMoreTokens()) {
                    return null;
                }
                str = stringTokenizer.nextToken();
            }
        }
    }
}
