package com.gse.aulapp.model.enumerate;

import com.karumi.dexter.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/gse/aulapp/model/enumerate/EnumBiometrixAction;", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ENLISTMENT", "VALIDATION", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEnumBiometrixAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnumBiometrixAction.kt\ncom/gse/aulapp/model/enumerate/EnumBiometrixAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1202#2,2:16\n1230#2,4:18\n*S KotlinDebug\n*F\n+ 1 EnumBiometrixAction.kt\ncom/gse/aulapp/model/enumerate/EnumBiometrixAction\n*L\n9#1:16,2\n9#1:18,4\n*E\n"})
/* loaded from: classes.dex */
public final class EnumBiometrixAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumBiometrixAction[] $VALUES;
    public static final EnumBiometrixAction ENLISTMENT = new EnumBiometrixAction("ENLISTMENT", 0, "enlistment");
    public static final EnumBiometrixAction VALIDATION = new EnumBiometrixAction("VALIDATION", 1, "validation");
    private static final Map<String, EnumBiometrixAction> map;
    private final String value;

    private static final /* synthetic */ EnumBiometrixAction[] $values() {
        return new EnumBiometrixAction[]{ENLISTMENT, VALIDATION};
    }

    static {
        EnumBiometrixAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        EnumEntries<EnumBiometrixAction> entries = getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.e(entries)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(((EnumBiometrixAction) obj).value, obj);
        }
        map = linkedHashMap;
    }

    private EnumBiometrixAction(String str, int i, String str2) {
        this.value = str2;
    }

    public static EnumEntries<EnumBiometrixAction> getEntries() {
        return $ENTRIES;
    }

    public static EnumBiometrixAction valueOf(String str) {
        return (EnumBiometrixAction) Enum.valueOf(EnumBiometrixAction.class, str);
    }

    public static EnumBiometrixAction[] values() {
        return (EnumBiometrixAction[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
