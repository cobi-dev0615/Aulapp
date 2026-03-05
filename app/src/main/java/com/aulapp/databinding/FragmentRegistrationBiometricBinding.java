package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class FragmentRegistrationBiometricBinding {
    public final CardView containerDetailUser;
    public final ImageView imgHandType;
    public final ImageView imgRol;
    public final PrimaryButtonBinding includePrimaryButtonBiometricRegistration;
    private final FrameLayout rootView;
    public final TextView textHandIndicator;
    public final TextView txtTypeProcessBiometrics;
    public final TextView txtUserEmail;
    public final TextView txtUserName;
    public final TextView txtUserNumberDocument;
    public final TextView txtUserRol;
    public final TextView txtUserTypeDocument;

    private FragmentRegistrationBiometricBinding(FrameLayout frameLayout, CardView cardView, ImageView imageView, ImageView imageView2, PrimaryButtonBinding primaryButtonBinding, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.rootView = frameLayout;
        this.containerDetailUser = cardView;
        this.imgHandType = imageView;
        this.imgRol = imageView2;
        this.includePrimaryButtonBiometricRegistration = primaryButtonBinding;
        this.textHandIndicator = textView;
        this.txtTypeProcessBiometrics = textView2;
        this.txtUserEmail = textView3;
        this.txtUserName = textView4;
        this.txtUserNumberDocument = textView5;
        this.txtUserRol = textView6;
        this.txtUserTypeDocument = textView7;
    }

    public static FragmentRegistrationBiometricBinding bind(View view) {
        int i = R.id.container_detail_user;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.container_detail_user);
        if (cardView != null) {
            i = R.id.img_hand_type;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, R.id.img_hand_type);
            if (imageView != null) {
                i = R.id.img_rol;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, R.id.img_rol);
                if (imageView2 != null) {
                    i = R.id.include_primary_button_biometric_registration;
                    View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_primary_button_biometric_registration);
                    if (findChildViewById != null) {
                        PrimaryButtonBinding bind = PrimaryButtonBinding.bind(findChildViewById);
                        i = R.id.text_hand_indicator;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.text_hand_indicator);
                        if (textView != null) {
                            i = R.id.txt_type_process_biometrics;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_type_process_biometrics);
                            if (textView2 != null) {
                                i = R.id.txt_user_email;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_user_email);
                                if (textView3 != null) {
                                    i = R.id.txt_user_name;
                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_user_name);
                                    if (textView4 != null) {
                                        i = R.id.txt_user_number_document;
                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_user_number_document);
                                        if (textView5 != null) {
                                            i = R.id.txt_user_rol;
                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_user_rol);
                                            if (textView6 != null) {
                                                i = R.id.txt_user_type_document;
                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(view, R.id.txt_user_type_document);
                                                if (textView7 != null) {
                                                    return new FragmentRegistrationBiometricBinding((FrameLayout) view, cardView, imageView, imageView2, bind, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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

    public static FragmentRegistrationBiometricBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_registration_biometric, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}
