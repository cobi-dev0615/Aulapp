package com.gse.aulapp.databinding;

import android.view.View;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class PrimaryButtonStartClassBinding {
    public final MaterialButton btnStartClass;
    private final MaterialButton rootView;

    private PrimaryButtonStartClassBinding(MaterialButton materialButton, MaterialButton materialButton2) {
        this.rootView = materialButton;
        this.btnStartClass = materialButton2;
    }

    public static PrimaryButtonStartClassBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        MaterialButton materialButton = (MaterialButton) view;
        return new PrimaryButtonStartClassBinding(materialButton, materialButton);
    }
}
