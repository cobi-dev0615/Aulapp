package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class ItemQuestionStatusBinding {
    public final TextView questionStatus;
    public final CardView questionStatusCard;
    private final FrameLayout rootView;

    private ItemQuestionStatusBinding(FrameLayout frameLayout, TextView textView, CardView cardView) {
        this.rootView = frameLayout;
        this.questionStatus = textView;
        this.questionStatusCard = cardView;
    }

    public static ItemQuestionStatusBinding bind(View view) {
        int i = R.id.questionStatus;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.questionStatus);
        if (textView != null) {
            i = R.id.question_status_card;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.question_status_card);
            if (cardView != null) {
                return new ItemQuestionStatusBinding((FrameLayout) view, textView, cardView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ItemQuestionStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_question_status, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
