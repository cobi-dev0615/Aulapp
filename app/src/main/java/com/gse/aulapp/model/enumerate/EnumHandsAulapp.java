package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\r"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "RIGHT", "LEFT", "BOTH", "NONE", "EXCEPTION", "nameHand", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EnumHandsAulapp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumHandsAulapp[] $VALUES;
    public static final EnumHandsAulapp RIGHT = new EnumHandsAulapp("RIGHT", 0) { // from class: com.gse.aulapp.model.enumerate.EnumHandsAulapp.RIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumHandsAulapp
        public int id() {
            return 0;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumHandsAulapp
        public String nameHand() {
            return "right";
        }
    };
    public static final EnumHandsAulapp LEFT = new EnumHandsAulapp("LEFT", 1) { // from class: com.gse.aulapp.model.enumerate.EnumHandsAulapp.LEFT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumHandsAulapp
        public int id() {
            return 1;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumHandsAulapp
        public String nameHand() {
            return "left";
        }
    };
    public static final EnumHandsAulapp BOTH = new EnumHandsAulapp("BOTH", 2) { // from class: com.gse.aulapp.model.enumerate.EnumHandsAulapp.BOTH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumHandsAulapp
        public int id() {
            return 2;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumHandsAulapp
        public String nameHand() {
            return "both";
        }
    };
    public static final EnumHandsAulapp NONE = new EnumHandsAulapp("NONE", 3) { // from class: com.gse.aulapp.model.enumerate.EnumHandsAulapp.NONE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumHandsAulapp
        public int id() {
            return -1;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumHandsAulapp
        public String nameHand() {
            return "none";
        }
    };
    public static final EnumHandsAulapp EXCEPTION = new EnumHandsAulapp("EXCEPTION", 4) { // from class: com.gse.aulapp.model.enumerate.EnumHandsAulapp.EXCEPTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumHandsAulapp
        public int id() {
            return -1;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumHandsAulapp
        public String nameHand() {
            return "exception";
        }
    };

    private static final /* synthetic */ EnumHandsAulapp[] $values() {
        return new EnumHandsAulapp[]{RIGHT, LEFT, BOTH, NONE, EXCEPTION};
    }

    static {
        EnumHandsAulapp[] $values = $values();
        $VALUES = $values;
        $ENTRIES = null; // EnumEntriesKt.enumEntries requires actual enum type
    }

    public /* synthetic */ EnumHandsAulapp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumHandsAulapp valueOfString(String str) {
        for (EnumHandsAulapp e : values()) {
            if (e._name.equals(str)) return e;
        }
        throw new IllegalArgumentException("No enum constant " + str);
    }

    public static EnumHandsAulapp[] values() {
        return (EnumHandsAulapp[]) $VALUES.clone();
    }

    public abstract int id();

    public abstract String nameHand();

    private final String _name;
    private final int _ordinal;

    private EnumHandsAulapp(String str, int i) {
        this._name = str;
        this._ordinal = i;
    }

    public final int ordinal() {
        return this._ordinal;
    }

    public final String name() {
        return this._name;
    }
}
