package com.gse.aulapp.databinding;

import android.view.View;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class GeneralTextInputBinding {
    private final TextInputLayout rootView;
    public final TextInputEditText tiet;
    public final TextInputLayout til;

    private GeneralTextInputBinding(TextInputLayout textInputLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout2) {
        this.rootView = textInputLayout;
        this.tiet = textInputEditText;
        this.til = textInputLayout2;
    }

    public static GeneralTextInputBinding bind(View view) {
        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.tiet);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tiet)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new GeneralTextInputBinding(textInputLayout, textInputEditText, textInputLayout);
    }
}
