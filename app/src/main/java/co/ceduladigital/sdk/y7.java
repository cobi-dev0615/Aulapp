package co.ceduladigital.sdk;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.TableInfo;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzlm;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzbi;
import com.google.android.gms.internal.mlkit_vision_face_bundled.zzuc;
import com.google.android.gms.internal.mlkit_vision_internal_vkp.zzbdq;
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
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class y7 {
    public static void A(int i, FieldDescriptor.Builder builder) {
        zzbi zzbiVar = new zzbi();
        zzbiVar.zza(i);
        builder.withProperty(zzbiVar.zzb()).build();
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
        return zzlm.zzz(i) + i2 + i3;
    }

    public static int D(int i, int i2, int i3) {
        return zzuc.zzz(i) + i2 + i3;
    }

    public static int a(int i, int i2, int i3) {
        return zzbdq.zzF(i) + i2 + i3;
    }

    public static int b(CharSequence charSequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return charSequence.length();
    }

    public static FieldDescriptor.Builder c(int i, FieldDescriptor.Builder builder, String str) {
        zzbi zzbiVar = new zzbi();
        zzbiVar.zza(i);
        builder.withProperty(zzbiVar.zzb()).build();
        return FieldDescriptor.builder(str);
    }

    public static FieldDescriptor d(int i, FieldDescriptor.Builder builder) {
        zzbi zzbiVar = new zzbi();
        zzbiVar.zza(i);
        return builder.withProperty(zzbiVar.zzb()).build();
    }

    public static Object e(zzbk zzbkVar, int i, List list, int i2) {
        zzh.zza(zzbkVar.name(), i, list);
        return list.get(i2);
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

    public static String q(ASN1Sequence aSN1Sequence, StringBuilder sb) {
        sb.append(aSN1Sequence.size());
        return sb.toString();
    }

    public static String r(ConfigurableProvider configurableProvider, String str, String str2, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    public static String s(org.spongycastle.asn1.ASN1Sequence aSN1Sequence, StringBuilder sb) {
        sb.append(aSN1Sequence.size());
        return sb.toString();
    }

    public static String t(org.spongycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, String str, String str2, String str3, String str4) {
        configurableProvider.addAlgorithm(str, str2);
        return str3 + str4;
    }

    public static StringBuilder u(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder v(String str, String str2, String str3, StringBuilder sb, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder w(String str, String str2, String str3, StringBuilder sb, org.spongycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        return sb2;
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

    public static void z(int i, int i2, ASN1ObjectIdentifier aSN1ObjectIdentifier, HashMap hashMap, Integer num) {
        hashMap.put(num, new XMSSMTParameters(i, i2, aSN1ObjectIdentifier));
    }
}
