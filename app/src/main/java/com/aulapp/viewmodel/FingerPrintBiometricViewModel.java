package com.gse.aulapp.viewmodel;

import androidx.view.ViewModel;
import com.gse.aulapp.feature.core.util.SingleLiveEvent;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.enumerate.EnumStatusFingerPrintBiometric;
import com.karumi.dexter.BuildConfig;
import defpackage.FingerPrintResponse;
import defpackage.StatusFingerPrint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/gse/aulapp/viewmodel/FingerPrintBiometricViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "LFingerPrintResponse;", "fingerPrintResponse", BuildConfig.FLAVOR, "handlerOnSuccessVerificationFingerPrint", "(LFingerPrintResponse;)V", BuildConfig.FLAVOR, "errorMessage", "handlerOnErrorVerificationFingerPrint", "(Ljava/lang/String;)V", "TAG", "Ljava/lang/String;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/gse/aulapp/model/data/statusControl/Status;", "_message", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "message", "Lkotlinx/coroutines/flow/StateFlow;", "getMessage", "()Lkotlinx/coroutines/flow/StateFlow;", "Lcom/gse/aulapp/feature/core/util/SingleLiveEvent;", "LStatusFingerPrint;", "_statusFingerPrint", "Lcom/gse/aulapp/feature/core/util/SingleLiveEvent;", "statusFingerPrint", "getStatusFingerPrint", "()Lcom/gse/aulapp/feature/core/util/SingleLiveEvent;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FingerPrintBiometricViewModel extends ViewModel {
    private final String TAG = Reflection.getOrCreateKotlinClass(FingerPrintBiometricViewModel.class).getSimpleName();
    private final MutableStateFlow<Status> _message;
    private final SingleLiveEvent<StatusFingerPrint> _statusFingerPrint;
    private final StateFlow<Status> message;
    private final SingleLiveEvent<StatusFingerPrint> statusFingerPrint;

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
}
