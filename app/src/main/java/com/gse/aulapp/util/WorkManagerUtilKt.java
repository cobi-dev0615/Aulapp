package com.gse.aulapp.util;

import com.karumi.dexter.BuildConfig;
import java.util.Calendar;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0005"}, d2 = {"calculateDesiredTimeMillis", BuildConfig.FLAVOR, "hour", BuildConfig.FLAVOR, "minute", "app_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WorkManagerUtilKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long calculateDesiredTimeMillis(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long currentTimeMillis = System.currentTimeMillis();
        long timeInMillis = calendar.getTimeInMillis();
        if (currentTimeMillis > timeInMillis && calendar.get(6) == Calendar.getInstance().get(6)) {
            return 0L;
        }
        if (currentTimeMillis <= timeInMillis) {
            return timeInMillis - currentTimeMillis;
        }
        calendar.add(6, 1);
        return calendar.getTimeInMillis() - currentTimeMillis;
    }
}
