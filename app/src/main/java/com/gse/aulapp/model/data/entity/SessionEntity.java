package com.gse.aulapp.model.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import co.ceduladigital.sdk.q;
import co.ceduladigital.sdk.x5;
import com.google.gson.annotations.Expose;
import com.karumi.dexter.BuildConfig;
import defpackage.a;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0003\b\u0080\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u001e\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010&\u001a\u00020\b¢\u0006\u0004\b'\u0010(B\t\b\u0016¢\u0006\u0004\b'\u0010)J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010}\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010PJ\u0011\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010PJ\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010PJ\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010PJ\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u001eHÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0002\u0010kJ\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\bHÆ\u0003J\u0090\u0003\u0010\u009a\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\bHÆ\u0001¢\u0006\u0003\u0010\u009b\u0001J\u0007\u0010\u009c\u0001\u001a\u00020\bJ\u0016\u0010\u009d\u0001\u001a\u00020\u001e2\n\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u0001HÖ\u0003J\n\u0010 \u0001\u001a\u00020\bHÖ\u0001J\n\u0010¡\u0001\u001a\u00020\u0003HÖ\u0001J\u001b\u0010¢\u0001\u001a\u00030£\u00012\b\u0010¤\u0001\u001a\u00030¥\u00012\u0007\u0010¦\u0001\u001a\u00020\bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010+\"\u0004\b:\u0010-R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R \u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010+\"\u0004\b>\u0010-R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010+\"\u0004\b@\u0010-R \u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010+\"\u0004\bB\u0010-R \u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010+\"\u0004\bD\u0010-R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010+\"\u0004\bF\u0010-R \u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010+\"\u0004\bH\u0010-R \u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010+\"\u0004\bJ\u0010-R \u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010+\"\u0004\bL\u0010-R \u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010+\"\u0004\bN\u0010-R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010S\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010S\u001a\u0004\bT\u0010P\"\u0004\bU\u0010RR\"\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010S\u001a\u0004\bV\u0010P\"\u0004\bW\u0010RR\"\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010S\u001a\u0004\bX\u0010P\"\u0004\bY\u0010RR \u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010+\"\u0004\b[\u0010-R \u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010+\"\u0004\b]\u0010-R \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010+\"\u0004\b_\u0010-R \u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010+\"\u0004\ba\u0010-R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010b\"\u0004\bc\u0010dR\u001e\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010b\"\u0004\be\u0010dR\u001e\u0010 \u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010b\"\u0004\bg\u0010dR \u0010!\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010+\"\u0004\bi\u0010-R\"\u0010\"\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010n\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR \u0010#\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010+\"\u0004\bp\u0010-R \u0010$\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010+\"\u0004\br\u0010-R\u001e\u0010%\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001e\u0010&\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010t\"\u0004\bx\u0010v¨\u0006§\u0001"}, d2 = {"Lcom/gse/aulapp/model/data/entity/SessionEntity;", "Landroid/os/Parcelable;", "id", BuildConfig.FLAVOR, "date", "start", "end", "duration", BuildConfig.FLAVOR, "center", "category", "instructorID", "classroomID", "vehicleID", "cellphoneNumber", "apprentice", "type", "course", "lessonID", "dateHead", "dateStartEntryClass", BuildConfig.FLAVOR, "dateEndEntryClass", "dateEndClass", "dateClass", "apprenticeEmail", "apprenticeID", "apprenticeDocumentNumber", "apprenticeDocumentType", "isFinished", BuildConfig.FLAVOR, "isPendingSync", "startExam", "dateStartEntry", "enabledToStart", "messageEnable", "statusAppointment", "minToleranceEntryBefore", "minToleranceEntryAfter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;II)V", "()V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getDate", "setDate", "getStart", "setStart", "getEnd", "setEnd", "getDuration", "()Ljava/lang/Integer;", "setDuration", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCenter", "setCenter", "getCategory", "setCategory", "getInstructorID", "setInstructorID", "getClassroomID", "setClassroomID", "getVehicleID", "setVehicleID", "getCellphoneNumber", "setCellphoneNumber", "getApprentice", "setApprentice", "getType", "setType", "getCourse", "setCourse", "getLessonID", "setLessonID", "getDateHead", "setDateHead", "getDateStartEntryClass", "()Ljava/lang/Long;", "setDateStartEntryClass", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getDateEndEntryClass", "setDateEndEntryClass", "getDateEndClass", "setDateEndClass", "getDateClass", "setDateClass", "getApprenticeEmail", "setApprenticeEmail", "getApprenticeID", "setApprenticeID", "getApprenticeDocumentNumber", "setApprenticeDocumentNumber", "getApprenticeDocumentType", "setApprenticeDocumentType", "()Z", "setFinished", "(Z)V", "setPendingSync", "getStartExam", "setStartExam", "getDateStartEntry", "setDateStartEntry", "getEnabledToStart", "()Ljava/lang/Boolean;", "setEnabledToStart", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getMessageEnable", "setMessageEnable", "getStatusAppointment", "setStatusAppointment", "getMinToleranceEntryBefore", "()I", "setMinToleranceEntryBefore", "(I)V", "getMinToleranceEntryAfter", "setMinToleranceEntryAfter", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;II)Lcom/gse/aulapp/model/data/entity/SessionEntity;", "describeContents", "equals", "other", BuildConfig.FLAVOR, "hashCode", "toString", "writeToParcel", BuildConfig.FLAVOR, "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SessionEntity implements Parcelable {
    public static final Parcelable.Creator<SessionEntity> CREATOR = new Creator();

    @Expose
    private String apprentice;
    private String apprenticeDocumentNumber;
    private String apprenticeDocumentType;
    private String apprenticeEmail;
    private String apprenticeID;
    private String category;
    private String cellphoneNumber;
    private String center;
    private String classroomID;
    private String course;
    private String date;
    private Long dateClass;
    private Long dateEndClass;
    private Long dateEndEntryClass;
    private String dateHead;
    private String dateStartEntry;
    private Long dateStartEntryClass;
    private Integer duration;
    private Boolean enabledToStart;
    private String end;
    private String id;
    private String instructorID;
    private boolean isFinished;
    private boolean isPendingSync;
    private String lessonID;
    private String messageEnable;
    private int minToleranceEntryAfter;
    private int minToleranceEntryBefore;
    private String start;
    private boolean startExam;
    private String statusAppointment;
    private String type;
    private String vehicleID;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SessionEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionEntity createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf5 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            boolean z4 = false;
            boolean z5 = true;
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
                z3 = z;
            } else {
                z2 = true;
                z5 = z;
                z3 = z5;
            }
            String readString20 = parcel.readString();
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z2 = z3;
                }
                bool = Boolean.valueOf(z2);
            }
            return new SessionEntity(readString, readString2, readString3, readString4, valueOf, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, valueOf2, valueOf3, valueOf4, valueOf5, readString16, readString17, readString18, readString19, z6, z4, z5, readString20, bool, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionEntity[] newArray(int i) {
            return new SessionEntity[i];
        }
    }

    public SessionEntity(String id, String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l, Long l2, Long l3, Long l4, String str15, String str16, String str17, String str18, boolean z, boolean z2, boolean z3, String str19, Boolean bool, String str20, String str21, int i, int i2) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.date = str;
        this.start = str2;
        this.end = str3;
        this.duration = num;
        this.center = str4;
        this.category = str5;
        this.instructorID = str6;
        this.classroomID = str7;
        this.vehicleID = str8;
        this.cellphoneNumber = str9;
        this.apprentice = str10;
        this.type = str11;
        this.course = str12;
        this.lessonID = str13;
        this.dateHead = str14;
        this.dateStartEntryClass = l;
        this.dateEndEntryClass = l2;
        this.dateEndClass = l3;
        this.dateClass = l4;
        this.apprenticeEmail = str15;
        this.apprenticeID = str16;
        this.apprenticeDocumentNumber = str17;
        this.apprenticeDocumentType = str18;
        this.isFinished = z;
        this.isPendingSync = z2;
        this.startExam = z3;
        this.dateStartEntry = str19;
        this.enabledToStart = bool;
        this.messageEnable = str20;
        this.statusAppointment = str21;
        this.minToleranceEntryBefore = i;
        this.minToleranceEntryAfter = i2;
    }

    public static /* synthetic */ SessionEntity copy$default(SessionEntity sessionEntity, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Long l, Long l2, Long l3, Long l4, String str16, String str17, String str18, String str19, boolean z, boolean z2, boolean z3, String str20, Boolean bool, String str21, String str22, int i, int i2, int i3, int i4, Object obj) {
        int i5;
        int i6;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        String str23;
        String str24;
        String str25;
        String str26;
        boolean z4;
        boolean z5;
        boolean z6;
        String str27;
        Boolean bool2;
        String str28;
        String str29;
        String str30;
        String str31;
        String str32;
        String str33;
        Integer num2;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        String str43;
        String str44 = (i3 & 1) != 0 ? sessionEntity.id : str;
        String str45 = (i3 & 2) != 0 ? sessionEntity.date : str2;
        String str46 = (i3 & 4) != 0 ? sessionEntity.start : str3;
        String str47 = (i3 & 8) != 0 ? sessionEntity.end : str4;
        Integer num3 = (i3 & 16) != 0 ? sessionEntity.duration : num;
        String str48 = (i3 & 32) != 0 ? sessionEntity.center : str5;
        String str49 = (i3 & 64) != 0 ? sessionEntity.category : str6;
        String str50 = (i3 & 128) != 0 ? sessionEntity.instructorID : str7;
        String str51 = (i3 & 256) != 0 ? sessionEntity.classroomID : str8;
        String str52 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? sessionEntity.vehicleID : str9;
        String str53 = (i3 & 1024) != 0 ? sessionEntity.cellphoneNumber : str10;
        String str54 = (i3 & 2048) != 0 ? sessionEntity.apprentice : str11;
        String str55 = (i3 & ConstantsKt.DEFAULT_BLOCK_SIZE) != 0 ? sessionEntity.type : str12;
        String str56 = (i3 & ConstantsKt.DEFAULT_BUFFER_SIZE) != 0 ? sessionEntity.course : str13;
        String str57 = str44;
        String str58 = (i3 & 16384) != 0 ? sessionEntity.lessonID : str14;
        String str59 = (i3 & 32768) != 0 ? sessionEntity.dateHead : str15;
        Long l9 = (i3 & 65536) != 0 ? sessionEntity.dateStartEntryClass : l;
        Long l10 = (i3 & 131072) != 0 ? sessionEntity.dateEndEntryClass : l2;
        Long l11 = (i3 & 262144) != 0 ? sessionEntity.dateEndClass : l3;
        Long l12 = (i3 & 524288) != 0 ? sessionEntity.dateClass : l4;
        String str60 = (i3 & 1048576) != 0 ? sessionEntity.apprenticeEmail : str16;
        String str61 = (i3 & 2097152) != 0 ? sessionEntity.apprenticeID : str17;
        String str62 = (i3 & 4194304) != 0 ? sessionEntity.apprenticeDocumentNumber : str18;
        String str63 = (i3 & 8388608) != 0 ? sessionEntity.apprenticeDocumentType : str19;
        boolean z7 = (i3 & 16777216) != 0 ? sessionEntity.isFinished : z;
        boolean z8 = (i3 & 33554432) != 0 ? sessionEntity.isPendingSync : z2;
        boolean z9 = (i3 & 67108864) != 0 ? sessionEntity.startExam : z3;
        String str64 = (i3 & 134217728) != 0 ? sessionEntity.dateStartEntry : str20;
        Boolean bool3 = (i3 & 268435456) != 0 ? sessionEntity.enabledToStart : bool;
        String str65 = (i3 & 536870912) != 0 ? sessionEntity.messageEnable : str21;
        String str66 = (i3 & 1073741824) != 0 ? sessionEntity.statusAppointment : str22;
        int i7 = (i3 & IntCompanionObject.MIN_VALUE) != 0 ? sessionEntity.minToleranceEntryBefore : i;
        if ((i4 & 1) != 0) {
            i6 = i7;
            i5 = sessionEntity.minToleranceEntryAfter;
            l6 = l10;
            l7 = l11;
            l8 = l12;
            str23 = str60;
            str24 = str61;
            str25 = str62;
            str26 = str63;
            z4 = z7;
            z5 = z8;
            z6 = z9;
            str27 = str64;
            bool2 = bool3;
            str28 = str65;
            str29 = str66;
            str30 = str58;
            str32 = str46;
            str33 = str47;
            num2 = num3;
            str34 = str48;
            str35 = str49;
            str36 = str50;
            str37 = str51;
            str38 = str52;
            str39 = str53;
            str40 = str54;
            str41 = str55;
            str42 = str56;
            str43 = str59;
            l5 = l9;
            str31 = str45;
        } else {
            i5 = i2;
            i6 = i7;
            l5 = l9;
            l6 = l10;
            l7 = l11;
            l8 = l12;
            str23 = str60;
            str24 = str61;
            str25 = str62;
            str26 = str63;
            z4 = z7;
            z5 = z8;
            z6 = z9;
            str27 = str64;
            bool2 = bool3;
            str28 = str65;
            str29 = str66;
            str30 = str58;
            str31 = str45;
            str32 = str46;
            str33 = str47;
            num2 = num3;
            str34 = str48;
            str35 = str49;
            str36 = str50;
            str37 = str51;
            str38 = str52;
            str39 = str53;
            str40 = str54;
            str41 = str55;
            str42 = str56;
            str43 = str59;
        }
        return sessionEntity.copy(str57, str31, str32, str33, num2, str34, str35, str36, str37, str38, str39, str40, str41, str42, str30, str43, l5, l6, l7, l8, str23, str24, str25, str26, z4, z5, z6, str27, bool2, str28, str29, i6, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getVehicleID() {
        return this.vehicleID;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCellphoneNumber() {
        return this.cellphoneNumber;
    }

    /* renamed from: component12, reason: from getter */
    public final String getApprentice() {
        return this.apprentice;
    }

    /* renamed from: component13, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component14, reason: from getter */
    public final String getCourse() {
        return this.course;
    }

    /* renamed from: component15, reason: from getter */
    public final String getLessonID() {
        return this.lessonID;
    }

    /* renamed from: component16, reason: from getter */
    public final String getDateHead() {
        return this.dateHead;
    }

    /* renamed from: component17, reason: from getter */
    public final Long getDateStartEntryClass() {
        return this.dateStartEntryClass;
    }

    /* renamed from: component18, reason: from getter */
    public final Long getDateEndEntryClass() {
        return this.dateEndEntryClass;
    }

    /* renamed from: component19, reason: from getter */
    public final Long getDateEndClass() {
        return this.dateEndClass;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component20, reason: from getter */
    public final Long getDateClass() {
        return this.dateClass;
    }

    /* renamed from: component21, reason: from getter */
    public final String getApprenticeEmail() {
        return this.apprenticeEmail;
    }

    /* renamed from: component22, reason: from getter */
    public final String getApprenticeID() {
        return this.apprenticeID;
    }

    /* renamed from: component23, reason: from getter */
    public final String getApprenticeDocumentNumber() {
        return this.apprenticeDocumentNumber;
    }

    /* renamed from: component24, reason: from getter */
    public final String getApprenticeDocumentType() {
        return this.apprenticeDocumentType;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsFinished() {
        return this.isFinished;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsPendingSync() {
        return this.isPendingSync;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getStartExam() {
        return this.startExam;
    }

    /* renamed from: component28, reason: from getter */
    public final String getDateStartEntry() {
        return this.dateStartEntry;
    }

    /* renamed from: component29, reason: from getter */
    public final Boolean getEnabledToStart() {
        return this.enabledToStart;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStart() {
        return this.start;
    }

    /* renamed from: component30, reason: from getter */
    public final String getMessageEnable() {
        return this.messageEnable;
    }

    /* renamed from: component31, reason: from getter */
    public final String getStatusAppointment() {
        return this.statusAppointment;
    }

    /* renamed from: component32, reason: from getter */
    public final int getMinToleranceEntryBefore() {
        return this.minToleranceEntryBefore;
    }

    /* renamed from: component33, reason: from getter */
    public final int getMinToleranceEntryAfter() {
        return this.minToleranceEntryAfter;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEnd() {
        return this.end;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getDuration() {
        return this.duration;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCenter() {
        return this.center;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component8, reason: from getter */
    public final String getInstructorID() {
        return this.instructorID;
    }

    /* renamed from: component9, reason: from getter */
    public final String getClassroomID() {
        return this.classroomID;
    }

    public final SessionEntity copy(String id, String date, String start, String end, Integer duration, String center, String category, String instructorID, String classroomID, String vehicleID, String cellphoneNumber, String apprentice, String type, String course, String lessonID, String dateHead, Long dateStartEntryClass, Long dateEndEntryClass, Long dateEndClass, Long dateClass, String apprenticeEmail, String apprenticeID, String apprenticeDocumentNumber, String apprenticeDocumentType, boolean isFinished, boolean isPendingSync, boolean startExam, String dateStartEntry, Boolean enabledToStart, String messageEnable, String statusAppointment, int minToleranceEntryBefore, int minToleranceEntryAfter) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new SessionEntity(id, date, start, end, duration, center, category, instructorID, classroomID, vehicleID, cellphoneNumber, apprentice, type, course, lessonID, dateHead, dateStartEntryClass, dateEndEntryClass, dateEndClass, dateClass, apprenticeEmail, apprenticeID, apprenticeDocumentNumber, apprenticeDocumentType, isFinished, isPendingSync, startExam, dateStartEntry, enabledToStart, messageEnable, statusAppointment, minToleranceEntryBefore, minToleranceEntryAfter);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionEntity)) {
            return false;
        }
        SessionEntity sessionEntity = (SessionEntity) other;
        return Intrinsics.areEqual(this.id, sessionEntity.id) && Intrinsics.areEqual(this.date, sessionEntity.date) && Intrinsics.areEqual(this.start, sessionEntity.start) && Intrinsics.areEqual(this.end, sessionEntity.end) && Intrinsics.areEqual(this.duration, sessionEntity.duration) && Intrinsics.areEqual(this.center, sessionEntity.center) && Intrinsics.areEqual(this.category, sessionEntity.category) && Intrinsics.areEqual(this.instructorID, sessionEntity.instructorID) && Intrinsics.areEqual(this.classroomID, sessionEntity.classroomID) && Intrinsics.areEqual(this.vehicleID, sessionEntity.vehicleID) && Intrinsics.areEqual(this.cellphoneNumber, sessionEntity.cellphoneNumber) && Intrinsics.areEqual(this.apprentice, sessionEntity.apprentice) && Intrinsics.areEqual(this.type, sessionEntity.type) && Intrinsics.areEqual(this.course, sessionEntity.course) && Intrinsics.areEqual(this.lessonID, sessionEntity.lessonID) && Intrinsics.areEqual(this.dateHead, sessionEntity.dateHead) && Intrinsics.areEqual(this.dateStartEntryClass, sessionEntity.dateStartEntryClass) && Intrinsics.areEqual(this.dateEndEntryClass, sessionEntity.dateEndEntryClass) && Intrinsics.areEqual(this.dateEndClass, sessionEntity.dateEndClass) && Intrinsics.areEqual(this.dateClass, sessionEntity.dateClass) && Intrinsics.areEqual(this.apprenticeEmail, sessionEntity.apprenticeEmail) && Intrinsics.areEqual(this.apprenticeID, sessionEntity.apprenticeID) && Intrinsics.areEqual(this.apprenticeDocumentNumber, sessionEntity.apprenticeDocumentNumber) && Intrinsics.areEqual(this.apprenticeDocumentType, sessionEntity.apprenticeDocumentType) && this.isFinished == sessionEntity.isFinished && this.isPendingSync == sessionEntity.isPendingSync && this.startExam == sessionEntity.startExam && Intrinsics.areEqual(this.dateStartEntry, sessionEntity.dateStartEntry) && Intrinsics.areEqual(this.enabledToStart, sessionEntity.enabledToStart) && Intrinsics.areEqual(this.messageEnable, sessionEntity.messageEnable) && Intrinsics.areEqual(this.statusAppointment, sessionEntity.statusAppointment) && this.minToleranceEntryBefore == sessionEntity.minToleranceEntryBefore && this.minToleranceEntryAfter == sessionEntity.minToleranceEntryAfter;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.date;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.start;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.end;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.duration;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.center;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.category;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.instructorID;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.classroomID;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.vehicleID;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.cellphoneNumber;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.apprentice;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.type;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.course;
        int hashCode14 = (hashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.lessonID;
        int hashCode15 = (hashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.dateHead;
        int hashCode16 = (hashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Long l = this.dateStartEntryClass;
        int hashCode17 = (hashCode16 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.dateEndEntryClass;
        int hashCode18 = (hashCode17 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.dateEndClass;
        int hashCode19 = (hashCode18 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.dateClass;
        int hashCode20 = (hashCode19 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str15 = this.apprenticeEmail;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.apprenticeID;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.apprenticeDocumentNumber;
        int hashCode23 = (hashCode22 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.apprenticeDocumentType;
        int g = a.g(this.startExam, a.g(this.isPendingSync, a.g(this.isFinished, (hashCode23 + (str18 == null ? 0 : str18.hashCode())) * 31, 31), 31), 31);
        String str19 = this.dateStartEntry;
        int hashCode24 = (g + (str19 == null ? 0 : str19.hashCode())) * 31;
        Boolean bool = this.enabledToStart;
        int hashCode25 = (hashCode24 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str20 = this.messageEnable;
        int hashCode26 = (hashCode25 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.statusAppointment;
        return Integer.hashCode(this.minToleranceEntryAfter) + x5.a(this.minToleranceEntryBefore, (hashCode26 + (str21 != null ? str21.hashCode() : 0)) * 31, 31);
    }

    public final boolean isFinished() {
        return this.isFinished;
    }

    public final boolean isPendingSync() {
        return this.isPendingSync;
    }

    public final void setApprentice(String str) {
        this.apprentice = str;
    }

    public final void setApprenticeDocumentNumber(String str) {
        this.apprenticeDocumentNumber = str;
    }

    public final void setApprenticeDocumentType(String str) {
        this.apprenticeDocumentType = str;
    }

    public final void setApprenticeEmail(String str) {
        this.apprenticeEmail = str;
    }

    public final void setApprenticeID(String str) {
        this.apprenticeID = str;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setCellphoneNumber(String str) {
        this.cellphoneNumber = str;
    }

    public final void setCenter(String str) {
        this.center = str;
    }

    public final void setClassroomID(String str) {
        this.classroomID = str;
    }

    public final void setCourse(String str) {
        this.course = str;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setDateClass(Long l) {
        this.dateClass = l;
    }

    public final void setDateEndClass(Long l) {
        this.dateEndClass = l;
    }

    public final void setDateEndEntryClass(Long l) {
        this.dateEndEntryClass = l;
    }

    public final void setDateHead(String str) {
        this.dateHead = str;
    }

    public final void setDateStartEntry(String str) {
        this.dateStartEntry = str;
    }

    public final void setDateStartEntryClass(Long l) {
        this.dateStartEntryClass = l;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setEnabledToStart(Boolean bool) {
        this.enabledToStart = bool;
    }

    public final void setEnd(String str) {
        this.end = str;
    }

    public final void setFinished(boolean z) {
        this.isFinished = z;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setInstructorID(String str) {
        this.instructorID = str;
    }

    public final void setLessonID(String str) {
        this.lessonID = str;
    }

    public final void setMessageEnable(String str) {
        this.messageEnable = str;
    }

    public final void setMinToleranceEntryAfter(int i) {
        this.minToleranceEntryAfter = i;
    }

    public final void setMinToleranceEntryBefore(int i) {
        this.minToleranceEntryBefore = i;
    }

    public final void setPendingSync(boolean z) {
        this.isPendingSync = z;
    }

    public final void setStart(String str) {
        this.start = str;
    }

    public final void setStartExam(boolean z) {
        this.startExam = z;
    }

    public final void setStatusAppointment(String str) {
        this.statusAppointment = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setVehicleID(String str) {
        this.vehicleID = str;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.date;
        String str3 = this.start;
        String str4 = this.end;
        Integer num = this.duration;
        String str5 = this.center;
        String str6 = this.category;
        String str7 = this.instructorID;
        String str8 = this.classroomID;
        String str9 = this.vehicleID;
        String str10 = this.cellphoneNumber;
        String str11 = this.apprentice;
        String str12 = this.type;
        String str13 = this.course;
        String str14 = this.lessonID;
        String str15 = this.dateHead;
        Long l = this.dateStartEntryClass;
        Long l2 = this.dateEndEntryClass;
        Long l3 = this.dateEndClass;
        Long l4 = this.dateClass;
        String str16 = this.apprenticeEmail;
        String str17 = this.apprenticeID;
        String str18 = this.apprenticeDocumentNumber;
        String str19 = this.apprenticeDocumentType;
        boolean z = this.isFinished;
        boolean z2 = this.isPendingSync;
        boolean z3 = this.startExam;
        String str20 = this.dateStartEntry;
        Boolean bool = this.enabledToStart;
        String str21 = this.messageEnable;
        String str22 = this.statusAppointment;
        int i = this.minToleranceEntryBefore;
        int i2 = this.minToleranceEntryAfter;
        StringBuilder r = x5.r("SessionEntity(id=", str, ", date=", str2, ", start=");
        x5.z(r, str3, ", end=", str4, ", duration=");
        r.append(num);
        r.append(", center=");
        r.append(str5);
        r.append(", category=");
        x5.z(r, str6, ", instructorID=", str7, ", classroomID=");
        x5.z(r, str8, ", vehicleID=", str9, ", cellphoneNumber=");
        x5.z(r, str10, ", apprentice=", str11, ", type=");
        x5.z(r, str12, ", course=", str13, ", lessonID=");
        x5.z(r, str14, ", dateHead=", str15, ", dateStartEntryClass=");
        r.append(l);
        r.append(", dateEndEntryClass=");
        r.append(l2);
        r.append(", dateEndClass=");
        r.append(l3);
        r.append(", dateClass=");
        r.append(l4);
        r.append(", apprenticeEmail=");
        x5.z(r, str16, ", apprenticeID=", str17, ", apprenticeDocumentNumber=");
        x5.z(r, str18, ", apprenticeDocumentType=", str19, ", isFinished=");
        r.append(z);
        r.append(", isPendingSync=");
        r.append(z2);
        r.append(", startExam=");
        r.append(z3);
        r.append(", dateStartEntry=");
        r.append(str20);
        r.append(", enabledToStart=");
        r.append(bool);
        r.append(", messageEnable=");
        r.append(str21);
        r.append(", statusAppointment=");
        r.append(str22);
        r.append(", minToleranceEntryBefore=");
        r.append(i);
        r.append(", minToleranceEntryAfter=");
        return q.k(r, i2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.date);
        dest.writeString(this.start);
        dest.writeString(this.end);
        Integer num = this.duration;
        if (num == null) {
            dest.writeInt(0);
        } else {
            x5.w(dest, 1, num);
        }
        dest.writeString(this.center);
        dest.writeString(this.category);
        dest.writeString(this.instructorID);
        dest.writeString(this.classroomID);
        dest.writeString(this.vehicleID);
        dest.writeString(this.cellphoneNumber);
        dest.writeString(this.apprentice);
        dest.writeString(this.type);
        dest.writeString(this.course);
        dest.writeString(this.lessonID);
        dest.writeString(this.dateHead);
        Long l = this.dateStartEntryClass;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
        Long l2 = this.dateEndEntryClass;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l2.longValue());
        }
        Long l3 = this.dateEndClass;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l3.longValue());
        }
        Long l4 = this.dateClass;
        if (l4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l4.longValue());
        }
        dest.writeString(this.apprenticeEmail);
        dest.writeString(this.apprenticeID);
        dest.writeString(this.apprenticeDocumentNumber);
        dest.writeString(this.apprenticeDocumentType);
        dest.writeInt(this.isFinished ? 1 : 0);
        dest.writeInt(this.isPendingSync ? 1 : 0);
        dest.writeInt(this.startExam ? 1 : 0);
        dest.writeString(this.dateStartEntry);
        Boolean bool = this.enabledToStart;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            x5.v(dest, 1, bool);
        }
        dest.writeString(this.messageEnable);
        dest.writeString(this.statusAppointment);
        dest.writeInt(this.minToleranceEntryBefore);
        dest.writeInt(this.minToleranceEntryAfter);
    }

    public SessionEntity() {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, null, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, null, null, null, null, null, null, null, null, null, null, false, false, false, BuildConfig.FLAVOR, Boolean.FALSE, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0, 0);
    }
}
