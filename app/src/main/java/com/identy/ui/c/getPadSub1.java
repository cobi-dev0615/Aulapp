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
import com.identy.IdentySdk;

/* loaded from: classes2.dex */
public final class getPadSub1 extends Dialog {
    private com.identy.d.PngjException values;

    public class PngjBadCrcException implements DialogInterface.OnDismissListener {
        private /* synthetic */ com.identy.d.PngjException PngjBadCrcException;

        public PngjBadCrcException(com.identy.d.PngjException pngjException) {
            this.PngjBadCrcException = pngjException;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            this.PngjBadCrcException.PngjBadCrcException();
        }
    }

    public class valueOf implements View.OnClickListener {
        public valueOf() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            getPadSub1.this.dismiss();
        }
    }

    public getPadSub1(Context context, com.identy.d.PngjException pngjException) {
        super(context, R.style.Theme.Black.NoTitleBar);
        this.values = pngjException;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        ((ViewGroup.LayoutParams) layoutParams).width = -1;
        ((ViewGroup.LayoutParams) layoutParams).height = -1;
        getWindow().setAttributes(layoutParams);
        setOnDismissListener(new PngjBadCrcException(pngjException));
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        boolean z = false;
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        try {
            z = IdentySdk.getInstance().isCustomSDK();
        } catch (Exception e) {
            e.printStackTrace();
        }
        setContentView(z ? com.identy.R.layout.touchless_retake : com.identy.R.layout.identy_retake);
        findViewById(com.identy.R.id.retake_continue).setOnClickListener(new valueOf());
    }
}
