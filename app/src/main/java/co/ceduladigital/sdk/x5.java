package co.ceduladigital.sdk;

import android.os.Parcel;
import com.google.crypto.tink.shaded.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.KeySpec;
import java.util.Iterator;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class x5 {
    public static void A(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
    }

    public static void B(StringBuilder sb, String str, org.spongycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, String str2) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
    }

    public static int C(int i, int i2, int i3, int i4) {
        return ((i + i2) - i3) % i4;
    }

    public static int D(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static int a(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return CodedOutputStream.computeUInt32SizeNoTag(i) + i2 + i3 + i4;
    }

    public static int c(long j, BigInteger bigInteger) {
        return bigInteger.mod(BigInteger.valueOf(j)).intValue();
    }

    public static int d(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static long e(long j, long j2, long j3, long j4) {
        return (j * j2) + j3 + j4;
    }

    public static ClassCastException f(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String g(IOException iOException, StringBuilder sb) {
        sb.append(iOException.getMessage());
        return sb.toString();
    }

    public static String h(Exception exc, StringBuilder sb) {
        sb.append(exc.toString());
        return sb.toString();
    }

    public static String i(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    public static String j(String str, int i, int i2) {
        return str.substring(str.indexOf(i) + i2);
    }

    public static String k(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        return str + aSN1ObjectIdentifier + str2;
    }

    public static String l(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String m(AlgorithmParameterSpec algorithmParameterSpec, String str) {
        return str.concat(algorithmParameterSpec.getClass().getName());
    }

    public static String n(KeySpec keySpec, StringBuilder sb, String str) {
        sb.append(keySpec.getClass());
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder o(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder p(String str, Integer num, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(num);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder q(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static BigInteger s(long j, BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger2.multiply(bigInteger.add(BigInteger.valueOf(j)));
    }

    public static ASN1ObjectIdentifier t(String str) {
        return new ASN1ObjectIdentifier(str).intern();
    }

    public static org.spongycastle.asn1.ASN1ObjectIdentifier u(String str) {
        return new org.spongycastle.asn1.ASN1ObjectIdentifier(str).intern();
    }

    public static void v(Parcel parcel, int i, Boolean bool) {
        parcel.writeInt(i);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void w(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    public static /* synthetic */ void x(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void y(String str, BigInteger bigInteger, PrintStream printStream) {
        printStream.println(str + bigInteger);
    }

    public static void z(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }
}
