package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class OctetKeyPair extends JWK {
    public static final Set<Curve> SUPPORTED_CURVES = Collections.unmodifiableSet(new HashSet(Arrays.asList(Curve.Ed25519, Curve.Ed448, Curve.X25519, Curve.X448)));
    private final Curve crv;
    private final Base64URL d;
    private final byte[] decodedD;
    private final byte[] decodedX;
    private final Base64URL x;

    public OctetKeyPair(Curve curve, Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        super(KeyType.OKP, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, keyStore);
        if (curve == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        if (!SUPPORTED_CURVES.contains(curve)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        }
        this.crv = curve;
        if (base64URL == null) {
            throw new IllegalArgumentException("The 'x' parameter must not be null");
        }
        this.x = base64URL;
        this.decodedX = base64URL.decode();
        this.d = null;
        this.decodedD = null;
    }

    public static OctetKeyPair parse(Map<String, Object> map) {
        if (!KeyType.OKP.equals(JWKMetadata.parseKeyType(map))) {
            throw new ParseException("The key type \"kty\" must be OKP", 0);
        }
        try {
            Curve parse = Curve.parse(JSONObjectUtils.getString(map, "crv"));
            Base64URL base64URL = JSONObjectUtils.getBase64URL(map, "x");
            Base64URL base64URL2 = JSONObjectUtils.getBase64URL(map, "d");
            try {
                return base64URL2 == null ? new OctetKeyPair(parse, base64URL, JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), null) : new OctetKeyPair(parse, base64URL, base64URL2, JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), null);
            } catch (IllegalArgumentException e) {
                throw new ParseException(e.getMessage(), 0);
            }
        } catch (IllegalArgumentException e2) {
            throw new ParseException(e2.getMessage(), 0);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OctetKeyPair) || !super.equals(obj)) {
            return false;
        }
        OctetKeyPair octetKeyPair = (OctetKeyPair) obj;
        return Objects.equals(this.crv, octetKeyPair.crv) && Objects.equals(this.x, octetKeyPair.x) && Arrays.equals(this.decodedX, octetKeyPair.decodedX) && Objects.equals(this.d, octetKeyPair.d) && Arrays.equals(this.decodedD, octetKeyPair.decodedD);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Arrays.hashCode(this.decodedD) + ((Arrays.hashCode(this.decodedX) + (Objects.hash(Integer.valueOf(super.hashCode()), this.crv, this.x, this.d) * 31)) * 31);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return this.d != null;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put("crv", this.crv.toString());
        jSONObject.put("x", this.x.toString());
        Base64URL base64URL = this.d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        return jSONObject;
    }

    public OctetKeyPair(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(KeyType.OKP, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, keyStore);
        if (curve != null) {
            if (SUPPORTED_CURVES.contains(curve)) {
                this.crv = curve;
                if (base64URL != null) {
                    this.x = base64URL;
                    this.decodedX = base64URL.decode();
                    if (base64URL2 != null) {
                        this.d = base64URL2;
                        this.decodedD = base64URL2.decode();
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' parameter must not be null");
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
