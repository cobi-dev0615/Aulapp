package com.gse.aulapp.util;

import com.gse.aulapp.model.request.LevelSummary;
import com.gse.aulapp.model.request.SummaryPracticeExamRequest;
import com.gse.aulapp.model.response.QuestionPracticeExam;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/SummaryExamUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SummaryExamUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\f"}, d2 = {"Lcom/gse/aulapp/util/SummaryExamUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "calculateSummary", "Lcom/gse/aulapp/model/request/SummaryPracticeExamRequest;", "questionFullSync", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/QuestionPracticeExam;", "validateQuestionsStatus", "Lkotlin/Pair;", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSummaryExamUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SummaryExamUtil.kt\ncom/gse/aulapp/util/SummaryExamUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,45:1\n1485#2:46\n1510#2,3:47\n1513#2,3:57\n1246#2,2:62\n1782#2,4:64\n1782#2,4:68\n1249#2:72\n1782#2,4:73\n1782#2,4:77\n381#3,7:50\n462#3:60\n412#3:61\n*S KotlinDebug\n*F\n+ 1 SummaryExamUtil.kt\ncom/gse/aulapp/util/SummaryExamUtil$Companion\n*L\n14#1:46\n14#1:47,3\n14#1:57,3\n15#1:62,2\n16#1:64,4\n17#1:68,4\n15#1:72\n40#1:73,4\n41#1:77,4\n14#1:50,7\n15#1:60\n15#1:61\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SummaryPracticeExamRequest calculateSummary(List<QuestionPracticeExam> questionFullSync) {
            int i;
            int i2;
            Intrinsics.checkNotNullParameter(questionFullSync, "questionFullSync");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : questionFullSync) {
                String level = ((QuestionPracticeExam) obj).getLevel();
                Object obj2 = linkedHashMap.get(level);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(level, obj2);
                }
                ((List) obj2).add(obj);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
            for (Object entryObj : linkedHashMap.entrySet()) {
                Map.Entry entry = (Map.Entry) entryObj;
                Object key = entry.getKey();
                List list = (List) entry.getValue();
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((QuestionPracticeExam) it.next()).getAnswer(), "Aprobado") && (i = i + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                } else {
                    i = 0;
                }
                if (list == null || !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if (Intrinsics.areEqual(((QuestionPracticeExam) it2.next()).getAnswer(), "Reprobado") && (i2 = i2 + 1) < 0) {
                            CollectionsKt.throwCountOverflow();
                        }
                    }
                } else {
                    i2 = 0;
                }
                linkedHashMap2.put(key, new LevelSummary(Integer.valueOf(i), Integer.valueOf(i2), 0, Integer.valueOf(i + i2)));
            }
            Boolean bool = Boolean.FALSE;
            LevelSummary levelSummary = (LevelSummary) linkedHashMap2.get("Alto");
            if (levelSummary == null) {
                levelSummary = new LevelSummary(0, 0, 0, 0);
            }
            LevelSummary levelSummary2 = levelSummary;
            LevelSummary levelSummary3 = (LevelSummary) linkedHashMap2.get("Medio");
            if (levelSummary3 == null) {
                levelSummary3 = new LevelSummary(0, 0, 0, 0);
            }
            LevelSummary levelSummary4 = levelSummary3;
            LevelSummary levelSummary5 = (LevelSummary) linkedHashMap2.get("Bajo");
            if (levelSummary5 == null) {
                levelSummary5 = new LevelSummary(0, 0, 0, 0);
            }
            return new SummaryPracticeExamRequest(bool, levelSummary2, levelSummary4, levelSummary5, "undeveloped", 0);
        }

        public final Pair<Integer, Integer> validateQuestionsStatus(List<QuestionPracticeExam> questionFullSync) {
            int i;
            Intrinsics.checkNotNullParameter(questionFullSync, "questionFullSync");
            int i2 = 0;
            if (questionFullSync == null || !questionFullSync.isEmpty()) {
                Iterator it = questionFullSync.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((QuestionPracticeExam) it.next()).getAnswer(), "Aprobado") && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            } else {
                i = 0;
            }
            if (questionFullSync == null || !questionFullSync.isEmpty()) {
                Iterator it2 = questionFullSync.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual(((QuestionPracticeExam) it2.next()).getAnswer(), "Reprobado") && (i2 = i2 + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
            return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
        }

        private Companion() {
        }
    }
}
