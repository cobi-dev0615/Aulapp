package com.nimbusds.jose;

import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONObjectUtils;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class Header implements Serializable {
    private static final Map<String, Object> EMPTY_CUSTOM_PARAMS = Collections.unmodifiableMap(new HashMap());
    private final Algorithm alg;
    private final Set<String> crit;
    private final String cty;
    private final Map<String, Object> customParams;
    private final Base64URL parsedBase64URL;
    private final JOSEObjectType typ;

    public Header(Algorithm algorithm, JOSEObjectType jOSEObjectType, String str, Set<String> set, Map<String, Object> map, Base64URL base64URL) {
        if (algorithm == null) {
            throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
        }
        this.alg = algorithm;
        this.typ = jOSEObjectType;
        this.cty = str;
        if (set != null) {
            this.crit = Collections.unmodifiableSet(new HashSet(set));
        } else {
            this.crit = null;
        }
        if (map != null) {
            this.customParams = Collections.unmodifiableMap(new HashMap(map));
        } else {
            this.customParams = EMPTY_CUSTOM_PARAMS;
        }
        this.parsedBase64URL = base64URL;
    }

    public static Algorithm parseAlgorithm(Map<String, Object> map) throws ParseException {
        String string = JSONObjectUtils.getString(map, "alg");
        if (string == null) {
            throw new ParseException("Missing \"alg\" in header JSON object", 0);
        }
        Algorithm algorithm = Algorithm.NONE;
        return string.equals(algorithm.getName()) ? algorithm : map.containsKey("enc") ? JWEAlgorithm.parse(string) : JWSAlgorithm.parse(string);
    }

    public Algorithm getAlgorithm() {
        return this.alg;
    }

    public Set<String> getCriticalParams() {
        return this.crit;
    }

    public Object getCustomParam(String str) {
        return this.customParams.get(str);
    }

    public Base64URL toBase64URL() {
        Base64URL base64URL = this.parsedBase64URL;
        return base64URL == null ? Base64URL.encode(toString()) : base64URL;
    }

    public Map<String, Object> toJSONObject() {
        Map<String, Object> newJSONObject = JSONObjectUtils.newJSONObject();
        newJSONObject.putAll(this.customParams);
        newJSONObject.put("alg", this.alg.toString());
        JOSEObjectType jOSEObjectType = this.typ;
        if (jOSEObjectType != null) {
            newJSONObject.put("typ", jOSEObjectType.toString());
        }
        String str = this.cty;
        if (str != null) {
            newJSONObject.put("cty", str);
        }
        Set<String> set = this.crit;
        if (set != null && !set.isEmpty()) {
            newJSONObject.put("crit", new ArrayList(this.crit));
        }
        return newJSONObject;
    }

    public String toString() {
        return JSONObjectUtils.toJSONString(toJSONObject());
    }
}
