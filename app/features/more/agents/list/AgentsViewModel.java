package com.forsale.app.features.more.agents.list;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.datalayer.database.AgentEntity;
import com.forsale.app.datalayer.repositories.AgentDao;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import wz.p;
/* compiled from: AgentsViewModel.kt */
/* loaded from: classes2.dex */
public final class AgentsViewModel extends BaseStatefulViewModel {

    /* renamed from: l0  reason: collision with root package name */
    private final AgentDao f31671l0;

    /* renamed from: m0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31672m0;

    /* renamed from: n0  reason: collision with root package name */
    private final b0<Integer> f31673n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentsViewModel(AgentDao agentDao, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(agentDao, "agentDao");
        o.i(baseRepository, "baseRepository");
        this.f31671l0 = agentDao;
        this.f31672m0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31673n0 = new b0<>(0);
    }

    private final void y0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AgentsViewModel$logAgentVisitedAnalytics$1(this, i11, null), 3, null);
    }

    public final b0<Integer> w0() {
        return this.f31673n0;
    }

    public final LiveData<List<AgentEntity>> x0() {
        Integer value = this.f31673n0.getValue();
        if (value == null) {
            value = 0;
        }
        int intValue = value.intValue();
        y0(intValue);
        if (intValue == 0) {
            return this.f31671l0.getAllAgents(I().getCurrentRegionIdValue());
        }
        return this.f31671l0.getAgentsByLocationId(I().getCurrentRegionIdValue(), intValue);
    }
}
