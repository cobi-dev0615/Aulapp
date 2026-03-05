package com.gse.aulapp.viewmodel;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import co.ceduladigital.sdk.c1;
import co.ceduladigital.sdk.d1;
import co.ceduladigital.sdk.e1;
import co.ceduladigital.sdk.f1;
import co.ceduladigital.sdk.g1;
import co.ceduladigital.sdk.h1;
import co.ceduladigital.sdk.i1;
import co.ceduladigital.sdk.j1;
import co.ceduladigital.sdk.k1;
import co.ceduladigital.sdk.l1;
import co.ceduladigital.sdk.m1;
import co.ceduladigital.sdk.q;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.R;
import com.gse.aulapp.databinding.DialogExamInfoLayoutBinding;
import com.gse.aulapp.databinding.FragmentClassInCourseBinding;
import com.gse.aulapp.model.converter.SessionDataConverter;
import com.gse.aulapp.model.data.entity.entityFull.SessionFull;
import com.gse.aulapp.model.data.statusControl.Status;
import com.gse.aulapp.model.dto.CenterDto;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.dto.QuestionDto;
import com.gse.aulapp.model.dto.SessionDto;
import com.gse.aulapp.model.dto.VehicleDto;
import com.gse.aulapp.model.enumerate.EnumClassType;
import com.gse.aulapp.model.enumerate.EnumDialogType;
import com.gse.aulapp.model.enumerate.EnumTypeConfiguration;
import com.gse.aulapp.model.repository.ClassInCourseRepository;
import com.gse.aulapp.model.repository.GpsRepository;
import com.gse.aulapp.model.repository.SessionRepository;
import com.gse.aulapp.model.repository.StepProcessSessionRepository;
import com.gse.aulapp.model.response.QuestionsResponse;
import com.gse.aulapp.service.TimerService;
import com.gse.aulapp.util.ConfigurationUtil;
import com.gse.aulapp.util.ControllerEntryOrExamUtil;
import com.gse.aulapp.util.ControllerFinishClassOrExamUtil;
import com.gse.aulapp.util.DateUtil;
import com.gse.aulapp.util.DialogNormalUtil;
import com.gse.aulapp.util.DialogUtil;
import com.gse.aulapp.util.GpsUtil;
import com.gse.aulapp.util.LogSendUtil;
import com.gse.aulapp.util.NavigationUtil;
import com.gse.aulapp.util.NetworkUtil;
import com.gse.aulapp.util.Parameters;
import com.gse.aulapp.util.PermissionHelper;
import com.gse.aulapp.util.PreferenceUtil;
import com.gse.aulapp.util.QRUtil;
import com.gse.aulapp.util.SingleLiveEvent;
import com.gse.aulapp.util.ValidateHoursUtil;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b,\u0010)J)\u0010/\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020\u00122\u0006\u00103\u001a\u0002022\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b4\u00105J!\u0010:\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b8\u00109J\u001d\u0010<\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020!¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b>\u0010?J\u0015\u0010@\u001a\u00020\u00122\u0006\u0010;\u001a\u00020!¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bB\u0010)J\u0017\u0010C\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bC\u0010)J%\u0010F\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bH\u0010IJ5\u0010M\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010J\u001a\u00020\u00102\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120K¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u000e¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\bQ\u0010RJ\u001d\u0010T\u001a\u00020\u00122\u0006\u0010S\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020\u0012¢\u0006\u0004\bV\u0010 J%\u0010W\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bW\u0010.J-\u0010X\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010S\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\bX\u0010YJ'\u0010Z\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\bZ\u0010IJ#\u0010_\u001a\b\u0012\u0004\u0012\u00020\\0^2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0[H\u0002¢\u0006\u0004\b_\u0010`J \u0010b\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\bb\u0010cJ&\u0010e\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\f2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020d0[H\u0082@¢\u0006\u0004\be\u0010fJ0\u0010g\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010a\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u000eH\u0002¢\u0006\u0004\bi\u0010PJ/\u0010m\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010j\u001a\u00020\u00192\u0006\u0010k\u001a\u00020\u00192\u0006\u0010l\u001a\u00020\"H\u0002¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\"H\u0082@¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bq\u0010rJA\u0010v\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010s\u001a\u00020\u000e2\u0006\u0010t\u001a\u00020\u00192\u0006\u0010u\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bx\u00101J\u0017\u0010y\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\by\u00101J\u0017\u0010z\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\bz\u00101J\u0019\u0010{\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b{\u0010)J)\u0010|\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b|\u0010IJ\u0017\u0010}\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b}\u00101J \u0010\u007f\u001a\u00020\u00122\u0006\u0010~\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J)\u0010\u0081\u0001\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0081\u0001\u0010.J\u0011\u0010\u0082\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0082\u0001\u0010'J\u0011\u0010\u0083\u0001\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0083\u0001\u0010'J\u001c\u0010\u0086\u0001\u001a\u00020\f2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J+\u0010\u0088\u0001\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0005\b\u0088\u0001\u0010.J!\u0010\u0089\u0001\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020!H\u0002¢\u0006\u0005\b\u0089\u0001\u0010=J)\u0010\u008a\u0001\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0005\b\u008a\u0001\u0010IR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u008b\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u008c\u0001R\u001a\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u000f\n\u0005\b\u0007\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0090\u0001\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R$\u0010\u0093\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0[0\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R)\u0010\u0096\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0[0\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001e\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0094\u0001R#\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u009b\u0001\u0010\u0097\u0001\u001a\u0006\b\u009c\u0001\u0010\u0099\u0001R\u001e\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020\\0\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0094\u0001R#\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020\\0\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u0097\u0001\u001a\u0006\b\u009f\u0001\u0010\u0099\u0001R\u001f\u0010¡\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u0094\u0001R$\u0010¢\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u0095\u00018\u0006¢\u0006\u0010\n\u0006\b¢\u0001\u0010\u0097\u0001\u001a\u0006\b£\u0001\u0010\u0099\u0001R,\u0010¥\u0001\u001a\u0005\u0018\u00010¤\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R)\u0010«\u0001\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R\u001b\u0010±\u0001\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R \u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0092\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u0094\u0001R \u0010i\u001a\t\u0012\u0004\u0012\u00020\u000e0\u0095\u00018\u0006¢\u0006\u000e\n\u0005\bi\u0010\u0097\u0001\u001a\u0005\bi\u0010\u0099\u0001R,\u0010µ\u0001\u001a\u0005\u0018\u00010´\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R0\u0010»\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u0095\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b»\u0001\u0010\u0097\u0001\u001a\u0006\b¼\u0001\u0010\u0099\u0001\"\u0006\b½\u0001\u0010¾\u0001R1\u0010À\u0001\u001a\n\u0012\u0005\u0012\u00030¿\u00010\u0095\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÀ\u0001\u0010\u0097\u0001\u001a\u0006\bÁ\u0001\u0010\u0099\u0001\"\u0006\bÂ\u0001\u0010¾\u0001R0\u0010Ä\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0Ã\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÄ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R0\u0010É\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0Ã\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Å\u0001\u001a\u0006\bÉ\u0001\u0010Æ\u0001\"\u0006\bÊ\u0001\u0010È\u0001R \u0010Ì\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190Ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R/\u0010Î\u0001\u001a\t\u0012\u0004\u0012\u00020\u00190Ã\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÎ\u0001\u0010Å\u0001\u001a\u0005\b&\u0010Æ\u0001\"\u0006\bÏ\u0001\u0010È\u0001R0\u0010Ð\u0001\u001a\t\u0012\u0004\u0012\u00020\f0\u0095\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010\u0097\u0001\u001a\u0006\bÑ\u0001\u0010\u0099\u0001\"\u0006\bÒ\u0001\u0010¾\u0001R0\u0010Ó\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0Ã\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bÓ\u0001\u0010Å\u0001\u001a\u0006\bÓ\u0001\u0010Æ\u0001\"\u0006\bÔ\u0001\u0010È\u0001R(\u0010Õ\u0001\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0005\b×\u0001\u0010P\"\u0006\bØ\u0001\u0010Ù\u0001R \u0010Û\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\"0Ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÛ\u0001\u0010Ü\u0001R%\u0010Ý\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\"0Ú\u00018\u0006¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Ü\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001¨\u0006à\u0001"}, d2 = {"Lcom/gse/aulapp/viewmodel/ClassInCourseViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/gse/aulapp/model/repository/ClassInCourseRepository;", "classInCourseRepository", "Lcom/gse/aulapp/model/repository/SessionRepository;", "sessionRepository", "Lcom/gse/aulapp/model/repository/GpsRepository;", "gpsRepository", "<init>", "(Lcom/gse/aulapp/model/repository/ClassInCourseRepository;Lcom/gse/aulapp/model/repository/SessionRepository;Lcom/gse/aulapp/model/repository/GpsRepository;)V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "sessionID", BuildConfig.FLAVOR, "startChronometer", "Landroidx/navigation/NavController;", "findNavController", BuildConfig.FLAVOR, "getSessionDataApi", "(Landroid/content/Context;Ljava/lang/String;ZLandroidx/navigation/NavController;)V", "Lcom/gse/aulapp/model/dto/Status;", "status", "setQuestionStatus", "(Lcom/gse/aulapp/model/dto/Status;)V", BuildConfig.FLAVOR, "position", "Lcom/gse/aulapp/databinding/FragmentClassInCourseBinding;", "binding", "moveToQuestion", "(ILcom/gse/aulapp/databinding/FragmentClassInCourseBinding;)V", "moveToNextQuestion", "()V", "Landroid/app/Activity;", "Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;", "sessionDto", "starTimerClass", "(Landroid/app/Activity;Lcom/gse/aulapp/databinding/FragmentClassInCourseBinding;Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;)V", "getMinimumClassMinutes", "()Ljava/lang/String;", "stopTimerService", "(Landroid/content/Context;)V", "timerServiceIsRunning", "(Landroid/content/Context;)Z", "dialogMaxTimeClass", "dialogCloseBeforeTime$app_release", "(Landroid/content/Context;Landroidx/navigation/NavController;Ljava/lang/String;)V", "dialogCloseBeforeTime", "getSessionById", "(Ljava/lang/String;)V", "Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;", "sessionFull", "setDataSession", "(Lcom/gse/aulapp/model/data/entity/entityFull/SessionFull;Lcom/gse/aulapp/databinding/FragmentClassInCourseBinding;)V", "Lcom/gse/aulapp/databinding/DialogExamInfoLayoutBinding;", "timeSession", "setDataSessionDetailToDialog$app_release", "(Lcom/gse/aulapp/databinding/DialogExamInfoLayoutBinding;Ljava/lang/String;)V", "setDataSessionDetailToDialog", "activity", "validateIsMock", "(Landroid/content/Context;Landroid/app/Activity;)V", "showQR", "(Lcom/gse/aulapp/databinding/FragmentClassInCourseBinding;Landroid/content/Context;)V", "startGpsTrace", "(Landroid/app/Activity;)V", "stopGpsTrace", "stopServices", "Landroidx/navigation/NavDirections;", "action", "navigationTo", "(Landroid/content/Context;Landroidx/navigation/NavController;Landroidx/navigation/NavDirections;)V", "sendPracticeExamSync", "(Landroid/content/Context;Ljava/lang/String;Landroidx/navigation/NavController;)V", "navController", "Lkotlin/Function0;", "function", "validateConnection", "(Landroid/content/Context;Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;)V", "validateTimeClass", "()Z", "validateSliderExtra", "(Lcom/gse/aulapp/databinding/FragmentClassInCourseBinding;)V", "timeCurrent", "initValidateSlider", "(Ljava/lang/String;Lcom/gse/aulapp/databinding/FragmentClassInCourseBinding;)V", "getConfigSessionDto", "backClassInCourse", "validateFinishedClass", "(Landroid/content/Context;Ljava/lang/String;Landroidx/navigation/NavController;Ljava/lang/String;)V", "dialogExtraTimeClass", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/QuestionDto;", "questionsResponses", BuildConfig.FLAVOR, "validateAnswers", "(Ljava/util/List;)Ljava/util/List;", "testID", "saveTestInDB", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/response/QuestionsResponse;", "saveQuestionInDB", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadQuestionsFromDB", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isLastQuestion", "durationMinutes", "minutesForAlarm", "configDto", "startTimerService", "(Landroid/content/Context;IILcom/gse/aulapp/model/dto/ConfigurationSessionDto;)V", "getConfigurationSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "prepareToExit", "(Landroidx/navigation/NavController;)V", "pass", "approved", "noApproved", "showDialogPassExam", "(Landroid/content/Context;ZIILjava/lang/String;Landroidx/navigation/NavController;)V", "deleteAllQuestionBySessionID", "updateIsFinishedState", "updateIsPendingSync", "failConnection", "showPendingFinish", "updateDateEndClass", "isPending", "updateIsPendingState", "(Ljava/lang/String;Ljava/lang/String;)V", "cancelClassInCourse", "getDurationFormat", "getDurationExtraFormat", BuildConfig.FLAVOR, "milliseconds", "getFormattedTimeToString", "(J)Ljava/lang/String;", "dialogMaxExtraTimeClass", "showDialogIsMock", "selectTypeClassOrExam", "Lcom/gse/aulapp/model/repository/ClassInCourseRepository;", "Lcom/gse/aulapp/model/repository/SessionRepository;", "Lcom/gse/aulapp/model/repository/GpsRepository;", "getGpsRepository", "()Lcom/gse/aulapp/model/repository/GpsRepository;", "TAG", "Ljava/lang/String;", "Landroidx/lifecycle/MutableLiveData;", "_questions", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "questions", "Landroidx/lifecycle/LiveData;", "getQuestions", "()Landroidx/lifecycle/LiveData;", "_checkRadioButton", "checkRadioButton", "getCheckRadioButton", "_currentQuestionDto", "currentQuestionDto", "getCurrentQuestionDto", "Lcom/gse/aulapp/model/data/statusControl/Status;", "_message", "message", "getMessage", "Lcom/gse/aulapp/model/dto/SessionDto;", "sessionReceived", "Lcom/gse/aulapp/model/dto/SessionDto;", "getSessionReceived$app_release", "()Lcom/gse/aulapp/model/dto/SessionDto;", "setSessionReceived$app_release", "(Lcom/gse/aulapp/model/dto/SessionDto;)V", "currentIndex", "I", "getCurrentIndex", "()I", "setCurrentIndex", "(I)V", "lastStatus", "Lcom/gse/aulapp/model/dto/Status;", "_isLastQuestion", "Landroid/app/Dialog;", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "timeElapsedInService", "getTimeElapsedInService", "setTimeElapsedInService", "(Landroidx/lifecycle/LiveData;)V", BuildConfig.FLAVOR, "timeElapsedInServiceSlider", "getTimeElapsedInServiceSlider", "setTimeElapsedInServiceSlider", "Lkotlinx/coroutines/flow/StateFlow;", "isTimeForAlarm", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "setTimeForAlarm", "(Lkotlinx/coroutines/flow/StateFlow;)V", "isMinimumClassTime", "setMinimumClassTime", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_minimumClassMinutes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "minimumClassMinutes", "setMinimumClassMinutes", "timeRemaining", "getTimeRemaining", "setTimeRemaining", "isExtraTime", "setExtraTime", "showIsMockDialog", "Z", "getShowIsMockDialog", "setShowIsMockDialog", "(Z)V", "Lcom/gse/aulapp/util/SingleLiveEvent;", "_configSession", "Lcom/gse/aulapp/util/SingleLiveEvent;", "configSession", "getConfigSession", "()Lcom/gse/aulapp/util/SingleLiveEvent;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClassInCourseViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassInCourseViewModel.kt\ncom/gse/aulapp/viewmodel/ClassInCourseViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1528:1\n360#2,7:1529\n1567#2:1536\n1598#2,4:1537\n1755#2,3:1541\n1734#2,3:1544\n1755#2,3:1547\n*S KotlinDebug\n*F\n+ 1 ClassInCourseViewModel.kt\ncom/gse/aulapp/viewmodel/ClassInCourseViewModel\n*L\n226#1:1529,7\n302#1:1536\n302#1:1537,4\n339#1:1541,3\n419#1:1544,3\n537#1:1547,3\n*E\n"})
/* loaded from: classes2.dex */
public final class ClassInCourseViewModel extends ViewModel {
    private final String TAG;
    private final MutableLiveData<Status> _checkRadioButton;
    private final SingleLiveEvent<ConfigurationSessionDto> _configSession;
    private final MutableLiveData<QuestionDto> _currentQuestionDto;
    private MutableLiveData<Boolean> _isLastQuestion;
    private final MutableLiveData<com.gse.aulapp.model.data.statusControl.Status> _message;
    private MutableStateFlow<Integer> _minimumClassMinutes;
    private final MutableLiveData<List<QuestionDto>> _questions;
    private final LiveData<Status> checkRadioButton;
    private final ClassInCourseRepository classInCourseRepository;
    private final SingleLiveEvent<ConfigurationSessionDto> configSession;
    private int currentIndex;
    private final LiveData<QuestionDto> currentQuestionDto;
    private Dialog dialog;
    private final GpsRepository gpsRepository;
    private StateFlow<Boolean> isExtraTime;
    private final LiveData<Boolean> isLastQuestion;
    private StateFlow<Boolean> isMinimumClassTime;
    private StateFlow<Boolean> isTimeForAlarm;
    private Status lastStatus;
    private final LiveData<com.gse.aulapp.model.data.statusControl.Status> message;
    private StateFlow<Integer> minimumClassMinutes;
    private final LiveData<List<QuestionDto>> questions;
    private SessionDto sessionReceived;
    private final SessionRepository sessionRepository;
    private boolean showIsMockDialog;
    private LiveData<String> timeElapsedInService;
    private LiveData<Float> timeElapsedInServiceSlider;
    private LiveData<String> timeRemaining;

