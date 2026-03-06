package co.ceduladigital.sdk;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import com.gse.aulapp.model.adapter.ClassDateRecyclerAdapter;
import com.gse.aulapp.model.data.ClassDate;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.SessionResponseDto;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.view.fragment.HomeFragment;
import com.gse.aulapp.viewmodel.HomeViewModel;
import com.karumi.dexter.BuildConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes2.dex */
public final class d6 implements FlowCollector {
    public final /* synthetic */ HomeFragment a;

    public d6(HomeFragment homeFragment) {
        this.a = homeFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0212  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        String str2;
        HomeViewModel homeViewModel;
        ClassDateRecyclerAdapter classDateRecyclerAdapter;
        Status status = (Status) obj;
        boolean z = status instanceof Status.Loading;
        final HomeFragment homeFragment = this.a;
        if (z) {
            DialogUtil.Companion companion = DialogUtil.INSTANCE;
            FragmentActivity requireActivity = homeFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            companion.showDialogProgressGlobal(requireActivity, true, false, true);
        } else if (status instanceof Status.Success) {
            Status.Success success = (Status.Success) status;
            Object data = success.getData();
            HomeViewModel homeViewModel2 = null;
            if (data instanceof List) {
                if (((Collection) success.getData()).isEmpty() || !(((List) success.getData()).get(0) instanceof ClassDate)) {
                    HomeViewModel homeViewModel3 = homeFragment.a;
                    if (homeViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        homeViewModel3 = null;
                    }
                    homeViewModel3.saveSessionAndGetFromDB(null);
                } else {
                    ClassDateRecyclerAdapter classDateRecyclerAdapter2 = homeFragment.b;
                    if (classDateRecyclerAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("classRecyclerAdapter");
                        classDateRecyclerAdapter2 = null;
                    }
                    Object data2 = success.getData();
                    Intrinsics.checkNotNull(data2, "null cannot be cast to non-null type kotlin.collections.List<com.gse.aulapp.model.data.ClassDate>");
                    classDateRecyclerAdapter2.setClassDateList((List) data2);
                    ClassDateRecyclerAdapter classDateRecyclerAdapter3 = homeFragment.b;
                    if (classDateRecyclerAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("classRecyclerAdapter");
                        classDateRecyclerAdapter3 = null;
                    }
                    classDateRecyclerAdapter3.notifyDataSetChanged();
                    HomeViewModel homeViewModel4 = homeFragment.a;
                    if (homeViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        homeViewModel = null;
                    } else {
                        homeViewModel = homeViewModel4;
                    }
                    FragmentHomeBinding fragmentHomeBinding = homeFragment.c;
                    Intrinsics.checkNotNull(fragmentHomeBinding);
                    MaterialButton btnTodayClass = fragmentHomeBinding.btnTodayClass;
                    Intrinsics.checkNotNullExpressionValue(btnTodayClass, "btnTodayClass");
                    FragmentHomeBinding fragmentHomeBinding2 = homeFragment.c;
                    Intrinsics.checkNotNull(fragmentHomeBinding2);
                    RecyclerView rvClass = fragmentHomeBinding2.rvClass;
                    Intrinsics.checkNotNullExpressionValue(rvClass, "rvClass");
                    Object data3 = success.getData();
                    Intrinsics.checkNotNull(data3, "null cannot be cast to non-null type kotlin.collections.List<com.gse.aulapp.model.data.ClassDate>");
                    List<ClassDate> list = (List) data3;
                    ClassDateRecyclerAdapter classDateRecyclerAdapter4 = homeFragment.b;
                    if (classDateRecyclerAdapter4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("classRecyclerAdapter");
                        classDateRecyclerAdapter = null;
                    } else {
                        classDateRecyclerAdapter = classDateRecyclerAdapter4;
                    }
                    FragmentHomeBinding fragmentHomeBinding3 = homeFragment.c;
                    Intrinsics.checkNotNull(fragmentHomeBinding3);
                    TextView subtitle = fragmentHomeBinding3.containerButtons.subtitle;
                    Intrinsics.checkNotNullExpressionValue(subtitle, "subtitle");
                    FragmentActivity requireActivity2 = homeFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity(...)");
                    homeViewModel.updateClassDateList(btnTodayClass, rvClass, list, classDateRecyclerAdapter, subtitle, requireActivity2);
                    Iterable iterable = (Iterable) success.getData();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (!((ClassDate) it.next()).getClassDetailList().isEmpty()) {
                                FragmentHomeBinding fragmentHomeBinding4 = homeFragment.c;
                                Intrinsics.checkNotNull(fragmentHomeBinding4);
                                fragmentHomeBinding4.rvClass.setVisibility(0);
                                FragmentHomeBinding fragmentHomeBinding5 = homeFragment.c;
                                Intrinsics.checkNotNull(fragmentHomeBinding5);
                                fragmentHomeBinding5.includeLayoutEmptyItem.getRoot().setVisibility(8);
                                FragmentHomeBinding fragmentHomeBinding6 = homeFragment.c;
                                Intrinsics.checkNotNull(fragmentHomeBinding6);
                                fragmentHomeBinding6.containerButtons.subtitle.setText(homeFragment.getResources().getString(R.string.text_subtitle_container_class));
                                break;
                            }
                        }
                    }
                    FragmentHomeBinding fragmentHomeBinding7 = homeFragment.c;
                    Intrinsics.checkNotNull(fragmentHomeBinding7);
                    fragmentHomeBinding7.rvClass.setVisibility(8);
                    FragmentHomeBinding fragmentHomeBinding8 = homeFragment.c;
                    Intrinsics.checkNotNull(fragmentHomeBinding8);
                    fragmentHomeBinding8.includeLayoutEmptyItem.getRoot().setVisibility(0);
                    FragmentHomeBinding fragmentHomeBinding9 = homeFragment.c;
                    Intrinsics.checkNotNull(fragmentHomeBinding9);
                    fragmentHomeBinding9.containerButtons.subtitle.setText(homeFragment.getResources().getString(R.string.text_subtitle_container_class_empty));
                }
            } else if (data instanceof SessionResponseDto) {
                HomeViewModel homeViewModel5 = homeFragment.a;
                if (homeViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    homeViewModel2 = homeViewModel5;
                }
                homeViewModel2.saveSessionAndGetFromDB((SessionResponseDto) success.getData());
            }
        } else if (status instanceof Status.Failure) {
            String message = ((Status.Failure) status).getE().getMessage();
            if (message != null) {
                Intrinsics.areEqual(message, "401");
                DialogUtil.Companion companion2 = DialogUtil.INSTANCE;
                FragmentActivity requireActivity3 = homeFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity(...)");
                DialogUtil.Companion.showErrorDialog$default(companion2, requireActivity3, EnumDialogType.DIALOG_TYPE_GENERAL_ERROR, null, null, message, false, null, 12, null);
            }
        } else if (status instanceof Status.Empty) {
            DialogUtil.Companion companion3 = DialogUtil.INSTANCE;
            FragmentActivity requireActivity4 = homeFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity(...)");
            companion3.showDialogProgressGlobal(requireActivity4, false, false, true);
        } else if (status instanceof Status.Exception) {
            DialogUtil.Companion companion4 = DialogUtil.INSTANCE;
            FragmentActivity requireActivity5 = homeFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity5, "requireActivity(...)");
            companion4.showDialogProgressGlobal(requireActivity5, false, false, false);
            Status.Exception exception = (Status.Exception) status;
            Object data4 = exception.getData();
            boolean z2 = data4 instanceof ErrorResponse;
            String str3 = BuildConfig.FLAVOR;
            if (z2) {
                String message2 = ((ErrorResponse) exception.getData()).getResult().getMessage();
                if (message2 == null) {
                    message2 = "Ha ocurrido un error interno en la aplicación, estamos trabajando para solucionarlo.";
                }
                String code = ((ErrorResponse) exception.getData()).getResult().getCode();
                if (code != null) {
                    str3 = code;
                }
                str = message2;
            } else if (data4 instanceof String) {
                str = (String) exception.getData();
            } else {
                str = BuildConfig.FLAVOR;
                str2 = str;
                EnumDialogType enumDialogType = EnumDialogType.DIALOG_WITH_MESSAGE;
                t1 t1Var = new t1(17);
                if (!homeFragment.g) {
                    homeFragment.g = true;
                    FragmentActivity requireActivity6 = homeFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity6, "requireActivity(...)");
                    if (enumDialogType == null) {
                        enumDialogType = EnumDialogType.DIALOG_TYPE_GENERAL_ERROR;
                    }
                    AlertDialog showErrorDialog$default = DialogUtil.Companion.showErrorDialog$default(companion4, requireActivity6, enumDialogType, str, str2, null, false, new f0(t1Var, homeFragment, 5), 16, null);
                    homeFragment.f = showErrorDialog$default;
                    if (showErrorDialog$default != null) {
                        showErrorDialog$default.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: co.ceduladigital.sdk.c6
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                HomeFragment this$0 = homeFragment;
                                Intrinsics.checkNotNullParameter(this$0, "this$0");
                                this$0.f = null;
                                this$0.g = false;
                            }
                        });
                    }
                    AlertDialog alertDialog = homeFragment.f;
                    if (alertDialog != null) {
                        alertDialog.show();
                    }
                }
            }
            str2 = str3;
            EnumDialogType enumDialogType2 = EnumDialogType.DIALOG_WITH_MESSAGE;
            t1 t1Var2 = new t1(17);
            if (!homeFragment.g) {
            }
        } else {
            DialogUtil.Companion companion5 = DialogUtil.INSTANCE;
            FragmentActivity requireActivity7 = homeFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity7, "requireActivity(...)");
            companion5.showDialogProgressGlobal(requireActivity7, false, false, true);
        }
        return Unit.INSTANCE;
    }
}
