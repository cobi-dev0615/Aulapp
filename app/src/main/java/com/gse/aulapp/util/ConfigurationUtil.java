package com.gse.aulapp.util;

import com.gse.aulapp.GeneralApp;
import com.gse.aulapp.model.data.entity.ConfigurationSessionEntity;
import com.gse.aulapp.model.dto.ConfigurationSessionDto;
import com.gse.aulapp.model.enumerate.EnumTypeConfiguration;
import com.gse.aulapp.model.repository.ConfigurationRepository;
import com.karumi.dexter.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/gse/aulapp/util/ConfigurationUtil;", BuildConfig.FLAVOR, "Companion", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ConfigurationUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ConfigurationRepository repositoryConfiguration = new ConfigurationRepository(GeneralApp.INSTANCE.getDatabase().ConfigurationSessionDao());

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/gse/aulapp/util/ConfigurationUtil$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Lcom/gse/aulapp/model/data/entity/ConfigurationSessionEntity;", "configurationSessionEntity", "Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;", "convertEntityToDto", "(Lcom/gse/aulapp/model/data/entity/ConfigurationSessionEntity;)Lcom/gse/aulapp/model/dto/ConfigurationSessionDto;", BuildConfig.FLAVOR, "saveConfigurationBasic", "(Lcom/gse/aulapp/model/data/entity/ConfigurationSessionEntity;)V", "Lcom/gse/aulapp/model/enumerate/EnumTypeConfiguration;", "type", "getConfigurationSessionByType", "(Lcom/gse/aulapp/model/enumerate/EnumTypeConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", BuildConfig.FLAVOR, "getConfigurationSession", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/gse/aulapp/model/repository/ConfigurationRepository;", "repositoryConfiguration", "Lcom/gse/aulapp/model/repository/ConfigurationRepository;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConfigurationUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfigurationUtil.kt\ncom/gse/aulapp/util/ConfigurationUtil$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1557#2:49\n1628#2,3:50\n*S KotlinDebug\n*F\n+ 1 ConfigurationUtil.kt\ncom/gse/aulapp/util/ConfigurationUtil$Companion\n*L\n25#1:49\n25#1:50,3\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ConfigurationSessionDto convertEntityToDto(ConfigurationSessionEntity configurationSessionEntity) {
            String str;
            if (configurationSessionEntity == null || (str = configurationSessionEntity.getTypeConfiguration()) == null) {
                str = BuildConfig.FLAVOR;
            }
            return new ConfigurationSessionDto(str, configurationSessionEntity != null ? configurationSessionEntity.getMinToleranceEntryBefore() : 20, configurationSessionEntity != null ? configurationSessionEntity.getMinToleranceEntryAfter() : 20, configurationSessionEntity != null ? configurationSessionEntity.getMinToleranceDepartureAfter() : 15, configurationSessionEntity != null ? configurationSessionEntity.getDurationForHour() : 45, configurationSessionEntity != null ? configurationSessionEntity.getDurationForHourShow() : 45, configurationSessionEntity != null ? configurationSessionEntity.getAlertEndSession() : 10, configurationSessionEntity != null ? configurationSessionEntity.getAlertDepartureAfter() : 10, configurationSessionEntity != null ? configurationSessionEntity.getMinuteForHour() : 60);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[LOOP:0: B:11:0x0050->B:13:0x0056, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getConfigurationSession(Continuation<? super List<ConfigurationSessionDto>> continuation) {
            ConfigurationUtil$Companion$getConfigurationSession$1 configurationUtil$Companion$getConfigurationSession$1;
            int i;
            Iterator it;
            if (continuation instanceof ConfigurationUtil$Companion$getConfigurationSession$1) {
                configurationUtil$Companion$getConfigurationSession$1 = (ConfigurationUtil$Companion$getConfigurationSession$1) continuation;
                int i2 = configurationUtil$Companion$getConfigurationSession$1.label;
                if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                    configurationUtil$Companion$getConfigurationSession$1.label = i2 - IntCompanionObject.MIN_VALUE;
                    Object obj = configurationUtil$Companion$getConfigurationSession$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = configurationUtil$Companion$getConfigurationSession$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ConfigurationRepository configurationRepository = ConfigurationUtil.repositoryConfiguration;
                        configurationUtil$Companion$getConfigurationSession$1.label = 1;
                        obj = configurationRepository.getConfiguration(configurationUtil$Companion$getConfigurationSession$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(10);
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ConfigurationUtil.INSTANCE.convertEntityToDto((ConfigurationSessionEntity) it.next()));
                    }
                    return arrayList;
                }
            }
            configurationUtil$Companion$getConfigurationSession$1 = new ConfigurationUtil$Companion$getConfigurationSession$1(this, (Continuation) continuation);
            Object obj2 = configurationUtil$Companion$getConfigurationSession$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = configurationUtil$Companion$getConfigurationSession$1.label;
            if (i != 0) {
            }
            List list2 = (List) obj2;
            ArrayList arrayList2 = new ArrayList(10);
            it = list2.iterator();
            while (it.hasNext()) {
            }
            return arrayList2;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getConfigurationSessionByType(EnumTypeConfiguration enumTypeConfiguration, Continuation continuation) {
            ConfigurationUtil$Companion$getConfigurationSessionByType$1 configurationUtil$Companion$getConfigurationSessionByType$1;
            int i;
            Companion companion = this;
            if (continuation instanceof ConfigurationUtil$Companion$getConfigurationSessionByType$1) {
                configurationUtil$Companion$getConfigurationSessionByType$1 = (ConfigurationUtil$Companion$getConfigurationSessionByType$1) continuation;
                int i2 = configurationUtil$Companion$getConfigurationSessionByType$1.label;
                if ((i2 & IntCompanionObject.MIN_VALUE) != 0) {
                    configurationUtil$Companion$getConfigurationSessionByType$1.label = i2 - IntCompanionObject.MIN_VALUE;
                    Object obj = configurationUtil$Companion$getConfigurationSessionByType$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = configurationUtil$Companion$getConfigurationSessionByType$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ConfigurationRepository configurationRepository = ConfigurationUtil.repositoryConfiguration;
                        configurationUtil$Companion$getConfigurationSessionByType$1.L$0 = this;
                        configurationUtil$Companion$getConfigurationSessionByType$1.label = 1;
                        obj = configurationRepository.getConfigurationSessionByType(enumTypeConfiguration, configurationUtil$Companion$getConfigurationSessionByType$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        companion = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        companion = (Companion) configurationUtil$Companion$getConfigurationSessionByType$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return companion.convertEntityToDto((ConfigurationSessionEntity) obj);
                }
            }
            configurationUtil$Companion$getConfigurationSessionByType$1 = new ConfigurationUtil$Companion$getConfigurationSessionByType$1(this, (Continuation) continuation);
            Object obj2 = configurationUtil$Companion$getConfigurationSessionByType$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = configurationUtil$Companion$getConfigurationSessionByType$1.label;
            if (i != 0) {
            }
            return companion.convertEntityToDto((ConfigurationSessionEntity) obj2);
        }

        public final void saveConfigurationBasic(ConfigurationSessionEntity configurationSessionEntity) {
            Intrinsics.checkNotNullParameter(configurationSessionEntity, "configurationSessionEntity");
            ConfigurationUtil.repositoryConfiguration.addConfigurationSession(configurationSessionEntity);
        }

        private Companion() {
        }
    }
}
