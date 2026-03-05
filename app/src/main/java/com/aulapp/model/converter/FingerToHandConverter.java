package com.gse.aulapp.model.converter;

import com.gse.aulapp.model.dto.FourFingersIdenty;
import com.gse.aulapp.model.enumerate.EnumFinger;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.karumi.dexter.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/model/converter/FingerToHandConverter;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class FingerToHandConverter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\f"}, d2 = {"Lcom/gse/aulapp/model/converter/FingerToHandConverter$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "getHandsAndFingers", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "Lcom/gse/aulapp/model/enumerate/EnumFinger;", BuildConfig.FLAVOR, "fourFingersIdenty", "Lcom/gse/aulapp/model/dto/FourFingersIdenty;", "hands", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<EnumHandsAulapp, Map<EnumFinger, String>> getHandsAndFingers(FourFingersIdenty fourFingersIdenty, EnumHandsAulapp hands) {
            Intrinsics.checkNotNullParameter(hands, "hands");
            if (fourFingersIdenty == null) {
                return null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            EnumHandsAulapp enumHandsAulapp = EnumHandsAulapp.LEFT;
            if (hands == enumHandsAulapp) {
                if (fourFingersIdenty.getLeftIndex() == null || fourFingersIdenty.getLeftMiddle() == null || fourFingersIdenty.getLeftRing() == null || fourFingersIdenty.getLeftLittle() == null) {
                    linkedHashMap.put(enumHandsAulapp, new LinkedHashMap());
                    return linkedHashMap;
                }
                EnumFinger enumFinger = EnumFinger.INDEX;
                String leftIndex = fourFingersIdenty.getLeftIndex();
                Intrinsics.checkNotNull(leftIndex);
                linkedHashMap2.put(enumFinger, leftIndex);
                EnumFinger enumFinger2 = EnumFinger.MIDDLE;
                String leftMiddle = fourFingersIdenty.getLeftMiddle();
                Intrinsics.checkNotNull(leftMiddle);
                linkedHashMap2.put(enumFinger2, leftMiddle);
                EnumFinger enumFinger3 = EnumFinger.RING;
                String leftRing = fourFingersIdenty.getLeftRing();
                Intrinsics.checkNotNull(leftRing);
                linkedHashMap2.put(enumFinger3, leftRing);
                EnumFinger enumFinger4 = EnumFinger.LITTLE;
                String leftLittle = fourFingersIdenty.getLeftLittle();
                Intrinsics.checkNotNull(leftLittle);
                linkedHashMap2.put(enumFinger4, leftLittle);
                linkedHashMap.put(enumHandsAulapp, linkedHashMap2);
                return linkedHashMap;
            }
            if (fourFingersIdenty.getRightIndex() == null || fourFingersIdenty.getRightMiddle() == null || fourFingersIdenty.getRightRing() == null || fourFingersIdenty.getRightLittle() == null) {
                linkedHashMap.put(EnumHandsAulapp.RIGHT, new LinkedHashMap());
                return linkedHashMap;
            }
            EnumFinger enumFinger5 = EnumFinger.INDEX;
            String rightIndex = fourFingersIdenty.getRightIndex();
            Intrinsics.checkNotNull(rightIndex);
            linkedHashMap2.put(enumFinger5, rightIndex);
            EnumFinger enumFinger6 = EnumFinger.MIDDLE;
            String rightMiddle = fourFingersIdenty.getRightMiddle();
            Intrinsics.checkNotNull(rightMiddle);
            linkedHashMap2.put(enumFinger6, rightMiddle);
            EnumFinger enumFinger7 = EnumFinger.RING;
            String rightRing = fourFingersIdenty.getRightRing();
            Intrinsics.checkNotNull(rightRing);
            linkedHashMap2.put(enumFinger7, rightRing);
            EnumFinger enumFinger8 = EnumFinger.LITTLE;
            String rightLittle = fourFingersIdenty.getRightLittle();
            Intrinsics.checkNotNull(rightLittle);
            linkedHashMap2.put(enumFinger8, rightLittle);
            linkedHashMap.put(EnumHandsAulapp.RIGHT, linkedHashMap2);
            return linkedHashMap;
        }

        private Companion() {
        }
    }
}
