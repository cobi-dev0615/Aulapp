package com.gse.aulapp.model.converter;

import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.identy.enums.Hand;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/model/converter/HandConverter;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class HandConverter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/gse/aulapp/model/converter/HandConverter$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "hand", "Lcom/identy/enums/Hand;", "getHandByEnumHandsAulapp", "(Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;)Lcom/identy/enums/Hand;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[EnumHandsAulapp.values().length];
                try {
                    iArr[EnumHandsAulapp.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumHandsAulapp.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[Hand.valuesCustom().length];
                try {
                    iArr2[Hand.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[Hand.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Hand getHandByEnumHandsAulapp(EnumHandsAulapp hand) {
            Intrinsics.checkNotNullParameter(hand, "hand");
            int i = WhenMappings.$EnumSwitchMapping$0[hand.ordinal()];
            if (i == 1) {
                return Hand.LEFT;
            }
            if (i != 2) {
                return null;
            }
            return Hand.RIGHT;
        }

        private Companion() {
        }
    }
}
