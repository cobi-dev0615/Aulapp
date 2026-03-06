package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.nfc.Tag;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.gse.aulapp.model.data.ClassDate;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.util.NfcUtil;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/gse/aulapp/viewmodel/ClassViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/gse/aulapp/model/repository/SessionRepository;", "repository", "<init>", "(Lcom/gse/aulapp/model/repository/SessionRepository;)V", BuildConfig.FLAVOR, "fetchDummyClassDetailList", "()V", "Landroid/app/Activity;", "activity", "validateAndActiveNfc", "(Landroid/app/Activity;)V", "disableNfc", "initNfcStatus", "Lcom/gse/aulapp/model/repository/SessionRepository;", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "Landroidx/lifecycle/MutableLiveData;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/ClassDate;", "_classDateList", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "getClassDateList", "()Landroidx/lifecycle/LiveData;", "classDateList", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClassViewModel extends ViewModel {
    private final String TAG;
    private final MutableLiveData<List<ClassDate>> _classDateList;
    private final SessionRepository repository;

    public ClassViewModel(SessionRepository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.repository = repository;
        this.TAG = Reflection.getOrCreateKotlinClass(ClassViewModel.class).getSimpleName();
        this._classDateList = new MutableLiveData<>();
        fetchDummyClassDetailList();
    }

    private final void fetchDummyClassDetailList() {
    }

    public final void disableNfc(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        NfcUtil.INSTANCE.disabledNfcAdapter(activity);
    }

    public final LiveData<List<ClassDate>> getClassDateList() {
        return this._classDateList;
    }

    public final void initNfcStatus(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        NfcUtil.INSTANCE.initNfcAdapter(activity);
    }

    public final void validateAndActiveNfc(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        NfcUtil.INSTANCE.validateNfcAdapter(activity, new NfcUtil.NfcCallback() { // from class: com.gse.aulapp.viewmodel.ClassViewModel$validateAndActiveNfc$1
            @Override // com.gse.aulapp.util.NfcUtil.NfcCallback
            public void onError(String error) {
                String unused;
                Intrinsics.checkNotNullParameter(error, "error");
                unused = ClassViewModel.this.TAG;
            }

            @Override // com.gse.aulapp.util.NfcUtil.NfcCallback
            public void onSuccess(Tag tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                BuildersKt.launch(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), (kotlin.coroutines.CoroutineContext) null, (kotlinx.coroutines.CoroutineStart) null, new ClassViewModel$validateAndActiveNfc$1$onSuccess$1(tag, activity, null));
            }
        });
    }
}
