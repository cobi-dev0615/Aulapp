package com.gse.aulapp.model.dto;

import com.gse.aulapp.model.response.ExamPracticalConfigurationResponse;
import com.gse.aulapp.model.response.PracticalConfigurationResponse;
import com.gse.aulapp.model.response.SessionInstructorObjectResponse;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/gse/aulapp/model/dto/SessionResponseDto;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/response/SessionInstructorObjectResponse;", "sessionInstructorObjectResponse", "Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;", "practicalConfiguration", "Lcom/gse/aulapp/model/response/ExamPracticalConfigurationResponse;", "examPracticalConfiguration", "<init>", "(Ljava/util/List;Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;Lcom/gse/aulapp/model/response/ExamPracticalConfigurationResponse;)V", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", BuildConfig.FLAVOR, "hashCode", "()I", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSessionInstructorObjectResponse", "()Ljava/util/List;", "setSessionInstructorObjectResponse", "(Ljava/util/List;)V", "Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;", "getPracticalConfiguration", "()Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;", "setPracticalConfiguration", "(Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;)V", "Lcom/gse/aulapp/model/response/ExamPracticalConfigurationResponse;", "getExamPracticalConfiguration", "()Lcom/gse/aulapp/model/response/ExamPracticalConfigurationResponse;", "setExamPracticalConfiguration", "(Lcom/gse/aulapp/model/response/ExamPracticalConfigurationResponse;)V", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionResponseDto {
    private ExamPracticalConfigurationResponse examPracticalConfiguration;
    private PracticalConfigurationResponse practicalConfiguration;
    private List<SessionInstructorObjectResponse> sessionInstructorObjectResponse;

    public SessionResponseDto(List<SessionInstructorObjectResponse> list, PracticalConfigurationResponse practicalConfigurationResponse, ExamPracticalConfigurationResponse examPracticalConfigurationResponse) {
        this.sessionInstructorObjectResponse = list;
        this.practicalConfiguration = practicalConfigurationResponse;
        this.examPracticalConfiguration = examPracticalConfigurationResponse;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionResponseDto)) {
            return false;
        }
        SessionResponseDto sessionResponseDto = (SessionResponseDto) other;
        return Intrinsics.areEqual(this.sessionInstructorObjectResponse, sessionResponseDto.sessionInstructorObjectResponse) && Intrinsics.areEqual(this.practicalConfiguration, sessionResponseDto.practicalConfiguration) && Intrinsics.areEqual(this.examPracticalConfiguration, sessionResponseDto.examPracticalConfiguration);
    }

    public final ExamPracticalConfigurationResponse getExamPracticalConfiguration() {
        return this.examPracticalConfiguration;
    }

    public final PracticalConfigurationResponse getPracticalConfiguration() {
        return this.practicalConfiguration;
    }

    public final List<SessionInstructorObjectResponse> getSessionInstructorObjectResponse() {
        return this.sessionInstructorObjectResponse;
    }

    public int hashCode() {
        List<SessionInstructorObjectResponse> list = this.sessionInstructorObjectResponse;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        PracticalConfigurationResponse practicalConfigurationResponse = this.practicalConfiguration;
        int hashCode2 = (hashCode + (practicalConfigurationResponse == null ? 0 : practicalConfigurationResponse.hashCode())) * 31;
        ExamPracticalConfigurationResponse examPracticalConfigurationResponse = this.examPracticalConfiguration;
        return hashCode2 + (examPracticalConfigurationResponse != null ? examPracticalConfigurationResponse.hashCode() : 0);
    }

    public String toString() {
        return "SessionResponseDto(sessionInstructorObjectResponse=" + this.sessionInstructorObjectResponse + ", practicalConfiguration=" + this.practicalConfiguration + ", examPracticalConfiguration=" + this.examPracticalConfiguration + ")";
    }
}
