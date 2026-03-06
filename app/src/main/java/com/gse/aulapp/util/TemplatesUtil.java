package com.gse.aulapp.util;

import android.content.Context;
import android.util.Base64;
import android.util.Pair;
import com.gse.aulapp.model.enumerate.EnumFinger;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.identy.enums.Finger;
import com.identy.enums.Hand;
import com.identy.enums.Template;
import com.karumi.dexter.BuildConfig;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/TemplatesUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class TemplatesUtil {
    private static final int base64encoding = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "TemplatesUtil";
    private static final Template template = Template.WSQ;

    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJK\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u000f\u0018\u00010\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015JW\u0010\u001c\u001a:\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\t\u0018\u00010\u0018j\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\t\u0018\u0001`\u001b2\u0006\u0010\u0013\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/gse/aulapp/util/TemplatesUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "validateExistExternalFolder", "(Landroid/content/Context;)Ljava/io/File;", BuildConfig.FLAVOR, "userId", "createFolderByTemplates", "(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;", "getFolderPathByUserId", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "Lcom/gse/aulapp/model/enumerate/EnumFinger;", "backendMap", "hand", "saveTemplateFromBackend", "(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;)Ljava/lang/String;", "Lcom/identy/enums/Hand;", "pathDocument", "Ljava/util/HashMap;", "Landroid/util/Pair;", "Lcom/identy/enums/Finger;", "Lkotlin/collections/HashMap;", "getTemplateData", "(Lcom/identy/enums/Hand;Ljava/lang/String;)Ljava/util/HashMap;", "validateExistsHands", "(Ljava/lang/String;)Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", BuildConfig.FLAVOR, "removeTemplates", "(Landroid/content/Context;)V", "TAG", "Ljava/lang/String;", BuildConfig.FLAVOR, "base64encoding", "I", "Lcom/identy/enums/Template;", "template", "Lcom/identy/enums/Template;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTemplatesUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TemplatesUtil.kt\ncom/gse/aulapp/util/TemplatesUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,349:1\n1863#2,2:350\n1279#2,2:352\n1293#2,4:354\n*S KotlinDebug\n*F\n+ 1 TemplatesUtil.kt\ncom/gse/aulapp/util/TemplatesUtil$Companion\n*L\n182#1:350,2\n313#1:352,2\n313#1:354,4\n*E\n"})
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class EntriesMappings {
            public static final /* synthetic */ EnumEntries<Finger> entries$0 = EnumEntriesKt.enumEntries(Finger.valuesCustom());
            public static final /* synthetic */ EnumEntries<Hand> entries$1 = EnumEntriesKt.enumEntries(Hand.valuesCustom());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final File validateExistExternalFolder(Context context) {
            File file = new File(String.valueOf(context.getExternalFilesDir("/IDENTY/")));
            if (!file.exists()) {
                file.mkdir();
            }
            File file2 = new File(file + "/TEMPLATES");
            if (!file2.exists()) {
                file2.mkdir();
            }
            return file2;
        }

        public final File createFolderByTemplates(Context context, String userId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(userId, "userId");
            File file = new File(validateExistExternalFolder(context), userId);
            if (!file.exists()) {
                file.mkdir();
            }
            return file;
        }

        public final String getFolderPathByUserId(Context context, String userId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(userId, "userId");
            String absolutePath = new File(validateExistExternalFolder(context), userId).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            return absolutePath;
        }

        public final HashMap<Pair<Hand, Finger>, String> getTemplateData(Hand hand, String pathDocument) {
            Intrinsics.checkNotNullParameter(hand, "hand");
            if (pathDocument != null && pathDocument.length() != 0) {
                try {
                    HashMap<Pair<Hand, Finger>, String> hashMap = new HashMap<>();
                    for (Finger finger : EntriesMappings.entries$0) {
                        if (finger != Finger.THUMB) {
                            File file = new File(pathDocument + "/" + hand + "-" + finger + ".WSQ");
                            if (file.exists()) {
                                hashMap.put(new Pair<>(hand, finger), file.toString());
                            }
                        }
                    }
                    return hashMap;
                } catch (Exception e) {
                    String unused = TemplatesUtil.TAG;
                    e.getMessage();
                }
            }
            return null;
        }

        public final void removeTemplates(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                File validateExistExternalFolder = validateExistExternalFolder(context);
                if (validateExistExternalFolder.exists()) {
                    validateExistExternalFolder.delete();
                }
            } catch (Exception e) {
                String unused = TemplatesUtil.TAG;
                e.toString();
            }
        }

        public final String saveTemplateFromBackend(Context context, Map<EnumHandsAulapp, Map<EnumFinger, String>> backendMap, String userId, EnumHandsAulapp hand) {
            byte[] bArr;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(hand, "hand");
            if (backendMap != null && !backendMap.isEmpty() && userId != null && userId.length() != 0) {
                try {
                    Intrinsics.checkNotNull(userId);
                    File createFolderByTemplates = createFolderByTemplates(context, userId);
                    for (EnumFinger enumFinger : EnumFinger.getEntries()) {
                        Map<EnumFinger, String> map = backendMap.get(hand);
                        String str = map != null ? map.get(enumFinger) : null;
                        File file = new File(createFolderByTemplates, hand.nameHand() + "-" + enumFinger.nameFinger() + "." + TemplatesUtil.template);
                        if (file.exists()) {
                            file.delete();
                        }
                        String unused = TemplatesUtil.TAG;
                        file.getName();
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        if (str != null) {
                            bArr = str.getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bArr, "getBytes(...)");
                        } else {
                            bArr = null;
                        }
                        fileOutputStream.write(Base64.decode(bArr, TemplatesUtil.base64encoding));
                        fileOutputStream.close();
                    }
                    return createFolderByTemplates.toString();
                } catch (Exception e) {
                    String unused2 = TemplatesUtil.TAG;
                    e.getMessage();
                }
            }
            return null;
        }

        public final EnumHandsAulapp validateExistsHands(String pathDocument) {
            EnumEntries<Hand> enumEntries = EntriesMappings.entries$1;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(10), 16));
            for (Object obj : enumEntries) {
                linkedHashMap.put(obj, Boolean.FALSE);
            }
            Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
            for (Hand hand : EntriesMappings.entries$1) {
                HashMap<Pair<Hand, Finger>, String> templateData = getTemplateData(hand, pathDocument);
                if (templateData != null && templateData.values().size() == 4) {
                    mutableMap.put(hand, Boolean.TRUE);
                }
            }
            Object obj2 = mutableMap.get(Hand.LEFT);
            Boolean bool = Boolean.TRUE;
            boolean areEqual = Intrinsics.areEqual(obj2, bool);
            return (areEqual && Intrinsics.areEqual(mutableMap.get(Hand.RIGHT), bool)) ? EnumHandsAulapp.BOTH : areEqual ? EnumHandsAulapp.LEFT : EnumHandsAulapp.RIGHT;
        }

        private Companion() {
        }
    }
}
