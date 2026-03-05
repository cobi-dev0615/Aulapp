package com.gse.aulapp.util;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.gse.aulapp.R;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/InputUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class InputUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Je\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/gse/aulapp/util/InputUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/google/android/material/textfield/TextInputLayout;", "textInputLayout", BuildConfig.FLAVOR, "startIconResource", BuildConfig.FLAVOR, "startIconDescription", "startIconColorResource", "endIconMode", "endIconColorResource", "inputType", "hint", BuildConfig.FLAVOR, "customTextInputLayout", "(Landroid/content/Context;Lcom/google/android/material/textfield/TextInputLayout;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "emailTextInputLayout", "(Landroid/content/Context;Lcom/google/android/material/textfield/TextInputLayout;)V", "passwordTextInputLayout", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void customTextInputLayout(Context context, TextInputLayout textInputLayout, Integer startIconResource, String startIconDescription, Integer startIconColorResource, Integer endIconMode, Integer endIconColorResource, Integer inputType, String hint) {
            if (startIconResource != null && startIconColorResource != null) {
                DrawableHelper.withContext(context).withColor(startIconColorResource.intValue()).withDrawable(startIconResource.intValue()).tint().applyTo(textInputLayout);
                if (startIconDescription != null) {
                    textInputLayout.setStartIconContentDescription(startIconDescription);
                }
            }
            textInputLayout.setEndIconMode(endIconMode != null ? endIconMode.intValue() : 0);
            if (textInputLayout.getEndIconDrawable() != null && endIconColorResource != null) {
                textInputLayout.setEndIconTintList(ColorStateList.valueOf(endIconColorResource.intValue()));
                DrawableHelper.withContext(context).withColor(endIconColorResource.intValue()).applyToEndIconTintTextInputLayout(textInputLayout);
            }
            EditText editText = textInputLayout.getEditText();
            if (editText != null) {
                editText.getInputType();
            }
            EditText editText2 = textInputLayout.getEditText();
            if (editText2 != null) {
                if (hint == null) {
                    hint = BuildConfig.FLAVOR;
                }
                editText2.setHint(hint);
            }
        }

        public final void emailTextInputLayout(Context context, TextInputLayout textInputLayout) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(textInputLayout, "textInputLayout");
            customTextInputLayout(context, textInputLayout, Integer.valueOf(R.drawable.ic_person), context.getString(R.string.content_description_icon_user_input), Integer.valueOf(R.color.grey), 0, Integer.valueOf(R.color.dark_grey), 33, null);
        }

        public final void passwordTextInputLayout(Context context, TextInputLayout textInputLayout) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(textInputLayout, "textInputLayout");
            customTextInputLayout(context, textInputLayout, Integer.valueOf(R.drawable.ic_password), context.getString(R.string.content_description_icon_password_input), Integer.valueOf(R.color.grey), 1, Integer.valueOf(R.color.dark_grey), 129, null);
        }

        private Companion() {
        }
    }
}
