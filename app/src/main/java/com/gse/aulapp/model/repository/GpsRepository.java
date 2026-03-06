package com.gse.aulapp.model.repository;

import androidx.sqlite.db.SimpleSQLiteQuery;
import com.gse.aulapp.model.converter.LocationConverter;
import com.gse.aulapp.model.dao.GpsDao;
import com.gse.aulapp.model.data.entity.GpsTraceEntity;
import com.gse.aulapp.model.dto.LocationDto;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0011\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/gse/aulapp/model/repository/GpsRepository;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dao/GpsDao;", "gpsDao", "<init>", "(Lcom/gse/aulapp/model/dao/GpsDao;)V", BuildConfig.FLAVOR, "sessionID", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/LocationDto;", "getGpsTraceBySessionID", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "locationDto", BuildConfig.FLAVOR, "saveGpsTrace", "(Lcom/gse/aulapp/model/dto/LocationDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.FLAVOR, "getAverageSpeedBySessionID", "getMaxSpeedBySessionID", "Lcom/gse/aulapp/model/dao/GpsDao;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
@SuppressWarnings({"unchecked", "rawtypes"})
public final class GpsRepository {
    private final GpsDao gpsDao;

    public GpsRepository(GpsDao gpsDao) {
        Intrinsics.checkNotNullParameter(gpsDao, "gpsDao");
        this.gpsDao = gpsDao;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAverageSpeedBySessionID(String str, Continuation<? super Double> continuation) {
        GpsRepository$getAverageSpeedBySessionID$1 gpsRepository$getAverageSpeedBySessionID$1;
        int i;
        SimpleSQLiteQuery simpleSQLiteQuery;
        GpsRepository gpsRepository;
        if (continuation instanceof GpsRepository$getAverageSpeedBySessionID$1) {
            gpsRepository$getAverageSpeedBySessionID$1 = (GpsRepository$getAverageSpeedBySessionID$1) continuation;
            int i2 = gpsRepository$getAverageSpeedBySessionID$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                gpsRepository$getAverageSpeedBySessionID$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = gpsRepository$getAverageSpeedBySessionID$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gpsRepository$getAverageSpeedBySessionID$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SimpleSQLiteQuery simpleSQLiteQuery2 = new SimpleSQLiteQuery("SELECT AVG(speed) FROM gpsTrace where sessionID = ? ", new Object[]{str});
                    GpsDao gpsDao = this.gpsDao;
                    gpsRepository$getAverageSpeedBySessionID$1.L$0 = this;
                    gpsRepository$getAverageSpeedBySessionID$1.L$1 = simpleSQLiteQuery2;
                    gpsRepository$getAverageSpeedBySessionID$1.L$2 = "result";
                    gpsRepository$getAverageSpeedBySessionID$1.label = 1;
                    Object speedCustom = gpsDao.getSpeedCustom(simpleSQLiteQuery2, gpsRepository$getAverageSpeedBySessionID$1);
                    if (speedCustom != coroutine_suspended) {
                        obj = speedCustom;
                        simpleSQLiteQuery = simpleSQLiteQuery2;
                        gpsRepository = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Double d = (Double) obj;
                    return Boxing.boxDouble(d != null ? d.doubleValue() : 0.0d);
                }
                simpleSQLiteQuery = (SimpleSQLiteQuery) gpsRepository$getAverageSpeedBySessionID$1.L$1;
                gpsRepository = (GpsRepository) gpsRepository$getAverageSpeedBySessionID$1.L$0;
                ResultKt.throwOnFailure(obj);
                Objects.toString(obj);
                GpsDao gpsDao2 = gpsRepository.gpsDao;
                gpsRepository$getAverageSpeedBySessionID$1.L$0 = null;
                gpsRepository$getAverageSpeedBySessionID$1.L$1 = null;
                gpsRepository$getAverageSpeedBySessionID$1.L$2 = null;
                gpsRepository$getAverageSpeedBySessionID$1.label = 2;
                obj = gpsDao2.getSpeedCustom(simpleSQLiteQuery, gpsRepository$getAverageSpeedBySessionID$1);
            }
        }
        gpsRepository$getAverageSpeedBySessionID$1 = new GpsRepository$getAverageSpeedBySessionID$1(this, (Continuation) continuation);
        Object obj2 = gpsRepository$getAverageSpeedBySessionID$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gpsRepository$getAverageSpeedBySessionID$1.label;
        if (i != 0) {
        }
        Objects.toString(obj2);
        GpsRepository gpsRepository = this;
        SimpleSQLiteQuery simpleSQLiteQuery = null;
        GpsDao gpsDao22 = gpsRepository.gpsDao;
        gpsRepository$getAverageSpeedBySessionID$1.L$0 = null;
        gpsRepository$getAverageSpeedBySessionID$1.L$1 = null;
        gpsRepository$getAverageSpeedBySessionID$1.L$2 = null;
        gpsRepository$getAverageSpeedBySessionID$1.label = 2;
        obj2 = gpsDao22.getSpeedCustom(simpleSQLiteQuery, gpsRepository$getAverageSpeedBySessionID$1);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getGpsTraceBySessionID(String str, Continuation<? super List<LocationDto>> continuation) {
        GpsRepository$getGpsTraceBySessionID$1 gpsRepository$getGpsTraceBySessionID$1;
        int i;
        LocationConverter.Companion companion;
        if (continuation instanceof GpsRepository$getGpsTraceBySessionID$1) {
            gpsRepository$getGpsTraceBySessionID$1 = (GpsRepository$getGpsTraceBySessionID$1) continuation;
            int i2 = gpsRepository$getGpsTraceBySessionID$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                gpsRepository$getGpsTraceBySessionID$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = gpsRepository$getGpsTraceBySessionID$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gpsRepository$getGpsTraceBySessionID$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery("SELECT * FROM gpsTrace g where g.sessionID = ? ", new Object[]{str});
                    companion = LocationConverter.INSTANCE;
                    GpsDao gpsDao = this.gpsDao;
                    gpsRepository$getGpsTraceBySessionID$1.L$0 = companion;
                    gpsRepository$getGpsTraceBySessionID$1.label = 1;
                    obj = gpsDao.getAllGpsTraceCustom(simpleSQLiteQuery, gpsRepository$getGpsTraceBySessionID$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    companion = (LocationConverter.Companion) gpsRepository$getGpsTraceBySessionID$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return companion.gpsTraceEntityToLocationDto((List<GpsTraceEntity>) obj);
            }
        }
        gpsRepository$getGpsTraceBySessionID$1 = new GpsRepository$getGpsTraceBySessionID$1(this, (Continuation) continuation);
        Object obj2 = gpsRepository$getGpsTraceBySessionID$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gpsRepository$getGpsTraceBySessionID$1.label;
        if (i != 0) {
        }
        LocationConverter.Companion companion = null;
        return companion.gpsTraceEntityToLocationDto((List<GpsTraceEntity>) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
    
        if (r7 != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getMaxSpeedBySessionID(String str, Continuation<? super Double> continuation) {
        GpsRepository$getMaxSpeedBySessionID$1 gpsRepository$getMaxSpeedBySessionID$1;
        int i;
        SimpleSQLiteQuery simpleSQLiteQuery;
        GpsRepository gpsRepository;
        if (continuation instanceof GpsRepository$getMaxSpeedBySessionID$1) {
            gpsRepository$getMaxSpeedBySessionID$1 = (GpsRepository$getMaxSpeedBySessionID$1) continuation;
            int i2 = gpsRepository$getMaxSpeedBySessionID$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                gpsRepository$getMaxSpeedBySessionID$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = gpsRepository$getMaxSpeedBySessionID$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gpsRepository$getMaxSpeedBySessionID$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    SimpleSQLiteQuery simpleSQLiteQuery2 = new SimpleSQLiteQuery("SELECT MAX(speed) FROM gpsTrace where sessionID = ? ", new Object[]{str});
                    GpsDao gpsDao = this.gpsDao;
                    gpsRepository$getMaxSpeedBySessionID$1.L$0 = this;
                    gpsRepository$getMaxSpeedBySessionID$1.L$1 = simpleSQLiteQuery2;
                    gpsRepository$getMaxSpeedBySessionID$1.L$2 = "result";
                    gpsRepository$getMaxSpeedBySessionID$1.label = 1;
                    Object speedCustom = gpsDao.getSpeedCustom(simpleSQLiteQuery2, gpsRepository$getMaxSpeedBySessionID$1);
                    if (speedCustom != coroutine_suspended) {
                        obj = speedCustom;
                        simpleSQLiteQuery = simpleSQLiteQuery2;
                        gpsRepository = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Double d = (Double) obj;
                    return Boxing.boxDouble(d != null ? d.doubleValue() : 0.0d);
                }
                simpleSQLiteQuery = (SimpleSQLiteQuery) gpsRepository$getMaxSpeedBySessionID$1.L$1;
                gpsRepository = (GpsRepository) gpsRepository$getMaxSpeedBySessionID$1.L$0;
                ResultKt.throwOnFailure(obj);
                Objects.toString(obj);
                GpsDao gpsDao2 = gpsRepository.gpsDao;
                gpsRepository$getMaxSpeedBySessionID$1.L$0 = null;
                gpsRepository$getMaxSpeedBySessionID$1.L$1 = null;
                gpsRepository$getMaxSpeedBySessionID$1.L$2 = null;
                gpsRepository$getMaxSpeedBySessionID$1.label = 2;
                obj = gpsDao2.getSpeedCustom(simpleSQLiteQuery, gpsRepository$getMaxSpeedBySessionID$1);
            }
        }
        gpsRepository$getMaxSpeedBySessionID$1 = new GpsRepository$getMaxSpeedBySessionID$1(this, (Continuation) continuation);
        Object obj2 = gpsRepository$getMaxSpeedBySessionID$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gpsRepository$getMaxSpeedBySessionID$1.label;
        if (i != 0) {
        }
        Objects.toString(obj2);
        GpsRepository gpsRepository = this;
        SimpleSQLiteQuery simpleSQLiteQuery = null;
        GpsDao gpsDao22 = gpsRepository.gpsDao;
        gpsRepository$getMaxSpeedBySessionID$1.L$0 = null;
        gpsRepository$getMaxSpeedBySessionID$1.L$1 = null;
        gpsRepository$getMaxSpeedBySessionID$1.L$2 = null;
        gpsRepository$getMaxSpeedBySessionID$1.label = 2;
        obj2 = gpsDao22.getSpeedCustom(simpleSQLiteQuery, gpsRepository$getMaxSpeedBySessionID$1);
        return null;
    }

    public final Object saveGpsTrace(LocationDto locationDto, Continuation<? super Long> continuation) {
        GpsTraceEntity locationDtoToGpsTraceEntity = LocationConverter.INSTANCE.locationDtoToGpsTraceEntity(locationDto);
        locationDtoToGpsTraceEntity.setSpeed(locationDto.getSpeed() * 3.6d);
        return this.gpsDao.saveGpsTrace(locationDtoToGpsTraceEntity, continuation);
    }
}
