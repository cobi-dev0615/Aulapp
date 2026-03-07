package com.gse.aulapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.gse.aulapp.model.dto.QuestionDto;
import com.gse.aulapp.model.dto.Status;
import com.gse.aulapp.model.repository.ClassInCourseRepository;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassInCourseViewModel$moveToNextQuestion$1$1", f = "ClassInCourseViewModel.kt", i = {0}, l = {361}, m = "invokeSuspend", n = {"isLastQuestion"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nClassInCourseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassInCourseViewModel.kt\ncom/gse/aulapp/viewmodel/ClassInCourseViewModel$moveToNextQuestion$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1528:1\n1567#2:1529\n1598#2,4:1530\n*S KotlinDebug\n*F\n+ 1 ClassInCourseViewModel.kt\ncom/gse/aulapp/viewmodel/ClassInCourseViewModel$moveToNextQuestion$1$1\n*L\n396#1:1529\n396#1:1530,4\n*E\n"})
/* loaded from: classes2.dex */
public final class ClassInCourseViewModel$moveToNextQuestion$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<QuestionDto> $questions;
    Object L$0;
    int label;
    final /* synthetic */ ClassInCourseViewModel this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.REJECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.APPROVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassInCourseViewModel$moveToNextQuestion$1$1(List<QuestionDto> list, ClassInCourseViewModel classInCourseViewModel, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$questions = list;
        this.this$0 = classInCourseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new ClassInCourseViewModel$moveToNextQuestion$1$1(this.$questions, this.this$0, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean isLastQuestion;
        ClassInCourseRepository classInCourseRepository;
        Ref.BooleanRef booleanRef;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        MutableLiveData mutableLiveData5;
        MutableLiveData mutableLiveData6;
        String unused;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        int i2 = 0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            boolean z = this.$questions.get(this.this$0.getCurrentIndex()).getStatus() == Status.APPROVED;
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            isLastQuestion = this.this$0.isLastQuestion();
            booleanRef2.element = isLastQuestion;
            String str = z ? "Aprobado" : "Reprobado";
            unused = this.this$0.TAG;
            classInCourseRepository = this.this$0.classInCourseRepository;
            String testId = this.$questions.get(this.this$0.getCurrentIndex()).getTestId();
            String id = this.$questions.get(this.this$0.getCurrentIndex()).getId();
            this.L$0 = booleanRef2;
            this.label = 1;
            if (classInCourseRepository.saveResolvedQuestion(testId, id, str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            booleanRef = booleanRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = (Ref.BooleanRef) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!booleanRef.element) {
            mutableLiveData6 = this.this$0._isLastQuestion;
            mutableLiveData6.postValue(Boxing.boxBoolean(true));
        }
        if (this.this$0.getCurrentIndex() < this.$questions.size() - 1 || !booleanRef.element) {
            if (booleanRef.element) {
                this.this$0.setCurrentIndex(this.this$0.getCurrentIndex() + 1);
            }
            mutableLiveData = this.this$0._questions;
            List list = (List) mutableLiveData.getValue();
            QuestionDto questionDto = list != null ? (QuestionDto) list.get(this.this$0.getCurrentIndex()) : null;
            Status status = questionDto != null ? questionDto.getStatus() : null;
            int i3 = status == null ? -1 : WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i3 == 1) {
                mutableLiveData2 = this.this$0._checkRadioButton;
                Status status2 = Status.REJECTED;
                mutableLiveData2.postValue(status2);
                this.this$0.lastStatus = status2;
            } else if (i3 != 2) {
                this.this$0.lastStatus = Status.NOT_ANSWERED;
            } else {
                mutableLiveData5 = this.this$0._checkRadioButton;
                Status status3 = Status.APPROVED;
                mutableLiveData5.postValue(status3);
                this.this$0.lastStatus = status3;
            }
            List<QuestionDto> list2 = this.$questions;
            ClassInCourseViewModel classInCourseViewModel = this.this$0;
            ArrayList arrayList = new ArrayList(10);
            for (Object obj2 : list2) {
                int i4 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                QuestionDto questionDto2 = (QuestionDto) obj2;
                if (i2 == classInCourseViewModel.getCurrentIndex() && booleanRef.element) {
                    questionDto2 = QuestionDto.copy$default(questionDto2, null, null, null, null, Status.CURRENT, 15, null);
                }
                arrayList.add(questionDto2);
                i2 = i4;
            }
            mutableLiveData3 = this.this$0._questions;
            mutableLiveData3.postValue(arrayList);
            mutableLiveData4 = this.this$0._currentQuestionDto;
            mutableLiveData4.postValue(arrayList.get(this.this$0.getCurrentIndex()));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ClassInCourseViewModel$moveToNextQuestion$1$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
