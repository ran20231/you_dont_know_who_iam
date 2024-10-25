package com.forsale.app.ui.bottomsheets.agents;

import aa.u0;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.forsale.app.datalayer.database.LocationEntity;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AgentLocationsBottomSheet.kt */
@d(c = "com.forsale.app.ui.bottomsheets.agents.AgentLocationsBottomSheet$loadLocations$1", f = "AgentLocationsBottomSheet.kt", l = {56, 58}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AgentLocationsBottomSheet$loadLocations$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37911a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AgentLocationsBottomSheet f37912b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Ref$IntRef f37913c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AgentLocationsBottomSheet.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.agents.AgentLocationsBottomSheet$loadLocations$1$1", f = "AgentLocationsBottomSheet.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.agents.AgentLocationsBottomSheet$loadLocations$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<List<? extends LocationEntity>, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37914a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f37915b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AgentLocationsBottomSheet f37916c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Ref$IntRef f37917d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AgentLocationsBottomSheet agentLocationsBottomSheet, Ref$IntRef ref$IntRef, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f37916c = agentLocationsBottomSheet;
            this.f37917d = ref$IntRef;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(List<LocationEntity> list, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(list, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37916c, this.f37917d, aVar);
            anonymousClass1.f37915b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            u0 u0Var;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f37914a == 0) {
                f.b(obj);
                AgentLocationsBottomSheet agentLocationsBottomSheet = this.f37916c;
                Ref$IntRef ref$IntRef = this.f37917d;
                for (LocationEntity locationEntity : (List) this.f37915b) {
                    int id2 = locationEntity.getId();
                    String name = locationEntity.getName();
                    int i11 = ref$IntRef.f61776a + 1;
                    ref$IntRef.f61776a = i11;
                    agentLocationsBottomSheet.z(id2, name, i11);
                }
                u0Var = this.f37916c.f37902i;
                if (u0Var == null) {
                    o.w("binding");
                    u0Var = null;
                }
                u0Var.O.check(this.f37916c.B());
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentLocationsBottomSheet$loadLocations$1(AgentLocationsBottomSheet agentLocationsBottomSheet, Ref$IntRef ref$IntRef, zz.a<? super AgentLocationsBottomSheet$loadLocations$1> aVar) {
        super(2, aVar);
        this.f37912b = agentLocationsBottomSheet;
        this.f37913c = ref$IntRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AgentLocationsBottomSheet$loadLocations$1(this.f37912b, this.f37913c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37911a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            AgentLocationsViewModel C = this.f37912b.C();
            this.f37911a = 1;
            obj = C.v0(this);
            if (obj == f11) {
                return f11;
            }
        }
        Flow a11 = FlowExtKt.a((Flow) obj, this.f37912b.getViewLifecycleOwner().getLifecycle(), Lifecycle.State.STARTED);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37912b, this.f37913c, null);
        this.f37911a = 2;
        if (FlowKt.collectLatest(a11, anonymousClass1, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AgentLocationsBottomSheet$loadLocations$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
