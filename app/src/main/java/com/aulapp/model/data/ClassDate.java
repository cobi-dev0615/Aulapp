package com.gse.aulapp.model.data;

import android.os.Parcel;
import android.os.Parcelable;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.gse.aulapp.model.dto.SessionDto;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/gse/aulapp/model/data/ClassDate;", "Landroid/os/Parcelable;", BuildConfig.FLAVOR, "date", "day", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/SessionDto;", "classDetailList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "()V", "Landroid/os/Parcel;", "dest", BuildConfig.FLAVOR, "flags", BuildConfig.FLAVOR, "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "getDay", "Ljava/util/List;", "getClassDetailList", "()Ljava/util/List;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ClassDate implements Parcelable {
    public static final Parcelable.Creator<ClassDate> CREATOR = new Creator();
    private final List<SessionDto> classDetailList;
    private final String date;
    private final String day;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ClassDate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClassDate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = q.b(SessionDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ClassDate(readString, readString2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ClassDate[] newArray(int i) {
            return new ClassDate[i];
        }
    }

    public ClassDate(String date, String day, List<SessionDto> classDetailList) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(day, "day");
        Intrinsics.checkNotNullParameter(classDetailList, "classDetailList");
        this.date = date;
        this.day = day;
        this.classDetailList = classDetailList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClassDate)) {
            return false;
        }
        ClassDate classDate = (ClassDate) other;
        return Intrinsics.areEqual(this.date, classDate.date) && Intrinsics.areEqual(this.day, classDate.day) && Intrinsics.areEqual(this.classDetailList, classDate.classDetailList);
    }

    public final List<SessionDto> getClassDetailList() {
        return this.classDetailList;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDay() {
        return this.day;
    }

    public int hashCode() {
        return this.classDetailList.hashCode() + x5.d(this.day, this.date.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.date;
        String str2 = this.day;
        List<SessionDto> list = this.classDetailList;
        StringBuilder r = x5.r("ClassDate(date=", str, ", day=", str2, ", classDetailList=");
        r.append(list);
        r.append(")");
        return r.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.date);
        dest.writeString(this.day);
        List<SessionDto> list = this.classDetailList;
        dest.writeInt(list.size());
        Iterator<SessionDto> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public ClassDate() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, CollectionsKt.emptyList());
    }
}
