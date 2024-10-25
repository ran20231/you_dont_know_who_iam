package com.forsale.app.features.categories.listingdetails.newui;

import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import wz.p;
/* compiled from: NewListingDetailsFragment.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$6", f = "NewListingDetailsFragment.kt", l = {287}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NewListingDetailsFragment$registerObservers$6 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27146a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsFragment f27147b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$6$1", f = "NewListingDetailsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$6$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Boolean, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27148a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f27149b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NewListingDetailsFragment f27150c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27150c = newListingDetailsFragment;
        }

        public final Object b(boolean z11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27150c, aVar);
            anonymousClass1.f27149b = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, zz.a<? super p> aVar) {
            return b(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f27148a == 0) {
                f.b(obj);
                this.f27150c.B().n2(this.f27149b);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsFragment$registerObservers$6(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super NewListingDetailsFragment$registerObservers$6> aVar) {
        super(1, aVar);
        this.f27147b = newListingDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new NewListingDetailsFragment$registerObservers$6(this.f27147b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27146a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            StateFlow<Boolean> T0 = this.f27147b.l0().T0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27147b, null);
            this.f27146a = 1;
            if (FlowKt.collectLatest(T0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((NewListingDetailsFragment$registerObservers$6) create(aVar)).invokeSuspend(p.f75480a);
    }
}
