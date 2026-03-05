package com.identy.ui.c;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.identy.IdentySdk;

/* loaded from: classes2.dex */
public final class isQualityFailed extends Dialog {
    private com.identy.d.PngjException PngjBadSignature;
    private final boolean values;

    public class PngjBadCrcException implements View.OnClickListener {
        public PngjBadCrcException() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            isQualityFailed.this.dismiss();
        }
    }

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

    public isQualityFailed(Context context, com.identy.d.PngjException pngjException) {
        super(context, R.style.Theme.Black.NoTitleBar);
        this.values = true;
        this.PngjBadSignature = pngjException;
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
        setContentView(z ? com.identy.R.layout.touchless_popup_verify_error : com.identy.R.layout.identy_popup_verify_error);
        findViewById(com.identy.R.id.close_sep).setOnClickListener(new PngjBadCrcException());
    }
}
