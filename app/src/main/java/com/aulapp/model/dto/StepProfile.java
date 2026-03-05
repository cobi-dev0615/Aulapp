package com.gse.aulapp.model.dto;

import com.gse.aulapp.model.enumerate.EnumIdStepperMenu;
import com.gse.aulapp.model.enumerate.EnumStatusStepSession;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/gse/aulapp/model/dto/StepProfile;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/enumerate/EnumStatusStepSession;", "status", BuildConfig.FLAVOR, "text", BuildConfig.FLAVOR, "icon", "Lcom/gse/aulapp/model/enumerate/EnumIdStepperMenu;", "id", "<init>", "(Lcom/gse/aulapp/model/enumerate/EnumStatusStepSession;Ljava/lang/String;ILcom/gse/aulapp/model/enumerate/EnumIdStepperMenu;)V", "Lcom/gse/aulapp/model/enumerate/EnumStatusStepSession;", "getStatus", "()Lcom/gse/aulapp/model/enumerate/EnumStatusStepSession;", "setStatus", "(Lcom/gse/aulapp/model/enumerate/EnumStatusStepSession;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "I", "getIcon", "()I", "setIcon", "(I)V", "Lcom/gse/aulapp/model/enumerate/EnumIdStepperMenu;", "getId", "()Lcom/gse/aulapp/model/enumerate/EnumIdStepperMenu;", "setId", "(Lcom/gse/aulapp/model/enumerate/EnumIdStepperMenu;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StepProfile {
    private int icon;
    private EnumIdStepperMenu id;
    private EnumStatusStepSession status;
    private String text;

    public StepProfile(EnumStatusStepSession status, String text, int i, EnumIdStepperMenu id) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(id, "id");
        this.status = status;
        this.text = text;
        this.icon = i;
        this.id = id;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final EnumIdStepperMenu getId() {
        return this.id;
    }

    public final EnumStatusStepSession getStatus() {
        return this.status;
    }

    public final String getText() {
        return this.text;
    }
}
