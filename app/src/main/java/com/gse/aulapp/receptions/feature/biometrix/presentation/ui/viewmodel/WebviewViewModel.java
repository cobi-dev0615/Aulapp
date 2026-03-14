package com.gse.aulapp.receptions.feature.biometrix.presentation.ui.viewmodel;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.gse.aulapp.R;
import com.gse.aulapp.model.data.statusControl.BiometricResult;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/gse/aulapp/receptions/feature/biometrix/presentation/ui/viewmodel/WebviewViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "title", BuildConfig.FLAVOR, "isRegisterFlow", "getToolbarTitle", "(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/String;", "url", BuildConfig.FLAVOR, "handlePageFinished", "(ZLjava/lang/String;)V", "resetState", "TAG", "Ljava/lang/String;", "loadingFinished", "Z", "getLoadingFinished", "()Z", "setLoadingFinished", "(Z)V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/gse/aulapp/model/data/statusControl/BiometricResult;", "_responseBiometric", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "responseBiometric", "Lkotlinx/coroutines/flow/SharedFlow;", "getResponseBiometric", "()Lkotlinx/coroutines/flow/SharedFlow;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebviewViewModel extends ViewModel {
    final MutableSharedFlow<BiometricResult> _responseBiometric;
    private final SharedFlow<BiometricResult> responseBiometric;
    final String TAG = Reflection.getOrCreateKotlinClass(WebviewViewModel.class).getSimpleName();
    private boolean loadingFinished = true;

    public WebviewViewModel() {
        MutableSharedFlow<BiometricResult> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow(0, 0, null);
        this._responseBiometric = MutableSharedFlow$default;
        this.responseBiometric = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final SharedFlow<BiometricResult> getResponseBiometric() {
        return this.responseBiometric;
    }

    public final String getToolbarTitle(Context context, String title, boolean isRegisterFlow) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (title != null && title.length() != 0) {
            return title;
        }
        String string = isRegisterFlow ? context.getString(R.string.title_webview_biometrix_register) : context.getString(R.string.title_webview_biometrix_authentication);
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final void handlePageFinished(boolean isRegisterFlow, String url) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new WebviewViewModel$handlePageFinished$1(url, this, isRegisterFlow, null));
    }

    public final void resetState() {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new WebviewViewModel$resetState$1(this, null));
    }

    public final void setLoadingFinished(boolean z) {
        this.loadingFinished = z;
    }
}
