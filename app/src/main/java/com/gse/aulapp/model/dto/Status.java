package com.gse.aulapp.model.dto;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/gse/aulapp/model/dto/Status;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "NOT_ANSWERED", "APPROVED", "REJECTED", "CURRENT", "NOT_APPLICABLE", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Status {
    private static final /* synthetic */ Status[] $VALUES;
    public static final Status NOT_ANSWERED = new Status("NOT_ANSWERED", 0);
    public static final Status APPROVED = new Status("APPROVED", 1);
    public static final Status REJECTED = new Status("REJECTED", 2);
    public static final Status CURRENT = new Status("CURRENT", 3);
    public static final Status NOT_APPLICABLE = new Status("NOT_APPLICABLE", 4);

    private final String _name;
    private final int _ordinal;

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{NOT_ANSWERED, APPROVED, REJECTED, CURRENT, NOT_APPLICABLE};
    }

    static {
        $VALUES = $values();
    }

    private Status(String str, int i) {
        this._name = str;
        this._ordinal = i;
    }

    public final String name() {
        return this._name;
    }

    public final int ordinal() {
        return this._ordinal;
    }

    public static Status valueOfString(String str) {
        Status[] values = values();
        for (Status value : values) {
            if (value.name().equals(str)) {
                return value;
            }
        }
        throw new IllegalArgumentException("No enum constant " + str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }

    @Override
    public String toString() {
        return this._name;
    }
}
