package com.gse.aulapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.gse.aulapp.R;

/* loaded from: classes.dex */
public final class FragmentClassBinding {
    public final MaterialButton btnCalculate;
    public final MaterialButton btnCloseNfc;
    public final MaterialButton btnStart;
    public final MaterialButton btnStop;
    public final TextView btnTestFilter;
    public final MaterialButton btnTodayClass;
    public final ConstraintLayout classFragment;
    private final ConstraintLayout rootView;
    public final RecyclerView rvClass;

    private FragmentClassBinding(ConstraintLayout constraintLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, TextView textView, MaterialButton materialButton5, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.btnCalculate = materialButton;
        this.btnCloseNfc = materialButton2;
        this.btnStart = materialButton3;
        this.btnStop = materialButton4;
        this.btnTestFilter = textView;
        this.btnTodayClass = materialButton5;
        this.classFragment = constraintLayout2;
        this.rvClass = recyclerView;
    }

    public static FragmentClassBinding bind(View view) {
        int i = R.id.btn_calculate;
        MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_calculate);
        if (materialButton != null) {
            i = R.id.btn_close_nfc;
            MaterialButton materialButton2 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_close_nfc);
            if (materialButton2 != null) {
                i = R.id.btn_start;
                MaterialButton materialButton3 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_start);
                if (materialButton3 != null) {
                    i = R.id.btn_stop;
                    MaterialButton materialButton4 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_stop);
                    if (materialButton4 != null) {
                        i = R.id.btnTestFilter;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, R.id.btnTestFilter);
                        if (textView != null) {
                            i = R.id.btn_today_class;
                            MaterialButton materialButton5 = (MaterialButton) ViewBindings.findChildViewById(view, R.id.btn_today_class);
                            if (materialButton5 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                i = R.id.rv_class;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, R.id.rv_class);
                                if (recyclerView != null) {
                                    return new FragmentClassBinding(constraintLayout, materialButton, materialButton2, materialButton3, materialButton4, textView, materialButton5, constraintLayout, recyclerView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentClassBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_class, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
