package com.identy.b;

import android.app.Activity;
import android.os.AsyncTask;
import com.identy.PngjExceptionInternal;
import com.identy.VerifyResult;
import com.identy.a;
import com.identy.getPadSub2;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class PngjBadSignature {

    /* renamed from: com.identy.b.PngjBadSignature$PngjBadSignature, reason: collision with other inner class name */
    public static class AsyncTaskC0018PngjBadSignature extends AsyncTask<a, Integer, VerifyResult> {
        private values PngjBadCrcException;
        private a PngjBadSignature;
        private long PngjException;
        private WeakReference valueOf;
        private PngjExceptionInternal values;

        public AsyncTaskC0018PngjBadSignature(values valuesVar, Activity activity, PngjExceptionInternal pngjExceptionInternal, a aVar, long j) {
            this.values = null;
            this.PngjBadSignature = null;
            this.valueOf = null;
            this.PngjException = 0L;
            this.PngjBadCrcException = valuesVar;
            this.valueOf = new WeakReference(activity);
            this.values = pngjExceptionInternal;
            this.PngjBadSignature = aVar;
            this.PngjException = j;
        }

        private VerifyResult PngjBadSignature() {
            VerifyResult verifyResult = new VerifyResult();
            try {
                Calendar.getInstance().getTimeInMillis();
                PngjExceptionInternal pngjExceptionInternal = this.values;
                String str = pngjExceptionInternal.PngjBadCrcException;
                if (pngjExceptionInternal.PngjBadCrcException() == null) {
                    return null;
                }
                this.PngjBadSignature.PngjBadCrcException("match_", (Activity) this.valueOf.get(), false, this.PngjException);
                File file = new File(str.replace("isocryptv2", "txt"));
                if (file.exists()) {
                    verifyResult.setEnrollmentTs(new String(com.identy.app.PngjBadSignature.PngjBadSignature(file)));
                    return verifyResult;
                }
                verifyResult.setEnrollmentTs("0");
                return verifyResult;
            } catch (Exception e) {
                getPadSub2.PngjBadSignature("Exception", e);
                return verifyResult;
            }
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ VerifyResult doInBackground(a[] aVarArr) {
            return PngjBadSignature();
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(VerifyResult verifyResult) {
            this.PngjBadCrcException.values();
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
        }
    }

    public interface values {
        void values();
    }
}
