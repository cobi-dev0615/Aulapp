package com.gse.aulapp.model.dao;

import com.gse.aulapp.model.data.entity.QuestionEntity;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ&\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/gse/aulapp/model/dao/QuestionDao;", BuildConfig.FLAVOR, "insert", BuildConfig.FLAVOR, "question", "Lcom/gse/aulapp/model/data/entity/QuestionEntity;", "(Lcom/gse/aulapp/model/data/entity/QuestionEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getQuestionsByTestID", BuildConfig.FLAVOR, "testID", BuildConfig.FLAVOR, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateQuestionApproved", "questionID", "approved", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllQuestionOfTestID", "testId", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface QuestionDao {
    Object deleteAllQuestionOfTestID(String str, Continuation continuation);

    Object getQuestionsByTestID(String str, Continuation<? super List<QuestionEntity>> continuation);

    Object insert(QuestionEntity questionEntity, Continuation continuation);

    Object updateQuestionApproved(String str, String str2, String str3, Continuation continuation);
}
