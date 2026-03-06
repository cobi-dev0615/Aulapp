package com.gse.aulapp.model.converter;

import android.location.Location;
import com.gse.aulapp.model.data.entity.GpsTraceEntity;
import com.gse.aulapp.model.dto.LocationDto;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/model/converter/LocationConverter;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LocationConverter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\f¢\u0006\u0004\b\n\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/gse/aulapp/model/converter/LocationConverter$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Lcom/gse/aulapp/model/dto/LocationDto;", "locationDto", "Lcom/gse/aulapp/model/data/entity/GpsTraceEntity;", "locationDtoToGpsTraceEntity", "(Lcom/gse/aulapp/model/dto/LocationDto;)Lcom/gse/aulapp/model/data/entity/GpsTraceEntity;", "gpsTraceEntity", "gpsTraceEntityToLocationDto", "(Lcom/gse/aulapp/model/data/entity/GpsTraceEntity;)Lcom/gse/aulapp/model/dto/LocationDto;", BuildConfig.FLAVOR, "(Ljava/util/List;)Ljava/util/List;", "Landroid/location/Location;", "location", BuildConfig.FLAVOR, "sessionID", "locationToLocationDto", "(Landroid/location/Location;Ljava/lang/String;)Lcom/gse/aulapp/model/dto/LocationDto;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLocationConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationConverter.kt\ncom/gse/aulapp/model/converter/LocationConverter$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,82:1\n1863#2,2:83\n*S KotlinDebug\n*F\n+ 1 LocationConverter.kt\ncom/gse/aulapp/model/converter/LocationConverter$Companion\n*L\n34#1:83,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocationDto gpsTraceEntityToLocationDto(GpsTraceEntity gpsTraceEntity) {
            Intrinsics.checkNotNullParameter(gpsTraceEntity, "gpsTraceEntity");
            return new LocationDto(gpsTraceEntity.getSessionID(), gpsTraceEntity.getDate(), gpsTraceEntity.getLatitude(), gpsTraceEntity.getLongitude(), gpsTraceEntity.getSpeed());
        }

        public final GpsTraceEntity locationDtoToGpsTraceEntity(LocationDto locationDto) {
            Intrinsics.checkNotNullParameter(locationDto, "locationDto");
            return new GpsTraceEntity(locationDto.getId(), locationDto.getLatitude(), locationDto.getLongitude(), locationDto.getDate(), locationDto.getSpeed());
        }

        public final LocationDto locationToLocationDto(Location location, String sessionID) {
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(sessionID, "sessionID");
            return new LocationDto(sessionID, location.getTime(), location.getLatitude(), location.getLongitude(), location.getSpeed());
        }

        private Companion() {
        }

        public final List<LocationDto> gpsTraceEntityToLocationDto(List<GpsTraceEntity> gpsTraceEntity) {
            Intrinsics.checkNotNullParameter(gpsTraceEntity, "gpsTraceEntity");
            ArrayList arrayList = new ArrayList();
            Iterator it = gpsTraceEntity.iterator();
            while (it.hasNext()) {
                arrayList.add(LocationConverter.INSTANCE.gpsTraceEntityToLocationDto((GpsTraceEntity) it.next()));
            }
            return arrayList;
        }
    }
}
