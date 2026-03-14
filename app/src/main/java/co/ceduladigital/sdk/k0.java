package co.ceduladigital.sdk;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class k0 implements Observer, FunctionAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public k0(c0 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.a = 0;
        this.b = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(this.b, ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.b.invoke(obj);
    }

    public k0(z0 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.a = 1;
        this.b = function;
    }

    public k0(s4 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.a = 2;
        this.b = function;
    }
}
