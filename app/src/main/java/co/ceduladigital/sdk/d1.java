package co.ceduladigital.sdk;

import android.app.Activity;
import com.gse.aulapp.databinding.FragmentClassInCourseBinding;
import com.gse.aulapp.databinding.FragmentPracticeClassBinding;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class d1 implements Function0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ConfigurationSessionDto c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d1(PracticeClassViewModel practiceClassViewModel, Activity activity, FragmentPracticeClassBinding fragmentPracticeClassBinding, String str, ConfigurationSessionDto configurationSessionDto) {
        this.d = practiceClassViewModel;
        this.b = activity;
        this.e = fragmentPracticeClassBinding;
        this.f = str;
        this.c = configurationSessionDto;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit starTimerClass$lambda$6;
        Unit showDialogIsMock$lambda$22;
        switch (this.a) {
            case 0:
                starTimerClass$lambda$6 = ClassInCourseViewModel.starTimerClass$lambda$6((Integer) this.d, (FragmentClassInCourseBinding) this.e, (ClassInCourseViewModel) this.f, this.b, this.c);
                return starTimerClass$lambda$6;
            default:
                showDialogIsMock$lambda$22 = PracticeClassViewModel.showDialogIsMock$lambda$22((PracticeClassViewModel) this.d, this.b, (FragmentPracticeClassBinding) this.e, (String) this.f, this.c);
                return showDialogIsMock$lambda$22;
        }
    }

    public /* synthetic */ d1(Integer num, FragmentClassInCourseBinding fragmentClassInCourseBinding, ClassInCourseViewModel classInCourseViewModel, Activity activity, ConfigurationSessionDto configurationSessionDto) {
        this.d = num;
        this.e = fragmentClassInCourseBinding;
        this.f = classInCourseViewModel;
        this.b = activity;
        this.c = configurationSessionDto;
    }
}
