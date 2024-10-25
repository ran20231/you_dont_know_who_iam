package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$4", f = "VerticalFragment.kt", l = {FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerticalFragment$onViewCreated$4 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23891a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23892b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalFragment.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$4$1", f = "VerticalFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$4$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Integer, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23893a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f23894b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VerticalFragment f23895c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VerticalFragment verticalFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f23895c = verticalFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23895c, aVar);
            anonymousClass1.f23894b = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f23893a == 0) {
                f.b(obj);
                VerticalFragment.t0(this.f23895c, this.f23894b, AnalyticsDetailsSource.DEEP_LINK, null, 4, null);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, zz.a<? super p> aVar) {
            return invoke(num.intValue(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$onViewCreated$4(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$onViewCreated$4> aVar) {
        super(1, aVar);
        this.f23892b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new VerticalFragment$onViewCreated$4(this.f23892b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoriesNavGraphViewModel k02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23891a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            k02 = this.f23892b.k0();
            SharedFlow<Integer> K0 = k02.K0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23892b, null);
            this.f23891a = 1;
            if (FlowKt.collectLatest(K0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((VerticalFragment$onViewCreated$4) create(aVar)).invokeSuspend(p.f75480a);
    }
}
