package com.gse.aulapp.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import com.google.gson.annotations.SerializedName;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0007j\b\u0012\u0004\u0012\u00020\u0006`\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0007j\b\u0012\u0004\u0012\u00020\u0006`\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0007j\b\u0012\u0004\u0012\u00020\u0006`\u0005HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0007j\b\u0012\u0004\u0012\u00020\u0006`\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006$"}, d2 = {"Lcom/gse/aulapp/model/response/TestResponse;", "Landroid/os/Parcelable;", "testID", BuildConfig.FLAVOR, "questions", "Lkotlin/collections/ArrayList;", "Lcom/gse/aulapp/model/response/QuestionsResponse;", "Ljava/util/ArrayList;", "<init>", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getTestID", "()Ljava/lang/String;", "setTestID", "(Ljava/lang/String;)V", "getQuestions", "()Ljava/util/ArrayList;", "setQuestions", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/util/ArrayList;)Lcom/gse/aulapp/model/response/TestResponse;", "describeContents", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class TestResponse implements Parcelable {
    public static final Parcelable.Creator<TestResponse> CREATOR = new Creator();

    @SerializedName("questions")
    private ArrayList<QuestionsResponse> questions;

    @SerializedName("testID")
    private String testID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TestResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TestResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = q.b(QuestionsResponse.CREATOR, parcel, arrayList, i, 1);
            }
            return new TestResponse(readString, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TestResponse[] newArray(int i) {
            return new TestResponse[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TestResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestResponse copy$default(TestResponse testResponse, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = testResponse.testID;
        }
        if ((i & 2) != 0) {
            arrayList = testResponse.questions;
        }
        return testResponse.copy(str, arrayList);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTestID() {
        return this.testID;
    }

    public final ArrayList<QuestionsResponse> component2() {
        return this.questions;
    }

    public final TestResponse copy(String testID, ArrayList<QuestionsResponse> questions) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        return new TestResponse(testID, questions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TestResponse)) {
            return false;
        }
        TestResponse testResponse = (TestResponse) other;
        return Intrinsics.areEqual(this.testID, testResponse.testID) && Intrinsics.areEqual(this.questions, testResponse.questions);
    }

    public final ArrayList<QuestionsResponse> getQuestions() {
        return this.questions;
    }

    public int hashCode() {
        String str = this.testID;
        return this.questions.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final void setQuestions(ArrayList<QuestionsResponse> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.questions = arrayList;
    }

    public final void setTestID(String str) {
        this.testID = str;
    }

    public String toString() {
        return "TestResponse(testID=" + this.testID + ", questions=" + this.questions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.testID);
        ArrayList<QuestionsResponse> arrayList = this.questions;
        dest.writeInt(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            QuestionsResponse questionsResponse = arrayList.get(i);
            i++;
            questionsResponse.writeToParcel(dest, flags);
        }
    }

    public TestResponse(String str, ArrayList<QuestionsResponse> questions) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        this.testID = str;
        this.questions = questions;
    }

    public /* synthetic */ TestResponse(String str, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : arrayList);
    }
}
