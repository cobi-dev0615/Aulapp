package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class FragmentPracticeClassBinding {
    public final MaterialButton btnEndClass;
    public final FloatingActionButton floatingActionButton;
    public final Guideline guidelineClassEnd;
    public final Guideline guidelineClassStart;
    public final Guideline guidelineClassTitle;
    public final ChronometerViewBinding includeChronometer;
    public final LayoutPracticeClassCardBinding includeLayoutPracticeClassCard;
    private final ConstraintLayout rootView;
    public final ScrollView scrollView2;

    private FragmentPracticeClassBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, FloatingActionButton floatingActionButton, Guideline guideline, Guideline guideline2, Guideline guideline3, ChronometerViewBinding chronometerViewBinding, LayoutPracticeClassCardBinding layoutPracticeClassCardBinding, ScrollView scrollView) {
        this.rootView = constraintLayout;
        this.btnEndClass = materialButton;
        this.floatingActionButton = floatingActionButton;
        this.guidelineClassEnd = guideline;
        this.guidelineClassStart = guideline2;
        this.guidelineClassTitle = guideline3;
        this.includeChronometer = chronometerViewBinding;
        this.includeLayoutPracticeClassCard = layoutPracticeClassCardBinding;
        this.scrollView2 = scrollView;
    }

    public static FragmentPracticeClassBinding bind(View view) {
        int i = R.id.btn_end_class;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_end_class);
        if (materialButton != null) {
            i = R.id.floating_action_button;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, R.id.floating_action_button);
            if (floatingActionButton != null) {
                i = R.id.guideline_class_end;
                Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline_class_end);
                if (guideline != null) {
                    i = R.id.guideline_class_start;
                    Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline_class_start);
                    if (guideline2 != null) {
                        i = R.id.guideline_class_title;
                        Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, R.id.guideline_class_title);
                        if (guideline3 != null) {
                            i = R.id.include_chronometer;
                            View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_chronometer);
                            if (findChildViewById != null) {
                                ChronometerViewBinding bind = ChronometerViewBinding.bind(findChildViewById);
                                i = R.id.include_layout_practice_class_card;
                                View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_layout_practice_class_card);
                                if (findChildViewById2 != null) {
                                    LayoutPracticeClassCardBinding bind2 = LayoutPracticeClassCardBinding.bind(findChildViewById2);
                                    i = R.id.scrollView2;
                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView2);
                                    if (scrollView != null) {
                                        return new FragmentPracticeClassBinding((ConstraintLayout) view, materialButton, floatingActionButton, guideline, guideline2, guideline3, bind, bind2, scrollView);
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

    public static FragmentPracticeClassBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_practice_class, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
