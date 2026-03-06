package com.gse.aulapp.model.converter;

import com.gse.aulapp.model.data.entity.QuestionEntity;
import com.gse.aulapp.model.dto.QuestionDto;
import com.gse.aulapp.model.response.QuestionsResponse;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/model/converter/SessionTestConverter;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SessionTestConverter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006¨\u0006\u000e"}, d2 = {"Lcom/gse/aulapp/model/converter/SessionTestConverter$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "getQuestionEntityFromQuestionResponse", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/entity/QuestionEntity;", "testID", BuildConfig.FLAVOR, "questionsResponses", "Lcom/gse/aulapp/model/response/QuestionsResponse;", "getQuestionDtoFromQuestionEntity", "Lcom/gse/aulapp/model/dto/QuestionDto;", "it", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSessionTestConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionTestConverter.kt\ncom/gse/aulapp/model/converter/SessionTestConverter$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1557#2:38\n1628#2,3:39\n*S KotlinDebug\n*F\n+ 1 SessionTestConverter.kt\ncom/gse/aulapp/model/converter/SessionTestConverter$Companion\n*L\n12#1:38\n12#1:39,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final QuestionDto getQuestionDtoFromQuestionEntity(QuestionEntity it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return new QuestionDto(it.getQuestionID(), it.getTestID(), it.getAnswer(), it.getDescription(), null, 16, null);
        }

        public final List<QuestionEntity> getQuestionEntityFromQuestionResponse(String testID, List<QuestionsResponse> questionsResponses) {
            Intrinsics.checkNotNullParameter(testID, "testID");
            Intrinsics.checkNotNullParameter(questionsResponses, "questionsResponses");
            ArrayList arrayList = new ArrayList(10);
            for (QuestionsResponse questionsResponse : questionsResponses) {
                String id = questionsResponse.getId();
                String itemID = questionsResponse.getItemID();
                String answer = questionsResponse.getAnswer();
                String description = questionsResponse.getDescription();
                String level = questionsResponse.getLevel();
                if (level == null) {
                    level = "No aplica";
                }
                arrayList.add(new QuestionEntity(id, testID, itemID, answer, description, level, null, null));
            }
            return arrayList;
        }

        private Companion() {
        }
    }
}