    public ClassInCourseViewModel(ClassInCourseRepository classInCourseRepository, SessionRepository sessionRepository, GpsRepository gpsRepository) {
        Intrinsics.checkNotNullParameter(classInCourseRepository, "classInCourseRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(gpsRepository, "gpsRepository");
        this.classInCourseRepository = classInCourseRepository;
        this.sessionRepository = sessionRepository;
        this.gpsRepository = gpsRepository;
        this.TAG = Reflection.getOrCreateKotlinClass(ClassInCourseViewModel.class).getSimpleName();
        MutableLiveData<List<QuestionDto>> mutableLiveData = new MutableLiveData<>();
        this._questions = mutableLiveData;
        this.questions = mutableLiveData;
        MutableLiveData<Status> mutableLiveData2 = new MutableLiveData<>();
        this._checkRadioButton = mutableLiveData2;
        this.checkRadioButton = mutableLiveData2;
        MutableLiveData<QuestionDto> mutableLiveData3 = new MutableLiveData<>();
        this._currentQuestionDto = mutableLiveData3;
        this.currentQuestionDto = mutableLiveData3;
        MutableLiveData<com.gse.aulapp.model.data.statusControl.Status> mutableLiveData4 = new MutableLiveData<>(Status.Empty.INSTANCE);
        this._message = mutableLiveData4;
        this.message = mutableLiveData4;
        this.lastStatus = com.gse.aulapp.model.dto.Status.NOT_ANSWERED;
        MutableLiveData<Boolean> mutableLiveData5 = new MutableLiveData<>(Boolean.FALSE);
        this._isLastQuestion = mutableLiveData5;
        this.isLastQuestion = mutableLiveData5;
        TimerService.Companion companion = TimerService.INSTANCE;
        this.timeElapsedInService = companion.getTimeElapsed();
        this.timeElapsedInServiceSlider = companion.getTimeElapsedSlider();
        this.isTimeForAlarm = companion.isTimeForAlarm();
        this.isMinimumClassTime = companion.isMinimumClassTime();
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this._minimumClassMinutes = MutableStateFlow;
        this.minimumClassMinutes = MutableStateFlow;
        this.timeRemaining = companion.getTimeMinimumRemaining();
        this.isExtraTime = companion.isExtraTime();
        this.showIsMockDialog = true;
        SingleLiveEvent<ConfigurationSessionDto> singleLiveEvent = new SingleLiveEvent<>();
        this._configSession = singleLiveEvent;
        this.configSession = singleLiveEvent;
    }

    private final void cancelClassInCourse(Context context, NavController findNavController, String sessionID) {
        updateIsPendingState("0", sessionID);
        prepareToExit(findNavController);
        stopServices(context);
        navigationTo(context, findNavController, new ActionOnlyNavDirections(R.id.action_classInCourseFragment_to_homeFragment));
    }

    private final void deleteAllQuestionBySessionID(String sessionID) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new ClassInCourseViewModel$deleteAllQuestionBySessionID$1(this, sessionID, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogCloseBeforeTime$lambda$12(ClassInCourseViewModel this$0, Context context, NavController findNavController, String sessionID, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        this$0.stopServices(context);
        this$0.prepareToExit(findNavController);
        this$0.selectTypeClassOrExam(context, sessionID, findNavController);
        BuildersKt.runBlocking$default(null, new ClassInCourseViewModel$dialogCloseBeforeTime$1$1(new StepProcessSessionRepository(GeneralApp.INSTANCE.getDatabase().StepProcessSessionDao()), sessionID, null), 1, null);
        Dialog dialog = this$0.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogExtraTimeClass$lambda$29(ClassInCourseViewModel this$0, Context context, String sessionID, NavController findNavController, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        new Handler(Looper.getMainLooper()).post(new e1(this$0, context, sessionID, findNavController));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogExtraTimeClass$lambda$29$lambda$28(ClassInCourseViewModel this$0, Context context, String sessionID, NavController findNavController) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        this$0.validateConnection(context, sessionID, findNavController, new g1(this$0, context, sessionID, findNavController, 0));
        Dialog dialog = this$0.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dialogExtraTimeClass$lambda$29$lambda$28$lambda$27(ClassInCourseViewModel this$0, Context context, String sessionID, NavController findNavController) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        this$0.sendPracticeExamSync(context, sessionID, findNavController);
        return Unit.INSTANCE;
    }

    private final void dialogMaxExtraTimeClass(Context context, NavController findNavController, String sessionID) {
        Window window;
        if (context != null) {
            try {
                Activity activity = (Activity) context;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    try {
                        try {
                            AlertDialog showInformationDialogValidationExam = DialogUtil.INSTANCE.showInformationDialogValidationExam(activity, EnumDialogType.CLASS_TIME_EXTRA_FINISHED, false, true, new i1(this, context, findNavController, sessionID, 5), new k1(1));
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
                            e = e;
                            e.toString();
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogMaxExtraTimeClass$lambda$31(ClassInCourseViewModel this$0, Context context, NavController findNavController, String sessionID, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        new Handler(Looper.getMainLooper()).post(new e1(this$0, context, findNavController, sessionID));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogMaxExtraTimeClass$lambda$31$lambda$30(ClassInCourseViewModel this$0, Context context, NavController findNavController, String sessionID) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        this$0.cancelClassInCourse(context, findNavController, sessionID);
        Dialog dialog = this$0.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogMaxExtraTimeClass$lambda$32(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogMaxTimeClass$lambda$11(ClassInCourseViewModel this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new Handler(Looper.getMainLooper()).post(new co.ceduladigital.sdk.f(this$0, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dialogMaxTimeClass$lambda$11$lambda$10(ClassInCourseViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void failConnection(Context context) {
        if (context != null) {
            try {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                AlertDialog showInformationDialogValidationExam = DialogUtil.INSTANCE.showInformationDialogValidationExam(activity, EnumDialogType.FAIL_CONNECTION_SYNC_EXAM, false, true, new j1(this, 0), new k1(0));
                this.dialog = showInformationDialogValidationExam;
                if (showInformationDialogValidationExam == null || showInformationDialogValidationExam.isShowing()) {
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
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void failConnection$lambda$22(ClassInCourseViewModel this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void failConnection$lambda$23(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getConfigurationSession(Continuation<? super ConfigurationSessionDto> continuation) {
        return ConfigurationUtil.INSTANCE.getConfigurationSessionByType(EnumTypeConfiguration.EXAM_CONFIG, continuation);
    }

    private final String getDurationExtraFormat() {
        Integer num;
        Integer duration;
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (duration = sessionDto.getDuration()) == null) {
            num = null;
        } else {
            int intValue = duration.intValue();
            ConfigurationSessionDto value = this._configSession.getValue();
            num = Integer.valueOf(intValue * (value != null ? value.getMinuteForHour() : 60));
        }
        Intrinsics.checkNotNull(num);
        int intValue2 = num.intValue();
        return getFormattedTimeToString(TimeUnit.MINUTES.toMillis(intValue2 + (this._configSession.getValue() != null ? r1.getMinToleranceDepartureAfter() : 15)));
    }

    private final String getDurationFormat() {
        Integer num;
        Integer duration;
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (duration = sessionDto.getDuration()) == null) {
            num = null;
        } else {
            int intValue = duration.intValue();
            ConfigurationSessionDto value = this._configSession.getValue();
            num = Integer.valueOf(intValue * (value != null ? value.getMinuteForHour() : 60));
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadQuestionsFromDB(Context context, String str, String str2, NavController navController, Continuation<? super Unit> continuation) {
        ClassInCourseViewModel$loadQuestionsFromDB$1 classInCourseViewModel$loadQuestionsFromDB$1;
        int i;
        Context context2;
        if (continuation instanceof ClassInCourseViewModel$loadQuestionsFromDB$1) {
            classInCourseViewModel$loadQuestionsFromDB$1 = (ClassInCourseViewModel$loadQuestionsFromDB$1) continuation;
            int i2 = classInCourseViewModel$loadQuestionsFromDB$1.label;
            if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                classInCourseViewModel$loadQuestionsFromDB$1.label = i2 - IntCompanionObject.MIN_VALUE;
                Object obj = classInCourseViewModel$loadQuestionsFromDB$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = classInCourseViewModel$loadQuestionsFromDB$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        CoroutineDispatcher io2 = Dispatchers.getIO();
                        ClassInCourseViewModel$loadQuestionsFromDB$2 classInCourseViewModel$loadQuestionsFromDB$2 = new ClassInCourseViewModel$loadQuestionsFromDB$2(this, str2, context, str, navController, null);
                        classInCourseViewModel$loadQuestionsFromDB$1.L$0 = context;
                        classInCourseViewModel$loadQuestionsFromDB$1.label = 1;
                        if (BuildersKt.withContext(io2, classInCourseViewModel$loadQuestionsFromDB$2, classInCourseViewModel$loadQuestionsFromDB$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e) {
                        e = e;
                        context2 = context;
                        LogSendUtil.INSTANCE.setLog(context2, q.i("loadQuestionsFromDB exception: ", e.getMessage()), "loadQuestionsFromDB", true);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Context context3 = (Context) classInCourseViewModel$loadQuestionsFromDB$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception e2) {
                        e = e2;
                        context2 = context3;
                        LogSendUtil.INSTANCE.setLog(context2, q.i("loadQuestionsFromDB exception: ", e.getMessage()), "loadQuestionsFromDB", true);
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        classInCourseViewModel$loadQuestionsFromDB$1 = new ClassInCourseViewModel$loadQuestionsFromDB$1(this, continuation);
        Object obj2 = classInCourseViewModel$loadQuestionsFromDB$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = classInCourseViewModel$loadQuestionsFromDB$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    private final void prepareToExit(NavController findNavController) {
        String id;
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (id = sessionDto.getId()) == null) {
            return;
        }
        deleteAllQuestionBySessionID(id);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveQuestionInDB(String str, List<QuestionsResponse> list, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new ClassInCourseViewModel$saveQuestionInDB$2(this, str, list, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveTestInDB(String str, String str2, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new ClassInCourseViewModel$saveTestInDB$2(this, str, str2, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    private final void selectTypeClassOrExam(Context context, String sessionID, NavController findNavController) {
        PreferenceUtil.INSTANCE.saveStartClassOrExam(context, BuildConfig.FLAVOR);
        Parameters.INSTANCE.setINITIAL_TIME(0L);
        ControllerFinishClassOrExamUtil.INSTANCE.selectTypeClassOrExam(context, sessionID, findNavController, this.sessionReceived, this.sessionRepository, new ActionOnlyNavDirections(R.id.action_classInCourseFragment_to_homeFragment));
    }

    private final void showDialogIsMock(Context context, Activity activity) {
        if (this.showIsMockDialog) {
            DialogNormalUtil.Companion.showDialog$app_release$default(DialogNormalUtil.INSTANCE, context, EnumDialogType.DIALOG_FAKE_GPS, new f1(this, activity, 0), null, 8, null);
            this.showIsMockDialog = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showDialogIsMock$lambda$33(ClassInCourseViewModel this$0, Activity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        this$0.startGpsTrace(activity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDialogPassExam(Context context, boolean pass, int approved, int noApproved, String sessionID, NavController findNavController) {
        String t;
        String string;
        int i;
        if (context == null) {
            return;
        }
        CharSequence text = context.getText(R.string.dialog_fullscreen_pass_exam);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        String obj = text.toString();
        if (pass) {
            t = StringsKt.t(obj, "[PASS]", BuildConfig.FLAVOR);
            string = context.getString(R.string.dialog_fullscreen_pass_exam_approved);
            i = 7;
        } else {
            t = StringsKt.t(obj, "[PASS]", " NO");
            string = context.getString(R.string.dialog_fullscreen_pass_exam_not_approved);
            i = 6;
        }
        int i2 = i;
        String t2 = StringsKt.t(StringsKt.t(t, "[APPROVED]", String.valueOf(approved)), "[NOAPPROVED]", String.valueOf(noApproved));
        DialogUtil.Companion companion = DialogUtil.INSTANCE;
        Activity activity = (Activity) context;
        if (string == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleContent");
            string = null;
        }
        AlertDialog showInformationDialog = companion.showInformationDialog(activity, t2, string, activity.getString(R.string.id_continue), i2, false, new i1(this, sessionID, context, findNavController, 2), null);
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDialogPassExam$lambda$14(ClassInCourseViewModel this$0, String sessionID, Context context, NavController findNavController, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        this$0.updateIsFinishedState(sessionID);
        this$0.stopServices(context);
        SessionDto sessionDto = this$0.sessionReceived;
        Intrinsics.checkNotNull(sessionDto);
        String sessionID2 = sessionDto.getId();
        EnumClassType sessionType = EnumClassType.PRACTICE_EXAM;
        Intrinsics.checkNotNullParameter(sessionID2, "sessionID");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        this$0.navigationTo(context, findNavController, new c1(sessionID2, false, sessionType));
        Dialog dialog = this$0.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPendingFinish(Context context, String sessionID, NavController findNavController) {
        if (context != null) {
            try {
                Activity activity = (Activity) context;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    try {
                        try {
                            AlertDialog showInformationDialogValidationExam = DialogUtil.INSTANCE.showInformationDialogValidationExam(activity, EnumDialogType.PENDING_EXAM_FOR_FINISH, false, true, new i1(this, sessionID, context, findNavController, 1), null);
                            this.dialog = showInformationDialogValidationExam;
                            if (showInformationDialogValidationExam == null || showInformationDialogValidationExam.isShowing()) {
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
                            e = e;
                            e.toString();
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPendingFinish$lambda$24(ClassInCourseViewModel this$0, String sessionID, Context context, NavController findNavController, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        Intrinsics.checkNotNullParameter(findNavController, "$findNavController");
        this$0.updateIsFinishedState(sessionID);
        this$0.stopServices(context);
        SessionDto sessionDto = this$0.sessionReceived;
        Intrinsics.checkNotNull(sessionDto);
        String sessionID2 = sessionDto.getId();
        EnumClassType sessionType = EnumClassType.PRACTICE_EXAM;
        Intrinsics.checkNotNullParameter(sessionID2, "sessionID");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        this$0.navigationTo(context, findNavController, new c1(sessionID2, false, sessionType));
        Dialog dialog = this$0.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit starTimerClass$lambda$6(Integer num, FragmentClassInCourseBinding binding, ClassInCourseViewModel this$0, Activity context, ConfigurationSessionDto sessionDto) {
        Intrinsics.checkNotNullParameter(binding, "$binding");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(sessionDto, "$sessionDto");
        starTimerClass$startTimerService(num, binding, this$0, context, sessionDto);
        return Unit.INSTANCE;
    }

    private static final void starTimerClass$startTimerService(Integer num, FragmentClassInCourseBinding fragmentClassInCourseBinding, ClassInCourseViewModel classInCourseViewModel, Activity activity, ConfigurationSessionDto configurationSessionDto) {
        if (num != null) {
            fragmentClassInCourseBinding.includeChronometer.sliderTimer.setValueTo(num.intValue());
            classInCourseViewModel.startTimerService(activity, num.intValue(), configurationSessionDto.getAlertEndSession(), configurationSessionDto);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startGpsTrace$lambda$21(ClassInCourseViewModel this$0, Activity activity) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        SessionDto sessionDto = this$0.sessionReceived;
        if (sessionDto != null) {
            GpsUtil.INSTANCE.validatePermissionsAndStart(activity, 2500L, sessionDto.getId());
        }
        return Unit.INSTANCE;
    }

    private final void startTimerService(Context context, int durationMinutes, int minutesForAlarm, ConfigurationSessionDto configDto) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        ValidateHoursUtil.INSTANCE.getElapsedTime(context, new m1(this, context, timeUnit.toMillis(durationMinutes), timeUnit.toMillis(configDto.getMinToleranceDepartureAfter()), minutesForAlarm, configDto, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startTimerService$lambda$8(ClassInCourseViewModel this$0, Context context, long j, long j2, int i, ConfigurationSessionDto configDto, long j3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(configDto, "$configDto");
        boolean timerServiceIsRunning = this$0.timerServiceIsRunning(context);
        Intent intent = new Intent(context, (Class<?>) TimerService.class);
        intent.putExtra("durationMillis", j);
        intent.putExtra("durationMillisExtra", j2);
        intent.putExtra("retake_elapsed_time", j3);
        intent.putExtra("IS_RETAKE", !timerServiceIsRunning);
        intent.putExtra("minutesForAlarm", i);
        intent.putExtra("practice_class", true);
        intent.putExtra("min_tolerance_entry_before", configDto.getMinToleranceEntryBefore());
        intent.putExtra("min_tolerance_entry_after", configDto.getMinToleranceEntryAfter());
        intent.putExtra("min_tolerance_departure_after", configDto.getMinToleranceDepartureAfter());
        intent.putExtra("duration_for_hour", configDto.getDurationForHour());
        intent.putExtra("duration_for_hour_show", configDto.getDurationForHourShow());
        intent.putExtra("alert_end_session", configDto.getAlertEndSession());
        intent.putExtra("alert_departure_after", configDto.getAlertDepartureAfter());
        intent.putExtra("minutes_for_hour", configDto.getMinuteForHour());
        context.startService(intent);
        return Unit.INSTANCE;
    }

    private final void updateDateEndClass(String sessionID) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ClassInCourseViewModel$updateDateEndClass$1(this, sessionID, null), 3, null);
    }

    private final void updateIsFinishedState(String sessionID) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ClassInCourseViewModel$updateIsFinishedState$1(this, sessionID, null), 3, null);
    }

    private final void updateIsPendingState(String isPending, String sessionID) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ClassInCourseViewModel$updateIsPendingState$1(this, isPending, sessionID, null), 3, null);
    }

    private final void updateIsPendingSync(String sessionID) {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ClassInCourseViewModel$updateIsPendingSync$1(this, sessionID, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final List<QuestionDto> validateAnswers(List<QuestionDto> questionsResponses) {
        int i;
        com.gse.aulapp.model.dto.Status status;
        ArrayList arrayList = new ArrayList();
        for (QuestionDto questionDto : questionsResponses) {
            String answer = questionDto.getAnswer();
            switch (answer.hashCode()) {
                case -2144945559:
                    if (answer.equals("No aplica")) {
                        status = com.gse.aulapp.model.dto.Status.NOT_APPLICABLE;
                        break;
                    }
                    status = com.gse.aulapp.model.dto.Status.CURRENT;
                    break;
                case 40386170:
                    if (answer.equals("Sin Responder")) {
                        status = com.gse.aulapp.model.dto.Status.NOT_ANSWERED;
                        break;
                    }
                    status = com.gse.aulapp.model.dto.Status.CURRENT;
                    break;
                case 1303969238:
                    if (answer.equals("Aprobado")) {
                        status = com.gse.aulapp.model.dto.Status.APPROVED;
                        break;
                    }
                    status = com.gse.aulapp.model.dto.Status.CURRENT;
                    break;
                case 1733221252:
                    if (answer.equals("Reprobado")) {
                        status = com.gse.aulapp.model.dto.Status.REJECTED;
                        break;
                    }
                    status = com.gse.aulapp.model.dto.Status.CURRENT;
                    break;
                default:
                    status = com.gse.aulapp.model.dto.Status.CURRENT;
                    break;
            }
            arrayList.add(QuestionDto.copy$default(questionDto, null, null, null, null, status, 15, null));
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                QuestionDto questionDto2 = (QuestionDto) obj;
                i = (questionDto2.getStatus() == com.gse.aulapp.model.dto.Status.NOT_ANSWERED || questionDto2.getStatus() == com.gse.aulapp.model.dto.Status.NOT_APPLICABLE) ? 0 : i + 1;
            } else {
                i = -1;
            }
        }
        this.currentIndex = i;
        if (i < 0) {
            this.currentIndex = arrayList.size();
        }
        if (this.currentIndex < arrayList.size()) {
            ((QuestionDto) arrayList.get(this.currentIndex)).setStatus(com.gse.aulapp.model.dto.Status.CURRENT);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateConnection$lambda$25(Context context, ClassInCourseViewModel this$0, Function0 function, View view) {
        Dialog dialog;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(function, "$function");
        if (NetworkUtil.INSTANCE.isNetworkAvailable(context) && (dialog = this$0.dialog) != null && dialog.isShowing()) {
            Dialog dialog2 = this$0.dialog;
            if (dialog2 != null) {
                dialog2.dismiss();
            }
            function.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateConnection$lambda$26(ClassInCourseViewModel this$0, String sessionID, Context context, NavController navController, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(sessionID, "$sessionID");
        Intrinsics.checkNotNullParameter(navController, "$navController");
        this$0.updateIsPendingSync(sessionID);
        this$0.updateDateEndClass(sessionID);
        SessionDto sessionDto = this$0.sessionReceived;
        Intrinsics.checkNotNull(sessionDto);
        String sessionID2 = sessionDto.getId();
        EnumClassType sessionType = EnumClassType.PRACTICE_EXAM;
        Intrinsics.checkNotNullParameter(sessionID2, "sessionID");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        this$0.navigationTo(context, navController, new c1(sessionID2, false, sessionType));
        Dialog dialog = this$0.dialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit validateIsMock$lambda$18(ClassInCourseViewModel this$0, Context context, Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        if (z) {
            this$0.showDialogIsMock(context, activity);
            this$0.stopGpsTrace(activity);
        } else {
            this$0.showIsMockDialog = true;
        }
        return Unit.INSTANCE;
    }

    public final void backClassInCourse(Context context, NavController findNavController, String sessionID) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        updateIsPendingState("0", sessionID);
        prepareToExit(findNavController);
        stopServices(context);
        EnumClassType sessionType = EnumClassType.PRACTICE_EXAM;
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        navigationTo(context, findNavController, new c1(sessionID, false, sessionType));
    }

    public final void dialogCloseBeforeTime$app_release(Context context, NavController findNavController, String sessionID) {
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        if (context != null) {
            try {
                Activity activity = (Activity) context;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    CharSequence text = ((Activity) context).getText(R.string.dialog_fullscreen_close_exam_before_time);
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    try {
                        try {
                            AlertDialog showInformationDialog = DialogUtil.INSTANCE.showInformationDialog(activity, StringsKt.t(text.toString(), "[HH:MM:SS]", String.valueOf(this.timeRemaining.getValue())), ((Activity) context).getString(R.string.dialog_fullscreen_close_before_time_title), ((Activity) context).getString(R.string.btn_finish), 8, true, new i1(this, context, findNavController, sessionID, 4), null);
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
                            e = e;
                            e.toString();
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
    }

    public final void dialogExtraTimeClass(Context context, String sessionID, NavController findNavController) {
        Window window;
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        if (context == null) {
            return;
        }
        CharSequence text = context.getText(R.string.dialog_fullscreen_class_time_finished_text);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        String obj = text.toString();
        ConfigurationSessionDto value = this._configSession.getValue();
        Activity activity = (Activity) context;
        AlertDialog showInformationDialog = DialogUtil.INSTANCE.showInformationDialog(activity, StringsKt.t(obj, "[TIME]", String.valueOf(value != null ? value.getMinToleranceDepartureAfter() : 15)), activity.getString(R.string.dialog_fullscreen_class_time_finished_title), activity.getString(R.string.dialog_fullscreen_class_time_finished_title_button), 8, true, new i1(this, context, sessionID, findNavController), null);
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
    }

    public final void dialogMaxTimeClass(Context context) {
        Window window;
        if (context != null) {
            try {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                ConfigurationSessionDto value = this._configSession.getValue();
                int alertEndSession = value != null ? value.getAlertEndSession() : 10;
                CharSequence text = ((Activity) context).getText(R.string.dialog_fullscreen_max_wait_time_exam);
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                AlertDialog showInformationDialog = DialogUtil.INSTANCE.showInformationDialog(activity, StringsKt.t(text.toString(), "[TIME]", String.valueOf(alertEndSession)), ((Activity) context).getString(R.string.dialog_fullscreen_max_wait_time_title), ((Activity) context).getString(R.string.id_continue), 8, false, new j1(this, 1), null);
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

    public final LiveData<com.gse.aulapp.model.dto.Status> getCheckRadioButton() {
        return this.checkRadioButton;
    }

    public final SingleLiveEvent<ConfigurationSessionDto> getConfigSession() {
        return this.configSession;
    }

    public final void getConfigSessionDto() {
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ClassInCourseViewModel$getConfigSessionDto$1(this, null), 3, null);
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final LiveData<QuestionDto> getCurrentQuestionDto() {
        return this.currentQuestionDto;
    }

    public final Dialog getDialog() {
        return this.dialog;
    }

    public final GpsRepository getGpsRepository() {
        return this.gpsRepository;
    }

    public final LiveData<com.gse.aulapp.model.data.statusControl.Status> getMessage() {
        return this.message;
    }

    public final String getMinimumClassMinutes() {
        Integer num;
        Integer duration;
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (duration = sessionDto.getDuration()) == null) {
            num = null;
        } else {
            int intValue = duration.intValue();
            ConfigurationSessionDto value = this._configSession.getValue();
            num = Integer.valueOf(intValue * (value != null ? value.getMinuteForHour() : 60));
        }
        double durationForHour = ((this._configSession.getValue() != null ? r2.getDurationForHour() : 40) * 100.0d) / (this._configSession.getValue() != null ? r6.getMinuteForHour() : 60);
        if (num != null) {
            this._minimumClassMinutes.setValue(Integer.valueOf((int) ((durationForHour / 100.0d) * num.intValue())));
        }
        Objects.toString(this._minimumClassMinutes.getValue());
        return String.valueOf(this.minimumClassMinutes.getValue().intValue());
    }

    public final LiveData<List<QuestionDto>> getQuestions() {
        return this.questions;
    }

    public final void getSessionById(String sessionID) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ClassInCourseViewModel$getSessionById$1(this, sessionID, null), 3, null);
    }

    public final void getSessionDataApi(Context context, String sessionID, boolean startChronometer, NavController findNavController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ClassInCourseViewModel$getSessionDataApi$1(context, sessionID, this, startChronometer, findNavController, null), 3, null);
    }

    /* renamed from: getSessionReceived$app_release, reason: from getter */
    public final SessionDto getSessionReceived() {
        return this.sessionReceived;
    }

    public final LiveData<String> getTimeElapsedInService() {
        return this.timeElapsedInService;
    }

    public final LiveData<Float> getTimeElapsedInServiceSlider() {
        return this.timeElapsedInServiceSlider;
    }

    public final void initValidateSlider(String timeCurrent, FragmentClassInCourseBinding binding) {
        Integer num;
        Integer duration;
        Intrinsics.checkNotNullParameter(timeCurrent, "timeCurrent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (duration = sessionDto.getDuration()) == null) {
            num = null;
        } else {
            int intValue = duration.intValue();
            ConfigurationSessionDto value = this._configSession.getValue();
            num = Integer.valueOf(intValue * (value != null ? value.getMinuteForHour() : 60));
        }
        Intrinsics.checkNotNull(num);
        int intValue2 = num.intValue();
        if (Intrinsics.areEqual(timeCurrent, getDurationFormat()) || binding.includeChronometer.sliderTimer.getValueTo() == 1.0f) {
            binding.includeChronometer.sliderTimer.setValueTo(intValue2);
        }
    }

    public final StateFlow<Boolean> isExtraTime() {
        return this.isExtraTime;
    }

    /* renamed from: isLastQuestion, reason: collision with other method in class */
    public final LiveData<Boolean> m18isLastQuestion() {
        return this.isLastQuestion;
    }

    public final StateFlow<Boolean> isMinimumClassTime() {
        return this.isMinimumClassTime;
    }

    public final StateFlow<Boolean> isTimeForAlarm() {
        return this.isTimeForAlarm;
    }

    public final void moveToNextQuestion() {
        List<QuestionDto> value = this._questions.getValue();
        if (value != null) {
            BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new ClassInCourseViewModel$moveToNextQuestion$1$1(value, this, null), 2, null);
        }
    }

    public final void moveToQuestion(int position, FragmentClassInCourseBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        List<QuestionDto> value = this._questions.getValue();
        QuestionDto questionDto = value != null ? value.get(this.currentIndex) : null;
        List<QuestionDto> value2 = this._questions.getValue();
        QuestionDto questionDto2 = value2 != null ? value2.get(position) : null;
        this._isLastQuestion.postValue(Boolean.FALSE);
        com.gse.aulapp.model.dto.Status status = questionDto != null ? questionDto.getStatus() : null;
        com.gse.aulapp.model.dto.Status status2 = com.gse.aulapp.model.dto.Status.CURRENT;
        if (status == status2) {
            setQuestionStatus(com.gse.aulapp.model.dto.Status.NOT_ANSWERED);
        }
        com.gse.aulapp.model.dto.Status status3 = this.lastStatus;
        if (status3 != com.gse.aulapp.model.dto.Status.NOT_ANSWERED) {
            Intrinsics.checkNotNull(status3);
            setQuestionStatus(status3);
        }
        this.lastStatus = questionDto2 != null ? questionDto2.getStatus() : null;
        this.currentIndex = position;
        if ((questionDto2 != null ? questionDto2.getStatus() : null) == com.gse.aulapp.model.dto.Status.REJECTED) {
            binding.includeQuestionCard.statusCheck.check(R.id.rejectRadioButton);
        } else {
            if ((questionDto2 != null ? questionDto2.getStatus() : null) == com.gse.aulapp.model.dto.Status.APPROVED) {
                binding.includeQuestionCard.statusCheck.check(R.id.approveRadioButton);
            }
        }
        setQuestionStatus(status2);
    }

    public final void navigationTo(Context context, NavController findNavController, NavDirections action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        Intrinsics.checkNotNullParameter(action, "action");
        NavigationUtil.INSTANCE.navigateToDifferentFragment(context, findNavController, action);
    }

    public final void sendPracticeExamSync(Context context, String sessionID, NavController findNavController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ClassInCourseViewModel$sendPracticeExamSync$1(context, this, sessionID, findNavController, null), 3, null);
    }

    public final void setCurrentIndex(int i) {
        this.currentIndex = i;
    }

    public final void setDataSession(SessionFull sessionFull, FragmentClassInCourseBinding binding) {
        Intrinsics.checkNotNullParameter(sessionFull, "sessionFull");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.sessionReceived = SessionDataConverter.INSTANCE.getSessionDtoFromSessionEntity(sessionFull.getSession(), sessionFull.getClassRoom(), sessionFull.getVehicle(), sessionFull.getLesson(), sessionFull.getListStepStatus());
    }

    public final void setDataSessionDetailToDialog$app_release(DialogExamInfoLayoutBinding binding, String timeSession) {
        VehicleDto vehicleDto;
        String str;
        String str2 = timeSession;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Objects.toString(this.sessionReceived);
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null) {
            binding.includeLayoutPracticeClassCard.getRoot().setVisibility(8);
            return;
        }
        Intrinsics.checkNotNull(sessionDto);
        if (sessionDto.getStartDateEntryClass() == null && str2 != null) {
            ControllerEntryOrExamUtil.Companion companion = ControllerEntryOrExamUtil.INSTANCE;
            SessionDto sessionDto2 = this.sessionReceived;
            Intrinsics.checkNotNull(sessionDto2);
            companion.saveEntryExam(str2, sessionDto2.getId(), this.sessionRepository);
        }
        DateUtil.Companion companion2 = DateUtil.INSTANCE;
        SessionDto sessionDto3 = this.sessionReceived;
        Intrinsics.checkNotNull(sessionDto3);
        String startDateEntryClass = sessionDto3.getStartDateEntryClass();
        if (startDateEntryClass != null) {
            str2 = startDateEntryClass;
        }
        String parseDateToString12H = companion2.parseDateToString12H(str2);
        EnumClassType.Companion companion3 = EnumClassType.INSTANCE;
        SessionDto sessionDto4 = this.sessionReceived;
        Intrinsics.checkNotNull(sessionDto4);
        EnumClassType enumByName = companion3.getEnumByName(sessionDto4.getType());
        SessionDto sessionDto5 = this.sessionReceived;
        Intrinsics.checkNotNull(sessionDto5);
        String parseDateToString12H2 = companion2.parseDateToString12H(sessionDto5.getStart());
        SessionDto sessionDto6 = this.sessionReceived;
        Intrinsics.checkNotNull(sessionDto6);
        String parseDateToString12H3 = companion2.parseDateToString12H(sessionDto6.getEnd());
        SessionDto sessionDto7 = this.sessionReceived;
        Intrinsics.checkNotNull(sessionDto7);
        Integer duration = sessionDto7.getDuration();
        SessionDto sessionDto8 = this.sessionReceived;
        Intrinsics.checkNotNull(sessionDto8);
        VehicleDto vehicle = sessionDto8.getVehicle();
        SessionDto sessionDto9 = this.sessionReceived;
        Intrinsics.checkNotNull(sessionDto9);
        sessionDto9.getClassroom();
        SessionDto sessionDto10 = this.sessionReceived;
        Intrinsics.checkNotNull(sessionDto10);
        String date = sessionDto10.getDate();
        Date dateFromPattern = date != null ? companion2.getDateFromPattern(date, "yyyy-MM-dd") : null;
        binding.includeLayoutPracticeClassCard.getRoot().setVisibility(0);
        binding.includeLayoutPracticeClassCard.ivPracticeClassIconCard.setImageResource(enumByName.resource());
        binding.includeLayoutPracticeClassCard.tvPracticeClassTitleClassCard.setText(EnumClassType.nameShow$default(enumByName, null, 1, null));
        binding.includeLayoutPracticeClassCard.includePracticeClassApprentice.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_apprentice));
        TextView textView = binding.includeLayoutPracticeClassCard.includePracticeClassApprentice.classProgressDescription;
        SessionDto sessionDto11 = this.sessionReceived;
        Intrinsics.checkNotNull(sessionDto11);
        textView.setText(sessionDto11.getApprentice());
        binding.includeLayoutPracticeClassCard.includePracticeClassInstructor.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_instructor));
        TextView textView2 = binding.includeLayoutPracticeClassCard.includePracticeClassInstructor.classProgressDescription;
        PreferenceUtil.Companion companion4 = PreferenceUtil.INSTANCE;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView2.setText(companion4.getUserName(context));
        binding.includeLayoutPracticeClassCard.includePracticeClassCategory.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_category));
        TextView textView3 = binding.includeLayoutPracticeClassCard.includePracticeClassCategory.classProgressDescription;
        SessionDto sessionDto12 = this.sessionReceived;
        Intrinsics.checkNotNull(sessionDto12);
        String category = sessionDto12.getCategory();
        if (category == null) {
            category = "No Aplica";
        }
        textView3.setText(category);
        binding.includeLayoutPracticeClassCard.includePracticeClassVehicle.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_vehicle));
        TextView textView4 = binding.includeLayoutPracticeClassCard.includePracticeClassVehicle.classProgressDescription;
        if (vehicle == null || vehicle.getLine().length() <= 0 || vehicle.getPlates().length() <= 0) {
            vehicleDto = vehicle;
            str = "No Aplica";
        } else {
            vehicleDto = vehicle;
            str = vehicle.getLine() + " (" + vehicle.getPlates() + ")";
        }
        textView4.setText(str);
        binding.includeLayoutPracticeClassCard.includePracticeClassDate.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_date));
        binding.includeLayoutPracticeClassCard.includePracticeClassDate.classProgressDescription.setText(dateFromPattern != null ? companion2.parseDateToString(dateFromPattern, "dd/MM/yyyy") : "No Aplica");
        binding.includeLayoutPracticeClassCard.includePracticeClassTime.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_hour));
        binding.includeLayoutPracticeClassCard.includePracticeClassTime.classProgressDescription.setText(parseDateToString12H2 + " - " + parseDateToString12H3 + " (" + duration + "h) ");
        binding.includeLayoutPracticeClassCard.includePracticeClassStartTime.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_start_hour));
        binding.includeLayoutPracticeClassCard.includePracticeClassStartTime.classProgressDescription.setText(parseDateToString12H);
        BuildersKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new ClassInCourseViewModel$setDataSessionDetailToDialog$2(this, binding, null), 3, null);
        binding.includeLayoutPracticeClassCard.includePracticeClassTopSpeed.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_top_velocity));
        binding.includeLayoutPracticeClassCard.includePracticeClassTopSpeed.classProgressDescription.setText("0,000 km/h");
        binding.includeLayoutPracticeClassCard.includePracticeClassAverageSpeed.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_max_average));
        binding.includeLayoutPracticeClassCard.includePracticeClassAverageSpeed.classProgressDescription.setText("0,000 km/h");
        binding.includeLayoutPracticeClassCard.includePracticeClassMovingTime.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_time_on_move));
        binding.includeLayoutPracticeClassCard.includePracticeClassMovingTime.classProgressDescription.setText("00:00:000");
        binding.includeLayoutPracticeClassCard.includePracticeClassStoppedTime.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_time_on_stop));
        binding.includeLayoutPracticeClassCard.includePracticeClassStoppedTime.classProgressDescription.setText("00:00:000");
        binding.includeLayoutPracticeClassCard.includePracticeClassDistanceTraveled.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_distance));
        binding.includeLayoutPracticeClassCard.includePracticeClassDistanceTraveled.classProgressDescription.setText("0,000 km/h");
        binding.includeLayoutPracticeClassCard.includePracticeClassCea.classProgressTitle.setText(binding.getRoot().getContext().getText(R.string.txt_card_practice_class_cea));
        Context context2 = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        CenterDto cea = companion4.getCEA(context2);
        Intrinsics.checkNotNull(cea);
        String name = cea.getName();
        if (name != null) {
            binding.includeLayoutPracticeClassCard.includePracticeClassCea.classProgressDescription.setText(name);
        }
        String nameShow$default = EnumClassType.nameShow$default(enumByName, null, 1, null);
        SessionDto sessionDto13 = this.sessionReceived;
        Intrinsics.checkNotNull(sessionDto13);
        String apprentice = sessionDto13.getApprentice();
        Context context3 = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        String userName = companion4.getUserName(context3);
        SessionDto sessionDto14 = this.sessionReceived;
        Intrinsics.checkNotNull(sessionDto14);
        String category2 = sessionDto14.getCategory();
        if (category2 == null) {
            category2 = "No Aplica";
        }
        CharSequence text = binding.getRoot().getContext().getText(R.string.txt_card_practice_class_apprentice);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        CharSequence text2 = binding.getRoot().getContext().getText(R.string.txt_card_practice_class_instructor);
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        CharSequence text3 = binding.getRoot().getContext().getText(R.string.txt_card_practice_class_category);
        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
        CharSequence text4 = binding.getRoot().getContext().getText(R.string.txt_card_practice_class_vehicle);
        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
        String line = vehicleDto != null ? vehicleDto.getLine() : null;
        String plates = vehicleDto != null ? vehicleDto.getPlates() : null;
        StringBuilder sb = new StringBuilder();
        sb.append(nameShow$default);
        sb.append("\n");
        sb.append((Object) text);
        sb.append(" ");
        sb.append(apprentice);
        sb.append("\n");
        sb.append((Object) text2);
        sb.append(" ");
        sb.append(userName);
        sb.append("\n");
        sb.append((Object) text3);
        sb.append(" ");
        sb.append(category2);
        sb.append("\n");
        sb.append((Object) text4);
        sb.append(" ");
        sb.append(line);
        String m = q.m(sb, " (", plates, ")\n");
        QRUtil.Companion companion5 = QRUtil.INSTANCE;
        ImageView ivQr = binding.ivQr;
        Intrinsics.checkNotNullExpressionValue(ivQr, "ivQr");
        companion5.generateQR(ivQr, m, 0, -1, 1000);
    }

    public final void setQuestionStatus(com.gse.aulapp.model.dto.Status status) {
        com.gse.aulapp.model.dto.Status status2;
        Intrinsics.checkNotNullParameter(status, "status");
        List<QuestionDto> value = this._questions.getValue();
        if (value == null || this.currentIndex > value.size() - 1) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.e(value));
        int i = 0;
        for (Object obj : value) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            QuestionDto questionDto = (QuestionDto) obj;
            if (i == this.currentIndex) {
                status2 = status;
                questionDto = QuestionDto.copy$default(questionDto, null, null, null, null, status2, 15, null);
            } else {
                status2 = status;
            }
            arrayList.add(questionDto);
            i = i2;
            status = status2;
        }
        this._questions.setValue(arrayList);
        this._currentQuestionDto.setValue(arrayList.get(this.currentIndex));
        this._questions.getValue();
    }

    public final void showQR(FragmentClassInCourseBinding binding, Context context) {
        String str;
        Intrinsics.checkNotNullParameter(binding, "binding");
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto != null) {
            EnumClassType.Companion companion = EnumClassType.INSTANCE;
            Intrinsics.checkNotNull(sessionDto);
            EnumClassType enumByName = companion.getEnumByName(sessionDto.getType());
            DateUtil.Companion companion2 = DateUtil.INSTANCE;
            SessionDto sessionDto2 = this.sessionReceived;
            Intrinsics.checkNotNull(sessionDto2);
            companion2.parseDateToString12H(sessionDto2.getStart());
            SessionDto sessionDto3 = this.sessionReceived;
            Intrinsics.checkNotNull(sessionDto3);
            companion2.parseDateToString12H(sessionDto3.getEnd());
            SessionDto sessionDto4 = this.sessionReceived;
            Intrinsics.checkNotNull(sessionDto4);
            sessionDto4.getDuration();
            SessionDto sessionDto5 = this.sessionReceived;
            Intrinsics.checkNotNull(sessionDto5);
            VehicleDto vehicle = sessionDto5.getVehicle();
            SessionDto sessionDto6 = this.sessionReceived;
            Intrinsics.checkNotNull(sessionDto6);
            sessionDto6.getClassroom();
            SessionDto sessionDto7 = this.sessionReceived;
            Intrinsics.checkNotNull(sessionDto7);
            String date = sessionDto7.getDate();
            if (date != null) {
                companion2.getDateFromPattern(date, "yyyy-MM-dd");
            }
            String nameShow$default = EnumClassType.nameShow$default(enumByName, null, 1, null);
            SessionDto sessionDto8 = this.sessionReceived;
            Intrinsics.checkNotNull(sessionDto8);
            String apprentice = sessionDto8.getApprentice();
            PreferenceUtil.Companion companion3 = PreferenceUtil.INSTANCE;
            Context context2 = binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            String userName = companion3.getUserName(context2);
            SessionDto sessionDto9 = this.sessionReceived;
            Intrinsics.checkNotNull(sessionDto9);
            String category = sessionDto9.getCategory();
            if (category == null) {
                category = "No Aplica";
            }
            CharSequence text = binding.getRoot().getContext().getText(R.string.txt_card_practice_class_apprentice);
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            CharSequence text2 = binding.getRoot().getContext().getText(R.string.txt_card_practice_class_instructor);
            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
            CharSequence text3 = binding.getRoot().getContext().getText(R.string.txt_card_practice_class_category);
            Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
            CharSequence text4 = binding.getRoot().getContext().getText(R.string.txt_card_practice_class_vehicle);
            Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
            if (vehicle != null) {
                str = vehicle.getLine() + " (" + vehicle.getPlates() + ")";
            } else {
                str = "No Aplica\n";
            }
            QRUtil.Companion companion4 = QRUtil.INSTANCE;
            ImageView ivQr = binding.includeChronometer.ivQr;
            Intrinsics.checkNotNullExpressionValue(ivQr, "ivQr");
            Intrinsics.checkNotNull(context);
            companion4.generateQR(ivQr, nameShow$default + "\n" + ((Object) text) + " " + apprentice + "\n" + ((Object) text2) + " " + userName + "\n" + ((Object) text3) + " " + category + "\n" + ((Object) text4) + " " + str, ContextCompat.getColor(context, R.color.transparent), -1, 1000);
        }
    }

    public final void starTimerClass(Activity context, FragmentClassInCourseBinding binding, ConfigurationSessionDto sessionDto) {
        Integer duration;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(sessionDto, "sessionDto");
        SessionDto sessionDto2 = this.sessionReceived;
        PermissionHelper.INSTANCE.validateNotificationPermissionFlow(context, new d1((sessionDto2 == null || (duration = sessionDto2.getDuration()) == null) ? null : Integer.valueOf(sessionDto.getMinuteForHour() * duration.intValue()), binding, this, context, sessionDto));
    }

    public final void startGpsTrace(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        PermissionHelper.INSTANCE.validateNotificationPermissionFlow(activity, new f1(this, activity, 1));
    }

    public final void stopGpsTrace(Context context) {
        GpsUtil.Companion companion = GpsUtil.INSTANCE;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        companion.stopGps((Activity) context);
    }

    public final void stopServices(Context context) {
        Intrinsics.checkNotNull(context);
        stopTimerService(context);
        stopGpsTrace(context);
        DialogNormalUtil.INSTANCE.closedDetailsDialog();
    }

    public final void stopTimerService(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.stopService(new Intent(context, (Class<?>) TimerService.class));
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(2);
    }

    public final boolean timerServiceIsRunning(Context context) {
        List<ActivityManager.RunningServiceInfo> runningServices;
        Intrinsics.checkNotNullParameter(context, "context");
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
        Iterator<T> it = runningServices.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), TimerService.class.getName())) {
                return true;
            }
        }
        return false;
    }

    public final void validateConnection(Context context, String sessionID, NavController navController, Function0<Unit> function) {
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(function, "function");
        if (context != null) {
            try {
                Activity activity = (Activity) context;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                if (NetworkUtil.INSTANCE.isNetworkAvailable(context)) {
                    function.invoke();
                    return;
                }
                AlertDialog showInformationDialogValidationExam = DialogUtil.INSTANCE.showInformationDialogValidationExam((Activity) context, EnumDialogType.NETWORK_ACCESS_ERROR, false, true, new h1(context, this, function, 0), new i1(this, sessionID, context, navController, 0));
                this.dialog = showInformationDialogValidationExam;
                if (showInformationDialogValidationExam != null) {
                    showInformationDialogValidationExam.show();
                }
            } catch (Exception e) {
                e.toString();
            }
        }
    }

    public final void validateFinishedClass(Context context, String timeCurrent, NavController findNavController, String sessionID) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(timeCurrent, "timeCurrent");
        Intrinsics.checkNotNullParameter(findNavController, "findNavController");
        Intrinsics.checkNotNullParameter(sessionID, "sessionID");
        if (Intrinsics.areEqual(getDurationExtraFormat(), timeCurrent)) {
            dialogMaxExtraTimeClass(context, findNavController, sessionID);
        }
        if (Intrinsics.areEqual(getDurationFormat(), timeCurrent) && this.isExtraTime.getValue().booleanValue()) {
            dialogExtraTimeClass(context, sessionID, findNavController);
        }
    }

    public final void validateIsMock(Context context, Activity activity) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        GpsUtil.INSTANCE.locationEnabled(context, new l1(this, context, activity, 0));
    }

    public final void validateSliderExtra(FragmentClassInCourseBinding binding) {
        Integer num;
        Integer duration;
        Intrinsics.checkNotNullParameter(binding, "binding");
        SessionDto sessionDto = this.sessionReceived;
        if (sessionDto == null || (duration = sessionDto.getDuration()) == null) {
            num = null;
        } else {
            int intValue = duration.intValue();
            ConfigurationSessionDto value = this._configSession.getValue();
            num = Integer.valueOf(intValue * (value != null ? value.getMinuteForHour() : 60));
        }
        Intrinsics.checkNotNull(num);
        int intValue2 = num.intValue();
        binding.includeChronometer.sliderTimer.setValueTo(intValue2 + (this._configSession.getValue() != null ? r1.getMinToleranceDepartureAfter() : 15));
    }

    public final boolean validateTimeClass() {
        return this.isMinimumClassTime.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLastQuestion() {
        List<QuestionDto> value = this._questions.getValue();
        if (value != null && !value.isEmpty()) {
            for (QuestionDto questionDto : value) {
                if (questionDto.getStatus() == com.gse.aulapp.model.dto.Status.CURRENT || questionDto.getStatus() == com.gse.aulapp.model.dto.Status.NOT_APPLICABLE || questionDto.getStatus() == com.gse.aulapp.model.dto.Status.NOT_ANSWERED) {
                    return true;
                }
            }
        }
        return false;
    }
}
