package com.gse.aulapp.util;

import androidx.annotation.Keep;
import androidx.view.LifecycleOwner;
import androidx.view.MutableLiveData;
import androidx.view.Observer;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;

@Keep
/* loaded from: classes.dex */
public class SingleLiveEvent<T> extends MutableLiveData<T> implements Serializable {
    private final AtomicBoolean mPending = new AtomicBoolean(false);

    public void call() {
        setValue(null);
    }

    @Override // androidx.view.LiveData
    public void observe(LifecycleOwner lifecycleOwner, final Observer<? super T> observer) {
        super.observe(lifecycleOwner, new Observer<T>() { // from class: com.gse.aulapp.util.SingleLiveEvent.1
            @Override // androidx.view.Observer
            public void onChanged(T t) {
                if (SingleLiveEvent.this.mPending.compareAndSet(true, false)) {
                    observer.onChanged(t);
                }
            }
        });
    }

    @Override // androidx.view.MutableLiveData, androidx.view.LiveData
    public void setValue(T t) {
        this.mPending.set(true);
        super.setValue(t);
    }
}
