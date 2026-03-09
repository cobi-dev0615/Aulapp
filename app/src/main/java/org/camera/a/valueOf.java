package org.camera.a;

import android.app.Activity;

public class valueOf {
    public int PngjBadSignature;
    public boolean PngjException;
    public Activity valueOf;

    public valueOf() {}
    public valueOf(Activity activity) {
        this.valueOf = activity;
    }

    public class PngjBadCrcException implements Runnable {
        private boolean flag;
        public PngjBadCrcException() {}
        public PngjBadCrcException(boolean flag) {
            this.flag = flag;
        }
        @Override
        public void run() {}
    }
}
