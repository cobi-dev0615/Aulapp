package com.nimbusds.jose.jwk;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class OctetSequenceKey extends JWK {
    private final Base64URL k;

    public OctetSequenceKey(Base64URL base64URL, KeyUse keyUse, Set<KeyOperation> set, Algorithm algorithm, String str, URI uri, Base64URL base64URL2, Base64URL base64URL3, List<Base64> list, KeyStore keyStore) {
        super(KeyType.OCT, keyUse, set, algorithm, str, uri, base64URL2, base64URL3, list, keyStore);
        if (base64URL == null) {
            throw new IllegalArgumentException("The key value must not be null");
        }
        this.k = base64URL;
    }

    public static OctetSequenceKey parse(Map<String, Object> map) {
        if (!KeyType.OCT.equals(JWKMetadata.parseKeyType(map))) {
            throw new ParseException("The key type \"kty\" must be oct", 0);
        }
        try {
            return new OctetSequenceKey(JSONObjectUtils.getBase64URL(map, "k"), JWKMetadata.parseKeyUse(map), JWKMetadata.parseKeyOperations(map), JWKMetadata.parseAlgorithm(map), JWKMetadata.parseKeyID(map), JWKMetadata.parseX509CertURL(map), JWKMetadata.parseX509CertThumbprint(map), JWKMetadata.parseX509CertSHA256Thumbprint(map), JWKMetadata.parseX509CertChain(map), null);
        } catch (IllegalArgumentException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OctetSequenceKey) && super.equals(obj)) {
            return Objects.equals(this.k, ((OctetSequenceKey) obj).k);
        }
        return false;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.k);
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public boolean isPrivate() {
        return true;
    }

    @Override // com.nimbusds.jose.jwk.JWK
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        jSONObject.put("k", this.k.toString());
        return jSONObject;
    }
}
