package com.identy.ui.c;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public final class getAsHighestSecurityLevelReached extends Dialog {
    private com.identy.d.PngjException PngjBadCrcException;

    public class PngjException implements View.OnClickListener {
        public PngjException() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            getAsHighestSecurityLevelReached.this.dismiss();
        }
    }

    public class values implements DialogInterface.OnDismissListener {
        private /* synthetic */ com.identy.d.PngjException PngjBadSignature;

        public values(com.identy.d.PngjException pngjException) {
            this.PngjBadSignature = pngjException;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            this.PngjBadSignature.PngjBadCrcException();
        }
    }

    public getAsHighestSecurityLevelReached(Context context, com.identy.d.PngjException pngjException) {
        super(context, R.style.Theme.Black.NoTitleBar);
        this.PngjBadCrcException = pngjException;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        ((ViewGroup.LayoutParams) layoutParams).width = -1;
        ((ViewGroup.LayoutParams) layoutParams).height = -1;
        getWindow().setAttributes(layoutParams);
        setOnDismissListener(new values(pngjException));
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        setContentView(com.identy.R.layout.touchless_spoof_dialog);
        findViewById(com.identy.R.id.spoof_continue).setOnClickListener(new PngjException());
    }
}
