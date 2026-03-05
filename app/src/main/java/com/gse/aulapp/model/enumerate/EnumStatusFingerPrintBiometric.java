package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumStatusFingerPrintBiometric;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "ON_SUCCESS", "EXCEPTION", "TIMEOUT", "ON_ERROR", "ON_BACK_PRESS", "DEFAULT", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnumStatusFingerPrintBiometric {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumStatusFingerPrintBiometric[] $VALUES;
    public static final EnumStatusFingerPrintBiometric ON_SUCCESS = new EnumStatusFingerPrintBiometric("ON_SUCCESS", 0);
    public static final EnumStatusFingerPrintBiometric EXCEPTION = new EnumStatusFingerPrintBiometric("EXCEPTION", 1);
    public static final EnumStatusFingerPrintBiometric TIMEOUT = new EnumStatusFingerPrintBiometric("TIMEOUT", 2);
    public static final EnumStatusFingerPrintBiometric ON_ERROR = new EnumStatusFingerPrintBiometric("ON_ERROR", 3);
    public static final EnumStatusFingerPrintBiometric ON_BACK_PRESS = new EnumStatusFingerPrintBiometric("ON_BACK_PRESS", 4);
    public static final EnumStatusFingerPrintBiometric DEFAULT = new EnumStatusFingerPrintBiometric("DEFAULT", 5);

    private static final /* synthetic */ EnumStatusFingerPrintBiometric[] $values() {
        return new EnumStatusFingerPrintBiometric[]{ON_SUCCESS, EXCEPTION, TIMEOUT, ON_ERROR, ON_BACK_PRESS, DEFAULT};
    }

    static {
        EnumStatusFingerPrintBiometric[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private EnumStatusFingerPrintBiometric(String str, int i) {
    }

    public static EnumStatusFingerPrintBiometric valueOfString(String str) {
        return (EnumStatusFingerPrintBiometric) Enum.valueOf(EnumStatusFingerPrintBiometric.class, str);
    }

    public static EnumStatusFingerPrintBiometric[] values() {
        return (EnumStatusFingerPrintBiometric[]) $VALUES.clone();
    }
}
