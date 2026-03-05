package org.identy.opencv.core;
public class Mat {
    public Mat() {}
    public Mat(int rows, int cols, int type) {}
    public Mat(long addr) {}
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
}
