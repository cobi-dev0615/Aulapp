package com.gse.aulapp.model.enumerate;

import android.content.Context;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH&J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\rH&J\b\u0010\u0011\u001a\u00020\u0010H&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumClassType;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "PRACTICE", "PRACTICE_EXAM", "THEORY_EXAM", "THEORY", "PEDAGOGICAL_PRACTICE", "WORKSHOP", "name", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "nameShow", "id", BuildConfig.FLAVOR, "resource", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EnumClassType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumClassType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EnumClassType PRACTICE = new EnumClassType("PRACTICE", 0) { // from class: com.gse.aulapp.model.enumerate.EnumClassType.PRACTICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public int id(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return 1;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "practice";
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public String nameShow(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.enum_class_type_practice_show);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public int resource() {
            return R.drawable.ic_car;
        }
    };
    public static final EnumClassType PRACTICE_EXAM = new EnumClassType("PRACTICE_EXAM", 1) { // from class: com.gse.aulapp.model.enumerate.EnumClassType.PRACTICE_EXAM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public int id(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return 2;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "pexam";
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public String nameShow(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.enum_class_type_practice_exam_show);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public int resource() {
            return R.drawable.ic_wheel;
        }
    };
    public static final EnumClassType THEORY_EXAM = new EnumClassType("THEORY_EXAM", 2) { // from class: com.gse.aulapp.model.enumerate.EnumClassType.THEORY_EXAM
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public int id(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return 3;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "texam";
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public String nameShow(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.enum_class_type_theory_exam_show);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public int resource() {
            return R.drawable.ic_book;
        }
    };
    public static final EnumClassType THEORY = new EnumClassType("THEORY", 3) { // from class: com.gse.aulapp.model.enumerate.EnumClassType.THEORY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public int id(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return 4;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "theory";
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public String nameShow(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.enum_class_type_theory_show);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public int resource() {
            return R.drawable.ic_book;
        }
    };
    public static final EnumClassType PEDAGOGICAL_PRACTICE = new EnumClassType("PEDAGOGICAL_PRACTICE", 4) { // from class: com.gse.aulapp.model.enumerate.EnumClassType.PEDAGOGICAL_PRACTICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public int id(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return 5;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "pedagogical";
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public String nameShow(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.enum_class_type_pedagogical_practice_show);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public int resource() {
            return R.drawable.ic_ok_user;
        }
    };
    public static final EnumClassType WORKSHOP = new EnumClassType("WORKSHOP", 5) { // from class: com.gse.aulapp.model.enumerate.EnumClassType.WORKSHOP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public int id(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return 6;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "garage";
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public String nameShow(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.enum_class_type_workshop_show);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumClassType
        public int resource() {
            return R.drawable.ic_tools;
        }
    };

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0015\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumClassType$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "getEnumByName", "Lcom/gse/aulapp/model/enumerate/EnumClassType;", "name", BuildConfig.FLAVOR, "getEnumByID", "id", BuildConfig.FLAVOR, "(Ljava/lang/Integer;)Lcom/gse/aulapp/model/enumerate/EnumClassType;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEnumClassType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumClassType.kt\ncom/gse/aulapp/model/enumerate/EnumClassType$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,147:1\n13409#2,2:148\n13409#2,2:150\n*S KotlinDebug\n*F\n+ 1 EnumClassType.kt\ncom/gse/aulapp/model/enumerate/EnumClassType$Companion\n*L\n127#1:148,2\n139#1:150,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumClassType getEnumByID(Integer id) {
            if (id == null) {
                return EnumClassType.WORKSHOP;
            }
            for (EnumClassType enumClassType : EnumClassType.values()) {
                if (id.intValue() == EnumClassType.id$default(enumClassType, null, 1, null)) {
                    return enumClassType;
                }
            }
            return EnumClassType.WORKSHOP;
        }

        public final EnumClassType getEnumByName(String name) {
            if (name == null || name.length() == 0) {
                return EnumClassType.WORKSHOP;
            }
            for (EnumClassType enumClassType : EnumClassType.values()) {
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String obj = StringsKt.trim((CharSequence) lowerCase).toString();
                String lowerCase2 = EnumClassType.name$default(enumClassType, null, 1, null).toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (Intrinsics.areEqual(obj, StringsKt.trim((CharSequence) lowerCase2).toString())) {
                    return enumClassType;
                }
            }
            return EnumClassType.WORKSHOP;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ EnumClassType[] $values() {
        return new EnumClassType[]{PRACTICE, PRACTICE_EXAM, THEORY_EXAM, THEORY, PEDAGOGICAL_PRACTICE, WORKSHOP};
    }

    static {
        EnumClassType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EnumClassType(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static /* synthetic */ int id$default(EnumClassType enumClassType, Context context, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: id");
        }
        if ((i & 1) != 0) {
            context = GeneralApp.INSTANCE.getInstance().getApplicationContext();
        }
        return enumClassType.id(context);
    }

    public static /* synthetic */ String name$default(EnumClassType enumClassType, Context context, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: name");
        }
        if ((i & 1) != 0) {
            context = GeneralApp.INSTANCE.getInstance().getApplicationContext();
        }
        return enumClassType.name(context);
    }

    public static /* synthetic */ String nameShow$default(EnumClassType enumClassType, Context context, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nameShow");
        }
        if ((i & 1) != 0) {
            context = GeneralApp.INSTANCE.getInstance().getApplicationContext();
        }
        return enumClassType.nameShow(context);
    }

    public static EnumClassType valueOf(String str) {
        return (EnumClassType) Enum.valueOf(EnumClassType.class, str);
    }

    public static EnumClassType[] values() {
        return (EnumClassType[]) $VALUES.clone();
    }

    public abstract int id(Context context);

    public abstract String name(Context context);

    public abstract String nameShow(Context context);

    public abstract int resource();

    private EnumClassType(String str, int i) {
    }
}
