package com.gse.aulapp.model.enumerate;

import android.content.Context;
import com.gse.aulapp.R;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&j\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumBiometricMoments;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "ENROLL", "VERIFY", "definitionText", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EnumBiometricMoments {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumBiometricMoments[] $VALUES;
    public static final EnumBiometricMoments ENROLL = new EnumBiometricMoments("ENROLL", 0) { // from class: com.gse.aulapp.model.enumerate.EnumBiometricMoments.ENROLL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumBiometricMoments
        public String definitionText(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.enroll_finger_print_biometric_definition_text);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "enroll";
        }
    };
    public static final EnumBiometricMoments VERIFY = new EnumBiometricMoments("VERIFY", 1) { // from class: com.gse.aulapp.model.enumerate.EnumBiometricMoments.VERIFY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumBiometricMoments
        public String definitionText(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.verify_finger_print_biometric_definition_text);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "verify";
        }
    };

    private static final /* synthetic */ EnumBiometricMoments[] $values() {
        return new EnumBiometricMoments[]{ENROLL, VERIFY};
    }

    static {
        EnumBiometricMoments[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public /* synthetic */ EnumBiometricMoments(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumBiometricMoments valueOf(String str) {
        return (EnumBiometricMoments) Enum.valueOf(EnumBiometricMoments.class, str);
    }

    public static EnumBiometricMoments[] values() {
        return (EnumBiometricMoments[]) $VALUES.clone();
    }

    public abstract String definitionText(Context context);

    private EnumBiometricMoments(String str, int i) {
    }
}
