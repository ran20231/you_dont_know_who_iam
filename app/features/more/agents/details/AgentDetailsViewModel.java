package com.forsale.app.features.more.agents.details;

import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.k0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.AgentEntity;
import com.forsale.app.datalayer.database.LocationEntity;
import com.forsale.app.datalayer.database.repositories.AgentLocationDao;
import com.forsale.app.datalayer.repositories.AgentDao;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import java.util.List;
import kotlin.d;
import kotlin.jvm.internal.o;
import wz.h;
import wz.p;
/* compiled from: AgentDetailsViewModel.kt */
/* loaded from: classes2.dex */
public final class AgentDetailsViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final AgentLocationDao f31649k0;

    /* renamed from: l0  reason: collision with root package name */
    private final h f31650l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ObservableField<String> f31651m0;

    /* renamed from: n0  reason: collision with root package name */
    private final ObservableField<String> f31652n0;

    /* renamed from: o0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31653o0;

    /* renamed from: p0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31654p0;

    /* renamed from: q0  reason: collision with root package name */
    private final LiveData<AgentEntity> f31655q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentDetailsViewModel(AgentDao agentDao, AgentLocationDao agentLocationDao, final k0 savedStateHandle, BaseRepository baseRepository) {
        super(baseRepository);
        h a11;
        o.i(agentDao, "agentDao");
        o.i(agentLocationDao, "agentLocationDao");
        o.i(savedStateHandle, "savedStateHandle");
        o.i(baseRepository, "baseRepository");
        this.f31649k0 = agentLocationDao;
        a11 = d.a(new g00.a<Integer>() { // from class: com.forsale.app.features.more.agents.details.AgentDetailsViewModel$agentId$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                return Integer.valueOf(a.f31657b.b(k0.this).a());
            }
        });
        this.f31650l0 = a11;
        this.f31651m0 = new ObservableField<>("");
        this.f31652n0 = new ObservableField<>("");
        this.f31653o0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31654p0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31655q0 = agentDao.getAgentById(w0());
    }

    private final void B0(AgentEntity agentEntity) {
        AggregatedAllAnalyticsLoggerKt.u(r(), agentEntity.getId(), agentEntity.getNameEn());
    }

    private final int w0() {
        return ((Number) this.f31650l0.getValue()).intValue();
    }

    public final void A0(AgentEntity agent) {
        o.i(agent, "agent");
        this.f31651m0.k(agent.getName());
        this.f31652n0.k(agent.getImage());
        B0(agent);
    }

    public final LiveData<AgentEntity> v0() {
        return this.f31655q0;
    }

    public final ObservableField<String> x0() {
        return this.f31652n0;
    }

    public final LiveData<List<LocationEntity>> y0() {
        return this.f31649k0.getLocationsByAgentId(w0());
    }

    public final ObservableField<String> z0() {
        return this.f31651m0;
    }
}
