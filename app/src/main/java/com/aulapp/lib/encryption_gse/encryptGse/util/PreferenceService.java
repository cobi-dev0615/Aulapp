package com.gse.aulapp.lib.encryption_gse.encryptGse.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKeys;
import com.google.gson.Gson;
import com.gse.aulapp.R;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/lib/encryption_gse/encryptGse/util/PreferenceService;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PreferenceService {
    private static final String GSE_KEY_DEFAULT_VALUE = null;
    private static SharedPreferences sharedPreferences;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "PreferenceService";
    private static Gson gson = new Gson();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\u001d\u001a\n \u001c*\u0004\u0018\u00010\t0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u001aR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001eR\u0014\u0010$\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001eR\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0016\u0010)\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001e¨\u0006*"}, d2 = {"Lcom/gse/aulapp/lib/encryption_gse/encryptGse/util/PreferenceService$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "generateSharedPreferencesInstance", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "key", "value", "savePreferencesWithoutEncrypting", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "defaultValue", "getPreferencesWithoutEncrypting", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getPassword", "(Landroid/content/Context;)Ljava/lang/String;", "password", "savePassword", "(Landroid/content/Context;Ljava/lang/String;)V", "getGSEKey", "gseKey", "saveGSEKey", "getGetOrCreateMasterKeys", "()Ljava/lang/String;", "getOrCreateMasterKeys", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "getTAG", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "PASSWORD_KEY", "GSE_KEY", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "PASSWORD_DEFAULT_VALUE", "GSE_KEY_DEFAULT_VALUE", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void generateSharedPreferencesInstance(Context context) {
            PreferenceService.sharedPreferences = EncryptedSharedPreferences.create(context.getString(R.string.preference_file), getGetOrCreateMasterKeys(), context, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            PreferenceService.gson = new Gson();
        }

        private final String getGetOrCreateMasterKeys() {
            String orCreate = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC);
            Intrinsics.checkNotNullExpressionValue(orCreate, "getOrCreate(...)");
            return orCreate;
        }

        private final String getPreferencesWithoutEncrypting(Context context, String key, String defaultValue) {
            try {
                if (PreferenceService.sharedPreferences == null && context != null) {
                    generateSharedPreferencesInstance(context);
                }
                SharedPreferences sharedPreferences = PreferenceService.sharedPreferences;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString(key, defaultValue);
                    if (string != null) {
                        return string;
                    }
                }
            } catch (Exception unused) {
            }
            return defaultValue;
        }

        private final void savePreferencesWithoutEncrypting(Context context, String key, String value) {
            SharedPreferences.Editor edit;
            try {
                if (PreferenceService.sharedPreferences == null && context != null) {
                    generateSharedPreferencesInstance(context);
                }
                SharedPreferences sharedPreferences = PreferenceService.sharedPreferences;
                if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
                    edit.putString(key, value);
                    edit.apply();
                }
            } catch (Exception unused) {
                getTAG();
            }
        }

        public final String getGSEKey(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPreferencesWithoutEncrypting(context, "GSE_KEY", PreferenceService.GSE_KEY_DEFAULT_VALUE);
        }

        public final String getPassword(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String preferencesWithoutEncrypting = getPreferencesWithoutEncrypting(context, "PASSWORD", BuildConfig.FLAVOR);
            return preferencesWithoutEncrypting == null ? BuildConfig.FLAVOR : preferencesWithoutEncrypting;
        }

        public final String getTAG() {
            return PreferenceService.TAG;
        }

        public final void saveGSEKey(Context context, String gseKey) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferencesWithoutEncrypting(context, "GSE_KEY", gseKey);
        }

        public final void savePassword(Context context, String password) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferencesWithoutEncrypting(context, "PASSWORD", password);
        }

        private Companion() {
        }
    }
}
