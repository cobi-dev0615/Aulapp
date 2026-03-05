package com.gse.aulapp.view.activity;

import android.os.Bundle;
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
import com.gse.aulapp.databinding.ActivityPrincipalBinding;
import com.gse.aulapp.model.repository.HistoricRecordPermissionsChangeRepository;
import com.gse.aulapp.util.BroadcastUtil;
import com.gse.aulapp.util.NetworkUtil;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.util.UIHelper;
import com.gse.aulapp.util.WorkManagerUtil;
import com.gse.aulapp.view.activity.PrincipalActivity;
import com.gse.aulapp.viewmodel.PrincipalActivityViewModel;
import com.gse.aulapp.viewmodel.factory.PrincipalActivityViewModelFactory;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/gse/aulapp/view/activity/PrincipalActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", BuildConfig.FLAVOR, "startWorkerSync", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", BuildConfig.FLAVOR, "onSupportNavigateUp", "()Z", "onResume", "onDestroy", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "Landroidx/navigation/ui/AppBarConfiguration;", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "Lcom/gse/aulapp/databinding/ActivityPrincipalBinding;", "binding", "Lcom/gse/aulapp/databinding/ActivityPrincipalBinding;", "Lcom/gse/aulapp/viewmodel/PrincipalActivityViewModel;", "viewModel", "Lcom/gse/aulapp/viewmodel/PrincipalActivityViewModel;", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "setDrawerLayout", "(Landroidx/drawerlayout/widget/DrawerLayout;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPrincipalActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrincipalActivity.kt\ncom/gse/aulapp/view/activity/PrincipalActivity\n+ 2 AppBarConfiguration.kt\nandroidx/navigation/ui/AppBarConfigurationKt\n*L\n1#1,161:1\n299#2,8:162\n*S KotlinDebug\n*F\n+ 1 PrincipalActivity.kt\ncom/gse/aulapp/view/activity/PrincipalActivity\n*L\n72#1:162,8\n*E\n"})
/* loaded from: classes2.dex */
public final class PrincipalActivity extends AppCompatActivity {
    private final String TAG = Reflection.getOrCreateKotlinClass(PrincipalActivity.class).getSimpleName();
    private AppBarConfiguration appBarConfiguration;
    private ActivityPrincipalBinding binding;
    public DrawerLayout drawerLayout;
    private PrincipalActivityViewModel viewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(PrincipalActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getDrawerLayout().closeDrawers();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(PrincipalActivity this$0, NavController navController, NavDestination destination, Bundle bundle) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(navController, "<unused var>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int id = destination.getId();
        if (id == R.id.homeFragment) {
            UIHelper.Companion.setterCustomToolbar$default(UIHelper.INSTANCE, this$0, false, true, null, null, Integer.valueOf(R.drawable.ic_drawer_menu), false, false, 154, null);
        } else if (id != R.id.userSearchFragment) {
            UIHelper.Companion.setterCustomToolbar$default(UIHelper.INSTANCE, this$0, false, false, null, null, null, false, false, 254, null);
        } else {
            UIHelper.Companion.setterCustomToolbar$default(UIHelper.INSTANCE, this$0, false, false, null, null, null, false, false, 252, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(PrincipalActivity this$0, boolean z) {
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
    public static final Unit onCreate$lambda$3(PrincipalActivity this$0, boolean z) {
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
        PermissionHelper.INSTANCE.validateNotificationPermissionFlow(this, new t1(20));
        workManagerUtil.runTask();
    }

    public final DrawerLayout getDrawerLayout() {
        DrawerLayout drawerLayout = this.drawerLayout;
        if (drawerLayout != null) {
            return drawerLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("drawerLayout");
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        super.onCreate(savedInstanceState);
        setRequestedOrientation(1);
        ActivityPrincipalBinding inflate = ActivityPrincipalBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        PrincipalActivityViewModel principalActivityViewModel = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        setContentView(inflate.getRoot());
        ActivityPrincipalBinding activityPrincipalBinding = this.binding;
        if (activityPrincipalBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityPrincipalBinding = null;
        }
        setSupportActionBar(activityPrincipalBinding.appBarMain.mainToolbar);
        this.viewModel = (PrincipalActivityViewModel) new ViewModelProvider(this, new PrincipalActivityViewModelFactory(new HistoricRecordPermissionsChangeRepository(GeneralApp.INSTANCE.getDatabase().HistoricRecordPermissionsChangeDao()))).get(PrincipalActivityViewModel.class);
        ActivityPrincipalBinding activityPrincipalBinding2 = this.binding;
        if (activityPrincipalBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityPrincipalBinding2 = null;
        }
        setDrawerLayout(activityPrincipalBinding2.drawerLayout);
        ActivityPrincipalBinding activityPrincipalBinding3 = this.binding;
        if (activityPrincipalBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityPrincipalBinding3 = null;
        }
        NavigationView navView = activityPrincipalBinding3.navView;
        Intrinsics.checkNotNullExpressionValue(navView, "navView");
        ((Button) navView.findViewById(R.id.drawer_menu_button)).setOnClickListener(new r2(this, 12));
        NavController findNavController = ActivityKt.findNavController(this, R.id.nav_host_fragment_content_main);
        PrincipalActivityViewModel principalActivityViewModel2 = this.viewModel;
        if (principalActivityViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            principalActivityViewModel2 = null;
        }
        principalActivityViewModel2.setDrawerMenuData(this, navView, getDrawerLayout(), findNavController);
        AppBarConfiguration build = new AppBarConfiguration.Builder(SetsKt.setOf(Integer.valueOf(R.id.homeFragment))).setOpenableLayout(getDrawerLayout()).setFallbackOnNavigateUpListener(new PrincipalActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(new Function0<Boolean>() { // from class: com.gse.aulapp.view.activity.PrincipalActivity$onCreate$$inlined$AppBarConfiguration$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).build();
        this.appBarConfiguration = build;
        if (build == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarConfiguration");
            build = null;
        }
        androidx.navigation.ui.ActivityKt.setupActionBarWithNavController(this, findNavController, build);
        NavigationViewKt.setupWithNavController(navView, findNavController);
        findNavController.addOnDestinationChangedListener(new y6(this, 1));
        BroadcastUtil.Companion companion = BroadcastUtil.INSTANCE;
        final int i = 0;
        companion.startReceiver(this, companion.getFILTER_AIRPLANE(), new Function1(this) { // from class: co.ceduladigital.sdk.v7
            public final /* synthetic */ PrincipalActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onCreate$lambda$2;
                Unit onCreate$lambda$3;
                int i2 = i;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i2) {
                    case 0:
                        onCreate$lambda$2 = PrincipalActivity.onCreate$lambda$2(this.b, booleanValue);
                        return onCreate$lambda$2;
                    default:
                        onCreate$lambda$3 = PrincipalActivity.onCreate$lambda$3(this.b, booleanValue);
                        return onCreate$lambda$3;
                }
            }
        });
        final int i2 = 1;
        companion.startReceiver(this, companion.getFILTER_GPS(), new Function1(this) { // from class: co.ceduladigital.sdk.v7
            public final /* synthetic */ PrincipalActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onCreate$lambda$2;
                Unit onCreate$lambda$3;
                int i22 = i2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i22) {
                    case 0:
                        onCreate$lambda$2 = PrincipalActivity.onCreate$lambda$2(this.b, booleanValue);
                        return onCreate$lambda$2;
                    default:
                        onCreate$lambda$3 = PrincipalActivity.onCreate$lambda$3(this.b, booleanValue);
                        return onCreate$lambda$3;
                }
            }
        });
        PrincipalActivityViewModel principalActivityViewModel3 = this.viewModel;
        if (principalActivityViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            principalActivityViewModel3 = null;
        }
        principalActivityViewModel3.subscribeNetwork(this);
        PrincipalActivityViewModel principalActivityViewModel4 = this.viewModel;
        if (principalActivityViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            principalActivityViewModel = principalActivityViewModel4;
        }
        principalActivityViewModel.subscribeNfc(this);
        startWorkerSync();
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
        NavController findNavController = ActivityKt.findNavController(this, R.id.nav_host_fragment_content_main);
        if (getOnBackPressedDispatcher().getHasEnabledCallbacks()) {
            getOnBackPressedDispatcher().onBackPressed();
            return true;
        }
        AppBarConfiguration appBarConfiguration = this.appBarConfiguration;
        if (appBarConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appBarConfiguration");
            appBarConfiguration = null;
        }
        return NavControllerKt.navigateUp(findNavController, appBarConfiguration) || super.onSupportNavigateUp();
    }

    public final void setDrawerLayout(DrawerLayout drawerLayout) {
        Intrinsics.checkNotNullParameter(drawerLayout, "<set-?>");
        this.drawerLayout = drawerLayout;
    }
}
