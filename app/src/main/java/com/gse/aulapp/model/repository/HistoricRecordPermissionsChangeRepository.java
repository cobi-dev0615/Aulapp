package com.gse.aulapp.model.repository;

import android.content.Context;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.model.dao.HistoricRecordPermissionsChangeDao;
import com.gse.aulapp.model.data.entity.HistoricRecordPermissionsChangeEntity;
import com.gse.aulapp.model.enumerate.EnumPermissionsApp;
import com.gse.aulapp.model.request.HistoricRecordPermissionsChangeRequest;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import retrofit2.Response;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082@¢\u0006\u0002\u0010\tJ.\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086@¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0082@¢\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\u001cJ$\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082@¢\u0006\u0002\u0010\u001fJ(\u0010 \u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0082@¢\u0006\u0002\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/gse/aulapp/model/repository/HistoricRecordPermissionsChangeRepository;", BuildConfig.FLAVOR, "dao", "Lcom/gse/aulapp/model/dao/HistoricRecordPermissionsChangeDao;", "<init>", "(Lcom/gse/aulapp/model/dao/HistoricRecordPermissionsChangeDao;)V", "getAllHistoricPermissionsChange", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/entity/HistoricRecordPermissionsChangeEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveHistoricPermissionsChange", BuildConfig.FLAVOR, "sessionID", BuildConfig.FLAVOR, "date", "active", BuildConfig.FLAVOR, "permission", "Lcom/gse/aulapp/model/enumerate/EnumPermissionsApp;", "(Ljava/lang/String;Ljava/lang/String;ZLcom/gse/aulapp/model/enumerate/EnumPermissionsApp;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllHistoric", BuildConfig.FLAVOR, "id", BuildConfig.FLAVOR, "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncHistoricPermissionChange", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncHistoricPermissionChangeRequest", "listHistoricPermissionsChange", "(Landroid/content/Context;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendSyncHistoricPermissionChange", "historyPermissionChangeRequest", "Lcom/gse/aulapp/model/request/HistoricRecordPermissionsChangeRequest;", "(Landroid/content/Context;Lcom/gse/aulapp/model/request/HistoricRecordPermissionsChangeRequest;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHistoricRecordPermissionsChangeRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoricRecordPermissionsChangeRepository.kt\ncom/gse/aulapp/model/repository/HistoricRecordPermissionsChangeRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,114:1\n1557#2:115\n1628#2,3:116\n*S KotlinDebug\n*F\n+ 1 HistoricRecordPermissionsChangeRepository.kt\ncom/gse/aulapp/model/repository/HistoricRecordPermissionsChangeRepository\n*L\n65#1:115\n65#1:116,3\n*E\n"})
/* loaded from: classes.dex */
public final class HistoricRecordPermissionsChangeRepository {
    private final HistoricRecordPermissionsChangeDao dao;

    public HistoricRecordPermissionsChangeRepository(HistoricRecordPermissionsChangeDao dao) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.dao = dao;
    }

    private final Object deleteAllHistoric(int i, Continuation<? super Long> continuation) {
        return this.dao.deleteHistoricCustom(new SimpleSQLiteQuery("DELETE FROM historicRecordPermissionsChange WHERE id = ?", new Object[]{Boxing.boxInt(i)}), continuation);
    }

    private final Object getAllHistoricPermissionsChange(Continuation<? super List<HistoricRecordPermissionsChangeEntity>> continuation) {
        return this.dao.getHistoricCustom(new SimpleSQLiteQuery("SELECT * FROM historicRecordPermissionsChange ", null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|8|(1:(1:(1:(4:13|14|15|16)(2:18|19))(9:20|21|22|23|24|25|(2:27|(1:30))|15|16))(3:37|38|39))(6:42|43|44|45|46|(2:48|32)(1:49))|40))|54|6|7|8|(0)(0)|40|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f0, code lost:
    
        if (r4.deleteAllHistoric(r0, r10) == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        if (r2 != r11) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0044, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSyncHistoricPermissionChange(Context context, HistoricRecordPermissionsChangeRequest historicRecordPermissionsChangeRequest, Integer num, Continuation<? super Unit> continuation) {
        HistoricRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1 historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1;
        int i;
        Object obj;
        Context context2;
        Integer num2;
        HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository;
        String r3 = "syncHistoricPermissionChange request: ";
        if (continuation instanceof HistoricRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1) {
            historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1 = (HistoricRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1) continuation;
            int i2 = historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1.label = i2 - IntCompanionObject.MIN_VALUE;
                HistoricRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1 historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12 = historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1;
                Object obj2 = historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    try {
                        obj = null;
                        context2 = context;
                        LogSendUtil.Companion.setLog$default(LogSendUtil.INSTANCE, context2, "syncHistoricPermissionChange request: " + historicRecordPermissionsChangeRequest, null, false, 12, null);
                        HistoricRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$response$1 historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$response$1 = new HistoricRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$response$1(context2, historicRecordPermissionsChangeRequest, null);
                        historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$0 = this;
                        historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$1 = context2;
                        num2 = num;
                        historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$2 = num2;
                        historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.label = 1;
                        obj2 = CoroutineScopeKt.coroutineScope(historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$response$1, historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        historicRecordPermissionsChangeRepository = this;
                    } catch (Exception e) {
                        e = e;
                        r3 = context;
                        LogSendUtil.Companion.setLog$default(LogSendUtil.INSTANCE, r3, "syncHistoricPermissionChange catch: " + e + "}", null, false, 12, null);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        num2 = (Integer) historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$2;
                        context2 = (Context) historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$1;
                        historicRecordPermissionsChangeRepository = (HistoricRecordPermissionsChangeRepository) historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$0;
                        ResultKt.throwOnFailure(obj2);
                        obj = null;
                        Context context3 = context2;
                        try {
                            Response response = (Response) obj2;
                            if (response != null) {
                                LogSendUtil.Companion.setLog$default(LogSendUtil.INSTANCE, context3, "syncHistoricPermissionChange response: " + response + "}", null, false, 12, null);
                                if (response.isSuccessful() && num2 != null) {
                                    int intValue = num2.intValue();
                                    historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$0 = context3;
                                    historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$1 = obj;
                                    historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$2 = obj;
                                    historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.label = 3;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            r3 = context3;
                            LogSendUtil.Companion.setLog$default(LogSendUtil.INSTANCE, r3, "syncHistoricPermissionChange catch: " + e + "}", null, false, 12, null);
                            return Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }
                    num2 = (Integer) historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$2;
                    context2 = (Context) historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$1;
                    historicRecordPermissionsChangeRepository = (HistoricRecordPermissionsChangeRepository) historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$0;
                    ResultKt.throwOnFailure(obj2);
                    obj = null;
                }
                historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$0 = historicRecordPermissionsChangeRepository;
                historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$1 = context2;
                historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.L$2 = num2;
                historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12.label = 2;
                obj2 = ((Deferred) obj2).await(historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$12);
            }
        }
        historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1 = new HistoricRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1(this, continuation);
        HistoricRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1 historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$122 = historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$1;
        Object obj22 = historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$122.label;
        if (i != 0) {
        }
        historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$122.L$0 = historicRecordPermissionsChangeRepository;
        historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$122.L$1 = context2;
        historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$122.L$2 = num2;
        historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$122.label = 2;
        obj22 = ((Deferred) obj22).await(historicRecordPermissionsChangeRepository$sendSyncHistoricPermissionChange$122);
    }

    public static /* synthetic */ Object syncHistoricPermissionChange$default(HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository, Context context, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            context = GeneralApp.INSTANCE.getInstance().getApplicationContext();
        }
        return historicRecordPermissionsChangeRepository.syncHistoricPermissionChange(context, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00d0 -> B:10:0x00d1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncHistoricPermissionChangeRequest(Context context, List<HistoricRecordPermissionsChangeEntity> list, Continuation<? super Unit> continuation) {
        HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1 historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1;
        HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository;
        int i;
        HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository2;
        Iterator it;
        Collection collection;
        Context context2;
        if (continuation instanceof HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1) {
            historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1 = (HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1) continuation;
            int i2 = historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.label = i2 - IntCompanionObject.MIN_VALUE;
                historicRecordPermissionsChangeRepository = this;
                Object obj = historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList(CollectionsKt.e(list));
                    historicRecordPermissionsChangeRepository2 = historicRecordPermissionsChangeRepository;
                    it = list.iterator();
                    collection = arrayList;
                    context2 = context;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    collection = (Collection) historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.L$4;
                    it = (Iterator) historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.L$3;
                    Collection collection2 = (Collection) historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.L$2;
                    Context context3 = (Context) historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.L$1;
                    historicRecordPermissionsChangeRepository2 = (HistoricRecordPermissionsChangeRepository) historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    context2 = context3;
                    collection.add(Unit.INSTANCE);
                    collection = collection2;
                    if (it.hasNext()) {
                        HistoricRecordPermissionsChangeEntity historicRecordPermissionsChangeEntity = (HistoricRecordPermissionsChangeEntity) it.next();
                        String nameSync = EnumPermissionsApp.INSTANCE.getEnumByName(historicRecordPermissionsChangeEntity.getPermission()).nameSync();
                        String str = historicRecordPermissionsChangeEntity.getActive() ? "Activar" : "Desactivar";
                        String sessionID = historicRecordPermissionsChangeEntity.getSessionID();
                        DateUtil.Companion companion = DateUtil.INSTANCE;
                        String substring = historicRecordPermissionsChangeEntity.getDate().substring(0, 10);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        String dateFromString = companion.getDateFromString(substring);
                        String substring2 = historicRecordPermissionsChangeEntity.getDate().substring(11, 16);
                        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                        HistoricRecordPermissionsChangeRequest historicRecordPermissionsChangeRequest = new HistoricRecordPermissionsChangeRequest(nameSync, str, sessionID, dateFromString, substring2);
                        Integer id = historicRecordPermissionsChangeEntity.getId();
                        historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.L$0 = historicRecordPermissionsChangeRepository2;
                        historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.L$1 = context2;
                        historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.L$2 = collection;
                        historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.L$3 = it;
                        historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.L$4 = collection;
                        historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.label = 1;
                        if (historicRecordPermissionsChangeRepository2.sendSyncHistoricPermissionChange(context2, historicRecordPermissionsChangeRequest, id, historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        collection2 = collection;
                        collection.add(Unit.INSTANCE);
                        collection = collection2;
                        if (it.hasNext()) {
                            return Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        historicRecordPermissionsChangeRepository = this;
        historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1 = new HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1(historicRecordPermissionsChangeRepository, continuation);
        Object obj2 = historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = historicRecordPermissionsChangeRepository$syncHistoricPermissionChangeRequest$1.label;
        if (i != 0) {
        }
    }

    public final Object saveHistoricPermissionsChange(String str, String str2, boolean z, EnumPermissionsApp enumPermissionsApp, Continuation<? super Unit> continuation) {
        Object saveHistoric = this.dao.saveHistoric(new HistoricRecordPermissionsChangeEntity(null, str, str2, z, enumPermissionsApp.name()), continuation);
        return saveHistoric == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? saveHistoric : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r2.syncHistoricPermissionChangeRequest(r6, (java.util.List) r7, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object syncHistoricPermissionChange(Context context, Continuation<? super Unit> continuation) {
        HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChange$1 historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1;
        int i;
        HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository;
        if (continuation instanceof HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChange$1) {
            historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1 = (HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChange$1) continuation;
            int i2 = historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.L$0 = this;
                    historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.L$1 = context;
                    historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.label = 1;
                    obj = getAllHistoricPermissionsChange(historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1);
                    if (obj != coroutine_suspended) {
                        historicRecordPermissionsChangeRepository = this;
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
                context = (Context) historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.L$1;
                historicRecordPermissionsChangeRepository = (HistoricRecordPermissionsChangeRepository) historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.L$0;
                ResultKt.throwOnFailure(obj);
                historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.L$0 = null;
                historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.L$1 = null;
                historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.label = 2;
            }
        }
        historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1 = new HistoricRecordPermissionsChangeRepository$syncHistoricPermissionChange$1(this, continuation);
        Object obj2 = historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.label;
        if (i != 0) {
        }
        historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.L$0 = null;
        historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.L$1 = null;
        historicRecordPermissionsChangeRepository$syncHistoricPermissionChange$1.label = 2;
    }
}
