package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.database.AgentEntity;
import java.util.List;
/* compiled from: AgentDao.kt */
/* loaded from: classes2.dex */
public interface AgentDao {
    Object deleteAgent(AgentEntity agentEntity, zz.a<? super Integer> aVar);

    Object deleteAllAgents(List<AgentEntity> list, zz.a<? super Integer> aVar);

    Object deleteAllAgents(zz.a<? super Integer> aVar);

    LiveData<AgentEntity> getAgentById(int i11);

    LiveData<List<AgentEntity>> getAgentsByLocationId(int i11, int i12);

    LiveData<List<AgentEntity>> getAllAgents(int i11);

    Object getAllAgentsSuspend(zz.a<? super List<AgentEntity>> aVar);

    Object insertAgent(AgentEntity agentEntity, zz.a<? super Long> aVar);

    Object insertAllAgents(List<AgentEntity> list, zz.a<? super List<Long>> aVar);

    Object updateAgent(AgentEntity agentEntity, zz.a<? super Integer> aVar);
}
