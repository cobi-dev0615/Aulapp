package com.identy;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Pair;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import com.identy.enums.Template;
import com.karumi.dexter.BuildConfig;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.io.ConstantsKt;
import org.identy.opencv.core.Mat;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IdentyResponse {
    private static final byte[] $$g = {31, 93, -84, 91, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 70, -44, 47, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, -8, 24, 22, -3, 27, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 36, 54, 17, 10, 10, 13, -43, 31, 8, 47, 30, 2, 26, 0, 24, 18, -72, 57, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0, 43, 6, 16, -27, 44, 16, -20, 60, -2, -17, 64, -8, 15, 24, 17, 2, 19, 12, 25, 11, -50, 72, 8, 14, 22, 19, 18, -62, 38, 59, 1, 8, 14, -10, 46, -27, 59, 1, 8, 14, -16, 42, 20, 17, 2, 26, 43, 6, 16, -27, 44, 16, -4, 35, 11, 20, 0, 32, 14, 10, 0};
    private static final int $$h = 171;
    private final Map Action;
    private IdentyEncrytion PngBadCharsetException;
    Map PngjBadCrcException;
    int PngjBadSignature;
    Activity PngjException;
    private Map PngjExceptionInternal;
    private HashMap PngjInputException;
    private String PngjOutputException;
    private IdentyCustomEncryption PngjPrematureEnding;
    private Action PngjUnsupportedException;
    private final Map e1;
    protected String n;
    int valueOf;
    WSQCompression values;

    public class PngjBadCrcException extends AsyncTask {
        private /* synthetic */ HashMap PngjBadCrcException;
        private /* synthetic */ Map PngjBadSignature;
        private /* synthetic */ getNfiq1Score values;

        public PngjBadCrcException(Map map, HashMap hashMap, getNfiq1Score getnfiq1score) {
            this.PngjBadSignature = map;
            this.PngjBadCrcException = hashMap;
            this.values = getnfiq1score;
        }

        private Void PngjException() {
            try {
                IdentyResponse identyResponse = IdentyResponse.this;
                Map map = this.PngjBadSignature;
                HashMap hashMap = this.PngjBadCrcException;
                Calendar.getInstance().getTimeInMillis();
                ArrayList arrayList = new ArrayList();
                if (hashMap.containsKey(Template.SLAP_WSQ)) {
                    arrayList.add(Template.WSQ);
                }
                if (hashMap.containsKey(Template.SLAP_PNG)) {
                    arrayList.add(Template.PNG);
                }
                HashMap hashMap2 = new HashMap();
                TreeMap treeMap = new TreeMap();
                for (Map.Entry entry : map.entrySet()) {
                    Hand hand = (Hand) entry.getKey();
                    TreeMap treeMap2 = new TreeMap();
                    Iterator it = ((Map) entry.getValue()).entrySet().iterator();
                    while (it.hasNext()) {
                        getPadSub3 getpadsub3 = (getPadSub3) ((Map.Entry) it.next()).getValue();
                        Finger finger = getpadsub3.PngjBadCrcException;
                        Mat PngjInputException = getpadsub3.PngjInputException();
                        if (getpadsub3.PngjBadCrcException.equals(Finger.THUMB)) {
                            treeMap.put(Integer.valueOf(Position.getFromHandFinger(new Pair(hand, finger)).ordinal()), Long.valueOf(PngjInputException.PngjException));
                        } else {
                            treeMap2.put(Integer.valueOf(Position.getFromHandFinger(new Pair(hand, finger)).ordinal()), Long.valueOf(PngjInputException.PngjException));
                        }
                    }
                    if (!treeMap2.isEmpty()) {
                        Slap slap = hand == Hand.LEFT ? Slap.LEFT_FOUR_FINGERS : Slap.RIGHT_FOUR_FINGERS;
                        hashMap2.put(slap, identyResponse.PngjBadSignature(treeMap2, arrayList, slap));
                    }
                }
                if (!treeMap.isEmpty()) {
                    Slap slap2 = Slap.TWO_THUMB;
                    hashMap2.put(slap2, identyResponse.PngjBadSignature(treeMap, arrayList, slap2));
                }
                identyResponse.PngjBadCrcException = hashMap2;
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return PngjException();
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Object obj) {
            super.onPostExecute((Void) obj);
            this.values.values();
        }
    }

    public class valueOf extends AsyncTask {
        private /* synthetic */ Template PngjBadCrcException;
        private /* synthetic */ getNfiq1Score PngjBadSignature;
        private /* synthetic */ getPadSub3 PngjException;
        private /* synthetic */ FingerOutput valueOf;
        private /* synthetic */ TemplateSize values;

        public valueOf(getPadSub3 getpadsub3, Template template, TemplateSize templateSize, FingerOutput fingerOutput, getNfiq1Score getnfiq1score) {
            this.PngjException = getpadsub3;
            this.PngjBadCrcException = template;
            this.values = templateSize;
            this.valueOf = fingerOutput;
            this.PngjBadSignature = getnfiq1score;
        }

        private Void PngjException() {
            try {
                if (this.PngjException.values != null) {
                    com.identy.i.PngjOutputException generator = this.PngjBadCrcException.getGenerator();
                    Template template = this.PngjBadCrcException;
                    getPadSub3 getpadsub3 = this.PngjException;
                    IdentyResponse identyResponse = IdentyResponse.this;
                    byte[] PngjBadCrcException = generator.PngjBadCrcException(template, getpadsub3, identyResponse.PngjException, 0L, this.values, identyResponse.values);
                    IdentyResponse identyResponse2 = IdentyResponse.this;
                    TemplateOutput values = identyResponse2.values(PngjBadCrcException, identyResponse2.valueOf);
                    if (values != null) {
                        this.valueOf.addEncryptedTemplates(this.PngjBadCrcException, this.values, values);
                    } else {
                        this.valueOf.addTemplates(this.PngjBadCrcException, TemplateSize.DEFAULT, new String(Base64.encode(PngjBadCrcException, IdentyResponse.this.valueOf)));
                    }
                }
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return PngjException();
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Object obj) {
            super.onPostExecute((Void) obj);
            this.PngjBadSignature.values();
        }
    }

    public class values implements getNfiq1Score {
        private /* synthetic */ getNfiq1Score PngjBadSignature;
        private /* synthetic */ Map PngjException;

        public values(Map map, getNfiq1Score getnfiq1score) {
            this.PngjException = map;
            this.PngjBadSignature = getnfiq1score;
        }

        @Override // com.identy.getNfiq1Score
        public final void values() {
            IdentyResponse identyResponse = IdentyResponse.this;
            int i = identyResponse.PngjBadSignature - 1;
            identyResponse.PngjBadSignature = i;
            if (i == 0) {
                for (Map.Entry entry : this.PngjException.entrySet()) {
                    Iterator it = ((Map) entry.getValue()).entrySet().iterator();
                    while (it.hasNext()) {
                        getPadSub3 getpadsub3 = (getPadSub3) ((Map.Entry) it.next()).getValue();
                        try {
                            getpadsub3.PngjUnsupportedException.clear();
                            getpadsub3.PngjUnsupportedException = new HashMap();
                            getpadsub3.PngjBadCrcException();
                        } catch (Exception unused) {
                        }
                    }
                }
                this.PngjBadSignature.values();
            }
        }
    }

    public IdentyResponse() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~(defpackage.a.b(661896083) | 281421737)) | (-485912512), 220, (((-217467543) | r0) * (-220)) - 1056083863, -2020883299);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4979;
                    Fpnative.valueOf = objArr;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = ((i3 * i3) - (~(-(177642827 * i3)))) - 1;
                    int i5 = -(i3 * 1727997065);
                    int i6 = (((i4 | i5) << 1) - (i5 ^ i4)) - (-383931876);
                    int i7 = ((i6 >> 29) - 15) / 8;
                    int i8 = (i6 - (~(((i7 | 1) << 1) - (i7 ^ 1)))) - 1;
                    int i9 = i6 >> 23;
                    int i10 = ((i9 & (-1023)) + (i9 | (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i11 = (-(i8 ^ ((i10 & 1) + (i10 | 1)))) + 3;
                    int i12 = i11 >> 28;
                    int i13 = (((i12 | (-31)) << 1) - (i12 ^ (-31))) / 16;
                    int i14 = (i13 & 1) + (i13 | 1);
                    this.PngjBadSignature = 0 / ((i11 & (-(((i14 | 1) << 1) - (1 ^ i14)))) * 291);
                    this.e1 = new HashMap();
                    this.Action = new HashMap();
                    this.PngjBadCrcException = new HashMap();
                    this.PngBadCharsetException = null;
                }
            }
            byte[] bArr = $$g;
            Object[] objArr3 = new Object[1];
            d(bArr[63], bArr[113], bArr[34], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(bArr[0], bArr[32], bArr[111], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1790759819);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4979;
            Fpnative.valueOf = objArr;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = ((i32 * i32) - (~(-(177642827 * i32)))) - 1;
            int i52 = -(i32 * 1727997065);
            int i62 = (((i42 | i52) << 1) - (i52 ^ i42)) - (-383931876);
            int i72 = ((i62 >> 29) - 15) / 8;
            int i82 = (i62 - (~(((i72 | 1) << 1) - (i72 ^ 1)))) - 1;
            int i92 = i62 >> 23;
            int i102 = ((i92 & (-1023)) + (i92 | (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i112 = (-(i82 ^ ((i102 & 1) + (i102 | 1)))) + 3;
            int i122 = i112 >> 28;
            int i132 = (((i122 | (-31)) << 1) - (i122 ^ (-31))) / 16;
            int i142 = (i132 & 1) + (i132 | 1);
            this.PngjBadSignature = 0 / ((i112 & (-(((i142 | 1) << 1) - (1 ^ i142)))) * 291);
            this.e1 = new HashMap();
            this.Action = new HashMap();
            this.PngjBadCrcException = new HashMap();
            this.PngBadCharsetException = null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(short s, short s2, byte b, Object[] objArr) {
        int i;
        int i2;
        int i3 = s + 4;
        byte[] bArr = $$g;
        int r6 = (s2 * 19) + 80;
        byte[] bArr2 = new byte[44 - b];
        int i4 = 43 - b;
        if (bArr == null) {
            byte b2 = r6;
            i2 = 0;
            i = i3;
            i++;
            i3 = (i3 + b2) - 13;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            b2 = bArr[i];
            i++;
            i3 = (i3 + b2) - 13;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = i3;
            i3 = r6;
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    public final SlapOutput PngjBadSignature(TreeMap treeMap, ArrayList arrayList, Slap slap) {
        WSQCompression wSQCompression;
        int[] iArr = new int[treeMap.size()];
        long[] jArr = new long[treeMap.size()];
        int[] iArr2 = new int[arrayList.size()];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : treeMap.entrySet()) {
            iArr[i2] = ((Integer) entry.getKey()).intValue();
            jArr[i2] = ((Long) entry.getValue()).longValue();
            i2++;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            iArr2[i] = ((Template) obj).ordinal();
            i++;
        }
        try {
            wSQCompression = IdentySdk.getInstance().getWSQCompression();
        } catch (Exception e) {
            e.printStackTrace();
            wSQCompression = null;
        }
        try {
            wSQCompression = IdentySdk.getInstance().getWSQCompression();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        SlapOutput generateST = Fpnative.generateST(e1.values, jArr, iArr2, iArr, (float) wSQCompression.getCompression());
        try {
            generateST.setSlab(slap, this.valueOf);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return generateST;
    }

    public void PngjException(Template template, getPadSub3 getpadsub3, FingerOutput fingerOutput, getNfiq1Score getnfiq1score, TemplateSize templateSize) {
        new valueOf(getpadsub3, template, templateSize, fingerOutput, getnfiq1score).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02dd A[Catch: Exception -> 0x02e8, TRY_LEAVE, TryCatch #4 {Exception -> 0x02e8, blocks: (B:69:0x02d7, B:71:0x02dd), top: B:68:0x02d7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fillPrintsInfo(Map<Hand, Map<Finger, getPadSub3>> map, HashMap<Template, HashMap<Finger, ArrayList<TemplateSize>>> hashMap, boolean z, boolean z2, ArrayList<Pair<Hand, Finger>> arrayList, getNfiq1Score getnfiq1score) {
        Object[] objArr;
        long j;
        values valuesVar;
        values valuesVar2;
        boolean z3;
        int i;
        ArrayList<TemplateSize> arrayList2;
        values valuesVar3;
        TemplateOutput values2;
        Object[] objArr2 = Fpnative.valueOf;
        boolean z4 = true;
        int i2 = 0;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i3 = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | (-37884481))) | (~(i3 | 188879585)) | (~(310009694 | i3)), 568, (((~((-310009695) | identityHashCode)) | (~((-188879586) | identityHashCode)) | (~(461004799 | i3))) * (-568)) + (((~((-310009695) | i3)) | 37884480 | (~((-188879586) | i3))) * (-1136)) + 400158215, 1961045778);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    Object[] objArr3 = objArr;
                    ((long[]) objArr3[0])[0] = j + 4925;
                    Fpnative.valueOf = objArr3;
                    if (!hashMap.containsKey(Template.FF_ISO_19794_4) || hashMap.containsKey(Template.FF_WSQ)) {
                        for (Map.Entry<Hand, Map<Finger, getPadSub3>> entry : map.entrySet()) {
                            Hand key = entry.getKey();
                            HandOutput handOutput = new HandOutput(key, this.values);
                            try {
                                Template template = Template.FF_ISO_19794_4;
                                if (hashMap.containsKey(template)) {
                                    handOutput.addTemplates(template, new String(Base64.encode(PngjBadSignature(entry, Template.ISO_19794_4), this.valueOf)));
                                }
                                Template template2 = Template.FF_WSQ;
                                if (hashMap.containsKey(template2)) {
                                    handOutput.addTemplates(template2, new String(Base64.encode(PngjBadSignature(entry, Template.WSQ), this.valueOf)));
                                }
                            } catch (Exception unused) {
                            }
                            this.Action.put(key, handOutput);
                        }
                    }
                    valuesVar = new values(map, getnfiq1score);
                    if (!hashMap.containsKey(Template.SLAP_PNG) || hashMap.containsKey(Template.SLAP_WSQ)) {
                        this.PngjBadSignature++;
                        new PngjBadCrcException(map, hashMap, valuesVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    }
                    for (Map.Entry<Hand, Map<Finger, getPadSub3>> entry2 : map.entrySet()) {
                        Hand key2 = entry2.getKey();
                        for (Map.Entry<Finger, getPadSub3> entry3 : entry2.getValue().entrySet()) {
                            Finger key3 = entry3.getKey();
                            getPadSub3 value = entry3.getValue();
                            FingerOutput fingerOutput = new FingerOutput(value.PngjException, value.PngjBadCrcException, value, this.values);
                            if (!arrayList.contains(new Pair(key2, key3))) {
                                for (Template template3 : hashMap.keySet()) {
                                    try {
                                        if (!template3.equals(Template.FF_ISO_19794_4) && !template3.equals(Template.FF_WSQ) && !template3.equals(Template.SLAP_PNG) && !template3.equals(Template.SLAP_WSQ)) {
                                            HashMap<Finger, ArrayList<TemplateSize>> hashMap2 = hashMap.get(template3);
                                            ArrayList<TemplateSize> arrayList3 = new ArrayList<>();
                                            if (hashMap2 == null) {
                                                arrayList3.add(TemplateSize.DEFAULT);
                                            } else {
                                                arrayList3 = hashMap2.get(key3);
                                            }
                                            ArrayList<TemplateSize> arrayList4 = arrayList3;
                                            int size = arrayList4.size();
                                            z3 = z4;
                                            int i6 = i2;
                                            while (i6 < size) {
                                                try {
                                                    TemplateSize templateSize = arrayList4.get(i6);
                                                    i6++;
                                                    TemplateSize templateSize2 = templateSize;
                                                    i = i2;
                                                    try {
                                                        try {
                                                            if (!value.PngjUnsupportedException.containsKey(template3) || ((byte[]) value.PngjUnsupportedException.get(template3)) == null) {
                                                                arrayList2 = arrayList4;
                                                            } else {
                                                                arrayList2 = arrayList4;
                                                                if (((byte[]) value.PngjUnsupportedException.get(template3)).length > 10) {
                                                                    byte[] bArr = (byte[]) value.PngjUnsupportedException.get(template3);
                                                                    try {
                                                                        values2 = values(bArr, this.valueOf);
                                                                    } catch (Exception unused2) {
                                                                        valuesVar3 = valuesVar;
                                                                    }
                                                                    if (values2 != null) {
                                                                        fingerOutput.addEncryptedTemplates(template3, TemplateSize.DEFAULT, values2);
                                                                        arrayList4 = arrayList2;
                                                                        i2 = i;
                                                                    } else {
                                                                        valuesVar3 = valuesVar;
                                                                        try {
                                                                            fingerOutput.addTemplates(template3, TemplateSize.DEFAULT, new String(Base64.encode(bArr, this.valueOf)));
                                                                        } catch (Exception unused3) {
                                                                        }
                                                                        arrayList4 = arrayList2;
                                                                        i2 = i;
                                                                        valuesVar = valuesVar3;
                                                                    }
                                                                }
                                                            }
                                                            value.values(TemplateSize.DEFAULT);
                                                            this.PngjBadSignature++;
                                                            int i7 = size;
                                                            PngjException(template3, value, fingerOutput, valuesVar2, templateSize2);
                                                            size = i7;
                                                            i2 = i;
                                                            valuesVar = valuesVar2;
                                                            arrayList4 = arrayList2;
                                                        } catch (Exception e) {
                                                            e = e;
                                                            try {
                                                                if (LibSettings.isSaveCaptured()) {
                                                                }
                                                            } catch (Exception e2) {
                                                                e2.printStackTrace();
                                                            }
                                                            z4 = z3;
                                                            i2 = i;
                                                            valuesVar = valuesVar2;
                                                        }
                                                        valuesVar2 = valuesVar;
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        valuesVar2 = valuesVar;
                                                    }
                                                } catch (Exception e4) {
                                                    e = e4;
                                                    valuesVar2 = valuesVar;
                                                    i = i2;
                                                    if (LibSettings.isSaveCaptured()) {
                                                        e.getMessage();
                                                    }
                                                    z4 = z3;
                                                    i2 = i;
                                                    valuesVar = valuesVar2;
                                                }
                                            }
                                            z4 = z3;
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        valuesVar2 = valuesVar;
                                        z3 = z4;
                                    }
                                }
                            }
                            values valuesVar4 = valuesVar;
                            boolean z5 = z4;
                            int i8 = i2;
                            if (z2) {
                                fingerOutput.setScore(value.valueOf);
                            }
                            if (z) {
                                fingerOutput.setSpoofScore(value.PngjInputException);
                            }
                            this.e1.put(Pair.create(key2, key3), fingerOutput);
                            z4 = z5;
                            i2 = i8;
                            valuesVar = valuesVar4;
                        }
                    }
                    values valuesVar5 = valuesVar;
                    int i9 = this.PngjBadSignature;
                    int i10 = ((int[]) objArr3[z4 ? 1 : 0])[i2];
                    int i11 = ((i10 * i10) - (~(-(71089635 * i10)))) - 1;
                    int i12 = -(i10 * 1540040947);
                    int i13 = (i11 & i12) + (i12 | i11);
                    int i14 = (i13 ^ (-1141485895)) + (((-1141485895) & i13) << 1);
                    int i15 = i14 >> 16;
                    int i16 = ((i15 ^ (-131071)) + ((i15 & (-131071)) << 1)) / 65536;
                    int i17 = ((i16 | 1) << 1) - (i16 ^ 1);
                    int i18 = (i14 & i17) + (i17 | i14);
                    int i19 = i14 >> 25;
                    int i20 = (-(b.a(i19 ^ (-255), (i19 & (-255)) << 1, 128, -1) ^ i18)) + 7;
                    int i21 = i20 >> 19;
                    int a = b.a(i21 & (-16383), i21 | (-16383), ConstantsKt.DEFAULT_BUFFER_SIZE, -1);
                    this.PngjBadSignature = (595 / ((i20 & (-((a & 1) + (a | 1)))) * 85)) + i9;
                    valuesVar5.values();
                }
            }
            byte[] bArr2 = $$g;
            Object[] objArr4 = new Object[1];
            d(bArr2[50], bArr2[113], bArr2[63], objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            d((byte) 79, bArr2[63], bArr2[4], objArr5);
            objArr = (Object[]) cls.getMethod((String) objArr5[0], Integer.TYPE).invoke(null, 1961045778);
            j = ((long[]) objArr[0])[0];
            Object[] objArr32 = objArr;
            ((long[]) objArr32[0])[0] = j + 4925;
            Fpnative.valueOf = objArr32;
            if (!hashMap.containsKey(Template.FF_ISO_19794_4)) {
            }
            while (r2.hasNext()) {
            }
            valuesVar = new values(map, getnfiq1score);
            if (!hashMap.containsKey(Template.SLAP_PNG)) {
            }
            this.PngjBadSignature++;
            new PngjBadCrcException(map, hashMap, valuesVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            while (r11.hasNext()) {
            }
            values valuesVar52 = valuesVar;
            int i92 = this.PngjBadSignature;
            int i102 = ((int[]) objArr32[z4 ? 1 : 0])[i2];
            int i112 = ((i102 * i102) - (~(-(71089635 * i102)))) - 1;
            int i122 = -(i102 * 1540040947);
            int i132 = (i112 & i122) + (i122 | i112);
            int i142 = (i132 ^ (-1141485895)) + (((-1141485895) & i132) << 1);
            int i152 = i142 >> 16;
            int i162 = ((i152 ^ (-131071)) + ((i152 & (-131071)) << 1)) / 65536;
            int i172 = ((i162 | 1) << 1) - (i162 ^ 1);
            int i182 = (i142 & i172) + (i172 | i142);
            int i192 = i142 >> 25;
            int i202 = (-(b.a(i192 ^ (-255), (i192 & (-255)) << 1, 128, -1) ^ i182)) + 7;
            int i212 = i202 >> 19;
            int a2 = b.a(i212 & (-16383), i212 | (-16383), ConstantsKt.DEFAULT_BUFFER_SIZE, -1);
            this.PngjBadSignature = (595 / ((i202 & (-((a2 & 1) + (a2 | 1)))) * 85)) + i92;
            valuesVar52.values();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public Action getAction() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ((identityHashCode | 480343005) * (-50)) + 2113889349;
                    int i2 = ~((-29249) | identityHashCode);
                    int i3 = ~identityHashCode;
                    int c = defpackage.a.c((~(i3 | 480343005)) | (~((-18546275) | i3)) | 18517026, 50, ((i2 | (~((-18517027) | i3))) * 50) + i, 1345039095);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 5043;
                    Fpnative.valueOf = objArr;
                    return this.PngjUnsupportedException;
                }
            }
            byte[] bArr = $$g;
            Object[] objArr3 = new Object[1];
            d(bArr[63], bArr[113], bArr[34], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(bArr[0], bArr[32], bArr[111], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1345039095);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5043;
            Fpnative.valueOf = objArr;
            return this.PngjUnsupportedException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public Map<Hand, HandOutput> getCustomHandPrints() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int c = defpackage.a.c(uptimeMillis | 118172474, 104, ((~((~uptimeMillis) | 398159679)) * (-104)) + (((~((-380716806) | uptimeMillis)) | 100729600) * 104) + 154011815, -2028892338);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4975;
                    Fpnative.valueOf = objArr;
                    return this.Action;
                }
            }
            byte[] bArr = $$g;
            Object[] objArr3 = new Object[1];
            d((byte) 97, bArr[113], bArr[29], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            d((byte) 125, b, (byte) (b | 28), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -2028892338);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4975;
            Fpnative.valueOf = objArr;
            return this.Action;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public String getLivenessServerRequest() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) SystemClock.elapsedRealtime())) | (-139223484))) | 541115, 191, (((~(r0 | (-139223484))) | 638112763) * 191) - 1943445643, -262284397);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4992;
                    Fpnative.valueOf = objArr;
                    return this.n;
                }
            }
            byte[] bArr = $$g;
            Object[] objArr3 = new Object[1];
            d((byte) 97, bArr[113], bArr[29], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = bArr[63];
            Object[] objArr4 = new Object[1];
            d((byte) 125, b, (byte) (b | 28), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -262284397);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4992;
            Fpnative.valueOf = objArr;
            return this.n;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public Map<Pair<Hand, Finger>, FingerOutput> getPrints() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myPid = Process.myPid();
                    int i = ~myPid;
                    int c = defpackage.a.c((~(myPid | 469753855)) | (~((-201120501) | i)) | 29135424, 676, (((~(297768779 | i)) | 171985076) * 676) + (((-171985077) | myPid) * (-676)) + 1408616443, 344434499);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4916;
                    Fpnative.valueOf = objArr;
                    return this.e1;
                }
            }
            byte[] bArr = $$g;
            Object[] objArr3 = new Object[1];
            d(bArr[50], bArr[113], bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((byte) 79, bArr[63], bArr[4], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 344434499);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4916;
            Fpnative.valueOf = objArr;
            return this.e1;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public Map<Slap, SlapOutput> getSLAPOutput() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a = defpackage.a.a();
                    int i = ~a;
                    int i2 = (((((~((-37394231) | i)) | 33592064) | (~((-461495050) | i))) | (~(465297215 | a))) * (-84)) - 544084245;
                    int i3 = (~(a | (-461495050))) | 37394230;
                    int i4 = ~(i | 461495049);
                    int c = defpackage.a.c(i4 | (-465297216), 84, ((i3 | i4) * (-84)) + i2, -784227828);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4942;
                    Fpnative.valueOf = objArr;
                    return this.PngjBadCrcException;
                }
            }
            byte[] bArr = $$g;
            Object[] objArr3 = new Object[1];
            d(bArr[63], bArr[113], bArr[34], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(bArr[0], bArr[32], bArr[111], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -784227828);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4942;
            Fpnative.valueOf = objArr;
            return this.PngjBadCrcException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public void setLivenessServerRequest(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~(System.identityHashCode(this) | (-81777663));
                    int c = defpackage.a.c(i | 570426368, 196, (((-652204031) | i) * (-196)) + 1381499651, -676789792);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5014;
                    Fpnative.valueOf = objArr;
                    this.n = str;
                }
            }
            byte[] bArr = $$g;
            Object[] objArr3 = new Object[1];
            d(bArr[50], bArr[113], bArr[63], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((byte) 79, bArr[63], bArr[4], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -676789792);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5014;
            Fpnative.valueOf = objArr;
            this.n = str;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:(2:3|(20:5|6|7|8|(2:11|9)|12|13|(2:16|14)|17|18|(2:21|19)|22|23|24|(4:26|(5:29|(1:31)|32|33|27)|34|35)(1:91)|36|37|(1:88)(7:41|(11:44|45|46|(4:48|(4:50|51|52|53)|61|62)(1:75)|63|(4:65|(1:67)|68|69)|70|(1:72)|73|74|42)|79|80|81|82|83)|57|58))|94|95|96|6|7|8|(1:9)|12|13|(1:14)|17|18|(1:19)|22|23|24|(0)(0)|36|37|(1:39)|88|57|58) */
    /* JADX WARN: Can't wrap try/catch for region: R(28:0|1|(2:3|(20:5|6|7|8|(2:11|9)|12|13|(2:16|14)|17|18|(2:21|19)|22|23|24|(4:26|(5:29|(1:31)|32|33|27)|34|35)(1:91)|36|37|(1:88)(7:41|(11:44|45|46|(4:48|(4:50|51|52|53)|61|62)(1:75)|63|(4:65|(1:67)|68|69)|70|(1:72)|73|74|42)|79|80|81|82|83)|57|58))|93|94|95|96|6|7|8|(1:9)|12|13|(1:14)|17|18|(1:19)|22|23|24|(0)(0)|36|37|(1:39)|88|57|58|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x03e5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x03e6, code lost:
    
        r4 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00e9 A[Catch: Exception -> 0x03f0, LOOP:0: B:9:0x00e3->B:11:0x00e9, LOOP_END, TryCatch #0 {Exception -> 0x03f0, blocks: (B:8:0x00d9, B:9:0x00e3, B:11:0x00e9, B:13:0x0128, B:14:0x0132, B:16:0x0138, B:18:0x0156, B:19:0x0162, B:21:0x0168, B:23:0x018a, B:26:0x0194, B:27:0x01a3, B:29:0x01a9, B:31:0x01cf, B:33:0x0202, B:35:0x0211, B:56:0x03ea, B:57:0x03ed), top: B:7:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0138 A[Catch: Exception -> 0x03f0, LOOP:1: B:14:0x0132->B:16:0x0138, LOOP_END, TryCatch #0 {Exception -> 0x03f0, blocks: (B:8:0x00d9, B:9:0x00e3, B:11:0x00e9, B:13:0x0128, B:14:0x0132, B:16:0x0138, B:18:0x0156, B:19:0x0162, B:21:0x0168, B:23:0x018a, B:26:0x0194, B:27:0x01a3, B:29:0x01a9, B:31:0x01cf, B:33:0x0202, B:35:0x0211, B:56:0x03ea, B:57:0x03ed), top: B:7:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0168 A[Catch: Exception -> 0x03f0, LOOP:2: B:19:0x0162->B:21:0x0168, LOOP_END, TryCatch #0 {Exception -> 0x03f0, blocks: (B:8:0x00d9, B:9:0x00e3, B:11:0x00e9, B:13:0x0128, B:14:0x0132, B:16:0x0138, B:18:0x0156, B:19:0x0162, B:21:0x0168, B:23:0x018a, B:26:0x0194, B:27:0x01a3, B:29:0x01a9, B:31:0x01cf, B:33:0x0202, B:35:0x0211, B:56:0x03ea, B:57:0x03ed), top: B:7:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0194 A[Catch: Exception -> 0x03f0, TRY_ENTER, TryCatch #0 {Exception -> 0x03f0, blocks: (B:8:0x00d9, B:9:0x00e3, B:11:0x00e9, B:13:0x0128, B:14:0x0132, B:16:0x0138, B:18:0x0156, B:19:0x0162, B:21:0x0168, B:23:0x018a, B:26:0x0194, B:27:0x01a3, B:29:0x01a9, B:31:0x01cf, B:33:0x0202, B:35:0x0211, B:56:0x03ea, B:57:0x03ed), top: B:7:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r4v32, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v7, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject toJson(Context context) {
        Object[] objArr;
        long j;
        JSONObject jSONObject;
        int i;
        int r17;
        int r4;
        Object obj;
        HashMap hashMap;
        Object obj2;
        Object[] objArr2;
        Iterator it;
        Map.Entry entry;
        Object obj3;
        Object[] objArr3 = Fpnative.valueOf;
        int i2 = 0;
        boolean z = true;
        try {
            if (objArr3 != null) {
                long j2 = ((long[]) objArr3[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr3[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-430113049))) | 68681767, 446, (((~((~identityHashCode) | (-430160281))) | 47232) * 446) + 1332570237, -1074399846);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5029;
                    Fpnative.valueOf = objArr;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject = new JSONObject();
                    for (Map.Entry entry2 : this.e1.entrySet()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(((Hand) ((Pair) entry2.getKey()).first).toString());
                        sb.append(((Finger) ((Pair) entry2.getKey()).second).toString());
                        jSONObject.put(sb.toString(), ((FingerOutput) entry2.getValue()).toJson(context));
                    }
                    for (Map.Entry entry3 : this.Action.entrySet()) {
                        jSONObject.put(((Hand) entry3.getKey()).toString(), ((HandOutput) entry3.getValue()).toJson(context));
                    }
                    for (Map.Entry<Slap, SlapOutput> entry4 : getSLAPOutput().entrySet()) {
                        jSONObject.put(entry4.getKey().toString().toLowerCase(), entry4.getValue().toJson(context));
                    }
                    if (this.PngjExceptionInternal.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        for (Map.Entry entry5 : this.PngjExceptionInternal.entrySet()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("picture", entry5.getValue());
                            JSONArray jSONArray2 = new JSONArray();
                            ArrayList arrayList = (ArrayList) entry5.getKey();
                            int size = arrayList.size();
                            int i5 = i2;
                            while (i5 < size) {
                                Object obj4 = arrayList.get(i5);
                                i5++;
                                Pair pair = (Pair) obj4;
                                int i6 = i2;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(((Hand) pair.first).toString());
                                sb2.append(((Finger) pair.second).toString());
                                jSONArray2.put(sb2.toString());
                                i2 = i6;
                                z = z;
                            }
                            jSONObject3.put("fingers", jSONArray2);
                            jSONArray.put(jSONObject3);
                            i2 = i2;
                            z = z;
                        }
                        i = i2;
                        r17 = z;
                        jSONObject.put("gimages", jSONArray);
                    } else {
                        i = 0;
                        r17 = 1;
                    }
                    hashMap = this.PngjInputException;
                    if (hashMap != null || hashMap.size() <= 0) {
                        obj = jSONObject;
                    } else {
                        JSONArray jSONArray3 = new JSONArray();
                        Iterator it2 = this.PngjInputException.entrySet().iterator();
                        jSONObject = jSONObject;
                        while (it2.hasNext()) {
                            try {
                                Map.Entry entry6 = (Map.Entry) it2.next();
                                JSONObject jSONObject4 = new JSONObject();
                                com.identy.g.PngjBadCrcException pngjBadCrcException = (com.identy.g.PngjBadCrcException) entry6.getValue();
                                JSONObject jSONObject5 = new JSONObject();
                                jSONObject5.put("lux", pngjBadCrcException.PngjBadCrcException);
                                if (pngjBadCrcException.PngjException != null) {
                                    JSONArray jSONArray4 = new JSONArray();
                                    objArr2 = objArr;
                                    ArrayList arrayList2 = pngjBadCrcException.PngjException;
                                    it = it2;
                                    int size2 = arrayList2.size();
                                    entry = entry6;
                                    int i7 = i;
                                    Object obj5 = jSONObject;
                                    while (i7 < size2) {
                                        Object obj6 = arrayList2.get(i7);
                                        int i8 = i7 + 1;
                                        ArrayList arrayList3 = arrayList2;
                                        com.identy.g.PngjException pngjException = (com.identy.g.PngjException) obj6;
                                        int i9 = size2;
                                        JSONObject jSONObject6 = new JSONObject();
                                        obj2 = obj5;
                                        try {
                                            jSONObject6.put("x", pngjException.PngjBadCrcException);
                                            jSONObject6.put("y", pngjException.PngjBadSignature);
                                            jSONObject6.put("z", pngjException.PngjException);
                                            jSONObject6.put("ts", pngjException.valueOf);
                                            jSONArray4.put(jSONObject6);
                                            size2 = i9;
                                            arrayList2 = arrayList3;
                                            obj5 = obj2;
                                            i7 = i8;
                                        } catch (Exception e) {
                                            e = e;
                                            r4 = obj2;
                                            e.printStackTrace();
                                            obj = r4;
                                            jSONObject2.put("data", obj);
                                            return jSONObject2;
                                        }
                                    }
                                    obj3 = obj5;
                                    jSONObject5.put("accel", jSONArray4);
                                } else {
                                    objArr2 = objArr;
                                    it = it2;
                                    entry = entry6;
                                    obj3 = jSONObject;
                                }
                                if (pngjBadCrcException.PngjBadSignature != null) {
                                    JSONArray jSONArray5 = new JSONArray();
                                    ArrayList arrayList4 = pngjBadCrcException.PngjBadSignature;
                                    int i10 = i;
                                    for (int size3 = arrayList4.size(); i10 < size3; size3 = size3) {
                                        Object obj7 = arrayList4.get(i10);
                                        i10++;
                                        JSONObject jSONObject7 = new JSONObject();
                                        jSONObject7.put("x", r10.PngjException);
                                        jSONObject7.put("y", r10.valueOf);
                                        jSONObject7.put("z", r10.PngjBadCrcException);
                                        jSONObject7.put("ts", ((com.identy.g.PngjBadSignature) obj7).values);
                                        jSONArray5.put(jSONObject7);
                                        arrayList4 = arrayList4;
                                    }
                                    jSONObject5.put("gyro", jSONArray5);
                                }
                                jSONObject4.put("data", jSONObject5);
                                JSONArray jSONArray6 = new JSONArray();
                                ArrayList arrayList5 = (ArrayList) entry.getKey();
                                int size4 = arrayList5.size();
                                int i11 = i;
                                while (i11 < size4) {
                                    Object obj8 = arrayList5.get(i11);
                                    i11++;
                                    Pair pair2 = (Pair) obj8;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(((Hand) pair2.first).toString());
                                    sb3.append(((Finger) pair2.second).toString());
                                    jSONArray6.put(sb3.toString());
                                }
                                jSONObject4.put("fingers", jSONArray6);
                                jSONArray3.put(jSONObject4);
                                it2 = it;
                                objArr = objArr2;
                                jSONObject = obj3;
                            } catch (Exception e2) {
                                e = e2;
                                obj2 = jSONObject;
                                r4 = obj2;
                                e.printStackTrace();
                                obj = r4;
                                jSONObject2.put("data", obj);
                                return jSONObject2;
                            }
                        }
                        obj2 = jSONObject;
                        int i12 = ((int[]) objArr[r17])[i];
                        int i13 = i12 * i12;
                        int i14 = -(1047877187 * i12);
                        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                        int i16 = -(i12 * 499372949);
                        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                        int i18 = ((i17 | (-1170097776)) << 1) - ((-1170097776) ^ i17);
                        int i19 = i18 >> 15;
                        int i20 = ((i19 & (-262143)) + (i19 | (-262143))) / 131072;
                        int i21 = (i20 & 1) + (i20 | 1);
                        int i22 = ((i18 | i21) << 1) - (i21 ^ i18);
                        int i23 = i18 >> 26;
                        int i24 = (((i23 | (-127)) << 1) - (i23 ^ (-127))) / 64;
                        int i25 = (-(((i24 & 1) + (i24 | 1)) ^ i22)) + 6;
                        int i26 = i25 >> 22;
                        int i27 = (((i26 | (-2047)) << 1) - (i26 ^ (-2047))) / 1024;
                        String substring = "0\\sensor_data".substring(10056 / ((i25 & (-((((i27 | 1) << 1) - (i27 ^ 1)) + 1))) * 838));
                        r4 = obj2;
                        try {
                            r4.put(substring, jSONArray3);
                            obj = r4;
                        } catch (Exception e3) {
                            e = e3;
                            e.printStackTrace();
                            obj = r4;
                            jSONObject2.put("data", obj);
                            return jSONObject2;
                        }
                    }
                    jSONObject2.put("data", obj);
                    return jSONObject2;
                }
            }
            byte[] bArr = $$g;
            Object[] objArr4 = new Object[1];
            d((byte) 97, bArr[113], bArr[29], objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            byte b = bArr[63];
            Object[] objArr5 = new Object[1];
            d((byte) 125, b, (byte) (b | 28), objArr5);
            objArr = (Object[]) cls.getMethod((String) objArr5[0], Integer.TYPE).invoke(null, -1095465318);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5029;
            Fpnative.valueOf = objArr;
            JSONObject jSONObject22 = new JSONObject();
            jSONObject = new JSONObject();
            while (r8.hasNext()) {
            }
            while (r8.hasNext()) {
            }
            while (r8.hasNext()) {
            }
            if (this.PngjExceptionInternal.isEmpty()) {
            }
            hashMap = this.PngjInputException;
            if (hashMap != null) {
            }
            obj = jSONObject;
            jSONObject22.put("data", obj);
            return jSONObject22;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final TemplateOutput values(byte[] bArr, int i) {
        IdentyEncrytion identyEncrytion = this.PngBadCharsetException;
        try {
            if (identyEncrytion != null) {
                return identyEncrytion.getEncryptor().PngjBadSignature(bArr, this.PngjOutputException, i);
            }
            IdentyCustomEncryption identyCustomEncryption = this.PngjPrematureEnding;
            if (identyCustomEncryption == null) {
                return null;
            }
            byte[] encrypt = identyCustomEncryption.encrypt(bArr);
            TemplateOutput templateOutput = new TemplateOutput();
            templateOutput.setData(Base64.encodeToString(encrypt, i));
            return templateOutput;
        } catch (Exception unused) {
            return null;
        }
    }

    private byte[] PngjBadSignature(Map.Entry entry, Template template) {
        Template template2;
        byte[] PngjBadCrcException2;
        try {
            String str = template.equals(Template.WSQ) ? "wsq" : "iso4";
            File values2 = com.identy.PngjBadCrcException.values(this.PngjException, "ZIP");
            StringBuilder sb = new StringBuilder();
            sb.append(((Hand) entry.getKey()).toString());
            sb.append(template);
            sb.append(".zip");
            File file = new File(values2, sb.toString());
            ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(file));
            Iterator it = ((Map) entry.getValue()).entrySet().iterator();
            while (it.hasNext()) {
                getPadSub3 getpadsub3 = (getPadSub3) ((Map.Entry) it.next()).getValue();
                try {
                    if (getpadsub3.PngjUnsupportedException.containsKey(template)) {
                        PngjBadCrcException2 = (byte[]) getpadsub3.PngjUnsupportedException.get(template);
                        template2 = template;
                    } else {
                        template2 = template;
                        try {
                            PngjBadCrcException2 = template.getGenerator().PngjBadCrcException(template2, getpadsub3, this.PngjException, 0L, null, this.values);
                        } catch (Exception unused) {
                        }
                    }
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(BuildConfig.FLAVOR);
                    sb3.append(getpadsub3.PngjException.toString());
                    sb3.append("_");
                    sb3.append(getpadsub3.PngjBadCrcException.toString());
                    sb2.append(sb3.toString());
                    sb2.append(".");
                    sb2.append(str);
                    zipOutputStream.putNextEntry(new ZipEntry(sb2.toString()));
                    zipOutputStream.write(PngjBadCrcException2);
                } catch (Exception unused2) {
                    template2 = template;
                }
                template = template2;
            }
            zipOutputStream.close();
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            bufferedInputStream.read(bArr, 0, length);
            bufferedInputStream.close();
            com.identy.app.PngjBadSignature.values(file);
            return bArr;
        } catch (Exception unused3) {
            return null;
        }
    }

    public IdentyResponse(Action action, int i, WSQCompression wSQCompression, IdentyEncrytion identyEncrytion, String str, IdentyCustomEncryption identyCustomEncryption, Activity activity, Map map, HashMap hashMap) {
        this.PngjBadSignature = 0;
        this.e1 = new HashMap();
        this.Action = new HashMap();
        this.PngjBadCrcException = new HashMap();
        this.PngjUnsupportedException = action;
        this.valueOf = i;
        this.values = wSQCompression;
        this.PngBadCharsetException = identyEncrytion;
        this.PngjOutputException = str;
        this.PngjPrematureEnding = identyCustomEncryption;
        this.PngjException = activity;
        this.PngjExceptionInternal = map;
        this.PngjInputException = hashMap;
    }

    public JSONObject toJson() {
        Object[] objArr;
        long j;
        Object[] objArr2 = Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a = defpackage.a.a();
                    int c = defpackage.a.c((~((~a) | 394701199)) | (-104188081), 168, (((~(a | 394701199)) | (-397928896)) * (-168)) + ((((~((-104188081) | a)) | 100960384) * 336) - 1710130969), 1514653481);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4923;
                    Fpnative.valueOf = objArr;
                    return toJson(this.PngjException);
                }
            }
            byte[] bArr = $$g;
            Object[] objArr3 = new Object[1];
            d(bArr[63], bArr[113], bArr[34], objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d(bArr[0], bArr[32], bArr[111], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1514653481);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4923;
            Fpnative.valueOf = objArr;
            return toJson(this.PngjException);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
