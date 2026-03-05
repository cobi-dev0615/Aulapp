package co.ceduladigital.sdk;

import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r3(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((DefaultScheduler) this.b).lambda$schedule$1((TransportContext) this.c, (TransportScheduleCallback) this.d, (EventInternal) this.e);
                break;
            default:
                ((UserMetadata) this.b).lambda$setNewSession$0((String) this.c, (Map) this.d, (List) this.e);
                break;
        }
    }
}
