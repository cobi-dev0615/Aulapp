package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;
import com.ncorti.slidetoact.SlideToActView;

/* loaded from: classes.dex */
public final class ItemQuestionBinding {
    public final RadioButton approveRadioButton;
    public final LinearLayout containerQuestion;
    public final LinearLayout containerQuestionCompleted;
    public final SlideToActView nextButtonSwipe;
    public final TextView questionText;
    public final RadioButton rejectRadioButton;
    private final CardView rootView;
    public final RadioGroup statusCheck;

    private ItemQuestionBinding(CardView cardView, RadioButton radioButton, LinearLayout linearLayout, LinearLayout linearLayout2, SlideToActView slideToActView, TextView textView, RadioButton radioButton2, RadioGroup radioGroup) {
        this.rootView = cardView;
        this.approveRadioButton = radioButton;
        this.containerQuestion = linearLayout;
        this.containerQuestionCompleted = linearLayout2;
        this.nextButtonSwipe = slideToActView;
        this.questionText = textView;
        this.rejectRadioButton = radioButton2;
        this.statusCheck = radioGroup;
    }

    public static ItemQuestionBinding bind(View view) {
        int i = R.id.approveRadioButton;
        RadioButton radioButton = (RadioButton) ViewBindings.findChildViewById(view, R.id.approveRadioButton);
        if (radioButton != null) {
            i = R.id.containerQuestion;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.containerQuestion);
            if (linearLayout != null) {
                i = R.id.containerQuestionCompleted;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, R.id.containerQuestionCompleted);
                if (linearLayout2 != null) {
                    i = R.id.next_button_swipe;
                    SlideToActView slideToActView = (SlideToActView) ViewBindings.findChildViewById(view, R.id.next_button_swipe);
                    if (slideToActView != null) {
                        i = R.id.question_text;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.question_text);
                        if (textView != null) {
                            i = R.id.rejectRadioButton;
                            RadioButton radioButton2 = (RadioButton) ViewBindings.findChildViewById(view, R.id.rejectRadioButton);
                            if (radioButton2 != null) {
                                i = R.id.statusCheck;
                                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, R.id.statusCheck);
                                if (radioGroup != null) {
                                    return new ItemQuestionBinding((CardView) view, radioButton, linearLayout, linearLayout2, slideToActView, textView, radioButton2, radioGroup);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
