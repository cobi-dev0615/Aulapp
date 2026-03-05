package com.identy.ui.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.identy.R;

/* loaded from: classes2.dex */
public final class getPadSub2 extends Dialog {
    public int PngjBadCrcException;
    public View.OnClickListener PngjBadSignature;
    public int PngjException;
    public View.OnClickListener valueOf;
    public int values;

    public class PngjBadCrcException implements DialogInterface.OnKeyListener {
        public PngjBadCrcException() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (i == 4 && keyEvent.getAction() == 1) {
                getPadSub2.this.dismiss();
                getPadSub2 getpadsub2 = getPadSub2.this;
                View.OnClickListener onClickListener = getpadsub2.PngjBadSignature;
                if (onClickListener != null) {
                    onClickListener.onClick(getpadsub2.findViewById(R.id.no_alert));
                } else {
                    getpadsub2.valueOf.onClick(getpadsub2.findViewById(R.id.yes_alert));
                }
            }
            return true;
        }
    }

    public class PngjBadSignature implements View.OnClickListener {
        public PngjBadSignature() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            getPadSub2.this.dismiss();
            getPadSub2.this.PngjBadSignature.onClick(view);
        }
    }

    public class values implements View.OnClickListener {
        public values() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            getPadSub2.this.dismiss();
            getPadSub2.this.valueOf.onClick(view);
        }
    }

    public getPadSub2(Activity activity) {
        super(activity, android.R.style.Theme.Material.Dialog.Alert);
        this.PngjException = R.string.id_spoof_final_message;
        this.PngjBadCrcException = R.string.id_no;
        this.values = R.string.id_yes;
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.touchless_finger_confirmation_default);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        ((ViewGroup.LayoutParams) layoutParams).width = -2;
        ((ViewGroup.LayoutParams) layoutParams).height = -2;
        getWindow().setGravity(17);
        getWindow().setAttributes(layoutParams);
        ((TextView) findViewById(R.id.identy_alert_message)).setText(this.PngjException);
        int i = R.id.yes_alert;
        ((TextView) findViewById(i)).setText(this.values);
        findViewById(i).setOnClickListener(new values());
        int i2 = R.id.no_alert;
        ((TextView) findViewById(i2)).setText(this.PngjBadCrcException);
        if (this.PngjBadSignature != null) {
            findViewById(i2).setOnClickListener(new PngjBadSignature());
        } else {
            findViewById(i2).setVisibility(8);
        }
        setOnKeyListener(new PngjBadCrcException());
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }
}
