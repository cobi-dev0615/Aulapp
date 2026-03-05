package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumCallType;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "LOGIN", "CLASS", "EXAM", "ENROLLMENT_FULL", "FIRST_TIME_ENTRY", "REGULAR_ENTRY", "OTHER_USER_ENTRY", "VERIFY_APPRENTICE", "NONE", "LOGOUT", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnumCallType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumCallType[] $VALUES;
    public static final EnumCallType LOGIN = new EnumCallType("LOGIN", 0);
    public static final EnumCallType CLASS = new EnumCallType("CLASS", 1);
    public static final EnumCallType EXAM = new EnumCallType("EXAM", 2);
    public static final EnumCallType ENROLLMENT_FULL = new EnumCallType("ENROLLMENT_FULL", 3);
    public static final EnumCallType FIRST_TIME_ENTRY = new EnumCallType("FIRST_TIME_ENTRY", 4);
    public static final EnumCallType REGULAR_ENTRY = new EnumCallType("REGULAR_ENTRY", 5);
    public static final EnumCallType OTHER_USER_ENTRY = new EnumCallType("OTHER_USER_ENTRY", 6);
    public static final EnumCallType VERIFY_APPRENTICE = new EnumCallType("VERIFY_APPRENTICE", 7);
    public static final EnumCallType NONE = new EnumCallType("NONE", 8);
    public static final EnumCallType LOGOUT = new EnumCallType("LOGOUT", 9);

    private static final /* synthetic */ EnumCallType[] $values() {
        return new EnumCallType[]{LOGIN, CLASS, EXAM, ENROLLMENT_FULL, FIRST_TIME_ENTRY, REGULAR_ENTRY, OTHER_USER_ENTRY, VERIFY_APPRENTICE, NONE, LOGOUT};
    }

    static {
        EnumCallType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private EnumCallType(String str, int i) {
    }

    public static EnumCallType valueOfString(String str) {
        return (EnumCallType) Enum.valueOf(EnumCallType.class, str);
    }

    public static EnumCallType[] values() {
        return (EnumCallType[]) $VALUES.clone();
    }
}
