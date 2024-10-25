package com.forsale.app.datalayer.database.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.AgentLocationEntity;
import com.forsale.app.datalayer.database.LocationEntity;
import java.util.List;
import zz.a;
/* compiled from: AgentLocationDao.kt */
/* loaded from: classes2.dex */
public interface AgentLocationDao {
    Object deleteAgentLocation(AgentLocationEntity agentLocationEntity, a<? super Integer> aVar);

    Object deleteAllAgentLocations(List<AgentLocationEntity> list, a<? super Integer> aVar);

    Object deleteAllAgentLocations(a<? super Integer> aVar);

    LiveData<AgentLocationEntity> getAgentLocationById(int i11);

    LiveData<List<AgentLocationEntity>> getAllAgentLocations();

    Object getAllAgentLocationsSuspend(a<? super List<AgentLocationEntity>> aVar);

    LiveData<List<LocationEntity>> getLocationsByAgentId(int i11);

    Object insertAgentLocation(AgentLocationEntity agentLocationEntity, a<? super Long> aVar);

    Object insertAllAgentLocations(List<AgentLocationEntity> list, a<? super List<Long>> aVar);

    Object updateAgentLocation(AgentLocationEntity agentLocationEntity, a<? super Integer> aVar);
}
