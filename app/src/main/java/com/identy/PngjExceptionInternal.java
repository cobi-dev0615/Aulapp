package com.identy;

import android.app.Activity;
import com.identy.app.users.IdentyUser;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes2.dex */
public final class PngjExceptionInternal {
    public String PngjBadCrcException = BuildConfig.FLAVOR;
    private Hand PngjBadSignature;
    private Finger valueOf;

    public PngjExceptionInternal(Activity activity, Hand hand, Finger finger, IdentyUser identyUser) {
        this.PngjBadSignature = hand;
        this.valueOf = finger;
        PngjException(activity, identyUser);
    }

    private String values() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.PngjBadSignature.toString());
        sb.append("_");
        sb.append(this.valueOf.toString());
        return sb.toString();
    }

    public final boolean PngjBadCrcException(Activity activity, IdentyUser identyUser) {
        PngjException(activity, identyUser);
        File file = new File(this.PngjBadCrcException);
        return file.exists() && file.length() > 0;
    }

    public void PngjException(Activity activity, IdentyUser identyUser) {
        String obj;
        if (identyUser.isDefault()) {
            obj = "ENROLL";
        } else {
            StringBuilder sb = new StringBuilder("ENROLL_U");
            sb.append(identyUser.uid);
            obj = sb.toString();
        }
        String obj2 = com.identy.PngjBadCrcException.values(activity, obj).toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(values());
        sb2.append(".isocryptv2");
        File file = new File(obj2, sb2.toString());
        if (!file.exists()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(values());
            sb3.append(".isocryptv4");
            file = new File(obj2, sb3.toString());
        }
        this.PngjBadCrcException = file.getAbsolutePath();
    }

    public final byte[] PngjBadCrcException() {
        String str;
        try {
            if (this.PngjBadCrcException.contains(".isocryptv2")) {
                str = ".isocryptv2";
            } else {
                str = this.PngjBadCrcException.contains(".isocryptv4") ? ".isocryptv4" : ".isocrypt";
            }
            String replace = this.PngjBadCrcException.replace(str, ".iso");
            if (str.equals(".isocryptv2")) {
                File file = new File(this.PngjBadCrcException);
                byte[] bArr = new byte[(int) file.length()];
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.read(bArr);
                fileInputStream.close();
                return IdentySdk.getInstance().m().decryptTemplatev4(bArr, replace, true);
            }
            if (!str.equals(".isocryptv4")) {
                return null;
            }
            File file2 = new File(this.PngjBadCrcException);
            byte[] bArr2 = new byte[(int) file2.length()];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            fileInputStream2.read(bArr2);
            fileInputStream2.close();
            return IdentySdk.getInstance().m().decryptTemplatev4(bArr2, replace, false);
        } catch (Exception unused) {
            return null;
        }
    }
}
