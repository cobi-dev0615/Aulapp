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
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import java.util.HashMap;
import org.identy.opencv.core.Mat;

/* loaded from: classes2.dex */
public class PngBadCharsetException extends Dialog {
    private boolean Action;
    ImageView PngjBadCrcException;
    ImageView PngjBadSignature;
    ImageView PngjException;
    HashMap PngjExceptionInternal;
    private Hand PngjInputException;
    com.identy.d.PngjException PngjOutputException;
    private boolean PngjPrematureEnding;
    private Activity PngjUnsupportedException;
    ImageView valueOf;
    HashMap values;

    public class PngjBadCrcException implements DialogInterface.OnDismissListener {
        public PngjBadCrcException() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            try {
                PngBadCharsetException.this.PngjException.setOnClickListener(null);
                PngBadCharsetException.this.valueOf.setOnClickListener(null);
                PngBadCharsetException.this.PngjBadCrcException.setOnClickListener(null);
                PngBadCharsetException.this.PngjBadSignature.setOnClickListener(null);
                PngBadCharsetException.this.findViewById(R.id.retake_yes).setOnClickListener(null);
            } catch (Exception unused) {
            }
            try {
                ((BitmapDrawable) PngBadCharsetException.this.PngjException.getDrawable()).getBitmap().recycle();
                ((BitmapDrawable) PngBadCharsetException.this.valueOf.getDrawable()).getBitmap().recycle();
                ((BitmapDrawable) PngBadCharsetException.this.PngjBadCrcException.getDrawable()).getBitmap().recycle();
                ((BitmapDrawable) PngBadCharsetException.this.PngjBadSignature.getDrawable()).getBitmap().recycle();
            } catch (Exception unused2) {
            }
            PngBadCharsetException.this.PngjOutputException.PngjBadCrcException();
        }
    }

    public class PngjException implements View.OnClickListener {
        public PngjException() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context = PngBadCharsetException.this.getContext();
            com.identy.a aVar = (com.identy.a) PngBadCharsetException.this.values.get(view.getTag());
            HashMap hashMap = PngBadCharsetException.this.PngjExceptionInternal;
            new Attempt(context, aVar, (hashMap == null || !hashMap.containsKey(view.getTag())) ? null : (com.identy.a) PngBadCharsetException.this.PngjExceptionInternal.get(view.getTag())).show();
        }
    }

    public class valueOf implements View.OnClickListener {
        public valueOf() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FingerActivity.PngjBadSignature = true;
            PngBadCharsetException.this.dismiss();
        }
    }

    public class values implements View.OnClickListener {
        public values() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PngBadCharsetException.this.dismiss();
        }
    }

    public PngBadCharsetException(Activity activity, boolean z, HashMap<Pair<Hand, Finger>, com.identy.a> hashMap, HashMap<Pair<Hand, Finger>, com.identy.a> hashMap2, com.identy.d.PngjException pngjException) {
        super(activity);
        this.PngjPrematureEnding = false;
        this.Action = false;
        this.PngjUnsupportedException = activity;
        this.values = hashMap;
        this.PngjExceptionInternal = hashMap2;
        this.PngjInputException = (Hand) ((Pair) hashMap.keySet().toArray()[0]).first;
        this.PngjOutputException = pngjException;
        this.PngjPrematureEnding = z;
        this.Action = false;
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
        setContentView(z ? R.layout.touchless_popup_enroll_fingers : R.layout.identy_popup_enroll_fingers);
        setCancelable(false);
        PngjException pngjException = new PngjException();
        this.PngjException = (ImageView) findViewById(R.id.index_finger);
        this.valueOf = (ImageView) findViewById(R.id.middle_finger);
        this.PngjBadCrcException = (ImageView) findViewById(R.id.ring_finger);
        this.PngjBadSignature = (ImageView) findViewById(R.id.little_finger);
        this.PngjException.setOnClickListener(pngjException);
        this.valueOf.setOnClickListener(pngjException);
        this.PngjBadCrcException.setOnClickListener(pngjException);
        this.PngjBadSignature.setOnClickListener(pngjException);
        findViewById(R.id.closePopupBtn).setOnClickListener(new values());
        setOnDismissListener(new PngjBadCrcException());
        findViewById(R.id.retake_yes).setOnClickListener(new valueOf());
        HashMap hashMap = this.values;
        Hand hand = this.PngjInputException;
        Finger finger = Finger.INDEX;
        if (!hashMap.containsKey(new Pair(hand, finger)) || this.values.get(new Pair(this.PngjInputException, finger)) == null) {
            findViewById(R.id.index_layout).setVisibility(8);
            this.PngjException.setVisibility(8);
        } else {
            com.identy.a aVar = (com.identy.a) this.values.get(new Pair(this.PngjInputException, finger));
            Mat padSub3 = aVar.getPadSub3();
            if (padSub3 != null && Mat.n_rows(padSub3.PngjException) > 0 && Mat.n_cols(padSub3.PngjException) > 0) {
                Mat mat = new Mat();
                if (aVar.getPadSub3() != null) {
                    mat = aVar.getPadSub3();
                }
                if (Mat.n_rows(mat.PngjException) > 0 && Mat.n_cols(mat.PngjException) > 0) {
                    this.PngjException.setImageBitmap(com.identy.PngjBadCrcException.values(mat, aVar.values()));
                    this.PngjException.setTag(new Pair(this.PngjInputException, finger));
                }
            }
            aVar.PngjException();
            ((TextView) findViewById(R.id.index_finger_nfig_score)).setText(Html.fromHtml(aVar.PngjBadCrcException()));
        }
        HashMap hashMap2 = this.values;
        Hand hand2 = this.PngjInputException;
        Finger finger2 = Finger.MIDDLE;
        if (!hashMap2.containsKey(new Pair(hand2, finger2)) || this.values.get(new Pair(this.PngjInputException, finger2)) == null) {
            findViewById(R.id.middle_layout).setVisibility(8);
            this.valueOf.setVisibility(8);
        } else {
            com.identy.a aVar2 = (com.identy.a) this.values.get(new Pair(this.PngjInputException, finger2));
            Mat padSub32 = aVar2.getPadSub3();
            if (padSub32 != null && Mat.n_rows(padSub32.PngjException) > 0 && Mat.n_cols(padSub32.PngjException) > 0) {
                Mat mat2 = new Mat();
                if (aVar2.getPadSub3() != null) {
                    mat2 = aVar2.getPadSub3();
                }
                if (Mat.n_rows(mat2.PngjException) > 0 && Mat.n_cols(mat2.PngjException) > 0) {
                    this.valueOf.setImageBitmap(com.identy.PngjBadCrcException.values(mat2, aVar2.values()));
                    this.valueOf.setTag(new Pair(this.PngjInputException, finger2));
                }
            }
            aVar2.PngjException();
            ((TextView) findViewById(R.id.middle_finger_nfig_score)).setText(Html.fromHtml(aVar2.PngjBadCrcException()));
        }
        HashMap hashMap3 = this.values;
        Hand hand3 = this.PngjInputException;
        Finger finger3 = Finger.RING;
        if (!hashMap3.containsKey(new Pair(hand3, finger3)) || this.values.get(new Pair(this.PngjInputException, finger3)) == null) {
            findViewById(R.id.ring_layout).setVisibility(8);
            this.PngjBadCrcException.setVisibility(8);
        } else {
            com.identy.a aVar3 = (com.identy.a) this.values.get(new Pair(this.PngjInputException, finger3));
            Mat padSub33 = aVar3.getPadSub3();
            if (padSub33 != null && Mat.n_rows(padSub33.PngjException) > 0 && Mat.n_cols(padSub33.PngjException) > 0) {
                Mat mat3 = new Mat();
                if (aVar3.getPadSub3() != null) {
                    mat3 = aVar3.getPadSub3();
                }
                if (Mat.n_rows(mat3.PngjException) > 0 && Mat.n_cols(mat3.PngjException) > 0) {
                    this.PngjBadCrcException.setImageBitmap(com.identy.PngjBadCrcException.values(mat3, aVar3.values()));
                    this.PngjBadCrcException.setTag(new Pair(this.PngjInputException, finger3));
                }
            }
            aVar3.PngjException();
            ((TextView) findViewById(R.id.ring_finger_nfig_score)).setText(Html.fromHtml(aVar3.PngjBadCrcException()));
        }
        HashMap hashMap4 = this.values;
        Hand hand4 = this.PngjInputException;
        Finger finger4 = Finger.LITTLE;
        if (!hashMap4.containsKey(new Pair(hand4, finger4)) || this.values.get(new Pair(this.PngjInputException, finger4)) == null) {
            findViewById(R.id.little_layout).setVisibility(8);
            this.PngjBadSignature.setVisibility(8);
        } else {
            com.identy.a aVar4 = (com.identy.a) this.values.get(new Pair(this.PngjInputException, finger4));
            Mat padSub34 = aVar4.getPadSub3();
            if (padSub34 != null && Mat.n_rows(padSub34.PngjException) > 0 && Mat.n_cols(padSub34.PngjException) > 0) {
                Mat mat4 = new Mat();
                if (aVar4.getPadSub3() != null) {
                    mat4 = aVar4.getPadSub3();
                }
                if (Mat.n_rows(mat4.PngjException) > 0 && Mat.n_cols(mat4.PngjException) > 0) {
                    this.PngjBadSignature.setImageBitmap(com.identy.PngjBadCrcException.values(mat4, aVar4.values()));
                    this.PngjBadSignature.setTag(new Pair(this.PngjInputException, finger4));
                }
            }
            aVar4.PngjException();
            ((TextView) findViewById(R.id.little_finger_nfig_score)).setText(Html.fromHtml(aVar4.PngjBadCrcException()));
        }
        if (this.values.containsKey(new Pair(this.PngjInputException, finger)) && this.values.get(new Pair(this.PngjInputException, finger)) != null) {
            com.identy.a aVar5 = (com.identy.a) this.values.get(new Pair(this.PngjInputException, finger));
            String PngjBadCrcException2 = aVar5.PngjBadCrcException();
            HashMap hashMap5 = this.PngjExceptionInternal;
            if (hashMap5 != null && hashMap5.containsKey(new Pair(this.PngjInputException, finger))) {
                com.identy.a aVar6 = (com.identy.a) this.PngjExceptionInternal.get(new Pair(this.PngjInputException, finger));
                StringBuilder sb = new StringBuilder();
                sb.append(aVar5.PngjBadCrcException());
                sb.append(aVar6.PngjBadCrcException());
                PngjBadCrcException2 = sb.toString();
            }
            ((TextView) findViewById(R.id.index_finger_nfig_score)).setText(Html.fromHtml(PngjBadCrcException2));
        }
        if (this.values.containsKey(new Pair(this.PngjInputException, finger2)) && this.values.get(new Pair(this.PngjInputException, finger2)) != null) {
            com.identy.a aVar7 = (com.identy.a) this.values.get(new Pair(this.PngjInputException, finger2));
            String PngjBadCrcException3 = aVar7.PngjBadCrcException();
            HashMap hashMap6 = this.PngjExceptionInternal;
            if (hashMap6 != null && hashMap6.containsKey(new Pair(this.PngjInputException, finger2))) {
                com.identy.a aVar8 = (com.identy.a) this.PngjExceptionInternal.get(new Pair(this.PngjInputException, finger2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aVar7.PngjBadCrcException());
                sb2.append(aVar8.PngjBadCrcException());
                PngjBadCrcException3 = sb2.toString();
            }
            ((TextView) findViewById(R.id.middle_finger_nfig_score)).setText(Html.fromHtml(PngjBadCrcException3));
        }
        if (this.values.containsKey(new Pair(this.PngjInputException, finger3)) && this.values.get(new Pair(this.PngjInputException, finger3)) != null) {
            com.identy.a aVar9 = (com.identy.a) this.values.get(new Pair(this.PngjInputException, finger3));
            String PngjBadCrcException4 = aVar9.PngjBadCrcException();
            HashMap hashMap7 = this.PngjExceptionInternal;
            if (hashMap7 != null && hashMap7.containsKey(new Pair(this.PngjInputException, finger3))) {
                com.identy.a aVar10 = (com.identy.a) this.PngjExceptionInternal.get(new Pair(this.PngjInputException, finger3));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(aVar9.PngjBadCrcException());
                sb3.append(aVar10.PngjBadCrcException());
                PngjBadCrcException4 = sb3.toString();
            }
            ((TextView) findViewById(R.id.ring_finger_nfig_score)).setText(Html.fromHtml(PngjBadCrcException4));
        }
        if (this.values.containsKey(new Pair(this.PngjInputException, finger4)) && this.values.get(new Pair(this.PngjInputException, finger4)) != null) {
            com.identy.a aVar11 = (com.identy.a) this.values.get(new Pair(this.PngjInputException, finger4));
            String PngjBadCrcException5 = aVar11.PngjBadCrcException();
            HashMap hashMap8 = this.PngjExceptionInternal;
            if (hashMap8 != null && hashMap8.containsKey(new Pair(this.PngjInputException, finger4))) {
                com.identy.a aVar12 = (com.identy.a) this.PngjExceptionInternal.get(new Pair(this.PngjInputException, finger4));
                StringBuilder sb4 = new StringBuilder();
                sb4.append(aVar11.PngjBadCrcException());
                sb4.append(aVar12.PngjBadCrcException());
                PngjBadCrcException5 = sb4.toString();
            }
            ((TextView) findViewById(R.id.little_finger_nfig_score)).setText(Html.fromHtml(PngjBadCrcException5));
        }
        if (!this.PngjPrematureEnding) {
            findViewById(R.id.index_finger_score).setVisibility(8);
            findViewById(R.id.middle_finger_score).setVisibility(8);
            findViewById(R.id.ring_finger_score).setVisibility(8);
            findViewById(R.id.little_finger_score).setVisibility(8);
            return;
        }
        if (this.values.containsKey(new Pair(this.PngjInputException, finger)) && this.values.get(new Pair(this.PngjInputException, finger)) != null) {
            ((TextView) findViewById(R.id.index_finger_score)).setText(Html.fromHtml(((com.identy.a) this.values.get(new Pair(this.PngjInputException, finger))).PngjException(this.Action)));
        }
        if (this.values.containsKey(new Pair(this.PngjInputException, finger2)) && this.values.get(new Pair(this.PngjInputException, finger2)) != null) {
            ((TextView) findViewById(R.id.middle_finger_score)).setText(Html.fromHtml(((com.identy.a) this.values.get(new Pair(this.PngjInputException, finger2))).PngjException(this.Action)));
        }
        if (this.values.containsKey(new Pair(this.PngjInputException, finger3)) && this.values.get(new Pair(this.PngjInputException, finger3)) != null) {
            ((TextView) findViewById(R.id.ring_finger_score)).setText(Html.fromHtml(((com.identy.a) this.values.get(new Pair(this.PngjInputException, finger3))).PngjException(this.Action)));
        }
        if (!this.values.containsKey(new Pair(this.PngjInputException, finger4)) || this.values.get(new Pair(this.PngjInputException, finger4)) == null) {
            return;
        }
        ((TextView) findViewById(R.id.little_finger_score)).setText(Html.fromHtml(((com.identy.a) this.values.get(new Pair(this.PngjInputException, finger4))).PngjException(this.Action)));
    }
}
