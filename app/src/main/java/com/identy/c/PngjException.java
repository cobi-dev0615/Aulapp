package com.identy.c;

import android.os.AsyncTask;
import com.identy.WSQCompression;
import com.identy.a;
import com.identy.enums.Template;

/* loaded from: classes2.dex */
public final class PngjException extends AsyncTask<a, Integer, a> {
    private PngjBadCrcException PngjBadCrcException;
    private Template[] PngjException;
    private WSQCompression valueOf;
    private String PngjBadSignature = "CalculateNFIQAsync";
    private boolean values = false;

    public PngjException(Template[] templateArr, WSQCompression wSQCompression, PngjBadCrcException pngjBadCrcException) {
        this.PngjException = templateArr;
        this.valueOf = wSQCompression;
        this.PngjBadCrcException = pngjBadCrcException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: PngjBadSignature, reason: merged with bridge method [inline-methods] */
    public a doInBackground(a... aVarArr) {
        a aVar = aVarArr[0];
        try {
            aVar.PngjBadSignature(this.PngjException, this.valueOf, false);
        } catch (Exception unused) {
        }
        return aVar;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(a aVar) {
        this.PngjBadCrcException.valueOf();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
    }
}
