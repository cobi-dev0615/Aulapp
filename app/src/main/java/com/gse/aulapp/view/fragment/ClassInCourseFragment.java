package com.gse.aulapp.view.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import co.ceduladigital.sdk.a1;
import co.ceduladigital.sdk.c0;
import co.ceduladigital.sdk.w0;
import co.ceduladigital.sdk.x0;
import co.ceduladigital.sdk.y0;
import co.ceduladigital.sdk.z0;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentClassInCourseBinding;
import com.gse.aulapp.io.ReceptionsDatabase;
import com.gse.aulapp.model.dao.SessionDao;
import com.gse.aulapp.model.dao.TestDao;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.dto.Status;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumTimeClass;
import com.gse.aulapp.model.repository.ClassInCourseRepository;
import com.gse.aulapp.model.repository.GpsRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.ExternalUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.ViewUtil;
import com.gse.aulapp.view.fragment.ClassInCourseFragment;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import com.gse.aulapp.viewmodel.factory.ClassInCourseViewModelFactory;
import com.ncorti.slidetoact.SlideToActView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/gse/aulapp/view/fragment/ClassInCourseFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClassInCourseFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassInCourseFragment.kt\ncom/gse/aulapp/view/fragment/ClassInCourseFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,504:1\n1#2:505\n*E\n"})
/* loaded from: classes2.dex */
public final class ClassInCourseFragment extends Fragment {
    public FragmentClassInCourseBinding a;
    public ClassInCourseViewModel b;
    public String c;
    public boolean d;
    public String e;
    public ConfigurationSessionDto f;

    public ClassInCourseFragment() {
        Reflection.getOrCreateKotlinClass(ClassInCourseFragment.class).getSimpleName();
    }

