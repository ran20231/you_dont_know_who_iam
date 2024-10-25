package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.TrendEntity;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
/* compiled from: TrendDao.kt */
/* loaded from: classes2.dex */
public interface TrendDao {
    Object deleteAll(zz.a<? super Integer> aVar);

    Object getAllTrends(zz.a<? super List<TrendEntity>> aVar);

    Flow<List<TrendEntity>> getAllTrendsLive();

    Flow<List<TrendEntity>> getAllTrendsWithTitleFlow();

    Flow<TrendEntity> getTitleAsFlow();

    Object insertAll(List<TrendEntity> list, zz.a<? super List<Long>> aVar);
}
