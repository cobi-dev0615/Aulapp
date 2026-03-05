package com.gse.aulapp.lib.encryption_gse.encryptJwe.util;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class FileUtil {
    public static BufferedReader getFileByAsset(Context context, String str) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(str)));
        } catch (IOException e) {
            e.getMessage();
            bufferedReader = null;
        }
        Objects.toString(bufferedReader);
        return bufferedReader;
    }
}
