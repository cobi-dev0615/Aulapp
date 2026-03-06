package com.gse.aulapp.model.repository;

import com.gse.aulapp.model.dao.QuestionDao;
import com.gse.aulapp.model.dao.TestDao;
import com.gse.aulapp.model.data.entity.QuestionEntity;
import com.gse.aulapp.model.data.entity.TestEntity;
import com.karumi.dexter.BuildConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0086@¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u001e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/gse/aulapp/model/repository/ClassInCourseRepository;", BuildConfig.FLAVOR, "testDao", "Lcom/gse/aulapp/model/dao/TestDao;", "questionDao", "Lcom/gse/aulapp/model/dao/QuestionDao;", "<init>", "(Lcom/gse/aulapp/model/dao/TestDao;Lcom/gse/aulapp/model/dao/QuestionDao;)V", "getQuestionFromDB", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/entity/QuestionEntity;", "testID", BuildConfig.FLAVOR, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveResolvedQuestion", BuildConfig.FLAVOR, "questionID", "approved", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveQuestion", "questionEntity", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllQuestionBySessionID", "sessionID", "saveTest", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClassInCourseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassInCourseRepository.kt\ncom/gse/aulapp/model/repository/ClassInCourseRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,80:1\n1863#2,2:81\n*S KotlinDebug\n*F\n+ 1 ClassInCourseRepository.kt\ncom/gse/aulapp/model/repository/ClassInCourseRepository\n*L\n48#1:81,2\n*E\n"})
/* loaded from: classes.dex */
@SuppressWarnings({"unchecked", "rawtypes"})
public final class ClassInCourseRepository {
    private final QuestionDao questionDao;
    private final TestDao testDao;

    public ClassInCourseRepository(TestDao testDao, QuestionDao questionDao) {
        Intrinsics.checkNotNullParameter(testDao, "testDao");
        Intrinsics.checkNotNullParameter(questionDao, "questionDao");
        this.testDao = testDao;
        this.questionDao = questionDao;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r6.deleteAllQuestionOfTestID(r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deleteAllQuestionBySessionID(String str, Continuation<? super Unit> continuation) {
        ClassInCourseRepository$deleteAllQuestionBySessionID$1 classInCourseRepository$deleteAllQuestionBySessionID$1;
        int i;
        ClassInCourseRepository classInCourseRepository;
        TestEntity testEntity;
        if (continuation instanceof ClassInCourseRepository$deleteAllQuestionBySessionID$1) {
            classInCourseRepository$deleteAllQuestionBySessionID$1 = (ClassInCourseRepository$deleteAllQuestionBySessionID$1) continuation;
            int i2 = classInCourseRepository$deleteAllQuestionBySessionID$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                classInCourseRepository$deleteAllQuestionBySessionID$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = classInCourseRepository$deleteAllQuestionBySessionID$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = classInCourseRepository$deleteAllQuestionBySessionID$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    TestDao testDao = this.testDao;
                    classInCourseRepository$deleteAllQuestionBySessionID$1.L$0 = this;
                    classInCourseRepository$deleteAllQuestionBySessionID$1.label = 1;
                    obj = testDao.getTestBySessionID(str, classInCourseRepository$deleteAllQuestionBySessionID$1);
                    if (obj != coroutine_suspended) {
                        classInCourseRepository = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                classInCourseRepository = (ClassInCourseRepository) classInCourseRepository$deleteAllQuestionBySessionID$1.L$0;
                ResultKt.throwOnFailure(obj);
                testEntity = (TestEntity) obj;
                if (testEntity != null) {
                    return Unit.INSTANCE;
                }
                QuestionDao questionDao = classInCourseRepository.questionDao;
                String testID = testEntity.getTestID();
                classInCourseRepository$deleteAllQuestionBySessionID$1.L$0 = null;
                classInCourseRepository$deleteAllQuestionBySessionID$1.label = 2;
            }
        }
        classInCourseRepository$deleteAllQuestionBySessionID$1 = new ClassInCourseRepository$deleteAllQuestionBySessionID$1(this, (Continuation) continuation);
        Object obj2 = classInCourseRepository$deleteAllQuestionBySessionID$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = classInCourseRepository$deleteAllQuestionBySessionID$1.label;
        if (i != 0) {
        }
        testEntity = (TestEntity) obj2;
        if (testEntity != null) {
        }
        return Unit.INSTANCE;
    }

    public final Object getQuestionFromDB(String str, Continuation<? super List<QuestionEntity>> continuation) {
        return this.questionDao.getQuestionsByTestID(str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object saveQuestion(List<QuestionEntity> list, Continuation<? super Unit> continuation) {
        ClassInCourseRepository$saveQuestion$1 classInCourseRepository$saveQuestion$1;
        int i;
        Iterator it = null;
        ClassInCourseRepository classInCourseRepository;
        if (continuation instanceof ClassInCourseRepository$saveQuestion$1) {
            classInCourseRepository$saveQuestion$1 = (ClassInCourseRepository$saveQuestion$1) continuation;
            int i2 = classInCourseRepository$saveQuestion$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                classInCourseRepository$saveQuestion$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = classInCourseRepository$saveQuestion$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = classInCourseRepository$saveQuestion$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    it = list.iterator();
                    classInCourseRepository = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) classInCourseRepository$saveQuestion$1.L$1;
                    classInCourseRepository = (ClassInCourseRepository) classInCourseRepository$saveQuestion$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                while (it.hasNext()) {
                    QuestionEntity questionEntity = (QuestionEntity) it.next();
                    QuestionDao questionDao = classInCourseRepository.questionDao;
                    classInCourseRepository$saveQuestion$1.L$0 = classInCourseRepository;
                    classInCourseRepository$saveQuestion$1.L$1 = it;
                    classInCourseRepository$saveQuestion$1.label = 1;
                    if (questionDao.insert(questionEntity, classInCourseRepository$saveQuestion$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        classInCourseRepository$saveQuestion$1 = new ClassInCourseRepository$saveQuestion$1(this, (Continuation) continuation);
        Object obj2 = classInCourseRepository$saveQuestion$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = classInCourseRepository$saveQuestion$1.label;
        if (i != 0) {
        }
        while (it != null && it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    public final Object saveResolvedQuestion(String str, String str2, String str3, Continuation<? super Unit> continuation) {
        Object updateQuestionApproved = this.questionDao.updateQuestionApproved(str2, str, str3, continuation);
        return updateQuestionApproved == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateQuestionApproved : Unit.INSTANCE;
    }

    public final Object saveTest(String str, String str2, Continuation<? super Unit> continuation) {
        Object insert = this.testDao.insert(new TestEntity(str, str2), continuation);
        return insert == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? insert : Unit.INSTANCE;
    }
}
