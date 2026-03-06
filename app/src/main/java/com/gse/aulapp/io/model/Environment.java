package com.gse.aulapp.io.model;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\bH&j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\n"}, d2 = {"Lcom/gse/aulapp/io/model/Environment;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "QA", "PROD", "DEMO", "url", BuildConfig.FLAVOR, "urlBiometric", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Environment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Environment[] $VALUES;
    public static final Environment QA = new Environment("QA", 0) { // from class: com.gse.aulapp.io.model.Environment.QA
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.io.model.Environment
        public String url() {
            return "https://qamobile.aulapp.co/api/v2/";
        }

        @Override // com.gse.aulapp.io.model.Environment
        public String urlBiometric() {
            return "https://qamobile.aulapp.co/";
        }
    };
    public static final Environment PROD = new Environment("PROD", 1) { // from class: com.gse.aulapp.io.model.Environment.PROD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.io.model.Environment
        public String url() {
            return "https://newmobile.aulapp.co/api/v2/";
        }

        @Override // com.gse.aulapp.io.model.Environment
        public String urlBiometric() {
            return "https://newmobile.aulapp.co/";
        }
    };
    public static final Environment DEMO = new Environment("DEMO", 2) { // from class: com.gse.aulapp.io.model.Environment.DEMO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.gse.aulapp.io.model.Environment
        public String url() {
            return "https://mobiledemo.aulapp.co/api/v2/";
        }

        @Override // com.gse.aulapp.io.model.Environment
        public String urlBiometric() {
            return "https://mobiledemo.aulapp.co/";
        }
    };

    private static final /* synthetic */ Environment[] $values() {
        return new Environment[]{QA, PROD, DEMO};
    }

    static {
        Environment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = null; // EnumEntriesKt.enumEntries requires actual enum type
    }

    public /* synthetic */ Environment(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static Environment valueOfString(String str) {
        for (Environment val : $values()) {
            if (val.name().equals(str)) return val;
        }
        throw new IllegalArgumentException("No enum constant " + str);
    }

    public static Environment[] values() {
        return (Environment[]) $VALUES.clone();
    }

    public abstract String url();

    public abstract String urlBiometric();

    private final String _name;
    private final int _ordinal;

    private Environment(String str, int i) {
        this._name = str;
        this._ordinal = i;
    }

    public String name() {
        return _name;
    }

    public int ordinal() {
        return _ordinal;
    }
}
