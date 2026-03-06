package co.ceduladigital.sdk;

import android.os.Bundle;
import com.google.firebase.crashlytics.AnalyticsDeferredProxy;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements BreadcrumbSource, AnalyticsEventLogger, Deferred.DeferredHandler {
    public final /* synthetic */ AnalyticsDeferredProxy a;

    public /* synthetic */ i(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.a = analyticsDeferredProxy;
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        // Stubbed: AnalyticsDeferredProxy.lambda$init$2
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(String str, Bundle bundle) {
        // Stubbed: AnalyticsDeferredProxy.lambda$getAnalyticsEventLogger$1
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        // Stubbed: AnalyticsDeferredProxy.lambda$getDeferredBreadcrumbSource$0
    }
}
