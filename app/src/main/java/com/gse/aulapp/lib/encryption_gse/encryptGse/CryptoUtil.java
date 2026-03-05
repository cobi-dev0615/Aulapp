package com.gse.aulapp.lib.encryption_gse.encryptGse;

import android.content.Context;
import androidx.annotation.Keep;
import com.gse.aulapp.lib.encryption_gse.encryptGse.util.PreferenceService;
import com.karumi.dexter.BuildConfig;
import java.io.File;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/gse/aulapp/lib/encryption_gse/encryptGse/CryptoUtil;", BuildConfig.FLAVOR, "context", "Landroid/content/Context;", "password", BuildConfig.FLAVOR, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CryptoUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "CryptoUtil";
    private static Context context;
    private static String password;
    private static UtilCrypto utilCrypto;

    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u00172\b\u0010\t\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/gse/aulapp/lib/encryption_gse/encryptGse/CryptoUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "TAG", BuildConfig.FLAVOR, "password", "utilCrypto", "Lcom/gse/aulapp/lib/encryption_gse/encryptGse/UtilCrypto;", "value", "Landroid/content/Context;", "context", "getContext", "()Landroid/content/Context;", "initCryptoJava", BuildConfig.FLAVOR, "initCrypto", "encryptValue", "encryptValueWithPassword", "decryptValue", "getKeyEcCrypt", "getSalt", "decryptFileByteByPassword", BuildConfig.FLAVOR, "passwordKey", "file", "Ljava/io/File;", "createKeyByPassword", "getDeriveP", "decodeBase64Value", "encodeBase64ByteArray", "byteArray", "decodeBase64ByteArray", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void initCrypto(Context context, String password) {
            try {
                UtilCrypto utilCrypto = CryptoUtil.utilCrypto;
                Objects.toString(context);
                Objects.toString(utilCrypto);
                if (context != null) {
                    CryptoUtil.context = context;
                    if (password != null) {
                        PreferenceService.INSTANCE.savePassword(context, password);
                    }
                    if (password == null) {
                        password = PreferenceService.INSTANCE.getPassword(context);
                    }
                    CryptoUtil.password = password;
                    if (CryptoUtil.utilCrypto == null) {
                        CryptoUtil.utilCrypto = new UtilCrypto(context);
                        UtilCrypto utilCrypto2 = CryptoUtil.utilCrypto;
                        if (utilCrypto2 != null) {
                            String str = CryptoUtil.password;
                            if (str == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("password");
                                str = null;
                            }
                            utilCrypto2.createKey(str);
                        }
                    }
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }

        public final String createKeyByPassword(String password) {
            Intrinsics.checkNotNullParameter(password, "password");
            try {
                if (CryptoUtil.utilCrypto == null) {
                    Context context = getContext();
                    String str = CryptoUtil.password;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("password");
                        str = null;
                    }
                    initCrypto(context, str);
                }
                UtilCrypto utilCrypto = CryptoUtil.utilCrypto;
                if (utilCrypto != null) {
                    return utilCrypto.createKeyCompanyV2(password);
                }
                return null;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final byte[] decodeBase64ByteArray(String value) {
            try {
                if (CryptoUtil.utilCrypto == null) {
                    Context context = getContext();
                    String str = CryptoUtil.password;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("password");
                        str = null;
                    }
                    initCrypto(context, str);
                }
                return UtilCrypto.decodeBase64ByteArray(value);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final String decodeBase64Value(String value) {
            try {
                if (CryptoUtil.utilCrypto == null) {
                    Context context = getContext();
                    String str = CryptoUtil.password;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("password");
                        str = null;
                    }
                    initCrypto(context, str);
                }
                return UtilCrypto.decodeBase64Value(value);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final byte[] decryptFileByteByPassword(String passwordKey, File file) {
            Intrinsics.checkNotNullParameter(passwordKey, "passwordKey");
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                if (CryptoUtil.utilCrypto == null) {
                    Context context = getContext();
                    String str = CryptoUtil.password;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("password");
                        str = null;
                    }
                    initCrypto(context, str);
                }
                UtilCrypto utilCrypto = CryptoUtil.utilCrypto;
                if (utilCrypto != null) {
                    return utilCrypto.decryptFileByteByPassword(passwordKey, file);
                }
                return null;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final String decryptValue(String encryptValue) {
            try {
                if (CryptoUtil.utilCrypto == null) {
                    initCrypto(null, null);
                }
                UtilCrypto utilCrypto = CryptoUtil.utilCrypto;
                if (utilCrypto != null) {
                    return utilCrypto.decryptValue(encryptValue);
                }
                return null;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final String encodeBase64ByteArray(byte[] byteArray) {
            try {
                if (CryptoUtil.utilCrypto == null) {
                    Context context = getContext();
                    String str = CryptoUtil.password;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("password");
                        str = null;
                    }
                    initCrypto(context, str);
                }
                return UtilCrypto.encodeBase64ByteArray(byteArray);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final String encryptValue(String value) {
            try {
                if (CryptoUtil.utilCrypto == null) {
                    Context context = getContext();
                    String str = CryptoUtil.password;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("password");
                        str = null;
                    }
                    initCrypto(context, str);
                }
                Objects.toString(CryptoUtil.utilCrypto);
                UtilCrypto utilCrypto = CryptoUtil.utilCrypto;
                if (utilCrypto != null) {
                    return utilCrypto.encryptValue(value);
                }
                return null;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final String encryptValueWithPassword(String value, String password) {
            try {
                if (CryptoUtil.utilCrypto == null) {
                    initCrypto(getContext(), password);
                }
                UtilCrypto utilCrypto = CryptoUtil.utilCrypto;
                if (utilCrypto != null) {
                    return utilCrypto.encryptValue(value);
                }
                return null;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final Context getContext() {
            Context context = CryptoUtil.context;
            if (context != null) {
                return context;
            }
            Intrinsics.throwUninitializedPropertyAccessException("context");
            return null;
        }

        public final String getDeriveP() {
            try {
                if (CryptoUtil.utilCrypto == null) {
                    Context context = getContext();
                    String str = CryptoUtil.password;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("password");
                        str = null;
                    }
                    initCrypto(context, str);
                }
                UtilCrypto utilCrypto = CryptoUtil.utilCrypto;
                if (utilCrypto != null) {
                    return utilCrypto.getDeriveP();
                }
                return null;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final String getKeyEcCrypt() {
            try {
                if (CryptoUtil.utilCrypto == null) {
                    Context context = getContext();
                    String str = CryptoUtil.password;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("password");
                        str = null;
                    }
                    initCrypto(context, str);
                }
                UtilCrypto utilCrypto = CryptoUtil.utilCrypto;
                if (utilCrypto != null) {
                    return utilCrypto.getKeyEcCrypt();
                }
                return null;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final String getSalt() {
            try {
                if (CryptoUtil.utilCrypto == null) {
                    Context context = getContext();
                    String str = CryptoUtil.password;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("password");
                        str = null;
                    }
                    initCrypto(context, str);
                }
                UtilCrypto utilCrypto = CryptoUtil.utilCrypto;
                if (utilCrypto != null) {
                    return utilCrypto.getSalt();
                }
                return null;
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final void initCryptoJava(Context context, String password) {
            try {
                UtilCrypto utilCrypto = CryptoUtil.utilCrypto;
                Objects.toString(context);
                Objects.toString(utilCrypto);
                if (context != null) {
                    CryptoUtil.context = context;
                    if (password != null) {
                        PreferenceService.INSTANCE.savePassword(context, password);
                    }
                    if (password == null) {
                        password = PreferenceService.INSTANCE.getPassword(context);
                    }
                    CryptoUtil.password = password;
                    if (CryptoUtil.utilCrypto == null) {
                        CryptoUtil.utilCrypto = new UtilCrypto(context);
                        UtilCrypto utilCrypto2 = CryptoUtil.utilCrypto;
                        if (utilCrypto2 != null) {
                            String str = CryptoUtil.password;
                            if (str == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("password");
                                str = null;
                            }
                            utilCrypto2.createKey(str);
                        }
                    }
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }

        private Companion() {
        }
    }

    public CryptoUtil(Context context2, String password2) {
        Intrinsics.checkNotNullParameter(password2, "password");
        password = password2;
        if (context2 != null) {
            context = context2;
        }
        INSTANCE.initCrypto(context2, password2);
    }
}
