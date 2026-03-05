package com.gse.aulapp.lib.encryption_gse.encryptJwe;

import android.content.Context;
import androidx.annotation.Keep;
import com.gse.aulapp.lib.encryption_gse.encryptJwe.model.ResultEncryptKeys;
import com.gse.aulapp.lib.encryption_gse.encryptJwe.model.p000enum.SourceKeyEnum;
import com.gse.aulapp.lib.encryption_gse.encryptJwe.util.FileUtil;
import com.karumi.dexter.BuildConfig;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.crypto.DirectDecrypter;
import java.io.Reader;
import java.io.StringReader;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.Security;
import java.security.interfaces.ECPublicKey;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.spongycastle.jce.provider.BouncyCastleProvider;

@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/gse/aulapp/lib/encryption_gse/encryptJwe/EcCryptKeys;", BuildConfig.FLAVOR, "<init>", "()V", "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EcCryptKeys {
    private static KeyPair keyPair;
    private static ECPublicKey pubKey;
    private static String publicKeyServer;
    private static SecretKey secretKeyA;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = Reflection.getOrCreateKotlinClass(EcCryptKeys.class).getSimpleName();
    private static SourceKeyEnum sourceKeyEnum = SourceKeyEnum.NONE;

    @Keep
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0005J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/gse/aulapp/lib/encryption_gse/encryptJwe/EcCryptKeys$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "TAG", BuildConfig.FLAVOR, "pubKey", "Ljava/security/interfaces/ECPublicKey;", "secretKeyA", "Ljavax/crypto/SecretKey;", "publicKeyServer", "keyPair", "Ljava/security/KeyPair;", "sourceKeyEnum", "Lcom/gse/aulapp/lib/encryption_gse/encryptJwe/model/enum/SourceKeyEnum;", "initializeKeysByAssetsPath", BuildConfig.FLAVOR, "publicKey", "initializeKeysByVariable", "encrypt", "Lcom/gse/aulapp/lib/encryption_gse/encryptJwe/model/ResultEncryptKeys;", "context", "Landroid/content/Context;", "payloadJson", "decrypt", "jwe", "validateKeyAndSource", "Ljava/io/Reader;", "key", "getKeyPair", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SourceKeyEnum.values().length];
                try {
                    iArr[SourceKeyEnum.NONE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SourceKeyEnum.ASSETS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SourceKeyEnum.STRING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void getKeyPair() {
            if (EcCryptKeys.keyPair == null || EcCryptKeys.secretKeyA == null) {
                EcCryptKeys.keyPair = EcCryptJweUtil.generateECKeys();
            }
        }

        private final Reader validateKeyAndSource(Context context, String key) {
            Reader reader;
            getKeyPair();
            String unused = EcCryptKeys.TAG;
            Objects.toString(EcCryptKeys.keyPair);
            if (EcCryptKeys.keyPair == null) {
                new Throwable("keyPair is null");
            }
            int i = WhenMappings.$EnumSwitchMapping$0[EcCryptKeys.sourceKeyEnum.ordinal()];
            if (i == 1) {
                reader = null;
            } else if (i == 2) {
                reader = FileUtil.getFileByAsset(context, key);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                reader = new StringReader(key);
            }
            String unused2 = EcCryptKeys.TAG;
            Objects.toString(reader);
            if (reader == null) {
                new Throwable("reader is null");
            }
            return reader;
        }

        public final ResultEncryptKeys decrypt(Context context, String jwe) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(jwe, "jwe");
            Security.addProvider(new BouncyCastleProvider());
            String unused = EcCryptKeys.TAG;
            try {
                String unused2 = EcCryptKeys.TAG;
                String unused3 = EcCryptKeys.publicKeyServer;
                if (EcCryptKeys.publicKeyServer == null) {
                    new Throwable("privateKey is null");
                }
                String str = EcCryptKeys.publicKeyServer;
                Reader validateKeyAndSource = str != null ? EcCryptKeys.INSTANCE.validateKeyAndSource(context, str) : null;
                if (validateKeyAndSource == null) {
                    new Throwable("reader is null");
                }
                ECPublicKey backendPubKeyByReader = EcCryptJweUtil.getBackendPubKeyByReader(validateKeyAndSource);
                String unused4 = EcCryptKeys.TAG;
                Objects.toString(backendPubKeyByReader);
                if (backendPubKeyByReader == null) {
                    new Throwable("backendPrivKey is null");
                }
                KeyPair keyPair = EcCryptKeys.keyPair;
                Intrinsics.checkNotNull(keyPair);
                SecretKey generateSharedSecret = EcCryptJweUtil.generateSharedSecret(keyPair.getPrivate(), backendPubKeyByReader);
                String unused5 = EcCryptKeys.TAG;
                SecretKey secretKey = EcCryptKeys.secretKeyA;
                if (secretKey != null) {
                    secretKey.equals(generateSharedSecret);
                }
                String unused6 = EcCryptKeys.TAG;
                Base64.Encoder encoder = Base64.getEncoder();
                KeyPair keyPair2 = EcCryptKeys.keyPair;
                Intrinsics.checkNotNull(keyPair2);
                encoder.encodeToString(keyPair2.getPublic().getEncoded());
                if (generateSharedSecret == null) {
                    new Throwable("secretKeyB is null");
                }
                JWEObject parse = JWEObject.parse(jwe);
                Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
                String unused7 = EcCryptKeys.TAG;
                Objects.toString(parse);
                parse.decrypt(new DirectDecrypter(generateSharedSecret));
                String unused8 = EcCryptKeys.TAG;
                Objects.toString(parse.getPayload());
                String generatePublicKeyEncoded = EcCryptJweUtil.generatePublicKeyEncoded(EcCryptKeys.pubKey);
                Intrinsics.checkNotNullExpressionValue(generatePublicKeyEncoded, "generatePublicKeyEncoded(...)");
                return new ResultEncryptKeys.DataResult(generatePublicKeyEncoded, parse.getPayload().toString());
            } catch (Exception e) {
                String unused9 = EcCryptKeys.TAG;
                e.getMessage();
                return new ResultEncryptKeys.Failure(e);
            }
        }

        public final ResultEncryptKeys encrypt(Context context, String payloadJson) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(payloadJson, "payloadJson");
            Security.addProvider(new BouncyCastleProvider());
            String unused = EcCryptKeys.TAG;
            try {
                String unused2 = EcCryptKeys.TAG;
                String unused3 = EcCryptKeys.publicKeyServer;
                if (EcCryptKeys.publicKeyServer == null) {
                    new Throwable("publicKey is null");
                }
                String str = EcCryptKeys.publicKeyServer;
                Reader validateKeyAndSource = str != null ? EcCryptKeys.INSTANCE.validateKeyAndSource(context, str) : null;
                if (validateKeyAndSource == null) {
                    new Throwable("reader is null");
                }
                ECPublicKey backendPubKeyByReader = EcCryptJweUtil.getBackendPubKeyByReader(validateKeyAndSource);
                String unused4 = EcCryptKeys.TAG;
                Objects.toString(backendPubKeyByReader);
                if (backendPubKeyByReader == null) {
                    new Throwable("backendPubKey is null");
                }
                KeyPair keyPair = EcCryptKeys.keyPair;
                PublicKey publicKey = keyPair != null ? keyPair.getPublic() : null;
                Intrinsics.checkNotNull(publicKey, "null cannot be cast to non-null type java.security.interfaces.ECPublicKey");
                EcCryptKeys.pubKey = (ECPublicKey) publicKey;
                KeyPair keyPair2 = EcCryptKeys.keyPair;
                Intrinsics.checkNotNull(keyPair2);
                EcCryptKeys.secretKeyA = EcCryptJweUtil.generateSharedSecret(keyPair2.getPrivate(), backendPubKeyByReader);
                String unused5 = EcCryptKeys.TAG;
                SecretKey secretKey = EcCryptKeys.secretKeyA;
                Base64.Encoder encoder = Base64.getEncoder();
                SecretKey secretKey2 = EcCryptKeys.secretKeyA;
                Intrinsics.checkNotNull(secretKey2);
                encoder.encodeToString(secretKey2.getEncoded());
                Objects.toString(secretKey);
                if (EcCryptKeys.secretKeyA == null) {
                    new Throwable("secretKeyA is null");
                }
                String jwe = EcCryptJweUtil.getJwe(EcCryptKeys.secretKeyA, payloadJson);
                Intrinsics.checkNotNullExpressionValue(jwe, "getJwe(...)");
                String unused6 = EcCryptKeys.TAG;
                String generatePublicKeyEncoded = EcCryptJweUtil.generatePublicKeyEncoded(EcCryptKeys.pubKey);
                Intrinsics.checkNotNullExpressionValue(generatePublicKeyEncoded, "generatePublicKeyEncoded(...)");
                String unused7 = EcCryptKeys.TAG;
                return new ResultEncryptKeys.DataResult(generatePublicKeyEncoded, jwe);
            } catch (Exception e) {
                String unused8 = EcCryptKeys.TAG;
                e.getMessage();
                return new ResultEncryptKeys.Failure(e);
            }
        }

        public final void initializeKeysByAssetsPath(String publicKey) {
            Intrinsics.checkNotNullParameter(publicKey, "publicKey");
            EcCryptKeys.publicKeyServer = publicKey;
            EcCryptKeys.sourceKeyEnum = SourceKeyEnum.ASSETS;
            String unused = EcCryptKeys.TAG;
            Objects.toString(EcCryptKeys.sourceKeyEnum);
        }

        public final void initializeKeysByVariable(String publicKey) {
            Intrinsics.checkNotNullParameter(publicKey, "publicKey");
            EcCryptKeys.publicKeyServer = publicKey;
            EcCryptKeys.sourceKeyEnum = SourceKeyEnum.STRING;
            String unused = EcCryptKeys.TAG;
            Objects.toString(EcCryptKeys.sourceKeyEnum);
        }

        private Companion() {
        }
    }
}
