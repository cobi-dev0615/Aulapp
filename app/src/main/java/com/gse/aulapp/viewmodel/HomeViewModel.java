package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.Service;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import co.ceduladigital.sdk.c0;
import co.ceduladigital.sdk.e4;
import co.ceduladigital.sdk.f0;
import co.ceduladigital.sdk.g1;
import co.ceduladigital.sdk.g6;
import co.ceduladigital.sdk.h0;
import co.ceduladigital.sdk.h1;
import co.ceduladigital.sdk.k6;
import co.ceduladigital.sdk.o1;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.r2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.gson.Gson;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentHomeBinding;
import com.gse.aulapp.model.adapter.ClassDateRecyclerAdapter;
import com.gse.aulapp.model.converter.ConfigurationSessionTypeConverter;
import com.gse.aulapp.model.converter.SessionDataConverter;
import com.gse.aulapp.model.data.ClassDate;
import com.gse.aulapp.model.data.entity.ClassRoomEntity;
import com.gse.aulapp.model.data.entity.ConfigurationSessionEntity;
import com.gse.aulapp.model.data.entity.LessonEntity;
import com.gse.aulapp.model.data.entity.SessionEntity;
import com.gse.aulapp.model.data.entity.User;
import com.gse.aulapp.model.data.entity.VehicleEntity;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.CallTypeDto;
import com.gse.aulapp.model.dto.CallTypeParametersDto;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.dto.SessionResponseDto;
import com.gse.aulapp.model.enumerate.EnumCallType;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumTimeClass;
import com.gse.aulapp.model.enumerate.EnumTypeConfiguration;
import com.gse.aulapp.model.enumerate.EnumUserProfile;
import com.gse.aulapp.model.repository.GpsRepository;
import com.gse.aulapp.model.repository.HistoricRecordPermissionsChangeRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.request.SessionInstructorRequest;
import com.gse.aulapp.model.response.ClassRoomResponse;
import com.gse.aulapp.model.response.ErrorResponse;
import com.gse.aulapp.model.response.ErrorResult;
import com.gse.aulapp.model.response.ExamPracticalConfigurationResponse;
import com.gse.aulapp.model.response.LessonResponse;
import com.gse.aulapp.model.response.PracticalConfigurationResponse;
import com.gse.aulapp.model.response.SessionInstructorObjectResponse;
import com.gse.aulapp.model.response.SessionInstructorResponse;
import com.gse.aulapp.model.response.SessionResponse;
import com.gse.aulapp.model.response.VehicleResponse;
import com.gse.aulapp.service.TimerService;
import com.gse.aulapp.util.ChipUtil;
import com.gse.aulapp.util.ConfigurationUtil;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.ExternalUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.NavigationUtil;
import com.gse.aulapp.util.NetworkUtil;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.SingleLiveEvent;
import com.gse.aulapp.util.UtilDatePicker;
import com.gse.aulapp.util.UtilString;
import com.gse.aulapp.viewmodel.HomeViewModel;
import com.karumi.dexter.BuildConfig;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJK\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010 \u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\b\u0010\u001e\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J/\u0010*\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J#\u0010.\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0,¢\u0006\u0004\b.\u0010/J%\u00101\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(2\u0006\u00100\u001a\u00020\b¢\u0006\u0004\b1\u00102JC\u0010=\u001a\u00020\n2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\f\u00109\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010:\u001a\u00020\u00172\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b=\u0010>J8\u0010D\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2!\u0010C\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u0004\u0012\u00020\n0?¢\u0006\u0004\bD\u0010EJ\u0015\u0010F\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\bF\u0010GJ\u001d\u0010H\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020\n2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\bJ\u0010KJ\u001d\u0010L\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\bL\u0010MJ-\u0010P\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010O\u001a\u00020N2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\nH\u0086@¢\u0006\u0004\bR\u0010SJ-\u0010V\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ-\u0010Y\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010)\u001a\u00020(2\u0006\u00100\u001a\u00020\b2\u0006\u0010X\u001a\u00020\u0015¢\u0006\u0004\bY\u0010ZJE\u0010\\\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010[\u001a\u00020\"2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\\\u0010]J3\u0010\\\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010O\u001a\u00020N2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\\\u0010QJ\u0010\u0010^\u001a\u00020\nH\u0082@¢\u0006\u0004\b^\u0010SJ\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00020_07H\u0082@¢\u0006\u0004\b`\u0010SJ\u000f\u0010a\u001a\u00020\nH\u0002¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\nH\u0082@¢\u0006\u0004\bc\u0010SJ\u0016\u0010d\u001a\b\u0012\u0004\u0012\u00020_07H\u0082@¢\u0006\u0004\bd\u0010SJ3\u0010g\u001a\b\u0012\u0004\u0012\u00020\u0013072\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020e\u0018\u0001072\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u001307H\u0002¢\u0006\u0004\bg\u0010hJ\u001a\u0010j\u001a\u00020\n2\b\u0010i\u001a\u0004\u0018\u00010\"H\u0082@¢\u0006\u0004\bj\u0010kJ\u001f\u0010o\u001a\u00020n2\u0006\u0010m\u001a\u00020l2\u0006\u0010i\u001a\u00020\"H\u0002¢\u0006\u0004\bo\u0010pJ\u001f\u0010q\u001a\u00020n2\u0006\u0010m\u001a\u00020l2\u0006\u0010i\u001a\u00020\"H\u0002¢\u0006\u0004\bq\u0010pJ!\u0010r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\br\u0010sJ\u001b\u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130tH\u0002¢\u0006\u0004\bu\u0010vJ'\u0010w\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(2\u0006\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\bw\u00102J7\u0010z\u001a\u00020\n2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u0010x\u001a\u00020\u00172\u0006\u0010<\u001a\u00020;2\u0006\u0010y\u001a\u00020nH\u0002¢\u0006\u0004\bz\u0010{J\u001f\u0010|\u001a\u00020\n2\u0006\u00106\u001a\u0002052\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b|\u0010}J \u0010\u007f\u001a\u00020\n2\u0006\u0010~\u001a\u00020\u00132\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0011\u0010\u0081\u0001\u001a\u00020\nH\u0002¢\u0006\u0005\b\u0081\u0001\u0010bJ*\u0010\u0082\u0001\u001a\u00020\n2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\u0006\u0010y\u001a\u00020nH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J!\u0010\u0085\u0001\u001a\u00020n2\r\u0010\u0084\u0001\u001a\b\u0012\u0004\u0012\u00020807H\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J#\u0010\u0088\u0001\u001a\u00030\u0087\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0019\u0010\u008a\u0001\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0005\b\u008a\u0001\u0010KJ4\u0010\u008d\u0001\u001a\u00020\n2\u0007\u0010\u008b\u0001\u001a\u00020\u00132\u0007\u0010\u008c\u0001\u001a\u00020n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J$\u0010\u0090\u0001\u001a\u00020\n2\b\u0010\u008f\u0001\u001a\u00030\u0087\u00012\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0019\u0010\u0092\u0001\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0005\b\u0092\u0001\u0010KJ\u0019\u0010\u0093\u0001\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0005\b\u0093\u0001\u0010KJ-\u0010\u0097\u0001\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0011\u0010\u0096\u0001\u001a\f\u0012\u0007\b\u0001\u0012\u00030\u0095\u00010\u0094\u0001H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00030\u0099\u00012\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J(\u0010\u009d\u0001\u001a\u00020\n2\u0013\u0010C\u001a\u000f\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\n0?H\u0082@¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001c\u0010\u009f\u0001\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001c\u0010£\u0001\u001a\u00020\n2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001c\u0010§\u0001\u001a\u00020\n2\b\u0010¦\u0001\u001a\u00030¥\u0001H\u0002¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001c\u0010«\u0001\u001a\u00020\n2\b\u0010ª\u0001\u001a\u00030©\u0001H\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u00ad\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010®\u0001R\u0019\u0010¯\u0001\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R\u001a\u0010²\u0001\u001a\u00030±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R \u0010µ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130´\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001f\u0010¹\u0001\u001a\n\u0012\u0005\u0012\u00030¸\u00010·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\"\u0010\u001d\u001a\n\u0012\u0005\u0012\u00030¸\u00010»\u00018\u0006¢\u0006\u000f\n\u0005\b\u001d\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001R\u001e\u0010À\u0001\u001a\t\u0012\u0004\u0012\u00020\b0¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R#\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00020\b0Â\u00018\u0006¢\u0006\u0010\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001R)\u0010Ç\u0001\u001a\u00020n8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R1\u0010Î\u0001\u001a\n\u0012\u0005\u0012\u00030Í\u00010´\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÎ\u0001\u0010¶\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R,\u0010Ô\u0001\u001a\u0005\u0018\u00010Ó\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R*\u0010Û\u0001\u001a\u00030Ú\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001\"\u0006\bß\u0001\u0010à\u0001R*\u0010á\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R#\u0010ç\u0001\u001a\t\u0012\u0004\u0012\u00020n0´\u00018\u0006¢\u0006\u0010\n\u0006\bç\u0001\u0010¶\u0001\u001a\u0006\bè\u0001\u0010Ð\u0001R)\u0010é\u0001\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bé\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R*\u0010ï\u0001\u001a\u00030î\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R\u001d\u0010ö\u0001\u001a\u00030õ\u00018\u0006¢\u0006\u0010\n\u0006\bö\u0001\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001R!\u0010û\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0099\u00010ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R'\u0010ý\u0001\u001a\u0012\u0012\r\u0012\u000b\u0012\u0007\u0012\u0005\u0018\u00010\u0099\u0001070ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bý\u0001\u0010ü\u0001R&\u0010þ\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0099\u00010ú\u00018\u0006¢\u0006\u0010\n\u0006\bþ\u0001\u0010ü\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002¨\u0006\u0081\u0002"}, d2 = {"Lcom/gse/aulapp/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/gse/aulapp/model/repository/SessionRepository;", "sessionRepository", "Lcom/gse/aulapp/model/repository/HistoricRecordPermissionsChangeRepository;", "sessionHistoricRecordPermissionsChangeRepository", "<init>", "(Lcom/gse/aulapp/model/repository/SessionRepository;Lcom/gse/aulapp/model/repository/HistoricRecordPermissionsChangeRepository;)V", "Landroid/view/Menu;", "menu", BuildConfig.FLAVOR, "setMenu", "(Landroid/view/Menu;)V", "Landroid/content/Context;", "context", "Landroid/app/Activity;", "activity", "Lcom/gse/aulapp/model/request/SessionInstructorRequest;", "sessionInstructorRequest", BuildConfig.FLAVOR, "sessionId", BuildConfig.FLAVOR, "isValidateSession", "Lcom/gse/aulapp/model/adapter/ClassDateRecyclerAdapter;", "classRecyclerAdapter", "Landroidx/navigation/NavController;", "navController", "getSessionFromApiAndSave", "(Landroid/content/Context;Landroid/app/Activity;Lcom/gse/aulapp/model/request/SessionInstructorRequest;Ljava/lang/String;ZLcom/gse/aulapp/model/adapter/ClassDateRecyclerAdapter;Landroidx/navigation/NavController;)V", "message", "code", "Lcom/gse/aulapp/model/response/ErrorResponse;", "getErrorEndpoint", "(Ljava/lang/String;Ljava/lang/String;)Lcom/gse/aulapp/model/response/ErrorResponse;", "Lcom/gse/aulapp/model/dto/SessionResponseDto;", "sessionInstructorObjectResponseList", "saveSessionAndGetFromDB", "(Lcom/gse/aulapp/model/dto/SessionResponseDto;)V", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/gse/aulapp/databinding/FragmentHomeBinding;", "binding", "showCalendar", "(Landroid/content/Context;Landroid/app/Activity;Landroidx/fragment/app/FragmentManager;Lcom/gse/aulapp/databinding/FragmentHomeBinding;)V", "Lkotlin/Function0;", "function", "validateConnection", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "item", "showDialogLogOut", "(Landroid/app/Activity;Lcom/gse/aulapp/databinding/FragmentHomeBinding;Landroid/view/Menu;)V", "Lcom/google/android/material/button/MaterialButton;", "buttonTodayClass", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/data/ClassDate;", "newClassDateList", "classDateRecyclerAdapter", "Landroid/widget/TextView;", "tvSubtitle", "updateClassDateList", "(Lcom/google/android/material/button/MaterialButton;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;Lcom/gse/aulapp/model/adapter/ClassDateRecyclerAdapter;Landroid/widget/TextView;Landroid/app/Activity;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "datetime", "callback", "getSessionRequest", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "validateNetwork", "(Landroid/app/Activity;)V", "buildChips", "(Landroid/content/Context;Lcom/gse/aulapp/databinding/FragmentHomeBinding;)V", "onClickActionFilter", "(Lcom/gse/aulapp/databinding/FragmentHomeBinding;)V", "onSwipeRefresh", "(Landroid/app/Activity;Lcom/gse/aulapp/databinding/FragmentHomeBinding;)V", "Lcom/gse/aulapp/model/dto/SessionDto;", "session", "validateAllowNavigate", "(Landroidx/navigation/NavController;Lcom/gse/aulapp/model/dto/SessionDto;Lcom/gse/aulapp/model/adapter/ClassDateRecyclerAdapter;Landroid/app/Activity;)V", "getSessionConfigList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/enumerate/EnumClassType;", "sessionType", "navigateTo", "(Landroid/content/Context;Landroidx/navigation/NavController;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumClassType;)V", "toast", "initSessionSyncPending", "(Landroid/content/Context;Lcom/gse/aulapp/databinding/FragmentHomeBinding;Landroid/view/Menu;Z)V", "result", "validateEnableStart", "(ZLcom/gse/aulapp/model/dto/SessionResponseDto;Ljava/lang/String;Landroidx/navigation/NavController;Lcom/gse/aulapp/model/adapter/ClassDateRecyclerAdapter;Landroid/app/Activity;)V", "getSessionByDB", "Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;", "getSessionFromDB", "getSessionByFilterChip", "()V", "getSessionFromDBFilterChip", "getSessionByType", "Lcom/gse/aulapp/model/response/SessionInstructorObjectResponse;", "listIdSessionDB", "getListIdSessionDelete", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "sessionResponseDto", "saveSessionFull", "(Lcom/gse/aulapp/model/dto/SessionResponseDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/enumerate/EnumTypeConfiguration;", "type", BuildConfig.FLAVOR, "getConfigMinAfter", "(Lcom/gse/aulapp/model/enumerate/EnumTypeConfiguration;Lcom/gse/aulapp/model/dto/SessionResponseDto;)I", "getConfigMinBefore", "onSelectOkDate", "(Landroid/content/Context;Landroid/app/Activity;)V", BuildConfig.FLAVOR, "buildCallTypeParametersMap", "()Ljava/util/Map;", "onClickLogOut", "classDateAdapter", "todayItemPosition", "setupOnScrollListener", "(Lcom/google/android/material/button/MaterialButton;Landroidx/recyclerview/widget/RecyclerView;Lcom/gse/aulapp/model/adapter/ClassDateRecyclerAdapter;Landroid/widget/TextView;I)V", "getItemsOfRecycler", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;)V", "date", "updateDateClass", "(Ljava/lang/String;Landroid/widget/TextView;)V", "loadDefaultList", "updateTodayButtonVisibility", "(Lcom/google/android/material/button/MaterialButton;Landroidx/recyclerview/widget/RecyclerView;I)V", "classDateList", "findTodayItemPosition", "(Ljava/util/List;)I", "Lcom/google/android/material/chip/Chip;", "buildChipAll", "(Landroid/content/Context;Lcom/gse/aulapp/databinding/FragmentHomeBinding;)Lcom/google/android/material/chip/Chip;", "clearChips", "chipName", "chipId", "addChipToGroup", "(Ljava/lang/String;ILandroid/content/Context;Lcom/gse/aulapp/databinding/FragmentHomeBinding;)V", "chip", "onClickChip", "(Lcom/google/android/material/chip/Chip;Lcom/gse/aulapp/databinding/FragmentHomeBinding;)V", "disableChipAll", "enableChipAll", "Ljava/lang/Class;", "Landroid/app/Service;", "serviceClass", "timerServiceIsRunning", "(Landroid/content/Context;Ljava/lang/Class;)Z", "Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;", "getSessionConfig", "(Lcom/gse/aulapp/model/enumerate/EnumTypeConfiguration;)Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;", BuildConfig.FLAVOR, "getConfigurationSession", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showDialogClassStarted", "(Landroid/content/Context;)V", "Lcom/gse/aulapp/model/response/SessionInstructorResponse;", "sessionInstructorResponse", "initConfigurationPracticalAndExamPractical", "(Lcom/gse/aulapp/model/response/SessionInstructorResponse;)V", "Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;", "practicalConfigurationResponse", "saveConfigurationPractical", "(Lcom/gse/aulapp/model/response/PracticalConfigurationResponse;)V", "Lcom/gse/aulapp/model/response/ExamPracticalConfigurationResponse;", "examPracticalConfiguration", "saveExamPracticalConfiguration", "(Lcom/gse/aulapp/model/response/ExamPracticalConfigurationResponse;)V", "Lcom/gse/aulapp/model/repository/SessionRepository;", "Lcom/gse/aulapp/model/repository/HistoricRecordPermissionsChangeRepository;", "TAG", "Ljava/lang/String;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", BuildConfig.FLAVOR, "listClasType", "Ljava/util/List;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/gse/aulapp/model/data/statusControl/Status;", "_message", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "Lkotlinx/coroutines/flow/SharedFlow;", "getMessage", "()Lkotlinx/coroutines/flow/SharedFlow;", "Landroidx/lifecycle/MutableLiveData;", "_menuLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "menuLiveData", "Landroidx/lifecycle/LiveData;", "getMenuLiveData", "()Landroidx/lifecycle/LiveData;", "_action", "I", "get_action", "()I", "set_action", "(I)V", "Lcom/gse/aulapp/model/data/entity/User;", "userList", "getUserList", "()Ljava/util/List;", "setUserList", "(Ljava/util/List;)V", "Ljava/util/Date;", "dateSelect", "Ljava/util/Date;", "getDateSelect", "()Ljava/util/Date;", "setDateSelect", "(Ljava/util/Date;)V", "Landroid/app/Dialog;", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "chipAll", "Lcom/google/android/material/chip/Chip;", "getChipAll", "()Lcom/google/android/material/chip/Chip;", "setChipAll", "(Lcom/google/android/material/chip/Chip;)V", "unSelectedChips", "getUnSelectedChips", "isSwipeRefresh", "Z", "()Z", "setSwipeRefresh", "(Z)V", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "swrHome", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSwrHome", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setSwrHome", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "Lcom/gse/aulapp/model/repository/GpsRepository;", "gpsRepository", "Lcom/gse/aulapp/model/repository/GpsRepository;", "getGpsRepository", "()Lcom/gse/aulapp/model/repository/GpsRepository;", "Lcom/gse/aulapp/util/SingleLiveEvent;", "_configSession", "Lcom/gse/aulapp/util/SingleLiveEvent;", "_listConfigSession", "configSession", "getConfigSession", "()Lcom/gse/aulapp/util/SingleLiveEvent;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\ncom/gse/aulapp/viewmodel/HomeViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,1210:1\n1863#2:1211\n1863#2,2:1212\n1864#2:1214\n1863#2:1215\n1863#2,2:1216\n1864#2:1218\n1863#2,2:1219\n1863#2:1221\n1863#2,2:1222\n1864#2:1224\n1863#2:1225\n1863#2,2:1226\n1864#2:1228\n360#2,7:1229\n1755#2,3:1244\n295#2,2:1247\n13409#3,2:1236\n254#4:1238\n254#4:1243\n53#5,4:1239\n*S KotlinDebug\n*F\n+ 1 HomeViewModel.kt\ncom/gse/aulapp/viewmodel/HomeViewModel\n*L\n245#1:1211\n246#1:1212,2\n245#1:1214\n403#1:1215\n404#1:1216,2\n403#1:1218\n409#1:1219,2\n422#1:1221\n423#1:1222,2\n422#1:1224\n437#1:1225\n438#1:1226,2\n437#1:1228\n813#1:1229,7\n963#1:1244,3\n1058#1:1247,2\n856#1:1236,2\n863#1:1238\n954#1:1243\n880#1:1239,4\n*E\n"})
/* loaded from: classes2.dex */
public final class HomeViewModel extends ViewModel {
    final String TAG;
    private int _action;
    private final SingleLiveEvent<ConfigurationSessionDto> _configSession;
    final SingleLiveEvent<List<ConfigurationSessionDto>> _listConfigSession;
    private final MutableLiveData<Menu> _menuLiveData;
    final MutableSharedFlow<Status> _message;
    public Chip chipAll;
    private final SingleLiveEvent<ConfigurationSessionDto> configSession;
    private Date dateSelect;
    public Dialog dialog;
    private final GpsRepository gpsRepository;
    private Gson gson;
    private boolean isSwipeRefresh;
    List<String> listClasType;
    private final LiveData<Menu> menuLiveData;
    private final SharedFlow<Status> message;
    final HistoricRecordPermissionsChangeRepository sessionHistoricRecordPermissionsChangeRepository;
    final SessionRepository sessionRepository;
    public SwipeRefreshLayout swrHome;
    private final List<Integer> unSelectedChips;
    private List<User> userList;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumTypeConfiguration.values().length];
            try {
                iArr[EnumTypeConfiguration.EXAM_CONFIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumTypeConfiguration.CLASS_PRACTICAL_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HomeViewModel(SessionRepository sessionRepository, HistoricRecordPermissionsChangeRepository sessionHistoricRecordPermissionsChangeRepository) {
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(sessionHistoricRecordPermissionsChangeRepository, "sessionHistoricRecordPermissionsChangeRepository");
        this.sessionRepository = sessionRepository;
        this.sessionHistoricRecordPermissionsChangeRepository = sessionHistoricRecordPermissionsChangeRepository;
        this.TAG = "HomeViewModel";
        this.gson = new Gson();
        this.listClasType = new ArrayList();
        MutableSharedFlow<Status> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow(0, 1, (BufferOverflow) null);
        this._message = MutableSharedFlow$default;
        this.message = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableLiveData<Menu> mutableLiveData = new MutableLiveData<>();
        this._menuLiveData = mutableLiveData;
        this.menuLiveData = mutableLiveData;
        this.userList = new ArrayList();
        this.unSelectedChips = new ArrayList();
        this.gpsRepository = new GpsRepository(GeneralApp.INSTANCE.getDatabase().GpsDao());
        SingleLiveEvent<ConfigurationSessionDto> singleLiveEvent = new SingleLiveEvent<>();
        this._configSession = singleLiveEvent;
        this._listConfigSession = new SingleLiveEvent<>();
        this.configSession = singleLiveEvent;
    }

    private final void addChipToGroup(String chipName, int chipId, Context context, FragmentHomeBinding binding) {
        Chip buildChip = ChipUtil.INSTANCE.buildChip(chipName, context, chipId);
        binding.chipGroup.addView(buildChip);
        buildChip.isChecked();
        buildChip.setOnClickListener(new f0(this, binding, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addChipToGroup$lambda$20(HomeViewModel this$0, FragmentHomeBinding binding, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        this$0.onClickChip((Chip) view, binding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> buildCallTypeParametersMap() {
        String json = this.gson.toJson(new CallTypeParametersDto(CollectionsKt.mutableListOf(new CallTypeDto(EnumCallType.LOGOUT, EnumUserProfile.NONE, 1, null, false, null, null, null, null, null, null, null, false, BuildConfig.FLAVOR, false, 16512, null))));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        HashMap hashMap = new HashMap();
        hashMap.put("CALL_TYPE_PARAMETERS", json);
        return hashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.google.android.material.chip.Chip] */
    private final Chip buildChipAll(Context context, FragmentHomeBinding binding) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ChipUtil.Companion companion = ChipUtil.INSTANCE;
        Chip buildChip = companion.buildChip(companion.getALL(), context, 0);
        objectRef.element = buildChip;
        buildChip.setChecked(true);
        companion.updateColorChipStatus((Chip) objectRef.element);
        ((Chip) objectRef.element).setOnClickListener(new h1(this, objectRef, binding, 3));
        return (Chip) objectRef.element;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void buildChipAll$lambda$18(HomeViewModel this$0, Ref.ObjectRef chipTemporal, FragmentHomeBinding binding, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(chipTemporal, "$chipTemporal");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        this$0.onClickChip((Chip) chipTemporal.element, binding);
    }

    private final void clearChips(FragmentHomeBinding binding) {
        ChipGroup chipGroup = binding.chipGroup;
        Intrinsics.checkNotNullExpressionValue(chipGroup, "chipGroup");
        int childCount = chipGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = chipGroup.getChildAt(i);
            if (childAt.getId() != 0) {
                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
                Chip chip = (Chip) childAt;
                chip.setChecked(false);
                ChipUtil.INSTANCE.updateColorChipStatus(chip);
            }
        }
    }

    private final void disableChipAll(FragmentHomeBinding binding) {
        View childAt = binding.chipGroup.getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
        Chip chip = (Chip) childAt;
        chip.setChecked(false);
        ChipUtil.INSTANCE.updateColorChipStatus(chip);
    }

    private final void enableChipAll(FragmentHomeBinding binding) {
        if (this.listClasType.size() == 0) {
            View childAt = binding.chipGroup.getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            Chip chip = (Chip) childAt;
            chip.setChecked(true);
            ChipUtil.INSTANCE.updateColorChipStatus(chip);
        }
    }

    private final int findTodayItemPosition(List<ClassDate> classDateList) {
        Iterator<ClassDate> it = classDateList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(it.next().getDay(), "(Hoy)")) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private final int getConfigMinAfter(EnumTypeConfiguration type, SessionResponseDto sessionResponseDto) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            ExamPracticalConfigurationResponse examPracticalConfiguration = sessionResponseDto.getExamPracticalConfiguration();
            if (examPracticalConfiguration != null) {
                return examPracticalConfiguration.getMinToleranceEntryAfter();
            }
            return 20;
        }
        if (i != 2) {
            return 0;
        }
        PracticalConfigurationResponse practicalConfiguration = sessionResponseDto.getPracticalConfiguration();
        if (practicalConfiguration != null) {
            return practicalConfiguration.getMinToleranceEntryAfter();
        }
        return 20;
    }

    private final int getConfigMinBefore(EnumTypeConfiguration type, SessionResponseDto sessionResponseDto) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            ExamPracticalConfigurationResponse examPracticalConfiguration = sessionResponseDto.getExamPracticalConfiguration();
            if (examPracticalConfiguration != null) {
                return examPracticalConfiguration.getMinToleranceEntryBefore();
            }
            return 20;
        }
        if (i != 2) {
            return 0;
        }
        PracticalConfigurationResponse practicalConfiguration = sessionResponseDto.getPracticalConfiguration();
        if (practicalConfiguration != null) {
            return practicalConfiguration.getMinToleranceEntryBefore();
        }
        return 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getConfigurationSession(Function1<Object, Unit> function1, Continuation continuation) {
        HomeViewModel$getConfigurationSession$1 homeViewModel$getConfigurationSession$1;
        if (continuation instanceof HomeViewModel$getConfigurationSession$1) {
            homeViewModel$getConfigurationSession$1 = (HomeViewModel$getConfigurationSession$1) continuation;
            int i2 = homeViewModel$getConfigurationSession$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                homeViewModel$getConfigurationSession$1.label = i2 - IntCompanionObject.MIN_VALUE;
            }
        } else {
            homeViewModel$getConfigurationSession$1 = new HomeViewModel$getConfigurationSession$1(this, (Continuation) continuation);
        }
        Object obj = homeViewModel$getConfigurationSession$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = homeViewModel$getConfigurationSession$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ConfigurationUtil.Companion companion = ConfigurationUtil.INSTANCE;
            homeViewModel$getConfigurationSession$1.L$0 = function1;
            homeViewModel$getConfigurationSession$1.label = 1;
            obj = companion.getConfigurationSession(homeViewModel$getConfigurationSession$1);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            function1 = (Function1) homeViewModel$getConfigurationSession$1.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        function1.invoke(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getItemsOfRecycler(RecyclerView recyclerView, TextView tvSubtitle) {
        View view;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        TextView textView = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        Integer valueOf = linearLayoutManager != null ? Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()) : null;
        if (valueOf == null || valueOf.intValue() == -1) {
            return;
        }
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(valueOf.intValue());
        if (findViewHolderForAdapterPosition != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
            textView = (TextView) view.findViewById(R.id.tv_class_date);
        }
        if (textView != null) {
            updateDateClass(textView.getText().toString(), tvSubtitle);
        }
    }

    private final List<String> getListIdSessionDelete(List<SessionInstructorObjectResponse> sessionInstructorObjectResponseList, List<String> listIdSessionDB) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!listIdSessionDB.isEmpty()) {
            if (sessionInstructorObjectResponseList != null) {
                Iterator it = sessionInstructorObjectResponseList.iterator();
                while (it.hasNext()) {
                    List<SessionResponse> sessions = ((SessionInstructorObjectResponse) it.next()).getSessions();
                    if (sessions != null) {
                        Iterator it2 = sessions.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((SessionResponse) it2.next()).getId());
                        }
                    }
                }
            }
            for (String str : listIdSessionDB) {
                if (!arrayList2.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSessionByDB(Continuation continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new HomeViewModel$getSessionByDB$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    private final void getSessionByFilterChip() {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new HomeViewModel$getSessionByFilterChip$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSessionByType(Continuation<? super List<SessionFull>> continuation) {
        return this.sessionRepository.getSessionByType(this.listClasType, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ConfigurationSessionDto getSessionConfig(EnumTypeConfiguration type) {
        ConfigurationSessionDto configurationSessionDto = null;
        List<ConfigurationSessionDto> value = this._listConfigSession.getValue();
        if (value != null) {
            Iterator it = value.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                ConfigurationSessionDto configurationSessionDto2 = (ConfigurationSessionDto) next;
                if (Intrinsics.areEqual(configurationSessionDto2 != null ? configurationSessionDto2.getType() : null, type.name())) {
                    configurationSessionDto = (ConfigurationSessionDto) next;
                    break;
                }
            }
        }
        if (configurationSessionDto == null) {
            configurationSessionDto = new ConfigurationSessionDto(null, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
        }
        this._configSession.postValue(configurationSessionDto);
        return configurationSessionDto;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, java.util.List] */
    public static final Unit getSessionConfigList$lambda$28(Ref.ObjectRef configurationSession, HomeViewModel this$0, Object it) {
        Intrinsics.checkNotNullParameter(configurationSession, "$configurationSession");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        List r3 = (List) it;
        configurationSession.element = r3;
        MutableLiveData mutableLiveData = this$0._listConfigSession;
        Intrinsics.checkNotNull(r3);
        mutableLiveData.postValue(r3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSessionFromDB(Continuation<? super List<SessionFull>> continuation) {
        Long l;
        if (this.dateSelect != null) {
            l = DateUtil.INSTANCE.uTCSettingLong(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(this.dateSelect), "yyyy-MM-dd");
        } else {
            l = null;
        }
        return this.sessionRepository.getAllSession(l, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getSessionFromDBFilterChip(Continuation continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new HomeViewModel$getSessionFromDBFilterChip$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSessionRequest$lambda$16(Function1 callback, String dateTime) {
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        Date parse = null;
        try {
            parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(dateTime);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        if (parse == null) {
            parse = DateUtil.Companion.getNowDateDate$default(DateUtil.INSTANCE, false, 1, null);
        }
        DateUtil.Companion companion = DateUtil.INSTANCE;
        callback.invoke(new SessionInstructorRequest(companion.getDateNextRequestFormat(parse, 2, 1), companion.getDateRequestFormat(dateTime)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initConfigurationPracticalAndExamPractical(SessionInstructorResponse sessionInstructorResponse) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), CoroutineStart.DEFAULT, new HomeViewModel$initConfigurationPracticalAndExamPractical$1(this, sessionInstructorResponse, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadDefaultList() {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new HomeViewModel$loadDefaultList$1(this, null));
    }

    private final void onClickChip(Chip chip, FragmentHomeBinding binding) {
        if (chip.getId() == 0) {
            clearChips(binding);
            this.listClasType.clear();
        } else if (chip.isChecked()) {
            this.listClasType.add(EnumClassType.name$default(EnumClassType.INSTANCE.getEnumByID(Integer.valueOf(chip.getId())), null, 1, null));
            ChipUtil.INSTANCE.updateColorChipStatus(chip);
        } else {
            this.listClasType.remove(EnumClassType.name$default(EnumClassType.INSTANCE.getEnumByID(Integer.valueOf(chip.getId())), null, 1, null));
            ChipUtil.INSTANCE.updateColorChipStatus(chip);
        }
        if (chip.getId() != 0) {
            disableChipAll(binding);
        }
        enableChipAll(binding);
        getSessionByFilterChip();
    }

    private final void onClickLogOut(Activity activity, FragmentHomeBinding binding, Menu item) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new HomeViewModel$onClickLogOut$1(this, activity, binding, item, null));
    }

    private final void onSelectOkDate(Context context, Activity activity) {
        if (this.dateSelect == null || context == null) {
            return;
        }
        String format = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(this.dateSelect);
        Intrinsics.checkNotNull(format);
        getSessionFromApiAndSave(context, activity, new SessionInstructorRequest(format, format), BuildConfig.FLAVOR, false, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveConfigurationPractical(PracticalConfigurationResponse practicalConfigurationResponse) {
        ConfigurationUtil.INSTANCE.saveConfigurationBasic(new ConfigurationSessionEntity("CLASS_PRACTICAL_CONFIG", practicalConfigurationResponse.getMinToleranceEntryBefore(), practicalConfigurationResponse.getMinToleranceEntryAfter(), practicalConfigurationResponse.getMinToleranceDepartureAfter(), practicalConfigurationResponse.getDurationForHour(), practicalConfigurationResponse.getDurationForHourShow(), practicalConfigurationResponse.getAlertEndSession(), practicalConfigurationResponse.getAlertDepartureAfter(), practicalConfigurationResponse.getMinutesForHour()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveExamPracticalConfiguration(ExamPracticalConfigurationResponse examPracticalConfiguration) {
        ConfigurationUtil.INSTANCE.saveConfigurationBasic(new ConfigurationSessionEntity("EXAM_CONFIG", examPracticalConfiguration.getMinToleranceEntryBefore(), examPracticalConfiguration.getMinToleranceEntryAfter(), examPracticalConfiguration.getMinToleranceDepartureAfter(), examPracticalConfiguration.getDurationForHour(), examPracticalConfiguration.getDurationForHourShow(), examPracticalConfiguration.getAlertEndSession(), examPracticalConfiguration.getAlertDepartureAfter(), examPracticalConfiguration.getMinutesForHour()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0324, code lost:
    
        if (r2.saveVehicle(r0, r3) == r4) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x03f0, code lost:
    
        if (r2.saveClassRoom(r2, r3) == r4) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x045d, code lost:
    
        if (r0.saveSession(r2, r3) != r4) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x049a, code lost:
    
        if (r0.deleteSessionById(r2, r3) == r4) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x04d9, code lost:
    
        if (r0.deleteSessionsByDate(r1, r3) == r4) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a6  */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0282 -> B:19:0x0465). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x045d -> B:18:0x0461). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0260 -> B:56:0x0471). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0262 -> B:20:0x026e). Please report as a decompilation issue!!! */
    public final Object saveSessionFull(SessionResponseDto sessionResponseDto, Continuation continuation) {
        HomeViewModel$saveSessionFull$1 cont;
        if (continuation instanceof HomeViewModel$saveSessionFull$1) {
            cont = (HomeViewModel$saveSessionFull$1) continuation;
            int i = cont.label;
            if ((i & IntCompanionObject.MIN_VALUE) != 0) {
                cont.label = i - IntCompanionObject.MIN_VALUE;
            }
        } else {
            cont = new HomeViewModel$saveSessionFull$1(this, (Continuation) continuation);
        }

        Object obj = cont.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int label = cont.label;

        // Variables that persist across suspend points
        HomeViewModel viewModel;
        SessionResponseDto dto;
        Ref.ObjectRef startEntryRef;  // L$2 - stores startEntryClass result
        Ref.ObjectRef endEntryRef;    // L$3 - stores endEntryClass result
        List pendingSyncIds;          // L$4
        List<String> deleteIds;       // L$5
        Iterator outerIt;             // L$6 - iterates SessionInstructorObjectResponse
        SessionInstructorObjectResponse currentInstructorObj; // L$7
        Iterator innerIt;             // L$8 - iterates SessionResponse
        SessionResponse currentSession; // L$9
        String vehicleId;             // L$10
        String lessonId;              // L$11
        String classroomId;           // L$12

        switch (label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                // Step 1: Get pending sync IDs
                cont.L$0 = this;
                cont.L$1 = sessionResponseDto;
                cont.label = 1;
                obj = this.sessionRepository.getSessionIdPendingSync(cont);
                if (obj == coroutine_suspended) return coroutine_suspended;
                // fall through

            case 1:
                if (label == 1) {
                    dto = (SessionResponseDto) cont.L$1;
                    viewModel = (HomeViewModel) cont.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    viewModel = this;
                    dto = sessionResponseDto;
                }
                pendingSyncIds = (List) obj;
                // Step 2: Get all existing session IDs
                cont.L$0 = viewModel;
                cont.L$1 = dto;
                cont.L$4 = pendingSyncIds;
                cont.label = 2;
                obj = viewModel.sessionRepository.getAllSessionID(cont);
                if (obj == coroutine_suspended) return coroutine_suspended;
                // fall through

            case 2:
                if (label == 2) {
                    pendingSyncIds = (List) cont.L$4;
                    dto = (SessionResponseDto) cont.L$1;
                    viewModel = (HomeViewModel) cont.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    // values already set from case 1 fall-through
                }
                List allSessionIds = (List) obj;
                List<SessionInstructorObjectResponse> instrObjList = (dto != null) ? dto.getSessionInstructorObjectResponse() : null;
                deleteIds = viewModel.getListIdSessionDelete(instrObjList, allSessionIds);

                // Step 3: Iterate sessions and save each one
                if (instrObjList != null) {
                    outerIt = instrObjList.iterator();
                } else {
                    outerIt = java.util.Collections.emptyIterator();
                }
                // Initialize loop state
                cont.L$0 = viewModel;
                cont.L$1 = dto;
                cont.L$4 = pendingSyncIds;
                cont.L$5 = deleteIds;
                cont.L$6 = outerIt;
                // Enter the session processing loop
                return processSessionLoop(viewModel, dto, pendingSyncIds, deleteIds, outerIt, null, null, null, cont, coroutine_suspended);

            case 3:
                // Resumed from getStartEntryClass
                viewModel = (HomeViewModel) cont.L$0;
                dto = (SessionResponseDto) cont.L$1;
                startEntryRef = (Ref.ObjectRef) cont.L$2;
                pendingSyncIds = (List) cont.L$4;
                deleteIds = (List) cont.L$5;
                outerIt = (Iterator) cont.L$6;
                currentInstructorObj = (SessionInstructorObjectResponse) cont.L$7;
                innerIt = (Iterator) cont.L$8;
                currentSession = (SessionResponse) cont.L$9;
                ResultKt.throwOnFailure(obj);
                startEntryRef.element = obj;
                // Continue to getEndEntryClass
                cont.L$2 = startEntryRef;
                endEntryRef = new Ref.ObjectRef();
                cont.L$3 = endEntryRef;
                cont.label = 4;
                obj = viewModel.sessionRepository.getEndEntryClass(currentSession.getId(), cont);
                if (obj == coroutine_suspended) return coroutine_suspended;
                // fall through

            case 4:
                if (label == 4) {
                    viewModel = (HomeViewModel) cont.L$0;
                    dto = (SessionResponseDto) cont.L$1;
                    startEntryRef = (Ref.ObjectRef) cont.L$2;
                    endEntryRef = (Ref.ObjectRef) cont.L$3;
                    pendingSyncIds = (List) cont.L$4;
                    deleteIds = (List) cont.L$5;
                    outerIt = (Iterator) cont.L$6;
                    currentInstructorObj = (SessionInstructorObjectResponse) cont.L$7;
                    innerIt = (Iterator) cont.L$8;
                    currentSession = (SessionResponse) cont.L$9;
                    ResultKt.throwOnFailure(obj);
                } else {
                    // values from case 3 fall-through
                    endEntryRef = (Ref.ObjectRef) cont.L$3;
                    currentInstructorObj = (SessionInstructorObjectResponse) cont.L$7;
                    currentSession = (SessionResponse) cont.L$9;
                }
                endEntryRef.element = obj;

                // Check and save vehicle
                vehicleId = null;
                if (currentSession.getVehicle() != null) {
                    vehicleId = currentSession.getVehicle().getVehicleID();
                    VehicleEntity vehicleEntity = SessionDataConverter.INSTANCE.getVehicleEntityFromVehicleResponse(currentSession.getVehicle());
                    cont.L$10 = vehicleId;
                    cont.label = 5;
                    obj = viewModel.sessionRepository.saveVehicle(vehicleEntity, cont);
                    if (obj == coroutine_suspended) return coroutine_suspended;
                }
                // fall through

            case 5:
                if (label == 5) {
                    viewModel = (HomeViewModel) cont.L$0;
                    dto = (SessionResponseDto) cont.L$1;
                    startEntryRef = (Ref.ObjectRef) cont.L$2;
                    endEntryRef = (Ref.ObjectRef) cont.L$3;
                    pendingSyncIds = (List) cont.L$4;
                    deleteIds = (List) cont.L$5;
                    outerIt = (Iterator) cont.L$6;
                    currentInstructorObj = (SessionInstructorObjectResponse) cont.L$7;
                    innerIt = (Iterator) cont.L$8;
                    currentSession = (SessionResponse) cont.L$9;
                    vehicleId = (String) cont.L$10;
                    ResultKt.throwOnFailure(obj);
                } else {
                    // values from case 4 fall-through
                }

                // Check and save lesson
                lessonId = null;
                if (currentSession.getLesson() != null && currentSession.getLesson().getLessonID() != null) {
                    lessonId = currentSession.getLesson().getLessonID();
                    LessonEntity lessonEntity = SessionDataConverter.INSTANCE.getLessonEntityFromLessonResponse(currentSession.getLesson());
                    cont.L$10 = vehicleId;
                    cont.L$11 = lessonId;
                    cont.label = 6;
                    obj = viewModel.sessionRepository.saveLesson(lessonEntity, cont);
                    if (obj == coroutine_suspended) return coroutine_suspended;
                }
                // fall through

            case 6:
                if (label == 6) {
                    viewModel = (HomeViewModel) cont.L$0;
                    dto = (SessionResponseDto) cont.L$1;
                    startEntryRef = (Ref.ObjectRef) cont.L$2;
                    endEntryRef = (Ref.ObjectRef) cont.L$3;
                    pendingSyncIds = (List) cont.L$4;
                    deleteIds = (List) cont.L$5;
                    outerIt = (Iterator) cont.L$6;
                    currentInstructorObj = (SessionInstructorObjectResponse) cont.L$7;
                    innerIt = (Iterator) cont.L$8;
                    currentSession = (SessionResponse) cont.L$9;
                    vehicleId = (String) cont.L$10;
                    lessonId = (String) cont.L$11;
                    ResultKt.throwOnFailure(obj);
                } else {
                    // values from case 5 fall-through
                }

                // Check and save classroom
                classroomId = null;
                if (currentSession.getClassroom() != null) {
                    classroomId = currentSession.getClassroom().getClassroomID();
                    ClassRoomEntity classRoomEntity = SessionDataConverter.INSTANCE.getClassRoomEntityFormClassRoomResponse(currentSession.getClassroom());
                    cont.L$10 = vehicleId;
                    cont.L$11 = classroomId;
                    cont.L$12 = lessonId;
                    cont.label = 7;
                    obj = viewModel.sessionRepository.saveClassRoom(classRoomEntity, cont);
                    if (obj == coroutine_suspended) return coroutine_suspended;
                }
                // fall through

            case 7:
                if (label == 7) {
                    viewModel = (HomeViewModel) cont.L$0;
                    dto = (SessionResponseDto) cont.L$1;
                    startEntryRef = (Ref.ObjectRef) cont.L$2;
                    endEntryRef = (Ref.ObjectRef) cont.L$3;
                    pendingSyncIds = (List) cont.L$4;
                    deleteIds = (List) cont.L$5;
                    outerIt = (Iterator) cont.L$6;
                    currentInstructorObj = (SessionInstructorObjectResponse) cont.L$7;
                    innerIt = (Iterator) cont.L$8;
                    currentSession = (SessionResponse) cont.L$9;
                    vehicleId = (String) cont.L$10;
                    classroomId = (String) cont.L$11;
                    lessonId = (String) cont.L$12;
                    ResultKt.throwOnFailure(obj);
                } else {
                    // values from case 6 fall-through
                }

                // Save the session entity
                EnumTypeConfiguration type = ConfigurationSessionTypeConverter.INSTANCE.getType(currentSession.getType());
                int configMinAfter = viewModel.getConfigMinAfter(type, dto);
                int configMinBefore = viewModel.getConfigMinBefore(type, dto);
                SessionEntity sessionEntity = SessionDataConverter.INSTANCE.getSessionEntityFromSessionResponse(
                    currentSession, classroomId, vehicleId, lessonId,
                    currentInstructorObj.getDate(),
                    (Long) startEntryRef.element, (Long) endEntryRef.element,
                    configMinBefore, configMinAfter
                );
                cont.label = 8;
                obj = viewModel.sessionRepository.saveSession(sessionEntity, cont);
                if (obj == coroutine_suspended) return coroutine_suspended;
                // fall through

            case 8:
                if (label == 8) {
                    viewModel = (HomeViewModel) cont.L$0;
                    dto = (SessionResponseDto) cont.L$1;
                    pendingSyncIds = (List) cont.L$4;
                    deleteIds = (List) cont.L$5;
                    outerIt = (Iterator) cont.L$6;
                    currentInstructorObj = (SessionInstructorObjectResponse) cont.L$7;
                    innerIt = (Iterator) cont.L$8;
                    ResultKt.throwOnFailure(obj);
                } else {
                    // values from case 7 fall-through
                    innerIt = (Iterator) cont.L$8;
                }
                // Continue the loop - process next session
                return processSessionLoop(viewModel, dto, pendingSyncIds, deleteIds, outerIt, currentInstructorObj, innerIt, null, cont, coroutine_suspended);

            case 9:
                // Resumed from deleteSession
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;

            case 10:
                // Resumed from deleteAllSessionNotPending
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;

            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        // Should not reach here
        return Unit.INSTANCE;
    }

    private Object processSessionLoop(HomeViewModel viewModel, SessionResponseDto dto,
            List pendingSyncIds, List<String> deleteIds, Iterator outerIt,
            SessionInstructorObjectResponse currentInstructorObj, Iterator innerIt,
            SessionResponse skipToSession,
            HomeViewModel$saveSessionFull$1 cont, Object coroutine_suspended) {

        // Continue iterating through sessions
        while (true) {
            // If we need to advance to next inner item
            if (innerIt == null || !innerIt.hasNext()) {
                // Move to next SessionInstructorObjectResponse
                if (!outerIt.hasNext()) {
                    // Done iterating - handle deletions
                    break;
                }
                currentInstructorObj = (SessionInstructorObjectResponse) outerIt.next();
                List sessions = currentInstructorObj.getSessions();
                if (sessions == null) continue;
                innerIt = sessions.iterator();
                if (!innerIt.hasNext()) continue;
            }

            SessionResponse session = (SessionResponse) innerIt.next();

            // Skip sessions that are pending sync
            if (pendingSyncIds.contains(session.getId())) {
                continue;
            }

            // Save state and call getStartEntryClass
            Ref.ObjectRef startEntryRef = new Ref.ObjectRef();
            cont.L$0 = viewModel;
            cont.L$1 = dto;
            cont.L$2 = startEntryRef;
            cont.L$4 = pendingSyncIds;
            cont.L$5 = deleteIds;
            cont.L$6 = outerIt;
            cont.L$7 = currentInstructorObj;
            cont.L$8 = innerIt;
            cont.L$9 = session;
            cont.label = 3;
            Object result = viewModel.sessionRepository.getStartEntryClass(session.getId(), cont);
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
            // getStartEntryClass returned immediately
            startEntryRef.element = result;

            // getEndEntryClass
            Ref.ObjectRef endEntryRef = new Ref.ObjectRef();
            cont.L$3 = endEntryRef;
            cont.label = 4;
            result = viewModel.sessionRepository.getEndEntryClass(session.getId(), cont);
            if (result == coroutine_suspended) return coroutine_suspended;
            endEntryRef.element = result;

            // Save vehicle if present
            String vehicleId = null;
            if (session.getVehicle() != null) {
                vehicleId = session.getVehicle().getVehicleID();
                VehicleEntity vehicleEntity = SessionDataConverter.INSTANCE.getVehicleEntityFromVehicleResponse(session.getVehicle());
                cont.L$10 = vehicleId;
                cont.label = 5;
                result = viewModel.sessionRepository.saveVehicle(vehicleEntity, cont);
                if (result == coroutine_suspended) return coroutine_suspended;
            }

            // Save lesson if present
            String lessonId = null;
            if (session.getLesson() != null && session.getLesson().getLessonID() != null) {
                lessonId = session.getLesson().getLessonID();
                LessonEntity lessonEntity = SessionDataConverter.INSTANCE.getLessonEntityFromLessonResponse(session.getLesson());
                cont.L$10 = vehicleId;
                cont.L$11 = lessonId;
                cont.label = 6;
                result = viewModel.sessionRepository.saveLesson(lessonEntity, cont);
                if (result == coroutine_suspended) return coroutine_suspended;
            }

            // Save classroom if present
            String classroomId = null;
            if (session.getClassroom() != null) {
                classroomId = session.getClassroom().getClassroomID();
                ClassRoomEntity classRoomEntity = SessionDataConverter.INSTANCE.getClassRoomEntityFormClassRoomResponse(session.getClassroom());
                cont.L$10 = vehicleId;
                cont.L$11 = classroomId;
                cont.L$12 = lessonId;
                cont.label = 7;
                result = viewModel.sessionRepository.saveClassRoom(classRoomEntity, cont);
                if (result == coroutine_suspended) return coroutine_suspended;
            }

            // Save the session entity
            EnumTypeConfiguration type = ConfigurationSessionTypeConverter.INSTANCE.getType(session.getType());
            int configMinAfter = viewModel.getConfigMinAfter(type, dto);
            int configMinBefore = viewModel.getConfigMinBefore(type, dto);
            SessionEntity sessionEntity = SessionDataConverter.INSTANCE.getSessionEntityFromSessionResponse(
                session, classroomId, vehicleId, lessonId,
                currentInstructorObj.getDate(),
                (Long) startEntryRef.element, (Long) endEntryRef.element,
                configMinBefore, configMinAfter
            );
            cont.L$8 = innerIt;
            cont.label = 8;
            result = viewModel.sessionRepository.saveSession(sessionEntity, cont);
            if (result == coroutine_suspended) return coroutine_suspended;
        }

        // After processing all sessions, handle deletions
        if (!deleteIds.isEmpty()) {
            String nowStr = java.time.LocalDateTime.now().toString();
            cont.L$0 = null;
            cont.label = 9;
            Object result = viewModel.sessionRepository.deleteSessionById(deleteIds, cont);
            if (result == coroutine_suspended) return coroutine_suspended;
        } else {
            List instrList = (dto != null) ? dto.getSessionInstructorObjectResponse() : null;
            if (instrList != null && instrList.isEmpty()) {
                String nowStr = java.time.LocalDateTime.now().toString();
                cont.L$0 = null;
                cont.label = 10;
                Object result = viewModel.sessionRepository.deleteSessionsByDate(nowStr, cont);
                if (result == coroutine_suspended) return coroutine_suspended;
            }
        }

        return Unit.INSTANCE;
    }

    private final void setupOnScrollListener(MaterialButton buttonTodayClass, RecyclerView recyclerView, ClassDateRecyclerAdapter classDateAdapter, TextView tvSubtitle, int todayItemPosition) {
        recyclerView.clearOnScrollListeners();
        recyclerView.addOnScrollListener(new HomeViewModel$setupOnScrollListener$1(this, buttonTodayClass, todayItemPosition, tvSubtitle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCalendar$lambda$11(HomeViewModel this$0, Context context, Activity activity, FragmentHomeBinding binding, Date selection) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(selection, "selection");
        this$0.dateSelect = selection;
        this$0.onSelectOkDate(context, activity);
        this$0.clearChips(binding);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialogClassStarted(Context context) {
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        setDialog(companion.showInformationDialogValidationExam((Activity) context, EnumDialogType.CLASS_IN_PROGRESS, false, true, new r2(this, 4), null));
        getDialog().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialogClassStarted$lambda$29(HomeViewModel this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getDialog().dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit showDialogLogOut$lambda$13(Ref.ObjectRef date, String datetime) {
        Intrinsics.checkNotNullParameter(date, "$date");
        Intrinsics.checkNotNullParameter(datetime, "datetime");
        date.element = datetime;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDialogLogOut$lambda$14(HomeViewModel this$0, Activity activity, FragmentHomeBinding binding, Menu item) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(item, "$item");
        this$0.onClickLogOut(activity, binding, item);
        return Unit.INSTANCE;
    }

    private final boolean timerServiceIsRunning(Context context, Class<? extends Service> serviceClass) {
        List<ActivityManager.RunningServiceInfo> runningServices = null;
        try {
            Object systemService = context.getSystemService("activity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            runningServices = ((ActivityManager) systemService).getRunningServices(IntCompanionObject.MAX_VALUE);
            Intrinsics.checkNotNullExpressionValue(runningServices, "getRunningServices(...)");
        } catch (Exception unused) {
        }
        if (runningServices != null && runningServices.isEmpty()) {
            return false;
        }
        Iterator it = runningServices.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), serviceClass.getName())) {
                return true;
            }
        }
        return false;
    }

    private final void updateDateClass(String date, TextView tvSubtitle) {
        tvSubtitle.setText(UtilString.INSTANCE.replaceTextInParentheses(tvSubtitle.getText().toString(), !StringsKt.isBlank(date) ? DateUtil.INSTANCE.dayMonthByMonth(date) : BuildConfig.FLAVOR));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTodayButtonVisibility(MaterialButton buttonTodayClass, RecyclerView recyclerView, int todayItemPosition) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (todayItemPosition == -1 || findFirstVisibleItemPosition > todayItemPosition || todayItemPosition > findLastVisibleItemPosition) {
            return;
        }
        buttonTodayClass.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateAllowNavigate$lambda$26(Date date, Date date2, HomeViewModel this$0, SessionDto session, ConfigurationSessionDto configSession, Activity activity, boolean z, boolean z2, NavController navController, ClassDateRecyclerAdapter classRecyclerAdapter, String datetime) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(session, "$session");
        Intrinsics.checkNotNullParameter(configSession, "$configSession");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        Intrinsics.checkNotNullParameter(classRecyclerAdapter, "$classRecyclerAdapter");
        Intrinsics.checkNotNullParameter(datetime, "datetime");
        Date parse = null;
        try {
            parse = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).parse(datetime);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        if (date != null && parse != null && date2 != null) {
            BuildersKt.launch(ViewModelKt.getViewModelScope(this$0), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new HomeViewModel$validateAllowNavigate$1$1(session, configSession, date, date2, activity, parse, z, z2, this$0, navController, classRecyclerAdapter, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void validateConnection$lambda$12(Activity activity, Ref.ObjectRef alertDialog, Function0 function, View view) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(alertDialog, "$alertDialog");
        Intrinsics.checkNotNullParameter(function, "$function");
        if (NetworkUtil.INSTANCE.isNetworkAvailable(activity) && ((Dialog) alertDialog.element).isShowing()) {
            ((Dialog) alertDialog.element).dismiss();
            function.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void validateEnableStart(boolean isValidateSession, SessionResponseDto result, String sessionId, NavController navController, ClassDateRecyclerAdapter classRecyclerAdapter, Activity activity) {
        SessionResponse sessionResponse;
        SessionDto sessionDtoBySessionResponse;
        if (isValidateSession) {
            List<SessionInstructorObjectResponse> sessionInstructorObjectResponse = result.getSessionInstructorObjectResponse();
            if (sessionInstructorObjectResponse != null) {
                Iterator it = sessionInstructorObjectResponse.iterator();
                sessionResponse = null;
                while (it.hasNext()) {
                    List<SessionResponse> sessions = ((SessionInstructorObjectResponse) it.next()).getSessions();
                    if (sessions != null) {
                        for (SessionResponse sessionResponse2 : sessions) {
                            if (Intrinsics.areEqual(sessionResponse2.getId(), sessionId)) {
                                sessionResponse = sessionResponse2;
                            }
                        }
                    }
                }
            } else {
                sessionResponse = null;
            }
            EnumTypeConfiguration type = ConfigurationSessionTypeConverter.INSTANCE.getType(sessionResponse != null ? sessionResponse.getType() : null);
            int configMinAfter = getConfigMinAfter(type, result);
            int configMinBefore = getConfigMinBefore(type, result);
            if (sessionResponse == null || (sessionDtoBySessionResponse = SessionDataConverter.INSTANCE.getSessionDtoBySessionResponse(sessionResponse, configMinAfter, configMinBefore)) == null) {
                return;
            }
            validateEnableStart(navController, sessionDtoBySessionResponse, classRecyclerAdapter, activity);
        }
    }

    public final void buildChips(Context context, FragmentHomeBinding binding) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        setChipAll(buildChipAll(context, binding));
        binding.chipGroup.addView(getChipAll());
        for (EnumClassType enumClassType : EnumClassType.values()) {
            addChipToGroup(EnumClassType.nameShow$default(enumClassType, null, 1, null), EnumClassType.id$default(enumClassType, null, 1, null), context, binding);
        }
    }

    public final Chip getChipAll() {
        Chip chip = this.chipAll;
        if (chip != null) {
            return chip;
        }
        Intrinsics.throwUninitializedPropertyAccessException("chipAll");
        return null;
    }

    public final Date getDateSelect() {
        return this.dateSelect;
    }

    public final Dialog getDialog() {
        Dialog dialog = this.dialog;
        if (dialog != null) {
            return dialog;
        }
        Intrinsics.throwUninitializedPropertyAccessException("dialog");
        return null;
    }

    public final ErrorResponse getErrorEndpoint(String message, String code) {
        return new ErrorResponse(null, new ErrorResult(false, message, code), null, 5, null);
    }

    public final LiveData<Menu> getMenuLiveData() {
        return this.menuLiveData;
    }

    public final SharedFlow<Status> getMessage() {
        return this.message;
    }

    public final Object getSessionConfigList(Continuation continuation) {
        Object configurationSession = getConfigurationSession(new o1(new Ref.ObjectRef(), this, 4), continuation);
        return configurationSession == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? configurationSession : Unit.INSTANCE;
    }

    public final void getSessionFromApiAndSave(Context context, Activity activity, SessionInstructorRequest sessionInstructorRequest, String sessionId, boolean isValidateSession, ClassDateRecyclerAdapter classRecyclerAdapter, NavController navController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(sessionInstructorRequest, "sessionInstructorRequest");
        try {
            BuildersKt.launch(ViewModelKt.getViewModelScope(this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new HomeViewModel$getSessionFromApiAndSave$1(this, context, sessionInstructorRequest, isValidateSession, sessionId, navController, classRecyclerAdapter, activity, null));
        } catch (Exception e) {
            LogSendUtil.INSTANCE.setLog(context, q.i("getSessionFromApiAndSave exception: ", e.getMessage()), "getSessionFromApiAndSave", true);
        }
    }

    public final void getSessionRequest(Context context, Function1<? super SessionInstructorRequest, Unit> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ExternalUtil.INSTANCE.getDateTime(context, EnumTimeClass.GET_DATE_TIME, new e4(4, callback));
    }

    public final SwipeRefreshLayout getSwrHome() {
        SwipeRefreshLayout swipeRefreshLayout = this.swrHome;
        if (swipeRefreshLayout != null) {
            return swipeRefreshLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("swrHome");
        return null;
    }

    public final void initSessionSyncPending(Context context, FragmentHomeBinding binding, Menu item, boolean toast) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new HomeViewModel$initSessionSyncPending$1(this, context, item, binding, toast, null));
    }

    /* renamed from: isSwipeRefresh, reason: from getter */
    public final boolean getIsSwipeRefresh() {
        return this.isSwipeRefresh;
    }

    public final void navigateTo(Context context, NavController navController, String sessionId, EnumClassType sessionType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        NavigationUtil.Companion companion = NavigationUtil.INSTANCE;
        Intrinsics.checkNotNullParameter(sessionId, "sessionID");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        companion.navigateToDifferentFragment(context, navController, new g6(sessionId, sessionType));
    }

    public final void onClickActionFilter(FragmentHomeBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        ChipGroup chipGroup = binding.chipGroup;
        Intrinsics.checkNotNullExpressionValue(chipGroup, "chipGroup");
        if (chipGroup.getVisibility() == 0) {
            binding.chipGroup.setVisibility(8);
        } else {
            binding.chipGroup.setVisibility(0);
        }
    }

    public final void onSwipeRefresh(Activity activity, FragmentHomeBinding binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.dateSelect = null;
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new HomeViewModel$onSwipeRefresh$1(this, activity, binding, null));
        getSwrHome().setRefreshing(false);
        ChipGroup chipGroup = binding.chipGroup;
        Intrinsics.checkNotNullExpressionValue(chipGroup, "chipGroup");
        if (chipGroup.getVisibility() == 0) {
            clearChips(binding);
            binding.chipGroup.setVisibility(8);
        }
    }

    public final void saveSessionAndGetFromDB(SessionResponseDto sessionInstructorObjectResponseList) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), EmptyCoroutineContext.INSTANCE, CoroutineStart.DEFAULT, new HomeViewModel$saveSessionAndGetFromDB$1(this, sessionInstructorObjectResponseList, null));
    }

    public final void setChipAll(Chip chip) {
        Intrinsics.checkNotNullParameter(chip, "<set-?>");
        this.chipAll = chip;
    }

    public final void setDialog(Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "<set-?>");
        this.dialog = dialog;
    }

    public final void setMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this._menuLiveData.setValue(menu);
    }

    public final void setSwipeRefresh(boolean z) {
        this.isSwipeRefresh = z;
    }

    public final void setSwrHome(SwipeRefreshLayout swipeRefreshLayout) {
        Intrinsics.checkNotNullParameter(swipeRefreshLayout, "<set-?>");
        this.swrHome = swipeRefreshLayout;
    }

    public final void set_action(int i) {
        this._action = i;
    }

    public final void showCalendar(Context context, Activity activity, FragmentManager fragmentManager, FragmentHomeBinding binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(binding, "binding");
        binding.chipGroup.setVisibility(8);
        UtilDatePicker.INSTANCE.showCalendar(context, fragmentManager, new h0(this, context, activity, binding));
    }

    public final void showDialogLogOut(Activity activity, FragmentHomeBinding binding, Menu item) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(item, "item");
        ExternalUtil.INSTANCE.getDateTime(activity, EnumTimeClass.GET_DATE_TIME, new c0(new Ref.ObjectRef(), 7));
        DialogNormalUtil.Companion.showDialog$app_release$default(DialogNormalUtil.INSTANCE, activity, EnumDialogType.LOGOUT, new g1(this, activity, binding, item, 2), null, 8, null);
    }

    public final void updateClassDateList(MaterialButton buttonTodayClass, RecyclerView recyclerView, List<ClassDate> newClassDateList, ClassDateRecyclerAdapter classDateRecyclerAdapter, TextView tvSubtitle, Activity activity) {
        Intrinsics.checkNotNullParameter(buttonTodayClass, "buttonTodayClass");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(newClassDateList, "newClassDateList");
        Intrinsics.checkNotNullParameter(classDateRecyclerAdapter, "classDateRecyclerAdapter");
        Intrinsics.checkNotNullParameter(tvSubtitle, "tvSubtitle");
        Intrinsics.checkNotNullParameter(activity, "activity");
        recyclerView.setAdapter(classDateRecyclerAdapter);
        classDateRecyclerAdapter.updateData(newClassDateList);
        int findTodayItemPosition = findTodayItemPosition(newClassDateList);
        recyclerView.clearOnScrollListeners();
        updateTodayButtonVisibility(buttonTodayClass, recyclerView, findTodayItemPosition);
        setupOnScrollListener(buttonTodayClass, recyclerView, classDateRecyclerAdapter, tvSubtitle, findTodayItemPosition);
        DialogUtil.INSTANCE.showDialogProgressGlobal(activity, false, false, true);
    }

    public final void validateAllowNavigate(final NavController navController, final SessionDto session, final ClassDateRecyclerAdapter classRecyclerAdapter, final Activity activity) {
        String end;
        String start;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(classRecyclerAdapter, "classRecyclerAdapter");
        Intrinsics.checkNotNullParameter(activity, "activity");
        final ConfigurationSessionDto sessionConfig = getSessionConfig(ConfigurationSessionTypeConverter.INSTANCE.getType(EnumClassType.INSTANCE.getEnumByName(session.getType())));
        String date = session.getDate();
        Date date2 = null;
        Date dateFromString = (date == null || (start = session.getStart()) == null) ? null : DateUtil.INSTANCE.getDateFromString(date, start);
        String date3 = session.getDate();
        if (date3 != null && (end = session.getEnd()) != null) {
            date2 = DateUtil.INSTANCE.getDateFromString(date3, end);
        }
        final Date date4 = date2;
        String sessionIdByTimeService = PreferenceUtil.INSTANCE.getSessionIdByTimeService(activity);
        final boolean timerServiceIsRunning = timerServiceIsRunning(activity, TimerService.class);
        final boolean areEqual = Intrinsics.areEqual(session.getId(), sessionIdByTimeService);
        final Date date5 = dateFromString;
        ExternalUtil.INSTANCE.getDateTime(activity, EnumTimeClass.GET_DATE_TIME, new Function1() { // from class: co.ceduladigital.sdk.l6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit validateAllowNavigate$lambda$26;
                HomeViewModel homeViewModel = HomeViewModel.this;
                SessionDto sessionDto = session;
                boolean z = areEqual;
                NavController navController2 = navController;
                validateAllowNavigate$lambda$26 = HomeViewModel.validateAllowNavigate$lambda$26(date5, date4, homeViewModel, sessionDto, sessionConfig, activity, timerServiceIsRunning, z, navController2, classRecyclerAdapter, (String) obj);
                return validateAllowNavigate$lambda$26;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [T, android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, android.app.Dialog] */
    public final void validateConnection(Activity activity, Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(function, "function");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new Dialog(activity);
        if (NetworkUtil.INSTANCE.isNetworkAvailable(activity)) {
            function.invoke();
        } else {
            objectRef.element = DialogNormalUtil.INSTANCE.showDialog$app_release(activity, (Dialog) objectRef.element, EnumDialogType.NETWORK_ACCESS_ERROR, activity.getResources().getString(R.string.title_network_error_access), activity.getResources().getString(R.string.txt_network_error_access), new k6(activity, objectRef, function, 0));
        }
    }

    public final void validateNetwork(Activity context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (NetworkUtil.INSTANCE.isNetworkAvailable(context)) {
            return;
        }
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        String string = context.getString(R.string.detail_toast_alert_network_fail);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        companion.showToastAlert(context, string, 1800);
    }

    private final void validateEnableStart(NavController navController, SessionDto session, ClassDateRecyclerAdapter classRecyclerAdapter, Activity activity) {
        if (Intrinsics.areEqual(session.getEnabledToStart(), Boolean.TRUE) && navController != null && classRecyclerAdapter != null) {
            validateAllowNavigate(navController, session, classRecyclerAdapter, activity);
        } else {
            DialogUtil.Companion.showErrorDialog$default(DialogUtil.INSTANCE, activity, EnumDialogType.DIALOG_ERROR_MESSAGE_BIOMETRIC, session.getMessageEnable(), null, null, false, null, 24, null).show();
        }
    }
}
