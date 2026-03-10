package org.identy.opencv.core;
public class valueOf {
    public double PngjBadSignature;
    public double values;
    public valueOf() {}
    public valueOf(double width, double height) {
        this.PngjBadSignature = width;
        this.values = height;
    }
    public valueOf(double[] arr) {
        if (arr != null && arr.length >= 2) {
            this.PngjBadSignature = arr[0];
            this.values = arr[1];
        }
    }
}
