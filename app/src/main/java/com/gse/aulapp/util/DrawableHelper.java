package com.gse.aulapp.util;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public class DrawableHelper {
    private int mColor;
    Context mContext;
    private Drawable mDrawable;
    private Drawable mWrappedDrawable;

    public DrawableHelper(Context context) {
        this.mContext = context;
    }

    public static DrawableHelper withContext(Context context) {
        return new DrawableHelper(context);
    }

    public void applyTo(ImageView imageView) {
        Drawable drawable = this.mWrappedDrawable;
        if (drawable == null) {
            throw new NullPointerException("É preciso chamar o método tint()");
        }
        imageView.setImageDrawable(drawable);
    }

    public void applyToEndIconTintTextInputLayout(TextInputLayout textInputLayout) {
        Drawable drawable = this.mWrappedDrawable;
        if (drawable != null) {
            textInputLayout.setEndIconDrawable(drawable);
        } else {
            this.mDrawable = textInputLayout.getEndIconDrawable();
            tint();
        }
    }

    public DrawableHelper tint() {
        Drawable drawable = this.mDrawable;
        if (drawable == null) {
            throw new NullPointerException("É preciso informar o recurso drawable pelo método withDrawable()");
        }
        if (this.mColor == 0) {
            throw new IllegalStateException("É necessário informar a cor a ser definida pelo método withColor()");
        }
        Drawable mutate = drawable.mutate();
        this.mWrappedDrawable = mutate;
        Drawable wrap = DrawableCompat.wrap(mutate);
        this.mWrappedDrawable = wrap;
        DrawableCompat.setTint(wrap, this.mColor);
        DrawableCompat.setTintMode(this.mWrappedDrawable, PorterDuff.Mode.SRC_IN);
        return this;
    }

    public DrawableHelper withColor(int i) {
        this.mColor = ContextCompat.getColor(this.mContext, i);
        return this;
    }

    public DrawableHelper withDrawable(int i) {
        this.mDrawable = ContextCompat.getDrawable(this.mContext, i);
        return this;
    }

    public void applyTo(TextInputLayout textInputLayout) {
        Drawable drawable = this.mWrappedDrawable;
        if (drawable != null) {
            textInputLayout.setStartIconDrawable(drawable);
            return;
        }
        throw new NullPointerException("É preciso chamar o método tint()");
    }

    public void applyTo(CardView cardView) {
        cardView.setCardBackgroundColor(this.mColor);
    }
}
