package com.gse.aulapp.model.enums;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/gse/aulapp/model/enums/EnumPermissionDevices;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "CAMERA_FACE_PERMISSION", "CAMERA_FINGER_PERMISSION", "PERMANENTLY_DENIED", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnumPermissionDevices {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumPermissionDevices[] $VALUES;
    public static final EnumPermissionDevices CAMERA_FACE_PERMISSION = new EnumPermissionDevices("CAMERA_FACE_PERMISSION", 0);
    public static final EnumPermissionDevices CAMERA_FINGER_PERMISSION = new EnumPermissionDevices("CAMERA_FINGER_PERMISSION", 1);
    public static final EnumPermissionDevices PERMANENTLY_DENIED = new EnumPermissionDevices("PERMANENTLY_DENIED", 2);

    private static final /* synthetic */ EnumPermissionDevices[] $values() {
        return new EnumPermissionDevices[]{CAMERA_FACE_PERMISSION, CAMERA_FINGER_PERMISSION, PERMANENTLY_DENIED};
    }

    static {
        EnumPermissionDevices[] $values = $values();
        $VALUES = $values;
        $ENTRIES = null; // EnumEntriesKt.enumEntries requires actual enum type
    }

    private final String _name;
    private final int _ordinal;

    private EnumPermissionDevices(String str, int i) {
        this._name = str;
        this._ordinal = i;
    }

    public final String name() {
        return this._name;
    }

    public final int ordinal() {
        return this._ordinal;
    }

    public static EnumPermissionDevices valueOfString(String str) {
        for (EnumPermissionDevices e : values()) {
            if (e._name.equals(str)) return e;
        }
        throw new IllegalArgumentException("No enum constant " + str);
    }

    public static EnumPermissionDevices[] values() {
        return (EnumPermissionDevices[]) $VALUES.clone();
    }
}
