package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\n"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumFinger;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "INDEX", "MIDDLE", "RING", "LITTLE", "nameFinger", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EnumFinger {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumFinger[] $VALUES;
    public static final EnumFinger INDEX = new EnumFinger("INDEX", 0) { // from class: com.gse.aulapp.model.enumerate.EnumFinger.INDEX
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumFinger
        public String nameFinger() {
            return "index";
        }
    };
    public static final EnumFinger MIDDLE = new EnumFinger("MIDDLE", 1) { // from class: com.gse.aulapp.model.enumerate.EnumFinger.MIDDLE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumFinger
        public String nameFinger() {
            return "middle";
        }
    };
    public static final EnumFinger RING = new EnumFinger("RING", 2) { // from class: com.gse.aulapp.model.enumerate.EnumFinger.RING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumFinger
        public String nameFinger() {
            return "ring";
        }
    };
    public static final EnumFinger LITTLE = new EnumFinger("LITTLE", 3) { // from class: com.gse.aulapp.model.enumerate.EnumFinger.LITTLE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumFinger
        public String nameFinger() {
            return "little";
        }
    };

    private static final /* synthetic */ EnumFinger[] $values() {
        return new EnumFinger[]{INDEX, MIDDLE, RING, LITTLE};
    }

    static {
        EnumFinger[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public /* synthetic */ EnumFinger(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<EnumFinger> getEntries() {
        return $ENTRIES;
    }

    public static EnumFinger valueOfString(String str) {
        return (EnumFinger) Enum.valueOf(EnumFinger.class, str);
    }

    public static EnumFinger[] values() {
        return (EnumFinger[]) $VALUES.clone();
    }

    public abstract String nameFinger();

    private EnumFinger(String str, int i) {
    }
}
