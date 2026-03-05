package co.ceduladigital.sdk;

import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Executor {
    public final /* synthetic */ int a;

    public /* synthetic */ m(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ArchTaskExecutor.lambda$static$0(runnable);
                break;
            case 1:
                ArchTaskExecutor.lambda$static$1(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
