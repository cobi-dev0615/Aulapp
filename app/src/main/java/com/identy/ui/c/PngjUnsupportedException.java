package com.identy.ui.c;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.d.e.a.c.getPadSub3B15685$PngjException;
import com.identy.IdentySdk;
import com.identy.UIAfterCaptures;
import com.identy.enums.FingerDetectionMode;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class PngjUnsupportedException extends Dialog {
    private static final byte[] $$a = {47, -97, -33, -115, 18, -14, -12, 13, -17};
    private static final int $$b = 28;
    private FingerDetectionMode PngjBadCrcException;
    private com.identy.d.PngjException PngjBadSignature;
    private FingerDetectionMode values;

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

    public class PngjBadSignature implements getPadSub3B15685$PngjException {
        public PngjBadSignature() {
        }

        @Override // com.d.e.a.c.getPadSub3B15685$PngjException
        public final void PngjBadCrcException(int i, int i2) {
            if (i != i2) {
                PngjUnsupportedException.this.dismiss();
            }
        }
    }

    public class valueOf implements Runnable {
        public valueOf() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            PngjUnsupportedException.this.dismiss();
        }
    }

    public class values implements View.OnClickListener {
        public values() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PngjUnsupportedException.this.dismiss();
        }
    }

    public PngjUnsupportedException(Context context, com.identy.d.PngjException pngjException, FingerDetectionMode fingerDetectionMode, FingerDetectionMode fingerDetectionMode2) {
        super(context, R.style.Theme_Translucent_NoTitleBar);
        this.PngjBadSignature = pngjException;
        this.values = fingerDetectionMode2;
        this.PngjBadCrcException = fingerDetectionMode;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        ((ViewGroup.LayoutParams) layoutParams).width = -1;
        ((ViewGroup.LayoutParams) layoutParams).height = -1;
        getWindow().setAttributes(layoutParams);
        setOnDismissListener(new PngjBadCrcException(pngjException));
        try {
            java.lang.Object[] objArr = {context, 10, new PngjBadSignature()};
            java.lang.Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1578525895);
            if (PngjBadSignature2 == null) {
                char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 14830);
                int indexOf = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 28;
                int keyRepeatTimeout = 721 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                byte b = (byte) 0;
                byte b2 = b;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a(b, b2, b2, objArr2);
                PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(scrollBarSize, indexOf, keyRepeatTimeout, 1560737410, false, (String) objArr2[0], new Class[]{Context.class, Integer.TYPE, getPadSub3B15685$PngjException.class});
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        int i5 = 118 - (i * 4);
        int i6 = (s * 2) + 6;
        byte[] bArr = $$a;
        int i7 = 3 - (i2 * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            int i8 = 0;
            int i9 = i7;
            i5 = (i5 + (-i7)) - 3;
            i7 = i9;
            bArr = bArr3;
            i3 = i8;
            int i10 = i7 + 1;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i10];
            byte[] bArr4 = bArr;
            i9 = i10;
            i7 = b;
            i8 = i4;
            bArr3 = bArr4;
            i5 = (i5 + (-i7)) - 3;
            i7 = i9;
            bArr = bArr3;
            i3 = i8;
            int i102 = i7 + 1;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            int i1022 = i7 + 1;
            bArr2[i3] = (byte) i5;
            i4 = i3 + 1;
            if (i4 == i6) {
            }
        }
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
        setContentView(z ? com.identy.R.layout.touchless_popup_capture_success : com.identy.R.layout.identy_popup_capture_success);
        findViewById(com.identy.R.id.close_sep).setOnClickListener(new values());
        try {
            if (!IdentySdk.getInstance().getUitype().equals(UIAfterCaptures.INLINE)) {
                findViewById(com.identy.R.id.capture_inline_ui).setVisibility(8);
                return;
            }
            if (this.values != null) {
                ((TextView) findViewById(com.identy.R.id.id_fin_capture_next)).setText(this.values.getNextMsg());
            } else {
                ((TextView) findViewById(com.identy.R.id.id_fin_capture_next)).setText(com.identy.R.string.id_no_next);
            }
            ((TextView) findViewById(com.identy.R.id.id_fin_capture_success)).setText(this.PngjBadCrcException.getSuccessMsg());
            findViewById(com.identy.R.id.capture_inline_ui).setVisibility(0);
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
