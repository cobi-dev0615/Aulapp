package com.gse.aulapp.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.NfcManager;
import android.nfc.Tag;
import android.nfc.tech.Ndef;
import android.os.Bundle;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.model.dto.TagDto;
import com.gse.aulapp.util.NfcUtil;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/gse/aulapp/util/NfcUtil;", BuildConfig.FLAVOR, "Companion", "NfcCallback", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class NfcUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    static final String TAG = "NfcUtil";
    private static NfcAdapter mNfcAdapter;

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J$\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0086@¢\u0006\u0002\u0010 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010#\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010$\u001a\u00020%2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/gse/aulapp/util/NfcUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "DELAY_PRESENCE_CHECK", BuildConfig.FLAVOR, "TAG", BuildConfig.FLAVOR, "MIME_TEXT_PLAIN", "GENERAL_ERROR", "NO_NFC_TAG_FOUND", "NO_MSG_TAG_FOUND", "NO_SUPPORT_NFC_DEVICE", "mNfcAdapter", "Landroid/nfc/NfcAdapter;", "initNfcAdapter", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "validateNfcAdapter", "activity", "Landroid/app/Activity;", "callback", "Lcom/gse/aulapp/util/NfcUtil$NfcCallback;", "disabledNfcAdapter", "getPayloadByTag", "mNdef", "Landroid/nfc/tech/Ndef;", "handlerResponseTag", "Lcom/gse/aulapp/model/dto/TagDto;", "tag", "Landroid/nfc/Tag;", "(Landroid/content/Context;Landroid/nfc/Tag;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nfcStatusDevice", "Lcom/gse/aulapp/util/NfcUtil$Companion$NfcStatus;", "openSettingsNfc", "isEnabledNfc", BuildConfig.FLAVOR, "NfcStatus", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/gse/aulapp/util/NfcUtil$Companion$NfcStatus;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "NFC_NOT_SUPPORTED", "NFC_NOT_ENABLED", "NFC_ENABLED", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class NfcStatus {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ NfcStatus[] $VALUES;
            public static final NfcStatus NFC_NOT_SUPPORTED = new NfcStatus("NFC_NOT_SUPPORTED", 0);
            public static final NfcStatus NFC_NOT_ENABLED = new NfcStatus("NFC_NOT_ENABLED", 1);
            public static final NfcStatus NFC_ENABLED = new NfcStatus("NFC_ENABLED", 2);

            private static final /* synthetic */ NfcStatus[] $values() {
                return new NfcStatus[]{NFC_NOT_SUPPORTED, NFC_NOT_ENABLED, NFC_ENABLED};
            }

            static {
                NfcStatus[] $values = $values();
                $VALUES = $values;
                $ENTRIES = null; // EnumEntriesKt.enumEntries requires actual enum type
            }

            private final String _name;
            private final int _ordinal;

            private NfcStatus(String str, int i) {
                this._name = str;
                this._ordinal = i;
            }

            public final int ordinal() {
                return this._ordinal;
            }

            public final String name() {
                return this._name;
            }

            public static NfcStatus valueOfString(String str) {
                for (NfcStatus e : values()) {
                    if (e._name.equals(str)) return e;
                }
                throw new IllegalArgumentException("No enum constant " + str);
            }

            public static NfcStatus[] values() {
                return (NfcStatus[]) $VALUES.clone();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getPayloadByTag(Ndef mNdef) {
            if (mNdef == null) {
                return null;
            }
            try {
                byte[] payload = mNdef.getCachedNdefMessage().getRecords()[0].getPayload();
                Intrinsics.checkNotNull(payload);
                return new String(payload, Charsets.UTF_8);
            } catch (Exception e) {
                LogSendUtil.INSTANCE.setLog(GeneralApp.INSTANCE.getInstance().getApplicationContext(), q.i("getPayloadByTag: ", e.getMessage()), "getPayloadByTag", true);
                String unused = NfcUtil.TAG;
                e.getMessage();
                return null;
            }
        }

        public static /* synthetic */ Object handlerResponseTag$default(Companion companion, Context context, Tag tag, Continuation continuation, int i, Object obj) {
            if ((i & 1) != 0) {
                context = GeneralApp.INSTANCE.getInstance().getApplicationContext();
            }
            return companion.handlerResponseTag(context, tag, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void validateNfcAdapter$lambda$0(NfcCallback callback, Tag tag) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNull(tag);
            callback.onSuccess(tag);
        }

        public final void disabledNfcAdapter(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                NfcAdapter nfcAdapter = NfcUtil.mNfcAdapter;
                if (nfcAdapter != null) {
                    nfcAdapter.disableReaderMode(activity);
                }
                NfcUtil.mNfcAdapter = null;
            } catch (Exception e) {
                LogSendUtil.INSTANCE.setLog(activity, q.i("disabledNfcAdapter: ", e.getMessage()), "disabledNfcAdapter", true);
                String unused = NfcUtil.TAG;
                e.getMessage();
            }
        }

        public final Object handlerResponseTag(Context context, Tag tag, Continuation continuation) {
            Object runBlocking$default;
            runBlocking$default = BuildersKt.runBlocking((CoroutineContext) null, new NfcUtil$Companion$handlerResponseTag$2(tag, context, null));
            return runBlocking$default;
        }

        public final void initNfcAdapter(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                NfcUtil.mNfcAdapter = NfcAdapter.getDefaultAdapter(context);
            } catch (Exception e) {
                String unused = NfcUtil.TAG;
                e.getMessage();
            }
        }

        public final boolean isEnabledNfc(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Object systemService = context.getSystemService("nfc");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.nfc.NfcManager");
                NfcAdapter defaultAdapter = ((NfcManager) systemService).getDefaultAdapter();
                if (defaultAdapter != null) {
                    if (defaultAdapter.isEnabled()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                LogSendUtil.INSTANCE.setLog(context, q.i("isEnabledNfc: Exception ", e.getMessage()), "isEnabledNfc", true);
                return false;
            }
        }

        public final NfcStatus nfcStatusDevice(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            try {
                Object systemService = context.getSystemService("nfc");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.nfc.NfcManager");
                NfcAdapter defaultAdapter = ((NfcManager) systemService).getDefaultAdapter();
                if (defaultAdapter != null && defaultAdapter.isEnabled()) {
                    String unused = NfcUtil.TAG;
                    return NfcStatus.NFC_ENABLED;
                }
                if (defaultAdapter == null || defaultAdapter.isEnabled()) {
                    String unused2 = NfcUtil.TAG;
                    return NfcStatus.NFC_NOT_SUPPORTED;
                }
                String unused3 = NfcUtil.TAG;
                return NfcStatus.NFC_NOT_ENABLED;
            } catch (Exception e) {
                LogSendUtil.INSTANCE.setLog(context, q.i("nfcStatusDevice: Exception ", e.getMessage()), "nfcStatusDevice", true);
                return NfcStatus.NFC_NOT_SUPPORTED;
            }
        }

        public final void openSettingsNfc(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                activity.startActivity(new Intent("android.settings.NFC_SETTINGS"));
            } catch (Exception e) {
                LogSendUtil.INSTANCE.setLog(activity, q.i("openSettingsNfc: Exception ", e.getMessage()), "openSettingsNfc", true);
            }
        }

        public final void validateNfcAdapter(Activity activity, final NfcCallback callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            try {
                if (NfcUtil.mNfcAdapter == null) {
                    initNfcAdapter(activity);
                }
                Bundle bundle = new Bundle();
                bundle.putInt("presence", 250);
                NfcAdapter.ReaderCallback readerCallback = new NfcAdapter.ReaderCallback() { // from class: co.ceduladigital.sdk.f7
                    @Override // android.nfc.NfcAdapter.ReaderCallback
                    public final void onTagDiscovered(Tag tag) {
                        NfcUtil.Companion.validateNfcAdapter$lambda$0(NfcUtil.NfcCallback.this, tag);
                    }
                };
                NfcAdapter nfcAdapter = NfcUtil.mNfcAdapter;
                Intrinsics.checkNotNull(nfcAdapter);
                nfcAdapter.enableReaderMode(activity, readerCallback, 31, bundle);
            } catch (Exception e) {
                String unused = NfcUtil.TAG;
                e.getMessage();
                callback.onError(String.valueOf(e.getMessage()));
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/gse/aulapp/util/NfcUtil$NfcCallback;", BuildConfig.FLAVOR, "onSuccess", BuildConfig.FLAVOR, "tag", "Landroid/nfc/Tag;", "onError", "error", BuildConfig.FLAVOR, "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface NfcCallback {
        void onError(String error);

        void onSuccess(Tag tag);
    }
}
