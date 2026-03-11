package com.identy;

import android.app.Activity;
import android.util.Pair;
import com.identy.app.LManager;
import com.identy.app.users.IdentyUser;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.enums.Template;
import com.karumi.dexter.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
public class a extends getMatchingTime {
    FingerDetectionMode PngjBadCrcException;
    Date PngjBadSignature;
    private int e1;
    private String getAsHighestSecurityLevelReached;
    private boolean getPadSub2;
    PngBadCharsetException valueOf;
    public int values;
    public double PngjException = 0.0d;
    private final boolean getPadSub1 = true;
    public int PngjUnsupportedException = 0;
    private final List getPadSub3 = new ArrayList();

    public a(int i, Hand hand, Finger finger, FingerDetectionMode fingerDetectionMode, boolean z) {
        this.PngjBadCrcException = FingerDetectionMode.L4F;
        this.e1 = i;
        this.PngjOutputException = hand;
        this.PngjExceptionInternal = finger;
        this.PngjPrematureEnding = null;
        this.PngjBadCrcException = fingerDetectionMode;
        this.getAsHighestSecurityLevelReached = BuildConfig.FLAVOR;
        this.getPadSub2 = z;
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ float Action() {
        return super.Action();
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ int Attempt() {
        return super.Attempt();
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ float PngBadCharsetException() {
        return super.PngBadCharsetException();
    }

    public final String PngjBadCrcException() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getAsHighestSecurityLevelReached);
        sb.append(" RFQ:%d ");
        return String.format(sb.toString(), Integer.valueOf(this.PngjUnsupportedException));
    }

    public final Finger PngjBadSignature() {
        return this.PngjExceptionInternal;
    }

    public final String PngjException(boolean z) {
        if (this.getPadSub3.size() <= 0) {
            return z ? BuildConfig.FLAVOR : String.format("Sc:%04d", Integer.valueOf(this.values));
        }
        Iterator it = this.getPadSub3.iterator();
        if (!it.hasNext()) {
            return BuildConfig.FLAVOR;
        }
        com.identy.enums.valueOf valueof = ((com.identy.a.PngjException) it.next()).valueOf;
        com.identy.enums.valueOf valueof2 = com.identy.enums.valueOf.BOZORTH;
        throw null;
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ Map PngjExceptionInternal() {
        return super.PngjExceptionInternal();
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ float PngjInputException() {
        return super.PngjInputException();
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ boolean PngjOutputException() {
        return super.PngjOutputException();
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ float PngjPrematureEnding() {
        return super.PngjPrematureEnding();
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ FingerAS PngjUnsupportedException() {
        return super.PngjUnsupportedException();
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ float a() {
        return super.a();
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ int e1() {
        return super.e1();
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ void getAsHighestSecurityLevelReached() {
        super.getAsHighestSecurityLevelReached();
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ Mat getPadSub3() {
        return super.getPadSub3();
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ float onErrorResponse() {
        return super.onErrorResponse();
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ void valueOf(int i) {
        super.valueOf(i);
    }

    public final Hand values() {
        return this.PngjOutputException;
    }

    public final void PngjBadCrcException(String str, Activity activity, boolean z, long j) {
        String obj;
        Mat mat = this.PngjPrematureEnding;
        if (mat == null || Mat.n_rows(mat.PngjException) == 0 || Mat.n_cols(this.PngjPrematureEnding.PngjException) == 0) {
            return;
        }
        try {
            IdentyUser B = IdentySdk.getInstance().B();
            if (B.isDefault()) {
                obj = "ENROLL";
            } else {
                StringBuilder sb = new StringBuilder("ENROLL_U");
                sb.append(B.uid);
                obj = sb.toString();
            }
            File values = PngjBadCrcException.values(activity, obj);
            String obj2 = values.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(valueOf(str));
            sb2.append(".txt");
            File file = new File(obj2, sb2.toString());
            String obj3 = values.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(valueOf(str));
            sb3.append(".jpeg");
            File file2 = new File(obj3, sb3.toString());
            if (file2.exists()) {
                com.identy.app.PngjBadSignature.values(file2);
            }
            String replace = file2.getAbsolutePath().replace(".jpeg", BuildConfig.FLAVOR);
            try {
                byte[] bArr = (byte[]) this.PngBadCharsetException.get(Template.IDENTY_1);
                if (z) {
                    LManager m = IdentySdk.getInstance().m();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(replace);
                    sb4.append(".isocryptv4");
                    m.encryptTemplatev2(bArr, sb4.toString());
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(j);
                fileOutputStream.write(sb5.toString().getBytes());
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ void PngjBadSignature(float f, float f2, float f3, float f4) {
        super.PngjBadSignature(f, f2, f3, f4);
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ boolean valueOf() {
        return super.valueOf();
    }

    public final void values(Mat mat) {
        this.PngjPrematureEnding = mat;
        this.PngjBadSignature = new Date();
    }

    public final void PngjBadSignature(Template[] templateArr, WSQCompression wSQCompression, boolean z) {
        HashMap<Integer, byte[]> generate;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        int[] iArr = new int[templateArr.length];
        int i = 0;
        for (Template template : templateArr) {
            if (template.ordinal() < Template.SLAP_WSQ.ordinal()) {
                iArr[i] = template.ordinal();
                i++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i);
        StringBuilder sb = new StringBuilder("TEMPLATE SETUP");
        sb.append(Arrays.toString(copyOf));
        PngjBadCrcException.PngjException(sb.toString(), timeInMillis);
        if (this.getPadSub2) {
            generate = Fpnative.rgenerate(e1.PngjBadCrcException, Position.getFromHandFinger(new Pair(this.PngjOutputException, this.PngjExceptionInternal)).ordinal(), copyOf, (float) wSQCompression.getCompression(), z);
        } else {
            generate = Fpnative.generate(e1.values, Position.getFromHandFinger(new Pair(this.PngjOutputException, this.PngjExceptionInternal)).ordinal(), copyOf, (float) wSQCompression.getCompression(), z);
        }
        PngjBadCrcException.PngjException("TEMPLATE GENERATE", timeInMillis);
        for (Map.Entry<Integer, byte[]> entry : generate.entrySet()) {
            this.PngBadCharsetException.put(Template.getFromOrdinal(entry.getKey()), entry.getValue());
        }
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ void PngjException(boolean z, FingerAS fingerAS) {
        super.PngjException(z, fingerAS);
    }

    public final void PngjException(Template[] templateArr, WSQCompression wSQCompression, boolean z, com.identy.c.PngjBadCrcException pngjBadCrcException) {
        if (z) {
            PngjBadSignature(new Template[0], wSQCompression, z);
        }
        new com.identy.c.PngjException(templateArr, wSQCompression, pngjBadCrcException).execute(this);
    }

    public final boolean PngjException() {
        return this.PngjInputException.values.equals(com.identy.enums.PngjBadSignature.ACCEPTED);
    }

    @Override // com.identy.getMatchingTime
    public final /* bridge */ /* synthetic */ void PngjBadCrcException(boolean z) {
        super.PngjBadCrcException(z);
    }
}
