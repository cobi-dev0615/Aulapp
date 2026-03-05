package com.gse.aulapp.model.converter;

import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumTypeConfiguration;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/model/converter/ConfigurationSessionTypeConverter;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ConfigurationSessionTypeConverter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\b¨\u0006\t"}, d2 = {"Lcom/gse/aulapp/model/converter/ConfigurationSessionTypeConverter$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "getType", "Lcom/gse/aulapp/model/enumerate/EnumTypeConfiguration;", "enumClassType", "Lcom/gse/aulapp/model/enumerate/EnumClassType;", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumClassType.values().length];
                try {
                    iArr[EnumClassType.PRACTICE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumClassType.PRACTICE_EXAM.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumTypeConfiguration getType(EnumClassType enumClassType) {
            Intrinsics.checkNotNullParameter(enumClassType, "enumClassType");
            int i = WhenMappings.$EnumSwitchMapping$0[enumClassType.ordinal()];
            return i != 1 ? i != 2 ? EnumTypeConfiguration.CLASS_PRACTICAL_CONFIG : EnumTypeConfiguration.EXAM_CONFIG : EnumTypeConfiguration.CLASS_PRACTICAL_CONFIG;
        }

        private Companion() {
        }

        public final EnumTypeConfiguration getType(String enumClassType) {
            return Intrinsics.areEqual(enumClassType, EnumClassType.name$default(EnumClassType.PRACTICE, null, 1, null)) ? EnumTypeConfiguration.CLASS_PRACTICAL_CONFIG : Intrinsics.areEqual(enumClassType, EnumClassType.name$default(EnumClassType.PRACTICE_EXAM, null, 1, null)) ? EnumTypeConfiguration.EXAM_CONFIG : EnumTypeConfiguration.WITHOUT_CONFIG;
        }
    }
}
