package com.gse.aulapp.viewmodel;

import android.content.Context;
import androidx.navigation.NavController;
import androidx.lifecycle.MutableLiveData;
import com.gse.aulapp.model.converter.SessionTestConverter;
import com.gse.aulapp.model.data.entity.QuestionEntity;
import com.gse.aulapp.model.repository.ClassInCourseRepository;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassInCourseViewModel$loadQuestionsFromDB$2", f = "ClassInCourseViewModel.kt", i = {}, l = {266}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nClassInCourseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassInCourseViewModel.kt\ncom/gse/aulapp/viewmodel/ClassInCourseViewModel$loadQuestionsFromDB$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1528:1\n1557#2:1529\n1628#2,3:1530\n*S KotlinDebug\n*F\n+ 1 ClassInCourseViewModel.kt\ncom/gse/aulapp/viewmodel/ClassInCourseViewModel$loadQuestionsFromDB$2\n*L\n267#1:1529\n267#1:1530,3\n*E\n"})
/* loaded from: classes2.dex */
public final class ClassInCourseViewModel$loadQuestionsFromDB$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ NavController $findNavController;
    final /* synthetic */ String $sessionID;
    final /* synthetic */ String $testID;
    int label;
    final /* synthetic */ ClassInCourseViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassInCourseViewModel$loadQuestionsFromDB$2(ClassInCourseViewModel classInCourseViewModel, String str, Context context, String str2, NavController navController, Continuation<? super ClassInCourseViewModel$loadQuestionsFromDB$2> continuation) {
        super(2, (Continuation<Object>) continuation);
        this.this$0 = classInCourseViewModel;
        this.$testID = str;
        this.$context = context;
        this.$sessionID = str2;
        this.$findNavController = navController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new ClassInCourseViewModel$loadQuestionsFromDB$2(this.this$0, this.$testID, this.$context, this.$sessionID, this.$findNavController, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ClassInCourseRepository classInCourseRepository;
        List validateAnswers;
        MutableLiveData mutableLiveData;
        MutableLiveData mutableLiveData2;
        MutableLiveData mutableLiveData3;
        MutableLiveData mutableLiveData4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            classInCourseRepository = this.this$0.classInCourseRepository;
            String str = this.$testID;
            this.label = 1;
            obj = classInCourseRepository.getQuestionFromDB(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(10);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(SessionTestConverter.INSTANCE.getQuestionDtoFromQuestionEntity((QuestionEntity) it.next()));
        }
        validateAnswers = this.this$0.validateAnswers(arrayList);
        mutableLiveData = this.this$0._questions;
        mutableLiveData.postValue(validateAnswers);
        if (this.this$0.getCurrentIndex() > 0) {
            if (this.this$0.getCurrentIndex() == validateAnswers.size()) {
                mutableLiveData4 = this.this$0._isLastQuestion;
                mutableLiveData4.postValue(Boxing.boxBoolean(true));
                this.this$0.setCurrentIndex(this.this$0.getCurrentIndex() - 1);
            }
            mutableLiveData3 = this.this$0._currentQuestionDto;
            mutableLiveData3.postValue(validateAnswers.get(this.this$0.getCurrentIndex()));
        } else if (validateAnswers.isEmpty()) {
            this.this$0.getSessionDataApi(this.$context, this.$sessionID, false, this.$findNavController);
        } else {
            mutableLiveData2 = this.this$0._currentQuestionDto;
            mutableLiveData2.postValue(validateAnswers.get(this.this$0.getCurrentIndex()));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClassInCourseViewModel$loadQuestionsFromDB$2) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
