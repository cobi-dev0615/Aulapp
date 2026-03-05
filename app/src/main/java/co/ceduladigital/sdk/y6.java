package co.ceduladigital.sdk;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.gse.aulapp.view.activity.MainActivity;
import com.gse.aulapp.view.activity.PrincipalActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class y6 implements NavController.OnDestinationChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppCompatActivity b;

    public /* synthetic */ y6(AppCompatActivity appCompatActivity, int i) {
        this.a = i;
        this.b = appCompatActivity;
    }

    @Override // androidx.navigation.NavController.OnDestinationChangedListener
    public final void onDestinationChanged(NavController navController, NavDestination navDestination, Bundle bundle) {
        switch (this.a) {
            case 0:
                MainActivity.onCreate$lambda$1((MainActivity) this.b, navController, navDestination, bundle);
                break;
            default:
                PrincipalActivity.onCreate$lambda$1((PrincipalActivity) this.b, navController, navDestination, bundle);
                break;
        }
    }
}
