package com.gse.aulapp.model.enums;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/gse/aulapp/model/enums/EnumFraudStep;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "SCAN_DOCUMENT_FRONT", "SCAN_DOCUMENT_BACK", "FACE_REGISTER", "FACE_AUTH", "INIT_FULL_REGISTER", "INIT_FACE_AUTH", "SCAN_DOCUMENT_ERROR", "FACE_SCAN_ERROR", "N_A", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnumFraudStep {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumFraudStep[] $VALUES;
    public static final EnumFraudStep SCAN_DOCUMENT_FRONT = new EnumFraudStep("SCAN_DOCUMENT_FRONT", 0);
    public static final EnumFraudStep SCAN_DOCUMENT_BACK = new EnumFraudStep("SCAN_DOCUMENT_BACK", 1);
    public static final EnumFraudStep FACE_REGISTER = new EnumFraudStep("FACE_REGISTER", 2);
    public static final EnumFraudStep FACE_AUTH = new EnumFraudStep("FACE_AUTH", 3);
    public static final EnumFraudStep INIT_FULL_REGISTER = new EnumFraudStep("INIT_FULL_REGISTER", 4);
    public static final EnumFraudStep INIT_FACE_AUTH = new EnumFraudStep("INIT_FACE_AUTH", 5);
    public static final EnumFraudStep SCAN_DOCUMENT_ERROR = new EnumFraudStep("SCAN_DOCUMENT_ERROR", 6);
    public static final EnumFraudStep FACE_SCAN_ERROR = new EnumFraudStep("FACE_SCAN_ERROR", 7);
    public static final EnumFraudStep N_A = new EnumFraudStep("N_A", 8);

    private static final /* synthetic */ EnumFraudStep[] $values() {
        return new EnumFraudStep[]{SCAN_DOCUMENT_FRONT, SCAN_DOCUMENT_BACK, FACE_REGISTER, FACE_AUTH, INIT_FULL_REGISTER, INIT_FACE_AUTH, SCAN_DOCUMENT_ERROR, FACE_SCAN_ERROR, N_A};
    }

    static {
        EnumFraudStep[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private EnumFraudStep(String str, int i) {
    }

    public static EnumFraudStep valueOf(String str) {
        return (EnumFraudStep) Enum.valueOf(EnumFraudStep.class, str);
    }

    public static EnumFraudStep[] values() {
        return (EnumFraudStep[]) $VALUES.clone();
    }
}
