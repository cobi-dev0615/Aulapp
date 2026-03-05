package co.ceduladigital.sdk;

import android.app.AlertDialog;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.feature.fingerPrint.util.ModuleFingerPrintUtil;
import com.gse.aulapp.model.data.DataFailure;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.enums.EnumPermissionDevices;
import com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.NetworkUtil;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.util.TemplatesUtil;
import com.gse.aulapp.view.fragment.FingerPrintBiometricFragment;
import com.gse.aulapp.viewmodel.FingerPrintBiometricViewModel;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import defpackage.FingerPrintResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l4 implements PermissionListener, PermissionHelper.Companion.PermissionGrantedListener {
    public final /* synthetic */ FingerPrintBiometricFragment a;

    public l4(FingerPrintBiometricFragment fingerPrintBiometricFragment) {
        this.a = fingerPrintBiometricFragment;
    }

    @Override // com.gse.aulapp.util.PermissionHelper.Companion.PermissionGrantedListener
    public final void onPermissionCancel(EnumPermissionDevices device) {
        Intrinsics.checkNotNullParameter(device, "device");
        this.a.getTag();
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public final void onPermissionDenied(PermissionDeniedResponse permissionDeniedResponse) {
        this.a.getTag();
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public final void onPermissionGranted(PermissionGrantedResponse permissionGrantedResponse) {
        this.a.getTag();
    }

    @Override // com.karumi.dexter.listener.single.PermissionListener
    public final void onPermissionRationaleShouldBeShown(PermissionRequest permissionRequest, PermissionToken permissionToken) {
        this.a.getTag();
    }

    @Override // com.gse.aulapp.util.PermissionHelper.Companion.PermissionGrantedListener
    public final void onPermissionGranted() {
        final FingerPrintBiometricFragment fingerPrintBiometricFragment = this.a;
        fingerPrintBiometricFragment.getTag();
        UserInfoDto userInfoDto = fingerPrintBiometricFragment.c;
        UserInfoDto userInfoDto2 = null;
        if (userInfoDto == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfoDto");
            userInfoDto = null;
        }
        String userID = userInfoDto.getUserID();
        UserInfoDto userInfoDto3 = fingerPrintBiometricFragment.c;
        if (userInfoDto3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("userInfoDto");
            userInfoDto3 = null;
        }
        EnumHandsAulapp hand = userInfoDto3.getHand();
        Intrinsics.checkNotNull(hand);
        if (!NetworkUtil.INSTANCE.isNetworkAvailable(fingerPrintBiometricFragment.getContext())) {
            DialogUtil.Companion companion = DialogUtil.INSTANCE;
            FragmentActivity requireActivity = fingerPrintBiometricFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            AlertDialog showInformationFullDialogBiometricRegistrationResponse = companion.showInformationFullDialogBiometricRegistrationResponse(requireActivity, EnumDialogType.FAIL_CONNECTION_REGISTRATION_BIOMETRIC, false, false, new g4(fingerPrintBiometricFragment, 3));
            fingerPrintBiometricFragment.d = showInformationFullDialogBiometricRegistrationResponse;
            if (showInformationFullDialogBiometricRegistrationResponse != null) {
                showInformationFullDialogBiometricRegistrationResponse.show();
                return;
            }
            return;
        }
        TemplatesUtil.Companion companion2 = TemplatesUtil.INSTANCE;
        Context requireContext = fingerPrintBiometricFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        String folderPathByUserId = companion2.getFolderPathByUserId(requireContext, userID);
        if (folderPathByUserId == null || folderPathByUserId.length() == 0) {
            fingerPrintBiometricFragment.b(EnumDialogType.DIALOG_TYPE_GENERAL_ERROR);
            return;
        }
        fingerPrintBiometricFragment.e();
        FragmentActivity activity = fingerPrintBiometricFragment.getActivity();
        if (activity != null) {
            ModuleFingerPrintUtil.Companion companion3 = ModuleFingerPrintUtil.INSTANCE;
            UserInfoDto userInfoDto4 = fingerPrintBiometricFragment.c;
            if (userInfoDto4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("userInfoDto");
            } else {
                userInfoDto2 = userInfoDto4;
            }
            String userID2 = userInfoDto2.getUserID();
            final int i = 0;
            Function1<? super DataFailure, Unit> function1 = new Function1() { // from class: co.ceduladigital.sdk.h4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i) {
                        case 0:
                            DataFailure it = (DataFailure) obj;
                            FingerPrintBiometricFragment this$0 = fingerPrintBiometricFragment;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.getTag();
                            this$0.d(false);
                            FingerPrintBiometricViewModel fingerPrintBiometricViewModel = this$0.a;
                            if (fingerPrintBiometricViewModel == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                fingerPrintBiometricViewModel = null;
                            }
                            fingerPrintBiometricViewModel.handlerOnErrorVerificationFingerPrint(it.getMessage());
                            break;
                        default:
                            FingerPrintResponse it2 = (FingerPrintResponse) obj;
                            FingerPrintBiometricFragment this$02 = fingerPrintBiometricFragment;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            Intrinsics.checkNotNullParameter(it2, "it");
                            this$02.d(false);
                            FingerPrintBiometricViewModel fingerPrintBiometricViewModel2 = this$02.a;
                            if (fingerPrintBiometricViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                fingerPrintBiometricViewModel2 = null;
                            }
                            fingerPrintBiometricViewModel2.handlerOnSuccessVerificationFingerPrint(it2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            final int i2 = 1;
            companion3.moduleFingerPrintValidation(activity, userID2, hand, folderPathByUserId, function1, new Function1() { // from class: co.ceduladigital.sdk.h4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i2) {
                        case 0:
                            DataFailure it = (DataFailure) obj;
                            FingerPrintBiometricFragment this$0 = fingerPrintBiometricFragment;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            Intrinsics.checkNotNullParameter(it, "it");
                            this$0.getTag();
                            this$0.d(false);
                            FingerPrintBiometricViewModel fingerPrintBiometricViewModel = this$0.a;
                            if (fingerPrintBiometricViewModel == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                fingerPrintBiometricViewModel = null;
                            }
                            fingerPrintBiometricViewModel.handlerOnErrorVerificationFingerPrint(it.getMessage());
                            break;
                        default:
                            FingerPrintResponse it2 = (FingerPrintResponse) obj;
                            FingerPrintBiometricFragment this$02 = fingerPrintBiometricFragment;
                            Intrinsics.checkNotNullParameter(this$02, "this$0");
                            Intrinsics.checkNotNullParameter(it2, "it");
                            this$02.d(false);
                            FingerPrintBiometricViewModel fingerPrintBiometricViewModel2 = this$02.a;
                            if (fingerPrintBiometricViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                fingerPrintBiometricViewModel2 = null;
                            }
                            fingerPrintBiometricViewModel2.handlerOnSuccessVerificationFingerPrint(it2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
