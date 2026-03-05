package co.ceduladigital.sdk;

import android.view.View;
import com.gse.aulapp.model.adapter.ClassDetailRecyclerAdapter;
import com.gse.aulapp.model.dto.SessionDto;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ClassDetailRecyclerAdapter b;
    public final /* synthetic */ SessionDto c;

    public /* synthetic */ e0(ClassDetailRecyclerAdapter classDetailRecyclerAdapter, SessionDto sessionDto, int i) {
        this.a = i;
        this.b = classDetailRecyclerAdapter;
        this.c = sessionDto;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClassDetailRecyclerAdapter.ClassDetailViewHolder.handlerClassCardByType$lambda$5$lambda$4$lambda$1(this.b, this.c, view);
                break;
            case 1:
                ClassDetailRecyclerAdapter.ClassDetailViewHolder.handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$10(this.b, this.c, view);
                break;
            case 2:
                ClassDetailRecyclerAdapter.ClassDetailViewHolder.handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$14$lambda$13(this.b, this.c, view);
                break;
            default:
                ClassDetailRecyclerAdapter.ClassDetailViewHolder.handlerClassCardByDate$lambda$18$lambda$16$lambda$15$lambda$12$lambda$11(this.b, this.c, view);
                break;
        }
    }
}
