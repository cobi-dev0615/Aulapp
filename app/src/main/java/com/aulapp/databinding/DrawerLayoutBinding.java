package com.gse.aulapp.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class DrawerLayoutBinding {
    public final CardView cardDrawe1;
    public final CardView cardDrawe2;
    public final ConstraintLayout clContainer;
    public final Button drawerButtonHistoryHour;
    public final Button drawerButtonHistoryRide;
    public final Button drawerButtonScheduleExams;
    public final Button drawerMenuButton;
    public final ItemTextDrawerMenuBinding includeDrawerMenuAddressCea;
    public final ItemTextDrawerMenuBinding includeDrawerMenuPhoneCea;
    public final LinearLayout linearDrawerTitle;
    private final ConstraintLayout rootView;
    public final TextView textDrawerAppVersion;
    public final TextView textDrawerMainCc;
    public final TextView textDrawerMainEmailInstructor;
    public final TextView textDrawerMainInstructor;
    public final TextView textDrawerMenuDocumentNumberInstructor;
    public final TextView textDrawerTitle;

    private DrawerLayoutBinding(ConstraintLayout constraintLayout, CardView cardView, CardView cardView2, ConstraintLayout constraintLayout2, Button button, Button button2, Button button3, Button button4, ItemTextDrawerMenuBinding itemTextDrawerMenuBinding, ItemTextDrawerMenuBinding itemTextDrawerMenuBinding2, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.cardDrawe1 = cardView;
        this.cardDrawe2 = cardView2;
        this.clContainer = constraintLayout2;
        this.drawerButtonHistoryHour = button;
        this.drawerButtonHistoryRide = button2;
        this.drawerButtonScheduleExams = button3;
        this.drawerMenuButton = button4;
        this.includeDrawerMenuAddressCea = itemTextDrawerMenuBinding;
        this.includeDrawerMenuPhoneCea = itemTextDrawerMenuBinding2;
        this.linearDrawerTitle = linearLayout;
        this.textDrawerAppVersion = textView;
        this.textDrawerMainCc = textView2;
        this.textDrawerMainEmailInstructor = textView3;
        this.textDrawerMainInstructor = textView4;
        this.textDrawerMenuDocumentNumberInstructor = textView5;
        this.textDrawerTitle = textView6;
    }

    public static DrawerLayoutBinding bind(View view) {
        int i = R.id.card_drawe_1;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, R.id.card_drawe_1);
        if (cardView != null) {
            i = R.id.card_drawe_2;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, R.id.card_drawe_2);
            if (cardView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.drawer_button_history_hour;
                Button button = (Button) ViewBindings.findChildViewById(view, R.id.drawer_button_history_hour);
                if (button != null) {
                    i = R.id.drawer_button_history_ride;
                    Button button2 = (Button) ViewBindings.findChildViewById(view, R.id.drawer_button_history_ride);
                    if (button2 != null) {
                        i = R.id.drawer_button_schedule_Exams;
                        Button button3 = (Button) ViewBindings.findChildViewById(view, R.id.drawer_button_schedule_Exams);
                        if (button3 != null) {
                            i = R.id.drawer_menu_button;
                            Button button4 = (Button) ViewBindings.findChildViewById(view, R.id.drawer_menu_button);
                            if (button4 != null) {
                                i = R.id.include_drawer_menu_address_cea;
                                View findChildViewById = ViewBindings.findChildViewById(view, R.id.include_drawer_menu_address_cea);
                                if (findChildViewById != null) {
                                    ItemTextDrawerMenuBinding bind = ItemTextDrawerMenuBinding.bind(findChildViewById);
                                    i = R.id.include_drawer_menu_phone_cea;
                                    View findChildViewById2 = ViewBindings.findChildViewById(view, R.id.include_drawer_menu_phone_cea);
                                    if (findChildViewById2 != null) {
                                        ItemTextDrawerMenuBinding bind2 = ItemTextDrawerMenuBinding.bind(findChildViewById2);
                                        i = R.id.linear_drawer_title;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, R.id.linear_drawer_title);
                                        if (linearLayout != null) {
                                            i = R.id.text_drawer_app_version;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.text_drawer_app_version);
                                            if (textView != null) {
                                                i = R.id.text_drawer_main_cc;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, R.id.text_drawer_main_cc);
                                                if (textView2 != null) {
                                                    i = R.id.text_drawer_main_email_instructor;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, R.id.text_drawer_main_email_instructor);
                                                    if (textView3 != null) {
                                                        i = R.id.text_drawer_main_instructor;
                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, R.id.text_drawer_main_instructor);
                                                        if (textView4 != null) {
                                                            i = R.id.text_drawer_menu_document_number_instructor;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, R.id.text_drawer_menu_document_number_instructor);
                                                            if (textView5 != null) {
                                                                i = R.id.text_drawer_title;
                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, R.id.text_drawer_title);
                                                                if (textView6 != null) {
                                                                    return new DrawerLayoutBinding(constraintLayout, cardView, cardView2, constraintLayout, button, button2, button3, button4, bind, bind2, linearLayout, textView, textView2, textView3, textView4, textView5, textView6);
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
}
