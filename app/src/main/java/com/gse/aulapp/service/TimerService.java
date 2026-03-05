package com.gse.aulapp.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.CountDownTimer;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import androidx.view.MutableLiveData;
import com.gse.aulapp.R;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.util.SingleLiveEvent;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\nH\u0002J(\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0010H\u0002J \u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J(\u0010\"\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J \u0010#\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0014H\u0002J(\u0010$\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020\u0010H\u0002J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020)H\u0002J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u0007H\u0003J\b\u00100\u001a\u00020\u0016H\u0002J\b\u00101\u001a\u00020\u0016H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/gse/aulapp/service/TimerService;", "Landroid/app/Service;", "<init>", "()V", "timer", "Landroid/os/CountDownTimer;", "firstDurationMillis", BuildConfig.FLAVOR, "newDurationMillis", "isPracticeExam", BuildConfig.FLAVOR, "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onStartCommand", BuildConfig.FLAVOR, "flags", "startId", "setConfigurationSessionDto", "Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;", "startTimer", BuildConfig.FLAVOR, "durationMillis", "minutesForAlarm", "retakeElapsedTime", "configurationSession", "isRetake", "handleTick", "elapsedTime", "alarmMillis", "calculateElapsedTimeSlider", "updateMinimumTimeRemaining", "getTimeMinimumPercentage", "checkForAlarmActivation", "checkForMinimumClassTimeActivation", "handleFinish", "createNotificationChannel", "createNotification", "Landroid/app/Notification;", "content", BuildConfig.FLAVOR, "createAlarmNotification", "timeMin", "updateNotification", "text", "getFormattedTimeToString", "milliseconds", "stopAndRemoveTimer", "onDestroy", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimerService extends Service {
    private static MutableStateFlow<Boolean> _isExtraTime;
    private static MutableStateFlow<Boolean> _isMinimumClassTime;
    private static MutableStateFlow<Boolean> _isTimeForAlarm;
    private static StateFlow<Boolean> isExtraTime;
    private static final StateFlow<Boolean> isMinimumClassTime;
    private static boolean isServiceRunning;
    private static final StateFlow<Boolean> isTimeForAlarm;
    private static final SingleLiveEvent<String> timeMinimumRemaining;
    private long firstDurationMillis;
    private boolean isPracticeExam;
    private long newDurationMillis;
    private CountDownTimer timer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final MutableLiveData<String> timeElapsed = new MutableLiveData<>();
    private static final MutableLiveData<Float> timeElapsedSlider = new MutableLiveData<>();

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006%"}, d2 = {"Lcom/gse/aulapp/service/TimerService$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroidx/lifecycle/MutableLiveData;", BuildConfig.FLAVOR, "timeElapsed", "Landroidx/lifecycle/MutableLiveData;", "getTimeElapsed", "()Landroidx/lifecycle/MutableLiveData;", BuildConfig.FLAVOR, "timeElapsedSlider", "getTimeElapsedSlider", "Lkotlinx/coroutines/flow/StateFlow;", BuildConfig.FLAVOR, "isTimeForAlarm", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "isMinimumClassTime", "Lcom/gse/aulapp/util/SingleLiveEvent;", "timeMinimumRemaining", "Lcom/gse/aulapp/util/SingleLiveEvent;", "getTimeMinimumRemaining", "()Lcom/gse/aulapp/util/SingleLiveEvent;", "isExtraTime", "setExtraTime", "(Lkotlinx/coroutines/flow/StateFlow;)V", BuildConfig.FLAVOR, "TIMER_NOTIFICATION_ID", "I", "TIMER_CHANNEL_ID", "Ljava/lang/String;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_isTimeForAlarm", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_isMinimumClassTime", "_isExtraTime", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MutableLiveData<String> getTimeElapsed() {
            return TimerService.timeElapsed;
        }

        public final MutableLiveData<Float> getTimeElapsedSlider() {
            return TimerService.timeElapsedSlider;
        }

        public final SingleLiveEvent<String> getTimeMinimumRemaining() {
            return TimerService.timeMinimumRemaining;
        }

        public final StateFlow<Boolean> isExtraTime() {
            return TimerService.isExtraTime;
        }

        public final StateFlow<Boolean> isMinimumClassTime() {
            return TimerService.isMinimumClassTime;
        }

        public final StateFlow<Boolean> isTimeForAlarm() {
            return TimerService.isTimeForAlarm;
        }

        private Companion() {
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        _isTimeForAlarm = MutableStateFlow;
        isTimeForAlarm = MutableStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        _isMinimumClassTime = MutableStateFlow2;
        isMinimumClassTime = MutableStateFlow2;
        timeMinimumRemaining = new SingleLiveEvent<>();
        MutableStateFlow<Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(bool);
        _isExtraTime = MutableStateFlow3;
        isExtraTime = MutableStateFlow3;
    }

    private final int calculateElapsedTimeSlider() {
        return 60000;
    }

    private final void checkForAlarmActivation(long elapsedTime, long alarmMillis, long durationMillis, ConfigurationSessionDto configurationSession) {
        if (durationMillis > alarmMillis) {
            if (isExtraTime.getValue().booleanValue()) {
                durationMillis = this.firstDurationMillis + this.newDurationMillis;
            }
            if (elapsedTime < durationMillis - alarmMillis || _isTimeForAlarm.getValue().booleanValue()) {
                return;
            }
            _isTimeForAlarm.setValue(Boolean.TRUE);
            Notification createAlarmNotification = isExtraTime.getValue().booleanValue() ? createAlarmNotification(configurationSession.getAlertDepartureAfter()) : createAlarmNotification(configurationSession.getAlertEndSession());
            Object systemService = getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).notify(2, createAlarmNotification);
        }
    }

    private final void checkForMinimumClassTimeActivation(long elapsedTime, long durationMillis, ConfigurationSessionDto configurationSession) {
        if ((elapsedTime / durationMillis) * 100 < getTimeMinimumPercentage(configurationSession) || _isMinimumClassTime.getValue().booleanValue()) {
            return;
        }
        _isMinimumClassTime.setValue(Boolean.TRUE);
    }

    private final Notification createAlarmNotification(int timeMin) {
        CharSequence text = getResources().getText(R.string.dialog_fullscreen_max_wait_time_class);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        Notification build = new NotificationCompat.Builder(this, "timer_channel").setContentText(StringsKt.t(text.toString(), "[TIME]", String.valueOf(timeMin))).setSmallIcon(R.drawable.ic_aulapp_notification).setOnlyAlertOnce(true).setStyle(new NotificationCompat.DecoratedCustomViewStyle()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final Notification createNotification(String content) {
        Notification build = new NotificationCompat.Builder(this, "timer_channel").setContentTitle(getResources().getString(R.string.txt_time_of_class)).setContentText(content).setSmallIcon(R.drawable.ic_aulapp_notification).setOnlyAlertOnce(true).setStyle(new NotificationCompat.DecoratedCustomViewStyle()).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void createNotificationChannel() {
        String string = getResources().getString(R.string.txt_time_of_class);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = getString(R.string.txt_time_elaped_in_class);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        NotificationChannel notificationChannel = new NotificationChannel("timer_channel", string, 4);
        notificationChannel.setDescription(string2);
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }

    private final String getFormattedTimeToString(long milliseconds) {
        long j = milliseconds / 1000;
        long j2 = 3600;
        long j3 = j / j2;
        long j4 = 60;
        long j5 = (j % j2) / j4;
        long j6 = j % j4;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final int getTimeMinimumPercentage(ConfigurationSessionDto configurationSession) {
        return MathKt.roundToInt((configurationSession.getDurationForHour() * 100.0d) / configurationSession.getMinuteForHour());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleFinish(long durationMillis, ConfigurationSessionDto configurationSession, long retakeElapsedTime, boolean isRetake) {
        _isTimeForAlarm.setValue(Boolean.FALSE);
        Objects.toString(_isExtraTime.getValue());
        if (_isExtraTime.getValue().booleanValue()) {
            timeElapsed.postValue(getFormattedTimeToString(this.firstDurationMillis + this.newDurationMillis));
            isServiceRunning = false;
            stopSelf();
            return;
        }
        timeElapsed.postValue(getFormattedTimeToString(durationMillis));
        _isExtraTime.setValue(Boolean.TRUE);
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        notificationManager.cancel(2);
        notificationManager.notify(2, createAlarmNotification(configurationSession.getMinToleranceDepartureAfter()));
        startTimer(this.newDurationMillis, configurationSession.getAlertDepartureAfter(), retakeElapsedTime, configurationSession, isRetake);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTick(long elapsedTime, long alarmMillis, long durationMillis, ConfigurationSessionDto configurationSession) {
        float calculateElapsedTimeSlider = elapsedTime / calculateElapsedTimeSlider();
        String formattedTimeToString = getFormattedTimeToString(elapsedTime);
        getFormattedTimeToString(this.firstDurationMillis);
        if (elapsedTime != this.firstDurationMillis) {
            timeElapsed.postValue(formattedTimeToString);
            timeElapsedSlider.postValue(Float.valueOf(calculateElapsedTimeSlider));
        }
        checkForAlarmActivation(elapsedTime, alarmMillis, durationMillis, configurationSession);
        checkForMinimumClassTimeActivation(elapsedTime, durationMillis, configurationSession);
        updateMinimumTimeRemaining(elapsedTime, durationMillis, configurationSession);
        updateNotification(getFormattedTimeToString(elapsedTime));
    }

    private final ConfigurationSessionDto setConfigurationSessionDto(Intent intent) {
        return new ConfigurationSessionDto(null, intent != null ? intent.getIntExtra("min_tolerance_entry_before", 20) : 20, intent != null ? intent.getIntExtra("min_tolerance_entry_after", 20) : 20, intent != null ? intent.getIntExtra("min_tolerance_departure_after", 15) : 15, intent != null ? intent.getIntExtra("duration_for_hour", 45) : 45, intent != null ? intent.getIntExtra("duration_for_hour_show", 45) : 45, intent != null ? intent.getIntExtra("alert_end_session", 10) : 10, intent != null ? intent.getIntExtra("alert_departure_after", 10) : 10, intent != null ? intent.getIntExtra("minutes_for_hour", 60) : 60, 1, null);
    }

    private final void startTimer(long durationMillis, int minutesForAlarm, final long retakeElapsedTime, final ConfigurationSessionDto configurationSession, boolean isRetake) {
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = durationMillis;
        isServiceRunning = true;
        stopAndRemoveTimer();
        createNotificationChannel();
        String string = getString(R.string.txt_time_elapsed);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Notification createNotification = createNotification(string);
        if (Build.VERSION.SDK_INT < 33) {
            startForeground(1, createNotification);
        } else {
            startForeground(1, createNotification, 1);
        }
        final long j = 60000 * minutesForAlarm;
        final Ref.LongRef longRef2 = new Ref.LongRef();
        long j2 = isRetake ? durationMillis - retakeElapsedTime : durationMillis;
        longRef2.element = j2;
        if (j2 < 0) {
            longRef.element = retakeElapsedTime;
            longRef2.element = durationMillis;
            _isExtraTime.setValue(Boolean.TRUE);
        }
        this.timer = new CountDownTimer(this, longRef, j, configurationSession, retakeElapsedTime) { // from class: com.gse.aulapp.service.TimerService$startTimer$1
            final /* synthetic */ long $alarmMillis;
            final /* synthetic */ Ref.LongRef $calculateNewDurationMillis;
            final /* synthetic */ ConfigurationSessionDto $configurationSession;
            final /* synthetic */ long $retakeElapsedTime;
            final /* synthetic */ TimerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(Ref.LongRef.this.element, 1000L);
                this.this$0 = this;
                this.$calculateNewDurationMillis = longRef;
                this.$alarmMillis = j;
                this.$configurationSession = configurationSession;
                this.$retakeElapsedTime = retakeElapsedTime;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.this$0.handleFinish(Ref.LongRef.this.element, this.$configurationSession, this.$retakeElapsedTime, false);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                long j3;
                long unused;
                mutableStateFlow = TimerService._isExtraTime;
                Object value = mutableStateFlow.getValue();
                unused = this.this$0.firstDurationMillis;
                Objects.toString(value);
                long j4 = this.$calculateNewDurationMillis.element - millisUntilFinished;
                mutableStateFlow2 = TimerService._isExtraTime;
                if (((Boolean) mutableStateFlow2.getValue()).booleanValue()) {
                    j3 = this.this$0.firstDurationMillis;
                    j4 += j3;
                }
                this.this$0.handleTick(j4, this.$alarmMillis, this.$calculateNewDurationMillis.element, this.$configurationSession);
            }
        }.start();
    }

    private final void stopAndRemoveTimer() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    private final void updateMinimumTimeRemaining(long elapsedTime, long durationMillis, ConfigurationSessionDto configurationSession) {
        long timeMinimumPercentage = ((durationMillis * getTimeMinimumPercentage(configurationSession)) / 100) - elapsedTime;
        timeMinimumRemaining.postValue(timeMinimumPercentage > 0 ? getFormattedTimeToString(timeMinimumPercentage) : getFormattedTimeToString(0L));
    }

    private final void updateNotification(String text) {
        Notification createNotification = createNotification(text);
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(1, createNotification);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        timeElapsedSlider.postValue(Float.valueOf(0.0f));
        MutableStateFlow<Boolean> mutableStateFlow = _isTimeForAlarm;
        Boolean bool = Boolean.FALSE;
        mutableStateFlow.setValue(bool);
        _isExtraTime.setValue(bool);
        _isMinimumClassTime.setValue(bool);
        isServiceRunning = false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        long longExtra = intent != null ? intent.getLongExtra("durationMillis", 0L) : 0L;
        long longExtra2 = intent != null ? intent.getLongExtra("retake_elapsed_time", 0L) : 0L;
        long longExtra3 = intent != null ? intent.getLongExtra("durationMillisExtra", 0L) : 0L;
        int intExtra = intent != null ? intent.getIntExtra("minutesForAlarm", 0) : 0;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("IS_RETAKE", false) : false;
        this.firstDurationMillis = longExtra;
        this.newDurationMillis = longExtra3;
        this.isPracticeExam = intent != null ? intent.getBooleanExtra("practice_class", false) : false;
        startTimer(longExtra, intExtra, longExtra2, setConfigurationSessionDto(intent), booleanExtra);
        return 2;
    }
}
