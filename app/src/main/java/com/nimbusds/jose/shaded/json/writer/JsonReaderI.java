package com.nimbusds.jose.shaded.json.writer;

/* loaded from: classes2.dex */
public abstract class JsonReaderI<T> {
    private static String ERR_MSG = "Invalid or non Implemented status";
    public final JsonReader base;

    public JsonReaderI(JsonReader jsonReader) {
        this.base = jsonReader;
    }

    public abstract void addValue(Object obj, Object obj2);

    /* JADX WARN: Multi-variable type inference failed */
    public T convert(Object obj) {
        return (T) obj;
    }

    public abstract Object createArray();

    public Object createObject() {
        throw new RuntimeException(ERR_MSG + " createObject() in " + getClass());
    }

    public void setValue(Object obj, String str, Object obj2) {
        throw new RuntimeException(ERR_MSG + " setValue in " + getClass() + " key=" + str);
    }

    public JsonReaderI<?> startArray(String str) {
        throw new RuntimeException(ERR_MSG + " startArray in " + getClass() + " key=" + str);
    }

    public JsonReaderI<?> startObject(String str) {
        throw new RuntimeException(ERR_MSG + " startObject(String key) in " + getClass() + " key=" + str);
    }
}
