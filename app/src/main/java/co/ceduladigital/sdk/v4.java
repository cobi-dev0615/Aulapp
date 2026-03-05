package co.ceduladigital.sdk;

import com.gse.aulapp.model.enumerate.EnumApps;
import com.gse.aulapp.model.enumerate.EnumBiometrixStatus;
import com.gse.aulapp.model.enumerate.EnumMethodBiometrix;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class v4 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
        int[] iArr2 = new int[EnumMethodBiometrix.values().length];
        try {
            iArr2[EnumMethodBiometrix.AUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[EnumApps.values().length];
        try {
            iArr3[EnumApps.FACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[EnumApps.FINGERPRINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$2 = iArr3;
    }
}
