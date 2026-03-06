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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000f"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumUserProfile;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "APPRENTICE", "INSTRUCTOR", "NONE", "name", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "nameTranslated", "icon", BuildConfig.FLAVOR, "style", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EnumUserProfile {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumUserProfile[] $VALUES;
    public static final EnumUserProfile APPRENTICE = new EnumUserProfile("APPRENTICE", 0) { // from class: com.gse.aulapp.model.enumerate.EnumUserProfile.APPRENTICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumUserProfile
        public int icon(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return R.drawable.ic_trainee;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumUserProfile
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.enum_user_profile_apprentice);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumUserProfile
        public String nameTranslated(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "Aprendiz";
        }

        @Override // com.gse.aulapp.model.enumerate.EnumUserProfile
        public int style(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return R.style.text_name_trainee_profile_user;
        }
    };
    public static final EnumUserProfile INSTRUCTOR = new EnumUserProfile("INSTRUCTOR", 1) { // from class: com.gse.aulapp.model.enumerate.EnumUserProfile.INSTRUCTOR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumUserProfile
        public int icon(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return R.drawable.ic_instructor_blue;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumUserProfile
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.enum_user_profile_instructor);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumUserProfile
        public String nameTranslated(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.enum_user_profile_instructor);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumUserProfile
        public int style(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return R.style.text_name_instructor_profile_user;
        }
    };
    public static final EnumUserProfile NONE = new EnumUserProfile("NONE", 2) { // from class: com.gse.aulapp.model.enumerate.EnumUserProfile.NONE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumUserProfile
        public int icon(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return R.drawable.ic_instructor_blue;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumUserProfile
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.enum_user_profile_none);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumUserProfile
        public String nameTranslated(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.enum_user_profile_instructor);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumUserProfile
        public int style(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return R.style.text_name_instructor_profile_user;
        }
    };

    private static final /* synthetic */ EnumUserProfile[] $values() {
        return new EnumUserProfile[]{APPRENTICE, INSTRUCTOR, NONE};
    }

    static {
        EnumUserProfile[] $values = $values();
        $VALUES = $values;
        $ENTRIES = null; // EnumEntriesKt.enumEntries requires actual enum type
    }

    public /* synthetic */ EnumUserProfile(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumUserProfile valueOfString(String str) {
        for (EnumUserProfile e : values()) {
            if (e._name.equals(str)) return e;
        }
        throw new IllegalArgumentException("No enum constant " + str);
    }

    public static EnumUserProfile[] values() {
        return (EnumUserProfile[]) $VALUES.clone();
    }

    public abstract int icon(Context context);

    public abstract String name(Context context);

    public abstract String nameTranslated(Context context);

    public abstract int style(Context context);

    private final String _name;
    private final int _ordinal;

    private EnumUserProfile(String str, int i) {
        this._name = str;
        this._ordinal = i;
    }

    public final int ordinal() {
        return this._ordinal;
    }

    public final String name() {
        return this._name;
    }
}
