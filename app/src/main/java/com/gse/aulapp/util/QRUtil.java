package com.gse.aulapp.util;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.karumi.dexter.BuildConfig;
import java.util.EnumMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/QRUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class QRUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¨\u0006\r"}, d2 = {"Lcom/gse/aulapp/util/QRUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "generateQR", BuildConfig.FLAVOR, "Landroid/widget/ImageView;", "textQR", BuildConfig.FLAVOR, "backgroundColor", BuildConfig.FLAVOR, "barColor", "size", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nQRUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRUtil.kt\ncom/gse/aulapp/util/QRUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1872#2,3:41\n*S KotlinDebug\n*F\n+ 1 QRUtil.kt\ncom/gse/aulapp/util/QRUtil$Companion\n*L\n29#1:41,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void generateQR(ImageView imageView, String textQR, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(imageView, "<this>");
            Intrinsics.checkNotNullParameter(textQR, "textQR");
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put((EnumMap) EncodeHintType.MARGIN, (EncodeHintType) 5);
            enumMap.put((EnumMap) EncodeHintType.CHARACTER_SET, (EncodeHintType) "UTF-8");
            BitMatrix encode = new MultiFormatWriter().encode(textQR, BarcodeFormat.QR_CODE, i3, i3, enumMap);
            int width = encode.getWidth();
            int height = encode.getHeight();
            int i4 = width * height;
            int[] iArr = new int[i4];
            int i5 = 0;
            Iterator<Integer> it = RangesKt.until(0, i4).iterator();
            while (it.hasNext()) {
                ((IntIterator) it).nextInt();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                iArr[i5] = encode.get(i5 % width, i5 / width) ? i2 : i;
                i5 = i6;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            imageView.setImageBitmap(createBitmap);
        }

        private Companion() {
        }
    }
}
