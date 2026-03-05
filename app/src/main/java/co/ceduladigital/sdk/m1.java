package co.ceduladigital.sdk;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class m1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ConfigurationSessionDto f;
    public final /* synthetic */ ViewModel g;

    public /* synthetic */ m1(ViewModel viewModel, Context context, long j, long j2, int i, ConfigurationSessionDto configurationSessionDto, int i2) {
        this.a = i2;
        this.g = viewModel;
        this.b = context;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = configurationSessionDto;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit startTimerService$lambda$8;
        Unit startTimerService$lambda$6;
        int i = this.a;
        long longValue = ((Long) obj).longValue();
        ViewModel viewModel = this.g;
        switch (i) {
            case 0:
                startTimerService$lambda$8 = ClassInCourseViewModel.startTimerService$lambda$8((ClassInCourseViewModel) viewModel, this.b, this.c, this.d, this.e, this.f, longValue);
                return startTimerService$lambda$8;
            default:
                startTimerService$lambda$6 = PracticeClassViewModel.startTimerService$lambda$6((PracticeClassViewModel) viewModel, this.b, this.c, this.d, this.e, this.f, longValue);
                return startTimerService$lambda$6;
        }
    }
}
