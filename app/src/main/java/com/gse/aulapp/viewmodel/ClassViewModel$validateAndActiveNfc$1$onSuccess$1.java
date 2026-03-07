package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.nfc.Tag;
import android.widget.Toast;
import com.gse.aulapp.model.dto.TagDto;
import com.gse.aulapp.util.NfcUtil;
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
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassViewModel$validateAndActiveNfc$1$onSuccess$1", f = "ClassViewModel.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassViewModel$validateAndActiveNfc$1$onSuccess$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Tag $tag;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassViewModel$validateAndActiveNfc$1$onSuccess$1(Tag tag, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.$tag = tag;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation<?> continuation) {
        return new ClassViewModel$validateAndActiveNfc$1$onSuccess$1(this.$tag, this.$activity, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ClassViewModel$validateAndActiveNfc$1$onSuccess$1 classViewModel$validateAndActiveNfc$1$onSuccess$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            NfcUtil.Companion companion = NfcUtil.INSTANCE;
            Tag tag = this.$tag;
            this.label = 1;
            classViewModel$validateAndActiveNfc$1$onSuccess$1 = this;
            obj = NfcUtil.Companion.handlerResponseTag$default(companion, null, tag, classViewModel$validateAndActiveNfc$1$onSuccess$1, 1, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            classViewModel$validateAndActiveNfc$1$onSuccess$1 = this;
        }
        TagDto tagDto = (TagDto) obj;
        if (tagDto != null) {
            Toast.makeText(classViewModel$validateAndActiveNfc$1$onSuccess$1.$activity, "FC: " + tagDto, 0).show();
        } else {
            Toast.makeText(classViewModel$validateAndActiveNfc$1$onSuccess$1.$activity, "error: " + tagDto, 0).show();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ClassViewModel$validateAndActiveNfc$1$onSuccess$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
