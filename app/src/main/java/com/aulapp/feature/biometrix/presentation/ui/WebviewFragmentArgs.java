package com.gse.aulapp.feature.biometrix.presentation.ui;

import android.os.Bundle;
import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0006\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/gse/aulapp/feature/biometrix/presentation/ui/WebviewFragmentArgs;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "urlAction", "toolbarTitle", BuildConfig.FLAVOR, "isRegisterFlow", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrlAction", "getToolbarTitle", "Z", "()Z", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class WebviewFragmentArgs {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean isRegisterFlow;
    private final String toolbarTitle;
    private final String urlAction;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/gse/aulapp/feature/biometrix/presentation/ui/WebviewFragmentArgs$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/os/Bundle;", "bundle", "Lcom/gse/aulapp/feature/biometrix/presentation/ui/WebviewFragmentArgs;", "fromBundle", "(Landroid/os/Bundle;)Lcom/gse/aulapp/feature/biometrix/presentation/ui/WebviewFragmentArgs;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final WebviewFragmentArgs fromBundle(Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(WebviewFragmentArgs.class.getClassLoader());
            if (!bundle.containsKey("urlAction")) {
                throw new IllegalArgumentException("Required argument \"urlAction\" is missing and does not have an android:defaultValue");
            }
            String string = bundle.getString("urlAction");
            if (string == null) {
                throw new IllegalArgumentException("Argument \"urlAction\" is marked as non-null but was passed a null value.");
            }
            boolean z = bundle.containsKey("isRegisterFlow") ? bundle.getBoolean("isRegisterFlow") : true;
            if (bundle.containsKey("toolbarTitle")) {
                return new WebviewFragmentArgs(string, bundle.getString("toolbarTitle"), z);
            }
            throw new IllegalArgumentException("Required argument \"toolbarTitle\" is missing and does not have an android:defaultValue");
        }

        private Companion() {
        }
    }

    public WebviewFragmentArgs(String urlAction, String str, boolean z) {
        Intrinsics.checkNotNullParameter(urlAction, "urlAction");
        this.urlAction = urlAction;
        this.toolbarTitle = str;
        this.isRegisterFlow = z;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebviewFragmentArgs)) {
            return false;
        }
        WebviewFragmentArgs webviewFragmentArgs = (WebviewFragmentArgs) other;
        return Intrinsics.areEqual(this.urlAction, webviewFragmentArgs.urlAction) && Intrinsics.areEqual(this.toolbarTitle, webviewFragmentArgs.toolbarTitle) && this.isRegisterFlow == webviewFragmentArgs.isRegisterFlow;
    }

    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final String getUrlAction() {
        return this.urlAction;
    }

    public int hashCode() {
        int hashCode = this.urlAction.hashCode() * 31;
        String str = this.toolbarTitle;
        return Boolean.hashCode(this.isRegisterFlow) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* renamed from: isRegisterFlow, reason: from getter */
    public final boolean getIsRegisterFlow() {
        return this.isRegisterFlow;
    }

    public String toString() {
        String str = this.urlAction;
        String str2 = this.toolbarTitle;
        boolean z = this.isRegisterFlow;
        StringBuilder r = x5.r("WebviewFragmentArgs(urlAction=", str, ", toolbarTitle=", str2, ", isRegisterFlow=");
        r.append(z);
        r.append(")");
        return r.toString();
    }
}
