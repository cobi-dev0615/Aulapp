package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import co.ceduladigital.sdk.h6;
import co.ceduladigital.sdk.i6;
import co.ceduladigital.sdk.j6;
import co.ceduladigital.sdk.k6;
import co.ceduladigital.sdk.o1;
import co.ceduladigital.sdk.w7;
import com.google.android.material.navigation.NavigationView;
import com.gse.aulapp.R;
import com.gse.aulapp.model.dto.CenterDto;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumPermissionsApp;
import com.gse.aulapp.model.repository.HistoricRecordPermissionsChangeRepository;
import com.gse.aulapp.util.BroadcastUtil;
import com.gse.aulapp.util.BuildTypeUtil;
import com.gse.aulapp.util.ConnectivityObserver;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.util.NetworkUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.extension.ViewExtKt;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\rJ\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u001e\u0010 \u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000b0\"H\u0002J \u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\rH\u0002J\u0018\u0010&\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0007H\u0002J\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0007H\u0002J \u0010*\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/gse/aulapp/viewmodel/PrincipalActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "historicRecordPermissionsChangeRepository", "Lcom/gse/aulapp/model/repository/HistoricRecordPermissionsChangeRepository;", "<init>", "(Lcom/gse/aulapp/model/repository/HistoricRecordPermissionsChangeRepository;)V", "TAG", BuildConfig.FLAVOR, "connectivityObserver", "Lcom/gse/aulapp/util/ConnectivityObserver;", "subscribeNetwork", BuildConfig.FLAVOR, "context", "Landroid/app/Activity;", "handlerStatusChangeAirplaneMode", "isEnabled", BuildConfig.FLAVOR, "handlerStatusChangeGPS", "subscribeNfc", "activity", "handlerStatusChangeNfc", "validateShowDialogNetworkUnavailable", "saveHistoricPermission", "permission", "Lcom/gse/aulapp/model/enumerate/EnumPermissionsApp;", "setDrawerMenuData", "navView", "Lcom/google/android/material/navigation/NavigationView;", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "navController", "Landroidx/navigation/NavController;", "validateConnection", "function", "Lkotlin/Function0;", "routeNavigation", "btnNavigation", "Landroid/widget/Button;", "navigateToRideHistory", "instructorId", "navigateToHoursPrefered", "sessionId", "navigateToScheduleExams", "appbarTitle", "url", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PrincipalActivityViewModel extends ViewModel {
    private final String TAG;
    private ConnectivityObserver connectivityObserver;
    private final HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository;

    public PrincipalActivityViewModel(HistoricRecordPermissionsChangeRepository historicRecordPermissionsChangeRepository) {
        Intrinsics.checkNotNullParameter(historicRecordPermissionsChangeRepository, "historicRecordPermissionsChangeRepository");
        this.historicRecordPermissionsChangeRepository = historicRecordPermissionsChangeRepository;
        Intrinsics.checkNotNullExpressionValue("PrincipalActivityViewModel", "getSimpleName(...)");
        this.TAG = "PrincipalActivityViewModel";
    }

    private final void navigateToHoursPrefered(NavController navController, String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "instructorID");
        navController.navigate(new h6(sessionId));
    }

    private final void navigateToRideHistory(NavController navController, String instructorId) {
        Intrinsics.checkNotNullParameter(instructorId, "instructorID");
        navController.navigate(new i6(instructorId));
    }

    private final void navigateToScheduleExams(NavController navController, String appbarTitle, String url) {
        Intrinsics.checkNotNullParameter(url, "urlAction");
        navController.navigate(new j6(url, appbarTitle));
    }

    private final void routeNavigation(Button btnNavigation, NavController navController, Activity activity) {
        switch (btnNavigation.getId()) {
            case R.id.drawer_button_history_hour /* 2131362111 */:
                navigateToHoursPrefered(navController, String.valueOf(PreferenceUtil.INSTANCE.getUserId(activity)));
                break;
            case R.id.drawer_button_history_ride /* 2131362112 */:
                navigateToRideHistory(navController, String.valueOf(PreferenceUtil.INSTANCE.getUserId(activity)));
                break;
            case R.id.drawer_button_schedule_Exams /* 2131362113 */:
                String string = activity.getResources().getString(R.string.txt_title_schedule_Exams);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                navigateToScheduleExams(navController, string, PreferenceUtil.INSTANCE.getScheduleExamsUrl(activity));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveHistoricPermission(EnumPermissionsApp permission, boolean isEnabled) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PrincipalActivityViewModel$saveHistoricPermission$1(this, isEnabled, permission, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDrawerMenuData$lambda$2(PrincipalActivityViewModel this$0, Activity activity, DrawerLayout drawerLayout, Button button, NavController navController) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(drawerLayout, "$drawerLayout");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        this$0.validateConnection(activity, new w7(drawerLayout, this$0, button, navController, activity, 4));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDrawerMenuData$lambda$2$lambda$1(DrawerLayout drawerLayout, PrincipalActivityViewModel this$0, Button button, NavController navController, Activity activity) {
        Intrinsics.checkNotNullParameter(drawerLayout, "$drawerLayout");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        drawerLayout.closeDrawers();
        Intrinsics.checkNotNull(button);
        this$0.routeNavigation(button, navController, activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDrawerMenuData$lambda$4(PrincipalActivityViewModel this$0, Activity activity, DrawerLayout drawerLayout, Button button, NavController navController) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(drawerLayout, "$drawerLayout");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        this$0.validateConnection(activity, new w7(drawerLayout, this$0, button, navController, activity, 5));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDrawerMenuData$lambda$4$lambda$3(DrawerLayout drawerLayout, PrincipalActivityViewModel this$0, Button button, NavController navController, Activity activity) {
        Intrinsics.checkNotNullParameter(drawerLayout, "$drawerLayout");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        drawerLayout.closeDrawers();
        Intrinsics.checkNotNull(button);
        this$0.routeNavigation(button, navController, activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDrawerMenuData$lambda$6(PrincipalActivityViewModel this$0, Activity activity, DrawerLayout drawerLayout, Button button, NavController navController) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(drawerLayout, "$drawerLayout");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        this$0.validateConnection(activity, new w7(drawerLayout, this$0, button, navController, activity, 3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDrawerMenuData$lambda$6$lambda$5(DrawerLayout drawerLayout, PrincipalActivityViewModel this$0, Button button, NavController navController, Activity activity) {
        Intrinsics.checkNotNullParameter(drawerLayout, "$drawerLayout");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        drawerLayout.closeDrawers();
        Intrinsics.checkNotNull(button);
        this$0.routeNavigation(button, navController, activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeNfc$lambda$0(PrincipalActivityViewModel this$0, Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        this$0.handlerStatusChangeNfc(activity, z);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, android.app.Dialog] */
    private final void validateConnection(Activity activity, Function0<Unit> function) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new Dialog(activity);
        if (NetworkUtil.INSTANCE.isNetworkAvailable(activity)) {
            function.invoke();
        } else {
            objectRef.element = DialogNormalUtil.INSTANCE.showDialog$app_release(activity, (Dialog) objectRef.element, EnumDialogType.NETWORK_ACCESS_ERROR, activity.getResources().getString(R.string.title_network_error_access), activity.getResources().getString(R.string.txt_network_error_access), new k6(activity, objectRef, function, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void validateConnection$lambda$7(Activity activity, Ref.ObjectRef alertDialog, Function0 function, View view) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(alertDialog, "$alertDialog");
        Intrinsics.checkNotNullParameter(function, "$function");
        if (NetworkUtil.INSTANCE.isNetworkAvailable(activity) && ((Dialog) alertDialog.element).isShowing()) {
            ((Dialog) alertDialog.element).dismiss();
            function.invoke();
        }
    }

    public final void handlerStatusChangeAirplaneMode(Activity context, boolean isEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PrincipalActivityViewModel$handlerStatusChangeAirplaneMode$1(this, isEnabled, context, null));
    }

    public final void handlerStatusChangeGPS(Activity context, boolean isEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PrincipalActivityViewModel$handlerStatusChangeGPS$1(this, isEnabled, context, null));
    }

    public final void handlerStatusChangeNfc(Activity context, boolean isEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PrincipalActivityViewModel$handlerStatusChangeNfc$1(this, isEnabled, context, null));
    }

    public final void setDrawerMenuData(Activity activity, NavigationView navView, DrawerLayout drawerLayout, NavController navController) {
        CenterDto centerDto;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navView, "navView");
        Intrinsics.checkNotNullParameter(drawerLayout, "drawerLayout");
        Intrinsics.checkNotNullParameter(navController, "navController");
        try {
            centerDto = PreferenceUtil.Companion.getCEA$default(PreferenceUtil.INSTANCE, null, 1, null);
        } catch (Exception unused) {
            centerDto = new CenterDto(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, 8, null);
        }
        TextView textView = (TextView) navView.findViewById(R.id.text_drawer_title);
        View findViewById = navView.findViewById(R.id.include_drawer_menu_address_cea);
        View findViewById2 = navView.findViewById(R.id.include_drawer_menu_phone_cea);
        TextView textView2 = (TextView) navView.findViewById(R.id.text_drawer_app_version);
        textView.setText(centerDto != null ? centerDto.getName() : "No Aplica");
        ((ImageView) findViewById.findViewById(R.id.iv_text_drawer_menu)).setImageResource(R.drawable.ic_computer_white);
        ((TextView) findViewById.findViewById(R.id.text_drawer_card_content)).setText(centerDto != null ? centerDto.getAddress() : "No Aplica");
        ImageView imageView = (ImageView) findViewById2.findViewById(R.id.iv_text_drawer_menu);
        TextView textView3 = (TextView) findViewById2.findViewById(R.id.text_drawer_card_content);
        ((TextView) findViewById2.findViewById(R.id.text_drawer_card_title)).setText(activity.getString(R.string.txt_drawer_menu_tittle_phone_cea));
        textView3.setText(centerDto != null ? centerDto.getPhoneNumber() : "No Aplica");
        imageView.setImageResource(R.drawable.ic_calendar_white);
        TextView textView4 = (TextView) navView.findViewById(R.id.text_drawer_main_instructor);
        PreferenceUtil.Companion companion = PreferenceUtil.INSTANCE;
        textView4.setText(companion.getUserName(activity));
        ((TextView) navView.findViewById(R.id.text_drawer_menu_document_number_instructor)).setText(companion.getDocumentNumber(activity));
        ((TextView) navView.findViewById(R.id.text_drawer_main_email_instructor)).setText(companion.getEmail(activity));
        Button button = (Button) navView.findViewById(R.id.drawer_button_history_ride);
        Intrinsics.checkNotNull(button);
        ViewExtKt.setOnSingleClickListener(button, new w7(this, activity, drawerLayout, button, navController, 0));
        Button button2 = (Button) navView.findViewById(R.id.drawer_button_schedule_Exams);
        if (companion.getScheduleExamsUrl(activity).length() > 0) {
            button2.setVisibility(0);
        } else {
            button2.setVisibility(8);
        }
        Intrinsics.checkNotNull(button2);
        ViewExtKt.setOnSingleClickListener(button2, new w7(this, activity, drawerLayout, button2, navController, 1));
        ((TextView) navView.findViewById(R.id.text_drawer_main_cc)).setText(companion.getDocType(activity) + " - ");
        Button button3 = (Button) navView.findViewById(R.id.drawer_button_history_hour);
        Intrinsics.checkNotNull(button3);
        ViewExtKt.setOnSingleClickListener(button3, new w7(this, activity, drawerLayout, button3, navController, 2));
        textView2.setText(BuildTypeUtil.INSTANCE.getAppVersion(true));
    }

    public final void subscribeNetwork(Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PrincipalActivityViewModel$subscribeNetwork$1(this, context, null));
    }

    public final void subscribeNfc(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BroadcastUtil.Companion companion = BroadcastUtil.INSTANCE;
        companion.startReceiver(activity, companion.getFILTER_NFC(), new o1(this, activity, 6));
    }

    public final void validateShowDialogNetworkUnavailable(Activity context, boolean isEnabled) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PrincipalActivityViewModel$validateShowDialogNetworkUnavailable$1(this, context, isEnabled, null));
    }
}
