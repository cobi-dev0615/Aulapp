package com.identy.ui.c;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.identy.FingerActivity;
import com.identy.IdentySdk;

/* loaded from: classes2.dex */
public final class getScore extends Dialog {
    private final boolean PngjBadSignature;
    private com.identy.d.PngjException valueOf;

    public class PngjBadSignature implements DialogInterface.OnDismissListener {
        private /* synthetic */ com.identy.d.PngjException PngjBadSignature;

        public PngjBadSignature(com.identy.d.PngjException pngjException) {
            this.PngjBadSignature = pngjException;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            this.PngjBadSignature.PngjBadCrcException();
        }
    }

    public class values implements View.OnClickListener {
        public values() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            getScore.this.dismiss();
        }
    }

    public getScore(Context context, com.identy.d.PngjException pngjException) {
        super(context, R.style.Theme.Black.NoTitleBar);
        this.PngjBadSignature = true;
        this.valueOf = pngjException;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        ((ViewGroup.LayoutParams) layoutParams).width = -1;
        ((ViewGroup.LayoutParams) layoutParams).height = -1;
        getWindow().setAttributes(layoutParams);
        setOnDismissListener(new PngjBadSignature(pngjException));
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        try {
            z = IdentySdk.getInstance().isCustomSDK();
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        setContentView(z ? com.identy.R.layout.touchless_popup_verify_retake : com.identy.R.layout.identy_popup_verify_retake);
        FingerActivity.PngjBadSignature = true;
        findViewById(com.identy.R.id.retake_sep).setOnClickListener(new values());
    }
}
