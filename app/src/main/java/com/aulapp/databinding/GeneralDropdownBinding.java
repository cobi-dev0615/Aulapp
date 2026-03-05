package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.AutoCompleteTextView;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class GeneralDropdownBinding {
    public final AutoCompleteTextView actv;
    private final TextInputLayout rootView;
    public final TextInputLayout til;

    private GeneralDropdownBinding(TextInputLayout textInputLayout, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout2) {
        this.rootView = textInputLayout;
        this.actv = autoCompleteTextView;
        this.til = textInputLayout2;
    }

    public static GeneralDropdownBinding bind(View view) {
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) ViewBindings.findChildViewById(view, R.id.actv);
        if (autoCompleteTextView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.actv)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new GeneralDropdownBinding(textInputLayout, autoCompleteTextView, textInputLayout);
    }
}
