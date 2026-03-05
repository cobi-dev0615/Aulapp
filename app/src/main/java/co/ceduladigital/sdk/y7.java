package co.ceduladigital.sdk;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.TableInfo;
import com.google.firebase.encoders.FieldDescriptor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class y7 {
    public static void A(int i, FieldDescriptor.Builder builder) {
        // Stubbed: zzbi (non-public gms internal)
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static /* synthetic */ void B(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static int C(int i, int i2, int i3) {
        // Stubbed: zzlm.zzz (non-public gms internal)
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static int D(int i, int i2, int i3) {
        // Stubbed: zzuc.zzz (non-public gms internal)
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static int a(int i, int i2, int i3) {
        // Stubbed: zzbdq.zzF (non-public gms internal)
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static int b(CharSequence charSequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return charSequence.length();
    }

    public static FieldDescriptor.Builder c(int i, FieldDescriptor.Builder builder, String str) {
        // Stubbed: zzbi (non-public gms internal)
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static FieldDescriptor d(int i, FieldDescriptor.Builder builder) {
        // Stubbed: zzbi (non-public gms internal)
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static Object e(Object zzbkVar, int i, List list, int i2) {
        // Stubbed: zzbk (non-public gms internal)
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static Object f(CharSequence charSequence, int i, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i)));
    }

    public static Object g(byte[] bArr, int i, Function1 function1) {
        return function1.invoke(UByte.m47boximpl(UByteArray.m111getw2LRezQ(bArr, i)));
    }

    public static Object h(int[] iArr, int i, Function1 function1) {
        return function1.invoke(UInt.m124boximpl(UIntArray.m190getpVg5ArA(iArr, i)));
    }

    public static Object i(long[] jArr, int i, Function1 function1) {
        return function1.invoke(ULong.m203boximpl(ULongArray.m269getsVKNKU(jArr, i)));
    }

    public static Object j(short[] sArr, int i, Function1 function1) {
        return function1.invoke(UShort.m310boximpl(UShortArray.m374getMh2AYeg(sArr, i)));
    }

    public static String k(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String l(String str, long j) {
        return str + j;
    }

    public static String m(String str, TableInfo tableInfo, String str2, TableInfo tableInfo2) {
        return str + tableInfo + str2 + tableInfo2;
    }

    public static String n(String str, Class cls, String str2) {
        return str + cls + str2;
    }

    public static String o(String str, Exception exc) {
        return str + exc;
    }

    public static String p(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String q(Object aSN1Sequence, StringBuilder sb) {
        // Stubbed: org.bouncycastle.asn1.ASN1Sequence
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static String r(Object configurableProvider, String str, String str2, String str3, String str4) {
        // Stubbed: org.bouncycastle ConfigurableProvider
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static String s(Object aSN1Sequence, StringBuilder sb) {
        // Stubbed: org.spongycastle.asn1.ASN1Sequence
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static String t(Object configurableProvider, String str, String str2, String str3, String str4) {
        // Stubbed: org.spongycastle ConfigurableProvider
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder v(String str, String str2, String str3, StringBuilder sb, Object configurableProvider) {
        // Stubbed: org.bouncycastle ConfigurableProvider
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static StringBuilder w(String str, String str2, String str3, StringBuilder sb, Object configurableProvider) {
        // Stubbed: org.spongycastle ConfigurableProvider
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static HashSet x(HashMap hashMap, String str, TableInfo.Column column, int i) {
        hashMap.put(str, column);
        return new HashSet(i);
    }

    public static Iterator y(Sequence sequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(sequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return sequence.iterator();
    }

    public static void z(int i, int i2, Object aSN1ObjectIdentifier, HashMap hashMap, Integer num) {
        // Stubbed: XMSSMTParameters, ASN1ObjectIdentifier (org.bouncycastle)
        throw new UnsupportedOperationException("Decompiled stub");
    }
}
