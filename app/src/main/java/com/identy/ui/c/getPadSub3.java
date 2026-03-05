package com.identy.ui.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.identy.FingerActivity;
import com.identy.IdentySdk;
import com.identy.R;
import org.identy.opencv.android.Utils;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
public class getPadSub3 extends Dialog {
    private boolean PngjBadCrcException;
    private ImageView PngjBadSignature;
    com.identy.d.PngjException PngjException;
    private boolean PngjOutputException;
    com.identy.a valueOf;
    private Activity values;

    public class PngjBadCrcException implements View.OnClickListener {
        public PngjBadCrcException() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerActivity.PngjBadSignature = true;
            getPadSub3.this.dismiss();
        }
    }

    public class PngjBadSignature implements View.OnClickListener {
        public PngjBadSignature() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            getPadSub3.this.dismiss();
        }
    }

    public class valueOf implements DialogInterface.OnDismissListener {
        public valueOf() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            getPadSub3.this.PngjException.PngjBadCrcException();
        }
    }

    public class values implements View.OnClickListener {
        public values() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context = getPadSub3.this.getContext();
            com.identy.a aVar = getPadSub3.this.valueOf;
            new Attempt(context, aVar, aVar).show();
        }
    }

    public getPadSub3(Activity activity, boolean z, com.identy.a aVar, com.identy.d.PngjException pngjException) {
        super(activity);
        this.values = activity;
        this.valueOf = aVar;
        this.PngjException = pngjException;
        this.PngjBadCrcException = z;
        this.PngjOutputException = false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        ((ViewGroup.LayoutParams) layoutParams).width = -1;
        ((ViewGroup.LayoutParams) layoutParams).height = -1;
        getWindow().setAttributes(layoutParams);
        try {
            z = IdentySdk.getInstance().isCustomSDK();
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        setContentView(z ? R.layout.touchless_popup_enroll_thumb_finger : R.layout.identy_popup_enroll_thumb_finger);
        setCancelable(false);
        new values();
        this.PngjBadSignature = (ImageView) findViewById(R.id.thumb_finger);
        findViewById(R.id.closePopupBtn).setOnClickListener(new PngjBadSignature());
        setOnDismissListener(new valueOf());
        findViewById(R.id.retake_yes).setOnClickListener(new PngjBadCrcException());
        com.identy.a aVar = this.valueOf;
        Mat padSub3 = aVar.getPadSub3();
        if (padSub3 != null && Mat.n_rows(padSub3.PngjException) > 0 && Mat.n_cols(padSub3.PngjException) > 0) {
            Mat mat = new Mat();
            if (aVar.getPadSub3() != null) {
                mat = aVar.getPadSub3();
            }
            if (Mat.n_rows(mat.PngjException) > 0 && Mat.n_cols(mat.PngjException) > 0) {
                ImageView imageView = this.PngjBadSignature;
                Bitmap createBitmap = Bitmap.createBitmap(Mat.n_cols(mat.PngjException), Mat.n_rows(mat.PngjException), Bitmap.Config.ARGB_8888);
                Utils.PngjBadSignature(mat, createBitmap);
                imageView.setImageBitmap(createBitmap);
                this.PngjBadSignature.setTag(0);
            }
        }
        aVar.PngjException();
        int i = R.id.thumb_finger_nfig_score;
        ((TextView) findViewById(i)).setText(Html.fromHtml(aVar.PngjBadCrcException()));
        ((TextView) findViewById(i)).setText(Html.fromHtml(this.valueOf.PngjBadCrcException()));
        if (this.PngjBadCrcException) {
            ((TextView) findViewById(R.id.thumb_finger_score)).setText(Html.fromHtml(this.valueOf.PngjException(this.PngjOutputException)));
        } else {
            findViewById(R.id.thumb_finger_score).setVisibility(8);
        }
    }
}
