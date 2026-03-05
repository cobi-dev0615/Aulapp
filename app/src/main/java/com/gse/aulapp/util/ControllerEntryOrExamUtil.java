package com.gse.aulapp.util;

import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.util.ControllerFinishClassOrExamUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.GlobalScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/ControllerEntryOrExamUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ControllerEntryOrExamUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/gse/aulapp/util/ControllerEntryOrExamUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "TAG", BuildConfig.FLAVOR, "saveEntryExam", BuildConfig.FLAVOR, "dateEntryExam", "sessionID", "repository", "Lcom/gse/aulapp/model/repository/SessionRepository;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void saveEntryExam(String dateEntryExam, String sessionID, SessionRepository repository) {
            Intrinsics.checkNotNullParameter(dateEntryExam, "dateEntryExam");
            Intrinsics.checkNotNullParameter(sessionID, "sessionID");
            Intrinsics.checkNotNullParameter(repository, "repository");
            try {
                BuildersKt.launch$default(GlobalScope.INSTANCE, null, null, new ControllerEntryOrExamUtil$Companion$saveEntryExam$1(repository, dateEntryExam, sessionID, null), 3, null);
            } catch (Exception e) {
                String unused = ControllerEntryOrExamUtil.TAG;
                e.toString();
            }
        }

        private Companion() {
        }
    }

    static {
        String name = ControllerFinishClassOrExamUtil.Companion.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        TAG = name;
    }
}
