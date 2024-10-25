package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.SearchHistoryEntity;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import wz.p;
/* compiled from: SearchHistoryDao.kt */
/* loaded from: classes2.dex */
public interface SearchHistoryDao {
    Object delete(SearchHistoryEntity searchHistoryEntity, zz.a<? super p> aVar);

    Object deleteAll(zz.a<? super p> aVar);

    Object deleteById(int i11, zz.a<? super p> aVar);

    Object deleteOldestRecord(zz.a<? super p> aVar);

    void deleteOldestRecord(SearchHistoryEntity.SearchHistorySource searchHistorySource);

    Flow<List<SearchHistoryEntity>> getAllBySourceOrDefaultWithLimit(SearchHistoryEntity.SearchHistorySource searchHistorySource, int i11);

    Flow<List<SearchHistoryEntity>> getAllBySourceWithLimit(SearchHistoryEntity.SearchHistorySource searchHistorySource, int i11);

    Flow<List<SearchHistoryEntity>> getAllWithLimit(int i11);

    int getCount(SearchHistoryEntity.SearchHistorySource searchHistorySource);

    Object getCount(zz.a<? super Integer> aVar);

    SearchHistoryEntity getSingleByCategoryId(int i11, SearchHistoryEntity.SearchHistorySource searchHistorySource);

    SearchHistoryEntity getSingleBySearchText(String str, SearchHistoryEntity.SearchHistorySource searchHistorySource);

    Object getSingleBySearchText(String str, zz.a<? super SearchHistoryEntity> aVar);

    SearchHistoryEntity getSingleBySearchTextAndId(String str, int i11, SearchHistoryEntity.SearchHistorySource searchHistorySource);

    Object getSingleBySearchTextAndId(String str, int i11, zz.a<? super SearchHistoryEntity> aVar);

    Object insert(SearchHistoryEntity searchHistoryEntity, zz.a<? super Long> aVar);
}
