package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumBiometrixStatus;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "SUCCESS", "ERROR", "PENDING", "APPROVED", "ABANDONED", "REJECTED", "ONBACKPRESSED", "UNKNOWN", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnumBiometrixStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumBiometrixStatus.kt\ncom/gse/aulapp/model/enumerate/EnumBiometrixStatus\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n1202#2,2:23\n1230#2,4:25\n*S KotlinDebug\n*F\n+ 1 EnumBiometrixStatus.kt\ncom/gse/aulapp/model/enumerate/EnumBiometrixStatus\n*L\n16#1:23,2\n16#1:25,4\n*E\n"})
/* loaded from: classes.dex */
public final class EnumBiometrixStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumBiometrixStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Map<String, EnumBiometrixStatus> map;
    private final String value;
    public static final EnumBiometrixStatus SUCCESS = new EnumBiometrixStatus("SUCCESS", 0, "success");
    public static final EnumBiometrixStatus ERROR = new EnumBiometrixStatus("ERROR", 1, "error");
    public static final EnumBiometrixStatus PENDING = new EnumBiometrixStatus("PENDING", 2, "pending");
    public static final EnumBiometrixStatus APPROVED = new EnumBiometrixStatus("APPROVED", 3, "approved");
    public static final EnumBiometrixStatus ABANDONED = new EnumBiometrixStatus("ABANDONED", 4, "abandoned");
    public static final EnumBiometrixStatus REJECTED = new EnumBiometrixStatus("REJECTED", 5, "rejected");
    public static final EnumBiometrixStatus ONBACKPRESSED = new EnumBiometrixStatus("ONBACKPRESSED", 6, "onbackpressed");
    public static final EnumBiometrixStatus UNKNOWN = new EnumBiometrixStatus("UNKNOWN", 7, "unknown");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumBiometrixStatus$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "map", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/enumerate/EnumBiometrixStatus;", "fromValue", "value", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumBiometrixStatus fromValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Map map = EnumBiometrixStatus.map;
            String lowerCase = value.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            EnumBiometrixStatus enumBiometrixStatus = (EnumBiometrixStatus) map.get(lowerCase);
            return enumBiometrixStatus == null ? EnumBiometrixStatus.UNKNOWN : enumBiometrixStatus;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ EnumBiometrixStatus[] $values() {
        return new EnumBiometrixStatus[]{SUCCESS, ERROR, PENDING, APPROVED, ABANDONED, REJECTED, ONBACKPRESSED, UNKNOWN};
    }

    static {
        EnumBiometrixStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = null; // EnumEntriesKt.enumEntries requires actual enum type
        INSTANCE = new Companion(null);
        EnumBiometrixStatus[] entries = $values;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(entries.length), 16));
        for (EnumBiometrixStatus obj : entries) {
            linkedHashMap.put(obj.value, obj);
        }
        map = linkedHashMap;
    }

    private final String _name;
    private final int _ordinal;

    private EnumBiometrixStatus(String str, int i, String str2) {
        this._name = str;
        this._ordinal = i;
        this.value = str2;
    }

    public final int ordinal() {
        return this._ordinal;
    }

    public final String name() {
        return this._name;
    }

    public static EnumEntries<EnumBiometrixStatus> getEntries() {
        return $ENTRIES;
    }

    public static EnumBiometrixStatus valueOfString(String str) {
        for (EnumBiometrixStatus e : values()) {
            if (e._name.equals(str)) return e;
        }
        throw new IllegalArgumentException("No enum constant " + str);
    }

    public static EnumBiometrixStatus[] values() {
        return (EnumBiometrixStatus[]) $VALUES.clone();
    }
}
