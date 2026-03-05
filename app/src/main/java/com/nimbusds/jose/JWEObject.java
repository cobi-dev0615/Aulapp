package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import java.text.ParseException;

/* loaded from: classes2.dex */
public class JWEObject extends JOSEObject {
    private Base64URL authTag;
    private Base64URL cipherText;
    private Base64URL encryptedKey;
    private JWEHeader header;
    private Base64URL iv;
    private State state;

    public enum State {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public JWEObject(JWEHeader jWEHeader, Payload payload) {
        if (jWEHeader == null) {
            throw new IllegalArgumentException("The JWE header must not be null");
        }
        this.header = jWEHeader;
        if (payload == null) {
            throw new IllegalArgumentException("The payload must not be null");
        }
        setPayload(payload);
        this.encryptedKey = null;
        this.cipherText = null;
        this.state = State.UNENCRYPTED;
    }

    private void ensureEncryptedOrDecryptedState() {
        State state = this.state;
        if (state != State.ENCRYPTED && state != State.DECRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
        }
    }

    private void ensureEncryptedState() {
        if (this.state != State.ENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an encrypted state");
        }
    }

    private void ensureJWEEncrypterSupport(JWEEncrypter jWEEncrypter) {
        if (!jWEEncrypter.supportedJWEAlgorithms().contains(getHeader().getAlgorithm())) {
            throw new JOSEException("The \"" + getHeader().getAlgorithm() + "\" algorithm is not supported by the JWE encrypter: Supported algorithms: " + jWEEncrypter.supportedJWEAlgorithms());
        }
        if (jWEEncrypter.supportedEncryptionMethods().contains(getHeader().getEncryptionMethod())) {
            return;
        }
        throw new JOSEException("The \"" + getHeader().getEncryptionMethod() + "\" encryption method or key size is not supported by the JWE encrypter: Supported methods: " + jWEEncrypter.supportedEncryptionMethods());
    }

    private void ensureUnencryptedState() {
        if (this.state != State.UNENCRYPTED) {
            throw new IllegalStateException("The JWE object must be in an unencrypted state");
        }
    }

    public static JWEObject parse(String str) {
        Base64URL[] split = JOSEObject.split(str);
        if (split.length == 5) {
            return new JWEObject(split[0], split[1], split[2], split[3], split[4]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
    }

    public synchronized void decrypt(JWEDecrypter jWEDecrypter) {
        ensureEncryptedState();
        try {
            setPayload(new Payload(jWEDecrypter.decrypt(getHeader(), getEncryptedKey(), getIV(), getCipherText(), getAuthTag())));
            this.state = State.DECRYPTED;
        } catch (JOSEException e) {
            throw e;
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
    }

    public synchronized void encrypt(JWEEncrypter jWEEncrypter) {
        try {
            ensureUnencryptedState();
            ensureJWEEncrypterSupport(jWEEncrypter);
            try {
                try {
                    JWECryptoParts encrypt = jWEEncrypter.encrypt(getHeader(), getPayload().toBytes());
                    if (encrypt.getHeader() != null) {
                        this.header = encrypt.getHeader();
                    }
                    this.encryptedKey = encrypt.getEncryptedKey();
                    this.iv = encrypt.getInitializationVector();
                    this.cipherText = encrypt.getCipherText();
                    this.authTag = encrypt.getAuthenticationTag();
                    this.state = State.ENCRYPTED;
                } catch (Exception e) {
                    throw new JOSEException(e.getMessage(), e);
                }
            } catch (JOSEException e2) {
                throw e2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public Base64URL getAuthTag() {
        return this.authTag;
    }

    public Base64URL getCipherText() {
        return this.cipherText;
    }

    public Base64URL getEncryptedKey() {
        return this.encryptedKey;
    }

    public JWEHeader getHeader() {
        return this.header;
    }

    public Base64URL getIV() {
        return this.iv;
    }

    public String serialize() {
        ensureEncryptedOrDecryptedState();
        StringBuilder sb = new StringBuilder(this.header.toBase64URL().toString());
        sb.append('.');
        Base64URL base64URL = this.encryptedKey;
        if (base64URL != null) {
            sb.append(base64URL.toString());
        }
        sb.append('.');
        Base64URL base64URL2 = this.iv;
        if (base64URL2 != null) {
            sb.append(base64URL2.toString());
        }
        sb.append('.');
        sb.append(this.cipherText.toString());
        sb.append('.');
        Base64URL base64URL3 = this.authTag;
        if (base64URL3 != null) {
            sb.append(base64URL3.toString());
        }
        return sb.toString();
    }

    public JWEObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5) {
        if (base64URL != null) {
            try {
                this.header = JWEHeader.parse(base64URL);
                if (base64URL2 != null && !base64URL2.toString().isEmpty()) {
                    this.encryptedKey = base64URL2;
                } else {
                    this.encryptedKey = null;
                }
                if (base64URL3 != null && !base64URL3.toString().isEmpty()) {
                    this.iv = base64URL3;
                } else {
                    this.iv = null;
                }
                if (base64URL4 != null) {
                    this.cipherText = base64URL4;
                    if (base64URL5 != null && !base64URL5.toString().isEmpty()) {
                        this.authTag = base64URL5;
                    } else {
                        this.authTag = null;
                    }
                    this.state = State.ENCRYPTED;
                    setParsedParts(base64URL, base64URL2, base64URL3, base64URL4, base64URL5);
                    return;
                }
                throw new IllegalArgumentException("The fourth part must not be null");
            } catch (ParseException e) {
                throw new ParseException("Invalid JWE header: " + e.getMessage(), 0);
            }
        }
        throw new IllegalArgumentException("The first part must not be null");
    }
}
