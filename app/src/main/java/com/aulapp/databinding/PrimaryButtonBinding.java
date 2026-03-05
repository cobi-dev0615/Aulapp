package com.gse.aulapp.databinding;

import android.view.View;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class PrimaryButtonBinding {
    private final MaterialButton rootView;

    private PrimaryButtonBinding(MaterialButton materialButton) {
        this.rootView = materialButton;
    }

    public static PrimaryButtonBinding bind(View view) {
        if (view != null) {
            return new PrimaryButtonBinding((MaterialButton) view);
        }
        throw new NullPointerException("rootView");
    }

    public MaterialButton getRoot() {
        return this.rootView;
    }
}
