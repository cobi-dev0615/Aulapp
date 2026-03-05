package com.gse.aulapp.feature.core.util;

import com.gse.aulapp.model.enumerate.EnumApps;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/feature/core/util/RandomControllerUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RandomControllerUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String tag = "RandomControllerUtil";

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/gse/aulapp/feature/core/util/RandomControllerUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "tag", BuildConfig.FLAVOR, "randomInit", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/enumerate/EnumApps;", "randomHandsVerify", "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumHandsAulapp randomHandsVerify() {
            int b = a.b(2);
            EnumHandsAulapp enumHandsAulapp = EnumHandsAulapp.LEFT;
            if (b == enumHandsAulapp.id()) {
                return enumHandsAulapp;
            }
            EnumHandsAulapp enumHandsAulapp2 = EnumHandsAulapp.RIGHT;
            enumHandsAulapp2.id();
            return enumHandsAulapp2;
        }

        public final List<EnumApps> randomInit() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(EnumApps.FACE);
            return arrayList;
        }

        private Companion() {
        }
    }
}
