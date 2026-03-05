package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class LayoutPracticeClassInfoBinding {
    public final ConstraintLayout clClassCard;
    public final ConstraintLayout clClassDetailCardTitle;
    public final LinearLayout cvPracticeClassClassCard;
    public final LayoutClassProgressTextBinding includePracticeClassApprentice;
    public final LayoutClassProgressTextBinding includePracticeClassAverageSpeed;
    public final LayoutClassProgressTextBinding includePracticeClassCategory;
    public final LayoutClassProgressTextBinding includePracticeClassCea;
    public final LayoutClassProgressTextBinding includePracticeClassDate;
    public final LayoutClassProgressTextBinding includePracticeClassDistanceTraveled;
    public final LayoutClassProgressTextBinding includePracticeClassInstructor;
    public final LayoutClassProgressTextBinding includePracticeClassMovingTime;
    public final LayoutClassProgressTextBinding includePracticeClassStartTime;
    public final LayoutClassProgressTextBinding includePracticeClassStoppedTime;
    public final LayoutClassProgressTextBinding includePracticeClassTime;
    public final LayoutClassProgressTextBinding includePracticeClassTopSpeed;
    public final LayoutClassProgressTextBinding includePracticeClassVehicle;
    public final ImageView ivPracticeClassIconCard;
    public final LinearLayout lnClassCard;
    private final ScrollView rootView;
    public final TextView tvPracticeClassTitleClassCard;

    private LayoutPracticeClassInfoBinding(ScrollView scrollView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, LayoutClassProgressTextBinding layoutClassProgressTextBinding, LayoutClassProgressTextBinding layoutClassProgressTextBinding2, LayoutClassProgressTextBinding layoutClassProgressTextBinding3, LayoutClassProgressTextBinding layoutClassProgressTextBinding4, LayoutClassProgressTextBinding layoutClassProgressTextBinding5, LayoutClassProgressTextBinding layoutClassProgressTextBinding6, LayoutClassProgressTextBinding layoutClassProgressTextBinding7, LayoutClassProgressTextBinding layoutClassProgressTextBinding8, LayoutClassProgressTextBinding layoutClassProgressTextBinding9, LayoutClassProgressTextBinding layoutClassProgressTextBinding10, LayoutClassProgressTextBinding layoutClassProgressTextBinding11, LayoutClassProgressTextBinding layoutClassProgressTextBinding12, LayoutClassProgressTextBinding layoutClassProgressTextBinding13, ImageView imageView, LinearLayout linearLayout2, TextView textView) {
        this.rootView = scrollView;
        this.clClassCard = constraintLayout;
        this.clClassDetailCardTitle = constraintLayout2;
        this.cvPracticeClassClassCard = linearLayout;
        this.includePracticeClassApprentice = layoutClassProgressTextBinding;
        this.includePracticeClassAverageSpeed = layoutClassProgressTextBinding2;
        this.includePracticeClassCategory = layoutClassProgressTextBinding3;
        this.includePracticeClassCea = layoutClassProgressTextBinding4;
        this.includePracticeClassDate = layoutClassProgressTextBinding5;
        this.includePracticeClassDistanceTraveled = layoutClassProgressTextBinding6;
        this.includePracticeClassInstructor = layoutClassProgressTextBinding7;
        this.includePracticeClassMovingTime = layoutClassProgressTextBinding8;
        this.includePracticeClassStartTime = layoutClassProgressTextBinding9;
        this.includePracticeClassStoppedTime = layoutClassProgressTextBinding10;
        this.includePracticeClassTime = layoutClassProgressTextBinding11;
        this.includePracticeClassTopSpeed = layoutClassProgressTextBinding12;
        this.includePracticeClassVehicle = layoutClassProgressTextBinding13;
        this.ivPracticeClassIconCard = imageView;
        this.lnClassCard = linearLayout2;
        this.tvPracticeClassTitleClassCard = textView;
    }

    public static LayoutPracticeClassInfoBinding bind(View view) {
        int i = R.id.cl_class_card;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cl_class_card);
        if (constraintLayout != null) {
            i = R.id.cl_class_detail_card_title;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.cl_class_detail_card_title);
            if (constraintLayout2 != null) {
                i = R.id.cv_practice_class_class_card;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.cv_practice_class_class_card);
                if (linearLayout != null) {
                    i = R.id.include_practice_class_apprentice;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_practice_class_apprentice);
                    if (findChildViewById != null) {
                        LayoutClassProgressTextBinding bind = LayoutClassProgressTextBinding.bind(findChildViewById);
                        i = R.id.include_practice_class_average_speed;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_practice_class_average_speed);
                        if (findChildViewById2 != null) {
                            LayoutClassProgressTextBinding bind2 = LayoutClassProgressTextBinding.bind(findChildViewById2);
                            i = R.id.include_practice_class_category;
                            View findChildViewById3 = ViewBindings.findChildViewById(view, R.id.include_practice_class_category);
                            if (findChildViewById3 != null) {
                                LayoutClassProgressTextBinding bind3 = LayoutClassProgressTextBinding.bind(findChildViewById3);
                                i = R.id.include_practice_class_cea;
                                View findChildViewById4 = ViewBindings.findChildViewById(view, R.id.include_practice_class_cea);
                                if (findChildViewById4 != null) {
                                    LayoutClassProgressTextBinding bind4 = LayoutClassProgressTextBinding.bind(findChildViewById4);
                                    i = R.id.include_practice_class_date;
                                    View findChildViewById5 = ViewBindings.findChildViewById(view, R.id.include_practice_class_date);
                                    if (findChildViewById5 != null) {
                                        LayoutClassProgressTextBinding bind5 = LayoutClassProgressTextBinding.bind(findChildViewById5);
                                        i = R.id.include_practice_class_distance_traveled;
                                        View findChildViewById6 = ViewBindings.findChildViewById(view, R.id.include_practice_class_distance_traveled);
                                        if (findChildViewById6 != null) {
                                            LayoutClassProgressTextBinding bind6 = LayoutClassProgressTextBinding.bind(findChildViewById6);
                                            i = R.id.include_practice_class_instructor;
                                            View findChildViewById7 = ViewBindings.findChildViewById(view, R.id.include_practice_class_instructor);
                                            if (findChildViewById7 != null) {
                                                LayoutClassProgressTextBinding bind7 = LayoutClassProgressTextBinding.bind(findChildViewById7);
                                                i = R.id.include_practice_class_moving_time;
                                                View findChildViewById8 = ViewBindings.findChildViewById(view, R.id.include_practice_class_moving_time);
                                                if (findChildViewById8 != null) {
                                                    LayoutClassProgressTextBinding bind8 = LayoutClassProgressTextBinding.bind(findChildViewById8);
                                                    i = R.id.include_practice_class_start_time;
                                                    View findChildViewById9 = ViewBindings.findChildViewById(view, R.id.include_practice_class_start_time);
                                                    if (findChildViewById9 != null) {
                                                        LayoutClassProgressTextBinding bind9 = LayoutClassProgressTextBinding.bind(findChildViewById9);
                                                        i = R.id.include_practice_class_stopped_time;
                                                        View findChildViewById10 = ViewBindings.findChildViewById(view, R.id.include_practice_class_stopped_time);
                                                        if (findChildViewById10 != null) {
                                                            LayoutClassProgressTextBinding bind10 = LayoutClassProgressTextBinding.bind(findChildViewById10);
                                                            i = R.id.include_practice_class_time;
                                                            View findChildViewById11 = ViewBindings.findChildViewById(view, R.id.include_practice_class_time);
                                                            if (findChildViewById11 != null) {
                                                                LayoutClassProgressTextBinding bind11 = LayoutClassProgressTextBinding.bind(findChildViewById11);
                                                                i = R.id.include_practice_class_top_speed;
                                                                View findChildViewById12 = ViewBindings.findChildViewById(view, R.id.include_practice_class_top_speed);
                                                                if (findChildViewById12 != null) {
                                                                    LayoutClassProgressTextBinding bind12 = LayoutClassProgressTextBinding.bind(findChildViewById12);
                                                                    i = R.id.include_practice_class_vehicle;
                                                                    View findChildViewById13 = ViewBindings.findChildViewById(view, R.id.include_practice_class_vehicle);
                                                                    if (findChildViewById13 != null) {
                                                                        LayoutClassProgressTextBinding bind13 = LayoutClassProgressTextBinding.bind(findChildViewById13);
                                                                        i = R.id.iv_practice_class_icon_card;
                                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_practice_class_icon_card);
                                                                        if (imageView != null) {
                                                                            i = R.id.ln_class_card;
                                                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ln_class_card);
                                                                            if (linearLayout2 != null) {
                                                                                i = R.id.tv_practice_class_title_class_card;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_practice_class_title_class_card);
                                                                                if (textView != null) {
                                                                                    return new LayoutPracticeClassInfoBinding((ScrollView) view, constraintLayout, constraintLayout2, linearLayout, bind, bind2, bind3, bind4, bind5, bind6, bind7, bind8, bind9, bind10, bind11, bind12, bind13, imageView, linearLayout2, textView);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}
