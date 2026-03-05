package com.gse.aulapp.model.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.gse.aulapp.R;
import com.gse.aulapp.model.dto.CenterDto;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/gse/aulapp/model/adapter/CeaItemAutocompleteAdapter;", "Landroid/widget/ArrayAdapter;", "Lcom/gse/aulapp/model/dto/CenterDto;", "context", "Landroid/app/Activity;", "resourceId", BuildConfig.FLAVOR, "ceaItemListDto", BuildConfig.FLAVOR, "<init>", "(Landroid/app/Activity;ILjava/util/List;)V", "TAG", BuildConfig.FLAVOR, "MARGIN_TOP_IN_DP", "MARGIN_BOTTOM_IN_DP", "getCount", "getItem", "position", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CeaItemAutocompleteAdapter extends ArrayAdapter<CenterDto> {
    private final int MARGIN_BOTTOM_IN_DP;
    private final int MARGIN_TOP_IN_DP;
    private final String TAG;
    private final List<CenterDto> ceaItemListDto;
    private final Activity context;
    private final int resourceId;

    public /* synthetic */ CeaItemAutocompleteAdapter(Activity activity, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity, (i2 & 2) != 0 ? R.layout.list_dropdown_item : i, list);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.ceaItemListDto.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (convertView == null) {
            convertView = View.inflate(this.context, this.resourceId, null);
        }
        try {
            String name = getItem(position).getName();
            if (name == null) {
                name = BuildConfig.FLAVOR;
            }
            View findViewById = convertView != null ? convertView.findViewById(R.id.tv_item_list_dropdown_title) : null;
            Intrinsics.checkNotNull(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById).setText(name);
        } catch (Exception unused) {
        }
        Intrinsics.checkNotNull(convertView);
        return convertView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CeaItemAutocompleteAdapter(Activity context, int i, List<CenterDto> ceaItemListDto) {
        super(context, i, ceaItemListDto);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ceaItemListDto, "ceaItemListDto");
        this.context = context;
        this.resourceId = i;
        this.ceaItemListDto = ceaItemListDto;
        this.TAG = Reflection.getOrCreateKotlinClass(CeaItemAutocompleteAdapter.class).getSimpleName();
        this.MARGIN_TOP_IN_DP = 40;
        this.MARGIN_BOTTOM_IN_DP = 40;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public CenterDto getItem(int position) {
        return this.ceaItemListDto.get(position);
    }
}
