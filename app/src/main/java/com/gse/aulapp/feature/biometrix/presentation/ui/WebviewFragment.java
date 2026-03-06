package com.gse.aulapp.feature.biometrix.presentation.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.ViewModelProvider;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import co.ceduladigital.sdk.j3;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentWebviewBinding;
import com.gse.aulapp.feature.biometrix.presentation.ui.WebviewFragmentArgs;
import com.gse.aulapp.model.data.statusControl.BiometrixResult;
import com.gse.aulapp.model.enumerate.EnumBiometrixStatus;
import com.gse.aulapp.model.enumerate.EnumMethodBiometrix;
import com.gse.aulapp.receptions.feature.biometrix.presentation.ui.viewmodel.WebviewViewModel;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.UIHelper;
import com.karumi.dexter.BuildConfig;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 92\u00020\u0001:\u00019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010+\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010,\u001a\u00020\"H\u0016J\u001a\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010/\u001a\u00020\"H\u0016J\u0010\u00100\u001a\u00020\"2\u0006\u00101\u001a\u00020\u000bH\u0002J\b\u00102\u001a\u00020\"H\u0003J\b\u00103\u001a\u00020\"H\u0002J\b\u00104\u001a\u00020\"H\u0002J\b\u00105\u001a\u00020\"H\u0002J\u0010\u00106\u001a\u00020\"2\u0006\u00107\u001a\u000208H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082D¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u00050\u00050\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/gse/aulapp/feature/biometrix/presentation/ui/WebviewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "TAG", BuildConfig.FLAVOR, "_binding", "Lcom/gse/aulapp/databinding/FragmentWebviewBinding;", "toolbarTitle", "urlAction", "<set-?>", BuildConfig.FLAVOR, "isRegisterFlow", "()Z", "setRegisterFlow", "(Z)V", "isRegisterFlow$delegate", "Lkotlin/properties/ReadWriteProperty;", "binding", "getBinding", "()Lcom/gse/aulapp/databinding/FragmentWebviewBinding;", "viewModel", "Lcom/gse/aulapp/receptions/feature/biometrix/presentation/ui/viewmodel/WebviewViewModel;", "myGeolocationCallback", "Landroid/webkit/GeolocationPermissions$Callback;", "myGeolocationOrigin", "cameraPermissionRequest", "Landroid/webkit/PermissionRequest;", "CAMERA_PERMISSION_REQUEST_CODE", BuildConfig.FLAVOR, "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "onCreate", BuildConfig.FLAVOR, "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onActivityCreated", "onResume", "onViewCreated", "view", "onDestroyView", "callGlobalLoading", "show", "initUI", "collects", "listeners", "onBackPressed", "handlerBiometricResult", "data", "Lcom/gse/aulapp/model/data/statusControl/BiometrixResult;", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WebviewFragment extends Fragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(WebviewFragment.class, "isRegisterFlow", "isRegisterFlow()Z", 0))};
    private FragmentWebviewBinding _binding;
    private PermissionRequest cameraPermissionRequest;
    private GeolocationPermissions.Callback myGeolocationCallback;
    private String myGeolocationOrigin;
    private final ActivityResultLauncher<String> requestPermissionLauncher;
    private String toolbarTitle;
    private String urlAction;
    private WebviewViewModel viewModel;
    private final String TAG = Reflection.getOrCreateKotlinClass(WebviewFragment.class).getSimpleName();

    /* renamed from: isRegisterFlow$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty isRegisterFlow = Delegates.INSTANCE.notNull();
    private final int CAMERA_PERMISSION_REQUEST_CODE = 101;

    public WebviewFragment() {
        ActivityResultLauncher<String> registerForActivityResult = registerForActivityResult(new ActivityResultContract<String, Boolean>() { // from class: androidx.activity.result.contract.ActivityResultContracts$RequestPermission
            @Override // androidx.activity.result.contract.ActivityResultContract
            public Intent createIntent(Context context, String input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                return ActivityResultContracts$RequestMultiplePermissions.INSTANCE.createIntent$activity_release(new String[]{input});
            }

            @Override // androidx.activity.result.contract.ActivityResultContract
            public ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, String input) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(input, "input");
                if (ContextCompat.checkSelfPermission(context, input) == 0) {
                    return new ActivityResultContract.SynchronousResult<>(Boolean.TRUE);
                }
                return null;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // androidx.activity.result.contract.ActivityResultContract
            public Boolean parseResult(int resultCode, Intent intent) {
                if (intent == null || resultCode != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (intArrayExtra[i] == 0) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
                return Boolean.valueOf(z);
            }
        }, new j3(this, 19));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.requestPermissionLauncher = registerForActivityResult;
    }

    private final void callGlobalLoading(boolean show) {
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        companion.showDialogProgressGlobal(requireContext, show, false, true);
    }

    private final void collects() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), (CoroutineContext) null, (CoroutineStart) null, new WebviewFragment$collects$1(this, null));
    }

    private final FragmentWebviewBinding getBinding() {
        FragmentWebviewBinding fragmentWebviewBinding = this._binding;
        Intrinsics.checkNotNull(fragmentWebviewBinding);
        return fragmentWebviewBinding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlerBiometricResult(BiometrixResult data) {
        BuildersKt.launch(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new WebviewFragment$handlerBiometricResult$1(data, this, null));
    }

    private final void initUI() {
        UIHelper.Companion companion = UIHelper.INSTANCE;
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        WebviewViewModel webviewViewModel = this.viewModel;
        String str = null;
        if (webviewViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            webviewViewModel = null;
        }
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        UIHelper.Companion.setterCustomToolbar$default(companion, requireActivity, false, false, webviewViewModel.getToolbarTitle(requireContext, this.toolbarTitle, isRegisterFlow()), null, Integer.valueOf(R.drawable.ic_close_card), false, false, 214, null);
        getBinding().webviewBiometric.getSettings().setGeolocationEnabled(true);
        getBinding().webviewBiometric.getSettings().setJavaScriptEnabled(true);
        getBinding().webviewBiometric.getSettings().setDomStorageEnabled(true);
        getBinding().webviewBiometric.getSettings().setAllowContentAccess(true);
        getBinding().webviewBiometric.getSettings().setAllowFileAccess(true);
        getBinding().webviewBiometric.getSettings().setMediaPlaybackRequiresUserGesture(false);
        getBinding().webviewBiometric.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        getBinding().webviewBiometric.getSettings().setLoadsImagesAutomatically(true);
        getBinding().webviewBiometric.getSettings().setUseWideViewPort(true);
        getBinding().webviewBiometric.getSettings().setLoadWithOverviewMode(true);
        getBinding().webviewBiometric.getSettings().setBuiltInZoomControls(true);
        getBinding().webviewBiometric.getSettings().setDisplayZoomControls(false);
        getBinding().webviewBiometric.setHorizontalScrollBarEnabled(false);
        getBinding().webviewBiometric.setVerticalScrollBarEnabled(false);
        getBinding().webviewBiometric.setWebChromeClient(new WebChromeClient() { // from class: com.gse.aulapp.feature.biometrix.presentation.ui.WebviewFragment$initUI$1
            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsHidePrompt() {
                super.onGeolocationPermissionsHidePrompt();
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(String origin, GeolocationPermissions.Callback callback) {
                ActivityResultLauncher activityResultLauncher;
                WebviewFragment.this.myGeolocationOrigin = origin;
                WebviewFragment.this.myGeolocationCallback = callback;
                activityResultLauncher = WebviewFragment.this.requestPermissionLauncher;
                activityResultLauncher.launch("android.permission.ACCESS_FINE_LOCATION");
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest request) {
                int i;
                Intrinsics.checkNotNullParameter(request, "request");
                WebviewFragment.this.cameraPermissionRequest = request;
                String[] resources = request.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                for (String str2 : resources) {
                    if (Intrinsics.areEqual(str2, "android.webkit.resource.VIDEO_CAPTURE")) {
                        FragmentActivity activity = WebviewFragment.this.getActivity();
                        if (activity != null) {
                            WebviewFragment webviewFragment = WebviewFragment.this;
                            if (ContextCompat.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
                                request.grant(request.getResources());
                                webviewFragment.cameraPermissionRequest = null;
                                return;
                            }
                            FragmentActivity activity2 = webviewFragment.getActivity();
                            if (activity2 != null) {
                                i = webviewFragment.CAMERA_PERMISSION_REQUEST_CODE;
                                ActivityCompat.requestPermissions(activity2, new String[]{"android.permission.CAMERA"}, i);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                WebviewFragment.this.cameraPermissionRequest = null;
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequestCanceled(PermissionRequest request) {
                super.onPermissionRequestCanceled(request);
            }
        });
        WebView webView = getBinding().webviewBiometric;
        String str2 = this.urlAction;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("urlAction");
        } else {
            str = str2;
        }
        webView.loadUrl(str);
        if (this.urlAction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("urlAction");
        }
        isRegisterFlow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRegisterFlow() {
        return ((Boolean) this.isRegisterFlow.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    private final void listeners() {
        getBinding().webviewBiometric.setWebViewClient(new WebViewClient() { // from class: com.gse.aulapp.feature.biometrix.presentation.ui.WebviewFragment$listeners$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                WebviewViewModel webviewViewModel;
                WebviewViewModel webviewViewModel2;
                boolean isRegisterFlow;
                String str;
                String str2;
                boolean isRegisterFlow2;
                String unused;
                webviewViewModel = WebviewFragment.this.viewModel;
                WebviewViewModel webviewViewModel3 = null;
                if (webviewViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    webviewViewModel = null;
                }
                webviewViewModel.setLoadingFinished(true);
                unused = WebviewFragment.this.TAG;
                Context context = WebviewFragment.this.getContext();
                if (context != null) {
                    LogSendUtil.Companion companion = LogSendUtil.INSTANCE;
                    str = WebviewFragment.this.TAG;
                    str2 = WebviewFragment.this.urlAction;
                    if (str2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("urlAction");
                        str2 = null;
                    }
                    isRegisterFlow2 = WebviewFragment.this.isRegisterFlow();
                    LogSendUtil.Companion.setLog$default(companion, context, str + " onPageFinished: urlAction: " + str2 + " isRegisterFlow: " + isRegisterFlow2, null, false, 12, null);
                }
                webviewViewModel2 = WebviewFragment.this.viewModel;
                if (webviewViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    webviewViewModel3 = webviewViewModel2;
                }
                isRegisterFlow = WebviewFragment.this.isRegisterFlow();
                webviewViewModel3.handlePageFinished(isRegisterFlow, url);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                WebviewViewModel webviewViewModel;
                String unused;
                webviewViewModel = WebviewFragment.this.viewModel;
                if (webviewViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    webviewViewModel = null;
                }
                webviewViewModel.setLoadingFinished(false);
                unused = WebviewFragment.this.TAG;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                String unused;
                Intrinsics.checkNotNullParameter(request, "request");
                unused = WebviewFragment.this.TAG;
                Objects.toString(request.getUrl());
                if (view == null) {
                    return true;
                }
                view.loadUrl(request.getUrl().toString());
                return true;
            }
        });
        onBackPressed();
    }

    private final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallback = new OnBackPressedCallback() { // from class: com.gse.aulapp.feature.biometrix.presentation.ui.WebviewFragment$onBackPressed$callback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                boolean isRegisterFlow;
                EnumBiometrixStatus enumBiometrixStatus = EnumBiometrixStatus.ONBACKPRESSED;
                isRegisterFlow = WebviewFragment.this.isRegisterFlow();
                WebviewFragment.this.handlerBiometricResult(new BiometrixResult(enumBiometrixStatus, isRegisterFlow ? EnumMethodBiometrix.REGISTER : EnumMethodBiometrix.AUTH, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false));
            }
        };
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        onBackPressedDispatcher.addCallback(viewLifecycleOwner, onBackPressedCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestPermissionLauncher$lambda$0(WebviewFragment this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            GeolocationPermissions.Callback callback = this$0.myGeolocationCallback;
            if (callback != null) {
                callback.invoke(this$0.myGeolocationOrigin, true, false);
                return;
            }
            return;
        }
        GeolocationPermissions.Callback callback2 = this$0.myGeolocationCallback;
        if (callback2 != null) {
            callback2.invoke(this$0.myGeolocationOrigin, false, false);
        }
        Toast.makeText(this$0.requireContext(), "Location permission denied.", 0).show();
    }

    private final void setRegisterFlow(boolean z) {
        this.isRegisterFlow.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.viewModel = (WebviewViewModel) new ViewModelProvider(this).get(WebviewViewModel.class);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = FragmentWebviewBinding.inflate(inflater, container, false);
        return getBinding().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        callGlobalLoading(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (this._binding == null || getArguments() == null) {
            return;
        }
        WebviewFragmentArgs.Companion companion = WebviewFragmentArgs.INSTANCE;
        Bundle requireArguments = requireArguments();
        Intrinsics.checkNotNullExpressionValue(requireArguments, "requireArguments(...)");
        this.toolbarTitle = companion.fromBundle(requireArguments).getToolbarTitle();
        Bundle requireArguments2 = requireArguments();
        Intrinsics.checkNotNullExpressionValue(requireArguments2, "requireArguments(...)");
        this.urlAction = companion.fromBundle(requireArguments2).getUrlAction();
        Bundle requireArguments3 = requireArguments();
        Intrinsics.checkNotNullExpressionValue(requireArguments3, "requireArguments(...)");
        setRegisterFlow(companion.fromBundle(requireArguments3).getIsRegisterFlow());
        if (this.urlAction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("urlAction");
        }
        isRegisterFlow();
        initUI();
        collects();
        listeners();
    }
}
