package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class FragmentLoginBinding {
    public final GeneralTextInputBinding includeGeneralTextInputUserLogin;
    public final PrimaryButtonBinding includePrimaryButtonLogin;
    public final ImageView ivIconRecoveryLogin;
    public final ImageView ivImageLogin;
    public final ImageView ivLogoAulappLogin;
    public final RelativeLayout layoutContainerWidger;
    public final LinearLayout llRecoveryLogin;
    public final MaterialTextView mtvInformationLogin;
    public final MaterialTextView mtvLinkRecoveryPasswordLogin;
    public final MaterialTextView mtvVersionAppLogin;
    private final RelativeLayout rootView;
    public final ScrollView scrollView;
    public final TextInputEditText tietTextInputPasswordLogin;
    public final TextInputEditText tietTextInputUserLogin;
    public final TextInputLayout tilTextInputPasswordLogin;
    public final TextInputLayout tilTextInputUserLogin;

    private FragmentLoginBinding(RelativeLayout relativeLayout, GeneralTextInputBinding generalTextInputBinding, PrimaryButtonBinding primaryButtonBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout2, LinearLayout linearLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, ScrollView scrollView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        this.rootView = relativeLayout;
        this.includeGeneralTextInputUserLogin = generalTextInputBinding;
        this.includePrimaryButtonLogin = primaryButtonBinding;
        this.ivIconRecoveryLogin = imageView;
        this.ivImageLogin = imageView2;
        this.ivLogoAulappLogin = imageView3;
        this.layoutContainerWidger = relativeLayout2;
        this.llRecoveryLogin = linearLayout;
        this.mtvInformationLogin = materialTextView;
        this.mtvLinkRecoveryPasswordLogin = materialTextView2;
        this.mtvVersionAppLogin = materialTextView3;
        this.scrollView = scrollView;
        this.tietTextInputPasswordLogin = textInputEditText;
        this.tietTextInputUserLogin = textInputEditText2;
        this.tilTextInputPasswordLogin = textInputLayout;
        this.tilTextInputUserLogin = textInputLayout2;
    }

    public static FragmentLoginBinding bind(View view) {
        int i = R.id.include_general_text_input_user_login;
        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_general_text_input_user_login);
        if (findChildViewById != null) {
            GeneralTextInputBinding bind = GeneralTextInputBinding.bind(findChildViewById);
            i = R.id.include_primary_button_login;
            View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_primary_button_login);
            if (findChildViewById2 != null) {
                PrimaryButtonBinding bind2 = PrimaryButtonBinding.bind(findChildViewById2);
                i = R.id.iv_icon_recovery_login;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_icon_recovery_login);
                if (imageView != null) {
                    i = R.id.iv_image_login;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_image_login);
                    if (imageView2 != null) {
                        i = R.id.iv_logo_aulapp_login;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, R.id.iv_logo_aulapp_login);
                        if (imageView3 != null) {
                            i = R.id.layoutContainerWidger;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layoutContainerWidger);
                            if (relativeLayout != null) {
                                i = R.id.ll_recovery_login;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_recovery_login);
                                if (linearLayout != null) {
                                    i = R.id.mtv_information_login;
                                    MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.mtv_information_login);
                                    if (materialTextView != null) {
                                        i = R.id.mtv_link_recovery_password_login;
                                        MaterialTextView materialTextView2 = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.mtv_link_recovery_password_login);
                                        if (materialTextView2 != null) {
                                            i = R.id.mtv_version_app_login;
                                            MaterialTextView materialTextView3 = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.mtv_version_app_login);
                                            if (materialTextView3 != null) {
                                                i = R.id.scrollView;
                                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                if (scrollView != null) {
                                                    i = R.id.tiet_text_input_password_login;
                                                    TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.tiet_text_input_password_login);
                                                    if (textInputEditText != null) {
                                                        i = R.id.tiet_text_input_user_login;
                                                        TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.tiet_text_input_user_login);
                                                        if (textInputEditText2 != null) {
                                                            i = R.id.til_text_input_password_login;
                                                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.til_text_input_password_login);
                                                            if (textInputLayout != null) {
                                                                i = R.id.til_text_input_user_login;
                                                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.til_text_input_user_login);
                                                                if (textInputLayout2 != null) {
                                                                    return new FragmentLoginBinding((RelativeLayout) view, bind, bind2, imageView, imageView2, imageView3, relativeLayout, linearLayout, materialTextView, materialTextView2, materialTextView3, scrollView, textInputEditText, textInputEditText2, textInputLayout, textInputLayout2);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_login, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
