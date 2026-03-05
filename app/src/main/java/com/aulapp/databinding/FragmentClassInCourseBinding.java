package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class FragmentClassInCourseBinding {
    public final MaterialButton btnEndClass;
    public final CardView cvInfoExam;
    public final FloatingActionButton floatingActionButtonCloseClass;
    public final ChronometerViewBinding includeChronometer;
    public final ItemQuestionBinding includeQuestionCard;
    private final LinearLayout rootView;
    public final RecyclerView rvQuestions;

    private FragmentClassInCourseBinding(LinearLayout linearLayout, MaterialButton materialButton, CardView cardView, FloatingActionButton floatingActionButton, ChronometerViewBinding chronometerViewBinding, ItemQuestionBinding itemQuestionBinding, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.btnEndClass = materialButton;
        this.cvInfoExam = cardView;
        this.floatingActionButtonCloseClass = floatingActionButton;
        this.includeChronometer = chronometerViewBinding;
        this.includeQuestionCard = itemQuestionBinding;
        this.rvQuestions = recyclerView;
    }

    public static FragmentClassInCourseBinding bind(View view) {
        int i = R.id.btn_end_class;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_end_class);
        if (materialButton != null) {
            i = R.id.cv_info_exam;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cv_info_exam);
            if (cardView != null) {
                i = R.id.floating_action_button_close_class;
                FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, R.id.floating_action_button_close_class);
                if (floatingActionButton != null) {
                    i = R.id.include_chronometer;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_chronometer);
                    if (findChildViewById != null) {
                        ChronometerViewBinding bind = ChronometerViewBinding.bind(findChildViewById);
                        i = R.id.include_question_card;
                        View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_question_card);
                        if (findChildViewById2 != null) {
                            ItemQuestionBinding bind2 = ItemQuestionBinding.bind(findChildViewById2);
                            i = R.id.rv_questions;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_questions);
                            if (recyclerView != null) {
                                return new FragmentClassInCourseBinding((LinearLayout) view, materialButton, cardView, floatingActionButton, bind, bind2, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentClassInCourseBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_class_in_course, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}
