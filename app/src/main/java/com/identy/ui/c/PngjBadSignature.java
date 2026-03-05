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
public final class PngjBadSignature extends PngBadCharsetException {
    public PngjBadSignature(Activity activity, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2, com.identy.d.PngjException pngjException) {
        super(activity, false, hashMap, hashMap2, pngjException);
    }

    @Override // com.identy.ui.c.PngBadCharsetException, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = R.string.id_capture_completed;
        int i2 = R.id.popup_information_bar;
        findViewById(i2).setVisibility(0);
        ((TextView) findViewById(i2)).setText(i);
        ((TextView) findViewById(i2)).setTextColor(getContext().getResources().getColor(R.color.id_success));
    }
}
