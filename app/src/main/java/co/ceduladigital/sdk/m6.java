package co.ceduladigital.sdk;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.gse.aulapp.model.adapter.QuestionStatusAdapter;
import com.gse.aulapp.model.dto.QuestionDto;
import com.gse.aulapp.viewmodel.HomeViewModel;
import com.gse.aulapp.viewmodel.HomeViewModel$setupOnScrollListener$1;

/* loaded from: classes2.dex */
public final /* synthetic */ class m6 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m6(int i, RecyclerView recyclerView, HomeViewModel homeViewModel) {
        this.b = i;
        this.c = recyclerView;
        this.d = homeViewModel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                HomeViewModel$setupOnScrollListener$1.onScrolled$lambda$0(this.b, (RecyclerView) this.c, (HomeViewModel) this.d, view);
                break;
            default:
                QuestionStatusAdapter.QuestionStatusViewHolder.bind$lambda$1$lambda$0((QuestionDto) this.c, (QuestionStatusAdapter) this.d, this.b, view);
                break;
        }
    }

    public /* synthetic */ m6(QuestionDto questionDto, QuestionStatusAdapter questionStatusAdapter, int i) {
        this.c = questionDto;
        this.d = questionStatusAdapter;
        this.b = i;
    }
}
