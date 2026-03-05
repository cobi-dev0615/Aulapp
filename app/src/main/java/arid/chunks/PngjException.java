package arid.chunks;

import arid.Action;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PngjException {
    public final Action PngjException;
    public List valueOf = new ArrayList();
    private boolean values = false;

    public PngjException(Action action) {
        this.PngjException = action;
    }
}
