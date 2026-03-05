package org.identy.opencv.imgcodecs;
import org.identy.opencv.core.Mat;
public class Imgcodecs {
    public static final int IMREAD_COLOR = 1;
    public static final int IMREAD_GRAYSCALE = 0;
    public static final int IMREAD_UNCHANGED = -1;
    public static Mat imread(String filename) { return new Mat(); }
    public static Mat imread(String filename, int flags) { return new Mat(); }
    public static boolean imwrite(String filename, Mat img) { return false; }
    public static Mat imdecode(Mat buf, int flags) { return new Mat(); }
}
