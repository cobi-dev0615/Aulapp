package com.identy;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.AsyncTask;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import co.ceduladigital.sdk.s;
import co.ceduladigital.sdk.x5;
import com.android.volley.toolbox.Volley;
import com.identy.app.s3.ActionS3Meta;
import com.identy.app.s3.CaptureTiming;
import com.identy.app.s3.Captures3Meta;
import com.identy.app.s3.FrameS3Meta;
import com.identy.app.s3.FrameTiming;
import com.identy.app.s3.PostCaptureInput;
import com.identy.app.users.IdentyUser;
import com.identy.app.users.IdentyUserManager;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.enums.Template;
import com.identy.ex.ASResult;
import com.identy.ex.FingerError;
import com.identy.ex.PostCaptureError;
import com.identy.ex.PostCaptureOutPut;
import com.identy.ex.PreCaptureOutput;
import com.identy.imgutils.ImageUtils;
import com.identy.statusupdate.CaptureStatus;
import com.identy.statusupdate.FingerStatusUpdator;
import com.identy.values;
import com.karumi.dexter.BuildConfig;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.LongCompanionObject;
import org.camera.preview.PngjBadCrcException;
import org.cameracontroller.PngjBadSignature;
import org.identy.opencv.android.Utils;
import org.identy.opencv.core.Core;
import org.identy.opencv.core.Mat;
import org.identy.opencv.imgcodecs.Imgcodecs;
import org.identy.opencv.imgproc.Imgproc;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e1 extends BroadcastReceiver {
    private static  byte[] $$a = null;
    private static  int $$b = 0;
    private static  byte[] $$c = null;
    private static  int $$f = 0;
    private static  byte[] $$j = null;
    private static  int $$k = 0;
    private static int $10 = 0;
    private static int $11 = 0;
    public static long PngjBadCrcException = 0;
    public static int PngjBadSignature = 0;
    public static boolean PngjException = false;
    static long PngjInputException;
    static long PngjOutputException;
    public static int PngjPrematureEnding;
    static long PngjUnsupportedException;
    private static int configure;
    private static int getClassForDetection;
    private static int getKey;
    private static int getPersonSelected;
    private static char[] isIntroShownG;
    private static int markIntroSetting;
    private static int pfkrol;
    private static final long[] resetAttempt;
    private static char setPersonSelected;
    public static org.camera.preview.PngjBadCrcException.PngjBadSignature valueOf;
    public static long values;
    protected Activity Action;
    com.identy.d.PngjBadSignature Attempt;
    com.identy.PngjOutputException Capture2IndexActivity;
    org.c.a.PngjBadCrcException Capture2TActivity;
    FingerDetectionMode CapturePosition;
    RectF CaptureRolledFingersActivity;
    RectF CaptureRolledThumbActivity;
    boolean CaptureThumbActivity;
    float ERRORS;
    PostCaptureOutPut FingerActivity;
    int Fpnative;
    protected Hand a;
    int addTemplates;
    List closeDialog;
    private Vibrator configureroll;
    CaptureTiming cvtmat2ba;
    CapturePosition cvtyuv2bgr;
    public String e1;
    private long generateNFIQ;
    private int generateT;
    Integer getData;
    HandlerThread getFingers;
    List getHeight;
    int getIdentyQuality;
    com.identy.ui.PngjBadCrcException getL1Score;
    com.identy.ui.d.values getL2Score;
    boolean getL3Score;
    ProgressDialog getNfiq1Score;
    float[] getOveralTimetaken;
    IdentyUser getPadSub1;
    int getPadSub2_f;
    int getPadSub3;
    int getShortform;
    int getWidth;
    private FrameTiming isIntroShown;
    private int markIntroShown;
    private VibratorManager pfk;
    private CountDownTimer pfkrolChangeMinMaxWidth;
    private float ppk;
    private float rgenerate;
    boolean setDConfig;
    int setScore;
    int setSpoofScore;
    byte[] toJson;
    int uxd565jj;
    boolean uxd565jk;
    IdentySdk uxd566jk;
    ArrayList PngjExceptionInternal = new ArrayList();
    private int pfkrolGetQuality = 0;
    private final int getServerRequest = 100;
    private int pfkrolfinalizeF = 0;
    protected boolean onErrorResponse = false;
    protected boolean PngBadCharsetException = false;
    HashMap getAsHighestSecurityLevelReached = new HashMap();
    private ArrayList pfkrolfinalize = new ArrayList(2);
    private long destroy = Calendar.getInstance().getTimeInMillis();
    int getScore = 0;
    int isQualityFailed = 0;
    long getQualityScore = 0;
    Mat getFingerPrintQualityScore = null;
    boolean getCaptureTime = false;
    int getProcessingTime = 4;
    boolean getMatchingTime = false;
    List getSpoofScore = new ArrayList();
    long CaptureMode = 0;
    long Capture4FActivity = 0;
    float CaptureFingersActivity = 0.0f;
    private float generate = 0.0f;
    long DeduplicationIdentyResponse = 0;
    boolean isFoundMatchingTemplates = false;
    private int generateST = 0;
    private long matchMultiple = 0;
    private Long matchCaptured = 0L;
    long setFingers = 0;
    private Long deduplication = 0L;
    private boolean getPreviewClass = false;
    int setFoundMatchingTemplates = 0;
    int Enroll2IndexActivity = 0;
    int toString = 0;
    private boolean GuideNoGuideHelper = false;
    float[] Enroll2TActivity = new float[0];
    float[] Enroll4FActivity = new float[0];
    float[] FingerAS = new float[0];
    private long getRegistrationClass = 0;
    long EnrollThumbActivity = 0;
    private int[] generateID = null;
    boolean EnrollFingersActivity = false;
    Long FingerOutput = Long.valueOf(SystemClock.elapsedRealtimeNanos());
    boolean getTemplates = false;
    private boolean match = false;
    long closefDialog = 0;
    int getEncryptedTemplates = 0;
    byte[][] getAttempts = new byte[3][];
    private long getVerifyClass = LongCompanionObject.MAX_VALUE;
    Mat addEncryptedTemplates = null;
    private String getCaptureClass = null;
    StringBuilder isAuthSucess = new StringBuilder();

    public class Action implements Runnable {
        private /* synthetic */ CaptureStatus PngjException;
        private /* synthetic */ FingerStatusUpdator valueOf;

        public Action(FingerStatusUpdator fingerStatusUpdator, CaptureStatus captureStatus) {
            this.valueOf = fingerStatusUpdator;
            this.PngjException = captureStatus;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.valueOf.onStatusUpdate(this.PngjException);
        }
    }

    public class PngBadCharsetException implements Runnable {
        private /* synthetic */ int PngjBadCrcException;

        public PngBadCharsetException(int i) {
            this.PngjBadCrcException = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ProgressDialog progressDialog = e1.this.getNfiq1Score;
                if (progressDialog != null && progressDialog.isShowing()) {
                    e1.this.getNfiq1Score.dismiss();
                }
                e1.this.getNfiq1Score = new ProgressDialog(e1.this.Action);
                e1.this.getNfiq1Score.setTitle(BuildConfig.FLAVOR);
                e1.this.getNfiq1Score.setCancelable(false);
                e1 e1Var = e1.this;
                e1Var.getNfiq1Score.setMessage(e1Var.Action.getResources().getString(this.PngjBadCrcException));
                e1.this.getNfiq1Score.show();
            } catch (Exception unused) {
            }
        }
    }

    public class PngjBadCrcException implements View.OnClickListener {
        public PngjBadCrcException() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e1 e1Var = e1.this;
            e1Var.Attempt.valueOf(e1Var.PngjExceptionInternal());
        }
    }

    public class PngjBadSignature implements View.OnClickListener {
        public PngjBadSignature() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((FingerActivity) e1.this.Action).Action();
        }
    }

    public class PngjException implements Runnable {
        public PngjException() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                e1 e1Var = e1.this;
                if (e1Var.toJson != null) {
                    e1Var.PngjBadCrcException(0);
                    e1.this.PngjException(R.string.id_processing);
                    e1.this.PngjInputException();
                } else {
                    e1Var.Attempt.PngjBadSignature(null, false, true, null);
                }
                e1.this.getFingers.quitSafely();
            } catch (Throwable th) {
                e1.this.getFingers.quitSafely();
                throw new RuntimeException(th);
            }
        }
    }

    public class PngjExceptionInternal implements getSpoofScore {
        private /* synthetic */ long valueOf;
        final /* synthetic */ Mat values;

        public class values implements com.identy.PngjPrematureEnding {
            private /* synthetic */ HashMap PngjBadSignature;
            private /* synthetic */ PostCaptureOutPut values;

            public values(PostCaptureOutPut postCaptureOutPut, HashMap hashMap) {
                this.values = postCaptureOutPut;
                this.PngjBadSignature = hashMap;
            }

            @Override // com.identy.PngjPrematureEnding
            public final void PngjBadSignature(boolean z) {
                e1.this.Attempt.getNfiq1Score();
            }

            @Override // com.identy.PngjPrematureEnding
            public final void valueOf(JSONObject jSONObject) {
                Mat.n_release(PngjExceptionInternal.this.values.PngjException);
                com.identy.FingerAS fingerAS = com.identy.FingerAS.NONE;
                try {
                    boolean z = jSONObject.getBoolean("any_spoof_detected");
                    String[] split = jSONObject.getString("refid").split("-");
                    long longValue = split.length > 1 ? Long.valueOf(split[split.length - 1]).longValue() : 0L;
                    com.identy.FingerAS valueOf = com.identy.FingerAS.valueOf(jSONObject.getJSONArray("data").getJSONObject(0).getString("as_highest_security_level_reached"));
                    ASResult asResult = this.values.getAsResult();
                    asResult.liveness_true_up_to_security_level = valueOf;
                    asResult.setAsValidatedLocal(false);
                    asResult.setServerValidationTime(longValue);
                    asResult.asPass = !z;
                    com.identy.e1.values(new Object[]{e1.this, this.PngjBadSignature, Boolean.valueOf(z), this.values.getAsResult()}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -1059459396, com.identy.i.PngjPrematureEnding.values(), 1059459400, com.identy.i.PngjPrematureEnding.values());
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public PngjExceptionInternal(long j, Mat mat) {
            this.valueOf = j;
            this.values = mat;
        }

        @Override // com.identy.getSpoofScore
        public final /* synthetic */ void PngjException(Object obj, Object obj2) {
            PostCaptureOutPut postCaptureOutPut = (PostCaptureOutPut) obj;
            e1 e1Var = e1.this;
            if (e1Var.Attempt == null || postCaptureOutPut == null) {
                return;
            }
            e1Var.cvtmat2ba.put("PROCESS", Long.valueOf(this.valueOf));
            e1 e1Var2 = e1.this;
            e1Var2.FingerActivity = postCaptureOutPut;
            postCaptureOutPut.updateMetaTrack(e1Var2.Capture2IndexActivity);
            e1 e1Var3 = e1.this;
            com.identy.PngjOutputException pngjOutputException = e1Var3.Capture2IndexActivity;
            PostCaptureInput postCaptureInput = new PostCaptureInput(e1Var3.Enroll4FActivity, e1Var3.Enroll2TActivity, e1Var3.FingerAS, new float[0]);
            e1 e1Var4 = e1.this;
            e1Var4.PngjBadSignature(e1Var4.FingerActivity, postCaptureInput, e1Var4.e1);
            com.identy.PngjBadCrcException.PngjException("AFTER A POST CAPTURE ", this.valueOf);
            try {
                e1 e1Var5 = e1.this;
                if (!e1Var5.getL3Score) {
                    com.identy.ui.PngjBadCrcException pngjBadCrcException = e1Var5.getL1Score;
                    pngjBadCrcException.values = false;
                    pngjBadCrcException.PngjBadCrcException = false;
                    pngjBadCrcException.PngjException = (int) (pngjBadCrcException.valueOf / pngjBadCrcException.PngjInputException);
                    pngjBadCrcException.PngjBadSignature = true;
                    pngjBadCrcException.invalidate();
                }
            } catch (Exception unused) {
            }
            HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap = null;
            if (!e1.this.FingerActivity.isrtQualityPassed()) {
                e1.this.PngjExceptionInternal.add(getPadSub2.RTQ);
                Mat.n_release(this.values.PngjException);
                e1 e1Var6 = e1.this;
                if (e1Var6.Attempt != null) {
                    com.identy.e1.values(new Object[]{e1Var6}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                    e1 e1Var7 = e1.this;
                    e1Var7.Attempt.PngjBadSignature(null, false, true, e1Var7.FingerActivity.getRtQuality());
                    return;
                }
                return;
            }
            try {
                hashMap = e1.this.FingerActivity.getFingerRegions(IdentySdk.getInstance().getAction(), e1.this.CapturePosition);
            } catch (Exception e) {
                e.printStackTrace();
            }
            e1.this.FingerActivity.toString();
            if (e1.this.FingerActivity.isImagefromCaptured()) {
                Mat mat = e1.this.addEncryptedTemplates;
                if (mat != null) {
                    Mat.n_release(mat.PngjException);
                }
                e1.this.addEncryptedTemplates = new Mat(Mat.n_clone(this.values.PngjException));
            }
            if (e1.this.FingerActivity.isrfQualityPassed()) {
                IdentySdk identySdk = e1.this.uxd566jk;
                if (identySdk.getMatchingTime != null && identySdk.getOveralTimetaken != null && identySdk.PngjBadCrcException()) {
                    if (!e1.this.uxd566jk.getCaptureTime) {
                        String serverRequest = com.identy.Fpnative.getServerRequest(0L, (int) (Calendar.getInstance().getTimeInMillis() / 1000), e1.this.uxd566jk.isGimages());
                        ASResult asResult = postCaptureOutPut.getAsResult();
                        asResult.setAsValidatedLocal(false);
                        e1.this.uxd566jk.a(serverRequest);
                        com.identy.e1.values(new Object[]{e1.this, hashMap, Boolean.FALSE, asResult}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -1059459396, com.identy.i.PngjPrematureEnding.values(), 1059459400, com.identy.i.PngjPrematureEnding.values());
                        return;
                    }
                    try {
                        LibSettings.isSaveCaptured();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    new com.identy.values();
                    Activity activity = e1.this.Action;
                    String packageName = activity.getApplicationContext().getPackageName();
                    IdentySdk identySdk2 = e1.this.uxd566jk;
                    String str = identySdk2.getOveralTimetaken;
                    String values2 = identySdk2.values();
                    byte[] bArr = e1.this.uxd566jk.a;
                    values valuesVar = new values(postCaptureOutPut, hashMap);
                    String str2 = e1.this.uxd566jk.PngBadCharsetException;
                    String serverRequest2 = com.identy.Fpnative.getServerRequest(0L, (int) (Calendar.getInstance().getTimeInMillis() / 1000), false);
                    try {
                        JSONArray jSONArray = new JSONArray();
                        try {
                            jSONArray.put(new JSONObject(serverRequest2));
                            String values3 = com.identy.values.values(activity, packageName, values2, bArr, "--", jSONArray);
                            com.identy.getPadSub2.PngjException("Data", " -- data ".concat(String.valueOf(jSONArray)));
                            com.identy.getPadSub2.PngjException("Data", " -- data ".concat(String.valueOf(values3)));
                            com.identy.getPadSub2.PngjException("TAG", "? ?  server");
                            com.identy.values.PngjBadCrcException pngjBadCrcException2 = new com.identy.values.PngjBadCrcException(str, new com.identy.values.PngjException(valuesVar), new com.identy.values.PngjBadSignature(valuesVar), values3, str2);
                            pngjBadCrcException2.setRetryPolicy(new com.identy.values.C0027values());
                            Volley.newRequestQueue(activity, new com.identy.app.PngjInputException(activity)).add(pngjBadCrcException2);
                            return;
                        } catch (JSONException e3) {
                            throw new RuntimeException(e3);
                        }
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        return;
                    }
                }
            }
            try {
                LibSettings.isSaveCaptured();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            Mat.n_release(this.values.PngjException);
            com.identy.e1.values(new Object[]{e1.this, hashMap, Boolean.valueOf(!e1.this.FingerActivity.getAsResult().isAsPass()), e1.this.FingerActivity.getAsResult()}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -1059459396, com.identy.i.PngjPrematureEnding.values(), 1059459400, com.identy.i.PngjPrematureEnding.values());
        }
    }

    public class PngjInputException implements Runnable {

        public class PngjException implements Runnable {
            public PngjException() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e1 e1Var = e1.this;
                if (!e1Var.setDConfig) {
                    e1Var.Attempt.PngjBadSignature(R.string.id_captured, false);
                }
                e1.this.PngjException(CaptureStatus.CAPTURED);
            }
        }

        public PngjInputException() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Activity activity = e1.this.Action;
            if (activity == null || activity.isFinishing() || e1.this.Action.isDestroyed()) {
                return;
            }
            e1.this.Action.runOnUiThread(new PngjException());
        }
    }

    public class PngjOutputException implements com.identy.c.PngjBadCrcException {
        public static int PngjBadSignature;
        public static int PngjException;
        private /* synthetic */ boolean PngjBadCrcException;
        private /* synthetic */ boolean PngjInputException;
        private /* synthetic */ HashMap valueOf;
        private /* synthetic */ HashMap values = null;

        public PngjOutputException(HashMap hashMap, boolean z, boolean z2) {
            this.valueOf = hashMap;
            this.PngjBadCrcException = z;
            this.PngjInputException = z2;
        }

        public static int PngjBadSignature() {
            int i = PngjException;
            int i2 = i % 6081121;
            PngjException = i + 1;
            if (i2 != 0) {
                return PngjBadSignature;
            }
            int startUptimeMillis = (int) Process.getStartUptimeMillis();
            PngjBadSignature = startUptimeMillis;
            return startUptimeMillis;
        }

        @Override // com.identy.c.PngjBadCrcException
        public final void valueOf() {
            e1 e1Var = e1.this;
            int i = e1Var.getShortform - 1;
            e1Var.getShortform = i;
            if (i <= 0) {
                if (e1Var.FingerActivity.getError().equals(PostCaptureError.INCORRECT_BOXES)) {
                    e1 e1Var2 = e1.this;
                    if (e1Var2.Attempt != null) {
                        int values = com.identy.i.PngjPrematureEnding.values();
                        int values2 = com.identy.i.PngjPrematureEnding.values();
                        com.identy.e1.values(new Object[]{e1Var2}, com.identy.i.PngjPrematureEnding.values(), values, -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, values2);
                        e1 e1Var3 = e1.this;
                        e1Var3.Attempt.PngjBadSignature(null, false, true, e1Var3.FingerActivity.getRtQuality());
                    }
                } else {
                    e1 e1Var4 = e1.this;
                    long timeInMillis = Calendar.getInstance().getTimeInMillis();
                    e1 e1Var5 = e1.this;
                    e1Var4.Enroll2IndexActivity = (int) (timeInMillis - e1Var5.EnrollThumbActivity);
                    long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
                    e1 e1Var6 = e1.this;
                    e1Var5.toString = (int) (timeInMillis2 - e1Var6.Capture4FActivity);
                    com.identy.d.PngjBadSignature pngjBadSignature = e1Var6.Attempt;
                    if (pngjBadSignature != null) {
                        pngjBadSignature.PngjException(this.valueOf, null, null, this.PngjBadCrcException, this.PngjInputException);
                    }
                }
                if (this.PngjBadCrcException) {
                    return;
                }
                Object[] objArr = {e1.this};
                int values3 = com.identy.i.PngjPrematureEnding.values();
                int values4 = com.identy.i.PngjPrematureEnding.values();
                com.identy.e1.values(objArr, com.identy.i.PngjPrematureEnding.values(), values3, -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, values4);
            }
        }
    }

    public class PngjPrematureEnding extends CountDownTimer {
        public PngjPrematureEnding(long j) {
            super(j, 100L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            e1.this.DeduplicationIdentyResponse = j;
        }
    }

    public class PngjUnsupportedException implements Runnable {
        private /* synthetic */ Activity values;

        public PngjUnsupportedException(Activity activity) {
            this.values = activity;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Object[] objArr = {this.values};
                int values = com.identy.i.PngjPrematureEnding.values();
                int values2 = com.identy.i.PngjPrematureEnding.values();
                com.identy.e1.values(objArr, com.identy.i.PngjPrematureEnding.values(), values, 84848004, com.identy.i.PngjPrematureEnding.values(), -84848002, values2);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class a implements Runnable {

        public class PngjException implements Runnable {
            public PngjException() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.identy.d.PngjBadSignature pngjBadSignature = e1.this.Attempt;
                if (pngjBadSignature != null) {
                    pngjBadSignature.PngjBadSignature(R.string.id_hold_0, true);
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Activity activity = e1.this.Action;
            if (activity != null) {
                activity.runOnUiThread(new PngjException());
            }
        }
    }

    /* renamed from: com.identy.e1$e1, reason: collision with other inner class name */
    public class RunnableC0019e1 implements Runnable {
        private static  byte[] $$a = null;
        private static  int $$b = 0;
        private static  byte[] $$c = null;
        private static  int $$d = 0;
        private static int $10;
        private static int $11;
        private static char[] PngjBadSignature;
        private static long PngjException;
        private static int PngjInputException;
        private static int PngjUnsupportedException;
        private static char valueOf;
        private /* synthetic */ Runnable PngjBadCrcException;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(byte b, short s, short s2) {
            int i;
            int i2 = s2 + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground;
            byte[] bArr = $$c;
            int i3 = 3 - (b * 3);
            int i4 = s * 3;
            byte[] bArr2 = new byte[i4 + 1];
            if (bArr == null) {
                int i5 = i3;
                byte[] bArr3 = bArr;
                int i6 = 0;
                int i7 = i4;
                int i8 = (-i3) + i7;
                int i9 = i5;
                i2 = i8;
                i3 = i9;
                bArr = bArr3;
                i = i6;
                bArr2[i] = (byte) i2;
                i6 = i + 1;
                if (i == i4) {
                    return new String(bArr2, 0);
                }
                int i10 = i3 + 1;
                int i11 = i2;
                i5 = i10;
                i3 = bArr[i10];
                bArr3 = bArr;
                i7 = i11;
                int i82 = (-i3) + i7;
                int i92 = i5;
                i2 = i82;
                i3 = i92;
                bArr = bArr3;
                i = i6;
                bArr2[i] = (byte) i2;
                i6 = i + 1;
                if (i == i4) {
                    return new String(bArr2, 0);
                }
            } else {
                i = 0;
                bArr2[i] = (byte) i2;
                int i6 = i + 1;
                if (i == i4) {
                    return new String(bArr2, 0);
                }
            }
            return new String(bArr2, 0);
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            PngjInputException = 0;
            PngjUnsupportedException = 1;
            PngjBadSignature = new char[]{303, 315, 355, 289, 309, 308, 285, 268, 269, 372, 298, 288, 301, 265, 266, 272, 318, 306, 279, 305, 276, 287, 314, 282, 300, 374, 704, 313, 707, 262, 302, 319, 339, 299, 706, 705, 312, 310, 316, 278, 307, 297, 311, 353, 317, 280, 375, 304, 377};
            valueOf = (char) 13508;
            PngjException = 3886942181745859653L;
        }

        public RunnableC0019e1(Runnable runnable) {
            this.PngjBadCrcException = runnable;
        }

        private static void a(String str, int i, byte b, Object[] objArr) {
            int i2;
            int i3;
            char c;
            char c2;
            char c3;
            int i4;
            int i5;
            char[] charArray = str != null ? str.toCharArray() : null;
            com.d.e.PngjInputException pngjInputException = new com.d.e.PngjInputException();
            char[] cArr = PngjBadSignature;
            Class cls = Integer.TYPE;
            char c4 = '0';
            int i6 = 252968584;
            int i7 = 0;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    $11 = ($10 + 67) % 128;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i6);
                        if (PngjBadSignature2 == null) {
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int myPid = 28 - (Process.myPid() >> 22);
                            int mirror = 1579 - AndroidCharacter.getMirror(c4);
                            i4 = i6;
                            byte b2 = (byte) i7;
                            byte b3 = b2;
                            i5 = i7;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumFlingVelocity, myPid, mirror, -201551053, false, $$e(b2, b3, (byte) (b3 | 6)), new Class[]{cls});
                        } else {
                            i4 = i6;
                            i5 = i7;
                        }
                        cArr2[i8] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                        i8++;
                        i6 = i4;
                        i7 = i5;
                        c4 = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();

                        if (cause == null) {

                            throw new RuntimeException(th);

                        }

                        throw new RuntimeException(cause);
                    }
                }
                cArr = cArr2;
            }
            int i9 = i6;
            int i10 = i7;
            Object[] objArr3 = {Integer.valueOf(valueOf)};
            Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i9);
            int i11 = 1;
            if (PngjBadSignature3 == null) {
                byte b4 = (byte) i10;
                byte b5 = b4;
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), KeyEvent.normalizeMetaState(i10) + 28, View.resolveSize(i10, i10) + 1531, -201551053, false, $$e(b4, b5, (byte) (b5 | 6)), new Class[]{cls});
            }
            char charValue = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                pngjInputException.values = 0;
                while (true) {
                    int i12 = pngjInputException.values;
                    if (i12 >= i2) {
                        break;
                    }
                    char c5 = charArray[i12];
                    pngjInputException.valueOf = c5;
                    char c6 = charArray[i12 + 1];
                    pngjInputException.PngjException = c6;
                    if (c5 == c6) {
                        cArr3[i12] = (char) (c5 - b);
                        cArr3[i12 + 1] = (char) (c6 - b);
                        i3 = i11;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = pngjInputException;
                        objArr4[11] = Integer.valueOf(charValue);
                        objArr4[10] = pngjInputException;
                        objArr4[9] = pngjInputException;
                        objArr4[8] = Integer.valueOf(charValue);
                        objArr4[7] = pngjInputException;
                        objArr4[6] = pngjInputException;
                        objArr4[5] = Integer.valueOf(charValue);
                        objArr4[4] = pngjInputException;
                        objArr4[3] = pngjInputException;
                        objArr4[2] = Integer.valueOf(charValue);
                        objArr4[i11] = pngjInputException;
                        objArr4[0] = pngjInputException;
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1620847519);
                        if (PngjBadSignature4 == null) {
                            c = '\t';
                            char size = (char) View.MeasureSpec.getSize(0);
                            c2 = 7;
                            int indexOf = 26 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0, 0);
                            int i13 = 1475 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            c3 = '\b';
                            byte b6 = (byte) 0;
                            i3 = i11;
                            String $$e = $$e(b6, b6, (byte) $$c.length);
                            Class cls2 = Integer.TYPE;
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(size, indexOf, i13, 1670167002, false, $$e, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                        } else {
                            i3 = i11;
                            c = '\t';
                            c2 = 7;
                            c3 = '\b';
                        }
                        int intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
                        int i14 = pngjInputException.PngjUnsupportedException;
                        if (intValue == i14) {
                            Object[] objArr5 = new Object[11];
                            objArr5[10] = pngjInputException;
                            objArr5[c] = Integer.valueOf(charValue);
                            objArr5[c3] = pngjInputException;
                            objArr5[c2] = Integer.valueOf(charValue);
                            objArr5[6] = Integer.valueOf(charValue);
                            objArr5[5] = pngjInputException;
                            objArr5[4] = pngjInputException;
                            objArr5[3] = Integer.valueOf(charValue);
                            objArr5[2] = Integer.valueOf(charValue);
                            objArr5[i3] = pngjInputException;
                            objArr5[0] = pngjInputException;
                            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1410004713);
                            if (PngjBadSignature5 == null) {
                                char offsetBefore = (char) (TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 37426);
                                int pressedStateDuration = 26 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                int defaultSize = View.getDefaultSize(0, 0) + 1017;
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                String $$e2 = $$e(b7, b8, (byte) (b8 + 2));
                                Class cls3 = Integer.TYPE;
                                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(offsetBefore, pressedStateDuration, defaultSize, 1461347500, false, $$e2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                            }
                            int intValue2 = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue();
                            int i15 = (pngjInputException.PngjBadCrcException * charValue) + pngjInputException.PngjUnsupportedException;
                            int i16 = pngjInputException.values;
                            cArr3[i16] = cArr[intValue2];
                            cArr3[i16 + 1] = cArr[i15];
                        } else {
                            int i17 = pngjInputException.PngjBadSignature;
                            int i18 = pngjInputException.PngjBadCrcException;
                            if (i17 == i18) {
                                $10 = ($11 + 125) % 128;
                                int i19 = i3;
                                int C = x5.C(pngjInputException.PngjOutputException, charValue, i19, charValue);
                                pngjInputException.PngjOutputException = C;
                                int C2 = x5.C(i14, charValue, i19, charValue);
                                pngjInputException.PngjUnsupportedException = C2;
                                int i20 = (i18 * charValue) + C2;
                                int i21 = pngjInputException.values;
                                cArr3[i21] = cArr[(i17 * charValue) + C];
                                cArr3[i21 + i19] = cArr[i20];
                                i3 = 1;
                            } else {
                                int i22 = (i17 * charValue) + i14;
                                int i23 = (i18 * charValue) + pngjInputException.PngjOutputException;
                                int i24 = pngjInputException.values;
                                cArr3[i24] = cArr[i22];
                                i3 = 1;
                                cArr3[i24 + 1] = cArr[i23];
                            }
                        }
                    }
                    pngjInputException.values += 2;
                    i11 = i3;
                }
            }
            for (int i25 = 0; i25 < i; i25++) {
                cArr3[i25] = (char) (cArr3[i25] ^ 13722);
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x023a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void b(String str, int i, Object[] objArr) {
            Throwable cause;
            char c;
            long j;
            char[] charArray = str != null ? str.toCharArray() : null;
            com.d.e.PngjUnsupportedException pngjUnsupportedException = new com.d.e.PngjUnsupportedException();
            pngjUnsupportedException.PngjBadCrcException = i;
            int length = charArray.length;
            long[] jArr = new long[length];
            pngjUnsupportedException.valueOf = 0;
            while (true) {
                int i2 = pngjUnsupportedException.valueOf;
                if (i2 >= charArray.length) {
                    break;
                }
                int i3 = $10 + 89;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                Class cls = Integer.TYPE;
                if (i4 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(charArray[i2]), pngjUnsupportedException, pngjUnsupportedException};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-930920279);
                        if (PngjBadSignature2 == null) {
                            c = 1;
                            byte b = (byte) 0;
                            j = 2636593786896957769L;
                            byte b2 = b;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ('0' - AndroidCharacter.getMirror('0')), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 48, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 943, 879502610, false, $$e(b, b2, b2), new Class[]{cls, Object.class, Object.class});
                        } else {
                            c = 1;
                            j = 2636593786896957769L;
                        }
                        jArr[i2] = ((Long) ((Method) PngjBadSignature2).invoke(null, objArr2)).longValue() / (PngjException + j);
                        Object[] objArr3 = new Object[2];
                        objArr3[c] = pngjUnsupportedException;
                        objArr3[0] = pngjUnsupportedException;
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
                        if (PngjBadSignature3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (35511 - Color.blue(0)), 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 506 - ExpandableListView.getPackedPositionChild(0L), 74289954, false, $$e(b3, b4, (byte) (b4 + 5)), new Class[]{Object.class, Object.class});
                        }
                        ((Method) PngjBadSignature3).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause2 = th.getCause();
                        if (cause2 != null) {
                            throw new RuntimeException(cause2);
                        }
                        throw new RuntimeException(th);
                    }
                } else {
                    Object[] objArr4 = {Integer.valueOf(charArray[i2]), pngjUnsupportedException, pngjUnsupportedException};
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-930920279);
                    if (PngjBadSignature4 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 48 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 944, 879502610, false, $$e(b5, b6, b6), new Class[]{cls, Object.class, Object.class});
                    }
                    jArr[i2] = ((Long) ((Method) PngjBadSignature4).invoke(null, objArr4)).longValue() ^ (PngjException ^ 2636593786896957769L);
                    Object[] objArr5 = {pngjUnsupportedException, pngjUnsupportedException};
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
                    if (PngjBadSignature5 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (35511 - Color.alpha(0)), ImageFormat.getBitsPerPixel(0) + 43, 507 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 74289954, false, $$e(b7, b8, (byte) (b8 + 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature5).invoke(null, objArr5);
                }
            }
            char[] cArr = new char[length];
            pngjUnsupportedException.valueOf = 0;
            while (true) {
                int i5 = pngjUnsupportedException.valueOf;
                if (i5 >= charArray.length) {
                    objArr[0] = new String(cArr);
                    return;
                }
                int i6 = $11 + 25;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr[i5] = (char) jArr[i5];
                    Object[] objArr6 = {pngjUnsupportedException, pngjUnsupportedException};
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
                    if (PngjBadSignature6 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (35511 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 42 - KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), 507 - (ViewConfiguration.getFadingEdgeLength() >> 16), 74289954, false, $$e(b9, b10, (byte) (b10 + 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature6).invoke(null, objArr6);
                    int i7 = 37 / 0;
                } else {
                    cArr[i5] = (char) jArr[i5];
                    Object[] objArr7 = {pngjUnsupportedException, pngjUnsupportedException};
                    Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
                    if (PngjBadSignature7 == null) {
                        byte b11 = (byte) 0;
                        byte b12 = b11;
                        PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (35511 - View.resolveSize(0, 0)), 42 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 508, 74289954, false, $$e(b11, b12, (byte) (b12 + 5)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature7).invoke(null, objArr7);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:4:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(int i, short s, short s2, Object[] objArr) {
            int i2;
            int i3 = s2 + 4;
            int i4 = 112 - s;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[13 - i];
            int i5 = 12 - i;
            if (bArr == null) {
                int i6 = i5;
                i2 = 0;
                i4 += i6;
                i3++;
                bArr2[i2] = (byte) i4;
                if (i2 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i2++;
                i6 = bArr[i3];
                i4 += i6;
                i3++;
                bArr2[i2] = (byte) i4;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                i3++;
                bArr2[i2] = (byte) i4;
                if (i2 == i5) {
                }
            }
        }

        public static void init$0() {
            $$a = new byte[]{15, 64, -39, -48, -10, 5, -52, 30, -7, 3, -37, 51, -21, 2, 11, 4, -11, 6, -1};
            $$b = 188;
        }

        public static void init$1() {
            $$c = new byte[]{9, -127, 65, -87};
            $$d = 154;
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1602)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:298)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] values(android.content.Context r52, int r53, int r54, int r55) {
            /*
                Method dump skipped, instructions count: 9189
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.identy.e1.RunnableC0019e1.values(android.content.Context, int, int, int):java.lang.Object[]");
        }

        @Override // java.lang.Runnable
        public void run() {
            PngjUnsupportedException = (PngjInputException + 105) % 128;
            this.PngjBadCrcException.run();
            PngjInputException = (PngjUnsupportedException + 111) % 128;
        }
    }

    public class getAsHighestSecurityLevelReached implements View.OnClickListener {
        public getAsHighestSecurityLevelReached() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((FingerActivity) e1.this.Action).getPadSub3();
        }
    }

    public class getPadSub1 implements View.OnClickListener {
        public getPadSub1() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((FingerActivity) e1.this.Action).Action();
        }
    }

    public enum getPadSub2 {
        RTQ,
        RFQ,
        AS
    }

    public class getPadSub3 implements View.OnClickListener {
        public getPadSub3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ((FingerActivity) e1.this.Action).getPadSub3();
        }
    }

    public class onErrorResponse implements Runnable {
        public static int PngjBadSignature;
        public static int valueOf;

        public onErrorResponse() {
        }

        public static int PngjException() {
            int i = valueOf;
            int i2 = i % 6268795;
            valueOf = i + 1;
            if (i2 != 0) {
                return PngjBadSignature;
            }
            int uptimeMillis = (int) SystemClock.uptimeMillis();
            PngjBadSignature = uptimeMillis;
            return uptimeMillis;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ProgressDialog progressDialog = e1.this.getNfiq1Score;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                e1.this.getNfiq1Score = null;
            } catch (Exception unused) {
            }
        }
    }

    public class valueOf implements View.OnClickListener {
        public valueOf() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e1 e1Var = e1.this;
            e1Var.Attempt.valueOf(e1Var.PngjExceptionInternal());
        }
    }

    public class values implements DialogInterface.OnDismissListener {
        public values() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            e1 e1Var = e1.this;
            e1Var.Attempt.valueOf(e1Var.PngjExceptionInternal());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(int i, short s, int i2) {
        int i3;
        int i4 = 121 - (i * 2);
        int i5 = s * 3;
        byte[] bArr = $$c;
        int i6 = i2 + 4;
        byte[] bArr2 = new byte[i5 + 1];
        if (bArr == null) {
            i4 = i5;
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i6;
            i4 += -i6;
            i6 = i8;
            bArr = bArr3;
            i3 = i7;
            int i9 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i9];
            byte[] bArr4 = bArr;
            i8 = i9;
            i6 = b;
            i7 = i3 + 1;
            bArr3 = bArr4;
            i4 += -i6;
            i6 = i8;
            bArr = bArr3;
            i3 = i7;
            int i92 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
        } else {
            i3 = 0;
            int i922 = i6 + 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i5) {
                return new String(bArr2, 0);
            }
        }
        return new String(bArr2, 0);
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getKey = 0;
        getPersonSelected = 1;
        getClassForDetection = 0;
        markIntroSetting = 1;
        getPadSub2();
        PngjUnsupportedException = Calendar.getInstance().getTimeInMillis();
        resetAttempt = new long[]{500, 500};
        getPersonSelected = (getKey + 105) % 128;
    }

    public e1(Activity activity, boolean z, FingerDetectionMode fingerDetectionMode, boolean z2, boolean z3) {
        Vibrator defaultVibrator;
        this.generateNFIQ = 0L;
        this.CaptureThumbActivity = true;
        this.pfkrolChangeMinMaxWidth = null;
        this.generateT = 0;
        this.uxd566jk = null;
        this.cvtyuv2bgr = com.identy.CapturePosition.HORIZONTAL;
        this.Action = activity;
        this.setDConfig = z3;
        if (Build.VERSION.SDK_INT >= 31) {
            VibratorManager h = s.h(activity.getSystemService("vibrator_manager"));
            this.pfk = h;
            defaultVibrator = h.getDefaultVibrator();
            this.configureroll = defaultVibrator;
        } else {
            this.configureroll = (Vibrator) activity.getSystemService("vibrator");
        }
        this.isIntroShown = new FrameTiming();
        this.cvtmat2ba = new CaptureTiming();
        try {
            this.uxd566jk = IdentySdk.getInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.cvtyuv2bgr = this.uxd566jk.getScore;
        if ((activity instanceof FingerActivity) && z2) {
            activity.registerReceiver(this, new IntentFilter(com.identy.PngjBadSignature.PngjBadSignature), 4);
        }
        this.CapturePosition = fingerDetectionMode;
        try {
            IdentyUser B = IdentySdk.getInstance().B();
            this.getPadSub1 = B;
            if (B == null) {
                IdentyUser identyUser = new IdentyUser();
                this.getPadSub1 = identyUser;
                identyUser.username = IdentyUserManager.getdefUser();
            }
            this.uxd565jk = IdentySdk.getInstance().A();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        new Handler().postDelayed(new PngjUnsupportedException(activity), 0L);
        try {
            this.generateT = IdentySdk.getInstance().getAllowedTimeLimit();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        Attempt();
        PngjPrematureEnding pngjPrematureEnding = new PngjPrematureEnding(this.generateT * 1000);
        this.pfkrolChangeMinMaxWidth = pngjPrematureEnding;
        pngjPrematureEnding.start();
        this.CaptureThumbActivity = z;
        this.generateNFIQ = Calendar.getInstance().getTimeInMillis();
    }

    private void Attempt() {
        int i = getClassForDetection + 123;
        markIntroSetting = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        CountDownTimer countDownTimer = this.pfkrolChangeMinMaxWidth;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.setFingers = ((this.generateT * 1000) - this.DeduplicationIdentyResponse) - this.setFingers;
            this.pfkrolChangeMinMaxWidth = null;
            markIntroSetting = (getClassForDetection + 5) % 128;
        }
    }

    private static /* synthetic */ Object PngjBadCrcException(Object[] objArr) {
        e1 e1Var = (e1) objArr[0];
        getClassForDetection = (markIntroSetting + 51) % 128;
        e1Var.configureroll.vibrate(VibrationEffect.createWaveform(resetAttempt, -1));
        int i = markIntroSetting + 15;
        getClassForDetection = i % 128;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static long PngjException(Activity activity) {
        if (values == 0) {
            markIntroSetting = (getClassForDetection + 61) % 128;
            try {
                int values2 = com.identy.i.PngjPrematureEnding.values();
                int values3 = com.identy.i.PngjPrematureEnding.values();
                values(new Object[]{activity}, com.identy.i.PngjPrematureEnding.values(), values2, 84848004, com.identy.i.PngjPrematureEnding.values(), -84848002, values3);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        long j = values;
        getClassForDetection = (markIntroSetting + 37) % 128;
        return j;
    }

    private static void b(byte b, int i, short s, Object[] objArr) {
        byte[] bArr = $$j;
        int i2 = 111 - (i * 4);
        int i3 = b * 4;
        int i4 = 4 - (s * 3);
        byte[] bArr2 = new byte[26 - i3];
        int i5 = 25 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 = (i2 + (-i4)) - 5;
            i4++;
            bArr = bArr;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + (-bArr[i4])) - 5;
            i4++;
            bArr = bArr;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(byte b, short s, byte b2, Object[] objArr) {
        int i;
        int i2;
        int i3 = (b2 * 3) + 80;
        byte[] bArr = $$a;
        int i4 = 22 - (s * 18);
        int i5 = 19 - (b * 6);
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i3 = i3 + i6 + 5;
            i4++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i3 = i3 + i6 + 5;
            i4++;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i5) {
            }
        }
    }

    private static void d(String str, int i, byte b, Object[] objArr) {
        int i2;
        float f;
        char c;
        char c2;
        char c3;
        char c4;
        int length;
        char[] cArr;
        int i3;
        char c5;
        int i4;
        char[] charArray = str != null ? str.toCharArray() : null;
        com.d.e.PngjInputException pngjInputException = new com.d.e.PngjInputException();
        char[] cArr2 = isIntroShownG;
        Class cls = Integer.TYPE;
        int i5 = 252968584;
        char c6 = 2;
        int i6 = 0;
        if (cArr2 != null) {
            int i7 = $11 + 69;
            int i8 = i7 % 128;
            $10 = i8;
            if (i7 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            $11 = (i8 + 65) % 128;
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i9])};
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i5);
                    if (PngjBadSignature2 == null) {
                        i3 = i5;
                        byte b2 = (byte) i6;
                        c5 = c6;
                        byte b3 = b2;
                        i4 = i6;
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) TextUtils.getTrimmedLength(BuildConfig.FLAVOR), 28 - Color.argb(i6, i6, i6, i6), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1531, -201551053, false, $$i(b2, b3, (byte) (b3 - 1)), new Class[]{cls});
                    } else {
                        i3 = i5;
                        c5 = c6;
                        i4 = i6;
                    }
                    cArr[i9] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                    i9++;
                    i5 = i3;
                    c6 = c5;
                    i6 = i4;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            }
            cArr2 = cArr;
        }
        int i10 = i5;
        char c7 = c6;
        int i11 = i6;
        Object[] objArr3 = {Integer.valueOf(setPersonSelected)};
        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i10);
        float f2 = 0.0f;
        if (PngjBadSignature3 == null) {
            byte b4 = (byte) i11;
            byte b5 = b4;
            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (CdmaCellLocation.convertQuartSecToDecDegrees(i11) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i11) == 0.0d ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28, 1531 - (TypedValue.complexToFraction(i11, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i11, 0.0f, 0.0f) == 0.0f ? 0 : -1)), -201551053, false, $$i(b4, b5, (byte) (b5 - 1)), new Class[]{cls});
        }
        char charValue = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            pngjInputException.values = 0;
            while (true) {
                int i12 = pngjInputException.values;
                if (i12 >= i2) {
                    break;
                }
                char c8 = charArray[i12];
                pngjInputException.valueOf = c8;
                char c9 = charArray[i12 + 1];
                pngjInputException.PngjException = c9;
                if (c8 == c9) {
                    $11 = ($10 + 53) % 128;
                    cArr3[i12] = (char) (c8 - b);
                    cArr3[i12 + 1] = (char) (c9 - b);
                    f = f2;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = pngjInputException;
                    objArr4[11] = Integer.valueOf(charValue);
                    objArr4[10] = pngjInputException;
                    objArr4[9] = pngjInputException;
                    objArr4[8] = Integer.valueOf(charValue);
                    objArr4[7] = pngjInputException;
                    objArr4[6] = pngjInputException;
                    objArr4[5] = Integer.valueOf(charValue);
                    objArr4[4] = pngjInputException;
                    objArr4[3] = pngjInputException;
                    objArr4[c7] = Integer.valueOf(charValue);
                    objArr4[1] = pngjInputException;
                    objArr4[0] = pngjInputException;
                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1620847519);
                    if (PngjBadSignature4 == null) {
                        f = f2;
                        char tapTimeout = (char) (ViewConfiguration.getTapTimeout() >> 16);
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 27;
                        c = '\n';
                        c2 = '\t';
                        int defaultSize = View.getDefaultSize(0, 0) + 1475;
                        byte b6 = (byte) ($$f & 1);
                        c3 = 7;
                        byte b7 = (byte) (b6 - 1);
                        c4 = '\b';
                        String $$i = $$i(b6, b7, (byte) (b7 - 1));
                        Class cls2 = Integer.TYPE;
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(tapTimeout, maximumDrawingCacheSize, defaultSize, 1670167002, false, $$i, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        f = f2;
                        c = '\n';
                        c2 = '\t';
                        c3 = 7;
                        c4 = '\b';
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
                    int i13 = pngjInputException.PngjUnsupportedException;
                    if (intValue == i13) {
                        $11 = ($10 + 33) % 128;
                        Object[] objArr5 = new Object[11];
                        objArr5[c] = pngjInputException;
                        objArr5[c2] = Integer.valueOf(charValue);
                        objArr5[c4] = pngjInputException;
                        objArr5[c3] = Integer.valueOf(charValue);
                        objArr5[6] = Integer.valueOf(charValue);
                        objArr5[5] = pngjInputException;
                        objArr5[4] = pngjInputException;
                        objArr5[3] = Integer.valueOf(charValue);
                        objArr5[c7] = Integer.valueOf(charValue);
                        objArr5[1] = pngjInputException;
                        objArr5[0] = pngjInputException;
                        Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1410004713);
                        if (PngjBadSignature5 == null) {
                            char makeMeasureSpec = (char) (37426 - View.MeasureSpec.makeMeasureSpec(0, 0));
                            int i14 = 26 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1));
                            int keyRepeatTimeout = 1017 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            byte b8 = (byte) ($$f & 2);
                            byte b9 = (byte) (b8 - 2);
                            String $$i2 = $$i(b8, b9, (byte) (b9 - 1));
                            Class cls3 = Integer.TYPE;
                            PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(makeMeasureSpec, i14, keyRepeatTimeout, 1461347500, false, $$i2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        }
                        int intValue2 = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue();
                        int i15 = (pngjInputException.PngjBadCrcException * charValue) + pngjInputException.PngjUnsupportedException;
                        int i16 = pngjInputException.values;
                        cArr3[i16] = cArr2[intValue2];
                        cArr3[i16 + 1] = cArr2[i15];
                    } else {
                        int i17 = pngjInputException.PngjBadSignature;
                        int i18 = pngjInputException.PngjBadCrcException;
                        if (i17 == i18) {
                            int C = x5.C(pngjInputException.PngjOutputException, charValue, 1, charValue);
                            pngjInputException.PngjOutputException = C;
                            int C2 = x5.C(i13, charValue, 1, charValue);
                            pngjInputException.PngjUnsupportedException = C2;
                            int i19 = (i18 * charValue) + C2;
                            int i20 = pngjInputException.values;
                            cArr3[i20] = cArr2[(i17 * charValue) + C];
                            cArr3[i20 + 1] = cArr2[i19];
                        } else {
                            int i21 = (i17 * charValue) + i13;
                            int i22 = (i18 * charValue) + pngjInputException.PngjOutputException;
                            int i23 = pngjInputException.values;
                            cArr3[i23] = cArr2[i21];
                            cArr3[i23 + 1] = cArr2[i22];
                        }
                    }
                }
                pngjInputException.values += 2;
                $11 = ($10 + 111) % 128;
                f2 = f;
            }
        }
        for (int i24 = 0; i24 < i; i24++) {
            cArr3[i24] = (char) (cArr3[i24] ^ 13722);
        }
        String str2 = new String(cArr3);
        int i25 = $11 + 75;
        $10 = i25 % 128;
        if (i25 % 2 != 0) {
            throw null;
        }
        objArr[0] = str2;
    }

    private int[] getData() {
        int i = markIntroSetting + 17;
        getClassForDetection = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        if (!(!this.EnrollFingersActivity)) {
            int[] iArr = this.generateID;
            ImageUtils.valueOf(((byte[][]) this.getAttempts.clone())[0], this.getIdentyQuality, this.markIntroShown, iArr);
            this.generateID = iArr;
            markIntroSetting = (getClassForDetection + 105) % 128;
        }
        this.getTemplates = false;
        return this.generateID;
    }

    public static void getPadSub2() {
        isIntroShownG = new char[]{273, 304, 288, 298, 312, 308, 375, 282, 272, 297, 314, 301, 267, 307, 309, 317, 303, 306, 299, 266, 316, 305, 318, 311, 310};
        setPersonSelected = (char) 13510;
    }

    private static String getPadSub3() {
        BufferedReader bufferedReader;
        String property;
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"logcat", "-d"}).getInputStream()), ConstantsKt.DEFAULT_BLOCK_SIZE);
            property = System.getProperty("line.separator");
        } catch (Exception e) {
            e.printStackTrace();
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                int i = getClassForDetection + 5;
                markIntroSetting = i % 128;
                if (i % 2 == 0) {
                    sb.append(readLine);
                    sb.append(property);
                    int i2 = 13 / 0;
                } else {
                    sb.append(readLine);
                    sb.append(property);
                }
            }
            try {
                break;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        Runtime.getRuntime().exec(new String[]{"logcat", "-c"});
        markIntroSetting = (getClassForDetection + 17) % 128;
        return sb.toString();
    }

    private void getScore() {
        int i = getClassForDetection + 73;
        markIntroSetting = i % 128;
        try {
            if (i % 2 == 0) {
                this.pfkrolfinalize.iterator();
                throw null;
            }
            Iterator it = this.pfkrolfinalize.iterator();
            while (it.hasNext()) {
                int i2 = markIntroSetting + 61;
                getClassForDetection = i2 % 128;
                if (i2 % 2 != 0) {
                    Mat.n_release(((Mat) it.next()).PngjException);
                    throw null;
                }
                Mat.n_release(((Mat) it.next()).PngjException);
            }
            this.pfkrolfinalize.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void init$0() {
        $$a = new byte[]{126, 106, 85, 73, 25, -12, -2, -45, 26, -2, -38, 42, -20, -35, 46, -26, -3, 6, -1, -16, 1, -6, 25, -12, -2, -42, 46, -26, -3, 6, -1, -16, 1, -6};
        $$b = 36;
    }

    public static void init$1() {
        $$j = new byte[]{30, 69, 34, 112, -8, 6, 52, -64, 0, -6, -14, -11, -10, 70, -70, -6, 6, -14, 6, -24, 67, -58, -17, -8, 8, 50, -36, -25, -24};
        $$k = 178;
    }

    public static void init$2() {
        $$c = new byte[]{27, 69, 52, -61};
        $$f = 79;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static org.camera.preview.PngjBadCrcException.PngjBadSignature valueOf(Context context) {
        boolean z;
        int i;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        activityManager.isLowRamDevice();
        activityManager.getMemoryClass();
        int largeMemoryClass = activityManager.getLargeMemoryClass();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        double d = memoryInfo.totalMem / 1.048576E9d;
        if (!activityManager.isLowRamDevice() && Runtime.getRuntime().availableProcessors() > 4) {
            if (activityManager.getMemoryClass() < 193) {
                int i2 = markIntroSetting + 33;
                getClassForDetection = i2 % 128;
                if (i2 % 2 == 0) {
                }
                while (!PngjException) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (z) {
                    if (d > 3.8d) {
                        int i3 = markIntroSetting + 3;
                        getClassForDetection = i3 % 128;
                        if (i3 % 2 == 0 ? configure < 200 : configure < 27808) {
                            return org.camera.preview.PngjBadCrcException.PngjBadSignature.HIGH;
                        }
                    }
                    if (d >= 3.0d) {
                        getClassForDetection = (markIntroSetting + 121) % 128;
                        if (configure < 300) {
                            return org.camera.preview.PngjBadCrcException.PngjBadSignature.MEDIUM;
                        }
                    }
                }
                org.camera.preview.PngjBadCrcException.PngjBadSignature pngjBadSignature = org.camera.preview.PngjBadCrcException.PngjBadSignature.LOW;
                i = markIntroSetting + 77;
                getClassForDetection = i % 128;
                if (i % 2 != 0) {
                    int i4 = 69 / 0;
                }
                return pngjBadSignature;
            }
            getClassForDetection = (markIntroSetting + 13) % 128;
            z = true;
            while (!PngjException) {
            }
            if (z) {
            }
            org.camera.preview.PngjBadCrcException.PngjBadSignature pngjBadSignature2 = org.camera.preview.PngjBadCrcException.PngjBadSignature.LOW;
            i = markIntroSetting + 77;
            getClassForDetection = i % 128;
            if (i % 2 != 0) {
            }
            return pngjBadSignature2;
        }
        z = false;
        while (!PngjException) {
        }
        if (z) {
        }
        org.camera.preview.PngjBadCrcException.PngjBadSignature pngjBadSignature22 = org.camera.preview.PngjBadCrcException.PngjBadSignature.LOW;
        i = markIntroSetting + 77;
        getClassForDetection = i % 128;
        if (i % 2 != 0) {
        }
        return pngjBadSignature22;
    }

    public static /* synthetic */ Object values(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        Object obj;
        int i8;
        int i9;
        int i10 = ~i2;
        int i11 = (~(i10 | i3)) | i5;
        int i12 = ~i5;
        int i13 = ~(i12 | i3 | i2);
        int i14 = (~(i2 | i12)) | i3 | (~(i10 | i5));
        int i15 = ((-2062754392) * i) + ((-381402339) * i4) + i3 + i5 + i6;
        int i16 = i15 * i15;
        int i17 = ((-1790509056) * i16) + (808452096 * i) + (1454768128 * i4) + (1303248896 * i6) + ((-14360446) * i14) + (14360446 * i13) + (i11 * 14360446) + (1288888451 * i5) + (1317609343 * i3) + 1063714816;
        int i18 = i4 * (-1583251481);
        int i19 = i * 1682205048;
        int i20 = i16 * (-427491328);
        int i21 = i20 + i19 + i18 + (i6 * (-1355236397)) + (i14 * 294) + (i13 * (-294)) + (i11 * (-294)) + (i5 * (-1355236103)) + ((i3 * (-1355236691)) - 921838429);
        int i22 = (i21 * i21 * 844169216) + i17;
        if (i22 == 1) {
            return PngjException(objArr);
        }
        if (i22 != 2) {
            return i22 != 3 ? i22 != 4 ? valueOf(objArr) : values(objArr) : PngjBadCrcException(objArr);
        }
        Activity activity = (Activity) objArr[0];
        if (PngjException) {
            Objects.toString(values(activity));
            return null;
        }
        Object[] uxd565jj = com.identy.Fpnative.uxd565jj(activity.getAssets(), values, PngjBadCrcException, PngjBadSignature(activity, "identy_data/identy_vfdata15.ort"));
        values = ((Long) uxd565jj[0]).longValue();
        if (((Integer) uxd565jj[1]).intValue() != 0) {
            int i23 = markIntroSetting + 109;
            getClassForDetection = i23 % 128;
            i7 = i23 % 2 != 0 ? ((Integer) uxd565jj[1]).intValue() : ((Integer) uxd565jj[1]).intValue();
        } else {
            i7 = configure;
        }
        configure = i7;
        if (uxd565jj.length > 3 && (obj = uxd565jj[2]) != null) {
            if (((Integer) obj).intValue() != 0) {
                i8 = ((Integer) uxd565jj[2]).intValue();
            } else {
                i8 = PngjBadSignature;
                markIntroSetting = (getClassForDetection + 21) % 128;
            }
            PngjBadSignature = i8;
            if (((Integer) uxd565jj[3]).intValue() != 0) {
                i9 = ((Integer) uxd565jj[3]).intValue();
                markIntroSetting = (getClassForDetection + 7) % 128;
            } else {
                i9 = pfkrol;
            }
            pfkrol = i9;
            PngjPrematureEnding = ((Integer) uxd565jj[4]).intValue() != 0 ? ((Integer) uxd565jj[4]).intValue() : PngjPrematureEnding;
            PngjException = true;
        }
        org.camera.preview.PngjBadCrcException.PngjBadSignature values2 = values(activity);
        " levelx : ".concat(String.valueOf(values2));
        com.identy.Fpnative.setDConfig(values, 0);
        return null;
    }

    public RectF Action() {
        List<RectF> PngjException2;
        int i;
        int i2 = getClassForDetection + 59;
        markIntroSetting = i2 % 128;
        if (i2 % 2 == 0) {
            PngjException2 = PngjException();
            i = 1;
        } else {
            PngjException2 = PngjException();
            i = 0;
        }
        RectF rectF = PngjException2.get(i);
        int i3 = markIntroSetting + 31;
        getClassForDetection = i3 % 128;
        if (i3 % 2 == 0) {
            return rectF;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0153, code lost:
    
        if (0.toUpperCase().trim().contains("ZEBRA") == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PngBadCharsetException() {
        long timeInMillis;
        this.getTemplates = true;
        long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
        try {
            PngjUnsupportedException = Calendar.getInstance().getTimeInMillis();
            Bitmap bitmap = null;
            if (this.EnrollFingersActivity) {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(this.getIdentyQuality, this.markIntroShown, Bitmap.Config.ARGB_8888);
                    try {
                        this.isIntroShown.put("createBMP", Long.valueOf(timeInMillis2));
                        long timeInMillis3 = Calendar.getInstance().getTimeInMillis();
                        int[] data = getData();
                        int i = this.getIdentyQuality;
                        createBitmap.setPixels(data, 0, i, 0, 0, i, this.markIntroShown);
                        this.isIntroShown.put("buildBMP", Long.valueOf(timeInMillis3));
                        long timeInMillis4 = Calendar.getInstance().getTimeInMillis();
                        Mat mat = this.getFingerPrintQualityScore;
                        if (mat != null && !Mat.n_empty(mat.PngjException)) {
                            getClassForDetection = (markIntroSetting + 37) % 128;
                            Mat.n_release(this.getFingerPrintQualityScore.PngjException);
                        }
                        Mat mat2 = new Mat();
                        this.getFingerPrintQualityScore = mat2;
                        Utils.PngjException(createBitmap, mat2);
                        this.isIntroShown.put("buildMAT", Long.valueOf(timeInMillis4));
                        timeInMillis = Calendar.getInstance().getTimeInMillis();
                        if (!createBitmap.isRecycled()) {
                            int i2 = getClassForDetection + 39;
                            markIntroSetting = i2 % 128;
                            if (i2 % 2 == 0) {
                                createBitmap.recycle();
                                throw null;
                            }
                            createBitmap.recycle();
                        }
                    } catch (Exception unused) {
                        bitmap = createBitmap;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        this.getTemplates = false;
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bitmap = createBitmap;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            int i3 = markIntroSetting + 73;
                            getClassForDetection = i3 % 128;
                            if (i3 % 2 != 0) {
                                bitmap.recycle();
                                int i4 = 28 / 0;
                            } else {
                                bitmap.recycle();
                            }
                        }
                        throw new RuntimeException(th);
                    }
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                }
            } else {
                int i5 = markIntroSetting;
                int i6 = i5 + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground;
                getClassForDetection = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                Mat mat3 = this.getFingerPrintQualityScore;
                if (mat3 != null) {
                    getClassForDetection = (i5 + 45) % 128;
                    if (!Mat.n_empty(mat3.PngjException)) {
                        Mat.n_release(this.getFingerPrintQualityScore.PngjException);
                    }
                }
                this.getFingerPrintQualityScore = valueOf(this.getPadSub3, this.getPadSub2_f);
                new Matrix().postRotate(90.0f);
                this.isIntroShown.put("Yuv420888ToMat", Long.valueOf(timeInMillis2));
                timeInMillis = Calendar.getInstance().getTimeInMillis();
                com.identy.Fpnative.cvtyuv2bgr(this.getFingerPrintQualityScore.PngjException, this.match);
                this.isIntroShown.put("cvtyuv2bgr", Long.valueOf(timeInMillis));
            }
            String str = Build.MANUFACTURER;
            if (!str.toUpperCase().contains("HYUNDAI")) {
                markIntroSetting = (getClassForDetection + 59) % 128;
                if (!str.toUpperCase().trim().contains("LAXTON")) {
                }
            }
            Mat mat4 = this.getFingerPrintQualityScore;
            Core.valueOf(mat4, mat4, 1);
            this.isIntroShown.put("ROTATEMAT", Long.valueOf(timeInMillis));
            timeInMillis = Calendar.getInstance().getTimeInMillis();
            this.closefDialog = Calendar.getInstance().getTimeInMillis() - timeInMillis;
        } catch (Exception unused3) {
        } catch (Throwable th3) {
            this.getTemplates = false;
            throw new RuntimeException(th3);
        }
        this.getTemplates = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x003f, code lost:
    
        if (0.contains("identy") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0041, code lost:
    
        com.identy.e1.getClassForDetection = (com.identy.e1.markIntroSetting + 89) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0051, code lost:
    
        if (com.identy.IdentySdk.getInstance().getAttackS() == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0037, code lost:
    
        if (com.identy.LibSettings.isSaveCaptured() != true) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (com.identy.LibSettings.isSaveCaptured() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PngjBadSignature(PostCaptureOutPut postCaptureOutPut, PostCaptureInput postCaptureInput, String str) {
        String packageName;
        IdentySdk identySdk;
        JSONObject jSONObject;
        String obj;
        int i = getClassForDetection + 3;
        markIntroSetting = i % 128;
        try {
            if (i % 2 == 0) {
                packageName = this.Action.getApplicationContext().getPackageName();
                int i2 = 73 / 0;
            } else {
                packageName = this.Action.getApplicationContext().getPackageName();
            }
            com.identy.Action action = com.identy.Action.ENROLL;
            FileOutputStream fileOutputStream = null;
            try {
                identySdk = IdentySdk.getInstance();
            } catch (Exception e) {
                e.printStackTrace();
                identySdk = null;
            }
            try {
                jSONObject = new Captures3Meta(identySdk.getInstallUserID(), identySdk.getInstallationID(), this.getCaptureClass, postCaptureInput, postCaptureOutPut, identySdk.getAction(), identySdk.getAttackS(), identySdk.getInternalTrnsactionID(), this.cvtmat2ba, new JSONArray()).toJson().put("logs", getPadSub3());
            } catch (JSONException e2) {
                e2.printStackTrace();
                jSONObject = null;
            }
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder();
            boolean isEmpty = ("".isEmpty());
            String str2 = BuildConfig.FLAVOR;
            if (isEmpty) {
                obj = BuildConfig.FLAVOR;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append("_");
                obj = sb2.toString();
            }
            sb.append(obj);
            if (!("".isEmpty())) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("");
                sb3.append("_");
                str2 = sb3.toString();
            }
            sb.append(str2);
            sb.append(str);
            String obj2 = sb.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(com.identy.app.PngjBadSignature.PngjBadCrcException("FINGER", "CAPTURED"));
            sb4.append("/");
            File file = new File(sb4.toString());
            file.mkdirs();
            try {
                fileOutputStream = new FileOutputStream(new File(file, obj2));
            } catch (Exception e3) {
                try {
                    if (LibSettings.isSaveCaptured()) {
                        e3.getMessage();
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            try {
                try {
                    try {
                        fileOutputStream.write(jSONObject2.getBytes());
                        fileOutputStream.flush();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            throw new RuntimeException(th);
                        } catch (Exception unused) {
                            throw new RuntimeException(th);
                        }
                    }
                } catch (Exception e5) {
                    com.identy.getPadSub2.PngjBadSignature("Exception", e5);
                    fileOutputStream.flush();
                }
                fileOutputStream.close();
            } catch (Exception unused2) {
            }
        } catch (Exception e6) {
            throw new RuntimeException(e6);
        }
    }

    public Pair[] PngjExceptionInternal() {
        Pair[] pairArr = {new Pair(this.a, Finger.INDEX), new Pair(this.a, Finger.MIDDLE), new Pair(this.a, Finger.RING), new Pair(this.a, Finger.LITTLE), new Pair(this.a, Finger.THUMB)};
        int i = getClassForDetection + 121;
        markIntroSetting = i % 128;
        if (i % 2 == 0) {
            int i2 = 61 / 0;
        }
        return pairArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b5, code lost:
    
        if (android.os.Build.MODEL.contains("DX8000") == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PngjInputException() {
        e1 e1Var;
        byte[] bArr = this.toJson;
        if (this.Action == null) {
            return;
        }
        try {
            if (this.Attempt != null) {
                markIntroSetting = (getClassForDetection + 121) % 128;
                if (bArr.length < 100) {
                    values(new Object[]{this}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                    this.Attempt.PngjBadSignature(null, false, false, null);
                    return;
                }
            }
            this.PngBadCharsetException = true;
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            Mat values2 = Imgcodecs.values(new org.identy.opencv.core.PngjException(bArr));
            this.cvtmat2ba.put("COVERT TO MAT", Long.valueOf(timeInMillis));
            long timeInMillis2 = Calendar.getInstance().getTimeInMillis();
            String str = Build.MANUFACTURER;
            if (!str.toUpperCase().contains("HYUNDAI") && !str.toUpperCase().trim().contains("LAXTON") && !str.toUpperCase().trim().contains("ZEBRA")) {
                getClassForDetection = (markIntroSetting + 69) % 128;
                if (!str.toUpperCase().trim().contains("INGENICO")) {
                }
            }
            Core.valueOf(values2, values2, 1);
            this.cvtmat2ba.put("ROTATE MAT", Long.valueOf(timeInMillis2));
            long timeInMillis3 = Calendar.getInstance().getTimeInMillis();
            Imgproc.valueOf(values2, values2);
            this.cvtmat2ba.put("CVTCOLOR MAT", Long.valueOf(timeInMillis3));
            long timeInMillis4 = Calendar.getInstance().getTimeInMillis();
            Activity activity = this.Action;
            ArrayList arrayList = this.pfkrolfinalize;
            PngjExceptionInternal pngjExceptionInternal = new PngjExceptionInternal(timeInMillis4, values2);
            boolean z = this.getPreviewClass;
            float[] fArr = this.Enroll4FActivity;
            float[] fArr2 = this.Enroll2TActivity;
            float[] fArr3 = this.FingerAS;
            int length = fArr.length;
            e1Var = this;
            try {
                getFingerPrintQualityScore getfingerprintqualityscore = new getFingerPrintQualityScore(activity, arrayList, e1Var, pngjExceptionInternal, z, fArr, fArr2, fArr3);
                Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
                byte b = $$j[8];
                byte b2 = b;
                Object[] objArr = new Object[1];
                b(b, b2, b2, objArr);
                Object[] objArr2 = (Object[]) Array.newInstance(Class.forName((String) objArr[0]), 1);
                objArr2[0] = values2;
                getfingerprintqualityscore.executeOnExecutor(executor, (Mat[]) objArr2);
            } catch (Exception e) {
                e.printStackTrace();
                com.identy.d.PngjBadSignature pngjBadSignature = e1Var.Attempt;
                if (pngjBadSignature != null) {
                    pngjBadSignature.PngjBadSignature(null, false, false, null);
                }
            }
        } catch (Exception e2) {
            e1Var = this;
        }
    }

    public final void PngjOutputException() {
        this.Capture2IndexActivity.valueOf = Calendar.getInstance().getTimeInMillis();
        Attempt();
        Mat mat = this.getFingerPrintQualityScore;
        if (mat != null) {
            markIntroSetting = (getClassForDetection + 103) % 128;
            if (!Mat.n_empty(mat.PngjException)) {
                markIntroSetting = (getClassForDetection + 125) % 128;
                Mat mat2 = this.addEncryptedTemplates;
                if (mat2 != null && !Mat.n_empty(mat2.PngjException)) {
                    Mat.n_release(this.addEncryptedTemplates.PngjException);
                }
                this.addEncryptedTemplates = new Mat(Mat.n_clone(this.getFingerPrintQualityScore.PngjException));
                PngBadCharsetException();
                Object[] objArr = {this, new Mat(Mat.n_clone(this.getFingerPrintQualityScore.PngjException)), 0};
                int values2 = com.identy.i.PngjPrematureEnding.values();
                int values3 = com.identy.i.PngjPrematureEnding.values();
                values(objArr, com.identy.i.PngjPrematureEnding.values(), values2, 433737572, com.identy.i.PngjPrematureEnding.values(), -433737572, values3);
            }
        }
        PngjInputException = Calendar.getInstance().getTimeInMillis();
        StringBuilder sb = new StringBuilder("meta_");
        sb.append(PngjInputException);
        sb.append("_");
        sb.append(this.getPadSub1.username);
        sb.append(".txt");
        this.e1 = sb.toString();
        com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
        if (pngjBadSignature != null) {
            markIntroSetting = (getClassForDetection + 29) % 128;
            pngjBadSignature.getAsHighestSecurityLevelReached();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:10|(2:12|(13:14|15|16|17|18|(2:20|(2:22|23)(3:24|25|26))|31|(1:33)|34|35|36|37|38))|45|(1:49)|15|16|17|18|(0)|31|(0)|34|35|36|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f2, code lost:
    
        0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
    
        0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] PngjPrematureEnding() {
        getClassForDetection = (markIntroSetting + 79) % 128;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        try {
            compressFormat = IdentySdk.getInstance().getGimageformat();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (compressFormat == null) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        Mat mat = this.addEncryptedTemplates;
        if (mat == null || Mat.n_empty(mat.PngjException)) {
            return new byte[0];
        }
        Mat mat2 = new Mat(Mat.n_clone(this.addEncryptedTemplates.PngjException));
        try {
            if (this.CaptureThumbActivity) {
                getClassForDetection = (markIntroSetting + 117) % 128;
                if (Mat.n_cols(mat2.PngjException) > Mat.n_rows(mat2.PngjException)) {
                    int i = getClassForDetection + 23;
                    markIntroSetting = i % 128;
                    int i2 = i % 2;
                    Core.valueOf(mat2, mat2, 0);
                    if (this.Action.getApplicationContext().getPackageName().contains("identy")) {
                        int i3 = getClassForDetection + 19;
                        markIntroSetting = i3 % 128;
                        if (i3 % 2 == 0) {
                            IdentySdk.getInstance().getAttackS();
                            throw null;
                        }
                        IdentySdk.getInstance().getAttackS();
                        markIntroSetting = (getClassForDetection + 29) % 128;
                    }
                    if (Mat.n_cols(mat2.PngjException) != 480) {
                        Imgproc.valueOf(mat2, mat2, new org.identy.opencv.core.valueOf(480.0d, 640.0d));
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(Mat.n_cols(mat2.PngjException), Mat.n_rows(mat2.PngjException), Bitmap.Config.ARGB_8888);
                    Utils.PngjBadSignature(mat2, createBitmap);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    createBitmap.compress(compressFormat, 100, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    createBitmap.recycle();
                    Mat.n_release(mat2.PngjException);
                    Mat.n_release(this.addEncryptedTemplates.PngjException);
                    this.addEncryptedTemplates = null;
                    return byteArray;
                }
            }
            if (this.Action.getApplicationContext().getPackageName().contains("identy")) {
            }
            if (Mat.n_cols(mat2.PngjException) != 480) {
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(Mat.n_cols(mat2.PngjException), Mat.n_rows(mat2.PngjException), Bitmap.Config.ARGB_8888);
            Utils.PngjBadSignature(mat2, createBitmap2);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            createBitmap2.compress(compressFormat, 100, byteArrayOutputStream2);
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            byteArrayOutputStream2.close();
            createBitmap2.recycle();
            Mat.n_release(mat2.PngjException);
            Mat.n_release(this.addEncryptedTemplates.PngjException);
            this.addEncryptedTemplates = null;
            return byteArray2;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (0 >= 0.getQualityMaxRetries()) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011c, code lost:
    
        if (0 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0121, code lost:
    
        0 = new com.identy.ui.c.getPadSub2(0.Action);
        0.PngjException = com.identy.R.string.id_timed_out_next_detection;
        0 = com.identy.R.string.id_retry;
        0 = new com.identy.e1.getAsHighestSecurityLevelReached(0);
        0.values = 0;
        0.valueOf = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0137, code lost:
    
        if (0 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0139, code lost:
    
        0 = com.identy.R.string.id_process;
        0 = new com.identy.e1.getPadSub1(0);
        0.PngjBadCrcException = 0;
        0.PngjBadSignature = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0151, code lost:
    
        0.show();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0145, code lost:
    
        0.PngjException = com.identy.R.string.id_timed_out_next_detection_no_skip;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0149, code lost:
    
        com.identy.e1.getClassForDetection = (com.identy.e1.markIntroSetting + 43) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x011f, code lost:
    
        if (0 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00e1, code lost:
    
        if (valueOf(true) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00af, code lost:
    
        if (0 >= 0.getSpoofMaxRetries()) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0085, code lost:
    
        if (0 >= 0.getQualityMinRetries()) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x002c, B:15:0x0036, B:18:0x0046, B:19:0x0053, B:24:0x007a, B:31:0x0098, B:34:0x009e, B:38:0x00b6, B:39:0x00c1, B:43:0x00d6, B:47:0x00e6, B:49:0x00ea, B:51:0x00f0, B:59:0x0121, B:61:0x0139, B:62:0x0151, B:63:0x01cd, B:65:0x0145, B:70:0x015a, B:72:0x0172, B:73:0x0182, B:74:0x017e, B:79:0x018d, B:80:0x01b2, B:81:0x00dd, B:84:0x00bc, B:89:0x00a4, B:92:0x00ab, B:94:0x0081, B:99:0x01d0), top: B:12:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x002c, B:15:0x0036, B:18:0x0046, B:19:0x0053, B:24:0x007a, B:31:0x0098, B:34:0x009e, B:38:0x00b6, B:39:0x00c1, B:43:0x00d6, B:47:0x00e6, B:49:0x00ea, B:51:0x00f0, B:59:0x0121, B:61:0x0139, B:62:0x0151, B:63:0x01cd, B:65:0x0145, B:70:0x015a, B:72:0x0172, B:73:0x0182, B:74:0x017e, B:79:0x018d, B:80:0x01b2, B:81:0x00dd, B:84:0x00bc, B:89:0x00a4, B:92:0x00ab, B:94:0x0081, B:99:0x01d0), top: B:12:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0188 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00bc A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x002c, B:15:0x0036, B:18:0x0046, B:19:0x0053, B:24:0x007a, B:31:0x0098, B:34:0x009e, B:38:0x00b6, B:39:0x00c1, B:43:0x00d6, B:47:0x00e6, B:49:0x00ea, B:51:0x00f0, B:59:0x0121, B:61:0x0139, B:62:0x0151, B:63:0x01cd, B:65:0x0145, B:70:0x015a, B:72:0x0172, B:73:0x0182, B:74:0x017e, B:79:0x018d, B:80:0x01b2, B:81:0x00dd, B:84:0x00bc, B:89:0x00a4, B:92:0x00ab, B:94:0x0081, B:99:0x01d0), top: B:12:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ab A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:13:0x002c, B:15:0x0036, B:18:0x0046, B:19:0x0053, B:24:0x007a, B:31:0x0098, B:34:0x009e, B:38:0x00b6, B:39:0x00c1, B:43:0x00d6, B:47:0x00e6, B:49:0x00ea, B:51:0x00f0, B:59:0x0121, B:61:0x0139, B:62:0x0151, B:63:0x01cd, B:65:0x0145, B:70:0x015a, B:72:0x0172, B:73:0x0182, B:74:0x017e, B:79:0x018d, B:80:0x01b2, B:81:0x00dd, B:84:0x00bc, B:89:0x00a4, B:92:0x00ab, B:94:0x0081, B:99:0x01d0), top: B:12:0x002c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean PngjUnsupportedException() {
        int i;
        com.identy.Action action;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!this.PngBadCharsetException && !this.getCaptureTime) {
            markIntroSetting = (getClassForDetection + 23) % 128;
            if (!this.onErrorResponse && this.DeduplicationIdentyResponse < 110) {
                try {
                    action = IdentySdk.getInstance().e;
                } catch (Exception unused) {
                    action = null;
                }
                if (action != null) {
                    try {
                        IdentySdk identySdk = IdentySdk.getInstance();
                        if (identySdk.isDisplayTransactionAlerts()) {
                            if (this.PngjExceptionInternal.size() > 0) {
                                markIntroSetting = (getClassForDetection + 89) % 128;
                                z = this.PngjExceptionInternal.contains(getPadSub2.AS);
                            } else {
                                z = false;
                            }
                            int intValue = identySdk.getQualityTriesCounter(this.CapturePosition).intValue();
                            int intValue2 = identySdk.c(this.CapturePosition).intValue();
                            if (identySdk.isEnableSkip()) {
                                int i2 = markIntroSetting + 37;
                                getClassForDetection = i2 % 128;
                                if (i2 % 2 != 0) {
                                    throw null;
                                }
                                if (z) {
                                    if (intValue2 >= identySdk.getSpoofMinRetries()) {
                                        z2 = true;
                                    }
                                }
                                if (z) {
                                    int i3 = getClassForDetection + 33;
                                    markIntroSetting = i3 % 128;
                                    if (i3 % 2 == 0) {
                                        int i4 = 61 / 0;
                                    } else {
                                        if (intValue >= identySdk.getQualityMaxRetries()) {
                                            z3 = true;
                                        }
                                        z3 = false;
                                    }
                                }
                                if (z) {
                                    identySdk.incrementQualityTriesCounter(this.CapturePosition);
                                } else {
                                    identySdk.e(this.CapturePosition);
                                }
                                boolean PngBadCharsetException2 = ((FingerActivity) this.Action).PngBadCharsetException();
                                if (!z3) {
                                    int i5 = markIntroSetting + 125;
                                    getClassForDetection = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        if (!valueOf(false)) {
                                            z4 = true;
                                        }
                                    }
                                    this.getCaptureTime = true;
                                    if (z4 && identySdk.isEnableAllFingerNistTemplate()) {
                                        Activity activity = this.Action;
                                        new com.identy.ui.c.PngjUnsupportedException(activity, ((FingerActivity) activity).getQualityScore, ((FingerActivity) activity).PngjExceptionInternal, ((FingerActivity) activity).onErrorResponse()).show();
                                        return true;
                                    }
                                    if (z4) {
                                        int i6 = getClassForDetection + 87;
                                        markIntroSetting = i6 % 128;
                                        if (i6 % 2 == 0) {
                                            int i7 = 26 / 0;
                                        }
                                        this.getCaptureTime = true;
                                    }
                                    if (z4 || PngBadCharsetException2) {
                                        if (!z4 && PngBadCharsetException2 && z2) {
                                            com.identy.ui.c.getPadSub2 getpadsub2 = new com.identy.ui.c.getPadSub2(this.Action);
                                            getpadsub2.PngjException = R.string.id_timed_out_next_detection_no_retries;
                                            int i8 = R.string.id_no;
                                            PngjBadCrcException pngjBadCrcException = new PngjBadCrcException();
                                            getpadsub2.PngjBadCrcException = i8;
                                            getpadsub2.PngjBadSignature = pngjBadCrcException;
                                            int i9 = R.string.id_yes;
                                            PngjBadSignature pngjBadSignature = new PngjBadSignature();
                                            getpadsub2.values = i9;
                                            getpadsub2.valueOf = pngjBadSignature;
                                            getpadsub2.show();
                                        }
                                        com.identy.ui.c.a aVar = new com.identy.ui.c.a(this.Action);
                                        aVar.PngjBadSignature = R.string.id_timed_out;
                                        aVar.PngjException = R.string.id_done;
                                        aVar.values(new values()).show();
                                    } else {
                                        com.identy.ui.c.getPadSub2 getpadsub22 = new com.identy.ui.c.getPadSub2(this.Action);
                                        getpadsub22.PngjException = R.string.id_timed_out_no_next_detection;
                                        int i10 = R.string.id_retry;
                                        getPadSub3 getpadsub3 = new getPadSub3();
                                        getpadsub22.values = i10;
                                        getpadsub22.valueOf = getpadsub3;
                                        if (z2) {
                                            int i11 = R.string.id_EXIT;
                                            valueOf valueof = new valueOf();
                                            getpadsub22.PngjBadCrcException = i11;
                                            getpadsub22.PngjBadSignature = valueof;
                                        } else {
                                            getpadsub22.PngjException = R.string.id_timed_out_no_next_detection_no_skip;
                                        }
                                        getpadsub22.show();
                                    }
                                    this.getCaptureTime = true;
                                }
                                z4 = false;
                                this.getCaptureTime = true;
                                if (z4) {
                                }
                                if (z4) {
                                }
                                if (z4) {
                                }
                                if (!z4) {
                                    com.identy.ui.c.getPadSub2 getpadsub23 = new com.identy.ui.c.getPadSub2(this.Action);
                                    getpadsub23.PngjException = R.string.id_timed_out_next_detection_no_retries;
                                    int i82 = R.string.id_no;
                                    PngjBadCrcException pngjBadCrcException2 = new PngjBadCrcException();
                                    getpadsub23.PngjBadCrcException = i82;
                                    getpadsub23.PngjBadSignature = pngjBadCrcException2;
                                    int i92 = R.string.id_yes;
                                    PngjBadSignature pngjBadSignature2 = new PngjBadSignature();
                                    getpadsub23.values = i92;
                                    getpadsub23.valueOf = pngjBadSignature2;
                                    getpadsub23.show();
                                    this.getCaptureTime = true;
                                }
                                com.identy.ui.c.a aVar2 = new com.identy.ui.c.a(this.Action);
                                aVar2.PngjBadSignature = R.string.id_timed_out;
                                aVar2.PngjException = R.string.id_done;
                                aVar2.values(new values()).show();
                                this.getCaptureTime = true;
                            }
                            z2 = false;
                            if (z) {
                            }
                            if (z) {
                            }
                            boolean PngBadCharsetException22 = ((FingerActivity) this.Action).PngBadCharsetException();
                            if (!z3) {
                            }
                            z4 = false;
                            this.getCaptureTime = true;
                            if (z4) {
                            }
                            if (z4) {
                            }
                            if (z4) {
                            }
                            if (!z4) {
                            }
                            com.identy.ui.c.a aVar22 = new com.identy.ui.c.a(this.Action);
                            aVar22.PngjBadSignature = R.string.id_timed_out;
                            aVar22.PngjException = R.string.id_done;
                            aVar22.values(new values()).show();
                            this.getCaptureTime = true;
                        } else {
                            this.Attempt.valueOf(PngjExceptionInternal());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return false;
                }
            }
        }
        boolean z5 = this.PngBadCharsetException;
        if (!z5) {
            int i12 = getClassForDetection + 45;
            markIntroSetting = i12 % 128;
            if (i12 % 2 != 0 ? PngjOutputException == 0 : PngjOutputException == 1) {
                PngjOutputException = Calendar.getInstance().getTimeInMillis();
            }
            this.generateST = 0;
            this.getL2Score.PngjBadCrcException = null;
            return true;
        }
        Activity activity2 = this.Action;
        if (activity2 != null) {
            markIntroSetting = (getClassForDetection + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % 128;
            if (z5 && ((FingerActivity) activity2).getQualityScore()) {
                return true;
            }
        }
        if (this.PngBadCharsetException && (i = this.generateST) <= 100) {
            int i13 = i + 1;
            this.generateST = i13;
            if (i13 == 1) {
                this.getVerifyClass = System.currentTimeMillis();
                this.matchCaptured = Long.valueOf((long) (((FingerActivity) this.Action).PngjOutputException.longValue() * 2.8d));
            }
            long currentTimeMillis = System.currentTimeMillis() - this.getVerifyClass;
            this.matchMultiple = currentTimeMillis;
            if (currentTimeMillis < 0) {
                return true;
            }
            long longValue = this.FingerOutput.longValue() - this.deduplication.longValue();
            if ((longValue < this.matchCaptured.longValue() * 0.9d || !this.GuideNoGuideHelper) && this.matchMultiple < 200) {
                com.identy.d.PngjBadSignature pngjBadSignature3 = this.Attempt;
                if (pngjBadSignature3 != null) {
                    pngjBadSignature3.getData();
                    getClassForDetection = (markIntroSetting + 83) % 128;
                }
                return true;
            }
            com.identy.d.PngjBadSignature pngjBadSignature4 = this.Attempt;
            if (pngjBadSignature4 != null) {
                pngjBadSignature4.getData();
            }
            if (this.generateST == 100 || ((longValue > this.matchCaptured.longValue() || !this.GuideNoGuideHelper) && this.matchMultiple > 270)) {
                this.getVerifyClass = Long.MIN_VALUE;
                this.matchMultiple = System.currentTimeMillis() - this.getVerifyClass;
                PngBadCharsetException();
                if (this.pfkrolfinalize.size() >= 2) {
                    values(new Object[]{this, new Mat(Mat.n_clone(this.getFingerPrintQualityScore.PngjException)), 1}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), 433737572, com.identy.i.PngjPrematureEnding.values(), -433737572, com.identy.i.PngjPrematureEnding.values());
                } else {
                    values(new Object[]{this, new Mat(Mat.n_clone(this.getFingerPrintQualityScore.PngjException)), -1}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), 433737572, com.identy.i.PngjPrematureEnding.values(), -433737572, com.identy.i.PngjPrematureEnding.values());
                }
                PngjBadCrcException(0);
                com.identy.d.PngjBadSignature pngjBadSignature5 = this.Attempt;
                if (pngjBadSignature5 != null) {
                    pngjBadSignature5.a();
                    HandlerThread handlerThread = new HandlerThread("post processing");
                    this.getFingers = handlerThread;
                    handlerThread.start();
                    new Handler(this.getFingers.getLooper()).post(new PngjException());
                    com.identy.d.PngjBadSignature pngjBadSignature6 = this.Attempt;
                    if (pngjBadSignature6 != null) {
                        pngjBadSignature6.getData();
                    }
                }
            } else {
                com.identy.d.PngjBadSignature pngjBadSignature7 = this.Attempt;
                if (pngjBadSignature7 != null) {
                    pngjBadSignature7.getData();
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x024a A[Catch: all -> 0x0273, TryCatch #0 {all -> 0x0273, blocks: (B:31:0x0239, B:33:0x024a, B:34:0x0276), top: B:30:0x0239 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x031c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        char c;
        int i;
        char c2;
        long j;
        char c3;
        boolean z;
        Object PngjBadSignature2;
        Object[] values$1eba2e16;
        Object PngjBadSignature3;
        Object PngjBadSignature4;
        Object[] objArr;
        long j2;
        Class<?> cls;
        Object[] objArr2;
        long j3;
        int i2 = markIntroSetting + 11;
        getClassForDetection = i2 % 128;
        if (i2 % 2 != 0) {
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
            if (PngjBadSignature5 == null) {
                char indexOf = (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 14831);
                int packedPositionChild = 27 - ExpandableListView.getPackedPositionChild(0L);
                c = 2;
                int lastIndexOf = 720 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0);
                j3 = -1;
                byte b = $$a[20];
                byte b2 = (byte) (b - 1);
                byte b3 = b;
                i = 864471691;
                c2 = 20;
                Object[] objArr3 = new Object[1];
                c(b2, b3, (byte) (b3 - 1), objArr3);
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, packedPositionChild, lastIndexOf, -815159504, false, (String) objArr3[0], null);
            } else {
                c = 2;
                i = 864471691;
                c2 = 20;
                j3 = -1;
            }
            j = ((Field) PngjBadSignature5).getLong(null);
            if (j != j3) {
                z = true;
                j2 = j + 1891;
                Object[] objArr4 = new Object[1];
                c3 = 3;
                d("\u0003\u0018\u0010\u0013\u0015\u0004\u0010\u0005\u0017\u0004\t\u0010\u0003\u0004\n\u0015\u0006\b\u0013\u0004\f\u000f", 22 - ExpandableListView.getPackedPositionGroup(0L), (byte) (111 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr4);
                cls = Class.forName((String) objArr4[0]);
                objArr2 = new Object[1];
                d("\u0018\n\t\u000e\u0000\u0017\u0011\n\u0018\u0000\n\f\u0000\u0006㘇", KeyEvent.normalizeMetaState(0) + 15, (byte) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 9), objArr2);
                if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr2[0], null).invoke(null, null)).longValue()) {
                    getClassForDetection = (markIntroSetting + 111) % 128;
                    Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                    if (PngjBadSignature6 == null) {
                        char keyCodeFromString = (char) (KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 14830);
                        int maxKeyCode = 28 - (KeyEvent.getMaxKeyCode() >> 16);
                        int mirror = AndroidCharacter.getMirror('0') + 673;
                        byte b4 = $$a[c2];
                        byte b5 = (byte) (b4 - 1);
                        Object[] objArr5 = new Object[1];
                        c(b4, b5, b5, objArr5);
                        PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyCodeFromString, maxKeyCode, mirror, -779023007, false, (String) objArr5[0], null);
                    }
                    Object[] objArr6 = (Object[]) ((Field) PngjBadSignature6).get(null);
                    values$1eba2e16 = new Object[4];
                    values$1eba2e16[0] = new int[]{0};
                    values$1eba2e16[1] = new int[1];
                    values$1eba2e16[3] = new int[]{0};
                    int i3 = ((int[]) objArr6[3])[0];
                    int i4 = ((int[]) objArr6[0])[0];
                    values$1eba2e16[c] = (String[]) objArr6[c];
                    int identityHashCode = System.identityHashCode(this);
                    int i5 = ~((-232977046) | identityHashCode);
                    int i6 = ~identityHashCode;
                    int c4 = defpackage.a.c((~(identityHashCode | (-801588929))) | (~(232977045 | i6)), 406, ((~((-2142230) | i6)) * (-406)) + ((i5 | (~(803731157 | i6))) * (-406)) + 2106375459, 216186827);
                    int i7 = c4 ^ (c4 << 13);
                    int i8 = i7 ^ (i7 >>> 17);
                    ((int[]) values$1eba2e16[1])[0] = i8 ^ (i8 << 5);
                }
                Object[] objArr7 = new Object[1];
                d("\u000e\u0003\u0013\u0001\t\u000b\u0003\u0018\u0015\u0007\u0011\u0004\u0001\r\u0000\n", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, (byte) (97 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                d("\u0000\u0010\u0015\u0018\u0010\u0006\f\u0001\u0001\u0000\u0001\u0017\t\u0016\u0014\u0000", 16 - Color.green(0), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63), objArr8);
                int intValue = ((Integer) cls2.getMethod((String) objArr8[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr9 = {1247923424};
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                    if (PngjBadSignature2 == null) {
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) KeyEvent.keyCodeFromString(BuildConfig.FLAVOR), TextUtils.getTrimmedLength(BuildConfig.FLAVOR) + 24, 697 - (ViewConfiguration.getLongPressTimeout() >> 16), 1457201313, false, null, new Class[]{Integer.TYPE});
                    }
                    values$1eba2e16 = com.identy.values.PngjBadSignature.values$1eba2e16(intValue, ((Constructor) PngjBadSignature2).newInstance(objArr9), 216186827);
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                    if (PngjBadSignature3 == null) {
                        char alpha = (char) (Color.alpha(0) + 14830);
                        int rgb = Color.rgb(0, 0, 0) + 16777244;
                        int makeMeasureSpec = 721 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        byte b6 = $$a[c2];
                        byte b7 = (byte) (b6 - 1);
                        Object[] objArr10 = new Object[1];
                        c(b6, b7, b7, objArr10);
                        PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(alpha, rgb, makeMeasureSpec, -779023007, false, (String) objArr10[0], null);
                    }
                    ((Field) PngjBadSignature3).set(null, values$1eba2e16);
                    try {
                        Object[] objArr11 = new Object[1];
                        d("\u0003\u0018\u0010\u0013\u0015\u0004\u0010\u0005\u0017\u0004\t\u0010\u0003\u0004\n\u0015\u0006\b\u0013\u0004\f\u000f", 22 - Color.blue(0), (byte) (111 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        d("\u0018\n\t\u000e\u0000\u0017\u0011\n\u0018\u0000\n\f\u0000\u0006㘇", 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (8 - Color.alpha(0)), objArr12);
                        Long valueOf2 = Long.valueOf(((Long) cls3.getDeclaredMethod((String) objArr12[0], null).invoke(null, null)).longValue());
                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                        if (PngjBadSignature4 == null) {
                            char c5 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14829);
                            int offsetBefore = 28 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0);
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 721;
                            byte b8 = $$a[c2];
                            byte b9 = (byte) (b8 - 1);
                            byte b10 = b8;
                            Object[] objArr13 = new Object[1];
                            c(b9, b10, (byte) (b10 - 1), objArr13);
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c5, offsetBefore, tapTimeout, -815159504, false, (String) objArr13[0], null);
                        }
                        ((Field) PngjBadSignature4).set(null, valueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();

                    if (cause == null) {

                        throw new RuntimeException(th);

                    }

                    throw new RuntimeException(cause);
                }
            } else {
                z = true;
                c3 = 3;
                Object[] objArr72 = new Object[1];
                d("\u000e\u0003\u0013\u0001\t\u000b\u0003\u0018\u0015\u0007\u0011\u0004\u0001\r\u0000\n", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, (byte) (97 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr72);
                Class<?> cls22 = Class.forName((String) objArr72[0]);
                Object[] objArr82 = new Object[1];
                d("\u0000\u0010\u0015\u0018\u0010\u0006\f\u0001\u0001\u0000\u0001\u0017\t\u0016\u0014\u0000", 16 - Color.green(0), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63), objArr82);
                int intValue2 = ((Integer) cls22.getMethod((String) objArr82[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr92 = {1247923424};
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                if (PngjBadSignature2 == null) {
                }
                values$1eba2e16 = com.identy.values.PngjBadSignature.values$1eba2e16(intValue2, ((Constructor) PngjBadSignature2).newInstance(objArr92), 216186827);
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                if (PngjBadSignature3 == null) {
                }
                ((Field) PngjBadSignature3).set(null, values$1eba2e16);
                Object[] objArr112 = new Object[1];
                d("\u0003\u0018\u0010\u0013\u0015\u0004\u0010\u0005\u0017\u0004\t\u0010\u0003\u0004\n\u0015\u0006\b\u0013\u0004\f\u000f", 22 - Color.blue(0), (byte) (111 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr112);
                Class<?> cls32 = Class.forName((String) objArr112[0]);
                Object[] objArr122 = new Object[1];
                d("\u0018\n\t\u000e\u0000\u0017\u0011\n\u0018\u0000\n\f\u0000\u0006㘇", 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (8 - Color.alpha(0)), objArr122);
                Long valueOf22 = Long.valueOf(((Long) cls32.getDeclaredMethod((String) objArr122[0], null).invoke(null, null)).longValue());
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature4 == null) {
                }
                ((Field) PngjBadSignature4).set(null, valueOf22);
            }
        } else {
            c = 2;
            i = 864471691;
            c2 = 20;
            Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
            if (PngjBadSignature7 == null) {
                char rgb2 = (char) (Color.rgb(0, 0, 0) + 16792046);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 721;
                byte b11 = $$a[20];
                byte b12 = (byte) (b11 - 1);
                byte b13 = b11;
                Object[] objArr14 = new Object[1];
                c(b12, b13, (byte) (b13 - 1), objArr14);
                PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(rgb2, doubleTapTimeout, jumpTapTimeout, -815159504, false, (String) objArr14[0], null);
            }
            j = ((Field) PngjBadSignature7).getLong(null);
            if (j != -1) {
                z = false;
                j2 = j + 1891;
                Object[] objArr42 = new Object[1];
                c3 = 3;
                d("\u0003\u0018\u0010\u0013\u0015\u0004\u0010\u0005\u0017\u0004\t\u0010\u0003\u0004\n\u0015\u0006\b\u0013\u0004\f\u000f", 22 - ExpandableListView.getPackedPositionGroup(0L), (byte) (111 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr42);
                cls = Class.forName((String) objArr42[0]);
                objArr2 = new Object[1];
                d("\u0018\n\t\u000e\u0000\u0017\u0011\n\u0018\u0000\n\f\u0000\u0006㘇", KeyEvent.normalizeMetaState(0) + 15, (byte) (TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 9), objArr2);
                if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr2[0], null).invoke(null, null)).longValue()) {
                }
                Object[] objArr722 = new Object[1];
                d("\u000e\u0003\u0013\u0001\t\u000b\u0003\u0018\u0015\u0007\u0011\u0004\u0001\r\u0000\n", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, (byte) (97 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr722);
                Class<?> cls222 = Class.forName((String) objArr722[0]);
                Object[] objArr822 = new Object[1];
                d("\u0000\u0010\u0015\u0018\u0010\u0006\f\u0001\u0001\u0000\u0001\u0017\t\u0016\u0014\u0000", 16 - Color.green(0), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63), objArr822);
                int intValue22 = ((Integer) cls222.getMethod((String) objArr822[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr922 = {1247923424};
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                if (PngjBadSignature2 == null) {
                }
                values$1eba2e16 = com.identy.values.PngjBadSignature.values$1eba2e16(intValue22, ((Constructor) PngjBadSignature2).newInstance(objArr922), 216186827);
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                if (PngjBadSignature3 == null) {
                }
                ((Field) PngjBadSignature3).set(null, values$1eba2e16);
                Object[] objArr1122 = new Object[1];
                d("\u0003\u0018\u0010\u0013\u0015\u0004\u0010\u0005\u0017\u0004\t\u0010\u0003\u0004\n\u0015\u0006\b\u0013\u0004\f\u000f", 22 - Color.blue(0), (byte) (111 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr1122);
                Class<?> cls322 = Class.forName((String) objArr1122[0]);
                Object[] objArr1222 = new Object[1];
                d("\u0018\n\t\u000e\u0000\u0017\u0011\n\u0018\u0000\n\f\u0000\u0006㘇", 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (8 - Color.alpha(0)), objArr1222);
                Long valueOf222 = Long.valueOf(((Long) cls322.getDeclaredMethod((String) objArr1222[0], null).invoke(null, null)).longValue());
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature4 == null) {
                }
                ((Field) PngjBadSignature4).set(null, valueOf222);
            } else {
                c3 = 3;
                z = false;
                Object[] objArr7222 = new Object[1];
                d("\u000e\u0003\u0013\u0001\t\u000b\u0003\u0018\u0015\u0007\u0011\u0004\u0001\r\u0000\n", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, (byte) (97 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr7222);
                Class<?> cls2222 = Class.forName((String) objArr7222[0]);
                Object[] objArr8222 = new Object[1];
                d("\u0000\u0010\u0015\u0018\u0010\u0006\f\u0001\u0001\u0000\u0001\u0017\t\u0016\u0014\u0000", 16 - Color.green(0), (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63), objArr8222);
                int intValue222 = ((Integer) cls2222.getMethod((String) objArr8222[0], Object.class).invoke(null, this)).intValue();
                Object[] objArr9222 = {1247923424};
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
                if (PngjBadSignature2 == null) {
                }
                values$1eba2e16 = com.identy.values.PngjBadSignature.values$1eba2e16(intValue222, ((Constructor) PngjBadSignature2).newInstance(objArr9222), 216186827);
                PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                if (PngjBadSignature3 == null) {
                }
                ((Field) PngjBadSignature3).set(null, values$1eba2e16);
                Object[] objArr11222 = new Object[1];
                d("\u0003\u0018\u0010\u0013\u0015\u0004\u0010\u0005\u0017\u0004\t\u0010\u0003\u0004\n\u0015\u0006\b\u0013\u0004\f\u000f", 22 - Color.blue(0), (byte) (111 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr11222);
                Class<?> cls3222 = Class.forName((String) objArr11222[0]);
                Object[] objArr12222 = new Object[1];
                d("\u0018\n\t\u000e\u0000\u0017\u0011\n\u0018\u0000\n\f\u0000\u0006㘇", 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (8 - Color.alpha(0)), objArr12222);
                Long valueOf2222 = Long.valueOf(((Long) cls3222.getDeclaredMethod((String) objArr12222[0], null).invoke(null, null)).longValue());
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature4 == null) {
                }
                ((Field) PngjBadSignature4).set(null, valueOf2222);
            }
        }
        int i9 = ((int[]) values$1eba2e16[0])[0];
        int i10 = ((int[]) values$1eba2e16[c3])[0];
        if (i10 == i9) {
            objArr = new Object[4];
            objArr[0] = new int[]{0};
            objArr[1] = new int[1];
            objArr[c3] = new int[]{0};
            int i11 = ((int[]) values$1eba2e16[1])[0];
            int i12 = ((int[]) values$1eba2e16[c3])[0];
            int i13 = ((int[]) values$1eba2e16[0])[0];
            objArr[c] = (String[]) values$1eba2e16[c];
            int c6 = defpackage.a.c((~(((int) Runtime.getRuntime().maxMemory()) | 296147671)) | (-738418303), 529, (((~((~0) | 296147671)) | (-1034411776)) * 529) - 1435847140, i11);
            int i14 = c6 ^ (c6 << 13);
            int i15 = i14 ^ (i14 >>> 17);
            ((int[]) objArr[1])[0] = i15 ^ (i15 << 5);
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) values$1eba2e16[c];
            if (strArr != null) {
                int i16 = 0;
                while (i16 < strArr.length) {
                    arrayList.add(strArr[i16]);
                    i16++;
                    getClassForDetection = (markIntroSetting + 19) % 128;
                }
            }
            Toast.makeText((Context) null, i10 / (((i10 - 1) * i10) % 2), 0).show();
            objArr = new Object[4];
            objArr[0] = new int[]{0};
            objArr[1] = new int[1];
            objArr[c3] = new int[]{0};
            int i17 = ((int[]) values$1eba2e16[1])[0];
            int i18 = ((int[]) values$1eba2e16[c3])[0];
            int i19 = ((int[]) values$1eba2e16[0])[0];
            objArr[c] = (String[]) values$1eba2e16[c];
            int identityHashCode2 = System.identityHashCode(this);
            int i20 = ~((-856249154) | identityHashCode2);
            int i21 = ~identityHashCode2;
            int i22 = i20 | (~(178316820 | i21));
            int c7 = defpackage.a.c(144745492 | (~(856249153 | i21)), 516, (((~(identityHashCode2 | (-33571329))) | (~(i21 | (-144745493)))) * 516) + (((i22 | 0) * (-516)) - 1339668471), i17);
            int i23 = c7 ^ (c7 << 13);
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[1])[0] = i24 ^ (i24 << 5);
        }
        this.getMatchingTime = z;
        this.getL2Score.PngjBadCrcException = null;
        this.Capture2TActivity.postInvalidate();
        this.PngBadCharsetException = false;
        int i25 = ((int[]) objArr[1])[0];
        int i26 = i25 * i25;
        int i27 = -(1375824835 * i25);
        int i28 = (i26 & i27) + (i26 | i27);
        int i29 = -(i25 * (-2005047509));
        int i30 = (((i28 | i29) << 1) - (i29 ^ i28)) - (-1778701649);
        int i31 = i30 >> 18;
        int i32 = ((i31 & (-32767)) + (i31 | (-32767))) / 16384;
        int i33 = ((i32 | 1) << 1) - (i32 ^ 1);
        int i34 = (i31 - 32767) / 16384;
        int i35 = -((((i30 | i33) << 1) - (i30 ^ i33)) ^ ((i34 ^ 1) + ((i34 & 1) << 1)));
        int i36 = (i35 & 8) + (i35 | 8);
        int i37 = ((i36 >> 23) - 1023) / ConstantsKt.MINIMUM_BLOCK_SIZE;
        int i38 = ((i37 | 1) << 1) - (i37 ^ 1);
        this.generateST = 0 / (((-((i38 & 1) + (i38 | 1))) & i36) * 1424);
        this.CaptureMode = 0L;
        this.getCaptureTime = false;
        com.identy.Fpnative.resetAttempt(values);
        long j4 = this.DeduplicationIdentyResponse;
        Attempt();
        PngjPrematureEnding pngjPrematureEnding = new PngjPrematureEnding(j4);
        this.pfkrolChangeMinMaxWidth = pngjPrematureEnding;
        pngjPrematureEnding.start();
        getClassForDetection = (markIntroSetting + 91) % 128;
    }

    public void e1() {
        getClassForDetection = (markIntroSetting + 63) % 128;
        this.CaptureMode = 0L;
        Hand hand = this.a;
        Hand hand2 = Hand.LEFT;
        if (hand.equals(hand2)) {
            this.a = Hand.RIGHT;
        } else {
            this.a = hand2;
            getClassForDetection = (markIntroSetting + 23) % 128;
        }
        Iterator it = this.pfkrolfinalize.iterator();
        while (it.hasNext()) {
            Mat.n_release(((Mat) it.next()).PngjException);
        }
        this.pfkrolfinalize.clear();
        this.getMatchingTime = false;
        this.getCaptureTime = false;
    }

    public final void getAsHighestSecurityLevelReached() {
        int values2 = com.identy.i.PngjPrematureEnding.values();
        int values3 = com.identy.i.PngjPrematureEnding.values();
        values(new Object[]{this}, com.identy.i.PngjPrematureEnding.values(), values2, -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, values3);
    }

    public void getPadSub1() {
        try {
            this.Action.unregisterReceiver(this);
        } catch (Exception unused) {
        }
        try {
            this.isAuthSucess.setLength(0);
            getClassForDetection = (markIntroSetting + 53) % 128;
        } catch (Exception unused2) {
        }
        try {
            try {
                CountDownTimer countDownTimer = this.pfkrolChangeMinMaxWidth;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                    this.pfkrolChangeMinMaxWidth = null;
                }
                Attempt();
            } catch (Exception e) {
                e.printStackTrace();
            }
            com.identy.Fpnative.resetAttempt(values);
            HandlerThread handlerThread = this.getFingers;
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.getFingers = null;
            }
            this.getCaptureTime = true;
            this.onErrorResponse = true;
            Mat mat = this.getFingerPrintQualityScore;
            if (mat != null) {
                Mat.n_release(mat.PngjException);
                this.getFingerPrintQualityScore = null;
            }
            if (this.Action != null) {
                int i = markIntroSetting + 107;
                getClassForDetection = i % 128;
                if (i % 2 != 0) {
                    this.Action = null;
                    throw null;
                }
                this.Action = null;
            }
            if (this.getL2Score != null) {
                this.getL2Score = null;
            }
            if (this.getAsHighestSecurityLevelReached != null) {
                this.getAsHighestSecurityLevelReached = null;
            }
            if (this.getAttempts != null) {
                this.getAttempts = null;
            }
            if (this.Attempt != null) {
                this.Attempt = null;
                markIntroSetting = (getClassForDetection + 33) % 128;
            }
            if (this.toJson != null) {
                this.toJson = null;
            }
            ArrayList arrayList = this.pfkrolfinalize;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = this.pfkrolfinalize.iterator();
                while (it.hasNext()) {
                    int i2 = getClassForDetection + 91;
                    markIntroSetting = i2 % 128;
                    if (i2 % 2 == 0) {
                        Mat.n_release(((Mat) it.next()).PngjException);
                        throw null;
                    }
                    Mat.n_release(((Mat) it.next()).PngjException);
                }
                this.pfkrolfinalize.clear();
            }
            System.gc();
        } catch (Exception unused3) {
        }
    }

    public RectF onErrorResponse() {
        markIntroSetting = (getClassForDetection + 25) % 128;
        RectF Action2 = Action();
        Action2.inset(-(Action2.width() * 0.3f), -(Action2.height() * 0.3f));
        int i = markIntroSetting + 113;
        getClassForDetection = i % 128;
        if (i % 2 == 0) {
            return Action2;
        }
        throw null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ArrayList arrayList;
        this.Attempt.PngjBadSignature(R.string.id_capturing, false);
        PngjException(CaptureStatus.CAPTURING);
        new Handler().postDelayed(new PngjInputException(), 300L);
        Activity activity = this.Action;
        if (activity instanceof FingerActivity) {
            FingerActivity fingerActivity = (FingerActivity) activity;
            byte[] bArr = (byte[]) fingerActivity.Action.Action;
            com.identy.PngjException pngjException = fingerActivity.PngBadCharsetException.valueOf;
            ArrayList arrayList2 = new ArrayList(pngjException.values);
            pngjException.values.clear();
            com.identy.onErrorResponse onerrorresponse = fingerActivity.PngBadCharsetException.PngjBadCrcException;
            if (onerrorresponse.PngjBadCrcException == null) {
                int i = getClassForDetection + 97;
                markIntroSetting = i % 128;
                arrayList = null;
                if (i % 2 == 0) {
                    int i2 = 99 / 0;
                }
            } else {
                arrayList = new ArrayList(onerrorresponse.PngjException);
                onerrorresponse.PngjException.clear();
                getClassForDetection = (markIntroSetting + 103) % 128;
            }
            PngjBadCrcException(bArr, false, arrayList2, arrayList, fingerActivity.PngjInputException.valueOf, fingerActivity.Action.onErrorResponse);
        }
    }

    public final void PngjBadCrcException(int i) {
        int i2 = R.string.id_hold;
        if (i == 6) {
            int i3 = getClassForDetection + 81;
            markIntroSetting = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            i2 = R.string.id_hold_6;
        } else if (i == 5) {
            int i4 = getClassForDetection + 13;
            markIntroSetting = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            i2 = R.string.id_hold_5;
        } else if (i == 4) {
            int i5 = getClassForDetection + 1;
            markIntroSetting = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            i2 = R.string.id_hold_4;
        } else if (i == 3) {
            i2 = R.string.id_hold_3;
        } else if (i == 2) {
            i2 = R.string.id_hold_2;
        } else if (i == 1) {
            i2 = R.string.id_hold_1;
        } else if (i == 0) {
            int i6 = getClassForDetection + 21;
            markIntroSetting = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            i2 = R.string.id_hold_0;
        }
        if (i == 0) {
            new Handler().postDelayed(new a(), 200L);
            return;
        }
        com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
        if (pngjBadSignature != null) {
            pngjBadSignature.PngjBadSignature(i2, true);
            markIntroSetting = (getClassForDetection + 55) % 128;
        }
    }

    public final List<RectF> PngjException() {
        com.identy.ui.d.values valuesVar = this.getL2Score;
        List<org.c.a.values$values> list = this.getSpoofScore;
        LinkedList linkedList = new LinkedList();
        Matrix matrix = new Matrix(valuesVar.valueOf);
        for (org.c.a.values$values values_values : list) {
            new RectF(values_values.valueOf);
            RectF rectF = new RectF(new RectF(values_values.valueOf));
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            linkedList.add(rectF2);
            markIntroSetting = (getClassForDetection + 123) % 128;
        }
        return linkedList;
    }

    public void PngjBadCrcException(byte[] bArr, boolean z, List list, List list2, float f, Long l) {
        try {
            if (LibSettings.isSaveCaptured()) {
                markIntroSetting = (getClassForDetection + 3) % 128;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.deduplication = l;
        this.ERRORS = f;
        Activity activity = this.Action;
        if (activity == null) {
            return;
        }
        this.closeDialog = list;
        this.getHeight = list2;
        this.getPreviewClass = z;
        this.GuideNoGuideHelper = ((FingerActivity) activity).Action.getQualityScore instanceof org.cameracontroller.valueOf;
        this.setFoundMatchingTemplates = (int) (Calendar.getInstance().getTimeInMillis() - this.getRegistrationClass);
        this.EnrollThumbActivity = Calendar.getInstance().getTimeInMillis();
        try {
            com.identy.PngjOutputException pngjOutputException = this.Capture2IndexActivity;
            if (pngjOutputException != null) {
                getClassForDetection = (markIntroSetting + 121) % 128;
                pngjOutputException.PngjBadCrcException = f;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.Enroll2TActivity = new float[list.size()];
        this.Enroll4FActivity = new float[list.size()];
        this.FingerAS = new float[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            this.Enroll2TActivity[i] = ((Double) objArr[1]).floatValue() / 9.8f;
            this.Enroll4FActivity[i] = ((Double) objArr[0]).floatValue() / 9.8f;
            this.FingerAS[i] = ((Double) objArr[2]).floatValue() / 9.8f;
            i++;
        }
        this.getPreviewClass = z;
        com.identy.d.PngjBadSignature pngjBadSignature = this.Attempt;
        if (pngjBadSignature != null) {
            pngjBadSignature.getData();
        }
        this.PngBadCharsetException = true;
        this.toJson = bArr;
        if (this.getL2Score != null) {
            int i2 = markIntroSetting + 87;
            getClassForDetection = i2 % 128;
            if (i2 % 2 != 0) {
                this.Capture2TActivity.postInvalidate();
                throw null;
            }
            this.Capture2TActivity.postInvalidate();
            getClassForDetection = (markIntroSetting + 45) % 128;
        }
    }

    public final void PngjException(int i) {
        this.Action.runOnUiThread(new PngBadCharsetException(i));
        markIntroSetting = (getClassForDetection + 63) % 128;
    }

    public static void PngjException(int i, int i2) {
        getClassForDetection = (markIntroSetting + 69) % 128;
        Object[] uxd565jk = com.identy.Fpnative.uxd565jk(values, i, i2);
        PngjBadSignature = ((Integer) uxd565jk[0]).intValue();
        pfkrol = ((Integer) uxd565jk[1]).intValue();
        PngjPrematureEnding = ((Integer) uxd565jk[2]).intValue();
        getClassForDetection = (markIntroSetting + 125) % 128;
    }

    public void valueOf(int i, int i2, int i3, boolean z) {
        String obj;
        String obj2;
        if (this.getMatchingTime) {
            return;
        }
        if (this.getCaptureClass == null) {
            StringBuilder sb = new StringBuilder("config_meta_");
            sb.append(Calendar.getInstance().getTimeInMillis());
            sb.append("_");
            sb.append(this.getPadSub1.username);
            this.getCaptureClass = sb.toString();
            if (LibSettings.saveML4FData()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.getCaptureClass);
                sb2.append(".json");
                String obj3 = sb2.toString();
                if (obj3 != null && !obj3.equals(BuildConfig.FLAVOR)) {
                    com.identy.Action action = this.uxd566jk.getAction();
                    Activity activity = this.Action;
                    FingerActivity fingerActivity = activity instanceof FingerActivity ? (FingerActivity) activity : null;
                    String attackS = this.uxd566jk.getAttackS();
                    int i4 = configure;
                    int i5 = PngjBadSignature;
                    int i6 = pfkrol;
                    int i7 = PngjPrematureEnding;
                    String internalTrnsactionID = this.uxd566jk.getInternalTrnsactionID();
                    FingerAS fingerAS = this.uxd566jk.Action;
                    org.camera.preview.PngjBadCrcException pngjBadCrcException = fingerActivity.Action;
                    List list = pngjBadCrcException.getFingers;
                    org.cameracontroller.PngjBadSignature.PngjExceptionInternal pngjExceptionInternal = new org.cameracontroller.PngjBadSignature.PngjExceptionInternal(pngjBadCrcException.getFingerPrintQualityScore, pngjBadCrcException.getData);
                    IdentySdk identySdk = this.uxd566jk;
                    String jSONObject = new ActionS3Meta(action, attackS, i4, i5, i6, i7, internalTrnsactionID, fingerAS, list, pngjExceptionInternal, identySdk.PngjOutputException, identySdk.PngjUnsupportedException, identySdk.PngjInputException, true, this.setDConfig).toJson().toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(com.identy.app.PngjBadSignature.PngjBadCrcException("FINGER", "FRAMES"));
                    sb3.append("/");
                    File file = new File(sb3.toString());
                    file.mkdirs();
                    StringBuilder sb4 = new StringBuilder();
                    if (("".isEmpty())) {
                        obj = BuildConfig.FLAVOR;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("");
                        sb5.append("_");
                        obj = sb5.toString();
                    }
                    sb4.append(obj);
                    if (("".isEmpty())) {
                        obj2 = BuildConfig.FLAVOR;
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("");
                        sb6.append("_");
                        obj2 = sb6.toString();
                    }
                    sb4.append(obj2);
                    sb4.append(obj3);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(file, sb4.toString()));
                        fileOutputStream.write(jSONObject.getBytes(StandardCharsets.UTF_8));
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        if (this.getRegistrationClass == 0) {
            this.getRegistrationClass = Calendar.getInstance().getTimeInMillis();
        }
        this.getIdentyQuality = i;
        this.markIntroShown = i2;
        this.getPadSub3 = i;
        this.getPadSub2_f = i2;
        if (this.generateID == null) {
            this.generateID = new int[i * i2];
        }
    }

    public static org.camera.preview.PngjBadCrcException.PngjBadSignature values(Context context) {
        getClassForDetection = (markIntroSetting + 63) % 128;
        if (valueOf == null) {
            int i = markIntroSetting + 105;
            getClassForDetection = i % 128;
            boolean z = i % 2 == 0;
            try {
                CaptureMode k = IdentySdk.getInstance().k();
                boolean contains = Build.MANUFACTURER.toLowerCase(Locale.US).contains("oneplus");
                boolean startsWith = Build.MODEL.startsWith("EB210");
                if (k.equals(com.identy.CaptureMode.L) || (startsWith && contains)) {
                    valueOf = org.camera.preview.PngjBadCrcException.PngjBadSignature.LOW;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (z) {
                getClassForDetection = (markIntroSetting + 53) % 128;
                valueOf = valueOf(context);
            }
        }
        return valueOf;
    }

    public final void PngjException(CaptureStatus captureStatus) {
        int i = getClassForDetection + 5;
        markIntroSetting = i % 128;
        FingerStatusUpdator fingerStatusUpdator = null;
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i % 2 != 0) {
            fingerStatusUpdator = IdentySdk.getInstance().o();
            markIntroSetting = (getClassForDetection + 85) % 128;
            if (fingerStatusUpdator != null) {
                new Handler(Looper.getMainLooper()).post(new Action(fingerStatusUpdator, captureStatus));
                return;
            }
            return;
        }
        IdentySdk.getInstance().o();
        throw null;
    }

    private static /* synthetic */ Object PngjException(Object[] objArr) {
        e1 e1Var = (e1) objArr[0];
        markIntroSetting = (getClassForDetection + 85) % 128;
        try {
            IdentySdk.getInstance().values(e1Var.Capture2IndexActivity.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        e1Var.Capture2IndexActivity = new com.identy.PngjOutputException(e1Var.PngjExceptionInternal());
        e1Var.getScore();
        getClassForDetection = (markIntroSetting + 121) % 128;
        return null;
    }

    public void values() {
        boolean z;
        boolean z2;
        boolean z3;
        Pair[] PngjExceptionInternal2 = PngjExceptionInternal();
        IdentySdk identySdk = IdentySdk.getInstance();
        List<Pair<Hand, Finger>> selectedFingers = identySdk.getSelectedFingers();
        FingerAS h = identySdk.h();
        int length = PngjExceptionInternal2.length;
        int[] iArr = new int[length];
        HashMap<Finger, Integer> qcthresolds = identySdk.getQcthresolds();
        float[] fArr = new float[PngjExceptionInternal2.length];
        int[] iArr2 = new int[PngjExceptionInternal2.length];
        int length2 = PngjExceptionInternal2.length;
        int i = 0;
        boolean z4 = false;
        int i2 = 0;
        int i3 = 0;
        while (i < length2) {
            Pair pair = PngjExceptionInternal2[i];
            iArr2[i2] = Position.getFromHandFinger(pair).ordinal();
            iArr[i2] = selectedFingers.contains(pair) ? 1 : 0;
            if (selectedFingers.contains(pair)) {
                z4 = true;
            }
            Pair[] pairArr = PngjExceptionInternal2;
            if (qcthresolds != null && qcthresolds.containsKey(pair.second)) {
                fArr[i2] = qcthresolds.get(pair.second).intValue() / 100.0f;
                i3++;
            }
            i2++;
            i++;
            PngjExceptionInternal2 = pairArr;
        }
        if (!z4) {
            markIntroSetting = (getClassForDetection + 91) % 128;
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = 1;
            }
        }
        CapturePosition capturePosition = this.cvtyuv2bgr;
        CapturePosition capturePosition2 = com.identy.CapturePosition.HORIZONTAL;
        if (capturePosition.equals(capturePosition2)) {
            z = false;
        } else {
            boolean equals = this.cvtyuv2bgr.equals(com.identy.CapturePosition.VERTICAL_FROM_TOP);
            markIntroSetting = (getClassForDetection + 85) % 128;
            z = equals;
        }
        QualityMode n = identySdk.n();
        boolean PngjException2 = com.identy.FingerActivity.PngjException(this.Action);
        float[] fArr2 = fArr;
        long j = values;
        int ordinal = h.ordinal();
        int ordinal2 = 0;
        int ordinal3 = n.ordinal();
        int i5 = this.isQualityFailed;
        int i6 = this.getScore;
        RectF rectF = this.CaptureRolledFingersActivity;
        int i7 = (int) rectF.top;
        int i8 = (int) rectF.left;
        int i9 = (int) rectF.bottom;
        int i10 = (int) rectF.right;
        if (i3 != i2) {
            markIntroSetting = (getClassForDetection + 11) % 128;
            z2 = false;
            fArr2 = new float[0];
        } else {
            z2 = false;
        }
        boolean isElt = identySdk.isElt();
        boolean z5 = !this.cvtyuv2bgr.equals(capturePosition2);
        IdentySdk identySdk2 = this.uxd566jk;
        if (identySdk2.getMatchingTime != null) {
            markIntroSetting = (getClassForDetection + 87) % 128;
            if (identySdk2.getOveralTimetaken != null) {
                z3 = true;
                com.identy.Fpnative.configure(j, ordinal, ordinal2, iArr2, iArr, ordinal3, i5, i6, i7, i8, i9, i10, z, fArr2, isElt, 0L, z5, z3, PngjException2);
                this.isFoundMatchingTemplates = true;
            }
        }
        z3 = z2;
        com.identy.Fpnative.configure(j, ordinal, ordinal2, iArr2, iArr, ordinal3, i5, i6, i7, i8, i9, i10, z, fArr2, isElt, 0L, z5, z3, PngjException2);
        this.isFoundMatchingTemplates = true;
    }

    private static boolean PngjBadSignature(Context context, String str) {
        getClassForDetection = (markIntroSetting + 51) % 128;
        try {
            InputStream open = context.getResources().getAssets().open(str);
            if (open == null) {
                if (open == null) {
                    return false;
                }
                markIntroSetting = (getClassForDetection + 117) % 128;
                open.close();
                getClassForDetection = (markIntroSetting + 55) % 128;
                return false;
            }
            int i = getClassForDetection + 43;
            int i2 = i % 128;
            markIntroSetting = i2;
            if (i % 2 != 0) {
                getClassForDetection = (i2 + 85) % 128;
                try {
                    open.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            }
            throw null;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void PngjBadSignature(byte[] bArr, String str, String str2, String str3) {
        String obj;
        String concat;
        StringBuilder sb = new StringBuilder();
        sb.append(com.identy.app.PngjBadSignature.PngjBadCrcException("FINGER", str2));
        sb.append("/");
        new File(sb.toString()).mkdirs();
        StringBuilder sb2 = new StringBuilder();
        Object obj2 = this.a;
        if (obj2 == null) {
            getClassForDetection = (markIntroSetting + 117) % 128;
            obj2 = "2T";
        }
        sb2.append(obj2.toString().charAt(0));
        if (PngjExceptionInternal().length == 4) {
            obj = "4F";
        } else if (PngjExceptionInternal().length == 1) {
            obj = ((Finger) PngjExceptionInternal()[0].second).equals(Finger.THUMB) ? "T" : "1F";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(PngjExceptionInternal().length);
            sb3.append("F");
            obj = sb3.toString();
        }
        sb2.append(obj);
        sb2.append("_");
        if (str3.isEmpty()) {
            int i = getClassForDetection + 65;
            int i2 = i % 128;
            markIntroSetting = i2;
            if (i % 2 == 0) {
                throw null;
            }
            getClassForDetection = (i2 + 123) % 128;
            concat = BuildConfig.FLAVOR;
        } else {
            concat = "_".concat(str3);
        }
        x5.z(sb2, concat, "_", str, "_");
        sb2.append(this.getPadSub1.username);
        String obj3 = sb2.toString();
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        new com.identy.app.values().PngjBadCrcException(bArr, obj3, "FINGER", str2);
        com.identy.PngjBadCrcException.PngjException("SAVE Image ?", timeInMillis);
    }

    public final void valueOf() {
        int i = getClassForDetection + 11;
        markIntroSetting = i % 128;
        try {
            if (i % 2 != 0) {
                if (this.getNfiq1Score != null) {
                    this.Action.runOnUiThread(new onErrorResponse());
                    int i2 = markIntroSetting + 107;
                    getClassForDetection = i2 % 128;
                    if (i2 % 2 != 0) {
                        throw null;
                    }
                    return;
                }
                return;
            }
            throw null;
        } catch (Exception unused) {
        }
    }

    public void PngjBadCrcException() {
        markIntroSetting = (getClassForDetection + 105) % 128;
    }

    public static boolean valueOf(boolean z) {
        int i = getClassForDetection + 121;
        markIntroSetting = i % 128;
        try {
            if (i % 2 == 0) {
                int i2 = 80 / 0;
                if (IdentySdk.getInstance().isEnableAllFingerNistTemplate()) {
                    throw null;
                }
            } else if (IdentySdk.getInstance().isEnableAllFingerNistTemplate()) {
                throw null;
            }
            int i3 = getClassForDetection + 3;
            markIntroSetting = i3 % 128;
            if (i3 % 2 != 0) {
                return false;
            }
            throw null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Mat valueOf(int i, int i2) {
        getClassForDetection = (markIntroSetting + 87) % 128;
        Calendar.getInstance().getTimeInMillis();
        byte[][] bArr = this.getAttempts;
        Object[] convertYUV420ToNV21 = ImageUtils.convertYUV420ToNV21(bArr[0], bArr[1], bArr[2], this.getPadSub3, this.getPadSub2_f, this.setScore, this.setSpoofScore, this.uxd565jj, this.Fpnative, this.getWidth, this.addTemplates);
        byte[] bArr2 = (byte[]) convertYUV420ToNV21[0];
        if (((Integer) convertYUV420ToNV21[1]).intValue() == 1) {
            int i3 = getClassForDetection + 103;
            markIntroSetting = i3 % 128;
            if (i3 % 2 == 0) {
                this.match = false;
            } else {
                this.match = true;
            }
        }
        Mat mat = new Mat((i2 / 2) + i2, i, org.identy.opencv.core.PngjBadCrcException.PngjBadSignature);
        mat.PngjBadSignature(bArr2);
        int i4 = getClassForDetection + 37;
        markIntroSetting = i4 % 128;
        if (i4 % 2 != 0) {
            return mat;
        }
        throw null;
    }

    public final void PngjBadSignature(HashMap hashMap, boolean z, ASResult aSResult) {
        Object[] objArr = {this, hashMap, Boolean.valueOf(z), aSResult};
        int values2 = com.identy.i.PngjPrematureEnding.values();
        int values3 = com.identy.i.PngjPrematureEnding.values();
        values(objArr, com.identy.i.PngjPrematureEnding.values(), values2, -1059459396, com.identy.i.PngjPrematureEnding.values(), 1059459400, values3);
    }

    public final void PngjBadSignature() {
        int values2 = com.identy.i.PngjPrematureEnding.values();
        int values3 = com.identy.i.PngjPrematureEnding.values();
        values(new Object[]{this}, com.identy.i.PngjPrematureEnding.values(), values2, -2022216657, com.identy.i.PngjPrematureEnding.values(), 2022216660, values3);
    }

    private void PngjBadSignature(Mat mat, int i) {
        Object[] objArr = {this, mat, Integer.valueOf(i)};
        int values2 = com.identy.i.PngjPrematureEnding.values();
        int values3 = com.identy.i.PngjPrematureEnding.values();
        values(objArr, com.identy.i.PngjPrematureEnding.values(), values2, 433737572, com.identy.i.PngjPrematureEnding.values(), -433737572, values3);
    }

    public final synchronized void values(Runnable runnable) {
        AsyncTask.execute(new RunnableC0019e1(runnable));
        markIntroSetting = (getClassForDetection + 7) % 128;
    }

    private static /* synthetic */ Object values(Object[] objArr) {
        IdentySdk identySdk;
        e1 e1Var = (e1) objArr[0];
        HashMap hashMap = (HashMap) objArr[1];
        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
        ASResult aSResult = (ASResult) objArr[3];
        int i = markIntroSetting + 53;
        getClassForDetection = i % 128;
        if (i % 2 == 0) {
            boolean isrfQualityPassed = e1Var.FingerActivity.isrfQualityPassed();
            if (!isrfQualityPassed) {
                getClassForDetection = (markIntroSetting + 39) % 128;
                e1Var.PngjExceptionInternal.add(getPadSub2.RFQ);
            } else if (booleanValue) {
                getClassForDetection = (markIntroSetting + 63) % 128;
                e1Var.PngjExceptionInternal.add(getPadSub2.AS);
            }
            e1Var.CaptureFingersActivity = aSResult.spoofScore;
            e1Var.generate = aSResult.l1P;
            e1Var.rgenerate = aSResult.l1S;
            e1Var.ppk = aSResult.l1R;
            try {
                identySdk = IdentySdk.getInstance();
            } catch (Exception e) {
                e.printStackTrace();
                identySdk = null;
            }
            Template[] templateArr = (Template[]) identySdk.p().keySet().toArray(new Template[identySdk.p().keySet().size()]);
            if (hashMap == null) {
                return null;
            }
            e1Var.getShortform = hashMap.size();
            PngjOutputException pngjOutputException = e1Var.new PngjOutputException(hashMap, isrfQualityPassed, booleanValue);
            if (e1Var.getShortform == 0) {
                pngjOutputException.valueOf();
            }
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                com.identy.IdentyA aVar = (com.identy.IdentyA) ((Map.Entry) it.next()).getValue();
                new com.identy.c.values(e1Var.Action, e1Var.Capture2IndexActivity).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aVar);
                aVar.valueOf(0);
                aVar.PngjBadSignature(e1Var.CaptureFingersActivity, e1Var.generate, e1Var.ppk, e1Var.rgenerate);
                aVar.PngjException(booleanValue, e1Var.FingerActivity.asResult.liveness_true_up_to_security_level);
                try {
                    aVar.PngjException(templateArr, identySdk.getWSQCompression(), IdentySdk.getInstance().getAction().equals(com.identy.Action.ENROLL), pngjOutputException);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return null;
        }
        e1Var.FingerActivity.isrfQualityPassed();
        throw null;
    }

    public final PreCaptureOutput valueOf(Mat mat) {
        String obj;
        String obj2;
        if (!this.isFoundMatchingTemplates) {
            try {
                values();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        PreCaptureOutput preCaptureOutput = null;
        IdentySdk identySdk = null;
        preCaptureOutput = null;
        preCaptureOutput = null;
        if (!Mat.n_empty(mat.PngjException) && new org.identy.opencv.core.valueOf(Mat.n_size(mat.PngjException)).PngjBadSignature != 0.0d && new org.identy.opencv.core.valueOf(Mat.n_size(mat.PngjException)).values != 0.0d) {
            LibSettings.saveML4FData();
            PreCaptureOutput pfk = com.identy.Fpnative.pfk(values, mat.PngjException, this.EnrollFingersActivity ? 1 : 2, LibSettings.saveML4FData());
            this.isIntroShown.put("PROCESS", Long.valueOf(timeInMillis));
            if (pfk == null) {
                return null;
            }
            pfk.setWidthHeight(this.getPadSub3, this.getPadSub2_f);
            StringBuilder sb = new StringBuilder("pre capture ? ");
            sb.append(pfk.getError());
            sb.append(" --- boxes ?");
            sb.append(pfk.getBoxes().size());
            com.identy.PngjBadCrcException.PngjException(sb.toString(), timeInMillis);
            StringBuilder sb2 = new StringBuilder("meta_");
            sb2.append(PngjUnsupportedException);
            sb2.append("_");
            sb2.append(this.getPadSub1.username);
            sb2.append(".txt");
            String obj3 = sb2.toString();
            if (!LibSettings.saveML4FData() || obj3 == null || obj3.equals(BuildConfig.FLAVOR)) {
                preCaptureOutput = pfk;
            } else {
                try {
                    identySdk = IdentySdk.getInstance();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                FrameS3Meta frameS3Meta = new FrameS3Meta(identySdk.getInstallUserID(), identySdk.getInstallationID(), this.getCaptureClass, pfk, identySdk.getAction(), identySdk.getAttackS(), configure, PngjBadSignature, pfkrol, PngjPrematureEnding, identySdk.getInternalTrnsactionID(), this.isIntroShown);
                preCaptureOutput = pfk;
                String jSONObject = frameS3Meta.toJson().toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(com.identy.app.PngjBadSignature.PngjBadCrcException("FINGER", "FRAMES"));
                sb3.append("/");
                File file = new File(sb3.toString());
                file.mkdirs();
                StringBuilder sb4 = new StringBuilder();
                if (("".isEmpty())) {
                    obj = BuildConfig.FLAVOR;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("");
                    sb5.append("_");
                    obj = sb5.toString();
                }
                sb4.append(obj);
                if (("".isEmpty())) {
                    obj2 = BuildConfig.FLAVOR;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("");
                    sb6.append("_");
                    obj2 = sb6.toString();
                }
                sb4.append(obj2);
                sb4.append(obj3);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(file, sb4.toString()));
                    fileOutputStream.write(jSONObject.getBytes(StandardCharsets.UTF_8));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            this.isAuthSucess.append(System.lineSeparator());
            this.isAuthSucess.append(preCaptureOutput.toJson(PngjUnsupportedException, this.getQualityScore));
            if (preCaptureOutput.getBoxes() == null) {
                this.Capture2IndexActivity.PngjBadCrcException((Integer) 0);
            } else {
                this.Capture2IndexActivity.PngjBadCrcException(Integer.valueOf(preCaptureOutput.getBoxes().size()));
            }
            RectF rectF = this.CaptureRolledFingersActivity;
            this.getSpoofScore = preCaptureOutput.getRecog(new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom), !com.identy.FingerActivity.PngjException(this.Action));
            if (LibSettings.saveML4FData()) {
                byte[] img = preCaptureOutput.getImg();
                StringBuilder sb7 = new StringBuilder("frame_");
                sb7.append(PngjUnsupportedException);
                PngjBadSignature(img, sb7.toString(), "FRAMES", BuildConfig.FLAVOR);
            }
            if (preCaptureOutput.getError().equals(FingerError.CORRECT)) {
                if (this.Capture4FActivity == 0) {
                    this.Capture4FActivity = Calendar.getInstance().getTimeInMillis();
                }
                long timeInMillis2 = (Calendar.getInstance().getTimeInMillis() - timeInMillis) + this.closefDialog;
                if (timeInMillis2 < 200 && timeInMillis2 > 10) {
                    try {
                        Thread.sleep(200 - timeInMillis2);
                    } catch (InterruptedException e4) {
                        e4.printStackTrace();
                    }
                }
            }
            if (preCaptureOutput.getError() != null) {
                com.identy.PngjOutputException pngjOutputException = this.Capture2IndexActivity;
                String servermeta = preCaptureOutput.getError().getServermeta();
                if (servermeta.isEmpty()) {
                    int i = pngjOutputException.PngjInputException;
                } else {
                    pngjOutputException.PngjUnsupportedException.set(pngjOutputException.PngjInputException, servermeta);
                }
                PngjException(preCaptureOutput.getError().getStatus());
            }
            Mat.n_release(mat.PngjException);
        }
        return preCaptureOutput;
    }

    public final void valueOf(ERRORS errors) {
        int i = markIntroSetting + 117;
        getClassForDetection = i % 128;
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i % 2 == 0) {
            com.identy.PngjOutputException pngjOutputException = this.Capture2IndexActivity;
            pngjOutputException.getMatchingTime = errors;
            pngjOutputException.valueOf = Calendar.getInstance().getTimeInMillis();
            IdentySdk.getInstance().values(this.Capture2IndexActivity.toString());
            this.Capture2IndexActivity = new com.identy.PngjOutputException(PngjExceptionInternal());
            getScore();
            int i2 = markIntroSetting + 41;
            getClassForDetection = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 23 / 0;
                return;
            }
            return;
        }
        com.identy.PngjOutputException pngjOutputException2 = this.Capture2IndexActivity;
        pngjOutputException2.getMatchingTime = errors;
        pngjOutputException2.valueOf = Calendar.getInstance().getTimeInMillis();
        IdentySdk.getInstance().values(this.Capture2IndexActivity.toString());
        throw null;
    }

    private static /* synthetic */ Object valueOf(Object[] objArr) {
        e1 e1Var = (e1) objArr[0];
        Mat mat = (Mat) objArr[1];
        int intValue = ((Number) objArr[2]).intValue();
        if (!Mat.n_empty(mat.PngjException)) {
            while (e1Var.pfkrolfinalize.size() >= 10) {
                Mat mat2 = (Mat) e1Var.pfkrolfinalize.remove(0);
                if (mat2 != null) {
                    int i = markIntroSetting + 81;
                    getClassForDetection = i % 128;
                    if (i % 2 == 0) {
                        if (!Mat.n_empty(mat2.PngjException)) {
                            Mat.n_release(mat2.PngjException);
                            getClassForDetection = (markIntroSetting + 57) % 128;
                        }
                    } else {
                        Mat.n_empty(mat2.PngjException);
                        throw null;
                    }
                }
            }
            if (intValue >= 0) {
                getClassForDetection = (markIntroSetting + 113) % 128;
                if (intValue < e1Var.pfkrolfinalize.size()) {
                    e1Var.pfkrolfinalize.add(intValue, mat);
                    return null;
                }
            }
            e1Var.pfkrolfinalize.add(mat);
        }
        return null;
    }

    public static void valueOf(Activity activity) {
        int values2 = com.identy.i.PngjPrematureEnding.values();
        int values3 = com.identy.i.PngjPrematureEnding.values();
        values(new Object[]{activity}, com.identy.i.PngjPrematureEnding.values(), values2, 84848004, com.identy.i.PngjPrematureEnding.values(), -84848002, values3);
    }
}
