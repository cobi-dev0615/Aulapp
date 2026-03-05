package arid.chunks;

import arid.AridA;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class valueOf {
    public static final byte[] PngjBadSignature = "IHDR".getBytes(AridA.valueOf);
    public static final byte[] PngjException = "IDAT".getBytes(AridA.valueOf);
    public static final byte[] valueOf = "IEND".getBytes(AridA.valueOf);

    static {
        Pattern.compile("[a-zA-Z][a-zA-Z][A-Z][a-zA-Z]");
    }

    public static int PngjBadCrcException(List<PngjInputException> list, PngjBadCrcException pngjBadCrcException) {
        Iterator<PngjInputException> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (pngjBadCrcException.PngjBadCrcException(it.next())) {
                it.remove();
                i++;
            }
        }
        return i;
    }

    public static byte[] PngjBadSignature(String str) {
        return str.getBytes(AridA.valueOf);
    }

    public static boolean PngjException(PngjInputException pngjInputException) {
        return false;
    }

    public static boolean valueOf(String str) {
        return Character.isUpperCase(str.charAt(0));
    }

    public static String values(byte[] bArr) {
        return new String(bArr, AridA.valueOf);
    }

    public static boolean PngjException(String str) {
        return Character.isUpperCase(str.charAt(1));
    }

    public static final boolean values(PngjInputException pngjInputException, PngjInputException pngjInputException2) {
        if (pngjInputException == pngjInputException2) {
            return true;
        }
        return (pngjInputException == null || pngjInputException2 == null || !pngjInputException.PngjBadSignature.equals(pngjInputException2.PngjBadSignature) || pngjInputException.PngjException || pngjInputException.getClass() != pngjInputException2.getClass() || pngjInputException2.PngjBadSignature()) ? false : true;
    }

    public static boolean values(String str) {
        return !Character.isUpperCase(str.charAt(3));
    }
}
