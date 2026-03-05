package com.gse.aulapp.model.enumerate;

import android.content.Context;
import com.gse.aulapp.GeneralApp;
import com.karumi.dexter.BuildConfig;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumStatusAppointment;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "name", "(Landroid/content/Context;)Ljava/lang/String;", "Companion", "DEFAULT", "TO_BE_DEVELOPED", "NOT_SEEN", "SEEN", "UNDER_DEVELOPMENT", "CANCELED", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EnumStatusAppointment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumStatusAppointment[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EnumStatusAppointment DEFAULT = new EnumStatusAppointment("DEFAULT", 0) { // from class: com.gse.aulapp.model.enumerate.EnumStatusAppointment.DEFAULT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumStatusAppointment
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "Por defecto";
        }
    };
    public static final EnumStatusAppointment TO_BE_DEVELOPED = new EnumStatusAppointment("TO_BE_DEVELOPED", 1) { // from class: com.gse.aulapp.model.enumerate.EnumStatusAppointment.TO_BE_DEVELOPED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumStatusAppointment
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "Por desarrollar";
        }
    };
    public static final EnumStatusAppointment NOT_SEEN = new EnumStatusAppointment("NOT_SEEN", 2) { // from class: com.gse.aulapp.model.enumerate.EnumStatusAppointment.NOT_SEEN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumStatusAppointment
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "No vista";
        }
    };
    public static final EnumStatusAppointment SEEN = new EnumStatusAppointment("SEEN", 3) { // from class: com.gse.aulapp.model.enumerate.EnumStatusAppointment.SEEN
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumStatusAppointment
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "Vista";
        }
    };
    public static final EnumStatusAppointment UNDER_DEVELOPMENT = new EnumStatusAppointment("UNDER_DEVELOPMENT", 4) { // from class: com.gse.aulapp.model.enumerate.EnumStatusAppointment.UNDER_DEVELOPMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumStatusAppointment
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "En desarrollo";
        }
    };
    public static final EnumStatusAppointment CANCELED = new EnumStatusAppointment("CANCELED", 5) { // from class: com.gse.aulapp.model.enumerate.EnumStatusAppointment.CANCELED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumStatusAppointment
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "Anulada";
        }
    };

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumStatusAppointment$Companion;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "name", "Lcom/gse/aulapp/model/enumerate/EnumStatusAppointment;", "getEnumByName", "(Ljava/lang/String;)Lcom/gse/aulapp/model/enumerate/EnumStatusAppointment;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEnumStatusAppointment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumStatusAppointment.kt\ncom/gse/aulapp/model/enumerate/EnumStatusAppointment$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,98:1\n1863#2,2:99\n1863#2,2:101\n*S KotlinDebug\n*F\n+ 1 EnumStatusAppointment.kt\ncom/gse/aulapp/model/enumerate/EnumStatusAppointment$Companion\n*L\n77#1:99,2\n89#1:101,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumStatusAppointment getEnumByName(String name) {
            if (name == null || name.length() == 0) {
                return EnumStatusAppointment.DEFAULT;
            }
            for (EnumStatusAppointment enumStatusAppointment : EnumStatusAppointment.getEntries()) {
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String obj = StringsKt.trim((CharSequence) lowerCase).toString();
                String lowerCase2 = EnumStatusAppointment.name$default(enumStatusAppointment, null, 1, null).toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (Intrinsics.areEqual(obj, StringsKt.trim((CharSequence) lowerCase2).toString())) {
                    return enumStatusAppointment;
                }
            }
            return EnumStatusAppointment.DEFAULT;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ EnumStatusAppointment[] $values() {
        return new EnumStatusAppointment[]{DEFAULT, TO_BE_DEVELOPED, NOT_SEEN, SEEN, UNDER_DEVELOPMENT, CANCELED};
    }

    static {
        EnumStatusAppointment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EnumStatusAppointment(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<EnumStatusAppointment> getEntries() {
        return $ENTRIES;
    }

    public static /* synthetic */ String name$default(EnumStatusAppointment enumStatusAppointment, Context context, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: name");
        }
        if ((i & 1) != 0) {
            context = GeneralApp.INSTANCE.getInstance().getApplicationContext();
        }
        return enumStatusAppointment.name(context);
    }

    public static EnumStatusAppointment valueOfString(String str) {
        return (EnumStatusAppointment) Enum.valueOf(EnumStatusAppointment.class, str);
    }

    public static EnumStatusAppointment[] values() {
        return (EnumStatusAppointment[]) $VALUES.clone();
    }

    public abstract String name(Context context);

    private EnumStatusAppointment(String str, int i) {
    }
}
