package com.gse.aulapp.view.fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import co.ceduladigital.sdk.a1;
import co.ceduladigital.sdk.m7;
import co.ceduladigital.sdk.t1;
import co.ceduladigital.sdk.x0;
import co.ceduladigital.sdk.z0;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentPracticeClassBinding;
import com.gse.aulapp.io.ReceptionsDatabase;
import com.gse.aulapp.model.dao.SessionDao;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.repository.GpsRepository;
import com.gse.aulapp.model.repository.PracticeClassRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.GpsUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.UIHelper;
import com.gse.aulapp.util.extension.ViewExtKt;
import com.gse.aulapp.view.fragment.PracticeClassFragment;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;
import com.gse.aulapp.viewmodel.factory.PracticeClassViewModelFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/gse/aulapp/view/fragment/PracticeClassFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPracticeClassFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PracticeClassFragment.kt\ncom/gse/aulapp/view/fragment/PracticeClassFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,369:1\n1#2:370\n*E\n"})
/* loaded from: classes2.dex */
public final class PracticeClassFragment extends Fragment {
    public FragmentPracticeClassBinding a;
    public PracticeClassViewModel b;
    public String c;
    public String d;
    public ConfigurationSessionDto e;

    public PracticeClassFragment() {
        Reflection.getOrCreateKotlinClass(PracticeClassFragment.class).getSimpleName();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            ReceptionsDatabase.Companion companion = ReceptionsDatabase.INSTANCE;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            PracticeClassRepository practiceClassRepository = new PracticeClassRepository(companion.getDatabase(requireContext).GpsDao());
            SessionDao SessionDao = GeneralApp.INSTANCE.getDatabase().SessionDao();
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            SessionRepository sessionRepository = new SessionRepository(SessionDao, requireContext2);
            Context requireContext3 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
            this.b = (PracticeClassViewModel) new ViewModelProvider(this, new PracticeClassViewModelFactory(practiceClassRepository, sessionRepository, new GpsRepository(companion.getDatabase(requireContext3).GpsDao()))).get(PracticeClassViewModel.class);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentPracticeClassBinding inflate = FragmentPracticeClassBinding.inflate(inflater, viewGroup, false);
        this.a = inflate;
        Intrinsics.checkNotNull(inflate);
        return inflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        Dialog dialogLoading;
        Dialog dialogLoading2;
        super.onDestroy();
        PracticeClassViewModel practiceClassViewModel = this.b;
        PracticeClassViewModel practiceClassViewModel2 = null;
        if (practiceClassViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            practiceClassViewModel = null;
        }
        if (practiceClassViewModel.getDialog() != null) {
            PracticeClassViewModel practiceClassViewModel3 = this.b;
            if (practiceClassViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                practiceClassViewModel3 = null;
            }
            Dialog dialog = practiceClassViewModel3.getDialog();
            Intrinsics.checkNotNull(dialog);
            if (dialog.isShowing()) {
                PracticeClassViewModel practiceClassViewModel4 = this.b;
                if (practiceClassViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    practiceClassViewModel2 = practiceClassViewModel4;
                }
                Dialog dialog2 = practiceClassViewModel2.getDialog();
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
    public final void onResume() {
        super.onResume();
        GpsUtil.Companion companion = GpsUtil.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        companion.validatePermission(requireActivity, new t1(19));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        UIHelper.Companion companion = UIHelper.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        UIHelper.Companion.setterCustomToolbar$default(companion, requireActivity, false, false, getString(R.string.title_practice_class), null, null, false, false, 246, null);
        if (this.a != null) {
            if (getArguments() != null) {
                Bundle requireArguments = requireArguments();
                Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
                this.c = a1.c(requireArguments).a;
                Bundle requireArguments2 = requireArguments();
                Intrinsics.checkNotNullExpressionValue(requireArguments2, "requireArguments(...)");
                this.d = a1.c(requireArguments2).b;
                Bundle requireArguments3 = requireArguments();
                Intrinsics.checkNotNullExpressionValue(requireArguments3, "requireArguments(...)");
                this.e = a1.c(requireArguments3).c;
            }
            String str = this.c;
            if (str != null && str.length() != 0) {
                FragmentPracticeClassBinding fragmentPracticeClassBinding = this.a;
                Intrinsics.checkNotNull(fragmentPracticeClassBinding);
                fragmentPracticeClassBinding.includeChronometer.sliderTimer.setCustomThumbDrawable(R.drawable.custom_slider_thumb);
                PracticeClassViewModel practiceClassViewModel = this.b;
                if (practiceClassViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    practiceClassViewModel = null;
                }
                String str2 = this.c;
                Intrinsics.checkNotNull(str2);
                practiceClassViewModel.getSessionById(str2);
                PreferenceUtil.Companion companion2 = PreferenceUtil.INSTANCE;
                String str3 = this.c;
                Intrinsics.checkNotNull(str3);
                PreferenceUtil.Companion.saveCurrentSessionID$default(companion2, null, str3, 1, null);
            }
            FragmentPracticeClassBinding fragmentPracticeClassBinding2 = this.a;
            Intrinsics.checkNotNull(fragmentPracticeClassBinding2);
            FloatingActionButton floatingActionButton = fragmentPracticeClassBinding2.floatingActionButton;
            Intrinsics.checkNotNullExpressionValue(floatingActionButton, "floatingActionButton");
            final int i = 0;
            ViewExtKt.setOnSingleClickListener(floatingActionButton, new Function0(this) { // from class: co.ceduladigital.sdk.i7
                public final /* synthetic */ PracticeClassFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            PracticeClassFragment this$0 = this.b;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            PracticeClassViewModel practiceClassViewModel2 = this$0.b;
                            PracticeClassViewModel practiceClassViewModel3 = null;
                            if (practiceClassViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                practiceClassViewModel2 = null;
                            }
                            if (practiceClassViewModel2.isMinimumClassTime().getValue().booleanValue()) {
                                PracticeClassViewModel practiceClassViewModel4 = this$0.b;
                                if (practiceClassViewModel4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                } else {
                                    practiceClassViewModel3 = practiceClassViewModel4;
                                }
                                Context requireContext = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                NavController findNavController = FragmentKt.findNavController(this$0);
                                String str4 = this$0.c;
                                Intrinsics.checkNotNull(str4);
                                practiceClassViewModel3.backPracticeClass(requireContext, findNavController, str4, EnumClassType.PRACTICE);
                            } else {
                                PracticeClassViewModel practiceClassViewModel5 = this$0.b;
                                if (practiceClassViewModel5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                } else {
                                    practiceClassViewModel3 = practiceClassViewModel5;
                                }
                                Context requireContext2 = this$0.requireContext();
                                NavController findNavController2 = FragmentKt.findNavController(this$0);
                                String str5 = this$0.c;
                                Intrinsics.checkNotNull(str5);
                                practiceClassViewModel3.dialogCloseBeforeTime$app_release(requireContext2, findNavController2, str5);
                            }
                            break;
                        default:
                            PracticeClassFragment this$02 = this.b;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            PracticeClassViewModel practiceClassViewModel6 = this$02.b;
                            if (practiceClassViewModel6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                practiceClassViewModel6 = null;
                            }
                            Context requireContext3 = this$02.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                            NavController findNavController3 = FragmentKt.findNavController(this$02);
                            String str6 = this$02.c;
                            Intrinsics.checkNotNull(str6);
                            practiceClassViewModel6.finishedPracticeClass(requireContext3, findNavController3, str6, EnumClassType.PRACTICE);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
            FragmentPracticeClassBinding fragmentPracticeClassBinding3 = this.a;
            Intrinsics.checkNotNull(fragmentPracticeClassBinding3);
            MaterialButton btnEndClass = fragmentPracticeClassBinding3.btnEndClass;
            Intrinsics.checkNotNullExpressionValue(btnEndClass, "btnEndClass");
            final int i2 = 1;
            ViewExtKt.setOnSingleClickListener(btnEndClass, new Function0(this) { // from class: co.ceduladigital.sdk.i7
                public final /* synthetic */ PracticeClassFragment b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            PracticeClassFragment this$0 = this.b;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            PracticeClassViewModel practiceClassViewModel2 = this$0.b;
                            PracticeClassViewModel practiceClassViewModel3 = null;
                            if (practiceClassViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                practiceClassViewModel2 = null;
                            }
                            if (practiceClassViewModel2.isMinimumClassTime().getValue().booleanValue()) {
                                PracticeClassViewModel practiceClassViewModel4 = this$0.b;
                                if (practiceClassViewModel4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                } else {
                                    practiceClassViewModel3 = practiceClassViewModel4;
                                }
                                Context requireContext = this$0.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                                NavController findNavController = FragmentKt.findNavController(this$0);
                                String str4 = this$0.c;
                                Intrinsics.checkNotNull(str4);
                                practiceClassViewModel3.backPracticeClass(requireContext, findNavController, str4, EnumClassType.PRACTICE);
                            } else {
                                PracticeClassViewModel practiceClassViewModel5 = this$0.b;
                                if (practiceClassViewModel5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                } else {
                                    practiceClassViewModel3 = practiceClassViewModel5;
                                }
                                Context requireContext2 = this$0.requireContext();
                                NavController findNavController2 = FragmentKt.findNavController(this$0);
                                String str5 = this$0.c;
                                Intrinsics.checkNotNull(str5);
                                practiceClassViewModel3.dialogCloseBeforeTime$app_release(requireContext2, findNavController2, str5);
                            }
                            break;
                        default:
                            PracticeClassFragment this$02 = this.b;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            PracticeClassViewModel practiceClassViewModel6 = this$02.b;
                            if (practiceClassViewModel6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                practiceClassViewModel6 = null;
                            }
                            Context requireContext3 = this$02.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                            NavController findNavController3 = FragmentKt.findNavController(this$02);
                            String str6 = this$02.c;
                            Intrinsics.checkNotNull(str6);
                            practiceClassViewModel6.finishedPracticeClass(requireContext3, findNavController3, str6, EnumClassType.PRACTICE);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
            PracticeClassViewModel practiceClassViewModel2 = this.b;
            if (practiceClassViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                practiceClassViewModel2 = null;
            }
            practiceClassViewModel2.getConfigSession().observe(getViewLifecycleOwner(), new x0(2, new z0(1, this, PracticeClassFragment.class, "validateSessionConfig", "validateSessionConfig(Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;)V", 0, 9)));
            PracticeClassViewModel practiceClassViewModel3 = this.b;
            if (practiceClassViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                practiceClassViewModel3 = null;
            }
            practiceClassViewModel3.getMessage().observe(getViewLifecycleOwner(), new x0(2, new z0(1, this, PracticeClassFragment.class, "messageObservable", "messageObservable(Lcom/gse/aulapp/model/data/statusControl/Status;)V", 0, 10)));
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new m7(this, null));
        }
    }
}
