package com.gse.aulapp.feature.fingerPrint.util;

import androidx.fragment.app.FragmentActivity;
import com.gse.aulapp.model.data.DataFailure;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.karumi.dexter.BuildConfig;
import defpackage.FingerPrintResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.GlobalScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/feature/fingerPrint/util/ModuleFingerPrintUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ModuleFingerPrintUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JN\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u000e¨\u0006\u0012"}, d2 = {"Lcom/gse/aulapp/feature/fingerPrint/util/ModuleFingerPrintUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "moduleFingerPrintValidation", BuildConfig.FLAVOR, "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "userId", BuildConfig.FLAVOR, "hand", "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "urlDocument", "onErrorCallback", "Lkotlin/Function1;", "Lcom/gse/aulapp/model/data/DataFailure;", "onSuccessCallback", "LFingerPrintResponse;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void moduleFingerPrintValidation(FragmentActivity fragmentActivity, String userId, EnumHandsAulapp hand, String urlDocument, Function1<? super DataFailure, Unit> onErrorCallback, Function1<? super FingerPrintResponse, Unit> onSuccessCallback) {
            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(hand, "hand");
            Intrinsics.checkNotNullParameter(urlDocument, "urlDocument");
            Intrinsics.checkNotNullParameter(onErrorCallback, "onErrorCallback");
            Intrinsics.checkNotNullParameter(onSuccessCallback, "onSuccessCallback");
            BuildersKt.launch$default(GlobalScope.INSTANCE, null, null, new ModuleFingerPrintUtil$Companion$moduleFingerPrintValidation$1(fragmentActivity, hand, userId, urlDocument, onErrorCallback, onSuccessCallback, null), 3, null);
        }

        private Companion() {
        }
    }
}
