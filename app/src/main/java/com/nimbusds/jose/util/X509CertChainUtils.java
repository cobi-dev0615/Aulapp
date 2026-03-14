package com.nimbusds.jose.util;

import co.ceduladigital.sdk.q;
import defpackage.a;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class X509CertChainUtils {
    public static List<X509Certificate> parse(List<Base64> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                X509Certificate parse = X509CertUtils.parse(list.get(i).decode());
                if (parse == null) {
                    throw new ParseException(a.j("Invalid X.509 certificate at position ", i), 0);
                }
                linkedList.add(parse);
            }
        }
        return linkedList;
    }

    public static List<Base64> toBase64List(List<Object> list) throws ParseException {
        if (list == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj == null) {
                throw new ParseException(q.f(i, "The X.509 certificate at position ", " must not be null"), 0);
            }
            if (!(obj instanceof String)) {
                throw new ParseException(q.f(i, "The X.509 certificate at position ", " must be encoded as a Base64 string"), 0);
            }
            linkedList.add(new Base64((String) obj));
        }
        return linkedList;
    }
}
