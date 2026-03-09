package com.identy.c;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Pair;
import com.identy.PngjBadSignature;
import com.identy.PngjOutputException;
import com.identy.IdentyA;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class values extends AsyncTask<IdentyA, Integer, IdentyA> {
    private WeakReference PngjBadCrcException;
    private String PngjBadSignature = "CalculateNFIQAsync";
    private PngjOutputException values;

    public values(Activity activity, PngjOutputException pngjOutputException) {
        this.PngjBadCrcException = null;
        this.PngjBadCrcException = new WeakReference(activity);
        this.values = pngjOutputException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: PngjBadSignature, reason: merged with bridge method [inline-methods] */
    public IdentyA doInBackground(IdentyA... aVarArr) {
        IdentyA aVar = aVarArr[0];
        try {
            aVar.getAsHighestSecurityLevelReached();
            try {
                PngjOutputException pngjOutputException = this.values;
                pngjOutputException.PngjException.put(new Pair(aVar.values(), aVar.PngjBadSignature()), Integer.valueOf(aVar.Attempt()));
                return aVar;
            } catch (Exception e) {
                e.printStackTrace();
                return aVar;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(IdentyA aVar) {
        Intent intent = new Intent(com.identy.PngjBadSignature.values);
        intent.putExtra("mid", aVar.values());
        intent.setPackage(((Activity) this.PngjBadCrcException.get()).getPackageName());
        ((Activity) this.PngjBadCrcException.get()).sendBroadcast(intent);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
    }
}
