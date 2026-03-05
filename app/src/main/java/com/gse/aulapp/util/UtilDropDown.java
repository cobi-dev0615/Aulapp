package com.gse.aulapp.util;

import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class UtilDropDown {
    public static void changeStateDropdown(AutoCompleteTextView autoCompleteTextView) {
        ListView listView;
        if (autoCompleteTextView != null) {
            try {
                if (!autoCompleteTextView.isPopupShowing()) {
                    autoCompleteTextView.dismissDropDown();
                    return;
                }
                ListPopupWindow popup = getPopup(autoCompleteTextView);
                if (popup == null || (listView = popup.getListView()) == null) {
                    return;
                }
                int i = 0;
                if (listView.getChildCount() > 0) {
                    int i2 = 0;
                    while (i < listView.getChildCount()) {
                        View childAt = listView.getChildAt(i);
                        if (childAt != null) {
                            i2 += childAt.getMeasuredHeight();
                        }
                        i++;
                    }
                    i = i2;
                }
                if (i == 0) {
                    i = popup.getListView().getMeasuredHeight();
                }
                if (i > 0) {
                    autoCompleteTextView.setDropDownHeight(i);
                    autoCompleteTextView.showDropDown();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static ListPopupWindow getPopup(AutoCompleteTextView autoCompleteTextView) {
        try {
            Field declaredField = AutoCompleteTextView.class.getDeclaredField("mPopup");
            declaredField.setAccessible(true);
            return (ListPopupWindow) declaredField.get(autoCompleteTextView);
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }
}
