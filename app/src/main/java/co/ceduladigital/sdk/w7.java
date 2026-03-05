package co.ceduladigital.sdk;

import android.app.Activity;
import android.widget.Button;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import com.gse.aulapp.viewmodel.PrincipalActivityViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class w7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrincipalActivityViewModel b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ DrawerLayout d;
    public final /* synthetic */ Button e;
    public final /* synthetic */ NavController f;

    public /* synthetic */ w7(DrawerLayout drawerLayout, PrincipalActivityViewModel principalActivityViewModel, Button button, NavController navController, Activity activity, int i) {
        this.a = i;
        this.d = drawerLayout;
        this.b = principalActivityViewModel;
        this.e = button;
        this.f = navController;
        this.c = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit drawerMenuData$lambda$2;
        Unit drawerMenuData$lambda$4;
        Unit drawerMenuData$lambda$6;
        Unit drawerMenuData$lambda$6$lambda$5;
        Unit drawerMenuData$lambda$2$lambda$1;
        Unit drawerMenuData$lambda$4$lambda$3;
        switch (this.a) {
            case 0:
                drawerMenuData$lambda$2 = PrincipalActivityViewModel.setDrawerMenuData$lambda$2(this.b, this.c, this.d, this.e, this.f);
                return drawerMenuData$lambda$2;
            case 1:
                drawerMenuData$lambda$4 = PrincipalActivityViewModel.setDrawerMenuData$lambda$4(this.b, this.c, this.d, this.e, this.f);
                return drawerMenuData$lambda$4;
            case 2:
                drawerMenuData$lambda$6 = PrincipalActivityViewModel.setDrawerMenuData$lambda$6(this.b, this.c, this.d, this.e, this.f);
                return drawerMenuData$lambda$6;
            case 3:
                drawerMenuData$lambda$6$lambda$5 = PrincipalActivityViewModel.setDrawerMenuData$lambda$6$lambda$5(this.d, this.b, this.e, this.f, this.c);
                return drawerMenuData$lambda$6$lambda$5;
            case 4:
                drawerMenuData$lambda$2$lambda$1 = PrincipalActivityViewModel.setDrawerMenuData$lambda$2$lambda$1(this.d, this.b, this.e, this.f, this.c);
                return drawerMenuData$lambda$2$lambda$1;
            default:
                drawerMenuData$lambda$4$lambda$3 = PrincipalActivityViewModel.setDrawerMenuData$lambda$4$lambda$3(this.d, this.b, this.e, this.f, this.c);
                return drawerMenuData$lambda$4$lambda$3;
        }
    }

    public /* synthetic */ w7(PrincipalActivityViewModel principalActivityViewModel, Activity activity, DrawerLayout drawerLayout, Button button, NavController navController, int i) {
        this.a = i;
        this.b = principalActivityViewModel;
        this.c = activity;
        this.d = drawerLayout;
        this.e = button;
        this.f = navController;
    }
}
