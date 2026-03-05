package com.gse.aulapp.model.adapter;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.LiveData;
import androidx.view.MutableLiveData;
import co.ceduladigital.sdk.e0;
import co.ceduladigital.sdk.f0;
import co.ceduladigital.sdk.h0;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.ItemClassCardBinding;
import com.gse.aulapp.databinding.ItemClassCardDetailBinding;
import com.gse.aulapp.model.adapter.ClassDetailRecyclerAdapter;
import com.gse.aulapp.model.dto.ClassRoomDto;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.dto.LessonDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumStatusAppointment;
import com.gse.aulapp.service.TimerService;
import com.gse.aulapp.util.ActionUtil;
import com.gse.aulapp.util.ClassUtil;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.ResourceUtil;
import com.gse.aulapp.util.extension.TextViewExtKt;
import com.karumi.dexter.BuildConfig;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00018B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u001a\u001a\u00020\u000b2!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J#\u0010$\u001a\u00020\u000b2\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001eH\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0016\u0010)\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001f\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R3\u00106\u001a\u001f\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/gse/aulapp/model/adapter/ClassDetailRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/gse/aulapp/model/adapter/ClassDetailRecyclerAdapter$ClassDetailViewHolder;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/SessionDto;", "classDetailList", "<init>", "(Ljava/util/List;)V", "classDetail", "Landroid/content/Context;", "it1", BuildConfig.FLAVOR, "handlerLocation", "(Lcom/gse/aulapp/model/dto/SessionDto;Landroid/content/Context;)V", "Lcom/gse/aulapp/model/enumerate/EnumClassType;", "enumClassType", BuildConfig.FLAVOR, "startExam", BuildConfig.FLAVOR, "handlerButtonName", "(Lcom/gse/aulapp/model/enumerate/EnumClassType;Ljava/lang/Boolean;)Ljava/lang/String;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "session", "listener", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", BuildConfig.FLAVOR, "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/gse/aulapp/model/adapter/ClassDetailRecyclerAdapter$ClassDetailViewHolder;", "holder", "position", "onBindViewHolder", "(Lcom/gse/aulapp/model/adapter/ClassDetailRecyclerAdapter$ClassDetailViewHolder;I)V", "getItemCount", "()I", "Ljava/util/List;", "TAG", "Ljava/lang/String;", "context", "Landroid/content/Context;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;", "_configSession", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "configSession", "Landroidx/lifecycle/LiveData;", "getConfigSession", "()Landroidx/lifecycle/LiveData;", "onItemClickListener", "Lkotlin/jvm/functions/Function1;", "ClassDetailViewHolder", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClassDetailRecyclerAdapter extends RecyclerView.Adapter<ClassDetailViewHolder> {
    private final String TAG;
    private final MutableLiveData<ConfigurationSessionDto> _configSession;
    private final List<SessionDto> classDetailList;
    private final LiveData<ConfigurationSessionDto> configSession;
    private Context context;
    private Function1<? super SessionDto, Unit> onItemClickListener;

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ_\u0010\u001b\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b$\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lcom/gse/aulapp/model/adapter/ClassDetailRecyclerAdapter$ClassDetailViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/gse/aulapp/databinding/ItemClassCardBinding;", "binding", "<init>", "(Lcom/gse/aulapp/model/adapter/ClassDetailRecyclerAdapter;Lcom/gse/aulapp/databinding/ItemClassCardBinding;)V", "Lcom/gse/aulapp/model/dto/SessionDto;", "classDetail", BuildConfig.FLAVOR, "handleClassCardDetails", "(Lcom/gse/aulapp/model/dto/SessionDto;)V", "handlerClassCardByType", "handlerClassCardByDate", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "sessionID", "Ljava/util/Date;", "classDate", "classEndDate", BuildConfig.FLAVOR, "marginInMinutes", "marginOutMinutes", "classStarted", "Lkotlin/Function1;", BuildConfig.FLAVOR, "onResult", "classInProgress", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;IILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Class;", "Landroid/app/Service;", "serviceClass", "timerServiceIsRunning", "(Landroid/content/Context;Ljava/lang/Class;)Z", "handleEmptyClassCard", "()V", "bind", "Lcom/gse/aulapp/databinding/ItemClassCardBinding;", "getBinding", "()Lcom/gse/aulapp/databinding/ItemClassCardBinding;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nClassDetailRecyclerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassDetailRecyclerAdapter.kt\ncom/gse/aulapp/model/adapter/ClassDetailRecyclerAdapter$ClassDetailViewHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,470:1\n1755#2,3:471\n*S KotlinDebug\n*F\n+ 1 ClassDetailRecyclerAdapter.kt\ncom/gse/aulapp/model/adapter/ClassDetailRecyclerAdapter$ClassDetailViewHolder\n*L\n418#1:471,3\n*E\n"})
    public final class ClassDetailViewHolder extends RecyclerView.ViewHolder {
        private final ItemClassCardBinding binding;
        final /* synthetic */ ClassDetailRecyclerAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClassDetailViewHolder(ClassDetailRecyclerAdapter classDetailRecyclerAdapter, ItemClassCardBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = classDetailRecyclerAdapter;
            this.binding = binding;
        }

        private final void classInProgress(Context context, String sessionID, Date classDate, Date classEndDate, int marginInMinutes, int marginOutMinutes, String classStarted, Function1<? super Boolean, Unit> onResult) {
            if (context != null) {
                ClassUtil.classStartsSoon$default(new ClassUtil(), classDate, classEndDate, marginInMinutes, marginOutMinutes, context, null, classStarted, new h0(context, this, sessionID, onResult), 32, null);
            } else {
                onResult.invoke(Boolean.FALSE);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit classInProgress$lambda$19(Context context, ClassDetailViewHolder this$0, String sessionID, Function1 onResult, boolean z) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
            Intrinsics.checkNotNullParameter(onResult, "$onResult");
            onResult.invoke(Boolean.valueOf(Intrinsics.areEqual(sessionID, PreferenceUtil.INSTANCE.getSessionIdByTimeService(context)) && this$0.timerServiceIsRunning(context, TimerService.class) && z));
            return Unit.INSTANCE;
        }

        private final void handleClassCardDetails(SessionDto classDetail) {
            handlerClassCardByType(classDetail);
            handlerClassCardByDate(classDetail);
            this.binding.includeClassCardEmpty.getRoot().setVisibility(8);
            this.binding.includeClassCardDetail.getRoot().setVisibility(0);
        }

        private final void handleEmptyClassCard() {
            this.binding.includeClassCardEmpty.getRoot().setVisibility(0);
            this.binding.includeClassCardDetail.getRoot().setVisibility(8);
        }

        private final void handlerClassCardByDate(final SessionDto classDetail) {
            final Date date;
            final Date date2;
            final ItemClassCardDetailBinding itemClassCardDetailBinding = this.binding.includeClassCardDetail;
            final ClassDetailRecyclerAdapter classDetailRecyclerAdapter = this.this$0;
            final EnumClassType enumByName = EnumClassType.INSTANCE.getEnumByName(classDetail.getType());
            String date3 = classDetail.getDate();
            if (date3 != null) {
                String start = classDetail.getStart();
                date = start != null ? DateUtil.INSTANCE.getDateFromString(date3, start) : null;
            } else {
                date = null;
            }
            String date4 = classDetail.getDate();
            if (date4 != null) {
                String end = classDetail.getEnd();
                date2 = end != null ? DateUtil.INSTANCE.getDateFromString(date4, end) : null;
            } else {
                date2 = null;
            }
            Integer minToleranceEntryBefore = classDetail.getMinToleranceEntryBefore();
            final int intValue = minToleranceEntryBefore != null ? minToleranceEntryBefore.intValue() : 20;
            Integer minToleranceEntryAfter = classDetail.getMinToleranceEntryAfter();
            final int intValue2 = minToleranceEntryAfter != null ? minToleranceEntryAfter.intValue() : 20;
            final boolean areEqual = Intrinsics.areEqual(classDetail.getStatusAppointment(), EnumStatusAppointment.name$default(EnumStatusAppointment.UNDER_DEVELOPMENT, null, 1, null));
            if (date == null) {
                itemClassCardDetailBinding.includeStartClass.btnStartClass.setVisibility(8);
                return;
            }
            if (date2 == null) {
                itemClassCardDetailBinding.includeStartClass.btnStartClass.setVisibility(8);
                return;
            }
            ClassUtil classUtil = new ClassUtil();
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ClassUtil.classStartsSoon$default(classUtil, date, date2, intValue, intValue2, context, null, classDetail.getStatusAppointment(), new Function1() { // from class: co.ceduladigital.sdk.d0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit handlerClassCardByDate$lambda$18$lambda$16$lambda$15;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    handlerClassCardByDate$lambda$18$lambda$16$lambda$15 = ClassDetailRecyclerAdapter.ClassDetailViewHolder.handlerClassCardByDate$lambda$18$lambda$16$lambda$15(ItemClassCardDetailBinding.this, this, enumByName, areEqual, classDetailRecyclerAdapter, classDetail, date, date2, intValue, intValue2, booleanValue);
                    return handlerClassCardByDate$lambda$18$lambda$16$lambda$15;
                }
            }, 32, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handlerClassCardByDate$lambda$18$lambda$16$lambda$15(final ItemClassCardDetailBinding this_with, ClassDetailViewHolder this$0, final EnumClassType classType, boolean z, final ClassDetailRecyclerAdapter this$1, final SessionDto classDetail, Date date, Date date2, int i, int i2, boolean z2) {
            Intrinsics.checkNotNullParameter(this_with, "$this_with");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(classType, "$classType");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Intrinsics.checkNotNullParameter(classDetail, "$classDetail");
            if (z2) {
                ConstraintLayout constraintLayout = this_with.clContainerClassCard;
                ResourceUtil.Companion companion = ResourceUtil.INSTANCE;
                Context context = this$0.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                constraintLayout.setBackgroundColor(companion.getColor(context, R.color.cv_container_class_card_today_background_color));
                ConstraintLayout root = this_with.includeClassVehicle.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                EnumClassType enumClassType = EnumClassType.PRACTICE;
                if (classType != enumClassType && classType != EnumClassType.THEORY_EXAM) {
                    root = this_with.includeClassAula.getRoot();
                }
                ConstraintLayout clContainerClassCard = this_with.clContainerClassCard;
                Intrinsics.checkNotNullExpressionValue(clContainerClassCard, "clContainerClassCard");
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(clContainerClassCard);
                constraintSet.connect(this_with.includeStartClass.btnStartClass.getId(), 3, root.getId(), 4, 10);
                constraintSet.connect(this_with.includeStartClass.btnStartClass.getId(), 6, this_with.tvClassTypeTitle.getId(), 6, 0);
                constraintSet.connect(this_with.includeStartClass.btnStartClass.getId(), 7, this_with.tvClassTypeTitle.getId(), 7, 0);
                constraintSet.applyTo(clContainerClassCard);
                this_with.includeStartClass.btnStartClass.setOnClickListener(new e0(this$1, classDetail, 1));
                if (classType == enumClassType || classType == EnumClassType.PRACTICE_EXAM || z) {
                    this_with.includeStartClass.btnStartClass.setVisibility(0);
                    this_with.includeStartClass.btnStartClass.setText(this$1.handlerButtonName(classType, classDetail.getStartExam()));
                } else {
                    this_with.includeStartClass.btnStartClass.setVisibility(8);
                }
            } else if (new ClassUtil().isClassEndBeforeToday$app_release(classDetail)) {
                final int i3 = 0;
                this$0.classInProgress(this$1.context, classDetail.getId(), date, date2, i, i2, classDetail.getStatusAppointment(), new Function1() { // from class: co.ceduladigital.sdk.g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$12;
                        Unit handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$14;
                        int i4 = i3;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        switch (i4) {
                            case 0:
                                handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$12 = ClassDetailRecyclerAdapter.ClassDetailViewHolder.handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$12(this_with, this$1, classType, classDetail, booleanValue);
                                return handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$12;
                            default:
                                handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$14 = ClassDetailRecyclerAdapter.ClassDetailViewHolder.handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$14(this_with, this$1, classType, classDetail, booleanValue);
                                return handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$14;
                        }
                    }
                });
            } else {
                final int i4 = 1;
                this$0.classInProgress(this$1.context, classDetail.getId(), date, date2, i, i2, classDetail.getStatusAppointment(), new Function1() { // from class: co.ceduladigital.sdk.g0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$12;
                        Unit handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$14;
                        int i42 = i4;
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        switch (i42) {
                            case 0:
                                handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$12 = ClassDetailRecyclerAdapter.ClassDetailViewHolder.handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$12(this_with, this$1, classType, classDetail, booleanValue);
                                return handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$12;
                            default:
                                handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$14 = ClassDetailRecyclerAdapter.ClassDetailViewHolder.handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$14(this_with, this$1, classType, classDetail, booleanValue);
                                return handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$14;
                        }
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$10(ClassDetailRecyclerAdapter this$0, SessionDto classDetail, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(classDetail, "$classDetail");
            Function1 function1 = this$0.onItemClickListener;
            if (function1 != null) {
                function1.invoke(classDetail);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$12(ItemClassCardDetailBinding this_with, ClassDetailRecyclerAdapter this$0, EnumClassType classType, SessionDto classDetail, boolean z) {
            Intrinsics.checkNotNullParameter(this_with, "$this_with");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(classType, "$classType");
            Intrinsics.checkNotNullParameter(classDetail, "$classDetail");
            if (z) {
                this_with.includeStartClass.btnStartClass.setOnClickListener(new e0(this$0, classDetail, 3));
                this_with.includeStartClass.btnStartClass.setVisibility(0);
                this_with.includeStartClass.btnStartClass.setText(this$0.handlerButtonName(classType, classDetail.getStartExam()));
            } else {
                this_with.clContainerClassCard.setAlpha(0.5f);
                this_with.includeStartClass.btnStartClass.setVisibility(8);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$12$lambda$11(ClassDetailRecyclerAdapter this$0, SessionDto classDetail, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(classDetail, "$classDetail");
            Function1 function1 = this$0.onItemClickListener;
            if (function1 != null) {
                function1.invoke(classDetail);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$14(ItemClassCardDetailBinding this_with, ClassDetailRecyclerAdapter this$0, EnumClassType classType, SessionDto classDetail, boolean z) {
            Intrinsics.checkNotNullParameter(this_with, "$this_with");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(classType, "$classType");
            Intrinsics.checkNotNullParameter(classDetail, "$classDetail");
            if (z) {
                this_with.includeStartClass.btnStartClass.setOnClickListener(new e0(this$0, classDetail, 2));
                this_with.includeStartClass.btnStartClass.setVisibility(0);
                this_with.includeStartClass.btnStartClass.setText(this$0.handlerButtonName(classType, classDetail.getStartExam()));
            } else {
                this_with.includeStartClass.btnStartClass.setVisibility(8);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$14$lambda$13(ClassDetailRecyclerAdapter this$0, SessionDto classDetail, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(classDetail, "$classDetail");
            Function1 function1 = this$0.onItemClickListener;
            if (function1 != null) {
                function1.invoke(classDetail);
            }
        }

        private final void handlerClassCardByType(SessionDto classDetail) {
            SessionDto sessionDto;
            String nomenclature;
            String type;
            String str;
            String nomenclature2;
            String type2;
            String address;
            ItemClassCardDetailBinding itemClassCardDetailBinding = this.binding.includeClassCardDetail;
            ClassDetailRecyclerAdapter classDetailRecyclerAdapter = this.this$0;
            EnumClassType enumByName = EnumClassType.INSTANCE.getEnumByName(classDetail.getType());
            itemClassCardDetailBinding.ivClassType.setImageResource(enumByName.resource());
            TextView textView = itemClassCardDetailBinding.tvClassTypeTitle;
            Context context = itemClassCardDetailBinding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setText(enumByName.nameShow(context));
            DateUtil.Companion companion = DateUtil.INSTANCE;
            String parseDateToString12H = companion.parseDateToString12H(classDetail.getStart());
            String parseDateToString12H2 = companion.parseDateToString12H(classDetail.getEnd());
            itemClassCardDetailBinding.tvClassTypeState.setText(classDetail.getStatusAppointment());
            itemClassCardDetailBinding.tvClassTypeDescription.setText(parseDateToString12H + " - " + parseDateToString12H2);
            itemClassCardDetailBinding.tvClassTypeDuration.setText(" (" + classDetail.getDuration() + " h)");
            ClassRoomDto classroom = classDetail.getClassroom();
            String str2 = null;
            if (classroom == null || (address = classroom.getAddress()) == null || address.length() != 0) {
                itemClassCardDetailBinding.includeApprenticeAddress.getRoot().setVisibility(0);
                TextView textView2 = itemClassCardDetailBinding.includeApprenticeAddress.tvContent;
                ClassRoomDto classroom2 = classDetail.getClassroom();
                textView2.setText(classroom2 != null ? classroom2.getAddress() : null);
            } else {
                itemClassCardDetailBinding.includeApprenticeAddress.getRoot().setVisibility(8);
            }
            ClassRoomDto classroom3 = classDetail.getClassroom();
            if ((classroom3 != null ? classroom3.getLocation() : null) != null) {
                itemClassCardDetailBinding.includeFabLocation.getRoot().setVisibility(0);
                sessionDto = classDetail;
                this.binding.includeClassCardDetail.includeFabLocation.fabLocation.setOnClickListener(new e0(classDetailRecyclerAdapter, sessionDto, 0));
            } else {
                sessionDto = classDetail;
                itemClassCardDetailBinding.includeFabLocation.getRoot().setVisibility(4);
            }
            String str3 = "No Aplica";
            if (enumByName != EnumClassType.PRACTICE && enumByName != EnumClassType.THEORY_EXAM && enumByName != EnumClassType.PRACTICE_EXAM) {
                TextView textView3 = itemClassCardDetailBinding.tvClassName;
                LessonDto lesson = sessionDto.getLesson();
                String name = lesson != null ? lesson.getName() : null;
                if (name == null || name.length() == 0) {
                    str = "No Aplica";
                } else {
                    LessonDto lesson2 = sessionDto.getLesson();
                    str = lesson2 != null ? lesson2.getName() : null;
                }
                textView3.setText(str);
                ConstraintLayout clContainerClassCard = itemClassCardDetailBinding.clContainerClassCard;
                Intrinsics.checkNotNullExpressionValue(clContainerClassCard, "clContainerClassCard");
                ConstraintSet constraintSet = new ConstraintSet();
                constraintSet.clone(clContainerClassCard);
                constraintSet.connect(itemClassCardDetailBinding.includeApprenticeAddress.getRoot().getId(), 3, itemClassCardDetailBinding.tvClassName.getId(), 4, 0);
                constraintSet.connect(itemClassCardDetailBinding.includeApprenticeAddress.getRoot().getId(), 6, itemClassCardDetailBinding.tvClassTypeTitle.getId(), 6, 0);
                constraintSet.connect(itemClassCardDetailBinding.includeApprenticeAddress.getRoot().getId(), 7, itemClassCardDetailBinding.tvClassTypeTitle.getId(), 7, 0);
                constraintSet.applyTo(clContainerClassCard);
                itemClassCardDetailBinding.includeApprenticeAddress.getRoot().setVisibility(0);
                TextView textView4 = itemClassCardDetailBinding.includeClassAula.tvContent;
                ClassRoomDto classroom4 = sessionDto.getClassroom();
                if (classroom4 != null && (type2 = classroom4.getType()) != null) {
                    str2 = type2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                }
                String lowerCase = "AULA".toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (Intrinsics.areEqual(str2, lowerCase) && (nomenclature2 = sessionDto.getClassroom().getNomenclature()) != null && nomenclature2.length() > 0) {
                    str3 = sessionDto.getClassroom().getNomenclature();
                }
                textView4.setText(str3);
                itemClassCardDetailBinding.tvClassName.setVisibility(0);
                itemClassCardDetailBinding.includeClassAula.getRoot().setVisibility(0);
                itemClassCardDetailBinding.includeApprenticeName.getRoot().setVisibility(8);
                itemClassCardDetailBinding.includeApprenticePhoneNumber.getRoot().setVisibility(8);
                itemClassCardDetailBinding.includeClassCategory.getRoot().setVisibility(8);
                itemClassCardDetailBinding.includeClassTrack.getRoot().setVisibility(8);
                itemClassCardDetailBinding.includeClassVehicle.getRoot().setVisibility(8);
                return;
            }
            itemClassCardDetailBinding.includeApprenticeName.tvContent.setText(sessionDto.getApprentice());
            itemClassCardDetailBinding.includeApprenticePhoneNumber.tvContent.setText(sessionDto.getCellphoneNumber());
            TextView tvContent = itemClassCardDetailBinding.includeApprenticePhoneNumber.tvContent;
            Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
            TextViewExtKt.underline(tvContent);
            itemClassCardDetailBinding.includeApprenticePhoneNumber.getRoot().setOnClickListener(new f0(classDetailRecyclerAdapter, itemClassCardDetailBinding, 0));
            TextView textView5 = itemClassCardDetailBinding.includeClassCategory.tvContent;
            String category = sessionDto.getCategory();
            if (category == null) {
                category = "No Aplica";
            }
            textView5.setText(category);
            TextView textView6 = itemClassCardDetailBinding.includeClassVehicle.tvContent;
            if (sessionDto.getVehicle() != null && sessionDto.getVehicle().getLine().length() > 0 && sessionDto.getVehicle().getPlates().length() > 0) {
                str3 = sessionDto.getVehicle().getLine() + " (" + sessionDto.getVehicle().getPlates() + ")";
            }
            textView6.setText(str3);
            ClassRoomDto classroom5 = sessionDto.getClassroom();
            if (classroom5 != null && (type = classroom5.getType()) != null) {
                str2 = type.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
            }
            String lowerCase2 = "PISTA".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (!Intrinsics.areEqual(str2, lowerCase2) || (nomenclature = sessionDto.getClassroom().getNomenclature()) == null || nomenclature.length() <= 0) {
                itemClassCardDetailBinding.includeClassTrack.tvContent.setVisibility(8);
            } else {
                itemClassCardDetailBinding.includeClassTrack.tvContent.setVisibility(0);
                itemClassCardDetailBinding.includeClassTrack.tvContent.setText(sessionDto.getClassroom().getNomenclature());
            }
            itemClassCardDetailBinding.tvClassName.setVisibility(8);
            itemClassCardDetailBinding.includeClassAula.getRoot().setVisibility(8);
            itemClassCardDetailBinding.includeApprenticeName.getRoot().setVisibility(0);
            itemClassCardDetailBinding.includeApprenticePhoneNumber.getRoot().setVisibility(0);
            itemClassCardDetailBinding.includeClassCategory.getRoot().setVisibility(0);
            itemClassCardDetailBinding.includeClassTrack.getRoot().setVisibility(0);
            itemClassCardDetailBinding.includeClassVehicle.getRoot().setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handlerClassCardByType$lambda$5$lambda$4$lambda$1(ClassDetailRecyclerAdapter this$0, SessionDto classDetail, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(classDetail, "$classDetail");
            Context context = this$0.context;
            if (context != null) {
                this$0.handlerLocation(classDetail, context);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handlerClassCardByType$lambda$5$lambda$4$lambda$3(ClassDetailRecyclerAdapter this$0, ItemClassCardDetailBinding this_with, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this_with, "$this_with");
            Context context = this$0.context;
            if (context != null) {
                ActionUtil.INSTANCE.dialPhoneNumber(context, this_with.includeApprenticePhoneNumber.tvContent.getText().toString());
            }
        }

        private final boolean timerServiceIsRunning(Context context, Class<? extends Service> serviceClass) {
            List<ActivityManager.RunningServiceInfo> runningServices;
            try {
                Object systemService = context.getSystemService("activity");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                runningServices = ((ActivityManager) systemService).getRunningServices(IntCompanionObject.MAX_VALUE);
                Intrinsics.checkNotNullExpressionValue(runningServices, "getRunningServices(...)");
            } catch (Exception unused) {
            }
            if (runningServices != null && runningServices.isEmpty()) {
                return false;
            }
            Iterator<T> it = runningServices.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual(((ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), serviceClass.getName())) {
                    return true;
                }
            }
            return false;
        }

        public final void bind(SessionDto classDetail) {
            Intrinsics.checkNotNullParameter(classDetail, "classDetail");
            String date = classDetail.getDate();
            Intrinsics.checkNotNull(date);
            if (date.length() == 0) {
                handleEmptyClassCard();
            } else {
                handleClassCardDetails(classDetail);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
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

    public ClassDetailRecyclerAdapter(List<SessionDto> classDetailList) {
        Intrinsics.checkNotNullParameter(classDetailList, "classDetailList");
        this.classDetailList = classDetailList;
        this.TAG = Reflection.getOrCreateKotlinClass(ClassDetailRecyclerAdapter.class).getSimpleName();
        MutableLiveData<ConfigurationSessionDto> mutableLiveData = new MutableLiveData<>();
        this._configSession = mutableLiveData;
        this.configSession = mutableLiveData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String handlerButtonName(EnumClassType enumClassType, Boolean startExam) {
        int i = WhenMappings.$EnumSwitchMapping$0[enumClassType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return BuildConfig.FLAVOR;
            }
            Context context = this.context;
            return String.valueOf(context != null ? context.getString(R.string.txt_name_button_init_class) : null);
        }
        if (Intrinsics.areEqual(startExam, Boolean.TRUE)) {
            Context context2 = this.context;
            return String.valueOf(context2 != null ? context2.getString(R.string.txt_name_button_continue_exam) : null);
        }
        Context context3 = this.context;
        return String.valueOf(context3 != null ? context3.getString(R.string.txt_name_button_init_exam) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        r9 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r9, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        r0 = kotlin.text.StringsKt__StringsKt.split$default((java.lang.CharSequence) r0, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handlerLocation(SessionDto classDetail, Context it1) {
        List split$default;
        String str;
        List split$default2;
        String str2;
        ClassRoomDto classroom = classDetail.getClassroom();
        Double d = null;
        Double valueOf = (classroom == null || (r0 = classroom.getLocation()) == null || split$default2 == null || (str2 = (String) split$default2.get(0)) == null) ? null : Double.valueOf(Double.parseDouble(str2));
        ClassRoomDto classroom2 = classDetail.getClassroom();
        if (classroom2 != null && (r9 = classroom2.getLocation()) != null && split$default != null && (str = (String) split$default.get(1)) != null) {
            d = Double.valueOf(Double.parseDouble(str));
        }
        if (valueOf == null || d == null) {
            return;
        }
        ActionUtil.INSTANCE.openLocation(it1, valueOf.doubleValue(), d.doubleValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.classDetailList.size();
    }

    public final void setOnItemClickListener(Function1<? super SessionDto, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemClickListener = listener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ClassDetailViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.classDetailList.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ClassDetailViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemClassCardBinding inflate = ItemClassCardBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.context = parent.getContext();
        return new ClassDetailViewHolder(this, inflate);
    }
}
