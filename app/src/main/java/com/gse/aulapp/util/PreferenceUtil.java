package com.gse.aulapp.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.model.dto.CenterDto;
import com.gse.aulapp.model.dto.LoginObject;
import com.gse.aulapp.model.enumerate.EnumApps;
import com.karumi.dexter.BuildConfig;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/PreferenceUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class PreferenceUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static Gson gson = new Gson();
    private static SharedPreferences sharedPreferences;

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0011\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u000bJ!\u0010\u0017\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0017\u0010\u000eJ!\u0010\u0019\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0019\u0010\u000eJ!\u0010\u001b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\t¢\u0006\u0004\b&\u0010\u000eJ\u0015\u0010'\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u000bJ\u001f\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b,\u0010\u000bJ\u001f\u0010.\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b.\u0010\u000eJ!\u00100\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b0\u0010\u000eJ\u0017\u00101\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b1\u0010\u000bJ\u001f\u00102\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b2\u0010\u000eJ\u000f\u00103\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b3\u00104J#\u00108\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u00107\u001a\b\u0012\u0004\u0012\u00020605¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\b\u0012\u0004\u0012\u000206052\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010<\u001a\u0004\u0018\u000106¢\u0006\u0004\b=\u0010>J\u0019\u0010?\u001a\u0004\u0018\u0001062\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u001a¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bD\u0010EJ!\u0010F\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bF\u0010\u000eJ!\u0010H\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010G\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bH\u0010\u000eJ!\u0010J\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010I\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bJ\u0010\u000eJ\u0017\u0010K\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bK\u0010\u000bJ!\u0010M\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010L\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bM\u0010\u000eJ!\u0010N\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010L\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bN\u0010\u000eJ!\u0010P\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010O\u001a\u0004\u0018\u00010\t¢\u0006\u0004\bP\u0010\u000eJ\u0017\u0010Q\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bQ\u0010\u000bJ\u001d\u0010S\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\t¢\u0006\u0004\bS\u0010\u000eJ\u0017\u0010T\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bT\u0010\u000bJ\u001d\u0010V\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010U\u001a\u00020\u001a¢\u0006\u0004\bV\u0010CJ\u0017\u0010W\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bW\u0010EJ\u001f\u0010X\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010A\u001a\u00020\u001a¢\u0006\u0004\bX\u0010CJ\u0017\u0010Y\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bY\u0010EJ\u001d\u0010[\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020\u001a¢\u0006\u0004\b[\u0010CJ+\u0010^\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010\t2\b\u0010]\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b^\u0010_J)\u0010^\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010\t2\u0006\u0010]\u001a\u00020\u001aH\u0002¢\u0006\u0004\b^\u0010`J+\u0010^\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010\t2\b\u0010]\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b^\u0010aJ)\u0010c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\t2\b\u0010b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\bc\u0010dJ!\u0010e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\be\u0010\u000eJ-\u0010g\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010\t2\b\u0010f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bg\u0010hJ+\u0010g\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\\\u001a\u0004\u0018\u00010\t2\u0006\u0010f\u001a\u00020\u001aH\u0002¢\u0006\u0004\bg\u0010iJ5\u0010l\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\\\u001a\u00020\t2\u0006\u0010k\u001a\u00020j2\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bl\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010q\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010s\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bs\u0010rR\u0014\u0010t\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bt\u0010rR\u0014\u0010u\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bu\u0010rR\u0014\u0010v\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bv\u0010rR\u0014\u0010w\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bw\u0010rR\u0014\u0010x\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bx\u0010rR\u0014\u0010y\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\by\u0010rR\u0014\u0010z\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\bz\u0010rR\u0014\u0010{\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b{\u0010rR\u0014\u0010|\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b|\u0010rR\u0014\u0010}\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b}\u0010rR\u0014\u0010~\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b~\u0010rR\u0014\u0010\u007f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u007f\u0010rR\u0016\u0010\u0080\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010rR\u0016\u0010\u0081\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010rR\u0016\u0010\u0082\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010rR\u0016\u0010\u0083\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010rR\u0016\u0010\u0084\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010rR\u0016\u0010\u0085\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010rR\u0016\u0010\u0086\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010rR\u0016\u0010\u0087\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010rR\u0016\u0010\u0088\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010rR\u0016\u0010\u0089\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010rR\u0016\u0010\u008a\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010rR\u0016\u0010\u008b\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010rR\u0016\u0010\u008c\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010rR\u0016\u0010\u008d\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010rR\u0016\u0010\u008e\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010rR\u0016\u0010\u008f\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010rR\u0016\u0010\u0090\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010rR\u001a\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u0094\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010rR\u0016\u0010\u0095\u0001\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010rR\u0018\u0010\u0096\u0001\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010r¨\u0006\u0097\u0001"}, d2 = {"Lcom/gse/aulapp/util/PreferenceUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "clearToken", "(Landroid/content/Context;)V", BuildConfig.FLAVOR, "getToken", "(Landroid/content/Context;)Ljava/lang/String;", "token", "saveToken", "(Landroid/content/Context;Ljava/lang/String;)V", "getEmail", "email", "saveEmail", "sessionID", "saveSessionIdByTimeService", "getSessionIdByTimeService", "clearTokenTemporal", "getDocumentNumber", "saveDocumentNumber", "dateEnrollment", "saveDateEnrollment", BuildConfig.FLAVOR, "saveFullEnrollment", "(Landroid/content/Context;Ljava/lang/Boolean;)V", BuildConfig.FLAVOR, "validationsPercentage", "saveValidationsPercentage", "(Landroid/content/Context;Ljava/lang/Integer;)V", "Lcom/gse/aulapp/model/enumerate/EnumApps;", "entryValidation", "saveEntryValidation", "(Landroid/content/Context;Lcom/gse/aulapp/model/enumerate/EnumApps;)V", "url", "saveScheduleExamsUrl", "getScheduleExamsUrl", "Lcom/gse/aulapp/model/dto/LoginObject;", "fourFingersIdentyID", "saveFourFingersIdentyID", "(Landroid/content/Context;Lcom/gse/aulapp/model/dto/LoginObject;)V", "getUserId", "userId", "saveUserId", "userName", "saveUserName", "getUserName", "saveCurrentSessionID", "getCurrentSessionID", "()Ljava/lang/String;", BuildConfig.FLAVOR, "Lcom/gse/aulapp/model/dto/CenterDto;", "listCenterDto", "saveListCenterCEA", "(Landroid/content/Context;Ljava/util/List;)V", "getListCenterCEA", "(Landroid/content/Context;)Ljava/util/List;", "selectedCEA", "saveCEA", "(Landroid/content/Context;Lcom/gse/aulapp/model/dto/CenterDto;)V", "getCEA", "(Landroid/content/Context;)Lcom/gse/aulapp/model/dto/CenterDto;", "entry", "saveEntrySession", "(Landroid/content/Context;Z)V", "getEntrySession", "(Landroid/content/Context;)Ljava/lang/Boolean;", "saveFullName", "role", "saveRole", "docType", "saveDocType", "getDocType", "fraudInformationID", "saveFraudInformationID", "saveBiometrixInformationID", "tokenTemporal", "saveTokenTemporal", "getTokenTemporal", "startTime", "saveStartClassOrExam", "getStartClassOrExam", "enable", "saveUserDemo", "getUserDemo", "saveBiometricException", "getIsFirstLogin", "isFirstLogin", "saveIsFirstLogin", "key", "value", "savePreferences", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/content/Context;Ljava/lang/String;Z)V", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;)V", "object", "savePreferencesObject", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Object;)V", "removePreferenceByKey", "defaultValue", "getPreferences", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "(Landroid/content/Context;Ljava/lang/String;Z)Ljava/lang/Boolean;", "Ljava/lang/reflect/Type;", "classType", "getPreferencesObject", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/String;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "KEY_TOKEN", "Ljava/lang/String;", "KEY_EMAIL", "KEY_DOCUMENT_NUMBER", "KEY_DATE_ENROLLMENT", "KEY_FULL_ENROLLMENT", "KEY_VALIDATIONS_PERCENTAGE", "KEY_ENTRY_VALIDATIONS", "KEY_SCHEDULE_EXAMS_URL", "KEY_BIOMETRICS_FINGER", "KEY_EXCEPTION_BIOMETRICS_HANDS", "KEY_FOUR_FINGERS_IDENTY", "KEY_USER_ID", "TOKEN_KEY", "KEY_TOKEN_TEMPORAL", "PASSWORD_KEY", "GSE_KEY", "KEY_USER_NAME", "KEY_EMAIL_MAIN_USER", "KEY_CURRENT_SESSION_ID", "KEY_LIST_CENTER_CEA", "KEY_CEA", "KEY_CURRENT_SESSION_ENTRY", "KEY_SAVE_ROLE", "KEY_DOC_TYPE", "KEY_FRAUD_INFORMATION_ID", "KEY_BIOMETRIX_INFORMATION_ID", "KEY_BIOMETRIC_EXCEPTION", "KEY_TIME_SERVICE", "KEY_STAR_CLASS_OR_EXAM", "KEY_USER_DEMO", "KEY_IS_FIRST_LOGIN", "Lcom/google/gson/Gson;", "gson", "Lcom/google/gson/Gson;", "TAG", "PASSWORD_DEFAULT_VALUE", "GSE_KEY_DEFAULT_VALUE", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CenterDto getCEA$default(Companion companion, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = GeneralApp.INSTANCE.getInstance().getApplicationContext();
            }
            return companion.getCEA(context);
        }

        public static /* synthetic */ Boolean getEntrySession$default(Companion companion, Context context, int i, Object obj) {
            if ((i & 1) != 0) {
                context = GeneralApp.INSTANCE.getInstance().getApplicationContext();
            }
            return companion.getEntrySession(context);
        }

        private final String getPreferences(Context context, String key, String defaultValue) {
            if (PreferenceUtil.sharedPreferences == null) {
                PreferenceUtil.sharedPreferences = context.getSharedPreferences("prefs", 0);
            }
            SharedPreferences sharedPreferences = PreferenceUtil.sharedPreferences;
            Intrinsics.checkNotNull(sharedPreferences);
            return sharedPreferences.getString(key, defaultValue);
        }

        private final Object getPreferencesObject(Context context, String key, Type classType, String defaultValue) {
            try {
                return PreferenceUtil.gson.fromJson(getPreferences(context, key, defaultValue), classType);
            } catch (Exception unused) {
                return defaultValue;
            }
        }

        private final void removePreferenceByKey(Context context, String key) {
            try {
                if (PreferenceUtil.sharedPreferences == null) {
                    PreferenceUtil.sharedPreferences = context.getSharedPreferences("prefs", 0);
                }
                SharedPreferences sharedPreferences = PreferenceUtil.sharedPreferences;
                SharedPreferences.Editor edit = sharedPreferences != null ? sharedPreferences.edit() : null;
                if (edit != null) {
                    edit.remove(key);
                    edit.apply();
                }
            } catch (Exception unused) {
            }
        }

        public static /* synthetic */ void saveCurrentSessionID$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                context = GeneralApp.INSTANCE.getInstance().getApplicationContext();
            }
            companion.saveCurrentSessionID(context, str);
        }

        public static /* synthetic */ void saveEntrySession$default(Companion companion, Context context, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                context = GeneralApp.INSTANCE.getInstance().getApplicationContext();
            }
            companion.saveEntrySession(context, z);
        }

        private final void savePreferences(Context context, String key, String value) {
            if (PreferenceUtil.sharedPreferences == null) {
                PreferenceUtil.sharedPreferences = context.getSharedPreferences("prefs", 0);
            }
            SharedPreferences sharedPreferences = PreferenceUtil.sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences != null ? sharedPreferences.edit() : null;
            if (edit != null) {
                edit.putString(key, value);
                edit.apply();
            }
        }

        private final void savePreferencesObject(Context context, String key, Object object) {
            if (object == null) {
                return;
            }
            try {
                savePreferences(context, key, PreferenceUtil.gson.toJson(object));
            } catch (Exception e) {
                e.getMessage();
            }
        }

        public final void clearToken(Context context) {
            if (context != null) {
                removePreferenceByKey(context, "TOKEN");
            }
        }

        public final void clearTokenTemporal(Context context) {
            if (context != null) {
                removePreferenceByKey(context, "TOKEN_TEMPORAL");
            }
        }

        public final CenterDto getCEA(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Type type = new TypeToken<CenterDto>() { // from class: com.gse.aulapp.util.PreferenceUtil$Companion$getCEA$type$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return (CenterDto) getPreferencesObject(context, "KEY_CEA", type, null);
        }

        public final String getCurrentSessionID() {
            Context applicationContext = GeneralApp.INSTANCE.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return getPreferences(applicationContext, "CURRENT_SESSION_ID", (String) null);
        }

        public final String getDocType(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPreferences(context, "KEY_DOC_TYPE", (String) null);
        }

        public final String getDocumentNumber(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPreferences(context, "DOCUMENT_NUMBER", (String) null);
        }

        public final String getEmail(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPreferences(context, "EMAIL", (String) null);
        }

        public final Boolean getEntrySession(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (PreferenceUtil.sharedPreferences == null) {
                PreferenceUtil.sharedPreferences = context.getSharedPreferences("prefs", 0);
            }
            SharedPreferences sharedPreferences = PreferenceUtil.sharedPreferences;
            if (sharedPreferences != null) {
                return Boolean.valueOf(sharedPreferences.getBoolean("SESSION_ENTRY_STEP", true));
            }
            return null;
        }

        public final Boolean getIsFirstLogin(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (PreferenceUtil.sharedPreferences == null) {
                PreferenceUtil.sharedPreferences = context.getSharedPreferences("prefs", 0);
            }
            SharedPreferences sharedPreferences = PreferenceUtil.sharedPreferences;
            if (sharedPreferences != null) {
                return Boolean.valueOf(sharedPreferences.getBoolean("IS_FIRST_LOGIN", true));
            }
            return null;
        }

        public final List<CenterDto> getListCenterCEA(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Type type = new TypeToken<List<? extends CenterDto>>() { // from class: com.gse.aulapp.util.PreferenceUtil$Companion$getListCenterCEA$type$1
            }.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            Object preferencesObject = getPreferencesObject(context, "KEY_ARRAY_MAP_CEA", type, null);
            Intrinsics.checkNotNull(preferencesObject, "null cannot be cast to non-null type kotlin.collections.List<com.gse.aulapp.model.dto.CenterDto>");
            return (List) preferencesObject;
        }

        public final String getScheduleExamsUrl(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            String preferences = getPreferences(context, "KEY_SCHEDULE_EXAMS_URL", BuildConfig.FLAVOR);
            return preferences == null ? BuildConfig.FLAVOR : preferences;
        }

        public final String getSessionIdByTimeService(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPreferences(context, "KEY_TIME_SERVICE", (String) null);
        }

        public final String getStartClassOrExam(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPreferences(context, "KEY_STAR_CLASS_OR_EXAM", (String) null);
        }

        public final String getToken(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPreferences(context, "TOKEN", (String) null);
        }

        public final String getTokenTemporal(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPreferences(context, "TOKEN_TEMPORAL", (String) null);
        }

        public final Boolean getUserDemo(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPreferences(context, "KEY_USER_DEMO", false);
        }

        public final String getUserId(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPreferences(context, "USER_ID", (String) null);
        }

        public final String getUserName(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return getPreferences(context, "USER_NAME", (String) null);
        }

        public final void saveBiometricException(Context context, boolean entry) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferences(context, "KEY_BIOMETRIC_EXCEPTION", entry);
        }

        public final void saveBiometrixInformationID(Context context, String fraudInformationID) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferences(context, "KEY_BIOMETRIX_INFORMATION_ID", fraudInformationID);
        }

        public final void saveCEA(Context context, CenterDto selectedCEA) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferencesObject(context, "KEY_CEA", selectedCEA);
        }

        public final void saveCurrentSessionID(Context context, String sessionID) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionID, "sessionID");
            savePreferences(context, "CURRENT_SESSION_ID", sessionID);
        }

        public final void saveDateEnrollment(Context context, String dateEnrollment) {
            Intrinsics.checkNotNull(context);
            savePreferences(context, "DATE_ENROLLMENT", dateEnrollment);
        }

        public final void saveDocType(Context context, String docType) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferences(context, "KEY_DOC_TYPE", docType);
        }

        public final void saveDocumentNumber(Context context, String email) {
            Intrinsics.checkNotNull(context);
            savePreferences(context, "DOCUMENT_NUMBER", email);
        }

        public final void saveEmail(Context context, String email) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferences(context, "EMAIL", email);
        }

        public final void saveEntrySession(Context context, boolean entry) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferences(context, "SESSION_ENTRY_STEP", entry);
        }

        public final void saveEntryValidation(Context context, EnumApps entryValidation) {
            Intrinsics.checkNotNullParameter(entryValidation, "entryValidation");
            Intrinsics.checkNotNull(context);
            savePreferencesObject(context, "KEY_ENTRY_VALIDATIONS", entryValidation);
        }

        public final void saveFourFingersIdentyID(Context context, LoginObject fourFingersIdentyID) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferencesObject(context, "KEY_FOUR_FINGERS_IDENTY", fourFingersIdentyID);
        }

        public final void saveFraudInformationID(Context context, String fraudInformationID) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferences(context, "KEY_FRAUD_INFORMATION_ID", fraudInformationID);
        }

        public final void saveFullEnrollment(Context context, Boolean dateEnrollment) {
            if (context == null || dateEnrollment == null) {
                return;
            }
            savePreferences(context, "FULL_ENROLLMENT", dateEnrollment.booleanValue());
        }

        public final void saveFullName(Context context, String userName) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferences(context, "USER_NAME", userName);
        }

        public final void saveIsFirstLogin(Context context, boolean isFirstLogin) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferences(context, "IS_FIRST_LOGIN", isFirstLogin);
        }

        public final void saveListCenterCEA(Context context, List<CenterDto> listCenterDto) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(listCenterDto, "listCenterDto");
            savePreferencesObject(context, "KEY_ARRAY_MAP_CEA", listCenterDto);
        }

        public final void saveRole(Context context, String role) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferences(context, "KEY_SAVE_ROLE", role);
        }

        public final void saveScheduleExamsUrl(Context context, String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            savePreferences(context, "KEY_SCHEDULE_EXAMS_URL", url);
        }

        public final void saveSessionIdByTimeService(Context context, String sessionID) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sessionID, "sessionID");
            savePreferences(context, "KEY_TIME_SERVICE", sessionID);
        }

        public final void saveStartClassOrExam(Context context, String startTime) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(startTime, "startTime");
            savePreferences(context, "KEY_STAR_CLASS_OR_EXAM", startTime);
        }

        public final void saveToken(Context context, String token) {
            Intrinsics.checkNotNull(context);
            savePreferences(context, "TOKEN", token);
        }

        public final void saveTokenTemporal(Context context, String tokenTemporal) {
            Intrinsics.checkNotNull(context);
            savePreferences(context, "TOKEN_TEMPORAL", tokenTemporal);
        }

        public final void saveUserDemo(Context context, boolean enable) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferences(context, "KEY_USER_DEMO", enable);
        }

        public final void saveUserId(Context context, String userId) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferences(context, "USER_ID", userId);
        }

        public final void saveUserName(Context context, String userName) {
            Intrinsics.checkNotNullParameter(context, "context");
            savePreferences(context, "USER_NAME", userName);
        }

        public final void saveValidationsPercentage(Context context, Integer validationsPercentage) {
            Intrinsics.checkNotNull(context);
            savePreferences(context, "KEY_VALIDATIONS_PERCENTAGE", validationsPercentage);
        }

        private Companion() {
        }

        private final Boolean getPreferences(Context context, String key, boolean defaultValue) {
            if (PreferenceUtil.sharedPreferences == null) {
                PreferenceUtil.sharedPreferences = context.getSharedPreferences("prefs", 0);
            }
            SharedPreferences sharedPreferences = PreferenceUtil.sharedPreferences;
            if (sharedPreferences != null) {
                return Boolean.valueOf(sharedPreferences.getBoolean(key, defaultValue));
            }
            return null;
        }

        private final void savePreferences(Context context, String key, boolean value) {
            if (PreferenceUtil.sharedPreferences == null) {
                PreferenceUtil.sharedPreferences = context.getSharedPreferences("prefs", 0);
            }
            SharedPreferences sharedPreferences = PreferenceUtil.sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences != null ? sharedPreferences.edit() : null;
            if (edit != null) {
                edit.putBoolean(key, value);
                edit.apply();
            }
        }

        private final void savePreferences(Context context, String key, Integer value) {
            if (PreferenceUtil.sharedPreferences == null) {
                PreferenceUtil.sharedPreferences = context.getSharedPreferences("prefs", 0);
            }
            SharedPreferences sharedPreferences = PreferenceUtil.sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences != null ? sharedPreferences.edit() : null;
            if (edit != null) {
                edit.putInt(key, value != null ? value.intValue() : 0);
                edit.apply();
            }
        }
    }
}
