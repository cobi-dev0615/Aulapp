package com.gse.aulapp.viewmodel;

import android.content.Context;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentPracticeClassBinding;
import com.gse.aulapp.databinding.LayoutClassProgressTextBinding;
import com.gse.aulapp.databinding.LayoutPracticeClassCardBinding;
import com.gse.aulapp.model.dto.CenterDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.dto.VehicleDto;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.karumi.dexter.BuildConfig;
import java.util.Date;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.PracticeClassViewModel$setDataSessionDetail$1", f = "PracticeClassViewModel.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {165}, m = "invokeSuspend", n = {"sessionDTO", "entryTime", "hourStart", "hourEnd", "duration", "vehicle", "$this$invokeSuspend_u24lambda_u246_u24lambda_u245", "date"}, s = {"L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"})
/* loaded from: classes2.dex */
public final class PracticeClassViewModel$setDataSessionDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentPracticeClassBinding $binding;
    final /* synthetic */ SessionDto $session;
    final /* synthetic */ String $timeSession;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ PracticeClassViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PracticeClassViewModel$setDataSessionDetail$1(SessionDto sessionDto, String str, FragmentPracticeClassBinding fragmentPracticeClassBinding, PracticeClassViewModel practiceClassViewModel, Continuation continuation) {
        super(2, (Continuation<Object>) continuation);
        this.$session = sessionDto;
        this.$timeSession = str;
        this.$binding = fragmentPracticeClassBinding;
        this.this$0 = practiceClassViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return (Continuation<Unit>) (Object) new PracticeClassViewModel$setDataSessionDetail$1(this.$session, this.$timeSession, this.$binding, this.this$0, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SessionDto sessionDto;
        FragmentPracticeClassBinding fragmentPracticeClassBinding;
        PracticeClassViewModel practiceClassViewModel;
        String parseDateToString12H;
        String parseDateToString12H2;
        String parseDateToString12H3;
        Date date;
        Integer num;
        VehicleDto vehicleDto;
        LayoutPracticeClassCardBinding layoutPracticeClassCardBinding;
        String str;
        String parseDateToString;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            sessionDto = this.$session;
            if (sessionDto != null) {
                String str2 = this.$timeSession;
                fragmentPracticeClassBinding = this.$binding;
                practiceClassViewModel = this.this$0;
                DateUtil.Companion companion = DateUtil.INSTANCE;
                parseDateToString12H = companion.parseDateToString12H(str2);
                EnumClassType enumByName = EnumClassType.INSTANCE.getEnumByName(sessionDto.getType());
                parseDateToString12H2 = companion.parseDateToString12H(sessionDto.getStart());
                parseDateToString12H3 = companion.parseDateToString12H(sessionDto.getEnd());
                Integer duration = sessionDto.getDuration();
                VehicleDto vehicle = sessionDto.getVehicle();
                String date2 = sessionDto.getDate();
                Date dateFromPattern = date2 != null ? companion.getDateFromPattern(date2, "yyyy-MM-dd") : null;
                LayoutPracticeClassCardBinding layoutPracticeClassCardBinding2 = fragmentPracticeClassBinding.includeLayoutPracticeClassCard;
                MainCoroutineDispatcher main = Dispatchers.getMain();
                PracticeClassViewModel$setDataSessionDetail$1$1$1$1 practiceClassViewModel$setDataSessionDetail$1$1$1$1 = new PracticeClassViewModel$setDataSessionDetail$1$1$1$1(layoutPracticeClassCardBinding2, enumByName, null);
                this.L$0 = fragmentPracticeClassBinding;
                this.L$1 = practiceClassViewModel;
                this.L$2 = sessionDto;
                this.L$3 = parseDateToString12H;
                this.L$4 = parseDateToString12H2;
                this.L$5 = parseDateToString12H3;
                this.L$6 = duration;
                this.L$7 = vehicle;
                this.L$8 = layoutPracticeClassCardBinding2;
                this.L$9 = dateFromPattern;
                this.label = 1;
                if (BuildersKt.withContext(main, practiceClassViewModel$setDataSessionDetail$1$1$1$1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                date = dateFromPattern;
                num = duration;
                vehicleDto = vehicle;
                layoutPracticeClassCardBinding = layoutPracticeClassCardBinding2;
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        date = (Date) this.L$9;
        layoutPracticeClassCardBinding = (LayoutPracticeClassCardBinding) this.L$8;
        vehicleDto = (VehicleDto) this.L$7;
        num = (Integer) this.L$6;
        parseDateToString12H3 = (String) this.L$5;
        parseDateToString12H2 = (String) this.L$4;
        parseDateToString12H = (String) this.L$3;
        sessionDto = (SessionDto) this.L$2;
        practiceClassViewModel = (PracticeClassViewModel) this.L$1;
        fragmentPracticeClassBinding = (FragmentPracticeClassBinding) this.L$0;
        ResultKt.throwOnFailure(obj);
        String apprentice = sessionDto.getApprentice();
        if (apprentice != null) {
            LayoutClassProgressTextBinding includePracticeClassApprentice = layoutPracticeClassCardBinding.includePracticeClassApprentice;
            Intrinsics.checkNotNullExpressionValue(includePracticeClassApprentice, "includePracticeClassApprentice");
            practiceClassViewModel.setPracticeInfo(includePracticeClassApprentice, R.string.txt_card_practice_class_apprentice, apprentice);
        }
        PreferenceUtil.Companion companion2 = PreferenceUtil.INSTANCE;
        Context context = layoutPracticeClassCardBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String userName = companion2.getUserName(context);
        if (userName != null) {
            LayoutClassProgressTextBinding includePracticeClassInstructor = layoutPracticeClassCardBinding.includePracticeClassInstructor;
            Intrinsics.checkNotNullExpressionValue(includePracticeClassInstructor, "includePracticeClassInstructor");
            practiceClassViewModel.setPracticeInfo(includePracticeClassInstructor, R.string.txt_card_practice_class_instructor, userName);
        }
        Context context2 = layoutPracticeClassCardBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        CenterDto cea = companion2.getCEA(context2);
        Intrinsics.checkNotNull(cea);
        String name = cea.getName();
        if (name != null) {
            LayoutClassProgressTextBinding includePracticeClassCea = layoutPracticeClassCardBinding.includePracticeClassCea;
            Intrinsics.checkNotNullExpressionValue(includePracticeClassCea, "includePracticeClassCea");
            practiceClassViewModel.setPracticeInfo(includePracticeClassCea, R.string.txt_card_practice_class_cea, name);
        }
        LayoutClassProgressTextBinding includePracticeClassCategory = layoutPracticeClassCardBinding.includePracticeClassCategory;
        Intrinsics.checkNotNullExpressionValue(includePracticeClassCategory, "includePracticeClassCategory");
        String category = sessionDto.getCategory();
        String str3 = "No Aplica";
        if (category == null) {
            category = "No Aplica";
        }
        practiceClassViewModel.setPracticeInfo(includePracticeClassCategory, R.string.txt_card_practice_class_category, category);
        LayoutClassProgressTextBinding includePracticeClassVehicle = layoutPracticeClassCardBinding.includePracticeClassVehicle;
        Intrinsics.checkNotNullExpressionValue(includePracticeClassVehicle, "includePracticeClassVehicle");
        if (vehicleDto == null || vehicleDto.getLine().length() <= 0 || vehicleDto.getPlates().length() <= 0) {
            str = "No Aplica";
        } else {
            str = vehicleDto.getLine() + " (" + vehicleDto.getPlates() + ")";
        }
        practiceClassViewModel.setPracticeInfo(includePracticeClassVehicle, R.string.txt_card_practice_class_vehicle, str);
        LayoutClassProgressTextBinding includePracticeClassDate = layoutPracticeClassCardBinding.includePracticeClassDate;
        Intrinsics.checkNotNullExpressionValue(includePracticeClassDate, "includePracticeClassDate");
        if (date != null && (parseDateToString = DateUtil.INSTANCE.parseDateToString(date, "dd/MM/yyyy")) != null) {
            str3 = parseDateToString;
        }
        practiceClassViewModel.setPracticeInfo(includePracticeClassDate, R.string.txt_card_practice_class_date, str3);
        LayoutClassProgressTextBinding includePracticeClassTime = layoutPracticeClassCardBinding.includePracticeClassTime;
        Intrinsics.checkNotNullExpressionValue(includePracticeClassTime, "includePracticeClassTime");
        practiceClassViewModel.setPracticeInfo(includePracticeClassTime, R.string.txt_card_practice_class_hour, parseDateToString12H2 + " - " + parseDateToString12H3 + " (" + num + "h) ");
        LayoutClassProgressTextBinding includePracticeClassStartTime = layoutPracticeClassCardBinding.includePracticeClassStartTime;
        Intrinsics.checkNotNullExpressionValue(includePracticeClassStartTime, "includePracticeClassStartTime");
        practiceClassViewModel.setPracticeInfo(includePracticeClassStartTime, R.string.txt_card_practice_class_start_hour, parseDateToString12H);
        LayoutClassProgressTextBinding includePracticeClassTopSpeed = layoutPracticeClassCardBinding.includePracticeClassTopSpeed;
        Intrinsics.checkNotNullExpressionValue(includePracticeClassTopSpeed, "includePracticeClassTopSpeed");
        practiceClassViewModel.setPracticeInfo(includePracticeClassTopSpeed, R.string.txt_card_practice_class_top_velocity, "0,000 km/h");
        LayoutClassProgressTextBinding includePracticeClassAverageSpeed = layoutPracticeClassCardBinding.includePracticeClassAverageSpeed;
        Intrinsics.checkNotNullExpressionValue(includePracticeClassAverageSpeed, "includePracticeClassAverageSpeed");
        practiceClassViewModel.setPracticeInfo(includePracticeClassAverageSpeed, R.string.txt_card_practice_class_max_average, "0,000 km/h");
        LayoutClassProgressTextBinding includePracticeClassMovingTime = layoutPracticeClassCardBinding.includePracticeClassMovingTime;
        Intrinsics.checkNotNullExpressionValue(includePracticeClassMovingTime, "includePracticeClassMovingTime");
        practiceClassViewModel.setPracticeInfo(includePracticeClassMovingTime, R.string.txt_card_practice_class_time_on_move, "00:00:000");
        LayoutClassProgressTextBinding includePracticeClassStoppedTime = layoutPracticeClassCardBinding.includePracticeClassStoppedTime;
        Intrinsics.checkNotNullExpressionValue(includePracticeClassStoppedTime, "includePracticeClassStoppedTime");
        practiceClassViewModel.setPracticeInfo(includePracticeClassStoppedTime, R.string.txt_card_practice_class_time_on_stop, "00:00:000");
        LayoutClassProgressTextBinding includePracticeClassDistanceTraveled = layoutPracticeClassCardBinding.includePracticeClassDistanceTraveled;
        Intrinsics.checkNotNullExpressionValue(includePracticeClassDistanceTraveled, "includePracticeClassDistanceTraveled");
        practiceClassViewModel.setPracticeInfo(includePracticeClassDistanceTraveled, R.string.txt_card_practice_class_distance, "0,000 km/h");
        practiceClassViewModel.updatePracticeInfo(fragmentPracticeClassBinding);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PracticeClassViewModel$setDataSessionDetail$1) (Object) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
