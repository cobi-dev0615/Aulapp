package com.identy.exceptions;

/* loaded from: classes2.dex */
public final class LivenessValidException extends Exception {
    public LivenessValidException() {
        super(" Please include liveness module or include liveness server config or disable AS ");
    }

    public LivenessValidException(String str) {
        super(str);
    }
}
