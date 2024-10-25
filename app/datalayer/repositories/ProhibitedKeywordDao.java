package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.ProhibitedKeywordEntity;
import java.util.List;
/* compiled from: ProhibitedKeywordDao.kt */
/* loaded from: classes2.dex */
public interface ProhibitedKeywordDao {
    Object deleteAllProhibitedKeywords(List<ProhibitedKeywordEntity> list, zz.a<? super Integer> aVar);

    Object deleteAllProhibitedKeywords(zz.a<? super Integer> aVar);

    Object deleteProhibitedKeyword(ProhibitedKeywordEntity prohibitedKeywordEntity, zz.a<? super Integer> aVar);

    Object getAllProhibitedKeywords(zz.a<? super List<ProhibitedKeywordEntity>> aVar);

    LiveData<List<ProhibitedKeywordEntity>> getAllProhibitedKeywordsAsLiveData();

    Object getProhibitedKeywordById(int i11, zz.a<? super ProhibitedKeywordEntity> aVar);

    Object insertAllProhibitedKeyword(List<ProhibitedKeywordEntity> list, zz.a<? super List<Long>> aVar);

    Object insertProhibitedKeyword(ProhibitedKeywordEntity prohibitedKeywordEntity, zz.a<? super Long> aVar);

    Object updateProhibitedKeyword(ProhibitedKeywordEntity prohibitedKeywordEntity, zz.a<? super Integer> aVar);
}
