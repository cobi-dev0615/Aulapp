package com.gse.aulapp.util;

import android.app.Activity;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.repository.ParameterListRepository;
import com.gse.aulapp.util.DialogUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/LoadConfigurationUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LoadConfigurationUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static ParameterListRepository parameterListRepository = new ParameterListRepository();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/gse/aulapp/util/LoadConfigurationUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "parameterListRepository", "Lcom/gse/aulapp/model/repository/ParameterListRepository;", "saveParameterListOnPreference", BuildConfig.FLAVOR, "context", "Landroid/app/Activity;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void saveParameterListOnPreference(Activity context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                BuildersKt.launch(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new LoadConfigurationUtil$Companion$saveParameterListOnPreference$1(context, null));
            } catch (Exception e) {
                LogSendUtil.INSTANCE.setLog(context, q.i("saveParameterListOnPreference Exception: ", e.getMessage()), "saveParameterListOnPreference", true);
                DialogUtil.Companion.showErrorDialog$default(DialogUtil.INSTANCE, context, EnumDialogType.DIALOG_TYPE_GENERAL_ERROR, null, null, e.getMessage(), false, null, 12, null);
            }
        }

        private Companion() {
        }
    }
}
