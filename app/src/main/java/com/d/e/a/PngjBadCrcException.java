package com.d.e.a;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class PngjBadCrcException {
    private static byte[] $$a = null;
    private static int $$b = 0;
    private static byte[] $$d = null;
    private static int $$e = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $14 = 0;
    private static int $15 = 1;
    private static int $16 = 0;
    private static int $17 = 1;
    private static long getCaptureTime;
    private static int getL1Score;
    private static int getL2Score;
    private static int getL3Score;
    private static int getNfiq1Score;
    public static final Map getPadSub2;
    private static long getProcessingTime;
    public static final Map getQualityScore;
    private static Object getScore;
    private static int getSpoofScore;
    private static boolean isAuthSucess;
    private static Object isQualityFailed;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0034 -> B:4:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, int i) {
        int i2;
        int i3;
        int i4 = b + 4;
        int i5 = (i * 2) + 1;
        byte[] bArr = $$a;
        int i6 = 98 - (b2 * 2);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            $16 = ($17 + 109) % 128;
            int i7 = i5;
            i3 = 0;
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i4++;
            if (i3 == i5) {
                String str = new String(bArr2, 0);
                $17 = ($16 + 17) % 128;
                return str;
            }
            i7 = bArr[i4];
            i6 += -i7;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i4++;
            if (i3 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            i4++;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
        }
        return new String(bArr2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        r3 = r2;
        r2 = r0;
        r0 = r8;
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r6 = (-r6) + r7;
        com.d.e.a.PngjBadCrcException.$16 = (com.d.e.a.PngjBadCrcException.$17 + 29) % 128;
        r7 = r8;
        r8 = r0;
        r0 = r2;
        r2 = r3;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r2 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r2 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        r3 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$f(short s, int i, short s2) {
        int i2;
        int i3;
        byte[] bArr;
        byte[] bArr2;
        int i4;
        int i5 = 0;
        int i6 = $17 + 93;
        $16 = i6 % 128;
        if (i6 % 2 != 0) {
            i2 = 19493 << s2;
            i3 = s + 1;
            bArr = $$d;
            bArr2 = new byte[i + 52];
            i4 = i + 158;
        } else {
            i2 = 1067 - s2;
            i3 = s + 33;
            bArr = $$d;
            bArr2 = new byte[36 - i];
            i4 = 35 - i;
        }
        while (true) {
            int i7 = i2 + 1;
            bArr2[i5] = (byte) i3;
            int i8 = i5 + 1;
            if (i5 == i4) {
                return new String(bArr2, 0);
            }
            int i9 = bArr[i7];
            int i10 = i4;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            i3 = (-i9) + i3;
            $16 = ($17 + 29) % 128;
            i4 = i10;
            i2 = i7;
            bArr2 = bArr4;
            bArr = bArr3;
            i5 = i8;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    static {
        try {
            getPadSub2 = new java.util.HashMap();
            getQualityScore = new java.util.HashMap();
            init$0();
            init$1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Object PngjBadSignature(int i) {
        int i2 = $10;
        $11 = ((i2 ^ 65) + ((i2 & 65) << 1)) % 128;
        Map map = getQualityScore;
        int i3 = getL1Score;
        Object obj = map.get(Integer.valueOf(((~i) & i3) | ((~i3) & i)));
        int i4 = $11;
        int i5 = (i4 ^ 75) + ((i4 & 75) << 1);
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return obj;
    }

    public static void init$0() {
        int i = $11;
        $$a = new byte[]{25, 31, -61, 78};
        $$b = 179;
        int i2 = (i ^ 113) + ((i & 113) << 1);
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
    }

    public static void init$1() {
        int i = $10;
        $11 = ((i & 103) + (i | 103)) % 128;
        byte[] bArr = new byte[1080];
        System.arraycopy("aâ\"|ó\nò\u0003\u0006\u00056¹\u0001\u000bý>ÚÛ\t\u000b\u0001\u000eõõ÷\u0010ô\u0002ý\u0004\u0007í$å)Úý\u000eíô\u0002>Ë5Ê6Î2ßâ\u0007ý(áý\u0011ê\u0002ù\ríÿ\u0003\r\u0012\u0000ô\u0002?Å\u0005ÿ÷úûó\nò\u0003\u0006\u00056Íñ\u0000BíÞï\u000bó\rõû%ìö\r\u0004ýî\u0003\u0000\r÷ú3Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001ó\nò\u0003\u0006\u00056Íñ\u0000BíÑ\u0000)Ûý\r\u0001õù\u0002ñ+Û\u0005õ\u000b\bõ+Ñ\u0000\u0004\u0003\u0006\u0002í\u000bú\u0001\u0002ñ.Ýý\u0007ò/Û÷\u0002ñ1Ô\u000bÿ\"âþû\u0003!Û÷\u0002ñ1âþû\u0003!Û÷Ë\u0003í\u00132Ë\u0003í\u00132\të\u00153ÅúAèÝý\u0007\të\u00153ÅúAº\u0007ý\fû÷\të\u00153Â\u000bó\u00079ÛÚ\u0006ÿ\u000fø\u0002ñ$Þ\u0003ÿ\u000bóþûô\u000bÿ\u0006ü\u0002þû\u0003ó\nò\u0003\u0006\u00056¿üEìÍ\fý\b@Î\u0011óÿ\nú\u0001\u000fùì\u0016ûú\u0002ó\u0017å\tõ\u000f\u0015ú\u0016ø\të\u00153ÅúAåú\nÍ\u0015þõü\u000bú\u0001î\u0003\u0000\r÷ú ëü\b\u0018äý\u0000\u0003ö\të\u00153ÅúAèÝý\u0007\u0016Ú\u0001\u0004û\u0001!ß\u0002\r\u0004ô÷ýü\u000e\u0015ý\u0013øÎî\u0000\u000eñ\u0001DÌô\u0002>Ë5Ê6Î2þÏý\u00031ýÎ/Ó3\u0001Îý1Ó\u0000\u00004\u0002ñ\"íò\u0004ú\u0003\u000fþ\të\u00153À\tñFÙ\u0003\u0006\u0002ñ$ïí\f\të\u00153ÅúAìÍ\u000f\u0000\u0001ó\r\u0001\u001bÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAåÛþû\u0001!ß\u0002\r\u0004ô\të\u00153ÅúAêãí\u0013\u0018Ûþû\u0001!ß\u0002\r\u0004ô\r\u0004ý\u001eÑ\t\u0000ó\të\u00153ÅúAìÉ\u0005\u000f$Ï\u0000\u0011è0Ûþû\u0001!ß\u0002\r\u0004ôô\u0002?Ê6É7¸\u0015õ÷\u0010òô\u0002?Ê6É7Í3Þâ\u0007ý(áý\u0011ê\u0002ù\ríÿ\u0003\r\u0012\u0000â\u0007ý(áý\u0011ê\u0002ù\ríÿ\u0003\r\b\u0002ù\r\u0004ý\u000eñ\"í\u0004ý\u0015á\u0002ó\u0015ü\u0014ø\u0005\tõ\u000f\u0002ñ.\u0002\të\u00153ÅúAèÝý\u0007!ßò\u0010ñ\tùü\u0005ýú\u000b\u000b\u0003õö\rþ=»ú\u0006ÿ\u000fø?êßí2Ýý\u0007ý\u000eý ßí\u0002ñ3ßï\u0004\u0003÷\u0001\u000f\u0015ïí\fÿù\u0007ñ\u000f\u0002ñ1×\u000bî\u0000'Ý\u000eýÿó\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù'Ûþû\u0001!ß\u0002\r\u0004ô\u0002ñ&éí\u0004/×ú\u0002ù\të\u00153¹\u0001\u000bý>´\u0011ùBÔñù+×ú\u0002ù\u0002ñ!êï\u0015\të\u00153À\u0005úAìÉ\u0005\u000f#Í\u000f\u0000\u0001óõ\u0000ý\f\u0002í\u000f!Û÷\r\u0002ïû\u0001\të\u00153ÅúAë×ýü\u000e\u0004ÿö\u0007\u0003õö\rþ=»ú\u0006ÿ\u000fø?åÛ!èøþýù5ßí5×\u000bî\u0000'Ý\u000eýÿó\të\u00153Â\u000bó\u00079ë×\u000bî\u0000'Ý\u000eýÿó\u0001ü\nõ\u000bú\u0001\u0003õö\rþ=»ú\u0006ÿ\u000fø?ìáî\u000e!ßí5×\u000bî\u0000'Ý\u000eýÿó\u000fí\f\u001cãöÿ\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù5Û÷\r\u0002ï\u0005ý\t\u0004ò\rí\u000bó\u0011\u0019ã\u0007ð\u0011ïù)ïí\f#Ù\u0007ø\b÷ú\u0001\u0002ñ1Ô\u0002ý\u0001\u0001\t÷ú Û\t\u000b\u0015ø\u0018øý\u000eý!×\u000bî\u0000ô\u0002>Ë5Ê6Î2ßâ\u0007ý(áý!Ñ\u000f\u001eÍ\u0015þõü\u000bú\u0001J®Îî\u0000\u000eñ\u0001DÌô\u0002>Ë5Ê6Î2Íÿ1Î4Ì.\u0003û\bÏ)\u0004\u0003Î2Ï5\u0015ù\u0017øºÿOº\u0005õ\u0000\n\u0001þøøS´\u0007ÿòKâ\u0007ý%Í\u0015þõü\u000bú\u0001".getBytes(java.nio.charset.StandardCharsets.ISO_8859_1), 0, bArr, 0, 1080);
        $$d = bArr;
        $$e = 86;
        int i2 = $11 + 15;
        $10 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 91 / 0;
        }
    }

    public static Object values(char c, int i, int i2) {
        int i3 = $11;
        Object obj = isQualityFailed;
        $10 = (i3 + 17) % 128;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
            byte[] bArr = $$d;
            byte b = bArr[85];
            byte b2 = bArr[145];
            Class<?> cls = Class.forName($$f(b, b2, (short) ((b2 ^ 519) | (b2 & 519))), true, (ClassLoader) getScore);
            byte b3 = bArr[165];
            byte b4 = bArr[601];
            String $$f = $$f(b3, b4, (short) ((b4 ^ 480) | (b4 & 480)));
            Class cls2 = Character.TYPE;
            Class cls3 = Integer.TYPE;
            Object invoke = cls.getMethod($$f, cls2, cls3, cls3).invoke(obj, objArr);
            $10 = ($11 + 53) % 128;
            return invoke;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static Object PngjBadSignature(char c, int i, int i2, int i3, boolean z, String str, Class[] clsArr) {
        Object method;
        Map map = getQualityScore;
        Object obj = map.get(Integer.valueOf(i3));
        if (obj != null) {
            return obj;
        }
        Integer valueOf = Integer.valueOf(i3);
        Object obj2 = isQualityFailed;
        $11 = ($10 + 13) % 128;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
            byte[] bArr = $$d;
            byte b = bArr[85];
            byte b2 = bArr[145];
            Class<?> cls = Class.forName($$f(b, b2, (short) ((b2 ^ 519) | (b2 & 519))), true, (ClassLoader) getScore);
            byte b3 = bArr[165];
            byte b4 = bArr[601];
            String $$f = $$f(b3, b4, (short) ((b4 ^ 480) | (b4 & 480)));
            Class cls2 = Character.TYPE;
            Class cls3 = Integer.TYPE;
            Class cls4 = (Class) cls.getMethod($$f, cls2, cls3, cls3).invoke(obj2, objArr);
            if (str == null) {
                int i4 = $10 + 97;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
                if (z) {
                    method = cls4.getDeclaredConstructor(clsArr);
                } else {
                    method = cls4.getConstructor(clsArr);
                    $11 = ($10 + 31) % 128;
                }
                int i5 = $11;
                $10 = ((i5 & 107) + (i5 | 107)) % 128;
            } else if (clsArr == null) {
                if (z) {
                    int i6 = $10;
                    int i7 = (i6 ^ 105) + ((i6 & 105) << 1);
                    $11 = i7 % 128;
                    if (i7 % 2 == 0) {
                        method = cls4.getDeclaredField(str);
                        int i8 = 75 / 0;
                    } else {
                        method = cls4.getDeclaredField(str);
                    }
                } else {
                    method = cls4.getField(str);
                }
            } else if (z) {
                int i9 = $10 + 7;
                $11 = i9 % 128;
                if (i9 % 2 == 0) {
                    cls4.getDeclaredMethod(str, clsArr);
                    throw null;
                }
                method = cls4.getDeclaredMethod(str, clsArr);
                $11 = ($10 + 33) % 128;
            } else {
                method = cls4.getMethod(str, clsArr);
            }
            map.put(valueOf, method);
            return method;
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
