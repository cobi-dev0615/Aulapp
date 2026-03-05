package co.ceduladigital.sdk;

import androidx.collection.ArrayMap;
import com.gse.aulapp.model.dao.SessionDao_Impl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class l8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SessionDao_Impl b;

    public /* synthetic */ l8(SessionDao_Impl sessionDao_Impl, int i) {
        this.a = i;
        this.b = sessionDao_Impl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit lambda$__fetchRelationshipclassroomAscomGseAulappModelDataEntityClassRoomEntity$2;
        Unit lambda$__fetchRelationshipvehicleAscomGseAulappModelDataEntityVehicleEntity$0;
        Unit lambda$__fetchRelationshiplessonAscomGseAulappModelDataEntityLessonEntity$1;
        Unit lambda$__fetchRelationshipstepProcessSessionAscomGseAulappModelDataEntityStepProcessSessionEntity$3;
        Unit lambda$__fetchRelationshipquestionApprovedAscomGseAulappModelDataEntityQuestionApprovedEntity$4;
        Unit lambda$__fetchRelationshipgpsTraceAscomGseAulappModelDataEntityGpsTraceEntity$5;
        switch (this.a) {
            case 0:
                lambda$__fetchRelationshipclassroomAscomGseAulappModelDataEntityClassRoomEntity$2 = this.b.lambda$__fetchRelationshipclassroomAscomGseAulappModelDataEntityClassRoomEntity$2((ArrayMap) obj);
                return lambda$__fetchRelationshipclassroomAscomGseAulappModelDataEntityClassRoomEntity$2;
            case 1:
                lambda$__fetchRelationshipvehicleAscomGseAulappModelDataEntityVehicleEntity$0 = this.b.lambda$__fetchRelationshipvehicleAscomGseAulappModelDataEntityVehicleEntity$0((ArrayMap) obj);
                return lambda$__fetchRelationshipvehicleAscomGseAulappModelDataEntityVehicleEntity$0;
            case 2:
                lambda$__fetchRelationshiplessonAscomGseAulappModelDataEntityLessonEntity$1 = this.b.lambda$__fetchRelationshiplessonAscomGseAulappModelDataEntityLessonEntity$1((ArrayMap) obj);
                return lambda$__fetchRelationshiplessonAscomGseAulappModelDataEntityLessonEntity$1;
            case 3:
                lambda$__fetchRelationshipstepProcessSessionAscomGseAulappModelDataEntityStepProcessSessionEntity$3 = this.b.lambda$__fetchRelationshipstepProcessSessionAscomGseAulappModelDataEntityStepProcessSessionEntity$3((ArrayMap) obj);
                return lambda$__fetchRelationshipstepProcessSessionAscomGseAulappModelDataEntityStepProcessSessionEntity$3;
            case 4:
                lambda$__fetchRelationshipquestionApprovedAscomGseAulappModelDataEntityQuestionApprovedEntity$4 = this.b.lambda$__fetchRelationshipquestionApprovedAscomGseAulappModelDataEntityQuestionApprovedEntity$4((ArrayMap) obj);
                return lambda$__fetchRelationshipquestionApprovedAscomGseAulappModelDataEntityQuestionApprovedEntity$4;
            default:
                lambda$__fetchRelationshipgpsTraceAscomGseAulappModelDataEntityGpsTraceEntity$5 = this.b.lambda$__fetchRelationshipgpsTraceAscomGseAulappModelDataEntityGpsTraceEntity$5((ArrayMap) obj);
                return lambda$__fetchRelationshipgpsTraceAscomGseAulappModelDataEntityGpsTraceEntity$5;
        }
    }
}
