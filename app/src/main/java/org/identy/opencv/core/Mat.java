package org.identy.opencv.core;
public class Mat {
    public long PngjException;
    public Mat() {}
    public Mat(int rows, int cols, int type) {}
    public Mat(long addr) { this.PngjException = addr; }
    public int rows() { return 0; }
    public int cols() { return 0; }
    public int type() { return 0; }
    public int channels() { return 0; }
    public long getNativeObjAddr() { return 0; }
    public void release() {}
    public Mat clone() { return new Mat(); }
    public Mat submat(int rowStart, int rowEnd, int colStart, int colEnd) { return new Mat(); }
    public int get(int row, int col, byte[] data) { return 0; }
    public int get(int row, int col, float[] data) { return 0; }
    public int put(int row, int col, byte[] data) { return 0; }
    public int put(int row, int col, float[] data) { return 0; }
    public boolean empty() { return true; }
    public void convertTo(Mat m, int rtype) {}
    public void convertTo(Mat m, int rtype, double alpha) {}
    public static Mat zeros(int rows, int cols, int type) { return new Mat(); }
    public int width() { return 0; }
    public int height() { return 0; }
    public long total() { return 0; }
    public void create(int rows, int cols, int type) {}
    public void setTo(Object scalar) {}
    public Mat reshape(int cn) { return new Mat(); }
    public Mat reshape(int cn, int rows) { return new Mat(); }
    public void copyTo(Mat m) {}
    public static long n_clone(long addr) { return 0; }
    public static int n_cols(long addr) { return 0; }
    public static int n_rows(long addr) { return 0; }
    public static void n_release(long addr) {}
    public static boolean n_empty(long addr) { return false; }
    public static double[] n_size(long addr) { return new double[]{0, 0}; }
    public void PngjBadSignature(byte[] data) {}
}
