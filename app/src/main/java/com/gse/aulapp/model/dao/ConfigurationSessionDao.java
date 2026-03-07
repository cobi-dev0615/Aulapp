package com.gse.aulapp.model.dao;

import com.gse.aulapp.model.data.entity.ConfigurationSessionEntity;
import com.karumi.dexter.BuildConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH§@¢\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH§@¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/gse/aulapp/model/dao/ConfigurationSessionDao;", BuildConfig.FLAVOR, "insert", BuildConfig.FLAVOR, "configuration", "Lcom/gse/aulapp/model/data/entity/ConfigurationSessionEntity;", "getConfigurationByType", "type", BuildConfig.FLAVOR, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConfiguration", BuildConfig.FLAVOR, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ConfigurationSessionDao {
    Object getConfiguration(Continuation<? super List<ConfigurationSessionEntity>> continuation);

    Object getConfigurationByType(String str, Continuation continuation);

    long insert(ConfigurationSessionEntity configuration);
}
