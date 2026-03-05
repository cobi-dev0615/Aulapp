package com.identy.app;

import android.content.Context;
import android.os.Build;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.karumi.dexter.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.uuid.Uuid;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class PngjPrematureEnding implements PngjUnsupportedException {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static char PngjBadCrcException;
    private static char PngjBadSignature;
    private static char valueOf;
    private static char values;

    public class PngjBadSignature implements RetryPolicy {
        public PngjBadSignature() {
        }

        @Override // com.android.volley.RetryPolicy
        public final int getCurrentRetryCount() {
            return 0;
        }

        @Override // com.android.volley.RetryPolicy
        public final int getCurrentTimeout() {
            return 0;
        }

        @Override // com.android.volley.RetryPolicy
        public final void retry(VolleyError volleyError) {
        }
    }

    public class valueOf extends JsonObjectRequest {
        public valueOf(String str, JSONObject jSONObject, Response.Listener listener, Response.ErrorListener errorListener) {
            super(1, str, jSONObject, listener, errorListener);
        }

        @Override // com.android.volley.Request
        public final Map getHeaders() {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "PARTNER_VALIDATE_LICENSE");
            return hashMap;
        }

        @Override // com.android.volley.Request
        public final Map getParams() {
            return new HashMap();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    private static String $$c(short s, short s2, short s3) {
        int i = s3 * 4;
        int i2 = s + 4;
        byte[] bArr = $$a;
        ?? r6 = (s2 * 4) + 114;
        byte[] bArr2 = new byte[i + 1];
        int i3 = -1;
        byte b = r6;
        if (bArr == null) {
            b = i2 + r6;
            i2 = i2;
            bArr = bArr;
            i3 = -1;
        }
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2 + 1;
            bArr2[i4] = b;
            if (i4 == i) {
                return new String(bArr2, 0);
            }
            byte[] bArr3 = bArr;
            b = bArr[i5] + b;
            i2 = i5;
            bArr = bArr3;
            i3 = i4;
        }
    }

    static {
        init$0();
        valueOf = (char) 57729;
        PngjBadSignature = (char) 738;
        PngjBadCrcException = (char) 54758;
        values = (char) 61364;
    }

    private static boolean PngjBadCrcException(Context context, String str) {
        try {
            InputStream open = context.getResources().getAssets().open(str);
            if (open != null) {
                open.close();
                return true;
            }
            if (open == null) {
                return false;
            }
            open.close();
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    private static void a(String str, int i, Object[] objArr) {
        char[] charArray = str != null ? str.toCharArray() : str;
        com.d.e.PngjOutputException pngjOutputException = new com.d.e.PngjOutputException();
        char[] cArr = new char[charArray.length];
        pngjOutputException.values = 0;
        int i2 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i3 = pngjOutputException.values;
            if (i3 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i);
                return;
            }
            cArr2[0] = charArray[i3];
            char c = 1;
            cArr2[1] = charArray[i3 + 1];
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                char c2 = cArr2[c];
                char c3 = cArr2[0];
                char c4 = c;
                int i6 = (c3 + i4) ^ ((c3 << 4) + ((char) (PngjBadCrcException ^ (-4937072311772145044L))));
                int i7 = c3 >>> 5;
                int i8 = i2;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(values);
                    objArr2[i8] = Integer.valueOf(i7);
                    objArr2[c4] = Integer.valueOf(i6);
                    objArr2[0] = Integer.valueOf(c2);
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-222953304);
                    Class cls = Integer.TYPE;
                    if (PngjBadSignature2 == null) {
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), (KeyEvent.getMaxKeyCode() >> 16) + 35, 154 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'), 240741651, false, "n", new Class[]{cls, cls, cls, cls});
                    }
                    char charValue = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    cArr2[c4] = charValue;
                    char c5 = cArr2[0];
                    int i9 = (charValue + i4) ^ ((charValue << 4) + ((char) (valueOf ^ (-4937072311772145044L))));
                    int i10 = charValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[3] = Integer.valueOf(PngjBadSignature);
                    objArr3[i8] = Integer.valueOf(i10);
                    objArr3[c4] = Integer.valueOf(i9);
                    objArr3[0] = Integer.valueOf(c5);
                    Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-222953304);
                    if (PngjBadSignature3 == null) {
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 'S' - AndroidCharacter.getMirror('0'), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + ModuleDescriptor.MODULE_VERSION, 240741651, false, "n", new Class[]{cls, cls, cls, cls});
                    }
                    cArr2[0] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                    i4 -= 40503;
                    i5++;
                    c = c4;
                    i2 = i8;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i11 = i2;
            char c6 = c;
            int i12 = pngjOutputException.values;
            cArr[i12] = cArr2[0];
            cArr[i12 + 1] = cArr2[c6];
            i2 = i11;
            Object[] objArr4 = new Object[i2];
            objArr4[c6] = pngjOutputException;
            objArr4[0] = pngjOutputException;
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(150653722);
            if (PngjBadSignature4 == null) {
                byte b = (byte) (-1);
                byte b2 = (byte) (b + 1);
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 8057), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 31, 665 - View.getDefaultSize(0, 0), -199907679, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
            }
            ((Method) PngjBadSignature4).invoke(null, objArr4);
        }
    }

    public static void init$0() {
        $$a = new byte[]{70, 91, ByteCompanionObject.MAX_VALUE, -16};
        $$b = 84;
    }

    private static String values(byte[] bArr) {
        KeyFactory keyFactory;
        PublicKey publicKey;
        KeyGenerator keyGenerator;
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4464oSxYEPiVG/YSeBPmh/nQ5nSd1JxrTcVxe3yGDSqa/OuG7vMn8fawOTV57esewDxxEDRJMHxcXmQd+lx9eXanXLmaDZNgzUmUPd7ZLlMFzRrCM+hZKOuUFo9r/HG6lXfhzQaWxjmVmj3Ghl87KCcsn6z+wWPuGB7U1wBA6BYABI45gI3jd36/VrSJziqbCxecOhPVql6LOdqahlJISF6EMSwXRPgyapi4B1hIqV2mZguWAsbEDzGnOmhXbx81k91FLNuwEbUdR9jgIvnEXh2gAl1He1jTzsjhj/bWb3tZCzgdrBVCr9C/vsyMsb/T/G52AY/a8CSZcZFs2YfAowIDAQAB", 1));
        try {
            keyFactory = KeyFactory.getInstance("RSA");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            keyFactory = null;
        }
        try {
            publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
        } catch (InvalidKeySpecException e2) {
            e2.printStackTrace();
            publicKey = null;
        }
        try {
            try {
                Object[] objArr = new Object[1];
                a("㝣್㈷\udecbᆘ컏逞缑땱滇뻖퐛溗뻁䧡쩺혡㧲땈⢵\ude28\uf52c鹅㿸䬙║", View.resolveSize(0, 0) + 26, objArr);
                SecureRandom secureRandom = (SecureRandom) Class.forName((String) objArr[0]).getDeclaredConstructor(null).newInstance(null);
                try {
                    keyGenerator = KeyGenerator.getInstance("AES");
                } catch (NoSuchAlgorithmException e3) {
                    e3.printStackTrace();
                    keyGenerator = null;
                }
                keyGenerator.init(256, secureRandom);
                SecretKey generateKey = keyGenerator.generateKey();
                Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                try {
                    Object[] objArr2 = new Object[1];
                    a("㝣್㈷\udecbᆘ컏逞缑땱滇뻖퐛溗뻁䧡쩺혡㧲땈⢵\ude28\uf52c鹅㿸䬙║", ExpandableListView.getPackedPositionType(0L) + 26, objArr2);
                    byte[] bArr2 = new byte[12];
                    ((Random) Class.forName((String) objArr2[0]).getDeclaredConstructor(null).newInstance(null)).nextBytes(bArr2);
                    cipher.init(1, generateKey, new GCMParameterSpec(Uuid.SIZE_BITS, bArr2));
                    byte[] doFinal = cipher.doFinal(bArr);
                    byte[] encoded = generateKey.getEncoded();
                    Cipher cipher2 = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");
                    cipher2.init(1, publicKey);
                    byte[] doFinal2 = cipher2.doFinal(encoded);
                    ByteBuffer allocate = ByteBuffer.allocate(doFinal2.length + 20 + doFinal.length);
                    allocate.putInt(doFinal2.length);
                    allocate.put(doFinal2);
                    allocate.putInt(12);
                    allocate.put(bArr2);
                    allocate.put(doFinal);
                    return Base64.encodeToString(allocate.array(), 3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            return null;
        }
    }

    @Override // com.identy.app.PngjUnsupportedException
    public final void PngjBadCrcException(Context context, String str, String str2, String str3, byte[] bArr, PngjOutputException pngjOutputException, String str4, String str5, StringBuilder sb, StringBuilder sb2, String str6, String str7, String str8, KeyPair keyPair, String str9, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("hash", str3);
        hashMap.put("bundleId", str);
        if (keyPair != null) {
            hashMap.put("publicKey", Base64.encodeToString(keyPair.getPublic().getEncoded(), 3));
        }
        hashMap.put("data", str5);
        hashMap.put("uniqueId", str4);
        hashMap.put("mobileManufacturer", Build.MANUFACTURER);
        hashMap.put("mobileModel", Build.MODEL);
        hashMap.put("sdkVersion", str8);
        hashMap.put("licenseAction", sb.toString());
        hashMap.put("accessTimeStamps", sb2.toString());
        hashMap.put("timestamp", str6);
        hashMap.put("licenseFor", str7);
        hashMap.put("license", Base64.encodeToString(bArr, 3));
        hashMap.put("osVersion", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("meta", str9);
        hashMap.put("hc", "10");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i);
        hashMap.put("rc", sb3.toString());
        if (PngjBadCrcException(context, "face_server_matcher.mobile.identy")) {
            hashMap.put("matcher", "server");
        }
        JSONObject jSONObject = new JSONObject(hashMap);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("data", values(jSONObject.toString().getBytes()));
            jSONObject2.put("os", "android");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        valueOf valueof = new valueOf(str2, jSONObject2, new PngjExceptionInternal(pngjOutputException), new com.identy.app.valueOf(pngjOutputException));
        RequestQueue newRequestQueue = Volley.newRequestQueue(context, new PngjInputException(context));
        valueof.setRetryPolicy(new PngjBadSignature());
        newRequestQueue.add(valueof);
    }
}
