package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import co.ceduladigital.sdk.c0;
import co.ceduladigital.sdk.g1;
import co.ceduladigital.sdk.h1;
import co.ceduladigital.sdk.j0;
import co.ceduladigital.sdk.p2;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.q2;
import co.ceduladigital.sdk.r2;
import com.google.gson.Gson;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentClassPracticeBeforeBinding;
import com.gse.aulapp.databinding.ItemClassCardDetailBinding;
import com.gse.aulapp.feature.core.util.RandomControllerUtil;
import com.gse.aulapp.model.converter.SessionDataConverter;
import com.gse.aulapp.model.data.entity.StepProcessSessionEntity;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.ClassRoomDto;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.dto.StepProcessSessionDto;
import com.gse.aulapp.model.dto.StepProfile;
import com.gse.aulapp.model.dto.VehicleDto;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumHandsAulapp;
import com.gse.aulapp.model.enumerate.EnumIdStepperMenu;
import com.gse.aulapp.model.enumerate.EnumStatusStepSession;
import com.gse.aulapp.model.enumerate.EnumTimeClass;
import com.gse.aulapp.model.enumerate.EnumTypeConfiguration;
import com.gse.aulapp.model.repository.BiometrixRepository;
import com.gse.aulapp.model.repository.GetEnrollmentInformationRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.repository.StepProcessSessionRepository;
import com.gse.aulapp.model.request.BiometrixRequest;
import com.gse.aulapp.model.request.GetEnrollmentInformationRequest;
import com.gse.aulapp.model.request.SessionInstructorRequest;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.ErrorResult;
import com.gse.aulapp.receptions.feature.core.model.dto.UserInfoDto;
import com.gse.aulapp.util.ActionUtil;
import com.gse.aulapp.util.ConfigurationUtil;
import com.gse.aulapp.util.ControllerFinishClassOrExamUtil;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.ExternalUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.NavigationUtil;
import com.gse.aulapp.util.NetworkUtil;
import com.gse.aulapp.util.NfcUtil;
import com.gse.aulapp.util.Parameters;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.SingleLiveEvent;
import com.gse.aulapp.util.TemplatesUtil;
import com.gse.aulapp.util.extension.TextViewExtKt;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011Jc\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u00162\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J%\u0010%\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J-\u0010*\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\f¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103JG\u0010:\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u00104\u001a\u0004\u0018\u00010\u00162\u0006\u00106\u001a\u0002052\u0006\u0010\r\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020!¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0016¢\u0006\u0004\b=\u0010>J#\u0010B\u001a\u00020\u001e2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bB\u0010CJ\u001d\u0010D\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\f¢\u0006\u0004\bD\u0010EJ\u001d\u0010H\u001a\u00020\u001e2\u0006\u0010G\u001a\u00020F2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\bH\u0010IJ%\u0010J\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bJ\u0010KJ%\u0010L\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bL\u0010KJ\u0015\u0010M\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bM\u0010NJ\u0015\u0010O\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\bO\u0010NJ%\u0010P\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bP\u0010KJ\u0015\u0010Q\u001a\u00020\u001e2\u0006\u0010<\u001a\u00020\u0016¢\u0006\u0004\bQ\u0010>J-\u0010S\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010R\u001a\u00020\u0016¢\u0006\u0004\bS\u0010TJ3\u0010W\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u001e0U¢\u0006\u0004\bW\u0010XJ%\u0010Y\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u00162\u0006\u00109\u001a\u00020!¢\u0006\u0004\bY\u0010ZJ\u0015\u0010]\u001a\u00020\u001e2\u0006\u0010\\\u001a\u00020[¢\u0006\u0004\b]\u0010^J%\u0010`\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010_\u001a\u00020\u0016¢\u0006\u0004\b`\u0010aJ%\u0010b\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00104\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\bb\u0010ZJ-\u0010f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010c\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010gJ\u001d\u0010j\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010i\u001a\u00020h¢\u0006\u0004\bj\u0010kJ!\u0010o\u001a\u00020n2\b\u0010l\u001a\u0004\u0018\u00010\u00162\b\u0010m\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bo\u0010pJ\u0015\u0010s\u001a\u00020q2\u0006\u0010r\u001a\u00020q¢\u0006\u0004\bs\u0010tJ#\u0010y\u001a\u00020x2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020v0uH\u0002¢\u0006\u0004\by\u0010zJ#\u0010{\u001a\u00020x2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020v0uH\u0002¢\u0006\u0004\b{\u0010zJ#\u0010|\u001a\u00020x2\u0012\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020v0uH\u0002¢\u0006\u0004\b|\u0010zJ\u001f\u0010}\u001a\u00020q2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b}\u0010~J:\u0010\u0080\u0001\u001a\u00020\u007f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020!H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\"\u0010\u0082\u0001\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\fH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J&\u0010\u0086\u0001\u001a\u00020\u001e2\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0084\u00012\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001e\u0010\u0088\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020v0uH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0019\u0010\u008a\u0001\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u008a\u0001\u0010NJ\u001c\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0006\u0010\\\u001a\u00020[H\u0082@¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J,\u0010\u0090\u0001\u001a\u00020\u001e2\b\u0010\u008f\u0001\u001a\u00030\u008e\u00012\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0092\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0093\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u0094\u0001R\u0019\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001f\u0010\u009c\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\"\u0010l\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009e\u00018\u0006¢\u0006\u000f\n\u0005\bl\u0010\u009f\u0001\u001a\u0006\b \u0001\u0010¡\u0001R/\u0010¢\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010©\u0001\u001a\u00030¨\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001c\u0010«\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001a\u0010®\u0001\u001a\u00030\u00ad\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0019\u0010°\u0001\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b°\u0001\u0010\u0096\u0001R!\u0010²\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u008b\u00010±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R&\u0010´\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u008b\u00010±\u00018\u0006¢\u0006\u0010\n\u0006\b´\u0001\u0010³\u0001\u001a\u0006\bµ\u0001\u0010¶\u0001R\u001f\u0010·\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010³\u0001R$\u0010¸\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010±\u00018\u0006¢\u0006\u0010\n\u0006\b¸\u0001\u0010³\u0001\u001a\u0006\b¹\u0001\u0010¶\u0001R\u001f\u0010º\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010±\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010³\u0001R$\u0010»\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010±\u00018\u0006¢\u0006\u0010\n\u0006\b»\u0001\u0010³\u0001\u001a\u0006\b¼\u0001\u0010¶\u0001R\u001f\u0010½\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010\u009d\u0001R$\u0010¾\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009e\u00018\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010\u009f\u0001\u001a\u0006\b¿\u0001\u0010¡\u0001R\u001f\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010\u009d\u0001R$\u0010Á\u0001\u001a\n\u0012\u0005\u0012\u00030\u009b\u00010\u009e\u00018\u0006¢\u0006\u0010\n\u0006\bÁ\u0001\u0010\u009f\u0001\u001a\u0006\bÂ\u0001\u0010¡\u0001¨\u0006Ã\u0001"}, d2 = {"Lcom/gse/aulapp/viewmodel/ClassPracticeBeforeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/gse/aulapp/model/repository/SessionRepository;", "repository", "Lcom/gse/aulapp/model/repository/GetEnrollmentInformationRepository;", "enrollmentInformationRepository", "Lcom/gse/aulapp/model/repository/BiometrixRepository;", "biometrixRepository", "<init>", "(Lcom/gse/aulapp/model/repository/SessionRepository;Lcom/gse/aulapp/model/repository/GetEnrollmentInformationRepository;Lcom/gse/aulapp/model/repository/BiometrixRepository;)V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "isEnter", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/StepProfile;", "getListStep", "(Landroid/content/Context;Z)Ljava/util/List;", "Landroidx/fragment/app/Fragment;", "Landroid/app/Activity;", "activity", "stepProfile", BuildConfig.FLAVOR, "email", "Lcom/gse/aulapp/databinding/FragmentClassPracticeBeforeBinding;", "binding", "userId", "userName", "apprenticesDocumentNumber", "apprenticesDocumentType", BuildConfig.FLAVOR, "itemSelectedMenuStepper", "(Landroidx/fragment/app/Fragment;Landroid/app/Activity;Lcom/gse/aulapp/model/dto/StepProfile;Ljava/lang/String;Lcom/gse/aulapp/databinding/FragmentClassPracticeBeforeBinding;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "Landroidx/navigation/NavController;", "navController", "Landroidx/navigation/NavDirections;", "action", "navigateTo", "(Landroid/content/Context;Landroidx/navigation/NavController;Landroidx/navigation/NavDirections;)V", "Lcom/gse/aulapp/model/enumerate/EnumIdStepperMenu;", "enumIdStepperMenu", "isEntry", "changeStatus", "(Landroid/app/Activity;Lcom/gse/aulapp/model/enumerate/EnumIdStepperMenu;Lcom/gse/aulapp/databinding/FragmentClassPracticeBeforeBinding;Z)V", "Lcom/gse/aulapp/databinding/ItemClassCardDetailBinding;", "cardProfileUserProfileUser", "showDialog", "(Landroid/content/Context;Lcom/gse/aulapp/databinding/ItemClassCardDetailBinding;)V", "Landroid/widget/ImageView;", "ivIconUser", "selectImage", "(Landroid/content/Context;Landroid/widget/ImageView;)V", "sessionId", "Lcom/gse/aulapp/model/request/SessionInstructorRequest;", "sessionInstructorRequest", "Lcom/gse/aulapp/model/enumerate/EnumClassType;", "sessionType", "findNavController", "validateTimeSessionFromApi", "(Landroid/content/Context;Landroid/app/Activity;Ljava/lang/String;Lcom/gse/aulapp/model/request/SessionInstructorRequest;ZLcom/gse/aulapp/model/enumerate/EnumClassType;Landroidx/navigation/NavController;)V", "sessionID", "getSessionById", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/entity/StepProcessSessionEntity;", "listStep", "validateContinueButton", "(Ljava/util/List;Lcom/gse/aulapp/databinding/FragmentClassPracticeBeforeBinding;)V", "getStepperStatusComplete", "(Ljava/lang/String;Z)V", "Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;", "sessionFull", "setDataSession", "(Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;Lcom/gse/aulapp/databinding/FragmentClassPracticeBeforeBinding;)V", "validateAndActiveNfc", "(Landroid/app/Activity;Lcom/gse/aulapp/databinding/FragmentClassPracticeBeforeBinding;Z)V", "validateNfcStatus", "disableNfc", "(Landroid/app/Activity;)V", "initNfcStatus", "validateVehicleActive", "updateDateEntryClass", "timeEntry", "navigateToStartClass", "(Landroid/content/Context;Landroidx/navigation/NavController;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/Function0;", "function", "validateConnection", "(Landroid/content/Context;Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;)V", "selectTypeClassOrExam", "(Landroid/content/Context;Ljava/lang/String;Landroidx/navigation/NavController;)V", "Lcom/gse/aulapp/model/enumerate/EnumTypeConfiguration;", "type", "getConfigSessionDto", "(Lcom/gse/aulapp/model/enumerate/EnumTypeConfiguration;)V", "data", "updateSessionStatusAppointment", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "exitValidation", "rol", "Lcom/gse/aulapp/receptions/feature/core/model/dto/UserInfoDto;", "userInfo", "initValidationProccess", "(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lcom/gse/aulapp/receptions/feature/core/model/dto/UserInfoDto;)V", "Lcom/gse/aulapp/model/request/BiometrixRequest;", "request", "initBiometrix", "(Landroid/app/Activity;Lcom/gse/aulapp/model/request/BiometrixRequest;)V", "message", "code", "Lcom/gse/aulapp/model/response/ErrorResponse;", "getErrorEndpoint", "(Ljava/lang/String;Ljava/lang/String;)Lcom/gse/aulapp/model/response/ErrorResponse;", "Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "handValidate", "reportHand", "(Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;)Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/StepProcessSessionDto;", "mapStatusStepper", "Lcom/gse/aulapp/model/enumerate/EnumStatusStepSession;", "getStatusApprentice", "(Ljava/util/Map;)Lcom/gse/aulapp/model/enumerate/EnumStatusStepSession;", "getStatusInstructor", "getStatusVehicle", "validateHand", "(Landroid/content/Context;Ljava/lang/String;)Lcom/gse/aulapp/model/enumerate/EnumHandsAulapp;", "Lkotlinx/coroutines/Job;", "showDialogTimePassed", "(Landroid/app/Activity;Landroid/content/Context;ZLcom/gse/aulapp/model/enumerate/EnumClassType;Landroidx/navigation/NavController;)Lkotlinx/coroutines/Job;", "saveStepStatus", "(Lcom/gse/aulapp/model/enumerate/EnumIdStepperMenu;Z)V", "Lcom/gse/aulapp/model/dto/SessionDto;", "session", "setDataSessionDetail", "(Lcom/gse/aulapp/model/dto/SessionDto;Lcom/gse/aulapp/databinding/FragmentClassPracticeBeforeBinding;)V", "buildMapStatusStepper", "()Ljava/util/Map;", "getEntryTime", "Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;", "getConfigurationSession", "(Lcom/gse/aulapp/model/enumerate/EnumTypeConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/request/GetEnrollmentInformationRequest;", "getEnrollmentInformationRequest", "callEndPointGetEnrollmentInformation", "(Lcom/gse/aulapp/model/request/GetEnrollmentInformationRequest;Landroid/app/Activity;Lcom/gse/aulapp/receptions/feature/core/model/dto/UserInfoDto;)V", "Lcom/gse/aulapp/model/repository/SessionRepository;", "Lcom/gse/aulapp/model/repository/GetEnrollmentInformationRepository;", "Lcom/gse/aulapp/model/repository/BiometrixRepository;", "TAG", "Ljava/lang/String;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/gse/aulapp/model/data/statusControl/Status;", "_message", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "getMessage", "()Lkotlinx/coroutines/flow/SharedFlow;", "stepList", "Ljava/util/List;", "getStepList", "()Ljava/util/List;", "setStepList", "(Ljava/util/List;)V", "Lcom/gse/aulapp/model/repository/StepProcessSessionRepository;", "stepRepository", "Lcom/gse/aulapp/model/repository/StepProcessSessionRepository;", "sessionReceived", "Lcom/gse/aulapp/model/dto/SessionDto;", "Landroid/app/AlertDialog;", "dialog", "Landroid/app/AlertDialog;", "entryTime", "Lcom/gse/aulapp/util/SingleLiveEvent;", "_configSession", "Lcom/gse/aulapp/util/SingleLiveEvent;", "configSession", "getConfigSession", "()Lcom/gse/aulapp/util/SingleLiveEvent;", "_statusClass", "statusClass", "getStatusClass", "_messageValidation", "messageValidation", "getMessageValidation", "_messageGetEnrollmentInformation", "messageGetEnrollmentInformation", "getMessageGetEnrollmentInformation", "_messageBiometrix", "messageBiometrix", "getMessageBiometrix", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClassPracticeBeforeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassPracticeBeforeViewModel.kt\ncom/gse/aulapp/viewmodel/ClassPracticeBeforeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1278:1\n1863#2,2:1279\n1863#2,2:1281\n*S KotlinDebug\n*F\n+ 1 ClassPracticeBeforeViewModel.kt\ncom/gse/aulapp/viewmodel/ClassPracticeBeforeViewModel\n*L\n779#1:1279,2\n910#1:1281,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ClassPracticeBeforeViewModel extends ViewModel {
    private final String TAG;
    private final SingleLiveEvent<ConfigurationSessionDto> _configSession;
    private final MutableSharedFlow<Status> _message;
    private final MutableSharedFlow<Status> _messageBiometrix;
    private final MutableSharedFlow<Status> _messageGetEnrollmentInformation;
    private final SingleLiveEvent<Status> _messageValidation;
    private final SingleLiveEvent<Status> _statusClass;
    private final BiometrixRepository biometrixRepository;
    private final SingleLiveEvent<ConfigurationSessionDto> configSession;
    private AlertDialog dialog;
    private final GetEnrollmentInformationRepository enrollmentInformationRepository;
    private String entryTime;
    private Gson gson;
    private final SharedFlow<Status> message;
    private final SharedFlow<Status> messageBiometrix;
    private final SharedFlow<Status> messageGetEnrollmentInformation;
    private final SingleLiveEvent<Status> messageValidation;
    private final SessionRepository repository;
    private SessionDto sessionReceived;
    private final SingleLiveEvent<Status> statusClass;
    public List<StepProfile> stepList;
    private final StepProcessSessionRepository stepRepository;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NfcUtil.Companion.NfcStatus.values().length];
            try {
                iArr[NfcUtil.Companion.NfcStatus.NFC_NOT_SUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NfcUtil.Companion.NfcStatus.NFC_NOT_ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NfcUtil.Companion.NfcStatus.NFC_ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ClassPracticeBeforeViewModel(SessionRepository repository, GetEnrollmentInformationRepository enrollmentInformationRepository, BiometrixRepository biometrixRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(enrollmentInformationRepository, "enrollmentInformationRepository");
        Intrinsics.checkNotNullParameter(biometrixRepository, "biometrixRepository");
        this.repository = repository;
        this.enrollmentInformationRepository = enrollmentInformationRepository;
        this.biometrixRepository = biometrixRepository;
        this.TAG = "ClassPracticeBeforeViewModel";
        this.gson = new Gson();
        MutableSharedFlow<Status> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow(0, 1, (kotlinx.coroutines.channels.BufferOverflow) null);
        this._message = MutableSharedFlow$default;
        this.message = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.stepRepository = new StepProcessSessionRepository(GeneralApp.INSTANCE.getDatabase().StepProcessSessionDao());
        SingleLiveEvent<ConfigurationSessionDto> singleLiveEvent = new SingleLiveEvent<>();
        this._configSession = singleLiveEvent;
        this.configSession = singleLiveEvent;
        SingleLiveEvent<Status> singleLiveEvent2 = new SingleLiveEvent<>();
        this._statusClass = singleLiveEvent2;
        this.statusClass = singleLiveEvent2;
        SingleLiveEvent<Status> singleLiveEvent3 = new SingleLiveEvent<>();
        this._messageValidation = singleLiveEvent3;
        this.messageValidation = singleLiveEvent3;
        MutableSharedFlow<Status> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow(0, 1, (kotlinx.coroutines.channels.BufferOverflow) null);
        this._messageGetEnrollmentInformation = MutableSharedFlow$default2;
        this.messageGetEnrollmentInformation = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        MutableSharedFlow<Status> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow(0, 1, (kotlinx.coroutines.channels.BufferOverflow) null);
        this._messageBiometrix = MutableSharedFlow$default3;
        this.messageBiometrix = FlowKt.asSharedFlow(MutableSharedFlow$default3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, StepProcessSessionDto> buildMapStatusStepper() {
        SessionDto sessionDto;
        List<StepProcessSessionDto> listStepStatus;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Boolean entrySession$default = PreferenceUtil.Companion.getEntrySession$default(PreferenceUtil.INSTANCE, null, 1, null);
        SessionDto sessionDto2 = this.sessionReceived;
        List<StepProcessSessionDto> listStepStatus2 = sessionDto2 != null ? sessionDto2.getListStepStatus() : null;
        if (listStepStatus2 != null && !listStepStatus2.isEmpty() && (sessionDto = this.sessionReceived) != null && (listStepStatus = sessionDto.getListStepStatus()) != null) {
            for (StepProcessSessionDto stepProcessSessionDto : listStepStatus) {
                if (Intrinsics.areEqual(Boolean.valueOf(stepProcessSessionDto.getIsEntry()), entrySession$default)) {
                    linkedHashMap.put(stepProcessSessionDto.getType(), stepProcessSessionDto);
                }
            }
        }
        return linkedHashMap;
    }

    private final void callEndPointGetEnrollmentInformation(GetEnrollmentInformationRequest getEnrollmentInformationRequest, Activity activity, UserInfoDto userInfo) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$callEndPointGetEnrollmentInformation$1(this, activity, getEnrollmentInformationRequest, userInfo, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit exitValidation$lambda$11(ClassPracticeBeforeViewModel this$0, Context context, String sessionId, NavController navController) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(sessionId, "$sessionId");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        this$0.selectTypeClassOrExam(context, sessionId, navController);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getConfigurationSession(EnumTypeConfiguration enumTypeConfiguration, Continuation<? super ConfigurationSessionDto> continuation) {
        return ConfigurationUtil.INSTANCE.getConfigurationSessionByType(enumTypeConfiguration, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getEntryTime(Activity context) {
        ExternalUtil.INSTANCE.getDateTime(context, EnumTimeClass.GET_TIME, new c0(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getEntryTime$lambda$10(ClassPracticeBeforeViewModel this$0, String datetime) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(datetime, "datetime");
        this$0.entryTime = datetime;
        return Unit.INSTANCE;
    }

    private final EnumStatusStepSession getStatusApprentice(Map<String, StepProcessSessionDto> mapStatusStepper) {
        EnumIdStepperMenu enumIdStepperMenu = EnumIdStepperMenu.ID_VALIDATION_APPRENTICE;
        StepProcessSessionDto stepProcessSessionDto = mapStatusStepper.get(EnumIdStepperMenu.name$default(enumIdStepperMenu, null, 1, null));
        if (Intrinsics.areEqual(stepProcessSessionDto != null ? stepProcessSessionDto.getStatus() : null, "ACTIVE") || mapStatusStepper.isEmpty()) {
            return EnumStatusStepSession.ACTIVE;
        }
        StepProcessSessionDto stepProcessSessionDto2 = mapStatusStepper.get(EnumIdStepperMenu.name$default(enumIdStepperMenu, null, 1, null));
        return Intrinsics.areEqual(stepProcessSessionDto2 != null ? stepProcessSessionDto2.getStatus() : null, "FINISH") ? EnumStatusStepSession.FINISH : EnumStatusStepSession.INACTIVE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3 != null ? r3.getStatus() : null, "FINISH") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        return com.gse.aulapp.model.enumerate.EnumStatusStepSession.ACTIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3 != null ? r3.getStatus() : null, "FINISH") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final EnumStatusStepSession getStatusInstructor(Map<String, StepProcessSessionDto> mapStatusStepper) {
        EnumIdStepperMenu enumIdStepperMenu = EnumIdStepperMenu.ID_VALIDATION_INSTRUCTOR;
        StepProcessSessionDto stepProcessSessionDto = mapStatusStepper.get(EnumIdStepperMenu.name$default(enumIdStepperMenu, null, 1, null));
        if (Intrinsics.areEqual(stepProcessSessionDto != null ? stepProcessSessionDto.getStatus() : null, "ACTIVE")) {
            StepProcessSessionDto stepProcessSessionDto2 = mapStatusStepper.get(EnumIdStepperMenu.name$default(EnumIdStepperMenu.ID_VALIDATION_APPRENTICE, null, 1, null));
        }
        StepProcessSessionDto stepProcessSessionDto3 = mapStatusStepper.get(EnumIdStepperMenu.name$default(enumIdStepperMenu, null, 1, null));
        if ((stepProcessSessionDto3 != null ? stepProcessSessionDto3.getStatus() : null) == null) {
            StepProcessSessionDto stepProcessSessionDto4 = mapStatusStepper.get(EnumIdStepperMenu.name$default(EnumIdStepperMenu.ID_VALIDATION_APPRENTICE, null, 1, null));
        }
        StepProcessSessionDto stepProcessSessionDto5 = mapStatusStepper.get(EnumIdStepperMenu.name$default(enumIdStepperMenu, null, 1, null));
        return Intrinsics.areEqual(stepProcessSessionDto5 != null ? stepProcessSessionDto5.getStatus() : null, "FINISH") ? EnumStatusStepSession.FINISH : EnumStatusStepSession.INACTIVE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3 != null ? r3.getStatus() : null, "FINISH") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        return com.gse.aulapp.model.enumerate.EnumStatusStepSession.ACTIVE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3 != null ? r3.getStatus() : null, "FINISH") != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final EnumStatusStepSession getStatusVehicle(Map<String, StepProcessSessionDto> mapStatusStepper) {
        EnumIdStepperMenu enumIdStepperMenu = EnumIdStepperMenu.ID_VALIDATION_VEHICLE;
        StepProcessSessionDto stepProcessSessionDto = mapStatusStepper.get(EnumIdStepperMenu.name$default(enumIdStepperMenu, null, 1, null));
        if (Intrinsics.areEqual(stepProcessSessionDto != null ? stepProcessSessionDto.getStatus() : null, "ACTIVE")) {
            StepProcessSessionDto stepProcessSessionDto2 = mapStatusStepper.get(EnumIdStepperMenu.name$default(EnumIdStepperMenu.ID_VALIDATION_INSTRUCTOR, null, 1, null));
            if (Intrinsics.areEqual(stepProcessSessionDto2 != null ? stepProcessSessionDto2.getStatus() : null, "FINISH")) {
                StepProcessSessionDto stepProcessSessionDto3 = mapStatusStepper.get(EnumIdStepperMenu.name$default(EnumIdStepperMenu.ID_VALIDATION_APPRENTICE, null, 1, null));
            }
        }
        StepProcessSessionDto stepProcessSessionDto4 = mapStatusStepper.get(EnumIdStepperMenu.name$default(enumIdStepperMenu, null, 1, null));
        if ((stepProcessSessionDto4 != null ? stepProcessSessionDto4.getStatus() : null) == null) {
            StepProcessSessionDto stepProcessSessionDto5 = mapStatusStepper.get(EnumIdStepperMenu.name$default(EnumIdStepperMenu.ID_VALIDATION_INSTRUCTOR, null, 1, null));
            if (Intrinsics.areEqual(stepProcessSessionDto5 != null ? stepProcessSessionDto5.getStatus() : null, "FINISH")) {
                StepProcessSessionDto stepProcessSessionDto6 = mapStatusStepper.get(EnumIdStepperMenu.name$default(EnumIdStepperMenu.ID_VALIDATION_APPRENTICE, null, 1, null));
            }
        }
        StepProcessSessionDto stepProcessSessionDto7 = mapStatusStepper.get(EnumIdStepperMenu.name$default(enumIdStepperMenu, null, 1, null));
        String status = stepProcessSessionDto7 != null ? stepProcessSessionDto7.getStatus() : null;
        EnumStatusStepSession enumStatusStepSession = EnumStatusStepSession.FINISH;
        return Intrinsics.areEqual(status, enumStatusStepSession.toString()) ? enumStatusStepSession : EnumStatusStepSession.INACTIVE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveStepStatus(EnumIdStepperMenu enumIdStepperMenu, boolean isEntry) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$saveStepStatus$1(this, enumIdStepperMenu, isEntry, null));
    }

    private final void setDataSessionDetail(SessionDto session, FragmentClassPracticeBeforeBinding binding) {
        String nomenclature;
        String type;
        String address;
        if (session != null) {
            EnumClassType enumByName = EnumClassType.INSTANCE.getEnumByName(session.getType());
            DateUtil.Companion companion = DateUtil.INSTANCE;
            String parseDateToString12H = companion.parseDateToString12H(session.getStart());
            String parseDateToString12H2 = companion.parseDateToString12H(session.getEnd());
            Integer duration = session.getDuration();
            VehicleDto vehicle = session.getVehicle();
            ClassRoomDto classroom = session.getClassroom();
            binding.cardProfileUserProfileUser.includeStartClass.btnStartClass.setVisibility(8);
            binding.cardProfileUserProfileUser.ivClassType.setImageResource(enumByName.resource());
            String str = null;
            binding.cardProfileUserProfileUser.tvClassTypeTitle.setText(EnumClassType.nameShow$default(enumByName, null, 1, null));
            binding.cardProfileUserProfileUser.tvClassTypeDescription.setText(parseDateToString12H + " - " + parseDateToString12H2);
            binding.cardProfileUserProfileUser.tvClassTypeDuration.setText(" (" + duration + "h) ");
            binding.cardProfileUserProfileUser.includeApprenticeName.tvContent.setText(session.getApprentice());
            binding.cardProfileUserProfileUser.includeApprenticePhoneNumber.tvContent.setText(session.getCellphoneNumber());
            TextView tvContent = binding.cardProfileUserProfileUser.includeApprenticePhoneNumber.tvContent;
            Intrinsics.checkNotNullExpressionValue(tvContent, "tvContent");
            TextViewExtKt.underline(tvContent);
            binding.cardProfileUserProfileUser.includeApprenticePhoneNumber.getRoot().setOnClickListener(new r2(binding, 0));
            TextView textView = binding.cardProfileUserProfileUser.includeClassCategory.tvContent;
            String category = session.getCategory();
            String str2 = "No Aplica";
            if (category == null) {
                category = "No Aplica";
            }
            textView.setText(category);
            TextView textView2 = binding.cardProfileUserProfileUser.includeClassVehicle.tvContent;
            if (vehicle != null && vehicle.getLine().length() > 0 && vehicle.getPlates().length() > 0) {
                str2 = vehicle.getLine() + " (" + vehicle.getPlates() + ")";
            }
            textView2.setText(str2);
            if (classroom == null || (address = classroom.getAddress()) == null || address.length() != 0) {
                binding.cardProfileUserProfileUser.includeApprenticeAddress.getRoot().setVisibility(0);
                binding.cardProfileUserProfileUser.includeApprenticeAddress.tvContent.setText(classroom != null ? classroom.getAddress() : null);
            } else {
                binding.cardProfileUserProfileUser.includeApprenticeAddress.getRoot().setVisibility(8);
            }
            if (classroom != null && (type = classroom.getType()) != null) {
                str = type.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            }
            String lowerCase = "PISTA".toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (!Intrinsics.areEqual(str, lowerCase) || (nomenclature = classroom.getNomenclature()) == null || nomenclature.length() <= 0) {
                binding.cardProfileUserProfileUser.includeClassTrack.tvContent.setVisibility(8);
            } else {
                binding.cardProfileUserProfileUser.includeClassTrack.tvContent.setVisibility(0);
                binding.cardProfileUserProfileUser.includeClassTrack.tvContent.setText(classroom.getNomenclature());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDataSessionDetail$lambda$2(FragmentClassPracticeBeforeBinding binding, View view) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Context context = binding.getRoot().getContext();
        if (context != null) {
            ActionUtil.INSTANCE.dialPhoneNumber(context, binding.cardProfileUserProfileUser.includeApprenticePhoneNumber.tvContent.getText().toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDialog$lambda$0(Context context, String cellphone) {
        Intrinsics.checkNotNullParameter(cellphone, "$cellphone");
        ActionUtil.INSTANCE.dialPhoneNumber(context, cellphone);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Job showDialogTimePassed(Activity activity, Context context, boolean isEnter, EnumClassType sessionType, NavController findNavController) {
        Job launch$default;
        launch$default = BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$showDialogTimePassed$1(this, activity, context, isEnter, sessionType, findNavController, null));
        return launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateConnection$lambda$8(Context activity, ClassPracticeBeforeViewModel this$0, Function0 function, View view) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(function, "$function");
        if (NetworkUtil.INSTANCE.isNetworkAvailable(activity)) {
            AlertDialog alertDialog = this$0.dialog;
            AlertDialog alertDialog2 = null;
            if (alertDialog == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
                alertDialog = null;
            }
            if (alertDialog.isShowing()) {
                AlertDialog alertDialog3 = this$0.dialog;
                if (alertDialog3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialog");
                } else {
                    alertDialog2 = alertDialog3;
                }
                alertDialog2.dismiss();
                function.invoke();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateConnection$lambda$9(String sessionID, NavController navController, ClassPracticeBeforeViewModel this$0, View view) {
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ControllerFinishClassOrExamUtil.Companion companion = ControllerFinishClassOrExamUtil.INSTANCE;
        companion.updateIsPendingSync(sessionID);
        companion.updateDateEndClass(sessionID);
        companion.navigationTo(navController, new ActionOnlyNavDirections(R.id.action_classPracticeBeforeFragment_to_homeFragment));
        AlertDialog alertDialog = this$0.dialog;
        if (alertDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        }
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EnumHandsAulapp validateHand(Context context, String userId) {
        TemplatesUtil.Companion companion = TemplatesUtil.INSTANCE;
        return reportHand(companion.validateExistsHands(companion.getFolderPathByUserId(context, userId)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateNfcStatus$lambda$4(ClassPracticeBeforeViewModel this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AlertDialog alertDialog = this$0.dialog;
        if (alertDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        }
        alertDialog.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateNfcStatus$lambda$5(Activity activity, View view) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        NfcUtil.INSTANCE.openSettingsNfc(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateNfcStatus$lambda$6(ClassPracticeBeforeViewModel this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AlertDialog alertDialog = this$0.dialog;
        if (alertDialog == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            alertDialog = null;
        }
        alertDialog.cancel();
    }

    public final void changeStatus(Activity activity, EnumIdStepperMenu enumIdStepperMenu, FragmentClassPracticeBeforeBinding binding, boolean isEntry) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(enumIdStepperMenu, "enumIdStepperMenu");
        Intrinsics.checkNotNullParameter(binding, "binding");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$changeStatus$1(enumIdStepperMenu, this, isEntry, activity, binding, null));
    }

    public final void disableNfc(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        NfcUtil.INSTANCE.disabledNfcAdapter(activity);
    }

    public final void exitValidation(Context context, String sessionId, NavController navController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(navController, "navController");
        PreferenceUtil.INSTANCE.saveStartClassOrExam(context, BuildConfig.FLAVOR);
        Parameters.INSTANCE.setINITIAL_TIME(0L);
        validateConnection(context, sessionId, navController, new g1(this, context, sessionId, navController, 1));
    }

    public final void getConfigSessionDto(EnumTypeConfiguration type) {
        Intrinsics.checkNotNullParameter(type, "type");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$getConfigSessionDto$1(this, type, null));
    }

    public final ErrorResponse getErrorEndpoint(String message, String code) {
        return new ErrorResponse(null, new ErrorResult(false, message, code), null, 5, null);
    }

    public final List<StepProfile> getListStep(Context context, boolean isEnter) {
        Intrinsics.checkNotNullParameter(context, "context");
        setStepList(new ArrayList());
        Map<String, StepProcessSessionDto> buildMapStatusStepper = buildMapStatusStepper();
        EnumStatusStepSession statusApprentice = getStatusApprentice(buildMapStatusStepper);
        String string = context.getString(isEnter ? R.string.txt_step_option_1 : R.string.txt_step_option_4);
        Intrinsics.checkNotNull(string);
        getStepList().add(new StepProfile(statusApprentice, string, R.drawable.ic_trainee, EnumIdStepperMenu.ID_VALIDATION_APPRENTICE));
        EnumStatusStepSession statusInstructor = getStatusInstructor(buildMapStatusStepper);
        String string2 = context.getString(isEnter ? R.string.txt_step_option_2 : R.string.txt_step_option_5);
        Intrinsics.checkNotNull(string2);
        getStepList().add(new StepProfile(statusInstructor, string2, R.drawable.ic_instructor, EnumIdStepperMenu.ID_VALIDATION_INSTRUCTOR));
        EnumStatusStepSession statusVehicle = getStatusVehicle(buildMapStatusStepper);
        String string3 = context.getString(R.string.txt_step_option_3);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        getStepList().add(new StepProfile(statusVehicle, string3, R.drawable.ic_car, EnumIdStepperMenu.ID_VALIDATION_VEHICLE));
        return getStepList();
    }

    public final SharedFlow<Status> getMessage() {
        return this.message;
    }

    public final SharedFlow<Status> getMessageBiometrix() {
        return this.messageBiometrix;
    }

    public final SharedFlow<Status> getMessageGetEnrollmentInformation() {
        return this.messageGetEnrollmentInformation;
    }

    public final SingleLiveEvent<Status> getMessageValidation() {
        return this.messageValidation;
    }

    public final void getSessionById(String sessionID) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$getSessionById$1(this, sessionID, null));
    }

    public final SingleLiveEvent<Status> getStatusClass() {
        return this.statusClass;
    }

    public final List<StepProfile> getStepList() {
        List<StepProfile> list = this.stepList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("stepList");
        return null;
    }

    public final void getStepperStatusComplete(String sessionID, boolean isEntry) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$getStepperStatusComplete$1(this, sessionID, isEntry, null));
    }

    public final void initBiometrix(Activity activity, BiometrixRequest request) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(request, "request");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$initBiometrix$1(this, activity, request, null));
    }

    public final void initNfcStatus(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        NfcUtil.INSTANCE.initNfcAdapter(activity);
    }

    public final void initValidationProccess(String email, String rol, Activity activity, UserInfoDto userInfo) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(rol, "rol");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        callEndPointGetEnrollmentInformation(new GetEnrollmentInformationRequest(email, "email", rol), activity, userInfo);
    }

    public final void itemSelectedMenuStepper(Fragment context, Activity activity, StepProfile stepProfile, String email, FragmentClassPracticeBeforeBinding binding, String userId, String userName, boolean isEnter, String apprenticesDocumentNumber, String apprenticesDocumentType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(stepProfile, "stepProfile");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(apprenticesDocumentType, "apprenticesDocumentType");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$itemSelectedMenuStepper$1(this, context, stepProfile, binding, isEnter, userId, apprenticesDocumentNumber, userName, email, apprenticesDocumentType, activity, null));
    }

    public final void navigateTo(Context context, NavController navController, NavDirections action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(action, "action");
        NavigationUtil.INSTANCE.navigateToDifferentFragment(context, navController, action);
    }

    public final void navigateToStartClass(Context context, NavController navController, String sessionID, String timeEntry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(timeEntry, "timeEntry");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$navigateToStartClass$1(this, sessionID, timeEntry, context, navController, null));
    }

    public final EnumHandsAulapp reportHand(EnumHandsAulapp handValidate) {
        Intrinsics.checkNotNullParameter(handValidate, "handValidate");
        return handValidate == EnumHandsAulapp.BOTH ? RandomControllerUtil.INSTANCE.randomHandsVerify() : handValidate;
    }

    public final void selectImage(Context context, ImageView ivIconUser) {
        Intrinsics.checkNotNullParameter(ivIconUser, "ivIconUser");
        ivIconUser.setImageResource(R.drawable.ic_image_user_no_connection);
    }

    public final void selectTypeClassOrExam(Context context, String sessionID, NavController findNavController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        ControllerFinishClassOrExamUtil.INSTANCE.selectTypeClassOrExam(context, sessionID, findNavController, this.sessionReceived, this.repository, new ActionOnlyNavDirections(R.id.action_classPracticeBeforeFragment_to_homeFragment));
    }

    public final void setDataSession(SessionFull sessionFull, FragmentClassPracticeBeforeBinding binding) {
        Intrinsics.checkNotNullParameter(sessionFull, "sessionFull");
        Intrinsics.checkNotNullParameter(binding, "binding");
        SessionDto sessionDtoFromSessionEntity = SessionDataConverter.INSTANCE.getSessionDtoFromSessionEntity(sessionFull.getSession(), sessionFull.getClassRoom(), sessionFull.getVehicle(), sessionFull.getLesson(), sessionFull.getListStepStatus());
        this.sessionReceived = sessionDtoFromSessionEntity;
        setDataSessionDetail(sessionDtoFromSessionEntity, binding);
    }

    public final void setStepList(List<StepProfile> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.stepList = list;
    }

    public final void showDialog(Context context, ItemClassCardDetailBinding cardProfileUserProfileUser) {
        Intrinsics.checkNotNullParameter(cardProfileUserProfileUser, "cardProfileUserProfileUser");
        String obj = cardProfileUserProfileUser.includeApprenticeName.tvContent.getText().toString();
        String obj2 = cardProfileUserProfileUser.includeApprenticePhoneNumber.tvContent.getText().toString();
        DialogNormalUtil.Companion companion = DialogNormalUtil.INSTANCE;
        Intrinsics.checkNotNull(context);
        companion.showDialogCallUserProfile(context, "https://cdn2.estamosrodando.com/biografias/2/15/justin-timberlake-139070.jpg", obj, new j0(context, obj2, 1));
    }

    public final void updateDateEntryClass(String sessionID) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$updateDateEntryClass$1(this, sessionID, null));
    }

    public final void updateSessionStatusAppointment(Context context, String sessionID, String data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
            ClassPracticeBeforeViewModel$updateSessionStatusAppointment$1 block = new ClassPracticeBeforeViewModel$updateSessionStatusAppointment$1(this, context, sessionID, data, null);
            BuildersKt.launch(viewModelScope, (CoroutineContext) null, (CoroutineStart) null, block);
        } catch (Exception exc) {
            LogSendUtil.INSTANCE.setLog(context, q.i("updateSessionStatusAppointment exception: ", exc.getMessage()), "updateSessionStatusAppointment", true);
            this._statusClass.postValue(new Status.Failure(exc));
        }
    }

    public final void validateAndActiveNfc(Activity activity, FragmentClassPracticeBeforeBinding binding, boolean isEnter) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        NfcUtil.INSTANCE.validateNfcAdapter(activity, new ClassPracticeBeforeViewModel$validateAndActiveNfc$1(this, activity, binding, isEnter));
    }

    public final void validateConnection(Context activity, String sessionID, NavController navController, Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(function, "function");
        if (NetworkUtil.INSTANCE.isNetworkAvailable(activity)) {
            function.invoke();
            return;
        }
        AlertDialog showInformationDialogValidationExam = DialogUtil.INSTANCE.showInformationDialogValidationExam((Activity) activity, EnumDialogType.NETWORK_ACCESS_ERROR, false, true, new h1(activity, this, function, 1), new h1(sessionID, navController, this, 2));
        this.dialog = showInformationDialogValidationExam;
        if (showInformationDialogValidationExam == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialog");
            showInformationDialogValidationExam = null;
        }
        showInformationDialogValidationExam.show();
    }

    public final void validateContinueButton(List<StepProcessSessionEntity> listStep, FragmentClassPracticeBeforeBinding binding) {
        Intrinsics.checkNotNullParameter(listStep, "listStep");
        Intrinsics.checkNotNullParameter(binding, "binding");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$validateContinueButton$1(listStep, binding, this, null));
    }

    public final void validateNfcStatus(Activity activity, FragmentClassPracticeBeforeBinding binding, boolean isEnter) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        int i = WhenMappings.$EnumSwitchMapping$0[NfcUtil.INSTANCE.nfcStatusDevice(activity).ordinal()];
        AlertDialog alertDialog = null;
        if (i == 1) {
            AlertDialog showInformationFullDialogBiometricRegistrationResponse = DialogUtil.INSTANCE.showInformationFullDialogBiometricRegistrationResponse(activity, EnumDialogType.WARNING_NFC_NOT_FOUND, true, false, new p2(this, 0));
            this.dialog = showInformationFullDialogBiometricRegistrationResponse;
            if (showInformationFullDialogBiometricRegistrationResponse == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            } else {
                alertDialog = showInformationFullDialogBiometricRegistrationResponse;
            }
            alertDialog.show();
            return;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            validateAndActiveNfc(activity, binding, isEnter);
        } else {
            AlertDialog showInformationFullDialogError = DialogUtil.INSTANCE.showInformationFullDialogError(activity, activity.getString(R.string.title_sessions_active_other_mobile), activity.getString(R.string.message_dialog_warning_nfc_disable), false, activity.getString(R.string.title_btn_active_nfc), activity.getString(R.string.title_btn_cancel_nfc), Integer.valueOf(R.drawable.ic_warning_2_type), new q2(activity, 0), new p2(this, 1));
            this.dialog = showInformationFullDialogError;
            if (showInformationFullDialogError == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialog");
            } else {
                alertDialog = showInformationFullDialogError;
            }
            alertDialog.show();
        }
    }

    public final void validateTimeSessionFromApi(Context context, Activity activity, String sessionId, SessionInstructorRequest sessionInstructorRequest, boolean isEnter, EnumClassType sessionType, NavController findNavController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sessionInstructorRequest, "sessionInstructorRequest");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        try {
            BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new ClassPracticeBeforeViewModel$validateTimeSessionFromApi$1(this, context, sessionInstructorRequest, activity, sessionId, isEnter, sessionType, findNavController, null));
        } catch (Exception e) {
            LogSendUtil.INSTANCE.setLog(context, q.i("validateTimeSessionFromApi exception: ", e.getMessage()), "validateTimeSessionFromApi", true);
            this._messageValidation.setValue(new Status.Failure(new Exception(e.getMessage())));
        }
    }

    public final void validateVehicleActive(Activity activity, FragmentClassPracticeBeforeBinding binding, boolean isEnter) {
        List<StepProcessSessionDto> listStepStatus;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (listStepStatus = sessionDto.getListStepStatus()) == null) {
            return;
        }
        for (StepProcessSessionDto stepProcessSessionDto : listStepStatus) {
            if (Intrinsics.areEqual(stepProcessSessionDto.getType(), EnumIdStepperMenu.name$default(EnumIdStepperMenu.ID_VALIDATION_INSTRUCTOR, null, 1, null)) && Intrinsics.areEqual(stepProcessSessionDto.getStatus(), "FINISH")) {
                validateNfcStatus(activity, binding, isEnter);
            }
        }
    }
}
