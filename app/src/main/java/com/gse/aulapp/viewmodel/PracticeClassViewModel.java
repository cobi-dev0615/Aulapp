package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import co.ceduladigital.sdk.d1;
import co.ceduladigital.sdk.j0;
import co.ceduladigital.sdk.k1;
import co.ceduladigital.sdk.m1;
import co.ceduladigital.sdk.q7;
import co.ceduladigital.sdk.r2;
import co.ceduladigital.sdk.r7;
import co.ceduladigital.sdk.s7;
import com.google.gson.Gson;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.FragmentPracticeClassBinding;
import com.gse.aulapp.databinding.LayoutClassProgressTextBinding;
import com.gse.aulapp.model.converter.SessionDataConverter;
import com.gse.aulapp.model.data.entity.SessionEntity;
import com.gse.aulapp.model.data.entity.VehicleEntity;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumTypeConfiguration;
import com.gse.aulapp.model.repository.GpsRepository;
import com.gse.aulapp.model.repository.PracticeClassRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.repository.StepProcessSessionRepository;
import com.gse.aulapp.service.TimerService;
import com.gse.aulapp.util.ConfigurationUtil;
import com.gse.aulapp.util.ControllerEntryOrExamUtil;
import com.gse.aulapp.util.ControllerFinishClassOrExamUtil;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.GpsUtil;
import com.gse.aulapp.util.NavigationUtil;
import com.gse.aulapp.util.Parameters;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.QRUtil;
import com.gse.aulapp.util.SingleLiveEvent;
import com.gse.aulapp.util.ValidateHoursUtil;
import com.gse.aulapp.viewmodel.PracticeClassViewModel;
import com.karumi.dexter.BuildConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b!\u0010\u001dJ%\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\"2\u000e\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020$0#¢\u0006\u0004\b'\u0010(J!\u0010)\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\"2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u0016¢\u0006\u0004\b0\u00101J)\u00106\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\"2\u0006\u00103\u001a\u0002022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b4\u00105J-\u00109\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\"2\u0006\u00103\u001a\u0002022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J-\u0010;\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\"2\u0006\u00103\u001a\u0002022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00108\u001a\u000207¢\u0006\u0004\b;\u0010:J7\u0010<\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u00103\u001a\u0002022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b<\u0010=J/\u0010@\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\"2\u0006\u0010?\u001a\u00020>2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00103\u001a\u000202¢\u0006\u0004\b@\u0010AJ9\u0010B\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\bB\u0010CJ)\u0010F\u001a\u00020\f2\b\u0010E\u001a\u0004\u0018\u00010D2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\bF\u0010GJ'\u0010L\u001a\u00020\f2\u0006\u0010I\u001a\u00020H2\u0006\u0010J\u001a\u00020>2\u0006\u0010K\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010MJ1\u0010P\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\"2\u0006\u0010N\u001a\u00020>2\u0006\u0010O\u001a\u00020>2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bP\u0010QJ\u0010\u0010R\u001a\u00020\u0018H\u0082@¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010X\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bX\u0010\u000eJ\u0019\u0010Y\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010[\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b[\u0010ZJ\u0017\u0010\\\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\"H\u0002¢\u0006\u0004\b\\\u0010ZJ'\u0010]\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\"2\u0006\u00103\u001a\u0002022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b]\u00105J\u001f\u0010_\u001a\u00020\f2\u0006\u0010^\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b_\u0010`J\u0019\u0010a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\ba\u0010bJ\u0019\u0010c\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bc\u0010bJ\u0017\u0010f\u001a\u00020\n2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bf\u0010gJ)\u0010h\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\"2\u0006\u00103\u001a\u0002022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bh\u00105J;\u0010i\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\"2\u0006\u0010/\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\bi\u0010CJ'\u0010m\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\"2\u0006\u0010j\u001a\u0002022\u0006\u0010l\u001a\u00020kH\u0002¢\u0006\u0004\bm\u0010nJ'\u0010o\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\bo\u0010pR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010qR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010sR$\u0010u\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u0016\u0010{\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010~\u001a\u00020}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001f\u0010\u0084\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R$\u0010\u0086\u0001\u001a\n\u0012\u0005\u0012\u00030\u0083\u00010\u0082\u00018\u0006¢\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0085\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R0\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\n0\u0089\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R1\u0010\u0091\u0001\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u0089\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0091\u0001\u0010\u008b\u0001\u001a\u0006\b\u0092\u0001\u0010\u008d\u0001\"\u0006\b\u0093\u0001\u0010\u008f\u0001R0\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020&0\u0094\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u001a\u0006\b\u0095\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R0\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020&0\u0094\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u0096\u0001\u001a\u0006\b\u009a\u0001\u0010\u0097\u0001\"\u0006\b\u009b\u0001\u0010\u0099\u0001R0\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u00020&0\u0094\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u0096\u0001\u001a\u0006\b\u009c\u0001\u0010\u0097\u0001\"\u0006\b\u009d\u0001\u0010\u0099\u0001R,\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R \u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\n0¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R)\u0010¨\u0001\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R \u0010®\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00180¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010§\u0001R%\u0010¯\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00180¥\u00018\u0006¢\u0006\u0010\n\u0006\b¯\u0001\u0010§\u0001\u001a\u0006\b°\u0001\u0010±\u0001¨\u0006²\u0001"}, d2 = {"Lcom/gse/aulapp/viewmodel/PracticeClassViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/gse/aulapp/model/repository/PracticeClassRepository;", "practiceClassRepository", "Lcom/gse/aulapp/model/repository/SessionRepository;", "sessionRepository", "Lcom/gse/aulapp/model/repository/GpsRepository;", "gpsRepository", "<init>", "(Lcom/gse/aulapp/model/repository/PracticeClassRepository;Lcom/gse/aulapp/model/repository/SessionRepository;Lcom/gse/aulapp/model/repository/GpsRepository;)V", BuildConfig.FLAVOR, "sessionID", BuildConfig.FLAVOR, "getSessionById", "(Ljava/lang/String;)V", "Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;", "sessionFull", "Lcom/gse/aulapp/databinding/FragmentPracticeClassBinding;", "binding", "timeSession", "setDataSession", "(Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;Lcom/gse/aulapp/databinding/FragmentPracticeClassBinding;Ljava/lang/String;)V", "Landroid/app/Activity;", "context", "Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;", "configurationSessionDto", "starTimerClass", "(Landroid/app/Activity;Lcom/gse/aulapp/databinding/FragmentPracticeClassBinding;Ljava/lang/String;Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;)V", "validateSliderExtra", "(Lcom/gse/aulapp/databinding/FragmentPracticeClassBinding;Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;)V", "timeCurrent", "initSliderExtra", "(Ljava/lang/String;Lcom/gse/aulapp/databinding/FragmentPracticeClassBinding;Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;)V", "reloadSlider", "Landroid/content/Context;", "Ljava/lang/Class;", "Landroid/app/Service;", "serviceClass", BuildConfig.FLAVOR, "timerServiceIsRunning", "(Landroid/content/Context;Ljava/lang/Class;)Z", "dialogMaxTimeClass", "(Landroid/content/Context;Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;)V", "getConfigSessionDto", "()V", "showQR", "(Lcom/gse/aulapp/databinding/FragmentPracticeClassBinding;Landroid/content/Context;Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;)V", "activity", "startGpsTrace", "(Landroid/app/Activity;)V", "Landroidx/navigation/NavController;", "findNavController", "dialogCloseBeforeTime$app_release", "(Landroid/content/Context;Landroidx/navigation/NavController;Ljava/lang/String;)V", "dialogCloseBeforeTime", "Lcom/gse/aulapp/model/enumerate/EnumClassType;", "sessionType", "backPracticeClass", "(Landroid/content/Context;Landroidx/navigation/NavController;Ljava/lang/String;Lcom/gse/aulapp/model/enumerate/EnumClassType;)V", "finishedPracticeClass", "validateFinishedClass", "(Landroid/content/Context;Ljava/lang/String;Landroidx/navigation/NavController;Ljava/lang/String;Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;)V", BuildConfig.FLAVOR, "timeMin", "dialogExtraTimeClass", "(Landroid/content/Context;ILjava/lang/String;Landroidx/navigation/NavController;)V", "validateIsMock", "(Landroid/content/Context;Landroid/app/Activity;Lcom/gse/aulapp/databinding/FragmentPracticeClassBinding;Ljava/lang/String;Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;)V", "Lcom/gse/aulapp/model/dto/SessionDto;", "session", "setDataSessionDetail", "(Lcom/gse/aulapp/model/dto/SessionDto;Lcom/gse/aulapp/databinding/FragmentPracticeClassBinding;Ljava/lang/String;)V", "Lcom/gse/aulapp/databinding/LayoutClassProgressTextBinding;", "view", "titleRes", "description", "setPracticeInfo", "(Lcom/gse/aulapp/databinding/LayoutClassProgressTextBinding;ILjava/lang/String;)V", "durationMinutes", "minutesForAlarm", "startTimerService", "(Landroid/content/Context;IILcom/gse/aulapp/model/dto/ConfigurationSessionDto;)V", "getConfigurationSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSessionIdByTimeService", "(Landroid/content/Context;Ljava/lang/String;)V", "updatePracticeInfo", "(Lcom/gse/aulapp/databinding/FragmentPracticeClassBinding;)V", "deleteGpsTraceBySessionID", "stopServices", "(Landroid/content/Context;)V", "stopGpsTrace", "stopTimerService", "cancelPracticeClass", "isPending", "updateIsPendingState", "(Ljava/lang/String;Ljava/lang/String;)V", "getDurationFormat", "(Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;)Ljava/lang/String;", "getDurationExtraFormat", BuildConfig.FLAVOR, "milliseconds", "getFormattedTimeToString", "(J)Ljava/lang/String;", "dialogMaxExtraTimeClass", "showDialogIsMock", "navController", "Landroidx/navigation/NavDirections;", "action", "navigateTo", "(Landroid/content/Context;Landroidx/navigation/NavController;Landroidx/navigation/NavDirections;)V", "selectTypeClassOrExam", "(Landroid/content/Context;Ljava/lang/String;Landroidx/navigation/NavController;)V", "Lcom/gse/aulapp/model/repository/PracticeClassRepository;", "Lcom/gse/aulapp/model/repository/SessionRepository;", "Lcom/gse/aulapp/model/repository/GpsRepository;", "Landroid/app/Dialog;", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "tag", "Ljava/lang/String;", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "sessionReceived", "Lcom/gse/aulapp/model/dto/SessionDto;", "Landroidx/lifecycle/MutableLiveData;", "Lcom/gse/aulapp/model/data/statusControl/Status;", "_message", "Landroidx/lifecycle/MutableLiveData;", "message", "getMessage", "()Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "timeElapsedInService", "Landroidx/lifecycle/LiveData;", "getTimeElapsedInService", "()Landroidx/lifecycle/LiveData;", "setTimeElapsedInService", "(Landroidx/lifecycle/LiveData;)V", BuildConfig.FLAVOR, "timeElapsedInServiceSlider", "getTimeElapsedInServiceSlider", "setTimeElapsedInServiceSlider", "Lkotlinx/coroutines/flow/StateFlow;", "isTimeForAlarm", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "setTimeForAlarm", "(Lkotlinx/coroutines/flow/StateFlow;)V", "isMinimumClassTime", "setMinimumClassTime", "isExtraTime", "setExtraTime", "Lkotlinx/coroutines/Job;", "updatePracticeInfoJob", "Lkotlinx/coroutines/Job;", "getUpdatePracticeInfoJob", "()Lkotlinx/coroutines/Job;", "setUpdatePracticeInfoJob", "(Lkotlinx/coroutines/Job;)V", "Lcom/gse/aulapp/util/SingleLiveEvent;", "timeRemaining", "Lcom/gse/aulapp/util/SingleLiveEvent;", "showIsMockDialog", "Z", "getShowIsMockDialog", "()Z", "setShowIsMockDialog", "(Z)V", "_configSession", "configSession", "getConfigSession", "()Lcom/gse/aulapp/util/SingleLiveEvent;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPracticeClassViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PracticeClassViewModel.kt\ncom/gse/aulapp/viewmodel/PracticeClassViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,931:1\n1#2:932\n1755#3,3:933\n*S KotlinDebug\n*F\n+ 1 PracticeClassViewModel.kt\ncom/gse/aulapp/viewmodel/PracticeClassViewModel\n*L\n347#1:933,3\n*E\n"})
/* loaded from: classes2.dex */
public final class PracticeClassViewModel extends ViewModel {
    final SingleLiveEvent<ConfigurationSessionDto> _configSession;
    final MutableLiveData<Status> _message;
    private final SingleLiveEvent<ConfigurationSessionDto> configSession;
    private Dialog dialog;
    final GpsRepository gpsRepository;
    private Gson gson;
    private StateFlow<Boolean> isExtraTime;
    private StateFlow<Boolean> isMinimumClassTime;
    private StateFlow<Boolean> isTimeForAlarm;
    private final MutableLiveData<Status> message;
    final PracticeClassRepository practiceClassRepository;
    SessionDto sessionReceived;
    final SessionRepository sessionRepository;
    private boolean showIsMockDialog;
    final String tag;
    private LiveData<String> timeElapsedInService;
    private LiveData<Float> timeElapsedInServiceSlider;
    private SingleLiveEvent<String> timeRemaining;
    private Job updatePracticeInfoJob;

    public PracticeClassViewModel(PracticeClassRepository practiceClassRepository, SessionRepository sessionRepository, GpsRepository gpsRepository) {
        Intrinsics.checkNotNullParameter(practiceClassRepository, "practiceClassRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(gpsRepository, "gpsRepository");
        this.practiceClassRepository = practiceClassRepository;
        this.sessionRepository = sessionRepository;
        this.gpsRepository = gpsRepository;
        this.tag = "HomeViewModel";
        this.gson = new Gson();
        MutableLiveData<Status> mutableLiveData = new MutableLiveData<>();
        this._message = mutableLiveData;
        this.message = mutableLiveData;
        TimerService.Companion companion = TimerService.INSTANCE;
        this.timeElapsedInService = companion.getTimeElapsed();
        this.timeElapsedInServiceSlider = companion.getTimeElapsedSlider();
        this.isTimeForAlarm = companion.isTimeForAlarm();
        this.isMinimumClassTime = companion.isMinimumClassTime();
        this.isExtraTime = companion.isExtraTime();
        this.timeRemaining = companion.getTimeMinimumRemaining();
        this.showIsMockDialog = true;
        SingleLiveEvent<ConfigurationSessionDto> singleLiveEvent = new SingleLiveEvent<>();
        this._configSession = singleLiveEvent;
        this.configSession = singleLiveEvent;
    }

    private final void cancelPracticeClass(Context context, NavController findNavController, String sessionID) {
        String id;
        updateIsPendingState("0", sessionID);
        saveSessionIdByTimeService(context, BuildConfig.FLAVOR);
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto != null && (id = sessionDto.getId()) != null) {
            deleteGpsTraceBySessionID(id);
        }
        stopServices(context);
        navigateTo(context, findNavController, new ActionOnlyNavDirections(R.id.action_practiceClassFragment_to_homeFragment));
    }

    private final void deleteGpsTraceBySessionID(String sessionID) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PracticeClassViewModel$deleteGpsTraceBySessionID$1(this, sessionID, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogCloseBeforeTime$lambda$12(Context context, PracticeClassViewModel this$0, String sessionID, NavController findNavController, View view) {
        String id;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        this$0.selectTypeClassOrExam((Activity) context, sessionID, findNavController);
        SessionDto sessionDto = this$0.sessionReceived;
        if (sessionDto != null && (id = sessionDto.getId()) != null) {
            this$0.deleteGpsTraceBySessionID(id);
        }
        this$0.stopServices(context);
        try {
            BuildersKt.runBlocking((CoroutineContext) null, new PracticeClassViewModel$dialogCloseBeforeTime$1$2(new StepProcessSessionRepository(GeneralApp.INSTANCE.getDatabase().StepProcessSessionDao()), sessionID, null));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Dialog dialog = this$0.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogExtraTimeClass$lambda$17(PracticeClassViewModel this$0, Context context, NavController findNavController, String sessionID, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        new Handler(Looper.getMainLooper()).post(new s7(this$0, context, findNavController, sessionID, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogExtraTimeClass$lambda$17$lambda$16(PracticeClassViewModel this$0, Context context, NavController findNavController, String sessionID) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        this$0.finishedPracticeClass(context, findNavController, sessionID, EnumClassType.PRACTICE);
        Dialog dialog = this$0.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    private final void dialogMaxExtraTimeClass(Context context, NavController findNavController, String sessionID) {
        Window window;
        if (context != null) {
            try {
                Activity activity = (Activity) context;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    try {
                        try {
                            AlertDialog showInformationDialogValidationExam = DialogUtil.INSTANCE.showInformationDialogValidationExam(activity, EnumDialogType.CLASS_TIME_EXTRA_FINISHED, false, true, new r7(this, context, findNavController, sessionID, 1), new k1(8));
                            this.dialog = showInformationDialogValidationExam;
                            if (showInformationDialogValidationExam != null && (window = showInformationDialogValidationExam.getWindow()) != null) {
                                window.clearFlags(8);
                            }
                            Dialog dialog = this.dialog;
                            if (dialog == null || dialog.isShowing()) {
                                Dialog dialog2 = this.dialog;
                                if (dialog2 != null) {
                                    dialog2.dismiss();
                                    return;
                                }
                                return;
                            }
                            Dialog dialog3 = this.dialog;
                            if (dialog3 != null) {
                                dialog3.show();
                            }
                        } catch (Exception e) {
                            e.toString();
                        }
                    } catch (Exception e2) {
                        e2.toString();
                    }
                }
            } catch (Exception e3) {
                e3.toString();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogMaxExtraTimeClass$lambda$19(PracticeClassViewModel this$0, Context context, NavController findNavController, String sessionID, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        new Handler(Looper.getMainLooper()).post(new s7(this$0, context, findNavController, sessionID, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogMaxExtraTimeClass$lambda$19$lambda$18(PracticeClassViewModel this$0, Context context, NavController findNavController, String sessionID) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        this$0.cancelPracticeClass(context, findNavController, sessionID);
        Dialog dialog = this$0.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogMaxExtraTimeClass$lambda$20(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogMaxTimeClass$lambda$8(PracticeClassViewModel this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new Handler(Looper.getMainLooper()).post(new co.ceduladigital.sdk.f(this$0, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogMaxTimeClass$lambda$8$lambda$7(PracticeClassViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getConfigurationSession(Continuation continuation) {
        return ConfigurationUtil.INSTANCE.getConfigurationSessionByType(EnumTypeConfiguration.CLASS_PRACTICAL_CONFIG, continuation);
    }

    private final String getDurationExtraFormat(ConfigurationSessionDto configurationSessionDto) {
        Integer num;
        Integer duration;
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (duration = sessionDto.getDuration()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(duration.intValue() * (configurationSessionDto != null ? configurationSessionDto.getMinuteForHour() : 60));
        }
        Intrinsics.checkNotNull(num);
        return getFormattedTimeToString(TimeUnit.MINUTES.toMillis(num.intValue() + (configurationSessionDto != null ? configurationSessionDto.getMinToleranceDepartureAfter() : 15)));
    }

    private final String getDurationFormat(ConfigurationSessionDto configurationSessionDto) {
        Integer num;
        Integer duration;
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (duration = sessionDto.getDuration()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(duration.intValue() * (configurationSessionDto != null ? configurationSessionDto.getMinuteForHour() : 60));
        }
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Intrinsics.checkNotNull(num);
        return getFormattedTimeToString(timeUnit.toMillis(num.intValue()));
    }

    private final String getFormattedTimeToString(long milliseconds) {
        long j = milliseconds / 1000;
        long j2 = 3600;
        long j3 = j / j2;
        long j4 = 60;
        long j5 = (j % j2) / j4;
        long j6 = j % j4;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final void navigateTo(Context context, NavController navController, NavDirections action) {
        NavigationUtil.INSTANCE.navigateToDifferentFragment(context, navController, action);
    }

    private final void saveSessionIdByTimeService(Context context, String sessionID) {
        PreferenceUtil.INSTANCE.saveSessionIdByTimeService(context, sessionID);
    }

    private final void selectTypeClassOrExam(Context context, String sessionID, NavController findNavController) {
        PreferenceUtil.INSTANCE.saveStartClassOrExam(context, BuildConfig.FLAVOR);
        Parameters.INSTANCE.setINITIAL_TIME(0L);
        ControllerFinishClassOrExamUtil.INSTANCE.selectTypeClassOrExam(context, sessionID, findNavController, this.sessionReceived, this.sessionRepository, new ActionOnlyNavDirections(R.id.action_practiceClassFragment_to_homeFragment));
    }

    private final void setDataSessionDetail(SessionDto session, FragmentPracticeClassBinding binding, String timeSession) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PracticeClassViewModel$setDataSessionDetail$1(session, timeSession, binding, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPracticeInfo(LayoutClassProgressTextBinding view, int titleRes, String description) {
        view.classProgressTitle.setText(view.getRoot().getContext().getString(titleRes));
        view.classProgressDescription.setText(description);
    }

    private final void showDialogIsMock(Context context, Activity activity, FragmentPracticeClassBinding binding, String sessionID, ConfigurationSessionDto configurationSessionDto) {
        if (this.showIsMockDialog) {
            DialogNormalUtil.Companion.showDialog$app_release$default(DialogNormalUtil.INSTANCE, context, EnumDialogType.DIALOG_FAKE_GPS, new d1(this, activity, binding, sessionID, configurationSessionDto), null, 8, null);
            this.showIsMockDialog = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDialogIsMock$lambda$22(PracticeClassViewModel this$0, Activity activity, FragmentPracticeClassBinding binding, String str, ConfigurationSessionDto configurationSessionDto) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        this$0.startGpsTrace(activity);
        this$0.starTimerClass(activity, binding, str, configurationSessionDto);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit starTimerClass$lambda$3(Integer num, FragmentPracticeClassBinding binding, PracticeClassViewModel this$0, Activity context, String str, int i, ConfigurationSessionDto configurationSessionDto) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        starTimerClass$startTimerService(num, binding, this$0, context, str, i, configurationSessionDto);
        return Unit.INSTANCE;
    }

    private static final void starTimerClass$startTimerService(Integer num, FragmentPracticeClassBinding fragmentPracticeClassBinding, PracticeClassViewModel practiceClassViewModel, Activity activity, String str, int i, ConfigurationSessionDto configurationSessionDto) {
        if (num != null) {
            fragmentPracticeClassBinding.includeChronometer.sliderTimer.setValueTo(num.intValue());
            Intrinsics.checkNotNull(str);
            practiceClassViewModel.saveSessionIdByTimeService(activity, str);
            practiceClassViewModel.startTimerService(activity, num.intValue(), i, configurationSessionDto);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startGpsTrace$lambda$10(PracticeClassViewModel this$0, Activity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        SessionDto sessionDto = this$0.sessionReceived;
        if (sessionDto != null) {
            GpsUtil.INSTANCE.validatePermissionsAndStart(activity, 2500L, sessionDto.getId());
        }
        return Unit.INSTANCE;
    }

    private final void startTimerService(Context context, int durationMinutes, int minutesForAlarm, ConfigurationSessionDto configurationSessionDto) {
        int minToleranceDepartureAfter = configurationSessionDto != null ? configurationSessionDto.getMinToleranceDepartureAfter() : 15;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        ValidateHoursUtil.INSTANCE.getElapsedTime(context, new m1(this, context, timeUnit.toMillis(durationMinutes), timeUnit.toMillis(minToleranceDepartureAfter), minutesForAlarm, configurationSessionDto, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startTimerService$lambda$6(PracticeClassViewModel this$0, Context context, long j, long j2, int i, ConfigurationSessionDto configurationSessionDto, long j3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        boolean timerServiceIsRunning = this$0.timerServiceIsRunning(context, TimerService.class);
        Intent intent = new Intent(context, (Class<?>) TimerService.class);
        intent.putExtra("durationMillis", j);
        intent.putExtra("retake_elapsed_time", j3);
        intent.putExtra("IS_RETAKE", !timerServiceIsRunning);
        intent.putExtra("durationMillisExtra", j2);
        intent.putExtra("minutesForAlarm", i);
        intent.putExtra("min_tolerance_entry_before", configurationSessionDto != null ? Integer.valueOf(configurationSessionDto.getMinToleranceEntryBefore()) : null);
        intent.putExtra("min_tolerance_entry_after", configurationSessionDto != null ? Integer.valueOf(configurationSessionDto.getMinToleranceEntryAfter()) : null);
        intent.putExtra("min_tolerance_departure_after", configurationSessionDto != null ? Integer.valueOf(configurationSessionDto.getMinToleranceDepartureAfter()) : null);
        intent.putExtra("duration_for_hour", configurationSessionDto != null ? Integer.valueOf(configurationSessionDto.getDurationForHour()) : null);
        intent.putExtra("duration_for_hour_show", configurationSessionDto != null ? Integer.valueOf(configurationSessionDto.getDurationForHourShow()) : null);
        intent.putExtra("alert_end_session", configurationSessionDto != null ? Integer.valueOf(configurationSessionDto.getAlertEndSession()) : null);
        intent.putExtra("alert_departure_after", configurationSessionDto != null ? Integer.valueOf(configurationSessionDto.getAlertDepartureAfter()) : null);
        intent.putExtra("minutes_for_hour", configurationSessionDto != null ? Integer.valueOf(configurationSessionDto.getMinuteForHour()) : null);
        context.startService(intent);
        return Unit.INSTANCE;
    }

    private final void stopGpsTrace(Context context) {
        GpsUtil.Companion companion = GpsUtil.INSTANCE;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        companion.stopGps((Activity) context);
    }

    private final void stopServices(Context context) {
        if (context != null) {
            saveSessionIdByTimeService(context, BuildConfig.FLAVOR);
        }
        Intrinsics.checkNotNull(context);
        stopTimerService(context);
        stopGpsTrace(context);
    }

    private final void stopTimerService(Context context) {
        context.stopService(new Intent(context, (Class<?>) TimerService.class));
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(2);
    }

    private final void updateIsPendingState(String isPending, String sessionID) {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PracticeClassViewModel$updateIsPendingState$1(this, isPending, sessionID, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePracticeInfo(FragmentPracticeClassBinding binding) {
        Job launch$default;
        Job job = this.updatePracticeInfoJob;
        if (job != null) {
            job.cancel(null);
        }
        launch$default = BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PracticeClassViewModel$updatePracticeInfo$1(this, binding, null));
        this.updatePracticeInfoJob = launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateIsMock$lambda$21(PracticeClassViewModel this$0, Context context, Activity activity, FragmentPracticeClassBinding binding, String str, ConfigurationSessionDto configurationSessionDto, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(binding, "$binding");
        if (z) {
            this$0.showDialogIsMock(context, activity, binding, str, configurationSessionDto);
            this$0.stopServices(activity);
        } else {
            this$0.showIsMockDialog = true;
        }
        return Unit.INSTANCE;
    }

    public final void backPracticeClass(Context context, NavController findNavController, String sessionID, EnumClassType sessionType) {
        String id;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        updateIsPendingState("0", sessionID);
        saveSessionIdByTimeService(context, BuildConfig.FLAVOR);
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto != null && (id = sessionDto.getId()) != null) {
            deleteGpsTraceBySessionID(id);
        }
        stopServices(context);
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        navigateTo(context, findNavController, new q7(sessionID, sessionType));
    }

    public final void dialogCloseBeforeTime$app_release(Context context, NavController findNavController, String sessionID) {
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        if (context != null) {
            try {
                Activity activity = (Activity) context;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    CharSequence text = ((Activity) context).getText(R.string.dialog_fullscreen_close_class_before_time);
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    try {
                        try {
                            AlertDialog showInformationDialog = DialogUtil.INSTANCE.showInformationDialog(activity, text.toString().replace("[HH:MM:SS]", String.valueOf(this.timeRemaining.getValue())), ((Activity) context).getString(R.string.dialog_fullscreen_close_before_time_title), ((Activity) context).getString(R.string.btn_finish), 8, true, new r7(context, this, sessionID, findNavController, 0), null);
                            this.dialog = showInformationDialog;
                            if (showInformationDialog == null || showInformationDialog.isShowing()) {
                                Dialog dialog = this.dialog;
                                if (dialog != null) {
                                    dialog.dismiss();
                                    return;
                                }
                                return;
                            }
                            Dialog dialog2 = this.dialog;
                            if (dialog2 != null) {
                                dialog2.show();
                            }
                        } catch (Exception e) {
                            e.toString();
                        }
                    } catch (Exception e2) {
                        e2.toString();
                    }
                }
            } catch (Exception e3) {
                e3.toString();
            }
        }
    }

    public final void dialogExtraTimeClass(Context context, int timeMin, String sessionID, NavController findNavController) {
        Window window;
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        if (context != null) {
            try {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                CharSequence text = ((Activity) context).getText(R.string.dialog_fullscreen_class_time_finished_text);
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                AlertDialog showInformationDialog = DialogUtil.INSTANCE.showInformationDialog(activity, text.toString().replace("[TIME]", String.valueOf(timeMin)), ((Activity) context).getString(R.string.dialog_fullscreen_class_time_finished_title), ((Activity) context).getString(R.string.dialog_fullscreen_class_time_finished_title_button), 8, true, new r7(this, context, findNavController, sessionID, 2), null);
                this.dialog = showInformationDialog;
                if (showInformationDialog != null && (window = showInformationDialog.getWindow()) != null) {
                    window.clearFlags(8);
                }
                Dialog dialog = this.dialog;
                if (dialog == null || dialog.isShowing()) {
                    Dialog dialog2 = this.dialog;
                    if (dialog2 != null) {
                        dialog2.dismiss();
                        return;
                    }
                    return;
                }
                Dialog dialog3 = this.dialog;
                if (dialog3 != null) {
                    dialog3.show();
                }
            } catch (Exception e) {
                e.toString();
            }
        }
    }

    public final void dialogMaxTimeClass(Context context, ConfigurationSessionDto configurationSessionDto) {
        Window window;
        if (context != null) {
            try {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                AlertDialog showInformationDialog = DialogUtil.INSTANCE.showInformationDialog((Activity) context, String.valueOf(((Activity) context).getText(R.string.dialog_fullscreen_max_wait_time_class)).replace("[TIME]", String.valueOf(configurationSessionDto != null ? configurationSessionDto.getAlertEndSession() : 10)), ((Activity) context).getString(R.string.dialog_fullscreen_max_wait_time_title), ((Activity) context).getString(R.string.id_continue), 8, false, new r2(this, 11), null);
                this.dialog = showInformationDialog;
                if (showInformationDialog != null && (window = showInformationDialog.getWindow()) != null) {
                    window.clearFlags(8);
                }
                Dialog dialog = this.dialog;
                if (dialog == null || dialog.isShowing()) {
                    Dialog dialog2 = this.dialog;
                    if (dialog2 != null) {
                        dialog2.dismiss();
                        return;
                    }
                    return;
                }
                Dialog dialog3 = this.dialog;
                if (dialog3 != null) {
                    dialog3.show();
                }
            } catch (Exception e) {
                e.toString();
            }
        }
    }

    public final void finishedPracticeClass(Context context, NavController findNavController, String sessionID, EnumClassType sessionType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        stopServices(context);
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        navigateTo(context, findNavController, new q7(sessionID, sessionType));
    }

    public final SingleLiveEvent<ConfigurationSessionDto> getConfigSession() {
        return this.configSession;
    }

    public final void getConfigSessionDto() {
        BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PracticeClassViewModel$getConfigSessionDto$1(this, null));
    }

    public final Dialog getDialog() {
        return this.dialog;
    }

    public final MutableLiveData<Status> getMessage() {
        return this.message;
    }

    public final void getSessionById(String sessionID) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        try {
            BuildersKt.launch(ViewModelKt.getViewModelScope(this), (CoroutineContext) null, (CoroutineStart) null, new PracticeClassViewModel$getSessionById$1(this, sessionID, null));
        } catch (Exception e) {
            this._message.postValue(new Status.Failure(new Exception(e.getMessage())));
        }
    }

    public final LiveData<String> getTimeElapsedInService() {
        return this.timeElapsedInService;
    }

    public final LiveData<Float> getTimeElapsedInServiceSlider() {
        return this.timeElapsedInServiceSlider;
    }

    public final void initSliderExtra(String timeCurrent, FragmentPracticeClassBinding binding, ConfigurationSessionDto configurationSessionDto) {
        Integer num;
        Integer duration;
        Intrinsics.checkNotNullParameter(timeCurrent, "timeCurrent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (duration = sessionDto.getDuration()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(duration.intValue() * (configurationSessionDto != null ? configurationSessionDto.getMinuteForHour() : 60));
        }
        Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        if (Intrinsics.areEqual(timeCurrent, getDurationFormat(configurationSessionDto)) || binding.includeChronometer.sliderTimer.getValueTo() == 1.0f) {
            binding.includeChronometer.sliderTimer.setValueTo(intValue);
        }
    }

    public final StateFlow<Boolean> isExtraTime() {
        return this.isExtraTime;
    }

    public final StateFlow<Boolean> isMinimumClassTime() {
        return this.isMinimumClassTime;
    }

    public final StateFlow<Boolean> isTimeForAlarm() {
        return this.isTimeForAlarm;
    }

    public final void reloadSlider(FragmentPracticeClassBinding binding, ConfigurationSessionDto configurationSessionDto) {
        Integer num;
        int intValue;
        Integer duration;
        Intrinsics.checkNotNullParameter(binding, "binding");
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (duration = sessionDto.getDuration()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(duration.intValue() * (configurationSessionDto != null ? configurationSessionDto.getMinuteForHour() : 60));
        }
        if (num != null) {
            if (this.isExtraTime.getValue().booleanValue()) {
                intValue = num.intValue() + (configurationSessionDto != null ? configurationSessionDto.getMinToleranceDepartureAfter() : 15);
            } else {
                intValue = num.intValue();
            }
            binding.includeChronometer.sliderTimer.setValueTo(intValue);
        }
    }

    public final void setDataSession(SessionFull sessionFull, FragmentPracticeClassBinding binding, String timeSession) {
        SessionEntity session;
        Intrinsics.checkNotNullParameter(sessionFull, "sessionFull");
        Intrinsics.checkNotNullParameter(binding, "binding");
        SessionEntity session2 = sessionFull.getSession();
        if ((session2 != null ? session2.getDateStartEntry() : null) == null && (session = sessionFull.getSession()) != null && timeSession != null) {
            ControllerEntryOrExamUtil.INSTANCE.saveEntryExam(timeSession, session.getId(), this.sessionRepository);
        }
        SessionDto sessionDtoFromSessionEntity = SessionDataConverter.INSTANCE.getSessionDtoFromSessionEntity(sessionFull.getSession(), sessionFull.getClassRoom(), sessionFull.getVehicle(), sessionFull.getLesson(), sessionFull.getListStepStatus());
        this.sessionReceived = sessionDtoFromSessionEntity;
        if (timeSession != null) {
            setDataSessionDetail(sessionDtoFromSessionEntity, binding, timeSession);
        }
    }

    public final void showQR(FragmentPracticeClassBinding binding, Context context, SessionFull sessionFull) {
        String str;
        String str2;
        String category;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(sessionFull, "sessionFull");
        EnumClassType.Companion companion = EnumClassType.INSTANCE;
        SessionEntity session = sessionFull.getSession();
        String nameShow$default = EnumClassType.nameShow$default(companion.getEnumByName(session != null ? session.getType() : null), null, 1, null);
        SessionEntity session2 = sessionFull.getSession();
        String str3 = "No Aplica";
        if (session2 == null || (str = session2.getApprentice()) == null) {
            str = "No Aplica";
        }
        PreferenceUtil.Companion companion2 = PreferenceUtil.INSTANCE;
        Context context2 = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        String userName = companion2.getUserName(context2);
        SessionEntity session3 = sessionFull.getSession();
        if (session3 != null && (category = session3.getCategory()) != null) {
            str3 = category;
        }
        VehicleEntity vehicle = sessionFull.getVehicle();
        CharSequence text = binding.getRoot().getContext().getText(R.string.txt_card_practice_class_apprentice);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        CharSequence text2 = binding.getRoot().getContext().getText(R.string.txt_card_practice_class_instructor);
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        CharSequence text3 = binding.getRoot().getContext().getText(R.string.txt_card_practice_class_category);
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        CharSequence text4 = binding.getRoot().getContext().getText(R.string.txt_card_practice_class_vehicle);
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        if (vehicle != null) {
            str2 = vehicle.getLine() + " (" + vehicle.getPlates() + ")";
        } else {
            str2 = "No Aplica\n";
        }
        QRUtil.Companion companion3 = QRUtil.INSTANCE;
        ImageView ivQr = binding.includeChronometer.ivQr;
        Intrinsics.checkNotNullExpressionValue(ivQr, "ivQr");
        Intrinsics.checkNotNull(context);
        companion3.generateQR(ivQr, nameShow$default + "\n" + ((Object) text) + " " + str + "\n" + ((Object) text2) + " " + userName + "\n" + ((Object) text3) + " " + str3 + "\n" + ((Object) text4) + " " + str2, ContextCompat.getColor(context, R.color.transparent), -1, 1000);
    }

    public final void starTimerClass(final Activity context, final FragmentPracticeClassBinding binding, final String sessionID, final ConfigurationSessionDto configurationSessionDto) {
        Integer num;
        Integer duration;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (duration = sessionDto.getDuration()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(duration.intValue() * (configurationSessionDto != null ? configurationSessionDto.getMinuteForHour() : 60));
        }
        final Integer num2 = num;
        final int alertEndSession = configurationSessionDto != null ? configurationSessionDto.getAlertEndSession() : 10;
        PermissionHelper.INSTANCE.validateNotificationPermissionFlow(context, new Function0() { // from class: co.ceduladigital.sdk.u7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit starTimerClass$lambda$3;
                starTimerClass$lambda$3 = PracticeClassViewModel.starTimerClass$lambda$3(num2, binding, PracticeClassViewModel.this, context, sessionID, alertEndSession, configurationSessionDto);
                return starTimerClass$lambda$3;
            }
        });
    }

    public final void startGpsTrace(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        PermissionHelper.INSTANCE.validateNotificationPermissionFlow(activity, new j0(this, activity, 5));
    }

    public final boolean timerServiceIsRunning(Context context, Class<? extends Service> serviceClass) {
        List<ActivityManager.RunningServiceInfo> runningServices = null;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serviceClass, "serviceClass");
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

    public final void validateFinishedClass(Context context, String timeCurrent, NavController findNavController, String sessionID, ConfigurationSessionDto configurationSessionDto) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeCurrent, "timeCurrent");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        if (Intrinsics.areEqual(getDurationExtraFormat(configurationSessionDto), timeCurrent)) {
            dialogMaxExtraTimeClass(context, findNavController, sessionID);
        }
        if (Intrinsics.areEqual(getDurationFormat(configurationSessionDto), timeCurrent) && this.isExtraTime.getValue().booleanValue()) {
            dialogExtraTimeClass(context, configurationSessionDto != null ? configurationSessionDto.getMinToleranceDepartureAfter() : 15, sessionID, findNavController);
        }
    }

    public final void validateIsMock(final Context context, final Activity activity, final FragmentPracticeClassBinding binding, final String sessionID, final ConfigurationSessionDto configurationSessionDto) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        GpsUtil.INSTANCE.locationEnabled(context, new Function1() { // from class: co.ceduladigital.sdk.t7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit validateIsMock$lambda$21;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                validateIsMock$lambda$21 = PracticeClassViewModel.validateIsMock$lambda$21(PracticeClassViewModel.this, context, activity, binding, sessionID, configurationSessionDto, booleanValue);
                return validateIsMock$lambda$21;
            }
        });
    }

    public final void validateSliderExtra(FragmentPracticeClassBinding binding, ConfigurationSessionDto configurationSessionDto) {
        Integer num;
        Integer duration;
        Intrinsics.checkNotNullParameter(binding, "binding");
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (duration = sessionDto.getDuration()) == null) {
            num = null;
        } else {
            num = Integer.valueOf(duration.intValue() * (configurationSessionDto != null ? configurationSessionDto.getMinuteForHour() : 60));
        }
        Intrinsics.checkNotNull(num);
        binding.includeChronometer.sliderTimer.setValueTo(num.intValue() + (configurationSessionDto != null ? configurationSessionDto.getMinToleranceDepartureAfter() : 15));
    }
}
