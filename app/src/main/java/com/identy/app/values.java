package com.identy.app;

import android.os.AsyncTask;
import com.identy.isQualityFailed;
import com.karumi.dexter.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class values {

    public class PngjBadCrcException extends AsyncTask<byte[], Void, String> {
        private String PngjBadCrcException;
        private String PngjBadSignature;
        private String PngjException;
        private String valueOf;

        public PngjBadCrcException(String str, String str2, String str3) {
            this.PngjBadSignature = str2;
            this.PngjException = str;
            this.PngjBadCrcException = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* renamed from: PngjBadSignature, reason: merged with bridge method [inline-methods] */
        public String doInBackground(byte[]... bArr) {
            byte[] bArr2 = bArr[0];
            StringBuilder sb = new StringBuilder();
            sb.append(com.identy.app.PngjBadSignature.PngjBadCrcException(this.PngjException, this.PngjBadSignature));
            sb.append("/");
            File file = new File(sb.toString());
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.PngjBadCrcException);
            sb2.append(".png");
            File file2 = new File(file, sb2.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                int round = Math.round(bArr2.length * 0.1f);
                byte[] copyOf = Arrays.copyOf(bArr2, round);
                byte[] copyOfRange = Arrays.copyOfRange(bArr2, round, bArr2.length);
                fileOutputStream.write(copyOf);
                fileOutputStream.write(copyOfRange);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                    fileOutputStream2.write(bArr2);
                    fileOutputStream2.flush();
                    fileOutputStream2.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return this.valueOf;
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ void onPostExecute(String obj) {
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
        }

        @Override // android.os.AsyncTask
        public final /* bridge */ /* synthetic */ void onProgressUpdate(Void... objArr) {
        }
    }

    public final void PngjBadCrcException(byte[] bArr, String str, String str2, String str3) {
        String obj;
        try {
            StringBuilder sb = new StringBuilder();
            boolean isEmpty = isQualityFailed.PngjBadCrcException.isEmpty();
            String str4 = BuildConfig.FLAVOR;
            if (isEmpty) {
                obj = BuildConfig.FLAVOR;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(isQualityFailed.PngjBadCrcException);
                sb2.append("_");
                obj = sb2.toString();
            }
            sb.append(obj);
            if (!isQualityFailed.PngjException.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(isQualityFailed.PngjException);
                sb3.append("_");
                str4 = sb3.toString();
            }
            sb.append(str4);
            sb.append(str);
            new PngjBadCrcException(str2, str3, sb.toString()).execute((byte[]) bArr.clone());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
