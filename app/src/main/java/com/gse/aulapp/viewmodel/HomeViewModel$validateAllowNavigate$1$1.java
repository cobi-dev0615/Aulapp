package com.gse.aulapp.viewmodel;

import android.app.Activity;
import androidx.navigation.NavController;
import com.gse.aulapp.model.adapter.ClassDateRecyclerAdapter;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.util.ClassUtil;
import com.gse.aulapp.viewmodel.HomeViewModel$validateAllowNavigate$1$1;
import com.karumi.dexter.BuildConfig;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$validateAllowNavigate$1$1", f = "HomeViewModel.kt", i = {}, l = {1019}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class HomeViewModel$validateAllowNavigate$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ ClassDateRecyclerAdapter $classRecyclerAdapter;
    final /* synthetic */ ConfigurationSessionDto $configSession;
    final /* synthetic */ Date $currentDate;
    final /* synthetic */ Date $dateEnd;
    final /* synthetic */ Date $dateStart;
    final /* synthetic */ boolean $isMyTimerService;
    final /* synthetic */ boolean $isTimerServiceRunning;
    final /* synthetic */ NavController $navController;
    final /* synthetic */ SessionDto $session;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.HomeViewModel$validateAllowNavigate$1$1$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.HomeViewModel$validateAllowNavigate$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ ClassDateRecyclerAdapter $classRecyclerAdapter;
        final /* synthetic */ ConfigurationSessionDto $configSession;
        final /* synthetic */ Date $currentDate;
        final /* synthetic */ Date $dateEnd;
        final /* synthetic */ Date $dateStart;
        final /* synthetic */ boolean $isMyTimerService;
        final /* synthetic */ boolean $isTimerServiceRunning;
        final /* synthetic */ NavController $navController;
        final /* synthetic */ SessionDto $session;
        int label;
        final /* synthetic */ HomeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SessionDto sessionDto, ConfigurationSessionDto configurationSessionDto, Date date, Date date2, Activity activity, Date date3, boolean z, boolean z2, HomeViewModel homeViewModel, NavController navController, ClassDateRecyclerAdapter classDateRecyclerAdapter, Continuation<?> continuation) {
            super(2, continuation);
            this.$session = sessionDto;
            this.$configSession = configurationSessionDto;
            this.$dateStart = date;
            this.$dateEnd = date2;
            this.$activity = activity;
            this.$currentDate = date3;
            this.$isTimerServiceRunning = z;
            this.$isMyTimerService = z2;
            this.this$0 = homeViewModel;
            this.$navController = navController;
            this.$classRecyclerAdapter = classDateRecyclerAdapter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(boolean z, boolean z2, HomeViewModel homeViewModel, Activity activity, NavController navController, SessionDto sessionDto, EnumClassType enumClassType, ClassDateRecyclerAdapter classDateRecyclerAdapter, boolean z3) {
            if (z3) {
                if (z && z2) {
                    homeViewModel.navigateTo(activity, navController, sessionDto.getId(), enumClassType);
                } else if (z) {
                    homeViewModel.showDialogClassStarted(activity);
                } else {
                    homeViewModel.navigateTo(activity, navController, sessionDto.getId(), enumClassType);
                }
            } else if (z && z2) {
                homeViewModel.navigateTo(activity, navController, sessionDto.getId(), enumClassType);
            } else {
                classDateRecyclerAdapter.notifyDataSetChanged();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$session, this.$configSession, this.$dateStart, this.$dateEnd, this.$activity, this.$currentDate, this.$isTimerServiceRunning, this.$isMyTimerService, this.this$0, this.$navController, this.$classRecyclerAdapter, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final EnumClassType enumByName = EnumClassType.INSTANCE.getEnumByName(this.$session.getType());
            int minToleranceEntryBefore = this.$configSession.getMinToleranceEntryBefore();
            int minToleranceEntryAfter = this.$configSession.getMinToleranceEntryAfter();
            ClassUtil classUtil = new ClassUtil();
            Date date = this.$dateStart;
            Date date2 = this.$dateEnd;
            Activity activity = this.$activity;
            Date date3 = this.$currentDate;
            String statusAppointment = this.$session.getStatusAppointment();
            final boolean z = this.$isTimerServiceRunning;
            final boolean z2 = this.$isMyTimerService;
            final HomeViewModel homeViewModel = this.this$0;
            final Activity activity2 = this.$activity;
            final NavController navController = this.$navController;
            final SessionDto sessionDto = this.$session;
            final ClassDateRecyclerAdapter classDateRecyclerAdapter = this.$classRecyclerAdapter;
            classUtil.classStartsSoon(date, date2, minToleranceEntryBefore, minToleranceEntryAfter, activity, date3, statusAppointment, new Function1() { // from class: com.gse.aulapp.viewmodel.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit invokeSuspend$lambda$0;
                    boolean booleanValue = ((Boolean) obj2).booleanValue();
                    invokeSuspend$lambda$0 = HomeViewModel$validateAllowNavigate$1$1.AnonymousClass1.invokeSuspend$lambda$0(z, z2, homeViewModel, activity2, navController, sessionDto, enumByName, classDateRecyclerAdapter, booleanValue);
                    return invokeSuspend$lambda$0;
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$validateAllowNavigate$1$1(SessionDto sessionDto, ConfigurationSessionDto configurationSessionDto, Date date, Date date2, Activity activity, Date date3, boolean z, boolean z2, HomeViewModel homeViewModel, NavController navController, ClassDateRecyclerAdapter classDateRecyclerAdapter, Continuation continuation) {
        super(2, continuation);
        this.$session = sessionDto;
        this.$configSession = configurationSessionDto;
        this.$dateStart = date;
        this.$dateEnd = date2;
        this.$activity = activity;
        this.$currentDate = date3;
        this.$isTimerServiceRunning = z;
        this.$isMyTimerService = z2;
        this.this$0 = homeViewModel;
        this.$navController = navController;
        this.$classRecyclerAdapter = classDateRecyclerAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeViewModel$validateAllowNavigate$1$1(this.$session, this.$configSession, this.$dateStart, this.$dateEnd, this.$activity, this.$currentDate, this.$isTimerServiceRunning, this.$isMyTimerService, this.this$0, this.$navController, this.$classRecyclerAdapter, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$session, this.$configSession, this.$dateStart, this.$dateEnd, this.$activity, this.$currentDate, this.$isTimerServiceRunning, this.$isMyTimerService, this.this$0, this.$navController, this.$classRecyclerAdapter, null);
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
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((HomeViewModel$validateAllowNavigate$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
