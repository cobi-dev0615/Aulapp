package co.ceduladigital.sdk;

import com.gse.aulapp.model.enumerate.EnumApps;
import com.gse.aulapp.model.enumerate.EnumBiometrixStatus;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class s1 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[EnumBiometrixStatus.values().length];
        try {
            iArr[EnumBiometrixStatus.APPROVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumBiometrixStatus.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[EnumApps.values().length];
        try {
            iArr2[EnumApps.FACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[EnumApps.FINGERPRINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
