package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.crypto.utils.ECChecks;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.net.URI;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ECKey extends JWK {
    public static final Set<Curve> SUPPORTED_CURVES = Collections.unmodifiableSet(new HashSet(Arrays.asList(Curve.P_256, Curve.SECP256K1, Curve.P_384, Curve.P_521)));
    private final Curve crv;
    private final Base64URL d;
    private final PrivateKey privateKey;
    private final Base64URL x;
    private final Base64URL y;

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL3, Base64URL base64URL4, List<Base64> list, KeyStore keyStore) {
        super(KeyType.EC, keyUse, set, algorithm, str, uri, base64URL3, base64URL4, list, keyStore);
        if (curve == null) {
            throw new IllegalArgumentException("The curve must not be null");
        }
        this.crv = curve;
        if (base64URL == null) {
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        this.x = base64URL;
        if (base64URL2 == null) {
            throw new IllegalArgumentException("The 'y' coordinate must not be null");
        }
        this.y = base64URL2;
        ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
        ensureMatches(getParsedX509CertChain());
        this.d = null;
        this.privateKey = null;
    }

    private void ensureMatches(List<X509Certificate> list) {
        if (list != null && !matches(list.get(0))) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    private static void ensurePublicCoordinatesOnCurve(Curve curve, Base64URL base64URL, Base64URL base64URL2) {
        if (!SUPPORTED_CURVES.contains(curve)) {
            throw new IllegalArgumentException("Unknown / unsupported curve: " + curve);
        }
        if (ECChecks.isPointOnCurve(base64URL.decodeToBigInteger(), base64URL2.decodeToBigInteger(), curve.toECParameterSpec())) {
            return;
        }
        throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + curve + " curve");
    }

    public static ECKey parse(Map<String, Object> map) {
        if (!KeyType.EC.equals(JWKMetadata.parseKeyType(map))) {
            throw new ParseException("The key type \"kty\" must be EC", 0);
        }
        try {
            Curve parse = Curve.parse(JSONObjectUtils.getString(map, "crv"));
            Base64URL base64URL = JSONObjectUtils.getBase64URL(map, "x");
            Base64URL base64URL2 = JSONObjectUtils.getBase64URL(map, "y");
            Base64URL base64URL3 = JSONObjectUtils.getBase64URL(map, "d");
            try {
                return base64URL3 == null ? new ECKey(parse, base64URL, base64URL2, JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), null) : new ECKey(parse, base64URL, base64URL2, base64URL3, JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), null);
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
        if (!(obj instanceof ECKey) || !super.equals(obj)) {
            return false;
        }
        ECKey eCKey = (ECKey) obj;
        return Objects.equals(this.crv, eCKey.crv) && Objects.equals(this.x, eCKey.x) && Objects.equals(this.y, eCKey.y) && Objects.equals(this.d, eCKey.d) && Objects.equals(this.privateKey, eCKey.privateKey);
    }

    public Base64URL getX() {
        return this.x;
    }

    public Base64URL getY() {
        return this.y;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.crv, this.x, this.y, this.d, this.privateKey);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return (this.d == null && this.privateKey == null) ? false : true;
    }

    public boolean matches(X509Certificate x509Certificate) {
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) getParsedX509CertChain().get(0).getPublicKey();
            if (getX().decodeToBigInteger().equals(eCPublicKey.getW().getAffineX())) {
                return getY().decodeToBigInteger().equals(eCPublicKey.getW().getAffineY());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put("crv", this.crv.toString());
        jSONObject.put("x", this.x.toString());
        jSONObject.put("y", this.y.toString());
        Base64URL base64URL = this.d;
        if (base64URL != null) {
            jSONObject.put("d", base64URL.toString());
        }
        return jSONObject;
    }

    public ECKey(Curve curve, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL4, Base64URL base64URL5, List<Base64> list, KeyStore keyStore) {
        super(KeyType.EC, keyUse, set, algorithm, str, uri, base64URL4, base64URL5, list, keyStore);
        if (curve != null) {
            this.crv = curve;
            if (base64URL != null) {
                this.x = base64URL;
                if (base64URL2 != null) {
                    this.y = base64URL2;
                    ensurePublicCoordinatesOnCurve(curve, base64URL, base64URL2);
                    ensureMatches(getParsedX509CertChain());
                    if (base64URL3 != null) {
                        this.d = base64URL3;
                        this.privateKey = null;
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
