package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumMethodBiometrix;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "REGISTER", "AUTH", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnumMethodBiometrix {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumMethodBiometrix[] $VALUES;
    public static final EnumMethodBiometrix REGISTER = new EnumMethodBiometrix("REGISTER", 0);
    public static final EnumMethodBiometrix AUTH = new EnumMethodBiometrix("AUTH", 1);

    private static final /* synthetic */ EnumMethodBiometrix[] $values() {
        return new EnumMethodBiometrix[]{REGISTER, AUTH};
    }

    static {
        EnumMethodBiometrix[] $values = $values();
        $VALUES = $values;
        $ENTRIES = null; // EnumEntriesKt.enumEntries requires actual enum type
    }

    private final String _name;
    private final int _ordinal;

    private EnumMethodBiometrix(String str, int i) {
        this._name = str;
        this._ordinal = i;
    }

    public final String name() {
        return this._name;
    }

    public final int ordinal() {
        return this._ordinal;
    }

    public static EnumMethodBiometrix valueOf(String str) {
        for (EnumMethodBiometrix e : values()) {
            if (e._name.equals(str)) return e;
        }
        throw new IllegalArgumentException("No enum constant " + str);
    }

    public static EnumMethodBiometrix valueOfString(String str) {
        for (EnumMethodBiometrix e : values()) {
            if (e._name.equals(str)) return e;
        }
        throw new IllegalArgumentException("No enum constant " + str);
    }

    public static EnumMethodBiometrix[] values() {
        return (EnumMethodBiometrix[]) $VALUES.clone();
    }
}
