package co.ceduladigital.sdk;

import com.gse.aulapp.model.enums.EnumPermissionDevices;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class g2 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[EnumPermissionDevices.values().length];
        try {
            iArr[EnumPermissionDevices.PERMANENTLY_DENIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumPermissionDevices.CAMERA_FACE_PERMISSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumPermissionDevices.CAMERA_FINGER_PERMISSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
