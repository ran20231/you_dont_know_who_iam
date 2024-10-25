package com.forsale.app.features.more.agents.list;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.AgentEntity;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AgentActionType;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: AgentViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final AgentEntity f31677k0;

    /* renamed from: l0  reason: collision with root package name */
    private final int f31678l0;

    /* renamed from: m0  reason: collision with root package name */
    private final String f31679m0;

    /* renamed from: n0  reason: collision with root package name */
    private final String f31680n0;

    /* renamed from: o0  reason: collision with root package name */
    private final String f31681o0;

    /* renamed from: p0  reason: collision with root package name */
    private final String f31682p0;

    /* renamed from: q0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31683q0;

    /* renamed from: r0  reason: collision with root package name */
    private final OneShotEventHandler<p> f31684r0;

    /* compiled from: AgentViewModel.kt */
    /* renamed from: com.forsale.app.features.more.agents.list.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0346a {
        a a(AgentEntity agentEntity);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AgentEntity agent, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(agent, "agent");
        o.i(baseRepository, "baseRepository");
        this.f31677k0 = agent;
        this.f31678l0 = agent.getId();
        this.f31679m0 = agent.getName();
        this.f31680n0 = agent.getDescription();
        this.f31681o0 = agent.getImage();
        this.f31682p0 = agent.getPhone();
        this.f31683q0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f31684r0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    private final void A0(AgentActionType agentActionType) {
        AggregatedAllAnalyticsLoggerKt.t(r(), this.f31678l0, this.f31679m0, agentActionType);
    }

    public final void B0() {
        A0(AgentActionType.CALL_CLICKED);
        this.f31683q0.i(p.f75480a);
    }

    public final void C0() {
        A0(AgentActionType.SMS_CLICKED);
        this.f31684r0.i(p.f75480a);
    }

    public final AgentEntity v0() {
        return this.f31677k0;
    }

    public final OneShotEventHandler<p> w0() {
        return this.f31683q0;
    }

    public final OneShotEventHandler<p> x0() {
        return this.f31684r0;
    }

    public final String y0() {
        return this.f31681o0;
    }

    public final String z0() {
        return this.f31679m0;
    }
}