    public static final void b(ClassInCourseFragment classInCourseFragment) {
        FragmentClassInCourseBinding fragmentClassInCourseBinding = classInCourseFragment.a;
        Intrinsics.checkNotNull(fragmentClassInCourseBinding);
        SlideToActView slideToActView = fragmentClassInCourseBinding.includeQuestionCard.nextButtonSwipe;
        slideToActView.setCompleted(false, true);
        slideToActView.setInnerColor(classInCourseFragment.requireActivity().getResources().getColor(R.color.colorCurrent, null));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            ReceptionsDatabase.Companion companion = ReceptionsDatabase.INSTANCE;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            TestDao TestDao = companion.getDatabase(requireContext).TestDao();
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            ClassInCourseRepository classInCourseRepository = new ClassInCourseRepository(TestDao, companion.getDatabase(requireContext2).QuestionDao());
            SessionDao SessionDao = GeneralApp.INSTANCE.getDatabase().SessionDao();
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            SessionRepository sessionRepository = new SessionRepository(SessionDao, requireContext3);
            Context requireContext4 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
            this.b = (ClassInCourseViewModel) new ViewModelProvider(this, new ClassInCourseViewModelFactory(classInCourseRepository, sessionRepository, new GpsRepository(companion.getDatabase(requireContext4).GpsDao()))).get(ClassInCourseViewModel.class);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentClassInCourseBinding inflate = FragmentClassInCourseBinding.inflate(inflater, viewGroup, false);
        this.a = inflate;
        Intrinsics.checkNotNull(inflate);
        LinearLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Dialog dialogLoading;
        Dialog dialogLoading2;
        super.onDestroy();
        ClassInCourseViewModel classInCourseViewModel = this.b;
        ClassInCourseViewModel classInCourseViewModel2 = null;
        if (classInCourseViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            classInCourseViewModel = null;
        }
        if (classInCourseViewModel.getDialog() != null) {
            ClassInCourseViewModel classInCourseViewModel3 = this.b;
            if (classInCourseViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classInCourseViewModel3 = null;
            }
            Dialog dialog = classInCourseViewModel3.getDialog();
            Intrinsics.checkNotNull(dialog);
            if (dialog.isShowing()) {
                ClassInCourseViewModel classInCourseViewModel4 = this.b;
                if (classInCourseViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    classInCourseViewModel2 = classInCourseViewModel4;
                }
                Dialog dialog2 = classInCourseViewModel2.getDialog();
                Intrinsics.checkNotNull(dialog2);
                dialog2.dismiss();
            }
        }
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        if (companion.getDialogLoading() == null || (dialogLoading = companion.getDialogLoading()) == null || !dialogLoading.isShowing() || (dialogLoading2 = companion.getDialogLoading()) == null) {
            return;
        }
        dialogLoading2.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        if (this.a != null) {
            if (getArguments() != null) {
                Bundle requireArguments = requireArguments();
                Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
                this.c = a1.a(requireArguments).a;
                Bundle requireArguments2 = requireArguments();
                Intrinsics.checkNotNullExpressionValue(requireArguments2, "requireArguments(...)");
                this.e = a1.a(requireArguments2).b;
                Bundle requireArguments3 = requireArguments();
                Intrinsics.checkNotNullExpressionValue(requireArguments3, "requireArguments(...)");
                this.f = a1.a(requireArguments3).c;
            }
            ClassInCourseViewModel classInCourseViewModel = this.b;
            if (classInCourseViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classInCourseViewModel = null;
            }
            classInCourseViewModel.getConfigSessionDto();
            float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.item_question_status_width) / getResources().getDisplayMetrics().density;
            ViewUtil.Companion companion = ViewUtil.INSTANCE;
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            int calculateNoOfColumns = companion.calculateNoOfColumns(resources, dimensionPixelSize);
            FragmentClassInCourseBinding fragmentClassInCourseBinding = this.a;
            Intrinsics.checkNotNull(fragmentClassInCourseBinding);
            fragmentClassInCourseBinding.rvQuestions.setLayoutManager(new GridLayoutManager(requireContext(), calculateNoOfColumns));
            FragmentClassInCourseBinding fragmentClassInCourseBinding2 = this.a;
            Intrinsics.checkNotNull(fragmentClassInCourseBinding2);
            fragmentClassInCourseBinding2.includeChronometer.sliderTimer.setCustomThumbDrawable(R.drawable.custom_slider_thumb);
            String str = this.c;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                str = null;
            }
            if (str.length() > 0) {
                ClassInCourseViewModel classInCourseViewModel2 = this.b;
                if (classInCourseViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    classInCourseViewModel2 = null;
                }
                String str2 = this.c;
                if (str2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                    str2 = null;
                }
                classInCourseViewModel2.getSessionById(str2);
                if (this.c == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                }
                String str3 = this.c;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                    str3 = null;
                }
                if (str3.length() > 0) {
                    String currentSessionID = PreferenceUtil.INSTANCE.getCurrentSessionID();
                    if (currentSessionID == null) {
                        this.d = false;
                    } else if (currentSessionID.length() > 0) {
                        String str4 = this.c;
                        if (str4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                            str4 = null;
                        }
                        if (Intrinsics.areEqual(currentSessionID, str4)) {
                            this.d = true;
                        } else {
                            this.d = false;
                        }
                    } else {
                        this.d = false;
                    }
                }
                if (!this.d) {
                    PreferenceUtil.Companion companion2 = PreferenceUtil.INSTANCE;
                    String str5 = this.c;
                    if (str5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                        str5 = null;
                    }
                    PreferenceUtil.Companion.saveCurrentSessionID$default(companion2, null, str5, 1, null);
                    ExternalUtil.Companion companion3 = ExternalUtil.INSTANCE;
                    FragmentActivity requireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    companion3.getDateTime(requireActivity, EnumTimeClass.GET_DATE_TIME, new c0(this, 2));
                }
            }
            ClassInCourseViewModel classInCourseViewModel3 = this.b;
            if (classInCourseViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classInCourseViewModel3 = null;
            }
            classInCourseViewModel3.getQuestions().observe(getViewLifecycleOwner(), new x0(0, new z0(1, this, ClassInCourseFragment.class, "updateQuestions", "updateQuestions(Ljava/util/List;)V", 0, 0)));
            ClassInCourseViewModel classInCourseViewModel4 = this.b;
            if (classInCourseViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classInCourseViewModel4 = null;
            }
            classInCourseViewModel4.getCurrentQuestionDto().observe(getViewLifecycleOwner(), new x0(0, new z0(1, this, ClassInCourseFragment.class, "updateCurrentQuestion", "updateCurrentQuestion(Lcom/gse/aulapp/model/dto/QuestionDto;)V", 0, 1)));
            ClassInCourseViewModel classInCourseViewModel5 = this.b;
            if (classInCourseViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classInCourseViewModel5 = null;
            }
            classInCourseViewModel5.getConfigSession().observe(getViewLifecycleOwner(), new x0(0, new z0(1, this, ClassInCourseFragment.class, "validateConfigSessionDto", "validateConfigSessionDto(Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;)V", 0, 2)));
            ClassInCourseViewModel classInCourseViewModel6 = this.b;
            if (classInCourseViewModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classInCourseViewModel6 = null;
            }
            classInCourseViewModel6.getCheckRadioButton().observe(getViewLifecycleOwner(), new x0(0, new z0(1, this, ClassInCourseFragment.class, "statusCheckQuestion", "statusCheckQuestion(Lcom/gse/aulapp/model/dto/Status;)V", 0, 3)));
            ClassInCourseViewModel classInCourseViewModel7 = this.b;
            if (classInCourseViewModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classInCourseViewModel7 = null;
            }
            classInCourseViewModel7.m18isLastQuestion().observe(getViewLifecycleOwner(), new x0(0, new z0(1, this, ClassInCourseFragment.class, "observeIsLastQuestion", "observeIsLastQuestion(Z)V", 0, 4)));
            ClassInCourseViewModel classInCourseViewModel8 = this.b;
            if (classInCourseViewModel8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                classInCourseViewModel8 = null;
            }
            classInCourseViewModel8.getMessage().observe(getViewLifecycleOwner(), new x0(0, new z0(1, this, ClassInCourseFragment.class, "observerMessage", "observerMessage(Lcom/gse/aulapp/model/data/statusControl/Status;)V", 0, 5)));
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new w0(this, null), 3, null);
            FragmentClassInCourseBinding fragmentClassInCourseBinding3 = this.a;
            Intrinsics.checkNotNull(fragmentClassInCourseBinding3);
            fragmentClassInCourseBinding3.includeQuestionCard.nextButtonSwipe.setOnSlideCompleteListener(new y0(this));
            FragmentClassInCourseBinding fragmentClassInCourseBinding4 = this.a;
            Intrinsics.checkNotNull(fragmentClassInCourseBinding4);
            fragmentClassInCourseBinding4.includeQuestionCard.statusCheck.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: co.ceduladigital.sdk.q0
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    ClassInCourseFragment this$0 = ClassInCourseFragment.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    if (i == R.id.approveRadioButton) {
                        ClassInCourseViewModel classInCourseViewModel9 = this$0.b;
                        if (classInCourseViewModel9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            classInCourseViewModel9 = null;
                        }
                        classInCourseViewModel9.setQuestionStatus(Status.APPROVED);
                        FragmentClassInCourseBinding fragmentClassInCourseBinding5 = this$0.a;
                        Intrinsics.checkNotNull(fragmentClassInCourseBinding5);
                        fragmentClassInCourseBinding5.includeQuestionCard.nextButtonSwipe.setInnerColor(this$0.requireActivity().getResources().getColor(R.color.colorApproved, null));
                        return;
                    }
                    if (i != R.id.rejectRadioButton) {
                        return;
                    }
                    ClassInCourseViewModel classInCourseViewModel10 = this$0.b;
                    if (classInCourseViewModel10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        classInCourseViewModel10 = null;
                    }
                    classInCourseViewModel10.setQuestionStatus(Status.REJECTED);
                    FragmentClassInCourseBinding fragmentClassInCourseBinding6 = this$0.a;
                    Intrinsics.checkNotNull(fragmentClassInCourseBinding6);
                    fragmentClassInCourseBinding6.includeQuestionCard.nextButtonSwipe.setInnerColor(this$0.requireActivity().getResources().getColor(R.color.colorRejected, null));
                }
            });
            FragmentClassInCourseBinding fragmentClassInCourseBinding5 = this.a;
            Intrinsics.checkNotNull(fragmentClassInCourseBinding5);
            final int i = 0;
            fragmentClassInCourseBinding5.cvInfoExam.setOnClickListener(new View.OnClickListener(this) { // from class: co.ceduladigital.sdk.m0
                public final /* synthetic */ ClassInCourseFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            ClassInCourseFragment this$0 = this.b;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            ViewUtil.Companion companion4 = ViewUtil.INSTANCE;
                            Intrinsics.checkNotNull(view2);
                            companion4.preventDoubleClick(view2);
                            DialogNormalUtil dialogNormalUtil = new DialogNormalUtil();
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ClassInCourseViewModel classInCourseViewModel9 = this$0.b;
                            if (classInCourseViewModel9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel9 = null;
                            }
                            dialogNormalUtil.showDialogExamInfo(requireContext, classInCourseViewModel9, this$0.e);
                            break;
                        case 1:
                            ClassInCourseFragment this$02 = this.b;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            ViewUtil.Companion companion5 = ViewUtil.INSTANCE;
                            Intrinsics.checkNotNull(view2);
                            companion5.preventDoubleClick(view2);
                            ClassInCourseViewModel classInCourseViewModel10 = this$02.b;
                            String str6 = null;
                            if (classInCourseViewModel10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel10 = null;
                            }
                            if (!classInCourseViewModel10.validateTimeClass()) {
                                ClassInCourseViewModel classInCourseViewModel11 = this$02.b;
                                if (classInCourseViewModel11 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    classInCourseViewModel11 = null;
                                }
                                Context requireContext2 = this$02.requireContext();
                                NavController findNavController = FragmentKt.findNavController(this$02);
                                String str7 = this$02.c;
                                if (str7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                                } else {
                                    str6 = str7;
                                }
                                classInCourseViewModel11.dialogCloseBeforeTime$app_release(requireContext2, findNavController, str6);
                                break;
                            } else {
                                ClassInCourseViewModel classInCourseViewModel12 = this$02.b;
                                if (classInCourseViewModel12 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    classInCourseViewModel12 = null;
                                }
                                Context requireContext3 = this$02.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                NavController findNavController2 = FragmentKt.findNavController(this$02);
                                String str8 = this$02.c;
                                if (str8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                                } else {
                                    str6 = str8;
                                }
                                classInCourseViewModel12.backClassInCourse(requireContext3, findNavController2, str6);
                                break;
                            }
                        default:
                            ClassInCourseFragment this$03 = this.b;
                            Intrinsics.checkNotNullParameter(this$03, "this$0");
                            ViewUtil.Companion companion6 = ViewUtil.INSTANCE;
                            Intrinsics.checkNotNull(view2);
                            companion6.preventDoubleClick(view2);
                            ClassInCourseViewModel classInCourseViewModel13 = this$03.b;
                            ClassInCourseViewModel classInCourseViewModel14 = null;
                            if (classInCourseViewModel13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel13 = null;
                            }
                            classInCourseViewModel13.stopServices(this$03.requireContext());
                            Context context = this$03.getContext();
                            if (context != null) {
                                ClassInCourseViewModel classInCourseViewModel15 = this$03.b;
                                if (classInCourseViewModel15 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    classInCourseViewModel15 = null;
                                }
                                NavController findNavController3 = FragmentKt.findNavController(this$03);
                                ClassInCourseViewModel classInCourseViewModel16 = this$03.b;
                                if (classInCourseViewModel16 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                } else {
                                    classInCourseViewModel14 = classInCourseViewModel16;
                                }
                                SessionDto sessionReceived = classInCourseViewModel14.getSessionReceived();
                                Intrinsics.checkNotNull(sessionReceived);
                                String sessionID = sessionReceived.getId();
                                EnumClassType sessionType = EnumClassType.PRACTICE_EXAM;
                                Intrinsics.checkNotNullParameter(sessionID, "sessionID");
                                Intrinsics.checkNotNullParameter(sessionType, "sessionType");
                                classInCourseViewModel15.navigationTo(context, findNavController3, new c1(sessionID, false, sessionType));
                                break;
                            }
                            break;
                    }
                }
            });
            FragmentClassInCourseBinding fragmentClassInCourseBinding6 = this.a;
            Intrinsics.checkNotNull(fragmentClassInCourseBinding6);
            final int i2 = 1;
            fragmentClassInCourseBinding6.floatingActionButtonCloseClass.setOnClickListener(new View.OnClickListener(this) { // from class: co.ceduladigital.sdk.m0
                public final /* synthetic */ ClassInCourseFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i2) {
                        case 0:
                            ClassInCourseFragment this$0 = this.b;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            ViewUtil.Companion companion4 = ViewUtil.INSTANCE;
                            Intrinsics.checkNotNull(view2);
                            companion4.preventDoubleClick(view2);
                            DialogNormalUtil dialogNormalUtil = new DialogNormalUtil();
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ClassInCourseViewModel classInCourseViewModel9 = this$0.b;
                            if (classInCourseViewModel9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel9 = null;
                            }
                            dialogNormalUtil.showDialogExamInfo(requireContext, classInCourseViewModel9, this$0.e);
                            break;
                        case 1:
                            ClassInCourseFragment this$02 = this.b;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            ViewUtil.Companion companion5 = ViewUtil.INSTANCE;
                            Intrinsics.checkNotNull(view2);
                            companion5.preventDoubleClick(view2);
                            ClassInCourseViewModel classInCourseViewModel10 = this$02.b;
                            String str6 = null;
                            if (classInCourseViewModel10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel10 = null;
                            }
                            if (!classInCourseViewModel10.validateTimeClass()) {
                                ClassInCourseViewModel classInCourseViewModel11 = this$02.b;
                                if (classInCourseViewModel11 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    classInCourseViewModel11 = null;
                                }
                                Context requireContext2 = this$02.requireContext();
                                NavController findNavController = FragmentKt.findNavController(this$02);
                                String str7 = this$02.c;
                                if (str7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                                } else {
                                    str6 = str7;
                                }
                                classInCourseViewModel11.dialogCloseBeforeTime$app_release(requireContext2, findNavController, str6);
                                break;
                            } else {
                                ClassInCourseViewModel classInCourseViewModel12 = this$02.b;
                                if (classInCourseViewModel12 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    classInCourseViewModel12 = null;
                                }
                                Context requireContext3 = this$02.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                NavController findNavController2 = FragmentKt.findNavController(this$02);
                                String str8 = this$02.c;
                                if (str8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                                } else {
                                    str6 = str8;
                                }
                                classInCourseViewModel12.backClassInCourse(requireContext3, findNavController2, str6);
                                break;
                            }
                        default:
                            ClassInCourseFragment this$03 = this.b;
                            Intrinsics.checkNotNullParameter(this$03, "this$0");
                            ViewUtil.Companion companion6 = ViewUtil.INSTANCE;
                            Intrinsics.checkNotNull(view2);
                            companion6.preventDoubleClick(view2);
                            ClassInCourseViewModel classInCourseViewModel13 = this$03.b;
                            ClassInCourseViewModel classInCourseViewModel14 = null;
                            if (classInCourseViewModel13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel13 = null;
                            }
                            classInCourseViewModel13.stopServices(this$03.requireContext());
                            Context context = this$03.getContext();
                            if (context != null) {
                                ClassInCourseViewModel classInCourseViewModel15 = this$03.b;
                                if (classInCourseViewModel15 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    classInCourseViewModel15 = null;
                                }
                                NavController findNavController3 = FragmentKt.findNavController(this$03);
                                ClassInCourseViewModel classInCourseViewModel16 = this$03.b;
                                if (classInCourseViewModel16 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                } else {
                                    classInCourseViewModel14 = classInCourseViewModel16;
                                }
                                SessionDto sessionReceived = classInCourseViewModel14.getSessionReceived();
                                Intrinsics.checkNotNull(sessionReceived);
                                String sessionID = sessionReceived.getId();
                                EnumClassType sessionType = EnumClassType.PRACTICE_EXAM;
                                Intrinsics.checkNotNullParameter(sessionID, "sessionID");
                                Intrinsics.checkNotNullParameter(sessionType, "sessionType");
                                classInCourseViewModel15.navigationTo(context, findNavController3, new c1(sessionID, false, sessionType));
                                break;
                            }
                            break;
                    }
                }
            });
            FragmentClassInCourseBinding fragmentClassInCourseBinding7 = this.a;
            Intrinsics.checkNotNull(fragmentClassInCourseBinding7);
            final int i3 = 2;
            fragmentClassInCourseBinding7.btnEndClass.setOnClickListener(new View.OnClickListener(this) { // from class: co.ceduladigital.sdk.m0
                public final /* synthetic */ ClassInCourseFragment b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i3) {
                        case 0:
                            ClassInCourseFragment this$0 = this.b;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            ViewUtil.Companion companion4 = ViewUtil.INSTANCE;
                            Intrinsics.checkNotNull(view2);
                            companion4.preventDoubleClick(view2);
                            DialogNormalUtil dialogNormalUtil = new DialogNormalUtil();
                            Context requireContext = this$0.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ClassInCourseViewModel classInCourseViewModel9 = this$0.b;
                            if (classInCourseViewModel9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel9 = null;
                            }
                            dialogNormalUtil.showDialogExamInfo(requireContext, classInCourseViewModel9, this$0.e);
                            break;
                        case 1:
                            ClassInCourseFragment this$02 = this.b;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            ViewUtil.Companion companion5 = ViewUtil.INSTANCE;
                            Intrinsics.checkNotNull(view2);
                            companion5.preventDoubleClick(view2);
                            ClassInCourseViewModel classInCourseViewModel10 = this$02.b;
                            String str6 = null;
                            if (classInCourseViewModel10 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel10 = null;
                            }
                            if (!classInCourseViewModel10.validateTimeClass()) {
                                ClassInCourseViewModel classInCourseViewModel11 = this$02.b;
                                if (classInCourseViewModel11 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    classInCourseViewModel11 = null;
                                }
                                Context requireContext2 = this$02.requireContext();
                                NavController findNavController = FragmentKt.findNavController(this$02);
                                String str7 = this$02.c;
                                if (str7 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                                } else {
                                    str6 = str7;
                                }
                                classInCourseViewModel11.dialogCloseBeforeTime$app_release(requireContext2, findNavController, str6);
                                break;
                            } else {
                                ClassInCourseViewModel classInCourseViewModel12 = this$02.b;
                                if (classInCourseViewModel12 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    classInCourseViewModel12 = null;
                                }
                                Context requireContext3 = this$02.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                                NavController findNavController2 = FragmentKt.findNavController(this$02);
                                String str8 = this$02.c;
                                if (str8 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("sessionID");
                                } else {
                                    str6 = str8;
                                }
                                classInCourseViewModel12.backClassInCourse(requireContext3, findNavController2, str6);
                                break;
                            }
                        default:
                            ClassInCourseFragment this$03 = this.b;
                            Intrinsics.checkNotNullParameter(this$03, "this$0");
                            ViewUtil.Companion companion6 = ViewUtil.INSTANCE;
                            Intrinsics.checkNotNull(view2);
                            companion6.preventDoubleClick(view2);
                            ClassInCourseViewModel classInCourseViewModel13 = this$03.b;
                            ClassInCourseViewModel classInCourseViewModel14 = null;
                            if (classInCourseViewModel13 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                classInCourseViewModel13 = null;
                            }
                            classInCourseViewModel13.stopServices(this$03.requireContext());
                            Context context = this$03.getContext();
                            if (context != null) {
                                ClassInCourseViewModel classInCourseViewModel15 = this$03.b;
                                if (classInCourseViewModel15 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    classInCourseViewModel15 = null;
                                }
                                NavController findNavController3 = FragmentKt.findNavController(this$03);
                                ClassInCourseViewModel classInCourseViewModel16 = this$03.b;
                                if (classInCourseViewModel16 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                } else {
                                    classInCourseViewModel14 = classInCourseViewModel16;
                                }
                                SessionDto sessionReceived = classInCourseViewModel14.getSessionReceived();
                                Intrinsics.checkNotNull(sessionReceived);
                                String sessionID = sessionReceived.getId();
                                EnumClassType sessionType = EnumClassType.PRACTICE_EXAM;
                                Intrinsics.checkNotNullParameter(sessionID, "sessionID");
                                Intrinsics.checkNotNullParameter(sessionType, "sessionType");
                                classInCourseViewModel15.navigationTo(context, findNavController3, new c1(sessionID, false, sessionType));
                                break;
                            }
                            break;
                    }
                }
            });
        }
    }
}
