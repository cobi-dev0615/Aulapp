package com.identy.ui.c;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.d.e.a.c.getPadSub3B15685$PngjException;
import com.identy.IdentySdk;
import com.identy.UIAfterCaptures;
import com.identy.enums.FingerDetectionMode;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class PngjOutputException extends Dialog {
    private static final byte[] $$a = {58, -87, 109, 66, -18, 14, 12, -13, 17};
    private static final int $$b = 112;
    private FingerDetectionMode PngjBadSignature;
    private com.identy.d.PngjException PngjException;
    private FingerDetectionMode valueOf;

    public class PngjBadCrcException implements View.OnClickListener {
        public PngjBadCrcException() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PngjOutputException.this.dismiss();
        }
    }

    public class PngjBadSignature implements getPadSub3B15685$PngjException {
        public PngjBadSignature() {
        }

        @Override // com.d.e.a.c.getPadSub3B15685$PngjException
        public final void PngjBadCrcException(int i, int i2) {
            if (i != i2) {
                PngjOutputException.this.dismiss();
            }
        }
    }

    public class valueOf implements Runnable {
        public valueOf() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PngjOutputException.this.dismiss();
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

    public PngjOutputException(Context context, com.identy.d.PngjException pngjException, FingerDetectionMode fingerDetectionMode, FingerDetectionMode fingerDetectionMode2) {
        super(context, R.style.Theme_Translucent_NoTitleBar);
        this.PngjException = pngjException;
        this.PngjBadSignature = fingerDetectionMode2;
        this.valueOf = fingerDetectionMode;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        ((ViewGroup.LayoutParams) layoutParams).width = -1;
        ((ViewGroup.LayoutParams) layoutParams).height = -1;
        getWindow().setAttributes(layoutParams);
        setOnDismissListener(new values(pngjException));
        try {
            java.lang.Object[] objArr = {context, 10, new PngjBadSignature()};
            java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
            if (PngjBadSignature2 == null) {
                char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14829);
                int i = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27;
                int scrollBarSize = 721 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte b = (byte) 0;
                byte b2 = b;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(b, b2, b2, objArr2);
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c, i, scrollBarSize, 1560737410, false, (String) objArr2[0], new Class[]{Context.class, Integer.TYPE, getPadSub3B15685$PngjException.class});
            }
            ((Method) PngjBadSignature2).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();

            if (cause == null) {

                throw new RuntimeException(th);

            }

            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i7 = 0;
        int i2 = b * 2;
        byte[] bArr = $$a;
        int i3 = (s * 3) + 118;
        int i4 = (b2 * 4) + 4;
        byte[] bArr2 = new byte[6 - i2];
        int i5 = 5 - i2;
        if (bArr == null) {
            int i6 = i3;
            i3 = i5;
            i4++;
            i3 = (i3 + i6) - 3;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i6 = bArr[i4];
            i4++;
            i3 = (i3 + i6) - 3;
            i = i7;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i3;
            i7 = i + 1;
            if (i == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
        }
        objArr[0] = new String(bArr2, 0);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        long j;
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        try {
            z = IdentySdk.getInstance().isCustomSDK();
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        setContentView(z ? com.identy.R.layout.touchless_popup_enroll_success : com.identy.R.layout.identy_popup_enroll_success);
        findViewById(com.identy.R.id.close_sep).setOnClickListener(new PngjBadCrcException());
        try {
            if (!IdentySdk.getInstance().getUitype().equals(UIAfterCaptures.INLINE)) {
                findViewById(com.identy.R.id.enroll_inline_ui).setVisibility(8);
                return;
            }
            if (this.PngjBadSignature != null) {
                ((TextView) findViewById(com.identy.R.id.id_fin_enroll_next)).setText(this.PngjBadSignature.getEnrollnextMsg());
            } else {
                ((TextView) findViewById(com.identy.R.id.id_fin_enroll_next)).setText(com.identy.R.string.id_no_next);
            }
            ((TextView) findViewById(com.identy.R.id.id_fin_enroll_success)).setText(this.valueOf.getEnrollsuccessMsg());
            findViewById(com.identy.R.id.enroll_inline_ui).setVisibility(0);
            try {
                j = IdentySdk.getInstance().getAfterCaptureInlinemsgTime();
            } catch (Exception e2) {
                e2.printStackTrace();
                j = 0;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new valueOf(), j);
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }
}
