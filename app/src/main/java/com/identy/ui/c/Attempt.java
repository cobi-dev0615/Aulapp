package com.identy.ui.c;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.identy.IdentySdk;
import com.identy.R;
import com.identy.enums.Hand;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
public final class Attempt extends Dialog {
    private com.identy.a PngjBadSignature;
    private com.identy.a valueOf;
    private ImageView values;

    public class PngjBadSignature implements View.OnClickListener {
        public PngjBadSignature() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Attempt.this.dismiss();
        }
    }

    public Attempt(Context context, com.identy.a aVar, com.identy.a aVar2) {
        super(context);
        this.valueOf = aVar;
        this.PngjBadSignature = aVar2;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        try {
            z = IdentySdk.getInstance().isCustomSDK();
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        setContentView(z ? R.layout.touchless_popup_enroll_finger : R.layout.identy_popup_enroll_finger);
        setCancelable(false);
        this.values = (ImageView) findViewById(R.id.finger);
        findViewById(R.id.closePopupBtn).setOnClickListener(new PngjBadSignature());
        com.identy.a aVar = this.valueOf;
        if (aVar == null) {
            return;
        }
        Mat padSub3 = aVar.getPadSub3();
        if (padSub3 != null && Mat.n_rows(padSub3.PngjException) > 0 && Mat.n_cols(padSub3.PngjException) > 0) {
            Mat mat = new Mat();
            if (this.valueOf.getPadSub3() != null) {
                mat = this.valueOf.getPadSub3();
            }
            if (Mat.n_rows(mat.PngjException) > 0 && Mat.n_cols(mat.PngjException) > 0) {
                this.values.setImageBitmap(com.identy.PngjBadCrcException.values(mat, (Hand) null));
            }
        }
        if (this.PngjBadSignature == null) {
            findViewById(R.id.p_finger).setVisibility(8);
            return;
        }
        this.values = (ImageView) findViewById(R.id.p_finger);
        Mat padSub32 = this.PngjBadSignature.getPadSub3();
        if (padSub32 == null || Mat.n_rows(padSub32.PngjException) <= 0 || Mat.n_cols(padSub32.PngjException) <= 0) {
            return;
        }
        Mat mat2 = new Mat();
        if (this.PngjBadSignature.getPadSub3() != null) {
            mat2 = this.PngjBadSignature.getPadSub3();
        }
        if (Mat.n_rows(mat2.PngjException) <= 0 || Mat.n_cols(mat2.PngjException) <= 0) {
            return;
        }
        this.values.setImageBitmap(com.identy.PngjBadCrcException.values(mat2, (Hand) null));
    }
}
