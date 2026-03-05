package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumTypeDateTimeAcquisition;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "API", "BACKEND", "LOCAL", "TRUST_DATE", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnumTypeDateTimeAcquisition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumTypeDateTimeAcquisition[] $VALUES;
    public static final EnumTypeDateTimeAcquisition API = new EnumTypeDateTimeAcquisition("API", 0);
    public static final EnumTypeDateTimeAcquisition BACKEND = new EnumTypeDateTimeAcquisition("BACKEND", 1);
    public static final EnumTypeDateTimeAcquisition LOCAL = new EnumTypeDateTimeAcquisition("LOCAL", 2);
    public static final EnumTypeDateTimeAcquisition TRUST_DATE = new EnumTypeDateTimeAcquisition("TRUST_DATE", 3);

    private static final /* synthetic */ EnumTypeDateTimeAcquisition[] $values() {
        return new EnumTypeDateTimeAcquisition[]{API, BACKEND, LOCAL, TRUST_DATE};
    }

    static {
        EnumTypeDateTimeAcquisition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private EnumTypeDateTimeAcquisition(String str, int i) {
    }

    public static EnumTypeDateTimeAcquisition valueOf(String str) {
        return (EnumTypeDateTimeAcquisition) Enum.valueOf(EnumTypeDateTimeAcquisition.class, str);
    }

    public static EnumTypeDateTimeAcquisition[] values() {
        return (EnumTypeDateTimeAcquisition[]) $VALUES.clone();
    }
}
