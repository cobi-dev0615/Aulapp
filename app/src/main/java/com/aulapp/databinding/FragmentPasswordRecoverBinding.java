package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class FragmentPasswordRecoverBinding {
    public final GeneralTextInputBinding includeGeneralTextInputUserRecovery;
    public final PrimaryButtonBinding includePrimaryButtonRecovery;
    public final ImageView ivImageRecovery;
    public final ImageView ivLogoAulappRecovery;
    public final MaterialTextView mtvInformationRecovery;
    public final MaterialTextView mtvTextTitleRecovery;
    public final MaterialTextView mtvVersionAppRecovery;
    private final RelativeLayout rootView;
    public final ScrollView scrollView;
    public final TextInputEditText tietTextInputUserRecovery;
    public final TextInputLayout tilTextInputUserRecovery;

    private FragmentPasswordRecoverBinding(RelativeLayout relativeLayout, GeneralTextInputBinding generalTextInputBinding, PrimaryButtonBinding primaryButtonBinding, ImageView imageView, ImageView imageView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, ScrollView scrollView, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        this.rootView = relativeLayout;
        this.includeGeneralTextInputUserRecovery = generalTextInputBinding;
        this.includePrimaryButtonRecovery = primaryButtonBinding;
        this.ivImageRecovery = imageView;
        this.ivLogoAulappRecovery = imageView2;
        this.mtvInformationRecovery = materialTextView;
        this.mtvTextTitleRecovery = materialTextView2;
        this.mtvVersionAppRecovery = materialTextView3;
        this.scrollView = scrollView;
        this.tietTextInputUserRecovery = textInputEditText;
        this.tilTextInputUserRecovery = textInputLayout;
    }

    public static FragmentPasswordRecoverBinding bind(View view) {
        int i = R.id.include_general_text_input_user_recovery;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_general_text_input_user_recovery);
        if (findChildViewById != null) {
            GeneralTextInputBinding bind = GeneralTextInputBinding.bind(findChildViewById);
            i = R.id.include_primary_button_recovery;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_primary_button_recovery);
            if (findChildViewById2 != null) {
                PrimaryButtonBinding bind2 = PrimaryButtonBinding.bind(findChildViewById2);
                i = R.id.iv_image_recovery;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_image_recovery);
                if (imageView != null) {
                    i = R.id.iv_logo_aulapp_recovery;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_aulapp_recovery);
                    if (imageView2 != null) {
                        i = R.id.mtv_information_recovery;
                        MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.mtv_information_recovery);
                        if (materialTextView != null) {
                            i = R.id.mtv_text_title_recovery;
                            MaterialTextView materialTextView2 = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.mtv_text_title_recovery);
                            if (materialTextView2 != null) {
                                i = R.id.mtv_version_app_recovery;
                                MaterialTextView materialTextView3 = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.mtv_version_app_recovery);
                                if (materialTextView3 != null) {
                                    i = R.id.scrollView;
                                    ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                    if (scrollView != null) {
                                        i = R.id.tiet_text_input_user_recovery;
                                        TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.tiet_text_input_user_recovery);
                                        if (textInputEditText != null) {
                                            i = R.id.til_text_input_user_recovery;
                                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.til_text_input_user_recovery);
                                            if (textInputLayout != null) {
                                                return new FragmentPasswordRecoverBinding((RelativeLayout) view, bind, bind2, imageView, imageView2, materialTextView, materialTextView2, materialTextView3, scrollView, textInputEditText, textInputLayout);
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

    public static FragmentPasswordRecoverBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_password_recover, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
