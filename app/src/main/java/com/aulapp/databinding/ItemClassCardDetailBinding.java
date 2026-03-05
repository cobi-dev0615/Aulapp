package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class ItemClassCardDetailBinding {
    public final ConstraintLayout clContainerClassCard;
    public final LinearLayout containerInfo;
    public final CardView cvContainerClassCard;
    public final ItemDetailBinding includeApprenticeAddress;
    public final ItemDetailBinding includeApprenticeName;
    public final ItemDetailBinding includeApprenticePhoneNumber;
    public final ItemDetailBinding includeClassAula;
    public final ItemDetailBinding includeClassCategory;
    public final ItemDetailBinding includeClassTrack;
    public final ItemDetailBinding includeClassVehicle;
    public final PrimaryFabBinding includeFabLocation;
    public final PrimaryButtonStartClassBinding includeStartClass;
    public final ImageView ivClassType;
    private final CardView rootView;
    public final TextView tvClassName;
    public final TextView tvClassTypeDescription;
    public final TextView tvClassTypeDuration;
    public final TextView tvClassTypeState;
    public final TextView tvClassTypeTitle;

    private ItemClassCardDetailBinding(CardView cardView, ConstraintLayout constraintLayout, LinearLayout linearLayout, CardView cardView2, ItemDetailBinding itemDetailBinding, ItemDetailBinding itemDetailBinding2, ItemDetailBinding itemDetailBinding3, ItemDetailBinding itemDetailBinding4, ItemDetailBinding itemDetailBinding5, ItemDetailBinding itemDetailBinding6, ItemDetailBinding itemDetailBinding7, PrimaryFabBinding primaryFabBinding, PrimaryButtonStartClassBinding primaryButtonStartClassBinding, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = cardView;
        this.clContainerClassCard = constraintLayout;
        this.containerInfo = linearLayout;
        this.cvContainerClassCard = cardView2;
        this.includeApprenticeAddress = itemDetailBinding;
        this.includeApprenticeName = itemDetailBinding2;
        this.includeApprenticePhoneNumber = itemDetailBinding3;
        this.includeClassAula = itemDetailBinding4;
        this.includeClassCategory = itemDetailBinding5;
        this.includeClassTrack = itemDetailBinding6;
        this.includeClassVehicle = itemDetailBinding7;
        this.includeFabLocation = primaryFabBinding;
        this.includeStartClass = primaryButtonStartClassBinding;
        this.ivClassType = imageView;
        this.tvClassName = textView;
        this.tvClassTypeDescription = textView2;
        this.tvClassTypeDuration = textView3;
        this.tvClassTypeState = textView4;
        this.tvClassTypeTitle = textView5;
    }

    public static ItemClassCardDetailBinding bind(View view) {
        int i = R.id.cl_container_class_card;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cl_container_class_card);
        if (constraintLayout != null) {
            i = R.id.container_info;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.container_info);
            if (linearLayout != null) {
                CardView cardView = (CardView) view;
                i = R.id.include_apprentice_address;
                View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_apprentice_address);
                if (findChildViewById != null) {
                    ItemDetailBinding bind = ItemDetailBinding.bind(findChildViewById);
                    i = R.id.include_apprentice_name;
                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_apprentice_name);
                    if (findChildViewById2 != null) {
                        ItemDetailBinding bind2 = ItemDetailBinding.bind(findChildViewById2);
                        i = R.id.include_apprentice_phone_number;
                        View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_apprentice_phone_number);
                        if (findChildViewById3 != null) {
                            ItemDetailBinding bind3 = ItemDetailBinding.bind(findChildViewById3);
                            i = R.id.include_class_aula;
                            View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_class_aula);
                            if (findChildViewById4 != null) {
                                ItemDetailBinding bind4 = ItemDetailBinding.bind(findChildViewById4);
                                i = R.id.include_class_category;
                                View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.include_class_category);
                                if (findChildViewById5 != null) {
                                    ItemDetailBinding bind5 = ItemDetailBinding.bind(findChildViewById5);
                                    i = R.id.include_class_track;
                                    View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.include_class_track);
                                    if (findChildViewById6 != null) {
                                        ItemDetailBinding bind6 = ItemDetailBinding.bind(findChildViewById6);
                                        i = R.id.include_class_vehicle;
                                        View findChildViewById7 = ViewBindings.findChildViewById(view, R.id.include_class_vehicle);
                                        if (findChildViewById7 != null) {
                                            ItemDetailBinding bind7 = ItemDetailBinding.bind(findChildViewById7);
                                            i = R.id.include_fab_location;
                                            View findChildViewById8 = ViewBindings.findChildViewById(view, R.id.include_fab_location);
                                            if (findChildViewById8 != null) {
                                                PrimaryFabBinding bind8 = PrimaryFabBinding.bind(findChildViewById8);
                                                i = R.id.include_start_class;
                                                View findChildViewById9 = ViewBindings.findChildViewById(view, R.id.include_start_class);
                                                if (findChildViewById9 != null) {
                                                    PrimaryButtonStartClassBinding bind9 = PrimaryButtonStartClassBinding.bind(findChildViewById9);
                                                    i = R.id.iv_class_type;
                                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_class_type);
                                                    if (imageView != null) {
                                                        i = R.id.tv_class_name;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_class_name);
                                                        if (textView != null) {
                                                            i = R.id.tv_class_type_description;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_class_type_description);
                                                            if (textView2 != null) {
                                                                i = R.id.tv_class_type_duration;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_class_type_duration);
                                                                if (textView3 != null) {
                                                                    i = R.id.tv_class_type_state;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_class_type_state);
                                                                    if (textView4 != null) {
                                                                        i = R.id.tv_class_type_title;
                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_class_type_title);
                                                                        if (textView5 != null) {
                                                                            return new ItemClassCardDetailBinding(cardView, constraintLayout, linearLayout, cardView, bind, bind2, bind3, bind4, bind5, bind6, bind7, bind8, bind9, imageView, textView, textView2, textView3, textView4, textView5);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public CardView getRoot() {
        return this.rootView;
    }
}
