package co.ceduladigital.sdk;

import android.widget.EditText;
import androidx.activity.ComponentActivity;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Not decompiled");
            case 1:
                throw new UnsupportedOperationException("Not decompiled");
            case 2:
                throw new UnsupportedOperationException("Not decompiled");
            case 3:
                ClassInCourseViewModel.dialogMaxTimeClass$lambda$11$lambda$10((ClassInCourseViewModel) this.b);
                break;
            case 4:
                ((ComponentActivity) this.b).invalidateMenu();
                break;
            case 5:
                throw new UnsupportedOperationException("Not decompiled");
            case 6:
                ViewUtils.requestFocusAndShowKeyboard((EditText) this.b, false);
                break;
            case 7:
                throw new UnsupportedOperationException("Not decompiled");
            case 8:
                throw new UnsupportedOperationException("Not decompiled");
            case 9:
                throw new UnsupportedOperationException("Not decompiled");
            case 10:
                throw new UnsupportedOperationException("Not decompiled");
            case 11:
                throw new UnsupportedOperationException("Not decompiled");
            case 12:
                throw new UnsupportedOperationException("Not decompiled");
            case 13:
                ((MaterialBackOrchestrator) this.b).startListeningForBackCallbacksWithPriorityOverlay();
                break;
            case 14:
                PracticeClassViewModel.dialogMaxTimeClass$lambda$8$lambda$7((PracticeClassViewModel) this.b);
                break;
            case 15:
                throw new UnsupportedOperationException("Not decompiled");
            default:
                throw new UnsupportedOperationException("Not decompiled");
        }
    }
}
