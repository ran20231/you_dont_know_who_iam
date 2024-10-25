package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import kotlinx.coroutines.flow.Flow;
import wz.p;
/* compiled from: SessionDao.kt */
/* loaded from: classes2.dex */
public interface SessionDao {
    Object deleteSession(SessionEntity sessionEntity, zz.a<? super p> aVar);

    Object getSession(zz.a<? super SessionEntity> aVar);

    Flow<SessionEntity> getSessionAsFlow();

    LiveData<SessionEntity> getSessionLiveData();

    Object insertSession(SessionEntity sessionEntity, zz.a<? super p> aVar);

    Object updateSession(SessionEntity sessionEntity, zz.a<? super p> aVar);
}
