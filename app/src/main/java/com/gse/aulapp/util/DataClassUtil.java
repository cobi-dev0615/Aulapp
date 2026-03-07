package com.gse.aulapp.util;

import android.content.Context;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.databinding.DialogExamInfoLayoutBinding;
import com.gse.aulapp.databinding.FragmentPracticeClassBinding;
import com.gse.aulapp.model.dto.GpsCalculateDataDto;
import com.gse.aulapp.model.dto.LocationDto;
import com.gse.aulapp.model.dto.RealtimeClassDataDto;
import com.gse.aulapp.model.repository.GpsRepository;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.GpsUtil;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/DataClassUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DataClassUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u000fJ&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/gse/aulapp/util/DataClassUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "generateDataClass", "Lcom/gse/aulapp/model/dto/RealtimeClassDataDto;", "sessionId", BuildConfig.FLAVOR, "gpsRepository", "Lcom/gse/aulapp/model/repository/GpsRepository;", "(Ljava/lang/String;Lcom/gse/aulapp/model/repository/GpsRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateClassValues", BuildConfig.FLAVOR, "binding", "Lcom/gse/aulapp/databinding/DialogExamInfoLayoutBinding;", "(Lcom/gse/aulapp/databinding/DialogExamInfoLayoutBinding;Lcom/gse/aulapp/model/repository/GpsRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/databinding/FragmentPracticeClassBinding;", "(Lcom/gse/aulapp/databinding/FragmentPracticeClassBinding;Lcom/gse/aulapp/model/repository/GpsRepository;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object generateDataClass(String str, GpsRepository gpsRepository, Continuation continuation) {
            DataClassUtil$Companion$generateDataClass$1 dataClassUtil$Companion$generateDataClass$1;
            Object coroutine_suspended;
            int i;
            Object averageSpeedBySessionID;
            String str2;
            List<LocationDto> list;
            List<LocationDto> list2;
            double d;
            String str3 = str;
            GpsRepository gpsRepository2 = gpsRepository;
            dataClassUtil$Companion$generateDataClass$1 = new DataClassUtil$Companion$generateDataClass$1(this, (Continuation) continuation);
            Object obj2 = dataClassUtil$Companion$generateDataClass$1.result;
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = dataClassUtil$Companion$generateDataClass$1.label;
            try {
                if (continuation instanceof DataClassUtil$Companion$generateDataClass$1) {
                    dataClassUtil$Companion$generateDataClass$1 = (DataClassUtil$Companion$generateDataClass$1) continuation;
                    int i2 = dataClassUtil$Companion$generateDataClass$1.label;
                    if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                        dataClassUtil$Companion$generateDataClass$1.label = i2 - IntCompanionObject.MIN_VALUE;
                        Object obj = dataClassUtil$Companion$generateDataClass$1.result;
                        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = dataClassUtil$Companion$generateDataClass$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            Objects.toString(gpsRepository2);
                            GpsUtil.Companion companion = GpsUtil.INSTANCE;
                            Context applicationContext = GeneralApp.INSTANCE.getInstance().getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            companion.validateGpsIsActive(applicationContext);
                            dataClassUtil$Companion$generateDataClass$1.L$0 = str3;
                            dataClassUtil$Companion$generateDataClass$1.L$1 = gpsRepository2;
                            dataClassUtil$Companion$generateDataClass$1.label = 1;
                            obj = gpsRepository2.getGpsTraceBySessionID(str3, dataClassUtil$Companion$generateDataClass$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    double d2 = dataClassUtil$Companion$generateDataClass$1.D$0;
                                    list2 = (List) dataClassUtil$Companion$generateDataClass$1.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    d = d2;
                                    double doubleValue = ((Number) obj).doubleValue();
                                    GpsCalculateDataDto calculateTotalDistanceStoppedAndMovingTime = GpsTracerUtil.INSTANCE.calculateTotalDistanceStoppedAndMovingTime(list2);
                                    Objects.toString(list2);
                                    Objects.toString(calculateTotalDistanceStoppedAndMovingTime);
                                    return new RealtimeClassDataDto(calculateTotalDistanceStoppedAndMovingTime, d, doubleValue);
                                }
                                list = (List) dataClassUtil$Companion$generateDataClass$1.L$2;
                                gpsRepository2 = (GpsRepository) dataClassUtil$Companion$generateDataClass$1.L$1;
                                str2 = (String) dataClassUtil$Companion$generateDataClass$1.L$0;
                                ResultKt.throwOnFailure(obj);
                                double doubleValue2 = ((Number) obj).doubleValue();
                                dataClassUtil$Companion$generateDataClass$1.L$0 = list;
                                dataClassUtil$Companion$generateDataClass$1.L$1 = null;
                                dataClassUtil$Companion$generateDataClass$1.L$2 = null;
                                dataClassUtil$Companion$generateDataClass$1.D$0 = doubleValue2;
                                dataClassUtil$Companion$generateDataClass$1.label = 3;
                                obj = gpsRepository2.getMaxSpeedBySessionID(str2, dataClassUtil$Companion$generateDataClass$1);
                                if (obj != coroutine_suspended) {
                                    list2 = list;
                                    d = doubleValue2;
                                    double doubleValue3 = ((Number) obj).doubleValue();
                                    GpsCalculateDataDto calculateTotalDistanceStoppedAndMovingTime2 = GpsTracerUtil.INSTANCE.calculateTotalDistanceStoppedAndMovingTime(list2);
                                    Objects.toString(list2);
                                    Objects.toString(calculateTotalDistanceStoppedAndMovingTime2);
                                    return new RealtimeClassDataDto(calculateTotalDistanceStoppedAndMovingTime2, d, doubleValue3);
                                }
                                return coroutine_suspended;
                            }
                            GpsRepository gpsRepository3 = (GpsRepository) dataClassUtil$Companion$generateDataClass$1.L$1;
                            String str4 = (String) dataClassUtil$Companion$generateDataClass$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            gpsRepository2 = gpsRepository3;
                            str3 = str4;
                        }
                        List<LocationDto> list3 = (List) obj;
                        dataClassUtil$Companion$generateDataClass$1.L$0 = str3;
                        dataClassUtil$Companion$generateDataClass$1.L$1 = gpsRepository2;
                        dataClassUtil$Companion$generateDataClass$1.L$2 = list3;
                        dataClassUtil$Companion$generateDataClass$1.label = 2;
                        averageSpeedBySessionID = gpsRepository2.getAverageSpeedBySessionID(str3, dataClassUtil$Companion$generateDataClass$1);
                        if (averageSpeedBySessionID != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str3;
                        list = list3;
                        obj = averageSpeedBySessionID;
                        double doubleValue22 = ((Number) obj).doubleValue();
                        dataClassUtil$Companion$generateDataClass$1.L$0 = list;
                        dataClassUtil$Companion$generateDataClass$1.L$1 = null;
                        dataClassUtil$Companion$generateDataClass$1.L$2 = null;
                        dataClassUtil$Companion$generateDataClass$1.D$0 = doubleValue22;
                        dataClassUtil$Companion$generateDataClass$1.label = 3;
                        obj = gpsRepository2.getMaxSpeedBySessionID(str2, dataClassUtil$Companion$generateDataClass$1);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                }
                if (i != 0) {
                }
                List<LocationDto> list32 = (List) obj2;
                dataClassUtil$Companion$generateDataClass$1.L$0 = str3;
                dataClassUtil$Companion$generateDataClass$1.L$1 = gpsRepository2;
                dataClassUtil$Companion$generateDataClass$1.L$2 = list32;
                dataClassUtil$Companion$generateDataClass$1.label = 2;
                averageSpeedBySessionID = gpsRepository2.getAverageSpeedBySessionID(str3, dataClassUtil$Companion$generateDataClass$1);
                if (averageSpeedBySessionID != coroutine_suspended) {
                }
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
            return coroutine_suspended;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r14, r6, r1) == r2) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        
            if (r0 == r2) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object updateClassValues(DialogExamInfoLayoutBinding dialogExamInfoLayoutBinding, GpsRepository gpsRepository, String str, Continuation continuation) {
            DataClassUtil$Companion$updateClassValues$1 dataClassUtil$Companion$updateClassValues$1;
            int i;
            RealtimeClassDataDto realtimeClassDataDto;
            if (continuation instanceof DataClassUtil$Companion$updateClassValues$1) {
                dataClassUtil$Companion$updateClassValues$1 = (DataClassUtil$Companion$updateClassValues$1) continuation;
                int i2 = dataClassUtil$Companion$updateClassValues$1.label;
                if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                    dataClassUtil$Companion$updateClassValues$1.label = i2 - IntCompanionObject.MIN_VALUE;
                    Object obj = dataClassUtil$Companion$updateClassValues$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataClassUtil$Companion$updateClassValues$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        dataClassUtil$Companion$updateClassValues$1.L$0 = dialogExamInfoLayoutBinding;
                        dataClassUtil$Companion$updateClassValues$1.label = 1;
                        obj = generateDataClass(str, gpsRepository, dataClassUtil$Companion$updateClassValues$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        dialogExamInfoLayoutBinding = (DialogExamInfoLayoutBinding) dataClassUtil$Companion$updateClassValues$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    DialogExamInfoLayoutBinding dialogExamInfoLayoutBinding2 = dialogExamInfoLayoutBinding;
                    realtimeClassDataDto = (RealtimeClassDataDto) obj;
                    if (realtimeClassDataDto != null) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("%.1f km", Arrays.copyOf(new Object[]{Boxing.boxDouble(realtimeClassDataDto.getGpsCalculateDataDto().getTotalDistance())}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        DateUtil.Companion companion = DateUtil.INSTANCE;
                        String uTCSettingDateToString = companion.uTCSettingDateToString(realtimeClassDataDto.getGpsCalculateDataDto().getStoppedTime(), "HH:mm:ss.SSS");
                        String uTCSettingDateToString2 = companion.uTCSettingDateToString(realtimeClassDataDto.getGpsCalculateDataDto().getMovingTime(), "HH:mm:ss.SSS");
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        DataClassUtil$Companion$updateClassValues$2$1 dataClassUtil$Companion$updateClassValues$2$1 = new DataClassUtil$Companion$updateClassValues$2$1(dialogExamInfoLayoutBinding2, realtimeClassDataDto, uTCSettingDateToString2, uTCSettingDateToString, format, null);
                        dataClassUtil$Companion$updateClassValues$1.L$0 = null;
                        dataClassUtil$Companion$updateClassValues$1.label = 2;
                    }
                    return Unit.INSTANCE;
                }
            }
            dataClassUtil$Companion$updateClassValues$1 = new DataClassUtil$Companion$updateClassValues$1(this, (Continuation) continuation);
            Object obj2 = dataClassUtil$Companion$updateClassValues$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = dataClassUtil$Companion$updateClassValues$1.label;
            if (i != 0) {
            }
            DialogExamInfoLayoutBinding dialogExamInfoLayoutBinding22 = dialogExamInfoLayoutBinding;
            realtimeClassDataDto = (RealtimeClassDataDto) obj2;
            if (realtimeClassDataDto != null) {
            }
            return Unit.INSTANCE;
        }

        private Companion() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r14, r6, r1) == r2) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        
            if (r0 == r2) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object updateClassValues(FragmentPracticeClassBinding fragmentPracticeClassBinding, GpsRepository gpsRepository, String str, Continuation continuation) {
            DataClassUtil$Companion$updateClassValues$3 dataClassUtil$Companion$updateClassValues$3;
            int i;
            RealtimeClassDataDto realtimeClassDataDto;
            if (continuation instanceof DataClassUtil$Companion$updateClassValues$3) {
                dataClassUtil$Companion$updateClassValues$3 = (DataClassUtil$Companion$updateClassValues$3) continuation;
                int i2 = dataClassUtil$Companion$updateClassValues$3.label;
                if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                    dataClassUtil$Companion$updateClassValues$3.label = i2 - IntCompanionObject.MIN_VALUE;
                    Object obj = dataClassUtil$Companion$updateClassValues$3.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataClassUtil$Companion$updateClassValues$3.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        dataClassUtil$Companion$updateClassValues$3.L$0 = fragmentPracticeClassBinding;
                        dataClassUtil$Companion$updateClassValues$3.label = 1;
                        obj = generateDataClass(str, gpsRepository, dataClassUtil$Companion$updateClassValues$3);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        fragmentPracticeClassBinding = (FragmentPracticeClassBinding) dataClassUtil$Companion$updateClassValues$3.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    FragmentPracticeClassBinding fragmentPracticeClassBinding2 = fragmentPracticeClassBinding;
                    realtimeClassDataDto = (RealtimeClassDataDto) obj;
                    if (realtimeClassDataDto != null) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("%.1f km", Arrays.copyOf(new Object[]{Boxing.boxDouble(realtimeClassDataDto.getGpsCalculateDataDto().getTotalDistance())}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        DateUtil.Companion companion = DateUtil.INSTANCE;
                        String uTCSettingDateToString = companion.uTCSettingDateToString(realtimeClassDataDto.getGpsCalculateDataDto().getStoppedTime(), "HH:mm:ss.SSS");
                        String uTCSettingDateToString2 = companion.uTCSettingDateToString(realtimeClassDataDto.getGpsCalculateDataDto().getMovingTime(), "HH:mm:ss.SSS");
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        DataClassUtil$Companion$updateClassValues$4$1 dataClassUtil$Companion$updateClassValues$4$1 = new DataClassUtil$Companion$updateClassValues$4$1(fragmentPracticeClassBinding2, realtimeClassDataDto, uTCSettingDateToString2, uTCSettingDateToString, format, null);
                        dataClassUtil$Companion$updateClassValues$3.L$0 = null;
                        dataClassUtil$Companion$updateClassValues$3.label = 2;
                    }
                    return Unit.INSTANCE;
                }
            }
            dataClassUtil$Companion$updateClassValues$3 = new DataClassUtil$Companion$updateClassValues$3(this, (Continuation) continuation);
            Object obj2 = dataClassUtil$Companion$updateClassValues$3.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = dataClassUtil$Companion$updateClassValues$3.label;
            if (i != 0) {
            }
            FragmentPracticeClassBinding fragmentPracticeClassBinding22 = fragmentPracticeClassBinding;
            realtimeClassDataDto = (RealtimeClassDataDto) obj2;
            if (realtimeClassDataDto != null) {
            }
            return Unit.INSTANCE;
        }
    }
}
