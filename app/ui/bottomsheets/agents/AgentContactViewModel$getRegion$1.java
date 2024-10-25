package com.forsale.app.ui.bottomsheets.agents;

import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AgentContactViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.agents.AgentContactViewModel$getRegion$1", f = "AgentContactViewModel.kt", l = {l8.a.f62266c, l8.a.f62266c}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AgentContactViewModel$getRegion$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37892a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AgentContactViewModel f37893b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f37894c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AgentContactViewModel.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.agents.AgentContactViewModel$getRegion$1$1", f = "AgentContactViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.agents.AgentContactViewModel$getRegion$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<String, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37895a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f37896b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AgentContactViewModel f37897c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AgentContactViewModel agentContactViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f37897c = agentContactViewModel;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(String str, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(str, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37897c, aVar);
            anonymousClass1.f37896b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean K0;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f37895a == 0) {
                f.b(obj);
                String str = ((String) this.f37896b) + " " + this.f37897c.v0().getPhone();
                K0 = StringsKt__StringsKt.K0(str, '+', false, 2, null);
                if (!K0) {
                    str = "+" + str;
                }
                this.f37897c.y0().k(str);
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentContactViewModel$getRegion$1(AgentContactViewModel agentContactViewModel, int i11, zz.a<? super AgentContactViewModel$getRegion$1> aVar) {
        super(2, aVar);
        this.f37893b = agentContactViewModel;
        this.f37894c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AgentContactViewModel$getRegion$1(this.f37893b, this.f37894c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37892a;
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
            RegionsRepository I = this.f37893b.I();
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(this.f37894c);
            this.f37892a = 1;
            obj = I.getRegionPrefix(d11, this);
            if (obj == f11) {
                return f11;
            }
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37893b, null);
        this.f37892a = 2;
        if (CoroutinesExtensionsKt.a(obj, anonymousClass1, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AgentContactViewModel$getRegion$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
