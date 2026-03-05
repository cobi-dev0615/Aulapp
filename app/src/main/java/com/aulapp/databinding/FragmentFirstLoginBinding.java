package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class FragmentFirstLoginBinding {
    public final ConstraintLayout constraintAllMenu;
    public final ConstraintLayout constraintMenuCea;
    public final ConstraintLayout constraintMenuLogin;
    public final ConstraintLayout constraintMenuPassword;
    public final RelativeLayout firstLoginFragment;
    public final GeneralDropdownBinding includeDropdownCea;
    public final PrimaryButtonBinding includePrimaryButtonLogin;
    public final ImageView ivIconRecoveryLogin;
    public final ImageView ivImageLogin;
    public final ImageView ivLogoAulappLogin;
    public final RelativeLayout layoutContainerWidger;
    public final LinearLayout llRecoveryLogin;
    public final MaterialTextView mtvLinkRecoveryPasswordLogin;
    public final MaterialTextView mtvVersionAppLogin;
    private final RelativeLayout rootView;
    public final ScrollView scrollView;
    public final TextInputEditText tietTextInputUserLogin;
    public final TextInputEditText tietTextInputUserPassword;
    public final TextInputLayout tilTextInputUserLogin;
    public final TextInputLayout tilTextInputUserPassword;
    public final TextView tvHelperCea;
    public final TextView tvHelperDocumentNumber;
    public final TextView tvHelperPassword;
    public final TextView tvInformationLogin;

    private FragmentFirstLoginBinding(RelativeLayout relativeLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, RelativeLayout relativeLayout2, GeneralDropdownBinding generalDropdownBinding, PrimaryButtonBinding primaryButtonBinding, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout3, LinearLayout linearLayout, MaterialTextView materialTextView, MaterialTextView materialTextView2, ScrollView scrollView, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = relativeLayout;
        this.constraintAllMenu = constraintLayout;
        this.constraintMenuCea = constraintLayout2;
        this.constraintMenuLogin = constraintLayout3;
        this.constraintMenuPassword = constraintLayout4;
        this.firstLoginFragment = relativeLayout2;
        this.includeDropdownCea = generalDropdownBinding;
        this.includePrimaryButtonLogin = primaryButtonBinding;
        this.ivIconRecoveryLogin = imageView;
        this.ivImageLogin = imageView2;
        this.ivLogoAulappLogin = imageView3;
        this.layoutContainerWidger = relativeLayout3;
        this.llRecoveryLogin = linearLayout;
        this.mtvLinkRecoveryPasswordLogin = materialTextView;
        this.mtvVersionAppLogin = materialTextView2;
        this.scrollView = scrollView;
        this.tietTextInputUserLogin = textInputEditText;
        this.tietTextInputUserPassword = textInputEditText2;
        this.tilTextInputUserLogin = textInputLayout;
        this.tilTextInputUserPassword = textInputLayout2;
        this.tvHelperCea = textView;
        this.tvHelperDocumentNumber = textView2;
        this.tvHelperPassword = textView3;
        this.tvInformationLogin = textView4;
    }

    public static FragmentFirstLoginBinding bind(View view) {
        int i = R.id.constraint_all_menu;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraint_all_menu);
        if (constraintLayout != null) {
            i = R.id.constraint_menu_cea;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraint_menu_cea);
            if (constraintLayout2 != null) {
                i = R.id.constraint_menu_login;
                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraint_menu_login);
                if (constraintLayout3 != null) {
                    i = R.id.constraint_menu_password;
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, R.id.constraint_menu_password);
                    if (constraintLayout4 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i = R.id.include_dropdown_cea;
                        View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_dropdown_cea);
                        if (findChildViewById != null) {
                            GeneralDropdownBinding bind = GeneralDropdownBinding.bind(findChildViewById);
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
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, R.id.layoutContainerWidger);
                                            if (relativeLayout2 != null) {
                                                i = R.id.ll_recovery_login;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.ll_recovery_login);
                                                if (linearLayout != null) {
                                                    i = R.id.mtv_link_recovery_password_login;
                                                    MaterialTextView materialTextView = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.mtv_link_recovery_password_login);
                                                    if (materialTextView != null) {
                                                        i = R.id.mtv_version_app_login;
                                                        MaterialTextView materialTextView2 = (MaterialTextView) ViewBindings.findChildViewById(view, R.id.mtv_version_app_login);
                                                        if (materialTextView2 != null) {
                                                            i = R.id.scrollView;
                                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, R.id.scrollView);
                                                            if (scrollView != null) {
                                                                i = R.id.tiet_text_input_user_login;
                                                                TextInputEditText textInputEditText = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.tiet_text_input_user_login);
                                                                if (textInputEditText != null) {
                                                                    i = R.id.tiet_text_input_user_password;
                                                                    TextInputEditText textInputEditText2 = (TextInputEditText) ViewBindings.findChildViewById(view, R.id.tiet_text_input_user_password);
                                                                    if (textInputEditText2 != null) {
                                                                        i = R.id.til_text_input_user_login;
                                                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.til_text_input_user_login);
                                                                        if (textInputLayout != null) {
                                                                            i = R.id.til_text_input_user_password;
                                                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, R.id.til_text_input_user_password);
                                                                            if (textInputLayout2 != null) {
                                                                                i = R.id.tv_helper_cea;
                                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.tv_helper_cea);
                                                                                if (textView != null) {
                                                                                    i = R.id.tv_helper_document_number;
                                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_helper_document_number);
                                                                                    if (textView2 != null) {
                                                                                        i = R.id.tv_helper_password;
                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_helper_password);
                                                                                        if (textView3 != null) {
                                                                                            i = R.id.tv_information_login;
                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.tv_information_login);
                                                                                            if (textView4 != null) {
                                                                                                return new FragmentFirstLoginBinding(relativeLayout, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, relativeLayout, bind, bind2, imageView, imageView2, imageView3, relativeLayout2, linearLayout, materialTextView, materialTextView2, scrollView, textInputEditText, textInputEditText2, textInputLayout, textInputLayout2, textView, textView2, textView3, textView4);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentFirstLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_first_login, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
