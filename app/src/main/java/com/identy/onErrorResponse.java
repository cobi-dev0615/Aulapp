package com.identy;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class onErrorResponse implements SensorEventListener {
    final Sensor PngjBadCrcException;
    long PngjBadSignature;
    boolean valueOf;
    final SensorManager values;
    List PngjException = new ArrayList();
    private final float[] PngjInputException = new float[4];
    private final float[] PngjUnsupportedException = new float[9];
    private final float[] PngjOutputException = new float[9];
    private final float[] PngjExceptionInternal = new float[9];
    private final float[] PngjPrematureEnding = new float[3];
    private final float[] onErrorResponse = new float[3];
    private final double[] a = new double[3];

    public onErrorResponse(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.values = sensorManager;
        this.PngjBadCrcException = sensorManager.getDefaultSensor(4);
        values();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        List list = this.PngjException;
        Float valueOf = Float.valueOf(f);
        Float valueOf2 = Float.valueOf(f2);
        Float valueOf3 = Float.valueOf(f3);
        Integer valueOf4 = Integer.valueOf(sensorEvent.accuracy);
        Long valueOf5 = Long.valueOf(sensorEvent.timestamp);
        long j = sensorEvent.timestamp;
        list.add(new Object[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf5, Long.valueOf(((j - SystemClock.elapsedRealtimeNanos()) / 1000000) + System.currentTimeMillis())});
    }

    public final void values() {
        for (int i = 0; i < 9; i++) {
            this.PngjUnsupportedException[i] = 0.0f;
        }
        float[] fArr = this.PngjUnsupportedException;
        fArr[0] = 1.0f;
        fArr[4] = 1.0f;
        fArr[8] = 1.0f;
    }
}
