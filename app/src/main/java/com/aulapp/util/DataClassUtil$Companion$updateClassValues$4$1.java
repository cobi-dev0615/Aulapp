package com.gse.aulapp.util;

import android.widget.TextView;
import com.gse.aulapp.databinding.FragmentPracticeClassBinding;
import com.gse.aulapp.databinding.LayoutPracticeClassCardBinding;
import com.gse.aulapp.model.dto.RealtimeClassDataDto;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
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
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.util.DataClassUtil$Companion$updateClassValues$4$1", f = "DataClassUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DataClassUtil$Companion$updateClassValues$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentPracticeClassBinding $binding;
    final /* synthetic */ RealtimeClassDataDto $it;
    final /* synthetic */ String $movingTime;
    final /* synthetic */ String $stoppedTime;
    final /* synthetic */ String $totalDistance;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataClassUtil$Companion$updateClassValues$4$1(FragmentPracticeClassBinding fragmentPracticeClassBinding, RealtimeClassDataDto realtimeClassDataDto, String str, String str2, String str3, Continuation<? super DataClassUtil$Companion$updateClassValues$4$1> continuation) {
        super(2, continuation);
        this.$binding = fragmentPracticeClassBinding;
        this.$it = realtimeClassDataDto;
        this.$movingTime = str;
        this.$stoppedTime = str2;
        this.$totalDistance = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataClassUtil$Companion$updateClassValues$4$1(this.$binding, this.$it, this.$movingTime, this.$stoppedTime, this.$totalDistance, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LayoutPracticeClassCardBinding layoutPracticeClassCardBinding = this.$binding.includeLayoutPracticeClassCard;
        RealtimeClassDataDto realtimeClassDataDto = this.$it;
        String str = this.$movingTime;
        String str2 = this.$stoppedTime;
        String str3 = this.$totalDistance;
        TextView textView = layoutPracticeClassCardBinding.includePracticeClassTopSpeed.classProgressDescription;
        String format = String.format("%.2f km/h", Arrays.copyOf(new Object[]{Boxing.boxDouble(realtimeClassDataDto.getMaxSpeed())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textView.setText(format);
        TextView textView2 = layoutPracticeClassCardBinding.includePracticeClassAverageSpeed.classProgressDescription;
        String format2 = String.format("%.2f km/h", Arrays.copyOf(new Object[]{Boxing.boxDouble(realtimeClassDataDto.getAverageSpeed())}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        textView2.setText(format2);
        layoutPracticeClassCardBinding.includePracticeClassMovingTime.classProgressDescription.setText(str);
        layoutPracticeClassCardBinding.includePracticeClassStoppedTime.classProgressDescription.setText(str2);
        layoutPracticeClassCardBinding.includePracticeClassDistanceTraveled.classProgressDescription.setText(str3);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DataClassUtil$Companion$updateClassValues$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
