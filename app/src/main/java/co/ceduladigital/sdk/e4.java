package co.ceduladigital.sdk;

import com.gse.aulapp.util.ExternalUtil;
import com.gse.aulapp.util.ExternalUtil$Companion$getDateTimeApi$1;
import com.gse.aulapp.util.UtilDatePicker;
import com.gse.aulapp.viewmodel.HomeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ e4(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit dateTime$lambda$0;
        Unit dateTime$lambda$1;
        Unit onFailure$lambda$1;
        Unit onResponse$lambda$0;
        Unit sessionRequest$lambda$16;
        Unit showCalendar$lambda$0;
        switch (this.a) {
            case 0:
                dateTime$lambda$0 = ExternalUtil.Companion.getDateTime$lambda$0(this.b, (String) obj);
                return dateTime$lambda$0;
            case 1:
                dateTime$lambda$1 = ExternalUtil.Companion.getDateTime$lambda$1(this.b, (String) obj);
                return dateTime$lambda$1;
            case 2:
                onFailure$lambda$1 = ExternalUtil$Companion$getDateTimeApi$1.onFailure$lambda$1(this.b, (String) obj);
                return onFailure$lambda$1;
            case 3:
                onResponse$lambda$0 = ExternalUtil$Companion$getDateTimeApi$1.onResponse$lambda$0(this.b, (String) obj);
                return onResponse$lambda$0;
            case 4:
                sessionRequest$lambda$16 = HomeViewModel.getSessionRequest$lambda$16(this.b, (String) obj);
                return sessionRequest$lambda$16;
            default:
                showCalendar$lambda$0 = UtilDatePicker.Companion.showCalendar$lambda$0(this.b, (Long) obj);
                return showCalendar$lambda$0;
        }
    }
}
