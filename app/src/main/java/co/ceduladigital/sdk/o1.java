package co.ceduladigital.sdk;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumTimeClass;
import com.gse.aulapp.util.ClassUtil;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.util.ExternalUtil;
import com.gse.aulapp.util.GpsUtil;
import com.gse.aulapp.util.ValidateHoursUtil;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.gse.aulapp.view.fragment.PracticeClassFragment;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel;
import com.gse.aulapp.viewmodel.HomeViewModel;
import com.gse.aulapp.viewmodel.PrincipalActivityViewModel;
import java.text.SimpleDateFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final /* synthetic */ class o1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o1(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Comparable groupClassDetailsByFilterType$lambda$0;
        Unit locationEnabled$lambda$13;
        Unit sessionConfigList$lambda$28;
        Unit subscribeNfc$lambda$0;
        Unit elapsedTime$lambda$0;
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ClassPracticeBeforeFragment this$0 = (ClassPracticeBeforeFragment) this.b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                FragmentActivity it = (FragmentActivity) this.c;
                Intrinsics.checkNotNullParameter(it, "$it");
                if (booleanValue) {
                    Context context = this$0.getContext();
                    if (context != null) {
                        DialogNormalUtil.Companion.showDialog$app_release$default(DialogNormalUtil.INSTANCE, context, EnumDialogType.DIALOG_FAKE_GPS, new q1(this$0, it, 0), null, 8, null);
                    }
                } else {
                    ClassPracticeBeforeViewModel classPracticeBeforeViewModel = this$0.b;
                    if (classPracticeBeforeViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        classPracticeBeforeViewModel = null;
                    }
                    String str = this$0.f;
                    Intrinsics.checkNotNull(str);
                    classPracticeBeforeViewModel.updateDateEntryClass(str);
                    ExternalUtil.Companion companion = ExternalUtil.INSTANCE;
                    Context context2 = this$0.getContext();
                    Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
                    companion.getDateTime((Activity) context2, EnumTimeClass.GET_DATE_TIME, new p1(this$0, 0));
                }
                return Unit.INSTANCE;
            case 1:
                groupClassDetailsByFilterType$lambda$0 = ClassUtil.groupClassDetailsByFilterType$lambda$0((SimpleDateFormat) this.b, (ClassUtil) this.c, (SessionDto) obj);
                return groupClassDetailsByFilterType$lambda$0;
            case 2:
                locationEnabled$lambda$13 = GpsUtil.Companion.locationEnabled$lambda$13((Function1) this.b, (FusedLocationProviderClient) this.c, (Location) obj);
                return locationEnabled$lambda$13;
            case 3:
                // Stubbed: HandlerContext.scheduleResumeAfterDelay$lambda$2
                throw new UnsupportedOperationException("Decompiled stub");
            case 4:
                sessionConfigList$lambda$28 = HomeViewModel.getSessionConfigList$lambda$28((Ref.ObjectRef) this.b, (HomeViewModel) this.c, obj);
                return sessionConfigList$lambda$28;
            case 5:
                String datetime = (String) obj;
                PracticeClassFragment this$02 = (PracticeClassFragment) this.b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Ref.ObjectRef sessionFull = (Ref.ObjectRef) this.c;
                Intrinsics.checkNotNullParameter(sessionFull, "$sessionFull");
                Intrinsics.checkNotNullParameter(datetime, "datetime");
                ValidateHoursUtil.Companion companion2 = ValidateHoursUtil.INSTANCE;
                Context requireContext = this$02.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                SessionFull sessionFull2 = (SessionFull) sessionFull.element;
                String str2 = this$02.d;
                if (str2 != null) {
                    datetime = str2;
                }
                companion2.validateStartClass(requireContext, sessionFull2, datetime);
                SessionFull sessionFull3 = (SessionFull) sessionFull.element;
                Context context3 = this$02.getContext();
                if (context3 != null) {
                    GpsUtil.INSTANCE.locationEnabled(context3, new l1(this$02, context3, sessionFull3, 2));
                }
                return Unit.INSTANCE;
            case 6:
                subscribeNfc$lambda$0 = PrincipalActivityViewModel.subscribeNfc$lambda$0((PrincipalActivityViewModel) this.b, (Activity) this.c, ((Boolean) obj).booleanValue());
                return subscribeNfc$lambda$0;
            default:
                elapsedTime$lambda$0 = ValidateHoursUtil.Companion.getElapsedTime$lambda$0((Ref.ObjectRef) this.b, (Function1) this.c, (String) obj);
                return elapsedTime$lambda$0;
        }
    }
}
