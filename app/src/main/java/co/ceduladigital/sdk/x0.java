package co.ceduladigital.sdk;

import androidx.lifecycle.Observer;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class x0 implements Observer, FunctionAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public x0(int i, Function1 function) {
        this.a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(function, "function");
                this.b = function;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "function");
                this.b = function;
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "function");
                this.b = function;
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                    break;
                }
                break;
        }
        return Intrinsics.areEqual(this.b, ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        switch (this.a) {
        }
        return this.b;
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return this.b.hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                break;
            case 1:
                this.b.invoke(obj);
                break;
            default:
                this.b.invoke(obj);
                break;
        }
    }
}
