package com.gse.aulapp.model.repository;

import com.gse.aulapp.model.dao.ConfigurationSessionDao;
import com.gse.aulapp.model.data.entity.ConfigurationSessionEntity;
import com.gse.aulapp.model.enumerate.EnumTypeConfiguration;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/gse/aulapp/model/repository/ConfigurationRepository;", BuildConfig.FLAVOR, "config", "Lcom/gse/aulapp/model/dao/ConfigurationSessionDao;", "<init>", "(Lcom/gse/aulapp/model/dao/ConfigurationSessionDao;)V", "addConfigurationSession", BuildConfig.FLAVOR, "configurationSessionEntity", "Lcom/gse/aulapp/model/data/entity/ConfigurationSessionEntity;", "getConfigurationSessionByType", "type", "Lcom/gse/aulapp/model/enumerate/EnumTypeConfiguration;", "(Lcom/gse/aulapp/model/enumerate/EnumTypeConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConfiguration", BuildConfig.FLAVOR, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConfigurationRepository {
    private final ConfigurationSessionDao config;

    public ConfigurationRepository(ConfigurationSessionDao config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.config = config;
    }

    public final void addConfigurationSession(ConfigurationSessionEntity configurationSessionEntity) {
        Intrinsics.checkNotNullParameter(configurationSessionEntity, "configurationSessionEntity");
        this.config.insert(configurationSessionEntity);
    }

    public final Object getConfiguration(Continuation<? super List<ConfigurationSessionEntity>> continuation) {
        return this.config.getConfiguration(continuation);
    }

    public final Object getConfigurationSessionByType(EnumTypeConfiguration enumTypeConfiguration, Continuation continuation) {
        return this.config.getConfigurationByType(enumTypeConfiguration.name(), continuation);
    }
}
