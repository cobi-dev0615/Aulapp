package org.c.a;
import android.graphics.Canvas;
public class PngjBadCrcException extends android.view.View {
    public PngjBadCrcException(android.content.Context context) { super(context); }
    public PngjBadCrcException(android.content.Context context, android.util.AttributeSet attrs) { super(context, attrs); }

    public interface values {
        void drawCallback(Canvas canvas);
    }
}
