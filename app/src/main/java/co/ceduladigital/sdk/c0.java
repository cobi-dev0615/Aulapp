package co.ceduladigital.sdk;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.gse.aulapp.databinding.FragmentClassBinding;
import com.gse.aulapp.model.adapter.ClassDateRecyclerAdapter;
import com.gse.aulapp.model.data.ClassDate;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.util.ClassUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.view.fragment.ClassFragment;
import com.gse.aulapp.view.fragment.ClassInCourseFragment;
import com.gse.aulapp.view.fragment.HomeFragment;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import com.gse.aulapp.viewmodel.HomeViewModel;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit onBindViewHolder$lambda$2$lambda$1$lambda$0;
        Unit entryTime$lambda$10;
        Comparable groupClassDetailsByFilterType$lambda$1;
        Unit showDialogLogOut$lambda$13;
        switch (this.a) {
            case 0:
                onBindViewHolder$lambda$2$lambda$1$lambda$0 = ClassDateRecyclerAdapter.onBindViewHolder$lambda$2$lambda$1$lambda$0((ClassDateRecyclerAdapter) this.b, (SessionDto) obj);
                return onBindViewHolder$lambda$2$lambda$1$lambda$0;
            case 1:
                List<ClassDate> list = (List) obj;
                ClassFragment this$0 = (ClassFragment) this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FragmentClassBinding fragmentClassBinding = this$0.c;
                Intrinsics.checkNotNull(fragmentClassBinding);
                RecyclerView rvClass = fragmentClassBinding.rvClass;
                Intrinsics.checkNotNullExpressionValue(rvClass, "rvClass");
                Intrinsics.checkNotNull(list);
                ClassDateRecyclerAdapter classDateRecyclerAdapter = new ClassDateRecyclerAdapter(list);
                rvClass.setAdapter(classDateRecyclerAdapter);
                classDateRecyclerAdapter.updateData(list);
                Iterator<ClassDate> it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (!Intrinsics.areEqual(it.next().getDay(), "(Hoy)")) {
                        i++;
                    } else {
                        break;
                    }
                }
                rvClass.clearOnScrollListeners();
                this$0.b(rvClass, i);
                rvClass.clearOnScrollListeners();
                rvClass.addOnScrollListener(new l0(this$0, i));
                return Unit.INSTANCE;
            case 2:
                String datetime = (String) obj;
                ClassInCourseFragment this$02 = (ClassInCourseFragment) this.b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(datetime, "datetime");
                PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
                Context requireContext = this$02.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                companion.saveStartClassOrExam(requireContext, datetime);
                return Unit.INSTANCE;
            case 3:
                entryTime$lambda$10 = ClassPracticeBeforeViewModel.getEntryTime$lambda$10((ClassPracticeBeforeViewModel) this.b, (String) obj);
                return entryTime$lambda$10;
            case 4:
                groupClassDetailsByFilterType$lambda$1 = ClassUtil.groupClassDetailsByFilterType$lambda$1((SimpleDateFormat) this.b, (SessionDto) obj);
                return groupClassDetailsByFilterType$lambda$1;
            case 5:
                // Stubbed: FirebaseSessionsComponent.MainModule.Companion.sessionDataStore$lambda$3
                throw new UnsupportedOperationException("Decompiled stub");
            case 6:
                SessionDto it2 = (SessionDto) obj;
                HomeFragment this$03 = (HomeFragment) this.b;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                HomeViewModel homeViewModel = this$03.a;
                if (homeViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    homeViewModel = null;
                }
                FragmentActivity requireActivity = this$03.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                homeViewModel.validateConnection(requireActivity, new j0(this$03, it2, 2));
                return Unit.INSTANCE;
            case 7:
                showDialogLogOut$lambda$13 = HomeViewModel.showDialogLogOut$lambda$13((Ref.ObjectRef) this.b, (String) obj);
                return showDialogLogOut$lambda$13;
            default:
                // Stubbed: PluginGeneratedSerialDescriptor.toString$lambda$6
                throw new UnsupportedOperationException("Decompiled stub");
        }
    }
}
