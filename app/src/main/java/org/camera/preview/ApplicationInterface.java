package org.camera.preview;

import android.content.Context;
import android.graphics.Canvas;

public interface ApplicationInterface {
    int Action();
    boolean Attempt();
    String PngBadCharsetException();
    boolean PngjBadCrcException();
    String PngjBadSignature();
    void PngjBadSignature(boolean z);
    Context PngjException();
    void PngjException(Canvas canvas);
    void PngjException(boolean z);
    String PngjExceptionInternal();
    String PngjInputException();
    String PngjOutputException();
    int PngjPrematureEnding();
    int PngjUnsupportedException();
    String a();
    boolean e1();
    float getAsHighestSecurityLevelReached();
    void getCaptureTime();
    boolean getData();
    int getFingerPrintQualityScore();
    void getL1Score();
    boolean getL3Score();
    void getMatchingTime();
    void getNfiq1Score();
    void getOveralTimetaken();
    boolean getPadSub1();
    int getPadSub2();
    long getPadSub3();
    void getProcessingTime();
    double getQualityScore();
    boolean getScore();
    void getSpoofScore();
    boolean isAuthSucess();
    boolean isQualityFailed();
    long onErrorResponse();
    String valueOf();
    String values();
}
