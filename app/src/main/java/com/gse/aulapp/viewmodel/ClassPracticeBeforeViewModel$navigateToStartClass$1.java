package com.gse.aulapp.viewmodel;

import android.content.Context;
import android.util.Log;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import co.ceduladigital.sdk.l2;
import co.ceduladigital.sdk.n2;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.util.SingleLiveEvent;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$navigateToStartClass$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {941}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$navigateToStartClass$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ NavController $navController;
    final /* synthetic */ String $sessionID;
    final /* synthetic */ String $timeEntry;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$navigateToStartClass$1$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$navigateToStartClass$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ String $sessionID;
        final /* synthetic */ String $timeEntry;
        int label;
        final /* synthetic */ ClassPracticeBeforeViewModel this$0;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$navigateToStartClass$1$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumClassType.values().length];
                try {
                    iArr[EnumClassType.PRACTICE_EXAM.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumClassType.PRACTICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, String str, String str2, Context context, NavController navController, Continuation<?> continuation) {
            super(2, continuation);
            this.this$0 = classPracticeBeforeViewModel;
            this.$sessionID = str;
            this.$timeEntry = str2;
            this.$context = context;
            this.$navController = navController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$sessionID, this.$timeEntry, this.$context, this.$navController, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            SessionDto sessionDto;
            SingleLiveEvent singleLiveEvent;
            NavDirections l2Var;
            SingleLiveEvent singleLiveEvent2;
            String str;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EnumClassType.Companion companion = EnumClassType.INSTANCE;
            sessionDto = this.this$0.sessionReceived;
            NavDirections navDirections = null;
            int i = WhenMappings.$EnumSwitchMapping$0[companion.getEnumByName(sessionDto != null ? sessionDto.getType() : null).ordinal()];
            if (i == 1) {
                String sessionID = this.$sessionID;
                String str2 = this.$timeEntry;
                singleLiveEvent = this.this$0._configSession;
                ConfigurationSessionDto configurationSession = (ConfigurationSessionDto) singleLiveEvent.getValue();
                if (configurationSession == null) {
                    configurationSession = new ConfigurationSessionDto(null, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
                }
                Intrinsics.checkNotNullParameter(sessionID, "sessionID");
                Intrinsics.checkNotNullParameter(configurationSession, "configurationSession");
                l2Var = new l2(sessionID, str2, configurationSession);
            } else {
                if (i != 2) {
                    str = this.this$0.TAG;
                    Boxing.boxInt(Log.e(str, "Navigation could not be done"));
                    if (navDirections != null) {
                        this.this$0.navigateTo(this.$context, this.$navController, navDirections);
                    }
                    return Unit.INSTANCE;
                }
                String sessionID2 = this.$sessionID;
                String str3 = this.$timeEntry;
                singleLiveEvent2 = this.this$0._configSession;
                ConfigurationSessionDto configurationSession2 = (ConfigurationSessionDto) singleLiveEvent2.getValue();
                if (configurationSession2 == null) {
                    configurationSession2 = new ConfigurationSessionDto(null, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
                }
                Intrinsics.checkNotNullParameter(sessionID2, "sessionID");
                Intrinsics.checkNotNullParameter(configurationSession2, "configurationSession");
                l2Var = new n2(sessionID2, str3, configurationSession2);
            }
            navDirections = l2Var;
            if (navDirections != null) {
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$navigateToStartClass$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, String str, String str2, Context context, NavController navController, Continuation continuation) {
        super(2, continuation);
        this.this$0 = classPracticeBeforeViewModel;
        this.$sessionID = str;
        this.$timeEntry = str2;
        this.$context = context;
        this.$navController = navController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$navigateToStartClass$1(this.this$0, this.$sessionID, this.$timeEntry, this.$context, this.$navController, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$sessionID, this.$timeEntry, this.$context, this.$navController, null);
            this.label = 1;
            if (BuildersKt.withContext(main, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
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
        return ((ClassPracticeBeforeViewModel$navigateToStartClass$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
