package arid.a;

import arid.Action;

/* loaded from: classes.dex */
public final class PngjBadCrcException {
    final Action valueOf;
    public static final double[] values = {0.73d, 1.03d, 0.97d, 1.11d, 1.22d};
    static final double PngjBadCrcException = (-1.0d) / Math.log(2.0d);
    double PngjException = 0.7d;
    int PngjBadSignature = -1;
    final double[] PngjOutputException = new double[5];
    final double[] PngjExceptionInternal = new double[5];
    final double[] PngjUnsupportedException = new double[5];
    final int[] PngjPrematureEnding = new int[256];
    int PngjInputException = -1;
    boolean onErrorResponse = false;
    double a = 1.0d;
    final double[] Action = {-1.0d, -1.0d, -1.0d, -1.0d, -1.0d};

    public static /* synthetic */ class PngjException {
        static final /* synthetic */ int[] PngjBadCrcException;

        static {
            int[] iArr = new int[arid.valueOf.valuesCustom().length];
            PngjBadCrcException = iArr;
            try {
                iArr[arid.valueOf.FILTER_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PngjBadCrcException[arid.valueOf.FILTER_PAETH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PngjBadCrcException[arid.valueOf.FILTER_SUB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PngjBadCrcException[arid.valueOf.FILTER_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PngjBadCrcException[arid.valueOf.FILTER_AVERAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public PngjBadCrcException(Action action) {
        this.valueOf = action;
    }
}
