package co.ceduladigital.sdk;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.gse.aulapp.databinding.FragmentPracticeClassBinding;
import com.gse.aulapp.databinding.FragmentRideHistoryBinding;
import com.gse.aulapp.model.adapter.ClassDateRecyclerAdapter;
import com.gse.aulapp.model.data.entity.SessionEntity;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.request.SessionInstructorRequest;
import com.gse.aulapp.service.TimerService;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.view.fragment.HomeFragment;
import com.gse.aulapp.view.fragment.PracticeClassFragment;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import com.gse.aulapp.viewmodel.HomeViewModel;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;
import com.gse.aulapp.viewmodel.RideHistoryViewModel;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes2.dex */
public final /* synthetic */ class l1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l1(RideHistoryViewModel rideHistoryViewModel, FragmentRideHistoryBinding fragmentRideHistoryBinding, Context context) {
        this.a = 3;
        this.c = rideHistoryViewModel;
        this.d = fragmentRideHistoryBinding;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit validateIsMock$lambda$18;
        String str;
        Unit showCalendar$lambda$0;
        switch (this.a) {
            case 0:
                validateIsMock$lambda$18 = ClassInCourseViewModel.validateIsMock$lambda$18((ClassInCourseViewModel) this.c, this.b, (Activity) this.d, ((Boolean) obj).booleanValue());
                return validateIsMock$lambda$18;
            case 1:
                SessionInstructorRequest request = (SessionInstructorRequest) obj;
                HomeFragment this$0 = (HomeFragment) this.c;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Context it1 = this.b;
                Intrinsics.checkNotNullParameter(it1, "$it1");
                SessionDto it = (SessionDto) this.d;
                Intrinsics.checkNotNullParameter(it, "$it");
                Intrinsics.checkNotNullParameter(request, "request");
                HomeViewModel homeViewModel = this$0.a;
                if (homeViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    homeViewModel = null;
                }
                FragmentActivity requireActivity = this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                String id = it.getId();
                ClassDateRecyclerAdapter classDateRecyclerAdapter = this$0.b;
                if (classDateRecyclerAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("classRecyclerAdapter");
                    classDateRecyclerAdapter = null;
                }
                homeViewModel.getSessionFromApiAndSave(it1, requireActivity, request, id, true, classDateRecyclerAdapter, FragmentKt.findNavController(this$0));
                return Unit.INSTANCE;
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final PracticeClassFragment this$02 = (PracticeClassFragment) this.c;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Context it12 = this.b;
                Intrinsics.checkNotNullParameter(it12, "$it1");
                SessionFull sessionFull = (SessionFull) this.d;
                Intrinsics.checkNotNullParameter(sessionFull, "$sessionFull");
                if (booleanValue) {
                    this$02.getClass();
                    DialogNormalUtil.Companion.showDialog$app_release$default(DialogNormalUtil.INSTANCE, it12, EnumDialogType.DIALOG_FAKE_GPS, new j0(this$02, sessionFull, 4), null, 8, null);
                } else {
                    PracticeClassViewModel practiceClassViewModel = null;
                    if (this$02.e == null) {
                        PracticeClassViewModel practiceClassViewModel2 = this$02.b;
                        if (practiceClassViewModel2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            practiceClassViewModel2 = null;
                        }
                        practiceClassViewModel2.getConfigSessionDto();
                    } else {
                        if (this$02.getContext() != null) {
                            PracticeClassViewModel practiceClassViewModel3 = this$02.b;
                            if (practiceClassViewModel3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                practiceClassViewModel3 = null;
                            }
                            FragmentPracticeClassBinding fragmentPracticeClassBinding = this$02.a;
                            Intrinsics.checkNotNull(fragmentPracticeClassBinding);
                            SessionEntity session = sessionFull.getSession();
                            if (session == null || (str = session.getDateStartEntry()) == null) {
                                str = this$02.d;
                            }
                            practiceClassViewModel3.setDataSession(sessionFull, fragmentPracticeClassBinding, str);
                        }
                        PracticeClassViewModel practiceClassViewModel4 = this$02.b;
                        if (practiceClassViewModel4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            practiceClassViewModel4 = null;
                        }
                        final int i = 0;
                        practiceClassViewModel4.getTimeElapsedInService().observe(this$02.requireActivity(), new x0(2, new Function1() { // from class: co.ceduladigital.sdk.j7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i) {
                                    case 0:
                                        String str2 = (String) obj2;
                                        PracticeClassFragment this$03 = this$02;
                                        Intrinsics.checkNotNullParameter(this$03, "this$0");
                                        FragmentPracticeClassBinding fragmentPracticeClassBinding2 = this$03.a;
                                        Intrinsics.checkNotNull(fragmentPracticeClassBinding2);
                                        fragmentPracticeClassBinding2.includeChronometer.tvTimer.setText(str2);
                                        PracticeClassViewModel practiceClassViewModel5 = this$03.b;
                                        if (practiceClassViewModel5 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                            practiceClassViewModel5 = null;
                                        }
                                        Intrinsics.checkNotNull(str2);
                                        FragmentPracticeClassBinding fragmentPracticeClassBinding3 = this$03.a;
                                        Intrinsics.checkNotNull(fragmentPracticeClassBinding3);
                                        practiceClassViewModel5.initSliderExtra(str2, fragmentPracticeClassBinding3, this$03.e);
                                        PracticeClassViewModel practiceClassViewModel6 = null;
                                        FragmentActivity activity = this$03.getActivity();
                                        if (activity != null) {
                                            PracticeClassViewModel practiceClassViewModel7 = this$03.b;
                                            if (practiceClassViewModel7 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                            } else {
                                                practiceClassViewModel6 = practiceClassViewModel7;
                                            }
                                            NavController findNavController = FragmentKt.findNavController(this$03);
                                            String str3 = this$03.c;
                                            Intrinsics.checkNotNull(str3);
                                            practiceClassViewModel6.validateFinishedClass(activity, str2, findNavController, str3, this$03.e);
                                        }
                                        break;
                                    default:
                                        Float f = (Float) obj2;
                                        PracticeClassFragment this$04 = this$02;
                                        Intrinsics.checkNotNullParameter(this$04, "this$0");
                                        Context context = this$04.getContext();
                                        PracticeClassViewModel practiceClassViewModel8 = null;
                                        if (context != null) {
                                            PracticeClassViewModel practiceClassViewModel9 = this$04.b;
                                            if (practiceClassViewModel9 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                                practiceClassViewModel9 = null;
                                            }
                                            FragmentActivity requireActivity2 = this$04.requireActivity();
                                            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                                            FragmentPracticeClassBinding fragmentPracticeClassBinding4 = this$04.a;
                                            Intrinsics.checkNotNull(fragmentPracticeClassBinding4);
                                            practiceClassViewModel9.validateIsMock(context, requireActivity2, fragmentPracticeClassBinding4, this$04.c, this$04.e);
                                        }
                                        FragmentPracticeClassBinding fragmentPracticeClassBinding5 = this$04.a;
                                        Intrinsics.checkNotNull(fragmentPracticeClassBinding5);
                                        if (f.floatValue() < fragmentPracticeClassBinding5.includeChronometer.sliderTimer.getValueTo()) {
                                            FragmentPracticeClassBinding fragmentPracticeClassBinding6 = this$04.a;
                                            Intrinsics.checkNotNull(fragmentPracticeClassBinding6);
                                            fragmentPracticeClassBinding6.includeChronometer.sliderTimer.setValue(f.floatValue());
                                        } else {
                                            PracticeClassViewModel practiceClassViewModel10 = this$04.b;
                                            if (practiceClassViewModel10 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                            } else {
                                                practiceClassViewModel8 = practiceClassViewModel10;
                                            }
                                            FragmentPracticeClassBinding fragmentPracticeClassBinding7 = this$04.a;
                                            Intrinsics.checkNotNull(fragmentPracticeClassBinding7);
                                            practiceClassViewModel8.validateSliderExtra(fragmentPracticeClassBinding7, this$04.e);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }));
                        PracticeClassViewModel practiceClassViewModel5 = this$02.b;
                        if (practiceClassViewModel5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            practiceClassViewModel5 = null;
                        }
                        final int i2 = 1;
                        practiceClassViewModel5.getTimeElapsedInServiceSlider().observe(this$02.requireActivity(), new x0(2, new Function1() { // from class: co.ceduladigital.sdk.j7
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                switch (i2) {
                                    case 0:
                                        String str2 = (String) obj2;
                                        PracticeClassFragment this$03 = this$02;
                                        Intrinsics.checkNotNullParameter(this$03, "this$0");
                                        FragmentPracticeClassBinding fragmentPracticeClassBinding2 = this$03.a;
                                        Intrinsics.checkNotNull(fragmentPracticeClassBinding2);
                                        fragmentPracticeClassBinding2.includeChronometer.tvTimer.setText(str2);
                                        PracticeClassViewModel practiceClassViewModel52 = this$03.b;
                                        if (practiceClassViewModel52 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                            practiceClassViewModel52 = null;
                                        }
                                        Intrinsics.checkNotNull(str2);
                                        FragmentPracticeClassBinding fragmentPracticeClassBinding3 = this$03.a;
                                        Intrinsics.checkNotNull(fragmentPracticeClassBinding3);
                                        practiceClassViewModel52.initSliderExtra(str2, fragmentPracticeClassBinding3, this$03.e);
                                        PracticeClassViewModel practiceClassViewModel6 = null;
                                        FragmentActivity activity = this$03.getActivity();
                                        if (activity != null) {
                                            PracticeClassViewModel practiceClassViewModel7 = this$03.b;
                                            if (practiceClassViewModel7 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                            } else {
                                                practiceClassViewModel6 = practiceClassViewModel7;
                                            }
                                            NavController findNavController = FragmentKt.findNavController(this$03);
                                            String str3 = this$03.c;
                                            Intrinsics.checkNotNull(str3);
                                            practiceClassViewModel6.validateFinishedClass(activity, str2, findNavController, str3, this$03.e);
                                        }
                                        break;
                                    default:
                                        Float f = (Float) obj2;
                                        PracticeClassFragment this$04 = this$02;
                                        Intrinsics.checkNotNullParameter(this$04, "this$0");
                                        Context context = this$04.getContext();
                                        PracticeClassViewModel practiceClassViewModel8 = null;
                                        if (context != null) {
                                            PracticeClassViewModel practiceClassViewModel9 = this$04.b;
                                            if (practiceClassViewModel9 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                                practiceClassViewModel9 = null;
                                            }
                                            FragmentActivity requireActivity2 = this$04.requireActivity();
                                            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                                            FragmentPracticeClassBinding fragmentPracticeClassBinding4 = this$04.a;
                                            Intrinsics.checkNotNull(fragmentPracticeClassBinding4);
                                            practiceClassViewModel9.validateIsMock(context, requireActivity2, fragmentPracticeClassBinding4, this$04.c, this$04.e);
                                        }
                                        FragmentPracticeClassBinding fragmentPracticeClassBinding5 = this$04.a;
                                        Intrinsics.checkNotNull(fragmentPracticeClassBinding5);
                                        if (f.floatValue() < fragmentPracticeClassBinding5.includeChronometer.sliderTimer.getValueTo()) {
                                            FragmentPracticeClassBinding fragmentPracticeClassBinding6 = this$04.a;
                                            Intrinsics.checkNotNull(fragmentPracticeClassBinding6);
                                            fragmentPracticeClassBinding6.includeChronometer.sliderTimer.setValue(f.floatValue());
                                        } else {
                                            PracticeClassViewModel practiceClassViewModel10 = this$04.b;
                                            if (practiceClassViewModel10 == null) {
                                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                            } else {
                                                practiceClassViewModel8 = practiceClassViewModel10;
                                            }
                                            FragmentPracticeClassBinding fragmentPracticeClassBinding7 = this$04.a;
                                            Intrinsics.checkNotNull(fragmentPracticeClassBinding7);
                                            practiceClassViewModel8.validateSliderExtra(fragmentPracticeClassBinding7, this$04.e);
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }));
                        LifecycleOwner viewLifecycleOwner = this$02.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new o7(this$02, null));
                        PracticeClassViewModel practiceClassViewModel6 = this$02.b;
                        if (practiceClassViewModel6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            practiceClassViewModel6 = null;
                        }
                        Context requireContext = this$02.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        if (practiceClassViewModel6.timerServiceIsRunning(requireContext, TimerService.class)) {
                            PracticeClassViewModel practiceClassViewModel7 = this$02.b;
                            if (practiceClassViewModel7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                practiceClassViewModel7 = null;
                            }
                            FragmentPracticeClassBinding fragmentPracticeClassBinding2 = this$02.a;
                            Intrinsics.checkNotNull(fragmentPracticeClassBinding2);
                            practiceClassViewModel7.reloadSlider(fragmentPracticeClassBinding2, this$02.e);
                        } else {
                            PracticeClassViewModel practiceClassViewModel8 = this$02.b;
                            if (practiceClassViewModel8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                practiceClassViewModel8 = null;
                            }
                            FragmentActivity requireActivity2 = this$02.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                            FragmentPracticeClassBinding fragmentPracticeClassBinding3 = this$02.a;
                            Intrinsics.checkNotNull(fragmentPracticeClassBinding3);
                            practiceClassViewModel8.starTimerClass(requireActivity2, fragmentPracticeClassBinding3, this$02.c, this$02.e);
                        }
                        PracticeClassViewModel practiceClassViewModel9 = this$02.b;
                        if (practiceClassViewModel9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            practiceClassViewModel9 = null;
                        }
                        FragmentActivity requireActivity3 = this$02.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                        practiceClassViewModel9.startGpsTrace(requireActivity3);
                    }
                    PracticeClassViewModel practiceClassViewModel10 = this$02.b;
                    if (practiceClassViewModel10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        practiceClassViewModel = practiceClassViewModel10;
                    }
                    FragmentPracticeClassBinding fragmentPracticeClassBinding4 = this$02.a;
                    Intrinsics.checkNotNull(fragmentPracticeClassBinding4);
                    practiceClassViewModel.showQR(fragmentPracticeClassBinding4, this$02.getContext(), sessionFull);
                }
                return Unit.INSTANCE;
            default:
                showCalendar$lambda$0 = RideHistoryViewModel.showCalendar$lambda$0((RideHistoryViewModel) this.c, (FragmentRideHistoryBinding) this.d, this.b, (Date) obj);
                return showCalendar$lambda$0;
        }
    }

    public /* synthetic */ l1(Object obj, Context context, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = context;
        this.d = obj2;
    }
}
