package com.gse.aulapp.model.dto;

import android.os.Parcelable;
import androidx.annotation.Keep;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/gse/aulapp/model/dto/GeneralSessionDto;", "Landroid/os/Parcelable;", "id", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class GeneralSessionDto implements Parcelable {
    private transient String id;

    public GeneralSessionDto(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }
}
