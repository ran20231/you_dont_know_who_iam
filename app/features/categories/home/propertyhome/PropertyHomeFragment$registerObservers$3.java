package com.forsale.app.features.categories.home.propertyhome;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PropertyHomeFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$registerObservers$3", f = "PropertyHomeFragment.kt", l = {217}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PropertyHomeFragment$registerObservers$3 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24778a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24779b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PropertyHomeFragment f24780c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PropertyHomeFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$registerObservers$3$1", f = "PropertyHomeFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.propertyhome.PropertyHomeFragment$registerObservers$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<xa.a, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24781a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f24782b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PropertyHomeFragment f24783c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PropertyHomeFragment propertyHomeFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f24783c = propertyHomeFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(xa.a aVar, zz.a<? super wz.p> aVar2) {
            return ((AnonymousClass1) create(aVar, aVar2)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24783c, aVar);
            anonymousClass1.f24782b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f24781a == 0) {
                kotlin.f.b(obj);
                this.f24783c.a0((xa.a) this.f24782b);
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeFragment$registerObservers$3(PropertyHomeViewModel propertyHomeViewModel, PropertyHomeFragment propertyHomeFragment, zz.a<? super PropertyHomeFragment$registerObservers$3> aVar) {
        super(2, aVar);
        this.f24779b = propertyHomeViewModel;
        this.f24780c = propertyHomeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PropertyHomeFragment$registerObservers$3(this.f24779b, this.f24780c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24778a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            MutableSharedFlow<xa.a> z11 = this.f24779b.z();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24780c, null);
            this.f24778a = 1;
            if (FlowKt.collectLatest(z11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PropertyHomeFragment$registerObservers$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
