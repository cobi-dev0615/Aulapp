package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.databinding.FragmentClassPracticeBeforeBinding;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.StepProcessSessionDto;
import com.gse.aulapp.model.dto.StepProfile;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.enumerate.EnumIdStepperMenu;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto;
import com.gse.aulapp.util.PreferenceUtil;
import com.karumi.dexter.BuildConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$itemSelectedMenuStepper$1", f = "ClassPracticeBeforeViewModel.kt", i = {}, l = {327, 331}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel$itemSelectedMenuStepper$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ String $apprenticesDocumentNumber;
    final /* synthetic */ String $apprenticesDocumentType;
    final /* synthetic */ FragmentClassPracticeBeforeBinding $binding;
    final /* synthetic */ Fragment $context;
    final /* synthetic */ String $email;
    final /* synthetic */ boolean $isEnter;
    final /* synthetic */ StepProfile $stepProfile;
    final /* synthetic */ String $userId;
    final /* synthetic */ String $userName;
    int label;
    final /* synthetic */ ClassPracticeBeforeViewModel this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumIdStepperMenu.values().length];
            try {
                iArr[EnumIdStepperMenu.ID_VALIDATION_APPRENTICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumIdStepperMenu.ID_VALIDATION_INSTRUCTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumIdStepperMenu.ID_VALIDATION_VEHICLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassPracticeBeforeViewModel$itemSelectedMenuStepper$1(ClassPracticeBeforeViewModel classPracticeBeforeViewModel, Fragment fragment, StepProfile stepProfile, FragmentClassPracticeBeforeBinding fragmentClassPracticeBeforeBinding, boolean z, String str, String str2, String str3, String str4, String str5, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = classPracticeBeforeViewModel;
        this.$context = fragment;
        this.$stepProfile = stepProfile;
        this.$binding = fragmentClassPracticeBeforeBinding;
        this.$isEnter = z;
        this.$userId = str;
        this.$apprenticesDocumentNumber = str2;
        this.$userName = str3;
        this.$email = str4;
        this.$apprenticesDocumentType = str5;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClassPracticeBeforeViewModel$itemSelectedMenuStepper$1(this.this$0, this.$context, this.$stepProfile, this.$binding, this.$isEnter, this.$userId, this.$apprenticesDocumentNumber, this.$userName, this.$email, this.$apprenticesDocumentType, this.$activity, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x024d, code lost:
    
        if (r2.emit(r5, r25) == r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x024f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        if (r2.emit(r5, r25) == r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d2, code lost:
    
        if ((r2 != null ? r2.getStatus() : null) == null) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [T, com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map buildMapStatusStepper;
        EnumHandsAulapp validateHand;
        EnumHandsAulapp validateHand2;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            buildMapStatusStepper = this.this$0.buildMapStatusStepper();
            PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
            Context requireContext = this.$context.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            Boolean userDemo = companion.getUserDemo(requireContext);
            Intrinsics.checkNotNull(userDemo);
            boolean booleanValue = userDemo.booleanValue();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$stepProfile.getId().ordinal()];
            if (i2 == 1) {
                EnumIdStepperMenu enumIdStepperMenu = EnumIdStepperMenu.ID_VALIDATION_APPRENTICE;
                StepProcessSessionDto stepProcessSessionDto = (StepProcessSessionDto) buildMapStatusStepper.get(EnumIdStepperMenu.name$default(enumIdStepperMenu, null, 1, null));
                if (!Intrinsics.areEqual(stepProcessSessionDto != null ? stepProcessSessionDto.getStatus() : null, "ACTIVE")) {
                    StepProcessSessionDto stepProcessSessionDto2 = (StepProcessSessionDto) buildMapStatusStepper.get(EnumIdStepperMenu.name$default(enumIdStepperMenu, null, 1, null));
                }
                if (booleanValue) {
                    ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this.this$0;
                    FragmentActivity requireActivity = this.$context.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                    classPracticeBeforeViewModel.changeStatus(requireActivity, enumIdStepperMenu, this.$binding, this.$isEnter);
                } else {
                    String str = this.$userId;
                    String str2 = this.$apprenticesDocumentNumber;
                    String str3 = str2 == null ? BuildConfig.FLAVOR : str2;
                    EnumUserProfile enumUserProfile = EnumUserProfile.APPRENTICE;
                    String valueOf = String.valueOf(this.$userName);
                    String str4 = this.$email;
                    String str5 = str4 == null ? BuildConfig.FLAVOR : str4;
                    String str6 = this.$apprenticesDocumentType;
                    validateHand = this.this$0.validateHand(this.$activity, this.$userId);
                    objectRef.element = new UserInfoDto(str, str3, enumUserProfile, valueOf, str5, str6, true, BuildConfig.FLAVOR, null, validateHand, null, 1024, null);
                    this.this$0.initValidationProccess(String.valueOf(this.$email), enumUserProfile.name(this.$activity), this.$activity, (UserInfoDto) objectRef.element);
                }
            } else if (i2 == 2) {
                StepProcessSessionDto stepProcessSessionDto3 = (StepProcessSessionDto) buildMapStatusStepper.get(EnumIdStepperMenu.name$default(EnumIdStepperMenu.ID_VALIDATION_APPRENTICE, null, 1, null));
                if (Intrinsics.areEqual(stepProcessSessionDto3 != null ? stepProcessSessionDto3.getStatus() : null, "FINISH")) {
                    EnumIdStepperMenu enumIdStepperMenu2 = EnumIdStepperMenu.ID_VALIDATION_INSTRUCTOR;
                    StepProcessSessionDto stepProcessSessionDto4 = (StepProcessSessionDto) buildMapStatusStepper.get(EnumIdStepperMenu.name$default(enumIdStepperMenu2, null, 1, null));
                    if ((stepProcessSessionDto4 != null ? stepProcessSessionDto4.getStatus() : null) == null) {
                        if (booleanValue) {
                            ClassPracticeBeforeViewModel classPracticeBeforeViewModel2 = this.this$0;
                            FragmentActivity requireActivity2 = this.$context.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                            classPracticeBeforeViewModel2.changeStatus(requireActivity2, enumIdStepperMenu2, this.$binding, this.$isEnter);
                        } else {
                            Context requireContext2 = this.$context.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            String valueOf2 = String.valueOf(companion.getUserId(requireContext2));
                            Context requireContext3 = this.$context.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                            String docType = companion.getDocType(requireContext3);
                            if (docType != null) {
                                Fragment fragment = this.$context;
                                ClassPracticeBeforeViewModel classPracticeBeforeViewModel3 = this.this$0;
                                Activity activity = this.$activity;
                                Context requireContext4 = fragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                                String valueOf3 = String.valueOf(companion.getEmail(requireContext4));
                                Context requireContext5 = fragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                                String documentNumber = companion.getDocumentNumber(requireContext5);
                                String str7 = documentNumber == null ? BuildConfig.FLAVOR : documentNumber;
                                EnumUserProfile enumUserProfile2 = EnumUserProfile.INSTRUCTOR;
                                Context requireContext6 = fragment.requireContext();
                                Intrinsics.checkNotNullExpressionValue(requireContext6, "requireContext(...)");
                                String valueOf4 = String.valueOf(companion.getUserName(requireContext6));
                                validateHand2 = classPracticeBeforeViewModel3.validateHand(activity, valueOf2);
                                objectRef.element = new UserInfoDto(valueOf2, str7, enumUserProfile2, valueOf4, valueOf3, docType, true, BuildConfig.FLAVOR, null, validateHand2, null, 1024, null);
                                classPracticeBeforeViewModel3.initValidationProccess(valueOf3, enumUserProfile2.name(activity), activity, (UserInfoDto) objectRef.element);
                            }
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                StepProcessSessionDto stepProcessSessionDto5 = (StepProcessSessionDto) buildMapStatusStepper.get(EnumIdStepperMenu.name$default(EnumIdStepperMenu.ID_VALIDATION_INSTRUCTOR, null, 1, null));
                if (Intrinsics.areEqual(stepProcessSessionDto5 != null ? stepProcessSessionDto5.getStatus() : null, "FINISH")) {
                    EnumIdStepperMenu enumIdStepperMenu3 = EnumIdStepperMenu.ID_VALIDATION_VEHICLE;
                    StepProcessSessionDto stepProcessSessionDto6 = (StepProcessSessionDto) buildMapStatusStepper.get(EnumIdStepperMenu.name$default(enumIdStepperMenu3, null, 1, null));
                    if ((stepProcessSessionDto6 != null ? stepProcessSessionDto6.getStatus() : null) == null) {
                        if (booleanValue) {
                            ClassPracticeBeforeViewModel classPracticeBeforeViewModel4 = this.this$0;
                            FragmentActivity requireActivity3 = this.$context.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                            classPracticeBeforeViewModel4.changeStatus(requireActivity3, enumIdStepperMenu3, this.$binding, this.$isEnter);
                        } else {
                            ClassPracticeBeforeViewModel classPracticeBeforeViewModel5 = this.this$0;
                            FragmentActivity requireActivity4 = this.$context.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
                            classPracticeBeforeViewModel5.validateNfcStatus(requireActivity4, this.$binding, this.$isEnter);
                        }
                        ClassPracticeBeforeViewModel classPracticeBeforeViewModel6 = this.this$0;
                        FragmentActivity requireActivity5 = this.$context.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity5, "requireActivity(...)");
                        classPracticeBeforeViewModel6.getEntryTime(requireActivity5);
                        mutableSharedFlow = this.this$0._message;
                        Status.Success success = new Status.Success(Boxing.boxBoolean(true));
                        this.label = 1;
                    }
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        mutableSharedFlow2 = this.this$0._message;
        Status.Success success2 = new Status.Success(Boxing.boxBoolean(true));
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ClassPracticeBeforeViewModel$itemSelectedMenuStepper$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
