package com.gse.aulapp.lib.encryption_gse.encryptJwe.model.p000enum;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/gse/aulapp/lib/encryption_gse/encryptJwe/model/enum/SourceKeyEnum;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "NONE", "ASSETS", "STRING", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SourceKeyEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SourceKeyEnum[] $VALUES;
    public static final SourceKeyEnum NONE = new SourceKeyEnum("NONE", 0);
    public static final SourceKeyEnum ASSETS = new SourceKeyEnum("ASSETS", 1);
    public static final SourceKeyEnum STRING = new SourceKeyEnum("STRING", 2);

    private static final /* synthetic */ SourceKeyEnum[] $values() {
        return new SourceKeyEnum[]{NONE, ASSETS, STRING};
    }

    static {
        SourceKeyEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = null; // EnumEntriesKt.enumEntries requires actual enum type
    }

    private SourceKeyEnum(String str, int i) {
    }

    public static SourceKeyEnum valueOfString(String str) {
        return (SourceKeyEnum) Enum.valueOf(SourceKeyEnum.class, str);
    }

    public static SourceKeyEnum[] values() {
        return (SourceKeyEnum[]) $VALUES.clone();
    }
}
