package com.identy.c;

import android.os.AsyncTask;
import com.identy.WSQCompression;
import com.identy.IdentyA;
import com.identy.getMatchingTime;
import com.identy.enums.Template;

/* loaded from: classes2.dex */
public final class PngjException extends AsyncTask<getMatchingTime, Integer, getMatchingTime> {
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
    public getMatchingTime doInBackground(getMatchingTime... aVarArr) {
        getMatchingTime aVar = aVarArr[0];
        try {
            if (aVar instanceof IdentyA) {
                ((IdentyA) aVar).PngjBadSignature(this.PngjException, this.valueOf, false);
            } else if (aVar instanceof com.identy.a_) {
                ((com.identy.a_) aVar).PngjBadSignature(this.PngjException, this.valueOf, false);
            }
        } catch (Exception unused) {
        }
        return aVar;
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(getMatchingTime aVar) {
        this.PngjBadCrcException.valueOf();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onProgressUpdate(Integer[] numArr) {
    }
}
