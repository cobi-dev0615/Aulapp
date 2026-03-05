package co.ceduladigital.sdk;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class k0 implements Observer, FunctionAdapter {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;

    public k0(c0 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.b = function;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((c0) this.b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((z0) this.b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual((s4) this.b, ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return (c0) this.b;
            case 1:
                return (z0) this.b;
            default:
                return (s4) this.b;
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return ((c0) this.b).hashCode();
            case 1:
                return ((z0) this.b).hashCode();
            default:
                return ((s4) this.b).hashCode();
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        switch (this.a) {
            case 0:
                ((c0) this.b).invoke(obj);
                break;
            case 1:
                ((z0) this.b).invoke(obj);
                break;
            default:
                ((s4) this.b).invoke(obj);
                break;
        }
    }

    public k0(z0 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.b = function;
    }

    public k0(s4 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.b = function;
    }
}
