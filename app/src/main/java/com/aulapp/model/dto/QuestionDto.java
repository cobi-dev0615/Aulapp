package com.gse.aulapp.model.dto;

import co.ceduladigital.sdk.x5;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJD\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/gse/aulapp/model/dto/QuestionDto;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "id", "testId", "answer", "description", "Lcom/gse/aulapp/model/dto/Status;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/dto/Status;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/gse/aulapp/model/dto/Status;)Lcom/gse/aulapp/model/dto/QuestionDto;", "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTestId", "getAnswer", "getDescription", "Lcom/gse/aulapp/model/dto/Status;", "getStatus", "()Lcom/gse/aulapp/model/dto/Status;", "setStatus", "(Lcom/gse/aulapp/model/dto/Status;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class QuestionDto {
    private final String answer;
    private final String description;
    private final String id;
    private Status status;
    private final String testId;

    public QuestionDto(String id, String testId, String answer, String description, Status status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(testId, "testId");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = id;
        this.testId = testId;
        this.answer = answer;
        this.description = description;
        this.status = status;
    }

    public static /* synthetic */ QuestionDto copy$default(QuestionDto questionDto, String str, String str2, String str3, String str4, Status status, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionDto.id;
        }
        if ((i & 2) != 0) {
            str2 = questionDto.testId;
        }
        if ((i & 4) != 0) {
            str3 = questionDto.answer;
        }
        if ((i & 8) != 0) {
            str4 = questionDto.description;
        }
        if ((i & 16) != 0) {
            status = questionDto.status;
        }
        Status status2 = status;
        String str5 = str3;
        return questionDto.copy(str, str2, str5, str4, status2);
    }

    public final QuestionDto copy(String id, String testId, String answer, String description, Status status) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(testId, "testId");
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(description, "description");
        return new QuestionDto(id, testId, answer, description, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionDto)) {
            return false;
        }
        QuestionDto questionDto = (QuestionDto) other;
        return Intrinsics.areEqual(this.id, questionDto.id) && Intrinsics.areEqual(this.testId, questionDto.testId) && Intrinsics.areEqual(this.answer, questionDto.answer) && Intrinsics.areEqual(this.description, questionDto.description) && this.status == questionDto.status;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final String getTestId() {
        return this.testId;
    }

    public int hashCode() {
        int d = x5.d(this.description, x5.d(this.answer, x5.d(this.testId, this.id.hashCode() * 31, 31), 31), 31);
        Status status = this.status;
        return d + (status == null ? 0 : status.hashCode());
    }

    public final void setStatus(Status status) {
        this.status = status;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.testId;
        String str3 = this.answer;
        String str4 = this.description;
        Status status = this.status;
        StringBuilder r = x5.r("QuestionDto(id=", str, ", testId=", str2, ", answer=");
        x5.z(r, str3, ", description=", str4, ", status=");
        r.append(status);
        r.append(")");
        return r.toString();
    }

    public /* synthetic */ QuestionDto(String str, String str2, String str3, String str4, Status status, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : status);
    }
}
