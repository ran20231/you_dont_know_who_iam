package com.forsale.app.ui.bottomsheets.agents;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AgentLocationsViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.agents.AgentLocationsViewModel", f = "AgentLocationsViewModel.kt", l = {22}, m = "getAllLocations")
/* loaded from: classes3.dex */
public final class AgentLocationsViewModel$getAllLocations$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37919a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37920b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AgentLocationsViewModel f37921c;

    /* renamed from: d  reason: collision with root package name */
    int f37922d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentLocationsViewModel$getAllLocations$1(AgentLocationsViewModel agentLocationsViewModel, zz.a<? super AgentLocationsViewModel$getAllLocations$1> aVar) {
        super(aVar);
        this.f37921c = agentLocationsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37920b = obj;
        this.f37922d |= Integer.MIN_VALUE;
        return this.f37921c.v0(this);
    }
}
