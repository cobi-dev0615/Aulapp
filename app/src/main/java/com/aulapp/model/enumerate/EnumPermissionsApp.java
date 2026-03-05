package com.gse.aulapp.model.enumerate;

import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000b"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumPermissionsApp;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "AIRPLANE_MODE", "NFC", "GPS", "CONNECTION", "nameSync", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class EnumPermissionsApp {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumPermissionsApp[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EnumPermissionsApp AIRPLANE_MODE = new EnumPermissionsApp("AIRPLANE_MODE", 0) { // from class: com.gse.aulapp.model.enumerate.EnumPermissionsApp.AIRPLANE_MODE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumPermissionsApp
        public String nameSync() {
            String string = GeneralApp.INSTANCE.getInstance().getApplicationContext().getString(R.string.enum_permissions_app_type_air_plane);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    };
    public static final EnumPermissionsApp NFC = new EnumPermissionsApp("NFC", 1) { // from class: com.gse.aulapp.model.enumerate.EnumPermissionsApp.NFC
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumPermissionsApp
        public String nameSync() {
            String string = GeneralApp.INSTANCE.getInstance().getApplicationContext().getString(R.string.enum_permissions_app_type_nfc);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    };
    public static final EnumPermissionsApp GPS = new EnumPermissionsApp("GPS", 2) { // from class: com.gse.aulapp.model.enumerate.EnumPermissionsApp.GPS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumPermissionsApp
        public String nameSync() {
            String string = GeneralApp.INSTANCE.getInstance().getApplicationContext().getString(R.string.enum_permissions_app_type_gps);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    };
    public static final EnumPermissionsApp CONNECTION = new EnumPermissionsApp("CONNECTION", 3) { // from class: com.gse.aulapp.model.enumerate.EnumPermissionsApp.CONNECTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.model.enumerate.EnumPermissionsApp
        public String nameSync() {
            String string = GeneralApp.INSTANCE.getInstance().getApplicationContext().getString(R.string.enum_permissions_app_type_red);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    };

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumPermissionsApp$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "getEnumByName", "Lcom/gse/aulapp/model/enumerate/EnumPermissionsApp;", "name", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nEnumPermissionsApp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumPermissionsApp.kt\ncom/gse/aulapp/model/enumerate/EnumPermissionsApp$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,37:1\n1310#2,2:38\n*S KotlinDebug\n*F\n+ 1 EnumPermissionsApp.kt\ncom/gse/aulapp/model/enumerate/EnumPermissionsApp$Companion\n*L\n34#1:38,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumPermissionsApp getEnumByName(String name) {
            EnumPermissionsApp enumPermissionsApp;
            if (name == null || name.length() == 0) {
                return EnumPermissionsApp.AIRPLANE_MODE;
            }
            EnumPermissionsApp[] values = EnumPermissionsApp.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    enumPermissionsApp = null;
                    break;
                }
                enumPermissionsApp = values[i];
                if (Intrinsics.areEqual(enumPermissionsApp.name(), name)) {
                    break;
                }
                i++;
            }
            return enumPermissionsApp == null ? EnumPermissionsApp.AIRPLANE_MODE : enumPermissionsApp;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ EnumPermissionsApp[] $values() {
        return new EnumPermissionsApp[]{AIRPLANE_MODE, NFC, GPS, CONNECTION};
    }

    static {
        EnumPermissionsApp[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public /* synthetic */ EnumPermissionsApp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumPermissionsApp valueOf(String str) {
        return (EnumPermissionsApp) Enum.valueOf(EnumPermissionsApp.class, str);
    }

    public static EnumPermissionsApp[] values() {
        return (EnumPermissionsApp[]) $VALUES.clone();
    }

    public abstract String nameSync();

    private EnumPermissionsApp(String str, int i) {
    }
}
