package com.nimbusds.jose;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import com.nimbusds.jose.util.X509CertChainUtils;
import defpackage.a;
import java.net.URI;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class JWEHeader extends CommonSEHeader {
    private static final Set<String> REGISTERED_PARAMETER_NAMES;
    private final Base64URL apu;
    private final Base64URL apv;
    private final EncryptionMethod enc;
    private final JWK epk;
    private final Base64URL iv;
    private final int p2c;
    private final Base64URL p2s;
    private final Base64URL tag;
    private final CompressionAlgorithm zip;

    public static class Builder {
        private final JWEAlgorithm alg;
        private Base64URL apu;
        private Base64URL apv;
        private Set<String> crit;
        private String cty;
        private Map<String, Object> customParams;
        private final EncryptionMethod enc;
        private JWK epk;
        private Base64URL iv;
        private URI jku;
        private JWK jwk;
        private String kid;
        private int p2c;
        private Base64URL p2s;
        private Base64URL parsedBase64URL;
        private Base64URL tag;
        private JOSEObjectType typ;
        private List<Base64> x5c;

        @Deprecated
        private Base64URL x5t;
        private Base64URL x5t256;
        private URI x5u;
        private CompressionAlgorithm zip;

        public Builder(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
            if (jWEAlgorithm.getName().equals(Algorithm.NONE.getName())) {
                throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
            }
            this.alg = jWEAlgorithm;
            if (encryptionMethod == null) {
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            this.enc = encryptionMethod;
        }

        public Builder agreementPartyUInfo(Base64URL base64URL) {
            this.apu = base64URL;
            return this;
        }

        public Builder agreementPartyVInfo(Base64URL base64URL) {
            this.apv = base64URL;
            return this;
        }

        public Builder authTag(Base64URL base64URL) {
            this.tag = base64URL;
            return this;
        }

        public JWEHeader build() {
            return new JWEHeader(this.alg, this.enc, this.typ, this.cty, this.crit, this.jku, this.jwk, this.x5u, this.x5t, this.x5t256, this.x5c, this.kid, this.epk, this.zip, this.apu, this.apv, this.p2s, this.p2c, this.iv, this.tag, this.customParams, this.parsedBase64URL);
        }

        public Builder compressionAlgorithm(CompressionAlgorithm compressionAlgorithm) {
            this.zip = compressionAlgorithm;
            return this;
        }

        public Builder contentType(String str) {
            this.cty = str;
            return this;
        }

        public Builder criticalParams(Set<String> set) {
            this.crit = set;
            return this;
        }

        public Builder customParam(String str, Object obj) {
            if (JWEHeader.getRegisteredParameterNames().contains(str)) {
                throw new IllegalArgumentException(a.m("The parameter name \"", str, "\" matches a registered name"));
            }
            if (this.customParams == null) {
                this.customParams = new HashMap();
            }
            this.customParams.put(str, obj);
            return this;
        }

        public Builder ephemeralPublicKey(JWK jwk) {
            this.epk = jwk;
            return this;
        }

        public Builder iv(Base64URL base64URL) {
            this.iv = base64URL;
            return this;
        }

        public Builder jwk(JWK jwk) {
            this.jwk = jwk;
            return this;
        }

        public Builder jwkURL(URI uri) {
            this.jku = uri;
            return this;
        }

        public Builder keyID(String str) {
            this.kid = str;
            return this;
        }

        public Builder parsedBase64URL(Base64URL base64URL) {
            this.parsedBase64URL = base64URL;
            return this;
        }

        public Builder pbes2Count(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
            }
            this.p2c = i;
            return this;
        }

        public Builder pbes2Salt(Base64URL base64URL) {
            this.p2s = base64URL;
            return this;
        }

        public Builder type(JOSEObjectType jOSEObjectType) {
            this.typ = jOSEObjectType;
            return this;
        }

        public Builder x509CertChain(List<Base64> list) {
            this.x5c = list;
            return this;
        }

        public Builder x509CertSHA256Thumbprint(Base64URL base64URL) {
            this.x5t256 = base64URL;
            return this;
        }

        @Deprecated
        public Builder x509CertThumbprint(Base64URL base64URL) {
            this.x5t = base64URL;
            return this;
        }

        public Builder x509CertURL(URI uri) {
            this.x5u = uri;
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("authTag");
        REGISTERED_PARAMETER_NAMES = Collections.unmodifiableSet(hashSet);
    }

    public JWEHeader(JWEAlgorithm jWEAlgorithm, EncryptionMethod encryptionMethod) {
        this(jWEAlgorithm, encryptionMethod, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null);
    }

    public static Set<String> getRegisteredParameterNames() {
        return REGISTERED_PARAMETER_NAMES;
    }

    public static JWEHeader parse(Map<String, Object> map, Base64URL base64URL) {
        Algorithm parseAlgorithm = Header.parseAlgorithm(map);
        if (!(parseAlgorithm instanceof JWEAlgorithm)) {
            throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
        }
        Builder parsedBase64URL = new Builder((JWEAlgorithm) parseAlgorithm, parseEncryptionMethod(map)).parsedBase64URL(base64URL);
        for (String str : map.keySet()) {
            if (!"alg".equals(str) && !"enc".equals(str)) {
                if ("typ".equals(str)) {
                    String string = JSONObjectUtils.getString(map, str);
                    if (string != null) {
                        parsedBase64URL = parsedBase64URL.type(new JOSEObjectType(string));
                    }
                } else if ("cty".equals(str)) {
                    parsedBase64URL = parsedBase64URL.contentType(JSONObjectUtils.getString(map, str));
                } else if ("crit".equals(str)) {
                    List<String> stringList = JSONObjectUtils.getStringList(map, str);
                    if (stringList != null) {
                        parsedBase64URL = parsedBase64URL.criticalParams(new HashSet(stringList));
                    }
                } else if ("jku".equals(str)) {
                    parsedBase64URL = parsedBase64URL.jwkURL(JSONObjectUtils.getURI(map, str));
                } else if ("jwk".equals(str)) {
                    Map<String, Object> jSONObject = JSONObjectUtils.getJSONObject(map, str);
                    if (jSONObject != null) {
                        parsedBase64URL = parsedBase64URL.jwk(JWK.parse(jSONObject));
                    }
                } else if ("x5u".equals(str)) {
                    parsedBase64URL = parsedBase64URL.x509CertURL(JSONObjectUtils.getURI(map, str));
                } else if ("x5t".equals(str)) {
                    parsedBase64URL = parsedBase64URL.x509CertThumbprint(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if ("x5t#S256".equals(str)) {
                    parsedBase64URL = parsedBase64URL.x509CertSHA256Thumbprint(Base64URL.from(JSONObjectUtils.getString(map, str)));
                } else if ("x5c".equals(str)) {
                    parsedBase64URL = parsedBase64URL.x509CertChain(X509CertChainUtils.toBase64List(JSONObjectUtils.getJSONArray(map, str)));
                } else if ("kid".equals(str)) {
                    parsedBase64URL = parsedBase64URL.keyID(JSONObjectUtils.getString(map, str));
                } else if ("epk".equals(str)) {
                    parsedBase64URL = parsedBase64URL.ephemeralPublicKey(JWK.parse(JSONObjectUtils.getJSONObject(map, str)));
                } else if ("zip".equals(str)) {
                    String string2 = JSONObjectUtils.getString(map, str);
                    if (string2 != null) {
                        parsedBase64URL = parsedBase64URL.compressionAlgorithm(new CompressionAlgorithm(string2));
                    }
                } else {
                    parsedBase64URL = "apu".equals(str) ? parsedBase64URL.agreementPartyUInfo(Base64URL.from(JSONObjectUtils.getString(map, str))) : "apv".equals(str) ? parsedBase64URL.agreementPartyVInfo(Base64URL.from(JSONObjectUtils.getString(map, str))) : "p2s".equals(str) ? parsedBase64URL.pbes2Salt(Base64URL.from(JSONObjectUtils.getString(map, str))) : "p2c".equals(str) ? parsedBase64URL.pbes2Count(JSONObjectUtils.getInt(map, str)) : "iv".equals(str) ? parsedBase64URL.iv(Base64URL.from(JSONObjectUtils.getString(map, str))) : "tag".equals(str) ? parsedBase64URL.authTag(Base64URL.from(JSONObjectUtils.getString(map, str))) : parsedBase64URL.customParam(str, map.get(str));
                }
            }
        }
        return parsedBase64URL.build();
    }

    private static EncryptionMethod parseEncryptionMethod(Map<String, Object> map) {
        return EncryptionMethod.parse(JSONObjectUtils.getString(map, "enc"));
    }

    @Override // com.nimbusds.jose.Header
    public JWEAlgorithm getAlgorithm() {
        return (JWEAlgorithm) super.getAlgorithm();
    }

    public CompressionAlgorithm getCompressionAlgorithm() {
        return this.zip;
    }

    public EncryptionMethod getEncryptionMethod() {
        return this.enc;
    }

    @Override // com.nimbusds.jose.CommonSEHeader, com.nimbusds.jose.Header
    public Map<String, Object> toJSONObject() {
        Map<String, Object> jSONObject = super.toJSONObject();
        EncryptionMethod encryptionMethod = this.enc;
        if (encryptionMethod != null) {
            jSONObject.put("enc", encryptionMethod.toString());
        }
        JWK jwk = this.epk;
        if (jwk != null) {
            jSONObject.put("epk", jwk.toJSONObject());
        }
        CompressionAlgorithm compressionAlgorithm = this.zip;
        if (compressionAlgorithm != null) {
            jSONObject.put("zip", compressionAlgorithm.toString());
        }
        Base64URL base64URL = this.apu;
        if (base64URL != null) {
            jSONObject.put("apu", base64URL.toString());
        }
        Base64URL base64URL2 = this.apv;
        if (base64URL2 != null) {
            jSONObject.put("apv", base64URL2.toString());
        }
        Base64URL base64URL3 = this.p2s;
        if (base64URL3 != null) {
            jSONObject.put("p2s", base64URL3.toString());
        }
        int i = this.p2c;
        if (i > 0) {
            jSONObject.put("p2c", Integer.valueOf(i));
        }
        Base64URL base64URL4 = this.iv;
        if (base64URL4 != null) {
            jSONObject.put("iv", base64URL4.toString());
        }
        Base64URL base64URL5 = this.tag;
        if (base64URL5 != null) {
            jSONObject.put("tag", base64URL5.toString());
        }
        return jSONObject;
    }

    public JWEHeader(Algorithm algorithm, EncryptionMethod encryptionMethod, JOSEObjectType jOSEObjectType, String str, Set<String> set, URI uri, JWK jwk, URI uri2, Base64URL base64URL, Base64URL base64URL2, List<Base64> list, String str2, JWK jwk2, CompressionAlgorithm compressionAlgorithm, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5, int i, Base64URL base64URL6, Base64URL base64URL7, Map<String, Object> map, Base64URL base64URL8) {
        super(algorithm, jOSEObjectType, str, set, uri, jwk, uri2, base64URL, base64URL2, list, str2, map, base64URL8);
        if (algorithm.getName().equals(Algorithm.NONE.getName())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (encryptionMethod == null) {
            throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
        }
        if (jwk2 != null && jwk2.isPrivate()) {
            throw new IllegalArgumentException("Ephemeral public key should not be a private key");
        }
        this.enc = encryptionMethod;
        this.epk = jwk2;
        this.zip = compressionAlgorithm;
        this.apu = base64URL3;
        this.apv = base64URL4;
        this.p2s = base64URL5;
        this.p2c = i;
        this.iv = base64URL6;
        this.tag = base64URL7;
    }

    public static JWEHeader parse(String str, Base64URL base64URL) {
        return parse(JSONObjectUtils.parse(str, ModuleDescriptor.MODULE_VERSION), base64URL);
    }

    public static JWEHeader parse(Base64URL base64URL) {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
