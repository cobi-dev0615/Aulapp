package com.identy.ui.c;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.identy.R;

/* loaded from: classes2.dex */
public final class onErrorResponse extends getPadSub3 {
    public onErrorResponse(Activity activity, com.identy.IdentyA aVar, com.identy.d.PngjException pngjException) {
        super(activity, false, aVar, pngjException);
    }

    @Override // com.identy.ui.c.getPadSub3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = R.string.id_enrollment_completed;
        int i2 = R.id.popup_information_bar;
        findViewById(i2).setVisibility(0);
        ((TextView) findViewById(i2)).setText(i);
        ((TextView) findViewById(i2)).setTextColor(getContext().getResources().getColor(R.color.id_success));
    }
}
