package co.ceduladigital.sdk;

import android.widget.EditText;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.Fragment;
import androidx.room.InvalidationTracker;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentDialog;
import androidx.activity.FullyDrawnReporter;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.firebase.installations.FirebaseInstallations;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;
import java.util.ArrayList;

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
                ((CarouselLayoutManager) this.b).refreshKeylineState();
                break;
            case 3:
                ClassInCourseViewModel.dialogMaxTimeClass$lambda$11$lambda$10((ClassInCourseViewModel) this.b);
                break;
            case 4:
                ((ComponentActivity) this.b).invalidateMenu();
                break;
            case 5:
                ComponentDialog.onBackPressedDispatcher$lambda$1((ComponentDialog) this.b);
                break;
            case 6:
                ViewUtils.requestFocusAndShowKeyboard((EditText) this.b, false);
                break;
            case 7:
                DefaultSpecialEffectsController.startTransitions$lambda$11((ArrayList) this.b);
                break;
            case 8:
                ((FirebaseInstallations) this.b).lambda$getId$1();
                break;
            case 9:
                ((Fragment) this.b).lambda$performCreateView$0();
                break;
            case 10:
                FullyDrawnReporter.reportRunnable$lambda$2((FullyDrawnReporter) this.b);
                break;
            case 11:
                ((InvalidationTracker) this.b).onAutoCloseCallback();
                break;
            case 12:
                ((MaterialTimePicker) this.b).lambda$onViewCreated$0();
                break;
            case 13:
                ((MaterialBackOrchestrator) this.b).startListeningForBackCallbacksWithPriorityOverlay();
                break;
            case 14:
                PracticeClassViewModel.dialogMaxTimeClass$lambda$8$lambda$7((PracticeClassViewModel) this.b);
                break;
            case 15:
                ((TextInputLayout) this.b).lambda$onGlobalLayout$1();
                break;
            default:
                ((WorkInitializer) this.b).lambda$ensureContextsScheduled$1();
                break;
        }
    }
}
