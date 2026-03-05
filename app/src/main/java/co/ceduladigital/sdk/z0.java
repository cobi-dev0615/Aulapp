package co.ceduladigital.sdk;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.LifecycleOwner;
import androidx.view.LifecycleOwnerKt;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentClassInCourseBinding;
import com.gse.aulapp.model.adapter.QuestionStatusAdapter;
import com.gse.aulapp.model.data.entity.SessionEntity;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.dto.QuestionDto;
import com.gse.aulapp.model.dto.Status;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumStatusFingerPrintBiometric;
import com.gse.aulapp.model.enumerate.EnumTimeClass;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.ExternalUtil;
import com.gse.aulapp.util.ValidateHoursUtil;
import com.gse.aulapp.view.fragment.ClassInCourseFragment;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.gse.aulapp.view.fragment.FingerPrintBiometricFragment;
import com.gse.aulapp.view.fragment.PracticeClassFragment;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;
import defpackage.StatusFingerPrint;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes2.dex */
public final /* synthetic */ class z0 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b4  */
    /* JADX WARN: Type inference failed for: r14v97, types: [T, com.gse.aulapp.model.data.entity.entityFull.SessionFull] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ClassInCourseViewModel classInCourseViewModel;
        switch (this.a) {
            case 0:
                List p0 = (List) obj;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ClassInCourseFragment classInCourseFragment = (ClassInCourseFragment) this.receiver;
                FragmentClassInCourseBinding fragmentClassInCourseBinding = classInCourseFragment.a;
                Intrinsics.checkNotNull(fragmentClassInCourseBinding);
                RecyclerView.LayoutManager layoutManager = fragmentClassInCourseBinding.rvQuestions.getLayoutManager();
                Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                QuestionStatusAdapter questionStatusAdapter = new QuestionStatusAdapter(new n0(classInCourseFragment, 0));
                FragmentClassInCourseBinding fragmentClassInCourseBinding2 = classInCourseFragment.a;
                Intrinsics.checkNotNull(fragmentClassInCourseBinding2);
                fragmentClassInCourseBinding2.rvQuestions.setAdapter(questionStatusAdapter);
                questionStatusAdapter.submitList(p0);
                FragmentClassInCourseBinding fragmentClassInCourseBinding3 = classInCourseFragment.a;
                Intrinsics.checkNotNull(fragmentClassInCourseBinding3);
                if (fragmentClassInCourseBinding3.rvQuestions != null) {
                    FragmentClassInCourseBinding fragmentClassInCourseBinding4 = classInCourseFragment.a;
                    Intrinsics.checkNotNull(fragmentClassInCourseBinding4);
                    fragmentClassInCourseBinding4.rvQuestions.post(new o0(linearLayoutManager, classInCourseFragment, 0));
                }
                return Unit.INSTANCE;
            case 1:
                QuestionDto p02 = (QuestionDto) obj;
                Intrinsics.checkNotNullParameter(p02, "p0");
                FragmentClassInCourseBinding fragmentClassInCourseBinding5 = ((ClassInCourseFragment) this.receiver).a;
                Intrinsics.checkNotNull(fragmentClassInCourseBinding5);
                fragmentClassInCourseBinding5.includeQuestionCard.questionText.setText(p02.getDescription());
                return Unit.INSTANCE;
            case 2:
                ConfigurationSessionDto configurationSessionDto = (ConfigurationSessionDto) obj;
                ClassInCourseFragment classInCourseFragment2 = (ClassInCourseFragment) this.receiver;
                if (configurationSessionDto != null) {
                    ClassInCourseViewModel classInCourseViewModel2 = classInCourseFragment2.b;
                    ClassInCourseViewModel classInCourseViewModel3 = null;
                    if (classInCourseViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        classInCourseViewModel2 = null;
                    }
                    Context requireContext = classInCourseFragment2.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    if (!classInCourseViewModel2.timerServiceIsRunning(requireContext)) {
                        classInCourseFragment2.f = configurationSessionDto;
                        ClassInCourseViewModel classInCourseViewModel4 = classInCourseFragment2.b;
                        if (classInCourseViewModel4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            classInCourseViewModel3 = classInCourseViewModel4;
                        }
                        FragmentActivity requireActivity = classInCourseFragment2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                        FragmentClassInCourseBinding fragmentClassInCourseBinding6 = classInCourseFragment2.a;
                        Intrinsics.checkNotNull(fragmentClassInCourseBinding6);
                        classInCourseViewModel3.starTimerClass(requireActivity, fragmentClassInCourseBinding6, configurationSessionDto);
                    }
                } else {
                    classInCourseFragment2.getClass();
                }
                return Unit.INSTANCE;
            case 3:
                Status p03 = (Status) obj;
                Intrinsics.checkNotNullParameter(p03, "p0");
                ClassInCourseFragment classInCourseFragment3 = (ClassInCourseFragment) this.receiver;
                classInCourseFragment3.getClass();
                if (p03 == Status.REJECTED) {
                    FragmentClassInCourseBinding fragmentClassInCourseBinding7 = classInCourseFragment3.a;
                    Intrinsics.checkNotNull(fragmentClassInCourseBinding7);
                    fragmentClassInCourseBinding7.includeQuestionCard.statusCheck.check(R.id.rejectRadioButton);
                } else if (p03 == Status.APPROVED) {
                    FragmentClassInCourseBinding fragmentClassInCourseBinding8 = classInCourseFragment3.a;
                    Intrinsics.checkNotNull(fragmentClassInCourseBinding8);
                    fragmentClassInCourseBinding8.includeQuestionCard.statusCheck.check(R.id.approveRadioButton);
                }
                return Unit.INSTANCE;
            case 4:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                FragmentClassInCourseBinding fragmentClassInCourseBinding9 = ((ClassInCourseFragment) this.receiver).a;
                Intrinsics.checkNotNull(fragmentClassInCourseBinding9);
                if (booleanValue) {
                    fragmentClassInCourseBinding9.includeQuestionCard.containerQuestion.setVisibility(8);
                    fragmentClassInCourseBinding9.includeQuestionCard.containerQuestionCompleted.setVisibility(0);
                } else {
                    fragmentClassInCourseBinding9.includeQuestionCard.containerQuestion.setVisibility(0);
                    fragmentClassInCourseBinding9.includeQuestionCard.containerQuestionCompleted.setVisibility(8);
                }
                return Unit.INSTANCE;
            case 5:
                com.gse.aulapp.model.data.statusControl.Status p04 = (com.gse.aulapp.model.data.statusControl.Status) obj;
                Intrinsics.checkNotNullParameter(p04, "p0");
                ClassInCourseFragment classInCourseFragment4 = (ClassInCourseFragment) this.receiver;
                classInCourseFragment4.getClass();
                if (p04 instanceof Status.Success) {
                    Status.Success success = (Status.Success) p04;
                    if (success.getData() instanceof List) {
                        Collection collection = (Collection) success.getData();
                        if (collection != null && !collection.isEmpty() && (((List) success.getData()).get(0) instanceof SessionFull)) {
                            Object obj2 = ((List) success.getData()).get(0);
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.gse.aulapp.model.data.entity.entityFull.SessionFull");
                            SessionFull sessionFull = (SessionFull) obj2;
                            ValidateHoursUtil.Companion companion = ValidateHoursUtil.INSTANCE;
                            Context requireContext2 = classInCourseFragment4.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            String str = classInCourseFragment4.c;
                            ClassInCourseViewModel classInCourseViewModel5 = null;
                            if (str == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                                str = null;
                            }
                            companion.validateStartClass(requireContext2, sessionFull, str);
                            SessionEntity session = sessionFull.getSession();
                            String id = session != null ? session.getId() : null;
                            if (id != null) {
                                ClassInCourseViewModel classInCourseViewModel6 = classInCourseFragment4.b;
                                if (classInCourseViewModel6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    classInCourseViewModel6 = null;
                                }
                                Context requireContext3 = classInCourseFragment4.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                classInCourseViewModel6.getSessionDataApi(requireContext3, id, classInCourseFragment4.d, FragmentKt.findNavController(classInCourseFragment4));
                            }
                            FragmentClassInCourseBinding fragmentClassInCourseBinding10 = classInCourseFragment4.a;
                            Intrinsics.checkNotNull(fragmentClassInCourseBinding10);
                            ClassInCourseViewModel classInCourseViewModel7 = classInCourseFragment4.b;
                            if (classInCourseViewModel7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel7 = null;
                            }
                            classInCourseViewModel7.setDataSession(sessionFull, fragmentClassInCourseBinding10);
                            ClassInCourseViewModel classInCourseViewModel8 = classInCourseFragment4.b;
                            if (classInCourseViewModel8 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel8 = null;
                            }
                            classInCourseViewModel8.showQR(fragmentClassInCourseBinding10, classInCourseFragment4.requireContext());
                            ClassInCourseViewModel classInCourseViewModel9 = classInCourseFragment4.b;
                            if (classInCourseViewModel9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel9 = null;
                            }
                            classInCourseViewModel9.getTimeElapsedInService().observe(classInCourseFragment4.getViewLifecycleOwner(), new x0(0, new p0(fragmentClassInCourseBinding10, classInCourseFragment4)));
                            ClassInCourseViewModel classInCourseViewModel10 = classInCourseFragment4.b;
                            if (classInCourseViewModel10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel10 = null;
                            }
                            classInCourseViewModel10.getTimeElapsedInServiceSlider().observe(classInCourseFragment4.getViewLifecycleOwner(), new x0(0, new p0(classInCourseFragment4, fragmentClassInCourseBinding10)));
                            LifecycleOwner viewLifecycleOwner = classInCourseFragment4.getViewLifecycleOwner();
                            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new t0(classInCourseFragment4, null), 3, null);
                            LifecycleOwner viewLifecycleOwner2 = classInCourseFragment4.getViewLifecycleOwner();
                            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                            LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2).launchWhenStarted(new v0(classInCourseFragment4, fragmentClassInCourseBinding10, null));
                            if (classInCourseFragment4.f != null) {
                                ClassInCourseViewModel classInCourseViewModel11 = classInCourseFragment4.b;
                                if (classInCourseViewModel11 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    classInCourseViewModel11 = null;
                                }
                                Context requireContext4 = classInCourseFragment4.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                                if (!classInCourseViewModel11.timerServiceIsRunning(requireContext4)) {
                                    ClassInCourseViewModel classInCourseViewModel12 = classInCourseFragment4.b;
                                    if (classInCourseViewModel12 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                        classInCourseViewModel12 = null;
                                    }
                                    FragmentActivity requireActivity2 = classInCourseFragment4.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                                    ConfigurationSessionDto configurationSessionDto2 = classInCourseFragment4.f;
                                    Intrinsics.checkNotNull(configurationSessionDto2);
                                    classInCourseViewModel12.starTimerClass(requireActivity2, fragmentClassInCourseBinding10, configurationSessionDto2);
                                    classInCourseViewModel = classInCourseFragment4.b;
                                    if (classInCourseViewModel != null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    } else {
                                        classInCourseViewModel5 = classInCourseViewModel;
                                    }
                                    FragmentActivity requireActivity3 = classInCourseFragment4.requireActivity();
                                    Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                                    classInCourseViewModel5.startGpsTrace(requireActivity3);
                                }
                            }
                            ClassInCourseViewModel classInCourseViewModel13 = classInCourseFragment4.b;
                            if (classInCourseViewModel13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel13 = null;
                            }
                            classInCourseViewModel13.getConfigSessionDto();
                            classInCourseViewModel = classInCourseFragment4.b;
                            if (classInCourseViewModel != null) {
                            }
                            FragmentActivity requireActivity32 = classInCourseFragment4.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity32, "requireActivity(...)");
                            classInCourseViewModel5.startGpsTrace(requireActivity32);
                        }
                    } else {
                        DialogUtil.Companion companion2 = DialogUtil.INSTANCE;
                        FragmentActivity requireActivity4 = classInCourseFragment4.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
                        companion2.showDialogProgressGlobal(requireActivity4, false, false, true);
                    }
                } else if (p04 instanceof Status.Failure) {
                    DialogUtil.Companion companion3 = DialogUtil.INSTANCE;
                    FragmentActivity requireActivity5 = classInCourseFragment4.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity5, "requireActivity(...)");
                    companion3.showDialogProgressGlobal(requireActivity5, false, false, true);
                } else {
                    DialogUtil.Companion companion4 = DialogUtil.INSTANCE;
                    FragmentActivity requireActivity6 = classInCourseFragment4.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity6, "requireActivity(...)");
                    companion4.showDialogProgressGlobal(requireActivity6, false, false, true);
                }
                return Unit.INSTANCE;
            case 6:
                com.gse.aulapp.model.data.statusControl.Status p05 = (com.gse.aulapp.model.data.statusControl.Status) obj;
                Intrinsics.checkNotNullParameter(p05, "p0");
                ClassPracticeBeforeFragment classPracticeBeforeFragment = (ClassPracticeBeforeFragment) this.receiver;
                classPracticeBeforeFragment.getClass();
                p05.toString();
                LifecycleOwner viewLifecycleOwner3 = classPracticeBeforeFragment.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new j2(p05, classPracticeBeforeFragment, null), 3, null);
                return Unit.INSTANCE;
            case 7:
                com.gse.aulapp.model.data.statusControl.Status p06 = (com.gse.aulapp.model.data.statusControl.Status) obj;
                Intrinsics.checkNotNullParameter(p06, "p0");
                ClassPracticeBeforeFragment classPracticeBeforeFragment2 = (ClassPracticeBeforeFragment) this.receiver;
                LifecycleOwner viewLifecycleOwner4 = classPracticeBeforeFragment2.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new f2(p06, classPracticeBeforeFragment2, null), 3, null);
                return Unit.INSTANCE;
            case 8:
                StatusFingerPrint p07 = (StatusFingerPrint) obj;
                Intrinsics.checkNotNullParameter(p07, "p0");
                FingerPrintBiometricFragment fingerPrintBiometricFragment = (FingerPrintBiometricFragment) this.receiver;
                fingerPrintBiometricFragment.getClass();
                if (Intrinsics.areEqual(p07, StatusFingerPrint.Idle.INSTANCE)) {
                    fingerPrintBiometricFragment.getTag();
                } else if (p07 instanceof StatusFingerPrint.Error) {
                    fingerPrintBiometricFragment.b(EnumDialogType.DIALOG_TYPE_GENERAL_ERROR);
                } else if (p07 instanceof StatusFingerPrint.Success) {
                    fingerPrintBiometricFragment.d(true);
                    fingerPrintBiometricFragment.c(EnumStatusFingerPrintBiometric.ON_SUCCESS);
                } else {
                    if (!Intrinsics.areEqual(p07, StatusFingerPrint.OnBackPress.INSTANCE)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fingerPrintBiometricFragment.b(EnumDialogType.DIALOG_TYPE_GENERAL_ERROR);
                }
                return Unit.INSTANCE;
            case 9:
                ConfigurationSessionDto configurationSessionDto3 = (ConfigurationSessionDto) obj;
                PracticeClassFragment practiceClassFragment = (PracticeClassFragment) this.receiver;
                if (configurationSessionDto3 != null) {
                    practiceClassFragment.e = configurationSessionDto3;
                    PracticeClassViewModel practiceClassViewModel = practiceClassFragment.b;
                    if (practiceClassViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        practiceClassViewModel = null;
                    }
                    String str2 = practiceClassFragment.c;
                    Intrinsics.checkNotNull(str2);
                    practiceClassViewModel.getSessionById(str2);
                } else {
                    practiceClassFragment.getClass();
                }
                return Unit.INSTANCE;
            default:
                com.gse.aulapp.model.data.statusControl.Status p08 = (com.gse.aulapp.model.data.statusControl.Status) obj;
                Intrinsics.checkNotNullParameter(p08, "p0");
                PracticeClassFragment practiceClassFragment2 = (PracticeClassFragment) this.receiver;
                practiceClassFragment2.getClass();
                if (p08 instanceof Status.Success) {
                    Status.Success success2 = (Status.Success) p08;
                    if (success2.getData() instanceof List) {
                        Collection collection2 = (Collection) success2.getData();
                        if (collection2 != null && !collection2.isEmpty() && (((List) success2.getData()).get(0) instanceof SessionFull)) {
                            Ref.ObjectRef objectRef = new Ref.ObjectRef();
                            Object obj3 = ((List) success2.getData()).get(0);
                            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type com.gse.aulapp.model.data.entity.entityFull.SessionFull");
                            objectRef.element = (SessionFull) obj3;
                            ExternalUtil.Companion companion5 = ExternalUtil.INSTANCE;
                            FragmentActivity requireActivity7 = practiceClassFragment2.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity7, "requireActivity(...)");
                            companion5.getDateTime(requireActivity7, EnumTimeClass.GET_DATE_TIME, new o1(practiceClassFragment2, objectRef, 5));
                        }
                    } else {
                        DialogUtil.Companion companion6 = DialogUtil.INSTANCE;
                        FragmentActivity requireActivity8 = practiceClassFragment2.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity8, "requireActivity(...)");
                        companion6.showDialogProgressGlobal(requireActivity8, false, false, true);
                    }
                } else if (p08 instanceof Status.Failure) {
                    DialogUtil.Companion companion7 = DialogUtil.INSTANCE;
                    FragmentActivity requireActivity9 = practiceClassFragment2.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity9, "requireActivity(...)");
                    companion7.showDialogProgressGlobal(requireActivity9, false, false, true);
                } else {
                    DialogUtil.Companion companion8 = DialogUtil.INSTANCE;
                    FragmentActivity requireActivity10 = practiceClassFragment2.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity10, "requireActivity(...)");
                    companion8.showDialogProgressGlobal(requireActivity10, false, false, true);
                }
                return Unit.INSTANCE;
        }
    }
}
