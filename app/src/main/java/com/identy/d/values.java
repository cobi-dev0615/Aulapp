package com.identy.d;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* loaded from: classes2.dex */
public final class values implements SensorEventListener {
    private Context PngjExceptionInternal;
    public float valueOf = 0.0f;
    private final float values = 15.0f;
    private final float PngjException = 800.0f;
    private boolean PngjBadSignature = false;
    private boolean PngjBadCrcException = false;

    public values(Context context) {
        this.PngjExceptionInternal = context;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        boolean z = false;
        if (sensorEvent.sensor.getType() == 5) {
            this.valueOf = sensorEvent.values[0];
        }
        float f = this.valueOf;
        boolean z2 = true;
        if (f > 15.0f) {
            if (f >= 800.0f) {
                z = true;
                z2 = false;
            } else {
                z2 = false;
            }
        }
        if (this.PngjBadSignature == z && this.PngjBadCrcException == z2) {
            return;
        }
        this.PngjBadSignature = z;
        this.PngjBadCrcException = z2;
    }
}
