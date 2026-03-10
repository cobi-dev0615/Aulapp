package com.identy;

import android.app.Activity;
import android.os.AsyncTask;
import com.karumi.dexter.BuildConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class getAsHighestSecurityLevelReached {
    public static int PngjException;
    public static int valueOf;
    private Activity PngjBadCrcException;
    int PngjBadSignature = 0;
    com.identy.d.PngjBadCrcException values;

    public static class PngjException extends AsyncTask {
        private long PngjBadCrcException;
        private Activity PngjBadSignature;
        private com.identy.d.PngjBadCrcException PngjException;

        public PngjException(Activity activity, com.identy.d.PngjBadCrcException pngjBadCrcException, long j) {
            this.PngjBadSignature = activity;
            this.PngjException = pngjBadCrcException;
            this.PngjBadCrcException = j;
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            ((a[]) objArr)[0].PngjBadCrcException(BuildConfig.FLAVOR, this.PngjBadSignature, true, this.PngjBadCrcException);
            return null;
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Object obj) {
            super.onPostExecute((Void) obj);
            this.PngjException.values();
        }
    }

    public class valueOf implements com.identy.d.PngjBadCrcException {
        private /* synthetic */ HashMap valueOf;

        public valueOf(HashMap hashMap) {
            this.valueOf = hashMap;
        }

        @Override // com.identy.d.PngjBadCrcException
        public final void values() {
            getAsHighestSecurityLevelReached getashighestsecuritylevelreached = getAsHighestSecurityLevelReached.this;
            int i = getashighestsecuritylevelreached.PngjBadSignature + 1;
            getashighestsecuritylevelreached.PngjBadSignature = i;
            if (i == this.valueOf.size()) {
                getAsHighestSecurityLevelReached.this.values.values();
            }
        }
    }

    public getAsHighestSecurityLevelReached(Activity activity, com.identy.d.PngjBadCrcException pngjBadCrcException) {
        this.PngjBadCrcException = activity;
        this.values = pngjBadCrcException;
    }

    public static int PngjBadCrcException() {
        int i = valueOf;
        int i2 = i % 7172706;
        valueOf = i + 1;
        if (i2 != 0) {
            return PngjException;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        PngjException = i3;
        return i3;
    }

    public final void PngjException(HashMap hashMap, long j) {
        this.PngjBadSignature = 0;
        valueOf valueof = new valueOf(hashMap);
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            new PngjException(this.PngjBadCrcException, valueof, j).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (com.identy.IdentyA) ((Map.Entry) it.next()).getValue());
        }
    }
}
