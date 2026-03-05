package com.gse.aulapp.util;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import co.ceduladigital.sdk.e4;
import co.ceduladigital.sdk.w8;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.gse.aulapp.R;
import com.gse.aulapp.util.DateUtil;
import com.karumi.dexter.BuildConfig;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/UtilDatePicker;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class UtilDatePicker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static MaterialDatePicker<Long> materialDatePicker;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\b0\u000eR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/gse/aulapp/util/UtilDatePicker$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "materialDatePicker", "Lcom/google/android/material/datepicker/MaterialDatePicker;", BuildConfig.FLAVOR, "showCalendar", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "uiContext", "Landroidx/fragment/app/FragmentManager;", "onButtonDateSelected", "Lkotlin/Function1;", "Ljava/util/Date;", "Lkotlin/ParameterName;", "name", "selection", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit showCalendar$lambda$0(Function1 onButtonDateSelected, Long l) {
            Intrinsics.checkNotNullParameter(onButtonDateSelected, "$onButtonDateSelected");
            DateUtil.Companion companion = DateUtil.INSTANCE;
            Intrinsics.checkNotNull(l);
            onButtonDateSelected.invoke(companion.uTCSettingDate(l.longValue()));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void showCalendar$lambda$1(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj);
        }

        public final void showCalendar(Context context, FragmentManager uiContext, Function1<? super Date, Unit> onButtonDateSelected) {
            Intrinsics.checkNotNullParameter(uiContext, "uiContext");
            Intrinsics.checkNotNullParameter(onButtonDateSelected, "onButtonDateSelected");
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
            builder.setOpenAt(timeInMillis);
            MaterialDatePicker.Builder<Long> datePicker = MaterialDatePicker.Builder.datePicker();
            Intrinsics.checkNotNullExpressionValue(datePicker, "datePicker(...)");
            datePicker.setSelection(Long.valueOf(timeInMillis));
            datePicker.setCalendarConstraints(builder.build());
            datePicker.setTheme(R.style.CustomDatePickerTheme);
            UtilDatePicker.materialDatePicker = datePicker.build();
            MaterialDatePicker materialDatePicker = UtilDatePicker.materialDatePicker;
            if (materialDatePicker != null) {
                materialDatePicker.addOnPositiveButtonClickListener(new w8(new e4(5, onButtonDateSelected)));
            }
            MaterialDatePicker materialDatePicker2 = UtilDatePicker.materialDatePicker;
            if (materialDatePicker2 != null) {
                materialDatePicker2.show(uiContext, String.valueOf(UtilDatePicker.materialDatePicker));
            }
        }

        private Companion() {
        }
    }
}
