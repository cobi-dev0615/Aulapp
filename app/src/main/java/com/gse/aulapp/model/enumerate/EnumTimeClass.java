package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumTimeClass;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "GET_DATE_TIME", "GET_TIME", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnumTimeClass {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumTimeClass[] $VALUES;
    public static final EnumTimeClass GET_DATE_TIME = new EnumTimeClass("GET_DATE_TIME", 0);
    public static final EnumTimeClass GET_TIME = new EnumTimeClass("GET_TIME", 1);

    private static final /* synthetic */ EnumTimeClass[] $values() {
        return new EnumTimeClass[]{GET_DATE_TIME, GET_TIME};
    }

    static {
        EnumTimeClass[] $values = $values();
        $VALUES = $values;
        $ENTRIES = null; // EnumEntriesKt.enumEntries requires actual enum type
    }

    private EnumTimeClass(String str, int i) {
    }

    public static EnumTimeClass valueOfString(String str) {
        return (EnumTimeClass) Enum.valueOf(EnumTimeClass.class, str);
    }

    public static EnumTimeClass[] values() {
        return (EnumTimeClass[]) $VALUES.clone();
    }
}
