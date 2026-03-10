package com.identy;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.d.e.a.c.getPadSub3B15685$PngjException;
import com.identy.ex.PostCaptureOutPut;
import com.karumi.dexter.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
public final class getFingerPrintQualityScore extends AsyncTask<Mat, Integer, ArrayList<PostCaptureOutPut>> {
    private static final byte[] $$a;
    private static final int $$b;
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private boolean PngjBadCrcException;
    private ArrayList PngjBadSignature;
    private WeakReference PngjException;
    private float[] PngjExceptionInternal;
    private float[] PngjOutputException;
    private float[] PngjUnsupportedException;
    private e1 valueOf;
    private getSpoofScore values;

    public class PngjBadSignature implements getPadSub3B15685$PngjException {
        private /* synthetic */ Activity values;

        public PngjBadSignature(Activity activity) {
            this.values = activity;
        }

        @Override // com.d.e.a.c.getPadSub3B15685$PngjException
        public final void PngjBadCrcException(int i, int i2) {
            if (i != i2) {
                this.values.finish();
            }
        }

        public static Object[] PngjBadSignature$1eba2e16(int i, Object obj, int i2) { return null; }
    }

    static {
        init$0();
        $$a = new byte[]{14, 12, 119, -3, 18, -14, -12, 13, -17};
        $$b = 96;
    }

