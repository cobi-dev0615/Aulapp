package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumStatusStepSession;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "INACTIVE", "ACTIVE", "FINISH", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnumStatusStepSession {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumStatusStepSession[] $VALUES;
    public static final EnumStatusStepSession INACTIVE = new EnumStatusStepSession("INACTIVE", 0);
    public static final EnumStatusStepSession ACTIVE = new EnumStatusStepSession("ACTIVE", 1);
    public static final EnumStatusStepSession FINISH = new EnumStatusStepSession("FINISH", 2);

    private static final /* synthetic */ EnumStatusStepSession[] $values() {
        return new EnumStatusStepSession[]{INACTIVE, ACTIVE, FINISH};
    }

    static {
        EnumStatusStepSession[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private EnumStatusStepSession(String str, int i) {
    }

    public static EnumStatusStepSession valueOf(String str) {
        return (EnumStatusStepSession) Enum.valueOf(EnumStatusStepSession.class, str);
    }

    public static EnumStatusStepSession[] values() {
        return (EnumStatusStepSession[]) $VALUES.clone();
    }
}
