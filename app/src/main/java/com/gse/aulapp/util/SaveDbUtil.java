package com.gse.aulapp.util;

import android.content.Context;
import android.location.Location;
import com.gse.aulapp.io.ReceptionsDatabase;
import com.gse.aulapp.model.converter.LocationConverter;
import com.gse.aulapp.model.dto.LocationDto;
import com.gse.aulapp.model.repository.GpsRepository;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/SaveDbUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SaveDbUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = Reflection.getOrCreateKotlinClass(SaveDbUtil.class).getSimpleName();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/gse/aulapp/util/SaveDbUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "TAG", BuildConfig.FLAVOR, "saveGpsTracker", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "sessionId", "location", "Landroid/location/Location;", "(Landroid/content/Context;Ljava/lang/String;Landroid/location/Location;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|(1:23)))|11|12|13))|26|6|7|(0)(0)|11|12|13) */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0029, code lost:
        
            r5 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        
            r0 = com.gse.aulapp.util.SaveDbUtil.TAG;
            r5.toString();
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object saveGpsTracker(Context context, String str, Location location, Continuation continuation) {
            SaveDbUtil$Companion$saveGpsTracker$1 saveDbUtil$Companion$saveGpsTracker$1;
            int i;
            if (continuation instanceof SaveDbUtil$Companion$saveGpsTracker$1) {
                saveDbUtil$Companion$saveGpsTracker$1 = (SaveDbUtil$Companion$saveGpsTracker$1) continuation;
                int i2 = saveDbUtil$Companion$saveGpsTracker$1.label;
                if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                    saveDbUtil$Companion$saveGpsTracker$1.label = i2 - IntCompanionObject.MIN_VALUE;
                    Object obj = saveDbUtil$Companion$saveGpsTracker$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = saveDbUtil$Companion$saveGpsTracker$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        GpsRepository gpsRepository = new GpsRepository(ReceptionsDatabase.INSTANCE.getDatabase(context).GpsDao());
                        LocationDto locationToLocationDto = LocationConverter.INSTANCE.locationToLocationDto(location, str);
                        if (locationToLocationDto != null) {
                            saveDbUtil$Companion$saveGpsTracker$1.label = 1;
                            if (gpsRepository.saveGpsTrace(locationToLocationDto, saveDbUtil$Companion$saveGpsTracker$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
            saveDbUtil$Companion$saveGpsTracker$1 = new SaveDbUtil$Companion$saveGpsTracker$1(this, continuation);
            Object obj2 = saveDbUtil$Companion$saveGpsTracker$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = saveDbUtil$Companion$saveGpsTracker$1.label;
            if (i != 0) {
            }
            return Unit.INSTANCE;
        }

        private Companion() {
        }
    }
}
