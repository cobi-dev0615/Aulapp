package defpackage;


import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.UInt;
import kotlin.ranges.IntRange;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int A(int i, int i2, int i3, int i4) {
        return ((i * i2) + i3) - i4;
    }

    public static String B(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void C(Object zzicVar, String str) {
        throw new UnsupportedOperationException();
    }

    public static int D(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static int a() {
        return new Random().nextInt();
    }

    public static int b(int i) {
        return new Random().nextInt(i);
    }

    public static int c(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    public static int d(int i, int i2, int i3, int i4, int i5) {
        return (i * i2) + i3 + i4 + i5;
    }

    public static int e(UInt uInt, int i) {
        return uInt.hashCode() + i;
    }

    public static int f(IntRange intRange, int i) {
        return intRange.getEndInclusive().intValue() + i;
    }

    public static int g(boolean z, int i, int i2) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static Object h(String str, String str2, Object obj) {
        return Class.forName(str).getField(str2).get(obj);
    }

    public static Object i(String str, String str2, Class[] clsArr, Object obj, Object[] objArr) {
        return Class.forName(str).getDeclaredMethod(str2, clsArr).invoke(obj, objArr);
    }

    public static String j(String str, int i) {
        return str + i;
    }

    public static String k(String str, IOException iOException) {
        return str + iOException;
    }

    public static String l(String str, String str2) {
        return str + str2;
    }

    public static String m(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String n(String str, CipherParameters cipherParameters) {
        return str.concat(cipherParameters.getClass().getName());
    }

    public static String o(StringBuilder sb, String str) {
        return str + ((Object) sb);
    }

    public static String p(org.spongycastle.crypto.CipherParameters cipherParameters, String str) {
        return str.concat(cipherParameters.getClass().getName());
    }

    public static StringBuilder q(Boolean bool, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(bool);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder r(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder s(String str, String str2, StringBuilder sb, ASN1ObjectIdentifier aSN1ObjectIdentifier, ConfigurableProvider configurableProvider) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, aSN1ObjectIdentifier, sb.toString());
        return new StringBuilder();
    }

    public static StringBuilder t(StringBuilder sb, String str, org.spongycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, String str2, org.spongycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, aSN1ObjectIdentifier, sb.toString());
        return new StringBuilder();
    }

    public static StringBuilder u(StringBuilder sb, org.spongycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, org.spongycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, String str, String str2) {
        sb.append(aSN1ObjectIdentifier);
        configurableProvider.addAlgorithm(sb.toString(), str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder v(ConfigurableProvider configurableProvider, String str, String str2, String str3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, aSN1ObjectIdentifier, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        return sb;
    }

    public static StringBuilder w(org.spongycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, String str, String str2, String str3, org.spongycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm(str, aSN1ObjectIdentifier, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        return sb;
    }

    public static ArrayList x(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    public static ArrayList y(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    public static void z(Object zzicVar, String str) {
        throw new UnsupportedOperationException();
    }
}
