package com.identy;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.identy.app.LManager;
import com.identy.app.users.IdentyUser;
import com.identy.app.users.IdentyUserManager;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.FingerMatchSecLevel;
import com.identy.enums.Hand;
import com.identy.enums.Template;
import com.identy.exceptions.AttemptsExceededLimitException;
import com.identy.exceptions.LivenessValidException;
import com.identy.exceptions.NoDetectionModeException;
import com.identy.exceptions.TimeoutExceededLimitModeException;
import com.identy.exceptions.UnSupportedTemplateException;
import com.identy.getL1Score;
import com.identy.statusupdate.FingerStatusUpdator;
import com.karumi.dexter.BuildConfig;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;
import org.identy.opencv.core.Mat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class IdentySdk {
    private static  byte[] $$a = null;
    private static  Object[] $$a_state = new Object[]{new long[1], new int[1]};
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  byte[] $$d = null;
    private static  int $$e = 0;
    private static  int $$f = 0;
    private static int $10;
    private static int $11;
    static IdentySdk PngjException;
    private static int deduplication;
    private static boolean generate;
    private static char[] generateNFIQ;
    private static int generateST;
    private static String getL2Score;
    private static String isAuthSucess;
    private static int matchCaptured;
    private static int matchMultiple;
    private static boolean pfkrolChangeMinMaxWidth;
    private static int rgenerate;
    FingerAS Action;
    WSQCompression Attempt;
    private long Capture2IndexActivity;
    private Finger[] Capture2TActivity;
    private boolean Capture4FActivity;
    private HashSet CaptureFingersActivity;
    private boolean CaptureMode;
    private boolean CapturePosition;
    private boolean CaptureRolledFingersActivity;
    private Bitmap.CompressFormat CaptureRolledThumbActivity;
    private CaptureMode CaptureThumbActivity;
    private QualityMode DeduplicationIdentyResponse;
    private int ERRORS;
    private int Enroll2IndexActivity;
    private int Enroll2TActivity;
    private int Enroll4FActivity;
    private String EnrollFingersActivity;
    private boolean EnrollThumbActivity;
    private InlineGuideOption FingerAS;
    private boolean FingerActivity;
    private String FingerOutput;
    private String Fpnative;
    String PngBadCharsetException;
    LManager PngjBadCrcException;
    boolean PngjBadSignature;
    ArrayList PngjExceptionInternal;
    int PngjInputException;
    FingerMatchSecLevel PngjOutputException;
    ArrayList PngjPrematureEnding;
    int PngjUnsupportedException;
    protected PublicKey S0;
    byte[] a;
    private boolean addEncryptedTemplates;
    private String addTemplates;
    private String closeDialog;
    private String closefDialog;
    private boolean configure;
    private List configureroll;
    private boolean cvtmat2ba;
    private boolean cvtyuv2bgr;
    private UIAfterCaptures destroy;
    protected Action e;
    boolean e1;
    protected IdentyResponseListener f;
    protected boolean g;
    long getAsHighestSecurityLevelReached;
    private HashMap getAttempts;
    boolean getCaptureTime;
    Activity getData;
    private String getEncryptedTemplates;
    UkhobTemplateBuilder getFingerPrintQualityScore;
    private HashMap getFingers;
    private boolean getHeight;
    private boolean getIdentyQuality;
    JSONObject getL1Score;
    private FingerStatusUpdator getL3Score;
    String getMatchingTime;
    boolean getNfiq1Score;
    String getOveralTimetaken;
    IdentyEncrytion getPadSub1;
    HashMap getPadSub2;
    long getPadSub3;
    TransactionListener getProcessingTime;
    String getQualityScore;
    CapturePosition getScore;
    private long getServerRequest;
    private String getShortform;
    JSONArray getSpoofScore;
    private boolean getTemplates;
    private boolean getWidth;
    protected Map h;
    protected Map i;
    private int isFoundMatchingTemplates;
    int isQualityFailed;
    HashMap onErrorResponse;
    private int pfk;
    private boolean pfkrol;
    private boolean pfkrolGetQuality;
    private boolean pfkrolfinalize;
    private int pfkrolfinalizeF;
    private boolean ppk;
    private boolean resetAttempt;
    private boolean setDConfig;
    private boolean setFingers;
    private HashMap setFoundMatchingTemplates;
    private FingerDetectionMode[] setScore;
    private int setSpoofScore;
    private boolean toJson;
    private boolean toString;
    private boolean uxd565jj;
    private IdentyUser uxd565jk;
    private boolean uxd566jk;
    ProgressDialog valueOf;
    IdentyCustomEncryption values;

    public class PngjBadCrcException implements com.identy.app.PngjBadCrcException {
        public static int PngjBadSignature;
        public static int valueOf;
        private /* synthetic */ long PngjBadCrcException;
        private /* synthetic */ InitializationListener PngjException;
        private /* synthetic */ IdentyResponseListener PngjInputException;
        private /* synthetic */ Activity values;

        public PngjBadCrcException(long j, Activity activity, InitializationListener initializationListener, IdentyResponseListener identyResponseListener) {
            this.PngjBadCrcException = j;
            this.values = activity;
            this.PngjException = initializationListener;
            this.PngjInputException = identyResponseListener;
        }

        public static int PngjBadSignature() {
            int i = PngjBadSignature;
            int i2 = i % 5476514;
            PngjBadSignature = i + 1;
            if (i2 != 0) {
                return valueOf;
            }
            int a = defpackage.a.a();
            valueOf = a;
            return a;
        }

        @Override // com.identy.app.PngjBadCrcException
        public final void PngjBadCrcException(boolean z) {
            ProgressDialog progressDialog = IdentySdk.this.valueOf;
            if (progressDialog != null && progressDialog.isShowing()) {
                IdentySdk.this.valueOf.dismiss();
            }
            if (!z) {
                IdentyResponseListener identyResponseListener = this.PngjInputException;
                ERRORS errors = com.identy.ERRORS.LICENSE_ERROR;
                IdentySdk identySdk = IdentySdk.this;
                identyResponseListener.onErrorResponse(new IdentyError(errors, null, identySdk.e, identySdk.isQualityFailed, identySdk.Attempt, identySdk.getPadSub1, identySdk.getQualityScore, identySdk.values, this.values, identySdk.i), IdentySdk.this.q());
                return;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) IdentySdk.this.getData.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                IdentyResponseListener identyResponseListener2 = this.PngjInputException;
                ERRORS errors2 = com.identy.ERRORS.NETWORK_ERROR;
                IdentySdk identySdk2 = IdentySdk.this;
                identyResponseListener2.onErrorResponse(new IdentyError(errors2, null, identySdk2.e, identySdk2.isQualityFailed, identySdk2.Attempt, identySdk2.getPadSub1, identySdk2.getQualityScore, identySdk2.values, this.values, identySdk2.i), IdentySdk.this.q());
                return;
            }
            IdentyResponseListener identyResponseListener3 = this.PngjInputException;
            ERRORS errors3 = com.identy.ERRORS.LICENSE_SERVER_NOT_CONNECTED;
            IdentySdk identySdk3 = IdentySdk.this;
            identyResponseListener3.onErrorResponse(new IdentyError(errors3, null, identySdk3.e, identySdk3.isQualityFailed, identySdk3.Attempt, identySdk3.getPadSub1, identySdk3.getQualityScore, identySdk3.values, this.values, identySdk3.i), IdentySdk.this.q());
        }

        @Override // com.identy.app.PngjBadCrcException
        public final void values(LManager lManager) {
            ProgressDialog progressDialog;
            IdentySdk.this.getPadSub3 = Calendar.getInstance().getTimeInMillis() - this.PngjBadCrcException;
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            IdentySdk identySdk = IdentySdk.this;
            identySdk.PngjBadCrcException = lManager;
            IdentySdk.PngjException = identySdk;
            new e1(this.values, false, FingerDetectionMode.R4F, false, false);
            IdentySdk.this.getAsHighestSecurityLevelReached = Calendar.getInstance().getTimeInMillis() - timeInMillis;
            if (!this.values.isFinishing() && (progressDialog = IdentySdk.this.valueOf) != null && progressDialog.isShowing()) {
                IdentySdk.this.valueOf.dismiss();
            }
            this.PngjException.onInit(IdentySdk.this);
        }
    }

    public class PngjBadSignature implements Runnable {
        public static int PngjException;
        public static int valueOf;

        /* renamed from: com.identy.IdentySdk$PngjBadSignature$PngjBadSignature, reason: collision with other inner class name */
        public class C0016PngjBadSignature implements getNfiq1Score {
            private /* synthetic */ long PngjBadCrcException;
            private /* synthetic */ IdentyResponse values;

            public C0016PngjBadSignature(long j, IdentyResponse identyResponse) {
                this.PngjBadCrcException = j;
                this.values = identyResponse;
            }

            @Override // com.identy.getNfiq1Score
            public final void values() {
                com.identy.PngjBadCrcException.PngjException("RESPONSE", this.PngjBadCrcException);
                IdentySdk identySdk = IdentySdk.this;
                boolean z = identySdk.PngjBadSignature;
                identySdk.f.onResponse(this.values, identySdk.q());
                IdentySdk.PngjException.f("on response");
                Iterator it = IdentySdk.this.h.entrySet().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Map) ((Map.Entry) it.next()).getValue()).entrySet().iterator();
                    while (it2.hasNext()) {
                        ((getPadSub3) ((Map.Entry) it2.next()).getValue()).PngjException();
                    }
                }
                IdentySdk.this.h = new HashMap();
            }
        }

        public PngjBadSignature() {
        }

        public static int PngjBadCrcException() {
            int i = valueOf;
            int i2 = i % 8842335;
            valueOf = i + 1;
            if (i2 != 0) {
                return PngjException;
            }
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            PngjException = elapsedCpuTime;
            return elapsedCpuTime;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IdentyResponse identyResponse;
            try {
                IdentySdk identySdk = IdentySdk.this;
                IdentyResponse identyResponse2 = new IdentyResponse(identySdk.e, identySdk.isQualityFailed, identySdk.Attempt, identySdk.getPadSub1, identySdk.getQualityScore, identySdk.values, identySdk.getData, identySdk.i, identySdk.onErrorResponse);
                IdentySdk identySdk2 = IdentySdk.this;
                Action action = identySdk2.e;
                if (action == null) {
                    action = com.identy.Action.CAPTURE;
                }
                identySdk2.e = action;
                Action action2 = com.identy.Action.VERIFY;
                if (action.equals(action2)) {
                    IdentySdk identySdk3 = IdentySdk.this;
                    identyResponse = new VerifyIdentyResponse(identySdk3.h, identySdk3.e, identySdk3.isQualityFailed, identySdk3.Attempt, identySdk3.getPadSub1, identySdk3.getQualityScore, identySdk3.values, identySdk3.getData, identySdk3.i);
                } else {
                    identyResponse = identyResponse2;
                }
                IdentySdk identySdk4 = IdentySdk.this;
                if (identySdk4.getSpoofScore != null && !identySdk4.getCaptureTime) {
                    if (identySdk4.S0 == null) {
                        new com.identy.values();
                        Activity activity = IdentySdk.this.getData;
                        String packageName = activity.getApplicationContext().getPackageName();
                        IdentySdk identySdk5 = IdentySdk.this;
                        String str = identySdk5.getOveralTimetaken;
                        String values = identySdk5.values();
                        IdentySdk identySdk6 = IdentySdk.this;
                        identyResponse.setLivenessServerRequest(com.identy.values.PngjBadSignature(activity, packageName, values, identySdk6.a, "--", identySdk6.getSpoofScore));
                    } else {
                        new com.identy.values();
                        Activity activity2 = IdentySdk.this.getData;
                        String packageName2 = activity2.getApplicationContext().getPackageName();
                        IdentySdk identySdk7 = IdentySdk.this;
                        String str2 = identySdk7.getOveralTimetaken;
                        String values2 = identySdk7.values();
                        IdentySdk identySdk8 = IdentySdk.this;
                        identyResponse.setLivenessServerRequest(com.identy.values.valueOf(activity2, packageName2, values2, identySdk8.a, "--", identySdk8.getSpoofScore, identySdk8.S0));
                    }
                }
                long timeInMillis = Calendar.getInstance().getTimeInMillis();
                IdentySdk identySdk9 = IdentySdk.this;
                identyResponse.fillPrintsInfo(identySdk9.h, identySdk9.getPadSub2, true, identySdk9.e.equals(action2), new ArrayList<>(), new C0016PngjBadSignature(timeInMillis, identyResponse));
            } catch (Exception unused) {
            }
        }
    }

    public class PngjException implements getNfiq1Score {
        private /* synthetic */ IdentyResponse PngjBadCrcException;

        public PngjException(IdentyResponse identyResponse) {
            this.PngjBadCrcException = identyResponse;
        }

        @Override // com.identy.getNfiq1Score
        public final void values() {
            IdentySdk identySdk = IdentySdk.this;
            identySdk.f.onResponse(this.PngjBadCrcException, identySdk.q());
            IdentySdk.PngjException.f("on response");
            Iterator it = IdentySdk.this.h.entrySet().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((Map) ((Map.Entry) it.next()).getValue()).entrySet().iterator();
                while (it2.hasNext()) {
                    ((getPadSub3) ((Map.Entry) it2.next()).getValue()).PngjException();
                }
            }
            IdentySdk.this.h = new HashMap();
        }
    }

    public class PngjInputException implements getNfiq1Score {
        private /* synthetic */ IdentyResponse PngjException;

        public PngjInputException(IdentyResponse identyResponse) {
            this.PngjException = identyResponse;
        }

        @Override // com.identy.getNfiq1Score
        public final void values() {
            IdentySdk identySdk = IdentySdk.this;
            identySdk.f.onResponse(this.PngjException, identySdk.q());
            IdentySdk.PngjException.f("on response");
            Iterator it = IdentySdk.this.h.entrySet().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((Map) ((Map.Entry) it.next()).getValue()).entrySet().iterator();
                while (it2.hasNext()) {
                    ((getPadSub3) ((Map.Entry) it2.next()).getValue()).PngjException();
                }
            }
            IdentySdk.this.h = new HashMap();
        }
    }

    public class PngjPrematureEnding implements com.identy.PngjPrematureEnding {
        public PngjPrematureEnding() {
        }

        @Override // com.identy.PngjPrematureEnding
        public final void PngjBadSignature(boolean z) {
            if (z) {
                IdentySdk identySdk = IdentySdk.this;
                identySdk.f.onErrorResponse(new IdentyError(identySdk.e, com.identy.ERRORS.NETWORK_ERROR, identySdk.getData), null);
            } else {
                IdentySdk identySdk2 = IdentySdk.this;
                identySdk2.f.onErrorResponse(new IdentyError(identySdk2.e, com.identy.ERRORS.CONFIG_URL_ERROR, identySdk2.getData), null);
            }
        }

        @Override // com.identy.PngjPrematureEnding
        public final void valueOf(JSONObject jSONObject) {
            IdentySdk identySdk = IdentySdk.this;
            identySdk.getL1Score = jSONObject;
            identySdk.getNfiq1Score = true;
            identySdk.F();
        }
    }

    public class valueOf implements getNfiq1Score {
        public static int PngjBadCrcException;
        public static int valueOf;
        private /* synthetic */ IdentyResponse PngjException;

        public valueOf(IdentyResponse identyResponse) {
            this.PngjException = identyResponse;
        }

        public static int PngjBadCrcException() {
            int i = PngjBadCrcException;
            int i2 = i % 7126557;
            PngjBadCrcException = i + 1;
            if (i2 != 0) {
                return valueOf;
            }
            int myUid = Process.myUid();
            valueOf = myUid;
            return myUid;
        }

        @Override // com.identy.getNfiq1Score
        public final void values() {
            IdentySdk identySdk = IdentySdk.this;
            identySdk.f.onResponse(this.PngjException, identySdk.q());
            IdentySdk.PngjException.f("on response");
            Iterator it = IdentySdk.this.h.entrySet().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((Map) ((Map.Entry) it.next()).getValue()).entrySet().iterator();
                while (it2.hasNext()) {
                    ((getPadSub3) ((Map.Entry) it2.next()).getValue()).PngjException();
                }
            }
            IdentySdk.this.h = new HashMap();
        }
    }

    public class values implements getNfiq1Score {
        public static int PngjBadCrcException;
        public static int PngjBadSignature;
        private /* synthetic */ IdentyError valueOf;

        public values(IdentyError identyError) {
            this.valueOf = identyError;
        }

        public static int PngjBadSignature() {
            int i = PngjBadCrcException;
            int i2 = i % 7555434;
            PngjBadCrcException = i + 1;
            if (i2 != 0) {
                return PngjBadSignature;
            }
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            PngjBadSignature = startUptimeMillis;
            return startUptimeMillis;
        }

        @Override // com.identy.getNfiq1Score
        public final void values() {
            IdentySdk identySdk = IdentySdk.this;
            identySdk.f.onErrorResponse(this.valueOf, identySdk.q());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$g(short s, byte b, byte b2) {
        int i;
        int i2;
        byte[] bArr = $$c;
        int i3 = 101 - (b * 4);
        int i4 = (s * 3) + 1;
        int i5 = b2 + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i2 = 0;
            int i6 = i5;
            int i7 = i4;
            i3 = (-i3) + i7;
            i5 = i6;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            int i8 = i5 + 1;
            byte b3 = bArr[i8];
            i7 = i3;
            i3 = b3;
            bArr3 = bArr;
            i6 = i8;
            i3 = (-i3) + i7;
            i5 = i6;
            bArr = bArr3;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        matchCaptured = 0;
        matchMultiple = 1;
        deduplication = 0;
        generateST = 1;
        PngjException();
        System.loadLibrary("finger-native-lib");
        System.loadLibrary("support-native-lib");
        getL2Score = "option_selected";
        isAuthSucess = "options";
        matchMultiple = (matchCaptured + 123) % 128;
    }

    private IdentySdk(Activity activity, byte[] bArr, InitializationListener initializationListener, IdentyResponseListener identyResponseListener, boolean z) {
        this.PngjBadSignature = false;
        this.e = com.identy.Action.CAPTURE;
        this.g = false;
        this.h = new HashMap();
        this.i = new HashMap();
        Finger finger = Finger.INDEX;
        Finger finger2 = Finger.MIDDLE;
        Finger finger3 = Finger.RING;
        Finger finger4 = Finger.LITTLE;
        Finger finger5 = Finger.THUMB;
        this.Capture2TActivity = new Finger[]{finger, finger2, finger3, finger4, finger5};
        this.CaptureMode = false;
        this.Capture4FActivity = true;
        this.CaptureFingersActivity = new HashSet();
        this.Capture2IndexActivity = Calendar.getInstance().getTimeInMillis();
        this.CaptureRolledFingersActivity = false;
        this.CapturePosition = false;
        this.PngjOutputException = FingerMatchSecLevel.MEDIUM;
        this.PngjUnsupportedException = 5;
        this.PngjInputException = 30;
        this.CaptureThumbActivity = com.identy.CaptureMode.H;
        this.PngjExceptionInternal = new ArrayList();
        this.PngjPrematureEnding = new ArrayList();
        this.DeduplicationIdentyResponse = QualityMode.VERIFICATION;
        this.setFingers = false;
        this.setFoundMatchingTemplates = new HashMap();
        this.getFingers = new HashMap();
        this.toJson = false;
        this.isFoundMatchingTemplates = 0;
        this.ERRORS = 0;
        this.Enroll4FActivity = 0;
        this.Enroll2TActivity = 0;
        this.Enroll2IndexActivity = 0;
        this.toString = false;
        this.FingerActivity = false;
        this.FingerAS = new InlineGuideOption(300, 10);
        this.EnrollFingersActivity = null;
        this.getShortform = "adult";
        this.Action = com.identy.FingerAS.BALANCED_VERY_HIGH;
        this.e1 = false;
        this.EnrollThumbActivity = false;
        this.onErrorResponse = new HashMap();
        this.getTemplates = false;
        this.getIdentyQuality = false;
        this.getHeight = false;
        this.setSpoofScore = -1;
        this.getAttempts = new HashMap();
        this.setScore = new FingerDetectionMode[]{FingerDetectionMode.L4F};
        this.getPadSub2 = new HashMap();
        this.uxd565jj = false;
        this.addEncryptedTemplates = true;
        this.Attempt = WSQCompression.WSQ_10_1;
        this.getPadSub1 = null;
        this.getQualityScore = BuildConfig.FLAVOR;
        this.isQualityFailed = 0;
        this.getWidth = true;
        this.addTemplates = "demo";
        this.cvtyuv2bgr = true;
        this.uxd566jk = false;
        this.uxd565jk = null;
        this.setDConfig = false;
        this.cvtmat2ba = false;
        this.configureroll = new ArrayList();
        this.pfkrol = true;
        this.resetAttempt = false;
        this.configure = false;
        this.destroy = UIAfterCaptures.ALERTS;
        this.getServerRequest = 2000L;
        this.getScore = com.identy.CapturePosition.HORIZONTAL;
        this.pfkrolGetQuality = false;
        this.ppk = false;
        this.getCaptureTime = false;
        this.getNfiq1Score = false;
        this.getL1Score = null;
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        this.a = bArr;
        List list = this.configureroll;
        Hand hand = Hand.LEFT;
        list.add(new Pair(hand, finger));
        this.configureroll.add(new Pair(hand, finger2));
        this.configureroll.add(new Pair(hand, finger3));
        this.configureroll.add(new Pair(hand, finger4));
        this.configureroll.add(new Pair(hand, finger5));
        List list2 = this.configureroll;
        Hand hand2 = Hand.RIGHT;
        list2.add(new Pair(hand2, finger));
        this.configureroll.add(new Pair(hand2, finger2));
        this.configureroll.add(new Pair(hand2, finger3));
        this.configureroll.add(new Pair(hand2, finger4));
        this.configureroll.add(new Pair(hand2, finger5));
        this.getPadSub2.put(Template.PNG, null);
        if (z) {
            try {
                ProgressDialog progressDialog = new ProgressDialog(activity);
                this.valueOf = progressDialog;
                int i = R.string.id_fin_initializing;
                progressDialog.setTitle(i);
                this.valueOf.setCancelable(false);
                this.valueOf.setMessage(activity.getText(i));
                this.valueOf.show();
            } catch (Exception unused) {
            }
        }
        this.getData = activity;
        this.f = identyResponseListener;
        if (bArr == null) {
            ProgressDialog progressDialog2 = this.valueOf;
            if (progressDialog2 != null) {
                progressDialog2.dismiss();
            }
            identyResponseListener.onErrorResponse(new IdentyError(com.identy.ERRORS.LICENSE_NOT_EXIST, null, this.e, this.isQualityFailed, this.Attempt, this.getPadSub1, this.getQualityScore, this.values, activity, this.i), q());
            return;
        }
        if (bArr.length != 0) {
            this.PngjBadCrcException = new LManager(activity, bArr, (com.identy.app.PngjBadCrcException) new PngjBadCrcException(timeInMillis, activity, initializationListener, identyResponseListener), "finger", getVersion(), false);
            return;
        }
        ProgressDialog progressDialog3 = this.valueOf;
        if (progressDialog3 != null) {
            progressDialog3.dismiss();
        }
        identyResponseListener.onErrorResponse(new IdentyError(com.identy.ERRORS.LICENSE_EMPTY, null, this.e, this.isQualityFailed, this.Attempt, this.getPadSub1, this.getQualityScore, this.values, activity, this.i), q());
    }

    private void PngjBadSignature(String str, String str2) {
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        Throwable th = null;
        try {
            if (this.getPadSub1 != null) {
                com.identy.e.PngjException pngjException = new com.identy.e.PngjException(this.getQualityScore);
                try {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
                    try {
                        "Opened for reading: ".concat(String.valueOf(str));
                        bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
                        try {
                            "Opened for writing: ".concat(String.valueOf(str2));
                            pngjException.PngjBadSignature(new File(str).length(), bufferedInputStream, bufferedOutputStream);
                            bufferedInputStream.close();
                            bufferedOutputStream.close();
                            int i = deduplication + 97;
                            generateST = i % 128;
                            if (i % 2 == 0) {
                                throw null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            if (bufferedInputStream != null) {
                                int i2 = deduplication + 57;
                                generateST = i2 % 128;
                                if (i2 % 2 == 0) {
                                    bufferedInputStream.close();
                                    throw null;
                                }
                                bufferedInputStream.close();
                            }
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = null;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedInputStream = null;
                    bufferedOutputStream = null;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } else if (this.values != null) {
                FileInputStream fileInputStream = new FileInputStream(new File(str));
                try {
                    byte[] bArr = new byte[1024];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    deduplication = (generateST + 123) % 128;
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            fileInputStream.close();
                            byte[] decrypt = this.values.decrypt(bArr);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
                            try {
                                fileOutputStream.write(decrypt);
                                fileOutputStream.close();
                                return;
                            } finally {
                            }
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
            } else {
                if (str.equals(str2)) {
                    return;
                }
                FileInputStream fileInputStream2 = new FileInputStream(str);
                FileOutputStream fileOutputStream2 = new FileOutputStream(str2);
                byte[] bArr2 = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
                while (true) {
                    int read2 = fileInputStream2.read(bArr2);
                    if (read2 <= 0) {
                        fileOutputStream2.close();
                        fileInputStream2.close();
                        deduplication = (generateST + 17) % 128;
                        return;
                    }
                    fileOutputStream2.write(bArr2, 0, read2);
                }
            }
        } catch (Exception unused) {
        }
    }

    private static /* synthetic */ Object PngjException(Object[] objArr) {
        throw new UnsupportedOperationException("Method not decompiled: com.identy.IdentySdk.PngjException(java.lang.Object[])");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:4:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void d(int i, short s, byte b, Object[] objArr) {
        int i2;
        int i3 = s + 80;
        int i4 = 189 - i;
        int i5 = b + 6;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4++;
            i3 = (i3 + (-i6)) - 13;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i4++;
            i3 = (i3 + (-i6)) - 13;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i5) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            i2++;
            if (i2 == i5) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0156 A[LOOP:0: B:7:0x014f->B:9:0x0156, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] getBytesFromInputStream(InputStream inputStream) {
        Object[] objArr;
        long j;
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        int read;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int c = defpackage.a.c((~((~myUid) | (-486564269))) | 8519699, 576, (((~((-488466925) | myUid)) | 1902656) * 576) + 901473407, -1996354100);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4966;
                    com.identy.Fpnative.valueOf = objArr;
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(2029550054 * i3);
                    int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                    int i7 = -(i3 * 1937365782);
                    int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                    int i9 = ((i8 | 455710212) << 1) - (455710212 ^ i8);
                    int i10 = i9 >> 19;
                    int i11 = ((i10 ^ (-16383)) + ((i10 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i12 = (i11 & 1) + (i11 | 1);
                    int i13 = ((i9 | i12) << 1) - (i12 ^ i9);
                    int i14 = i9 >> 16;
                    int i15 = (((i14 | (-131071)) << 1) - (i14 ^ (-131071))) / 65536;
                    int i16 = -(((i15 & 1) + (i15 | 1)) ^ i13);
                    int i17 = ((i16 | 5) << 1) - (i16 ^ 5);
                    int i18 = i17 >> 20;
                    int i19 = (((i18 | (-8191)) << 1) - (i18 ^ (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    int i20 = (i19 ^ 1) + ((i19 & 1) << 1);
                    bArr = new byte[26767360 / (((-((i20 & 1) + (i20 | 1))) & i17) * 1307)];
                    while (true) {
                        read = inputStream.read(bArr);
                        if (read != -1) {
                            byteArrayOutputStream.flush();
                            return byteArrayOutputStream.toByteArray();
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
            }
            byte[] bArr2 = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr2[11]), (byte) (-bArr2[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr2[111]), bArr2[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1202683340);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4966;
            com.identy.Fpnative.valueOf = objArr;
            byteArrayOutputStream = new ByteArrayOutputStream();
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(2029550054 * i32);
            int i62 = (i42 ^ i52) + ((i42 & i52) << 1);
            int i72 = -(i32 * 1937365782);
            int i82 = ((i62 | i72) << 1) - (i72 ^ i62);
            int i92 = ((i82 | 455710212) << 1) - (455710212 ^ i82);
            int i102 = i92 >> 19;
            int i112 = ((i102 ^ (-16383)) + ((i102 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i122 = (i112 & 1) + (i112 | 1);
            int i132 = ((i92 | i122) << 1) - (i122 ^ i92);
            int i142 = i92 >> 16;
            int i152 = (((i142 | (-131071)) << 1) - (i142 ^ (-131071))) / 65536;
            int i162 = -(((i152 & 1) + (i152 | 1)) ^ i132);
            int i172 = ((i162 | 5) << 1) - (i162 ^ 5);
            int i182 = i172 >> 20;
            int i192 = (((i182 | (-8191)) << 1) - (i182 ^ (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
            int i202 = (i192 ^ 1) + ((i192 & 1) << 1);
            bArr = new byte[26767360 / (((-((i202 & 1) + (i202 | 1))) & i172) * 1307)];
            while (true) {
                read = inputStream.read(bArr);
                if (read != -1) {
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        int i21 = (generateST + 17) % 128;
        deduplication = i21;
        generateST = (i21 + 33) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static IdentySdk getInstance() {
        Object[] objArr;
        long j;
        IdentySdk identySdk;
        int i = deduplication + 97;
        generateST = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int c = defpackage.a.c((~((~uptimeMillis) | 413458560)) | 85430719, 56, (((~(uptimeMillis | 85430719)) | 413458560) * 56) + 482367095, 223364188);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4929;
                    com.identy.Fpnative.valueOf = objArr;
                    identySdk = PngjException;
                    if (identySdk == null) {
                        int i4 = generateST + 77;
                        deduplication = i4 % 128;
                        if (i4 % 2 == 0) {
                            return identySdk;
                        }
                        throw null;
                    }
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = i5 * i5;
                    int i7 = -(387418998 * i5);
                    int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                    int i9 = -(i5 * (-179993998));
                    int i10 = (i8 & i9) + (i9 | i8);
                    int i11 = ((i10 | 919885968) << 1) - (919885968 ^ i10);
                    int i12 = ((i11 >> 29) - 15) / 8;
                    int i13 = ((i11 >> 15) - 262143) / 131072;
                    int i14 = -(((i11 - (~((i12 & 1) + (i12 | 1)))) - 1) ^ (((i13 | 1) << 1) - (i13 ^ 1)));
                    int i15 = (i14 & 6) + (i14 | 6);
                    int i16 = i15 >> 21;
                    int i17 = ((i16 & (-4095)) + (i16 | (-4095))) / 2048;
                    throw new Exception(IdentyB.c((-((i17 & 1) + (i17 | 1) + 1)) & i15, 343, 24696, "14/20/9/5/4/No Active instance"));
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 223364188);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4929;
            com.identy.Fpnative.valueOf = objArr;
            identySdk = PngjException;
            if (identySdk == null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 21) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = ~((int) android.os.Process.getStartElapsedRealtime());
        0 = ~(435881670 | 0);
        0 = defpackage.a.c(0 | 440036799, 764, (((~(0 | 63007609)) | 406455430) * (-1528)) + (((0 | 63007609) * 764) + 1013657327), -1284815836);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getInternalVersion() {
        long j;
        int i = generateST;
        deduplication = (i + 99) % 128;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = i + 11;
                deduplication = i2 % 128;
                if (i2 % 2 != 0) {
                    long j2 = ((long[]) objArr[1])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4858;
                com.identy.Fpnative.valueOf = null;
                int i3 = ((int[]) $$a_state[1])[0];
                int i4 = i3 * i3;
                int i5 = -(395977197 * i3);
                int i6 = (((i4 & i5) + (i4 | i5)) - (~(-(i3 * (-1651716929))))) - 1;
                int i7 = (i6 & (-1134227228)) + ((-1134227228) | i6);
                int i8 = i7 >> 17;
                int i9 = ((i8 & (-65535)) + (i8 | (-65535))) / 32768;
                int i10 = (i7 - (~(((i9 | 1) << 1) - (i9 ^ 1)))) - 1;
                int i11 = ((i7 >> 28) - 31) / 16;
                int i12 = -(i10 ^ ((i11 & 1) + (i11 | 1)));
                int i13 = (i12 ^ 2) + ((i12 & 2) << 1);
                int i14 = i13 >> 27;
                int i15 = ((i14 ^ (-63)) + ((i14 & (-63)) << 1)) / 32;
                return IdentyB.c((-((i15 & 1) + (i15 | 1) + 1)) & i13, 1424, 5696, "7|aa1bb024f00e2090fd5463ce83cf89e72937a61f");
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -1284815836);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4858;
            com.identy.Fpnative.valueOf = objArr4;
            int i32 = ((int[]) objArr4[1])[0];
            int i42 = i32 * i32;
            int i52 = -(395977197 * i32);
            int i62 = (((i42 & i52) + (i42 | i52)) - (~(-(i32 * (-1651716929))))) - 1;
            int i72 = (i62 & (-1134227228)) + ((-1134227228) | i62);
            int i82 = i72 >> 17;
            int i92 = ((i82 & (-65535)) + (i82 | (-65535))) / 32768;
            int i102 = (i72 - (~(((i92 | 1) << 1) - (i92 ^ 1)))) - 1;
            int i112 = ((i72 >> 28) - 31) / 16;
            int i122 = -(i102 ^ ((i112 & 1) + (i112 | 1)));
            int i132 = (i122 ^ 2) + ((i122 & 2) << 1);
            int i142 = i132 >> 27;
            int i152 = ((i142 ^ (-63)) + ((i142 & (-63)) << 1)) / 32;
            return IdentyB.c((-((i152 & 1) + (i152 | 1) + 1)) & i132, 1424, 5696, "7|aa1bb024f00e2090fd5463ce83cf89e72937a61f");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 73) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (0 <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (0 <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = (int) android.os.Process.getStartUptimeMillis();
        0 = ~0;
        0 = ~(77321349 | 0);
        0 = defpackage.a.c(0 | (-421567931), 712, (((~(0 | 498851263)) | (~(0 | (-421529915)))) * (-712)) + (((421529914 | 0) * (-712)) + 789319079), 1045028144);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getVersion() {
        long j;
        int i = generateST;
        int i2 = i + 105;
        deduplication = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i3 = i + 47;
                deduplication = i3 % 128;
                if (i3 % 2 != 0) {
                    long j2 = ((long[]) objArr[1])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 5003;
                com.identy.Fpnative.valueOf = null;
                int i4 = ((int[]) $$a_state[1])[0];
                int i5 = i4 * i4;
                int i6 = -(1528323890 * i4);
                int i7 = (((i5 ^ i6) + ((i5 & i6) << 1)) - (~(-(i4 * (-166310270))))) - 1297927773;
                int i8 = i7 >> 24;
                int i9 = (((i8 | (-511)) << 1) - (i8 ^ (-511))) / 256;
                int i10 = (i9 ^ 1) + ((i9 & 1) << 1);
                int i11 = (i7 ^ i10) + ((i10 & i7) << 1);
                int i12 = i7 >> 25;
                int i13 = ((i12 & (-255)) + (i12 | (-255))) / 128;
                int i14 = -(((i13 ^ 1) + ((i13 & 1) << 1)) ^ i11);
                int i15 = (i14 & 5) + (i14 | 5);
                int i16 = i15 >> 26;
                int i17 = (((i16 | (-127)) << 1) - (i16 ^ (-127))) / 64;
                int i18 = (i17 ^ 1) + ((i17 & 1) << 1);
                return IdentyB.c((-(((i18 | 1) << 1) - (i18 ^ 1))) & i15, 24, 600, "2;24;7.2.1");
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 1045028144);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 5003;
            com.identy.Fpnative.valueOf = objArr4;
            int i42 = ((int[]) objArr4[1])[0];
            int i52 = i42 * i42;
            int i62 = -(1528323890 * i42);
            int i72 = (((i52 ^ i62) + ((i52 & i62) << 1)) - (~(-(i42 * (-166310270))))) - 1297927773;
            int i82 = i72 >> 24;
            int i92 = (((i82 | (-511)) << 1) - (i82 ^ (-511))) / 256;
            int i102 = (i92 ^ 1) + ((i92 & 1) << 1);
            int i112 = (i72 ^ i102) + ((i102 & i72) << 1);
            int i122 = i72 >> 25;
            int i132 = ((i122 & (-255)) + (i122 | (-255))) / 128;
            int i142 = -(((i132 ^ 1) + ((i132 & 1) << 1)) ^ i112);
            int i152 = (i142 & 5) + (i142 | 5);
            int i162 = i152 >> 26;
            int i172 = (((i162 | (-127)) << 1) - (i162 ^ (-127))) / 64;
            int i182 = (i172 ^ 1) + ((i172 & 1) << 1);
            return IdentyB.c((-(((i182 | 1) << 1) - (i182 ^ 1))) & i152, 24, 600, "2;24;7.2.1");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 33) % 128;
    }

    public static void init$0() {
        $$a = new byte[]{14, 12, 119, -3, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, -26, 6, 4, -21, 9};
        $$b = 23;
    }

    public static void init$1() {
        $$d = new byte[]{37, -75, 122, 54, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -70, 44, -47, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, 8, -24, -22, 3, -27, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -36, -54, -17, -10, -10, -13, 43, -31, -8, -47, -30, -2, -26, 0, -24, -18, 72, -57, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -43, -6, -16, 27, -44, -16, 20, -60, 2, 17, -64, 8, -15, -24, -17, -2, -19, -12, -25, -11, 50, -72, -8, -14, -22, -19, -18, 62, -38, -59, -1, -8, -14, 10, -46, 27, -59, -1, -8, -14, 16, -42, -20, -17, -2, -26, -43, -6, -16, 27, -44, -16, 4, -35, -11, -20, 0, -32, -14, -10, 0, -16, -2, 44, -66, -11, -25, -5, -26, 4, -15, -25, -12, -19, -11, -10, -10, -13, -6, -26, 55, -34, -43, -25, -5, -26, 4, 17, -57, -12, -19, -11, -10, -10, -13, -6, -26, 32, -64, 8, -15, -24, -17, -2, -19, -12, -43, -6, -16, 24, -64, 8, -15, -24, -17, -2, -19, -12};
        $$e = 192;
    }

    public static void init$2() {
        $$c = new byte[]{49, -88, 79, -64};
        $$f = 137;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void j(short s, short s2, short s3, Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 22 - (s3 * 18);
        int i6 = 19 - (s2 * 13);
        int i7 = 118 - (s * 38);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i6;
            int i9 = i5;
            i4 = 0;
            int i10 = i5 + 1;
            i = i9 + i8 + 5;
            i2 = i10;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i;
            if (i4 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i8 = bArr[i2];
            int i11 = i;
            i5 = i2;
            i9 = i11;
            int i102 = i5 + 1;
            i = i9 + i8 + 5;
            i2 = i102;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i;
            if (i4 == i6) {
            }
        } else {
            i = i7;
            i2 = i5;
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i;
            if (i4 == i6) {
            }
        }
    }

    private static void l(int[] iArr, int i, String str, String str2, Object[] objArr) {
        char[] cArr;
        int i2;
        char c;
        int i3;
        char c2;
        String str3 = str2;
        byte[] bArr = null;
        if (str3 != null) {
            $10 = ($11 + 53) % 128;
            bArr = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        if (str != null) {
            cArr = str.toCharArray();
            $11 = ($10 + 83) % 128;
        } else {
            cArr = null;
        }
        char[] cArr2 = cArr;
        com.d.e.PngjExceptionInternal pngjExceptionInternal = new com.d.e.PngjExceptionInternal();
        char[] cArr3 = generateNFIQ;
        Class cls = Integer.TYPE;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            loop0: while (true) {
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = $10 + 87;
                    $11 = i5 % 128;
                    if (i5 % 2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr3[i4])};
                            Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                            if (PngjBadSignature2 == null) {
                                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 27092), 37 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0), View.MeasureSpec.getMode(0) + 118, -373889195, false, "b", new Class[]{cls});
                            }
                            cArr4[i4] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i4])};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(358189806);
                        if (PngjBadSignature3 == null) {
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (((Process.getThreadPriority(0) + 20) >> 6) + 27092), 37 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 117, -373889195, false, "b", new Class[]{cls});
                        }
                        cArr4[i4] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                    }
                }
                break loop0;
            }
            cArr3 = cArr4;
        }
        Object[] objArr4 = {Integer.valueOf(rgenerate)};
        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1639226071);
        if (PngjBadSignature4 == null) {
            byte b = (byte) 0;
            byte b2 = b;
            i2 = 2;
            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Color.blue(0) + 61713), KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 34, 278 - View.MeasureSpec.makeMeasureSpec(0, 0), -1654917268, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{cls});
        } else {
            i2 = 2;
        }
        int intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
        char c3 = '0';
        int i6 = -528960794;
        char c4 = 1;
        if (pfkrolChangeMinMaxWidth) {
            int i7 = $10 + 13;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length2 = bArr2.length;
            pngjExceptionInternal.PngjException = length2;
            char[] cArr5 = new char[length2];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i9 = pngjExceptionInternal.values;
                int i10 = pngjExceptionInternal.PngjException;
                if (i9 >= i10) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i9] = (char) (cArr3[bArr2[(i10 - 1) - i9] + i] - intValue);
                Object[] objArr5 = new Object[i2];
                objArr5[c4] = pngjExceptionInternal;
                objArr5[0] = pngjExceptionInternal;
                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i6);
                if (PngjBadSignature5 == null) {
                    c = c3;
                    byte b3 = (byte) 0;
                    i3 = i6;
                    byte b4 = (byte) (b3 + 1);
                    c2 = c4;
                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (AndroidCharacter.getMirror(c3) - '0'), TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0) + 37, 549 - Drawable.resolveOpacity(0, 0), 479715165, false, $$g(b3, b4, (byte) (-b4)), new Class[]{Object.class, Object.class});
                } else {
                    c = c3;
                    i3 = i6;
                    c2 = c4;
                }
                ((Method) PngjBadSignature5).invoke(null, objArr5);
                c3 = c;
                i6 = i3;
                c4 = c2;
                i2 = 2;
            }
        } else if (generate) {
            $11 = ($10 + 9) % 128;
            int length3 = cArr2.length;
            pngjExceptionInternal.PngjException = length3;
            char[] cArr6 = new char[length3];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i11 = pngjExceptionInternal.values;
                int i12 = pngjExceptionInternal.PngjException;
                if (i11 >= i12) {
                    objArr[0] = new String(cArr6);
                    return;
                }
                int i13 = $10 + 65;
                $11 = i13 % 128;
                if (i13 % 2 == 0) {
                    cArr6[i11] = (char) (cArr3[cArr2[(i12 - 1) << i11] - i] >>> intValue);
                    Object[] objArr6 = {pngjExceptionInternal, pngjExceptionInternal};
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                    if (PngjBadSignature6 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = (byte) (b5 + 1);
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 37 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0), AndroidCharacter.getMirror('0') + 501, 479715165, false, $$g(b5, b6, (byte) (-b6)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature6).invoke(null, objArr6);
                } else {
                    cArr6[i11] = (char) (cArr3[cArr2[(i12 - 1) - i11] - i] - intValue);
                    Object[] objArr7 = {pngjExceptionInternal, pngjExceptionInternal};
                    Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-528960794);
                    if (PngjBadSignature7 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = (byte) (b7 + 1);
                        PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.myTid() >> 22), 37 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 549, 479715165, false, $$g(b7, b8, (byte) (-b8)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature7).invoke(null, objArr7);
                }
            }
        } else {
            int length4 = iArr.length;
            pngjExceptionInternal.PngjException = length4;
            char[] cArr7 = new char[length4];
            pngjExceptionInternal.values = 0;
            while (true) {
                int i14 = pngjExceptionInternal.values;
                int i15 = pngjExceptionInternal.PngjException;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr7);
                    return;
                } else {
                    cArr7[i14] = (char) (cArr3[iArr[(i15 - 1) - i14] - i] - intValue);
                    pngjExceptionInternal.values = i14 + 1;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [boolean, int] */
    public static boolean newInstance(Activity activity, String str, InitializationListener<IdentySdk> initializationListener, IdentyResponseListener identyResponseListener, boolean z) {
        Object[] objArr;
        long j;
        deduplication = (generateST + 75) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a = defpackage.a.a();
                    int i = ~a;
                    int c = defpackage.a.c((~((-432898567) | i)) | (-65990714), 68, ((~((-35811386) | i)) * (-68)) + (((~(a | 432898566)) | (~((-30179329) | i)) | (-468709952)) * (-68)) + 1318959051, -656788891);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4998;
                    com.identy.Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = ((i4 * i4) - (~(-(813828171 * i4)))) - 1;
                    int i6 = -(i4 * (-1811482177));
                    int i7 = (i5 & i6) + (i6 | i5);
                    int i8 = (i7 & (-1615984103)) + ((-1615984103) | i7);
                    int i9 = i8 >> 25;
                    int i10 = ((i9 ^ (-255)) + ((i9 & (-255)) << 1)) / 128;
                    int i11 = (i10 ^ 1) + ((i10 & 1) << 1);
                    int i12 = ((i8 | i11) << 1) - (i11 ^ i8);
                    int i13 = i8 >> 28;
                    int i14 = (-(IdentyB.e((i13 | (-31)) << 1, i13 ^ (-31), 16, -1) ^ i12)) - (-1);
                    int i15 = i14 >> 22;
                    int i16 = ((i15 ^ (-2047)) + ((i15 & (-2047)) << 1)) / 1024;
                    int i17 = (i16 ^ 1) + ((i16 & 1) << 1);
                    return newInstance(activity, str, initializationListener, identyResponseListener, z, false);
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -656788891);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4998;
            com.identy.Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = ((i42 * i42) - (~(-(813828171 * i42)))) - 1;
            int i62 = -(i42 * (-1811482177));
            int i72 = (i52 & i62) + (i62 | i52);
            int i82 = (i72 & (-1615984103)) + ((-1615984103) | i72);
            int i92 = i82 >> 25;
            int i102 = ((i92 ^ (-255)) + ((i92 & (-255)) << 1)) / 128;
            int i112 = (i102 ^ 1) + ((i102 & 1) << 1);
            int i122 = ((i82 | i112) << 1) - (i112 ^ i82);
            int i132 = i82 >> 28;
            int i142 = (-(IdentyB.e((i132 | (-31)) << 1, i132 ^ (-31), 16, -1) ^ i122)) - (-1);
            int i152 = i142 >> 22;
            int i162 = ((i152 ^ (-2047)) + ((i152 & (-2047)) << 1)) / 1024;
            int i172 = (i162 ^ 1) + ((i162 & 1) << 1);
            return newInstance(activity, str, initializationListener, identyResponseListener, z, false);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 61) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] readFileResource(String str, Context context) {
        Object[] objArr;
        long j;
        InputStream resourceAsStream;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int i = ~((-537007169) | myUid);
                    int i2 = ~myUid;
                    int c = defpackage.a.c((~(myUid | 670021451)) | (~((-537007169) | i2)) | (~((-94896396) | myUid)), 920, (((~((-631903564) | i2)) | 537007168) * 920) + ((i | (~(i2 | 670021451))) * 920) + 1082253271, 314897519);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4888;
                    com.identy.Fpnative.valueOf = objArr;
                    resourceAsStream = context.getClassLoader().getResourceAsStream(str);
                    if (resourceAsStream == null) {
                        byte[] bytesFromInputStream = getBytesFromInputStream(resourceAsStream);
                        generateST = (deduplication + 23) % 128;
                        return bytesFromInputStream;
                    }
                    StringBuilder sb = new StringBuilder();
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = i5 * i5;
                    int i7 = -(1025725008 * i5);
                    int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                    int i9 = -(i5 * (-262136392));
                    int i10 = (i8 & i9) + (i9 | i8);
                    int i11 = ((i10 | (-1437745136)) << 1) - ((-1437745136) ^ i10);
                    int i12 = i11 >> 25;
                    int i13 = ((i12 & (-255)) + (i12 | (-255))) / 128;
                    int i14 = (i13 & 1) + (i13 | 1);
                    int i15 = -(IdentyB.e(i11 >> 20, 8191, ConstantsKt.DEFAULT_BLOCK_SIZE, -1) ^ ((i11 ^ i14) + ((i14 & i11) << 1)));
                    int i16 = (i15 & 6) + (i15 | 6);
                    int i17 = ((i16 >> 27) - 63) / 32;
                    sb.append("10;cannot find resource: ".substring(35820 / (((-((((i17 | 1) << 1) - (i17 ^ 1)) - (-1))) & i16) * 1990)));
                    sb.append(str);
                    throw new IOException(sb.toString());
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 314897519);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4888;
            com.identy.Fpnative.valueOf = objArr;
            resourceAsStream = context.getClassLoader().getResourceAsStream(str);
            if (resourceAsStream == null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 103) % 128;
    }

    public static void showMessage(String str) {
        Object[] objArr;
        long j;
        int i = generateST + 119;
        deduplication = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i2 = (int) Runtime.getRuntime().totalMemory();
                    int i3 = ((i2 | 974870002) * (-50)) + 26981497;
                    int i4 = ~((-570496065) | i2);
                    int i5 = ~i2;
                    int c = defpackage.a.c((~(i5 | 974870002)) | (~(475980722 | i5)) | (-1046476787), 50, ((i4 | (~(1046476786 | i5))) * 50) + i3, 703418483);
                    int i6 = c ^ (c << 13);
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                    ((long[]) objArr[0])[0] = j + 4868;
                    com.identy.Fpnative.valueOf = objArr;
                    generateST = (deduplication + 63) % 128;
                    return;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 703418483);
            j = ((long[]) objArr[0])[0];
            generateST = (deduplication + 49) % 128;
            ((long[]) objArr[0])[0] = j + 4868;
            com.identy.Fpnative.valueOf = objArr;
            generateST = (deduplication + 63) % 128;
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        generateST = (deduplication + 29) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
    
        if (0 > 150) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        com.identy.IdentySdk.generateST = (0 + 121) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (0 < 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 73) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        throw new com.identy.exceptions.TimeoutExceededLimitModeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        0 = 0.PngjInputException;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        if (0 > 40) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (0 < 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        throw new com.identy.exceptions.TimeoutExceededLimitModeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0018, code lost:
    
        if (0 >= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (0 >= 0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (0.pfkrolGetQuality == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        0 = 0.PngjInputException;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void valueOf() {
        int i = this.PngjUnsupportedException;
        if (i <= 6) {
            int i2 = generateST + 65;
            int i3 = i2 % 128;
            deduplication = i3;
            if (i2 % 2 != 0) {
                int i4 = 10 / 0;
            }
        }
        throw new AttemptsExceededLimitException();
    }

    public static /* synthetic */ Object values(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~((~i) | i2);
        int i8 = ~((~i2) | i4);
        int i9 = i8 | i7;
        int i10 = (~((~i4) | i2)) | i8;
        int i11 = (1201824936 * i5) + (762724209 * i3) + i2 + i4 + i6;
        int i12 = i11 * i11;
        int i13 = (1905524736 * i12) + (1514143744 * i5) + (1302855680 * i3) + ((-1540882432) * i6) + (1414658446 * i10) + (1465650404 * i9) + ((-1465650404) * i7) + (1339426419 * i4) + ((-126223985) * i2) + 43253760;
        int i14 = i3 * 701011807;
        int i15 = i5 * 237771736;
        int i16 = i12 * (-223608832);
        int i17 = i16 + i15 + i14 + (i6 * 162560975) + (i10 * 978) + (i9 * (-1956)) + (i7 * 1956) + (i4 * 162559997) + ((i2 * 162561953) - 555857873);
        int i18 = (i17 * i17 * 703332352) + i13;
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? PngjBadCrcException(objArr) : PngjBadSignature(objArr) : values(objArr) : PngjException(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00fe A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean A() {
        Object[] objArr;
        long j;
        int i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i2 = (int) Runtime.getRuntime().totalMemory();
                    int c = defpackage.a.c((~(i2 | (-153223737))) | (~((~i2) | (-37794817))) | (~((-270075912) | i2)), 867, (((~((-307870728) | i2)) | 37794816 | (~((-191018553) | i2))) * (-1734)) + ((((~((-307870728) | 0)) | (~((-191018553) | 0))) * (-867)) - 755802724), -1281678953);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4949;
                    com.identy.Fpnative.valueOf = objArr;
                    boolean z = this.uxd566jk;
                    i = deduplication + 123;
                    generateST = i % 128;
                    if (i % 2 == 0) {
                        return z;
                    }
                    throw null;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1281678953);
            j = ((long[]) objArr[0])[0];
            generateST = (deduplication + 53) % 128;
            ((long[]) objArr[0])[0] = j + 4949;
            com.identy.Fpnative.valueOf = objArr;
            boolean z2 = this.uxd566jk;
            i = deduplication + 123;
            generateST = i % 128;
            if (i % 2 == 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = (int) java.lang.Runtime.getRuntime().totalMemory();
        0 = ~0;
        0 = (((~((-537166401) | 0)) | (~((-318462235) | 0))) * 520) - 1713740649;
        0 = ~(318462234 | 0);
        0 = ~(0 | 817351514);
        0 = defpackage.a.c(0 | ((~(0 | (-817351515))) | (-855628635)), 520, ((0 | 0) * (-1040)) + 0, -2043662396);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentyUser B() {
        long j;
        int i = deduplication;
        generateST = (i + 47) % 128;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = i + 125;
                generateST = i2 % 128;
                if (i2 % 2 == 0) {
                    long j2 = ((long[]) objArr[0])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4861;
                com.identy.Fpnative.valueOf = null;
                return this.uxd565jk;
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -2043662396);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4861;
            com.identy.Fpnative.valueOf = objArr4;
            return this.uxd565jk;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(2:3|(6:5|6|7|8|9|10))|15|16|17|6|7|8|9|10) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void D() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (deduplication + 63) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a = defpackage.a.a();
                    int c = defpackage.a.c((~((~a) | (-160436542))) | 271343618, 576, (((~((-193991102) | a)) | 33554560) * 576) + 901473407, 304140746);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5012;
                    com.identy.Fpnative.valueOf = objArr;
                    IdentySdk identySdk = PngjException;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = ((i3 * i3) - (~(-(577715163 * i3)))) - 1;
                    int i5 = -(i3 * 1603210931);
                    int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                    int i7 = (i6 ^ (-924870223)) + (((-924870223) & i6) << 1);
                    int i8 = i7 >> 29;
                    int i9 = ((i8 ^ (-15)) + ((i8 & (-15)) << 1)) / 8;
                    int i10 = ((i9 | 1) << 1) - (i9 ^ 1);
                    int i11 = (i7 ^ i10) + ((i10 & i7) << 1);
                    int i12 = ((i7 >> 22) - 2047) / 1024;
                    int i13 = -(i11 ^ ((i12 & 1) + (i12 | 1)));
                    int i14 = (i13 ^ 3) + ((i13 & 3) << 1);
                    int i15 = i14 >> 20;
                    int i16 = (((i15 | (-8191)) << 1) - (i15 ^ (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    int i17 = (i16 & 1) + (i16 | 1);
                    identySdk.f("14;on complete".substring(8280 / (((-((i17 ^ 1) + ((i17 & 1) << 1))) & i14) * 920)));
                    this.PngjBadCrcException.sendTransaction();
                    AsyncTask.execute(new PngjBadSignature());
                    return;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1843416630);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5012;
            com.identy.Fpnative.valueOf = objArr;
            IdentySdk identySdk2 = PngjException;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = ((i32 * i32) - (~(-(577715163 * i32)))) - 1;
            int i52 = -(i32 * 1603210931);
            int i62 = ((i42 | i52) << 1) - (i52 ^ i42);
            int i72 = (i62 ^ (-924870223)) + (((-924870223) & i62) << 1);
            int i82 = i72 >> 29;
            int i92 = ((i82 ^ (-15)) + ((i82 & (-15)) << 1)) / 8;
            int i102 = ((i92 | 1) << 1) - (i92 ^ 1);
            int i112 = (i72 ^ i102) + ((i102 & i72) << 1);
            int i122 = ((i72 >> 22) - 2047) / 1024;
            int i132 = -(i112 ^ ((i122 & 1) + (i122 | 1)));
            int i142 = (i132 ^ 3) + ((i132 & 3) << 1);
            int i152 = i142 >> 20;
            int i162 = (((i152 | (-8191)) << 1) - (i152 ^ (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
            int i172 = (i162 & 1) + (i162 | 1);
            identySdk2.f("14;on complete".substring(8280 / (((-((i172 ^ 1) + ((i172 & 1) << 1))) & i142) * 920)));
            this.PngjBadCrcException.sendTransaction();
            AsyncTask.execute(new PngjBadSignature());
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        generateST = (deduplication + 25) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void F() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) Runtime.getRuntime().maxMemory())) | (-58939427))) | 16992290, 191, (((~(0 | (-58939427))) | 557828706) * 191) - 1339706941, 272515171);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4944;
                    com.identy.Fpnative.valueOf = objArr;
                    if (!this.e.equals(com.identy.Action.CAPTURE)) {
                        try {
                            capture();
                            generateST = (deduplication + 49) % 128;
                            return;
                        } catch (AttemptsExceededLimitException e) {
                            throw new RuntimeException(e);
                        } catch (NoDetectionModeException e2) {
                            throw new RuntimeException(e2);
                        } catch (TimeoutExceededLimitModeException e3) {
                            throw new RuntimeException(e3);
                        }
                    }
                    if (this.e.equals(com.identy.Action.ENROLL)) {
                        deduplication = (generateST + 21) % 128;
                        try {
                            enroll();
                            return;
                        } catch (AttemptsExceededLimitException e4) {
                            throw new RuntimeException(e4);
                        } catch (NoDetectionModeException e5) {
                            throw new RuntimeException(e5);
                        } catch (TimeoutExceededLimitModeException e6) {
                            throw new RuntimeException(e6);
                        }
                    }
                    if (this.e.equals(com.identy.Action.VERIFY)) {
                        int i3 = generateST + 105;
                        deduplication = i3 % 128;
                        try {
                            if (i3 % 2 == 0) {
                                verify();
                                return;
                            } else {
                                verify();
                                throw null;
                            }
                        } catch (AttemptsExceededLimitException e7) {
                            throw new RuntimeException(e7);
                        } catch (NoDetectionModeException e8) {
                            throw new RuntimeException(e8);
                        } catch (TimeoutExceededLimitModeException e9) {
                            throw new RuntimeException(e9);
                        }
                    }
                    return;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 272515171);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4944;
            com.identy.Fpnative.valueOf = objArr;
            if (!this.e.equals(com.identy.Action.CAPTURE)) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        generateST = (deduplication + 51) % 128;
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [boolean, int] */
    public IdentySdk G() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int c = defpackage.a.c(~((~maxMemory) | (-537004037)), 501, (((~((-537004037) | maxMemory)) | (-1071553221)) * 501) + 2020058612, 1853263190);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    generateST = (deduplication + 59) % 128;
                    ((long[]) objArr[0])[0] = j + 4879;
                    com.identy.Fpnative.valueOf = objArr;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(53199137 * i3);
                    int i6 = (((i4 & i5) + (i4 | i5)) - (~(-(i3 * 1415721097)))) - (-1767465272);
                    int i7 = i6 >> 19;
                    int i8 = ((i7 ^ (-16383)) + ((i7 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i9 = (i8 ^ 1) + ((i8 & 1) << 1);
                    int i10 = ((i6 | i9) << 1) - (i9 ^ i6);
                    int i11 = i6 >> 29;
                    int i12 = ((i11 ^ (-15)) + ((i11 & (-15)) << 1)) / 8;
                    int i13 = -(((i12 ^ 1) + ((i12 & 1) << 1)) ^ i10);
                    int i14 = (i13 & 4) + (i13 | 4);
                    int i15 = i14 >> 29;
                    int i16 = ((i15 ^ (-15)) + ((i15 & (-15)) << 1)) / 8;
                    int i17 = (i16 & 1) + (i16 | 1);
                    this.pfkrolfinalize = false;
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1853263190);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4879;
            com.identy.Fpnative.valueOf = objArr;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(53199137 * i32);
            int i62 = (((i42 & i52) + (i42 | i52)) - (~(-(i32 * 1415721097)))) - (-1767465272);
            int i72 = i62 >> 19;
            int i82 = ((i72 ^ (-16383)) + ((i72 & (-16383)) << 1)) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i92 = (i82 ^ 1) + ((i82 & 1) << 1);
            int i102 = ((i62 | i92) << 1) - (i92 ^ i62);
            int i112 = i62 >> 29;
            int i122 = ((i112 ^ (-15)) + ((i112 & (-15)) << 1)) / 8;
            int i132 = -(((i122 ^ 1) + ((i122 & 1) << 1)) ^ i102);
            int i142 = (i132 & 4) + (i132 | 4);
            int i152 = i142 >> 29;
            int i162 = ((i152 ^ (-15)) + ((i152 & (-15)) << 1)) / 8;
            int i172 = (i162 & 1) + (i162 | 1);
            this.pfkrolfinalize = false;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 97) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e8  */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean H() {
        Object[] objArr;
        long j;
        generateST = (deduplication + 113) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int i = ~uptimeMillis;
                    int c = defpackage.a.c((~(uptimeMillis | 205077398)) | (~(i | 703966678)), 959, (((~(205077398 | i)) | (~(uptimeMillis | 703966678))) * 959) + 393798993, 1377843967);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5041;
                    com.identy.Fpnative.valueOf = objArr;
                    deduplication = (generateST + 3) % 128;
                    if (this.getData.checkSelfPermission("android.permission.CAMERA") != 0) {
                        valueOf();
                        return true;
                    }
                    this.f.onErrorResponse(new IdentyError(com.identy.ERRORS.CAMERA_PERMISSION_REQUIRED, null, this.e, this.isQualityFailed, this.Attempt, this.getPadSub1, this.getQualityScore, this.values, this.getData, this.i), q());
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(113029152 * i4);
                    int i7 = (i5 & i6) + (i5 | i6);
                    int i8 = -(i4 * 1668640934);
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    int i10 = (i9 & 845317705) + (845317705 | i9);
                    int i11 = i10 >> 25;
                    int i12 = (((i11 | (-255)) << 1) - (i11 ^ (-255))) / 128;
                    int i13 = (i10 - (~((i12 & 1) + (i12 | 1)))) - 1;
                    int i14 = i10 >> 18;
                    int i15 = ((i14 & (-32767)) + (i14 | (-32767))) / 16384;
                    int i16 = -(i13 ^ ((i15 ^ 1) + ((i15 & 1) << 1)));
                    int i17 = (i16 ^ 9) + ((i16 & 9) << 1);
                    int i18 = ((i17 >> 29) - 15) / 8;
                    int i0 = 0 / (((-(((i18 ^ 1) + ((i18 & 1) << 1)) + 1)) & i17) * 897);
                    int i19 = deduplication + 33;
                    generateST = i19 % 128;
                    if (i19 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1377843967);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5041;
            com.identy.Fpnative.valueOf = objArr;
            deduplication = (generateST + 3) % 128;
            if (this.getData.checkSelfPermission("android.permission.CAMERA") != 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final boolean PngjBadCrcException() {
        deduplication = (generateST + 81) % 128;
        if (h() == null) {
            return false;
        }
        int i = deduplication + 91;
        generateST = i % 128;
        if (i % 2 != 0) {
            return !h().equals(com.identy.FingerAS.NONE);
        }
        h().equals(com.identy.FingerAS.NONE);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ea  */
    /* JADX WARN: Type inference failed for: r1v12, types: [com.identy.enums.FingerDetectionMode[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.identy.enums.FingerDetectionMode[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(IdentyUser identyUser, int i, int i2, Template template) {
        Object[] objArr;
        long j;
        FingerDetectionMode[] fingerDetectionModeArr;
        int i3;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int c = defpackage.a.c((~((~elapsedCpuTime) | (-860918945))) | 75768384, 564, ((~(elapsedCpuTime | (-286261281))) * 1128) + (((((~(362029664 | 0)) | (-860918945)) | (~((-362029665) | elapsedCpuTime))) * (-564)) - 2049358837), -93674246);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4942;
                    com.identy.Fpnative.valueOf = objArr;
                    this.PngjUnsupportedException = i;
                    this.PngjInputException = i2;
                    fingerDetectionModeArr = this.setScore;
                    if (fingerDetectionModeArr != null) {
                        deduplication = (generateST + 109) % 128;
                        if (fingerDetectionModeArr.length != 0) {
                            if (!H()) {
                                return false;
                            }
                            valueOf();
                            this.uxd565jk = identyUser;
                            this.h = new HashMap();
                            if (!this.setFingers) {
                                int i6 = deduplication + 57;
                                generateST = i6 % 128;
                                if (i6 % 2 == 0) {
                                    this.DeduplicationIdentyResponse = QualityMode.VERIFICATION;
                                    throw null;
                                }
                                this.DeduplicationIdentyResponse = QualityMode.VERIFICATION;
                            }
                            if (!isEnrolled(this.setScore, identyUser)) {
                                generateST = (deduplication + 43) % 128;
                                return false;
                            }
                            if (this.setScore[0].getFinger() == null || !this.setScore[0].getFinger().equals(Finger.THUMB)) {
                                i3 = 0;
                            } else {
                                int i7 = ((int[]) objArr[1])[0];
                                int i8 = ((i7 * i7) - (~(-(526027959 * i7)))) - 1;
                                int i9 = -(i7 * 641168955);
                                int i10 = (((i8 | i9) << 1) - (i9 ^ i8)) - (-1946430257);
                                int i11 = i10 >> 21;
                                int i12 = (((i11 | (-4095)) << 1) - (i11 ^ (-4095))) / 2048;
                                int i13 = (i12 ^ 1) + ((i12 & 1) << 1);
                                int i14 = ((i10 | i13) << 1) - (i13 ^ i10);
                                int i15 = i10 >> 26;
                                int i16 = ((i15 ^ (-127)) + ((i15 & (-127)) << 1)) / 64;
                                int i17 = -(((i16 ^ 1) + ((i16 & 1) << 1)) ^ i14);
                                int i18 = (i17 ^ 2) + ((i17 & 2) << 1);
                                int i19 = ((i18 >> 28) - 31) / 16;
                                int i20 = (i19 ^ 1) + ((i19 & 1) << 1);
                                i3 = 224 / (((-(((i20 | 1) << 1) - (i20 ^ 1))) & i18) * 112);
                            }
                            Hand hand = this.setScore[0].getHand() == null ? Hand.LEFT : this.setScore[0].getHand();
                            boolean contains = i3 != 0 ? this.PngjPrematureEnding.contains(hand) : this.PngjExceptionInternal.contains(hand);
                            this.e = com.identy.Action.VERIFY;
                            Activity activity = this.getData;
                            Intent intent = new Intent(activity, (Class<?>) GuideNoGuideHelper.getVerifyClass(activity, contains, this.setScore));
                            intent.putExtra("type", "verify");
                            intent.putExtra(getL2Score, (Serializable) this.setScore);
                            intent.putExtra(isAuthSucess, (Serializable) this.setScore);
                            this.getData.startActivityForResult(intent, 102);
                            StringBuilder sb = new StringBuilder();
                            sb.append(this.e);
                            sb.append("WITH_TEMPLATE_");
                            sb.append(template);
                            PngjBadCrcException(sb.toString());
                            return true;
                        }
                    }
                    throw new NoDetectionModeException();
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -93674246);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4942;
            com.identy.Fpnative.valueOf = objArr;
            this.PngjUnsupportedException = i;
            this.PngjInputException = i2;
            fingerDetectionModeArr = this.setScore;
            if (fingerDetectionModeArr != null) {
            }
            throw new NoDetectionModeException();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 121) % 128;
    }

    public void b(boolean z) {
        Object[] objArr;
        long j;
        int i = deduplication + 95;
        generateST = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-722100462))) | (-223211182), 376, (((~((~identityHashCode) | 722100461)) | 71667200) * (-376)) + ((642223680 | identityHashCode) * 376) + 1895081399, 336231612);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4938;
                    com.identy.Fpnative.valueOf = objArr;
                    this.g = z;
                    return;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 336231612);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4938;
            com.identy.Fpnative.valueOf = objArr;
            this.g = z;
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        generateST = (deduplication + 55) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0050, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = ~0;
        0 = defpackage.a.c(~(0 | (-258255913)), 301, ((((~(0 | (-757145193))) | 536941120) | (~((-38051841) | 0))) * (-301)) + ((((~((-757145193) | 0)) | (-258255913)) * (-602)) - 84911587), -167846730);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer c(FingerDetectionMode fingerDetectionMode) {
        Object[] objArr;
        long j;
        int i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                int i2 = generateST + 67;
                deduplication = i2 % 128;
                if (i2 % 2 != 0) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) objArr[0])[0] = j + 5040;
                com.identy.Fpnative.valueOf = objArr;
                if (this.getFingers.containsKey(fingerDetectionMode)) {
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = ((i3 * i3) - (~(-(951852696 * i3)))) - 1;
                    int i5 = -(i3 * 889403318);
                    int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                    int i7 = ((i6 | 341778417) << 1) - (341778417 ^ i6);
                    int e = IdentyB.e(i7 >> 27, 63, 32, -1);
                    int i8 = ((i7 | e) << 1) - (e ^ i7);
                    int i9 = i7 >> 25;
                    int i10 = ((i9 ^ (-255)) + ((i9 & (-255)) << 1)) / 128;
                    int i11 = -(((i10 ^ 1) + ((i10 & 1) << 1)) ^ i8);
                    int i12 = (i11 & 5) + (i11 | 5);
                    int e2 = IdentyB.e(i12 >> 23, 1023, ConstantsKt.MINIMUM_BLOCK_SIZE, -1);
                    i = 0 / (((-((e2 & 1) + (e2 | 1))) & i12) * 420);
                } else {
                    generateST = (deduplication + 97) % 128;
                    i = ((Integer) this.getFingers.get(fingerDetectionMode)).intValue();
                    generateST = (deduplication + 65) % 128;
                }
                return Integer.valueOf(i);
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -167846730);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5040;
            com.identy.Fpnative.valueOf = objArr;
            if (this.getFingers.containsKey(fingerDetectionMode)) {
            }
            return Integer.valueOf(i);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 49) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0161 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0162  */
    /* JADX WARN: Type inference failed for: r14v14, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean capture(int i, int i2) {
        Object[] objArr;
        long j;
        int i3;
        deduplication = (generateST + 3) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i4 = ~System.identityHashCode(this);
                    int c = defpackage.a.c((~(i4 | 201808039)) | (-768072424), 933, (((~((-700697320) | i4)) | 201808039) * (-933)) + 722799210, 290560356);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4858;
                    com.identy.Fpnative.valueOf = objArr;
                    this.PngjUnsupportedException = i;
                    this.PngjInputException = i2;
                    valueOf();
                    if (this.getMatchingTime != null && this.getOveralTimetaken == null) {
                        int i7 = generateST + 81;
                        deduplication = i7 % 128;
                        if (i7 % 2 == 0) {
                            return capture();
                        }
                        capture();
                        throw null;
                    }
                    PngjBadSignature();
                    int i8 = ((int[]) objArr[1])[0];
                    int i9 = ((i8 * i8) - (~(-(772889661 * i8)))) - 1;
                    int i10 = -(i8 * (-161681073));
                    int i11 = (((i9 | i10) << 1) - (i10 ^ i9)) - 2030870236;
                    int i12 = i11 >> 18;
                    int i13 = ((i12 & (-32767)) + (i12 | (-32767))) / 16384;
                    int i14 = ((i13 | 1) << 1) - (i13 ^ 1);
                    int i15 = (i11 & i14) + (i14 | i11);
                    int i16 = i11 >> 27;
                    int i17 = ((i16 ^ (-63)) + ((i16 & (-63)) << 1)) / 32;
                    int i18 = -(((i17 ^ 1) + ((i17 & 1) << 1)) ^ i15);
                    int i19 = (i18 & 1) + (i18 | 1);
                    int e = IdentyB.e(i19 >> 16, 131071, 65536, -1);
                    int i0 = 917 / (((-((e ^ 1) + ((e & 1) << 1))) & i19) * 917);
                    i3 = generateST + 121;
                    deduplication = i3 % 128;
                    if (i3 % 2 != 0) {
                        return false;
                    }
                    throw null;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1854097764);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4858;
            com.identy.Fpnative.valueOf = objArr;
            this.PngjUnsupportedException = i;
            this.PngjInputException = i2;
            valueOf();
            if (this.getMatchingTime != null) {
            }
            PngjBadSignature();
            int i82 = ((int[]) objArr[1])[0];
            int i92 = ((i82 * i82) - (~(-(772889661 * i82)))) - 1;
            int i102 = -(i82 * (-161681073));
            int i112 = (((i92 | i102) << 1) - (i102 ^ i92)) - 2030870236;
            int i122 = i112 >> 18;
            int i132 = ((i122 & (-32767)) + (i122 | (-32767))) / 16384;
            int i142 = ((i132 | 1) << 1) - (i132 ^ 1);
            int i152 = (i112 & i142) + (i142 | i112);
            int i162 = i112 >> 27;
            int i172 = ((i162 ^ (-63)) + ((i162 & (-63)) << 1)) / 32;
            int i182 = -(((i172 ^ 1) + ((i172 & 1) << 1)) ^ i152);
            int i192 = (i182 & 1) + (i182 | 1);
            int e2 = IdentyB.e(i192 >> 16, 131071, 65536, -1);
            int i0 = 917 / (((-((e2 ^ 1) + ((e2 & 1) << 1))) & i192) * 917);
            i3 = generateST + 121;
            deduplication = i3 % 128;
            if (i3 % 2 != 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00f0  */
    /* JADX WARN: Type inference failed for: r15v26, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean checkDeduplication(Template template, HashMap<Pair<Hand, Finger>, byte[]> hashMap) {
        Object[] objArr;
        long j;
        generateST = (deduplication + 83) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myTid = Process.myTid();
                    int i = ~myTid;
                    int c = defpackage.a.c((~(myTid | 350913983)) | (~(i | (-147975297))) | (~(147975296 | myTid)), 831, ((~((-338297152) | myTid)) * (-1662)) + (((~((-350913984) | i)) | (~(486272447 | myTid))) * (-831)) + 1637213632, -1413796008);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4854;
                    com.identy.Fpnative.valueOf = objArr;
                    if (template != null) {
                        throw new UnSupportedTemplateException();
                    }
                    if (!template.equals(Template.NIST_ITL_1_2015_RECORD_9) && (!template.equals(Template.NIST_ITL_1_2015_RECORD_14))) {
                        deduplication = (generateST + 39) % 128;
                        if (!template.equals(Template.SLAP_PNG) && !template.equals(Template.SLAP_WSQ) && !template.equals(Template.RAW)) {
                            int i4 = deduplication + 97;
                            generateST = i4 % 128;
                            if (i4 % 2 == 0) {
                                template.equals(Template.IDENTY_1);
                                throw null;
                            }
                            if ((!template.equals(Template.IDENTY_1)) && !template.equals(Template.FF_WSQ)) {
                                int i5 = deduplication + 55;
                                generateST = i5 % 128;
                                if (i5 % 2 == 0) {
                                    template.equals(Template.FF_ISO_19794_4);
                                    throw null;
                                }
                                if (!template.equals(Template.FF_ISO_19794_4)) {
                                    HashMap hashMap2 = new HashMap();
                                    for (Map.Entry<Pair<Hand, Finger>, byte[]> entry : hashMap.entrySet()) {
                                        hashMap2.put(Integer.valueOf(Position.getFromHandFinger(entry.getKey()).ordinal()), entry.getValue());
                                    }
                                    throw new UnsupportedOperationException("Method not decompiled");
                                    Action action = com.identy.Action.DEDUP;
                                    this.e = action;
                                    try {
                                        PngjBadCrcException(action.toString());
                                    } catch (Exception unused) {
                                    }
                                    int i6 = ((int[]) objArr[1])[0];
                                    int i7 = i6 * i6;
                                    int i8 = -(1386547925 * i6);
                                    int i9 = (((i7 ^ i8) + ((i7 & i8) << 1)) - (~(-(i6 * (-650614699))))) - 1;
                                    int i10 = (i9 ^ 160739513) + ((160739513 & i9) << 1);
                                    int i11 = ((i10 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                                    int i12 = (i11 ^ 1) + ((i11 & 1) << 1);
                                    int i13 = ((i10 | i12) << 1) - (i12 ^ i10);
                                    int i14 = i10 >> 27;
                                    int i15 = (-(i13 ^ IdentyB.a(i14 ^ (-63), (i14 & (-63)) << 1, 32, -1))) + 4;
                                    int i16 = i15 >> 21;
                                    int i17 = (((i16 | (-4095)) << 1) - (i16 ^ (-4095))) / 2048;
                                    int i18 = (i17 ^ 1) + ((i17 & 1) << 1);
                                    return false;
                                }
                            }
                        }
                    }
                    throw new Exception("Template type is not valid ".concat(String.valueOf(template)));
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1413796008);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4854;
            com.identy.Fpnative.valueOf = objArr;
            if (template != null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 13) % 128;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    public IdentySdk disableDisplayTransactionAlerts() {
        Object[] objArr;
        long j;
        generateST = (deduplication + 29) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myTid = Process.myTid();
                    int i = ~myTid;
                    int c = defpackage.a.c((~(myTid | (-764031363))) | (~(i | 802144194)), 765, (((~((-764031363) | i)) | 537002112) * 1530) + (((~((-537002113) | i)) | (~((-227029251) | myTid)) | (~(802144194 | myTid))) * 765) + 732240514, -933214582);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    generateST = (deduplication + 103) % 128;
                    ((long[]) objArr[0])[0] = j + 4978;
                    com.identy.Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(634473563 * i4);
                    int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                    int i8 = -(i4 * 2106721787);
                    int i9 = ((i7 ^ i8) + ((i8 & i7) << 1)) - 1824535239;
                    int i10 = (i9 - (~IdentyB.e(i9 >> 28, 31, 16, -1))) - 1;
                    int i11 = i9 >> 22;
                    int i12 = (((i11 | (-2047)) << 1) - (i11 ^ (-2047))) / 1024;
                    int i13 = (-(i10 ^ ((i12 & 1) + (i12 | 1)))) + 8;
                    int i14 = i13 >> 21;
                    int i15 = ((i14 & (-4095)) + (i14 | (-4095))) / 2048;
                    int i16 = (i15 ^ 1) + ((i15 & 1) << 1);
                    this.pfkrol = false;
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -933214582);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4978;
            com.identy.Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(634473563 * i42);
            int i72 = ((i52 | i62) << 1) - (i52 ^ i62);
            int i82 = -(i42 * 2106721787);
            int i92 = ((i72 ^ i82) + ((i82 & i72) << 1)) - 1824535239;
            int i102 = (i92 - (~IdentyB.e(i92 >> 28, 31, 16, -1))) - 1;
            int i112 = i92 >> 22;
            int i122 = (((i112 | (-2047)) << 1) - (i112 ^ (-2047))) / 1024;
            int i132 = (-(i102 ^ ((i122 & 1) + (i122 | 1)))) + 8;
            int i142 = i132 >> 21;
            int i152 = ((i142 & (-4095)) + (i142 | (-4095))) / 2048;
            int i162 = (i152 ^ 1) + ((i152 & 1) << 1);
            this.pfkrol = false;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 121) % 128;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    public IdentySdk disableMoveNextDetectionDialog() {
        Object[] objArr;
        long j;
        generateST = (deduplication + 17) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = (int) Runtime.getRuntime().totalMemory();
                    int c = defpackage.a.c((~((~i) | (-268568588))) | 153190708, 449, (((~((-268568588) | i)) | 153190708) * 449) + 44375692, 262917303);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    deduplication = (generateST + 13) % 128;
                    ((long[]) objArr[0])[0] = j + 5023;
                    com.identy.Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(1781495434 * i4);
                    int i7 = ((i5 | i6) << 1) - (i5 ^ i6);
                    int i8 = -(i4 * (-1901607536));
                    int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                    int i10 = (i9 & 410127529) + (410127529 | i9);
                    int e = IdentyB.e(i10 >> 19, 16383, ConstantsKt.DEFAULT_BUFFER_SIZE, -1);
                    int i11 = (i10 ^ e) + ((e & i10) << 1);
                    int i12 = i10 >> 23;
                    int i13 = ((i12 & (-1023)) + (i12 | (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i14 = -(((i13 & 1) + (i13 | 1)) ^ i11);
                    int i15 = (i14 & 5) + (i14 | 5);
                    int i16 = i15 >> 23;
                    int i17 = (((i16 | (-1023)) << 1) - (i16 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i18 = (i17 & 1) + (i17 | 1);
                    this.Capture4FActivity = false;
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 262917303);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5023;
            com.identy.Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(1781495434 * i42);
            int i72 = ((i52 | i62) << 1) - (i52 ^ i62);
            int i82 = -(i42 * (-1901607536));
            int i92 = ((i72 | i82) << 1) - (i82 ^ i72);
            int i102 = (i92 & 410127529) + (410127529 | i92);
            int e2 = IdentyB.e(i102 >> 19, 16383, ConstantsKt.DEFAULT_BUFFER_SIZE, -1);
            int i112 = (i102 ^ e2) + ((e2 & i102) << 1);
            int i122 = i102 >> 23;
            int i132 = ((i122 & (-1023)) + (i122 | (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i142 = -(((i132 & 1) + (i132 | 1)) ^ i112);
            int i152 = (i142 & 5) + (i142 | 5);
            int i162 = i152 >> 23;
            int i172 = (((i162 | (-1023)) << 1) - (i162 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i182 = (i172 & 1) + (i172 | 1);
            this.Capture4FActivity = false;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 49) % 128;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    public IdentySdk disableTraining() {
        Object[] objArr;
        long j;
        int i = (deduplication + 17) % 128;
        generateST = i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (i + 3) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-486744615))) | (~((~identityHashCode) | (-7916570))) | 3688473, 168, ((~((-4228097) | identityHashCode)) * 168) + ((((~((-490972711) | 0)) | 4228096) * 168) - 1710130969), 1933657390);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4957;
                    com.identy.Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(589793297 * i4);
                    int i7 = (i5 & i6) + (i5 | i6);
                    int i8 = -(i4 * (-1527150215));
                    int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                    int i10 = (i9 ^ 1236395929) + ((1236395929 & i9) << 1);
                    int i11 = i10 >> 18;
                    int i12 = ((i11 & (-32767)) + (i11 | (-32767))) / 16384;
                    int i13 = (i12 & 1) + (i12 | 1);
                    int i14 = -(IdentyB.e(i10 >> 15, 262143, 131072, -1) ^ (((i10 | i13) << 1) - (i13 ^ i10)));
                    int i15 = (i14 & 4) + (i14 | 4);
                    int i16 = i15 >> 20;
                    int i17 = ((i16 & (-8191)) + (i16 | (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    int i18 = ((i17 | 1) << 1) - (i17 ^ 1);
                    this.getWidth = false;
                    GuideNoGuideHelper.markIntroSetting(this.getData, true);
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1933657390);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4957;
            com.identy.Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(589793297 * i42);
            int i72 = (i52 & i62) + (i52 | i62);
            int i82 = -(i42 * (-1527150215));
            int i92 = ((i72 | i82) << 1) - (i82 ^ i72);
            int i102 = (i92 ^ 1236395929) + ((1236395929 & i92) << 1);
            int i112 = i102 >> 18;
            int i122 = ((i112 & (-32767)) + (i112 | (-32767))) / 16384;
            int i132 = (i122 & 1) + (i122 | 1);
            int i142 = -(IdentyB.e(i102 >> 15, 262143, 131072, -1) ^ (((i102 | i132) << 1) - (i132 ^ i102)));
            int i152 = (i142 & 4) + (i142 | 4);
            int i162 = i152 >> 20;
            int i172 = ((i162 & (-8191)) + (i162 | (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
            int i182 = ((i172 | 1) << 1) - (i172 ^ 1);
            this.getWidth = false;
            GuideNoGuideHelper.markIntroSetting(this.getData, true);
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (0 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (0 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = ~java.lang.System.identityHashCode(0);
        0 = defpackage.a.c((~(0 | (-510988404))) | (-1009877684), 783, ((~((-472973364) | 0)) * (-783)) + 959133387, -2010617708);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk displayImages(boolean z) {
        long j;
        int i;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = deduplication + 19;
                generateST = i2 % 128;
                if (i2 % 2 == 0) {
                    long j2 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 5046;
                com.identy.Fpnative.valueOf = null;
                this.uxd565jj = z;
                i = generateST + 83;
                deduplication = i % 128;
                if (i % 2 != 0) {
                    int i3 = 72 / 0;
                }
                return this;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -2010617708);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 5046;
            com.identy.Fpnative.valueOf = objArr4;
            this.uxd565jj = z;
            i = generateST + 83;
            deduplication = i % 128;
            if (i % 2 != 0) {
            }
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = defpackage.a.c((~((~java.lang.System.identityHashCode(0)) | (-364175563))) | 134713717, 160, (((~(0 | 134713717)) | (-498594304)) * (-160)) - 2046146273, 2020304908);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 67) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk displayResult(boolean z) {
        long j;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = generateST + 3;
                deduplication = i % 128;
                if (i % 2 != 0) {
                    long j2 = ((long[]) objArr[1])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 5001;
                com.identy.Fpnative.valueOf = null;
                this.addEncryptedTemplates = z;
                return this;
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 2020304908);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 5001;
            com.identy.Fpnative.valueOf = objArr4;
            this.addEncryptedTemplates = z;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 13) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer e(FingerDetectionMode fingerDetectionMode) {
        Object[] objArr;
        long j;
        int i;
        deduplication = (generateST + 21) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int b = defpackage.a.b(1238521534);
                    int i2 = ~b;
                    int c = defpackage.a.c((~(b | (-9634214))) | (~(580355557 | i2)) | (-652187622), 140, (((~((-81466278) | i2)) | 9634213) * (-280)) + ((b | (-81466278)) * 140) + 1480009995, 1027036724);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4977;
                    com.identy.Fpnative.valueOf = objArr;
                    if (!this.getFingers.containsKey(fingerDetectionMode)) {
                        deduplication = (generateST + 97) % 128;
                        i = ((Integer) this.getFingers.get(fingerDetectionMode)).intValue();
                    } else {
                        i = 0;
                    }
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = i5 * i5;
                    int i7 = -(69932135 * i5);
                    int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                    int i9 = -(i5 * (-1268122637));
                    int i10 = (((i8 | i9) << 1) - (i9 ^ i8)) - (-1517541353);
                    int i11 = ((i10 >> 25) - 255) / 128;
                    int i12 = (i10 - (~((i11 ^ 1) + ((i11 & 1) << 1)))) - 1;
                    int i13 = i10 >> 26;
                    int i14 = (((i13 | (-127)) << 1) - (i13 ^ (-127))) / 64;
                    int i15 = -(i12 ^ ((i14 & 1) + (i14 | 1)));
                    int i16 = (i15 & 2) + (i15 | 2);
                    int i17 = i16 >> 29;
                    int a = IdentyB.a(i17 & (-15), i17 | (-15), 8, -1);
                    int i18 = (2654 / (((-(((a | 1) << 1) - (a ^ 1))) & i16) * 1327)) + i;
                    this.getFingers.put(fingerDetectionMode, Integer.valueOf(i18));
                    return Integer.valueOf(i18);
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1027036724);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4977;
            com.identy.Fpnative.valueOf = objArr;
            if (!this.getFingers.containsKey(fingerDetectionMode)) {
            }
            int i52 = ((int[]) objArr[1])[0];
            int i62 = i52 * i52;
            int i72 = -(69932135 * i52);
            int i82 = (i62 ^ i72) + ((i62 & i72) << 1);
            int i92 = -(i52 * (-1268122637));
            int i102 = (((i82 | i92) << 1) - (i92 ^ i82)) - (-1517541353);
            int i112 = ((i102 >> 25) - 255) / 128;
            int i122 = (i102 - (~((i112 ^ 1) + ((i112 & 1) << 1)))) - 1;
            int i132 = i102 >> 26;
            int i142 = (((i132 | (-127)) << 1) - (i132 ^ (-127))) / 64;
            int i152 = -(i122 ^ ((i142 & 1) + (i142 | 1)));
            int i162 = (i152 & 2) + (i152 | 2);
            int i172 = i162 >> 29;
            int a2 = IdentyB.a(i172 & (-15), i172 | (-15), 8, -1);
            int i182 = (2654 / (((-(((a2 | 1) << 1) - (a2 ^ 1))) & i162) * 1327)) + i;
            this.getFingers.put(fingerDetectionMode, Integer.valueOf(i182));
            return Integer.valueOf(i182);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 1) % 128;
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [boolean, int] */
    public IdentySdk elt() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (deduplication + 123) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c(identityHashCode | (-257), 668, ((464936127 | (~((-33953153) | identityHashCode))) * 1336) + (((~(identityHashCode | 464936127)) | (-33953153)) * (-668)) + 908612471, 2009525555);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4956;
                    com.identy.Fpnative.valueOf = objArr;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(274162730 * i3);
                    int i6 = (i4 & i5) + (i4 | i5);
                    int i7 = -(i3 * 1462463838);
                    int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                    int i9 = ((i8 | 979883536) << 1) - (979883536 ^ i8);
                    int i10 = ((i9 >> 17) - 65535) / 32768;
                    int i11 = (i10 & 1) + (i10 | 1);
                    int i12 = (i9 ^ i11) + ((i11 & i9) << 1);
                    int i13 = ((i9 >> 15) - 262143) / 131072;
                    int i14 = -(i12 ^ ((i13 ^ 1) + ((i13 & 1) << 1)));
                    int i15 = (i14 & 6) + (i14 | 6);
                    int i16 = i15 >> 27;
                    int i17 = ((i16 ^ (-63)) + ((i16 & (-63)) << 1)) / 32;
                    int i18 = ((i17 | 1) << 1) - (i17 ^ 1);
                    this.ppk = false;
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2009525555);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4956;
            com.identy.Fpnative.valueOf = objArr;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(274162730 * i32);
            int i62 = (i42 & i52) + (i42 | i52);
            int i72 = -(i32 * 1462463838);
            int i82 = (i62 ^ i72) + ((i72 & i62) << 1);
            int i92 = ((i82 | 979883536) << 1) - (979883536 ^ i82);
            int i102 = ((i92 >> 17) - 65535) / 32768;
            int i112 = (i102 & 1) + (i102 | 1);
            int i122 = (i92 ^ i112) + ((i112 & i92) << 1);
            int i132 = ((i92 >> 15) - 262143) / 131072;
            int i142 = -(i122 ^ ((i132 ^ 1) + ((i132 & 1) << 1)));
            int i152 = (i142 & 6) + (i142 | 6);
            int i162 = i152 >> 27;
            int i172 = ((i162 ^ (-63)) + ((i162 & (-63)) << 1)) / 32;
            int i182 = ((i172 | 1) << 1) - (i172 ^ 1);
            this.ppk = false;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 113) % 128;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [boolean, int] */
    public void enableCustomSDK() {
        Object[] objArr;
        long j;
        deduplication = (generateST + 17) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = defpackage.a.c(identityHashCode | (-67211777), 220, (((~(i | (-339858325))) | 838747604) * (-440)) + (((~(i | (-67211777))) | 566101056) * 220) + 2094155899, 1652513311);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4902;
                    com.identy.Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(1701020042 * i4);
                    int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                    int i8 = -(i4 * 974733058);
                    int i9 = ((i7 & i8) + (i8 | i7)) - (-1075614500);
                    int i10 = i9 >> 18;
                    int i11 = ((i10 & (-32767)) + (i10 | (-32767))) / 16384;
                    int i12 = (i11 ^ 1) + ((i11 & 1) << 1);
                    int i13 = (i9 & i12) + (i12 | i9);
                    int i14 = i9 >> 26;
                    int i15 = ((i14 & (-127)) + (i14 | (-127))) / 64;
                    int i16 = -(((i15 ^ 1) + ((i15 & 1) << 1)) ^ i13);
                    int i17 = ((i16 | 9) << 1) - (i16 ^ 9);
                    int i18 = i17 >> 23;
                    int i19 = (((i18 | (-1023)) << 1) - (i18 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    this.CapturePosition = false;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1652513311);
            j = ((long[]) objArr[0])[0];
            deduplication = (generateST + 45) % 128;
            ((long[]) objArr[0])[0] = j + 4902;
            com.identy.Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(1701020042 * i42);
            int i72 = (i52 ^ i62) + ((i52 & i62) << 1);
            int i82 = -(i42 * 974733058);
            int i92 = ((i72 & i82) + (i82 | i72)) - (-1075614500);
            int i102 = i92 >> 18;
            int i112 = ((i102 & (-32767)) + (i102 | (-32767))) / 16384;
            int i122 = (i112 ^ 1) + ((i112 & 1) << 1);
            int i132 = (i92 & i122) + (i122 | i92);
            int i142 = i92 >> 26;
            int i152 = ((i142 & (-127)) + (i142 | (-127))) / 64;
            int i162 = -(((i152 ^ 1) + ((i152 & 1) << 1)) ^ i132);
            int i172 = ((i162 | 9) << 1) - (i162 ^ 9);
            int i182 = i172 >> 23;
            int i192 = (((i182 | (-1023)) << 1) - (i182 ^ (-1023))) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            this.CapturePosition = false;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = android.os.Process.myTid();
        0 = ~0;
        0 = defpackage.a.c((~(0 | 535676387)) | (~(0 | 1034565667)), 979, ((0 | 1034565667) * (-979)) + (((~(535676387 | 0)) * 979) + 167569156), -176073595);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Type inference failed for: r1v28, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void enableExitCaptureUsingHandChangeOption() {
        long j;
        int i = deduplication;
        generateST = (i + 93) % 128;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = i + 105;
                generateST = i2 % 128;
                if (i2 % 2 == 0) {
                    long j2 = ((long[]) objArr[1])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4874;
                com.identy.Fpnative.valueOf = null;
                int i3 = ((int[]) $$a_state[1])[0];
                int i4 = i3 * i3;
                int i5 = -(392312081 * i3);
                int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                int i7 = -(i3 * (-1758677285));
                int i8 = (i6 & i7) + (i7 | i6);
                int i9 = (i8 & (-657536924)) + ((-657536924) | i8);
                int i10 = i9 >> 16;
                int i11 = ((i10 ^ (-131071)) + ((i10 & (-131071)) << 1)) / 65536;
                int i12 = (i11 & 1) + (i11 | 1);
                int i13 = ((i9 | i12) << 1) - (i12 ^ i9);
                int i14 = i9 >> 17;
                int i15 = ((i14 ^ (-65535)) + ((i14 & (-65535)) << 1)) / 32768;
                int i16 = -(((i15 & 1) + (i15 | 1)) ^ i13);
                int i17 = ((i16 | 6) << 1) - (i16 ^ 6);
                int i18 = i17 >> 16;
                int i19 = ((i18 & (-131071)) + ((-131071) | i18)) / 65536;
                int i20 = (i19 ^ 1) + ((i19 & 1) << 1);
                this.cvtmat2ba = false;
                generateST = (deduplication + 97) % 128;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -176073595);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4874;
            com.identy.Fpnative.valueOf = objArr4;
            int i32 = ((int[]) objArr4[1])[0];
            int i42 = i32 * i32;
            int i52 = -(392312081 * i32);
            int i62 = (i42 ^ i52) + ((i42 & i52) << 1);
            int i72 = -(i32 * (-1758677285));
            int i82 = (i62 & i72) + (i72 | i62);
            int i92 = (i82 & (-657536924)) + ((-657536924) | i82);
            int i102 = i92 >> 16;
            int i112 = ((i102 ^ (-131071)) + ((i102 & (-131071)) << 1)) / 65536;
            int i122 = (i112 & 1) + (i112 | 1);
            int i132 = ((i92 | i122) << 1) - (i122 ^ i92);
            int i142 = i92 >> 17;
            int i152 = ((i142 ^ (-65535)) + ((i142 & (-65535)) << 1)) / 32768;
            int i162 = -(((i152 & 1) + (i152 | 1)) ^ i132);
            int i172 = ((i162 | 6) << 1) - (i162 ^ 6);
            int i182 = i172 >> 16;
            int i192 = ((i182 & (-131071)) + ((-131071) | i182)) / 65536;
            int i202 = (i192 ^ 1) + ((i192 & 1) << 1);
            this.cvtmat2ba = false;
            generateST = (deduplication + 97) % 128;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0147 A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v28, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void enableGImage(Bitmap.CompressFormat compressFormat) {
        Object[] objArr;
        long j;
        int i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (deduplication + 37) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int i2 = ~((-68689950) | uptimeMillis);
                    int c = defpackage.a.c(~((~uptimeMillis) | (-68689950)), 476, (i2 * 952) + ((421745186 | i2) * (-476)) + 1049457547, 1360576807);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4978;
                    com.identy.Fpnative.valueOf = objArr;
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = ((i5 * i5) - (~(-(2104850807 * i5)))) - 1;
                    int i7 = -(i5 * 1101096829);
                    int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                    int i9 = (i8 ^ (-504956380)) + (((-504956380) & i8) << 1);
                    int i10 = ((i9 >> 29) - 15) / 8;
                    int i11 = (i10 & 1) + (i10 | 1);
                    int i12 = ((i9 | i11) << 1) - (i11 ^ i9);
                    int i13 = i9 >> 28;
                    int i14 = ((i13 ^ (-31)) + ((i13 & (-31)) << 1)) / 16;
                    int i15 = (-(i12 ^ (((i14 | 1) << 1) - (i14 ^ 1)))) + 6;
                    int i16 = i15 >> 18;
                    int i17 = ((i16 ^ (-32767)) + ((i16 & (-32767)) << 1)) / 16384;
                    int i18 = ((i17 | 1) << 1) - (i17 ^ 1);
                    this.resetAttempt = false;
                    this.CaptureRolledThumbActivity = compressFormat;
                    i = deduplication + 63;
                    generateST = i % 128;
                    if (i % 2 != 0) {
                        throw null;
                    }
                    return;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1360576807);
            j = ((long[]) objArr[0])[0];
            deduplication = (generateST + 31) % 128;
            ((long[]) objArr[0])[0] = j + 4978;
            com.identy.Fpnative.valueOf = objArr;
            int i52 = ((int[]) objArr[1])[0];
            int i62 = ((i52 * i52) - (~(-(2104850807 * i52)))) - 1;
            int i72 = -(i52 * 1101096829);
            int i82 = ((i62 | i72) << 1) - (i72 ^ i62);
            int i92 = (i82 ^ (-504956380)) + (((-504956380) & i82) << 1);
            int i102 = ((i92 >> 29) - 15) / 8;
            int i112 = (i102 & 1) + (i102 | 1);
            int i122 = ((i92 | i112) << 1) - (i112 ^ i92);
            int i132 = i92 >> 28;
            int i142 = ((i132 ^ (-31)) + ((i132 & (-31)) << 1)) / 16;
            int i152 = (-(i122 ^ (((i142 | 1) << 1) - (i142 ^ 1)))) + 6;
            int i162 = i152 >> 18;
            int i172 = ((i162 ^ (-32767)) + ((i162 & (-32767)) << 1)) / 16384;
            int i182 = ((i172 | 1) << 1) - (i172 ^ 1);
            this.resetAttempt = false;
            this.CaptureRolledThumbActivity = compressFormat;
            i = deduplication + 63;
            generateST = i % 128;
            if (i % 2 != 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (0 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (0 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = defpackage.a.c((~((~java.lang.System.identityHashCode(0)) | (-538818365))) | 499255360, 970, (((-1038073725) | 0) * (-970)) - 356671459, -748634564);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 47) % 128;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0162 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0163  */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk enableGuide() {
        long j;
        int i;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = generateST + 53;
                deduplication = i2 % 128;
                if (i2 % 2 != 0) {
                    long j2 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4955;
                com.identy.Fpnative.valueOf = null;
                int i3 = ((int[]) $$a_state[1])[0];
                int i4 = i3 * i3;
                int i5 = -(40975719 * i3);
                int i6 = (i4 & i5) + (i4 | i5);
                int i7 = -(i3 * 1749601789);
                int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                int i9 = (i8 & (-680235068)) + ((-680235068) | i8);
                int i10 = i9 >> 21;
                int i11 = ((i10 ^ (-4095)) + ((i10 & (-4095)) << 1)) / 2048;
                int i12 = (i9 - (~((i11 & 1) + (i11 | 1)))) - 1;
                int i13 = i9 >> 15;
                int i14 = -(i12 ^ IdentyB.a(i13 & (-262143), i13 | (-262143), 131072, -1));
                int i15 = ((i14 | 8) << 1) - (i14 ^ 8);
                int i16 = ((i15 >> 18) - 32767) / 16384;
                this.CaptureMode = false;
                i = deduplication + 45;
                generateST = i % 128;
                if (i % 2 == 0) {
                    return this;
                }
                throw null;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -748634564);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4955;
            com.identy.Fpnative.valueOf = objArr4;
            int i32 = ((int[]) objArr4[1])[0];
            int i42 = i32 * i32;
            int i52 = -(40975719 * i32);
            int i62 = (i42 & i52) + (i42 | i52);
            int i72 = -(i32 * 1749601789);
            int i82 = ((i62 | i72) << 1) - (i72 ^ i62);
            int i92 = (i82 & (-680235068)) + ((-680235068) | i82);
            int i102 = i92 >> 21;
            int i112 = ((i102 ^ (-4095)) + ((i102 & (-4095)) << 1)) / 2048;
            int i122 = (i92 - (~((i112 & 1) + (i112 | 1)))) - 1;
            int i132 = i92 >> 15;
            int i142 = -(i122 ^ IdentyB.a(i132 & (-262143), i132 | (-262143), 131072, -1));
            int i152 = ((i142 | 8) << 1) - (i142 ^ 8);
            int i162 = ((i152 >> 18) - 32767) / 16384;
            this.CaptureMode = false;
            i = deduplication + 45;
            generateST = i % 128;
            if (i % 2 == 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (0 <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (0 <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c((~(0 | (-706120408))) | (-207231128), 376, (((~((~0) | 706120407)) | 71831552) * (-376)) + (((642552384 | 0) * 376) + 1895081399), -1959843931);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk enableKidsCapture() {
        long j;
        int i;
        int i2 = deduplication + 61;
        int i3 = i2 % 128;
        generateST = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i4 = i3 + 89;
                deduplication = i4 % 128;
                if (i4 % 2 != 0) {
                    long j2 = ((long[]) objArr[1])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 5045;
                com.identy.Fpnative.valueOf = null;
                int i5 = ((int[]) $$a_state[1])[0];
                int i6 = i5 * i5;
                int i7 = -(301388543 * i5);
                int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                int i9 = -(i5 * 813504735);
                int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                int i11 = (i10 ^ 246502689) + ((246502689 & i10) << 1);
                int i12 = i11 >> 20;
                int i13 = ((i12 ^ (-8191)) + ((i12 & (-8191)) << 1)) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                int i14 = (i13 & 1) + (i13 | 1);
                int i15 = ((i11 | i14) << 1) - (i14 ^ i11);
                int i16 = i11 >> 27;
                int i17 = -(IdentyB.a(i16 & (-63), i16 | (-63), 32, -1) ^ i15);
                int i18 = (i17 ^ 7) + ((i17 & 7) << 1);
                int i19 = i18 >> 18;
                int a = IdentyB.a(i19 ^ (-32767), (i19 & (-32767)) << 1, 16384, -1);
                this.getShortform = IdentyB.c((-((a & 1) + (a | 1))) & i18, 28, 1764, "24;16;11;kid");
                i = deduplication + 21;
                generateST = i % 128;
                if (i % 2 == 0) {
                    return this;
                }
                throw null;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -1959843931);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 5045;
            com.identy.Fpnative.valueOf = objArr4;
            int i52 = ((int[]) objArr4[1])[0];
            int i62 = i52 * i52;
            int i72 = -(301388543 * i52);
            int i82 = ((i62 | i72) << 1) - (i62 ^ i72);
            int i92 = -(i52 * 813504735);
            int i102 = ((i82 | i92) << 1) - (i92 ^ i82);
            int i112 = (i102 ^ 246502689) + ((246502689 & i102) << 1);
            int i122 = i112 >> 20;
            int i132 = ((i122 ^ (-8191)) + ((i122 & (-8191)) << 1)) / ConstantsKt.DEFAULT_BLOCK_SIZE;
            int i142 = (i132 & 1) + (i132 | 1);
            int i152 = ((i112 | i142) << 1) - (i142 ^ i112);
            int i162 = i112 >> 27;
            int i172 = -(IdentyB.a(i162 & (-63), i162 | (-63), 32, -1) ^ i152);
            int i182 = (i172 ^ 7) + ((i172 & 7) << 1);
            int i192 = i182 >> 18;
            int a2 = IdentyB.a(i192 ^ (-32767), (i192 & (-32767)) << 1, 16384, -1);
            this.getShortform = IdentyB.c((-((a2 & 1) + (a2 | 1))) & i182, 28, 1764, "24;16;11;kid");
            i = deduplication + 21;
            generateST = i % 128;
            if (i % 2 == 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0130, code lost:
    
        if (0 < 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0132, code lost:
    
        0 = com.identy.IdentySdk.deduplication + 23;
        0 = 0 % 128;
        com.identy.IdentySdk.generateST = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x013c, code lost:
    
        if ((0 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0140, code lost:
    
        if (0 > 84) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0147, code lost:
    
        if (0 > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0149, code lost:
    
        0 = 0 + 107;
        0 = 0 % 128;
        com.identy.IdentySdk.deduplication = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0151, code lost:
    
        if ((0 % 2) != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0153, code lost:
    
        if (0 < 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0155, code lost:
    
        com.identy.IdentySdk.generateST = (0 + 5) % 128;
        0 = ((int[]) $$a_state[1])[0];
        0 = 0 * 0;
        0 = -(1404602467 * 0);
        0 = ((0 | 0) << 1) - (0 ^ 0);
        0 = -(0 * (-1753952063));
        0 = (0 ^ 0) + ((0 & 0) << 1);
        0 = ((0 | 594314052) << 1) - (594314052 ^ 0);
        0 = 0 >> 23;
        0 = (((0 | (-1023)) << 1) - (0 ^ (-1023))) / kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE;
        0 = (0 - (~(((0 | 1) << 1) - (0 ^ 1)))) - 1;
        0 = 0 >> 16;
        0 = ((0 ^ (-131071)) + ((0 & (-131071)) << 1)) / 65536;
        0 = -(0 ^ (((0 | 1) << 1) - (0 ^ 1)));
        0 = (0 & 8) + (0 | 8);
        0 = 0 >> 27;
        0 = ((0 & (-63)) + (0 | (-63))) / 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01c4, code lost:
    
        if (0 > (75680 / (((-(((0 ^ 1) + ((0 & 1) << 1)) + 1)) & 0) * 473))) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01c6, code lost:
    
        if (0 > 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x01c8, code lost:
    
        0.isFoundMatchingTemplates = 0;
        0.Enroll4FActivity = 0;
        0.ERRORS = 0;
        0.Enroll2TActivity = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01d0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01d8, code lost:
    
        throw new com.identy.exceptions.RetriesAttemptsExceededLimitException("Select spoof retries between 0 to 20");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01db, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0145, code lost:
    
        if (0 > 20) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01e3, code lost:
    
        throw new com.identy.exceptions.RetriesAttemptsExceededLimitException("Select quality retries between 0 to 20");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01e4, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01e5, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01e9, code lost:
    
        if (0 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01eb, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01ec, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002e, code lost:
    
        0 = 0 + 83;
        com.identy.IdentySdk.generateST = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0035, code lost:
    
        if ((0 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0037, code lost:
    
        0 = ((long[]) $$a_state[1])[1];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, new java.lang.Object[1])).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:
    
        if (0 > 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006f, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[]{0 ^ (0 << 5)}};
        0 = ~0;
        0 = (((~(0 | (-532740091))) | (~((-540870657) | 0))) * 520) - 1224411497;
        0 = 0;
        0 = ~(532740090 | 0);
        0 = ~(0 | 1031629370);
        0 = defpackage.a.c(((~(0 | (-1031629371))) | (-1073610747)) | 0, 520, ((0 | 0) * (-1040)) + 0, -1133546657);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 121) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0054, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006c, code lost:
    
        if (0 > 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x002c, code lost:
    
        if (0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
    
        if (0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00d0, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = new java.lang.Object[1];
        d((short) 149, (byte) (-$$a[11]), (byte) (-$$a[111(0x6f, float:1.56E-43)]), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) 106, $$a[63], (byte) (-$$a[55]), 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, -1133546657);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x011f, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0125, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4918;
        com.identy.Fpnative.valueOf = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk enableRetries(int i, int i2, int i3, int i4) {
        Object[] objArr;
        int i5 = generateST + 23;
        int i6 = i5 % 128;
        deduplication = i6;
        if (i5 % 2 != 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i7 = 63 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [boolean, int] */
    public IdentySdk enableSkip() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-536339996))) | 1035229275, 519, (((~((~identityHashCode) | (-498352156))) | (~((-37987841) | identityHashCode))) * (-519)) + ((((~((-1035229276) | 0)) | (-536339996)) * 519) - 726608762), 1197693693);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 5048;
                    com.identy.Fpnative.valueOf = objArr;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(2080461665 * i3);
                    int i6 = (i4 & i5) + (i4 | i5);
                    int i7 = -(i3 * (-1687188641));
                    int i8 = ((i6 ^ i7) + ((i7 & i6) << 1)) - 1972083712;
                    int i9 = i8 >> 19;
                    int i10 = (((i9 | (-16383)) << 1) - (i9 ^ (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
                    int i12 = (i8 ^ i11) + ((i11 & i8) << 1);
                    int i13 = i8 >> 25;
                    int i14 = -(IdentyB.e((i13 | (-255)) << 1, i13 ^ (-255), 128, -1) ^ i12);
                    int i15 = (i14 ^ 6) + ((i14 & 6) << 1);
                    int i16 = ((i15 >> 22) - 2047) / 1024;
                    int i17 = (i16 ^ 1) + ((i16 & 1) << 1);
                    this.toJson = false;
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1197693693);
            j = ((long[]) objArr[0])[0];
            generateST = (deduplication + 113) % 128;
            ((long[]) objArr[0])[0] = j + 5048;
            com.identy.Fpnative.valueOf = objArr;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(2080461665 * i32);
            int i62 = (i42 & i52) + (i42 | i52);
            int i72 = -(i32 * (-1687188641));
            int i82 = ((i62 ^ i72) + ((i72 & i62) << 1)) - 1972083712;
            int i92 = i82 >> 19;
            int i102 = (((i92 | (-16383)) << 1) - (i92 ^ (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i112 = ((i102 | 1) << 1) - (i102 ^ 1);
            int i122 = (i82 ^ i112) + ((i112 & i82) << 1);
            int i132 = i82 >> 25;
            int i142 = -(IdentyB.e((i132 | (-255)) << 1, i132 ^ (-255), 128, -1) ^ i122);
            int i152 = (i142 ^ 6) + ((i142 & 6) << 1);
            int i162 = ((i152 >> 22) - 2047) / 1024;
            int i172 = (i162 ^ 1) + ((i162 & 1) << 1);
            this.toJson = false;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 11) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x010c, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x010d, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x010e, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0112, code lost:
    
        if (0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0114, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0115, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001b, code lost:
    
        0 = 0 + 67;
        com.identy.IdentySdk.deduplication = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0022, code lost:
    
        if ((0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0024, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (0 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = defpackage.a.c(~(android.os.Process.myUid() | (-4276541)), -1504, (((~((-771611069) | 0)) | 767334528) * 1504) - 1003693777, 1921615470);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (0 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0019, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x009f, code lost:
    
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 27) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00aa, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = new java.lang.Object[1];
        d((short) 185, (byte) (-$$a[11]), (byte) (-$$a[62]), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) 154, (byte) (-$$a[111(0x6f, float:1.56E-43)]), $$a[63], 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, -856040098);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00f7, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00fd, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4866;
        com.identy.Fpnative.valueOf = null;
        0.CaptureThumbActivity = com.identy.CaptureMode.L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk enableStandardCaptureMode() {
        Object[] objArr;
        int i = generateST;
        int i2 = i + 25;
        deduplication = i2 % 128;
        if (i2 % 2 != 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i3 = 54 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [boolean, int] */
    public IdentySdk enableTraining() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (deduplication + 113) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | (-125374488))) | 268591656 | (~(125374487 | i)), 988, (((~(373514792 | i)) | 20451351) * (-1976)) + ((identityHashCode | 268591656) * 988) + 483976771, 1971933747);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4915;
                    com.identy.Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = ((i4 * i4) - (~(-(430545252 * i4)))) - 1;
                    int i6 = -(i4 * (-1949717110));
                    int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
                    int i8 = (i7 & (-429997743)) + ((-429997743) | i7);
                    int i9 = i8 >> 18;
                    int i10 = ((i9 & (-32767)) + (i9 | (-32767))) / 16384;
                    int i11 = (i10 & 1) + (i10 | 1);
                    int i12 = (i8 ^ i11) + ((i11 & i8) << 1);
                    int i13 = i8 >> 28;
                    int i14 = -(IdentyB.a(i13 ^ (-31), (i13 & (-31)) << 1, 16, -1) ^ i12);
                    int i15 = (i14 ^ 4) + ((i14 & 4) << 1);
                    int i16 = i15 >> 29;
                    int i17 = ((i16 & (-15)) + (i16 | (-15))) / 8;
                    int i18 = ((i17 | 1) << 1) - (i17 ^ 1);
                    this.getWidth = false;
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1971933747);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4915;
            com.identy.Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = ((i42 * i42) - (~(-(430545252 * i42)))) - 1;
            int i62 = -(i42 * (-1949717110));
            int i72 = ((i52 | i62) << 1) - (i62 ^ i52);
            int i82 = (i72 & (-429997743)) + ((-429997743) | i72);
            int i92 = i82 >> 18;
            int i102 = ((i92 & (-32767)) + (i92 | (-32767))) / 16384;
            int i112 = (i102 & 1) + (i102 | 1);
            int i122 = (i82 ^ i112) + ((i112 & i82) << 1);
            int i132 = i82 >> 28;
            int i142 = -(IdentyB.a(i132 ^ (-31), (i132 & (-31)) << 1, 16, -1) ^ i122);
            int i152 = (i142 ^ 4) + ((i142 & 4) << 1);
            int i162 = i152 >> 29;
            int i172 = ((i162 & (-15)) + (i162 | (-15))) / 8;
            int i182 = ((i172 | 1) << 1) - (i172 ^ 1);
            this.getWidth = false;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        int i19 = (generateST + 51) % 128;
        deduplication = i19;
        generateST = (i19 + 7) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c(~((~0) | (-16861749)), 476, ((~((-16861749) | 0)) * 952) + (((481427467 | 0) * (-476)) - 1706127869), -1248022112);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0173  */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void enablesd(boolean z, boolean z2, int i) {
        long j;
        int i2;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i3 = deduplication + 3;
                generateST = i3 % 128;
                if (i3 % 2 == 0) {
                    long j2 = ((long[]) objArr[1])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4904;
                com.identy.Fpnative.valueOf = null;
                int i4 = ((int[]) $$a_state[1])[0];
                int i5 = i4 * i4;
                int i6 = -(1990423977 * i4);
                int i7 = (((i5 ^ i6) + ((i5 & i6) << 1)) - (~(-(i4 * (-1337463437))))) - 1;
                int i8 = (i7 ^ (-621696316)) + (((-621696316) & i7) << 1);
                int i9 = i8 >> 17;
                int i10 = ((i9 & (-65535)) + (i9 | (-65535))) / 32768;
                int i11 = (i8 - (~((i10 ^ 1) + ((i10 & 1) << 1)))) - 1;
                int i12 = i8 >> 19;
                int i13 = -(i11 ^ IdentyB.e((i12 | (-16383)) << 1, i12 ^ (-16383), ConstantsKt.DEFAULT_BUFFER_SIZE, -1));
                int i14 = (i13 ^ 2) + ((i13 & 2) << 1);
                int e = IdentyB.e(i14 >> 21, 4095, 2048, -1);
                this.getTemplates = false;
                this.getHeight = z2;
                this.getIdentyQuality = z;
                this.setSpoofScore = i;
                i2 = deduplication + 85;
                generateST = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
                return;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -1248022112);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4904;
            com.identy.Fpnative.valueOf = objArr4;
            int i42 = ((int[]) objArr4[1])[0];
            int i52 = i42 * i42;
            int i62 = -(1990423977 * i42);
            int i72 = (((i52 ^ i62) + ((i52 & i62) << 1)) - (~(-(i42 * (-1337463437))))) - 1;
            int i82 = (i72 ^ (-621696316)) + (((-621696316) & i72) << 1);
            int i92 = i82 >> 17;
            int i102 = ((i92 & (-65535)) + (i92 | (-65535))) / 32768;
            int i112 = (i82 - (~((i102 ^ 1) + ((i102 & 1) << 1)))) - 1;
            int i122 = i82 >> 19;
            int i132 = -(i112 ^ IdentyB.e((i122 | (-16383)) << 1, i122 ^ (-16383), ConstantsKt.DEFAULT_BUFFER_SIZE, -1));
            int i142 = (i132 ^ 2) + ((i132 & 2) << 1);
            int e2 = IdentyB.e(i142 >> 21, 4095, 2048, -1);
            this.getTemplates = false;
            this.getHeight = z2;
            this.getIdentyQuality = z;
            this.setSpoofScore = i;
            i2 = deduplication + 85;
            generateST = i2 % 128;
            if (i2 % 2 != 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        generateST = (deduplication + 71) % 128;
    }

    public boolean enroll(int i, int i2) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[]{0 ^ (0 << 5)}};
                    int c = defpackage.a.c(~((-402851229) | (~i)), 476, ((~((-402851229) | i)) * 952) + (((28338211 | 0) * (-476)) - 1675647677), 1533215827);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((long[]) objArr[0])[0] = j + 5003;
                    com.identy.Fpnative.valueOf = objArr;
                    this.PngjUnsupportedException = i;
                    this.PngjInputException = i2;
                    valueOf();
                    return enroll();
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1533215827);
            j = ((long[]) objArr[0])[0];
            deduplication = (generateST + 35) % 128;
            ((long[]) objArr[0])[0] = j + 5003;
            com.identy.Fpnative.valueOf = objArr;
            this.PngjUnsupportedException = i;
            this.PngjInputException = i2;
            valueOf();
            return enroll();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 123) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean enrollWithCustomTemplates(Template template, HashMap<Hand, String> hashMap) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        char c = 2;
        Throwable th = null;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c2 = defpackage.a.c((~(identityHashCode | 499513389)) | (~(i | (-998402670))) | 71667712, -370, (((~(499513389 | i)) | (~((-998402670) | identityHashCode))) * (-370)) + 404328781, 628112567);
                    int i2 = c2 ^ (c2 << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5009;
                    com.identy.Fpnative.valueOf = objArr;
                    if (template != null) {
                        throw new Exception(this.getData.getString(R.string.template_type_is_unknown));
                    }
                    this.e = com.identy.Action.ENROLL_WITH_TEMPLATE;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.e);
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = ((i4 * i4) - (~(-(648190959 * i4)))) - 1;
                    int i6 = -(i4 * 725675169);
                    int i7 = (((i5 | i6) << 1) - (i6 ^ i5)) - 1509010368;
                    int i8 = i7 >> 27;
                    int i9 = ((i8 & (-63)) + (i8 | (-63))) / 32;
                    int i10 = ((i9 | 1) << 1) - (i9 ^ 1);
                    int i11 = (i7 ^ i10) + ((i10 & i7) << 1);
                    int i12 = ((i7 >> 16) - 131071) / 65536;
                    int i13 = -(i11 ^ (((i12 | 1) << 1) - (i12 ^ 1)));
                    int i14 = (i13 ^ 2) + ((i13 & 2) << 1);
                    int i15 = i14 >> 19;
                    int i16 = ((i15 & (-16383)) + (i15 | (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    sb.append("0\\_".substring(192 / (((-(((i16 & 1) + (i16 | 1)) - (-1))) & i14) * 48)));
                    sb.append(template);
                    values(sb.toString());
                    IdentyUser defaultUser = getDefaultUser();
                    this.uxd565jk = defaultUser;
                    File values2 = com.identy.PngjBadCrcException.values(this.getData, "TEMP_IDENTY");
                    for (Map.Entry<Hand, String> entry : hashMap.entrySet()) {
                        Hand key = entry.getKey();
                        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(Base64.decode(new String(com.identy.e.valueOf.PngjException(entry.getValue())).getBytes(), this.isQualityFailed)));
                        byte[] bArr = new byte[1024];
                        while (true) {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry != null) {
                                String name = nextEntry.getName();
                                if (!nextEntry.isDirectory()) {
                                    String str = name.split("_")[1].split("\\.")[0];
                                    char c3 = c;
                                    File file = new File(values2, name.concat("crypt"));
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    Throwable th2 = th;
                                    while (true) {
                                        try {
                                            int read = zipInputStream.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, read);
                                        } finally {
                                        }
                                    }
                                    fileOutputStream.close();
                                    File file2 = new File(values2, name);
                                    PngjBadSignature(file.getAbsolutePath(), file2.getAbsolutePath());
                                    if (template.equals(Template.FF_ISO_19794_4)) {
                                        int i17 = deduplication + 109;
                                        generateST = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            values(new Object[]{this, file2.getAbsolutePath(), PngjException(str), key, defaultUser}, 0, 1779101910, 0, -1779101909, 0, 0);
                                            throw th2;
                                        }
                                        values(new Object[]{this, file2.getAbsolutePath(), PngjException(str), key, defaultUser}, 0, 1779101910, 0, -1779101909, 0, 0);
                                    } else if (template.equals(Template.FF_WSQ)) {
                                        PngjBadCrcException(file2.getAbsolutePath(), PngjException(str), key, defaultUser);
                                    }
                                    zipInputStream.closeEntry();
                                    c = c3;
                                    th = th2;
                                }
                            }
                        }
                    }
                    deduplication = (generateST + 51) % 128;
                    return true;
                }
            }
            byte[] bArr2 = $$d;
            byte b = (byte) (-bArr2[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr2[24]), bArr2[63], bArr2[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -119137097);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5009;
            com.identy.Fpnative.valueOf = objArr;
            if (template != null) {
            }
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
        generateST = (deduplication + 81) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0055, code lost:
    
        if (0 <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003a, code lost:
    
        if (0 <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = (int) android.os.SystemClock.uptimeMillis();
        0 = ~(85786709 | 0);
        0 = defpackage.a.c((~(0 | 413102570)) | ((~((-85786710) | 0)) | 83886101), 407, ((0 | ((~((~0) | (-413102571))) | 83886101)) * 407) + (((411201962 | 0) * (-814)) + 17006335), -672302448);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean enrollWithCustomTemplatesbase64(Template template, HashMap<Hand, String> hashMap) {
        Object[] objArr;
        long j;
        int i = (deduplication + 57) % 128;
        generateST = i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        char c = 2;
        Throwable th = null;
        boolean z = true;
        try {
            if (objArr2 != null) {
                int i2 = i + 83;
                deduplication = i2 % 128;
                if (i2 % 2 != 0) {
                    long j2 = ((long[]) objArr2[1])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) objArr[0])[0] = j + 4904;
                com.identy.Fpnative.valueOf = objArr;
                if (template != null) {
                    throw new Exception(this.getData.getString(R.string.template_type_is_unknown));
                }
                IdentyUser defaultUser = getDefaultUser();
                this.uxd565jk = defaultUser;
                this.e = com.identy.Action.ENROLL_WITH_TEMPLATE;
                StringBuilder sb = new StringBuilder();
                sb.append(this.e);
                sb.append("_");
                sb.append(template);
                PngjBadCrcException(sb.toString());
                Activity activity = this.getData;
                int i3 = ((int[]) objArr[1])[0];
                int i4 = i3 * i3;
                int i5 = -(907753470 * i3);
                int i6 = (((i4 ^ i5) + ((i4 & i5) << 1)) - (~(-(i3 * 1717546096)))) - 1;
                int i7 = (i6 ^ 623577041) + ((623577041 & i6) << 1);
                int i8 = i7 >> 18;
                int i9 = (((i8 | (-32767)) << 1) - (i8 ^ (-32767))) / 16384;
                int i10 = (i7 - (~((i9 & 1) + (i9 | 1)))) - 1;
                int i11 = i7 >> 26;
                int i12 = -(i10 ^ IdentyB.a(i11 & (-127), i11 | (-127), 64, -1));
                int i13 = (i12 ^ 2) + ((i12 & 2) << 1);
                int i14 = i13 >> 15;
                int i15 = ((i14 & (-262143)) + (i14 | (-262143))) / 131072;
                int i16 = (i15 ^ 1) + ((i15 & 1) << 1);
                File values2 = com.identy.PngjBadCrcException.values(activity, "29\\20\\TEMP_IDENTY".substring(16200 / (((-((i16 ^ 1) + ((i16 & 1) << 1))) & i13) * 1350)));
                for (Map.Entry<Hand, String> entry : hashMap.entrySet()) {
                    Hand key = entry.getKey();
                    ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(Base64.decode(entry.getValue().getBytes(), this.isQualityFailed)));
                    byte[] bArr = new byte[1024];
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry != null) {
                            String name = nextEntry.getName();
                            if (!nextEntry.isDirectory()) {
                                char c2 = c;
                                String str = name.split("_")[z ? 1 : 0].split("\\.")[0];
                                Throwable th2 = th;
                                File file = new File(values2, name.concat("crypt"));
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                boolean z2 = z;
                                while (true) {
                                    try {
                                        int read = zipInputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    } finally {
                                    }
                                }
                                fileOutputStream.close();
                                File file2 = new File(values2, name);
                                PngjBadSignature(file.getAbsolutePath(), file2.getAbsolutePath());
                                if (template.equals(Template.FF_ISO_19794_4)) {
                                    int i17 = deduplication + 25;
                                    generateST = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        values(new Object[]{this, file2.getAbsolutePath(), PngjException(str), key, defaultUser}, 0, 1779101910, 0, -1779101909, 0, 0);
                                        throw th2;
                                    }
                                    values(new Object[]{this, file2.getAbsolutePath(), PngjException(str), key, defaultUser}, 0, 1779101910, 0, -1779101909, 0, 0);
                                    generateST = (deduplication + 113) % 128;
                                } else if (template.equals(Template.FF_WSQ)) {
                                    int i18 = deduplication + 81;
                                    generateST = i18 % 128;
                                    if (i18 % 2 == 0) {
                                        PngjBadCrcException(file2.getAbsolutePath(), PngjException(str), key, defaultUser);
                                        throw th2;
                                    }
                                    PngjBadCrcException(file2.getAbsolutePath(), PngjException(str), key, defaultUser);
                                }
                                zipInputStream.closeEntry();
                                c = c2;
                                th = th2;
                                z = z2;
                            }
                        }
                    }
                }
                return z;
            }
            byte[] bArr2 = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr2[11]), (byte) (-bArr2[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr2[111]), bArr2[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -672302448);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4904;
            com.identy.Fpnative.valueOf = objArr;
            if (template != null) {
            }
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean enrollWithTemplates(Template template, HashMap<Pair<Hand, Finger>, String> hashMap) {
        Object[] objArr;
        long j;
        Template template2 = template;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i = (((~((-186564875) | freeMemory)) | (-312324406)) * (-318)) - 837935915;
                    int i2 = ~((-312324406) | freeMemory);
                    int i3 = ~freeMemory;
                    int c = defpackage.a.c((~(freeMemory | 463466815)) | (~((-276901942) | i3)), 318, ((i2 | (~(i3 | 463466815))) * 318) + i, -147865372);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4856;
                    com.identy.Fpnative.valueOf = objArr;
                    if (template2 != null) {
                        throw new Exception(this.getData.getString(R.string.template_type_is_unknown));
                    }
                    deduplication = (generateST + 117) % 128;
                    if (template2.equals(Template.NIST_ITL_1_2015_RECORD_9) || template2.equals(Template.NIST_ITL_1_2015_RECORD_14)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.getData.getString(R.string.template_type_is_not_valid));
                        sb.append(hashMap);
                        sb.append(" for this operation");
                        throw new Exception(sb.toString());
                    }
                    this.e = com.identy.Action.ENROLL_WITH_TEMPLATE;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.e);
                    int i6 = ((int[]) objArr[1])[0];
                    int i7 = i6 * i6;
                    int i8 = -(1547121894 * i6);
                    int i9 = (((i7 & i8) + (i7 | i8)) - (~(-(i6 * 719288360)))) - 1109853392;
                    int e = IdentyB.e(i9 >> 24, 511, 256, -1);
                    int i10 = ((i9 | e) << 1) - (e ^ i9);
                    int i11 = i9 >> 29;
                    int i12 = ((i11 & (-15)) + (i11 | (-15))) / 8;
                    int i13 = -((((i12 | 1) << 1) - (i12 ^ 1)) ^ i10);
                    int i14 = (i13 & 4) + (i13 | 4);
                    int i15 = i14 >> 28;
                    int a = IdentyB.a(i15 ^ (-31), (i15 & (-31)) << 1, 16, -1);
                    sb2.append("12;_".substring(13452 / (((-((a & 1) + (a | 1))) & i14) * 1121)));
                    sb2.append(template2);
                    PngjBadCrcException(sb2.toString());
                    IdentyUser defaultUser = getDefaultUser();
                    this.uxd565jk = defaultUser;
                    com.identy.PngjBadCrcException.values(this.getData, "TEMP_IDENTY");
                    for (Map.Entry<Pair<Hand, Finger>, String> entry : hashMap.entrySet()) {
                        generateST = (deduplication + 95) % 128;
                        Pair<Hand, Finger> key = entry.getKey();
                        Hand hand = (Hand) key.first;
                        Finger finger = (Finger) key.second;
                        String value = entry.getValue();
                        if (template2.equals(Template.WSQ)) {
                            PngjBadCrcException(value, finger, hand, defaultUser);
                        } else if (template2.equals(Template.ISO_19794_2)) {
                            values(value, finger, hand, defaultUser);
                        } else if (template2.equals(Template.ISO_19794_4)) {
                            int i16 = deduplication + 31;
                            generateST = i16 % 128;
                            if (i16 % 2 == 0) {
                                values(new Object[]{this, value, finger, hand, defaultUser}, 0, 1779101910, 0, -1779101909, 0, 0);
                                throw null;
                            }
                            values(new Object[]{this, value, finger, hand, defaultUser}, 0, 1779101910, 0, -1779101909, 0, 0);
                        } else {
                            valueOf(value, finger, hand, defaultUser, template2);
                            template2 = template;
                        }
                    }
                    return true;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -147865372);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4856;
            com.identy.Fpnative.valueOf = objArr;
            if (template2 != null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean enrollWithTemplatesbase64(Template template, HashMap<Pair<Hand, Finger>, String> hashMap) {
        Object[] objArr;
        long j;
        Template template2 = template;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c(identityHashCode | (-264791147), 496, (((~((-763680427) | identityHashCode)) | 537170560 | (~((~identityHashCode) | (-38281281)))) * (-496)) + ((0 * 992) - 2137057233), 996249518);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    generateST = (deduplication + 15) % 128;
                    ((long[]) objArr[0])[0] = j + 5004;
                    com.identy.Fpnative.valueOf = objArr;
                    if (template2 != null) {
                        throw new Exception(this.getData.getString(R.string.template_type_is_unknown));
                    }
                    if (template2.equals(Template.NIST_ITL_1_2015_RECORD_9) || template2.equals(Template.NIST_ITL_1_2015_RECORD_14)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.getData.getString(R.string.template_type_is_not_valid));
                        sb.append(hashMap);
                        sb.append(" for this operation");
                        throw new Exception(sb.toString());
                    }
                    this.e = com.identy.Action.ENROLL_WITH_TEMPLATE;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.e);
                    sb2.append("_");
                    sb2.append(template2);
                    PngjBadCrcException(sb2.toString());
                    IdentyUser defaultUser = getDefaultUser();
                    this.uxd565jk = defaultUser;
                    Activity activity = this.getData;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(1375399899 * i3);
                    int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                    int i7 = -(i3 * 683775517);
                    int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                    int i9 = (i8 & 1519839248) + (1519839248 | i8);
                    int i10 = i9 >> 25;
                    int i11 = ((i10 ^ (-255)) + ((i10 & (-255)) << 1)) / 128;
                    int i12 = ((i11 | 1) << 1) - (i11 ^ 1);
                    int i13 = (i9 ^ i12) + ((i12 & i9) << 1);
                    int i14 = ((i9 >> 19) - 16383) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i15 = (-(i13 ^ ((i14 & 1) + (i14 | 1)))) + 8;
                    int i16 = i15 >> 27;
                    int i17 = ((i16 & (-63)) + (i16 | (-63))) / 32;
                    int i18 = ((i17 | 1) << 1) - (i17 ^ 1);
                    com.identy.PngjBadCrcException.values(activity, "13,26,TEMP_IDENTY".substring(60672 / ((i15 & (-(((i18 | 1) << 1) - (i18 ^ 1)))) * 1264)));
                    for (Map.Entry<Pair<Hand, Finger>, String> entry : hashMap.entrySet()) {
                        Pair<Hand, Finger> key = entry.getKey();
                        Hand hand = (Hand) key.first;
                        Finger finger = (Finger) key.second;
                        String value = entry.getValue();
                        byte[] decode = Base64.decode(value.getBytes(), this.isQualityFailed);
                        if (template2.equals(Template.WSQ)) {
                            generateST = (deduplication + 123) % 128;
                            valueOf(decode, finger, hand, defaultUser);
                        } else if (template2.equals(Template.ISO_19794_2)) {
                            values(new Object[]{this, decode, finger, hand, defaultUser}, 0, -994925292, 0, 994925295, 0, 0);
                        } else if (template2.equals(Template.ISO_19794_4)) {
                            PngjBadCrcException(decode, finger, hand, defaultUser);
                        } else {
                            valueOf(value, finger, hand, defaultUser, template2);
                            template2 = template;
                        }
                    }
                    return true;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 996249518);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5004;
            com.identy.Fpnative.valueOf = objArr;
            if (template2 != null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 77) % 128;
    }

    public IdentySdk f() {
        Object[] objArr;
        long j;
        deduplication = (generateST + 119) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int i2 = ~((-329970642) | i);
                    int i3 = ~((-168918639) | identityHashCode);
                    int c = defpackage.a.c((~(identityHashCode | (-329970642))) | (~(i | 329970641)), 575, ((i3 | (~(168918638 | i))) * (-575)) + ((i2 | i3) * 1150) + 1400362686, -1782782372);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4987;
                    com.identy.Fpnative.valueOf = objArr;
                    this.pfkrolGetQuality = true;
                    this.PngjInputException = 90;
                    int i6 = ((int[]) objArr[1])[0];
                    int i7 = i6 * i6;
                    int i8 = -(836088971 * i6);
                    int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
                    int i10 = -(i6 * (-126611887));
                    int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                    int i12 = (i11 ^ 963808068) + ((963808068 & i11) << 1);
                    int i13 = ((i12 >> 24) - 511) / 256;
                    int i14 = (i13 & 1) + (i13 | 1);
                    int i15 = (i12 & i14) + (i14 | i12);
                    int i16 = i12 >> 25;
                    int i17 = ((i16 ^ (-255)) + ((i16 & (-255)) << 1)) / 128;
                    int i18 = -(i15 ^ ((i17 ^ 1) + ((i17 & 1) << 1)));
                    int i19 = (i18 ^ 9) + ((i18 & 9) << 1);
                    int i20 = i19 >> 25;
                    int i21 = (((i20 | (-255)) << 1) - (i20 ^ (-255))) / 128;
                    int i22 = ((i21 | 1) << 1) - (i21 ^ 1);
                    /* stubbed: getPadSub2.PngjException logging call */
                    return this;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1782782372);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4987;
            com.identy.Fpnative.valueOf = objArr;
            this.pfkrolGetQuality = true;
            this.PngjInputException = 90;
            int i62 = ((int[]) objArr[1])[0];
            int i72 = i62 * i62;
            int i82 = -(836088971 * i62);
            int i92 = (i72 ^ i82) + ((i72 & i82) << 1);
            int i102 = -(i62 * (-126611887));
            int i112 = (i92 ^ i102) + ((i102 & i92) << 1);
            int i122 = (i112 ^ 963808068) + ((963808068 & i112) << 1);
            int i132 = ((i122 >> 24) - 511) / 256;
            int i142 = (i132 & 1) + (i132 | 1);
            int i152 = (i122 & i142) + (i142 | i122);
            int i162 = i122 >> 25;
            int i172 = ((i162 ^ (-255)) + ((i162 & (-255)) << 1)) / 128;
            int i182 = -(i152 ^ ((i172 ^ 1) + ((i172 & 1) << 1)));
            int i192 = (i182 ^ 9) + ((i182 & 9) << 1);
            int i202 = i192 >> 25;
            int i212 = (((i202 | (-255)) << 1) - (i202 ^ (-255))) / 128;
            int i222 = ((i212 | 1) << 1) - (i212 ^ 1);
            /* stubbed: getPadSub2.PngjException logging call */
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 91) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Activity getAc() {
        Object[] objArr;
        long j;
        int i;
        generateST = (deduplication + 1) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~(((int) Process.getStartUptimeMillis()) | 323579654)) | 137494585, 658, ((423259199 | 0) * (-658)) - 446555733, 1153600335);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4899;
                    com.identy.Fpnative.valueOf = objArr;
                    Activity activity = this.getData;
                    i = generateST + 27;
                    deduplication = i % 128;
                    if (i % 2 != 0) {
                        return activity;
                    }
                    throw null;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1153600335);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4899;
            com.identy.Fpnative.valueOf = objArr;
            Activity activity2 = this.getData;
            i = generateST + 27;
            deduplication = i % 128;
            if (i % 2 != 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 37) % 128;
    }

    public Action getAction() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~System.identityHashCode(this);
                    int c = defpackage.a.c(i | (-285581313), -828, (((~(i | (-285581313))) | 784470592) * (-828)) + 1262351875, -927421576);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    deduplication = (generateST + 43) % 128;
                    ((long[]) objArr[0])[0] = j + 4914;
                    com.identy.Fpnative.valueOf = objArr;
                    Action action = this.e;
                    generateST = (deduplication + 49) % 128;
                    return action;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1165546632);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4914;
            com.identy.Fpnative.valueOf = objArr;
            Action action2 = this.e;
            generateST = (deduplication + 49) % 128;
            return action2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 45) % 128;
    }

    public long getAfterCaptureInlinemsgTime() {
        Object[] objArr;
        long j;
        generateST = (deduplication + 87) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~System.identityHashCode(this)) | (-317304164))) | 271132963, -964, (((~((-317304164) | 0)) | (-181585117)) * (-964)) - 1811936553, 1174941777);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4983;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.getServerRequest;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1174941777);
            j = ((long[]) objArr[0])[0];
            generateST = (deduplication + 59) % 128;
            ((long[]) objArr[0])[0] = j + 4983;
            com.identy.Fpnative.valueOf = objArr;
            return this.getServerRequest;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public int getAllowedAttempts() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (generateST + 23) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int c = defpackage.a.c(startElapsedRealtime | (-1046863836), 54, (((~((~startElapsedRealtime) | 1008815387)) | (~((-1008815388) | startElapsedRealtime)) | (-1046863836)) * 54) + ((((~((-509926108) | 0)) | 471877659) * (-108)) - 1622209855), 1330868128);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4851;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.PngjUnsupportedException;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1330868128);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4851;
            com.identy.Fpnative.valueOf = objArr;
            return this.PngjUnsupportedException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 17) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = (int) android.os.Process.getElapsedCpuTime();
        0 = ~(140897128 | 0);
        0 = ~0;
        0 = defpackage.a.c((~(0 | (-639786409))) | (~((-140897129) | 0)), 406, ((~(778567656 | 0)) * (-406)) + (((0 | (~((-138781249) | 0))) * (-406)) + 1368953161), -1540344450);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 125) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getAllowedTimeLimit() {
        long j;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = generateST + 73;
                deduplication = i % 128;
                if (i % 2 != 0) {
                    long j2 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4869;
                com.identy.Fpnative.valueOf = null;
                return this.PngjInputException;
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -1540344450);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4869;
            com.identy.Fpnative.valueOf = objArr4;
            return this.PngjInputException;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public String getAttackS() {
        Object[] objArr;
        long j;
        int i = generateST + 17;
        deduplication = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                    int c = defpackage.a.c((~(freeMemory | (-140758749))) | 4227648 | (~((~freeMemory) | 494661631)), 988, (((~((-136531101) | 0)) | (~(494661631 | freeMemory))) * 988) - 2032379601, 1528319940);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    deduplication = (generateST + 111) % 128;
                    ((long[]) objArr[0])[0] = j + 4883;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.getEncryptedTemplates;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1528319940);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4883;
            com.identy.Fpnative.valueOf = objArr;
            return this.getEncryptedTemplates;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 21) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00fe, code lost:
    
        return 0.isQualityFailed;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ff, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0100, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0104, code lost:
    
        if (0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0106, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0107, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (0 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = defpackage.a.a();
        0 = ~0;
        0 = defpackage.a.c(((~(0 | 718925200)) | (-803078097)) | (~(0 | (-135883025))), 369, (((~((-718925201) | 0)) | (-220035921)) * (-369)) + ((((-84152897) | 0) * (-369)) - 94560498), 446634408);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 109) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001c, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0095, code lost:
    
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 57) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x009d, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = new java.lang.Object[1];
        d((short) 185, (byte) (-$$a[11]), (byte) (-$$a[62]), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) 154, (byte) (-$$a[111(0x6f, float:1.56E-43)]), $$a[63], 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, 446634408);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00eb, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00f1, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4978;
        com.identy.Fpnative.valueOf = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getBase64EncodingFlag() {
        Object[] objArr;
        int i = deduplication + 75;
        generateST = i % 128;
        if (i % 2 == 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i2 = 54 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = defpackage.a.c((~(java.lang.System.identityHashCode(0) | (-208393421))) | 570426112, 196, (((-778819533) | 0) * (-196)) - 1960252085, 1933539822);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getCaptureType() {
        long j;
        int i = generateST;
        deduplication = (i + 61) % 128;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = i + 123;
                deduplication = i2 % 128;
                if (i2 % 2 != 0) {
                    long j2 = ((long[]) objArr[0])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4948;
                com.identy.Fpnative.valueOf = null;
                return this.getShortform;
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 1933539822);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4948;
            com.identy.Fpnative.valueOf = objArr4;
            return this.getShortform;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 3) % 128;
    }

    public IdentyUser getDefaultUser() {
        Object[] objArr;
        long j;
        int i = generateST + 17;
        int i2 = i % 128;
        deduplication = i2;
        if (i % 2 != 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (i2 + 123) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-130849887))) | (-368039394), 318, (((~(130849886 | identityHashCode)) | 270746017) * (-318)) + ((((~((-97293377) | identityHashCode)) | (~((~identityHashCode) | 401595903))) * (-318)) - 1384258823), -1816448474);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4890;
                    com.identy.Fpnative.valueOf = objArr;
                    IdentyUser identyUser = new IdentyUser();
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = i5 * i5;
                    int i7 = -(236201608 * i5);
                    int i8 = (((i6 & i7) + (i6 | i7)) - (~(-(i5 * (-416562008))))) - 1;
                    int i9 = (i8 & (-563328448)) + ((-563328448) | i8);
                    int i10 = ((i9 >> 15) - 262143) / 131072;
                    int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
                    int i12 = (i9 & i11) + (i11 | i9);
                    int i13 = i9 >> 25;
                    int i14 = ((i13 ^ (-255)) + ((i13 & (-255)) << 1)) / 128;
                    int i15 = -(i12 ^ ((i14 ^ 1) + ((i14 & 1) << 1)));
                    int i16 = (i15 ^ 7) + ((i15 & 7) << 1);
                    int i17 = i16 >> 27;
                    int i18 = (((i17 | (-63)) << 1) - (i17 ^ (-63))) / 32;
                    int i19 = ((i18 | 1) << 1) - (i18 ^ 1);
                    identyUser.uid = 0 / (((-(((i19 | 1) << 1) - (i19 ^ 1))) & i16) * 1476);
                    identyUser.username = IdentyUserManager.getdefUser();
                    deduplication = (generateST + 101) % 128;
                    return identyUser;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1816448474);
            j = ((long[]) objArr[0])[0];
            deduplication = (generateST + 47) % 128;
            ((long[]) objArr[0])[0] = j + 4890;
            com.identy.Fpnative.valueOf = objArr;
            IdentyUser identyUser2 = new IdentyUser();
            int i52 = ((int[]) objArr[1])[0];
            int i62 = i52 * i52;
            int i72 = -(236201608 * i52);
            int i82 = (((i62 & i72) + (i62 | i72)) - (~(-(i52 * (-416562008))))) - 1;
            int i92 = (i82 & (-563328448)) + ((-563328448) | i82);
            int i102 = ((i92 >> 15) - 262143) / 131072;
            int i112 = ((i102 | 1) << 1) - (i102 ^ 1);
            int i122 = (i92 & i112) + (i112 | i92);
            int i132 = i92 >> 25;
            int i142 = ((i132 ^ (-255)) + ((i132 & (-255)) << 1)) / 128;
            int i152 = -(i122 ^ ((i142 ^ 1) + ((i142 & 1) << 1)));
            int i162 = (i152 ^ 7) + ((i152 & 7) << 1);
            int i172 = i162 >> 27;
            int i182 = (((i172 | (-63)) << 1) - (i172 ^ (-63))) / 32;
            int i192 = ((i182 | 1) << 1) - (i182 ^ 1);
            identyUser2.uid = 0 / (((-(((i192 | 1) << 1) - (i192 ^ 1))) & i162) * 1476);
            identyUser2.username = IdentyUserManager.getdefUser();
            deduplication = (generateST + 101) % 128;
            return identyUser2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public FingerDetectionMode[] getDetections() {
        Object[] objArr;
        long j;
        int i = generateST;
        int i2 = i + 73;
        deduplication = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (i + 33) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c(identityHashCode | (-232305455), 496, (((~((-731194735) | identityHashCode)) | 570754112 | (~((~identityHashCode) | (-71864833)))) * (-496)) + ((0 * 992) - 2137057233), -1988215601);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    deduplication = (generateST + 91) % 128;
                    ((long[]) objArr[0])[0] = j + 4910;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.setScore;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1988215601);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4910;
            com.identy.Fpnative.valueOf = objArr;
            return this.setScore;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0049, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = (int) java.lang.Runtime.getRuntime().maxMemory();
        0 = defpackage.a.c((~(0 | (-371759708))) | (~(870648987 | 0)), -1324, (((~0) | 566559872) * 1324) + 946668373, 383792642);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 99) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getFingerPrintDrawable() {
        long j;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = generateST + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground;
                deduplication = i % 128;
                if (i % 2 != 0) {
                    long j2 = ((long[]) objArr[1])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4906;
                com.identy.Fpnative.valueOf = null;
                return this.Enroll2IndexActivity;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -662434536);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4906;
            com.identy.Fpnative.valueOf = objArr4;
            return this.Enroll2IndexActivity;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 91) % 128;
    }

    public Bitmap.CompressFormat getGimageformat() {
        Object[] objArr;
        long j;
        deduplication = (generateST + 89) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = defpackage.a.c((~(83957258 | i)) | (-414932022), 712, (((~(identityHashCode | 498818623)) | (~(i | (-414861366)))) * (-712)) + (((414861365 | 0) * (-712)) - 70280745), 2034462842);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4850;
                    com.identy.Fpnative.valueOf = objArr;
                    Bitmap.CompressFormat compressFormat = this.CaptureRolledThumbActivity;
                    deduplication = (generateST + 39) % 128;
                    return compressFormat;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2034462842);
            j = ((long[]) objArr[0])[0];
            deduplication = (generateST + 79) % 128;
            ((long[]) objArr[0])[0] = j + 4850;
            com.identy.Fpnative.valueOf = objArr;
            Bitmap.CompressFormat compressFormat2 = this.CaptureRolledThumbActivity;
            deduplication = (generateST + 39) % 128;
            return compressFormat2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InlineGuideOption getGuideOption() {
        Object[] objArr;
        long j;
        InlineGuideOption inlineGuideOption;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (generateST + 109) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | 461785962)) | 42222144, 49, (((~((~identityHashCode) | (-960675243))) | 461785962 | (~(960675242 | identityHashCode))) * (-49)) + ((((~(461785962 | 0)) | (-1002897387)) * 98) - 1662280001), -109722299);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4851;
                    com.identy.Fpnative.valueOf = objArr;
                    inlineGuideOption = this.FingerAS;
                    if (inlineGuideOption == null) {
                        return inlineGuideOption;
                    }
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(138744813 * i3);
                    int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                    int i7 = -(i3 * (-891432035));
                    int i8 = (i6 & i7) + (i7 | i6);
                    int i9 = ((i8 | (-209414759)) << 1) - ((-209414759) ^ i8);
                    int i10 = i9 >> 24;
                    int i11 = (((i10 | (-511)) << 1) - (i10 ^ (-511))) / 256;
                    int i12 = (-(((i9 - (~((i11 & 1) + (i11 | 1)))) - 1) ^ IdentyB.e(i9 >> 19, 16383, ConstantsKt.DEFAULT_BUFFER_SIZE, -1))) + 7;
                    int i13 = ((i12 >> 22) - 2047) / 1024;
                    int i14 = (i13 & 1) + (i13 | 1);
                    InlineGuideOption inlineGuideOption2 = new InlineGuideOption(300, 32508 / ((i12 & (-(((i14 | 1) << 1) - (1 ^ i14)))) * 1548));
                    deduplication = (generateST + 63) % 128;
                    return inlineGuideOption2;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -109722299);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4851;
            com.identy.Fpnative.valueOf = objArr;
            inlineGuideOption = this.FingerAS;
            if (inlineGuideOption == null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String getInstallUserID() {
        Object[] objArr;
        long j;
        Object PngjBadSignature2;
        long j2;
        char c;
        char c2;
        Context context;
        char c3;
        Object[] objArr2;
        float f;
        Object[] objArr3 = com.identy.Fpnative.valueOf;
        try {
            try {
                if (objArr3 != null) {
                    long j3 = ((long[]) objArr3[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j3 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr3[0])[0]}, new int[1]};
                        int myUid = Process.myUid();
                        int c4 = defpackage.a.c((~(myUid | (-134228013))) | 352469267, 130, ((~((~myUid) | (-134228013))) * 130) + 1652752449, 1620083078);
                        int i = c4 ^ (c4 << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        deduplication = (generateST + 61) % 128;
                        ((long[]) objArr[0])[0] = j + 4951;
                        com.identy.Fpnative.valueOf = objArr;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                        if (PngjBadSignature2 == null) {
                            char trimmedLength = (char) (TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 31077);
                            int packedPositionGroup = 49 - ExpandableListView.getPackedPositionGroup(0L);
                            int indexOf = 1043 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
                            byte b = $$a[20];
                            byte b2 = b;
                            Object[] objArr4 = new Object[1];
                            j(b2, (byte) (b2 - 1), b, objArr4);
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(trimmedLength, packedPositionGroup, indexOf, 159283629, false, (String) objArr4[0], null);
                        }
                        j2 = ((Field) PngjBadSignature2).getLong(null);
                        if (j2 == -1) {
                            long j4 = j2 + 1881;
                            Object[] objArr5 = new Object[1];
                            c = '?';
                            l(null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr5);
                            Class<?> cls = Class.forName((String) objArr5[0]);
                            Object[] objArr6 = new Object[1];
                            c2 = 20;
                            l(null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, null, "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr6);
                            if (j4 >= ((Long) cls.getDeclaredMethod((String) objArr6[0], null).invoke(null, null)).longValue()) {
                                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                                if (PngjBadSignature3 == null) {
                                    char size = (char) (31077 - View.MeasureSpec.getSize(0));
                                    int keyCodeFromString = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 49;
                                    int i3 = 1044 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                    byte b3 = $$a[20];
                                    byte b4 = (byte) (b3 - 1);
                                    byte b5 = b3;
                                    Object[] objArr7 = new Object[1];
                                    j(b4, b5, (byte) (b5 - 1), objArr7);
                                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(size, keyCodeFromString, i3, 1150904546, false, (String) objArr7[0], null);
                                }
                                Object[] objArr8 = (Object[]) ((Field) PngjBadSignature3).get(null);
                                objArr2 = new Object[]{0, 0, new int[]{0}, new int[]{0}, new int[1]};
                                int i4 = ((int[]) objArr8[3])[0];
                                int i5 = ((int[]) objArr8[2])[0];
                                String str = (String) objArr8[1];
                                String str2 = (String) objArr8[0];
                                int i6 = ~((int) Runtime.getRuntime().freeMemory());
                                int c5 = defpackage.a.c((~(i6 | (-695077944))) | 2493493, 983, (((~(70720573 | i6)) | (-695077944)) * (-983)) + 2106402158, -66319567);
                                int i7 = c5 ^ (c5 << 13);
                                int i8 = i7 ^ (i7 >>> 17);
                                ((int[]) objArr2[4])[0] = i8 ^ (i8 << 5);
                                c3 = 2;
                                if (((int[]) objArr2[3])[0] != ((int[]) objArr2[c3])[0]) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add((String) objArr2[1]);
                                    arrayList.add((String) objArr2[0]);
                                    throw null;
                                }
                                Object[] objArr9 = new Object[5];
                                objArr9[c3] = new int[]{0};
                                objArr9[3] = new int[]{0};
                                objArr9[4] = new int[1];
                                int i9 = ((int[]) objArr2[4])[0];
                                int i10 = ((int[]) objArr2[3])[0];
                                int i11 = ((int[]) objArr2[c3])[0];
                                String str3 = (String) objArr2[1];
                                String str4 = (String) objArr2[0];
                                objArr9[1] = str3;
                                objArr9[0] = str4;
                                int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                int c6 = defpackage.a.c((~(startUptimeMillis | 345185020)) | (~((~startUptimeMillis) | 969542390)), 979, ((startUptimeMillis | 969542390) * (-979)) + (((~(345185020 | 0)) * 979) - 747696062), i9);
                                int i12 = c6 ^ (c6 << 13);
                                int i13 = i12 ^ (i12 >>> 17);
                                ((int[]) objArr9[4])[0] = i13 ^ (i13 << 5);
                                generateST = (deduplication + 107) % 128;
                                return this.closefDialog;
                            }
                        } else {
                            c = '?';
                            c2 = 20;
                        }
                        Object[] objArr10 = new Object[1];
                        l(null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), null, "\u0083\u0081\u008c\u0084\u0097\u0096\u008a\u008b\u0086\u0095\u0086\u008b\u0090\u0094\u0087\u0092\u0092\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr10);
                        Class<?> cls2 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        l(null, 126 - ExpandableListView.getPackedPositionChild(0L), null, "\u0082\u0085\u0086\u008b\u0081\u0090\u0086\u008f\u0092\u0092\u0094\u008b\u0082\u008c\u0084\u0084\u0098\u0090", objArr11);
                        context = (Context) cls2.getMethod((String) objArr11[0], null).invoke(null, null);
                        if (context != null) {
                            if (context instanceof ContextWrapper) {
                                deduplication = (generateST + 113) % 128;
                                if (((ContextWrapper) context).getBaseContext() == null) {
                                    context = null;
                                }
                            }
                            context = context.getApplicationContext();
                        }
                        Object[] objArr12 = new Object[1];
                        l(null, 127 - (ViewConfiguration.getTapTimeout() >> 16), null, "\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u009a\u0082\u0081\u008f\u0087\u0081\u0095\u0081\u0099", objArr12);
                        Class<?> cls3 = Class.forName((String) objArr12[0]);
                        Object[] objArr13 = new Object[1];
                        l(null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, "\u008c\u0083\u0085\u008e\u0097\u0088\u0081\u009b\u008a\u008b\u0086\u008b\u0082\u008c\u0083\u0086", objArr13);
                        int intValue = ((Integer) cls3.getMethod((String) objArr13[0], Object.class).invoke(null, this)).intValue();
                        generateST = (deduplication + 15) % 128;
                        Object[] objArr14 = {context, Integer.valueOf(intValue), 0, -66319567};
                        byte[] bArr = $$d;
                        c3 = 2;
                        Object[] objArr15 = new Object[1];
                        d((short) (bArr[15] + 1), (byte) (-bArr[57]), (byte) 40, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        short s = bArr[c];
                        byte b6 = (byte) s;
                        Object[] objArr16 = new Object[1];
                        d(s, b6, (byte) (b6 | 7), objArr16);
                        String str5 = (String) objArr16[0];
                        Class cls5 = Integer.TYPE;
                        objArr2 = (Object[]) cls4.getMethod(str5, Context.class, cls5, cls5, cls5).invoke(null, objArr14);
                        if (context != null) {
                            deduplication = (generateST + 95) % 128;
                            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1200224935);
                            if (PngjBadSignature4 == null) {
                                char c7 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 31076);
                                int scrollBarSize = 49 - (ViewConfiguration.getScrollBarSize() >> 8);
                                int i14 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1043;
                                byte b7 = $$a[c2];
                                byte b8 = (byte) (b7 - 1);
                                byte b9 = b7;
                                f = 0.0f;
                                Object[] objArr17 = new Object[1];
                                j(b8, b9, (byte) (b9 - 1), objArr17);
                                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c7, scrollBarSize, i14, 1150904546, false, (String) objArr17[0], null);
                            } else {
                                f = 0.0f;
                            }
                            ((Field) PngjBadSignature4).set(null, objArr2);
                            try {
                                Object[] objArr18 = new Object[1];
                                l(null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), null, "\u0091\u0090\u0085\u008f\u008e\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u0088\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr18);
                                Class<?> cls6 = Class.forName((String) objArr18[0]);
                                Object[] objArr19 = new Object[1];
                                l(null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, "\u008c\u008d\u0086\u008b\u008f\u0081\u008c\u0093\u0083\u008c\u0088\u0092\u0081\u008f\u008c", objArr19);
                                Long valueOf2 = Long.valueOf(((Long) cls6.getDeclaredMethod((String) objArr19[0], null).invoke(null, null)).longValue());
                                Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
                                if (PngjBadSignature5 == null) {
                                    char c8 = (char) (31077 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)));
                                    int i15 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 48;
                                    int indexOf2 = 1042 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
                                    byte b10 = $$a[c2];
                                    byte b11 = b10;
                                    Object[] objArr20 = new Object[1];
                                    j(b11, (byte) (b11 - 1), b10, objArr20);
                                    PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c8, i15, indexOf2, 159283629, false, (String) objArr20[0], null);
                                }
                                ((Field) PngjBadSignature5).set(null, valueOf2);
                            } catch (Exception unused) {
                                throw new RuntimeException();
                            }
                        }
                        if (((int[]) objArr2[3])[0] != ((int[]) objArr2[c3])[0]) {
                        }
                    }
                }
                Object[] objArr142 = {context, Integer.valueOf(0), 0, -66319567};
                byte[] bArr2 = $$d;
                c3 = 2;
                Object[] objArr152 = new Object[1];
                d((short) (bArr2[15] + 1), (byte) (-bArr2[57]), (byte) 40, objArr152);
                Class<?> cls42 = Class.forName((String) objArr152[0]);
                short s2 = bArr2[c];
                byte b62 = (byte) s2;
                Object[] objArr162 = new Object[1];
                d(s2, b62, (byte) (b62 | 7), objArr162);
                String str52 = (String) objArr162[0];
                Class cls52 = Integer.TYPE;
                objArr2 = (Object[]) cls42.getMethod(str52, Context.class, cls52, cls52, cls52).invoke(null, objArr142);
                if (context != null) {
                }
                if (((int[]) objArr2[3])[0] != ((int[]) objArr2[c3])[0]) {
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
            byte[] bArr3 = $$d;
            byte b12 = (byte) (-bArr3[11]);
            Object[] objArr21 = new Object[1];
            d((short) 88, b12, (byte) (b12 + 4), objArr21);
            Class<?> cls7 = Class.forName((String) objArr21[0]);
            Object[] objArr22 = new Object[1];
            d((short) (-bArr3[24]), bArr3[63], bArr3[116], objArr22);
            objArr = (Object[]) cls7.getMethod((String) objArr22[0], Integer.TYPE).invoke(null, 1620083078);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4951;
            com.identy.Fpnative.valueOf = objArr;
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-175041514);
            if (PngjBadSignature2 == null) {
            }
            j2 = ((Field) PngjBadSignature2).getLong(null);
            if (j2 == -1) {
            }
            Object[] objArr102 = new Object[1];
            l(null, 127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), null, "\u0083\u0081\u008c\u0084\u0097\u0096\u008a\u008b\u0086\u0095\u0086\u008b\u0090\u0094\u0087\u0092\u0092\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr102);
            Class<?> cls22 = Class.forName((String) objArr102[0]);
            Object[] objArr112 = new Object[1];
            l(null, 126 - ExpandableListView.getPackedPositionChild(0L), null, "\u0082\u0085\u0086\u008b\u0081\u0090\u0086\u008f\u0092\u0092\u0094\u008b\u0082\u008c\u0084\u0084\u0098\u0090", objArr112);
            context = (Context) cls22.getMethod((String) objArr112[0], null).invoke(null, null);
            if (context != null) {
            }
            Object[] objArr122 = new Object[1];
            l(null, 127 - (ViewConfiguration.getTapTimeout() >> 16), null, "\u008d\u008c\u008b\u0088\u008a\u0089\u0087\u009a\u0082\u0081\u008f\u0087\u0081\u0095\u0081\u0099", objArr122);
            Class<?> cls32 = Class.forName((String) objArr122[0]);
            Object[] objArr132 = new Object[1];
            l(null, 128 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), null, "\u008c\u0083\u0085\u008e\u0097\u0088\u0081\u009b\u008a\u008b\u0086\u008b\u0082\u008c\u0083\u0086", objArr132);
            int intValue2 = ((Integer) cls32.getMethod((String) objArr132[0], Object.class).invoke(null, this)).intValue();
            generateST = (deduplication + 15) % 128;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
        generateST = (deduplication + 39) % 128;
    }

    public String getInstallationID() {
        Object[] objArr;
        long j;
        deduplication = (generateST + 27) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | (-76071361))) | (~(78170573 | i)) | 574960640, 676, (((~(577059853 | i)) | (-653131214)) * 676) + ((653131213 | identityHashCode) * (-676)) + 1053026443, 239994025);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4945;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.closeDialog;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 239994025);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4945;
            com.identy.Fpnative.valueOf = objArr;
            return this.closeDialog;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 17) % 128;
    }

    public String getInternalTrnsactionID() {
        Object[] objArr;
        long j;
        int i = (generateST + 89) % 128;
        deduplication = i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (i + 77) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i2 = ~identityHashCode;
                    int c = defpackage.a.c((~(i2 | (-289212232))) | 209677048, 217, (((~(identityHashCode | (-209677049))) | 3998272) * 217) + (((~((-209677049) | i2)) | (~((-289212232) | identityHashCode))) * 217) + 1358818976, -587468131);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5039;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.FingerOutput;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -587468131);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5039;
            com.identy.Fpnative.valueOf = objArr;
            return this.FingerOutput;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 105) % 128;
    }

    public String getLocale() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c(~(identityHashCode | 274764164), 113, (((~((~identityHashCode) | 1048417220)) | (~((-773653445) | identityHashCode)) | 388) * (-113)) + ((((~(274764164 | 0)) | 773653444) * 226) - 41024400), -1376569067);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    deduplication = (generateST + 59) % 128;
                    ((long[]) objArr[0])[0] = j + 4953;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.Fpnative;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1376569067);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4953;
            com.identy.Fpnative.valueOf = objArr;
            return this.Fpnative;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 17) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0103, code lost:
    
        return 0.pfkrolfinalizeF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0104, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0105, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0109, code lost:
    
        if (0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010b, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x010c, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (0 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = (int) java.lang.Runtime.getRuntime().maxMemory();
        0 = ~0;
        0 = defpackage.a.c((~(0 | 43275425)) | 42209280, 49, ((((~(0 | (-542164706))) | 43275425) | (~(542164705 | 0))) * (-49)) + ((((~(43275425 | 0)) | (-584373986)) * 98) + 1241180500), 384144782);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001c, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0092, code lost:
    
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 21) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x009a, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = new java.lang.Object[1];
        d((short) 185, (byte) (-$$a[11]), (byte) (-$$a[62]), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) 154, (byte) (-$$a[111(0x6f, float:1.56E-43)]), $$a[63], 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, 384144782);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00e8, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 13) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00f6, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4926;
        com.identy.Fpnative.valueOf = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getOutputHeight() {
        Object[] objArr;
        int i = generateST + 95;
        deduplication = i % 128;
        if (i % 2 != 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i2 = 89 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    public int getOutputWidth() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (deduplication + 97) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~((~((int) Process.getStartUptimeMillis())) | (-333842693));
                    int c = defpackage.a.c(i | 536900160, 970, (((-870742853) | i) * (-970)) + 884766797, 650866679);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4928;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.pfk;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 650866679);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4928;
            com.identy.Fpnative.valueOf = objArr;
            return this.pfk;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        int i4 = (generateST + 87) % 128;
        deduplication = i4;
        generateST = (i4 + 55) % 128;
    }

    public HashMap<Finger, Integer> getQcthresolds() {
        Object[] objArr;
        long j;
        int i = generateST + 79;
        deduplication = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i2 = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | 226288773)) | 268634426 | (~(i2 | (-222322694))), 369, (((~((-226288774) | i2)) | 272600506) * (-369)) + (((494923199 | i2) * (-369)) - 94560498), -1569644865);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5036;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.getAttempts;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1569644865);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5036;
            com.identy.Fpnative.valueOf = objArr;
            return this.getAttempts;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        int i5 = generateST;
        deduplication = (i5 + 41) % 128;
        deduplication = (i5 + 33) % 128;
    }

    public int getQualityMaxRetries() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (deduplication + 5) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i = ~startElapsedRealtime;
                    int c = defpackage.a.c((~(610159898 | i)) | 111270618, 712, (((~(startElapsedRealtime | (-44143297))) | (~(i | 654303194))) * (-712)) + ((((-654303195) | 0) * (-712)) - 2058530601), -1495623676);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4978;
                    com.identy.Fpnative.valueOf = objArr;
                    int i4 = this.isFoundMatchingTemplates;
                    deduplication = (generateST + 15) % 128;
                    return i4;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1495623676);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4978;
            com.identy.Fpnative.valueOf = objArr;
            int i42 = this.isFoundMatchingTemplates;
            deduplication = (generateST + 15) % 128;
            return i42;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = (int) android.os.SystemClock.uptimeMillis();
        0 = ((((~((-760452717) | 0)) | 219350060) | (~((-261563437) | 0))) * (-754)) - 1995044639;
        0 = ~((-219350061) | 0);
        0 = ~0;
        0 = defpackage.a.c(0 | (-760452717), 754, ((0 | (~((-42213377) | 0))) * (-754)) + 0, -1290200769);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getQualityMinRetries() {
        long j;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = deduplication + 7;
                generateST = i % 128;
                if (i % 2 == 0) {
                    long j2 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4852;
                com.identy.Fpnative.valueOf = null;
                return this.ERRORS;
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -1290200769);
            j = ((long[]) objArr4[0])[0];
            deduplication = (generateST + 3) % 128;
            ((long[]) objArr4[0])[0] = j + 4852;
            com.identy.Fpnative.valueOf = objArr4;
            return this.ERRORS;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer getQualityTriesCounter(FingerDetectionMode fingerDetectionMode) {
        Object[] objArr;
        long j;
        int i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | 230966284)) | 267922995, 272, (((~((-230966285) | identityHashCode)) | 278540) * (-272)) + ((((~((-230687745) | (~identityHashCode))) | (~(268201535 | identityHashCode))) * (-272)) - 963401521), 1015469051);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    generateST = (deduplication + 77) % 128;
                    ((long[]) objArr[0])[0] = j + 4961;
                    com.identy.Fpnative.valueOf = objArr;
                    if (this.setFoundMatchingTemplates.containsKey(fingerDetectionMode)) {
                        int i4 = ((int[]) objArr[1])[0];
                        int i5 = i4 * i4;
                        int i6 = -(1820970985 * i4);
                        int i7 = (i5 ^ i6) + ((i5 & i6) << 1);
                        int i8 = -(i4 * 1468403975);
                        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                        int i10 = (i9 ^ (-395233216)) + (((-395233216) & i9) << 1);
                        int i11 = i10 >> 25;
                        int i12 = ((i11 ^ (-255)) + ((i11 & (-255)) << 1)) / 128;
                        int i13 = ((i12 | 1) << 1) - (i12 ^ 1);
                        int i14 = ((i10 | i13) << 1) - (i13 ^ i10);
                        int i15 = i10 >> 17;
                        int i16 = (((i15 | (-65535)) << 1) - (i15 ^ (-65535))) / 32768;
                        int i17 = -(((i16 & 1) + (i16 | 1)) ^ i14);
                        int i18 = (i17 & 7) + (i17 | 7);
                        int i19 = i18 >> 22;
                        int i20 = (((i19 | (-2047)) << 1) - (i19 ^ (-2047))) / 1024;
                        int i21 = (i20 ^ 1) + ((i20 & 1) << 1);
                        i = 0 / (((-((i21 & 1) + (i21 | 1))) & i18) * 1632);
                    } else {
                        i = ((Integer) this.setFoundMatchingTemplates.get(fingerDetectionMode)).intValue();
                    }
                    return Integer.valueOf(i);
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1015469051);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4961;
            com.identy.Fpnative.valueOf = objArr;
            if (this.setFoundMatchingTemplates.containsKey(fingerDetectionMode)) {
            }
            return Integer.valueOf(i);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 5) % 128;
    }

    public List<Pair<Hand, Finger>> getSelectedFingers() {
        Object[] objArr;
        long j;
        int i = (deduplication + 61) % 128;
        generateST = i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (i + 123) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i2 = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | (-538619293))) | (~(i2 | (-39730013))), 333, (((~((-538619293) | i2)) | (~(identityHashCode | (-39730013)))) * 333) + 1182099367, 1175882325);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4917;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.configureroll;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1175882325);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4917;
            com.identy.Fpnative.valueOf = objArr;
            return this.configureroll;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 87) % 128;
    }

    public int getSpoofMaxRetries() {
        Object[] objArr;
        long j;
        int i = deduplication + 35;
        generateST = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-1072878853))) | 573989572, 318, (((~(1072878852 | identityHashCode)) | (-1073149893)) * (-318)) + (((~((-499160321) | identityHashCode)) | (~((~identityHashCode) | (-271041)))) * (-318)) + 780740241, 1947950987);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4870;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.Enroll4FActivity;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1947950987);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4870;
            com.identy.Fpnative.valueOf = objArr;
            return this.Enroll4FActivity;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 43) % 128;
    }

    public int getSpoofMinRetries() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~((~identityHashCode) | (-221034614))) | 136849461, 191, (((~(identityHashCode | (-221034614))) | 719923893) * 191) + 1164441065, 877187135);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    deduplication = (generateST + 23) % 128;
                    ((long[]) objArr[0])[0] = j + 4984;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.Enroll2TActivity;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 877187135);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4984;
            com.identy.Fpnative.valueOf = objArr;
            return this.Enroll2TActivity;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 77) % 128;
    }

    public IdentyUser getTempUser() {
        Object[] objArr;
        long j;
        generateST = (deduplication + 75) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int freeMemory = (int) Runtime.getRuntime().freeMemory();
                    int i = ~(1072164846 | freeMemory);
                    int c = defpackage.a.c(~((~freeMemory) | 1072164846), 476, (i * 952) + ((2122286 | i) * (-476)) + 758456363, -1650309639);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4912;
                    com.identy.Fpnative.valueOf = objArr;
                    IdentyUser tempUser = IdentyUserManager.getInstance(this.getData).getTempUser(IdentyUserManager.getTUser());
                    deduplication = (generateST + 3) % 128;
                    return tempUser;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1650309639);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4912;
            com.identy.Fpnative.valueOf = objArr;
            IdentyUser tempUser2 = IdentyUserManager.getInstance(this.getData).getTempUser(IdentyUserManager.getTUser());
            deduplication = (generateST + 3) % 128;
            return tempUser2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 81) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = defpackage.a.c((~(((int) android.os.Process.getStartElapsedRealtime()) | 590083768)) | 91194488, 529, (((~((~0) | 590083768)) | 71565376) * 529) - 1876653424, 220873416);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UIAfterCaptures getUitype() {
        long j;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = generateST + 85;
                deduplication = i % 128;
                if (i % 2 != 0) {
                    long j2 = ((long[]) objArr[1])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4977;
                com.identy.Fpnative.valueOf = null;
                return this.destroy;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 220873416);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4977;
            com.identy.Fpnative.valueOf = objArr4;
            return this.destroy;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 63) % 128;
    }

    public WSQCompression getWSQCompression() {
        Object[] objArr;
        long j;
        generateST = (deduplication + 113) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = (int) Runtime.getRuntime().totalMemory();
                    int i2 = ~i;
                    int i3 = (~((-909790974) | i2)) | 637665856;
                    int c = defpackage.a.c((~(i | (-138776577))) | (~(i2 | (-272125118))), 502, ((i3 | 0) * (-502)) - 1515398209, -597946414);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 5001;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.Attempt;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -597946414);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5001;
            com.identy.Fpnative.valueOf = objArr;
            return this.Attempt;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 99) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0050, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c(~((~0) | (-33622081)), -948, (((~((-193144955) | 0)) | (-305744326)) * (-948)) + 1128867971, -1125117187);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FingerAS h() {
        long j;
        int i = deduplication;
        generateST = (i + 89) % 128;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = i + 11;
                generateST = i2 % 128;
                if (i2 % 2 == 0) {
                    long j2 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4963;
                com.identy.Fpnative.valueOf = null;
                return this.Action;
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -221287047);
            j = ((long[]) objArr4[0])[0];
            deduplication = (generateST + 7) % 128;
            ((long[]) objArr4[0])[0] = j + 4963;
            com.identy.Fpnative.valueOf = objArr4;
            return this.Action;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ef, code lost:
    
        if (0.setFoundMatchingTemplates.containsKey(0) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f1, code lost:
    
        0 = ((java.lang.Integer) 0.setFoundMatchingTemplates.get(0)).intValue();
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 71) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0107, code lost:
    
        0 = ((int[]) $$a_state[1])[0];
        0 = 0 * 0;
        0 = -(577182738 * 0);
        0 = ((0 | 0) << 1) - (0 ^ 0);
        0 = -(0 * 256938680);
        0 = (0 ^ 0) + ((0 & 0) << 1);
        0 = (0 & 738774489) + (738774489 | 0);
        0 = 0 >> 23;
        0 = ((0 & (-1023)) + (0 | (-1023))) / kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE;
        0 = (0 ^ 1) + ((0 & 1) << 1);
        0 = (0 & 0) + (0 | 0);
        0 = 0 >> 15;
        0 = ((0 & (-262143)) + (0 | (-262143))) / 131072;
        0 = -(((0 & 1) + (0 | 1)) ^ 0);
        0 = (0 ^ 1) + ((0 & 1) << 1);
        0 = ((0 >> 27) - 63) / 32;
        0 = (0 & 1) + (0 | 1);
        0 = (90 / (((-((0 ^ 1) + ((0 & 1) << 1))) & 0) * 90)) + 0;
        0.setFoundMatchingTemplates.put(0, java.lang.Integer.valueOf(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0176, code lost:
    
        return java.lang.Integer.valueOf(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0106, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0177, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0178, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x017c, code lost:
    
        if (0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x017e, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x017f, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001d, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
    
        if (0 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = (int) android.os.Process.getStartElapsedRealtime();
        0 = defpackage.a.c((~(0 | (-19400863))) | ((~((-518290143) | 0)) | 2099358), -69, (((~((-516190785) | 0)) | (~((-17301505) | 0))) * 69) - 1055137040, -656555536);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001b, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x008d, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = (byte) (-$$a[11]);
        0 = new java.lang.Object[1];
        d((short) 88, 0, (byte) (0 + 4), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) (-$$a[24]), $$a[63], $$a[116(0x74, float:1.63E-43)], 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, 1939529739);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00d8, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00de, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4910;
        com.identy.Fpnative.valueOf = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer incrementQualityTriesCounter(FingerDetectionMode fingerDetectionMode) {
        Object[] objArr;
        int i = generateST + 113;
        deduplication = i % 128;
        if (i % 2 != 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i2 = 31 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f7, code lost:
    
        return 0.EnrollThumbActivity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f8, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f9, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fd, code lost:
    
        if (0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ff, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0100, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        com.identy.IdentySdk.deduplication = (0 + 29) % 128;
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (0 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = defpackage.a.a();
        0 = ~0;
        0 = ~(537978563 | 0);
        0 = defpackage.a.c(0 | 39089283, 712, (((~(0 | (-38014977))) | (~(0 | 575993539))) * (-712)) + ((((-575993540) | 0) * (-712)) + 1943442631), -874555431);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001c, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x008f, code lost:
    
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 65) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0097, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = (byte) (-$$a[11]);
        0 = new java.lang.Object[1];
        d((short) 88, 0, (byte) (0 + 4), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) (-$$a[24]), $$a[63], $$a[116(0x74, float:1.63E-43)], 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, -874555431);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00e4, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ea, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4966;
        com.identy.Fpnative.valueOf = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isAllowTabletLandscape() {
        Object[] objArr;
        int i = deduplication + 23;
        int i2 = i % 128;
        generateST = i2;
        if (i % 2 == 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i3 = 83 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x015b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isCompatible() {
        Object[] objArr;
        long j;
        double d;
        int e;
        generateST = (deduplication + 117) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~defpackage.a.a()) | 677731192)) | 541397568, 495, (0 * 495) - 1204934034, 1285194678);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4962;
                    com.identy.Fpnative.valueOf = objArr;
                    ActivityManager activityManager = (ActivityManager) this.getData.getSystemService("activity");
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    d = memoryInfo.totalMem;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(81472807 * i3);
                    int i6 = (i4 & i5) + (i4 | i5);
                    int i7 = -(i3 * 1324929563);
                    int i8 = (i6 & i7) + (i7 | i6);
                    int i9 = (i8 ^ (-464247999)) + (((-464247999) & i8) << 1);
                    int e2 = IdentyB.e(i9 >> 16, 131071, 65536, -1);
                    int i10 = (i9 & e2) + (e2 | i9);
                    int i11 = i9 >> 17;
                    int i12 = (((i11 | (-65535)) << 1) - (i11 ^ (-65535))) / 32768;
                    int i13 = -((((i12 | 1) << 1) - (i12 ^ 1)) ^ i10);
                    e = IdentyB.e(((i13 ^ 7) + ((i13 & 7) << 1)) >> 21, 4095, 2048, -1);
                    if (d / ((1034091366 / (((-((e ^ 1) + ((e & 1) << 1))) & 0) * 31)) + 1.043810602E9d) > 2.0d) {
                        return false;
                    }
                    generateST = (deduplication + 111) % 128;
                    return true;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1285194678);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4962;
            com.identy.Fpnative.valueOf = objArr;
            ActivityManager activityManager2 = (ActivityManager) this.getData.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            activityManager2.getMemoryInfo(memoryInfo2);
            d = memoryInfo2.totalMem;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(81472807 * i32);
            int i62 = (i42 & i52) + (i42 | i52);
            int i72 = -(i32 * 1324929563);
            int i82 = (i62 & i72) + (i72 | i62);
            int i92 = (i82 ^ (-464247999)) + (((-464247999) & i82) << 1);
            int e22 = IdentyB.e(i92 >> 16, 131071, 65536, -1);
            int i102 = (i92 & e22) + (e22 | i92);
            int i112 = i92 >> 17;
            int i122 = (((i112 | (-65535)) << 1) - (i112 ^ (-65535))) / 32768;
            int i132 = -((((i122 | 1) << 1) - (i122 ^ 1)) ^ i102);
            e = IdentyB.e(((i132 ^ 7) + ((i132 & 7) << 1)) >> 21, 4095, 2048, -1);
            if (d / ((1034091366 / (((-((e ^ 1) + ((e & 1) << 1))) & 0) * 31)) + 1.043810602E9d) > 2.0d) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean isCustomSDK() {
        Object[] objArr;
        long j;
        generateST = (deduplication + 73) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int c = defpackage.a.c((~(elapsedCpuTime | (-33234772))) | 29430336, 116, ((465654508 | elapsedCpuTime) * 116) + (((~((~elapsedCpuTime) | 469458943)) * (-116)) - 1537692237), 297710465);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    deduplication = (generateST + 29) % 128;
                    ((long[]) objArr[0])[0] = j + 4906;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.CapturePosition;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 297710465);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4906;
            com.identy.Fpnative.valueOf = objArr;
            return this.CapturePosition;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0188, code lost:
    
        return 0.equalsIgnoreCase("3,DEMO".substring(5624 / (((-((0 & 1) + (0 | 1))) & 0) * 1406)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0189, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x018a, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x018e, code lost:
    
        if (0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0190, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0191, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        0 = 0 + 19;
        com.identy.IdentySdk.deduplication = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0025, code lost:
    
        if ((0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
    
        0 = ((long[]) $$a_state[0])[1];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, new java.lang.Object[1])).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (0 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = (int) java.lang.Runtime.getRuntime().maxMemory();
        0 = ~0;
        0 = defpackage.a.c(((~(0 | (-209024256))) | 4486208) | (~(0 | 494403071)), 521, ((289865024 | 0) * 521) + ((((~(0 | 289865024)) | 209024255) * (-1042)) + 1330521590), 1479006954);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (0 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x001c, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00b5, code lost:
    
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 87) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00bd, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = new java.lang.Object[1];
        d((short) 185, (byte) (-$$a[11]), (byte) (-$$a[62]), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) 154, (byte) (-$$a[111(0x6f, float:1.56E-43)]), $$a[63], 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, 1479006954);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x010b, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0111, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4990;
        com.identy.Fpnative.valueOf = null;
        0 = 0.addTemplates;
        0 = ((int[]) $$a_state[1])[0];
        0 = ((0 * 0) - (~(-(65286046 * 0)))) - 1;
        0 = -(0 * (-454904652));
        0 = (0 & 0) + (0 | 0);
        0 = (0 & (-1499559279)) + ((-1499559279) | 0);
        0 = 0 >> 18;
        0 = ((0 ^ (-32767)) + ((0 & (-32767)) << 1)) / 16384;
        0 = (0 ^ 1) + ((0 & 1) << 1);
        0 = (0 ^ 0) + ((0 & 0) << 1);
        0 = 0 >> 25;
        0 = (((0 | (-255)) << 1) - (0 ^ (-255))) / 128;
        0 = -((((0 | 1) << 1) - (0 ^ 1)) ^ 0);
        0 = (0 ^ 2) + ((0 & 2) << 1);
        0 = ((0 >> 26) - 127) / 64;
        0 = (0 ^ 1) + ((0 & 1) << 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isDemoMode() {
        Object[] objArr;
        int i = deduplication + 5;
        int i2 = i % 128;
        generateST = i2;
        if (i % 2 == 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i3 = 82 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (0 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (0 <= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = ((((~((-615185215) | 0)) | 536900352) | (~(116295934 | 0))) * (-880)) + 1434790607;
        0 = (~((-615185215) | (~0))) | (-116295935);
        0 = ~(0 | 615185214);
        0 = defpackage.a.c(0, 880, ((0 | 0) * (-880)) + 0, -205658018);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
        0 = com.identy.IdentySdk.deduplication + 41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isDisableOuterBox() {
        long j;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = generateST + 99;
                deduplication = i % 128;
                if (i % 2 != 0) {
                    long j2 = ((long[]) objArr[1])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                generateST = 0 % 128;
                ((long[]) $$a_state[0])[0] = j + 4910;
                com.identy.Fpnative.valueOf = null;
                return this.toString;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -205658018);
            j = ((long[]) objArr4[0])[0];
            int i2 = deduplication + 83;
            generateST = i2 % 128;
            ((long[]) objArr4[0])[0] = j + 4910;
            com.identy.Fpnative.valueOf = objArr4;
            return this.toString;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 37) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f9, code lost:
    
        return 0.Capture4FActivity;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00fa, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00fb, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ff, code lost:
    
        if (0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0101, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0102, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        com.identy.IdentySdk.generateST = (0 + 33) % 128;
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (0 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = android.os.Process.myPid();
        0 = (~((-433245951) | 0)) | 29393472;
        0 = ~((~0) | 469495807);
        0 = defpackage.a.c((~(0 | (-403852479))) | 0, 470, ((0 | 0) * (-470)) + 1428919231, 373493212);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001c, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0089, code lost:
    
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 121) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0091, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = new java.lang.Object[1];
        d((short) 149, (byte) (-$$a[11]), (byte) (-$$a[111(0x6f, float:1.56E-43)]), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) 106, $$a[63], (byte) (-$$a[55]), 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, 373493212);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00de, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 117) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00ec, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4925;
        com.identy.Fpnative.valueOf = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isDisplayMoveNextDialog() {
        Object[] objArr;
        int i = deduplication;
        int i2 = i + 103;
        generateST = i2 % 128;
        if (i2 % 2 == 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i3 = 52 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    public boolean isDisplayPrints() {
        Object[] objArr;
        long j;
        int i = deduplication + 33;
        generateST = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | 533200638)) | 33556670, 446, (((~((~identityHashCode) | 33934014)) | 499266624) * 446) + 1332570237, -1866554221);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    deduplication = (generateST + 97) % 128;
                    ((long[]) objArr[0])[0] = j + 4956;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.uxd565jj;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1201169133);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4956;
            com.identy.Fpnative.valueOf = objArr;
            return this.uxd565jj;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 1) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f0, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f1, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f2, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00f6, code lost:
    
        if (0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00f8, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00f9, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (0 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = defpackage.a.c((~((~((int) java.lang.Runtime.getRuntime().totalMemory())) | 477793963)) | (-642616897), 262, (((~(477793963 | 0)) | (-642616897)) * 262) - 1285726773, 2105969858);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001c, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x007f, code lost:
    
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 31) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0087, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = new java.lang.Object[1];
        d((short) 185, (byte) (-$$a[11]), (byte) (-$$a[62]), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) 154, (byte) (-$$a[111(0x6f, float:1.56E-43)]), $$a[63], 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, 2105969858);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00d5, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00db, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4906;
        com.identy.Fpnative.valueOf = null;
        0 = 0.pfkrol;
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 53) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isDisplayTransactionAlerts() {
        Object[] objArr;
        int i = deduplication + 29;
        generateST = i % 128;
        if (i % 2 == 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i2 = 48 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
    
        if (0 <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (0 <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = ~(1073004499 | 0);
        0 = defpackage.a.c((~(0 | (-574115220))) | ((~((-1073004500) | 0)) | 573574547), 407, ((0 | ((~((~0) | 574115219)) | 573574547)) * 407) + ((((-1073545172) | 0) * (-814)) + 1509894921), -48751761);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isElt() {
        long j;
        int i = generateST + 19;
        int i2 = i % 128;
        deduplication = i2;
        if (i % 2 != 0) {
            throw null;
        }
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i3 = i2 + 77;
                generateST = i3 % 128;
                if (i3 % 2 == 0) {
                    long j2 = ((long[]) objArr[1])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4949;
                com.identy.Fpnative.valueOf = null;
                return this.ppk;
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -48751761);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4949;
            com.identy.Fpnative.valueOf = objArr4;
            return this.ppk;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 43) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0101  */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isEnableAllFingerNistTemplate() {
        Object[] objArr;
        long j;
        int i = generateST;
        int i2 = i + 31;
        deduplication = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (i + 45) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i3 = ~(348770349 | identityHashCode);
                    int i4 = ~identityHashCode;
                    int i5 = i3 | (~(847659629 | i4));
                    int i6 = ~((-348770350) | i4);
                    int c = defpackage.a.c(276840493 | i6, 516, (((~(identityHashCode | (-570819137))) | (~(i4 | (-276840494)))) * 516) + ((i5 | i6) * (-516)) + 1616310739, -849504758);
                    int i7 = c ^ (c << 13);
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) objArr[1])[0] = i8 ^ (i8 << 5);
                    ((long[]) objArr[0])[0] = j + 4971;
                    com.identy.Fpnative.valueOf = objArr;
                    if (!this.e.equals(com.identy.Action.CAPTURE)) {
                        deduplication = (generateST + 69) % 128;
                        return this.PngjBadSignature;
                    }
                    int i9 = ((int[]) objArr[1])[0];
                    int i10 = ((i9 * i9) - (~(-(1245870916 * i9)))) - 1;
                    int i11 = -(i9 * (-2034815172));
                    int i12 = ((i10 & i11) + (i11 | i10)) - (-1201901568);
                    int i13 = i12 >> 29;
                    int i14 = (i12 - (~IdentyB.a(i13 ^ (-15), (i13 & (-15)) << 1, 8, -1))) - 1;
                    int i15 = ((i12 >> 23) - 1023) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i16 = -(i14 ^ ((i15 ^ 1) + ((i15 & 1) << 1)));
                    int i17 = (i16 & 8) + (i16 | 8);
                    int i18 = ((i17 >> 22) - 2047) / 1024;
                    int i19 = (i18 & 1) + (i18 | 1);
                    return false;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -849504758);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4971;
            com.identy.Fpnative.valueOf = objArr;
            if (!this.e.equals(com.identy.Action.CAPTURE)) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean isEnableSkip() {
        Object[] objArr;
        long j;
        deduplication = (generateST + 75) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~((-386236439) | identityHashCode);
                    int i2 = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | (-112652842))) | 285278230 | (~(386236438 | i2)), 904, (((~(i2 | 397931071)) | (~((-100958209) | identityHashCode))) * 904) + (((i | (~(112652841 | i2))) * (-1808)) - 1289642201), 1674705348);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    deduplication = (generateST + 91) % 128;
                    ((long[]) objArr[0])[0] = j + 4964;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.toJson;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1674705348);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4964;
            com.identy.Fpnative.valueOf = objArr;
            return this.toJson;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 57) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isEnrolled(FingerDetectionMode[] fingerDetectionModeArr, IdentyUser identyUser) {
        Object[] objArr;
        long j;
        int length;
        int i;
        int i2 = deduplication + 107;
        generateST = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int i3 = ~((-504136769) | startUptimeMillis);
                    int c = defpackage.a.c((~(startUptimeMillis | 517799526)) | (~((~startUptimeMillis) | (-512552039))) | 8415270, 497, ((i3 | (~(0 | 517799526))) * 497) - 1188075984, 1265271303);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    generateST = (deduplication + 107) % 128;
                    ((long[]) objArr[0])[0] = j + 5018;
                    com.identy.Fpnative.valueOf = objArr;
                    length = fingerDetectionModeArr.length;
                    int i6 = ((int[]) objArr[1])[0];
                    int i7 = ((i6 * i6) - (~(-(1581649989 * i6)))) - 1;
                    int i8 = -(i6 * 645999389);
                    int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
                    int i10 = ((i9 | (-1677159327)) << 1) - ((-1677159327) ^ i9);
                    int e = IdentyB.e(i10 >> 28, 31, 16, -1);
                    int i11 = ((i10 | e) << 1) - (e ^ i10);
                    int i12 = i10 >> 16;
                    int i13 = -(IdentyB.a(i12 ^ (-131071), (i12 & (-131071)) << 1, 65536, -1) ^ i11);
                    int i14 = (i13 & 4) + (i13 | 4);
                    int i15 = ((i14 >> 18) - 32767) / 16384;
                    for (i = 0 / (((-(((i15 & 1) + (i15 | 1)) - (-1))) & i14) * 1458); i < length; i++) {
                        for (Map.Entry<Pair<Hand, Finger>, PngjExceptionInternal> entry : com.identy.f.PngjBadSignature.PngjException(this.getData, new FingerDetectionMode[]{fingerDetectionModeArr[i]}, identyUser).entrySet()) {
                            if (this.configureroll.contains(entry.getKey())) {
                                deduplication = (generateST + 77) % 128;
                                if (!entry.getValue().PngjBadCrcException(this.getData, identyUser)) {
                                    return false;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1265271303);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5018;
            com.identy.Fpnative.valueOf = objArr;
            length = fingerDetectionModeArr.length;
            int i62 = ((int[]) objArr[1])[0];
            int i72 = ((i62 * i62) - (~(-(1581649989 * i62)))) - 1;
            int i82 = -(i62 * 645999389);
            int i92 = (i72 ^ i82) + ((i82 & i72) << 1);
            int i102 = ((i92 | (-1677159327)) << 1) - ((-1677159327) ^ i92);
            int e2 = IdentyB.e(i102 >> 28, 31, 16, -1);
            int i112 = ((i102 | e2) << 1) - (e2 ^ i102);
            int i122 = i102 >> 16;
            int i132 = -(IdentyB.a(i122 ^ (-131071), (i122 & (-131071)) << 1, 65536, -1) ^ i112);
            int i142 = (i132 & 4) + (i132 | 4);
            int i152 = ((i142 >> 18) - 32767) / 16384;
            while (i < length) {
            }
            return true;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 67) % 128;
    }

    public boolean isGimages() {
        Object[] objArr;
        long j;
        int i = deduplication;
        int i2 = i + 71;
        generateST = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (i + 47) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int b = defpackage.a.b(1410069717);
                    int c = defpackage.a.c((~(b | (-402654606))) | (~((~b) | (-96098931))) | 95963186, 168, ((~((-135745) | b)) * 168) + ((((~((-402790350) | 0)) | 135744) * 168) - 1710130969), -1766899627);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4901;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.resetAttempt;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1766899627);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4901;
            com.identy.Fpnative.valueOf = objArr;
            return this.resetAttempt;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00e6, code lost:
    
        return 0.CaptureMode;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e7, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00e8, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ec, code lost:
    
        if (0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ee, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ef, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (0 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = defpackage.a.c((~((~java.lang.System.identityHashCode(0)) | 92524537)) | (-406364743), 305, (((~(0 | 92524537)) | (-498855936)) * 305) - 1958702672, -3857954);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001c, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x007d, code lost:
    
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 25) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0085, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = new java.lang.Object[1];
        d((short) 149, (byte) (-$$a[11]), (byte) (-$$a[111(0x6f, float:1.56E-43)]), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) 106, $$a[63], (byte) (-$$a[55]), 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, -3857954);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00d3, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00d9, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4912;
        com.identy.Fpnative.valueOf = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isInlineGuide() {
        Object[] objArr;
        int i = deduplication + 71;
        generateST = i % 128;
        if (i % 2 == 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i2 = 69 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = ~java.lang.System.identityHashCode(0);
        0 = defpackage.a.c((~(0 | (-30636977))) | 1247536, 52, (((~(30636976 | 0)) | ((~((-468252304) | 0)) | 438862863)) * (-52)) + (((~(469499839 | 0)) * 52) + 1780049803), 256620041);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isKidsCapture() {
        long j;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = generateST + 103;
                deduplication = i % 128;
                if (i % 2 != 0) {
                    long j2 = ((long[]) objArr[1])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4870;
                com.identy.Fpnative.valueOf = null;
                String str = this.getShortform;
                int i2 = ((int[]) $$a_state[1])[0];
                int i3 = ((i2 * i2) - (~(-(1035472495 * i2)))) - 1;
                int i4 = -(i2 * 311778337);
                int i5 = (i3 & i4) + (i4 | i3);
                int i6 = (i5 ^ (-776018880)) + (((-776018880) & i5) << 1);
                int i7 = i6 >> 22;
                int a = IdentyB.a(i7 ^ (-2047), (i7 & (-2047)) << 1, 1024, -1);
                int i8 = (i6 ^ a) + ((a & i6) << 1);
                int i9 = i6 >> 24;
                int i10 = -(IdentyB.a(i9 ^ (-511), (i9 & (-511)) << 1, 256, -1) ^ i8);
                int i11 = (i10 ^ 8) + ((i10 & 8) << 1);
                int i12 = i11 >> 18;
                int i13 = (((i12 | (-32767)) << 1) - (i12 ^ (-32767))) / 16384;
                int i14 = ((i13 | 1) << 1) - (i13 ^ 1);
                return "8|27|15|15|kid".substring(139304 / (((-((i14 ^ 1) + ((i14 & 1) << 1))) & i11) * 1583)).equals(str);
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 256620041);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4870;
            com.identy.Fpnative.valueOf = objArr4;
            String str2 = this.getShortform;
            int i22 = ((int[]) objArr4[1])[0];
            int i32 = ((i22 * i22) - (~(-(1035472495 * i22)))) - 1;
            int i42 = -(i22 * 311778337);
            int i52 = (i32 & i42) + (i42 | i32);
            int i62 = (i52 ^ (-776018880)) + (((-776018880) & i52) << 1);
            int i72 = i62 >> 22;
            int a2 = IdentyB.a(i72 ^ (-2047), (i72 & (-2047)) << 1, 1024, -1);
            int i82 = (i62 ^ a2) + ((a2 & i62) << 1);
            int i92 = i62 >> 24;
            int i102 = -(IdentyB.a(i92 ^ (-511), (i92 & (-511)) << 1, 256, -1) ^ i82);
            int i112 = (i102 ^ 8) + ((i102 & 8) << 1);
            int i122 = i112 >> 18;
            int i132 = (((i122 | (-32767)) << 1) - (i122 ^ (-32767))) / 16384;
            int i142 = ((i132 | 1) << 1) - (i132 ^ 1);
            return "8|27|15|15|kid".substring(139304 / (((-((i142 ^ 1) + ((i142 & 1) << 1))) & i112) * 1583)).equals(str2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 49) % 128;
    }

    public boolean isRolledfp() {
        Object[] objArr;
        long j;
        deduplication = (generateST + 21) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int i2 = (((~(52356707 | i)) | 411109788) * (-1188)) + 1676006219;
                    int i3 = (~(identityHashCode | (-52356708))) | 411109788;
                    int i4 = ~(446532572 | i);
                    int c = defpackage.a.c((~(i | (-52356708))) | 16933923 | i4, 594, ((i3 | i4) * 594) + i2, -1407188725);
                    int i5 = c ^ (c << 13);
                    int i6 = i5 ^ (i5 >>> 17);
                    ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
                    ((long[]) objArr[0])[0] = j + 4853;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.pfkrolGetQuality;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1407188725);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4853;
            com.identy.Fpnative.valueOf = objArr;
            return this.pfkrolGetQuality;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 69) % 128;
    }

    public CaptureMode k() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (deduplication + 37) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~System.identityHashCode(this)) | 979266001)) | 576587840, 495, (0 * 495) - 1444249490, 1246483723);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    generateST = (deduplication + 11) % 128;
                    ((long[]) objArr[0])[0] = j + 4877;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.CaptureThumbActivity;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1246483723);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4877;
            com.identy.Fpnative.valueOf = objArr;
            return this.CaptureThumbActivity;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 27) % 128;
    }

    public LManager m() {
        Object[] objArr;
        long j;
        deduplication = (generateST + 53) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int maxMemory = (int) Runtime.getRuntime().maxMemory();
                    int c = defpackage.a.c((~(maxMemory | 853406698)) | (~((~maxMemory) | (-810931179))) | 269566378, 168, ((~((-541364801) | maxMemory)) * 168) + ((((~(312041898 | 0)) | 541364800) * 168) - 1710130969), 2100614122);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4953;
                    com.identy.Fpnative.valueOf = objArr;
                    LManager lManager = this.PngjBadCrcException;
                    generateST = (deduplication + 95) % 128;
                    return lManager;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2100614122);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4953;
            com.identy.Fpnative.valueOf = objArr;
            LManager lManager2 = this.PngjBadCrcException;
            generateST = (deduplication + 95) % 128;
            return lManager2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 75) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f4, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4878;
        com.identy.Fpnative.valueOf = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00ff, code lost:
    
        if (0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0101, code lost:
    
        if (0 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0103, code lost:
    
        0 = com.identy.IdentySdk.generateST + 105;
        com.identy.IdentySdk.deduplication = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x010d, code lost:
    
        if ((0 % 2) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x010f, code lost:
    
        0 = com.identy.enums.Template.NIST_ITL_1_2015_RECORD_9;
        0 = 67 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0119, code lost:
    
        if (0.equals(0) == true) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x02d3, code lost:
    
        throw new java.lang.Exception("Template type is not valid ".concat(java.lang.String.valueOf(0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0124, code lost:
    
        0 = com.identy.IdentySdk.generateST + 5;
        com.identy.IdentySdk.deduplication = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x012e, code lost:
    
        if ((0 % 2) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0130, code lost:
    
        0 = com.identy.enums.Template.NIST_ITL_1_2015_RECORD_14;
        0 = 87 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x013a, code lost:
    
        if (0.equals(0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x014a, code lost:
    
        if ((!0.equals(0)) != true) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x014c, code lost:
    
        0 = com.identy.IdentySdk.deduplication + 75;
        com.identy.IdentySdk.generateST = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0156, code lost:
    
        if ((0 % 2) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x015c, code lost:
    
        if (0.equals(0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x015e, code lost:
    
        0.e = com.identy.Action.MATCH_WITH_TEMPLATE;
        0 = new java.lang.StringBuilder();
        0.append(0.e);
        0.append("_");
        0.append(0);
        0.append("_");
        0.append(0);
        PngjBadCrcException(0.toString());
        0 = com.identy.Fpnative.match(com.identy.e1.PngjException(0.getData), 0.ordinal(), com.identy.e.valueOf.PngjException(0), 0.ordinal(), com.identy.e.valueOf.PngjException(0), 0.PngjOutputException.ordinal(), com.identy.Position.getFromHandFinger(new android.util.Pair(0, 0)).ordinal());
        0.getScore();
        0.h.put(0, new java.util.HashMap());
        0 = (java.util.Map) 0.h.get(0);
        0 = new java.util.ArrayList();
        0 = new com.identy.getCaptureTime(0, 0, new java.util.Date(), new java.util.HashMap(), 0.0d, 0, (float) 0.getScore(), 0, 0.0f, false, null, com.karumi.dexter.BuildConfig.FLAVOR, 0, 0, 0, new com.identy.PngBadCharsetException(), 0, 0, com.identy.enums.FingerDetectionMode.L4F, com.identy.com.identy.FingerAS.NONE);
        0.PngjOutputException = 0;
        0.put(0, 0);
        0 = new com.identy.VerifyIdentyResponse(0.h, 0.e, 0.isQualityFailed, 0.Attempt, 0.getPadSub1, 0.getQualityScore, 0.values, 0.getData, 0.i);
        0 = 0.h;
        0 = 0.getPadSub2;
        0 = ((int[]) $$a_state[1])[0];
        0 = 0 * 0;
        0 = -(1320108001 * 0);
        0 = (0 ^ 0) + ((0 & 0) << 1);
        0 = -(0 * (-1716077197));
        0 = ((0 & 0) + (0 | 0)) - 2017605404;
        0 = ((0 >> 18) - 32767) / 16384;
        0 = (0 - (~((0 ^ 1) + ((0 & 1) << 1)))) - 1;
        0 = 0 >> 24;
        0 = ((0 & (-511)) + (0 | (-511))) / 256;
        0 = -(0 ^ (((0 | 1) << 1) - (0 ^ 1)));
        0 = (0 ^ 3) + ((0 & 3) << 1);
        0 = 0 >> 18;
        0 = (((0 | (-32767)) << 1) - (0 ^ (-32767))) / 16384;
        0.fillPrintsInfo(0, 0, false, 2838 / (((-((((0 | 1) << 1) - (0 ^ 1)) + 1)) & 0) * 946), new java.util.ArrayList(), new com.identy.IdentySdk.PngjInputException(0, 0));
        0 = com.identy.IdentySdk.generateST + 25;
        com.identy.IdentySdk.deduplication = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02b9, code lost:
    
        if ((0 % 2) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02bb, code lost:
    
        0 = 32 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02bf, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x02c0, code lost:
    
        0.equals(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x02c3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013d, code lost:
    
        0 = com.identy.enums.Template.NIST_ITL_1_2015_RECORD_14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0143, code lost:
    
        if (0.equals(0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011c, code lost:
    
        0 = com.identy.enums.Template.NIST_ITL_1_2015_RECORD_9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0122, code lost:
    
        if (0.equals(0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02e1, code lost:
    
        throw new java.lang.Exception(0.getData.getString(com.identy.R.string.template_type_is_unknown));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02e2, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02e3, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02e7, code lost:
    
        if (0 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02e9, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x02ea, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x002d, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0045, code lost:
    
        if (0 > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0048, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = 2;
        0 = ~0;
        0 = defpackage.a.c((~(0 | (-132263))) | ((~(0 | 499287782)) | (-499554023)), 140, ((132262 | (~((-398503) | 0))) * (-280)) + (((0 | (-398503)) * 140) + 1791282863), 635268508);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002b, code lost:
    
        if (0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
    
        0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x009f, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = new java.lang.Object[1];
        d((short) 185, (byte) (-$$a[11]), (byte) (-$$a[62]), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) 154, (byte) (-$$a[111(0x6f, float:1.56E-43)]), $$a[63], 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, 635268508);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ed, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009c, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void matchWithTemplates(Hand hand, Finger finger, Template template, String str, Template template2, String str2) {
        Object[] objArr;
        int i = generateST + 69;
        deduplication = i % 128;
        if (i % 2 != 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i2 = 6 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    public void matchWithTemplatesMultiplebase64(Template template, HashMap<Pair<Hand, Finger>, String> hashMap, Template template2, HashMap<Pair<Hand, Finger>, String> hashMap2) {
        Object[] objArr;
        long j;
        Finger finger;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myPid = Process.myPid();
                    int i = ~myPid;
                    int c = defpackage.a.c((~(myPid | 262140415)) | (~((-261943391) | i)) | 236748864, 676, ((25194526 | (~(236945889 | i))) * 676) + (((-25194527) | myPid) * (-676)) + 780447787, 1093565825);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5043;
                    com.identy.Fpnative.valueOf = objArr;
                    if (template != null || template2 == null) {
                        throw new UnSupportedTemplateException();
                    }
                    Template template3 = Template.NIST_ITL_1_2015_RECORD_9;
                    if (!template.equals(template3)) {
                        Template template4 = Template.NIST_ITL_1_2015_RECORD_14;
                        if (!template.equals(template4) && !template2.equals(template3) && !template2.equals(template4)) {
                            if (hashMap != null) {
                                int i4 = deduplication;
                                generateST = (i4 + 5) % 128;
                                if (hashMap2 != null) {
                                    generateST = (i4 + 67) % 128;
                                    if (hashMap.size() != 0 && hashMap2.size() != 0) {
                                        this.e = com.identy.Action.MATCH_WITH_TEMPLATE;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(this.e);
                                        int i5 = ((int[]) objArr[1])[0];
                                        int i6 = i5 * i5;
                                        int i7 = -(89156308 * i5);
                                        int i8 = (i6 ^ i7) + ((i6 & i7) << 1);
                                        int i9 = -(i5 * (-1118968834));
                                        int i10 = (((i8 | i9) << 1) - (i9 ^ i8)) - 354473711;
                                        int i11 = ((i10 >> 25) - 255) / 128;
                                        int i12 = (i10 - (~((i11 & 1) + (i11 | 1)))) - 1;
                                        int i13 = i10 >> 20;
                                        int i14 = -(i12 ^ IdentyB.e((i13 | (-8191)) << 1, i13 ^ (-8191), ConstantsKt.DEFAULT_BLOCK_SIZE, -1));
                                        int i15 = (i14 ^ 6) + ((i14 & 6) << 1);
                                        int i16 = i15 >> 15;
                                        int i17 = ((i16 ^ (-262143)) + ((i16 & (-262143)) << 1)) / 131072;
                                        int i18 = (i17 & 1) + (i17 | 1);
                                        sb.append("22|_".substring(30906 / (((-((i18 ^ 1) + ((i18 & 1) << 1))) & i15) * 1717)));
                                        sb.append(template);
                                        sb.append("_");
                                        sb.append(template2);
                                        PngjBadCrcException(sb.toString());
                                        HashMap hashMap3 = new HashMap();
                                        HashMap hashMap4 = new HashMap();
                                        for (Position position : Position.values()) {
                                            generateST = (deduplication + 69) % 128;
                                            Hand hand = position.a;
                                            if (hand != null && (finger = position.b) != null && hashMap.containsKey(new Pair(hand, finger)) && hashMap2.containsKey(new Pair(hand, finger))) {
                                                String str = (String) IdentyB.b(hand, finger, hashMap);
                                                String str2 = (String) IdentyB.b(hand, finger, hashMap2);
                                                if (str != null && !str.isEmpty()) {
                                                    int i19 = generateST;
                                                    deduplication = (i19 + 37) % 128;
                                                    if (str2 != null) {
                                                        int i20 = i19 + 41;
                                                        deduplication = i20 % 128;
                                                        if (i20 % 2 != 0) {
                                                            int i21 = 50 / 0;
                                                            if (str2.isEmpty()) {
                                                            }
                                                            hashMap3.put(Integer.valueOf(position.ordinal()), Base64.decode(str.getBytes(), this.isQualityFailed));
                                                            hashMap4.put(Integer.valueOf(position.ordinal()), Base64.decode(str2.getBytes(), this.isQualityFailed));
                                                        } else {
                                                            if (str2.isEmpty()) {
                                                            }
                                                            hashMap3.put(Integer.valueOf(position.ordinal()), Base64.decode(str.getBytes(), this.isQualityFailed));
                                                            hashMap4.put(Integer.valueOf(position.ordinal()), Base64.decode(str2.getBytes(), this.isQualityFailed));
                                                        }
                                                    }
                                                }
                                                throw new Exception("templates are empty");
                                            }
                                        }
                                        VerifyResult matchMultiple2 = com.identy.Fpnative.matchMultiple(com.identy.e1.PngjException(this.getData), template.ordinal(), hashMap3, template2.ordinal(), hashMap4, this.PngjOutputException.ordinal());
                                        ArrayList arrayList = new ArrayList();
                                        HashMap hashMap5 = new HashMap();
                                        deduplication = (generateST + 15) % 128;
                                        for (Map.Entry<Pair<Hand, Finger>, String> entry : hashMap.entrySet()) {
                                            generateST = (deduplication + 125) % 128;
                                            Hand hand2 = (Hand) entry.getKey().first;
                                            Finger finger2 = (Finger) entry.getKey().second;
                                            if (!this.h.containsKey(hand2)) {
                                                this.h.put(hand2, new HashMap());
                                            }
                                            Map map = (Map) this.h.get(hand2);
                                            VerifyResult verifyResult = matchMultiple2;
                                            getCaptureTime getcapturetime = new getCaptureTime(hand2, finger2, new Date(), hashMap5, 0.0d, verifyResult, matchMultiple2.getFingerScore(entry.getKey()), 0, 0.0f, false, null, BuildConfig.FLAVOR, 0L, 0L, 0L, new PngBadCharsetException(), 0, 0, FingerDetectionMode.L4F, com.identy.FingerAS.NONE);
                                            getcapturetime.PngjOutputException = arrayList;
                                            map.put(finger2, getcapturetime);
                                            matchMultiple2 = verifyResult;
                                        }
                                        VerifyIdentyResponse verifyIdentyResponse = new VerifyIdentyResponse(this.h, this.e, this.isQualityFailed, this.Attempt, this.getPadSub1, this.getQualityScore, this.values, this.getData, this.i, true);
                                        verifyIdentyResponse.fillPrintsInfo(this.h, this.getPadSub2, false, true, new ArrayList<>(), new valueOf(verifyIdentyResponse));
                                        return;
                                    }
                                }
                            }
                            throw new Exception("No templates to match");
                        }
                    }
                    throw new Exception("Template type is not valid ".concat(String.valueOf(template)));
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1093565825);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5043;
            com.identy.Fpnative.valueOf = objArr;
            if (template != null) {
            }
            throw new UnSupportedTemplateException();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        deduplication = (generateST + 101) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x011c, code lost:
    
        if (0 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0121, code lost:
    
        0 = com.identy.IdentySdk.deduplication + 69;
        com.identy.IdentySdk.generateST = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x012b, code lost:
    
        if ((0 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0131, code lost:
    
        if (0.equals(0) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0133, code lost:
    
        0.e = com.identy.Action.MATCH_WITH_TEMPLATE;
        0 = new java.lang.StringBuilder();
        0.append(0.e);
        0.append("_");
        0.append(0);
        0.append("_");
        0.append(0);
        PngjBadCrcException(0.toString());
        0 = com.identy.Fpnative.match(com.identy.e1.PngjException(0.getData), 0.ordinal(), android.util.Base64.decode(0.getBytes(), 0.isQualityFailed), 0.ordinal(), android.util.Base64.decode(0.getBytes(), 0.isQualityFailed), 0.PngjOutputException.ordinal(), com.identy.Position.getFromHandFinger(new android.util.Pair(0, 0)).ordinal());
        0.h.put(0, new java.util.HashMap());
        0 = (java.util.Map) 0.h.get(0);
        0 = new java.util.ArrayList();
        0 = new java.util.HashMap();
        0 = new java.util.Date();
        0 = (float) 0.getScore();
        0 = ((int[]) $$a_state[1])[0];
        0 = 0 * 0;
        0 = -(2064437118 * 0);
        0 = (0 & 0) + (0 | 0);
        0 = -(0 * 750375434);
        0 = ((0 | 0) << 1) - (0 ^ 0);
        0 = ((0 | 1829967376) << 1) - (1829967376 ^ 0);
        0 = 0 >> 24;
        0 = (((0 | (-511)) << 1) - (0 ^ (-511))) / 256;
        0 = (0 & 1) + (0 | 1);
        0 = (0 & 0) + (0 | 0);
        0 = 0 >> 17;
        0 = (((0 | (-65535)) << 1) - (0 ^ (-65535))) / 32768;
        0 = -(((0 & 1) + (0 | 1)) ^ 0);
        0 = (((0 | 1) << 1) - (0 ^ 1)) >> 21;
        0 = com.identy.IdentyB.a(0 & (-4095), 0 | (-4095), 2048, -1);
        0 = new com.identy.getCaptureTime(0, 0, 0, 0, 0.0d, 0, 0, 0, 0.0f, false, null, com.karumi.dexter.BuildConfig.FLAVOR, 0, (430749 / (((-(((0 | 1) << 1) - (0 ^ 1))) & 0) * 687)) - 627, 0, new com.identy.PngBadCharsetException(), 0, 0, com.identy.enums.FingerDetectionMode.L4F, com.identy.com.identy.FingerAS.NONE);
        0.PngjOutputException = 0;
        0.put(0, 0);
        0 = new com.identy.VerifyIdentyResponse(0.h, 0.e, 0.isQualityFailed, 0.Attempt, 0.getPadSub1, 0.getQualityScore, 0.values, 0.getData, 0.i);
        0.fillPrintsInfo(0.h, 0.getPadSub2, false, true, new java.util.ArrayList<>(), new com.identy.IdentySdk.PngjException(0, 0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x028c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x028d, code lost:
    
        0.equals(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0290, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x011f, code lost:
    
        if (0 == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void matchWithTemplatesbase64(Hand hand, Finger finger, Template template, String str, Template template2, String str2) {
        Object[] objArr;
        long j;
        deduplication = (generateST + 85) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~((~((int) Process.getElapsedCpuTime())) | 571047322)) | (-1070464987), -964, (((-1069936603) | (~(571047322 | 0))) * (-964)) - 861650457, -1487803151);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    generateST = (deduplication + 95) % 128;
                    ((long[]) objArr[0])[0] = j + 4887;
                    com.identy.Fpnative.valueOf = objArr;
                    if (template != null || template2 == null) {
                        throw new UnSupportedTemplateException();
                    }
                    int i3 = generateST + 121;
                    deduplication = i3 % 128;
                    if (i3 % 2 != 0) {
                        template.equals(Template.NIST_ITL_1_2015_RECORD_9);
                        throw null;
                    }
                    Template template3 = Template.NIST_ITL_1_2015_RECORD_9;
                    if (!template.equals(template3)) {
                        Template template4 = Template.NIST_ITL_1_2015_RECORD_14;
                        if (!template.equals(template4)) {
                            int i4 = generateST + 81;
                            deduplication = i4 % 128;
                            int i5 = i4 % 2;
                            boolean equals = template2.equals(template3);
                            if (i5 != 0) {
                                int i6 = 58 / 0;
                            }
                        }
                    }
                    throw new Exception("Template type is not valid ".concat(String.valueOf(template)));
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1487803151);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4887;
            com.identy.Fpnative.valueOf = objArr;
            if (template != null) {
            }
            throw new UnSupportedTemplateException();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ee A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public QualityMode n() {
        Object[] objArr;
        long j;
        int i;
        deduplication = (generateST + 29) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a = defpackage.a.a();
                    int c = defpackage.a.c((~(a | (-763592438))) | 264703157, 502, ((~((~a) | 801603317)) * (-502)) + ((((~(264703157 | a)) | 38010880) * (-502)) - 309423891), -182361609);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4920;
                    com.identy.Fpnative.valueOf = objArr;
                    QualityMode qualityMode = this.DeduplicationIdentyResponse;
                    i = deduplication + 89;
                    generateST = i % 128;
                    if (i % 2 == 0) {
                        return qualityMode;
                    }
                    throw null;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -182361609);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4920;
            com.identy.Fpnative.valueOf = objArr;
            QualityMode qualityMode2 = this.DeduplicationIdentyResponse;
            i = deduplication + 89;
            generateST = i % 128;
            if (i % 2 == 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 47) % 128;
    }

    public FingerStatusUpdator o() {
        Object[] objArr;
        long j;
        int i = (deduplication + 11) % 128;
        generateST = i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (i + 51) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i2 = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | (-128472348))) | (~(i2 | 370416932)), 959, (((~((-128472348) | i2)) | (~(identityHashCode | 370416932))) * 959) + 595513269, 1933260075);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4955;
                    com.identy.Fpnative.valueOf = objArr;
                    FingerStatusUpdator fingerStatusUpdator = this.getL3Score;
                    deduplication = (generateST + 99) % 128;
                    return fingerStatusUpdator;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1933260075);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4955;
            com.identy.Fpnative.valueOf = objArr;
            FingerStatusUpdator fingerStatusUpdator2 = this.getL3Score;
            deduplication = (generateST + 99) % 128;
            return fingerStatusUpdator2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public HashMap p() {
        Object[] objArr;
        long j;
        int i = deduplication + 43;
        generateST = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-827266409))) | 43033088, 433, (((~(328377128 | identityHashCode)) | (-827266409)) * (-433)) + (((~((~identityHashCode) | (-285344041))) * 433) - 1678555906), 402549004);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4857;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.getPadSub2;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 402549004);
            j = ((long[]) objArr[0])[0];
            deduplication = (generateST + 117) % 128;
            ((long[]) objArr[0])[0] = j + 4857;
            com.identy.Fpnative.valueOf = objArr;
            return this.getPadSub2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 119) % 128;
    }

    public HashSet q() {
        Object[] objArr;
        long j;
        generateST = (deduplication + 89) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | (-42503681))) | (~(i | 602902212)) | (~((-541392961) | identityHashCode)), 192, (((~(61509252 | i)) | 541392960) * (-384)) + ((19005572 | i) * (-192)) + 1796350335, 746771215);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4941;
                    com.identy.Fpnative.valueOf = objArr;
                    return new HashSet(this.CaptureFingersActivity);
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 746771215);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4941;
            com.identy.Fpnative.valueOf = objArr;
            return new HashSet(this.CaptureFingersActivity);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 25) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x014f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00d3  */
    /* JADX WARN: Type inference failed for: r14v18, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean removeEnrollment(FingerDetectionMode[] fingerDetectionModeArr, IdentyUser identyUser) {
        Object[] objArr;
        long j;
        int length;
        int i;
        HashMap<Pair<Hand, Finger>, PngjExceptionInternal> PngjException2;
        Map.Entry<Pair<Hand, Finger>, PngjExceptionInternal> next;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i2 = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | 788397027)) | (~(i2 | (-4286884))), 210, (((~(146897315 | i2)) | (~((-645786596) | identityHashCode))) * 210) + 382309137, 72204456);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5010;
                    com.identy.Fpnative.valueOf = objArr;
                    length = fingerDetectionModeArr.length;
                    for (i = 0; i < length; i++) {
                        int i5 = deduplication + 79;
                        generateST = i5 % 128;
                        if (i5 % 2 == 0) {
                            FingerDetectionMode fingerDetectionMode = fingerDetectionModeArr[i];
                            Activity activity = this.getData;
                            FingerDetectionMode[] fingerDetectionModeArr2 = new FingerDetectionMode[0];
                            fingerDetectionModeArr2[1] = fingerDetectionMode;
                            PngjException2 = com.identy.f.PngjBadSignature.PngjException(activity, fingerDetectionModeArr2, identyUser);
                        } else {
                            PngjException2 = com.identy.f.PngjBadSignature.PngjException(this.getData, new FingerDetectionMode[]{fingerDetectionModeArr[i]}, identyUser);
                        }
                        Iterator<Map.Entry<Pair<Hand, Finger>, PngjExceptionInternal>> it = PngjException2.entrySet().iterator();
                        while (it.hasNext()) {
                            int i6 = deduplication + 33;
                            generateST = i6 % 128;
                            if (i6 % 2 == 0) {
                                next = it.next();
                                int i7 = 21 / 0;
                                if (this.configureroll.contains(next.getKey())) {
                                    generateST = (deduplication + 109) % 128;
                                    if (!next.getValue().PngjBadCrcException(this.getData, identyUser)) {
                                        PngjExceptionInternal value = next.getValue();
                                        value.PngjException(this.getData, identyUser);
                                        com.identy.app.PngjBadSignature.values(new File(value.PngjBadCrcException));
                                    }
                                }
                            } else {
                                next = it.next();
                                if (this.configureroll.contains(next.getKey())) {
                                    generateST = (deduplication + 109) % 128;
                                    if (!next.getValue().PngjBadCrcException(this.getData, identyUser)) {
                                    }
                                }
                            }
                        }
                    }
                    int i8 = ((int[]) objArr[1])[0];
                    int i9 = ((((i8 * i8) - (~(-(307985570 * i8)))) - 1) - (~(-(i8 * (-893749770))))) - 1;
                    int i10 = (i9 & 146075280) + (146075280 | i9);
                    int i11 = i10 >> 18;
                    int i12 = (((i11 | (-32767)) << 1) - (i11 ^ (-32767))) / 16384;
                    int i13 = (i12 & 1) + (i12 | 1);
                    int i14 = (i10 ^ i13) + ((i13 & i10) << 1);
                    int i15 = ((i10 >> 26) - 127) / 64;
                    int i16 = -(i14 ^ ((i15 & 1) + (i15 | 1)));
                    int i17 = ((i16 | 3) << 1) - (i16 ^ 3);
                    int i18 = i17 >> 18;
                    int i19 = (((i18 | (-32767)) << 1) - (i18 ^ (-32767))) / 16384;
                    int i20 = (i19 & 1) + (i19 | 1);
                    return false;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 72204456);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5010;
            com.identy.Fpnative.valueOf = objArr;
            length = fingerDetectionModeArr.length;
            while (i < length) {
            }
            int i82 = ((int[]) objArr[1])[0];
            int i92 = ((((i82 * i82) - (~(-(307985570 * i82)))) - 1) - (~(-(i82 * (-893749770))))) - 1;
            int i102 = (i92 & 146075280) + (146075280 | i92);
            int i112 = i102 >> 18;
            int i122 = (((i112 | (-32767)) << 1) - (i112 ^ (-32767))) / 16384;
            int i132 = (i122 & 1) + (i122 | 1);
            int i142 = (i102 ^ i132) + ((i132 & i102) << 1);
            int i152 = ((i102 >> 26) - 127) / 64;
            int i162 = -(i142 ^ ((i152 & 1) + (i152 | 1)));
            int i172 = ((i162 | 3) << 1) - (i162 ^ 3);
            int i182 = i172 >> 18;
            int i192 = (((i182 | (-32767)) << 1) - (i182 ^ (-32767))) / 16384;
            int i202 = (i192 & 1) + (i192 | 1);
            return false;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0055, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c((~(0 | 863894486)) | ((~((~0) | (-538751745))) | (~((-285280279) | 0))), 867, ((((~((-824032023) | 0)) | 538751744) | (~(325142742 | 0))) * (-1734)) + ((((~((-824032023) | 0)) | (~(325142742 | 0))) * (-867)) - 755802724), -1278610547);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean s() {
        long j;
        int i = deduplication;
        generateST = (i + 35) % 128;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = i + 79;
                generateST = i2 % 128;
                if (i2 % 2 == 0) {
                    long j2 = ((long[]) objArr[1])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4964;
                com.identy.Fpnative.valueOf = null;
                return this.cvtmat2ba;
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -1278610547);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4964;
            com.identy.Fpnative.valueOf = objArr4;
            return this.cvtmat2ba;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    public IdentySdk setASServerConfig(String str, String str2) {
        Object[] objArr;
        long j;
        int i = deduplication + 7;
        generateST = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i2 = ~identityHashCode;
                    int i3 = ~(542091888 | i2);
                    int c = defpackage.a.c(i3 | 43202608, 712, (((~(identityHashCode | (-42995713))) | (~(i2 | 585087600))) * (-712)) + (((-585087601) | i3) * (-712)) + 381035127, -458646260);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 5014;
                    com.identy.Fpnative.valueOf = objArr;
                    int i6 = ((int[]) objArr[1])[0];
                    int i7 = i6 * i6;
                    int i8 = -(1750353624 * i6);
                    int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
                    int i10 = -(i6 * (-58099904));
                    int i11 = ((i9 | i10) << 1) - (i10 ^ i9);
                    int i12 = ((i11 | 547743888) << 1) - (547743888 ^ i11);
                    int i13 = i12 >> 17;
                    int i14 = ((i13 & (-65535)) + (i13 | (-65535))) / 32768;
                    int i15 = ((i14 | 1) << 1) - (i14 ^ 1);
                    int i16 = (i12 & i15) + (i15 | i12);
                    int i17 = i12 >> 19;
                    int i18 = (((i17 | (-16383)) << 1) - (i17 ^ (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
                    int i19 = -(((i18 & 1) + (i18 | 1)) ^ i16);
                    int i20 = ((i19 | 2) << 1) - (i19 ^ 2);
                    int i21 = ((i20 >> 25) - 255) / 128;
                    return setASServerConfig(str, str2, true);
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -458646260);
            j = ((long[]) objArr[0])[0];
            deduplication = (generateST + 53) % 128;
            ((long[]) objArr[0])[0] = j + 5014;
            com.identy.Fpnative.valueOf = objArr;
            int i62 = ((int[]) objArr[1])[0];
            int i72 = i62 * i62;
            int i82 = -(1750353624 * i62);
            int i92 = (i72 ^ i82) + ((i72 & i82) << 1);
            int i102 = -(i62 * (-58099904));
            int i112 = ((i92 | i102) << 1) - (i102 ^ i92);
            int i122 = ((i112 | 547743888) << 1) - (547743888 ^ i112);
            int i132 = i122 >> 17;
            int i142 = ((i132 & (-65535)) + (i132 | (-65535))) / 32768;
            int i152 = ((i142 | 1) << 1) - (i142 ^ 1);
            int i162 = (i122 & i152) + (i152 | i122);
            int i172 = i122 >> 19;
            int i182 = (((i172 | (-16383)) << 1) - (i172 ^ (-16383))) / ConstantsKt.DEFAULT_BUFFER_SIZE;
            int i192 = -(((i182 & 1) + (i182 | 1)) ^ i162);
            int i202 = ((i192 | 2) << 1) - (i192 ^ 2);
            int i212 = ((i202 >> 25) - 255) / 128;
            return setASServerConfig(str, str2, true);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public void setAllowHandChange(boolean z) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (deduplication + 83) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~((~identityHashCode) | (-239379333))) | 574993984, 381, (((-201326981) | identityHashCode) * (-381)) + 1677176986, 1479197563);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4866;
                    com.identy.Fpnative.valueOf = objArr;
                    this.setDConfig = z;
                    generateST = (deduplication + 85) % 128;
                    return;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2083029511);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4866;
            com.identy.Fpnative.valueOf = objArr;
            this.setDConfig = z;
            generateST = (deduplication + 85) % 128;
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        int i3 = (deduplication + 11) % 128;
        generateST = i3;
        deduplication = (i3 + 99) % 128;
    }

    public void setAllowTabletLandscape(boolean z) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int i2 = ~((-780679014) | i);
                    int i3 = ~(281789733 | identityHashCode);
                    int c = defpackage.a.c((~(identityHashCode | (-780679014))) | (~(i | 780679013)), 575, ((i3 | (~((-281789734) | i))) * (-575)) + ((i2 | i3) * 1150) + 1400362686, -1596606561);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    generateST = (deduplication + 23) % 128;
                    ((long[]) objArr[0])[0] = j + 5041;
                    com.identy.Fpnative.valueOf = objArr;
                    this.EnrollThumbActivity = z;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1596606561);
            j = ((long[]) objArr[0])[0];
            deduplication = (generateST + 107) % 128;
            ((long[]) objArr[0])[0] = j + 5041;
            com.identy.Fpnative.valueOf = objArr;
            this.EnrollThumbActivity = z;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = defpackage.a.c((~((~((int) android.os.Process.getStartElapsedRealtime())) | (-48086436))) | 9973155, 191, (((~(0 | (-48086436))) | 546975715) * 191) - 1488831675, -1309727729);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 1) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setAllowVerificationAfterSpoof(boolean z) {
        long j;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = deduplication + 37;
                generateST = i % 128;
                if (i % 2 == 0) {
                    long j2 = ((long[]) objArr[0])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4919;
                com.identy.Fpnative.valueOf = null;
                this.e1 = z;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -1309727729);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4919;
            com.identy.Fpnative.valueOf = objArr4;
            this.e1 = z;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00df A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk setAsSecMode(FingerAS fingerAS) {
        Object[] objArr;
        long j;
        int i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i2 = ~(((int) Runtime.getRuntime().freeMemory()) | 1067075598);
                    int c = defpackage.a.c(i2 | (-1071635919), 658, (((-508009921) | i2) * (-658)) + 1997608507, -1734199529);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5016;
                    com.identy.Fpnative.valueOf = objArr;
                    this.Action = fingerAS;
                    i = deduplication + 1;
                    generateST = i % 128;
                    if (i % 2 == 0) {
                        return this;
                    }
                    throw null;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1734199529);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5016;
            com.identy.Fpnative.valueOf = objArr;
            this.Action = fingerAS;
            i = deduplication + 1;
            generateST = i % 128;
            if (i % 2 == 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 87) % 128;
    }

    public void setAssistedMode(boolean z) {
        Object[] objArr;
        long j;
        int i = (deduplication + 13) % 128;
        generateST = i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (i + 15) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int c = defpackage.a.c(~(myUid | (-583038081)), 345, (((~((-853636233) | (~myUid))) | (-937785033)) * 345) + (((~((-853636233) | myUid)) | 583038080) * 345) + 180779864, 616547664);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4959;
                    com.identy.Fpnative.valueOf = objArr;
                    this.CaptureRolledFingersActivity = z;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 616547664);
            j = ((long[]) objArr[0])[0];
            generateST = (deduplication + 11) % 128;
            ((long[]) objArr[0])[0] = j + 4959;
            com.identy.Fpnative.valueOf = objArr;
            this.CaptureRolledFingersActivity = z;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public void setAttemptsTimeout(int i, int i2) {
        Object[] objArr;
        long j;
        deduplication = (generateST + 11) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i3 = ~((int) Process.getStartUptimeMillis());
                    int c = defpackage.a.c((~(i3 | (-362847971))) | (-861737251), 783, ((~((-285216803) | i3)) * (-783)) + 929291340, 598037894);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4973;
                    com.identy.Fpnative.valueOf = objArr;
                    this.PngjUnsupportedException = i;
                    this.PngjInputException = i2;
                    valueOf();
                    deduplication = (generateST + 31) % 128;
                    return;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 598037894);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4973;
            com.identy.Fpnative.valueOf = objArr;
            this.PngjUnsupportedException = i;
            this.PngjInputException = i2;
            valueOf();
            deduplication = (generateST + 31) % 128;
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        generateST = (deduplication + 9) % 128;
    }

    public IdentySdk setBase64EncodingFlag(int i) {
        Object[] objArr;
        long j;
        int i2 = generateST + 27;
        deduplication = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myTid = Process.myTid();
                    int c = defpackage.a.c((~((~myTid) | 186700170)) | (-603820609), 262, (((~(186700170 | myTid)) | (-603820609)) * 262) + 647201227, 707867423);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4926;
                    com.identy.Fpnative.valueOf = objArr;
                    this.isQualityFailed = i;
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 707867423);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4926;
            com.identy.Fpnative.valueOf = objArr;
            this.isQualityFailed = i;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 97) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00dc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk setCustomEncryption(IdentyCustomEncryption identyCustomEncryption) {
        Object[] objArr;
        long j;
        int i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int c = defpackage.a.c(~(elapsedCpuTime | (-508367425)), 566, (((~((-1064115063) | elapsedCpuTime)) | 555747638) * (-566)) + 1519439779, -1437149504);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    generateST = (deduplication + 7) % 128;
                    ((long[]) objArr[0])[0] = j + 4980;
                    com.identy.Fpnative.valueOf = objArr;
                    this.values = identyCustomEncryption;
                    i = deduplication + 67;
                    generateST = i % 128;
                    if (i % 2 == 0) {
                        return this;
                    }
                    throw null;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1437149504);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4980;
            com.identy.Fpnative.valueOf = objArr;
            this.values = identyCustomEncryption;
            i = deduplication + 67;
            generateST = i % 128;
            if (i % 2 == 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = ~java.lang.System.identityHashCode(0);
        0 = defpackage.a.c((~(0 | (-495690594))) | 650360512, 494, (((-419954978) | 0) * 494) + 1343344045, -1134655906);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk setCustomQuality(HashMap<Finger, Integer> hashMap) {
        long j;
        int i = deduplication;
        generateST = (i + 33) % 128;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = i + 117;
                generateST = i2 % 128;
                if (i2 % 2 == 0) {
                    long j2 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4925;
                com.identy.Fpnative.valueOf = null;
                this.getAttempts = hashMap;
                return this;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -1134655906);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4925;
            com.identy.Fpnative.valueOf = objArr4;
            this.getAttempts = hashMap;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 11) % 128;
    }

    public IdentySdk setDetectionMode(FingerDetectionMode[] fingerDetectionModeArr, CapturePosition capturePosition) {
        Object[] objArr;
        long j;
        int i = deduplication + 69;
        generateST = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i2 = ~identityHashCode;
                    int c = defpackage.a.c(identityHashCode | (-600094657), 397, (((~(i2 | (-188556003))) | (~((-687445283) | i2)) | 137953314) * (-397)) + 1446157638, 208998406);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4959;
                    com.identy.Fpnative.valueOf = objArr;
                    this.getScore = capturePosition;
                    setDetectionMode(fingerDetectionModeArr);
                    generateST = (deduplication + 101) % 128;
                    return this;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 208998406);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4959;
            com.identy.Fpnative.valueOf = objArr;
            this.getScore = capturePosition;
            setDetectionMode(fingerDetectionModeArr);
            generateST = (deduplication + 101) % 128;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 7) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = defpackage.a.a();
        0 = ~(355378127 | 0);
        0 = ~0;
        0 = defpackage.a.c((~(0 | (-854267408))) | (~((-355378128) | 0)), 406, ((~(938457039 | 0)) * (-406)) + (((0 | (~((-84189633) | 0))) * (-406)) - 990926187), -1049296627);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 17) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setDeviceInfo(String str, String str2, String str3, String str4) {
        long j;
        int i = (deduplication + 3) % 128;
        generateST = i;
        /* try block with no catch/finally removed */
    }

    public IdentySdk setDisplayBoxes(boolean z, boolean z2) {
        Object[] objArr;
        long j;
        generateST = (deduplication + 99) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c(~(System.identityHashCode(this) | (-279068709)), -1504, (((~((-313481381) | 0)) | 34412672) * 1504) - 1003693777, -1869608916);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    deduplication = (generateST + 13) % 128;
                    ((long[]) objArr[0])[0] = j + 4855;
                    com.identy.Fpnative.valueOf = objArr;
                    this.cvtyuv2bgr = z;
                    this.uxd566jk = z2;
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1139826460);
            j = ((long[]) objArr[0])[0];
            generateST = (deduplication + 101) % 128;
            ((long[]) objArr[0])[0] = j + 4855;
            com.identy.Fpnative.valueOf = objArr;
            this.cvtyuv2bgr = z;
            this.uxd566jk = z2;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk setDisplayImages(boolean z) {
        Object[] objArr;
        long j;
        int i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (generateST + 69) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~((~identityHashCode) | (-409800252))) | 776244800, 381, (((-271122492) | identityHashCode) * (-381)) + 665455588, 629520838);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4867;
                    com.identy.Fpnative.valueOf = objArr;
                    this.uxd565jj = z;
                    i = generateST + 109;
                    deduplication = i % 128;
                    if (i % 2 != 0) {
                        return this;
                    }
                    throw null;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 411066871);
            j = ((long[]) objArr[0])[0];
            deduplication = (generateST + 53) % 128;
            ((long[]) objArr[0])[0] = j + 4867;
            com.identy.Fpnative.valueOf = objArr;
            this.uxd565jj = z;
            i = generateST + 109;
            deduplication = i % 128;
            if (i % 2 != 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public IdentySdk setEncryption(IdentyEncrytion identyEncrytion, String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~(System.identityHashCode(this) | 718188955)) | 219299675, 529, (((~((~0) | 718188955)) | 84938304) * 529) - 1876653424, -1905997335);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4912;
                    com.identy.Fpnative.valueOf = objArr;
                    this.getPadSub1 = identyEncrytion;
                    this.getQualityScore = str;
                    return this;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1905997335);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4912;
            com.identy.Fpnative.valueOf = objArr;
            this.getPadSub1 = identyEncrytion;
            this.getQualityScore = str;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        int i3 = (deduplication + 79) % 128;
        generateST = i3;
        deduplication = (i3 + 61) % 128;
    }

    public IdentySdk setFingerPrintDrawable(int i, boolean z) {
        Object[] objArr;
        long j;
        int i2 = deduplication;
        generateST = (i2 + 101) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (i2 + 9) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int c = defpackage.a.c((~(elapsedCpuTime | 374234642)) | (~(124654637 | elapsedCpuTime)) | (-393109056), -1444, (((~elapsedCpuTime) | (-287328832)) * 1444) + 1078082705, 1758326271);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 5017;
                    com.identy.Fpnative.valueOf = objArr;
                    this.Enroll2IndexActivity = i;
                    this.toString = z;
                    generateST = (deduplication + 31) % 128;
                    return this;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 465340497);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5017;
            com.identy.Fpnative.valueOf = objArr;
            this.Enroll2IndexActivity = i;
            this.toString = z;
            generateST = (deduplication + 31) % 128;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (0 <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (0 <= 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0058, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = android.os.Process.myPid();
        0 = defpackage.a.c((~(0 | (-223041858))) | (-793762754), 302, ((~((-151210242) | 0)) * (-604)) + ((((~((~0) | (-151210242))) | (~((-71831617) | 0))) * (-302)) - 1882075063), -604479582);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk setInlineGuide(boolean z, InlineGuideOption inlineGuideOption) {
        long j;
        int i = generateST;
        int i2 = i + 47;
        deduplication = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i3 = i + 111;
                deduplication = i3 % 128;
                if (i3 % 2 != 0) {
                    long j2 = ((long[]) objArr[1])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 5039;
                com.identy.Fpnative.valueOf = null;
                this.CaptureMode = z;
                this.FingerAS = inlineGuideOption;
                return this;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -604479582);
            j = ((long[]) objArr4[0])[0];
            generateST = (deduplication + 75) % 128;
            ((long[]) objArr4[0])[0] = j + 5039;
            com.identy.Fpnative.valueOf = objArr4;
            this.CaptureMode = z;
            this.FingerAS = inlineGuideOption;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 35) % 128;
    }

    public IdentySdk setInlineMsgTimeOut(long j) {
        Object[] objArr;
        long j2;
        int i = deduplication + 29;
        generateST = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j3 = ((long[]) objArr2[0])[0];
                j2 = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j3 > j2) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int a = defpackage.a.a();
                    int c = defpackage.a.c((~(a | (-428869668))) | 69755292, 235, (((~((-429001828) | a)) | 69887452) * (-470)) + (((~((~a) | (-429001828))) | 69887452) * (-235)) + 1017434888, 767051648);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j2 + 4947;
                    com.identy.Fpnative.valueOf = objArr;
                    this.getServerRequest = j;
                    deduplication = (generateST + 91) % 128;
                    return this;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 767051648);
            j2 = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j2 + 4947;
            com.identy.Fpnative.valueOf = objArr;
            this.getServerRequest = j;
            deduplication = (generateST + 91) % 128;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 107) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = android.os.Process.myUid();
        0 = ~0;
        0 = defpackage.a.c((~(0 | (-178837820))) | (~(0 | (-286457861))), 765, (((~((-178837820) | 0)) | 33593600) * 1530) + (((((~((-33593601) | 0)) | (~((-145244220) | 0))) | (~((-286457861) | 0))) * 765) + 1728702125), -33121115);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setLocale(String str) {
        long j;
        int i = deduplication;
        generateST = (i + 99) % 128;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = i + 107;
                generateST = i2 % 128;
                if (i2 % 2 == 0) {
                    long j2 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4913;
                com.identy.Fpnative.valueOf = null;
                this.Fpnative = str;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -33121115);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4913;
            com.identy.Fpnative.valueOf = objArr4;
            this.Fpnative = str;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public void setMatchSecLevel(FingerMatchSecLevel fingerMatchSecLevel) {
        Object[] objArr;
        long j;
        int i = generateST;
        int i2 = i + 25;
        deduplication = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (i + 5) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i3 = ~identityHashCode;
                    int c = defpackage.a.c((~(identityHashCode | 434711377)) | 34751662 | (~(i3 | (-405285138))), 369, (((~((-434711378) | i3)) | 64177902) * (-369)) + (((469463039 | i3) * (-369)) - 94560498), -359903585);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    generateST = (deduplication + 121) % 128;
                    ((long[]) objArr[0])[0] = j + 4953;
                    com.identy.Fpnative.valueOf = objArr;
                    this.PngjOutputException = fingerMatchSecLevel;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -359903585);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4953;
            com.identy.Fpnative.valueOf = objArr;
            this.PngjOutputException = fingerMatchSecLevel;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (0 <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (0 <= 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0050, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = android.os.Process.myUid();
        0 = defpackage.a.c((~((~0) | (-673576337))) | 38273600, 564, ((~(0 | (-136413457))) * 1128) + (((((~(174687056 | 0)) | (-673576337)) | (~((-174687057) | 0))) * (-564)) - 1180294517), 1646120197);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk setMode(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                int i = generateST + 107;
                deduplication = i % 128;
                if (i % 2 != 0) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, new Object[1])).longValue();
                } else {
                    long j3 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) objArr[0])[0] = j + 4969;
                com.identy.Fpnative.valueOf = objArr;
                if (str != null) {
                    deduplication = (generateST + 25) % 128;
                    int i2 = ((int[]) objArr[1])[0];
                    int i3 = i2 * i2;
                    int i4 = -(1683007502 * i2);
                    int i5 = (((i3 ^ i4) + ((i3 & i4) << 1)) - (~(-(i2 * 410839532)))) - 1;
                    int i6 = (i5 & 1399343625) + (1399343625 | i5);
                    int e = IdentyB.e(i6 >> 23, 1023, ConstantsKt.MINIMUM_BLOCK_SIZE, -1);
                    int i7 = (i6 & e) + (e | i6);
                    int i8 = i6 >> 24;
                    int i9 = ((i8 & (-511)) + (i8 | (-511))) / 256;
                    int i10 = (-((((i9 | 1) << 1) - (i9 ^ 1)) ^ i7)) - (-1);
                    int i11 = i10 >> 27;
                    int i12 = (((i11 | (-63)) << 1) - (i11 ^ (-63))) / 32;
                    int i13 = ((i12 | 1) << 1) - (i12 ^ 1);
                    if (str.equalsIgnoreCase("10,5,24,5,COMMERCIAL".substring(2650 / ((i10 & (-(((i13 | 1) << 1) - (i13 ^ 1)))) * 265))) || str.equalsIgnoreCase("DEMO")) {
                        this.addTemplates = str;
                        return this;
                    }
                }
                throw new Exception(" Invalid mode option");
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1646120197);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4969;
            com.identy.Fpnative.valueOf = objArr;
            if (str != null) {
            }
            throw new Exception(" Invalid mode option");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[]{0 ^ (0 << 5)}};
        0 = ~0;
        0 = (~((-517041987) | 0)) | 1076482;
        0 = defpackage.a.c(~(0 | 18152706), 713, ((~(534118210 | 0)) * 1426) + (((0 | 0) * (-713)) - 159383956), 1883741849);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setOutputSize(int i, int i2) {
        long j;
        int i3 = generateST;
        deduplication = (i3 + 7) % 128;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i4 = i3 + 13;
                deduplication = i4 % 128;
                if (i4 % 2 != 0) {
                    long j2 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 5020;
                com.identy.Fpnative.valueOf = null;
                this.pfk = i;
                this.pfkrolfinalizeF = i2;
                return;
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 1883741849);
            j = ((long[]) objArr4[0])[0];
            generateST = (deduplication + 63) % 128;
            ((long[]) objArr4[0])[0] = j + 5020;
            com.identy.Fpnative.valueOf = objArr4;
            this.pfk = i;
            this.pfkrolfinalizeF = i2;
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        int i5 = (generateST + 117) % 128;
        deduplication = i5;
        generateST = (i5 + 55) % 128;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [boolean, int] */
    public IdentySdk setQualityMode(QualityMode qualityMode) {
        Object[] objArr;
        long j;
        generateST = (deduplication + 9) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c(~((~identityHashCode) | (-661093908)), 184, ((identityHashCode | (-804224980)) * (-184)) + ((((~((-162204628) | 0)) | 19073555) * 184) - 664185801), 658737907);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4943;
                    com.identy.Fpnative.valueOf = objArr;
                    this.DeduplicationIdentyResponse = qualityMode;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(1746412995 * i3);
                    int i6 = (((i4 & i5) + (i4 | i5)) - (~(-(i3 * 951304441)))) - 1;
                    int i7 = ((i6 | (-1350068604)) << 1) - ((-1350068604) ^ i6);
                    int i8 = i7 >> 19;
                    int i9 = (i7 - (~IdentyB.a(i8 & (-16383), i8 | (-16383), ConstantsKt.DEFAULT_BUFFER_SIZE, -1))) - 1;
                    int i10 = i7 >> 18;
                    int i11 = ((i10 ^ (-32767)) + ((i10 & (-32767)) << 1)) / 16384;
                    int i12 = -(i9 ^ (((i11 | 1) << 1) - (i11 ^ 1)));
                    int i13 = (i12 ^ 4) + ((i12 & 4) << 1);
                    int i14 = i13 >> 28;
                    int i15 = (((i14 | (-31)) << 1) - (i14 ^ (-31))) / 16;
                    int i16 = (i15 ^ 1) + ((i15 & 1) << 1);
                    this.setFingers = false;
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) (-bArr[111]);
            byte b2 = bArr[63];
            Object[] objArr4 = new Object[1];
            d((short) 154, b, b2, objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 658737907);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4943;
            com.identy.Fpnative.valueOf = objArr;
            this.DeduplicationIdentyResponse = qualityMode;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(1746412995 * i32);
            int i62 = (((i42 & i52) + (i42 | i52)) - (~(-(i32 * 951304441)))) - 1;
            int i72 = ((i62 | (-1350068604)) << 1) - ((-1350068604) ^ i62);
            int i82 = i72 >> 19;
            int i92 = (i72 - (~IdentyB.a(i82 & (-16383), i82 | (-16383), ConstantsKt.DEFAULT_BUFFER_SIZE, -1))) - 1;
            int i102 = i72 >> 18;
            int i112 = ((i102 ^ (-32767)) + ((i102 & (-32767)) << 1)) / 16384;
            int i122 = -(i92 ^ (((i112 | 1) << 1) - (i112 ^ 1)));
            int i132 = (i122 ^ 4) + ((i122 & 4) << 1);
            int i142 = i132 >> 28;
            int i152 = (((i142 | (-31)) << 1) - (i142 ^ (-31))) / 16;
            int i162 = (i152 ^ 1) + ((i152 & 1) << 1);
            this.setFingers = false;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 63) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = ~((-856761528) | (~0));
        0 = defpackage.a.c((~(0 | (-71602753))) | 0, 338, ((((-928364280) | 0) | (~(856761527 | 0))) * (-338)) + 244375247, 716071032);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk setRequiredTemplates(HashMap<Template, HashMap<Finger, ArrayList<TemplateSize>>> hashMap) {
        long j;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = generateST + 85;
                deduplication = i % 128;
                if (i % 2 != 0) {
                    long j2 = ((long[]) objArr[0])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 5047;
                com.identy.Fpnative.valueOf = null;
                this.getPadSub2 = hashMap;
                return this;
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 716071032);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 5047;
            com.identy.Fpnative.valueOf = objArr4;
            this.getPadSub2 = hashMap;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 41) % 128;
    }

    public void setSelectedFingers(List<Pair<Hand, Finger>> list) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-929232822))) | 430343541, 318, (((~(929232821 | identityHashCode)) | (-1072101366)) * (-318)) + (((~((-641757825) | identityHashCode)) | (~((~identityHashCode) | (-142868545)))) * (-318)) + 1945302741, 661152373);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4943;
                    com.identy.Fpnative.valueOf = objArr;
                    if (list != null || list.size() == 0) {
                        return;
                    }
                    int i3 = deduplication + 17;
                    generateST = i3 % 128;
                    int i4 = i3 % 2;
                    this.configureroll = list;
                    if (i4 == 0) {
                        throw null;
                    }
                    return;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 661152373);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4943;
            com.identy.Fpnative.valueOf = objArr;
            if (list != null) {
                return;
            } else {
                return;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        int i5 = (generateST + 21) % 128;
        deduplication = i5;
        generateST = (i5 + 109) % 128;
    }

    public void setStatusUpdator(FingerStatusUpdator fingerStatusUpdator) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int c = defpackage.a.c((~(((int) Process.getStartElapsedRealtime()) | 1073577944)) | 293670168, 366, (((~(434179416 | 0)) | 933068696) * (-366)) - 1704450753, 1521754077);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4877;
                    com.identy.Fpnative.valueOf = objArr;
                    this.getL3Score = fingerStatusUpdator;
                    return;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1521754077);
            j = ((long[]) objArr[0])[0];
            generateST = (deduplication + 73) % 128;
            ((long[]) objArr[0])[0] = j + 4877;
            com.identy.Fpnative.valueOf = objArr;
            this.getL3Score = fingerStatusUpdator;
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        deduplication = (generateST + 25) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c(~((~0) | (-1011107012)), 184, ((0 | (-1053284036)) * (-184)) + ((((~((-512217732) | 0)) | 470040707) * 184) - 619989193), -1235313435);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTransactionListener(TransactionListener transactionListener) {
        long j;
        int i;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = generateST + 107;
                deduplication = i2 % 128;
                if (i2 % 2 != 0) {
                    long j2 = ((long[]) objArr[1])[1];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4885;
                com.identy.Fpnative.valueOf = null;
                this.getProcessingTime = transactionListener;
                i = deduplication + 71;
                generateST = i % 128;
                if (i % 2 != 0) {
                    throw null;
                }
                return;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, -1235313435);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4885;
            com.identy.Fpnative.valueOf = objArr4;
            this.getProcessingTime = transactionListener;
            i = deduplication + 71;
            generateST = i % 128;
            if (i % 2 != 0) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        generateST = (deduplication + 73) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00f4, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00f5, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00f6, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00fa, code lost:
    
        if (0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fc, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00fd, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001e, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (0 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c(0 | (-110629838), 496, ((((~((-609519118) | 0)) | 541361152) | (~((~0) | (-42471873)))) * (-496)) + ((0 * 992) - 2137057233), 414724687);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001c, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0084, code lost:
    
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 105) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x008c, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = (byte) (-$$a[11]);
        0 = new java.lang.Object[1];
        d((short) 88, 0, (byte) (0 + 4), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) (-$$a[24]), $$a[63], $$a[116(0x74, float:1.63E-43)], 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, 414724687);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00d9, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 17) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00e7, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4872;
        com.identy.Fpnative.valueOf = null;
        0.destroy = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk setTransactionUiType(UIAfterCaptures uIAfterCaptures) {
        Object[] objArr;
        int i = generateST + 29;
        deduplication = i % 128;
        if (i % 2 != 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i2 = 78 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    public IdentySdk setUser(IdentyUser identyUser) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = defpackage.a.c((~(i | 726177265)) | (~(227287985 | i)), 865, ((~(identityHashCode | 726177265)) * 865) + (((~((-726177266) | i)) | 227287985) * (-865)) + 612610562, -824276192);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    generateST = (deduplication + 3) % 128;
                    ((long[]) objArr[0])[0] = j + 4880;
                    com.identy.Fpnative.valueOf = objArr;
                    this.uxd565jk = identyUser;
                    return this;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -824276192);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4880;
            com.identy.Fpnative.valueOf = objArr;
            this.uxd565jk = identyUser;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 39) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (0 <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004c, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c((~(0 | (-501654953))) | 2765672, 502, ((~((~0) | 502183912)) * (-502)) + ((((~(2765672 | 0)) | 528960) * (-502)) + 682805993), 519113821);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 85) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk setWSQCompression(WSQCompression wSQCompression) {
        long j;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i = deduplication + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground;
                generateST = i % 128;
                if (i % 2 == 0) {
                    long j2 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4966;
                com.identy.Fpnative.valueOf = null;
                this.Attempt = wSQCompression;
                return this;
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 519113821);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4966;
            com.identy.Fpnative.valueOf = objArr4;
            this.Attempt = wSQCompression;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public boolean t() {
        Object[] objArr;
        long j;
        int i = generateST + 23;
        deduplication = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int c = defpackage.a.c(elapsedCpuTime | (-541459201), 591, (((~((~elapsedCpuTime) | (-541459201))) | 42569920) * (-591)) + 2062716110, -488011932);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4924;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.CaptureRolledFingersActivity;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -488011932);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4924;
            com.identy.Fpnative.valueOf = objArr;
            return this.CaptureRolledFingersActivity;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 91) % 128;
    }

    public boolean u() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-313230419))) | 33588288, 116, ((185658861 | identityHashCode) * 116) + (((~((~identityHashCode) | 465300991)) * (-116)) - 1537692237), 1481746066);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4963;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.cvtyuv2bgr;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1481746066);
            j = ((long[]) objArr[0])[0];
            deduplication = (generateST + 45) % 128;
            ((long[]) objArr[0])[0] = j + 4963;
            com.identy.Fpnative.valueOf = objArr;
            return this.cvtyuv2bgr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
    }

    public boolean v() {
        Object[] objArr;
        long j;
        deduplication = (generateST + 77) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-1019132209))) | 549239040 | (~((~identityHashCode) | (-50349761))), 521, (((-520242929) | identityHashCode) * 521) + ((((~(0 | (-520242929))) | 1019132208) * (-1042)) - 645548696), -1635083417);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4867;
                    com.identy.Fpnative.valueOf = objArr;
                    return this.addEncryptedTemplates;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1635083417);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4867;
            com.identy.Fpnative.valueOf = objArr;
            return this.addEncryptedTemplates;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 63) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (0 <= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c((~(0 | 348655957)) | 570720896, 116, ((847545237 | 0) * 116) + (((~((~0) | (-71831617))) * (-116)) - 1537692237), 640052107);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean verify() {
        long j;
        int i = deduplication;
        generateST = (i + 89) % 128;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i2 = i + 27;
                generateST = i2 % 128;
                if (i2 % 2 == 0) {
                    long j2 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4910;
                com.identy.Fpnative.valueOf = null;
                return verify(getDefaultUser(), this.PngjUnsupportedException, this.PngjInputException);
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 640052107);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4910;
            com.identy.Fpnative.valueOf = objArr4;
            return verify(getDefaultUser(), this.PngjUnsupportedException, this.PngjInputException);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 49) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean verifyWithCustomTemplates(Template template, HashMap<Hand, String> hashMap) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        char c = 2;
        try {
            if (objArr2 != null) {
                deduplication = (generateST + 49) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = ~defpackage.a.b(967462104);
                    int c2 = defpackage.a.c((~((-662541243) | i)) | 641503872 | (~(163651962 | i)), 184, (((~(i | 805155834)) | (~((-21037371) | i))) * (-184)) - 1102424841, -786222824);
                    int i2 = c2 ^ (c2 << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5047;
                    com.identy.Fpnative.valueOf = objArr;
                    if (template != null) {
                        throw new Exception(this.getData.getString(R.string.template_type_is_unknown));
                    }
                    generateST = (deduplication + 27) % 128;
                    this.uxd565jk = getTempUser();
                    Activity activity = this.getData;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(92145098 * i4);
                    int i7 = (i5 & i6) + (i5 | i6);
                    int i8 = -(i4 * (-2026234914));
                    int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
                    int i10 = ((i9 | 159068048) << 1) - (159068048 ^ i9);
                    int i11 = ((i10 >> 22) - 2047) / 1024;
                    int i12 = (i11 & 1) + (i11 | 1);
                    int i13 = -(((i10 ^ i12) + ((i12 & i10) << 1)) ^ IdentyB.e(i10 >> 16, 131071, 65536, -1));
                    int i14 = (i13 & 4) + (i13 | 4);
                    int i15 = ((i14 >> 17) - 65535) / 32768;
                    int i16 = (i15 & 1) + (i15 | 1);
                    File values2 = com.identy.PngjBadCrcException.values(activity, "22|28|TEMP_IDENTY".substring(38040 / (((-((i16 ^ 1) + ((i16 & 1) << 1))) & i14) * 1585)));
                    for (Map.Entry<Hand, String> entry : hashMap.entrySet()) {
                        Hand key = entry.getKey();
                        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(Base64.decode(new String(com.identy.e.valueOf.PngjException(entry.getValue())).getBytes(), this.isQualityFailed)));
                        byte[] bArr = new byte[1024];
                        while (true) {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry != null) {
                                String name = nextEntry.getName();
                                if (!nextEntry.isDirectory()) {
                                    String str = name.split("_")[1].split("\\.")[0];
                                    File file = new File(values2, name.concat("crypt"));
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    char c3 = c;
                                    deduplication = (generateST + 121) % 128;
                                    while (true) {
                                        try {
                                            int read = zipInputStream.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, read);
                                        } catch (Throwable th) {
                                            try {
                                                fileOutputStream.close();
                                                deduplication = (generateST + 77) % 128;
                                                throw th;
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                                throw th;
                                            }
                                        }
                                    }
                                    fileOutputStream.close();
                                    File file2 = new File(values2, name);
                                    PngjBadSignature(file.getAbsolutePath(), file2.getAbsolutePath());
                                    if (template.equals(Template.FF_ISO_19794_4)) {
                                        int i17 = deduplication + 113;
                                        generateST = i17 % 128;
                                        if (i17 % 2 == 0) {
                                            values(new Object[]{this, file2.getAbsolutePath(), PngjException(str), key, this.uxd565jk}, 0, 1779101910, 0, -1779101909, 0, 0);
                                            int i18 = 61 / 0;
                                        } else {
                                            values(new Object[]{this, file2.getAbsolutePath(), PngjException(str), key, this.uxd565jk}, 0, 1779101910, 0, -1779101909, 0, 0);
                                        }
                                    } else if (template.equals(Template.FF_WSQ)) {
                                        PngjBadCrcException(file2.getAbsolutePath(), PngjException(str), key, this.uxd565jk);
                                    }
                                    zipInputStream.closeEntry();
                                    c = c3;
                                }
                            }
                        }
                    }
                    boolean a = a(this.uxd565jk, this.PngjUnsupportedException, this.PngjInputException, template);
                    generateST = (deduplication + 27) % 128;
                    return a;
                }
            }
            byte[] bArr2 = $$d;
            byte b = (byte) (-bArr2[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr2[24]), bArr2[63], bArr2[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -314941488);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5047;
            com.identy.Fpnative.valueOf = objArr;
            if (template != null) {
            }
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean verifyWithCustomTemplatesbase64(Template template, HashMap<Hand, String> hashMap) {
        Object[] objArr;
        long j;
        int i = generateST + 29;
        int i2 = i % 128;
        deduplication = i2;
        if (i % 2 != 0) {
            throw null;
        }
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (i2 + 35) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                    int i3 = ~startElapsedRealtime;
                    int c = defpackage.a.c(startElapsedRealtime | (-794791673), 54, (((~(i3 | 655327480)) | (~((-655327481) | startElapsedRealtime)) | (-794791673)) * 54) + (((~((-156438201) | i3)) | 0) * (-108)) + 1242291355, -1031448196);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    ((long[]) objArr[0])[0] = j + 4891;
                    com.identy.Fpnative.valueOf = objArr;
                    if (template != null) {
                        throw new UnSupportedTemplateException();
                    }
                    this.uxd565jk = getTempUser();
                    Activity activity = this.getData;
                    int i6 = ((int[]) objArr[1])[0];
                    int i7 = i6 * i6;
                    int i8 = -(424178106 * i6);
                    int i9 = (((i7 ^ i8) + ((i7 & i8) << 1)) - (~(-(i6 * (-426519418))))) - 1;
                    int i10 = ((i9 | 340902912) << 1) - (340902912 ^ i9);
                    int i11 = ((i10 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    int i12 = ((i11 | 1) << 1) - (i11 ^ 1);
                    int i13 = (i10 & i12) + (i12 | i10);
                    int i14 = i10 >> 16;
                    int i15 = (((i14 | (-131071)) << 1) - (i14 ^ (-131071))) / 65536;
                    int i16 = -(i13 ^ (((i15 | 1) << 1) - (i15 ^ 1)));
                    int i17 = ((i16 | 8) << 1) - (i16 ^ 8);
                    int i18 = ((i17 >> 25) - 255) / 128;
                    int i19 = (i18 ^ 1) + ((i18 & 1) << 1);
                    File values2 = com.identy.PngjBadCrcException.values(activity, "22;16;9;TEMP_IDENTY".substring(29888 / (((-((i19 & 1) + (i19 | 1))) & i17) * 467)));
                    for (Map.Entry<Hand, String> entry : hashMap.entrySet()) {
                        Hand key = entry.getKey();
                        ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(Base64.decode(entry.getValue().getBytes(), this.isQualityFailed)));
                        byte[] bArr = new byte[1024];
                        while (true) {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry != null) {
                                generateST = (deduplication + 3) % 128;
                                String name = nextEntry.getName();
                                if (!nextEntry.isDirectory()) {
                                    String str = name.split("_")[1].split("\\.")[0];
                                    File file = new File(values2, name.concat("crypt"));
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    while (true) {
                                        try {
                                            int read = zipInputStream.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, read);
                                        } finally {
                                        }
                                    }
                                    fileOutputStream.close();
                                    File file2 = new File(values2, name);
                                    PngjBadSignature(file.getAbsolutePath(), file2.getAbsolutePath());
                                    if (template.equals(Template.FF_ISO_19794_4)) {
                                        values(new Object[]{this, file2.getAbsolutePath(), PngjException(str), key, this.uxd565jk}, 0, 1779101910, 0, -1779101909, 0, 0);
                                    } else if (template.equals(Template.FF_WSQ)) {
                                        deduplication = (generateST + 7) % 128;
                                        PngjBadCrcException(file2.getAbsolutePath(), PngjException(str), key, this.uxd565jk);
                                    }
                                    zipInputStream.closeEntry();
                                    generateST = (deduplication + 11) % 128;
                                }
                            }
                        }
                    }
                    return a(this.uxd565jk, this.PngjUnsupportedException, this.PngjInputException, template);
                }
            }
            byte[] bArr2 = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr2[11]), (byte) (-bArr2[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr2[63], (byte) (-bArr2[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1031448196);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4891;
            com.identy.Fpnative.valueOf = objArr;
            if (template != null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 47) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean verifyWithTemplates(Template template, HashMap<Pair<Hand, Finger>, String> hashMap) {
        Object[] objArr;
        long j;
        Template template2 = template;
        int i = (generateST + 113) % 128;
        deduplication = i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (i + 25) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-260323724))) | 234895488, 116, ((238565556 | identityHashCode) * 116) + (((~((~identityHashCode) | 263993791)) * (-116)) - 1537692237), 962205956);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 5004;
                    com.identy.Fpnative.valueOf = objArr;
                    if (template2 != null) {
                        throw new Exception(this.getData.getString(R.string.template_type_is_unknown));
                    }
                    if (template2.equals(Template.NIST_ITL_1_2015_RECORD_9) || template2.equals(Template.NIST_ITL_1_2015_RECORD_14)) {
                        throw new Exception("Template type is not valid ".concat(String.valueOf(template)));
                    }
                    this.uxd565jk = getTempUser();
                    Activity activity = this.getData;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(986664203 * i4);
                    int i7 = ((((i5 | i6) << 1) - (i5 ^ i6)) - (~(-(i4 * 1485308653)))) - 1;
                    int i8 = (i7 ^ (-1864187888)) + (((-1864187888) & i7) << 1);
                    int i9 = i8 >> 16;
                    int i10 = ((i9 & (-131071)) + (i9 | (-131071))) / 65536;
                    int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
                    int i12 = (i8 & i11) + (i11 | i8);
                    int i13 = i8 >> 18;
                    int i14 = ((i13 & (-32767)) + (i13 | (-32767))) / 16384;
                    int i15 = (-((((i14 | 1) << 1) - (i14 ^ 1)) ^ i12)) + 4;
                    int i16 = ((i15 >> 17) - 65535) / 32768;
                    int i17 = (i16 & 1) + (i16 | 1);
                    com.identy.PngjBadCrcException.values(activity, "20|11|23|TEMP_IDENTY".substring(24120 / ((i15 & (-((i17 & 1) + (i17 | 1)))) * 670)));
                    for (Map.Entry<Pair<Hand, Finger>, String> entry : hashMap.entrySet()) {
                        generateST = (deduplication + 69) % 128;
                        Pair<Hand, Finger> key = entry.getKey();
                        Hand hand = (Hand) key.first;
                        Finger finger = (Finger) key.second;
                        String value = entry.getValue();
                        Template template3 = Template.PNG;
                        if (template2.equals(template3)) {
                            try {
                                values(new Object[]{this, com.identy.Fpnative.generateID(com.identy.e1.PngjException(this.getData), Position.getFromHandFinger(new Pair(hand, finger)).ordinal(), template3.ordinal(), com.identy.e.valueOf.PngjException(value)), hand, finger, this.uxd565jk}, 0, -320332114, 0, 320332114, 0, 0);
                                deduplication = (generateST + 101) % 128;
                            } catch (Exception unused) {
                            }
                        } else {
                            if (template2.equals(Template.WSQ)) {
                                int i18 = generateST + 33;
                                deduplication = i18 % 128;
                                if (i18 % 2 != 0) {
                                    PngjBadCrcException(value, finger, hand, this.uxd565jk);
                                    throw null;
                                }
                                PngjBadCrcException(value, finger, hand, this.uxd565jk);
                            } else if (template2.equals(Template.ISO_19794_2)) {
                                deduplication = (generateST + 111) % 128;
                                values(value, finger, hand, this.uxd565jk);
                            } else if (template2.equals(Template.ISO_19794_4)) {
                                values(new Object[]{this, value, finger, hand, this.uxd565jk}, 0, 1779101910, 0, -1779101909, 0, 0);
                            } else {
                                Template template4 = Template.ANSI_378_2004;
                                if (template2.equals(template4)) {
                                    values(new Object[]{this, com.identy.Fpnative.generateID(com.identy.e1.PngjException(this.getData), Position.getFromHandFinger(new Pair(hand, finger)).ordinal(), template4.ordinal(), com.identy.e.valueOf.PngjException(value)), hand, finger, this.uxd565jk}, 0, -320332114, 0, 320332114, 0, 0);
                                } else {
                                    valueOf(value, finger, hand, this.uxd565jk, template2);
                                }
                            }
                            template2 = template;
                        }
                    }
                    return verify(this.uxd565jk, this.PngjUnsupportedException, this.PngjInputException);
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 962205956);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5004;
            com.identy.Fpnative.valueOf = objArr;
            if (template2 != null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 101) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (0 <= 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = (int) android.os.SystemClock.uptimeMillis();
        0 = ~0;
        0 = defpackage.a.c(0 | (-285483009), 220, (((~(0 | (-289286305))) | 788175584) * (-440)) + (((784372288 | (~(0 | (-285483009)))) * 220) + 1317303579), -700417004);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0053, code lost:
    
        if (0 <= 0) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean verifyWithTemplatesbyteArray(Template template, HashMap<Pair<Hand, Finger>, byte[]> hashMap) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                int i = deduplication + 91;
                generateST = i % 128;
                if (i % 2 == 0) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) objArr[0])[0] = j + 4975;
                com.identy.Fpnative.valueOf = objArr;
                if (template != null) {
                    throw new UnSupportedTemplateException();
                }
                int i2 = deduplication + 77;
                generateST = i2 % 128;
                if (i2 % 2 == 0) {
                    template.equals(Template.NIST_ITL_1_2015_RECORD_9);
                    throw null;
                }
                if (template.equals(Template.NIST_ITL_1_2015_RECORD_9) || template.equals(Template.NIST_ITL_1_2015_RECORD_14)) {
                    throw new Exception("Template type is not valid ".concat(String.valueOf(template)));
                }
                this.uxd565jk = getTempUser();
                if (!this.setFingers) {
                    deduplication = (generateST + 5) % 128;
                    this.DeduplicationIdentyResponse = QualityMode.VERIFICATION;
                }
                Activity activity = this.getData;
                int i3 = ((int[]) objArr[1])[0];
                int i4 = i3 * i3;
                int i5 = -(886158370 * i3);
                int i6 = (i4 & i5) + (i4 | i5);
                int i7 = -(i3 * 485583982);
                int i8 = ((i6 ^ i7) + ((i7 & i6) << 1)) - (-1877021760);
                int i9 = i8 >> 22;
                int i10 = ((i9 & (-2047)) + (i9 | (-2047))) / 1024;
                int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
                int i12 = (i8 ^ i11) + ((i11 & i8) << 1);
                int i13 = i8 >> 24;
                int i14 = ((i13 & (-511)) + (i13 | (-511))) / 256;
                int i15 = (-(((i14 & 1) + (i14 | 1)) ^ i12)) + 9;
                File values2 = com.identy.PngjBadCrcException.values(activity, "16/TEMP_IDENTY".substring(297 / ((i15 & (-IdentyB.e(i15 >> 27, 63, 32, -2))) * 11)));
                Iterator<Map.Entry<Pair<Hand, Finger>, byte[]>> it = hashMap.entrySet().iterator();
                while (!(!it.hasNext())) {
                    Map.Entry<Pair<Hand, Finger>, byte[]> next = it.next();
                    Pair<Hand, Finger> key = next.getKey();
                    Hand hand = (Hand) key.first;
                    Finger finger = (Finger) key.second;
                    byte[] value = next.getValue();
                    Template template2 = Template.PNG;
                    if (template.equals(template2)) {
                        try {
                            values(new Object[]{this, com.identy.Fpnative.generateID(com.identy.e1.PngjException(this.getData), Position.getFromHandFinger(new Pair(hand, finger)).ordinal(), template2.ordinal(), value), hand, finger, this.uxd565jk}, 0, -320332114, 0, 320332114, 0, 0);
                        } catch (Exception unused) {
                        }
                    } else if (template.equals(Template.WSQ)) {
                        valueOf(value, finger, hand, this.uxd565jk);
                    } else if (template.equals(Template.ISO_19794_2)) {
                        int i16 = deduplication + 55;
                        generateST = i16 % 128;
                        if (i16 % 2 == 0) {
                            values(new Object[]{this, value, finger, hand, this.uxd565jk}, 0, -994925292, 0, 994925295, 0, 0);
                            int i17 = 44 / 0;
                        } else {
                            values(new Object[]{this, value, finger, hand, this.uxd565jk}, 0, -994925292, 0, 994925295, 0, 0);
                        }
                    } else if (template.equals(Template.ISO_19794_4)) {
                        PngjBadCrcException(value, finger, hand, this.uxd565jk);
                    } else {
                        Template template3 = Template.ANSI_378_2004;
                        if (template.equals(template3)) {
                            values(new Object[]{this, com.identy.Fpnative.generateID(com.identy.e1.PngjException(this.getData), Position.getFromHandFinger(new Pair(hand, finger)).ordinal(), template3.ordinal(), value), hand, finger, this.uxd565jk}, 0, -320332114, 0, 320332114, 0, 0);
                        } else {
                            values(new Object[]{this, com.identy.Fpnative.generateID(com.identy.e1.PngjException(this.getData), Position.getFromHandFinger(new Pair(hand, finger)).ordinal(), template.ordinal(), value), hand, finger, this.uxd565jk}, 0, -320332114, 0, 320332114, 0, 0);
                        }
                    }
                }
                try {
                    com.identy.app.PngjBadSignature.values(values2);
                } catch (Exception unused2) {
                }
                return a(this.uxd565jk, this.PngjUnsupportedException, this.PngjInputException, template);
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -700417004);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4975;
            com.identy.Fpnative.valueOf = objArr;
            if (template != null) {
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0100, code lost:
    
        return 0.pfkrolfinalize;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0101, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0102, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0106, code lost:
    
        if (0 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0108, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0109, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001d, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (0 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = ~((int) android.os.Process.getStartElapsedRealtime());
        0 = defpackage.a.c((~((-942848469) | 0)) | (~(0 | (-443959189))), 590, ((((~(443959188 | 0)) | (-980877269)) | (~(942848468 | 0))) * (-1180)) + ((((~(0 | (-405930389))) | 0) * 590) - 1673842111), -720553400);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 29) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x001b, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0098, code lost:
    
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 111) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a1, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = new java.lang.Object[1];
        d((short) 149, (byte) (-$$a[11]), (byte) (-$$a[111(0x6f, float:1.56E-43)]), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) 106, $$a[63], (byte) (-$$a[55]), 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, -720553400);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ed, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00f3, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4980;
        com.identy.Fpnative.valueOf = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean x() {
        Object[] objArr;
        int i = generateST + 119;
        deduplication = i % 128;
        if (i % 2 != 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i2 = 5 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (0 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0034, code lost:
    
        if (0 <= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0052, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c((~((~0) | 184141136)) | (-314748144), 168, (((~(0 | 184141136)) | (-452718080)) * (-168)) + ((((~((-314748144) | 0)) | 46171200) * 336) - 1710130969), 534473634);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean y() {
        long j;
        int i;
        int i2 = generateST;
        deduplication = (i2 + 81) % 128;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i3 = i2 + 117;
                deduplication = i3 % 128;
                if (i3 % 2 != 0) {
                    long j2 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4951;
                com.identy.Fpnative.valueOf = null;
                boolean z = this.g;
                i = generateST + 53;
                deduplication = i % 128;
                if (i % 2 != 0) {
                    int i4 = 23 / 0;
                }
                return z;
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr2 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 534473634);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4951;
            com.identy.Fpnative.valueOf = objArr4;
            boolean z2 = this.g;
            i = generateST + 53;
            deduplication = i % 128;
            if (i % 2 != 0) {
            }
            return z2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private void PngjBadCrcException(byte[] bArr, Finger finger, Hand hand, IdentyUser identyUser) {
        try {
            values(new Object[]{this, com.identy.Fpnative.generateID(com.identy.e1.PngjException(this.getData), Position.getFromHandFinger(new Pair(hand, finger)).ordinal(), Template.ISO_19794_4.ordinal(), bArr), hand, finger, identyUser}, 0, -320332114, 0, 320332114, 0, 0);
            generateST = (deduplication + 75) % 128;
        } catch (Exception unused) {
        }
    }

    public final String values() {
        PackageInfo packageInfo;
        CertificateFactory certificateFactory;
        X509Certificate x509Certificate;
        deduplication = (generateST + 87) % 128;
        try {
            packageInfo = this.getData.getPackageManager().getPackageInfo(this.getData.getPackageName(), 64);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(packageInfo.signatures[0].toByteArray());
        try {
            certificateFactory = CertificateFactory.getInstance("X509");
        } catch (CertificateException e2) {
            e2.printStackTrace();
            certificateFactory = null;
        }
        try {
            x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
        } catch (CertificateException e3) {
            e3.printStackTrace();
            x509Certificate = null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getEncoded());
            StringBuilder sb = new StringBuilder(digest.length << 1);
            for (int i = 0; i < digest.length; i++) {
                String hexString = Integer.toHexString(digest[i]);
                int length = hexString.length();
                if (length == 1) {
                    generateST = (deduplication + 91) % 128;
                    hexString = "0".concat(hexString);
                }
                if (length > 2) {
                    hexString = hexString.substring(length - 2, length);
                }
                sb.append(hexString.toUpperCase());
                if (i < digest.length - 1) {
                    sb.append(':');
                }
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
            deduplication = (generateST + 5) % 128;
            return null;
        } catch (CertificateEncodingException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static Finger PngjException(String str) {
        deduplication = (generateST + 117) % 128;
        String lowerCase = str.toLowerCase();
        if (!lowerCase.equals("index")) {
            if (lowerCase.equals("middle")) {
                return Finger.MIDDLE;
            }
            if (lowerCase.equals("ring")) {
                generateST = (deduplication + 77) % 128;
                Finger finger = Finger.RING;
                generateST = (deduplication + 69) % 128;
                return finger;
            }
            if (lowerCase.equals("little")) {
                return Finger.LITTLE;
            }
            if (!lowerCase.equals("thumb")) {
                return null;
            }
            generateST = (deduplication + 121) % 128;
            return Finger.THUMB;
        }
        generateST = (deduplication + 43) % 128;
        return Finger.INDEX;
    }

    private void PngjBadCrcException(String str) {
        try {
            boolean z = true;
            if (this.getMatchingTime == null) {
                int i = (deduplication + 67) % 128;
                generateST = i;
                if (this.getOveralTimetaken == null) {
                    int i2 = i + 41;
                    deduplication = i2 % 128;
                    if (i2 % 2 == 0) {
                        z = false;
                    }
                }
            }
            this.Capture2IndexActivity = Calendar.getInstance().getTimeInMillis();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(",");
            sb.append(this.Capture2IndexActivity);
            sb.append(",v11|");
            sb.append(this.Action.getShortform());
            sb.append("|");
            sb.append(this.PngjOutputException.getShortform());
            sb.append("|8000.0|");
            sb.append(getAllowedAttempts());
            sb.append("|");
            sb.append(getAllowedTimeLimit());
            sb.append("|");
            sb.append(String.valueOf(z).charAt(0));
            sb.append("|");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.getCaptureTime);
            sb.append(sb2.toString().charAt(0));
            sb.append("$");
            this.EnrollFingersActivity = sb.toString();
        } catch (Exception unused) {
        }
    }

    private void PngjBadCrcException(String str, Finger finger, Hand hand, IdentyUser identyUser) {
        try {
            values(new Object[]{this, com.identy.Fpnative.generateID(com.identy.e1.PngjException(this.getData), Position.getFromHandFinger(new Pair(hand, finger)).ordinal(), Template.WSQ.ordinal(), com.identy.e.valueOf.PngjException(str)), hand, finger, identyUser}, 0, -320332114, 0, 320332114, 0, 0);
            int i = deduplication + 69;
            generateST = i % 128;
            if (i % 2 == 0) {
                int i2 = 46 / 0;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void valueOf(byte[] bArr, Finger finger, Hand hand, IdentyUser identyUser) {
        try {
            values(new Object[]{this, com.identy.Fpnative.generateID(com.identy.e1.PngjException(this.getData), Position.getFromHandFinger(new Pair(hand, finger)).ordinal(), Template.WSQ.ordinal(), bArr), hand, finger, identyUser}, 0, -320332114, 0, 320332114, 0, 0);
            deduplication = (generateST + 45) % 128;
        } catch (Exception unused) {
        }
    }

    private Attempt PngjBadCrcException(Hand hand, Finger finger, IdentyA aVar, long j, long j2, long j3, int i, String str) {
        try {
            if (!this.h.containsKey(hand)) {
                this.h.put(hand, new HashMap());
                generateST = (deduplication + 27) % 128;
            }
            Map map = (Map) this.h.get(hand);
            List arrayList = new ArrayList();
            if (map.containsKey(finger)) {
                arrayList = ((getPadSub3) map.get(finger)).PngjOutputException;
            }
            Attempt attempt = new Attempt(aVar.values, aVar.PngjException, aVar.Attempt(), aVar.e1(), aVar.onErrorResponse(), aVar.PngjPrematureEnding(), aVar.PngjInputException(), aVar.PngBadCharsetException(), aVar.Action(), aVar.a(), j, j2, j3, aVar.valueOf(), false, str, aVar.PngjUnsupportedException, i, aVar.PngjUnsupportedException(), null);
            Hand hand2 = aVar.PngjOutputException;
            Finger finger2 = aVar.PngjExceptionInternal;
            Date date = aVar.PngjBadSignature;
            Map PngjExceptionInternal = aVar.PngjExceptionInternal();
            double d = aVar.PngjException;
            int i2 = aVar.values;
            int Attempt = aVar.Attempt();
            float onErrorResponse = aVar.onErrorResponse();
            boolean PngjOutputException = aVar.PngjOutputException();
            Mat mat = aVar.PngjPrematureEnding;
            getPadSub3 getpadsub3 = new getPadSub3(hand2, finger2, date, PngjExceptionInternal, d, i2, Attempt, onErrorResponse, PngjOutputException, mat, aVar.a, j, j2, j3, null, Mat.n_cols(mat.PngjException), aVar.PngjUnsupportedException, aVar.PngjBadCrcException, aVar.PngjUnsupportedException());
            arrayList.add(attempt);
            getpadsub3.PngjOutputException = arrayList;
            map.put(finger, getpadsub3);
            return attempt;
        } catch (Exception unused) {
            generateST = (deduplication + 81) % 128;
            return null;
        }
    }

    private void valueOf(String str, Finger finger, Hand hand, IdentyUser identyUser, Template template) {
        try {
            values(new Object[]{this, com.identy.Fpnative.generateID(com.identy.e1.PngjException(this.getData), Position.getFromHandFinger(new Pair(hand, finger)).ordinal(), template.ordinal(), com.identy.e.valueOf.PngjException(str)), hand, finger, identyUser}, 0, -320332114, 0, 320332114, 0, 0);
            generateST = (deduplication + 37) % 128;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x015d, code lost:
    
        if (0.canClub() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01cb, code lost:
    
        0 = new java.util.ArrayList();
        0 = 0.setScore;
        0 = 0.length;
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x01d4, code lost:
    
        if (0 >= 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01d6, code lost:
    
        0 = com.identy.IdentySdk.generateST + 35;
        com.identy.IdentySdk.deduplication = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01df, code lost:
    
        if ((0 % 2) != 0) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x01e1, code lost:
    
        0 = $$a[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01e7, code lost:
    
        if (0.canClub() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01ed, code lost:
    
        if (0.getCode() == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01fb, code lost:
    
        if (0.getCode().equals(0.getCode()) == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0209, code lost:
    
        if (0.getHand().equals(0.getHand()) != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x020b, code lost:
    
        0.add(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x020e, code lost:
    
        0 = 0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0211, code lost:
    
        false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0216, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021b, code lost:
    
        if (0.size() != 1) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021d, code lost:
    
        0 = com.identy.IdentySdk.deduplication + 85;
        com.identy.IdentySdk.generateST = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0226, code lost:
    
        if ((0 % 2) != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0228, code lost:
    
        0 = 98 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0233, code lost:
    
        if (0.e.equals(com.identy.Action.VERIFY) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0241, code lost:
    
        0 = new java.util.ArrayList();
        0 = 0.setScore;
        0 = 0.length;
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x024a, code lost:
    
        if (0 >= 0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x024c, code lost:
    
        0 = $$a[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0252, code lost:
    
        if (0.canClub() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0258, code lost:
    
        if (0.getCode() == null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0266, code lost:
    
        if (0.getCode().equals(0.getCode()) != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0269, code lost:
    
        0.add(0.changeHand());
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0270, code lost:
    
        0 = 0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0281, code lost:
    
        if (isEnrolled((com.identy.enums.FingerDetectionMode[]) 0.toArray(new com.identy.enums.FingerDetectionMode[0]), 0.uxd565jk) != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0283, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0284, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x023e, code lost:
    
        if (0.e.equals(com.identy.Action.VERIFY) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0166, code lost:
    
        0 = new java.util.ArrayList();
        0 = 0.setScore;
        0 = 0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016e, code lost:
    
        if (0 >= 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0170, code lost:
    
        0 = $$a[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0176, code lost:
    
        if (0.getCode() == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0184, code lost:
    
        if (0.getCode().equals(0.getCode()) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0186, code lost:
    
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 113) % 128;
        0.add(0.changeHand());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0195, code lost:
    
        0 = 0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019c, code lost:
    
        if (0.size() != 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019e, code lost:
    
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 37) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ae, code lost:
    
        if (0.e.equals(com.identy.Action.VERIFY) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b0, code lost:
    
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 39) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c6, code lost:
    
        if (isEnrolled(new com.identy.enums.FingerDetectionMode[]{0.changeHand()}, 0.uxd565jk) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ca, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0164, code lost:
    
        if (0.canClub() == false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0160  */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(FingerDetectionMode fingerDetectionMode) {
        Object[] objArr;
        long j;
        int i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        int i2 = 0;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                    int c = defpackage.a.c((~(startUptimeMillis | (-365713586))) | (~(864602865 | startUptimeMillis)) | 71569408, -1444, (((~startUptimeMillis) | 642028096) * 1444) + 1078082705, -1109255430);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4934;
                    com.identy.Fpnative.valueOf = objArr;
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = i5 * i5;
                    int i7 = -(1346608448 * i5);
                    int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
                    int i9 = -(i5 * 73907268);
                    int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                    int i11 = (i10 ^ (-714521852)) + (((-714521852) & i10) << 1);
                    int e = IdentyB.e(i11 >> 17, 65535, 32768, -1);
                    int i12 = (i11 ^ e) + ((e & i11) << 1);
                    int i13 = ((i11 >> 16) - 131071) / 65536;
                    int i14 = (-(i12 ^ ((i13 & 1) + (i13 | 1)))) + 4;
                    int i15 = i14 >> 28;
                    int i16 = ((i15 ^ (-31)) + ((i15 & (-31)) << 1)) / 16;
                    int i17 = (i16 ^ 1) + ((i16 & 1) << 1);
                    int i0 = 0 / ((i14 & (-((i17 ^ 1) + ((i17 & 1) << 1)))) * 472);
                    if (this.e != null && this.setDConfig && !fingerDetectionMode.equals(FingerDetectionMode.TWO_THUMB)) {
                        i = generateST + 109;
                        deduplication = i % 128;
                        if (i % 2 == 0) {
                            int i18 = 41 / 0;
                        }
                    }
                    return false;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1421437364);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4934;
            com.identy.Fpnative.valueOf = objArr;
            int i52 = ((int[]) objArr[1])[0];
            int i62 = i52 * i52;
            int i72 = -(1346608448 * i52);
            int i82 = ((i62 | i72) << 1) - (i62 ^ i72);
            int i92 = -(i52 * 73907268);
            int i102 = ((i82 | i92) << 1) - (i92 ^ i82);
            int i112 = (i102 ^ (-714521852)) + (((-714521852) & i102) << 1);
            int e2 = IdentyB.e(i112 >> 17, 65535, 32768, -1);
            int i122 = (i112 ^ e2) + ((e2 & i112) << 1);
            int i132 = ((i112 >> 16) - 131071) / 65536;
            int i142 = (-(i122 ^ ((i132 & 1) + (i132 | 1)))) + 4;
            int i152 = i142 >> 28;
            int i162 = ((i152 ^ (-31)) + ((i152 & (-31)) << 1)) / 16;
            int i172 = (i162 ^ 1) + ((i162 & 1) << 1);
            int i0 = 0 / ((i142 & (-((i172 ^ 1) + ((i172 & 1) << 1)))) * 472);
            if (this.e != null) {
                i = generateST + 109;
                deduplication = i % 128;
                if (i % 2 == 0) {
                }
            }
            return false;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        deduplication = (generateST + 51) % 128;
    }

    private void valueOf(byte[] bArr, Hand hand, Finger finger, IdentyUser identyUser) {
        values(new Object[]{this, bArr, hand, finger, identyUser}, 0, -320332114, 0, 320332114, 0, 0);
    }

    private Attempt valueOf(Hand hand, Finger finger, long j, HashMap hashMap) {
        return (Attempt) values(new Object[]{this, hand, finger, Long.valueOf(j), hashMap}, 0, 1772618473, 0, -1772618471, 0, 0);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(4:(10:3|(1:5)(1:25)|8|9|10|(1:12)|13|14|15|17)|14|15|17)|27|28|29|8|9|10|(0)|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010d, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x010e, code lost:
    
        0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
    
        if (0 <= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        if (0 <= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = defpackage.a.a();
        0 = defpackage.a.c((~((~0) | 265367195)) | (-803057372), -964, (((~(265367195 | 0)) | (-764256476)) * (-964)) + 79114847, 456133358);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(String str) {
        long j;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            try {
                if (objArr != null) {
                    int i = deduplication + 71;
                    generateST = i % 128;
                    if (i % 2 == 0) {
                        long j2 = ((long[]) objArr[0])[1];
                        j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, new Object[1])).longValue();
                    } else {
                        long j3 = ((long[]) objArr[0])[0];
                        j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    }
                    ((long[]) $$a_state[0])[0] = j + 5047;
                    com.identy.Fpnative.valueOf = null;
                    Runtime runtime = Runtime.getRuntime();
                    runtime.totalMemory();
                    runtime.freeMemory();
                    runtime.maxMemory();
                    if (LibSettings.isSaveCaptured()) {
                        generateST = (deduplication + 117) % 128;
                    }
                    int i2 = ((int[]) $$a_state[1])[0];
                    int i3 = i2 * i2;
                    int i4 = -(581178453 * i2);
                    int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
                    int i6 = -(i2 * (-1706124547));
                    int i7 = (i5 & i6) + (i6 | i5);
                    int i8 = (i7 ^ 398871953) + ((398871953 & i7) << 1);
                    int i9 = i8 >> 21;
                    int i10 = ((i9 & (-4095)) + (i9 | (-4095))) / 2048;
                    int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
                    int i12 = (i8 & i11) + (i11 | i8);
                    int i13 = i8 >> 16;
                    int i14 = (((i13 | (-131071)) << 1) - (i13 ^ (-131071))) / 65536;
                    int i15 = -(((i14 & 1) + (i14 | 1)) ^ i12);
                    int i16 = (i15 ^ 6) + ((i15 & 6) << 1);
                    int i17 = i16 >> 28;
                    int i18 = (((i17 | (-31)) << 1) - (i17 ^ (-31))) / 16;
                    "26/26/3/Memory".substring(8880 / (((-((((i18 | 1) << 1) - (i18 ^ 1)) + 1)) & i16) * 185));
                    LibSettings.isSaveCaptured();
                    return;
                }
                LibSettings.isSaveCaptured();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 456133358);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 5047;
            com.identy.Fpnative.valueOf = objArr4;
            Runtime runtime2 = Runtime.getRuntime();
            runtime2.totalMemory();
            runtime2.freeMemory();
            runtime2.maxMemory();
            if (LibSettings.isSaveCaptured()) {
            }
            int i22 = ((int[]) objArr4[1])[0];
            int i32 = i22 * i22;
            int i42 = -(581178453 * i22);
            int i52 = ((i32 | i42) << 1) - (i32 ^ i42);
            int i62 = -(i22 * (-1706124547));
            int i72 = (i52 & i62) + (i62 | i52);
            int i82 = (i72 ^ 398871953) + ((398871953 & i72) << 1);
            int i92 = i82 >> 21;
            int i102 = ((i92 & (-4095)) + (i92 | (-4095))) / 2048;
            int i112 = ((i102 | 1) << 1) - (i102 ^ 1);
            int i122 = (i82 & i112) + (i112 | i82);
            int i132 = i82 >> 16;
            int i142 = (((i132 | (-131071)) << 1) - (i132 ^ (-131071))) / 65536;
            int i152 = -(((i142 & 1) + (i142 | 1)) ^ i122);
            int i162 = (i152 ^ 6) + ((i152 & 6) << 1);
            int i172 = i162 >> 28;
            int i182 = (((i172 | (-31)) << 1) - (i172 ^ (-31))) / 16;
            "26/26/3/Memory".substring(8880 / (((-((((i182 | 1) << 1) - (i182 ^ 1)) + 1)) & i162) * 185));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private Attempt PngjException(Hand hand, Finger finger, long j, float f, boolean z, int i, float f2, float f3, float f4, float f5, float f6, double d, int i2, String str, int i3, boolean z2, int i4, FingerAS fingerAS) {
        generateST = (deduplication + 63) % 128;
        try {
            if (!this.h.containsKey(hand)) {
                this.h.put(hand, new HashMap());
                deduplication = (generateST + 111) % 128;
            }
            Map map = (Map) this.h.get(hand);
            List arrayList = new ArrayList();
            if (map.containsKey(finger)) {
                generateST = (deduplication + 69) % 128;
                arrayList = ((getPadSub3) map.get(finger)).PngjOutputException;
            }
            Attempt attempt = new Attempt(0, d, i2, i, f, f2, f3, f4, f5, f6, j, 0L, 0L, false, false, str, i3, i4, fingerAS, null);
            List list = arrayList;
            getPadSub3 getpadsub3 = new getPadSub3(hand, finger, new Date(), null, 0.0d, 0, -1, f, z, null, null, j, 0L, 0L, new PngBadCharsetException(), 0, i3, null, fingerAS);
            list.add(attempt);
            getpadsub3.PngjOutputException = list;
            map.put(finger, getpadsub3);
            return attempt;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0100, code lost:
    
        if (0 != null) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk setASServerConfig(String str, String str2, boolean z) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (generateST + 29) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i = (int) Runtime.getRuntime().totalMemory();
                    int c = defpackage.a.c(~((-5013505) | (~i)), -948, (((~((-208658971) | i)) | (-290230310)) * (-948)) + 478671235, -1504776091);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4942;
                    com.identy.Fpnative.valueOf = objArr;
                    if (z) {
                        int i4 = deduplication + 111;
                        generateST = i4 % 128;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                    }
                    if (str != null) {
                        generateST = (deduplication + 121) % 128;
                        this.getOveralTimetaken = str2;
                        this.getMatchingTime = str;
                        this.getCaptureTime = z;
                        return this;
                    }
                    int i5 = ((int[]) objArr[1])[0];
                    int i6 = i5 * i5;
                    int i7 = -(1530378858 * i5);
                    int i8 = (i6 & i7) + (i6 | i7);
                    int i9 = -(i5 * 419599580);
                    int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                    int i11 = (i10 & (-586083895)) + ((-586083895) | i10);
                    int i12 = i11 >> 28;
                    int a = IdentyB.a(i12 ^ (-31), (i12 & (-31)) << 1, 16, -1);
                    int i13 = (-(IdentyB.e(i11 >> 27, 63, 32, -1) ^ ((i11 & a) + (a | i11)))) + 6;
                    int i14 = i13 >> 21;
                    int i15 = (((i14 | (-4095)) << 1) - (i14 ^ (-4095))) / 2048;
                    throw new LivenessValidException(IdentyB.c(i13 & (-((((i15 | 1) << 1) - (i15 ^ 1)) - (-1))), 353, 21180, "20;16;5;9; Make sure server AS configuration is not null"));
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1722401695);
            j = ((long[]) objArr[0])[0];
            generateST = (deduplication + 53) % 128;
            ((long[]) objArr[0])[0] = j + 4942;
            com.identy.Fpnative.valueOf = objArr;
            if (z) {
            }
            if (str != null) {
            }
            int i52 = ((int[]) objArr[1])[0];
            int i62 = i52 * i52;
            int i72 = -(1530378858 * i52);
            int i82 = (i62 & i72) + (i62 | i72);
            int i92 = -(i52 * 419599580);
            int i102 = ((i82 | i92) << 1) - (i92 ^ i82);
            int i112 = (i102 & (-586083895)) + ((-586083895) | i102);
            int i122 = i112 >> 28;
            int a2 = IdentyB.a(i122 ^ (-31), (i122 & (-31)) << 1, 16, -1);
            int i132 = (-(IdentyB.e(i112 >> 27, 63, 32, -1) ^ ((i112 & a2) + (a2 | i112)))) + 6;
            int i142 = i132 >> 21;
            int i152 = (((i142 | (-4095)) << 1) - (i142 ^ (-4095))) / 2048;
            throw new LivenessValidException(IdentyB.c(i132 & (-((((i152 | 1) << 1) - (i152 ^ 1)) - (-1))), 353, 21180, "20;16;5;9; Make sure server AS configuration is not null"));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 7) % 128;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:18|(1:20)|21|(13:23|(1:25)(1:49)|27|(1:29)|30|(1:48)(1:34)|35|(1:37)(1:47)|(1:39)(1:46)|40|41|42|43)|51|(2:53|54)|27|(0)|30|(1:32)|48|35|(0)(0)|(0)(0)|40|41|42|43) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x011d, code lost:
    
        if (0.getOveralTimetaken != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        if (0.getOveralTimetaken != null) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00dd  */
    /* JADX WARN: Type inference failed for: r2v32, types: [com.identy.enums.FingerDetectionMode[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v33, types: [com.identy.enums.FingerDetectionMode[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean enroll() {
        Object[] objArr;
        long j;
        FingerDetectionMode[] fingerDetectionModeArr;
        boolean z;
        Hand hand;
        boolean contains;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-421469783))) | (-496984064), 433, (((~((-77419498) | identityHashCode)) | (-421469783)) * (-433)) + ((~((~identityHashCode) | (-419564567))) * 433) + 1848971234, -1938024387);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4876;
                    com.identy.Fpnative.valueOf = objArr;
                    fingerDetectionModeArr = this.setScore;
                    if (fingerDetectionModeArr != null) {
                        int i3 = generateST;
                        int i4 = i3 + 57;
                        deduplication = i4 % 128;
                        if (i4 % 2 != 0) {
                            throw null;
                        }
                        if (fingerDetectionModeArr.length != 0) {
                            int i5 = i3 + 31;
                            deduplication = i5 % 128;
                            if (i5 % 2 == 0) {
                                if (!H()) {
                                    return false;
                                }
                                if (this.uxd565jk == null) {
                                    this.uxd565jk = getDefaultUser();
                                }
                                this.e = com.identy.Action.ENROLL;
                                if (this.getMatchingTime == null) {
                                    int i6 = deduplication + 43;
                                    generateST = i6 % 128;
                                    if (i6 % 2 == 0) {
                                        int i7 = 81 / 0;
                                    }
                                    if (!this.setFingers) {
                                        generateST = (deduplication + 119) % 128;
                                        this.DeduplicationIdentyResponse = QualityMode.ENROLLMENT;
                                    }
                                    this.h = new HashMap();
                                    z = this.setScore[0].getFinger() == null && this.setScore[0].getFinger().equals(Finger.THUMB);
                                    if (this.setScore[0].getHand() != null) {
                                        hand = Hand.LEFT;
                                    } else {
                                        FingerDetectionMode[] fingerDetectionModeArr2 = this.setScore;
                                        int i8 = ((int[]) objArr[1])[0];
                                        int i9 = i8 * i8;
                                        int i10 = -(1297517132 * i8);
                                        int i11 = (i9 & i10) + (i9 | i10);
                                        int i12 = -(i8 * 1575277570);
                                        int i13 = (i11 & i12) + (i12 | i11);
                                        int i14 = (i13 & 866932721) + (866932721 | i13);
                                        int i15 = ((i14 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                                        int i16 = (i15 ^ 1) + ((i15 & 1) << 1);
                                        int i17 = -(((i14 ^ i16) + ((i16 & i14) << 1)) ^ IdentyB.e(i14 >> 25, KotlinVersion.MAX_COMPONENT_VALUE, 128, -1));
                                        int i18 = ((i17 | 3) << 1) - (i17 ^ 3);
                                        int i19 = ((i18 >> 21) - 4095) / 2048;
                                        int i20 = (i19 ^ 1) + ((i19 & 1) << 1);
                                        hand = fingerDetectionModeArr2[0 / (((-(((i20 | 1) << 1) - (i20 ^ 1))) & i18) * 644)].getHand();
                                    }
                                    if (!z) {
                                        contains = this.PngjPrematureEnding.contains(hand);
                                    } else {
                                        contains = this.PngjExceptionInternal.contains(hand);
                                    }
                                    Activity activity = this.getData;
                                    Intent intent = new Intent(activity, (Class<?>) GuideNoGuideHelper.getRegistrationClass(activity, contains, this.setScore));
                                    intent.putExtra("type", "register");
                                    intent.putExtra(getL2Score, (Serializable) this.setScore);
                                    intent.putExtra(isAuthSucess, (Serializable) this.setScore);
                                    this.getData.startActivityForResult(intent, 101);
                                    PngjBadCrcException(this.e.toString());
                                    return true;
                                }
                                if (!this.getNfiq1Score) {
                                    PngjBadSignature();
                                    return true;
                                }
                                if (!this.setFingers) {
                                }
                                this.h = new HashMap();
                                if (this.setScore[0].getFinger() == null) {
                                }
                                if (this.setScore[0].getHand() != null) {
                                }
                                if (!z) {
                                }
                                Activity activity2 = this.getData;
                                Intent intent2 = new Intent(activity2, (Class<?>) GuideNoGuideHelper.getRegistrationClass(activity2, contains, this.setScore));
                                intent2.putExtra("type", "register");
                                intent2.putExtra(getL2Score, (Serializable) this.setScore);
                                intent2.putExtra(isAuthSucess, (Serializable) this.setScore);
                                this.getData.startActivityForResult(intent2, 101);
                                PngjBadCrcException(this.e.toString());
                                return true;
                            }
                            H();
                            throw null;
                        }
                    }
                    throw new NoDetectionModeException();
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1938024387);
            j = ((long[]) objArr[0])[0];
            generateST = (deduplication + 21) % 128;
            ((long[]) objArr[0])[0] = j + 4876;
            com.identy.Fpnative.valueOf = objArr;
            fingerDetectionModeArr = this.setScore;
            if (fingerDetectionModeArr != null) {
            }
            throw new NoDetectionModeException();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0121, code lost:
    
        if (0.length != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x012b, code lost:
    
        if (H() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x012d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x012e, code lost:
    
        0.e = com.identy.Action.VERIFY;
        valueOf();
        0.uxd565jk = 0;
        0.h = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0140, code lost:
    
        if (0.setFingers != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0142, code lost:
    
        0.DeduplicationIdentyResponse = com.identy.QualityMode.VERIFICATION;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x014c, code lost:
    
        if (isEnrolled(0.setScore, 0) == true) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x014e, code lost:
    
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 75) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0156, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0159, code lost:
    
        if (0.getMatchingTime != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x015d, code lost:
    
        if (0.getOveralTimetaken == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x016b, code lost:
    
        if (0.setScore[0].getFinger() == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x017b, code lost:
    
        if (0.setScore[0].getFinger().equals(com.identy.enums.Finger.THUMB) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x017d, code lost:
    
        0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0180, code lost:
    
        0 = 0.setScore;
        0 = ((int[]) $$a_state[1])[0];
        0 = 0 * 0;
        0 = -(2042505826 * 0);
        0 = (0 & 0) + (0 | 0);
        0 = -(0 * 1967533676);
        0 = ((0 & 0) + (0 | 0)) - 498101903;
        0 = ((0 >> 17) - 65535) / 32768;
        0 = ((0 | 1) << 1) - (0 ^ 1);
        0 = (0 ^ 0) + ((0 & 0) << 1);
        0 = 0 >> 25;
        0 = (((0 | (-255)) << 1) - (0 ^ (-255))) / 128;
        0 = (-(0 ^ ((0 ^ 1) + ((0 & 1) << 1)))) + 9;
        0 = 0 >> 17;
        0 = ((0 & (-65535)) + (0 | (-65535))) / 32768;
        0 = (0 & 1) + (0 | 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01e7, code lost:
    
        if (null != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01e9, code lost:
    
        0 = com.identy.enums.Hand.LEFT;
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 59) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01fc, code lost:
    
        if (0 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01fe, code lost:
    
        0 = com.identy.IdentySdk.generateST + 45;
        com.identy.IdentySdk.deduplication = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0207, code lost:
    
        if ((0 % 2) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0209, code lost:
    
        0 = 0.PngjPrematureEnding.contains(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021c, code lost:
    
        0 = 0.getData;
        0 = new android.content.Intent(0, (java.lang.Class<?>) com.identy.GuideNoGuideHelper.getVerifyClass(0, 0, 0.setScore));
        0.putExtra("type", "verify");
        0.putExtra(com.identy.IdentySdk.getL2Score, (java.io.Serializable) 0.setScore);
        0.putExtra(com.identy.IdentySdk.isAuthSucess, (java.io.Serializable) 0.setScore);
        0.getData.startActivityForResult(0, 102);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0245, code lost:
    
        PngjBadCrcException(0.e.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0210, code lost:
    
        0.PngjPrematureEnding.contains(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0215, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0216, code lost:
    
        0 = 0.PngjExceptionInternal.contains(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f4, code lost:
    
        0 = 0.setScore[0].getHand();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x017f, code lost:
    
        0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0161, code lost:
    
        if (0.getNfiq1Score == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x024f, code lost:
    
        PngjBadSignature();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0252, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0125, code lost:
    
        if (0.length != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x004a, code lost:
    
        if (0 <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002e, code lost:
    
        if (0 <= 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004d, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c((~(0 | (-711239482))) | 212350201, 318, (((~(711239481 | 0)) | (-787265530)) * (-318)) + ((((~((-574915329) | 0)) | (~((~0) | (-76026049)))) * (-318)) - 1144853787), 33161694);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 29) % 128;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0113  */
    /* JADX WARN: Type inference failed for: r1v31, types: [com.identy.enums.FingerDetectionMode[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v32, types: [com.identy.enums.FingerDetectionMode[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean verify(IdentyUser identyUser, int i, int i2) {
        long j;
        FingerDetectionMode[] fingerDetectionModeArr;
        Object[] objArr = com.identy.Fpnative.valueOf;
        try {
            if (objArr != null) {
                int i3 = deduplication + 81;
                generateST = i3 % 128;
                if (i3 % 2 == 0) {
                    long j2 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[1]).invoke(null, null)).longValue();
                } else {
                    long j3 = ((long[]) objArr[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                }
                ((long[]) $$a_state[0])[0] = j + 4876;
                com.identy.Fpnative.valueOf = null;
                this.PngjUnsupportedException = i;
                this.PngjInputException = i2;
                fingerDetectionModeArr = this.setScore;
                if (fingerDetectionModeArr != null) {
                    int i4 = generateST + 17;
                    deduplication = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 4 / 0;
                    }
                }
                throw new NoDetectionModeException();
            }
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr3);
            Object[] objArr4 = (Object[]) cls.getMethod((String) objArr3[0], Integer.TYPE).invoke(null, 33161694);
            j = ((long[]) objArr4[0])[0];
            ((long[]) objArr4[0])[0] = j + 4876;
            com.identy.Fpnative.valueOf = objArr4;
            this.PngjUnsupportedException = i;
            this.PngjInputException = i2;
            fingerDetectionModeArr = this.setScore;
            if (fingerDetectionModeArr != null) {
            }
            throw new NoDetectionModeException();
            return true;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IdentySdk setDetectionMode(FingerDetectionMode[] fingerDetectionModeArr) {
        Object[] objArr;
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = generateST;
        deduplication = (i5 + 85) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (i5 + 97) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | (-13899692))) | (~((~identityHashCode) | 484989588)), 333, (((~((-13899692) | 0)) | (~(identityHashCode | 484989588))) * 333) - 1541964639, -554664354);
                    int i6 = c ^ (c << 13);
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                    ((long[]) objArr[0])[0] = j + 4950;
                    com.identy.Fpnative.valueOf = objArr;
                    this.setScore = fingerDetectionModeArr;
                    i = 0;
                    i2 = 0;
                    for (FingerDetectionMode fingerDetectionMode : fingerDetectionModeArr) {
                        if (fingerDetectionMode.canClub()) {
                            if (fingerDetectionMode.getHand().equals(Hand.LEFT)) {
                                generateST = (deduplication + 105) % 128;
                                i++;
                            } else {
                                i2++;
                            }
                        }
                    }
                    int i8 = ((int[]) objArr[1])[0];
                    int i9 = ((i8 * i8) - (~(-(1438864331 * i8)))) - 1;
                    int i10 = -(i8 * 350445369);
                    int i11 = (i9 & i10) + (i10 | i9);
                    int i12 = ((i11 | (-40393212)) << 1) - ((-40393212) ^ i11);
                    int i13 = i12 >> 15;
                    int i14 = ((i13 ^ (-262143)) + ((i13 & (-262143)) << 1)) / 131072;
                    int i15 = (i14 ^ 1) + ((i14 & 1) << 1);
                    int i16 = (i12 ^ i15) + ((i15 & i12) << 1);
                    int i17 = i12 >> 22;
                    int i18 = -(IdentyB.e((i17 | (-2047)) << 1, i17 ^ (-2047), 1024, -1) ^ i16);
                    i3 = ((i18 | 7) << 1) - (i18 ^ 7);
                    int i19 = i3 >> 27;
                    int i20 = ((i19 ^ (-63)) + ((i19 & (-63)) << 1)) / 32;
                    i4 = (i20 ^ 1) + ((i20 & 1) << 1);
                    if (i == 36176 / (((-(((i4 | 1) << 1) - (i4 ^ 1))) & i3) * 1292) && i2 != 4) {
                        return this;
                    }
                    ArrayList arrayList = new ArrayList(Arrays.asList(fingerDetectionModeArr));
                    if (i == 4) {
                        FingerDetectionMode fingerDetectionMode2 = FingerDetectionMode.LEFT_INDEX;
                        int indexOf = arrayList.indexOf(fingerDetectionMode2);
                        FingerDetectionMode fingerDetectionMode3 = FingerDetectionMode.LEFT_MIDDLE;
                        int min = Math.min(indexOf, arrayList.indexOf(fingerDetectionMode3));
                        FingerDetectionMode fingerDetectionMode4 = FingerDetectionMode.LEFT_RING;
                        int indexOf2 = arrayList.indexOf(fingerDetectionMode4);
                        FingerDetectionMode fingerDetectionMode5 = FingerDetectionMode.LEFT_LITTLE;
                        int min2 = Math.min(min, Math.min(indexOf2, arrayList.indexOf(fingerDetectionMode5)));
                        FingerDetectionMode fingerDetectionMode6 = FingerDetectionMode.L4F;
                        if (!arrayList.contains(fingerDetectionMode6)) {
                            arrayList.add(min2, fingerDetectionMode6);
                        }
                        arrayList.remove(fingerDetectionMode2);
                        arrayList.remove(fingerDetectionMode3);
                        arrayList.remove(fingerDetectionMode4);
                        arrayList.remove(fingerDetectionMode5);
                    }
                    if (i2 == 4) {
                        FingerDetectionMode fingerDetectionMode7 = FingerDetectionMode.RIGHT_INDEX;
                        int indexOf3 = arrayList.indexOf(fingerDetectionMode7);
                        FingerDetectionMode fingerDetectionMode8 = FingerDetectionMode.RIGHT_MIDDLE;
                        int min3 = Math.min(indexOf3, arrayList.indexOf(fingerDetectionMode8));
                        FingerDetectionMode fingerDetectionMode9 = FingerDetectionMode.RIGHT_RING;
                        int indexOf4 = arrayList.indexOf(fingerDetectionMode9);
                        FingerDetectionMode fingerDetectionMode10 = FingerDetectionMode.RIGHT_LITTLE;
                        int min4 = Math.min(min3, Math.min(indexOf4, arrayList.indexOf(fingerDetectionMode10)));
                        FingerDetectionMode fingerDetectionMode11 = FingerDetectionMode.R4F;
                        if (!arrayList.contains(fingerDetectionMode11)) {
                            generateST = (deduplication + 91) % 128;
                            arrayList.add(min4, fingerDetectionMode11);
                        }
                        arrayList.remove(fingerDetectionMode7);
                        arrayList.remove(fingerDetectionMode8);
                        arrayList.remove(fingerDetectionMode9);
                        arrayList.remove(fingerDetectionMode10);
                    }
                    this.setScore = (FingerDetectionMode[]) arrayList.toArray(new FingerDetectionMode[arrayList.size()]);
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -554664354);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4950;
            com.identy.Fpnative.valueOf = objArr;
            this.setScore = fingerDetectionModeArr;
            i = 0;
            i2 = 0;
            while (0 < 0) {
            }
            int i82 = ((int[]) objArr[1])[0];
            int i92 = ((i82 * i82) - (~(-(1438864331 * i82)))) - 1;
            int i102 = -(i82 * 350445369);
            int i112 = (i92 & i102) + (i102 | i92);
            int i122 = ((i112 | (-40393212)) << 1) - ((-40393212) ^ i112);
            int i132 = i122 >> 15;
            int i142 = ((i132 ^ (-262143)) + ((i132 & (-262143)) << 1)) / 131072;
            int i152 = (i142 ^ 1) + ((i142 & 1) << 1);
            int i162 = (i122 ^ i152) + ((i152 & i122) << 1);
            int i172 = i122 >> 22;
            int i182 = -(IdentyB.e((i172 | (-2047)) << 1, i172 ^ (-2047), 1024, -1) ^ i162);
            i3 = ((i182 | 7) << 1) - (i182 ^ 7);
            int i192 = i3 >> 27;
            int i202 = ((i192 ^ (-63)) + ((i192 & (-63)) << 1)) / 32;
            i4 = (i202 ^ 1) + ((i202 & 1) << 1);
            if (i == 36176 / (((-(((i4 | 1) << 1) - (i4 ^ 1))) & i3) * 1292)) {
            }
            ArrayList arrayList2 = new ArrayList(Arrays.asList(fingerDetectionModeArr));
            if (i == 4) {
            }
            if (i2 == 4) {
            }
            this.setScore = (FingerDetectionMode[]) arrayList2.toArray(new FingerDetectionMode[arrayList2.size()]);
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0155  */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean newInstance(Activity activity, byte[] bArr, InitializationListener<IdentySdk> initializationListener, IdentyResponseListener identyResponseListener, boolean z, boolean z2) {
        Object[] objArr;
        long j;
        int i;
        int i2 = deduplication + 5;
        generateST = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr2 = com.identy.Fpnative.valueOf;
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int myPid = Process.myPid();
                        int c = defpackage.a.c(~((~myPid) | 601750215), 476, ((~(601750215 | myPid)) * 952) + (((18352135 | 0) * (-476)) - 685135069), 2082349258);
                        int i3 = c ^ (c << 13);
                        int i4 = i3 ^ (i3 >>> 17);
                        ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                        ((long[]) objArr[0])[0] = j + 4922;
                        com.identy.Fpnative.valueOf = objArr;
                        PngjException = new IdentySdk(activity, bArr, initializationListener, identyResponseListener, z);
                        int i5 = ((int[]) objArr[1])[0];
                        int i6 = i5 * i5;
                        int i7 = -(1924680470 * i5);
                        int i8 = (i6 & i7) + (i6 | i7);
                        int i9 = -(i5 * 113888658);
                        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
                        int i11 = (i10 & (-146801776)) + ((-146801776) | i10);
                        int i12 = i11 >> 20;
                        int e = IdentyB.e((i12 | (-8191)) << 1, i12 ^ (-8191), ConstantsKt.DEFAULT_BLOCK_SIZE, -1);
                        int i13 = ((i11 | e) << 1) - (e ^ i11);
                        int i14 = i11 >> 24;
                        int i15 = ((i14 ^ (-511)) + ((i14 & (-511)) << 1)) / 256;
                        int i16 = (-(((i15 & 1) + (i15 | 1)) ^ i13)) + 4;
                        int i17 = ((i16 >> 26) - 127) / 64;
                        int i18 = (i17 & 1) + (i17 | 1);
                        int i0 = 6204 / ((i16 & (-(((i18 | 1) << 1) - (i18 ^ 1)))) * 1551);
                        i = generateST + 49;
                        deduplication = i % 128;
                        if (i % 2 != 0) {
                            int i19 = 49 / 0;
                        }
                        return false;
                    }
                }
                byte[] bArr2 = $$d;
                byte b = (byte) (-bArr2[11]);
                Object[] objArr3 = new Object[1];
                d((short) 88, b, (byte) (b + 4), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                d((short) (-bArr2[24]), bArr2[63], bArr2[116], objArr4);
                objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 2082349258);
                j = ((long[]) objArr[0])[0];
                ((long[]) objArr[0])[0] = j + 4922;
                com.identy.Fpnative.valueOf = objArr;
                PngjException = new IdentySdk(activity, bArr, initializationListener, identyResponseListener, z);
                int i52 = ((int[]) objArr[1])[0];
                int i62 = i52 * i52;
                int i72 = -(1924680470 * i52);
                int i82 = (i62 & i72) + (i62 | i72);
                int i92 = -(i52 * 113888658);
                int i102 = ((i82 | i92) << 1) - (i92 ^ i82);
                int i112 = (i102 & (-146801776)) + ((-146801776) | i102);
                int i122 = i112 >> 20;
                int e2 = IdentyB.e((i122 | (-8191)) << 1, i122 ^ (-8191), ConstantsKt.DEFAULT_BLOCK_SIZE, -1);
                int i132 = ((i112 | e2) << 1) - (e2 ^ i112);
                int i142 = i112 >> 24;
                int i152 = ((i142 ^ (-511)) + ((i142 & (-511)) << 1)) / 256;
                int i162 = (-(((i152 & 1) + (i152 | 1)) ^ i132)) + 4;
                int i172 = ((i162 >> 26) - 127) / 64;
                int i182 = (i172 & 1) + (i172 | 1);
                int i0 = 6204 / ((i162 & (-(((i182 | 1) << 1) - (i182 ^ 1)))) * 1551);
                i = generateST + 49;
                deduplication = i % 128;
                if (i % 2 != 0) {
                }
                return false;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
            generateST = (deduplication + 53) % 128;
        } else {
            throw null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:14|(2:16|(13:18|19|(1:21)(1:47)|22|(2:24|(1:26)(2:44|45))(1:46)|27|(2:29|(1:31)(1:39))|40|(2:42|43)|33|34|35|36))|48|19|(0)(0)|22|(0)(0)|27|(0)|40|(0)|33|34|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x018c, code lost:
    
        if (0.getOveralTimetaken != null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.identy.enums.FingerDetectionMode[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.identy.enums.FingerDetectionMode[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean capture() {
        Object[] objArr;
        long j;
        FingerDetectionMode[] fingerDetectionModeArr;
        boolean z;
        boolean contains;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int c = defpackage.a.c((~(i | 920798575)) | (~(421909295 | i)), 865, ((~(identityHashCode | 920798575)) * 865) + ((((~((-920798576) | i)) | 421909295) * (-865)) - 1994939522), -148567703);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4864;
                    com.identy.Fpnative.valueOf = objArr;
                    fingerDetectionModeArr = this.setScore;
                    if (fingerDetectionModeArr == null && fingerDetectionModeArr.length != 0) {
                        generateST = (deduplication + 53) % 128;
                        if (!H()) {
                            return false;
                        }
                        this.e = com.identy.Action.CAPTURE;
                        this.h = new HashMap();
                        if (this.setScore[0].getFinger() != null) {
                            deduplication = (generateST + 73) % 128;
                            if (this.setScore[0].getFinger().equals(Finger.THUMB)) {
                                generateST = (deduplication + 43) % 128;
                                z = true;
                                Hand hand = this.setScore[0].getHand() != null ? Hand.LEFT : this.setScore[0].getHand();
                                if (!z) {
                                    int i4 = generateST + 23;
                                    deduplication = i4 % 128;
                                    if (i4 % 2 == 0) {
                                        contains = this.PngjPrematureEnding.contains(hand);
                                    } else {
                                        this.PngjPrematureEnding.contains(hand);
                                        throw null;
                                    }
                                } else {
                                    contains = this.PngjExceptionInternal.contains(hand);
                                }
                                Activity activity = this.getData;
                                Intent intent = new Intent(activity, (Class<?>) GuideNoGuideHelper.getCaptureClass(activity, contains, this.setScore, isRolledfp()));
                                intent.putExtra("type", "capture");
                                intent.putExtra(getL2Score, (Serializable) this.setScore);
                                intent.putExtra(isAuthSucess, (Serializable) this.setScore);
                                if (this.getMatchingTime == null) {
                                    int i5 = deduplication + 85;
                                    generateST = i5 % 128;
                                    if (i5 % 2 == 0) {
                                        throw null;
                                    }
                                }
                                if (!this.getNfiq1Score) {
                                    PngjBadSignature();
                                    return true;
                                }
                                this.getData.startActivityForResult(intent, 102);
                                PngjBadCrcException(this.e.toString());
                                return true;
                            }
                        }
                        z = false;
                        if (this.setScore[0].getHand() != null) {
                        }
                        if (!z) {
                        }
                        Activity activity2 = this.getData;
                        Intent intent2 = new Intent(activity2, (Class<?>) GuideNoGuideHelper.getCaptureClass(activity2, contains, this.setScore, isRolledfp()));
                        intent2.putExtra("type", "capture");
                        intent2.putExtra(getL2Score, (Serializable) this.setScore);
                        intent2.putExtra(isAuthSucess, (Serializable) this.setScore);
                        if (this.getMatchingTime == null) {
                        }
                        if (!this.getNfiq1Score) {
                        }
                        this.getData.startActivityForResult(intent2, 102);
                        PngjBadCrcException(this.e.toString());
                        return true;
                    }
                    throw new NoDetectionModeException();
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -148567703);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4864;
            com.identy.Fpnative.valueOf = objArr;
            fingerDetectionModeArr = this.setScore;
            if (fingerDetectionModeArr == null) {
            }
            throw new NoDetectionModeException();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v30, types: [boolean, int] */
    public IdentySdk e() {
        Object[] objArr;
        long j;
        int i = generateST;
        deduplication = (i + 3) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                deduplication = (i + 1) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int myUid = Process.myUid();
                    int c = defpackage.a.c(myUid | 921064251, 104, ((~((~myUid) | (-151625921))) * (-104)) + (((~(422174971 | myUid)) | 650515200) * 104) + 154011815, 180302781);
                    int i2 = c ^ (c << 13);
                    int i3 = i2 ^ (i2 >>> 17);
                    ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                    ((long[]) objArr[0])[0] = j + 4982;
                    com.identy.Fpnative.valueOf = objArr;
                    int i4 = ((int[]) objArr[1])[0];
                    int i5 = i4 * i4;
                    int i6 = -(195004744 * i4);
                    int i7 = (((i5 ^ i6) + ((i5 & i6) << 1)) - (~(-(i4 * 2095802228)))) - 1;
                    int i8 = (i7 & 189022852) + (189022852 | i7);
                    int i9 = i8 >> 16;
                    int i10 = ((i9 ^ (-131071)) + ((i9 & (-131071)) << 1)) / 65536;
                    int i11 = (i8 - (~(((i10 | 1) << 1) - (i10 ^ 1)))) - 1;
                    int i12 = i8 >> 25;
                    int i13 = ((i12 ^ (-255)) + ((i12 & (-255)) << 1)) / 128;
                    int i14 = -(i11 ^ (((i13 | 1) << 1) - (i13 ^ 1)));
                    int i15 = (i14 ^ 1) + ((i14 & 1) << 1);
                    int i16 = i15 >> 29;
                    int i17 = (((i16 | (-15)) << 1) - (i16 ^ (-15))) / 8;
                    int i18 = (i17 & 1) + (i17 | 1);
                    this.FingerActivity = false;
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 180302781);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4982;
            com.identy.Fpnative.valueOf = objArr;
            int i42 = ((int[]) objArr[1])[0];
            int i52 = i42 * i42;
            int i62 = -(195004744 * i42);
            int i72 = (((i52 ^ i62) + ((i52 & i62) << 1)) - (~(-(i42 * 2095802228)))) - 1;
            int i82 = (i72 & 189022852) + (189022852 | i72);
            int i92 = i82 >> 16;
            int i102 = ((i92 ^ (-131071)) + ((i92 & (-131071)) << 1)) / 65536;
            int i112 = (i82 - (~(((i102 | 1) << 1) - (i102 ^ 1)))) - 1;
            int i122 = i82 >> 25;
            int i132 = ((i122 ^ (-255)) + ((i122 & (-255)) << 1)) / 128;
            int i142 = -(i112 ^ (((i132 | 1) << 1) - (i132 ^ 1)));
            int i152 = (i142 ^ 1) + ((i142 & 1) << 1);
            int i162 = i152 >> 29;
            int i172 = (((i162 | (-15)) << 1) - (i162 ^ (-15))) / 8;
            int i182 = (i172 & 1) + (i172 | 1);
            this.FingerActivity = false;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 121) % 128;
    }

    public boolean removeEnrollment() {
        Object[] objArr;
        long j;
        deduplication = (generateST + 109) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int uptimeMillis = (int) SystemClock.uptimeMillis();
                    int c = defpackage.a.c((~(uptimeMillis | (-406698457))) | (~((~uptimeMillis) | 92190823)), 959, (((~((-406698457) | 0)) | (~(uptimeMillis | 92190823))) * 959) - 466219089, -451814125);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    deduplication = (generateST + 39) % 128;
                    ((long[]) objArr[0])[0] = j + 4871;
                    com.identy.Fpnative.valueOf = objArr;
                    IdentyUser defaultUser = getDefaultUser();
                    FingerDetectionMode[] fingerDetectionModeArr = new FingerDetectionMode[10];
                    fingerDetectionModeArr[0] = FingerDetectionMode.LEFT_INDEX;
                    fingerDetectionModeArr[1] = FingerDetectionMode.LEFT_MIDDLE;
                    fingerDetectionModeArr[2] = FingerDetectionMode.LEFT_RING;
                    fingerDetectionModeArr[3] = FingerDetectionMode.LEFT_LITTLE;
                    FingerDetectionMode fingerDetectionMode = FingerDetectionMode.LEFT_THUMB;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(728037123 * i3);
                    int i6 = (i4 & i5) + (i4 | i5);
                    int i7 = -(i3 * 871198333);
                    int i8 = (i6 & i7) + (i7 | i6);
                    int i9 = (i8 ^ (-1953525760)) + (((-1953525760) & i8) << 1);
                    int i10 = ((i9 >> 22) - 2047) / 1024;
                    int i11 = (i10 & 1) + (i10 | 1);
                    int i12 = (i9 & i11) + (i11 | i9);
                    int i13 = i9 >> 20;
                    int i14 = (((i13 | (-8191)) << 1) - (i13 ^ (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                    int i15 = -(i12 ^ ((i14 & 1) + (i14 | 1)));
                    int i16 = (i15 ^ 7) + ((i15 & 7) << 1);
                    int i17 = ((i16 >> 16) - 131071) / 65536;
                    int i18 = (i17 & 1) + (i17 | 1);
                    fingerDetectionModeArr[47684 / (((-(((i18 | 1) << 1) - (1 ^ i18))) & i16) * 1703)] = fingerDetectionMode;
                    fingerDetectionModeArr[5] = FingerDetectionMode.RIGHT_INDEX;
                    fingerDetectionModeArr[6] = FingerDetectionMode.RIGHT_MIDDLE;
                    fingerDetectionModeArr[7] = FingerDetectionMode.RIGHT_RING;
                    fingerDetectionModeArr[8] = FingerDetectionMode.RIGHT_LITTLE;
                    fingerDetectionModeArr[9] = fingerDetectionMode;
                    return removeEnrollment(fingerDetectionModeArr, defaultUser);
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -451814125);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4871;
            com.identy.Fpnative.valueOf = objArr;
            IdentyUser defaultUser2 = getDefaultUser();
            FingerDetectionMode[] fingerDetectionModeArr2 = new FingerDetectionMode[10];
            fingerDetectionModeArr2[0] = FingerDetectionMode.LEFT_INDEX;
            fingerDetectionModeArr2[1] = FingerDetectionMode.LEFT_MIDDLE;
            fingerDetectionModeArr2[2] = FingerDetectionMode.LEFT_RING;
            fingerDetectionModeArr2[3] = FingerDetectionMode.LEFT_LITTLE;
            FingerDetectionMode fingerDetectionMode2 = FingerDetectionMode.LEFT_THUMB;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(728037123 * i32);
            int i62 = (i42 & i52) + (i42 | i52);
            int i72 = -(i32 * 871198333);
            int i82 = (i62 & i72) + (i72 | i62);
            int i92 = (i82 ^ (-1953525760)) + (((-1953525760) & i82) << 1);
            int i102 = ((i92 >> 22) - 2047) / 1024;
            int i112 = (i102 & 1) + (i102 | 1);
            int i122 = (i92 & i112) + (i112 | i92);
            int i132 = i92 >> 20;
            int i142 = (((i132 | (-8191)) << 1) - (i132 ^ (-8191))) / ConstantsKt.DEFAULT_BLOCK_SIZE;
            int i152 = -(i122 ^ ((i142 & 1) + (i142 | 1)));
            int i162 = (i152 ^ 7) + ((i152 & 7) << 1);
            int i172 = ((i162 >> 16) - 131071) / 65536;
            int i182 = (i172 & 1) + (i172 | 1);
            fingerDetectionModeArr2[47684 / (((-(((i182 | 1) << 1) - (1 ^ i182))) & i162) * 1703)] = fingerDetectionMode2;
            fingerDetectionModeArr2[5] = FingerDetectionMode.RIGHT_INDEX;
            fingerDetectionModeArr2[6] = FingerDetectionMode.RIGHT_MIDDLE;
            fingerDetectionModeArr2[7] = FingerDetectionMode.RIGHT_RING;
            fingerDetectionModeArr2[8] = FingerDetectionMode.RIGHT_LITTLE;
            fingerDetectionModeArr2[9] = fingerDetectionMode2;
            return removeEnrollment(fingerDetectionModeArr2, defaultUser2);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public final void values(String str) {
        deduplication = (generateST + 7) % 128;
        try {
            if (this.EnrollFingersActivity == null) {
                LManager lManager = this.PngjBadCrcException;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("$");
                lManager.updateTransaction(sb.toString());
                generateST = (deduplication + 113) % 128;
                return;
            }
            LManager lManager2 = this.PngjBadCrcException;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.EnrollFingersActivity);
            sb2.append(str);
            sb2.append("$");
            lManager2.addTransactionv2(sb2.toString());
            this.EnrollFingersActivity = null;
            deduplication = (generateST + 67) % 128;
        } catch (Exception unused) {
        }
    }

    private Attempt PngjException(Hand hand, Finger finger, IdentyA aVar, VerifyResult verifyResult, long j, long j2, long j3, String str, long j4) {
        try {
            if (!this.h.containsKey(hand)) {
                this.h.put(hand, new HashMap());
                deduplication = (generateST + 75) % 128;
            }
            Map map = (Map) this.h.get(hand);
            List arrayList = new ArrayList();
            if (map.containsKey(finger)) {
                int i = generateST + 95;
                deduplication = i % 128;
                if (i % 2 == 0) {
                    arrayList = ((getPadSub3) map.get(finger)).PngjOutputException;
                } else {
                    List list = ((getPadSub3) map.get(finger)).PngjOutputException;
                    throw null;
                }
            }
            try {
                Attempt attempt = new Attempt(aVar.values, aVar.PngjException, aVar.Attempt(), aVar.e1(), aVar.onErrorResponse(), aVar.PngjPrematureEnding(), aVar.PngjInputException(), aVar.PngBadCharsetException(), aVar.Action(), aVar.a(), j, j2, j3, aVar.onErrorResponse, false, str, aVar.PngjUnsupportedException, j4, aVar.PngjUnsupportedException(), verifyResult.matched_true_up_to_security_level);
                Hand hand2 = aVar.PngjOutputException;
                Finger finger2 = aVar.PngjExceptionInternal;
                Date date = aVar.PngjBadSignature;
                Map PngjExceptionInternal = aVar.PngjExceptionInternal();
                double d = aVar.PngjException;
                float f = aVar.values;
                int Attempt = aVar.Attempt();
                float onErrorResponse = aVar.onErrorResponse();
                boolean PngjOutputException = aVar.PngjOutputException();
                Mat mat = aVar.PngjPrematureEnding;
                getCaptureTime getcapturetime = new getCaptureTime(hand2, finger2, date, PngjExceptionInternal, d, verifyResult, f, Attempt, onErrorResponse, PngjOutputException, mat, aVar.a, j, j2, j3, null, Mat.n_cols(mat.PngjException), aVar.PngjUnsupportedException, aVar.PngjBadCrcException, aVar.PngjUnsupportedException());
                arrayList.add(attempt);
                getcapturetime.PngjOutputException = arrayList;
                map.put(finger, getcapturetime);
                return attempt;
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        IdentySdk identySdk = (IdentySdk) objArr[0];
        Hand hand = (Hand) objArr[1];
        Finger finger = (Finger) objArr[2];
        long longValue = ((Number) objArr[3]).longValue();
        HashMap hashMap = (HashMap) objArr[4];
        try {
            if (!identySdk.h.containsKey(hand)) {
                identySdk.h.put(hand, new HashMap());
            }
            Map map = (Map) identySdk.h.get(hand);
            List arrayList = new ArrayList();
            if (map.containsKey(finger)) {
                arrayList = ((getPadSub3) map.get(finger)).PngjOutputException;
            }
            double floatValue = hashMap.containsKey(new Pair(hand, finger)) ? ((Float) hashMap.get(new Pair(hand, finger))).floatValue() : 0.0d;
            FingerAS fingerAS = com.identy.FingerAS.NONE;
            Attempt attempt = new Attempt(0, floatValue, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, longValue, 0L, 0L, false, true, BuildConfig.FLAVOR, 0, 0L, fingerAS, null);
            List list = arrayList;
            getPadSub3 getpadsub3 = new getPadSub3(hand, finger, new Date(), null, hashMap.containsKey(new Pair(hand, finger)) ? ((Float) hashMap.get(new Pair(hand, finger))).floatValue() : 0.0d, -1, 0, 0.0f, false, null, null, longValue, 0L, 0L, new PngBadCharsetException(), 0, 0, null, fingerAS);
            list.add(attempt);
            getpadsub3.PngjOutputException = list;
            map.put(finger, getpadsub3);
            return attempt;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean newInstance(Activity activity, String str, InitializationListener<IdentySdk> initializationListener, IdentyResponseListener identyResponseListener, boolean z, boolean z2) {
        Object[] objArr;
        long j;
        int i;
        int i2 = deduplication + 59;
        generateST = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr2 = com.identy.Fpnative.valueOf;
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int startUptimeMillis = (int) Process.getStartUptimeMillis();
                        int i3 = ~startUptimeMillis;
                        int c = defpackage.a.c((~(startUptimeMillis | (-132342613))) | (~(i3 | 366546667)), 959, (((~((-132342613) | i3)) | (~(startUptimeMillis | 366546667))) * 959) + 1762279591, -1067883615);
                        int i4 = c ^ (c << 13);
                        int i5 = i4 ^ (i4 >>> 17);
                        ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                        ((long[]) objArr[0])[0] = j + 4925;
                        com.identy.Fpnative.valueOf = objArr;
                        boolean newInstance = newInstance(activity, LManager.getFileDataFromFile(activity.getAssets(), str), initializationListener, identyResponseListener, z, z2);
                        i = generateST + 51;
                        deduplication = i % 128;
                        if (i % 2 != 0) {
                            return newInstance;
                        }
                        throw null;
                    }
                }
                byte[] bArr = $$d;
                Object[] objArr3 = new Object[1];
                d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
                objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1067883615);
                j = ((long[]) objArr[0])[0];
                ((long[]) objArr[0])[0] = j + 4925;
                com.identy.Fpnative.valueOf = objArr;
                boolean newInstance2 = newInstance(activity, LManager.getFileDataFromFile(activity.getAssets(), str), initializationListener, identyResponseListener, z, z2);
                i = generateST + 51;
                deduplication = i % 128;
                if (i % 2 != 0) {
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
            generateST = (deduplication + 59) % 128;
        } else {
            throw null;
        }
    }

    private static /* synthetic */ Object PngjBadCrcException(Object[] objArr) {
        String obj;
        IdentySdk identySdk = (IdentySdk) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        Hand hand = (Hand) objArr[2];
        Finger finger = (Finger) objArr[3];
        IdentyUser identyUser = (IdentyUser) objArr[4];
        try {
            Activity activity = identySdk.getData;
            if (identyUser.isDefault()) {
                obj = "ENROLL";
            } else {
                StringBuilder sb = new StringBuilder("ENROLL_U");
                sb.append(identyUser.uid);
                obj = sb.toString();
            }
            deduplication = (generateST + 39) % 128;
            File values2 = com.identy.PngjBadCrcException.values(activity, obj);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(hand.toString());
            sb2.append("_");
            sb2.append(finger.toString());
            sb2.append(".isocryptv4");
            getInstance().m().encryptTemplatev2(bArr, new File(values2, sb2.toString()).getAbsolutePath());
            int i = generateST + 5;
            deduplication = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(FingerDetectionMode fingerDetectionMode) {
        Object[] objArr;
        long j;
        deduplication = (generateST + 75) % 128;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int identityHashCode = System.identityHashCode(this);
                        int c = defpackage.a.c(~(identityHashCode | (-637563521)), 345, (((~((-639303313) | (~identityHashCode))) | (-777977553)) * 345) + (((~((-639303313) | identityHashCode)) | 637563520) * 345) + 180779864, 1270201268);
                        int i = c ^ (c << 13);
                        int i2 = i ^ (i >>> 17);
                        ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                        ((long[]) objArr[0])[0] = j + 4966;
                        com.identy.Fpnative.valueOf = objArr;
                        HashSet hashSet = this.CaptureFingersActivity;
                        String string = Settings.Secure.getString(this.getData.getContentResolver(), "android_id");
                        StringBuilder sb = new StringBuilder();
                        sb.append(fingerDetectionMode.getTransactionCode());
                        sb.append(this.Capture2IndexActivity / 1000);
                        sb.append(string);
                        hashSet.add(sb.toString());
                        return;
                    }
                }
                HashSet hashSet2 = this.CaptureFingersActivity;
                String string2 = Settings.Secure.getString(this.getData.getContentResolver(), "android_id");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fingerDetectionMode.getTransactionCode());
                sb2.append(this.Capture2IndexActivity / 1000);
                sb2.append(string2);
                hashSet2.add(sb2.toString());
                return;
            } catch (Exception unused) {
                return;
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1270201268);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4966;
            com.identy.Fpnative.valueOf = objArr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 7) % 128;
    }

    private void PngjBadSignature() {
        generateST = (deduplication + 87) % 128;
        if (h() != null) {
            int i = generateST + 27;
            deduplication = i % 128;
            if (i % 2 != 0) {
                int i2 = 90 / 0;
                if (h().equals(com.identy.FingerAS.NONE)) {
                    return;
                }
            } else if (h().equals(com.identy.FingerAS.NONE)) {
                return;
            }
            if (this.getMatchingTime == null) {
                generateST = (deduplication + 49) % 128;
                if (this.getOveralTimetaken == null) {
                    return;
                }
            }
            if (this.getNfiq1Score) {
                return;
            }
            new com.identy.PngjInputException().PngjBadSignature(this.getData, this.getMatchingTime, new PngjPrematureEnding());
            generateST = (deduplication + 93) % 128;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    public IdentySdk setASServerConfig(PublicKey publicKey) {
        Object[] objArr;
        long j;
        int i = (generateST + 41) % 128;
        deduplication = i;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (i + 3) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i2 = ~identityHashCode;
                    int i3 = (((((~((-174821659) | i2)) | 37781760) | (~((-324067622) | i2))) | (~(461107519 | identityHashCode))) * (-84)) - 544084245;
                    int i4 = (~(identityHashCode | (-324067622))) | 174821658;
                    int i5 = ~(i2 | 324067621);
                    int c = defpackage.a.c(i5 | (-461107520), 84, ((i4 | i5) * (-84)) + i3, 504394160);
                    int i6 = c ^ (c << 13);
                    int i7 = i6 ^ (i6 >>> 17);
                    ((int[]) objArr[1])[0] = i7 ^ (i7 << 5);
                    ((long[]) objArr[0])[0] = j + 5036;
                    com.identy.Fpnative.valueOf = objArr;
                    int i8 = ((int[]) objArr[1])[0];
                    int i9 = i8 * i8;
                    int i10 = -(402008188 * i8);
                    int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
                    int i12 = -(i8 * (-1958705870));
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    int i14 = (i13 ^ 1406085265) + ((1406085265 & i13) << 1);
                    int i15 = i14 >> 15;
                    int i16 = (i14 - (~IdentyB.e((i15 | (-262143)) << 1, i15 ^ (-262143), 131072, -1))) - 1;
                    int i17 = i14 >> 28;
                    int i18 = (((i17 | (-31)) << 1) - (i17 ^ (-31))) / 16;
                    int i19 = -(i16 ^ (((i18 | 1) << 1) - (i18 ^ 1)));
                    int i20 = (i19 ^ 1) + ((i19 & 1) << 1);
                    int i21 = ((i20 >> 29) - 15) / 8;
                    int i22 = (i21 & 1) + (i21 | 1);
                    this.getCaptureTime = false;
                    this.S0 = publicKey;
                    deduplication = (generateST + 45) % 128;
                    return this;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 504394160);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5036;
            com.identy.Fpnative.valueOf = objArr;
            int i82 = ((int[]) objArr[1])[0];
            int i92 = i82 * i82;
            int i102 = -(402008188 * i82);
            int i112 = (i92 ^ i102) + ((i92 & i102) << 1);
            int i122 = -(i82 * (-1958705870));
            int i132 = (i112 ^ i122) + ((i122 & i112) << 1);
            int i142 = (i132 ^ 1406085265) + ((1406085265 & i132) << 1);
            int i152 = i142 >> 15;
            int i162 = (i142 - (~IdentyB.e((i152 | (-262143)) << 1, i152 ^ (-262143), 131072, -1))) - 1;
            int i172 = i142 >> 28;
            int i182 = (((i172 | (-31)) << 1) - (i172 ^ (-31))) / 16;
            int i192 = -(i162 ^ (((i182 | 1) << 1) - (i182 ^ 1)));
            int i202 = (i192 ^ 1) + ((i192 & 1) << 1);
            int i212 = ((i202 >> 29) - 15) / 8;
            int i222 = (i212 & 1) + (i212 | 1);
            this.getCaptureTime = false;
            this.S0 = publicKey;
            deduplication = (generateST + 45) % 128;
            return this;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        generateST = (deduplication + 85) % 128;
    }

    public boolean removeEnrollment(IdentyUser identyUser) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (deduplication + 59) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c(~(identityHashCode | (-236382830)), 113, (((~((~identityHashCode) | (-1206318))) | (~((-262506451) | identityHashCode)) | 27329938) * (-113)) + ((((~((-236382830) | 0)) | 262506450) * 226) - 41024400), 1969006909);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4986;
                    com.identy.Fpnative.valueOf = objArr;
                    FingerDetectionMode[] fingerDetectionModeArr = new FingerDetectionMode[10];
                    fingerDetectionModeArr[0] = FingerDetectionMode.LEFT_INDEX;
                    fingerDetectionModeArr[1] = FingerDetectionMode.LEFT_MIDDLE;
                    fingerDetectionModeArr[2] = FingerDetectionMode.LEFT_RING;
                    fingerDetectionModeArr[3] = FingerDetectionMode.LEFT_LITTLE;
                    FingerDetectionMode fingerDetectionMode = FingerDetectionMode.LEFT_THUMB;
                    fingerDetectionModeArr[4] = fingerDetectionMode;
                    FingerDetectionMode fingerDetectionMode2 = FingerDetectionMode.RIGHT_INDEX;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(329533204 * i3);
                    int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
                    int i7 = -(i3 * 1773735994);
                    int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                    int i9 = (i8 & (-1373862159)) + ((-1373862159) | i8);
                    int i10 = i9 >> 27;
                    int i11 = ((i10 ^ (-63)) + ((i10 & (-63)) << 1)) / 32;
                    int i12 = (i11 & 1) + (i11 | 1);
                    int i13 = (i9 ^ i12) + ((i12 & i9) << 1);
                    int i14 = i9 >> 16;
                    int i15 = -(IdentyB.e((i14 | (-131071)) << 1, i14 ^ (-131071), 65536, -1) ^ i13);
                    int i16 = ((i15 | 6) << 1) - (i15 ^ 6);
                    int i17 = i16 >> 23;
                    int i18 = ((i17 ^ (-1023)) + ((i17 & (-1023)) << 1)) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                    int i19 = (i18 ^ 1) + ((i18 & 1) << 1);
                    fingerDetectionModeArr[1230 / (((-(((i19 | 1) << 1) - (i19 ^ 1))) & i16) * 41)] = fingerDetectionMode2;
                    fingerDetectionModeArr[6] = FingerDetectionMode.RIGHT_MIDDLE;
                    fingerDetectionModeArr[7] = FingerDetectionMode.RIGHT_RING;
                    fingerDetectionModeArr[8] = FingerDetectionMode.RIGHT_LITTLE;
                    fingerDetectionModeArr[9] = fingerDetectionMode;
                    boolean removeEnrollment = removeEnrollment(fingerDetectionModeArr, identyUser);
                    generateST = (deduplication + 119) % 128;
                    return removeEnrollment;
                }
            }
            byte[] bArr = $$d;
            byte b = (byte) (-bArr[11]);
            Object[] objArr3 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1969006909);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4986;
            com.identy.Fpnative.valueOf = objArr;
            FingerDetectionMode[] fingerDetectionModeArr2 = new FingerDetectionMode[10];
            fingerDetectionModeArr2[0] = FingerDetectionMode.LEFT_INDEX;
            fingerDetectionModeArr2[1] = FingerDetectionMode.LEFT_MIDDLE;
            fingerDetectionModeArr2[2] = FingerDetectionMode.LEFT_RING;
            fingerDetectionModeArr2[3] = FingerDetectionMode.LEFT_LITTLE;
            FingerDetectionMode fingerDetectionMode3 = FingerDetectionMode.LEFT_THUMB;
            fingerDetectionModeArr2[4] = fingerDetectionMode3;
            FingerDetectionMode fingerDetectionMode22 = FingerDetectionMode.RIGHT_INDEX;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(329533204 * i32);
            int i62 = ((i42 | i52) << 1) - (i42 ^ i52);
            int i72 = -(i32 * 1773735994);
            int i82 = (i62 ^ i72) + ((i72 & i62) << 1);
            int i92 = (i82 & (-1373862159)) + ((-1373862159) | i82);
            int i102 = i92 >> 27;
            int i112 = ((i102 ^ (-63)) + ((i102 & (-63)) << 1)) / 32;
            int i122 = (i112 & 1) + (i112 | 1);
            int i132 = (i92 ^ i122) + ((i122 & i92) << 1);
            int i142 = i92 >> 16;
            int i152 = -(IdentyB.e((i142 | (-131071)) << 1, i142 ^ (-131071), 65536, -1) ^ i132);
            int i162 = ((i152 | 6) << 1) - (i152 ^ 6);
            int i172 = i162 >> 23;
            int i182 = ((i172 ^ (-1023)) + ((i172 & (-1023)) << 1)) / ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i192 = (i182 ^ 1) + ((i182 & 1) << 1);
            fingerDetectionModeArr2[1230 / (((-(((i192 | 1) << 1) - (i192 ^ 1))) & i162) * 41)] = fingerDetectionMode22;
            fingerDetectionModeArr2[6] = FingerDetectionMode.RIGHT_MIDDLE;
            fingerDetectionModeArr2[7] = FingerDetectionMode.RIGHT_RING;
            fingerDetectionModeArr2[8] = FingerDetectionMode.RIGHT_LITTLE;
            fingerDetectionModeArr2[9] = fingerDetectionMode3;
            boolean removeEnrollment2 = removeEnrollment(fingerDetectionModeArr2, identyUser);
            generateST = (deduplication + 119) % 128;
            return removeEnrollment2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private void values(String str, Finger finger, Hand hand, IdentyUser identyUser) {
        try {
            values(new Object[]{this, com.identy.Fpnative.generateID(com.identy.e1.PngjException(this.getData), Position.getFromHandFinger(new Pair(hand, finger)).ordinal(), Template.ISO_19794_2.ordinal(), com.identy.e.valueOf.PngjException(str)), hand, finger, identyUser}, 0, -320332114, 0, 320332114, 0, 0);
            generateST = (deduplication + 13) % 128;
        } catch (Exception unused) {
        }
    }

    private static /* synthetic */ Object PngjBadSignature(Object[] objArr) {
        IdentySdk identySdk = (IdentySdk) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        Finger finger = (Finger) objArr[2];
        Hand hand = (Hand) objArr[3];
        try {
            values(new Object[]{identySdk, com.identy.Fpnative.generateID(e1.PngjException(identySdk.getData), Position.getFromHandFinger(new Pair(hand, finger)).ordinal(), Template.ISO_19794_2.ordinal(), bArr), hand, finger, (IdentyUser) objArr[4]}, 0, -320332114, 0, 320332114, 0, 0);
            generateST = (deduplication + 95) % 128;
        } catch (Exception unused) {
        }
        return null;
    }

    private void PngjBadSignature(String str, Finger finger, Hand hand, IdentyUser identyUser) {
        values(new Object[]{this, str, finger, hand, identyUser}, 0, 1779101910, 0, -1779101909, 0, 0);
    }

    private void PngjBadSignature(byte[] bArr, Finger finger, Hand hand, IdentyUser identyUser) {
        values(new Object[]{this, bArr, finger, hand, identyUser}, 0, -994925292, 0, 994925295, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0103 A[Catch: Exception -> 0x00e0, LOOP:0: B:14:0x00fd->B:16:0x0103, LOOP_END, TryCatch #0 {Exception -> 0x00e0, blocks: (B:41:0x00d9, B:10:0x00e4, B:13:0x00eb, B:14:0x00fd, B:16:0x0103, B:18:0x0141, B:20:0x0146, B:23:0x0152, B:26:0x015a, B:30:0x0166, B:31:0x016b), top: B:40:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0146 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:41:0x00d9, B:10:0x00e4, B:13:0x00eb, B:14:0x00fd, B:16:0x0103, B:18:0x0141, B:20:0x0146, B:23:0x0152, B:26:0x015a, B:30:0x0166, B:31:0x016b), top: B:40:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0166 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:41:0x00d9, B:10:0x00e4, B:13:0x00eb, B:14:0x00fd, B:16:0x0103, B:18:0x0141, B:20:0x0146, B:23:0x0152, B:26:0x015a, B:30:0x0166, B:31:0x016b), top: B:40:0x00d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e3  */
    /* JADX WARN: Type inference failed for: r2v24, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(FingerDetectionMode fingerDetectionMode, HashMap hashMap, long j, long j2, long j3, int i, byte[] bArr, int i2, List list, List list2, float f) {
        Object[] objArr;
        long j4;
        String encodeToString;
        String str;
        Iterator it;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j5 = ((long[]) objArr2[0])[0];
                j4 = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j5 > j4) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int i3 = (int) Runtime.getRuntime().totalMemory();
                    int c = defpackage.a.c((~(i3 | 230820530)) | (~((~i3) | 729709810)), 959, (((~(230820530 | 0)) | (~(i3 | 729709810))) * 959) - 1770481383, -1995815880);
                    int i4 = c ^ (c << 13);
                    int i5 = i4 ^ (i4 >>> 17);
                    ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                    Object[] objArr3 = objArr;
                    ((long[]) objArr3[0])[0] = j4 + 5012;
                    com.identy.Fpnative.valueOf = objArr3;
                    if (bArr == null) {
                        try {
                            encodeToString = Base64.encodeToString(bArr, this.isQualityFailed);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        encodeToString = null;
                    }
                    str = this.resetAttempt ? null : encodeToString;
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap2 = new HashMap();
                    it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        a aVar = (a) ((Map.Entry) it.next()).getValue();
                        HashMap hashMap3 = hashMap2;
                        hashMap3.put(aVar.PngjBadSignature(), PngjBadCrcException(aVar.values(), aVar.PngjBadSignature(), aVar, j, j2, j3, i2, str));
                        arrayList.add(new Pair(aVar.values(), aVar.PngjBadSignature()));
                        hashMap2 = hashMap3;
                    }
                    HashMap hashMap4 = hashMap2;
                    if (this.getTemplates) {
                        this.onErrorResponse.put(arrayList, new com.identy.g.PngjBadCrcException(f, !this.getHeight ? null : list, !this.getIdentyQuality ? null : list2, this.setSpoofScore));
                    }
                    if (str != null) {
                        this.i.put(arrayList, str);
                    }
                    this.f.onAttempt(fingerDetectionMode.getHand(), i, hashMap4);
                    a(fingerDetectionMode);
                    int i6 = ((int[]) objArr3[1])[0];
                    int i7 = i6 * i6;
                    int i8 = -(1687410580 * i6);
                    int i9 = ((((i7 | i8) << 1) - (i7 ^ i8)) - (~(-(i6 * 2104977554)))) - 1;
                    int i10 = (i9 & 1792393577) + (1792393577 | i9);
                    int i11 = (i10 - (~IdentyB.e(i10 >> 17, 65535, 32768, -1))) - 1;
                    int i12 = i10 >> 27;
                    int i13 = (-(i11 ^ IdentyB.a(i12 & (-63), i12 | (-63), 32, -1))) + 6;
                    int e2 = IdentyB.e(i13 >> 27, 63, 32, -1);
                    return false;
                }
            }
            byte[] bArr2 = $$d;
            byte b = (byte) (-bArr2[11]);
            Object[] objArr4 = new Object[1];
            d((short) 88, b, (byte) (b + 4), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            d((short) (-bArr2[24]), bArr2[63], bArr2[116], objArr5);
            objArr = (Object[]) cls.getMethod((String) objArr5[0], Integer.TYPE).invoke(null, -1995815880);
            j4 = ((long[]) objArr[0])[0];
            Object[] objArr32 = objArr;
            ((long[]) objArr32[0])[0] = j4 + 5012;
            com.identy.Fpnative.valueOf = objArr32;
            if (bArr == null) {
            }
            if (this.resetAttempt) {
            }
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap22 = new HashMap();
            it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
            }
            HashMap hashMap42 = hashMap22;
            if (this.getTemplates) {
            }
            if (str != null) {
            }
            this.f.onAttempt(fingerDetectionMode.getHand(), i, hashMap42);
            a(fingerDetectionMode);
            int i62 = ((int[]) objArr32[1])[0];
            int i72 = i62 * i62;
            int i82 = -(1687410580 * i62);
            int i92 = ((((i72 | i82) << 1) - (i72 ^ i82)) - (~(-(i62 * 2104977554)))) - 1;
            int i102 = (i92 & 1792393577) + (1792393577 | i92);
            int i112 = (i102 - (~IdentyB.e(i102 >> 17, 65535, 32768, -1))) - 1;
            int i122 = i102 >> 27;
            int i132 = (-(i112 ^ IdentyB.a(i122 & (-63), i122 | (-63), 32, -1))) + 6;
            int e22 = IdentyB.e(i132 >> 27, 63, 32, -1);
            return false;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void PngjException() {
        generateNFIQ = new char[]{25197, 25178, 25184, 25182, 25179, 25189, 25498, 25183, 25215, 25173, 25168, 25185, 25177, 25487, 25176, 25199, 25191, 25180, 25214, 25485, 25170, 25200, 25188, 25169, 25190, 25187, 25476};
        rgenerate = -2081201204;
        generate = true;
        pfkrolChangeMinMaxWidth = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0198, code lost:
    
        if (null.equals(com.identy.enums.Finger.THUMB) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean enroll(IdentyUser identyUser) {
        Object[] objArr;
        long j;
        FingerDetectionMode[] fingerDetectionModeArr;
        Hand hand;
        boolean z = true;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int i = ~identityHashCode;
                    int i2 = ~(942756277 | i);
                    int c = defpackage.a.c(i2 | 443866997, 712, (((~(identityHashCode | (-38047297))) | (~(i | 980803573))) * (-712)) + (((-980803574) | i2) * (-712)) + 1065595559, -1853456773);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    ((long[]) objArr[0])[0] = j + 4969;
                    com.identy.Fpnative.valueOf = objArr;
                    fingerDetectionModeArr = this.setScore;
                    if (fingerDetectionModeArr == null && fingerDetectionModeArr.length != 0) {
                        if (!H()) {
                            generateST = (deduplication + 85) % 128;
                            return false;
                        }
                        this.e = com.identy.Action.ENROLL;
                        this.uxd565jk = identyUser;
                        if (!this.setFingers) {
                            int i5 = deduplication + 7;
                            generateST = i5 % 128;
                            if (i5 % 2 == 0) {
                                this.DeduplicationIdentyResponse = QualityMode.ENROLLMENT;
                                throw null;
                            }
                            this.DeduplicationIdentyResponse = QualityMode.ENROLLMENT;
                        }
                        this.h = new HashMap();
                        if (this.setScore[0].getFinger() != null) {
                            deduplication = (generateST + 13) % 128;
                            FingerDetectionMode[] fingerDetectionModeArr2 = this.setScore;
                            int i6 = ((int[]) objArr[1])[0];
                            int i7 = i6 * i6;
                            int i8 = -(781531493 * i6);
                            int i9 = (i7 & i8) + (i7 | i8);
                            int i10 = -(i6 * (-1992009029));
                            int i11 = ((i9 ^ i10) + ((i10 & i9) << 1)) - 1929559808;
                            int i12 = i11 >> 16;
                            int e = IdentyB.e((i12 | (-131071)) << 1, i12 ^ (-131071), 65536, -1);
                            int i13 = (i11 & e) + (e | i11);
                            int i14 = i11 >> 28;
                            int i15 = ((i14 ^ (-31)) + ((i14 & (-31)) << 1)) / 16;
                            int i16 = -((((i15 | 1) << 1) - (i15 ^ 1)) ^ i13);
                            int i17 = (i16 ^ 1) + ((i16 & 1) << 1);
                            int i18 = i17 >> 15;
                            int i19 = (((i18 | (-262143)) << 1) - (i18 ^ (-262143))) / 131072;
                            int i20 = ((i19 | 1) << 1) - (i19 ^ 1);
                        }
                        generateST = (deduplication + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
                        z = false;
                        if (this.setScore[0].getHand() == null) {
                            int i21 = deduplication + 103;
                            generateST = i21 % 128;
                            if (i21 % 2 != 0) {
                                hand = Hand.LEFT;
                            } else {
                                Hand hand2 = Hand.LEFT;
                                throw null;
                            }
                        } else {
                            hand = this.setScore[0].getHand();
                        }
                        if (z) {
                            this.PngjPrematureEnding.contains(hand);
                        } else {
                            this.PngjExceptionInternal.contains(hand);
                        }
                        return enroll();
                    }
                    throw new NoDetectionModeException();
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -1853456773);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4969;
            com.identy.Fpnative.valueOf = objArr;
            fingerDetectionModeArr = this.setScore;
            if (fingerDetectionModeArr == null) {
            }
            throw new NoDetectionModeException();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0098, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f7, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 4919;
        com.identy.Fpnative.valueOf = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0102, code lost:
    
        a(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0105, code lost:
    
        if (0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0107, code lost:
    
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 19) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x010e, code lost:
    
        0 = android.util.Base64.encodeToString(0, 0.isQualityFailed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x011d, code lost:
    
        if ((!0.resetAttempt) == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x011f, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0124, code lost:
    
        0 = new java.util.HashMap();
        0 = com.identy.enums.Hand.LEFT;
        0 = 0.length;
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x012e, code lost:
    
        if (0 >= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0130, code lost:
    
        0 = $$a[0];
        0 = (com.identy.enums.Hand) 0.first;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x013c, code lost:
    
        if (0.containsKey(0) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013e, code lost:
    
        0 = com.identy.IdentySdk.deduplication + 59;
        com.identy.IdentySdk.generateST = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0148, code lost:
    
        if ((0 % 2) == 0) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x014a, code lost:
    
        0 = (com.identy.IdentyA) 0.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0159, code lost:
    
        0 = 0;
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x016b, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x018f, code lost:
    
        0 = 0;
        0 = 0;
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01ac, code lost:
    
        0.put((com.identy.enums.Finger) 0.second, PngjException(0.getHand(), (com.identy.enums.Finger) 0.second, 0, 0, 0.PngjOutputException(), 0.e1(), 0, 0, 0.PngBadCharsetException(), 0.Action(), 0.a(), 0.PngjException, 0.Attempt(), 0, 0.PngjUnsupportedException, true, 0, 0.Action));
        0 = 0 + 1;
        0 = 0;
        0 = 0;
        0 = 0;
        0 = 0;
        0 = 0 == true ? 1 : 0;
        0 = 0;
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01db, code lost:
    
        0 = ((int[]) $$a_state[0])[0];
        0 = 0 * 0;
        0 = -(820773087 * 0);
        0 = (0 & 0) + (0 | 0);
        0 = -(0 * 727228273);
        0 = (0 & 0) + (0 | 0);
        0 = (0 & (-1011284416)) + ((-1011284416) | 0);
        0 = 0 >> 26;
        0 = ((0 ^ (-127)) + ((0 & (-127)) << 1)) / 64;
        0 = ((0 | 1) << 1) - (0 ^ 1);
        0 = -(com.identy.IdentyB.e(0 >> 22, 2047, 1024, -1) ^ (((0 | 0) << 1) - (0 ^ 0)));
        0 = (0 & 7) + (0 | 7);
        0 = 0 >> 25;
        0 = com.identy.IdentyB.a(0 & (-255), 0 | (-255), 128, -1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x023e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c8, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01cb, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ce, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0151, code lost:
    
        0 = (com.identy.IdentyA) 0.get(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0157, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0158, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01d1, code lost:
    
        0 = 0;
        0.f.onAttempt(0, 0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0122, code lost:
    
        0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0119, code lost:
    
        0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x023f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0240, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0241, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0245, code lost:
    
        if (0 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0247, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0248, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x009b, code lost:
    
        com.identy.IdentySdk.deduplication = (com.identy.IdentySdk.generateST + 13) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x002d, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0045, code lost:
    
        if (0 > 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0048, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = android.os.Process.myUid();
        0 = ~((-576524865) | 0);
        0 = ~0;
        0 = defpackage.a.c((~(0 | 1073741521)) | ((~((-996105938) | 0)) | 419581073), 497, (((~(0 | 1073741521)) | 0) * 497) + 429069360, -1194981449);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x002b, code lost:
    
        if (0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00a2, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = new java.lang.Object[1];
        d((short) 149, (byte) (-$$a[11]), (byte) (-$$a[111(0x6f, float:1.56E-43)]), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) 106, $$a[63], (byte) (-$$a[55]), 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, -1194981449);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00f0, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [com.identy.IdentyA, com.identy.getMatchingTime] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r1v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(FingerDetectionMode fingerDetectionMode, int i, Pair[] pairArr, HashMap hashMap, float f, float f2, float f3, long j, long j2, byte[] bArr, int i2) {
        Object[] objArr;
        Pair[] pairArr2 = pairArr;
        HashMap hashMap2 = hashMap;
        int i3 = deduplication + 17;
        generateST = i3 % 128;
        Throwable th = null;
        boolean z = true;
        if (i3 % 2 == 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i4 = 24 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0113, code lost:
    
        if (0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0115, code lost:
    
        0 = com.identy.IdentySdk.generateST + 123;
        0 = 0 % 128;
        com.identy.IdentySdk.deduplication = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x011e, code lost:
    
        if ((0 % 2) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0121, code lost:
    
        if (0.length == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0123, code lost:
    
        0 = 0 + 9;
        com.identy.IdentySdk.generateST = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x012a, code lost:
    
        if ((0 % 2) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x012c, code lost:
    
        0.PngjInputException = 0;
        0 = 77 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0135, code lost:
    
        return enroll(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0136, code lost:
    
        0.PngjInputException = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x013c, code lost:
    
        return enroll(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x013d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0143, code lost:
    
        throw new com.identy.exceptions.NoDetectionModeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0144, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0145, code lost:
    
        0 = 0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0149, code lost:
    
        if (0 != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x014b, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x014c, code lost:
    
        throw 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x001e, code lost:
    
        0 = 0 + 81;
        com.identy.IdentySdk.generateST = 0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0025, code lost:
    
        if ((0 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0027, code lost:
    
        0 = ((long[]) $$a_state[0])[1];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[1]).invoke(null, new java.lang.Object[1])).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0041, code lost:
    
        if (0 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
    
        0 = new java.lang.Object[]{new long[]{((long[]) $$a_state[0])[0]}, new int[1]};
        0 = java.lang.System.identityHashCode(0);
        0 = defpackage.a.c((~(0 | (-933833075))) | 138712576, 433, (((~(434943794 | 0)) | (-933833075)) * (-433)) + (((~((~0) | (-296231219))) * 433) + 523991850), 374120916);
        0 = 0 ^ (0 << 13);
        0 = 0 ^ (0 >>> 17);
        ((int[]) $$a_state[1])[0] = 0 ^ (0 << 5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0044, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
        0 = ((java.lang.Long) ((java.lang.reflect.Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005c, code lost:
    
        if (0 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x001c, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00aa, code lost:
    
        com.identy.IdentySdk.generateST = (com.identy.IdentySdk.deduplication + 27) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00b2, code lost:
    
        0 = com.identy.IdentySdk.$$d;
        0 = new java.lang.Object[1];
        d((short) 149, (byte) (-$$a[11]), (byte) (-$$a[111(0x6f, float:1.56E-43)]), 0);
        0 = java.lang.Class.forName((java.lang.String) $$a[0]);
        0 = new java.lang.Object[1];
        d((short) 106, $$a[63], (byte) (-$$a[55]), 0);
        0 = (java.lang.Object[]) 0.getMethod((java.lang.String) $$a[0], java.lang.Integer.TYPE).invoke(null, 374120916);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0100, code lost:
    
        0 = ((long[]) $$a_state[0])[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0106, code lost:
    
        ((long[]) $$a_state[0])[0] = 0 + 5014;
        com.identy.Fpnative.valueOf = null;
        0 = 0.setScore;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean enroll(IdentyUser identyUser, int i) {
        Object[] objArr;
        int i2 = generateST + 71;
        int i3 = i2 % 128;
        deduplication = i3;
        if (i2 % 2 != 0) {
            objArr = com.identy.Fpnative.valueOf;
            int i4 = 18 / 0;
        } else {
            objArr = com.identy.Fpnative.valueOf;
        }
    }

    /* JADX WARN: Type inference failed for: r0v41, types: [boolean, int] */
    public IdentySdk() {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int b = defpackage.a.b(1874571882);
                    int c = defpackage.a.c((~(b | 681792917)) | (~((~b) | (-182903638))), 627, (((~(182903637 | b)) | 681792917) * (-627)) + ((((-144851222) | b) * (-627)) - 230145396), 940326753);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4926;
                    com.identy.Fpnative.valueOf = objArr;
                    this.PngjBadSignature = false;
                    this.e = com.identy.Action.CAPTURE;
                    int i3 = ((int[]) objArr[1])[0];
                    int i4 = i3 * i3;
                    int i5 = -(914771209 * i3);
                    int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
                    int i7 = -(i3 * 1112992307);
                    int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
                    int i9 = (i8 ^ 710980996) + ((710980996 & i8) << 1);
                    int i10 = i9 >> 29;
                    int i11 = ((i10 & (-15)) + (i10 | (-15))) / 8;
                    int i12 = (i11 ^ 1) + ((i11 & 1) << 1);
                    int i13 = ((i9 | i12) << 1) - (i12 ^ i9);
                    int i14 = ((i9 >> 18) - 32767) / 16384;
                    int i15 = -(i13 ^ ((i14 & 1) + (i14 | 1)));
                    int i16 = (i15 & 2) + (i15 | 2);
                    int i17 = i16 >> 16;
                    int a = IdentyB.a(i17 ^ (-131071), (i17 & (-131071)) << 1, 65536, -1);
                    this.g = false;
                    this.h = new HashMap();
                    this.i = new HashMap();
                    this.Capture2TActivity = new Finger[]{Finger.INDEX, Finger.MIDDLE, Finger.RING, Finger.LITTLE, Finger.THUMB};
                    this.CaptureMode = false;
                    this.Capture4FActivity = true;
                    this.CaptureFingersActivity = new HashSet();
                    this.Capture2IndexActivity = Calendar.getInstance().getTimeInMillis();
                    this.CaptureRolledFingersActivity = false;
                    this.CapturePosition = false;
                    this.PngjOutputException = FingerMatchSecLevel.MEDIUM;
                    this.PngjUnsupportedException = 5;
                    this.PngjInputException = 30;
                    this.CaptureThumbActivity = com.identy.CaptureMode.H;
                    this.PngjExceptionInternal = new ArrayList();
                    this.PngjPrematureEnding = new ArrayList();
                    this.DeduplicationIdentyResponse = QualityMode.VERIFICATION;
                    this.setFingers = false;
                    this.setFoundMatchingTemplates = new HashMap();
                    this.getFingers = new HashMap();
                    this.toJson = false;
                    this.isFoundMatchingTemplates = 0;
                    this.ERRORS = 0;
                    this.Enroll4FActivity = 0;
                    this.Enroll2TActivity = 0;
                    this.Enroll2IndexActivity = 0;
                    this.toString = false;
                    this.FingerActivity = false;
                    this.FingerAS = new InlineGuideOption(300, 10);
                    this.EnrollFingersActivity = null;
                    this.getShortform = "adult";
                    this.Action = com.identy.FingerAS.BALANCED_VERY_HIGH;
                    this.e1 = false;
                    this.EnrollThumbActivity = false;
                    this.onErrorResponse = new HashMap();
                    this.getTemplates = false;
                    this.getIdentyQuality = false;
                    this.getHeight = false;
                    this.setSpoofScore = -1;
                    this.getAttempts = new HashMap();
                    this.setScore = new FingerDetectionMode[]{FingerDetectionMode.L4F};
                    this.getPadSub2 = new HashMap();
                    this.uxd565jj = false;
                    this.addEncryptedTemplates = true;
                    this.Attempt = WSQCompression.WSQ_10_1;
                    this.getPadSub1 = null;
                    this.getQualityScore = BuildConfig.FLAVOR;
                    this.isQualityFailed = 0;
                    this.getWidth = true;
                    this.addTemplates = "demo";
                    this.cvtyuv2bgr = true;
                    this.uxd566jk = false;
                    this.uxd565jk = null;
                    this.setDConfig = false;
                    this.cvtmat2ba = false;
                    this.configureroll = new ArrayList();
                    this.pfkrol = true;
                    this.resetAttempt = false;
                    this.configure = false;
                    this.destroy = UIAfterCaptures.ALERTS;
                    this.getServerRequest = 2000L;
                    this.getScore = com.identy.CapturePosition.HORIZONTAL;
                    this.pfkrolGetQuality = false;
                    this.ppk = false;
                    this.getCaptureTime = false;
                    this.getNfiq1Score = false;
                    this.getL1Score = null;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 940326753);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4926;
            com.identy.Fpnative.valueOf = objArr;
            this.PngjBadSignature = false;
            this.e = com.identy.Action.CAPTURE;
            int i32 = ((int[]) objArr[1])[0];
            int i42 = i32 * i32;
            int i52 = -(914771209 * i32);
            int i62 = (i42 ^ i52) + ((i42 & i52) << 1);
            int i72 = -(i32 * 1112992307);
            int i82 = ((i62 | i72) << 1) - (i72 ^ i62);
            int i92 = (i82 ^ 710980996) + ((710980996 & i82) << 1);
            int i102 = i92 >> 29;
            int i112 = ((i102 & (-15)) + (i102 | (-15))) / 8;
            int i122 = (i112 ^ 1) + ((i112 & 1) << 1);
            int i132 = ((i92 | i122) << 1) - (i122 ^ i92);
            int i142 = ((i92 >> 18) - 32767) / 16384;
            int i152 = -(i132 ^ ((i142 & 1) + (i142 | 1)));
            int i162 = (i152 & 2) + (i152 | 2);
            int i172 = i162 >> 16;
            int a2 = IdentyB.a(i172 ^ (-131071), (i172 & (-131071)) << 1, 65536, -1);
            this.g = false;
            this.h = new HashMap();
            this.i = new HashMap();
            this.Capture2TActivity = new Finger[]{Finger.INDEX, Finger.MIDDLE, Finger.RING, Finger.LITTLE, Finger.THUMB};
            this.CaptureMode = false;
            this.Capture4FActivity = true;
            this.CaptureFingersActivity = new HashSet();
            this.Capture2IndexActivity = Calendar.getInstance().getTimeInMillis();
            this.CaptureRolledFingersActivity = false;
            this.CapturePosition = false;
            this.PngjOutputException = FingerMatchSecLevel.MEDIUM;
            this.PngjUnsupportedException = 5;
            this.PngjInputException = 30;
            this.CaptureThumbActivity = com.identy.CaptureMode.H;
            this.PngjExceptionInternal = new ArrayList();
            this.PngjPrematureEnding = new ArrayList();
            this.DeduplicationIdentyResponse = QualityMode.VERIFICATION;
            this.setFingers = false;
            this.setFoundMatchingTemplates = new HashMap();
            this.getFingers = new HashMap();
            this.toJson = false;
            this.isFoundMatchingTemplates = 0;
            this.ERRORS = 0;
            this.Enroll4FActivity = 0;
            this.Enroll2TActivity = 0;
            this.Enroll2IndexActivity = 0;
            this.toString = false;
            this.FingerActivity = false;
            this.FingerAS = new InlineGuideOption(300, 10);
            this.EnrollFingersActivity = null;
            this.getShortform = "adult";
            this.Action = com.identy.FingerAS.BALANCED_VERY_HIGH;
            this.e1 = false;
            this.EnrollThumbActivity = false;
            this.onErrorResponse = new HashMap();
            this.getTemplates = false;
            this.getIdentyQuality = false;
            this.getHeight = false;
            this.setSpoofScore = -1;
            this.getAttempts = new HashMap();
            this.setScore = new FingerDetectionMode[]{FingerDetectionMode.L4F};
            this.getPadSub2 = new HashMap();
            this.uxd565jj = false;
            this.addEncryptedTemplates = true;
            this.Attempt = WSQCompression.WSQ_10_1;
            this.getPadSub1 = null;
            this.getQualityScore = BuildConfig.FLAVOR;
            this.isQualityFailed = 0;
            this.getWidth = true;
            this.addTemplates = "demo";
            this.cvtyuv2bgr = true;
            this.uxd566jk = false;
            this.uxd565jk = null;
            this.setDConfig = false;
            this.cvtmat2ba = false;
            this.configureroll = new ArrayList();
            this.pfkrol = true;
            this.resetAttempt = false;
            this.configure = false;
            this.destroy = UIAfterCaptures.ALERTS;
            this.getServerRequest = 2000L;
            this.getScore = com.identy.CapturePosition.HORIZONTAL;
            this.pfkrolGetQuality = false;
            this.ppk = false;
            this.getCaptureTime = false;
            this.getNfiq1Score = false;
            this.getL1Score = null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:3|(2:5|(11:7|8|9|10|12|13|(1:15)|16|17|18|19))|24|25|26|8|9|10|12|13|(0)|16|17|18|19) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ee A[Catch: Exception -> 0x0134, LOOP:0: B:14:0x00ec->B:15:0x00ee, LOOP_END, TryCatch #2 {Exception -> 0x0134, blocks: (B:13:0x00e3, B:15:0x00ee, B:17:0x012d), top: B:12:0x00e3 }] */
    /* JADX WARN: Type inference failed for: r2v29, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(FingerDetectionMode fingerDetectionMode, int i, Pair[] pairArr, long j, long j2, HashMap hashMap) {
        Object[] objArr;
        long j3;
        int length;
        int i2;
        int i3 = generateST + 125;
        deduplication = i3 % 128;
        if (i3 % 2 == 0) {
            Object[] objArr2 = com.identy.Fpnative.valueOf;
            try {
                try {
                    if (objArr2 != null) {
                        long j4 = ((long[]) objArr2[0])[0];
                        j3 = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                        if (j4 > j3) {
                            objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                            int c = defpackage.a.c((~((int) Runtime.getRuntime().maxMemory())) | (-50696193), 756, (((~((-50696193) | 0)) | 549585472) * (-756)) - 954705357, -282606622);
                            int i4 = c ^ (c << 13);
                            int i5 = i4 ^ (i4 >>> 17);
                            ((int[]) objArr[1])[0] = i5 ^ (i5 << 5);
                            deduplication = (generateST + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
                            ((long[]) objArr[0])[0] = j3 + 5018;
                            com.identy.Fpnative.valueOf = objArr;
                            a(fingerDetectionMode);
                            HashMap hashMap2 = new HashMap();
                            Hand hand = Hand.LEFT;
                            length = pairArr.length;
                            i2 = 0;
                            while (i2 < length) {
                                Pair pair = pairArr[i2];
                                Hand hand2 = (Hand) pair.first;
                                hashMap2.put((Finger) pair.second, (Attempt) values(new Object[]{this, fingerDetectionMode.getHand(), (Finger) pair.second, Long.valueOf(j), hashMap}, 0, 1772618473, 0, -1772618471, 0, 0));
                                i2++;
                                hand = hand2;
                            }
                            this.f.onAttempt(hand, i, hashMap2);
                            int i6 = ((int[]) objArr[1])[0];
                            int i7 = i6 * i6;
                            int i8 = -(20243993 * i6);
                            int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
                            int i10 = -(i6 * (-1692433399));
                            int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
                            int i12 = (i11 ^ (-795604191)) + (((-795604191) & i11) << 1);
                            int i13 = ((i12 >> 26) - 127) / 64;
                            int i14 = ((i13 | 1) << 1) - (i13 ^ 1);
                            int i15 = (i12 & i14) + (i14 | i12);
                            int i16 = ((i12 >> 18) - 32767) / 16384;
                            int i17 = -(i15 ^ ((i16 ^ 1) + ((i16 & 1) << 1)));
                            int i18 = (i17 & 2) + (i17 | 2);
                            int i19 = ((i18 >> 21) - 4095) / 2048;
                            int i0 = 550 / (((-(((i19 ^ 1) + ((i19 & 1) << 1)) + 1)) & i18) * 275);
                            deduplication = (generateST + 21) % 128;
                            return false;
                        }
                    }
                    a(fingerDetectionMode);
                    HashMap hashMap22 = new HashMap();
                    Hand hand3 = Hand.LEFT;
                    length = pairArr.length;
                    i2 = 0;
                    while (i2 < length) {
                    }
                    this.f.onAttempt(hand3, i, hashMap22);
                    int i62 = ((int[]) objArr[1])[0];
                    int i72 = i62 * i62;
                    int i82 = -(20243993 * i62);
                    int i92 = ((i72 | i82) << 1) - (i72 ^ i82);
                    int i102 = -(i62 * (-1692433399));
                    int i112 = (i92 ^ i102) + ((i102 & i92) << 1);
                    int i122 = (i112 ^ (-795604191)) + (((-795604191) & i112) << 1);
                    int i132 = ((i122 >> 26) - 127) / 64;
                    int i142 = ((i132 | 1) << 1) - (i132 ^ 1);
                    int i152 = (i122 & i142) + (i142 | i122);
                    int i162 = ((i122 >> 18) - 32767) / 16384;
                    int i172 = -(i152 ^ ((i162 ^ 1) + ((i162 & 1) << 1)));
                    int i182 = (i172 & 2) + (i172 | 2);
                    int i192 = ((i182 >> 21) - 4095) / 2048;
                    int i0 = 550 / (((-(((i192 ^ 1) + ((i192 & 1) << 1)) + 1)) & i182) * 275);
                    deduplication = (generateST + 21) % 128;
                    return false;
                } catch (Exception unused) {
                    return false;
                }
                byte[] bArr = $$d;
                byte b = (byte) (-bArr[11]);
                Object[] objArr3 = new Object[1];
                d((short) 88, b, (byte) (b + 4), objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                d((short) (-bArr[24]), bArr[63], bArr[116], objArr4);
                objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, -282606622);
                j3 = ((long[]) objArr[0])[0];
                ((long[]) objArr[0])[0] = j3 + 5018;
                com.identy.Fpnative.valueOf = objArr;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00f4  */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r2v27, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(FingerDetectionMode fingerDetectionMode, int i, HashMap hashMap, VerifyResult verifyResult, long j, long j2, long j3, byte[] bArr, long j4) {
        Object[] objArr;
        long j5;
        String encodeToString;
        int i0;
        String str;
        Iterator it;
        a aVar;
        Hand hand;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        int i2 = 2;
        boolean z = true;
        int i0 = 0;
        try {
            if (objArr2 != null) {
                generateST = (deduplication + 85) % 128;
                long j6 = ((long[]) objArr2[0])[0];
                j5 = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j6 > j5) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int identityHashCode = System.identityHashCode(this);
                    int c = defpackage.a.c((~(identityHashCode | 785118837)) | (~((~identityHashCode) | (-210265142))), 210, (((~(248247349 | 0)) | (~((-747136630) | identityHashCode))) * 210) - 114781423, -154879222);
                    int i3 = c ^ (c << 13);
                    int i4 = i3 ^ (i3 >>> 17);
                    ((int[]) objArr[1])[0] = i4 ^ (i4 << 5);
                    Object[] objArr3 = objArr;
                    ((long[]) objArr3[0])[0] = j5 + 5021;
                    com.identy.Fpnative.valueOf = objArr3;
                    if (bArr == null) {
                        try {
                            encodeToString = Base64.encodeToString(bArr, this.isQualityFailed);
                        } catch (Exception unused) {
                            0 = z;
                        }
                    } else {
                        encodeToString = null;
                    }
                    str = this.resetAttempt ? null : encodeToString;
                    ArrayList arrayList = new ArrayList();
                    HashMap hashMap2 = new HashMap();
                    it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        int i5 = deduplication + 107;
                        generateST = i5 % 128;
                        if (i5 % i2 != 0) {
                            Map.Entry entry = (Map.Entry) it.next();
                            aVar = (a) entry.getValue();
                            try {
                                hand = ((a) entry.getValue()).PngjOutputException;
                            } catch (Exception e) {
                                e.getMessage();
                                hand = 0;
                            }
                            if (hand == null) {
                                int i6 = deduplication + 103;
                                generateST = i6 % 128;
                                if (i6 % i2 == 0) {
                                    fingerDetectionMode.getHand();
                                    int i7 = 65 / 0;
                                } else {
                                    fingerDetectionMode.getHand();
                                }
                            }
                            HashMap hashMap3 = hashMap2;
                            ArrayList arrayList2 = arrayList;
                            0 = z;
                            Throwable th = 0;
                            a aVar2 = aVar;
                            int i8 = i2;
                            try {
                                hashMap3.put(aVar2.PngjBadSignature(), PngjException(hand, aVar.PngjBadSignature(), aVar2, verifyResult, j, j2, j3, str, j4));
                                arrayList = arrayList2;
                                arrayList.add(new Pair(aVar2.values(), aVar2.PngjBadSignature()));
                                hashMap2 = hashMap3;
                                z = 0 == true ? 1 : 0;
                                0 = th;
                                i2 = i8;
                            } catch (Exception unused2) {
                            }
                        } else {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            aVar = (a) entry2.getValue();
                            Hand hand2 = ((a) entry2.getValue()).PngjOutputException;
                            throw 0;
                        }
                    }
                    0 = z;
                    Throwable th2 = 0;
                    HashMap hashMap4 = hashMap2;
                    if (str != null) {
                        int i9 = generateST + 45;
                        deduplication = i9 % 128;
                        if (i9 % 2 != 0) {
                            this.i.put(arrayList, str);
                            throw th2;
                        }
                        this.i.put(arrayList, str);
                    }
                    this.f.onAttempt(fingerDetectionMode.getHand(), i, hashMap4);
                    int i10 = ((int[]) objArr3[0])[0];
                    int i11 = ((i10 * i10) - (~(-(186369595 * i10)))) - 1;
                    int i12 = -(i10 * 490313407);
                    int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
                    int i14 = (i13 & 1072834825) + (1072834825 | i13);
                    int i15 = i14 >> 27;
                    int i16 = ((i15 ^ (-63)) + ((i15 & (-63)) << 1)) / 32;
                    int i17 = ((i16 | 1) << 1) - (i16 ^ 1);
                    int i18 = (i14 & i17) + (i17 | i14);
                    int i19 = i14 >> 24;
                    int i20 = ((i19 ^ (-511)) + ((i19 & (-511)) << 1)) / 256;
                    int i21 = -(((i20 ^ 1) + ((i20 & 1) << 1)) ^ i18);
                    int i22 = (i21 & 7) + (i21 | 7);
                    int i23 = i22 >> 17;
                    int i24 = ((i23 & (-65535)) + (i23 | (-65535))) / 32768;
                    int i25 = (i24 ^ 1) + ((i24 & 1) << 1);
                    return false;
                }
            }
            byte[] bArr2 = $$d;
            Object[] objArr4 = new Object[1];
            d((short) 185, (byte) (-bArr2[11]), (byte) (-bArr2[62]), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            d((short) 154, (byte) (-bArr2[111]), bArr2[63], objArr5);
            objArr = (Object[]) cls.getMethod((String) objArr5[0], Integer.TYPE).invoke(null, -154879222);
            j5 = ((long[]) objArr[0])[0];
            deduplication = (generateST + 53) % 128;
            Object[] objArr32 = objArr;
            ((long[]) objArr32[0])[0] = j5 + 5021;
            com.identy.Fpnative.valueOf = objArr32;
            if (bArr == null) {
            }
            if (this.resetAttempt) {
            }
            ArrayList arrayList3 = new ArrayList();
            HashMap hashMap22 = new HashMap();
            it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
            }
            0 = z;
            Throwable th22 = 0;
            HashMap hashMap42 = hashMap22;
            if (str != null) {
            }
            this.f.onAttempt(fingerDetectionMode.getHand(), i, hashMap42);
            int i102 = ((int[]) objArr32[0])[0];
            int i112 = ((i102 * i102) - (~(-(186369595 * i102)))) - 1;
            int i122 = -(i102 * 490313407);
            int i132 = (i112 ^ i122) + ((i122 & i112) << 1);
            int i142 = (i132 & 1072834825) + (1072834825 | i132);
            int i152 = i142 >> 27;
            int i162 = ((i152 ^ (-63)) + ((i152 & (-63)) << 1)) / 32;
            int i172 = ((i162 | 1) << 1) - (i162 ^ 1);
            int i182 = (i142 & i172) + (i172 | i142);
            int i192 = i142 >> 24;
            int i202 = ((i192 ^ (-511)) + ((i192 & (-511)) << 1)) / 256;
            int i212 = -(((i202 ^ 1) + ((i202 & 1) << 1)) ^ i182);
            int i222 = (i212 & 7) + (i212 | 7);
            int i232 = i222 >> 17;
            int i242 = ((i232 & (-65535)) + (i232 | (-65535))) / 32768;
            int i252 = (i242 ^ 1) + ((i242 & 1) << 1);
            return false;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(ERRORS errors, Pair[] pairArr) {
        long j;
        Object[] objArr;
        ERRORS errors2;
        Action action;
        int i = deduplication + 81;
        generateST = i % 128;
        if (i % 2 != 0) {
            Object[] objArr2 = com.identy.Fpnative.valueOf;
            int i2 = 0;
            try {
                if (objArr2 != null) {
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        Object obj = new long[1];
                        Object[] objArr3 = {obj, new int[1]};
                        ((long[]) obj)[0] = ((long[]) objArr2[0])[0];
                        int i3 = ~(defpackage.a.b(928535101) | 418888685);
                        int c = defpackage.a.c(i3 | 12890688, 196, ((405997997 | i3) * (-196)) + 238510515, 1667225320);
                        int i4 = c ^ (c << 13);
                        int i5 = i4 ^ (i4 >>> 17);
                        ((int[]) objArr3[1])[0] = i5 ^ (i5 << 5);
                        objArr = objArr3;
                        Object[] objArr4 = objArr;
                        ((long[]) objArr4[0])[0] = j + 4905;
                        com.identy.Fpnative.valueOf = objArr4;
                        IdentyError identyError = new IdentyError(errors, pairArr, this.e, this.isQualityFailed, this.Attempt, this.getPadSub1, this.getQualityScore, this.values, this.getData, this.i);
                        errors2 = com.identy.ERRORS.TIMED_OUT;
                        if (!errors.equals(errors2)) {
                            generateST = (deduplication + 55) % 128;
                            if (!errors.equals(com.identy.ERRORS.ACTIVITY_PAUSED) && !errors.equals(com.identy.ERRORS.EXCEEDED_TRANSACTION_LIMIT)) {
                                int i6 = generateST + 53;
                                deduplication = i6 % 128;
                                if (i6 % 2 == 0) {
                                    if (!errors.equals(errors2) && !errors.equals(com.identy.ERRORS.ACTIVITY_PAUSED_ON_BACK_PRESSED) && !errors.equals(com.identy.ERRORS.USER_CANCELLED_ON_NEXT_DETECTION)) {
                                        this.f.onErrorResponse(identyError, q());
                                        return;
                                    }
                                } else {
                                    errors.equals(errors2);
                                    throw null;
                                }
                            }
                        }
                        Map<Hand, Map<Finger, getPadSub3>> map = this.h;
                        HashMap<Template, HashMap<Finger, ArrayList<TemplateSize>>> hashMap = this.getPadSub2;
                        action = this.e;
                        if (action != null) {
                            int i7 = deduplication + 33;
                            generateST = i7 % 128;
                            if (i7 % 2 != 0) {
                                if (action.equals(com.identy.Action.VERIFY)) {
                                    int i8 = ((int[]) objArr4[1])[0];
                                    int i9 = i8 * i8;
                                    int i10 = -(1780168329 * i8);
                                    int i11 = (i9 & i10) + (i9 | i10);
                                    int i12 = -(i8 * (-1270948307));
                                    int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                                    int i14 = ((i13 | 1315519577) << 1) - (1315519577 ^ i13);
                                    int i15 = i14 >> 22;
                                    int i16 = (((i15 | (-2047)) << 1) - (i15 ^ (-2047))) / 1024;
                                    int i17 = (i16 ^ 1) + ((i16 & 1) << 1);
                                    int i18 = (i14 & i17) + (i17 | i14);
                                    int i19 = ((i14 >> 20) - 8191) / ConstantsKt.DEFAULT_BLOCK_SIZE;
                                    int i20 = -(i18 ^ (((i19 | 1) << 1) - (i19 ^ 1)));
                                    int i21 = (i20 ^ 2) + ((i20 & 2) << 1);
                                    int i22 = i21 >> 23;
                                    int i23 = ((i22 ^ (-1023)) + ((i22 & (-1023)) << 1)) / ConstantsKt.MINIMUM_BLOCK_SIZE;
                                    int i24 = (i23 & 1) + (i23 | 1);
                                    i2 = 3970 / (((-((i24 & 1) + (i24 | 1))) & i21) * 1985);
                                }
                            } else {
                                action.equals(com.identy.Action.VERIFY);
                                throw null;
                            }
                        }
                        identyError.fillPrintsInfo(map, hashMap, true, i2, new ArrayList<>(Arrays.asList(pairArr)), new values(identyError));
                        return;
                    }
                }
                byte[] bArr = $$d;
                Object[] objArr5 = new Object[1];
                d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                d((short) 154, (byte) (-bArr[111]), bArr[63], objArr6);
                Object[] objArr7 = (Object[]) cls.getMethod((String) objArr6[0], Integer.TYPE).invoke(null, 1667225320);
                j = ((long[]) objArr7[0])[0];
                objArr = objArr7;
                Object[] objArr42 = objArr;
                ((long[]) objArr42[0])[0] = j + 4905;
                com.identy.Fpnative.valueOf = objArr42;
                IdentyError identyError2 = new IdentyError(errors, pairArr, this.e, this.isQualityFailed, this.Attempt, this.getPadSub1, this.getQualityScore, this.values, this.getData, this.i);
                errors2 = com.identy.ERRORS.TIMED_OUT;
                if (!errors.equals(errors2)) {
                }
                Map<Hand, Map<Finger, getPadSub3>> map2 = this.h;
                HashMap<Template, HashMap<Finger, ArrayList<TemplateSize>>> hashMap2 = this.getPadSub2;
                action = this.e;
                if (action != null) {
                }
                identyError2.fillPrintsInfo(map2, hashMap2, true, i2, new ArrayList<>(Arrays.asList(pairArr)), new values(identyError2));
                return;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        throw null;
    }

    public void a(boolean z) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            if (objArr2 != null) {
                generateST = (deduplication + 15) % 128;
                long j2 = ((long[]) objArr2[0])[0];
                j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                if (j2 > j) {
                    objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                    int elapsedCpuTime = (int) Process.getElapsedCpuTime();
                    int c = defpackage.a.c((~(elapsedCpuTime | 403682392)) | 497224127, 70, ((~(498056703 | elapsedCpuTime)) * 70) + (((~(95206887 | elapsedCpuTime)) | 402849816) * (-140)) + 617338149, 688392166);
                    int i = c ^ (c << 13);
                    int i2 = i ^ (i >>> 17);
                    ((int[]) objArr[1])[0] = i2 ^ (i2 << 5);
                    ((long[]) objArr[0])[0] = j + 4926;
                    com.identy.Fpnative.valueOf = objArr;
                    this.configure = z;
                    generateST = (deduplication + 25) % 128;
                    return;
                }
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 149, (byte) (-bArr[11]), (byte) (-bArr[111]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 106, bArr[63], (byte) (-bArr[55]), objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 688392166);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 4926;
            com.identy.Fpnative.valueOf = objArr;
            this.configure = z;
            generateST = (deduplication + 25) % 128;
            return;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        generateST = (deduplication + 75) % 128;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e5 A[Catch: JSONException -> 0x00ed, TryCatch #0 {JSONException -> 0x00ed, blocks: (B:8:0x00e1, B:10:0x00e5, B:11:0x00ef), top: B:7:0x00e1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(String str) {
        Object[] objArr;
        long j;
        Object[] objArr2 = com.identy.Fpnative.valueOf;
        try {
            try {
                if (objArr2 != null) {
                    generateST = (deduplication + 57) % 128;
                    long j2 = ((long[]) objArr2[0])[0];
                    j = ((Long) ((Method) com.d.e.a.values.valueOf[0]).invoke(null, null)).longValue();
                    if (j2 > j) {
                        objArr = new Object[]{new long[]{((long[]) objArr2[0])[0]}, new int[1]};
                        int myUid = Process.myUid();
                        int i = ~myUid;
                        int c = defpackage.a.c((~((-358514589) | i)) | 352455964, 859, (((~(myUid | (-6058625))) | (~(140374691 | i))) * 859) + ((myUid | 140374691) * (-859)) + 2095278780, 1225211945);
                        int i2 = c ^ (c << 13);
                        int i3 = i2 ^ (i2 >>> 17);
                        ((int[]) objArr[1])[0] = i3 ^ (i3 << 5);
                        generateST = (deduplication + 111) % 128;
                        ((long[]) objArr[0])[0] = j + 5007;
                        com.identy.Fpnative.valueOf = objArr;
                        if (this.getSpoofScore == null) {
                            this.getSpoofScore = new JSONArray();
                        }
                        this.getSpoofScore.put(new JSONObject(str));
                        return;
                    }
                }
                if (this.getSpoofScore == null) {
                }
                this.getSpoofScore.put(new JSONObject(str));
                return;
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
            byte[] bArr = $$d;
            Object[] objArr3 = new Object[1];
            d((short) 185, (byte) (-bArr[11]), (byte) (-bArr[62]), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            d((short) 154, (byte) (-bArr[111]), bArr[63], objArr4);
            objArr = (Object[]) cls.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 1225211945);
            j = ((long[]) objArr[0])[0];
            ((long[]) objArr[0])[0] = j + 5007;
            com.identy.Fpnative.valueOf = objArr;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
