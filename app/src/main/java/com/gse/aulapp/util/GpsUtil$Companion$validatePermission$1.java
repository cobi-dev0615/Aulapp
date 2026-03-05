package com.gse.aulapp.util;

import android.app.Activity;
import com.gse.aulapp.model.enums.EnumPermissionDevices;
import com.gse.aulapp.util.PermissionHelper;
import com.karumi.dexter.BuildConfig;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"com/gse/aulapp/util/GpsUtil$Companion$validatePermission$1", "Lcom/karumi/dexter/listener/single/PermissionListener;", "Lcom/gse/aulapp/util/PermissionHelper$Companion$PermissionGrantedListener;", "onPermissionGranted", BuildConfig.FLAVOR, "response", "Lcom/karumi/dexter/listener/PermissionGrantedResponse;", "onPermissionDenied", "p0", "Lcom/karumi/dexter/listener/PermissionDeniedResponse;", "onPermissionRationaleShouldBeShown", "Lcom/karumi/dexter/listener/PermissionRequest;", "p1", "Lcom/karumi/dexter/PermissionToken;", "onPermissionCancel", "device", "Lcom/gse/aulapp/model/enums/EnumPermissionDevices;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GpsUtil$Companion$validatePermission$1 implements PermissionListener, PermissionHelper.Companion.PermissionGrantedListener {
    final /* synthetic */ Activity $context;
    final /* synthetic */ Function0<Unit> $function;

    public GpsUtil$Companion$validatePermission$1(Activity activity, Function0<Unit> function0) {
        this.$context = activity;
        this.$function = function0;
    }

    @Override // com.gse.aulapp.util.PermissionHelper.Companion.PermissionGrantedListener
    public void onPermissionCancel(EnumPermissionDevices device) {
        Intrinsics.checkNotNullParameter(device, "device");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(PermissionDeniedResponse p0) {
        String unused = GpsUtil.TAG;
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(PermissionGrantedResponse response) {
        String unused = GpsUtil.TAG;
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(PermissionRequest p0, PermissionToken p1) {
        String unused = GpsUtil.TAG;
    }

    @Override // com.gse.aulapp.util.PermissionHelper.Companion.PermissionGrantedListener
    public void onPermissionGranted() {
        String unused = GpsUtil.TAG;
        GpsUtil.INSTANCE.validateHardwareAndGpsTurnOn(this.$context, this.$function);
    }
}
