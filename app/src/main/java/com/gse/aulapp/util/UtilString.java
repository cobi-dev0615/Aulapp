package com.gse.aulapp.util;

import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/UtilString;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUtilString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtilString.kt\ncom/gse/aulapp/util/UtilString\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,161:1\n108#2:162\n80#2,22:163\n*S KotlinDebug\n*F\n+ 1 UtilString.kt\ncom/gse/aulapp/util/UtilString\n*L\n15#1:162\n15#1:163,22\n*E\n"})
/* loaded from: classes.dex */
public abstract class UtilString {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/gse/aulapp/util/UtilString$Companion;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "chain", BuildConfig.FLAVOR, "isEmpty", "(Ljava/lang/String;)Z", "originalText", "replacementText", "replaceTextInParentheses", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "exceptionMessage", "extractErrorMessage", "(Ljava/lang/String;)Ljava/lang/String;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nUtilString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtilString.kt\ncom/gse/aulapp/util/UtilString$Companion\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n108#2:162\n80#2,22:163\n1863#3,2:185\n*S KotlinDebug\n*F\n+ 1 UtilString.kt\ncom/gse/aulapp/util/UtilString$Companion\n*L\n125#1:162\n125#1:163,22\n132#1:185,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String extractErrorMessage(String exceptionMessage) {
            int indexOf$default;
            Intrinsics.checkNotNullParameter(exceptionMessage, "exceptionMessage");
            try {
                indexOf$default = StringsKt.indexOf$default((CharSequence) exceptionMessage, "{", 0, false, 6, (Object) null);
                if (indexOf$default == -1) {
                    return null;
                }
                String substring = exceptionMessage.substring(indexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                return new JSONObject(substring).getJSONObject("result").getString("message");
            } catch (Exception unused) {
                return exceptionMessage;
            }
        }

        public final boolean isEmpty(String chain) {
            if (chain == null) {
                return true;
            }
            int length = chain.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) chain.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            return chain.subSequence(i, length + 1).toString().length() == 0;
        }

        public final String replaceTextInParentheses(String originalText, String replacementText) {
            Intrinsics.checkNotNullParameter(originalText, "originalText");
            Intrinsics.checkNotNullParameter(replacementText, "replacementText");
            return new Regex("\\((.*?)\\)").replace(originalText, "(" + replacementText + ")");
        }

        private Companion() {
        }
    }
}
