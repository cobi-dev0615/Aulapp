package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.view.Menu;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ HomeViewModel b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ FragmentHomeBinding d;
    public final /* synthetic */ Menu e;

    public /* synthetic */ d(HomeViewModel homeViewModel, Activity activity, FragmentHomeBinding fragmentHomeBinding, Menu menu, int i) {
        this.a = i;
        this.b = homeViewModel;
        this.c = activity;
        this.d = fragmentHomeBinding;
        this.e = menu;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit invokeSuspend$lambda$1;
        Unit invokeSuspend$lambda$1$lambda$0;
        switch (this.a) {
            case 0:
                invokeSuspend$lambda$1 = HomeViewModel$onClickLogOut$1.invokeSuspend$lambda$1(this.b, this.c, this.d, this.e);
                return invokeSuspend$lambda$1;
            default:
                invokeSuspend$lambda$1$lambda$0 = HomeViewModel$onClickLogOut$1.invokeSuspend$lambda$1$lambda$0(this.b, this.c, this.d, this.e);
                return invokeSuspend$lambda$1$lambda$0;
        }
    }
}
