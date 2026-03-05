package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class CardRideHistoryBinding {
    public final ConstraintLayout clClassCard;
    public final MaterialCardView cvPracticeClassClassCard;
    public final PrimaryButtonStartClassBinding includeShowHistoryButton;
    public final ImageView ivPracticeClassIconCard;
    private final MaterialCardView rootView;
    public final TextView tvCategory;
    public final TextView tvCellNumber;
    public final TextView tvClassTypeDuration;
    public final TextView tvClassTypeIntervalo;
    public final TextView tvNameApprentice;
    public final TextView tvPracticeClassTitleClassCard;
    public final TextView tvTrack;
    public final TextView tvVehicle;

    private CardRideHistoryBinding(MaterialCardView materialCardView, ConstraintLayout constraintLayout, MaterialCardView materialCardView2, PrimaryButtonStartClassBinding primaryButtonStartClassBinding, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = materialCardView;
        this.clClassCard = constraintLayout;
        this.cvPracticeClassClassCard = materialCardView2;
        this.includeShowHistoryButton = primaryButtonStartClassBinding;
        this.ivPracticeClassIconCard = imageView;
        this.tvCategory = textView;
        this.tvCellNumber = textView2;
        this.tvClassTypeDuration = textView3;
        this.tvClassTypeIntervalo = textView4;
        this.tvNameApprentice = textView5;
        this.tvPracticeClassTitleClassCard = textView6;
        this.tvTrack = textView7;
        this.tvVehicle = textView8;
    }

    public static CardRideHistoryBinding bind(View view) {
        int i = R.id.cl_class_card;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cl_class_card);
        if (constraintLayout != null) {
            MaterialCardView materialCardView = (MaterialCardView) view;
            i = R.id.include_show_history_button;
            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_show_history_button);
            if (findChildViewById != null) {
                PrimaryButtonStartClassBinding bind = PrimaryButtonStartClassBinding.bind(findChildViewById);
                i = R.id.iv_practice_class_icon_card;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_practice_class_icon_card);
                if (imageView != null) {
                    i = R.id.tv_category;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_category);
                    if (textView != null) {
                        i = R.id.tv_cell_number;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_cell_number);
                        if (textView2 != null) {
                            i = R.id.tv_class_type_duration;
                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_class_type_duration);
                            if (textView3 != null) {
                                i = R.id.tv_class_type_intervalo;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_class_type_intervalo);
                                if (textView4 != null) {
                                    i = R.id.tv_name_apprentice;
                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_name_apprentice);
                                    if (textView5 != null) {
                                        i = R.id.tv_practice_class_title_class_card;
                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_practice_class_title_class_card);
                                        if (textView6 != null) {
                                            i = R.id.tv_track;
                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_track);
                                            if (textView7 != null) {
                                                i = R.id.tv_vehicle;
                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_vehicle);
                                                if (textView8 != null) {
                                                    return new CardRideHistoryBinding(materialCardView, constraintLayout, materialCardView, bind, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static CardRideHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.card_ride_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public MaterialCardView getRoot() {
        return this.rootView;
    }
}
