package com.forsale.app.ui.bottomsheets.agents;

import androidx.databinding.ObservableField;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.AgentEntity;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.more.agents.list.AgentContactType;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import t9.y0;
/* compiled from: AgentContactViewModel.kt */
/* loaded from: classes3.dex */
public final class AgentContactViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final AgentEntity f37883k0;

    /* renamed from: l0  reason: collision with root package name */
    private final CoroutineScope f37884l0;

    /* renamed from: m0  reason: collision with root package name */
    private final ApplicationResourcesRepository f37885m0;

    /* renamed from: n0  reason: collision with root package name */
    private final CoroutineExceptionHandler f37886n0;

    /* renamed from: o0  reason: collision with root package name */
    private final ObservableField<String> f37887o0;

    /* renamed from: p0  reason: collision with root package name */
    private AgentContactType f37888p0;

    /* renamed from: q0  reason: collision with root package name */
    private final OneShotEventHandler<String> f37889q0;

    /* renamed from: r0  reason: collision with root package name */
    private final OneShotEventHandler<String> f37890r0;

    /* compiled from: AgentContactViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        AgentContactViewModel a(AgentEntity agentEntity, CoroutineScope coroutineScope);
    }

    /* compiled from: AgentContactViewModel.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f37891a;

        static {
            int[] iArr = new int[AgentContactType.values().length];
            try {
                iArr[AgentContactType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AgentContactType.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f37891a = iArr;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            String message = th2.getMessage();
            x10.a.b("4SALE_ERROR:: " + message, new Object[0]);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentContactViewModel(AgentEntity agent, CoroutineScope scope, ApplicationResourcesRepository resourcesRepository, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(agent, "agent");
        o.i(scope, "scope");
        o.i(resourcesRepository, "resourcesRepository");
        o.i(baseRepository, "baseRepository");
        this.f37883k0 = agent;
        this.f37884l0 = scope;
        this.f37885m0 = resourcesRepository;
        this.f37886n0 = new c(CoroutineExceptionHandler.Key);
        this.f37887o0 = new ObservableField<>();
        this.f37888p0 = AgentContactType.CALL;
        this.f37889q0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f37890r0 = new OneShotEventHandler<>(null, 0, 3, null);
        z0(agent.getRegionId());
    }

    private final void z0(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AgentContactViewModel$getRegion$1(this, i11, null), 3, null);
    }

    public final String A0() {
        int i11 = b.f37891a[this.f37888p0.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return this.f37885m0.getString(y0.f70370aa, new Object[0]);
            }
            throw new NoWhenBranchMatchedException();
        }
        return this.f37885m0.getString(y0.Y9, new Object[0]);
    }

    public final void B0() {
        String j11;
        int i11 = b.f37891a[this.f37888p0.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 && (j11 = this.f37887o0.j()) != null) {
                this.f37890r0.i(TypeExtensionsKt.c(j11));
                return;
            }
            return;
        }
        String j12 = this.f37887o0.j();
        if (j12 != null) {
            this.f37889q0.i(TypeExtensionsKt.c(j12));
        }
    }

    public final void C0(AgentContactType agentContactType) {
        o.i(agentContactType, "<set-?>");
        this.f37888p0 = agentContactType;
    }

    public final AgentEntity v0() {
        return this.f37883k0;
    }

    public final OneShotEventHandler<String> w0() {
        return this.f37889q0;
    }

    public final OneShotEventHandler<String> x0() {
        return this.f37890r0;
    }

    public final ObservableField<String> y0() {
        return this.f37887o0;
    }
}
