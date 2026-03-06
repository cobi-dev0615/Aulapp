package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumTypeOfIncome;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "NONE", "LOGGIN", "REFRESHTOKEN", "REFRESHTOKENCEA", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnumTypeOfIncome {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumTypeOfIncome[] $VALUES;
    public static final EnumTypeOfIncome NONE = new EnumTypeOfIncome("NONE", 0);
    public static final EnumTypeOfIncome LOGGIN = new EnumTypeOfIncome("LOGGIN", 1);
    public static final EnumTypeOfIncome REFRESHTOKEN = new EnumTypeOfIncome("REFRESHTOKEN", 2);
    public static final EnumTypeOfIncome REFRESHTOKENCEA = new EnumTypeOfIncome("REFRESHTOKENCEA", 3);

    private static final /* synthetic */ EnumTypeOfIncome[] $values() {
        return new EnumTypeOfIncome[]{NONE, LOGGIN, REFRESHTOKEN, REFRESHTOKENCEA};
    }

    static {
        EnumTypeOfIncome[] $values = $values();
        $VALUES = $values;
        $ENTRIES = null; // EnumEntriesKt.enumEntries requires actual enum type
    }

    private final String _name;
    private final int _ordinal;

    private EnumTypeOfIncome(String str, int i) {
        this._name = str;
        this._ordinal = i;
    }

    public String name() {
        return _name;
    }

    public int ordinal() {
        return _ordinal;
    }

    public static EnumTypeOfIncome valueOfString(String str) {
        for (EnumTypeOfIncome val : $values()) {
            if (val.name().equals(str)) return val;
        }
        throw new IllegalArgumentException("No enum constant " + str);
    }

    public static EnumTypeOfIncome[] values() {
        return (EnumTypeOfIncome[]) $VALUES.clone();
    }
}
