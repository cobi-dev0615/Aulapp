package com.gse.aulapp.util;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/gse/aulapp/util/ConnectivityObserver;", BuildConfig.FLAVOR, "observe", "Lkotlinx/coroutines/flow/Flow;", "Lcom/gse/aulapp/util/ConnectivityObserver$Status;", "Status", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ConnectivityObserver {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/gse/aulapp/util/ConnectivityObserver$Status;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "Available", "Unavailable", "Losing", "Lost", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status Available = new Status("Available", 0);
        public static final Status Unavailable = new Status("Unavailable", 1);
        public static final Status Losing = new Status("Losing", 2);
        public static final Status Lost = new Status("Lost", 3);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{Available, Unavailable, Losing, Lost};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Status(String str, int i) {
        }

        public static Status valueOfString(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    Flow<Status> observe();
}
