package com.gse.aulapp.util;

import co.ceduladigital.sdk.q;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/gse/aulapp/util/KalmanFilter;", BuildConfig.FLAVOR, "<init>", "()V", "estimate", BuildConfig.FLAVOR, "error", "processNoise", "measurementNoise", "update", "measurement", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KalmanFilter {
    private float estimate;
    private float error = 1.0f;
    private final float processNoise = 0.125f;
    private final float measurementNoise = 4.0f;

    public final float update(float measurement) {
        float f = this.error + this.processNoise;
        float f2 = f / (this.measurementNoise + f);
        float f3 = this.estimate;
        float a = q.a(measurement, f3, f2, f3);
        this.estimate = a;
        this.error = (1 - f2) * f;
        return a;
    }
}
