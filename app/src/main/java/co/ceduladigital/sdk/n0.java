package co.ceduladigital.sdk;

import com.gse.aulapp.databinding.FragmentClassInCourseBinding;
import com.gse.aulapp.model.dto.QuestionDto;
import com.gse.aulapp.view.fragment.ClassInCourseFragment;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class n0 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                QuestionDto question = (QuestionDto) obj2;
                ClassInCourseFragment this$0 = (ClassInCourseFragment) this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(question, "question");
                ClassInCourseViewModel classInCourseViewModel = this$0.b;
                if (classInCourseViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    classInCourseViewModel = null;
                }
                FragmentClassInCourseBinding fragmentClassInCourseBinding = this$0.a;
                Intrinsics.checkNotNull(fragmentClassInCourseBinding);
                classInCourseViewModel.moveToQuestion(intValue, fragmentClassInCourseBinding);
                return Unit.INSTANCE;
            default:
                throw new UnsupportedOperationException("Not decompiled");
        }
    }
}
