package com.gse.aulapp.model.enumerate;

import android.content.Context;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\f"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumDeviceSecurity;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "EMULATOR", "ROOTED", "DEVELOPER_MODE_ENABLED", "DEBUGGING_ENABLE", "name", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EnumDeviceSecurity {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumDeviceSecurity[] $VALUES;
    public static final EnumDeviceSecurity EMULATOR = new EnumDeviceSecurity("EMULATOR", 0) { // from class: com.gse.aulapp.model.enumerate.EnumDeviceSecurity.EMULATOR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumDeviceSecurity
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.device_security_enum_is_emulator);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    };
    public static final EnumDeviceSecurity ROOTED = new EnumDeviceSecurity("ROOTED", 1) { // from class: com.gse.aulapp.model.enumerate.EnumDeviceSecurity.ROOTED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumDeviceSecurity
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.device_security_enum_rooted);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    };
    public static final EnumDeviceSecurity DEVELOPER_MODE_ENABLED = new EnumDeviceSecurity("DEVELOPER_MODE_ENABLED", 2) { // from class: com.gse.aulapp.model.enumerate.EnumDeviceSecurity.DEVELOPER_MODE_ENABLED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumDeviceSecurity
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.device_security_enum_developer_mode_enabled);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    };
    public static final EnumDeviceSecurity DEBUGGING_ENABLE = new EnumDeviceSecurity("DEBUGGING_ENABLE", 3) { // from class: com.gse.aulapp.model.enumerate.EnumDeviceSecurity.DEBUGGING_ENABLE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumDeviceSecurity
        public String name(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String string = context.getString(R.string.device_security_enum_debugging_enable);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    };

    private static final /* synthetic */ EnumDeviceSecurity[] $values() {
        return new EnumDeviceSecurity[]{EMULATOR, ROOTED, DEVELOPER_MODE_ENABLED, DEBUGGING_ENABLE};
    }

    static {
        EnumDeviceSecurity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = null; // EnumEntriesKt.enumEntries requires actual enum type
    }

    public /* synthetic */ EnumDeviceSecurity(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static /* synthetic */ String name$default(EnumDeviceSecurity enumDeviceSecurity, Context context, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: name");
        }
        if ((i & 1) != 0) {
            context = GeneralApp.INSTANCE.getInstance().getApplicationContext();
        }
        return enumDeviceSecurity.name(context);
    }

    public static EnumDeviceSecurity valueOfString(String str) {
        return (EnumDeviceSecurity) Enum.valueOf(EnumDeviceSecurity.class, str);
    }

    public static EnumDeviceSecurity[] values() {
        return (EnumDeviceSecurity[]) $VALUES.clone();
    }

    public abstract String name(Context context);

    private EnumDeviceSecurity(String str, int i) {
    }
}
