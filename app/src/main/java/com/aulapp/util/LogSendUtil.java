package com.gse.aulapp.util;

import android.content.Context;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.y7;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/LogSendUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class LogSendUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String tag;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/gse/aulapp/util/LogSendUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "tag", BuildConfig.FLAVOR, "setLog", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "description", "methodException", "isException", BuildConfig.FLAVOR, "templateMessage", "templateException", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void setLog$default(Companion companion, Context context, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            companion.setLog(context, str, str2, z);
        }

        private final String templateException(String description, String methodException) {
            return y7.p("*********** EXCEPTION ***********\nMethod exception: ", methodException, "\n", description, "\n");
        }

        private final String templateMessage(String description) {
            return q.i("*********** LOG ***********\n", description);
        }

        public final void setLog(Context context, String description, String methodException, boolean isException) {
            Intrinsics.checkNotNullParameter(description, "description");
            if (context == null) {
                String unused = LogSendUtil.tag;
            } else if (isException) {
                MessageSendUtil.INSTANCE.sendMessage(context, templateException(description, methodException));
            } else {
                MessageSendUtil.INSTANCE.sendMessage(context, templateMessage(description));
            }
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue("LogSendUtil", "getSimpleName(...)");
        tag = "LogSendUtil";
    }
}
