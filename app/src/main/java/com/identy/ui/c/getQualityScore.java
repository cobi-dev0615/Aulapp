package com.identy.ui.c;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.Html;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.identy.FingerActivity;
import com.identy.IdentySdk;
import com.identy.R;
import com.identy.IdentyB;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import java.util.HashMap;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
public class getQualityScore extends Dialog {
    HashMap PngjBadCrcException;
    HashMap PngjBadSignature;
    ImageView PngjException;
    private Activity PngjExceptionInternal;
    private boolean PngjPrematureEnding;
    ImageView valueOf;
    com.identy.d.PngjException values;

    public class PngjBadSignature implements View.OnClickListener {
        public PngjBadSignature() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerActivity.PngjBadSignature = true;
            getQualityScore.this.dismiss();
        }
    }

    public class PngjException implements View.OnClickListener {
        public PngjException() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context = getQualityScore.this.getContext();
            com.identy.IdentyA aVar = (com.identy.IdentyA) getQualityScore.this.PngjBadSignature.get(view.getTag());
            HashMap hashMap = getQualityScore.this.PngjBadCrcException;
            new Attempt(context, aVar, (hashMap == null || !hashMap.containsKey(view.getTag())) ? null : (com.identy.IdentyA) getQualityScore.this.PngjBadCrcException.get(view.getTag())).show();
        }
    }

    public class valueOf implements DialogInterface.OnDismissListener {
        public valueOf() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            try {
                getQualityScore.this.valueOf.setOnClickListener(null);
                getQualityScore.this.PngjException.setOnClickListener(null);
                getQualityScore.this.findViewById(R.id.retake_yes).setOnClickListener(null);
            } catch (Exception unused) {
            }
            try {
                ((BitmapDrawable) getQualityScore.this.valueOf.getDrawable()).getBitmap().recycle();
                ((BitmapDrawable) getQualityScore.this.PngjException.getDrawable()).getBitmap().recycle();
            } catch (Exception unused2) {
            }
            getQualityScore.this.values.PngjBadCrcException();
        }
    }

    public class values implements View.OnClickListener {
        public values() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            getQualityScore.this.dismiss();
        }
    }

    public getQualityScore(Activity activity, boolean z, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap, HashMap<Pair<Hand, Finger>, com.identy.IdentyA> hashMap2, com.identy.d.PngjException pngjException) {
        super(activity);
        this.PngjExceptionInternal = activity;
        this.PngjBadSignature = hashMap;
        this.PngjBadCrcException = hashMap2;
        this.values = pngjException;
        this.PngjPrematureEnding = z;
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
        setContentView(z ? R.layout.touchless_popup_enroll_twothumb : R.layout.identy_popup_enroll_twothumb);
        setCancelable(false);
        PngjException pngjException = new PngjException();
        this.valueOf = (ImageView) findViewById(R.id.left_thumb_finger);
        this.PngjException = (ImageView) findViewById(R.id.right_thumb_finger);
        this.valueOf.setOnClickListener(pngjException);
        this.PngjException.setOnClickListener(pngjException);
        findViewById(R.id.closePopupBtn).setOnClickListener(new values());
        setOnDismissListener(new valueOf());
        findViewById(R.id.retake_yes).setOnClickListener(new PngjBadSignature());
        HashMap hashMap = this.PngjBadSignature;
        Hand hand = Hand.LEFT;
        Finger finger = Finger.THUMB;
        if (!hashMap.containsKey(new Pair(hand, finger)) || IdentyB.b(hand, finger, this.PngjBadSignature) == null) {
            findViewById(R.id.left_thumb_layout).setVisibility(4);
            this.valueOf.setVisibility(4);
        } else {
            com.identy.IdentyA aVar = (com.identy.IdentyA) IdentyB.b(hand, finger, this.PngjBadSignature);
            Mat padSub3 = aVar.getPadSub3();
            if (padSub3 != null && Mat.n_rows(padSub3.PngjException) > 0 && Mat.n_cols(padSub3.PngjException) > 0) {
                Mat mat = new Mat();
                if (aVar.getPadSub3() != null) {
                    mat = aVar.getPadSub3();
                }
                if (mat != null && Mat.n_rows(mat.PngjException) > 0 && Mat.n_cols(mat.PngjException) > 0) {
                    this.valueOf.setImageBitmap(com.identy.PngjBadCrcException.values(mat, (Hand) null));
                    this.valueOf.setTag(new Pair(hand, finger));
                }
            }
            aVar.PngjException();
            ((TextView) findViewById(R.id.left_thumb_nfig_score)).setText(Html.fromHtml(aVar.PngjBadCrcException()));
        }
        HashMap hashMap2 = this.PngjBadSignature;
        Hand hand2 = Hand.RIGHT;
        if (!hashMap2.containsKey(new Pair(hand2, finger)) || IdentyB.b(hand2, finger, this.PngjBadSignature) == null) {
            findViewById(R.id.right_thumb_layout).setVisibility(4);
            this.PngjException.setVisibility(4);
        } else {
            com.identy.IdentyA aVar2 = (com.identy.IdentyA) IdentyB.b(hand2, finger, this.PngjBadSignature);
            Mat padSub32 = aVar2.getPadSub3();
            if (padSub32 != null && Mat.n_rows(padSub32.PngjException) > 0 && Mat.n_cols(padSub32.PngjException) > 0) {
                Mat mat2 = new Mat();
                if (aVar2.getPadSub3() != null) {
                    mat2 = aVar2.getPadSub3();
                }
                if (mat2 != null && Mat.n_rows(mat2.PngjException) > 0 && Mat.n_cols(mat2.PngjException) > 0) {
                    this.PngjException.setImageBitmap(com.identy.PngjBadCrcException.values(mat2, (Hand) null));
                    this.PngjException.setTag(new Pair(hand2, finger));
                }
            }
            aVar2.PngjException();
            ((TextView) findViewById(R.id.right_thumb_nfig_score)).setText(Html.fromHtml(aVar2.PngjBadCrcException()));
        }
        if (this.PngjBadSignature.containsKey(new Pair(hand, finger)) && IdentyB.b(hand, finger, this.PngjBadSignature) != null) {
            ((TextView) findViewById(R.id.left_thumb_nfig_score)).setText(Html.fromHtml(((com.identy.IdentyA) IdentyB.b(hand, finger, this.PngjBadSignature)).PngjBadCrcException()));
        }
        if (this.PngjBadSignature.containsKey(new Pair(hand2, finger)) && IdentyB.b(hand2, finger, this.PngjBadSignature) != null) {
            ((TextView) findViewById(R.id.right_thumb_nfig_score)).setText(Html.fromHtml(((com.identy.IdentyA) IdentyB.b(hand2, finger, this.PngjBadSignature)).PngjBadCrcException()));
        }
        if (!this.PngjPrematureEnding) {
            findViewById(R.id.right_thumb_finger_score).setVisibility(8);
            findViewById(R.id.left_thumb_finger_score).setVisibility(8);
            return;
        }
        if (this.PngjBadSignature.containsKey(new Pair(hand, finger)) && IdentyB.b(hand, finger, this.PngjBadSignature) != null) {
            ((TextView) findViewById(R.id.left_thumb_finger_score)).setText(Html.fromHtml(((com.identy.IdentyA) IdentyB.b(hand, finger, this.PngjBadSignature)).PngjException(false)));
        }
        if (!this.PngjBadSignature.containsKey(new Pair(hand, finger)) || IdentyB.b(hand, finger, this.PngjBadSignature) == null) {
            return;
        }
        ((TextView) findViewById(R.id.right_thumb_finger_score)).setText(Html.fromHtml(((com.identy.IdentyA) IdentyB.b(hand2, finger, this.PngjBadSignature)).PngjException(false)));
    }
}