    public getFingerPrintQualityScore(Activity activity, ArrayList<Mat> arrayList, e1 e1Var, getSpoofScore getspoofscore, boolean z, float[] fArr, float[] fArr2, float[] fArr3) {
        this.PngjException = null;
        this.PngjBadSignature = arrayList;
        this.PngjException = new WeakReference(activity);
        this.valueOf = e1Var;
        this.values = getspoofscore;
        this.PngjBadCrcException = z;
        this.PngjExceptionInternal = fArr;
        this.PngjUnsupportedException = fArr2;
        this.PngjOutputException = fArr3;
        try {
            Object[] objArr = {activity, 10, new PngjBadSignature(activity)};
            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
            if (PngjBadSignature2 == null) {
                char argb = (char) (Color.argb(0, 0, 0, 0) + 14830);
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                int indexOf = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0) + 722;
                byte b = (byte) 0;
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(argb, modifierMetaStateMask, indexOf, 1560737410, false, (String) objArr2[0], new Class[]{Context.class, Integer.TYPE, getPadSub3B15685$PngjException.class});
            }
            ((Method) PngjBadSignature2).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    private ArrayList PngjBadSignature(Mat mat) {
        ArrayList arrayList;
        IdentySdk identySdk;
        int i;
        int i2;
        IdentySdk identySdk2;
        try {
            try {
                IdentySdk.getInstance().f("RUN POST Capture");
            } catch (Exception e) {
                e.printStackTrace();
            }
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            PngjBadCrcException.PngjException("SAVE DATA POST CAPTURE", timeInMillis);
            ArrayList arrayList2 = this.PngjBadSignature;
            if (arrayList2 == null || arrayList2.size() < 2) {
                return null;
            }
            Mat mat2 = (Mat) this.PngjBadSignature.get(0);
            ArrayList arrayList3 = this.PngjBadSignature;
            Mat mat3 = (Mat) arrayList3.get(arrayList3.size() - 1);
            PngjBadCrcException.PngjException("READY POST CAPTURE", timeInMillis);
            PngjBadCrcException.PngjException("CONVERT POST CAPTURE", timeInMillis);
            try {
                identySdk = IdentySdk.getInstance();
            } catch (Exception unused) {
                identySdk = null;
            }
            if (identySdk.getOutputHeight() == 0 || identySdk.getOutputWidth() == 0) {
                i = 0;
                i2 = 0;
            } else {
                i = identySdk.getOutputWidth();
                i2 = identySdk.getOutputHeight();
            }
            ((Activity) this.PngjException.get()).getApplicationContext();
            if (LibSettings.isSaveCaptured()) {
                StringBuilder sb = new StringBuilder();
                sb.append(e1.PngjInputException);
                sb.append("_");
                String obj = sb.toString();
                if (IdentySdk.getInstance().getAttackS() != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append(IdentySdk.getInstance().getAttackS());
                    obj = sb2.toString();
                }
                e1 e1Var = this.valueOf;
                identySdk2 = identySdk;
                arrayList = null;
                try {
                    byte[] cvtmat2ba = Fpnative.cvtmat2ba(new Mat(Mat.n_clone(mat.PngjException)).PngjException);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj);
                    sb3.append("_captured");
                    e1Var.PngjBadSignature(cvtmat2ba, sb3.toString(), "CAPTURED", BuildConfig.FLAVOR);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return arrayList;
                }
            } else {
                identySdk2 = identySdk;
            }
            long j = e1.values;
            long j2 = mat.PngjException;
            long j3 = mat2.PngjException;
            long j4 = mat3.PngjException;
            boolean z = this.PngjBadCrcException;
            float[] fArr = this.PngjExceptionInternal;
            float[] fArr2 = this.PngjUnsupportedException;
            float[] fArr3 = this.PngjOutputException;
            int length = fArr.length;
            boolean isEnableAllFingerNistTemplate = identySdk2.isEnableAllFingerNistTemplate();
            if (identySdk2.isEnableAllFingerNistTemplate()) {
                throw new NullPointerException();
            }
            PostCaptureOutPut ppk = Fpnative.ppk(j, j2, j3, j4, z, fArr, fArr2, fArr3, length, i, i2, isEnableAllFingerNistTemplate, 0L);
            if (LibSettings.isSaveCaptured()) {
                byte b = $$d[8];
                byte b2 = b;
                Object[] objArr = new Object[1];
                b(b2, (byte) (b2 - 1), b, objArr);
                Mat[] matArr = (Mat[]) Array.newInstance(Class.forName((String) objArr[0]), 2);
                matArr[0] = mat3;
                matArr[1] = mat2;
                int i3 = 0;
                for (int i4 = 0; i4 < 2; i4++) {
                    Mat mat4 = matArr[i4];
                    try {
                        e1 e1Var2 = this.valueOf;
                        byte[] cvtmat2ba2 = Fpnative.cvtmat2ba(mat4.PngjException);
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(e1.PngjInputException);
                        sb4.append("_");
                        sb4.append(i3);
                        e1Var2.PngjBadSignature(cvtmat2ba2, sb4.toString(), "FRAMES_POST_CAPTURE", BuildConfig.FLAVOR);
                        i3++;
                    } catch (Exception unused2) {
                    }
                }
            }
            if (LibSettings.isSaveCaptured()) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(e1.PngjInputException);
                sb5.append("_");
                String obj2 = sb5.toString();
                if (IdentySdk.getInstance().getAttackS() != null) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj2);
                    sb6.append(IdentySdk.getInstance().getAttackS());
                    obj2 = sb6.toString();
                }
                e1 e1Var3 = this.valueOf;
                byte[] encodedASImage = ppk.getEncodedASImage();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(obj2);
                sb7.append("asimage_v2");
                e1Var3.PngjBadSignature(encodedASImage, sb7.toString(), "CAPTURED", BuildConfig.FLAVOR);
                for (Map.Entry<Integer, byte[]> entry : ppk.getEncodedSegments().entrySet()) {
                    e1 e1Var4 = this.valueOf;
                    byte[] value = entry.getValue();
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(obj2);
                    sb8.append("segment_");
                    sb8.append(entry.getKey());
                    e1Var4.PngjBadSignature(value, sb8.toString(), "CAPTURED", BuildConfig.FLAVOR);
                }
            }
            Mat.n_release(mat3.PngjException);
            Mat.n_release(mat2.PngjException);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(ppk);
            this.PngjBadSignature.clear();
            return arrayList4;
        } catch (Exception e3) {
            arrayList = null;
            e3.printStackTrace();
            return arrayList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, int i2, Object[] objArr) {
        int i3;
        int i4;
        int i5 = (i2 * 2) + 118;
        int i6 = (i * 2) + 4;
        int i7 = (b * 3) + 6;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            int i9 = i6;
            i4 = 0;
            int i10 = i9 + 1;
            i5 = (i6 + (-i8)) - 3;
            i6 = i10;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            int i11 = i5;
            i9 = i6;
            i6 = i11;
            int i102 = i9 + 1;
            i5 = (i6 + (-i8)) - 3;
            i6 = i102;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void b(int i, int i2, byte b, Object[] objArr) {
        int i3;
        int i4 = b * 4;
        int i5 = (i * 2) + 111;
        int i6 = i2 + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i4 + 26];
        int i7 = i4 + 25;
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i6;
            i5 = (i6 + i5) - 5;
            i6 = i9;
            bArr = bArr3;
            i3 = i8;
            int i10 = i6 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b2 = bArr[i10];
            i6 = i5;
            i5 = b2;
            i8 = i3 + 1;
            bArr3 = bArr;
            i9 = i10;
            i5 = (i6 + i5) - 5;
            i6 = i9;
            bArr = bArr3;
            i3 = i8;
            int i102 = i6 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            int i1022 = i6 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    public static void init$0() {
        $$d = new byte[]{30, 69, 34, 112, 8, -6, -52, 64, 0, 6, 14, 11, 10, -70, 70, 6, -6, 14, -6, 24, -67, 58, 17, 8, -8, -50, 36, 25, 24};
        $$e = 122;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ ArrayList<PostCaptureOutPut> doInBackground(Mat[] matArr) {
        return PngjBadSignature(matArr[0]);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(ArrayList<PostCaptureOutPut> arrayList) {
        ArrayList<PostCaptureOutPut> arrayList2 = arrayList;
        super.onPostExecute(arrayList2);
        if (arrayList2 == null || arrayList2.isEmpty()) {
            this.values.PngjException(null, null);
        } else {
            this.values.PngjException(arrayList2.get(0), arrayList2.size() > 1 ? arrayList2.get(1) : null);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
    }
}
