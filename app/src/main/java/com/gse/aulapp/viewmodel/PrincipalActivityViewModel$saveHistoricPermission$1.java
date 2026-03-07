package com.gse.aulapp.viewmodel;

import com.gse.aulapp.model.enumerate.EnumPermissionsApp;
import com.gse.aulapp.model.repository.HistoricRecordPermissionsChangeRepository;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.UtilDate;
import com.karumi.dexter.BuildConfig;
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
@DebugMetadata(c = "com.gse.aulapp.viewmodel.PrincipalActivityViewModel$saveHistoricPermission$1", f = "PrincipalActivityViewModel.kt", i = {}, l = {206}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class PrincipalActivityViewModel$saveHistoricPermission$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ EnumPermissionsApp $permission;
    int label;
    final /* synthetic */ PrincipalActivityViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrincipalActivityViewModel$saveHistoricPermission$1(PrincipalActivityViewModel principalActivityViewModel, boolean z, EnumPermissionsApp enumPermissionsApp, Continuation continuation) {
        super(2, continuation);
        this.this$0 = principalActivityViewModel;
        this.$isEnabled = z;
        this.$permission = enumPermissionsApp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PrincipalActivityViewModel$saveHistoricPermission$1(this.this$0, this.$isEnabled, this.$permission, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PrincipalActivityViewModel$saveHistoricPermission$1 principalActivityViewModel$saveHistoricPermission$1;
        HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository;
        String unused;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception unused2) {
            principalActivityViewModel$saveHistoricPermission$1 = this;
        }
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String currentSessionID = PreferenceUtil.INSTANCE.getCurrentSessionID();
            if (currentSessionID != null && currentSessionID.length() != 0) {
                historicRecordPermissionsChangeRepository = this.this$0.historicRecordPermissionsChangeRepository;
                String nowDate = UtilDate.INSTANCE.getNowDate();
                boolean z = this.$isEnabled;
                EnumPermissionsApp enumPermissionsApp = this.$permission;
                this.label = 1;
                principalActivityViewModel$saveHistoricPermission$1 = this;
                try {
                    if (historicRecordPermissionsChangeRepository.saveHistoricPermissionsChange(currentSessionID, nowDate, z, enumPermissionsApp, principalActivityViewModel$saveHistoricPermission$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception unused3) {
                    unused = principalActivityViewModel$saveHistoricPermission$1.this$0.TAG;
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PrincipalActivityViewModel$saveHistoricPermission$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
