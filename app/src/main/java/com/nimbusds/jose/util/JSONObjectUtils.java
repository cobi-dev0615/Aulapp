package com.nimbusds.jose.util;

import co.ceduladigital.sdk.q;
import com.nimbusds.jose.shaded.json.JSONObject;
import com.nimbusds.jose.shaded.json.parser.JSONParser;
import defpackage.a;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class JSONObjectUtils {
    public static Base64URL getBase64URL(Map<String, Object> map, String str) {
        String string = getString(map, str);
        if (string == null) {
            return null;
        }
        return new Base64URL(string);
    }

    private static <T> T getGeneric(Map<String, Object> map, String str, Class<T> cls) {
        if (map.get(str) == null) {
            return null;
        }
        T t = (T) map.get(str);
        if (cls.isAssignableFrom(t.getClass())) {
            return t;
        }
        throw new ParseException(a.m("Unexpected type of JSON object member with key \"", str, "\""), 0);
    }

    public static int getInt(Map<String, Object> map, String str) {
        Number number = (Number) getGeneric(map, str, Number.class);
        if (number != null) {
            return number.intValue();
        }
        throw new ParseException(a.m("JSON object member with key \"", str, "\" is missing or null"), 0);
    }

    public static List<Object> getJSONArray(Map<String, Object> map, String str) {
        return (List) getGeneric(map, str, List.class);
    }

    public static Map<String, Object> getJSONObject(Map<String, Object> map, String str) {
        return (Map) getGeneric(map, str, JSONObject.class);
    }

    public static String getString(Map<String, Object> map, String str) {
        return (String) getGeneric(map, str, String.class);
    }

    public static String[] getStringArray(Map<String, Object> map, String str) {
        List<Object> jSONArray = getJSONArray(map, str);
        if (jSONArray == null) {
            return null;
        }
        try {
            return (String[]) jSONArray.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw new ParseException(a.m("JSON object member with key \"", str, "\" is not an array of strings"), 0);
        }
    }

    public static List<String> getStringList(Map<String, Object> map, String str) {
        String[] stringArray = getStringArray(map, str);
        if (stringArray == null) {
            return null;
        }
        return Arrays.asList(stringArray);
    }

    public static URI getURI(Map<String, Object> map, String str) {
        String string = getString(map, str);
        if (string == null) {
            return null;
        }
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    public static Map<String, Object> newJSONObject() {
        return new HashMap();
    }

    public static Map<String, Object> parse(String str, int i) {
        if (i >= 0 && str.length() > i) {
            throw new ParseException(q.f(i, "The parsed string is longer than the max accepted size of ", " characters"), 0);
        }
        try {
            Object parse = new JSONParser(640).parse(str);
            if (parse instanceof JSONObject) {
                return (JSONObject) parse;
            }
            throw new ParseException("JSON entity is not an object", 0);
        } catch (com.nimbusds.jose.shaded.json.parser.ParseException e) {
            throw new ParseException("Invalid JSON: " + e.getMessage(), 0);
        } catch (Exception e2) {
            throw new ParseException(q.g(e2, new StringBuilder("Unexpected exception: ")), 0);
        } catch (StackOverflowError unused) {
            throw new ParseException("Excessive JSON object and / or array nesting", 0);
        }
    }

    public static String toJSONString(Map<String, ?> map) {
        return JSONObject.toJSONString((Map<String, ? extends Object>) map);
    }
}
