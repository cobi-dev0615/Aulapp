package co.ceduladigital.sdk;

import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.FragmentKt;
import com.gse.aulapp.databinding.FragmentPracticeClassBinding;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.view.fragment.PracticeClassFragment;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class k7 implements FlowCollector {
    public final /* synthetic */ int a;
    public final /* synthetic */ PracticeClassFragment b;

    public /* synthetic */ k7(PracticeClassFragment practiceClassFragment, int i) {
        this.a = i;
        this.b = practiceClassFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    PracticeClassFragment practiceClassFragment = this.b;
                    FragmentPracticeClassBinding fragmentPracticeClassBinding = practiceClassFragment.a;
                    Intrinsics.checkNotNull(fragmentPracticeClassBinding);
                    fragmentPracticeClassBinding.floatingActionButton.setVisibility(8);
                    FragmentPracticeClassBinding fragmentPracticeClassBinding2 = practiceClassFragment.a;
                    Intrinsics.checkNotNull(fragmentPracticeClassBinding2);
                    fragmentPracticeClassBinding2.btnEndClass.setVisibility(0);
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    PracticeClassFragment practiceClassFragment2 = this.b;
                    PracticeClassViewModel practiceClassViewModel = practiceClassFragment2.b;
                    PracticeClassViewModel practiceClassViewModel2 = null;
                    if (practiceClassViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        practiceClassViewModel = null;
                    }
                    if (practiceClassViewModel.isExtraTime().getValue().booleanValue()) {
                        FragmentActivity activity = practiceClassFragment2.getActivity();
                        if (activity != null) {
                            PracticeClassViewModel practiceClassViewModel3 = practiceClassFragment2.b;
                            if (practiceClassViewModel3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            } else {
                                practiceClassViewModel2 = practiceClassViewModel3;
                            }
                            ConfigurationSessionDto configurationSessionDto = practiceClassFragment2.e;
                            int alertDepartureAfter = configurationSessionDto != null ? configurationSessionDto.getAlertDepartureAfter() : 15;
                            String str = practiceClassFragment2.c;
                            Intrinsics.checkNotNull(str);
                            practiceClassViewModel2.dialogExtraTimeClass(activity, alertDepartureAfter, str, FragmentKt.findNavController(practiceClassFragment2));
                        }
                    } else {
                        PracticeClassViewModel practiceClassViewModel4 = practiceClassFragment2.b;
                        if (practiceClassViewModel4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            practiceClassViewModel2 = practiceClassViewModel4;
                        }
                        practiceClassViewModel2.dialogMaxTimeClass(practiceClassFragment2.getActivity(), practiceClassFragment2.e);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
