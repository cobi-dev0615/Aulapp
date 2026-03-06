package com.gse.aulapp.model.enumerate;

import android.content.Context;
import com.gse.aulapp.GeneralApp;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
// import kotlin.enums.EnumEntries;
// import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000b"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumIdStepperMenu;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "ID_VALIDATION_APPRENTICE", "ID_VALIDATION_INSTRUCTOR", "ID_VALIDATION_VEHICLE", "name", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EnumIdStepperMenu {
    // private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumIdStepperMenu[] $VALUES;
    public static final EnumIdStepperMenu ID_VALIDATION_APPRENTICE = new EnumIdStepperMenu("ID_VALIDATION_APPRENTICE", 0) { // from class: com.gse.aulapp.model.enumerate.EnumIdStepperMenu.ID_VALIDATION_APPRENTICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumIdStepperMenu
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "1";
        }
    };
    public static final EnumIdStepperMenu ID_VALIDATION_INSTRUCTOR = new EnumIdStepperMenu("ID_VALIDATION_INSTRUCTOR", 1) { // from class: com.gse.aulapp.model.enumerate.EnumIdStepperMenu.ID_VALIDATION_INSTRUCTOR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumIdStepperMenu
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "2";
        }
    };
    public static final EnumIdStepperMenu ID_VALIDATION_VEHICLE = new EnumIdStepperMenu("ID_VALIDATION_VEHICLE", 2) { // from class: com.gse.aulapp.model.enumerate.EnumIdStepperMenu.ID_VALIDATION_VEHICLE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumIdStepperMenu
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return "3";
        }
    };

    private static final /* synthetic */ EnumIdStepperMenu[] $values() {
        return new EnumIdStepperMenu[]{ID_VALIDATION_APPRENTICE, ID_VALIDATION_INSTRUCTOR, ID_VALIDATION_VEHICLE};
    }

    static {
        EnumIdStepperMenu[] $values = $values();
        $VALUES = $values;
    }

    public /* synthetic */ EnumIdStepperMenu(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static /* synthetic */ String name$default(EnumIdStepperMenu enumIdStepperMenu, Context context, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: name");
        }
        if ((i & 1) != 0) {
            context = GeneralApp.INSTANCE.getInstance().getApplicationContext();
        }
        return enumIdStepperMenu.name(context);
    }

    public static EnumIdStepperMenu valueOfString(String str) {
        for (EnumIdStepperMenu e : values()) {
            if (e._name.equals(str)) return e;
        }
        throw new IllegalArgumentException("No enum constant " + str);
    }

    public static EnumIdStepperMenu[] values() {
        return (EnumIdStepperMenu[]) $VALUES.clone();
    }

    public abstract String name(Context context);

    private final String _name;
    private final int _ordinal;

    private EnumIdStepperMenu(String str, int i) {
        this._name = str;
        this._ordinal = i;
    }

    public final String name() {
        return this._name;
    }

    public final int ordinal() {
        return this._ordinal;
    }
}
