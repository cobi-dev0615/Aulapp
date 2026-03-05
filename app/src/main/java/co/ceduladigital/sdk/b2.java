package co.ceduladigital.sdk;

import android.content.Context;
import com.gse.aulapp.feature.core.util.RandomControllerUtil;
import com.gse.aulapp.model.converter.FingerToHandConverter;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.FourFingersIdenty;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumFinger;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto;
import com.gse.aulapp.util.ValidationFlowManager;
import com.gse.aulapp.view.fragment.ClassPracticeBeforeFragment;
import com.karumi.dexter.BuildConfig;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class b2 implements FlowCollector {
    public final /* synthetic */ ClassPracticeBeforeFragment a;

    public b2(ClassPracticeBeforeFragment classPracticeBeforeFragment) {
        this.a = classPracticeBeforeFragment;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        Status status = (Status) obj;
        if (!Intrinsics.areEqual(status, Status.Empty.INSTANCE)) {
            boolean z = status instanceof Status.Loading;
            ClassPracticeBeforeFragment classPracticeBeforeFragment = this.a;
            if (z) {
                classPracticeBeforeFragment.callGlobalLoading(((Status.Loading) status).getShow());
            } else if (status instanceof Status.Success) {
                Status.Success success = (Status.Success) status;
                if (success.getData() instanceof UserInfoDto) {
                    FourFingersIdenty fourFingersIdentyID = ((UserInfoDto) success.getData()).getFourFingersIdentyID();
                    String userID = ((UserInfoDto) success.getData()).getUserID();
                    boolean z2 = true;
                    if (fourFingersIdentyID != null) {
                        FingerToHandConverter.Companion companion = FingerToHandConverter.INSTANCE;
                        EnumHandsAulapp enumHandsAulapp = EnumHandsAulapp.RIGHT;
                        Map<EnumHandsAulapp, Map<EnumFinger, String>> handsAndFingers = companion.getHandsAndFingers(fourFingersIdentyID, enumHandsAulapp);
                        EnumHandsAulapp enumHandsAulapp2 = EnumHandsAulapp.LEFT;
                        Map<EnumHandsAulapp, Map<EnumFinger, String>> handsAndFingers2 = companion.getHandsAndFingers(fourFingersIdentyID, enumHandsAulapp2);
                        if (handsAndFingers != null && !handsAndFingers.isEmpty()) {
                            Context requireContext = classPracticeBeforeFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                            ClassPracticeBeforeFragment.d(requireContext, userID, handsAndFingers, enumHandsAulapp);
                            z2 = false;
                        }
                        if (handsAndFingers2 != null && !handsAndFingers2.isEmpty()) {
                            Context requireContext2 = classPracticeBeforeFragment.requireContext();
                            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                            ClassPracticeBeforeFragment.d(requireContext2, userID, handsAndFingers2, enumHandsAulapp2);
                            z2 = false;
                        }
                    }
                    classPracticeBeforeFragment.s = z2;
                    classPracticeBeforeFragment.p = new ValidationFlowManager(RandomControllerUtil.INSTANCE.randomInit());
                    UserInfoDto userInfoDto = (UserInfoDto) success.getData();
                    classPracticeBeforeFragment.r = userInfoDto;
                    if (userInfoDto != null) {
                        userInfoDto.setFourFingersIdentyID(null);
                    }
                    classPracticeBeforeFragment.i();
                    classPracticeBeforeFragment.callGlobalLoading(false);
                }
            } else if (status instanceof Status.Failure) {
                classPracticeBeforeFragment.callGlobalLoading(false);
                ClassPracticeBeforeFragment.c(classPracticeBeforeFragment, null, BuildConfig.FLAVOR, null, new t1(6), 13);
            } else {
                if (!(status instanceof Status.Exception)) {
                    throw new NoWhenBranchMatchedException();
                }
                classPracticeBeforeFragment.callGlobalLoading(false);
                Status.Exception exception = (Status.Exception) status;
                Object data = exception.getData();
                boolean z3 = data instanceof ErrorResponse;
                String str2 = BuildConfig.FLAVOR;
                if (z3) {
                    String message = ((ErrorResponse) exception.getData()).getResult().getMessage();
                    if (message == null) {
                        message = "Ha ocurrido un error interno en la aplicación, estamos trabajando para solucionarlo.";
                    }
                    String code = ((ErrorResponse) exception.getData()).getResult().getCode();
                    if (code != null) {
                        str2 = code;
                    }
                    str = str2;
                    str2 = message;
                } else if (data instanceof String) {
                    String str3 = (String) exception.getData();
                    str = BuildConfig.FLAVOR;
                    str2 = str3;
                } else {
                    str = BuildConfig.FLAVOR;
                }
                ClassPracticeBeforeFragment.c(classPracticeBeforeFragment, EnumDialogType.DIALOG_WITH_MESSAGE, str2, str, new t1(7), 8);
            }
        }
        return Unit.INSTANCE;
    }
}
