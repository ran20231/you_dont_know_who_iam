package com.forsale.app.features.categories.home.allverticals;

import com.forsale.app.features.categories.home.allverticals.a;
import falcon.chat.entities.Constants;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllVerticalsFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment$registerObservers$1", f = "AllVerticalsFragment.kt", l = {Constants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AllVerticalsFragment$registerObservers$1 extends SuspendLambda implements g00.l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23377a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllVerticalsFragment f23378b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AllVerticalsFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment$registerObservers$1$1", f = "AllVerticalsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.allverticals.AllVerticalsFragment$registerObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<a, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23379a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f23380b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AllVerticalsFragment f23381c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AllVerticalsFragment allVerticalsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f23381c = allVerticalsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(a aVar, zz.a<? super p> aVar2) {
            return ((AnonymousClass1) create(aVar, aVar2)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23381c, aVar);
            anonymousClass1.f23380b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f23379a == 0) {
                kotlin.f.b(obj);
                a aVar = (a) this.f23380b;
                if (aVar instanceof a.AbstractC0259a.c) {
                    a.AbstractC0259a.c cVar = (a.AbstractC0259a.c) aVar;
                    this.f23381c.C(cVar.b(), cVar.a());
                } else if (aVar instanceof a.AbstractC0259a.b) {
                    a.AbstractC0259a.b bVar = (a.AbstractC0259a.b) aVar;
                    this.f23381c.B(bVar.b(), bVar.a());
                } else if (aVar instanceof a.AbstractC0259a.C0260a) {
                    a.AbstractC0259a.C0260a c0260a = (a.AbstractC0259a.C0260a) aVar;
                    this.f23381c.A(c0260a.a(), c0260a.b(), c0260a.c());
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllVerticalsFragment$registerObservers$1(AllVerticalsFragment allVerticalsFragment, zz.a<? super AllVerticalsFragment$registerObservers$1> aVar) {
        super(1, aVar);
        this.f23378b = allVerticalsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new AllVerticalsFragment$registerObservers$1(this.f23378b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AllVerticalsViewModel z11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23377a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            z11 = this.f23378b.z();
            SharedFlow<a> M = z11.M();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23378b, null);
            this.f23377a = 1;
            if (FlowKt.collectLatest(M, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((AllVerticalsFragment$registerObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
