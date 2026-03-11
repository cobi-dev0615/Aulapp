package com.identy.ui.c;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class a extends Dialog {
    public int PngjBadSignature;
    public int PngjException;
    public String values;

    public class PngjBadCrcException implements View.OnClickListener {
        public PngjBadCrcException() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            a.this.dismiss();
        }
    }

    public a(Activity activity) {
        super(activity, R.style.Theme_Material_Dialog_Alert);
        this.values = null;
        this.PngjBadSignature = com.identy.R.string.id_spoof_final_message;
        this.PngjException = com.identy.R.string.id_done;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(com.identy.R.layout.touchless_finger_alert_default);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        ((ViewGroup.LayoutParams) layoutParams).width = -2;
        ((ViewGroup.LayoutParams) layoutParams).height = -2;
        getWindow().setGravity(17);
        getWindow().setAttributes(layoutParams);
        if (this.values != null) {
            ((TextView) findViewById(com.identy.R.id.identy_alert_message)).setText(this.values);
        } else {
            ((TextView) findViewById(com.identy.R.id.identy_alert_message)).setText(this.PngjBadSignature);
        }
        int i = com.identy.R.id.close_alert;
        ((TextView) findViewById(i)).setText(this.PngjException);
        findViewById(i).setOnClickListener(new PngjBadCrcException());
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public final a values(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        return this;
    }
}
