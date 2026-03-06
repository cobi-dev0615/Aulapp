package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavController;
import com.gse.aulapp.R;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.util.DialogUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$showDialogTimePassed$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {587}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$showDialogTimePassed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ Context $context;
    final /* synthetic */ NavController $findNavController;
    final /* synthetic */ boolean $isEnter;
    final /* synthetic */ EnumClassType $sessionType;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$showDialogTimePassed$1$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$showDialogTimePassed$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Context $context;
        final /* synthetic */ NavController $findNavController;
        final /* synthetic */ boolean $isEnter;
        final /* synthetic */ EnumClassType $sessionType;
        int label;
        final /* synthetic */ ClassPracticeBeforeViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Activity activity, Context context, boolean z, EnumClassType enumClassType, NavController navController, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = classPracticeBeforeViewModel;
            this.$activity = activity;
            this.$context = context;
            this.$isEnter = z;
            this.$sessionType = enumClassType;
            this.$findNavController = navController;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Context context, NavController navController, View view) {
            AlertDialog alertDialog;
            alertDialog = classPracticeBeforeViewModel.dialog;
            if (alertDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                alertDialog = null;
            }
            alertDialog.dismiss();
            if (context != null) {
                classPracticeBeforeViewModel.navigateTo(context, navController, new ActionOnlyNavDirections(R.id.action_classPracticeBeforeFragment_to_homeFragment));
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$activity, this.$context, this.$isEnter, this.$sessionType, this.$findNavController, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AlertDialog alertDialog;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.this$0;
            DialogUtil.Companion companion = DialogUtil.INSTANCE;
            Activity activity = this.$activity;
            EnumDialogType enumDialogType = EnumDialogType.DIALOG_TIME_PASSED;
            String string = this.$context.getString(R.string.dialog_fullscreen_time_passed);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            classPracticeBeforeViewModel.dialog = DialogUtil.Companion.showErrorDialog$default(companion, activity, enumDialogType, string.replace("[entryOrExitClass]", this.$isEnter ? "el ingreso" : "la salida").replace("[examOrClass]", this.$sessionType == EnumClassType.PRACTICE ? "de la clase" : "del examen"), null, null, false, new a(this.this$0, this.$context, this.$findNavController, 1), 8, null);
            alertDialog = this.this$0.dialog;
            if (alertDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                alertDialog = null;
            }
            alertDialog.show();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$showDialogTimePassed$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Activity activity, Context context, boolean z, EnumClassType enumClassType, NavController navController, Continuation<? super ClassPracticeBeforeViewModel$showDialogTimePassed$1> continuation) {
        super(2, continuation);
        this.this$0 = classPracticeBeforeViewModel;
        this.$activity = activity;
        this.$context = context;
        this.$isEnter = z;
        this.$sessionType = enumClassType;
        this.$findNavController = navController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$showDialogTimePassed$1(this.this$0, this.$activity, this.$context, this.$isEnter, this.$sessionType, this.$findNavController, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$activity, this.$context, this.$isEnter, this.$sessionType, this.$findNavController, null);
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
        return ((ClassPracticeBeforeViewModel$showDialogTimePassed$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
