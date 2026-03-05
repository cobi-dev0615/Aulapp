package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class FragmentClassPracticeBeforeBinding {
    public final ItemClassCardDetailBinding cardProfileUserProfileUser;
    public final PrimaryButtonBinding primaryButtonClass;
    private final RelativeLayout rootView;
    public final RecyclerView rvProfileUser;
    public final TextView titleDetailsStep;

    private FragmentClassPracticeBeforeBinding(RelativeLayout relativeLayout, ItemClassCardDetailBinding itemClassCardDetailBinding, PrimaryButtonBinding primaryButtonBinding, RecyclerView recyclerView, TextView textView) {
        this.rootView = relativeLayout;
        this.cardProfileUserProfileUser = itemClassCardDetailBinding;
        this.primaryButtonClass = primaryButtonBinding;
        this.rvProfileUser = recyclerView;
        this.titleDetailsStep = textView;
    }

    public static FragmentClassPracticeBeforeBinding bind(View view) {
        int i = R.id.card_profile_user_profile_user;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.card_profile_user_profile_user);
        if (findChildViewById != null) {
            ItemClassCardDetailBinding bind = ItemClassCardDetailBinding.bind(findChildViewById);
            i = R.id.primary_button_class;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.primary_button_class);
            if (findChildViewById2 != null) {
                PrimaryButtonBinding bind2 = PrimaryButtonBinding.bind(findChildViewById2);
                i = R.id.rv_profile_user;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_profile_user);
                if (recyclerView != null) {
                    i = R.id.title_details_step;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.title_details_step);
                    if (textView != null) {
                        return new FragmentClassPracticeBeforeBinding((RelativeLayout) view, bind, bind2, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentClassPracticeBeforeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_class_practice_before, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
