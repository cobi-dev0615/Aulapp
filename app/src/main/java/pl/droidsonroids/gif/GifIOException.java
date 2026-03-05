package pl.droidsonroids.gif;

import java.io.IOException;

/* loaded from: classes2.dex */
public class GifIOException extends IOException {
    private final String mErrnoMessage;
    public final GifError reason;

    public GifIOException(int i, String str) {
        this.reason = GifError.fromCode(i);
        this.mErrnoMessage = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.mErrnoMessage == null) {
            return this.reason.getFormattedDescription();
        }
        return this.reason.getFormattedDescription() + ": " + this.mErrnoMessage;
    }
}
