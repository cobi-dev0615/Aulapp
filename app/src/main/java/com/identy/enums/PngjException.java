package com.identy.enums;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class PngjException implements Serializable {
    private String PngjException;
    public PngjBadSignature values;

    public PngjException(PngjBadSignature pngjBadSignature, String str) {
        PngjBadSignature pngjBadSignature2 = PngjBadSignature.ACCEPTED;
        this.values = pngjBadSignature;
        this.PngjException = str;
    }
}
