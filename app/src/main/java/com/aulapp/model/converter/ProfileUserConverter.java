package com.gse.aulapp.model.converter;

import android.content.Context;
import co.ceduladigital.sdk.t1;
import com.gse.aulapp.R;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/model/converter/ProfileUserConverter;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ProfileUserConverter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/gse/aulapp/model/converter/ProfileUserConverter$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "getProfileConverter", "Lcom/gse/aulapp/model/enumerate/EnumUserProfile;", "context", "Landroid/content/Context;", "profile", BuildConfig.FLAVOR, "getProfileReverse", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nProfileUserConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProfileUserConverter.kt\ncom/gse/aulapp/model/converter/ProfileUserConverter$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,32:1\n13409#2:33\n13410#2:35\n1#3:34\n*S KotlinDebug\n*F\n+ 1 ProfileUserConverter.kt\ncom/gse/aulapp/model/converter/ProfileUserConverter$Companion\n*L\n14#1:33\n14#1:35\n*E\n"})
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumUserProfile.values().length];
                try {
                    iArr[EnumUserProfile.INSTRUCTOR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumUserProfile.APPRENTICE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumUserProfile getProfileConverter(Context context, String profile) {
            EnumUserProfile enumUserProfile = EnumUserProfile.NONE;
            for (EnumUserProfile enumUserProfile2 : EnumUserProfile.values()) {
                if (Intrinsics.areEqual(context != null ? enumUserProfile2.name(context) : null, profile)) {
                    enumUserProfile = enumUserProfile2;
                }
            }
            return enumUserProfile;
        }

        public final String getProfileReverse(Context context, EnumUserProfile profile) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(profile, "profile");
            int i = WhenMappings.$EnumSwitchMapping$0[profile.ordinal()];
            if (i == 1) {
                String string = context.getString(R.string.enum_user_profile_instructor);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            }
            if (i != 2) {
                return new t1(21).toString();
            }
            String string2 = context.getString(R.string.enum_user_profile_apprentice);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }

        private Companion() {
        }
    }
}
