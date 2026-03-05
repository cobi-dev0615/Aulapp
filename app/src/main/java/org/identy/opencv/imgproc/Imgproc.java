package org.identy.opencv.imgproc;
import org.identy.opencv.core.Mat;
public class Imgproc {
    public static final int COLOR_BGR2GRAY = 6;
    public static final int COLOR_BGRA2GRAY = 10;
    public static final int COLOR_RGBA2GRAY = 11;
    public static final int COLOR_BGR2RGB = 4;
    public static final int INTER_LINEAR = 1;
    public static final int INTER_AREA = 3;
    public static final int THRESH_BINARY = 0;
    public static final int THRESH_BINARY_INV = 1;
    public static void cvtColor(Mat src, Mat dst, int code) {}
    public static void resize(Mat src, Mat dst, Object dsize) {}
    public static void resize(Mat src, Mat dst, Object dsize, double fx, double fy, int interpolation) {}
    public static void GaussianBlur(Mat src, Mat dst, Object ksize, double sigmaX) {}
    public static double threshold(Mat src, Mat dst, double thresh, double maxval, int type) { return 0; }
    public static void adaptiveThreshold(Mat src, Mat dst, double maxValue, int adaptiveMethod, int thresholdType, int blockSize, double C) {}
    public static void equalizeHist(Mat src, Mat dst) {}
}
