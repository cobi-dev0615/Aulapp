package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class PrimaryFabBinding {
    public final CardView cvContainerIconUser;
    public final FloatingActionButton fabLocation;
    public final ImageView ivIconUser;
    private final ConstraintLayout rootView;

    private PrimaryFabBinding(ConstraintLayout constraintLayout, CardView cardView, FloatingActionButton floatingActionButton, ImageView imageView) {
        this.rootView = constraintLayout;
        this.cvContainerIconUser = cardView;
        this.fabLocation = floatingActionButton;
        this.ivIconUser = imageView;
    }

    public static PrimaryFabBinding bind(View view) {
        int i = R.id.cv_container_icon_user;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.cv_container_icon_user);
        if (cardView != null) {
            i = R.id.fab_location;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ViewBindings.findChildViewById(view, R.id.fab_location);
            if (floatingActionButton != null) {
                i = R.id.iv_icon_user;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_user);
                if (imageView != null) {
                    return new PrimaryFabBinding((ConstraintLayout) view, cardView, floatingActionButton, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
