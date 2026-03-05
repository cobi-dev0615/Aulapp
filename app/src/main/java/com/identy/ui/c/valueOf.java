package com.identy.ui.c;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.identy.R;

/* loaded from: classes2.dex */
public final class valueOf extends getPadSub3 {
    private com.identy.valueOf PngjBadCrcException;

    public valueOf(Activity activity, com.identy.a aVar, com.identy.valueOf valueof, com.identy.d.PngjException pngjException) {
        super(activity, true, aVar, pngjException);
        this.PngjBadCrcException = valueof;
    }

    @Override // com.identy.ui.c.getPadSub3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.PngjBadCrcException.equals(com.identy.valueOf.SUCCESS)) {
            int i = R.string.id_success_match;
            int i2 = R.id.popup_information_bar;
            findViewById(i2).setVisibility(0);
            ((TextView) findViewById(i2)).setText(i);
            ((TextView) findViewById(i2)).setTextColor(getContext().getResources().getColor(R.color.id_success));
            return;
        }
        if (!this.PngjBadCrcException.equals(com.identy.valueOf.RETAKE)) {
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
