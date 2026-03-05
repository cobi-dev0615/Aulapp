package com.gse.aulapp.viewmodel;

import android.content.Context;
import android.view.View;
import androidx.navigation.NavController;
import androidx.view.ViewModel;
import com.gse.aulapp.viewmodel.ClassInCourseViewModel$getSessionDataApi$1;
import com.gse.aulapp.viewmodel.ClassPracticeBeforeViewModel$showDialogTimePassed$1;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ NavController c;
    public final /* synthetic */ ViewModel d;

    public /* synthetic */ a(ViewModel viewModel, Context context, NavController navController, int i) {
        this.a = i;
        this.d = viewModel;
        this.b = context;
        this.c = navController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClassInCourseViewModel$getSessionDataApi$1.AnonymousClass1.emit$lambda$0((ClassInCourseViewModel) this.d, this.b, this.c, view);
                break;
            default:
                ClassPracticeBeforeViewModel$showDialogTimePassed$1.AnonymousClass1.invokeSuspend$lambda$1((ClassPracticeBeforeViewModel) this.d, this.b, this.c, view);
                break;
        }
    }
}
