package com.gse.aulapp.receptions.feature.biometrix.presentation.ui.viewmodel;

import android.net.Uri;
import co.ceduladigital.sdk.y7;
import com.gse.aulapp.model.data.statusControl.BiometricResult;
import com.gse.aulapp.model.data.statusControl.BiometrixResult;
import com.gse.aulapp.model.enumerate.EnumBiometrixStatus;
import com.gse.aulapp.model.enumerate.EnumMethodBiometrix;
import com.karumi.dexter.BuildConfig;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.receptions.feature.biometrix.presentation.ui.viewmodel.WebviewViewModel$handlePageFinished$1", f = "WebviewViewModel.kt", i = {1}, l = {55, 109, 116}, m = "invokeSuspend", n = {"biometricResult"}, s = {"L$0"})
@SourceDebugExtension({"SMAP\nWebviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewViewModel.kt\ncom/gse/aulapp/receptions/feature/biometrix/presentation/ui/viewmodel/WebviewViewModel$handlePageFinished$1\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,137:1\n29#2:138\n*S KotlinDebug\n*F\n+ 1 WebviewViewModel.kt\ncom/gse/aulapp/receptions/feature/biometrix/presentation/ui/viewmodel/WebviewViewModel$handlePageFinished$1\n*L\n59#1:138\n*E\n"})
/* loaded from: classes.dex */
public final class WebviewViewModel$handlePageFinished$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isRegisterFlow;
    final /* synthetic */ String $url;
    Object L$0;
    int label;
    final /* synthetic */ WebviewViewModel this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumBiometrixStatus.values().length];
            try {
                iArr[EnumBiometrixStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumBiometrixStatus.ONBACKPRESSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumBiometrixStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumBiometrixStatus.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumBiometrixStatus.APPROVED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumBiometrixStatus.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumBiometrixStatus.ABANDONED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumBiometrixStatus.REJECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebviewViewModel$handlePageFinished$1(String str, WebviewViewModel webviewViewModel, boolean z, Continuation<? super WebviewViewModel$handlePageFinished$1> continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$url = str;
        this.this$0 = webviewViewModel;
        this.$isRegisterFlow = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebviewViewModel$handlePageFinished$1(this.$url, this.this$0, this.$isRegisterFlow, (Continuation) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0139, code lost:
    
        if (r12.emit(r0, r11) == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0120, code lost:
    
        if (r0.emit(r3, r11) != r1) goto L70;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        BiometricResult biometricResult;
        BiometricResult biometricResult2;
        MutableSharedFlow mutableSharedFlow3;
        String unused;
        String unused2;
        String unused3;
        String unused4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (Exception e) {
            unused4 = this.this$0.TAG;
            e.toString();
            mutableSharedFlow = this.this$0._responseBiometric;
            BiometricResult.Error error = new BiometricResult.Error(new BiometrixResult(EnumBiometrixStatus.UNKNOWN, this.$isRegisterFlow ? EnumMethodBiometrix.REGISTER : EnumMethodBiometrix.AUTH, BuildConfig.FLAVOR, y7.o("Exception: ", e), true));
            this.L$0 = null;
            this.label = 3;
        }
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            biometricResult2 = (BiometricResult) this.L$0;
            ResultKt.throwOnFailure(obj);
            unused = this.this$0.TAG;
            Objects.toString(biometricResult2);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        String str = this.$url;
        if (str != null && str.length() != 0) {
            Uri parse = Uri.parse(this.$url);
            String queryParameter = parse.getQueryParameter("code");
            String str2 = queryParameter == null ? BuildConfig.FLAVOR : queryParameter;
            String queryParameter2 = parse.getQueryParameter("statusBiometrix");
            if (queryParameter2 == null) {
                queryParameter2 = BuildConfig.FLAVOR;
            }
            String queryParameter3 = parse.getQueryParameter("countException");
            if (queryParameter3 == null) {
                queryParameter3 = BuildConfig.FLAVOR;
            }
            String queryParameter4 = parse.getQueryParameter("message");
            String str3 = queryParameter4 == null ? BuildConfig.FLAVOR : queryParameter4;
            unused2 = this.this$0.TAG;
            boolean areEqual = Intrinsics.areEqual(queryParameter3, "true");
            EnumBiometrixStatus fromValue = EnumBiometrixStatus.INSTANCE.fromValue(queryParameter2);
            switch (WhenMappings.$EnumSwitchMapping$0[fromValue.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    biometricResult = BiometricResult.EmptyObject.INSTANCE;
                    break;
                case 4:
                case 5:
                    biometricResult = new BiometricResult.Complete(new BiometrixResult(fromValue, this.$isRegisterFlow ? EnumMethodBiometrix.REGISTER : EnumMethodBiometrix.AUTH, str2, str3, areEqual));
                    break;
                case 6:
                case 7:
                case 8:
                    biometricResult = new BiometricResult.Error(new BiometrixResult(fromValue, this.$isRegisterFlow ? EnumMethodBiometrix.REGISTER : EnumMethodBiometrix.AUTH, str2, str3, areEqual));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            biometricResult2 = biometricResult;
            if (Intrinsics.areEqual(biometricResult2, BiometricResult.EmptyObject.INSTANCE)) {
                unused3 = this.this$0.TAG;
                return Unit.INSTANCE;
            }
            mutableSharedFlow3 = this.this$0._responseBiometric;
            this.L$0 = biometricResult2;
            this.label = 2;
            if (mutableSharedFlow3.emit(biometricResult2, this) == coroutine_suspended) {
            }
            unused = this.this$0.TAG;
            Objects.toString(biometricResult2);
            return Unit.INSTANCE;
        }
        mutableSharedFlow2 = this.this$0._responseBiometric;
        BiometricResult.Error error2 = new BiometricResult.Error("Url is null or empty");
        this.label = 1;
        return coroutine_suspended;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebviewViewModel$handlePageFinished$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
