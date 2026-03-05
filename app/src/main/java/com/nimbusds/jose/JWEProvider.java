package com.nimbusds.jose;

import java.util.Set;

/* loaded from: classes2.dex */
public interface JWEProvider {
    Set<EncryptionMethod> supportedEncryptionMethods();

    Set<JWEAlgorithm> supportedJWEAlgorithms();
}
