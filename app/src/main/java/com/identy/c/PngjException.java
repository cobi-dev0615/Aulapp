package com.identy.c;

import android.os.AsyncTask;
import com.identy.WSQCompression;
import com.identy.IdentyA;
import com.identy.enums.Template;

/* loaded from: classes2.dex */
public final class PngjException extends AsyncTask<IdentyA, Integer, IdentyA> {
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
    public IdentyA doInBackground(IdentyA... aVarArr) {
        IdentyA aVar = aVarArr[0];
        try {
            aVar.PngjBadSignature(this.PngjException, this.valueOf, false);
        } catch (Exception unused) {
        }
        return aVar;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(IdentyA aVar) {
        this.PngjBadCrcException.valueOf();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
    }
}
