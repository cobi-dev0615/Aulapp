package co.ceduladigital.sdk;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class q {
    public static void A(StringBuilder sb, Object aSN1ObjectIdentifier, Object configurableProvider, String str) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static void B(Object configurableProvider, String str, String str2, String str3, Object aSN1ObjectIdentifier) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static void C(Object configurableProvider, String str, String str2, String str3, Object aSN1ObjectIdentifier) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static StringBuilder D(String str, String str2, StringBuilder sb, Object aSN1ObjectIdentifier, Object configurableProvider) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static int b(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(creator.createFromParcel(parcel));
        return i + i2;
    }

    public static ClassCastException c(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static Object d(List list, int i) {
        return list.get(list.size() - i);
    }

    public static String e(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String f(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String g(Exception exc, StringBuilder sb) {
        sb.append(exc.getMessage());
        return sb.toString();
    }

    public static String h(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String k(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String m(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static StringBuilder n(String str, String str2, String str3, StringBuilder sb, Object configurableProvider) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static StringBuilder o(String str, String str2, String str3, StringBuilder sb, Object configurableProvider) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static StringBuilder p(String str, String str2, StringBuilder sb, Object aSN1ObjectIdentifier, Object configurableProvider) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static StringBuilder q(StringBuilder sb, Object aSN1ObjectIdentifier, Object configurableProvider, String str, String str2) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static StringBuilder r(Object configurableProvider, String str, String str2, String str3) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static Iterator s(Iterable iterable, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(iterable, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return iterable.iterator();
    }

    public static Object t(Object eCFieldElement, Object eCFieldElement2, Object eCFieldElement3) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static Object u(Object eCFieldElement, Object eCFieldElement2, Object eCFieldElement3) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static void v(Activity activity, int i, TextView textView, int i2, MaterialButton materialButton) {
        textView.setText(activity.getString(i));
        materialButton.setText(activity.getString(i2));
    }

    public static void w(Activity activity, int i, TextView textView, ImageView imageView, int i2) {
        textView.setText(activity.getString(i));
        imageView.setImageResource(i2);
    }

    public static void x(String str, String str2, String str3, StringBuilder sb, Object configurableProvider) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static void y(String str, String str2, String str3, StringBuilder sb, Object configurableProvider) {
        throw new UnsupportedOperationException("Decompiled stub");
    }

    public static void z(StringBuilder sb, Object aSN1ObjectIdentifier, Object configurableProvider, String str) {
        throw new UnsupportedOperationException("Decompiled stub");
    }
}
