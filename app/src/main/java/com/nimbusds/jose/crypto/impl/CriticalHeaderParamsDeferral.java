package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.Header;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWEHeader;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public class CriticalHeaderParamsDeferral {
    private Set<String> deferredParams = Collections.EMPTY_SET;

    public void ensureHeaderPasses(JWEHeader jWEHeader) {
        if (!headerPasses(jWEHeader)) {
            throw new JOSEException("Unsupported critical header parameter(s)");
        }
    }

    public Set<String> getDeferredCriticalHeaderParams() {
        return Collections.unmodifiableSet(this.deferredParams);
    }

    public Set<String> getProcessedCriticalHeaderParams() {
        return Collections.singleton("b64");
    }

    public boolean headerPasses(Header header) {
        if (header.getCriticalParams() == null) {
            return true;
        }
        for (String str : header.getCriticalParams()) {
            if (!getProcessedCriticalHeaderParams().contains(str) && !getDeferredCriticalHeaderParams().contains(str)) {
                return false;
            }
        }
        return true;
    }
}
