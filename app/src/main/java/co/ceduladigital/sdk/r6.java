package co.ceduladigital.sdk;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.encoders.proto.ProtobufEncoder;

/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements ObjectEncoder {
    public final /* synthetic */ int a;

    public /* synthetic */ r6(int i) {
        this.a = i;
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final void encode(Object obj, Object obj2) {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Not decompiled");
            default:
                throw new UnsupportedOperationException("Not decompiled");
        }
    }
}
