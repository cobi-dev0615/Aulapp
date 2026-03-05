package com.identy.app;

import android.app.Activity;
import android.os.Environment;
import com.karumi.dexter.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class PngjBadSignature {
    public static File PngjBadCrcException(String str, String str2) {
        String absolutePath = values(str).getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        sb.append(absolutePath);
        sb.append("/");
        sb.append(str2);
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File PngjBadSignature(Activity activity, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(activity.getFilesDir().getAbsolutePath());
        sb.append("/");
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static boolean PngjException(File file) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (file.listFiles() == null) {
            return false;
        }
        for (File file2 : file.listFiles()) {
            values(file2);
        }
        return false;
    }

    private static File values(String str) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS));
        sb2.append("/IDENTY");
        File file = new File(sb2.toString());
        if (!file.exists()) {
            file.mkdir();
        }
        sb.append(file.toString());
        sb.append("/");
        sb.append(str);
        File file2 = new File(sb.toString());
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }

    public static byte[] PngjBadSignature(File file) {
        byte[] bArr = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return bArr;
        } catch (IOException e2) {
            e2.printStackTrace();
            return bArr;
        }
    }

    public static boolean values(File file) {
        try {
            if (!file.exists()) {
                return false;
            }
            if (!file.isFile()) {
                return true;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(BuildConfig.FLAVOR.getBytes());
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
