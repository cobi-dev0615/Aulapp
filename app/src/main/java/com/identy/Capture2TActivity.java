package com.identy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.uuid.Uuid;

/* loaded from: classes2.dex */
public class Capture2TActivity extends FingerActivity {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static int getScore;
    private static int valueOf;
    private static long values;
    final HashMap PngjBadCrcException = new HashMap();

    public class PngjBadSignature implements Runnable {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static final byte[] $$c = null;
        private static final int $$d = 0;
        private static int $10;
        private static int $11;
        private static char[] PngjBadSignature;
        private static int[] PngjException;
        private static int PngjUnsupportedException;
        private static int valueOf;
        private /* synthetic */ HashMap PngjBadCrcException;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0025). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static String $$e(short s, byte b, int i) {
            int i2;
            int i3;
            int i4;
            int i5 = 4 - (s * 3);
            int i6 = 1 - (i * 2);
            int i7 = b + 65;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i8 = i5;
                i7 = i6;
                i4 = 0;
                int i9 = i5;
                i7 += -i8;
                i2 = i4;
                i3 = i9 + 1;
                i4 = i2 + 1;
                bArr2[i2] = (byte) i7;
                if (i4 == i6) {
                    return new String(bArr2, 0);
                }
                i8 = bArr[i3];
                i9 = i3;
                i7 += -i8;
                i2 = i4;
                i3 = i9 + 1;
                i4 = i2 + 1;
                bArr2[i2] = (byte) i7;
                if (i4 == i6) {
                }
            } else {
                i2 = 0;
                i3 = i5;
                i4 = i2 + 1;
                bArr2[i2] = (byte) i7;
                if (i4 == i6) {
                }
            }
        }

        static {
            init$1();
            $10 = 0;
            $11 = 1;
            init$0();
            valueOf = 0;
            PngjUnsupportedException = 1;
            PngjException = new int[]{119752582, -525543299, 1443281450, -497242950, -1387219859, -1284445754, 44685551, 208750332, -173908885, -639485540, 93793819, 1731507460, -1793788874, -280020490, 359404049, -1652988515, -473408116, 1646502884};
            PngjBadSignature = new char[]{40106, 39957, 39959, 40170, 40175, 40169, 39952, 39959, 40100, 39959, 39997, 39997, 39986, 39947, 39944, 39956, 39956, 39950, 39950, 39984, 39988, 39938, 39937, 39946, 39987, 39986, 39946, 39946, 39985, 39991, 39957, 39958, 39984, 39991, 39944, 39947, 39947, 39946, 40177, 40049, 40339, 40338, 40048, 40051, 40338, 40338, 40349, 40056, 40060, 40339, 40338, 40342, 40055, 40055, 40043, 40042, 40338, 40349, 40342, 40043, 40040, 40342, 40343, 40048, 40063, 40337, 40098, 40188, 40191, 40164, 40154, 40157, 40176, 40183, 40191, 40186, 40179, 40176, 40181, 40076, 40096, 40191, 40191, 40186, 40132, 40156, 40176, 40183, 40191, 40186, 40158, 40132, 40190, 40096, 40164, 40101, 40191, 40184, 40190, 40165, 40164, 40190, 40176, 40189, 40185, 40184, 40188, 40108, 40163, 40175, 40174, 40162, 40166, 40173, 40173, 40173, 40170, 40168, 40171, 40170, 40172, 39955, 40336, 40338, 40351, 40349, 40349, 40042, 40340, 40348, 40336, 40342, 40341, 40043, 40341, 40336, 40344, 40346, 40346, 40337, 40336, 40079, 40129, 40167, 40189, 40182, 40176, 40190, 40188, 40190, 40186, 40157, 39962, 39960, 39955, 39954, 39942, 39937, 39964, 39956, 39964, 39966, 39963, 39941, 39940, 40099, 40164, 40165, 40155, 40133, 40160, 40160, 40190, 40190, 40167, 40133, 40158, 40189, 40188, 40184, 40133, 40157, 40135, 39959, 40174, 39937, 40067, 40154, 40191, 40177, 40185, 40135, 40154, 40189, 40184, 40167, 40162, 40162, 39943, 40375, 40329, 40374, 40349, 40100, 40185, 40186, 40183, 40189, 40186, 40185, 40189, 40178, 40191, 40186, 40180, 40020, 40020, 39983, 39969, 39968, 39975, 39976, 40018, 39990, 39950, 39978, 40018, 39990, 39991, 40020, 39977, 39977, 40096, 40191, 40186, 40165, 40167, 40184, 40190, 40107, 40172, 40173, 39956, 40168, 40168, 39957, 40139, 40138, 39952, 39952, 40138, 40138, 40170, 40169, 40171, 40163, 40186, 40164, 40165, 40166, 40174, 39957, 40067, 40157, 40182, 40190, 40190, 40156, 40153, 40185, 40189, 40182, 40178, 40153, 40164, 40342, 40335, 40322, 40328, 40043, 40067, 40133, 40162, 40186, 40157, 40122, 40154, 40191, 40177, 40156, 40154, 40189, 40184, 40167, 40162, 40162, 40133, 40067, 40154, 40191, 40177, 40185, 40135, 40157, 40191, 40133, 40154, 40189, 40184, 40167, 40162, 40162, 40133, 39962, 40331, 40331, 40046, 40012, 40046, 40334, 40332, 40333, 40044, 40037, 40345, 40346, 40326, 40034, 40038, 40323, 40040, 40045, 40335, 40329, 40047, 40035, 40326, 40321, 40179, 40036, 40321, 40321, 40326, 40351, 40348, 40057, 40038, 40344, 40336, 40350, 40057, 40118, 40179, 39965, 39955, 40177, 40137, 40174, 39956, 40183, 40153, 39946, 39945, 39939, 39947, 39996, 39959, 39957, 39944, 39943, 40172, 40102, 40182, 40183, 40191, 40185, 40138, 40149, 40158, 40190, 40179, 40178, 40153, 40147, 40191, 40191, 40177};
        }

        public PngjBadSignature(HashMap hashMap) {
            this.PngjBadCrcException = hashMap;
        }

        /* JADX WARN: Code restructure failed: missing block: B:100:0x1417, code lost:
        
            r4 = new java.lang.Object[]{((java.lang.String) r14[0]).concat(java.lang.String.valueOf(r4))};
            r8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1934049891);
         */
        /* JADX WARN: Code restructure failed: missing block: B:101:0x1422, code lost:
        
            if (r8 != null) goto L161;
         */
        /* JADX WARN: Code restructure failed: missing block: B:102:0x1424, code lost:
        
            r8 = (char) android.text.TextUtils.indexOf(com.karumi.dexter.BuildConfig.FLAVOR, com.karumi.dexter.BuildConfig.FLAVOR, 0, 0);
            r53 = (android.view.ViewConfiguration.getZoomControlsTimeout() > r35 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == r35 ? 0 : -1)) + 27;
            r9 = 1447 - android.view.KeyEvent.normalizeMetaState(0);
            r10 = (byte) (com.identy.Capture2TActivity.PngjBadSignature.$$b - 1);
            r14 = r10;
            r48 = r0;
            r0 = new java.lang.Object[1];
            a(r10, r14, (byte) (r14 | 15), r0);
            r8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r8, r53, r9, -1884803112, false, (java.lang.String) r0[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x1463, code lost:
        
            r13 = ((java.lang.Long) ((java.lang.reflect.Method) r8).invoke(null, r4)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:104:0x1470, code lost:
        
            r9 = -1183587401;
            r8 = r5;
            r4 = defpackage.a.a();
            r58 = r13 ^ r2;
            r54 = ((-676) * ((r9 | r4) | r58)) + (((-675) * r13) + (677 * r9));
            r4 = 676;
            r60 = r4 ^ r2;
            r4 = ((r4 * (((((r9 ^ r2) | r58) ^ r2) | ((r58 | r60) ^ r2)) | (((r9 | r13) | r4) ^ r2))) + (((((r58 | r9) ^ r2) | ((r60 | r9) ^ r2)) * r4) + r54)) - 533329866;
            r0 = ((int) (r4 >> 32)) & (((~((-1213170470) | r76)) * 113) + (((((~((-224055942) | r76)) | 84955264) | (~((-1074069793) | r7))) * (-113)) + ((((~((-1213170470) | r7)) | 224055941) * 226) - 2055567968)));
            r4 = ((int) r4) & ((((-1346392193) | r76) * 465) + ((((-1383354507) | (~(53871903 | r76))) * 930) + ((((~((-1383354507) | r76)) | 53871903) * (-465)) + 167875179)));
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x1515, code lost:
        
            if (((r0 & r4) | (r0 ^ r4)) != 0) goto L166;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x1517, code lost:
        
            r0 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:108:0x151a, code lost:
        
            r4 = com.identy.a.PngjException.values();
            r9 = (r3 * (-518)) + (r0 * (-518));
            r5 = ~r0;
            r10 = ~r4;
            r10 = ~((r10 & r5) | (r5 ^ r10));
            r10 = ((r10 & r3) | (r3 ^ r10)) * 519;
            r13 = ((r9 | r10) << 1) - (r9 ^ r10);
            r9 = ~r4;
            r5 = (r5 & r9) | (r5 ^ r9);
            r5 = (((~((r5 & r3) | (r5 ^ r3))) | (~((r0 | r3) | r4))) * (-519)) + r13;
            r0 = -(-((r0 | (~((r3 & r4) | (r3 ^ r4)))) * 519));
            r3 = (r5 ^ r0) + ((r0 & r5) << 1);
            r2 = ((r2 ^ 121) + ((r2 & 121) << 1)) - 120;
            r5 = r8;
            r0 = r48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:109:0x1519, code lost:
        
            r0 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:111:0x1461, code lost:
        
            r48 = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x156a, code lost:
        
            r8 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:114:0x1573, code lost:
        
            if (r3 < 25.2d) goto L171;
         */
        /* JADX WARN: Code restructure failed: missing block: B:115:0x1575, code lost:
        
            r0 = '!';
         */
        /* JADX WARN: Code restructure failed: missing block: B:117:0x157c, code lost:
        
            if (r0 == '\\') goto L176;
         */
        /* JADX WARN: Code restructure failed: missing block: B:118:0x157e, code lost:
        
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:142:0x1846, code lost:
        
            if ((r2 - 3 < r60 ? '_' : 3) != '_') goto L207;
         */
        /* JADX WARN: Code restructure failed: missing block: B:143:0x1850, code lost:
        
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:165:0x1b3d, code lost:
        
            if ((r2 > r35 ? ';' : 'a') != 'a') goto L239;
         */
        /* JADX WARN: Code restructure failed: missing block: B:167:0x1b52, code lost:
        
            if ((r2 + 100) >= r54) goto L242;
         */
        /* JADX WARN: Code restructure failed: missing block: B:168:0x1b54, code lost:
        
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:169:0x1b57, code lost:
        
            if (r2 == false) goto L245;
         */
        /* JADX WARN: Code restructure failed: missing block: B:170:0x1b5a, code lost:
        
            r0 = r0 + 31;
            com.identy.Capture2TActivity.PngjBadSignature.PngjUnsupportedException = r0 % kotlin.uuid.Uuid.SIZE_BITS;
         */
        /* JADX WARN: Code restructure failed: missing block: B:171:0x1b64, code lost:
        
            if ((r0 % 2) != 0) goto L248;
         */
        /* JADX WARN: Code restructure failed: missing block: B:172:0x1b68, code lost:
        
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:222:0x2015, code lost:
        
            if (r0 == false) goto L304;
         */
        /* JADX WARN: Code restructure failed: missing block: B:376:0x3947, code lost:
        
            if ((((r0 & r2) | (r0 ^ r2)) != 0 ? false : 32) != false) goto L596;
         */
        /* JADX WARN: Code restructure failed: missing block: B:378:0x3d2d, code lost:
        
            r0 = new java.lang.Object[]{new int[]{(r76 & (-274)) | (r7 & 273)}, new int[1], null, new int[]{r76}};
            r2 = (int) java.lang.Runtime.getRuntime().totalMemory();
            r3 = ~(32691685 | r2);
            r4 = ~r2;
            r3 = r3 | (~(1067257659 | r4));
            r5 = ~((-32691686) | r4);
            r2 = defpackage.a.c(26215713 | r5, 516, (((~(r2 | (-1041041947))) | (~(r4 | (-26215714)))) * 516) + (((r3 | r5) * (-516)) + 396387025), 16);
            r3 = (r2 * 51) - 696052452;
            r4 = -(-(((r2 ^ r76) | (r2 & r76)) * (-50)));
            r5 = (r3 ^ r4) + ((r3 & r4) << 1);
            r3 = ~r2;
            r3 = (r3 & r19) | (r3 ^ r19);
            r1 = ~((r76 & r3) | (r3 ^ r76));
            r3 = ~(((r19 ^ r7) | (r19 & r7)) | r2);
            r5 = (r5 - (~(((r1 & r3) | (r1 ^ r3)) * 50))) - 1;
            r1 = ~((r19 ^ r8) | (r19 & r8));
            r3 = ~((r19 ^ r2) | (r19 & r2));
            r1 = (r1 & r3) | (r1 ^ r3);
            r2 = ~((r2 & r8) | (r8 ^ r2));
            r1 = (((r1 & r2) | (r1 ^ r2)) * 50) + r5;
            r2 = r1 << 13;
            r1 = (r1 | r2) & (~(r1 & r2));
            r2 = r1 >>> 17;
            r1 = (r1 | r2) & (~(r1 & r2));
            r2 = r1 << 5;
            ((int[]) r0[1])[0] = (r1 | r2) & (~(r1 & r2));
         */
        /* JADX WARN: Code restructure failed: missing block: B:379:0x3e03, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:381:0x3a35, code lost:
        
            r0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-820027826);
         */
        /* JADX WARN: Code restructure failed: missing block: B:382:0x3a39, code lost:
        
            if (r0 != null) goto L600;
         */
        /* JADX WARN: Code restructure failed: missing block: B:383:0x3a3b, code lost:
        
            r0 = (char) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 13779);
            r49 = (android.view.ViewConfiguration.getTouchSlop() >> 8) + 29;
            r2 = 1502 - android.widget.ExpandableListView.getPackedPositionType(r35);
            r3 = com.identy.Capture2TActivity.PngjBadSignature.$$b;
            r4 = (byte) (r3 + 1);
            r3 = (byte) r3;
            r6 = new java.lang.Object[1];
            a(r4, r3, (byte) (r3 - 1), r6);
            r0 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r0, r49, r2, 871379957, false, (java.lang.String) r6[0], new java.lang.Class[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:384:0x3a7d, code lost:
        
            r2 = ((java.lang.Long) ((java.lang.reflect.Method) r0).invoke(null, null)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:385:0x3a8a, code lost:
        
            r4 = 1374630237;
            r2 = (263 * r2) + ((-523) * r4);
            r9 = 262;
            r17 = ((r4 ^ r58) | r2) ^ r58;
            r15 = r2 ^ r58;
            r4 = (r4 | r15) ^ r58;
            r9 = ((r9 * (r4 | (((r15 | r56) ^ r58) | r17))) + (((-786) * r4) + ((((r17 | r4) | ((r13 | r15) ^ r58)) * r9) + r2))) - 1542025453;
            r2 = (int) android.os.SystemClock.elapsedRealtime();
            r0 = ((int) (r9 >> 32)) & ((((~(r2 | (-1908316513))) | (-949424373)) * 272) + ((((~(1908316512 | r2)) | 134283412) * (-272)) + ((((~(2042599924 | (~r2))) | (~((-815140961) | r2))) * (-272)) - 1683397910)));
            r3 = android.os.Process.myTid();
            r4 = ~r3;
            r5 = (~((-385966766) | r4)) | 318784168;
            r3 = ~(r3 | (-1756010579));
            r2 = ((int) r9) & (((r3 | (~(r4 | (-67182598)))) * 252) + (((r5 | r3) * (-252)) + 1586972597));
         */
        /* JADX WARN: Code restructure failed: missing block: B:386:0x3b1e, code lost:
        
            if (((r0 & r2) | (r0 ^ r2)) == 0) goto L604;
         */
        /* JADX WARN: Code restructure failed: missing block: B:387:0x3b20, code lost:
        
            r0 = 'U';
         */
        /* JADX WARN: Code restructure failed: missing block: B:389:0x3b27, code lost:
        
            if (r0 == 'U') goto L620;
         */
        /* JADX WARN: Code restructure failed: missing block: B:391:0x3b2a, code lost:
        
            r0 = new java.lang.Object[]{java.lang.Integer.valueOf(r76), r77, java.lang.Integer.valueOf(r37), 16777216};
            r2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1284430186);
         */
        /* JADX WARN: Code restructure failed: missing block: B:392:0x3b51, code lost:
        
            if (r2 != null) goto L611;
         */
        /* JADX WARN: Code restructure failed: missing block: B:393:0x3b53, code lost:
        
            r2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((android.os.SystemClock.elapsedRealtime() > r35 ? 1 : (android.os.SystemClock.elapsedRealtime() == r35 ? 0 : -1)) - 1), 26 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 1224 - android.text.TextUtils.getCapsMode(com.karumi.dexter.BuildConfig.FLAVOR, 0, 0), 1335773997, false, null, new java.lang.Class[]{r11, (java.lang.Class) com.d.e.a.PngjBadCrcException.values((char) (android.view.KeyEvent.getMaxKeyCode() >> 16), 25 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), (-16776017) - android.graphics.Color.rgb(0, 0, 0)), r11, r11});
         */
        /* JADX WARN: Code restructure failed: missing block: B:394:0x3b9c, code lost:
        
            r0 = ((java.lang.reflect.Constructor) r2).newInstance(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:396:0x3ba2, code lost:
        
            r4 = new java.lang.Object[1];
            c("\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true, new int[]{371, 16, 0, 0}, r4);
            r2 = java.lang.Class.forName((java.lang.String) r4[0]);
            r4 = -android.view.KeyEvent.normalizeMetaState(0);
            r5 = ((r4 | 5) << 1) - (r4 ^ 5);
            r4 = new java.lang.Object[1];
            b(new int[]{-663634992, -799357427, 637467420, 305851541}, r5, r4);
            r2.getMethod((java.lang.String) r4[0], null).invoke(r0, null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:397:0x3bec, code lost:
        
            r0 = new java.lang.Object[]{new int[]{r76}, new int[]{((~r1) & r2) | ((~r2) & r1)}, null, new int[]{r76}};
            r2 = 1767253027 - (~(-(-(((403706116 | (~((-557948946) | r7))) * 449) + ((((~(r76 | (-557948946))) | 403706116) * 449) - 2127246468)))));
            r1 = r2 << 13;
            r1 = (r1 | r2) & (~(r2 & r1));
            r2 = r1 >>> 17;
            r1 = (r1 | r2) & (~(r1 & r2));
            r2 = r1 << 5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:398:0x3c4b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:400:0x3c4c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:401:0x3c4d, code lost:
        
            r1 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:402:0x3c51, code lost:
        
            if (r1 != null) goto L618;
         */
        /* JADX WARN: Code restructure failed: missing block: B:403:0x3c53, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:404:0x3c54, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:406:0x3c55, code lost:
        
            r0 = new java.lang.Object[]{new int[]{(r76 & (-280)) | (r7 & 279)}, new int[]{((~r1) & r2) | ((~r2) & r1)}, null, new int[]{r76}};
            r4 = ((((~(284405931 | r7)) | (~(750160042 | r7))) | (~((-11698347) | r76))) * 568) + (((((~((-284405932) | r76)) | (~((-750160043) | r76))) | (~(1022867627 | r7))) * (-568)) + (((((~((-284405932) | r7)) | 11698346) | (~((-750160043) | r7))) * (-1136)) + 257519085));
            r2 = r4 * 521;
            r6 = ((-8304) & r2) + (r2 | (-8304));
            r2 = ~r4;
            r5 = ((-17) & r2) | ((-17) ^ r2);
            r5 = ~((r5 & r8) | (r5 ^ r8));
            r9 = ~(r4 | r76);
            r5 = -(-(((r5 & r9) | (r5 ^ r9)) * 520));
            r9 = (r6 & r5) + (r5 | r6);
            r2 = ~((r2 & r8) | (r2 ^ r8));
            r5 = ~(r76 | 16);
            r2 = (((r2 & r5) | (r2 ^ r5)) * (-1040)) + r9;
            r5 = ~((-17) | r7);
            r4 = ~r4;
            r4 = ~((r4 & 16) | (r4 ^ 16));
            r4 = (r4 & r5) | (r5 ^ r4);
            r1 = ~((r76 & 16) | (r76 ^ 16));
            r1 = ((r1 & r4) | (r4 ^ r1)) * 520;
            r4 = (((r2 | r1) << 1) - (r1 ^ r2)) + r37;
            r1 = (r4 << 13) ^ r4;
            r2 = r1 >>> 17;
            r1 = ((~r1) & r2) | ((~r2) & r1);
            r2 = r1 << 5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:407:0x3d2c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:408:0x3b23, code lost:
        
            r0 = ':';
         */
        /* JADX WARN: Code restructure failed: missing block: B:419:0x3a30, code lost:
        
            if ((((r0 & r2) | (r0 ^ r2)) != 0) != true) goto L596;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x05b3, code lost:
        
            if (((r2 & r3) | (r2 ^ r3)) != 477111747) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x05b6, code lost:
        
            r11 = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:472:0x28cf, code lost:
        
            if (r15 == null) goto L461;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x08ca, code lost:
        
            if (android.os.Build.VERSION.SDK_INT <= 33) goto L93;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x08cc, code lost:
        
            r2 = new java.lang.Object[1];
            c("\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001", false, new int[]{38, 28, com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 0}, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:503:0x2791, code lost:
        
            if (r15 == null) goto L421;
         */
        /* JADX WARN: Code restructure failed: missing block: B:506:0x277f, code lost:
        
            r15.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x08e3, code lost:
        
            r0 = new java.lang.Object[]{(java.lang.String) r2[0]};
            r2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x08ee, code lost:
        
            if (r2 != null) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x08f0, code lost:
        
            r2 = (char) ((-1) - android.os.Process.getGidForName(com.karumi.dexter.BuildConfig.FLAVOR));
            r49 = 29 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
            r3 = 1446 - android.view.MotionEvent.axisFromString(com.karumi.dexter.BuildConfig.FLAVOR);
            r4 = (byte) com.identy.Capture2TActivity.PngjBadSignature.$$b;
            r5 = r4;
            r8 = new java.lang.Object[1];
            a(r4, r5, (byte) (r5 + 3), r8);
            r2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r2, r49, r3, -1614962923, false, (java.lang.String) r8[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x092d, code lost:
        
            r2 = ((java.lang.Long) ((java.lang.reflect.Method) r2).invoke(null, r0)).longValue();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x093a, code lost:
        
            r4 = 9338041;
            r13 = ((-675) * r2) + (677 * r4);
            r9 = r76;
            r38 = 0.0f;
            r2 = -1;
            r52 = r2 ^ r2;
            r7 = ((-676) * ((r4 | r9) | r52)) + r13;
            r13 = 676;
            r54 = r9 ^ r2;
            r13 = ((r13 * ((r2 ^ ((r4 | r2) | r9)) | ((((r4 ^ r2) | r52) ^ r2) | ((r52 | r54) ^ r2)))) + (((((r52 | r4) ^ r2) | ((r54 | r4) ^ r2)) * r13) + r7)) + 461150276;
            r0 = ((int) (r13 >> 32)) & (((~((~r76) | 1991815892)) * 184) + (((1142947924 | r76) * (-184)) + ((((~((-865924993) | r2)) | 17057024) * 184) - 1852245494)));
            r2 = ((int) r13) & defpackage.a.c(((~((-766927198) | r76)) | 18882821) | (~(2090813688 | r76)), -69, (((~((-748044377) | r76)) | (~(2109696509 | r76))) * 69) + 1703886222, -1838197984);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x09d8, code lost:
        
            if (((r0 & r2) | (r0 ^ r2)) != 1) goto L92;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x09da, code lost:
        
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0a5f, code lost:
        
            if (r0 == false) goto L104;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x0a61, code lost:
        
            com.identy.Capture2TActivity.PngjBadSignature.valueOf = (com.identy.Capture2TActivity.PngjBadSignature.PngjUnsupportedException + 97) % kotlin.uuid.Uuid.SIZE_BITS;
            r0 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:604:0x1b56, code lost:
        
            r2 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:610:0x1b4b, code lost:
        
            if ((r2 > r35 ? 2 : 20) != 20) goto L239;
         */
        /* JADX WARN: Code restructure failed: missing block: B:616:0x184e, code lost:
        
            if ((r2 - 3) < r60) goto L206;
         */
        /* JADX WARN: Code restructure failed: missing block: B:620:0x1578, code lost:
        
            r0 = '\\';
         */
        /* JADX WARN: Code restructure failed: missing block: B:628:0x13ec, code lost:
        
            if (((((int) (r8 >> 32)) & ((((~((-1738854157) | r3)) | (~(r4 | (-1118886729)))) * 950) + ((((~((-1118886729) | r3)) | (~(r4 | (-1738854157)))) * (-950)) + ((((~(1118886728 | r4)) | (~(1738854156 | r3))) * 1900) + 1871737038)))) | (((int) r8) & ((((~(1664426061 | r76)) | 227199651) * 376) + ((((~((-1664426062) | r7)) | 1647648844) * (-376)) + (((1858071278 | r76) * 376) + 2088992125))))) == 477111747) goto L154;
         */
        /* JADX WARN: Code restructure failed: missing block: B:634:0x09dd, code lost:
        
            r0 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:635:0x09e0, code lost:
        
            r38 = 0.0f;
            r2 = new java.lang.Object[1];
            c("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001", false, new int[]{66, 13, 0, 2}, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:636:0x09f8, code lost:
        
            r0 = new java.lang.Object[]{(java.lang.String) r2[0]};
            r2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r32);
         */
        /* JADX WARN: Code restructure failed: missing block: B:637:0x0a00, code lost:
        
            if (r2 != null) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:638:0x0a02, code lost:
        
            r2 = (char) (8751 - android.text.TextUtils.lastIndexOf(com.karumi.dexter.BuildConfig.FLAVOR, '0', 0, 0));
            r49 = android.text.TextUtils.getOffsetAfter(com.karumi.dexter.BuildConfig.FLAVOR, 0) + 24;
            r3 = 337 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
            r4 = com.identy.Capture2TActivity.PngjBadSignature.$$b;
            r5 = (byte) (r4 + 1);
            r4 = (byte) r4;
            r8 = new java.lang.Object[1];
            a(r5, r4, (byte) (r4 - 1), r8);
            r2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(r2, r49, r3, -598779726, false, (java.lang.String) r8[0], new java.lang.Class[]{java.lang.String.class});
         */
        /* JADX WARN: Code restructure failed: missing block: B:639:0x0a41, code lost:
        
            r0 = ((java.lang.reflect.Method) r2).invoke(null, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:640:0x0a48, code lost:
        
            r3 = new java.lang.Object[1];
            c("\u0001", false, new int[]{79, 1, 0, 1}, r3);
            r0 = r0.equals((java.lang.String) r3[0]);
         */
        /* JADX WARN: Code restructure failed: missing block: B:648:0x06b3, code lost:
        
            if (((((int) (r9 >> 32)) & defpackage.a.c((-173408898) | r7, -828, (((~((-173408898) | r7)) | 1610635308) * (-828)) + 1754752898, 1848645948)) | (((((~(r7 | 1545878427)) | (~((-1311862459) | r76))) * 979) + (((1545878427 | r76) * (-979)) + (((~((-1311862459) | r7)) * 979) + 31140552))) & ((int) r9))) != 477111747) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:656:0x07b0, code lost:
        
            if ((r0 | (((int) r13) & defpackage.a.c((~((~r4) | (-37855241))) | 671615233, 576, (((~((-1111990447) | r4)) | 1074135206) * 576) + 1771465493, 226588032))) != (-1032769152)) goto L74;
         */
        /* JADX WARN: Code restructure failed: missing block: B:664:0x08c4, code lost:
        
            if (((r0 & r2) | (r0 ^ r2)) == 542074309) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:678:0x0201, code lost:
        
            if (((((int) (r13 >> 32)) & defpackage.a.c(r2 | (-1280757891), -828, (((~((-1280757891) | r2)) | (-1576982995)) * (-828)) + 1754752898, -389389192)) | (((int) r13) & ((((~((~((int) android.os.Process.getElapsedCpuTime())) | 453090201)) | (-2074868700)) * 191) + ((((~(453090201 | r5)) | (-1890316612)) * 191) - 523123721)))) != 0) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x12dd, code lost:
        
            if (((r2 & r8) | (r8 ^ r2)) != 477111747) goto L146;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x13ee, code lost:
        
            r2 = 0;
            r3 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x13f2, code lost:
        
            if (r2 >= 28) goto L682;
         */
        /* JADX WARN: Code restructure failed: missing block: B:99:0x13f4, code lost:
        
            r4 = r0[r2];
            r14 = new java.lang.Object[1];
            b(new int[]{1481079821, -1204985403, 1573751675, 1163940359, 1454481099, -1270784315}, 12 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), r14);
         */
        /* JADX WARN: Removed duplicated region for block: B:145:0x1855  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x1919  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x1b6b  */
        /* JADX WARN: Removed duplicated region for block: B:176:0x1bee  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x21e2  */
        /* JADX WARN: Removed duplicated region for block: B:227:0x225d  */
        /* JADX WARN: Removed duplicated region for block: B:279:0x2797  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x279d  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x2858  */
        /* JADX WARN: Removed duplicated region for block: B:321:0x3149  */
        /* JADX WARN: Removed duplicated region for block: B:324:0x3152  */
        /* JADX WARN: Removed duplicated region for block: B:423:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:424:0x314c  */
        /* JADX WARN: Removed duplicated region for block: B:498:0x279a  */
        /* JADX WARN: Removed duplicated region for block: B:682:0x3ed4  */
        /* JADX WARN: Removed duplicated region for block: B:683:0x3ed5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static Object[] PngjException$52c725b(int i, Object obj) {
            Throwable cause;
            int i2;
            Class cls;
            int i3;
            Class cls2;
            long j;
            float f;
            int i4;
            long j2;
            long j3;
            boolean z;
            long j4;
            boolean z2;
            int i5;
            int i6;
            int i7;
            char c;
            char c2;
            BufferedInputStream bufferedInputStream;
            BufferedInputStream bufferedInputStream2;
            int i8;
            int i9;
            BufferedInputStream bufferedInputStream3;
            BufferedInputStream bufferedInputStream4;
            int i10;
            boolean z3;
            int i11;
            int i12;
            Object[] objArr;
            char c3;
            char c4;
            int i13;
            Object invoke;
            String[] strArr;
            int i14;
            boolean z4;
            String[] strArr2;
            Object obj2;
            Object obj3;
            Class cls3 = Integer.TYPE;
            int i15 = PngjUnsupportedException;
            int i16 = (i15 & 55) + (i15 | 55);
            valueOf = i16 % Uuid.SIZE_BITS;
            try {
                if (i16 % 2 != 0) {
                    Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1085800324);
                    if (PngjBadSignature2 == null) {
                        char myTid = (char) (1179 - (Process.myTid() >> 22));
                        int indexOf = 43 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0');
                        int bitsPerPixel = 1091 - ImageFormat.getBitsPerPixel(0);
                        int i17 = $$b;
                        byte b = (byte) (i17 + 1);
                        byte b2 = (byte) i17;
                        Object[] objArr2 = new Object[1];
                        a(b, b2, (byte) (b2 - 1), objArr2);
                        PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myTid, indexOf, bitsPerPixel, -1135046081, false, (String) objArr2[0], new Class[0]);
                    }
                    long longValue = ((Long) ((Method) PngjBadSignature2).invoke(null, null)).longValue();
                    long j5 = 626324514;
                    long j6 = -1;
                    long j7 = longValue ^ j6;
                    long j8 = i;
                    long j9 = (j5 | j8) ^ j6;
                    long j10 = 407;
                    long j11 = j5 ^ j6;
                    long j12 = (j11 | longValue) ^ j6;
                    long j13 = (j10 * (j12 | ((j11 | j8) ^ j6) | (j6 ^ (longValue | j8)))) + ((((j7 | (j8 ^ j6)) ^ j6) | j12 | j9) * j10) + ((-814) * (((j7 | j5) ^ j6) | j9)) + (408 * longValue) + ((-813) * j5) + 1298591803;
                    i2 = 0;
                    if (((((int) (j13 << 3)) & ((((~((~i) | 2119249993)) | (-2130180832)) * 560) + ((~((-671092745) | i)) * (-560)) + (((~((-682023583) | r7)) * (-560)) - 1807601366))) | (((int) j13) & ((((~(1158383069 | i)) | 541073440) * 658) + (((541172133 | r4) * (-658)) - 1372286417)))) == 0) {
                        cls = cls3;
                        int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                        int values = com.identy.a.PngjException.values();
                        int i18 = (minimumFlingVelocity * 399) + 4389;
                        int i19 = ~minimumFlingVelocity;
                        int i20 = ~((i19 ^ 11) | (i19 & 11));
                        int i21 = ~(((-12) ^ minimumFlingVelocity) | ((-12) & minimumFlingVelocity));
                        int i22 = -(-((i20 | i21 | (~((-12) | values))) * 398));
                        int i23 = (i18 ^ i22) + ((i18 & i22) << 1);
                        int i24 = ((minimumFlingVelocity & 11) | (minimumFlingVelocity ^ 11)) * (-1194);
                        int i25 = (i23 & i24) + (i24 | i23);
                        int i26 = ~values;
                        int i27 = ~((i26 & (-12)) | ((-12) ^ i26));
                        int i28 = ~(i19 | 11);
                        int i29 = (i27 & i28) | (i27 ^ i28);
                        int i30 = ((i29 & i21) | (i29 ^ i21)) * 398;
                        int i31 = (i25 & i30) + (i30 | i25);
                        Object[] objArr3 = new Object[1];
                        b(new int[]{1759662452, 20541450, 2126853317, -1556520981, -1651938268, 805825169}, i31, objArr3);
                        Object[] objArr4 = {(String) objArr3[i2]};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(547370249);
                        if (PngjBadSignature3 == null) {
                            char c5 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 8752);
                            int i32 = i2;
                            int i33 = (ExpandableListView.getPackedPositionForChild(i32, i32) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i32, i32) == 0L ? 0 : -1)) + 25;
                            int mode = View.MeasureSpec.getMode(i32) + 336;
                            int i34 = $$b;
                            byte b3 = (byte) (i34 + 1);
                            byte b4 = (byte) i34;
                            i3 = 547370249;
                            Object[] objArr5 = new Object[1];
                            a(b3, b4, (byte) (b4 - 1), objArr5);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c5, i33, mode, -598779726, false, (String) objArr5[0], new Class[]{String.class});
                        } else {
                            i3 = 547370249;
                        }
                        String str = (String) ((Method) PngjBadSignature3).invoke(null, objArr4);
                        if (str != null) {
                            int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                            int i35 = (scrollBarSize & 6) + (scrollBarSize | 6);
                            Object[] objArr6 = new Object[1];
                            b(new int[]{1276094290, -1619542164, -1113266789, 198456564}, i35, objArr6);
                            String str2 = (String) objArr6[0];
                            Object[] objArr7 = new Object[1];
                            c("\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001", false, new int[]{0, 8, 22, 0}, objArr7);
                            String[] strArr3 = {str2, (String) objArr7[0]};
                            int i36 = 2;
                            int i37 = 0;
                            while (true) {
                                if (i37 >= i36) {
                                    cls2 = cls;
                                    j = 0;
                                    f = 0.0f;
                                    PngjUnsupportedException = (valueOf + 55) % Uuid.SIZE_BITS;
                                    break;
                                }
                                if (!str.contains(strArr3[i37])) {
                                    i37 = ((i37 & 4) + (i37 | 4)) - 3;
                                    i36 = 2;
                                } else {
                                    Object[] objArr8 = new Object[1];
                                    b(new int[]{-337455723, 1171731284, 932404556, 254140698, -1777619928, 915796467, 745921551, -1756078516, -51602247, 1110896796, 61853916, 192622110}, 22 - (~(ViewConfiguration.getTapTimeout() >> 16)), objArr8);
                                    Object[] objArr9 = {(String) objArr8[0]};
                                    Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                    if (PngjBadSignature4 == null) {
                                        char gidForName = (char) (8751 - Process.getGidForName(BuildConfig.FLAVOR));
                                        int i38 = (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 23;
                                        int defaultSize = 336 - View.getDefaultSize(0, 0);
                                        int i39 = $$b;
                                        byte b5 = (byte) (i39 + 1);
                                        byte b6 = (byte) i39;
                                        Object[] objArr10 = new Object[1];
                                        a(b5, b6, (byte) (b6 - 1), objArr10);
                                        PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(gidForName, i38, defaultSize, -598779726, false, (String) objArr10[0], new Class[]{String.class});
                                    }
                                    Object invoke2 = ((Method) PngjBadSignature4).invoke(null, objArr9);
                                    Object[] objArr11 = new Object[1];
                                    c("\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001", false, new int[]{8, 30, 51, 20}, objArr11);
                                    Object[] objArr12 = {(String) objArr11[0]};
                                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                    if (PngjBadSignature5 == null) {
                                        char lastIndexOf = (char) (8751 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0));
                                        int combineMeasuredStates = 24 - View.combineMeasuredStates(0, 0);
                                        int i40 = (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 336;
                                        int i41 = $$b;
                                        byte b7 = (byte) (i41 + 1);
                                        byte b8 = (byte) i41;
                                        j = 0;
                                        Object[] objArr13 = new Object[1];
                                        a(b7, b8, (byte) (b8 - 1), objArr13);
                                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf, combineMeasuredStates, i40, -598779726, false, (String) objArr13[0], new Class[]{String.class});
                                    } else {
                                        j = 0;
                                    }
                                    Object invoke3 = ((Method) PngjBadSignature5).invoke(null, objArr12);
                                    if (invoke2 != null) {
                                        Object[] objArr14 = {invoke2, 42};
                                        Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                        if (PngjBadSignature6 == null) {
                                            char indexOf2 = (char) (TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 11039);
                                            int i42 = (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 30;
                                            int lastIndexOf2 = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0) + 1283;
                                            byte b9 = (byte) $$b;
                                            byte b10 = b9;
                                            Object[] objArr15 = new Object[1];
                                            a(b9, b10, (byte) (b10 + 3), objArr15);
                                            PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf2, i42, lastIndexOf2, -971849413, false, (String) objArr15[0], new Class[]{String.class, cls});
                                        }
                                        long longValue2 = ((Long) ((Method) PngjBadSignature6).invoke(null, objArr14)).longValue();
                                        long j14 = 278500993;
                                        long j15 = 764;
                                        obj3 = invoke3;
                                        long j16 = -1;
                                        long elapsedCpuTime = ((int) Process.getElapsedCpuTime()) ^ j16;
                                        long j17 = (elapsedCpuTime | j14) ^ j16;
                                        long j18 = ((j14 ^ j16) | longValue2) ^ j16;
                                        long j19 = (j15 * (j18 | (j16 ^ ((longValue2 ^ j16) | j14)) | j17)) + ((-1528) * (j18 | ((elapsedCpuTime | longValue2) ^ j16))) + ((longValue2 | j17) * j15) + ((-1527) * longValue2) + (765 * j14) + 377206707;
                                        int i43 = ((int) (j19 >> 32)) & ((((~(defpackage.a.b(1471084013) | (-1082232794))) | 99712) * 658) + (((693474722 | r3) * (-658)) - 1883517682));
                                        int i44 = ((int) j19) & ((((~((~((int) Runtime.getRuntime().freeMemory())) | 978667283)) | (-1879073603)) * 305) + ((((~(978667283 | r7)) | (-2052417364)) * 305) - 1704616964));
                                    } else {
                                        obj3 = invoke3;
                                    }
                                    if (obj3 != null) {
                                        Object[] objArr16 = {obj3, 42};
                                        Object PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                        if (PngjBadSignature7 == null) {
                                            char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 11039);
                                            int i45 = 31 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1));
                                            int indexOf3 = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0') + 1283;
                                            byte b11 = (byte) $$b;
                                            byte b12 = b11;
                                            Object[] objArr17 = new Object[1];
                                            a(b11, b12, (byte) (b12 + 3), objArr17);
                                            PngjBadSignature7 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maxKeyCode, i45, indexOf3, -971849413, false, (String) objArr17[0], new Class[]{String.class, cls});
                                        }
                                        long longValue3 = ((Long) ((Method) PngjBadSignature7).invoke(null, objArr16)).longValue();
                                        long j20 = -886718407;
                                        long j21 = ((-97) * longValue3) + (50 * j20);
                                        long j22 = -1;
                                        long j23 = longValue3 ^ j22;
                                        long j24 = i;
                                        long j25 = j24 ^ j22;
                                        long j26 = (49 * (((j23 | j24) ^ j22) | ((j20 | longValue3) ^ j22))) + ((-49) * (j23 | (((j20 ^ j22) | j25) ^ j22) | ((j20 | j24) ^ j22))) + (98 * (((j23 | j25) ^ j22) | ((j23 | j20) ^ j22))) + j21 + 1542426107;
                                        int i46 = ~i;
                                    }
                                    if (invoke2 != null) {
                                        Object[] objArr18 = {invoke2, 42};
                                        Object PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                        if (PngjBadSignature8 == null) {
                                            char c6 = (char) (11040 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)));
                                            int deadChar = KeyEvent.getDeadChar(0, 0) + 31;
                                            int indexOf4 = 1281 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0);
                                            byte b13 = (byte) $$b;
                                            byte b14 = b13;
                                            Object[] objArr19 = new Object[1];
                                            a(b13, b14, (byte) (b14 + 3), objArr19);
                                            PngjBadSignature8 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c6, deadChar, indexOf4, -971849413, false, (String) objArr19[0], new Class[]{String.class, cls});
                                        }
                                        long longValue4 = ((Long) ((Method) PngjBadSignature8).invoke(null, objArr18)).longValue();
                                        long j27 = 421828575;
                                        long j28 = -1;
                                        long j29 = j27 ^ j28;
                                        cls2 = cls;
                                        long j30 = ((i ^ j28) | j27) ^ j28;
                                        long j31 = ((-374) * (((j29 | longValue4) ^ j28) | j30)) + ((-747) * longValue4) + (375 * j27);
                                        long j32 = longValue4 ^ j28;
                                        long j33 = (374 * (j30 | ((j29 | j32) ^ j28))) + (748 * ((j32 | j27) ^ j28)) + j31 + 233879125;
                                        int i47 = ~i;
                                        int c7 = ((int) (j33 >> 32)) & defpackage.a.c(i47 | (-354815130), -828, (((~((-354815130) | i47)) | 1792041540) * (-828)) + 1754752898, 1729150684);
                                        int b15 = defpackage.a.b(99000296);
                                    } else {
                                        cls2 = cls;
                                    }
                                    if (obj3 != null) {
                                        int i48 = PngjUnsupportedException;
                                        valueOf = ((i48 ^ 53) + ((i48 & 53) << 1)) % Uuid.SIZE_BITS;
                                        Object[] objArr20 = {obj3, 42};
                                        Object PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                        if (PngjBadSignature9 == null) {
                                            char maxKeyCode2 = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 11039);
                                            int edgeSlop = 31 - (ViewConfiguration.getEdgeSlop() >> 16);
                                            int indexOf5 = 1282 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                                            byte b16 = (byte) $$b;
                                            byte b17 = b16;
                                            Object[] objArr21 = new Object[1];
                                            a(b16, b17, (byte) (b17 + 3), objArr21);
                                            PngjBadSignature9 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maxKeyCode2, edgeSlop, indexOf5, -971849413, false, (String) objArr21[0], new Class[]{String.class, cls2});
                                        }
                                        long longValue5 = ((Long) ((Method) PngjBadSignature9).invoke(null, objArr20)).longValue();
                                        long j34 = -1629498;
                                        long j35 = 829;
                                        long j36 = -828;
                                        long j37 = -1;
                                        long elapsedCpuTime2 = ((int) Process.getElapsedCpuTime()) ^ j37;
                                        long j38 = (((((j34 ^ j37) | (longValue5 ^ j37)) ^ j37) | (((elapsedCpuTime2 | j34) | longValue5) ^ j37)) * j36) + (j35 * longValue5) + (j35 * j34);
                                        long j39 = j34 | longValue5;
                                        long j40 = (828 * (j39 ^ j37)) + (j36 * (elapsedCpuTime2 | j39)) + j38 + 657337198;
                                        int i49 = ~(1093457360 | i);
                                        int i50 = ((i49 | (~(1764283524 | i))) * 140) + ((671088644 | i49) * (-280)) + 863608858;
                                        int i51 = ~(1764546004 | i);
                                        int i52 = ~i;
                                        int i53 = ((int) (j40 >> 32)) & (((i51 | (~((-671088645) | i52)) | (~(i52 | (-262481)))) * 140) + i50);
                                        int myTid2 = Process.myTid();
                                        int i54 = (~((-31879439) | myTid2)) | 6697222;
                                        int i55 = ~((~myTid2) | (-1443923633));
                                        int i56 = ((int) j40) & ((((~(myTid2 | (-25182217))) | i55) * 470) + ((i54 | i55) * (-470)) + 1710467929);
                                    }
                                }
                            }
                        } else {
                            cls2 = cls;
                            j = 0;
                        }
                        f = 0.0f;
                        boolean z5 = false;
                        if (z5) {
                            int i57 = valueOf;
                            PngjUnsupportedException = ((i57 ^ 109) + ((i57 & 109) << 1)) % Uuid.SIZE_BITS;
                            Object[] objArr22 = {new int[]{(i & (-261)) | (r7 & 260)}, new int[]{((~r1) & r2) | ((~r2) & r1)}, null, new int[]{i}};
                            int i58 = ~i;
                            int i59 = (((~(i | 623641961)) | (~(410924012 | i58))) * 627) + (((~((-410924013) | i)) | 623641961) * (-627)) + (((-620758018) | i) * (-627)) + 1167369348;
                            int i60 = -(-((i59 & 16) + (i59 | 16)));
                            int i61 = ((i60 | 1767253028) << 1) - (i60 ^ 1767253028);
                            int i62 = (i61 << 13) ^ i61;
                            int i63 = i62 >>> 17;
                            int i64 = ((~i62) & i63) | ((~i63) & i62);
                            int i65 = i64 << 5;
                            return objArr22;
                        }
                        int i66 = -(-ImageFormat.getBitsPerPixel(0));
                        int i67 = ((i66 | 9) << 1) - (i66 ^ 9);
                        Object[] objArr23 = new Object[1];
                        b(new int[]{-1298499171, -262344200, -433208651, -34194107}, i67, objArr23);
                        String str3 = (String) objArr23[0];
                        Object[] objArr24 = new Object[1];
                        b(new int[]{386860654, -164675631, -1170321576, 598828299}, (-16777210) - Color.rgb(0, 0, 0), objArr24);
                        String str4 = (String) objArr24[0];
                        int i68 = -(-TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0));
                        int i69 = (i68 & 7) + (i68 | 7);
                        Object[] objArr25 = new Object[1];
                        b(new int[]{1426396024, 667331250, -1334836367, 364839981}, i69, objArr25);
                        String str5 = (String) objArr25[0];
                        int i70 = -TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                        int i71 = ((i70 | 9) << 1) - (i70 ^ 9);
                        Object[] objArr26 = new Object[1];
                        b(new int[]{1728683228, 1858459638, 1987817824, 203472218, 644161285, -670303662}, i71, objArr26);
                        String str6 = (String) objArr26[0];
                        Object[] objArr27 = new Object[1];
                        b(new int[]{-345120443, 1310225791, -1913893655, 494966776}, 5 - (~View.MeasureSpec.makeMeasureSpec(0, 0)), objArr27);
                        String str7 = (String) objArr27[0];
                        Object[] objArr28 = new Object[1];
                        c("\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001", false, new int[]{80, 13, 0, 0}, objArr28);
                        String str8 = (String) objArr28[0];
                        Object[] objArr29 = new Object[1];
                        b(new int[]{989170534, -112865585, 978285922, 1605465284}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 5, objArr29);
                        String str9 = (String) objArr29[0];
                        int i72 = -(CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i73 = (i72 ^ 6) + ((i72 & 6) << 1);
                        Object[] objArr30 = new Object[1];
                        b(new int[]{-319495809, 1171257733, 428706855, -1648957991}, i73, objArr30);
                        String str10 = (String) objArr30[0];
                        Object[] objArr31 = new Object[1];
                        c("\u0001\u0000", false, new int[]{93, 2, 0, 0}, objArr31);
                        String str11 = (String) objArr31[0];
                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0);
                        int i74 = (bitsPerPixel2 & 17) + (bitsPerPixel2 | 17);
                        Object[] objArr32 = new Object[1];
                        b(new int[]{55465818, -438796860, 1902656567, 2027975244, -15330221, -904888555, 1451085860, 1597202692}, i74, objArr32);
                        String str12 = (String) objArr32[0];
                        int i75 = -View.MeasureSpec.getMode(0);
                        int i76 = ~i75;
                        int i77 = ~i;
                        int i78 = ~(((-11) ^ i77) | ((-11) & i77));
                        int i79 = (i78 & i76) | (i76 ^ i78);
                        int i80 = ~(i | 10);
                        int i81 = (((i79 & i80) | (i79 ^ i80)) * (-564)) + (i75 * (-563)) + 5650;
                        int i82 = ~i75;
                        int i83 = (i82 & 10) | (i82 ^ 10);
                        int i84 = -(-((~((i83 & i) | (i83 ^ i))) * 1128));
                        int i85 = (i81 ^ i84) + ((i84 & i81) << 1);
                        int i86 = ~((i76 ^ i77) | (i76 & i77));
                        int i87 = ~((i75 & 10) | (i75 ^ 10));
                        int i88 = (i85 - (~(-(-(((i87 & i86) | (i86 ^ i87)) * 564))))) - 1;
                        Object[] objArr33 = new Object[1];
                        b(new int[]{-113073251, 1354489271, 2023316912, 781693294, 117361175, 44947232}, i88, objArr33);
                        String str13 = (String) objArr33[0];
                        int i89 = -(-KeyEvent.getDeadChar(0, 0));
                        int i90 = (i89 & 8) + (i89 | 8);
                        Object[] objArr34 = new Object[1];
                        b(new int[]{-1183367069, -299483683, 1592287366, 941945075}, i90, objArr34);
                        String str14 = (String) objArr34[0];
                        Object[] objArr35 = new Object[1];
                        c("\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", false, new int[]{95, 12, 0, 3}, objArr35);
                        String str15 = (String) objArr35[0];
                        Object[] objArr36 = new Object[1];
                        c("\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", false, new int[]{107, 14, 14, 10}, objArr36);
                        String str16 = (String) objArr36[0];
                        int i91 = -TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0);
                        int i92 = (i91 * 477) - 3325;
                        int i93 = ~i91;
                        int i94 = ((-8) ^ i91) | ((-8) & i91);
                        int i95 = (i94 & i) | (i94 ^ i);
                        int i96 = -(-(((~((i93 & 7) | (i93 ^ 7))) | (~i95)) * (-476)));
                        int i97 = ((~i95) * 952) + (i92 ^ i96) + ((i92 & i96) << 1);
                        int i98 = ~i;
                        int i99 = (-8) | i98;
                        int i100 = (~((i91 & i99) | (i99 ^ i91))) * 476;
                        int i101 = (i97 ^ i100) + ((i100 & i97) << 1);
                        Object[] objArr37 = new Object[1];
                        b(new int[]{-886271006, -740905288, 2015922664, 2105677119}, i101, objArr37);
                        String str17 = (String) objArr37[0];
                        int i102 = -(-(ViewConfiguration.getScrollBarSize() >> 8));
                        int i103 = (i102 ^ 7) + ((i102 & 7) << 1);
                        Object[] objArr38 = new Object[1];
                        b(new int[]{-643347582, -564356850, 2144492944, 1828601475}, i103, objArr38);
                        String str18 = (String) objArr38[0];
                        int red = Color.red(0);
                        int i104 = (red ^ 7) + ((red & 7) << 1);
                        Object[] objArr39 = new Object[1];
                        b(new int[]{1658136280, 423860549, 604890937, 1251933018}, i104, objArr39);
                        String str19 = (String) objArr39[0];
                        int i105 = -(ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                        int i106 = ((i105 | 3) << 1) - (i105 ^ 3);
                        Object[] objArr40 = new Object[1];
                        b(new int[]{-394219199, -1957984167}, i106, objArr40);
                        String str20 = (String) objArr40[0];
                        Object[] objArr41 = new Object[1];
                        c("\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", false, new int[]{121, 20, ModuleDescriptor.MODULE_VERSION, 16}, objArr41);
                        String str21 = (String) objArr41[0];
                        Object[] objArr42 = new Object[1];
                        b(new int[]{1096483119, -1967120631, -1511995453, 573001312}, 5 - (~(-(-TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0)))), objArr42);
                        String str22 = (String) objArr42[0];
                        int i107 = -((Process.getThreadPriority(0) + 20) >> 6);
                        int i108 = ((i107 | 2) << 1) - (i107 ^ 2);
                        Object[] objArr43 = new Object[1];
                        b(new int[]{-1258214818, -980540095}, i108, objArr43);
                        String str23 = (String) objArr43[0];
                        int i109 = -View.MeasureSpec.makeMeasureSpec(0, 0);
                        int i110 = (i109 & 16) + (i109 | 16);
                        Object[] objArr44 = new Object[1];
                        b(new int[]{1377917456, -451835634, -1102136358, -818523890, 1264189211, 1830467496, 718723342, 706825032}, i110, objArr44);
                        String str24 = (String) objArr44[0];
                        Object[] objArr45 = new Object[1];
                        b(new int[]{1361170791, -1092332040, -1687034519, -1068484867, -1380510995, -1071084852}, 7 - (~(-TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0))), objArr45);
                        String str25 = (String) objArr45[0];
                        Object[] objArr46 = new Object[1];
                        c("\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000", false, new int[]{141, 10, 0, 1}, objArr46);
                        String str26 = (String) objArr46[0];
                        int i111 = -(KeyEvent.getMaxKeyCode() >> 16);
                        int i112 = (i111 ^ 11) + ((i111 & 11) << 1);
                        Object[] objArr47 = new Object[1];
                        b(new int[]{1361170791, -1092332040, -491300487, 1070548375, -1973535064, 817358216}, i112, objArr47);
                        String str27 = (String) objArr47[0];
                        int i113 = -(-ImageFormat.getBitsPerPixel(0));
                        int i114 = (i113 & 12) + (i113 | 12);
                        Object[] objArr48 = new Object[1];
                        b(new int[]{-263049436, 22335265, 1147191047, 59957087, 1678629748, 213889980}, i114, objArr48);
                        String str28 = (String) objArr48[0];
                        int i115 = -TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0');
                        int i116 = (i115 ^ 14) + ((i115 & 14) << 1);
                        Object[] objArr49 = new Object[1];
                        b(new int[]{-263049436, 22335265, 1172564383, -392032016, 501106477, -1605573517, 1678629748, 213889980}, i116, objArr49);
                        String str29 = (String) objArr49[0];
                        Object[] objArr50 = new Object[1];
                        c("\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001", true, new int[]{151, 14, 31, 0}, objArr50);
                        String[] strArr4 = {str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, (String) objArr50[0]};
                        int combineMeasuredStates2 = View.combineMeasuredStates(0, 0);
                        int i117 = ((combineMeasuredStates2 | 11) << 1) - (combineMeasuredStates2 ^ 11);
                        Object[] objArr51 = new Object[1];
                        b(new int[]{1759662452, 20541450, 2126853317, -1556520981, -1651938268, 805825169}, i117, objArr51);
                        Object[] objArr52 = {(String) objArr51[0]};
                        Object PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                        if (PngjBadSignature10 == null) {
                            char edgeSlop2 = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 8752);
                            int resolveSizeAndState = 24 - View.resolveSizeAndState(0, 0, 0);
                            int i118 = 335 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1));
                            int i119 = $$b;
                            byte b18 = (byte) (i119 + 1);
                            byte b19 = (byte) i119;
                            i4 = 1767253028;
                            Object[] objArr53 = new Object[1];
                            a(b18, b19, (byte) (b19 - 1), objArr53);
                            PngjBadSignature10 = com.d.e.a.PngjBadCrcException.PngjBadSignature(edgeSlop2, resolveSizeAndState, i118, -598779726, false, (String) objArr53[0], new Class[]{String.class});
                        } else {
                            i4 = 1767253028;
                        }
                        Object invoke4 = ((Method) PngjBadSignature10).invoke(null, objArr52);
                        if (invoke4 != null) {
                            int packedPositionChild = ExpandableListView.getPackedPositionChild(j);
                            int i120 = (packedPositionChild * (-183)) + 1295;
                            int i121 = ~packedPositionChild;
                            int i122 = -(-(((i121 & 7) | (i121 ^ 7)) * (-368)));
                            int i123 = ((i120 | i122) << 1) - (i120 ^ i122);
                            int i124 = (packedPositionChild ^ (-8)) | (packedPositionChild & (-8));
                            int i125 = -(-(((i124 & i77) | (i124 ^ i77)) * 184));
                            int i126 = ((i123 | i125) << 1) - (i125 ^ i123);
                            int i127 = ~packedPositionChild;
                            int i128 = ~((i127 & (-8)) | (i127 ^ (-8)));
                            int i129 = ~((i98 ^ packedPositionChild) | (i98 & packedPositionChild));
                            int i130 = ((~((packedPositionChild & 7) | (packedPositionChild ^ 7))) | (i128 & i129) | (i128 ^ i129)) * 184;
                            int i131 = (i126 ^ i130) + ((i130 & i126) << 1);
                            Object[] objArr54 = new Object[1];
                            b(new int[]{1276094290, -1619542164, -1113266789, 198456564}, i131, objArr54);
                            String str30 = (String) objArr54[0];
                            Object[] objArr55 = new Object[1];
                            c("\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001", false, new int[]{0, 8, 22, 0}, objArr55);
                            Object[] objArr56 = {invoke4, new String[]{str30, (String) objArr55[0]}};
                            Object PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                            if (PngjBadSignature11 == null) {
                                float f2 = f;
                                char c8 = (char) ((PointF.length(f2, f2) > f2 ? 1 : (PointF.length(f2, f2) == f2 ? 0 : -1)) + 26716);
                                int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 34;
                                int resolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 1668;
                                int i132 = $$b;
                                byte b20 = (byte) (i132 + 1);
                                byte b21 = (byte) i132;
                                Object[] objArr57 = new Object[1];
                                a(b20, b21, (byte) (b21 - 1), objArr57);
                                PngjBadSignature11 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c8, bitsPerPixel3, resolveSizeAndState2, 396011464, false, (String) objArr57[0], new Class[]{String.class, String[].class});
                            }
                            long longValue6 = ((Long) ((Method) PngjBadSignature11).invoke(null, objArr56)).longValue();
                            long j41 = -365209042;
                            long j42 = ((-613) * longValue6) + (615 * j41);
                            long j43 = 614;
                            long myUid = Process.myUid();
                            long j44 = -1;
                            long j45 = j41 ^ j44;
                            long j46 = (j45 | longValue6) ^ j44;
                            long j47 = longValue6 ^ j44;
                            long j48 = myUid ^ j44;
                            long j49 = ((j43 * ((((j45 | j47) | j48) ^ j44) | (((j48 | j41) | longValue6) ^ j44))) + (((-1228) * ((((j45 | j48) ^ j44) | j46) | ((j48 | longValue6) ^ j44))) + ((((myUid | j46) | ((j47 | j41) ^ j44)) * j43) + j42))) - 1321383179;
                            int i133 = ((int) (j49 >> 32)) & ((((~(1752427474 | i)) | 315201063) * 529) + (((~(i77 | 1752427474)) | 310907941) * 529) + 1520786966);
                            int i134 = ((int) j49) & ((((~((-812040279) | i)) | (~((-8399265) | i77)) | (~(2045700607 | i))) * 192) + (((~((-820439543) | i77)) | 812040278) * (-384)) + ((1225261065 | i77) * (-192)) + 1788176917);
                            if (((i133 & i134) | (i133 ^ i134)) != 0) {
                                int i135 = -(AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                int i136 = (i135 & 24) + (i135 | 24);
                                Object[] objArr58 = new Object[1];
                                b(new int[]{-337455723, 1171731284, 932404556, 254140698, -1777619928, 915796467, 745921551, -1756078516, -51602247, 1110896796, 61853916, 192622110}, i136, objArr58);
                                Object[] objArr59 = {(String) objArr58[0]};
                                Object PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                if (PngjBadSignature12 == null) {
                                    char defaultSize2 = (char) (View.getDefaultSize(0, 0) + 8752);
                                    int i137 = (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 23;
                                    int indexOf6 = 336 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR);
                                    int i138 = $$b;
                                    byte b22 = (byte) (i138 + 1);
                                    byte b23 = (byte) i138;
                                    Object[] objArr60 = new Object[1];
                                    a(b22, b23, (byte) (b23 - 1), objArr60);
                                    PngjBadSignature12 = com.d.e.a.PngjBadCrcException.PngjBadSignature(defaultSize2, i137, indexOf6, -598779726, false, (String) objArr60[0], new Class[]{String.class});
                                }
                                Object invoke5 = ((Method) PngjBadSignature12).invoke(null, objArr59);
                                Object[] objArr61 = new Object[1];
                                c("\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001", false, new int[]{8, 30, 51, 20}, objArr61);
                                Object[] objArr62 = {(String) objArr61[0]};
                                Object PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                if (PngjBadSignature13 == null) {
                                    char lastIndexOf3 = (char) (8751 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0));
                                    int i139 = 24 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1));
                                    int keyRepeatDelay = 336 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                    int i140 = $$b;
                                    byte b24 = (byte) (i140 + 1);
                                    byte b25 = (byte) i140;
                                    Object[] objArr63 = new Object[1];
                                    a(b24, b25, (byte) (b25 - 1), objArr63);
                                    PngjBadSignature13 = com.d.e.a.PngjBadCrcException.PngjBadSignature(lastIndexOf3, i139, keyRepeatDelay, -598779726, false, (String) objArr63[0], new Class[]{String.class});
                                }
                                Object invoke6 = ((Method) PngjBadSignature13).invoke(null, objArr62);
                                if (!(invoke5 == null)) {
                                    Object[] objArr64 = {invoke5, 42};
                                    Object PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                    if (PngjBadSignature14 == null) {
                                        char c9 = (char) (11040 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)));
                                        int size = 31 - View.MeasureSpec.getSize(0);
                                        int keyCodeFromString = KeyEvent.keyCodeFromString(BuildConfig.FLAVOR) + 1282;
                                        byte b26 = (byte) $$b;
                                        byte b27 = b26;
                                        Object[] objArr65 = new Object[1];
                                        a(b26, b27, (byte) (b27 + 3), objArr65);
                                        PngjBadSignature14 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c9, size, keyCodeFromString, -971849413, false, (String) objArr65[0], new Class[]{String.class, cls2});
                                    }
                                    long longValue7 = ((Long) ((Method) PngjBadSignature14).invoke(null, objArr64)).longValue();
                                    long j50 = -1225528399;
                                    obj2 = invoke6;
                                    long j51 = 503;
                                    long j52 = (j51 * longValue7) + (j51 * j50);
                                    long j53 = -502;
                                    long j54 = j50 | longValue7;
                                    long j55 = (j53 * j54) + j52;
                                    long j56 = j50 ^ j44;
                                    long j57 = (j56 | (longValue7 ^ j44)) ^ j44;
                                    long j58 = i;
                                    long j59 = j56 | (j58 ^ j44);
                                    long j60 = j57 | (j59 ^ j44);
                                    long j61 = (j54 | j58) ^ j44;
                                    long j62 = (502 * (((j59 | longValue7) ^ j44) | j61)) + ((j60 | j61) * j53) + j55 + 1881236099;
                                    Runtime.getRuntime().totalMemory();
                                    int i141 = ((int) (j62 >> 32)) & 1437226410;
                                    int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
                                    int i142 = ((int) j62) & ((((~(startElapsedRealtime | (-962178458))) | (-1895562429)) * 502) + ((~((~startElapsedRealtime) | (-1084379173))) * (-502)) + ((((~((-1895562429) | startElapsedRealtime)) | (-2046557630)) * (-502)) - 1029908233));
                                } else {
                                    obj2 = invoke6;
                                }
                                if (obj2 != null) {
                                    Object[] objArr66 = {obj2, 42};
                                    Object PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(989703296);
                                    if (PngjBadSignature15 == null) {
                                        char packedPositionChild2 = (char) (ExpandableListView.getPackedPositionChild(j) + 11040);
                                        int green = 31 - Color.green(0);
                                        int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 1282;
                                        byte b28 = (byte) $$b;
                                        byte b29 = b28;
                                        Object[] objArr67 = new Object[1];
                                        a(b28, b29, (byte) (b29 + 3), objArr67);
                                        PngjBadSignature15 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionChild2, green, scrollBarSize2, -971849413, false, (String) objArr67[0], new Class[]{String.class, cls2});
                                    }
                                    long longValue8 = ((Long) ((Method) PngjBadSignature15).invoke(null, objArr66)).longValue();
                                    long j63 = -455999715;
                                    long j64 = -964;
                                    long j65 = (965 * longValue8) + ((-963) * j63) + j64;
                                    long j66 = j63 ^ j44;
                                    long j67 = longValue8 ^ j44;
                                    long j68 = (int) Runtime.getRuntime().totalMemory();
                                    long j69 = (j64 * (((j67 | (j68 ^ j44)) ^ j44) | ((j67 | j63) ^ j44))) + ((j66 | ((j67 | j68) ^ j44)) * j64) + j65 + 1111707415;
                                    int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                    int i143 = ~startUptimeMillis;
                                }
                            }
                        }
                        int i144 = i98;
                        boolean z6 = false;
                        if (z6) {
                            Object[] objArr68 = {new int[]{(i & (-262)) | (i77 & 261)}, new int[]{((~r1) & r2) | ((~r2) & r1)}, null, new int[]{i}};
                            int c10 = defpackage.a.c((~(i | (-337740740))) | (~((-696825235) | i77)) | (-1034532820), -370, (((~((-337740740) | i77)) | (~((-696825235) | i))) * (-370)) + 1571886639, -525054056);
                            int i145 = (((c10 | 16) << 1) - (c10 ^ 16)) + i4;
                            int i146 = i145 << 13;
                            int i147 = (i146 & (~i145)) | ((~i146) & i145);
                            int i148 = i147 >>> 17;
                            int i149 = ((~i147) & i148) | ((~i148) & i147);
                            int i150 = i149 << 5;
                            return objArr68;
                        }
                        Object[] objArr69 = new Object[1];
                        b(new int[]{1481079821, -1204985403, 1345841168, -1615480707, 782110662, -232094084, -1792772283, -688477931, 110820302, 970404063, -1854503546, -1256116197}, 22 - (~(-Color.argb(0, 0, 0, 0))), objArr69);
                        Object[] objArr70 = {(String) objArr69[0]};
                        Object PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                        if (PngjBadSignature16 == null) {
                            char packedPositionType = (char) (29467 - ExpandableListView.getPackedPositionType(j));
                            int absoluteGravity = 39 - Gravity.getAbsoluteGravity(0, 0);
                            int maximumFlingVelocity = 432 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int i151 = $$b;
                            byte b30 = (byte) (i151 + 1);
                            byte b31 = (byte) i151;
                            Object[] objArr71 = new Object[1];
                            a(b30, b31, (byte) (b31 - 1), objArr71);
                            PngjBadSignature16 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionType, absoluteGravity, maximumFlingVelocity, 886713584, false, (String) objArr71[0], new Class[]{String.class});
                        }
                        long longValue9 = ((Long) ((Method) PngjBadSignature16).invoke(null, objArr70)).longValue();
                        long j70 = -796998690;
                        long j71 = -209;
                        long j72 = (j71 * longValue9) + (j71 * j70);
                        long j73 = 210;
                        long j74 = -1;
                        long j75 = j70 ^ j74;
                        long j76 = longValue9 ^ j74;
                        long j77 = (((j75 | j76) ^ j74) * j73) + j72;
                        long j78 = i;
                        long j79 = j78 ^ j74;
                        long j80 = ((j73 * ((((j75 | j79) | longValue9) ^ j74) | (((j76 | j70) | j78) ^ j74))) + (((((j76 | j79) ^ j74) | ((j75 | j78) ^ j74)) * j73) + j77)) - 351713958;
                        int i152 = (int) Runtime.getRuntime().totalMemory();
                        int i153 = ((int) (j80 >> 32)) & (((~(i152 | 2010343732)) * 283) + (((~(915628320 | i152)) | 1094715412) * (-283)) + 2004042694);
                        int i154 = ((int) j80) & ((((~((~((int) Runtime.getRuntime().totalMemory())) | (-576869548))) | (-287986774)) * 494) + ((((-2249730) | r5) * 494) - 905680329));
                        long j81 = (i153 & i154) | (i153 ^ i154);
                        Object[] objArr72 = new Object[1];
                        c("\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000", true, new int[]{165, 17, 0, 4}, objArr72);
                        Object[] objArr73 = {(String) objArr72[0]};
                        Object PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                        if (PngjBadSignature17 == null) {
                            char c11 = (char) (29466 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1)));
                            int defaultSize3 = 39 - View.getDefaultSize(0, 0);
                            int offsetAfter = TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 432;
                            int i155 = $$b;
                            j2 = j74;
                            byte b32 = (byte) (i155 + 1);
                            byte b33 = (byte) i155;
                            j3 = j81;
                            Object[] objArr74 = new Object[1];
                            a(b32, b33, (byte) (b33 - 1), objArr74);
                            PngjBadSignature17 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c11, defaultSize3, offsetAfter, 886713584, false, (String) objArr74[0], new Class[]{String.class});
                        } else {
                            j2 = j74;
                            j3 = j81;
                        }
                        long longValue10 = ((Long) ((Method) PngjBadSignature17).invoke(null, objArr73)).longValue();
                        long j82 = 594927994;
                        long j83 = ((-864) * longValue10) + (866 * j82);
                        long j84 = longValue10 ^ j2;
                        long startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                        long j85 = startUptimeMillis2 ^ j2;
                        long j86 = ((-865) * (j84 | (((j82 ^ j2) | j85) ^ j2))) + j83;
                        long j87 = 865;
                        long j88 = ((j87 * (((j85 | j82) ^ j2) | ((j84 | j85) ^ j2))) + ((((j82 | startUptimeMillis2) ^ j2) * j87) + j86)) - 1743640642;
                        int c12 = ((int) (j88 >> 32)) & defpackage.a.c((~((~defpackage.a.a()) | (-537214987))) | (-2112879552), 576, (((~((-2043660475) | r4)) | 1506445488) * 576) - 1771464918, 129207296);
                        int a = defpackage.a.a();
                        int i156 = ((1845052852 | a) * (-50)) + 1526308875;
                        int i157 = ~((-743982241) | a);
                        int i158 = ~a;
                        long j89 = c12 | (((int) j88) & ((((~(i158 | 1845052852)) | (~((-1012688034) | i158)) | 268705793) * 50) + ((i157 | (~((-268705794) | i158))) * 50) + i156));
                        if (j3 > j && j89 > j) {
                            int i159 = PngjUnsupportedException;
                            int i160 = ((i159 | 99) << 1) - (i159 ^ 99);
                            valueOf = i160 % Uuid.SIZE_BITS;
                            if (i160 % 2 != 0) {
                            }
                            if (!z) {
                                Object[] objArr75 = {new int[]{(i & (-248)) | (i77 & 247)}, new int[1], null, new int[]{i}};
                                int i161 = (((~(i | (-352629002))) | (~((-672791) | i77)) | (~((-680591393) | i))) * 920) + (((~((-681264183) | i77)) | 672790) * 920) + ((((~((-672791) | i)) | (~((-352629002) | i77))) * 920) - 1578356771);
                                int values2 = com.identy.a.PngjException.values();
                                int i162 = i161 * (-751);
                                int i163 = ((-12016) & i162) + (i162 | (-12016));
                                int i164 = ~i161;
                                int i165 = ~((i164 & (-17)) | ((-17) ^ i164));
                                int i166 = ~((-17) | values2);
                                int i167 = (((i165 & i166) | (i165 ^ i166)) * 1504) + i163;
                                int i168 = ((-17) & i161) | ((-17) ^ i161);
                                int i169 = ((~((values2 & i168) | (i168 ^ values2))) * (-1504)) + i167;
                                int i170 = ~((-17) | i161);
                                int i171 = ~i161;
                                int i172 = -(-(((~((i171 & 16) | (i171 ^ 16))) | i170) * 752));
                                int i173 = -(-((i169 & i172) + (i172 | i169)));
                                int i174 = ((i173 | i4) << 1) - (i173 ^ i4);
                                int i175 = i174 << 13;
                                int i176 = (i175 | i174) & (~(i174 & i175));
                                int i177 = i176 >>> 17;
                                int i178 = (i176 | i177) & (~(i176 & i177));
                                int i179 = i178 << 5;
                                ((int[]) objArr75[1])[0] = ((~i178) & i179) | ((~i179) & i178);
                                return objArr75;
                            }
                            int i180 = -(TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                            int i181 = ((i180 | 23) << 1) - (i180 ^ 23);
                            Object[] objArr76 = new Object[1];
                            b(new int[]{1481079821, -1204985403, 1345841168, -1615480707, 782110662, -232094084, -1792772283, -688477931, 110820302, 970404063, -1854503546, -1256116197}, i181, objArr76);
                            Object[] objArr77 = {(String) objArr76[0]};
                            Object PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                            if (PngjBadSignature18 == null) {
                                char mirror = (char) (29515 - AndroidCharacter.getMirror('0'));
                                int indexOf7 = 39 - TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0);
                                int longPressTimeout = 432 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                int i182 = $$b;
                                byte b34 = (byte) (i182 + 1);
                                byte b35 = (byte) i182;
                                Object[] objArr78 = new Object[1];
                                a(b34, b35, (byte) (b35 - 1), objArr78);
                                PngjBadSignature18 = com.d.e.a.PngjBadCrcException.PngjBadSignature(mirror, indexOf7, longPressTimeout, 886713584, false, (String) objArr78[0], new Class[]{String.class});
                            }
                            long longValue11 = ((Long) ((Method) PngjBadSignature18).invoke(null, objArr77)).longValue();
                            long j90 = -441060515;
                            long j91 = 51;
                            long j92 = -49;
                            long j93 = j92 * longValue11;
                            long j94 = -50;
                            long j95 = (j90 | j78) * j94;
                            long j96 = 50;
                            long j97 = longValue11 ^ j2;
                            long j98 = j97 | j79;
                            long j99 = (((((j98 ^ j2) | ((j97 | j90) ^ j2)) | ((j79 | j90) ^ j2)) * j96) + (((((((j90 ^ j2) | j97) | j78) ^ j2) | ((j98 | j90) ^ j2)) * j96) + (j95 + (j93 + (j91 * j90))))) - 707652133;
                            int c13 = ((int) (j99 >> 32)) & defpackage.a.c(~(2145124351 | i), -1504, (((~(366569780 | i)) | 1778554571) * 1504) - 1320242614, -718947648);
                            int i183 = (-2032561565) | i77;
                            int i184 = ((int) j99) & ((((~i183) | 39326306) * 495) + (i183 * 495) + 571089094);
                            long j100 = (c13 & i184) | (c13 ^ i184);
                            Object[] objArr79 = new Object[1];
                            c("\u0001\u0001\u0001\u0001", false, new int[]{182, 4, 49, 1}, objArr79);
                            Object[] objArr80 = {(String) objArr79[0]};
                            Object PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-936033973);
                            if (PngjBadSignature19 == null) {
                                char indexOf8 = (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 29468);
                                int resolveSizeAndState3 = 39 - View.resolveSizeAndState(0, 0, 0);
                                int i185 = (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) + 431;
                                int i186 = $$b;
                                j4 = j100;
                                byte b36 = (byte) (i186 + 1);
                                byte b37 = (byte) i186;
                                Object[] objArr81 = new Object[1];
                                a(b36, b37, (byte) (b37 - 1), objArr81);
                                PngjBadSignature19 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf8, resolveSizeAndState3, i185, 886713584, false, (String) objArr81[0], new Class[]{String.class});
                            } else {
                                j4 = j100;
                            }
                            long longValue12 = ((Long) ((Method) PngjBadSignature19).invoke(null, objArr80)).longValue();
                            long j101 = 49666747;
                            long j102 = ((-282) * longValue12) + (284 * j101);
                            long j103 = j101 ^ j2;
                            long j104 = (j103 | longValue12) ^ j2;
                            long maxMemory = (int) Runtime.getRuntime().maxMemory();
                            long j105 = ((j104 | ((j103 | maxMemory) ^ j2)) * (-283)) + j102;
                            long j106 = 283;
                            long j107 = longValue12 ^ j2;
                            long j108 = ((j106 * (((j103 | j107) | maxMemory) ^ j2)) + ((((j107 | j101) ^ j2) * j106) + j105)) - 1198379395;
                            int i187 = ((int) (j108 >> 32)) & ((((~(567055525 | i)) | (-870170886)) * 529) + (((~(i77 | 567055525)) | (-870176166)) * 529) + 1520786966);
                            int i188 = ((int) j108) & ((((~((-904753249) | i77)) | (-1073608042)) * 374) + (((168854793 | r3) * (-374)) - 612594089));
                            long j109 = (i187 & i188) | (i187 ^ i188);
                            if (j4 > j) {
                                int i189 = valueOf;
                                int i190 = i189 + 43;
                                PngjUnsupportedException = i190 % Uuid.SIZE_BITS;
                                if (i190 % 2 == 0) {
                                }
                                if (!z2) {
                                    com.identy.a.PngjException.values();
                                    Object[] objArr82 = {new int[]{r4}, new int[1], null, new int[]{i}};
                                    int i191 = (~(i & 248)) & (i | 248);
                                    int myUid2 = Process.myUid();
                                    int i192 = ~myUid2;
                                    int i193 = ~((-402426002) | i192);
                                    int i194 = (((~(myUid2 | (-402426002))) | (~(i192 | 402426001))) * 575) + (((~((-632139973) | myUid2)) | (~(632139972 | i192))) * (-575)) + (((i193 | r5) * 1150) - 1135381654);
                                    int i195 = 1767253027 - (~((i194 & 16) + (i194 | 16)));
                                    int i196 = i195 << 13;
                                    int i197 = (i196 | i195) & (~(i195 & i196));
                                    int i198 = i197 ^ (i197 >>> 17);
                                    int i199 = i198 << 5;
                                    ((int[]) objArr82[1])[0] = ((~i198) & i199) | ((~i199) & i198);
                                    return objArr82;
                                }
                                int i200 = -(-(ViewConfiguration.getDoubleTapTimeout() >> 16));
                                Object[] objArr83 = new Object[1];
                                b(new int[]{1481079821, -1204985403, 1124455228, 1855077807}, (i200 & 7) + (i200 | 7), objArr83);
                                String str31 = (String) objArr83[0];
                                int i201 = -(Process.myTid() >> 22);
                                Object[] objArr84 = new Object[1];
                                b(new int[]{1481079821, -1204985403, 1573751675, 1163940359, 1325965680, 2003912281}, (i201 & 11) + (i201 | 11), objArr84);
                                String str32 = (String) objArr84[0];
                                Object[] objArr85 = new Object[1];
                                b(new int[]{1481079821, -1204985403, 1573751675, 1163940359, -1005318649, 740149804}, 11 - (~(-Color.blue(0))), objArr85);
                                String str33 = (String) objArr85[0];
                                Object[] objArr86 = new Object[1];
                                c("\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000", true, new int[]{186, 12, 0, 1}, objArr86);
                                String str34 = (String) objArr86[0];
                                int i202 = -(-(ViewConfiguration.getPressedStateDuration() >> 16));
                                Object[] objArr87 = new Object[1];
                                b(new int[]{1000021104, -1688440217, 1195157493, 1444115184, 1325965680, 2003912281}, (i202 & 11) + (i202 | 11), objArr87);
                                String str35 = (String) objArr87[0];
                                Object[] objArr88 = new Object[1];
                                c("\u0000\u0001\u0001\u0001\u0000", true, new int[]{198, 5, 184, 0}, objArr88);
                                String str36 = (String) objArr88[0];
                                int threadPriority = Process.getThreadPriority(0);
                                int values3 = com.identy.a.PngjException.values();
                                int i203 = (threadPriority * (-932)) + 18680;
                                int i204 = ~threadPriority;
                                int i205 = -(-(((~((-21) | (~values3))) | i204) * (-933)));
                                int i206 = (i203 & i205) + (i203 | i205);
                                int i207 = ~values3;
                                int i208 = ~((i207 & i204) | (i204 ^ i207));
                                int i209 = ~(i204 | 20);
                                int i210 = (((i208 & i209) | (i208 ^ i209)) * 933) + i206;
                                int i211 = -(-((~((threadPriority & 20) | (threadPriority ^ 20))) * 933));
                                int i212 = -(((i210 ^ i211) + ((i211 & i210) << 1)) >> 6);
                                int i213 = (i212 & 4) + (i212 | 4);
                                Object[] objArr89 = new Object[1];
                                b(new int[]{-641216882, -1722890774}, i213, objArr89);
                                String[] strArr5 = {str31, str32, str33, str34, str35, str36, (String) objArr89[0]};
                                int i214 = 7;
                                int i215 = 0;
                                while (true) {
                                    if (i215 >= i214) {
                                        i5 = 0;
                                        break;
                                    }
                                    Object[] objArr90 = {strArr5[i215]};
                                    Object PngjBadSignature20 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1492900309);
                                    if (PngjBadSignature20 == null) {
                                        char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                        int i216 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35;
                                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 397;
                                        int i217 = $$b;
                                        i206 = i215;
                                        byte b38 = (byte) (i217 + 1);
                                        byte b39 = (byte) i217;
                                        strArr2 = strArr5;
                                        Object[] objArr91 = new Object[1];
                                        a(b38, b39, (byte) (b39 - 1), objArr91);
                                        PngjBadSignature20 = com.d.e.a.PngjBadCrcException.PngjBadSignature(doubleTapTimeout, i216, maximumDrawingCacheSize, 1542146960, false, (String) objArr91[0], new Class[]{String.class});
                                    } else {
                                        strArr2 = strArr5;
                                        i206 = i215;
                                    }
                                    long longValue13 = ((Long) ((Method) PngjBadSignature20).invoke(null, objArr90)).longValue();
                                    long j110 = 499771953;
                                    long j111 = longValue13 ^ j2;
                                    long j112 = (j79 | longValue13) ^ j2;
                                    long j113 = ((-970) * (((j111 | j110) ^ j2) | j112)) + (971 * longValue13) + ((-1939) * j110);
                                    long j114 = j110 ^ j2;
                                    long j115 = ((970 * (((j114 | j111) ^ j2) | j112)) + ((1940 * ((j114 | longValue13) ^ j2)) + j113)) - 864350732;
                                    int i218 = ((int) (j115 >> 32)) & ((((-624239200) | (~((-812987212) | i))) * 301) + (((~((-624239200) | i)) | (~(i77 | 812987211))) * (-301)) + ((~(896873311 | i)) * (-301)) + 458649646);
                                    int i219 = ~((int) SystemClock.uptimeMillis());
                                    if (((i218 | (((int) j115) & defpackage.a.c(i219 | 2117298687, -828, (((~(2117298687 | i219)) | 740442198) * (-828)) + (-1754753727), -776656896))) != 0 ? '5' : 'L') != 'L') {
                                        i5 = (i206 & 90) + (i206 | 90);
                                        break;
                                    }
                                    i215 = (i206 | 1) + (i206 & 1);
                                    strArr5 = strArr2;
                                    i214 = 7;
                                }
                                if (i5 != 0) {
                                    Object[] objArr92 = {new int[]{(i5 | i) & (~(i & i5))}, new int[]{((~r0) & r1) | ((~r1) & r0)}, null, new int[]{i}};
                                    int i220 = (((-50414560) | i77) * 754) + (((~((-16843402) | i)) | (~(1000994815 | i77))) * (-754)) + (((~((-50414560) | i)) | android.R.attr.progressBarStyleLargeInverse | (~(984151414 | i))) * (-754)) + 1371613847;
                                    int i221 = -(-(i220 * (-667)));
                                    int i222 = ((-21360) & i221) + (i221 | (-21360));
                                    int i223 = ~i220;
                                    int i224 = (i ^ 16) | (i & 16);
                                    int i225 = ~i224;
                                    int i226 = -(-(((i225 & i223) | (i223 ^ i225)) * (-668)));
                                    int i227 = (i222 ^ i226) + ((i222 & i226) << 1);
                                    int i228 = ~((~i220) | i);
                                    int i229 = ((i228 & 16) | (i228 ^ 16)) * 1336;
                                    int i230 = (((i224 ^ i223) | (i223 & i224)) * 668) + (i227 & i229) + (i229 | i227);
                                    int i231 = i230 * 567;
                                    int i232 = (i231 & (-2065548148)) + (i231 | (-2065548148));
                                    int i233 = ~i230;
                                    int i234 = ~((i233 ^ i4) | (i233 & i4));
                                    int i235 = ~i230;
                                    int i236 = ((i234 | (~((i235 & i) | (i235 ^ i)))) * (-566)) + i232;
                                    int i237 = -(-((~((i230 & (-1767253029)) | ((-1767253029) ^ i230))) * 566));
                                    int i238 = ((i236 | i237) << 1) - (i237 ^ i236);
                                    int i239 = (~((i233 ^ (-1767253029)) | ((-1767253029) & i233) | i)) * 566;
                                    int i240 = (i238 ^ i239) + ((i239 & i238) << 1);
                                    int i241 = (i240 << 13) ^ i240;
                                    int i242 = i241 >>> 17;
                                    int i243 = ((~i241) & i242) | ((~i242) & i241);
                                    int i244 = i243 << 5;
                                    return objArr92;
                                }
                                try {
                                    try {
                                        int i245 = -(SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                                        int i246 = ((i245 | 14) << 1) - (i245 ^ 14);
                                        Object[] objArr93 = new Object[1];
                                        b(new int[]{-686975085, 1725362901, 1564097025, -1670950392, 1943633934, 324357692, 637467420, 305851541}, i246, objArr93);
                                        try {
                                            Object[] objArr94 = {(String) objArr93[0]};
                                            Object PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                            if (PngjBadSignature21 == null) {
                                                char myPid = (char) ((Process.myPid() >> 22) + 8752);
                                                int i247 = 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1));
                                                int indexOf9 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 336;
                                                int i248 = $$b;
                                                i206 = -1767253029;
                                                byte b40 = (byte) (i248 + 1);
                                                byte b41 = (byte) i248;
                                                try {
                                                    Object[] objArr95 = new Object[1];
                                                    a(b40, b41, (byte) (b41 - 1), objArr95);
                                                    PngjBadSignature21 = com.d.e.a.PngjBadCrcException.PngjBadSignature(myPid, i247, indexOf9, -598779726, false, (String) objArr95[0], new Class[]{String.class});
                                                } catch (Throwable th) {
                                                    th = th;
                                                    Throwable cause2 = th.getCause();
                                                    if (cause2 != null) {
                                                        throw cause2;
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i206 = -1767253029;
                                            }
                                            String str37 = (String) ((Method) PngjBadSignature21).invoke(null, objArr94);
                                            if (str37 != null) {
                                                int i249 = PngjUnsupportedException;
                                                int i250 = (i249 ^ 59) + ((i249 & 59) << 1);
                                                valueOf = i250 % Uuid.SIZE_BITS;
                                                if (!(i250 % 2 == 0)) {
                                                    String[] strArr6 = new String[0];
                                                    Object[] objArr96 = new Object[1];
                                                    c("\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", true, new int[]{203, 11, 0, 3}, objArr96);
                                                    strArr6[0] = (String) objArr96[0];
                                                    strArr = strArr6;
                                                    i14 = 1;
                                                } else {
                                                    Object[] objArr97 = new Object[1];
                                                    c("\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", true, new int[]{203, 11, 0, 3}, objArr97);
                                                    strArr = new String[]{(String) objArr97[0]};
                                                    i14 = 0;
                                                }
                                                while (true) {
                                                    if (i14 > 0) {
                                                        z4 = false;
                                                        break;
                                                    }
                                                    int i251 = PngjUnsupportedException;
                                                    valueOf = ((i251 & 65) + (i251 | 65)) % Uuid.SIZE_BITS;
                                                    if (str37.contains(strArr[i14])) {
                                                        PngjUnsupportedException = (valueOf + 61) % Uuid.SIZE_BITS;
                                                        z4 = true;
                                                        break;
                                                    }
                                                    i14 = (i14 | 1) + (i14 & 1);
                                                }
                                            }
                                            Object[] objArr98 = new Object[1];
                                            c("\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001", true, new int[]{214, 18, 82, 0}, objArr98);
                                            try {
                                                Object[] objArr99 = {(String) objArr98[0]};
                                                Object PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                                if (PngjBadSignature22 == null) {
                                                    char longPressTimeout2 = (char) (8752 - (ViewConfiguration.getLongPressTimeout() >> 16));
                                                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 24;
                                                    int lastIndexOf4 = TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0') + 337;
                                                    int i252 = $$b;
                                                    byte b42 = (byte) (i252 + 1);
                                                    byte b43 = (byte) i252;
                                                    Object[] objArr100 = new Object[1];
                                                    a(b42, b43, (byte) (b43 - 1), objArr100);
                                                    PngjBadSignature22 = com.d.e.a.PngjBadCrcException.PngjBadSignature(longPressTimeout2, tapTimeout, lastIndexOf4, -598779726, false, (String) objArr100[0], new Class[]{String.class});
                                                }
                                                invoke = ((Method) PngjBadSignature22).invoke(null, objArr99);
                                            } catch (Throwable th2) {
                                                Throwable cause3 = th2.getCause();
                                                if (cause3 != null) {
                                                    throw cause3;
                                                }
                                                throw th2;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                        }
                                    } catch (Exception unused) {
                                        i206 = -1767253029;
                                    }
                                } catch (Exception unused2) {
                                }
                                if (invoke != null) {
                                    Object[] objArr101 = new Object[1];
                                    c("\u0001\u0001\u0000\u0001\u0001\u0001\u0001", true, new int[]{232, 7, 0, 5}, objArr101);
                                    if (invoke.equals((String) objArr101[0])) {
                                        Object[] objArr102 = new Object[1];
                                        c("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000", false, new int[]{239, 23, 14, 0}, objArr102);
                                        try {
                                            Object[] objArr103 = {(String) objArr102[0]};
                                            Object PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                            if (PngjBadSignature23 == null) {
                                                char indexOf10 = (char) (TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 8753);
                                                int lastIndexOf5 = 23 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0', 0, 0);
                                                int makeMeasureSpec = 336 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                                int i253 = $$b;
                                                byte b44 = (byte) (i253 + 1);
                                                byte b45 = (byte) i253;
                                                Object[] objArr104 = new Object[1];
                                                a(b44, b45, (byte) (b45 - 1), objArr104);
                                                PngjBadSignature23 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf10, lastIndexOf5, makeMeasureSpec, -598779726, false, (String) objArr104[0], new Class[]{String.class});
                                            }
                                            String str38 = (String) ((Method) PngjBadSignature23).invoke(null, objArr103);
                                            if (!(str38 == null)) {
                                                int values4 = com.identy.a.PngjException.values();
                                                int i254 = ~values4;
                                                int i255 = ~((i254 ^ 947717926) | (i254 & 947717926));
                                                int i256 = (i255 ^ 42113041) | (i255 & 42113041);
                                                int i257 = ~((-787489) | values4);
                                                int i258 = 172687115 - (~(((i256 ^ i257) | (i257 & i256)) * 717));
                                                int i259 = (~(((-787489) ^ i254) | (i254 & (-787489)))) | 42113041;
                                                int i260 = ~((947717926 & values4) | (947717926 ^ values4));
                                                int i261 = (((i260 & i259) | (i259 ^ i260)) * 717) + i258;
                                                int values5 = com.identy.a.PngjException.values();
                                                int i262 = ~values5;
                                                int i263 = ~((1779780419 ^ i262) | (1779780419 & i262));
                                                int i264 = (i263 ^ (-1874194264)) | (i263 & (-1874194264));
                                                int i265 = ~(((-537987330) ^ values5) | ((-537987330) & values5));
                                                if (i261 <= ((((~(((-537987330) ^ values5) | (values5 & (-537987330)))) * 1426) + ((((i264 ^ i265) | (i264 & i265)) * (-713)) + 1249030640)) - (~((~((i262 & (-632401174)) | ((-632401174) ^ i262))) * 713))) - 1) {
                                                    Integer.parseInt(str38);
                                                    throw null;
                                                }
                                                int parseInt = Integer.parseInt(str38);
                                                if (parseInt != 0) {
                                                    i6 = ((parseInt | 170) << 1) - (parseInt ^ 170);
                                                    if (i6 == 0) {
                                                        PngjUnsupportedException = (valueOf + 15) % Uuid.SIZE_BITS;
                                                        Object[] objArr105 = {new int[]{(i6 & i77) | ((~i6) & i)}, new int[]{r0 ^ (r0 << 5)}, null, new int[]{i}};
                                                        int c14 = defpackage.a.c((~(i | (-620765505))) | (~(622013248 | i77)) | 411304981, 140, (((~(412552725 | i77)) | 620765504) * (-280)) + (((i | 412552725) * 140) - 1628538531), 16);
                                                        int i266 = (c14 & i4) + (c14 | i4);
                                                        int i267 = i266 << 13;
                                                        int i268 = (i267 & (~i266)) | ((~i267) & i266);
                                                        int i269 = i268 >>> 17;
                                                        int i270 = (i268 | i269) & (~(i268 & i269));
                                                        return objArr105;
                                                    }
                                                    Object[] objArr106 = new Object[1];
                                                    b(new int[]{-686975085, 1725362901, 1564097025, -1670950392, 1943633934, 324357692, 637467420, 305851541}, 13 - (ViewConfiguration.getTapTimeout() >> 16), objArr106);
                                                    Object[] objArr107 = {(String) objArr106[0]};
                                                    Object PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i3);
                                                    if (PngjBadSignature24 == null) {
                                                        char maxKeyCode3 = (char) (8752 - (KeyEvent.getMaxKeyCode() >> 16));
                                                        int i271 = 25 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                                                        int i272 = (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 335;
                                                        int i273 = $$b;
                                                        byte b46 = (byte) (i273 + 1);
                                                        byte b47 = (byte) i273;
                                                        Object[] objArr108 = new Object[1];
                                                        a(b46, b47, (byte) (b47 - 1), objArr108);
                                                        PngjBadSignature24 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maxKeyCode3, i271, i272, -598779726, false, (String) objArr108[0], new Class[]{String.class});
                                                    }
                                                    Object invoke7 = ((Method) PngjBadSignature24).invoke(null, objArr107);
                                                    if (invoke7 != null) {
                                                        Object[] objArr109 = new Object[1];
                                                        c("\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", true, new int[]{203, 11, 0, 3}, objArr109);
                                                        Object[] objArr110 = {invoke7, new String[]{(String) objArr109[0]}};
                                                        Object PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-344601997);
                                                        if (PngjBadSignature25 == null) {
                                                            char c15 = (char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 26715);
                                                            int size2 = View.MeasureSpec.getSize(0) + 33;
                                                            int offsetAfter2 = TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0) + 1668;
                                                            int i274 = $$b;
                                                            byte b48 = (byte) (i274 + 1);
                                                            byte b49 = (byte) i274;
                                                            Object[] objArr111 = new Object[1];
                                                            a(b48, b49, (byte) (b49 - 1), objArr111);
                                                            PngjBadSignature25 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c15, size2, offsetAfter2, 396011464, false, (String) objArr111[0], new Class[]{String.class, String[].class});
                                                        }
                                                        long longValue14 = ((Long) ((Method) PngjBadSignature25).invoke(null, objArr110)).longValue();
                                                        long j116 = -1647988074;
                                                        long j117 = -919;
                                                        long j118 = (j117 * longValue14) + (j117 * j116);
                                                        long j119 = 920;
                                                        long j120 = j116 ^ j2;
                                                        long j121 = longValue14 ^ j2;
                                                        long j122 = j120 | j121;
                                                        long j123 = (int) Runtime.getRuntime().totalMemory();
                                                        long j124 = j123 ^ j2;
                                                        long j125 = ((((((j122 | j124) ^ j2) | (((j120 | longValue14) | j123) ^ j2)) | ((j123 | (j121 | j116)) ^ j2)) * j119) + ((((j122 ^ j2) | ((j120 | j124) ^ j2)) * j119) + (((((j122 | j123) ^ j2) | (((j121 | j124) | j116) ^ j2)) * j119) + j118))) - 38604147;
                                                        int uptimeMillis = (int) SystemClock.uptimeMillis();
                                                        int c16 = ((int) (j125 >> 32)) & defpackage.a.c((~(1039013941 | uptimeMillis)) | (-1073626486) | (~(398212469 | uptimeMillis)), -1444, (((~uptimeMillis) | (-710026561)) * 1444) - 1153123274, 1538068096);
                                                        int i275 = ((int) j125) & ((((~(1584852519 | i)) | 363352585) * 70) + ((~(1610546735 | i)) * 70) + ((((~(1272888366 | i)) | 337658369) * (-140)) - 1074572181));
                                                        if (((c16 & i275) | (c16 ^ i275)) != 1) {
                                                            Object[] objArr112 = new Object[1];
                                                            c("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001", false, new int[]{262, 12, 0, 0}, objArr112);
                                                            String str39 = (String) objArr112[0];
                                                            int i276 = -Color.rgb(0, 0, 0);
                                                            int i277 = ((i276 | (-16777200)) << 1) - (i276 ^ (-16777200));
                                                            Object[] objArr113 = new Object[1];
                                                            b(new int[]{517309623, 787850669, -1248702861, 517615821, -1443758624, -947790318, 1454481099, -1270784315}, i277, objArr113);
                                                            String str40 = (String) objArr113[0];
                                                            Object[] objArr114 = new Object[1];
                                                            b(new int[]{517309623, 787850669, -1248702861, 517615821, -1443758624, -947790318, 1761192897, -1327007327, 1638120286, 1085667411}, 17 - View.getDefaultSize(0, 0), objArr114);
                                                            String str41 = (String) objArr114[0];
                                                            Object[] objArr115 = new Object[1];
                                                            c("\u0000\u0000\u0001\u0001\u0001\u0001", false, new int[]{274, 6, 177, 0}, objArr115);
                                                            String str42 = (String) objArr115[0];
                                                            Object[] objArr116 = new Object[1];
                                                            b(new int[]{1481079821, -1204985403, 1573751675, 1163940359, 1454481099, -1270784315}, 12 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr116);
                                                            String str43 = (String) objArr116[0];
                                                            Object[] objArr117 = new Object[1];
                                                            c("\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, new int[]{280, 17, 0, 0}, objArr117);
                                                            String str44 = (String) objArr117[0];
                                                            Object[] objArr118 = new Object[1];
                                                            b(new int[]{1481079821, -1204985403, 1573751675, 1163940359, 1454481099, -1270784315, 1172795349, -230535728, 842969299, 1215463175, 1638120286, 1085667411}, (-28) - (~AndroidCharacter.getMirror('0')), objArr118);
                                                            String str45 = (String) objArr118[0];
                                                            Object[] objArr119 = new Object[1];
                                                            c("\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, new int[]{297, 16, 0, 0}, objArr119);
                                                            String str46 = (String) objArr119[0];
                                                            Object[] objArr120 = new Object[1];
                                                            c("\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001", true, new int[]{313, 25, 169, 4}, objArr120);
                                                            String str47 = (String) objArr120[0];
                                                            Object[] objArr121 = new Object[1];
                                                            c("\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001", false, new int[]{338, 13, 159, 13}, objArr121);
                                                            String str48 = (String) objArr121[0];
                                                            Object[] objArr122 = new Object[1];
                                                            c("\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{351, 9, 21, 0}, objArr122);
                                                            String str49 = (String) objArr122[0];
                                                            Object[] objArr123 = new Object[1];
                                                            b(new int[]{1767366953, 1665328057, 1454481099, -1270784315}, 8 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr123);
                                                            String[] strArr7 = {str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, (String) objArr123[0]};
                                                            int i278 = 0;
                                                            while (i278 < 12) {
                                                                StringBuilder sb = new StringBuilder();
                                                                sb.append(strArr7[i278]);
                                                                int i279 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                                String[] strArr8 = strArr7;
                                                                Object[] objArr124 = new Object[1];
                                                                b(new int[]{-1258214818, -980540095}, (i279 & 2) + (i279 | 2), objArr124);
                                                                sb.append((String) objArr124[0]);
                                                                Object[] objArr125 = {sb.toString()};
                                                                Object PngjBadSignature26 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
                                                                if (PngjBadSignature26 == null) {
                                                                    char maximumDrawingCacheSize2 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                                                    int bitsPerPixel4 = 27 - ImageFormat.getBitsPerPixel(0);
                                                                    int indexOf11 = 1446 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0');
                                                                    byte b50 = (byte) $$b;
                                                                    byte b51 = b50;
                                                                    i13 = i278;
                                                                    Object[] objArr126 = new Object[1];
                                                                    a(b50, b51, (byte) (b51 + 3), objArr126);
                                                                    PngjBadSignature26 = com.d.e.a.PngjBadCrcException.PngjBadSignature(maximumDrawingCacheSize2, bitsPerPixel4, indexOf11, -1614962923, false, (String) objArr126[0], new Class[]{String.class});
                                                                } else {
                                                                    i13 = i278;
                                                                }
                                                                long longValue15 = ((Long) ((Method) PngjBadSignature26).invoke(null, objArr125)).longValue();
                                                                long j126 = -470232885;
                                                                long j127 = (522 * longValue15) + ((-520) * j126);
                                                                long j128 = 521;
                                                                long j129 = j126 ^ j2;
                                                                long j130 = j129 | longValue15;
                                                                long startUptimeMillis3 = (int) Process.getStartUptimeMillis();
                                                                long j131 = ((longValue15 ^ j2) | j126) ^ j2;
                                                                long j132 = ((j131 | (((j129 | (startUptimeMillis3 ^ j2)) | longValue15) ^ j2)) * j128) + ((-1042) * j131) + (((j130 | startUptimeMillis3) ^ j2) * j128) + j127 + 940721202;
                                                                int myUid3 = Process.myUid();
                                                                int i280 = ((1435849992 | myUid3) * 614) + 1761626842;
                                                                int i281 = ~myUid3;
                                                                int i282 = ((int) (j132 >> 32)) & ((((~(i281 | (-710945447))) | (~(2146795438 | i281))) * 614) + (((~(i281 | (-2128640687))) | (~(729100198 | i281)) | 1417695240) * (-1228)) + i280);
                                                                int c17 = ((int) j132) & defpackage.a.c((~(2125393854 | i77)) | 33284, 576, (((~(1781326774 | i)) | 344067080) * 576) + 1771465493, 614142464);
                                                                if (((i282 & c17) | (i282 ^ c17)) != 0) {
                                                                    i7 = (i13 ^ 110) + ((i13 & 110) << 1);
                                                                    break;
                                                                }
                                                                i278 = i13 + 1;
                                                                strArr7 = strArr8;
                                                            }
                                                        }
                                                    }
                                                    i7 = 0;
                                                    if (i7 != 0) {
                                                        c = 24;
                                                        c2 = 24;
                                                    } else {
                                                        c = 'A';
                                                        c2 = 24;
                                                    }
                                                    if (c == c2) {
                                                        PngjUnsupportedException = (valueOf + 97) % Uuid.SIZE_BITS;
                                                        Object[] objArr127 = {new int[]{i7 ^ i}, new int[1], null, new int[]{i}};
                                                        int i283 = (((~((~((int) Runtime.getRuntime().totalMemory())) | 205489949)) | (-829076025)) * 305) + ((((~(r0 | 205489949)) | (-1031780158)) * 305) - 1250391556);
                                                        int i284 = (i283 ^ 16) + ((i283 & 16) << 1);
                                                        int i285 = i284 * (-337);
                                                        int i286 = (i285 & 2098322348) + (i285 | 2098322348);
                                                        int i287 = ~i284;
                                                        int i288 = (i287 ^ i77) | (i287 & i77);
                                                        int i289 = ~i288;
                                                        int i290 = ~((i206 ^ i284) | (i206 & i284));
                                                        int i291 = (i289 & i290) | (i289 ^ i290);
                                                        int i292 = ~(i284 | i);
                                                        int i293 = ((i291 & i292) | (i291 ^ i292)) * (-338);
                                                        int i294 = (i286 ^ i293) + ((i286 & i293) << 1);
                                                        int i295 = (~((i287 & i4) | (i287 ^ i4))) * 338;
                                                        int i296 = (i294 & i295) + (i295 | i294);
                                                        int i297 = ~i288;
                                                        int i298 = i284 | i4;
                                                        int i299 = ~((i & i298) | (i298 ^ i));
                                                        int i300 = -(-(((i297 & i299) | (i297 ^ i299)) * 338));
                                                        int i301 = ((i296 | i300) << 1) - (i300 ^ i296);
                                                        int i302 = i301 << 13;
                                                        int i303 = (i302 & (~i301)) | ((~i302) & i301);
                                                        int i304 = i303 >>> 17;
                                                        int i305 = ((~i303) & i304) | ((~i304) & i303);
                                                        ((int[]) objArr127[1])[0] = i305 ^ (i305 << 5);
                                                        return objArr127;
                                                    }
                                                    long[] jArr = {472001035};
                                                    int i306 = -(-View.resolveSizeAndState(0, 0, 0));
                                                    int i307 = ((i306 | 17) << 1) - (i306 ^ 17);
                                                    Object[] objArr128 = new Object[1];
                                                    b(new int[]{-229838068, -103181849, -7231920, -1161528912, 1375582240, -1562153806, 2142175454, -597428202, 82566478, 1805472041}, i307, objArr128);
                                                    try {
                                                        BufferedInputStream bufferedInputStream5 = new BufferedInputStream(new FileInputStream((String) objArr128[0]));
                                                        long j133 = j;
                                                        loop5: while (true) {
                                                            try {
                                                                int read = bufferedInputStream5.read();
                                                                if (read == -1) {
                                                                    bufferedInputStream2 = bufferedInputStream5;
                                                                    break;
                                                                }
                                                                bufferedInputStream2 = bufferedInputStream5;
                                                                j133 = 1073741823 & (read ^ (j133 << 5));
                                                                for (int i308 = 0; i308 < 1; i308++) {
                                                                    try {
                                                                        if (j133 == jArr[i308]) {
                                                                            int i309 = -(-(i308 * 591));
                                                                            int i310 = ((-589) ^ i309) + ((i309 & (-589)) << 1);
                                                                            int i311 = ~i308;
                                                                            int i312 = ~((i311 ^ i77) | (i311 & i77));
                                                                            int i313 = ~i308;
                                                                            int i314 = (~((i313 ^ 1) | (i313 & 1))) | i312;
                                                                            int i315 = ~(i144 | 1);
                                                                            int i316 = (i314 ^ i315) | (i314 & i315);
                                                                            int i317 = ((-2) ^ i308) | ((-2) & i308);
                                                                            int i318 = ~((i317 ^ i) | (i317 & i));
                                                                            int i319 = ((i316 ^ i318) | (i316 & i318)) * 590;
                                                                            int i320 = ((i310 | i319) << 1) - (i319 ^ i310);
                                                                            int i321 = -(-(((~(i313 | i77)) | (~((i311 ^ 1) | (i311 & 1))) | (~((i77 ^ 1) | (i77 & 1)))) * (-1180)));
                                                                            int i322 = ((i320 | i321) << 1) - (i321 ^ i320);
                                                                            int i323 = ~((-2) | i77);
                                                                            int i324 = ~((i308 & i77) | (i77 ^ i308));
                                                                            i8 = (((i323 & i324) | (i323 ^ i324)) * 590) + i322;
                                                                            try {
                                                                                bufferedInputStream2.close();
                                                                                break loop5;
                                                                            } catch (Exception unused3) {
                                                                            }
                                                                        }
                                                                    } catch (IOException unused4) {
                                                                    } catch (Throwable th4) {
                                                                        th = th4;
                                                                        bufferedInputStream = bufferedInputStream2;
                                                                        if (bufferedInputStream != null) {
                                                                            try {
                                                                                bufferedInputStream.close();
                                                                            } catch (Exception unused5) {
                                                                            }
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                bufferedInputStream5 = bufferedInputStream2;
                                                            } catch (IOException unused6) {
                                                                bufferedInputStream2 = bufferedInputStream5;
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                bufferedInputStream2 = bufferedInputStream5;
                                                            }
                                                        }
                                                    } catch (IOException unused7) {
                                                        bufferedInputStream2 = null;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        bufferedInputStream = null;
                                                    }
                                                    i9 = i8 == 0 ? 240 : 0;
                                                    if (i9 == 0) {
                                                        int i325 = PngjUnsupportedException;
                                                        valueOf = ((i325 & 101) + (i325 | 101)) % Uuid.SIZE_BITS;
                                                        Object[] objArr129 = {new int[]{(i9 & i77) | ((~i9) & i)}, new int[1], null, new int[]{i}};
                                                        int i326 = (((~((~Process.myPid()) | (-160208071))) | 159387712) * (-964)) + ((((~((-160208071) | r0)) | (-874357904)) * (-964)) - 211106643);
                                                        int i327 = (i326 ^ 16) + ((i326 & 16) << 1);
                                                        int i328 = i327 * 960;
                                                        int i329 = ((i328 | 905141868) << 1) - (i328 ^ 905141868);
                                                        int i330 = ~((i206 ^ i144) | (i206 & i144));
                                                        int i331 = ~((i327 ^ i) | (i327 & i));
                                                        int i332 = (i329 - (~(-(-(((i330 & i331) | (i330 ^ i331)) * 959))))) - 1;
                                                        int i333 = (i332 ^ (-1716427109)) + (((-1716427109) & i332) << 1);
                                                        int i334 = ~(i206 | i);
                                                        int i335 = ~((i144 ^ i327) | (i327 & i144));
                                                        int i336 = -(-(((i334 & i335) | (i334 ^ i335)) * 959));
                                                        int i337 = (i333 & i336) + (i336 | i333);
                                                        int i338 = (i337 << 13) ^ i337;
                                                        int i339 = i338 >>> 17;
                                                        int i340 = ((~i338) & i339) | ((~i339) & i338);
                                                        int i341 = i340 << 5;
                                                        ((int[]) objArr129[1])[0] = ((~i340) & i341) | ((~i341) & i340);
                                                        return objArr129;
                                                    }
                                                    long[] jArr2 = {472001035};
                                                    int i342 = -(-Drawable.resolveOpacity(0, 0));
                                                    int i343 = (i342 & 22) + (i342 | 22);
                                                    Object[] objArr130 = new Object[1];
                                                    b(new int[]{1481079821, -1204985403, 1345841168, -1615480707, 782110662, -232094084, -1792772283, -688477931, -1697735793, 1614690060, 101580764, -1043261685}, i343, objArr130);
                                                    try {
                                                        BufferedInputStream bufferedInputStream6 = new BufferedInputStream(new FileInputStream((String) objArr130[0]));
                                                        long j134 = j;
                                                        loop7: while (true) {
                                                            try {
                                                                int read2 = bufferedInputStream6.read();
                                                                if (read2 == -1) {
                                                                    bufferedInputStream4 = bufferedInputStream6;
                                                                    break;
                                                                }
                                                                bufferedInputStream4 = bufferedInputStream6;
                                                                j134 = 1073741823 & (read2 ^ (j134 << 5));
                                                                for (int i344 = 0; i344 < 1; i344 = (i344 & 1) + (i344 | 1)) {
                                                                    try {
                                                                        if (j134 == jArr2[i344]) {
                                                                            i10 = (i344 ^ 1) + ((i344 & 1) << 1);
                                                                            try {
                                                                                bufferedInputStream4.close();
                                                                                break loop7;
                                                                            } catch (Exception unused8) {
                                                                            }
                                                                        }
                                                                    } catch (IOException unused9) {
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        bufferedInputStream3 = bufferedInputStream4;
                                                                        if (bufferedInputStream3 != null) {
                                                                            try {
                                                                                bufferedInputStream3.close();
                                                                            } catch (Exception unused10) {
                                                                            }
                                                                        }
                                                                        throw th;
                                                                    }
                                                                }
                                                                bufferedInputStream6 = bufferedInputStream4;
                                                            } catch (IOException unused11) {
                                                                bufferedInputStream4 = bufferedInputStream6;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                bufferedInputStream4 = bufferedInputStream6;
                                                            }
                                                        }
                                                    } catch (IOException unused12) {
                                                        bufferedInputStream4 = null;
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        bufferedInputStream3 = null;
                                                    }
                                                    try {
                                                        bufferedInputStream4.close();
                                                    } catch (Exception unused13) {
                                                    }
                                                    i10 = 0;
                                                    if (i10 != 0) {
                                                        int i345 = PngjUnsupportedException;
                                                        valueOf = ((i345 & 7) + (i345 | 7)) % Uuid.SIZE_BITS;
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    if (z3) {
                                                        Object[] objArr131 = {new int[]{r5}, new int[]{(r1 | r2) & (~(r1 & r2))}, null, new int[]{i}};
                                                        int i346 = (~(i & 242)) & (i | 242);
                                                        int c18 = defpackage.a.c((~((-618842220) | i77)) | 12730474 | (~((-415723755) | i77)), 184, (((~((-606111746) | i77)) | (~((-402993281) | i77))) * (-184)) - 347012035, -960829208);
                                                        int i347 = (c18 ^ 16) + ((c18 & 16) << 1);
                                                        int i348 = (i347 & i4) + (i347 | i4);
                                                        int i349 = i348 << 13;
                                                        int i350 = (i348 | i349) & (~(i348 & i349));
                                                        int i351 = i350 ^ (i350 >>> 17);
                                                        int i352 = i351 << 5;
                                                        return objArr131;
                                                    }
                                                    Object PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1372235840);
                                                    if (PngjBadSignature27 == null) {
                                                        char modifierMetaStateMask = (char) (23941 - ((byte) KeyEvent.getModifierMetaStateMask()));
                                                        int i353 = (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 23;
                                                        int i354 = 313 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1));
                                                        byte b52 = (byte) $$b;
                                                        byte b53 = b52;
                                                        Object[] objArr132 = new Object[1];
                                                        a(b52, b53, (byte) (b53 + 3), objArr132);
                                                        PngjBadSignature27 = com.d.e.a.PngjBadCrcException.PngjBadSignature(modifierMetaStateMask, i353, i354, 1390033531, false, (String) objArr132[0], new Class[0]);
                                                    }
                                                    long longValue16 = ((Long) ((Method) PngjBadSignature27).invoke(null, null)).longValue();
                                                    long j135 = -386682029;
                                                    long j136 = ((-782) * longValue16) + (784 * j135);
                                                    long j137 = -783;
                                                    long j138 = j135 ^ j2;
                                                    long j139 = (783 * (j138 | ((j79 | longValue16) ^ j2))) + (j137 * (((j138 | j79) | longValue16) ^ j2)) + ((longValue16 ^ j2) * j137) + j136 + 533596755;
                                                    int i355 = ((int) (j139 >> 32)) & ((((~(214795448 | i)) | (~(i77 | 1652021859))) * 333) + (((~(1652021859 | i)) | (~(214795448 | i77))) * 333) + 317132387);
                                                    int startUptimeMillis4 = (int) Process.getStartUptimeMillis();
                                                    int i356 = ~((-174608407) | startUptimeMillis4);
                                                    int i357 = ~startUptimeMillis4;
                                                    if ((i355 | (((int) j139) & (((((~((-174608407) | i357)) | (~(2071657974 | startUptimeMillis4))) | (~(startUptimeMillis4 | (-285214753)))) * 920) + (((174608406 | (~(1897049568 | i357))) * 920) + ((((~(i357 | (-285214753))) | i356) * 920) + (-2038855459)))))) != 0) {
                                                        objArr = new Object[]{new int[]{r5}, new int[]{(r2 | r4) & (~(r2 & r4))}, null, new int[]{i}};
                                                        int i358 = (~(i & 264)) & (i | 264);
                                                        int i359 = (((~(916882634 | i77)) | (-832909378)) * 184) + ((((-16855042) | i77) * 184) - 328930947);
                                                        int i360 = (i359 ^ 16) + ((i359 & 16) << 1) + i4;
                                                        int i361 = i360 << 13;
                                                        int i362 = ((~i360) & i361) | ((~i361) & i360);
                                                        int i363 = i362 >>> 17;
                                                        int i364 = (i362 | i363) & (~(i362 & i363));
                                                        int i365 = i364 << 5;
                                                        c3 = 0;
                                                    } else {
                                                        Object PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-40521023);
                                                        if (PngjBadSignature28 == null) {
                                                            char c19 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                                            int edgeSlop3 = 28 - (ViewConfiguration.getEdgeSlop() >> 16);
                                                            int pressedStateDuration = 1855 - (ViewConfiguration.getPressedStateDuration() >> 16);
                                                            int i366 = $$b;
                                                            byte b54 = (byte) (i366 + 1);
                                                            byte b55 = (byte) i366;
                                                            Object[] objArr133 = new Object[1];
                                                            a(b54, b55, (byte) (b55 - 1), objArr133);
                                                            PngjBadSignature28 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c19, edgeSlop3, pressedStateDuration, 24829818, false, (String) objArr133[0], new Class[0]);
                                                        }
                                                        long longValue17 = ((Long) ((Method) PngjBadSignature28).invoke(null, null)).longValue();
                                                        long j140 = 983599451;
                                                        long j141 = (j92 * longValue17) + (j91 * j140);
                                                        long b56 = defpackage.a.b(1401385596);
                                                        long j142 = (j94 * (j140 | b56)) + j141;
                                                        long j143 = longValue17 ^ j2;
                                                        long j144 = (((j140 ^ j2) | j143) | b56) ^ j2;
                                                        long j145 = b56 ^ j2;
                                                        long j146 = j143 | j145;
                                                        long j147 = (((((j146 ^ j2) | ((j143 | j140) ^ j2)) | ((j140 | j145) ^ j2)) * j96) + (((j144 | ((j146 | j140) ^ j2)) * j96) + j142)) - 1730965472;
                                                        int i367 = ~((~((int) Process.getStartElapsedRealtime())) | (-261638676));
                                                        int i368 = ((int) (j147 >> 32)) & (((i367 | 1614976428) * 374) + (((-1876615104) | i367) * (-374)) + 1252051426);
                                                        int i369 = ((int) j147) & ((((~(1238810740 | i77)) | (-1272436086) | (~((-164790325) | i))) * 757) + ((~((-33625346) | i)) * 1514) + (((-198415670) | i77) * (-757)) + 162827168);
                                                        if (((i368 & i369) | (i368 ^ i369)) != 0) {
                                                            i12 = (~(i & 281)) & (i | 281);
                                                            i11 = 1;
                                                        } else {
                                                            int i370 = valueOf;
                                                            i11 = 1;
                                                            PngjUnsupportedException = ((i370 ^ 15) + ((i370 & 15) << 1)) % Uuid.SIZE_BITS;
                                                            i12 = i;
                                                        }
                                                        if (i12 != i) {
                                                            Object[] objArr134 = new Object[4];
                                                            int[] iArr = new int[i11];
                                                            objArr134[0] = iArr;
                                                            objArr134[i11] = new int[i11];
                                                            int[] iArr2 = new int[i11];
                                                            objArr134[3] = iArr2;
                                                            iArr2[0] = i;
                                                            iArr[0] = i12;
                                                            objArr134[2] = null;
                                                            int i371 = (int) Runtime.getRuntime().totalMemory();
                                                            int i372 = (((~(i371 | (-191614728))) | 842951246) * 376) + (((~((~i371) | 191614727)) | (-998240080)) * (-376)) + ((((-961914186) | i371) * 376) - 1415183235);
                                                            int i373 = -(-(((i372 | 16) << 1) - (i372 ^ 16)));
                                                            int i374 = (i373 & i4) + (i373 | i4);
                                                            int i375 = i374 << 13;
                                                            int i376 = (i375 & (~i374)) | ((~i375) & i374);
                                                            int i377 = i376 >>> 17;
                                                            int i378 = (i376 | i377) & (~(i376 & i377));
                                                            int i379 = i378 << 5;
                                                            ((int[]) objArr134[1])[0] = ((~i378) & i379) | ((~i379) & i378);
                                                            objArr = objArr134;
                                                            c3 = 0;
                                                        } else {
                                                            Object PngjBadSignature29 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-792668357);
                                                            if (PngjBadSignature29 == null) {
                                                                char bitsPerPixel5 = (char) (30093 - ImageFormat.getBitsPerPixel(0));
                                                                int defaultSize4 = 45 - View.getDefaultSize(0, 0);
                                                                int mode2 = View.MeasureSpec.getMode(0) + 1810;
                                                                byte b57 = (byte) $$b;
                                                                byte b58 = b57;
                                                                Object[] objArr135 = new Object[1];
                                                                a(b57, b58, (byte) (b58 + 3), objArr135);
                                                                PngjBadSignature29 = com.d.e.a.PngjBadCrcException.PngjBadSignature(bitsPerPixel5, defaultSize4, mode2, 741325440, false, (String) objArr135[0], new Class[0]);
                                                            }
                                                            long longValue18 = ((Long) ((Method) PngjBadSignature29).invoke(null, null)).longValue();
                                                            long j148 = 297478204;
                                                            long j149 = -375;
                                                            long j150 = (j149 * longValue18) + (j149 * j148);
                                                            long j151 = 376;
                                                            long maxMemory2 = (int) Runtime.getRuntime().maxMemory();
                                                            long j152 = j148 ^ j2;
                                                            long j153 = (j148 | longValue18) ^ j2;
                                                            long j154 = ((longValue18 | ((j152 | maxMemory2) ^ j2)) * j151) + ((-376) * ((((maxMemory2 ^ j2) | j148) ^ j2) | j153)) + ((maxMemory2 | ((j152 | (longValue18 ^ j2)) ^ j2) | j153) * j151) + j150 + 58256340;
                                                            int i380 = ~defpackage.a.a();
                                                            int i381 = ~((-1161837391) | i380);
                                                            int i382 = ((int) (j154 >> 32)) & (((i381 | 542463048) * 764) + (((~(i380 | (-1695903495))) | 538264576) * (-1528)) + (((-1695903495) | i381) * 764) + 31983534);
                                                            int i383 = ((int) j154) & ((((~((-38813769) | i77)) | 267521) * 241) + ((((~((-1448143567) | i77)) | 1409329798) * (-241)) - 1155634038));
                                                            if (((i382 & i383) | (i382 ^ i383)) != 0) {
                                                                objArr = new Object[]{new int[]{(i & (-269)) | (i77 & 268)}, new int[]{((~r2) & r4) | ((~r4) & r2)}, null, new int[]{i}};
                                                                int i384 = ((478593738 | (~((-555972236) | i77))) * 160) + ((((~(i77 | 478593738)) | (-1034417868)) * (-160)) - 529122411);
                                                                int i385 = 1767253027 - (~(((i384 | 16) << 1) - (i384 ^ 16)));
                                                                int i386 = i385 << 13;
                                                                int i387 = (i386 & (~i385)) | ((~i386) & i385);
                                                                int i388 = i387 ^ (i387 >>> 17);
                                                                int i389 = i388 << 5;
                                                            } else {
                                                                Object PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-25572490);
                                                                if (PngjBadSignature30 == null) {
                                                                    char keyRepeatDelay2 = (char) (30094 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                                                                    int windowTouchSlop = 45 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                                                    int argb = Color.argb(0, 0, 0, 0) + 1810;
                                                                    int i390 = $$b;
                                                                    byte b59 = (byte) (i390 + 1);
                                                                    byte b60 = (byte) i390;
                                                                    Object[] objArr136 = new Object[1];
                                                                    a(b59, b60, (byte) (b60 - 1), objArr136);
                                                                    PngjBadSignature30 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatDelay2, windowTouchSlop, argb, 43427533, false, (String) objArr136[0], new Class[0]);
                                                                }
                                                                long longValue19 = ((Long) ((Method) PngjBadSignature30).invoke(null, null)).longValue();
                                                                long j155 = -880829464;
                                                                long j156 = (53 * longValue19) + ((-51) * j155);
                                                                long j157 = 52;
                                                                long myPid2 = Process.myPid() ^ j2;
                                                                long j158 = myPid2 | j155;
                                                                long j159 = longValue19 ^ j2;
                                                                long j160 = ((-52) * (((j159 | myPid2) ^ j2) | ((j159 | j155) ^ j2) | (j158 ^ j2))) + (((j158 | longValue19) ^ j2) * j157) + j156;
                                                                long j161 = j155 ^ j2;
                                                                long j162 = ((j157 * (((j161 | longValue19) ^ j2) | ((myPid2 | j161) ^ j2))) + j160) - 717409322;
                                                                int b61 = defpackage.a.b(1287237838);
                                                                int i391 = ~(2010111470 | b61);
                                                                int i392 = ~b61;
                                                                int i393 = ((int) (j162 >> 32)) & ((((~(b61 | (-21495817))) | (~(2010111470 | i392)) | (~((-1140986241) | b61))) * 920) + (((-2010111471) | (~(869125230 | i392))) * 920) + ((i391 | (~((-21495817) | i392))) * 920) + 2038856378);
                                                                int i394 = ~((-864499978) | i77);
                                                                int i395 = ((int) j162) & (((i394 | 572726432) * 712) + (((~((-293871882) | i77)) | (~((-570628097) | i))) * (-712)) + ((293871881 | i394) * (-712)) + 147107421);
                                                                if (((i393 & i395) | (i393 ^ i395)) != 0) {
                                                                    objArr = new Object[]{new int[]{(i & (-267)) | (i77 & 266)}, new int[1], null, new int[]{i}};
                                                                    int A = defpackage.a.A((~(defpackage.a.b(1288271074) | (-273289478))) | 704652288, 130, ((~((~r2) | (-273289478))) * 130) - 1543811893, -16);
                                                                    int i396 = ((A | i4) << 1) - (A ^ i4);
                                                                    int i397 = (i396 << 13) ^ i396;
                                                                    int i398 = i397 >>> 17;
                                                                    int i399 = (i397 | i398) & (~(i397 & i398));
                                                                    int i400 = i399 << 5;
                                                                    ((int[]) objArr[1])[0] = ((~i399) & i400) | ((~i400) & i399);
                                                                } else {
                                                                    Object PngjBadSignature31 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2091466614);
                                                                    if (PngjBadSignature31 == null) {
                                                                        char indexOf12 = (char) (45716 - TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0'));
                                                                        int offsetAfter3 = 40 - TextUtils.getOffsetAfter(BuildConfig.FLAVOR, 0);
                                                                        int minimumFlingVelocity2 = 625 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                                        byte b62 = (byte) $$b;
                                                                        byte b63 = b62;
                                                                        Object[] objArr137 = new Object[1];
                                                                        a(b62, b63, (byte) (b63 + 3), objArr137);
                                                                        PngjBadSignature31 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf12, offsetAfter3, minimumFlingVelocity2, 2142874929, false, (String) objArr137[0], new Class[0]);
                                                                    }
                                                                    long longValue20 = ((Long) ((Method) PngjBadSignature31).invoke(null, null)).longValue();
                                                                    long j163 = 736577604;
                                                                    long j164 = -574;
                                                                    long j165 = (j164 * longValue20) + (j164 * j163);
                                                                    long j166 = j163 ^ j2;
                                                                    long elapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                                    long j167 = elapsedRealtime ^ j2;
                                                                    long j168 = ((longValue20 ^ j2) | elapsedRealtime) ^ j2;
                                                                    long j169 = (575 * (((j167 | j163) ^ j2) | ((j166 | elapsedRealtime) ^ j2))) + ((-575) * (j168 | ((j167 | longValue20) ^ j2))) + (1150 * (((j166 | j167) ^ j2) | j168)) + j165 + 600225678;
                                                                    int a2 = defpackage.a.a();
                                                                    int i401 = ((182259131 | a2) * (-50)) - 658573438;
                                                                    int i402 = ~((-181208492) | a2);
                                                                    int i403 = ~a2;
                                                                    if ((((((int) (j169 >> 32)) & ((((~(i403 | 182259131)) | ((~((-1254967280) | i403)) | 1073758788)) * 50) + ((((~(i403 | (-1073758789))) | i402) * 50) + i401))) | (((int) j169) & ((((~(542471319 | i)) | (1437239872 | (~((-13463) | i77)))) * 717) + (((((~(i77 | 542471319)) | 1437239872) | (~((-13463) | i))) * 717) + 1249163951)))) != 0 ? '9' : '5') != '9') {
                                                                        objArr = new Object[]{new int[]{i}, new int[1], null, new int[]{i}};
                                                                        int freeMemory = (int) Runtime.getRuntime().freeMemory();
                                                                        int i404 = 1767253027 - (~((((~(freeMemory | (-1022236394))) | (-1023293166)) * 433) + ((((~((-12329581) | freeMemory)) | (-1022236394)) * (-433)) + (((~((~freeMemory) | (-1010963586))) * 433) + 1831580136))));
                                                                        int i405 = i404 << 13;
                                                                        int i406 = (i405 & (~i404)) | ((~i405) & i404);
                                                                        int i407 = i406 >>> 17;
                                                                        int i408 = ((~i406) & i407) | ((~i407) & i406);
                                                                        int i409 = i408 << 5;
                                                                        c3 = 0;
                                                                        ((int[]) objArr[1])[0] = ((~i408) & i409) | ((~i409) & i408);
                                                                    } else {
                                                                        objArr = new Object[]{new int[]{r5}, new int[]{((~r2) & r4) | ((~r4) & r2)}, null, new int[]{i}};
                                                                        int i410 = (~(i & 280)) & (i | 280);
                                                                        int i411 = ((463578319 | (~((-570987655) | i77))) * 160) + ((((~(i77 | 463578319)) | (-1000977616)) * (-160)) - 1366149643);
                                                                        int i412 = -(-((i411 ^ 16) + ((i411 & 16) << 1)));
                                                                        int i413 = ((i412 | i4) << 1) - (i412 ^ i4);
                                                                        int i414 = i413 << 13;
                                                                        int i415 = (i414 & (~i413)) | ((~i414) & i413);
                                                                        int i416 = i415 ^ (i415 >>> 17);
                                                                        int i417 = i416 << 5;
                                                                        c3 = 0;
                                                                    }
                                                                }
                                                            }
                                                            c4 = 3;
                                                            c3 = 0;
                                                            if ((((int[]) objArr[c4])[c3] == ((int[]) objArr[c3])[c3] ? 'J' : (char) 28) != 'J') {
                                                                return objArr;
                                                            }
                                                            Object[] objArr138 = {2};
                                                            Object PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-476828914);
                                                            if (PngjBadSignature32 == null) {
                                                                char c20 = (char) (35512 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                                                                int offsetBefore = TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 42;
                                                                int packedPositionType2 = ExpandableListView.getPackedPositionType(j) + 507;
                                                                byte b64 = (byte) $$b;
                                                                byte b65 = b64;
                                                                Object[] objArr139 = new Object[1];
                                                                a(b64, b65, (byte) (b65 + 3), objArr139);
                                                                PngjBadSignature32 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c20, offsetBefore, packedPositionType2, 528172725, false, (String) objArr139[0], new Class[]{cls2});
                                                            }
                                                            long longValue21 = ((Long) ((Method) PngjBadSignature32).invoke(null, objArr138)).longValue();
                                                            long j170 = 349237291;
                                                            long j171 = -964;
                                                            long j172 = (965 * longValue21) + ((-963) * j170) + j171;
                                                            long j173 = longValue21 ^ j2;
                                                            long uptimeMillis2 = (int) SystemClock.uptimeMillis();
                                                            long j174 = (j171 * (((j173 | (uptimeMillis2 ^ j2)) ^ j2) | ((j173 | j170) ^ j2))) + (((j170 ^ j2) | ((j173 | uptimeMillis2) ^ j2)) * j171) + j172 + 518509221;
                                                            int i418 = ((int) (j174 >> 32)) & ((((~(929237937 | i77)) | (-2012454836) | (~((-845286050) | i))) * 757) + ((~((-1083216899) | i)) * 1514) + (((-1928502948) | i77) * (-757)) + 907857936);
                                                            int myUid4 = Process.myUid();
                                                            int i419 = ((int) j174) & ((((~(myUid4 | (-702222138))) | 1443127490) * 433) + (((~(2139448547 | myUid4)) | (-702222138)) * (-433)) + ((~((~myUid4) | (-696321058))) * 433) + 774980936);
                                                            if (((i418 & i419) | (i418 ^ i419)) == 2) {
                                                                PngjUnsupportedException = (valueOf + 15) % Uuid.SIZE_BITS;
                                                                Object[] objArr140 = {new int[]{(i & (-271)) | (i77 & 270)}, new int[1], null, new int[]{i}};
                                                                int i420 = (((~((~((int) SystemClock.uptimeMillis())) | (-873017410))) | 138413072) * 521) + (((~((-873017410) | r1)) * 521) - 1934704516);
                                                                int i421 = (i420 ^ 16) + ((i420 & 16) << 1) + i4;
                                                                int i422 = i421 << 13;
                                                                int i423 = (i422 | i421) & (~(i421 & i422));
                                                                int i424 = i423 >>> 17;
                                                                int i425 = (i423 | i424) & (~(i423 & i424));
                                                                int i426 = i425 << 5;
                                                                ((int[]) objArr140[1])[0] = ((~i425) & i426) | ((~i426) & i425);
                                                                return objArr140;
                                                            }
                                                            Object PngjBadSignature33 = com.d.e.a.PngjBadCrcException.PngjBadSignature(98436405);
                                                            if (PngjBadSignature33 == null) {
                                                                char bitsPerPixel6 = (char) (51308 - ImageFormat.getBitsPerPixel(0));
                                                                int combineMeasuredStates3 = View.combineMeasuredStates(0, 0) + 43;
                                                                int indexOf13 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0) + 1767;
                                                                byte b66 = (byte) $$b;
                                                                byte b67 = b66;
                                                                Object[] objArr141 = new Object[1];
                                                                a(b66, b67, (byte) (b67 + 3), objArr141);
                                                                PngjBadSignature33 = com.d.e.a.PngjBadCrcException.PngjBadSignature(bitsPerPixel6, combineMeasuredStates3, indexOf13, -114202482, false, (String) objArr141[0], new Class[0]);
                                                            }
                                                            long longValue22 = ((Long) ((Method) PngjBadSignature33).invoke(null, null)).longValue();
                                                            long j175 = 278533906;
                                                            long j176 = -167;
                                                            long j177 = (j176 * longValue22) + (j176 * j175);
                                                            long j178 = longValue22 ^ j2;
                                                            long maxMemory3 = (int) Runtime.getRuntime().maxMemory();
                                                            long j179 = ((168 * (j178 | ((j175 | (maxMemory3 ^ j2)) ^ j2))) + (((-168) * (((j175 | longValue22) ^ j2) | ((j175 | maxMemory3) ^ j2))) + ((((((j175 ^ j2) | j178) ^ j2) | ((j178 | maxMemory3) ^ j2)) * 336) + j177))) - 906962986;
                                                            int i427 = ((int) (j179 >> 32)) & ((((~((-602967358) | i77)) | (~(2040193768 | i77)) | (~((-1477075649) | i))) * 568) + (((~(602967357 | i)) | (~((-2040193769) | i)) | (~((-39849238) | i77))) * (-568)) + (((~(602967357 | i77)) | 1477075648 | (~((-2040193769) | i77))) * (-1136)) + 1738041050);
                                                            int b68 = defpackage.a.b(670291630);
                                                            int i428 = ~(1188721794 | b68);
                                                            int i429 = ~b68;
                                                            int i430 = i428 | (~((-248504616) | i429));
                                                            int i431 = ((int) j179) & (((1074795648 | (~((-1188721795) | i429))) * 516) + (((~(b68 | 1323300263)) | (~(i429 | (-1074795649)))) * 516) + (((i430 | r9) * (-516)) - 1257986327));
                                                            if (((i427 & i431) | (i427 ^ i431)) != 0) {
                                                                int i432 = valueOf;
                                                                PngjUnsupportedException = (((i432 | 119) << 1) - (i432 ^ 119)) % Uuid.SIZE_BITS;
                                                                Object[] objArr142 = {new int[]{r4}, new int[1], null, new int[]{i}};
                                                                int i433 = (~(i & 272)) & (i | 272);
                                                                int maxMemory4 = (int) Runtime.getRuntime().maxMemory();
                                                                int i434 = ((((~((-372996405) | maxMemory4)) | 269564180) | (~(661569569 | maxMemory4))) * (-754)) - 1801235637;
                                                                int i435 = ~((-269564181) | maxMemory4);
                                                                int i436 = ~maxMemory4;
                                                                int A2 = defpackage.a.A(i436 | (-372996405), 754, ((i435 | (~(931133749 | i436))) * (-754)) + i434, -16);
                                                                int i437 = (A2 * 471) - 847479236;
                                                                int i438 = -(-(((A2 ^ i4) | (A2 & i4)) * (-470)));
                                                                int i439 = ((i437 | i438) << 1) - (i437 ^ i438);
                                                                int i440 = ~A2;
                                                                int i441 = (~((i440 & i206) | (i440 ^ i206))) | (~((i206 ^ i) | (i206 & i)));
                                                                int i442 = i77 | A2;
                                                                int i443 = ~((i442 & i4) | (i442 ^ i4));
                                                                int i444 = ((i441 & i443) | (i441 ^ i443)) * (-470);
                                                                int i445 = (i439 & i444) + (i444 | i439);
                                                                int i446 = (i206 ^ A2) | (i206 & A2);
                                                                int i447 = ~((i & i446) | (i446 ^ i));
                                                                int i448 = (A2 & i77) | (i77 ^ A2);
                                                                int i449 = ~((i448 & i4) | (i448 ^ i4));
                                                                int i450 = ((i447 & i449) | (i447 ^ i449)) * 470;
                                                                int i451 = (i445 & i450) + (i450 | i445);
                                                                int i452 = i451 << 13;
                                                                int i453 = (i452 & (~i451)) | ((~i452) & i451);
                                                                int i454 = i453 >>> 17;
                                                                int i455 = ((~i453) & i454) | ((~i454) & i453);
                                                                int i456 = i455 << 5;
                                                                ((int[]) objArr142[1])[0] = ((~i455) & i456) | ((~i456) & i455);
                                                                return objArr142;
                                                            }
                                                            long[] jArr3 = {624887784092251L};
                                                            int i457 = -(Process.myTid() >> 22);
                                                            int i458 = (i457 & 17) + (i457 | 17);
                                                            Object[] objArr143 = new Object[1];
                                                            b(new int[]{-229838068, -103181849, -7231920, -1161528912, 1375582240, -1562153806, 2142175454, -597428202, 82566478, 1805472041}, i458, objArr143);
                                                            Object[] objArr144 = {(String) objArr143[0], 3, 2251799813685247L, jArr3};
                                                            Object PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1000971846);
                                                            if (PngjBadSignature34 == null) {
                                                                int green2 = Color.green(0) + 35;
                                                                int i459 = (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)) + 1313;
                                                                int i460 = $$b;
                                                                byte b69 = (byte) (i460 + 1);
                                                                byte b70 = (byte) i460;
                                                                Object[] objArr145 = new Object[1];
                                                                a(b69, b70, (byte) (b70 - 1), objArr145);
                                                                PngjBadSignature34 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) - 1), green2, i459, 951651329, false, (String) objArr145[0], new Class[]{String.class, cls2, Long.TYPE, long[].class});
                                                            }
                                                            long longValue23 = ((Long) ((Method) PngjBadSignature34).invoke(null, objArr144)).longValue();
                                                            long j180 = -25919665;
                                                            long j181 = 614;
                                                            long j182 = j180 ^ j2;
                                                            long j183 = (j182 | longValue23) ^ j2;
                                                            long j184 = longValue23 ^ j2;
                                                            long j185 = ((j181 * ((((j182 | j184) | j79) ^ j2) | (((j79 | j180) | longValue23) ^ j2))) + (((-1228) * ((((j182 | j79) ^ j2) | j183) | ((j79 | longValue23) ^ j2))) + ((((j78 | j183) | ((j184 | j180) ^ j2)) * j181) + (((-613) * longValue23) + (615 * j180))))) - 153924504;
                                                            int i461 = ((int) (j185 >> 32)) & ((((~((-837115676) | i77)) | 25498626) * 560) + ((~((-1209008161) | i)) * (-560)) + (((~((-2020625210) | i77)) * (-560)) - 1517365430));
                                                            int i462 = ((int) j185) & ((((~((-713043031) | i77)) | (~(2144697855 | i77))) * 614) + (((~((-1787116920) | i77)) | 1074073889 | (~(1070623966 | i77))) * (-1228)) + ((1431654825 | i) * 614) + 402782539);
                                                            if (((i461 & i462) | (i461 ^ i462)) != 0) {
                                                                Object[] objArr146 = {new int[]{r5}, new int[]{r1 ^ (r1 << 5)}, null, new int[]{i}};
                                                                int i463 = (~(i & 275)) & (i | 275);
                                                                int A3 = defpackage.a.A(~((-2824601) | i), 566, (((~((-343874458) | i)) | 341049857) * (-566)) + 795256715, -16);
                                                                int i464 = A3 * (-112);
                                                                int i465 = (i464 ^ (-363843520)) + ((i464 & (-363843520)) << 1);
                                                                int i466 = ~(i206 | i77);
                                                                int i467 = ((i466 & A3) | (A3 ^ i466)) * 226;
                                                                int i468 = ((i465 | i467) << 1) - (i467 ^ i465);
                                                                int i469 = ~A3;
                                                                int i470 = ~((i469 ^ i4) | (i469 & i4));
                                                                int i471 = ~(i469 | i);
                                                                int i472 = (i471 & i470) | (i470 ^ i471);
                                                                int i473 = (i206 ^ i144) | (i206 & i144);
                                                                int i474 = ~((A3 & i473) | (i473 ^ A3));
                                                                int i475 = ((i474 & i472) | (i472 ^ i474)) * (-113);
                                                                int i476 = (i468 ^ i475) + ((i475 & i468) << 1);
                                                                int i477 = -(-((~((i206 & i) | (i206 ^ i))) * 113));
                                                                int i478 = ((i476 | i477) << 1) - (i477 ^ i476);
                                                                int i479 = i478 << 13;
                                                                int i480 = (i479 | i478) & (~(i478 & i479));
                                                                int i481 = i480 >>> 17;
                                                                int i482 = ((~i480) & i481) | ((~i481) & i480);
                                                                return objArr146;
                                                            }
                                                            Object[] objArr147 = new Object[1];
                                                            c("\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", true, new int[]{360, 11, 47, 0}, objArr147);
                                                            Object[] objArr148 = {(String) objArr147[0]};
                                                            Object PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1666380462);
                                                            if (PngjBadSignature35 == null) {
                                                                char pressedStateDuration2 = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                                                                int pressedStateDuration3 = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                                                                int keyRepeatTimeout = 1447 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                                                byte b71 = (byte) $$b;
                                                                byte b72 = b71;
                                                                Object[] objArr149 = new Object[1];
                                                                a(b71, b72, (byte) (b72 + 3), objArr149);
                                                                PngjBadSignature35 = com.d.e.a.PngjBadCrcException.PngjBadSignature(pressedStateDuration2, pressedStateDuration3, keyRepeatTimeout, -1614962923, false, (String) objArr149[0], new Class[]{String.class});
                                                            }
                                                            long longValue24 = ((Long) ((Method) PngjBadSignature35).invoke(null, objArr148)).longValue();
                                                            long j186 = -1357088952;
                                                            long j187 = -661;
                                                            long j188 = (j187 * longValue24) + (j187 * j186);
                                                            long elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                                            long j189 = j186 ^ j2;
                                                            long j190 = longValue24 ^ j2;
                                                            long j191 = (662 * (((j190 | j186) ^ j2) | ((j189 | longValue24) ^ j2))) + ((-1324) * (((j186 | elapsedCpuTime3) ^ j2) | ((elapsedCpuTime3 | longValue24) ^ j2))) + (1324 * ((elapsedCpuTime3 ^ j2) | ((j189 | j190) ^ j2))) + j188 + 1827577269;
                                                            int c21 = ((int) (j191 >> 32)) & defpackage.a.c((~((-1677611846) | i77)) | 38949120, 933, (((~(240385434 | i77)) | (-1677611846)) * (-933)) - 1347840694, -1038480062);
                                                            int i483 = ((int) j191) & ((((~((-918256135) | i77)) | 848965638 | (~(2008775247 | i))) * 676) + (((~(1939484751 | i77)) | 69290496) * 676) + (((-69290497) | i) * (-676)) + 1718551321);
                                                            if (!(!(((c21 & i483) | (c21 ^ i483)) != 0))) {
                                                                Object[] objArr150 = {new int[]{r4}, new int[1], null, new int[]{i}};
                                                                int i484 = (~(i & 276)) & (i | 276);
                                                                int i485 = 1767253027 - (~defpackage.a.A((~((~Process.myPid()) | 981549975)) | (-53015999), 783, ((~((-19444777) | r1)) * (-783)) - 403579770, -16));
                                                                int i486 = i485 << 13;
                                                                int i487 = (i486 | i485) & (~(i485 & i486));
                                                                int i488 = i487 >>> 17;
                                                                int i489 = ((~i487) & i488) | ((~i488) & i487);
                                                                ((int[]) objArr150[1])[0] = i489 ^ (i489 << 5);
                                                                return objArr150;
                                                            }
                                                            int i490 = valueOf + 63;
                                                            PngjUnsupportedException = i490 % Uuid.SIZE_BITS;
                                                            if (i490 % 2 == 0) {
                                                                Object PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1617763359);
                                                                if (PngjBadSignature36 == null) {
                                                                    char c22 = (char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1));
                                                                    int defaultSize5 = 31 - View.getDefaultSize(0, 0);
                                                                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1381;
                                                                    byte b73 = (byte) $$b;
                                                                    byte b74 = b73;
                                                                    Object[] objArr151 = new Object[1];
                                                                    a(b73, b74, (byte) (b74 + 3), objArr151);
                                                                    PngjBadSignature36 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c22, defaultSize5, scrollDefaultDelay, -1669172828, false, (String) objArr151[0], new Class[0]);
                                                                }
                                                                long longValue25 = ((Long) ((Method) PngjBadSignature36).invoke(null, null)).longValue();
                                                                long j192 = -1025849593;
                                                                long j193 = (949 * longValue25) + ((-947) * j192);
                                                                long j194 = -948;
                                                                long j195 = j192 ^ j2;
                                                                long j196 = longValue25 ^ j2;
                                                                long a3 = defpackage.a.a();
                                                                long j197 = ((948 * (j192 | j196)) + ((j194 * (((j195 | j196) | (a3 ^ j2)) ^ j2)) + (((j195 | ((j196 | a3) ^ j2)) * j194) + j193))) - 20844916;
                                                                int i491 = ((int) (j197 >> 12)) & ((((~((-1649355338) | i)) | 212128926) * 301) + (((~(212128926 | i)) | (~(1649355337 | i77))) * (-301)) + (((~((-211866775) | i)) * (-301)) - 523788574));
                                                                int i492 = ((int) j197) & ((((-1613912067) | i) * 744) + ((176685656 | i77) * 744) + (((((~(181143384 | i)) | 1613912066) | (~((-1618369795) | i))) * (-744)) - 1587633331));
                                                            } else {
                                                                Object PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1617763359);
                                                                if (PngjBadSignature37 == null) {
                                                                    char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(j);
                                                                    int resolveOpacity = 31 - Drawable.resolveOpacity(0, 0);
                                                                    int green3 = 1381 - Color.green(0);
                                                                    byte b75 = (byte) $$b;
                                                                    byte b76 = b75;
                                                                    Object[] objArr152 = new Object[1];
                                                                    a(b75, b76, (byte) (b76 + 3), objArr152);
                                                                    PngjBadSignature37 = com.d.e.a.PngjBadCrcException.PngjBadSignature(packedPositionGroup, resolveOpacity, green3, -1669172828, false, (String) objArr152[0], new Class[0]);
                                                                }
                                                                long longValue26 = ((Long) ((Method) PngjBadSignature37).invoke(null, null)).longValue();
                                                                long j198 = 533384473;
                                                                long j199 = 449;
                                                                long j200 = ((j198 ^ j2) | longValue26) ^ j2;
                                                                long j201 = longValue26 ^ j2;
                                                                long j202 = ((j199 * (j200 | ((j198 | (j201 | j79)) ^ j2))) + (((-1347) * j200) + (((j200 | (((j201 | j198) | j78) ^ j2)) * j199) + (((-448) * longValue26) + (450 * j198))))) - 1580078982;
                                                                int freeMemory2 = (int) Runtime.getRuntime().freeMemory();
                                                                int i493 = ((int) (j202 >> 32)) & ((((~freeMemory2) | (-1360527462)) * 756) + (((~((-1360527462) | freeMemory2)) | (-1497213424)) * (-756)) + 1181854242);
                                                                int i494 = ((int) j202) & ((((~((-42060385) | i77)) | (~((-1479286795) | i77))) * 614) + (((~(1501438095 | i77)) | (-1543498480) | (~(64211685 | i77))) * (-1228)) + ((((-1521347179) | i) * 614) - 673517641));
                                                            }
                                                        }
                                                    }
                                                    c4 = 3;
                                                    if ((((int[]) objArr[c4])[c3] == ((int[]) objArr[c3])[c3] ? 'J' : (char) 28) != 'J') {
                                                    }
                                                }
                                            }
                                        } catch (Throwable th10) {
                                            Throwable cause4 = th10.getCause();
                                            if (cause4 != null) {
                                                throw cause4;
                                            }
                                            throw th10;
                                        }
                                    }
                                }
                                i6 = 0;
                                if (i6 == 0) {
                                }
                            }
                            z2 = false;
                            if (!z2) {
                            }
                        }
                        z = false;
                        if (!z) {
                        }
                    }
                    Object[] objArr153 = new Object[4];
                    int[] iArr3 = new int[1];
                    objArr153[i2] = iArr3;
                    objArr153[1] = new int[1];
                    int[] iArr4 = new int[1];
                    objArr153[3] = iArr4;
                    int i495 = (i & (-272)) | ((~i) & 271);
                    iArr4[i2] = i;
                    iArr3[i2] = i495;
                    objArr153[2] = null;
                    int i496 = (int) Runtime.getRuntime().totalMemory();
                    int i497 = (((~(i496 | 202951076)) | 1032431125) * 70) + ((~(1033498549 | i496)) * 70) + ((((~(831614897 | i496)) | 201883652) * (-140)) - 22228537);
                    int values6 = com.identy.a.PngjException.values();
                    int i498 = i497 * (-195);
                    int i499 = ((-6256) ^ i498) + ((i498 & (-6256)) << 1);
                    int i500 = ~i497;
                    int i501 = ~((i500 ^ 16) | (i500 & 16));
                    int i502 = ~((i497 ^ values6) | (i497 & values6));
                    int i503 = -(-(((i501 & i502) | (i501 ^ i502)) * (-196)));
                    int i504 = (((i499 & i503) + (i503 | i499)) - (~(((i497 ^ 16) | (i497 & 16)) * 392))) - 1;
                    int i505 = ~((i500 & (-17)) | ((-17) ^ i500));
                    int i506 = ~(i497 | values6);
                    int i507 = 1767253027 - (~(-(-((i504 - (~(-(-(((i506 & i505) | (i505 ^ i506)) * 196))))) - 1))));
                    int i508 = (i507 << 13) ^ i507;
                    int i509 = i508 >>> 17;
                    int i510 = (i508 | i509) & (~(i508 & i509));
                    int i511 = i510 << 5;
                    ((int[]) objArr153[1])[i2] = ((~i510) & i511) | ((~i511) & i510);
                    return objArr153;
                }
                Object PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1085800324);
                if (PngjBadSignature38 == null) {
                    char makeMeasureSpec2 = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 1179);
                    int i512 = (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 44;
                    int capsMode = TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 1092;
                    int i513 = $$b;
                    byte b77 = (byte) (i513 + 1);
                    byte b78 = (byte) i513;
                    Object[] objArr154 = new Object[1];
                    a(b77, b78, (byte) (b78 - 1), objArr154);
                    PngjBadSignature38 = com.d.e.a.PngjBadCrcException.PngjBadSignature(makeMeasureSpec2, i512, capsMode, -1135046081, false, (String) objArr154[0], new Class[0]);
                }
                long longValue27 = ((Long) ((Method) PngjBadSignature38).invoke(null, null)).longValue();
                long j203 = 1796714369;
                i2 = 0;
                long j204 = -1;
                long j205 = j203 ^ j204;
                long j206 = ((-1434) * (longValue27 | j205)) + (1435 * longValue27) + ((-716) * j203);
                long j207 = 717;
                cls = cls3;
                long j208 = i;
                long j209 = j208 ^ j204;
                long j210 = (j203 | longValue27) ^ j204;
                long j211 = j205 | (longValue27 ^ j204);
                long j212 = (j207 * ((j204 ^ (longValue27 | j208)) | j210 | ((j211 | j209) ^ j204))) + ((((j209 | longValue27) ^ j204) | j210 | ((j211 | j208) ^ j204)) * j207) + j206 + 128201948;
                int i514 = ~((int) Runtime.getRuntime().totalMemory());
            } catch (Throwable th11) {
                cause = th11.getCause();
                if (cause == null) {
                }
            }
            cause = th11.getCause();
            if (cause == null) {
                throw cause;
            }
            throw th11;
            i8 = 0;
            if (i8 == 0) {
            }
            if (i9 == 0) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:4:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void a(int i, short s, short s2, Object[] objArr) {
            int i2;
            byte[] bArr = $$a;
            int i3 = 4 - s;
            int i4 = s2 + 97;
            byte[] bArr2 = new byte[3 - i];
            int i5 = 2 - i;
            if (bArr == null) {
                int i6 = i4;
                i2 = 0;
                i4 = i5;
                i4 = (i4 + i6) - 23;
                bArr2[i2] = (byte) i4;
                i3++;
                if (i2 == i5) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i6 = bArr[i3];
                i2++;
                i4 = (i4 + i6) - 23;
                bArr2[i2] = (byte) i4;
                i3++;
                if (i2 == i5) {
                }
            } else {
                i2 = 0;
                bArr2[i2] = (byte) i4;
                i3++;
                if (i2 == i5) {
                }
            }
        }

        private static void b(int[] iArr, int i, Object[] objArr) {
            int i2;
            long j;
            char c;
            int i3;
            int i4;
            int i5;
            com.d.e.PngBadCharsetException pngBadCharsetException = new com.d.e.PngBadCharsetException();
            char[] cArr = new char[4];
            int i6 = 2;
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = PngjException;
            int i7 = 1618428774;
            Class cls = Integer.TYPE;
            int i8 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = 0;
                while (i9 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i7);
                        if (PngjBadSignature2 == null) {
                            i5 = i7;
                            i4 = i6;
                            byte b = (byte) 0;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.MeasureSpec.getSize(0), 31 - Color.alpha(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1381, -1667748131, false, $$e(b, (byte) (b | 57), b), new Class[]{cls});
                        } else {
                            i4 = i6;
                            i5 = i7;
                        }
                        iArr3[i9] = ((Integer) ((Method) PngjBadSignature2).invoke(null, objArr2)).intValue();
                        i9++;
                        i7 = i5;
                        i6 = i4;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int i10 = i6;
            int i11 = i7;
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = PngjException;
            int i12 = 16;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i13 = 0;
                while (i13 < length3) {
                    int i14 = $11 + 5;
                    $10 = i14 % Uuid.SIZE_BITS;
                    if (i14 % 2 != 0) {
                        Object[] objArr3 = {Integer.valueOf(iArr5[i13])};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i11);
                        if (PngjBadSignature3 == null) {
                            i3 = i12;
                            byte b2 = (byte) i8;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (ViewConfiguration.getMaximumFlingVelocity() >> i12), ExpandableListView.getPackedPositionGroup(0L) + 31, View.resolveSize(i8, i8) + 1381, -1667748131, false, $$e(b2, (byte) (b2 | 57), b2), new Class[]{cls});
                        } else {
                            i3 = i12;
                        }
                        iArr6[i13] = ((Integer) ((Method) PngjBadSignature3).invoke(null, objArr3)).intValue();
                    } else {
                        i3 = i12;
                        Object[] objArr4 = {Integer.valueOf(iArr5[i13])};
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i11);
                        if (PngjBadSignature4 == null) {
                            byte b3 = (byte) 0;
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) View.resolveSize(0, 0), 31 - ExpandableListView.getPackedPositionGroup(0L), ExpandableListView.getPackedPositionGroup(0L) + 1381, -1667748131, false, $$e(b3, (byte) (b3 | 57), b3), new Class[]{cls});
                        }
                        iArr6[i13] = ((Integer) ((Method) PngjBadSignature4).invoke(null, objArr4)).intValue();
                    }
                    i13++;
                    i12 = i3;
                    i8 = 0;
                }
                i2 = i12;
                j = 0;
                $10 = ($11 + com.karumi.dexter.R.styleable.AppCompatTheme_tooltipFrameBackground) % Uuid.SIZE_BITS;
                iArr5 = iArr6;
                i8 = 0;
            } else {
                i2 = 16;
                j = 0;
            }
            System.arraycopy(iArr5, i8, iArr4, i8, length2);
            pngBadCharsetException.values = i8;
            while (true) {
                int i15 = pngBadCharsetException.values;
                if (i15 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i);
                    return;
                }
                $10 = ($11 + 61) % Uuid.SIZE_BITS;
                int i16 = iArr[i15];
                char c2 = (char) (i16 >> 16);
                cArr[0] = c2;
                char c3 = (char) i16;
                char c4 = 1;
                cArr[1] = c3;
                char c5 = (char) (iArr[i15 + 1] >> 16);
                cArr[i10] = c5;
                char c6 = (char) iArr[i15 + 1];
                cArr[3] = c6;
                pngBadCharsetException.PngjException = (c2 << 16) + c3;
                pngBadCharsetException.PngjBadCrcException = (c5 << 16) + c6;
                com.d.e.PngBadCharsetException.values(iArr4);
                int i17 = 0;
                while (i17 < i2) {
                    $11 = ($10 + 103) % Uuid.SIZE_BITS;
                    int i18 = pngBadCharsetException.PngjException ^ iArr4[i17];
                    pngBadCharsetException.PngjException = i18;
                    int PngjBadCrcException = com.d.e.PngBadCharsetException.PngjBadCrcException(i18);
                    Object[] objArr5 = new Object[4];
                    objArr5[3] = pngBadCharsetException;
                    objArr5[i10] = pngBadCharsetException;
                    objArr5[c4] = Integer.valueOf(PngjBadCrcException);
                    objArr5[0] = pngBadCharsetException;
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-2104166611);
                    if (PngjBadSignature5 == null) {
                        byte b4 = (byte) 0;
                        byte b5 = b4;
                        c = c4;
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (2786 - Color.argb(0, 0, 0, 0)), 37 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 786, 2122029718, false, $$e(b4, b5, b5), new Class[]{Object.class, cls, Object.class, Object.class});
                    } else {
                        c = c4;
                    }
                    int intValue = ((Integer) ((Method) PngjBadSignature5).invoke(null, objArr5)).intValue();
                    pngBadCharsetException.PngjException = pngBadCharsetException.PngjBadCrcException;
                    pngBadCharsetException.PngjBadCrcException = intValue;
                    i17++;
                    c4 = c;
                    i2 = 16;
                }
                char c7 = c4;
                int i19 = pngBadCharsetException.PngjException;
                int i20 = pngBadCharsetException.PngjBadCrcException;
                pngBadCharsetException.PngjException = i20;
                pngBadCharsetException.PngjBadCrcException = i19;
                i2 = 16;
                int i21 = i19 ^ iArr4[16];
                pngBadCharsetException.PngjBadCrcException = i21;
                int i22 = i20 ^ iArr4[17];
                pngBadCharsetException.PngjException = i22;
                cArr[0] = (char) (i22 >>> 16);
                cArr[c7] = (char) i22;
                cArr[i10] = (char) (i21 >>> 16);
                cArr[3] = (char) i21;
                com.d.e.PngBadCharsetException.values(iArr4);
                int i23 = pngBadCharsetException.values;
                cArr2[i23 * 2] = cArr[0];
                cArr2[(i23 * 2) + 1] = cArr[c7];
                cArr2[(i23 * 2) + 2] = cArr[i10];
                cArr2[(i23 * 2) + 3] = cArr[3];
                int i24 = i10;
                Object[] objArr6 = new Object[i24];
                objArr6[c7] = pngBadCharsetException;
                objArr6[0] = pngBadCharsetException;
                Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-800662452);
                if (PngjBadSignature6 == null) {
                    PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) KeyEvent.normalizeMetaState(0), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 21, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 29, 749318647, false, "E", new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature6).invoke(null, objArr6);
                i10 = i24;
            }
        }

        private static void c(String str, boolean z, int[] iArr, Object[] objArr) {
            byte[] bArr;
            int i;
            byte[] bArr2;
            String str2 = str;
            $11 = ($10 + 75) % Uuid.SIZE_BITS;
            byte[] bArr3 = str2;
            if (str2 != null) {
                bArr3 = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr4 = bArr3;
            com.d.e.e1 e1Var = new com.d.e.e1();
            int i2 = 0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            char[] cArr = PngjBadSignature;
            Class cls = Integer.TYPE;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i7 = 0;
                while (i7 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-259747866);
                        if (PngjBadSignature2 == null) {
                            bArr2 = bArr4;
                            byte b = (byte) i2;
                            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) Color.red(i2), 35 - (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.getDeadChar(i2, i2) + 1313, 208396893, false, $$e(b, (byte) (b | 35), b), new Class[]{cls});
                        } else {
                            bArr2 = bArr4;
                        }
                        cArr2[i7] = ((Character) ((Method) PngjBadSignature2).invoke(null, objArr2)).charValue();
                        i7++;
                        bArr4 = bArr2;
                        i2 = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                bArr = bArr4;
                $10 = ($11 + 3) % Uuid.SIZE_BITS;
                cArr = cArr2;
            } else {
                bArr = bArr4;
            }
            char[] cArr3 = new char[i4];
            System.arraycopy(cArr, i3, cArr3, 0, i4);
            if (bArr != null) {
                char[] cArr4 = new char[i4];
                e1Var.PngjBadSignature = 0;
                char c = 0;
                while (true) {
                    int i8 = e1Var.PngjBadSignature;
                    if (i8 >= i4) {
                        break;
                    }
                    if (bArr[i8] == 1) {
                        Object[] objArr3 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(c)};
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-655108508);
                        if (PngjBadSignature3 == null) {
                            byte b2 = (byte) 0;
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (31882 - View.getDefaultSize(0, 0)), 32 - TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0), TextUtils.getOffsetBefore(BuildConfig.FLAVOR, 0) + 1250, 605862879, false, $$e(b2, (byte) (b2 | 34), b2), new Class[]{cls, cls});
                        }
                        cArr4[i8] = ((Character) ((Method) PngjBadSignature3).invoke(null, objArr3)).charValue();
                    } else {
                        Object[] objArr4 = {Integer.valueOf(cArr3[i8]), Integer.valueOf(c)};
                        Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(269554740);
                        if (PngjBadSignature4 == null) {
                            byte b3 = (byte) 0;
                            PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Process.myTid() >> 22), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 35, 1598 - ExpandableListView.getPackedPositionGroup(0L), -318867057, false, $$e(b3, (byte) (b3 | 37), b3), new Class[]{cls, cls});
                        }
                        cArr4[i8] = ((Character) ((Method) PngjBadSignature4).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[e1Var.PngjBadSignature];
                    Object[] objArr5 = {e1Var, e1Var};
                    Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(1060060353);
                    if (PngjBadSignature5 == null) {
                        PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) ((-1) - MotionEvent.axisFromString(BuildConfig.FLAVOR)), 35 - TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0), 155 - Color.blue(0), -1010806406, false, "g", new Class[]{Object.class, Object.class});
                    }
                    ((Method) PngjBadSignature5).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i6 > 0) {
                char[] cArr5 = new char[i4];
                i = 0;
                System.arraycopy(cArr3, 0, cArr5, 0, i4);
                int i9 = i4 - i6;
                System.arraycopy(cArr5, 0, cArr3, i9, i6);
                System.arraycopy(cArr5, i6, cArr3, 0, i9);
            } else {
                i = 0;
            }
            if (z) {
                char[] cArr6 = new char[i4];
                e1Var.PngjBadSignature = i;
                while (true) {
                    int i10 = e1Var.PngjBadSignature;
                    if (i10 >= i4) {
                        break;
                    }
                    cArr6[i10] = cArr3[(i4 - i10) - 1];
                    e1Var.PngjBadSignature = i10 + 1;
                }
                cArr3 = cArr6;
            }
            if (i5 > 0) {
                $10 = ($11 + 21) % Uuid.SIZE_BITS;
                e1Var.PngjBadSignature = 0;
                while (true) {
                    int i11 = e1Var.PngjBadSignature;
                    if (i11 >= i4) {
                        break;
                    }
                    $10 = ($11 + 93) % Uuid.SIZE_BITS;
                    cArr3[i11] = (char) (cArr3[i11] - iArr[2]);
                    e1Var.PngjBadSignature = i11 + 1;
                }
            }
            String str3 = new String(cArr3);
            $10 = ($11 + 41) % Uuid.SIZE_BITS;
            objArr[0] = str3;
        }

        public static void init$0() {
            $$a = new byte[]{34, -5, 8, -42, -29, 13, 28};
            $$b = 1;
        }

        public static void init$1() {
            $$c = new byte[]{15, 64, -39, -48};
            $$d = 102;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        
            r0 = r6.values;
            r2 = r6.values;
            r0.getPadSub1 = new com.identy.ui.c.PngjExceptionInternal(r2, r2.PngjBadCrcException, r6.PngjBadCrcException, r2.getQualityScore);
            r0 = new android.view.WindowManager.LayoutParams();
            r0.copyFrom(r6.values.getPadSub1.getWindow().getAttributes());
            ((android.view.ViewGroup.LayoutParams) r0).width = -1;
            r6.values.getPadSub1.show();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
        
            if (com.identy.FingerActivity.PngjPrematureEnding != false) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
        
            if (com.identy.FingerActivity.PngjPrematureEnding != false) goto L9;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void run() {
            int i = valueOf + 113;
            PngjUnsupportedException = i % Uuid.SIZE_BITS;
            if (i % 2 == 0) {
                int i2 = 73 / 0;
            }
            int i3 = PngjUnsupportedException + 95;
            valueOf = i3 % Uuid.SIZE_BITS;
            if (i3 % 2 != 0) {
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$i(short s, int i, int i2) {
        int i3;
        int i4;
        int i5 = 120 - (s * 5);
        byte[] bArr = $$c;
        int i6 = 1 - (i * 2);
        int i7 = 3 - (i2 * 2);
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            byte[] bArr3 = bArr;
            i4 = 0;
            int i8 = i7;
            i5 += i7;
            i7 = i8;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            int i9 = i7 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                return new String(bArr2, 0);
            }
            byte b = bArr[i9];
            i7 = i5;
            i5 = b;
            bArr3 = bArr;
            i8 = i9;
            i5 += i7;
            i7 = i8;
            bArr = bArr3;
            i3 = i4;
            i4 = i3 + 1;
            int i92 = i7 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            int i922 = i7 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        valueOf = 0;
        getScore = 1;
        values = -393088926020687816L;
    }

    private static void b(byte b, int i, byte b2, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = i * 6;
        int i3 = 21 - (b * 18);
        int i4 = (b2 * 3) + 80;
        byte[] bArr2 = new byte[19 - i2];
        int i5 = 18 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = i5 + (-i4) + 5;
            bArr = bArr;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            i3++;
            bArr2[i7] = (byte) i4;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i4 + (-bArr[i3]) + 5;
            bArr = bArr;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void c(String str, int i, Object[] objArr) {
        char[] cArr;
        Throwable cause;
        char c;
        long j;
        int i2;
        if (str != null) {
            $11 = ($10 + 23) % Uuid.SIZE_BITS;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        char[] cArr2 = cArr;
        com.d.e.PngjUnsupportedException pngjUnsupportedException = new com.d.e.PngjUnsupportedException();
        pngjUnsupportedException.PngjBadCrcException = i;
        int length = cArr2.length;
        long[] jArr = new long[length];
        pngjUnsupportedException.valueOf = 0;
        $10 = ($11 + 63) % Uuid.SIZE_BITS;
        while (true) {
            int i3 = pngjUnsupportedException.valueOf;
            if (i3 >= cArr2.length) {
                break;
            }
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i3]), pngjUnsupportedException, pngjUnsupportedException};
                Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-930920279);
                if (PngjBadSignature2 == null) {
                    char indexOf = (char) TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
                    int i4 = 48 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    i2 = -125632871;
                    int resolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 944;
                    c = 1;
                    byte b = (byte) ($$f & 7);
                    j = 0;
                    byte b2 = (byte) (b - 1);
                    PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(indexOf, i4, resolveSizeAndState, 879502610, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                } else {
                    c = 1;
                    j = 0;
                    i2 = -125632871;
                }
                jArr[i3] = ((Long) ((Method) PngjBadSignature2).invoke(null, objArr2)).longValue() ^ (values ^ 2636593786896957769L);
                Object[] objArr3 = new Object[2];
                objArr3[c] = pngjUnsupportedException;
                objArr3[0] = pngjUnsupportedException;
                Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i2);
                if (PngjBadSignature3 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (35510 - MotionEvent.axisFromString(BuildConfig.FLAVOR)), (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) + 41, 507 - Color.red(0), 74289954, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) PngjBadSignature3).invoke(null, objArr3);
                $11 = ($10 + 117) % Uuid.SIZE_BITS;
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr3 = new char[length];
        pngjUnsupportedException.valueOf = 0;
        $11 = ($10 + 123) % Uuid.SIZE_BITS;
        while (true) {
            int i5 = pngjUnsupportedException.valueOf;
            if (i5 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            }
            cArr3[i5] = (char) jArr[i5];
            Object[] objArr4 = {pngjUnsupportedException, pngjUnsupportedException};
            Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-125632871);
            if (PngjBadSignature4 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (Color.alpha(0) + 35511), 41 - ((byte) KeyEvent.getModifierMetaStateMask()), 507 - (ViewConfiguration.getTouchSlop() >> 8), 74289954, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) PngjBadSignature4).invoke(null, objArr4);
        }
    }

    public static void init$0() {
        $$a = new byte[]{66, 72, 81, -110, -25, 12, 2, 45, -26, 2, 38, -42, 20, 35, -46, 26, 3, -6, 1, 16, -1, 6, -25, 12, 2, 42, -46, 26, 3, -6, 1, 16, -1, 6};
        $$b = 95;
    }

    public static void init$1() {
        $$c = new byte[]{100, 91, -82, 96};
        $$f = 249;
    }

    @Override // com.identy.FingerActivity, com.identy.d.PngjBadSignature
    public void PngjException(HashMap<Pair<Hand, Finger>, a> hashMap, HashMap<Pair<Hand, Finger>, a> hashMap2, Bitmap bitmap, boolean z, boolean z2) {
        super.PngjException(hashMap, hashMap2, bitmap, z, z2);
        if (z && this.getAsHighestSecurityLevelReached) {
            this.PngjBadCrcException.clear();
            this.PngjBadCrcException.putAll(hashMap);
            try {
                e1.values(new Object[]{this.onErrorResponse}, com.identy.i.PngjPrematureEnding.values(), com.identy.i.PngjPrematureEnding.values(), -431637600, com.identy.i.PngjPrematureEnding.values(), 431637601, com.identy.i.PngjPrematureEnding.values());
                IdentySdk identySdk = IdentySdk.getInstance();
                FingerDetectionMode fingerDetectionMode = this.PngjExceptionInternal;
                e1 e1Var = this.onErrorResponse;
                long j = e1Var.toString;
                long j2 = e1Var.Enroll2IndexActivity;
                int i = e1Var.getEncryptedTemplates;
                byte[] PngjPrematureEnding = e1Var.PngjPrematureEnding();
                e1 e1Var2 = this.onErrorResponse;
                identySdk.a(fingerDetectionMode, hashMap, j, j2, 0L, i, PngjPrematureEnding, e1Var2.setFoundMatchingTemplates + e1Var2.Enroll2IndexActivity, e1Var2.closeDialog, e1Var2.getHeight, e1Var2.ERRORS);
            } catch (Exception e) {
                try {
                    if (LibSettings.isSaveCaptured()) {
                        e.getMessage();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            try {
                if (IdentySdk.getInstance().isDisplayPrints()) {
                    runOnUiThread(new PngjBadSignature(hashMap2));
                    getScore = (valueOf + 77) % Uuid.SIZE_BITS;
                    return;
                }
                if (IdentySdk.getInstance().v()) {
                    if (FingerActivity.PngjPrematureEnding) {
                        com.identy.ui.c.PngjUnsupportedException pngjUnsupportedException = new com.identy.ui.c.PngjUnsupportedException(this, this.getQualityScore, this.PngjExceptionInternal, (FingerDetectionMode) FingerActivity.PngjException(com.identy.a.PngjException.values(), -388390624, new Object[]{this}, com.identy.a.PngjException.values(), 388390631, com.identy.a.PngjException.values(), com.identy.a.PngjException.values()));
                        this.getPadSub1 = pngjUnsupportedException;
                        pngjUnsupportedException.show();
                        return;
                    }
                    return;
                }
                if (!IdentySdk.getInstance().isDisplayMoveNextDialog()) {
                    Action();
                    return;
                }
                int i2 = valueOf + 69;
                getScore = i2 % Uuid.SIZE_BITS;
                if (i2 % 2 != 0) {
                    Attempt();
                } else {
                    Attempt();
                    throw null;
                }
            } catch (Exception e3) {
                try {
                    if (LibSettings.isSaveCaptured()) {
                        int i3 = getScore + 71;
                        valueOf = i3 % Uuid.SIZE_BITS;
                        if (i3 % 2 != 0) {
                            e3.getMessage();
                            int i4 = 18 / 0;
                        } else {
                            e3.getMessage();
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0338  */
    @Override // com.identy.FingerActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void attachBaseContext(Context context) {
        int i;
        char c;
        int intValue;
        Object[] PngjException$52c725b;
        float f;
        int i2;
        int i3;
        super.attachBaseContext(context);
        Object PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(864471691);
        if (PngjBadSignature2 == null) {
            char keyRepeatDelay = (char) (14830 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
            int i4 = 28 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
            int indexOf = TextUtils.indexOf((CharSequence) BuildConfig.FLAVOR, '0', 0) + 722;
            byte b = $$a[18];
            byte b2 = (byte) (b - 1);
            Object[] objArr = new Object[1];
            b(b, b2, b2, objArr);
            PngjBadSignature2 = com.d.e.a.PngjBadCrcException.PngjBadSignature(keyRepeatDelay, i4, indexOf, -815159504, false, (String) objArr[0], null);
        }
        long j = ((Field) PngjBadSignature2).getLong(null);
        try {
            try {
                if (j != -1) {
                    valueOf = (getScore + 85) % Uuid.SIZE_BITS;
                    long j2 = j + 4611686018427387801L;
                    i = 864471691;
                    Object[] objArr2 = new Object[1];
                    c("椐俖⒇ᵘ\uf23aꣵ膣映彖㐓\uea85쎁롤鄷矻ⳓ\u058c恵팿觵溦䝧", ((Process.getThreadPriority(0) + 20) >> 6) + 9929, objArr2);
                    Class<?> cls = Class.forName((String) objArr2[0]);
                    c = 18;
                    Object[] objArr3 = new Object[1];
                    c("椔\ue7c6璦얐剮ꍓ〷軞ῌ沣ﶓ䩬\udb5c⠃ꛮ", 36571 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
                    if (j2 >= ((Long) cls.getDeclaredMethod((String) objArr3[0], null).invoke(null, null)).longValue()) {
                        Object PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
                        if (PngjBadSignature3 == null) {
                            char deadChar = (char) (14830 - KeyEvent.getDeadChar(0, 0));
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28;
                            int edgeSlop = 721 - (ViewConfiguration.getEdgeSlop() >> 16);
                            byte b3 = $$a[18];
                            byte b4 = (byte) (b3 - 1);
                            byte b5 = b3;
                            Object[] objArr4 = new Object[1];
                            b(b4, b5, (byte) (b5 - 1), objArr4);
                            PngjBadSignature3 = com.d.e.a.PngjBadCrcException.PngjBadSignature(deadChar, keyRepeatTimeout, edgeSlop, -779023007, false, (String) objArr4[0], null);
                        }
                        Object[] objArr5 = (Object[]) ((Field) PngjBadSignature3).get(null);
                        PngjException$52c725b = new Object[]{new int[]{r5}, new int[1], r0, new int[]{r4}};
                        int i5 = ((int[]) objArr5[3])[0];
                        int i6 = ((int[]) objArr5[0])[0];
                        String[] strArr = (String[]) objArr5[2];
                        int elapsedRealtime = (int) SystemClock.elapsedRealtime();
                        int c2 = defpackage.a.c((~(elapsedRealtime | 645741323)) | (~((-388824651) | elapsedRealtime)) | 285262912, 407, (((~(388824650 | elapsedRealtime)) | (~((~elapsedRealtime) | (-645741324))) | 285262912) * 407) + (((542179585 | r2) * (-814)) - 1112373114), 1767253028);
                        int i7 = c2 ^ (c2 << 13);
                        int i8 = i7 ^ (i7 >>> 17);
                        ((int[]) PngjException$52c725b[1])[0] = i8 ^ (i8 << 5);
                        i2 = ((int[]) PngjException$52c725b[0])[0];
                        i3 = ((int[]) PngjException$52c725b[3])[0];
                        if (i3 != i2) {
                            Object[] objArr6 = {new int[]{r8}, new int[1], r1, new int[]{r5}};
                            int i9 = ((int[]) PngjException$52c725b[1])[0];
                            int i10 = ((int[]) PngjException$52c725b[3])[0];
                            int i11 = ((int[]) PngjException$52c725b[0])[0];
                            String[] strArr2 = (String[]) PngjException$52c725b[2];
                            int d = defpackage.a.d(~((~System.identityHashCode(this)) | (-33833513)), -948, (((~((-579204654) | r1)) | (-455361321)) * (-948)) - 1821038631, -1615767096, i9);
                            int i12 = d ^ (d << 13);
                            int i13 = i12 ^ (i12 >>> 17);
                            ((int[]) objArr6[1])[0] = i13 ^ (i13 << 5);
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        String[] strArr3 = (String[]) PngjException$52c725b[2];
                        if (strArr3 != null) {
                            for (String str : strArr3) {
                                valueOf = (getScore + 97) % Uuid.SIZE_BITS;
                                arrayList.add(str);
                            }
                        }
                        int[] iArr = new int[i3];
                        int i14 = i3 - 1;
                        iArr[i14] = 1;
                        Toast.makeText((Context) null, iArr[((i3 * i14) % 2) - 1], 1).show();
                        Object[] objArr7 = {new int[]{r8}, new int[1], r1, new int[]{r5}};
                        int i15 = ((int[]) PngjException$52c725b[1])[0];
                        int i16 = ((int[]) PngjException$52c725b[3])[0];
                        int i17 = ((int[]) PngjException$52c725b[0])[0];
                        String[] strArr4 = (String[]) PngjException$52c725b[2];
                        int myPid = Process.myPid();
                        int c3 = defpackage.a.c(myPid | 170338380, 104, ((~((~myPid) | 1000814925)) * (-104)) + (((~((-864227594) | myPid)) | 33751048) * 104) + 813887181, i15);
                        int i18 = c3 ^ (c3 << 13);
                        int i19 = i18 ^ (i18 >>> 17);
                        ((int[]) objArr7[1])[0] = i19 ^ (i19 << 5);
                        return;
                    }
                } else {
                    i = 864471691;
                    c = 18;
                }
                Object[] objArr8 = new Object[1];
                c("椐俖⒇ᵘ\uf23aꣵ膣映彖㐓\uea85쎁롤鄷矻ⳓ\u058c恵팿觵溦䝧", (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 9928, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c("椔\ue7c6璦얐剮ꍓ〷軞ῌ沣ﶓ䩬\udb5c⠃ꛮ", 36570 - ImageFormat.getBitsPerPixel(0), objArr9);
                Long valueOf2 = Long.valueOf(((Long) cls2.getDeclaredMethod((String) objArr9[0], null).invoke(null, null)).longValue());
                Object PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(i);
                if (PngjBadSignature4 == null) {
                    char capsMode = (char) (TextUtils.getCapsMode(BuildConfig.FLAVOR, 0, 0) + 14830);
                    int size = 28 - View.MeasureSpec.getSize(0);
                    int rgb = (-16776495) - Color.rgb(0, 0, 0);
                    byte b6 = $$a[c];
                    byte b7 = (byte) (b6 - 1);
                    Object[] objArr10 = new Object[1];
                    b(b6, b7, b7, objArr10);
                    PngjBadSignature4 = com.d.e.a.PngjBadCrcException.PngjBadSignature(capsMode, size, rgb, -815159504, false, (String) objArr10[0], null);
                }
                ((Field) PngjBadSignature4).set(null, valueOf2);
                i2 = ((int[]) PngjException$52c725b[0])[0];
                i3 = ((int[]) PngjException$52c725b[3])[0];
                if (i3 != i2) {
                }
            } catch (Exception unused) {
                throw new RuntimeException();
            }
            Object[] objArr11 = {-998207093};
            Object PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature(-1439412966);
            if (PngjBadSignature5 == null) {
                PngjBadSignature5 = com.d.e.a.PngjBadCrcException.PngjBadSignature((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 24 - ((Process.getThreadPriority(0) + 20) >> 6), 696 - TextUtils.lastIndexOf(BuildConfig.FLAVOR, '0'), 1457201313, false, null, new Class[]{Integer.TYPE});
            }
            PngjException$52c725b = PngjBadSignature.PngjException$52c725b(intValue, ((Constructor) PngjBadSignature5).newInstance(objArr11));
            Object PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(763257050);
            if (PngjBadSignature6 == null) {
                char c4 = (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14830);
                int indexOf2 = TextUtils.indexOf(BuildConfig.FLAVOR, BuildConfig.FLAVOR) + 28;
                int scrollBarFadeDuration = 721 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                byte b8 = $$a[c];
                byte b9 = (byte) (b8 - 1);
                byte b10 = b8;
                f = 0.0f;
                Object[] objArr12 = new Object[1];
                b(b9, b10, (byte) (b10 - 1), objArr12);
                PngjBadSignature6 = com.d.e.a.PngjBadCrcException.PngjBadSignature(c4, indexOf2, scrollBarFadeDuration, -779023007, false, (String) objArr12[0], null);
            } else {
                f = 0.0f;
            }
            ((Field) PngjBadSignature6).set(null, PngjException$52c725b);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        Object[] objArr13 = new Object[1];
        c("椛引ԍ쬟녋朄ⴎጼ\ud93e轲甐㬿\ue13e흄鵒䍗", (ViewConfiguration.getEdgeSlop() >> 16) + 13829, objArr13);
        Class<?> cls3 = Class.forName((String) objArr13[0]);
        Object[] objArr14 = new Object[1];
        c("椘䭞ⶂ\u0ffe\ue029쉯\ua4c7餅筡嶳㿬ဠ\uf2b6퓑褏歱", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 8779, objArr14);
        intValue = ((Integer) cls3.getMethod((String) objArr14[0], Object.class).invoke(null, this)).intValue();
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        getScore = (valueOf + 95) % Uuid.SIZE_BITS;
        super.onCreate(bundle);
        int i = getScore + 107;
        valueOf = i % Uuid.SIZE_BITS;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onPause() {
        valueOf = (getScore + 59) % Uuid.SIZE_BITS;
        super.onPause();
        valueOf = (getScore + 69) % Uuid.SIZE_BITS;
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onResume() {
        int i = valueOf + 99;
        getScore = i % Uuid.SIZE_BITS;
        int i2 = i % 2;
        super.onResume();
        if (i2 == 0) {
            int i3 = 26 / 0;
        }
        int i4 = valueOf + 33;
        getScore = i4 % Uuid.SIZE_BITS;
        if (i4 % 2 == 0) {
            int i5 = 0 / 0;
        }
    }

    @Override // com.identy.FingerActivity, android.app.Activity
    public void onStart() {
        valueOf = (getScore + 95) % Uuid.SIZE_BITS;
        super.onStart();
        valueOf = (getScore + 117) % Uuid.SIZE_BITS;
    }

    @Override // com.identy.FingerActivity
    public void values(Bundle bundle) {
        super.values(bundle);
        try {
            try {
                this.onErrorResponse = new isFoundMatchingTemplates(this, this, this.PngjExceptionInternal, IdentySdk.getInstance().u(), this.PngjUnsupportedException);
                getScore = (valueOf + 117) % Uuid.SIZE_BITS;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
        }
    }
}
