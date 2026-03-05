package co.ceduladigital.sdk;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentClassPracticeBeforeBinding;
import com.gse.aulapp.model.adapter.StepRecyclerAdapter;
import com.gse.aulapp.model.data.entity.SessionEntity;
import com.gse.aulapp.model.data.entity.StepProcessSessionEntity;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumStatusAppointment;
import com.gse.aulapp.util.ButtonUtil;
import com.gse.aulapp.util.Parameters;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import com.karumi.dexter.BuildConfig;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class y1 implements FlowCollector {
    public final /* synthetic */ ClassPracticeBeforeFragment a;

    public y1(ClassPracticeBeforeFragment classPracticeBeforeFragment) {
        this.a = classPracticeBeforeFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Status status = (Status) obj;
        boolean z = status instanceof Status.Loading;
        ClassPracticeBeforeFragment classPracticeBeforeFragment = this.a;
        if (z) {
            classPracticeBeforeFragment.callGlobalLoading(((Status.Loading) status).getShow());
        } else if (status instanceof Status.Success) {
            Status.Success success = (Status.Success) status;
            Object data = success.getData();
            if (data instanceof List) {
                Collection collection = (Collection) success.getData();
                ClassPracticeBeforeViewModel classPracticeBeforeViewModel = null;
                if (collection != null && !collection.isEmpty() && (((List) success.getData()).get(0) instanceof SessionFull)) {
                    Object obj2 = ((List) success.getData()).get(0);
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.gse.aulapp.model.data.entity.entityFull.SessionFull");
                    SessionFull sessionFull = (SessionFull) obj2;
                    SessionEntity session = sessionFull.getSession();
                    classPracticeBeforeFragment.d = session != null ? session.getApprenticeEmail() : null;
                    SessionEntity session2 = sessionFull.getSession();
                    classPracticeBeforeFragment.g = session2 != null ? session2.getApprentice() : null;
                    SessionEntity session3 = sessionFull.getSession();
                    if (session3 != null) {
                        session3.getCategory();
                    }
                    SessionEntity session4 = sessionFull.getSession();
                    classPracticeBeforeFragment.i = String.valueOf(session4 != null ? session4.getApprenticeID() : null);
                    SessionEntity session5 = sessionFull.getSession();
                    classPracticeBeforeFragment.k = session5 != null ? session5.getApprenticeDocumentNumber() : null;
                    SessionEntity session6 = sessionFull.getSession();
                    classPracticeBeforeFragment.l = session6 != null ? session6.getApprenticeDocumentType() : null;
                    EnumStatusAppointment.Companion companion = EnumStatusAppointment.INSTANCE;
                    SessionEntity session7 = sessionFull.getSession();
                    companion.getEnumByName(session7 != null ? session7.getStatusAppointment() : null);
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding);
                    TextView textView = fragmentClassPracticeBeforeBinding.cardProfileUserProfileUser.tvClassTypeState;
                    SessionEntity session8 = sessionFull.getSession();
                    textView.setText(session8 != null ? session8.getStatusAppointment() : null);
                    Parameters.Companion companion2 = Parameters.INSTANCE;
                    companion2.setUserApprentice(String.valueOf(classPracticeBeforeFragment.g));
                    companion2.setUserEmail(String.valueOf(classPracticeBeforeFragment.d));
                    ClassPracticeBeforeViewModel classPracticeBeforeViewModel2 = classPracticeBeforeFragment.b;
                    if (classPracticeBeforeViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        classPracticeBeforeViewModel2 = null;
                    }
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding2 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding2);
                    classPracticeBeforeViewModel2.setDataSession(sessionFull, fragmentClassPracticeBeforeBinding2);
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding3 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding3);
                    fragmentClassPracticeBeforeBinding3.rvProfileUser.setHasFixedSize(true);
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding4 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding4);
                    fragmentClassPracticeBeforeBinding4.rvProfileUser.setLayoutManager(new LinearLayoutManager(classPracticeBeforeFragment.getContext(), 1, false));
                    FragmentActivity requireActivity = classPracticeBeforeFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    ClassPracticeBeforeViewModel classPracticeBeforeViewModel3 = classPracticeBeforeFragment.b;
                    if (classPracticeBeforeViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        classPracticeBeforeViewModel3 = null;
                    }
                    Context requireContext = classPracticeBeforeFragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    classPracticeBeforeFragment.e = new StepRecyclerAdapter(requireActivity, classPracticeBeforeViewModel3.getListStep(requireContext, classPracticeBeforeFragment.h));
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding5 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding5);
                    RecyclerView recyclerView = fragmentClassPracticeBeforeBinding5.rvProfileUser;
                    StepRecyclerAdapter stepRecyclerAdapter = classPracticeBeforeFragment.e;
                    if (stepRecyclerAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stepRecyclerAdapter");
                        stepRecyclerAdapter = null;
                    }
                    recyclerView.setAdapter(stepRecyclerAdapter);
                    StepRecyclerAdapter stepRecyclerAdapter2 = classPracticeBeforeFragment.e;
                    if (stepRecyclerAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stepRecyclerAdapter");
                        stepRecyclerAdapter2 = null;
                    }
                    stepRecyclerAdapter2.setOnItemClickListener(new p1(classPracticeBeforeFragment, 1));
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding6 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding6);
                    fragmentClassPracticeBeforeBinding6.cardProfileUserProfileUser.getRoot().setVisibility(0);
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding7 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding7);
                    fragmentClassPracticeBeforeBinding7.primaryButtonClass.getRoot().setVisibility(0);
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding8 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding8);
                    fragmentClassPracticeBeforeBinding8.titleDetailsStep.setVisibility(0);
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding9 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding9);
                    fragmentClassPracticeBeforeBinding9.rvProfileUser.setVisibility(0);
                    ButtonUtil.Companion companion3 = ButtonUtil.INSTANCE;
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding10 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding10);
                    MaterialButton root = fragmentClassPracticeBeforeBinding10.primaryButtonClass.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                    companion3.customFourthButton(root, classPracticeBeforeFragment.getString(classPracticeBeforeFragment.h ? R.string.title_mb_login : R.string.btn_title_exit));
                    String str = classPracticeBeforeFragment.f;
                    if (str != null && str.length() != 0) {
                        ClassPracticeBeforeViewModel classPracticeBeforeViewModel4 = classPracticeBeforeFragment.b;
                        if (classPracticeBeforeViewModel4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            classPracticeBeforeViewModel4 = null;
                        }
                        String str2 = classPracticeBeforeFragment.f;
                        Intrinsics.checkNotNull(str2);
                        classPracticeBeforeViewModel4.getStepperStatusComplete(str2, classPracticeBeforeFragment.h);
                    }
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding11 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding11);
                    fragmentClassPracticeBeforeBinding11.cardProfileUserProfileUser.includeFabLocation.fabLocation.setVisibility(8);
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding12 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding12);
                    fragmentClassPracticeBeforeBinding12.cardProfileUserProfileUser.includeFabLocation.cvContainerIconUser.setVisibility(0);
                    ClassPracticeBeforeViewModel classPracticeBeforeViewModel5 = classPracticeBeforeFragment.b;
                    if (classPracticeBeforeViewModel5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        classPracticeBeforeViewModel5 = null;
                    }
                    Context context = classPracticeBeforeFragment.getContext();
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding13 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding13);
                    ImageView ivIconUser = fragmentClassPracticeBeforeBinding13.cardProfileUserProfileUser.includeFabLocation.ivIconUser;
                    Intrinsics.checkNotNullExpressionValue(ivIconUser, "ivIconUser");
                    classPracticeBeforeViewModel5.selectImage(context, ivIconUser);
                }
                Collection collection2 = (Collection) success.getData();
                if (collection2 == null || collection2.isEmpty() || !(((List) success.getData()).get(0) instanceof StepProcessSessionEntity)) {
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding14 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding14);
                    fragmentClassPracticeBeforeBinding14.primaryButtonClass.getRoot().setEnabled(false);
                } else {
                    ClassPracticeBeforeViewModel classPracticeBeforeViewModel6 = classPracticeBeforeFragment.b;
                    if (classPracticeBeforeViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        classPracticeBeforeViewModel = classPracticeBeforeViewModel6;
                    }
                    Object data2 = success.getData();
                    Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.collections.List<com.gse.aulapp.model.data.entity.StepProcessSessionEntity>");
                    FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding15 = classPracticeBeforeFragment.c;
                    Intrinsics.checkNotNull(fragmentClassPracticeBeforeBinding15);
                    classPracticeBeforeViewModel.validateContinueButton((List) data2, fragmentClassPracticeBeforeBinding15);
                }
            } else {
                boolean z2 = data instanceof Boolean;
                String str3 = classPracticeBeforeFragment.a;
                if (!z2) {
                    Boxing.boxInt(Log.e(str3, "Status Default"));
                } else if (((Boolean) success.getData()).booleanValue()) {
                    classPracticeBeforeFragment.e();
                } else {
                    Boxing.boxInt(Log.e(str3, "Status Boolean: false"));
                }
            }
        } else if ((status instanceof Status.Failure) || (status instanceof Status.Exception)) {
            classPracticeBeforeFragment.callGlobalLoading(false);
            ClassPracticeBeforeFragment.c(classPracticeBeforeFragment, null, BuildConfig.FLAVOR, null, new t1(4), 13);
        } else {
            classPracticeBeforeFragment.callGlobalLoading(false);
            ClassPracticeBeforeFragment.c(classPracticeBeforeFragment, null, BuildConfig.FLAVOR, null, new t1(5), 13);
        }
        return Unit.INSTANCE;
    }
}
