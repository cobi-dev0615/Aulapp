package com.identy.ui.c;

import android.app.Activity;
import android.os.Bundle;
import android.util.Pair;
import android.widget.TextView;
import com.identy.R;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class PngjBadCrcException extends PngBadCharsetException {
    private com.identy.valueOf PngjInputException;

    public PngjBadCrcException(Activity activity, HashMap<Pair<Hand, Finger>, com.identy.a> hashMap, HashMap<Pair<Hand, Finger>, com.identy.a> hashMap2, com.identy.valueOf valueof, com.identy.d.PngjException pngjException) {
        super(activity, true, hashMap, hashMap2, pngjException);
        this.PngjInputException = valueof;
    }

    @Override // com.identy.ui.c.PngBadCharsetException, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.PngjInputException.equals(com.identy.valueOf.SUCCESS)) {
            int i = R.string.id_success_match;
            int i2 = R.id.popup_information_bar;
            findViewById(i2).setVisibility(0);
            ((TextView) findViewById(i2)).setText(i);
            ((TextView) findViewById(i2)).setTextColor(getContext().getResources().getColor(R.color.id_success));
            return;
        }
        if (!this.PngjInputException.equals(com.identy.valueOf.RETAKE)) {
            int i3 = R.string.id_no_match;
            int i4 = R.id.popup_information_bar;
            findViewById(i4).setVisibility(0);
            ((TextView) findViewById(i4)).setText(i3);
            ((TextView) findViewById(i4)).setTextColor(getContext().getResources().getColor(R.color.id_error));
            return;
        }
        int i5 = R.string.id_retake_match;
        int i6 = R.id.popup_information_bar;
        findViewById(i6).setVisibility(0);
        ((TextView) findViewById(i6)).setText(i5);
        ((TextView) findViewById(i6)).setTextColor(getContext().getResources().getColor(R.color.id_retake));
        findViewById(R.id.retake_lay).setVisibility(0);
    }
}
