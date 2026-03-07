package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.converter.SessionTestConverter;
import com.gse.aulapp.model.data.entity.QuestionEntity;
import com.gse.aulapp.model.repository.ClassInCourseRepository;
import com.gse.aulapp.model.response.QuestionsResponse;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassInCourseViewModel$saveQuestionInDB$2", f = "ClassInCourseViewModel.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassInCourseViewModel$saveQuestionInDB$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<QuestionsResponse> $questionsResponses;
    final /* synthetic */ String $testID;
    int label;
    final /* synthetic */ ClassInCourseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassInCourseViewModel$saveQuestionInDB$2(ClassInCourseViewModel classInCourseViewModel, String str, List<QuestionsResponse> list, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.this$0 = classInCourseViewModel;
        this.$testID = str;
        this.$questionsResponses = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new ClassInCourseViewModel$saveQuestionInDB$2(this.this$0, this.$testID, this.$questionsResponses, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ClassInCourseRepository classInCourseRepository;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            classInCourseRepository = this.this$0.classInCourseRepository;
            List<QuestionEntity> questionEntityFromQuestionResponse = SessionTestConverter.INSTANCE.getQuestionEntityFromQuestionResponse(this.$testID, this.$questionsResponses);
            this.label = 1;
            if (classInCourseRepository.saveQuestion(questionEntityFromQuestionResponse, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ClassInCourseViewModel$saveQuestionInDB$2) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
