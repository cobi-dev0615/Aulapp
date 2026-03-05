package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumApps;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", BuildConfig.FLAVOR, "nameString", "()Ljava/lang/String;", "Companion", "FACE", "FINGERPRINT", "BOTH", "NONE", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EnumApps {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumApps[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EnumApps FACE = new EnumApps("FACE", 0) { // from class: com.gse.aulapp.model.enumerate.EnumApps.FACE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumApps
        public String nameString() {
            return "Fraud";
        }
    };
    public static final EnumApps FINGERPRINT = new EnumApps("FINGERPRINT", 1) { // from class: com.gse.aulapp.model.enumerate.EnumApps.FINGERPRINT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumApps
        public String nameString() {
            return "Identy";
        }
    };
    public static final EnumApps BOTH = new EnumApps("BOTH", 2) { // from class: com.gse.aulapp.model.enumerate.EnumApps.BOTH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumApps
        public String nameString() {
            return "Both";
        }
    };
    public static final EnumApps NONE = new EnumApps("NONE", 3) { // from class: com.gse.aulapp.model.enumerate.EnumApps.NONE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumApps
        public String nameString() {
            return BuildConfig.FLAVOR;
        }
    };

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumApps$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "getEnumByNameString", "Lcom/gse/aulapp/model/enumerate/EnumApps;", "nameString", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEnumApps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumApps.kt\ncom/gse/aulapp/model/enumerate/EnumApps$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,60:1\n13409#2,2:61\n*S KotlinDebug\n*F\n+ 1 EnumApps.kt\ncom/gse/aulapp/model/enumerate/EnumApps$Companion\n*L\n50#1:61,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumApps getEnumByNameString(String nameString) {
            if (nameString == null || nameString.length() == 0) {
                return EnumApps.BOTH;
            }
            for (EnumApps enumApps : EnumApps.values()) {
                if (Intrinsics.areEqual(nameString, enumApps.nameString())) {
                    return enumApps;
                }
            }
            return EnumApps.BOTH;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ EnumApps[] $values() {
        return new EnumApps[]{FACE, FINGERPRINT, BOTH, NONE};
    }

    static {
        EnumApps[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EnumApps(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumApps valueOfString(String str) {
        return (EnumApps) Enum.valueOf(EnumApps.class, str);
    }

    public static EnumApps[] values() {
        return (EnumApps[]) $VALUES.clone();
    }

    public abstract String nameString();

    private EnumApps(String str, int i) {
    }
}
