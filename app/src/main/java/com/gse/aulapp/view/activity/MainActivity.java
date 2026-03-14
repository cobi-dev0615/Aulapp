package com.gse.aulapp.view.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavControllerKt;
import androidx.navigation.ui.NavigationViewKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.work.WorkManager;
import co.ceduladigital.sdk.r2;
import co.ceduladigital.sdk.t1;
import co.ceduladigital.sdk.y6;
import com.google.android.material.navigation.NavigationView;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.ActivityMainBinding;
import com.gse.aulapp.model.repository.HistoricRecordPermissionsChangeRepository;
import com.gse.aulapp.util.BroadcastUtil;
import com.gse.aulapp.util.DeviceSecurityCheckerUtil;
import com.gse.aulapp.util.NavigationUtil;
import com.gse.aulapp.util.NetworkUtil;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.util.UIHelper;
import com.gse.aulapp.util.WorkManagerUtil;
import com.gse.aulapp.view.activity.MainActivity;
import com.gse.aulapp.viewmodel.PrincipalActivityViewModel;
import com.gse.aulapp.viewmodel.factory.PrincipalActivityViewModelFactory;
import com.karumi.dexter.BuildConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0014J\b\u0010\u0018\u001a\u00020\u0011H\u0014J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/gse/aulapp/view/activity/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "binding", "Lcom/gse/aulapp/databinding/ActivityMainBinding;", "viewModel", "Lcom/gse/aulapp/viewmodel/PrincipalActivityViewModel;", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "navController", "Landroidx/navigation/NavController;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "TAG", BuildConfig.FLAVOR, "onCreate", BuildConfig.FLAVOR, "savedInstanceState", "Landroid/os/Bundle;", "startWorkerSync", "onSupportNavigateUp", BuildConfig.FLAVOR, "onResume", "onDestroy", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/gse/aulapp/view/activity/MainActivity\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,191:1\n299#2,8:192\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/gse/aulapp/view/activity/MainActivity\n*L\n108#1:192,8\n*E\n"})
/* loaded from: classes2.dex */
public final class MainActivity extends AppCompatActivity {
    private final String TAG = Reflection.getOrCreateKotlinClass(MainActivity.class).getSimpleName();
    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private DrawerLayout drawerLayout;
    private NavController navController;
    private PrincipalActivityViewModel viewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(MainActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        DrawerLayout drawerLayout = this$0.drawerLayout;
        if (drawerLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
            drawerLayout = null;
        }
        drawerLayout.closeDrawers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(MainActivity this$0, NavController navController, NavDestination destination, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(navController, "<unused var>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int id = destination.getId();
        DrawerLayout drawerLayout = null;
        if (id == R.id.firstLoginFragment) {
            ActivityMainBinding activityMainBinding = this$0.binding;
            if (activityMainBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityMainBinding = null;
            }
            activityMainBinding.appBarMain.mainToolbar.setVisibility(8);
            DrawerLayout drawerLayout2 = this$0.drawerLayout;
            if (drawerLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
            } else {
                drawerLayout = drawerLayout2;
            }
            drawerLayout.setDrawerLockMode(1);
            return;
        }
        if (id == R.id.homeFragment) {
            UIHelper.Companion.setterCustomToolbar$default(UIHelper.INSTANCE, this$0, false, true, null, null, Integer.valueOf(R.drawable.ic_drawer_menu), false, false, 154, null);
            return;
        }
        if (id == R.id.webviewFragment) {
            UIHelper.Companion.setterCustomToolbar$default(UIHelper.INSTANCE, this$0, true, false, null, null, null, false, false, 252, null);
            return;
        }
        ActivityMainBinding activityMainBinding2 = this$0.binding;
        if (activityMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding2 = null;
        }
        activityMainBinding2.appBarMain.mainToolbar.setVisibility(0);
        DrawerLayout drawerLayout3 = this$0.drawerLayout;
        if (drawerLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
        } else {
            drawerLayout = drawerLayout3;
        }
        drawerLayout.setDrawerLockMode(1);
        UIHelper.Companion.setterCustomToolbar$default(UIHelper.INSTANCE, this$0, false, false, null, null, null, false, false, 254, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(MainActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PrincipalActivityViewModel principalActivityViewModel = this$0.viewModel;
        if (principalActivityViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            principalActivityViewModel = null;
        }
        principalActivityViewModel.handlerStatusChangeAirplaneMode(this$0, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(MainActivity this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PrincipalActivityViewModel principalActivityViewModel = this$0.viewModel;
        if (principalActivityViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            principalActivityViewModel = null;
        }
        principalActivityViewModel.handlerStatusChangeGPS(this$0, z);
        return Unit.INSTANCE;
    }

    private final void startWorkerSync() {
        WorkManager workManager = WorkManager.getInstance(this);
        Intrinsics.checkNotNullExpressionValue(workManager, "getInstance(...)");
        WorkManagerUtil workManagerUtil = new WorkManagerUtil(workManager);
        PermissionHelper.INSTANCE.validateNotificationPermissionFlow(this, new t1(18));
        workManagerUtil.runTask();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        super.onCreate(savedInstanceState);
        ActivityMainBinding inflate = ActivityMainBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        PrincipalActivityViewModel principalActivityViewModel = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        setRequestedOrientation(1);
        ActivityMainBinding activityMainBinding = this.binding;
        if (activityMainBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding = null;
        }
        setSupportActionBar(activityMainBinding.appBarMain.mainToolbar);
        this.viewModel = (PrincipalActivityViewModel) new ViewModelProvider(this, new PrincipalActivityViewModelFactory(new HistoricRecordPermissionsChangeRepository(GeneralApp.INSTANCE.getDatabase().HistoricRecordPermissionsChangeDao()))).get(PrincipalActivityViewModel.class);
        this.navController = ActivityKt.findNavController(this, R.id.nav_host_fragment_content_main);
        ActivityMainBinding activityMainBinding2 = this.binding;
        if (activityMainBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding2 = null;
        }
        this.drawerLayout = activityMainBinding2.drawerLayout;
        ActivityMainBinding activityMainBinding3 = this.binding;
        if (activityMainBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityMainBinding3 = null;
        }
        final NavigationView navView = activityMainBinding3.navView;
        Intrinsics.checkNotNullExpressionValue(navView, "navView");
        ((Button) navView.findViewById(R.id.drawer_menu_button)).setOnClickListener(new r2(this, 6));
        DrawerLayout drawerLayout = this.drawerLayout;
        if (drawerLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
            drawerLayout = null;
        }
        drawerLayout.addDrawerListener(new DrawerLayout.DrawerListener() { // from class: com.gse.aulapp.view.activity.MainActivity$onCreate$2
            @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerClosed(View drawerView) {
                String unused;
                Intrinsics.checkNotNullParameter(drawerView, "drawerView");
                unused = MainActivity.this.TAG;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerOpened(View drawerView) {
                String unused;
                Intrinsics.checkNotNullParameter(drawerView, "drawerView");
                unused = MainActivity.this.TAG;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerSlide(View drawerView, float slideOffset) {
                String unused;
                Intrinsics.checkNotNullParameter(drawerView, "drawerView");
                unused = MainActivity.this.TAG;
            }

            @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
            public void onDrawerStateChanged(int newState) {
                PrincipalActivityViewModel principalActivityViewModel2;
                DrawerLayout drawerLayout2;
                NavController navController;
                String unused;
                String unused2;
                String unused3;
                unused = MainActivity.this.TAG;
                if (newState != 2) {
                    unused3 = MainActivity.this.TAG;
                    return;
                }
                unused2 = MainActivity.this.TAG;
                principalActivityViewModel2 = MainActivity.this.viewModel;
                NavController navController2 = null;
                if (principalActivityViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    principalActivityViewModel2 = null;
                }
                MainActivity mainActivity = MainActivity.this;
                NavigationView navigationView = navView;
                drawerLayout2 = mainActivity.drawerLayout;
                if (drawerLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
                    drawerLayout2 = null;
                }
                navController = MainActivity.this.navController;
                if (navController == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navController");
                } else {
                    navController2 = navController;
                }
                principalActivityViewModel2.setDrawerMenuData(mainActivity, navigationView, drawerLayout2, navController2);
            }
        });
        Set of = SetsKt.setOf(Integer.valueOf(R.id.homeFragment));
        DrawerLayout drawerLayout2 = this.drawerLayout;
        if (drawerLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
            drawerLayout2 = null;
        }
        this.appBarConfiguration = new AppBarConfiguration.Builder(of).setOpenableLayout(drawerLayout2).setFallbackOnNavigateUpListener(new MainActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(new Function0<Boolean>() { // from class: com.gse.aulapp.view.activity.MainActivity$onCreate$$inlined$AppBarConfiguration$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).build();
        NavController navController = this.navController;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            navController = null;
        }
        AppBarConfiguration appBarConfiguration = this.appBarConfiguration;
        if (appBarConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarConfiguration");
            appBarConfiguration = null;
        }
        androidx.navigation.ui.ActivityKt.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavController navController2 = this.navController;
        if (navController2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            navController2 = null;
        }
        NavigationViewKt.setupWithNavController(navView, navController2);
        NavController navController3 = this.navController;
        if (navController3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            navController3 = null;
        }
        navController3.addOnDestinationChangedListener(new y6(this, 0));
        PrincipalActivityViewModel principalActivityViewModel2 = this.viewModel;
        if (principalActivityViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            principalActivityViewModel2 = null;
        }
        principalActivityViewModel2.subscribeNetwork(this);
        PrincipalActivityViewModel principalActivityViewModel3 = this.viewModel;
        if (principalActivityViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            principalActivityViewModel = principalActivityViewModel3;
        }
        principalActivityViewModel.subscribeNfc(this);
        BroadcastUtil.Companion companion = BroadcastUtil.INSTANCE;
        final int i = 0;
        final MainActivity mainActivityThis = this;
        companion.startReceiver(this, companion.getFILTER_AIRPLANE(), new Function1() { // from class: co.ceduladigital.sdk.z6

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onCreate$lambda$2;
                int i2 = i;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i2) {
                    case 0:
                        onCreate$lambda$2 = MainActivity.onCreate$lambda$2(mainActivityThis, booleanValue);
                        return onCreate$lambda$2;
                    default:
                        Unit onCreate$lambda$3 = MainActivity.onCreate$lambda$3(mainActivityThis, booleanValue);
                        return onCreate$lambda$3;
                }
            }
        });
        final int i2 = 1;
        companion.startReceiver(this, companion.getFILTER_GPS(), new Function1() { // from class: co.ceduladigital.sdk.z6

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onCreate$lambda$2;
                int i22 = i2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i22) {
                    case 0:
                        onCreate$lambda$2 = MainActivity.onCreate$lambda$2(mainActivityThis, booleanValue);
                        return onCreate$lambda$2;
                    default:
                        Unit onCreate$lambda$3 = MainActivity.onCreate$lambda$3(mainActivityThis, booleanValue);
                        return onCreate$lambda$3;
                }
            }
        });
        /* Device security check disabled for development
        if (new DeviceSecurityCheckerUtil(this).validateMapDeviceSecurity()) {
            NavigationUtil.INSTANCE.dialogEmulator(this);
        }
        */
        startWorkerSync();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BroadcastUtil.INSTANCE.stopReceiver(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        PrincipalActivityViewModel principalActivityViewModel = this.viewModel;
        PrincipalActivityViewModel principalActivityViewModel2 = null;
        if (principalActivityViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            principalActivityViewModel = null;
        }
        BroadcastUtil.Companion companion = BroadcastUtil.INSTANCE;
        principalActivityViewModel.handlerStatusChangeAirplaneMode(this, companion.isAirplaneMode(this));
        PrincipalActivityViewModel principalActivityViewModel3 = this.viewModel;
        if (principalActivityViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            principalActivityViewModel3 = null;
        }
        principalActivityViewModel3.handlerStatusChangeGPS(this, companion.isGPSEnabled(this));
        PrincipalActivityViewModel principalActivityViewModel4 = this.viewModel;
        if (principalActivityViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            principalActivityViewModel4 = null;
        }
        principalActivityViewModel4.handlerStatusChangeNfc(this, companion.isNfcEnabled(this));
        PrincipalActivityViewModel principalActivityViewModel5 = this.viewModel;
        if (principalActivityViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            principalActivityViewModel2 = principalActivityViewModel5;
        }
        principalActivityViewModel2.validateShowDialogNetworkUnavailable(this, NetworkUtil.INSTANCE.isNetworkAvailable(this));
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        NavController navController = this.navController;
        AppBarConfiguration appBarConfiguration = null;
        if (navController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navController");
            navController = null;
        }
        AppBarConfiguration appBarConfiguration2 = this.appBarConfiguration;
        if (appBarConfiguration2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarConfiguration");
        } else {
            appBarConfiguration = appBarConfiguration2;
        }
        return NavControllerKt.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
    }
}
