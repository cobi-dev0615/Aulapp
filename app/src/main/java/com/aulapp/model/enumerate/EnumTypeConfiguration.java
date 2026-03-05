package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumTypeConfiguration;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "EXAM_CONFIG", "CLASS_PRACTICAL_CONFIG", "WITHOUT_CONFIG", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnumTypeConfiguration {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumTypeConfiguration[] $VALUES;
    public static final EnumTypeConfiguration EXAM_CONFIG = new EnumTypeConfiguration("EXAM_CONFIG", 0);
    public static final EnumTypeConfiguration CLASS_PRACTICAL_CONFIG = new EnumTypeConfiguration("CLASS_PRACTICAL_CONFIG", 1);
    public static final EnumTypeConfiguration WITHOUT_CONFIG = new EnumTypeConfiguration("WITHOUT_CONFIG", 2);

    private static final /* synthetic */ EnumTypeConfiguration[] $values() {
        return new EnumTypeConfiguration[]{EXAM_CONFIG, CLASS_PRACTICAL_CONFIG, WITHOUT_CONFIG};
    }

    static {
        EnumTypeConfiguration[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private EnumTypeConfiguration(String str, int i) {
    }

    public static EnumTypeConfiguration valueOf(String str) {
        return (EnumTypeConfiguration) Enum.valueOf(EnumTypeConfiguration.class, str);
    }

    public static EnumTypeConfiguration[] values() {
        return (EnumTypeConfiguration[]) $VALUES.clone();
    }
}
