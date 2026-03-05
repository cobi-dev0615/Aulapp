package com.gse.aulapp.viewmodel;

import android.net.Uri;

import androidx.lifecycle.ViewModel;
import com.gse.aulapp.feature.core.util.SingleLiveEvent;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumStatusFingerPrintBiometric;
import defpackage.FingerPrintResponse;
import defpackage.StatusFingerPrint;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

public final class FingerPrintBiometricViewModel extends ViewModel {
    private final String TAG = Reflection.getOrCreateKotlinClass(FingerPrintBiometricViewModel.class).getSimpleName();
    private final MutableStateFlow<Status> _message;
    private final SingleLiveEvent<StatusFingerPrint> _statusFingerPrint;
    private final StateFlow<Status> message;
    private final SingleLiveEvent<StatusFingerPrint> statusFingerPrint;

    // Photo selection state
    private Uri selectedPhotoUri;

    public FingerPrintBiometricViewModel() {
        MutableStateFlow<Status> MutableStateFlow = StateFlowKt.MutableStateFlow(Status.Empty.INSTANCE);
        this._message = MutableStateFlow;
        this.message = MutableStateFlow;
        SingleLiveEvent<StatusFingerPrint> singleLiveEvent = new SingleLiveEvent<>();
        this._statusFingerPrint = singleLiveEvent;
        this.statusFingerPrint = singleLiveEvent;
    }

    public final StateFlow<Status> getMessage() {
        return this.message;
    }

    public final SingleLiveEvent<StatusFingerPrint> getStatusFingerPrint() {
        return this.statusFingerPrint;
    }

    public final Uri getSelectedPhotoUri() {
        return this.selectedPhotoUri;
    }

    public final void setSelectedPhotoUri(Uri uri) {
        this.selectedPhotoUri = uri;
    }

    public final void handlerOnErrorVerificationFingerPrint(String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (Intrinsics.areEqual(errorMessage, "activty paused")) {
            return;
        }
        this._statusFingerPrint.postValue(new StatusFingerPrint.Error(errorMessage));
    }

    public final void handlerOnSuccessVerificationFingerPrint(FingerPrintResponse fingerPrintResponse) {
        Intrinsics.checkNotNullParameter(fingerPrintResponse, "fingerPrintResponse");
        if (fingerPrintResponse.getStatusFingerPrintBiometric() == EnumStatusFingerPrintBiometric.ON_SUCCESS) {
            this._statusFingerPrint.postValue(new StatusFingerPrint.Success(fingerPrintResponse));
        } else {
            this._statusFingerPrint.postValue(new StatusFingerPrint.Error("No se pudo leer la mano"));
        }
    }

    /**
     * Called when a photo is selected from gallery.
     * Posts success status to bypass the fingerprint verification flow.
     */
    public final void onPhotoSelected(Uri photoUri) {
        this.selectedPhotoUri = photoUri;
        if (photoUri != null) {
            this._statusFingerPrint.postValue(
                    new StatusFingerPrint.Success(null)
            );
        }
    }
}
