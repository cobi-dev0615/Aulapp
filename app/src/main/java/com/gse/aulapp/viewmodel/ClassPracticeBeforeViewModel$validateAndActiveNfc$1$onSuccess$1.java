package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.nfc.Tag;
import com.gse.aulapp.databinding.FragmentClassPracticeBeforeBinding;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.dto.TagDto;
import com.gse.aulapp.model.dto.VehicleDto;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumIdStepperMenu;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.util.NfcUtil;
import com.karumi.dexter.BuildConfig;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {800}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ FragmentClassPracticeBeforeBinding $binding;
    final /* synthetic */ boolean $isEnter;
    final /* synthetic */ Tag $tag;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1(Tag tag, ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Activity activity, FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$tag = tag;
        this.this$0 = classPracticeBeforeViewModel;
        this.$activity = activity;
        this.$binding = fragmentClassPracticeBeforeBinding;
        this.$isEnter = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1(this.$tag, this.this$0, this.$activity, this.$binding, this.$isEnter, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ClassPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1 classPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1;
        SessionDto sessionDto;
        SessionDto sessionDto2;
        VehicleDto vehicle;
        String tagCode;
        VehicleDto vehicle2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            NfcUtil.Companion companion = NfcUtil.INSTANCE;
            Tag tag = this.$tag;
            this.label = 1;
            classPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1 = this;
            obj = NfcUtil.Companion.handlerResponseTag$default(companion, null, tag, classPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            classPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1 = this;
        }
        TagDto tagDto = (TagDto) obj;
        if (tagDto != null) {
            String vehicleId = tagDto.getVehicleId();
            sessionDto = classPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1.this$0.sessionReceived;
            String str = null;
            if (Intrinsics.areEqual(vehicleId, (sessionDto == null || (vehicle2 = sessionDto.getVehicle()) == null) ? null : vehicle2.getVehicleID())) {
                String serialTag = tagDto.getSerialTag();
                sessionDto2 = classPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1.this$0.sessionReceived;
                if (sessionDto2 != null && (vehicle = sessionDto2.getVehicle()) != null && (tagCode = vehicle.getTagCode()) != null) {
                    Locale ROOT = Locale.ROOT;
                    Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                    str = tagCode.toUpperCase(ROOT);
                    Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
                }
                if (Intrinsics.areEqual(serialTag, str) && !Intrinsics.areEqual(tagDto.getSerialTag(), "Sin Tag")) {
                    classPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1.this$0.changeStatus(classPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1.$activity, EnumIdStepperMenu.ID_VALIDATION_VEHICLE, classPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1.$binding, classPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1.$isEnter);
                    NfcUtil.INSTANCE.disabledNfcAdapter(classPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1.$activity);
                    return Unit.INSTANCE;
                }
            }
        }
        DialogNormalUtil.Companion.showDialog$app_release$default(DialogNormalUtil.INSTANCE, classPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1.$activity, EnumDialogType.WARNING_NFC_TAG, null, null, 12, null);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClassPracticeBeforeViewModel$validateAndActiveNfc$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
