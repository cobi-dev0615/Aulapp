package co.ceduladigital.sdk;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.model.dto.GpsCalculateDataDto;
import com.gse.aulapp.model.dto.LocationDto;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.GpsTracerUtil;
import com.gse.aulapp.util.GpsUtil;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.view.fragment.ClassFragment;
import com.gse.aulapp.viewmodel.ClassViewModel;
import java.util.Arrays;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClassFragment b;

    public /* synthetic */ i0(ClassFragment classFragment, int i) {
        this.a = i;
        this.b = classFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ClassViewModel classViewModel = null;
        ClassFragment this$0 = this.b;
        switch (this.a) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                PermissionHelper.Companion companion = PermissionHelper.INSTANCE;
                FragmentActivity requireActivity = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                companion.validateNotificationPermissionFlow(requireActivity, new j0(this$0, uuid, 0));
                break;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                GpsUtil.Companion companion2 = GpsUtil.INSTANCE;
                FragmentActivity requireActivity2 = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                companion2.stopGps(requireActivity2);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                DateUtil.Companion companion3 = DateUtil.INSTANCE;
                Long uTCSettingLong = companion3.uTCSettingLong("2021-05-04T00:00:00.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                LocationDto locationDto = new LocationDto("6452831d8dd9cfa7d1f616bb", uTCSettingLong != null ? uTCSettingLong.longValue() : 0L, 0.0d, 0.0d, 0.0d);
                Long uTCSettingLong2 = companion3.uTCSettingLong("2021-05-04T00:01:00.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                LocationDto locationDto2 = new LocationDto("6452831d8dd9cfa7d1f616bb", uTCSettingLong2 != null ? uTCSettingLong2.longValue() : 0L, 1.0d, 1.0d, 1.0d);
                Long uTCSettingLong3 = companion3.uTCSettingLong("2021-05-04T00:02:00.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                LocationDto locationDto3 = new LocationDto("6452831d8dd9cfa7d1f616bb", uTCSettingLong3 != null ? uTCSettingLong3.longValue() : 0L, 2.0d, 2.0d, 2.0d);
                Long uTCSettingLong4 = companion3.uTCSettingLong("2021-05-04T00:03:00.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                LocationDto locationDto4 = new LocationDto("6452831d8dd9cfa7d1f616bb", uTCSettingLong4 != null ? uTCSettingLong4.longValue() : 0L, 2.0d, 2.0d, 2.0d);
                Long uTCSettingLong5 = companion3.uTCSettingLong("2021-05-04T00:04:00.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                LocationDto locationDto5 = new LocationDto("6452831d8dd9cfa7d1f616bb", uTCSettingLong5 != null ? uTCSettingLong5.longValue() : 0L, 2.0d, 2.0d, 2.0d);
                Long uTCSettingLong6 = companion3.uTCSettingLong("2021-05-04T00:05:00.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                LocationDto locationDto6 = new LocationDto("6452831d8dd9cfa7d1f616bb", uTCSettingLong6 != null ? uTCSettingLong6.longValue() : 0L, 2.0d, 2.0d, 2.0d);
                Long uTCSettingLong7 = companion3.uTCSettingLong("2021-05-04T00:06:00.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                LocationDto locationDto7 = new LocationDto("6452831d8dd9cfa7d1f616bb", uTCSettingLong7 != null ? uTCSettingLong7.longValue() : 0L, 3.0d, 3.0d, 3.0d);
                Long uTCSettingLong8 = companion3.uTCSettingLong("2021-05-04T00:07:00.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                LocationDto locationDto8 = new LocationDto("6452831d8dd9cfa7d1f616bb", uTCSettingLong8 != null ? uTCSettingLong8.longValue() : 0L, 3.0d, 3.0d, 3.0d);
                Long uTCSettingLong9 = companion3.uTCSettingLong("2021-05-04T00:08:00.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                LocationDto locationDto9 = new LocationDto("6452831d8dd9cfa7d1f616bb", uTCSettingLong9 != null ? uTCSettingLong9.longValue() : 0L, 3.0d, 3.0d, 3.0d);
                Long uTCSettingLong10 = companion3.uTCSettingLong("2021-05-04T00:09:00.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                LocationDto locationDto10 = new LocationDto("6452831d8dd9cfa7d1f616bb", uTCSettingLong10 != null ? uTCSettingLong10.longValue() : 0L, 4.0d, 4.0d, 4.0d);
                Long uTCSettingLong11 = companion3.uTCSettingLong("2021-05-04T00:10:00.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                LocationDto locationDto11 = new LocationDto("6452831d8dd9cfa7d1f616bb", uTCSettingLong11 != null ? uTCSettingLong11.longValue() : 0L, 5.0d, 5.0d, 5.0d);
                long j = 0;
                Long uTCSettingLong12 = companion3.uTCSettingLong("2021-05-04T00:13:30.000Z", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                if (uTCSettingLong12 != null) {
                    j = uTCSettingLong12.longValue();
                }
                GpsCalculateDataDto calculateTotalDistanceStoppedAndMovingTime = GpsTracerUtil.INSTANCE.calculateTotalDistanceStoppedAndMovingTime(CollectionsKt.mutableListOf(locationDto, locationDto2, locationDto3, locationDto4, locationDto5, locationDto6, locationDto7, locationDto8, locationDto9, locationDto10, locationDto11, new LocationDto("6452831d8dd9cfa7d1f616bb", j, 10.0d, 5.0d, 5.0d)));
                String str = this$0.a;
                calculateTotalDistanceStoppedAndMovingTime.getTotalDistance();
                calculateTotalDistanceStoppedAndMovingTime.getStoppedTime();
                calculateTotalDistanceStoppedAndMovingTime.getMovingTime();
                calculateTotalDistanceStoppedAndMovingTime.toString();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(calculateTotalDistanceStoppedAndMovingTime.getTotalDistance())}, 1)), "format(...)");
                companion3.uTCSettingDateToString(calculateTotalDistanceStoppedAndMovingTime.getStoppedTime(), "HH:mm:ss.SSS");
                companion3.uTCSettingDateToString(calculateTotalDistanceStoppedAndMovingTime.getMovingTime(), "HH:mm:ss.SSS");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ClassViewModel classViewModel2 = this$0.b;
                if (classViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    classViewModel = classViewModel2;
                }
                FragmentActivity requireActivity3 = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                classViewModel.disableNfc(requireActivity3);
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ClassViewModel classViewModel3 = this$0.b;
                if (classViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    classViewModel = classViewModel3;
                }
                FragmentActivity requireActivity4 = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
                classViewModel.validateAndActiveNfc(requireActivity4);
                break;
        }
    }
}
