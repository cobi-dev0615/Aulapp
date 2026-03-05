package com.gse.aulapp.io;

import com.gse.aulapp.model.request.BiometrixRequest;
import com.gse.aulapp.model.request.ChangeCenterRequest;
import com.gse.aulapp.model.request.DatetimeRequest;
import com.gse.aulapp.model.request.GetEnrollmentInformationRequest;
import com.gse.aulapp.model.request.HistoricRecordPermissionsChangeRequest;
import com.gse.aulapp.model.request.HoursScheduledRequest;
import com.gse.aulapp.model.request.LoginRequest;
import com.gse.aulapp.model.request.ParameterListRequest;
import com.gse.aulapp.model.request.PasswordRecoveryRequest;
import com.gse.aulapp.model.request.RefreshTokenRequest;
import com.gse.aulapp.model.request.SessionExamRequest;
import com.gse.aulapp.model.request.SessionInstructorRequest;
import com.gse.aulapp.model.request.SessionPracticeExamSyncRequest;
import com.gse.aulapp.model.request.SessionPracticeSyncRequest;
import com.gse.aulapp.model.request.SessionSyncPracticalRequest;
import com.gse.aulapp.model.request.StatusAppointmentRequest;
import com.gse.aulapp.model.response.BiometrixUrlActionResponse;
import com.gse.aulapp.model.response.ChangeCenterResponse;
import com.gse.aulapp.model.response.DatetimeResponse;
import com.gse.aulapp.model.response.GetEnrollmentInformationResponse;
import com.gse.aulapp.model.response.HistoricRecordPermissionsChangeResponse;
import com.gse.aulapp.model.response.HoursScheduledResponse;
import com.gse.aulapp.model.response.LoginResponse;
import com.gse.aulapp.model.response.ParameterListResponse;
import com.gse.aulapp.model.response.PasswordRecoveryResponse;
import com.gse.aulapp.model.response.RefreshTokenResponse;
import com.gse.aulapp.model.response.SessionExamResponse;
import com.gse.aulapp.model.response.SessionInstructorResponse;
import com.gse.aulapp.model.response.SessionPracticeExamResponse;
import com.gse.aulapp.model.response.SessionRoutesResponse;
import com.gse.aulapp.model.response.SessionSyncPracticalResponse;
import com.gse.aulapp.model.response.TimezoneResponse;
import com.gse.aulapp.util.Parameters;
import com.karumi.dexter.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00042\b\b\u0001\u0010\u0003\u001a\u00020 H§@¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H'¢\u0006\u0004\b&\u0010'J \u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b)\u0010\u0017J \u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00042\b\b\u0001\u0010\u0003\u001a\u00020*H§@¢\u0006\u0004\b,\u0010-J \u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00042\b\b\u0001\u0010\u0003\u001a\u00020.H§@¢\u0006\u0004\b0\u00101J \u00103\u001a\b\u0012\u0004\u0012\u00020/0\u00042\b\b\u0001\u0010\u0003\u001a\u000202H§@¢\u0006\u0004\b3\u00104J \u00107\u001a\b\u0012\u0004\u0012\u0002060\u00042\b\b\u0001\u0010\u0003\u001a\u000205H§@¢\u0006\u0004\b7\u00108J \u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00042\b\b\u0001\u0010\u0003\u001a\u000209H§@¢\u0006\u0004\b;\u0010<J \u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00042\b\b\u0001\u0010\u0003\u001a\u00020=H§@¢\u0006\u0004\b?\u0010@J \u0010B\u001a\b\u0012\u0004\u0012\u00020>0\u00042\b\b\u0001\u0010\u0003\u001a\u00020AH§@¢\u0006\u0004\bB\u0010CJ*\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\u00042\b\b\u0003\u0010E\u001a\u00020D2\b\b\u0001\u0010\u0003\u001a\u00020FH§@¢\u0006\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lcom/gse/aulapp/io/ReceptionsApiService;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/request/LoginRequest;", "request", "Lretrofit2/Response;", "Lcom/gse/aulapp/model/response/LoginResponse;", "login", "(Lcom/gse/aulapp/model/request/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/PasswordRecoveryRequest;", "Lcom/gse/aulapp/model/response/PasswordRecoveryResponse;", "passwordRecovery", "(Lcom/gse/aulapp/model/request/PasswordRecoveryRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/RefreshTokenRequest;", "Lcom/gse/aulapp/model/response/RefreshTokenResponse;", "refreshToken", "(Lcom/gse/aulapp/model/request/RefreshTokenRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/ParameterListRequest;", "Lcom/gse/aulapp/model/response/ParameterListResponse;", "parameterList", "(Lcom/gse/aulapp/model/request/ParameterListRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/SessionInstructorRequest;", "Lcom/gse/aulapp/model/response/SessionInstructorResponse;", "getSessionInstructor", "(Lcom/gse/aulapp/model/request/SessionInstructorRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/SessionExamRequest;", "Lcom/gse/aulapp/model/response/SessionExamResponse;", "getSessionData", "(Lcom/gse/aulapp/model/request/SessionExamRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/GetEnrollmentInformationRequest;", "Lcom/gse/aulapp/model/response/GetEnrollmentInformationResponse;", "getEnrollmentInformation", "(Lcom/gse/aulapp/model/request/GetEnrollmentInformationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/DatetimeRequest;", "Lcom/gse/aulapp/model/response/DatetimeResponse;", "getDatetime", "(Lcom/gse/aulapp/model/request/DatetimeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Call;", "Lcom/gse/aulapp/model/response/TimezoneResponse;", "getDatetimeWordTime", "()Lretrofit2/Call;", "Lcom/gse/aulapp/model/response/SessionRoutesResponse;", "getSessionsRoutes", "Lcom/gse/aulapp/model/request/HoursScheduledRequest;", "Lcom/gse/aulapp/model/response/HoursScheduledResponse;", "getHoursScheduled", "(Lcom/gse/aulapp/model/request/HoursScheduledRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/SessionPracticeExamSyncRequest;", "Lcom/gse/aulapp/model/response/SessionPracticeExamResponse;", "sendSessionPracticeExamRequest", "(Lcom/gse/aulapp/model/request/SessionPracticeExamSyncRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/SessionPracticeSyncRequest;", "sendSessionPracticeRequest", "(Lcom/gse/aulapp/model/request/SessionPracticeSyncRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/SessionSyncPracticalRequest;", "Lcom/gse/aulapp/model/response/SessionSyncPracticalResponse;", "syncSessionPractical", "(Lcom/gse/aulapp/model/request/SessionSyncPracticalRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/ChangeCenterRequest;", "Lcom/gse/aulapp/model/response/ChangeCenterResponse;", "changeCenter", "(Lcom/gse/aulapp/model/request/ChangeCenterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/HistoricRecordPermissionsChangeRequest;", "Lcom/gse/aulapp/model/response/HistoricRecordPermissionsChangeResponse;", "historicRecordSyncPermissionChange", "(Lcom/gse/aulapp/model/request/HistoricRecordPermissionsChangeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/StatusAppointmentRequest;", "updateStatusAppointment", "(Lcom/gse/aulapp/model/request/StatusAppointmentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.FLAVOR, "url", "Lcom/gse/aulapp/model/request/BiometrixRequest;", "Lcom/gse/aulapp/model/response/BiometrixUrlActionResponse;", "getUrlBiometrix", "(Ljava/lang/String;Lcom/gse/aulapp/model/request/BiometrixRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ReceptionsApiService {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object getUrlBiometrix$default(ReceptionsApiService receptionsApiService, String str, BiometrixRequest biometrixRequest, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUrlBiometrix");
            }
            if ((i & 1) != 0) {
                str = Parameters.INSTANCE.getAPI_SERVER_GET_URL_ACTION_ENDPOINT();
            }
            return receptionsApiService.getUrlBiometrix(str, biometrixRequest, continuation);
        }
    }

    @POST("auth/change-center")
    Object changeCenter(@Body ChangeCenterRequest changeCenterRequest, Continuation<? super Response<ChangeCenterResponse>> continuation);

    @POST("biometrics/get-time")
    Object getDatetime(@Body DatetimeRequest datetimeRequest, Continuation<? super Response<DatetimeResponse>> continuation);

    @Headers({"No-Authentication: true", "KEY_PRIVATE_CONFIDENTIAL: true"})
    @GET("America/Bogota")
    Call<TimezoneResponse> getDatetimeWordTime();

    @POST("biometrics/get-enrollment-information")
    Object getEnrollmentInformation(@Body GetEnrollmentInformationRequest getEnrollmentInformationRequest, Continuation<? super Response<GetEnrollmentInformationResponse>> continuation);

    @POST("instructors/hours/scheduled")
    Object getHoursScheduled(@Body HoursScheduledRequest hoursScheduledRequest, Continuation<? super Response<HoursScheduledResponse>> continuation);

    @POST("instructors/session/data")
    Object getSessionData(@Body SessionExamRequest sessionExamRequest, Continuation<? super Response<SessionExamResponse>> continuation);

    @POST("instructors/sessions")
    Object getSessionInstructor(@Body SessionInstructorRequest sessionInstructorRequest, Continuation<? super Response<SessionInstructorResponse>> continuation);

    @POST("sessions/routes")
    Object getSessionsRoutes(@Body SessionInstructorRequest sessionInstructorRequest, Continuation<? super Response<SessionRoutesResponse>> continuation);

    @Headers({"No-Authentication: true", "KEY_PRIVATE_CONFIDENTIAL: true"})
    @POST
    Object getUrlBiometrix(@Url String str, @Body BiometrixRequest biometrixRequest, Continuation<? super Response<BiometrixUrlActionResponse>> continuation);

    @POST("instructors/config-history")
    Object historicRecordSyncPermissionChange(@Body HistoricRecordPermissionsChangeRequest historicRecordPermissionsChangeRequest, Continuation<? super Response<HistoricRecordPermissionsChangeResponse>> continuation);

    @Headers({"No-Authentication: true"})
    @POST("auth/login")
    Object login(@Body LoginRequest loginRequest, Continuation<? super Response<LoginResponse>> continuation);

    @POST("receptions/getEnvironmentVariables")
    Object parameterList(@Body ParameterListRequest parameterListRequest, Continuation<? super Response<ParameterListResponse>> continuation);

    @Headers({"No-Authentication: true"})
    @POST("auth/reset-password")
    Object passwordRecovery(@Body PasswordRecoveryRequest passwordRecoveryRequest, Continuation<? super Response<PasswordRecoveryResponse>> continuation);

    @POST("auth/refreshToken")
    Object refreshToken(@Body RefreshTokenRequest refreshTokenRequest, Continuation<? super Response<RefreshTokenResponse>> continuation);

    @POST("instructors/sessions/validate/")
    Object sendSessionPracticeExamRequest(@Body SessionPracticeExamSyncRequest sessionPracticeExamSyncRequest, Continuation<? super Response<SessionPracticeExamResponse>> continuation);

    @POST("instructors/sessions/validate/")
    Object sendSessionPracticeRequest(@Body SessionPracticeSyncRequest sessionPracticeSyncRequest, Continuation<? super Response<SessionPracticeExamResponse>> continuation);

    @POST("instructors/sessions/sync-data/")
    Object syncSessionPractical(@Body SessionSyncPracticalRequest sessionSyncPracticalRequest, Continuation<? super Response<SessionSyncPracticalResponse>> continuation);

    @POST("instructors/session/updateStatus")
    Object updateStatusAppointment(@Body StatusAppointmentRequest statusAppointmentRequest, Continuation<? super Response<HistoricRecordPermissionsChangeResponse>> continuation);
}
