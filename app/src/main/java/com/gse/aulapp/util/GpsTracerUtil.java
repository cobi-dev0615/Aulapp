package com.gse.aulapp.util;

import com.gse.aulapp.model.dto.GpsCalculateDataDto;
import com.gse.aulapp.model.dto.LocationDto;
import com.karumi.dexter.BuildConfig;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/GpsTracerUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class GpsTracerUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = Reflection.getOrCreateKotlinClass(GpsTracerUtil.class).getSimpleName();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ(\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/gse/aulapp/util/GpsTracerUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "TAG", BuildConfig.FLAVOR, "distanceThreshold", BuildConfig.FLAVOR, "calculateTotalDistanceStoppedAndMovingTime", "Lcom/gse/aulapp/model/dto/GpsCalculateDataDto;", "locations", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/LocationDto;", "haversineDistance", "lat1", "lon1", "lat2", "lon2", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nGpsTracerUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GpsTracerUtil.kt\ncom/gse/aulapp/util/GpsTracerUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt\n*L\n1#1,83:1\n1053#2:84\n*S KotlinDebug\n*F\n+ 1 GpsTracerUtil.kt\ncom/gse/aulapp/util/GpsTracerUtil$Companion\n*L\n22#1:84\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final double haversineDistance(double lat1, double lon1, double lat2, double lon2) {
            double radians = Math.toRadians(lat2 - lat1);
            double radians2 = Math.toRadians(lon2 - lon1);
            double d = 2;
            double d2 = radians / d;
            double d3 = radians2 / d;
            double sin = (Math.sin(d3) * Math.sin(d3) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(lat1))) + (Math.sin(d2) * Math.sin(d2));
            return Math.atan2(Math.sqrt(sin), Math.sqrt(1 - sin)) * d * 6371000.0d;
        }

        public final GpsCalculateDataDto calculateTotalDistanceStoppedAndMovingTime(List<LocationDto> locations) {
            List sortedWith;
            Intrinsics.checkNotNullParameter(locations, "locations");
            if (locations.size() < 2) {
                return new GpsCalculateDataDto(0.0d, 0L, 0L);
            }
            sortedWith = CollectionsKt.sortedWith(locations, new Comparator() { // from class: com.gse.aulapp.util.GpsTracerUtil$Companion$calculateTotalDistanceStoppedAndMovingTime$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(Object t, Object t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((LocationDto) t).getDate()), Long.valueOf(((LocationDto) t2).getDate()));
                }
            });
            int size = sortedWith.size() - 1;
            int i = 0;
            double d = 0.0d;
            long j = 0;
            long j2 = 0;
            while (i < size) {
                LocationDto locationDto = (LocationDto) sortedWith.get(i);
                i++;
                LocationDto locationDto2 = (LocationDto) sortedWith.get(i);
                long date = locationDto2.getDate() - locationDto.getDate();
                if (date > 0) {
                    double haversineDistance = haversineDistance(locationDto.getLatitude(), locationDto.getLongitude(), locationDto2.getLatitude(), locationDto2.getLongitude());
                    if (haversineDistance > 3.0d) {
                        d += haversineDistance;
                    }
                    if (locationDto.getSpeed() > 0.0d) {
                        j2 += date;
                    } else {
                        j += date;
                    }
                }
            }
            return new GpsCalculateDataDto(d / 1000.0d, j, j2);
        }

        private Companion() {
        }
    }
}
