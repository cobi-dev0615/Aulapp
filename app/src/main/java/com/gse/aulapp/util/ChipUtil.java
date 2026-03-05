package com.gse.aulapp.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/ChipUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ChipUtil {
    private static final String ALL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/gse/aulapp/util/ChipUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "ALL", BuildConfig.FLAVOR, "getALL", "()Ljava/lang/String;", "ALL_ID", BuildConfig.FLAVOR, "buildChip", "Lcom/google/android/material/chip/Chip;", "chipName", "context", "Landroid/content/Context;", "idChip", "updateColorChipStatus", BuildConfig.FLAVOR, "chip", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Chip buildChip(String chipName, Context context, int idChip) {
            Intrinsics.checkNotNullParameter(chipName, "chipName");
            Intrinsics.checkNotNullParameter(context, "context");
            Chip chip = new Chip(context);
            View inflate = LayoutInflater.from(context).inflate(R.layout.chip_item, (ViewGroup) null, false);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            Drawable chipDrawable = ((Chip) inflate).getChipDrawable();
            Intrinsics.checkNotNull(chipDrawable, "null cannot be cast to non-null type com.google.android.material.chip.ChipDrawable");
            chip.setChipDrawable((ChipDrawable) chipDrawable);
            chip.setId(idChip);
            chip.setText(chipName);
            chip.setTextColor(ContextCompat.getColor(context, R.color.white));
            chip.setEnsureMinTouchTargetSize(false);
            chip.setBackgroundColor(ContextCompat.getColor(context, R.color.dark_chip));
            chip.setChipIconVisible(false);
            chip.setClickable(true);
            return chip;
        }

        public final String getALL() {
            return ChipUtil.ALL;
        }

        public final void updateColorChipStatus(Chip chip) {
            Intrinsics.checkNotNullParameter(chip, "chip");
            if (chip.isChecked()) {
                chip.setChipBackgroundColorResource(R.color.dark_blue);
            } else {
                chip.setChipBackgroundColorResource(R.color.dark_chip);
            }
        }

        private Companion() {
        }
    }

    static {
        String string = GeneralApp.INSTANCE.getInstance().getString(R.string.chip_all);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        ALL = string;
    }
}
