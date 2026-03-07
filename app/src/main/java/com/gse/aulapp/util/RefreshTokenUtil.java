package com.gse.aulapp.util;

import android.content.Context;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.model.repository.RefreshTokenRepository;
import com.gse.aulapp.model.request.RefreshTokenRequest;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/RefreshTokenUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RefreshTokenUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    static RefreshTokenRepository RefreshTokenRepository = new RefreshTokenRepository();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/gse/aulapp/util/RefreshTokenUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "RefreshTokenRepository", "Lcom/gse/aulapp/model/repository/RefreshTokenRepository;", "refreshToken", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRefreshTokenUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RefreshTokenUtil.kt\ncom/gse/aulapp/util/RefreshTokenUtil$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void refreshToken(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                String email = PreferenceUtil.INSTANCE.getEmail(context);
                objectRef.element = email != null ? new RefreshTokenRequest(email) : 0;
                BuildersKt.launch(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new RefreshTokenUtil$Companion$refreshToken$1(objectRef, context, null));
            } catch (Exception e) {
                LogSendUtil.INSTANCE.setLog(context, q.i("refreshToken exception: ", e.getMessage()), "refreshToken", true);
            }
        }

        private Companion() {
        }
    }
}
