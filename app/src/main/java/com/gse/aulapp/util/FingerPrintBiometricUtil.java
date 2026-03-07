package com.gse.aulapp.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.r2;
import com.gse.aulapp.model.converter.HandConverter;
import com.gse.aulapp.model.enumerate.EnumBiometricMoments;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumFinger;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.FingerPrintBiometricUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.TemplatesUtil;
import com.identy.IdentyResponseListener;
import com.identy.IdentySdk;
import com.identy.InitializationListener;
import com.identy.TemplateSize;
import com.identy.WSQCompression;
import com.identy.enums.Finger;
import com.identy.enums.FingerDetectionMode;
import com.identy.enums.Hand;
import com.identy.enums.Template;
import com.identy.exceptions.NoDetectionModeException;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/FingerPrintBiometricUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class FingerPrintBiometricUtil {
    private static int base64encoding;
    private static AlertDialog dialog;
    private static boolean displayboxes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = FingerPrintBiometricUtil.class.getCanonicalName();
    private static boolean enableSpoofCheck = true;
    private static WSQCompression compression = WSQCompression.WSQ_10_1;
    private static final Template TEMPLATE = Template.WSQ;

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005J0\u0010\"\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0005H\u0002J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u001b\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010&J(\u0010'\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010(2\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020*0(H\u0002J$\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0(2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0(H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/gse/aulapp/util/FingerPrintBiometricUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "TAG", BuildConfig.FLAVOR, "detectionModes", BuildConfig.FLAVOR, "Lcom/identy/enums/FingerDetectionMode;", "[Lcom/identy/enums/FingerDetectionMode;", "base64encoding", BuildConfig.FLAVOR, "displayboxes", BuildConfig.FLAVOR, "enableSpoofCheck", "compression", "Lcom/identy/WSQCompression;", "TEMPLATE", "Lcom/identy/enums/Template;", "FINGERS_SIZE", "dialog", "Landroid/app/AlertDialog;", "identyFingerPrint", BuildConfig.FLAVOR, "activity", "Landroidx/fragment/app/FragmentActivity;", "userId", "hand", "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "listener", "Lcom/identy/IdentyResponseListener;", "enrollOrVerify", "Lcom/gse/aulapp/model/enumerate/EnumBiometricMoments;", "pathDocument", "verifyHand", "identySdk", "Lcom/identy/IdentySdk;", "getDetectionMode", "(Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;)[Lcom/identy/enums/FingerDetectionMode;", "getMissingFingersByHand", BuildConfig.FLAVOR, "fingersAllowed", "Lcom/gse/aulapp/model/enumerate/EnumFinger;", "getModeForHandByFingers", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFingerPrintBiometricUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FingerPrintBiometricUtil.kt\ncom/gse/aulapp/util/FingerPrintBiometricUtil$Companion\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,299:1\n37#2,2:300\n1863#3,2:302\n*S KotlinDebug\n*F\n+ 1 FingerPrintBiometricUtil.kt\ncom/gse/aulapp/util/FingerPrintBiometricUtil$Companion\n*L\n213#1:300,2\n254#1:302,2\n*E\n"})
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[EnumBiometricMoments.values().length];
                try {
                    iArr[EnumBiometricMoments.ENROLL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumBiometricMoments.VERIFY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[EnumHandsAulapp.values().length];
                try {
                    iArr2[EnumHandsAulapp.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[EnumHandsAulapp.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[EnumFinger.values().length];
                try {
                    iArr3[EnumFinger.INDEX.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr3[EnumFinger.MIDDLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr3[EnumFinger.RING.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr3[EnumFinger.LITTLE.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final FingerDetectionMode[] getDetectionMode(EnumHandsAulapp hand) {
            FingerDetectionMode fingerDetectionMode = FingerDetectionMode.L4F;
            FingerDetectionMode[] fingerDetectionModeArr = {fingerDetectionMode};
            try {
                ArrayList arrayList = new ArrayList();
                List missingFingersByHand$default = getMissingFingersByHand$default(this, hand, null, 2, null);
                if (missingFingersByHand$default != null && !missingFingersByHand$default.isEmpty() && missingFingersByHand$default.size() != 4) {
                    arrayList.addAll(missingFingersByHand$default);
                    return (FingerDetectionMode[]) arrayList.toArray(new FingerDetectionMode[0]);
                }
                if (hand != EnumHandsAulapp.LEFT) {
                    fingerDetectionMode = FingerDetectionMode.R4F;
                }
                arrayList.add(fingerDetectionMode);
                return (FingerDetectionMode[]) arrayList.toArray(new FingerDetectionMode[0]);
            } catch (Exception e) {
                String unused = FingerPrintBiometricUtil.TAG;
                e.getMessage();
                return fingerDetectionModeArr;
            }
        }

        private final List<FingerDetectionMode> getMissingFingersByHand(EnumHandsAulapp hand, List<? extends EnumFinger> fingersAllowed) {
            ArrayList arrayList = new ArrayList();
            try {
                if (!fingersAllowed.isEmpty()) {
                    if (hand == EnumHandsAulapp.EXCEPTION) {
                        return null;
                    }
                    arrayList.addAll(getModeForHandByFingers(hand, fingersAllowed));
                    return arrayList;
                }
                int i = WhenMappings.$EnumSwitchMapping$1[hand.ordinal()];
                if (i == 1) {
                    arrayList.add(FingerDetectionMode.L4F);
                    return arrayList;
                }
                if (i != 2) {
                    String unused = FingerPrintBiometricUtil.TAG;
                    return null;
                }
                arrayList.add(FingerDetectionMode.R4F);
                return arrayList;
            } catch (Exception e) {
                String unused2 = FingerPrintBiometricUtil.TAG;
                e.getMessage();
                return arrayList;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List getMissingFingersByHand$default(Companion companion, EnumHandsAulapp enumHandsAulapp, List list, int i, Object obj) {
            if ((i & 2) != 0) {
                list = CollectionsKt.emptyList();
            }
            return companion.getMissingFingersByHand(enumHandsAulapp, list);
        }

        private final List<FingerDetectionMode> getModeForHandByFingers(EnumHandsAulapp hand, List<? extends EnumFinger> fingersAllowed) {
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = fingersAllowed.iterator();
            while (it.hasNext()) {
                int i = WhenMappings.$EnumSwitchMapping$2[((EnumFinger) it.next()).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                String unused = FingerPrintBiometricUtil.TAG;
                            } else if (hand == EnumHandsAulapp.LEFT) {
                                arrayList.add(FingerDetectionMode.LEFT_LITTLE);
                            } else {
                                arrayList.add(FingerDetectionMode.RIGHT_LITTLE);
                            }
                        } else if (hand == EnumHandsAulapp.LEFT) {
                            arrayList.add(FingerDetectionMode.LEFT_RING);
                        } else {
                            arrayList.add(FingerDetectionMode.RIGHT_RING);
                        }
                    } else if (hand == EnumHandsAulapp.LEFT) {
                        arrayList.add(FingerDetectionMode.LEFT_MIDDLE);
                    } else {
                        arrayList.add(FingerDetectionMode.RIGHT_MIDDLE);
                    }
                } else if (hand == EnumHandsAulapp.LEFT) {
                    arrayList.add(FingerDetectionMode.LEFT_INDEX);
                } else {
                    arrayList.add(FingerDetectionMode.RIGHT_INDEX);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void identyFingerPrint$lambda$0(HashMap templatesConfig, EnumHandsAulapp hand, EnumBiometricMoments enrollOrVerify, FragmentActivity activity, String userId, String pathDocument, IdentySdk identySdk) {
            Intrinsics.checkNotNullParameter(templatesConfig, "$templatesConfig");
            Intrinsics.checkNotNullParameter(hand, "$hand");
            Intrinsics.checkNotNullParameter(enrollOrVerify, "$enrollOrVerify");
            Intrinsics.checkNotNullParameter(activity, "$activity");
            Intrinsics.checkNotNullParameter(userId, "$userId");
            Intrinsics.checkNotNullParameter(pathDocument, "$pathDocument");
            identySdk.setBase64EncodingFlag(FingerPrintBiometricUtil.base64encoding);
            IdentySdk wSQCompression = identySdk.setDisplayImages(FingerPrintBiometricUtil.displayboxes).setRequiredTemplates(templatesConfig).setDisplayBoxes(false, FingerPrintBiometricUtil.displayboxes).setWSQCompression(FingerPrintBiometricUtil.compression);
            Companion companion = FingerPrintBiometricUtil.INSTANCE;
            wSQCompression.setDetectionMode(companion.getDetectionMode(hand));
            identySdk.disableTraining();
            identySdk.setDisplayImages(false);
            identySdk.displayResult(false);
            identySdk.setAllowTabletLandscape(false);
            identySdk.setAllowHandChange(false);
            try {
                int i = WhenMappings.$EnumSwitchMapping$0[enrollOrVerify.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    Intrinsics.checkNotNull(identySdk);
                    companion.verifyHand(activity, userId, identySdk, hand, pathDocument);
                    return;
                }
                identySdk.enroll();
                AlertDialog alertDialogLoadingBiometricRegister = Parameters.INSTANCE.getAlertDialogLoadingBiometricRegister();
                if (alertDialogLoadingBiometricRegister != null) {
                    alertDialogLoadingBiometricRegister.cancel();
                }
            } catch (Exception e) {
                LogSendUtil.INSTANCE.setLog(activity, q.i("Exception: ", e.getMessage()), "RegisterHand", true);
                DialogUtil.Companion.showErrorDialog$default(DialogUtil.INSTANCE, activity, EnumDialogType.DIALOG_TYPE_GENERAL_ERROR, null, null, e.getMessage(), false, null, 12, null);
            }
        }

        private final void verifyHand(FragmentActivity activity, String userId, IdentySdk identySdk, EnumHandsAulapp hand, String pathDocument) {
            String unused = FingerPrintBiometricUtil.TAG;
            Objects.toString(hand);
            TemplatesUtil.Companion companion = TemplatesUtil.INSTANCE;
            Hand handByEnumHandsAulapp = HandConverter.INSTANCE.getHandByEnumHandsAulapp(hand);
            if (handByEnumHandsAulapp == null) {
                handByEnumHandsAulapp = Hand.LEFT;
            }
            HashMap<Pair<Hand, Finger>, String> templateData = companion.getTemplateData(handByEnumHandsAulapp, pathDocument);
            String unused2 = FingerPrintBiometricUtil.TAG;
            Objects.toString(templateData);
            if (templateData != null) {
                identySdk.verifyWithTemplates(FingerPrintBiometricUtil.TEMPLATE, templateData);
                return;
            }
            FingerPrintBiometricUtil.dialog = DialogUtil.INSTANCE.showInformationFullDialogBiometricRegistrationResponse(activity, EnumDialogType.FAIL_REGISTRATION_BIOMETRIC, true, false, new r2(activity, 2));
            AlertDialog alertDialog = FingerPrintBiometricUtil.dialog;
            if (alertDialog != null) {
                alertDialog.show();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void verifyHand$lambda$1(FragmentActivity activity, View view) {
            Intrinsics.checkNotNullParameter(activity, "$activity");
            DialogUtil.INSTANCE.showDialogProgressGlobal(activity, false, false, true);
            AlertDialog alertDialog = FingerPrintBiometricUtil.dialog;
            if (alertDialog != null) {
                alertDialog.cancel();
            }
        }

        public final void identyFingerPrint(final FragmentActivity activity, final String userId, final EnumHandsAulapp hand, IdentyResponseListener listener, final EnumBiometricMoments enrollOrVerify, final String pathDocument) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(hand, "hand");
            Intrinsics.checkNotNullParameter(listener, "listener");
            Intrinsics.checkNotNullParameter(enrollOrVerify, "enrollOrVerify");
            Intrinsics.checkNotNullParameter(pathDocument, "pathDocument");
            final HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(TemplateSize.DEFAULT);
            hashMap2.put(Finger.INDEX, arrayList);
            hashMap2.put(Finger.MIDDLE, arrayList);
            hashMap2.put(Finger.RING, arrayList);
            hashMap2.put(Finger.LITTLE, arrayList);
            hashMap.put(FingerPrintBiometricUtil.TEMPLATE, hashMap2);
            try {
                IdentySdk.newInstance((Activity) activity, Parameters.INSTANCE.getPARAMETERS_FINGER_BIOMETRIC_LICENSE(), (InitializationListener<IdentySdk>) new InitializationListener() { // from class: co.ceduladigital.sdk.n4
                    @Override // com.identy.InitializationListener
                    public final void onInit(Object obj) {
                        HashMap hashMap3 = hashMap;
                        FragmentActivity fragmentActivity = activity;
                        String str = userId;
                        FingerPrintBiometricUtil.Companion.identyFingerPrint$lambda$0(hashMap3, hand, enrollOrVerify, fragmentActivity, str, pathDocument, (IdentySdk) obj);
                    }
                }, listener, false, true);
            } catch (Exception e) {
                LogSendUtil.INSTANCE.setLog(activity, q.i("Exception: ", e.getMessage()), "RegisterHand", false);
                DialogUtil.Companion.showErrorDialog$default(DialogUtil.INSTANCE, activity, EnumDialogType.DIALOG_TYPE_GENERAL_ERROR, null, null, e.getMessage(), false, null, 12, null);
            }
        }

        private Companion() {
        }
    }
}
