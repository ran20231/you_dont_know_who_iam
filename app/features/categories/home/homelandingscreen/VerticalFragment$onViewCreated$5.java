package com.forsale.app.features.categories.home.homelandingscreen;

import com.forsale.app.features.categories.home.CategoriesNavGraphViewModel;
import com.forsale.app.features.categories.listingdetails.ListingDetailsOwnerActions;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import g00.l;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: VerticalFragment.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$5", f = "VerticalFragment.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerticalFragment$onViewCreated$5 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23896a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerticalFragment f23897b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalFragment.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$5$1", f = "VerticalFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalFragment$onViewCreated$5$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Pair<? extends Integer, ? extends ListingDetailsOwnerActions>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f23898a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f23899b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VerticalFragment f23900c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VerticalFragment verticalFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f23900c = verticalFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Pair<Integer, ? extends ListingDetailsOwnerActions> pair, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pair, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23900c, aVar);
            anonymousClass1.f23899b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f23898a == 0) {
                f.b(obj);
                Pair pair = (Pair) this.f23899b;
                this.f23900c.s0(((Number) pair.c()).intValue(), AnalyticsDetailsSource.DEEP_LINK, (ListingDetailsOwnerActions) pair.d());
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalFragment$onViewCreated$5(VerticalFragment verticalFragment, zz.a<? super VerticalFragment$onViewCreated$5> aVar) {
        super(1, aVar);
        this.f23897b = verticalFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new VerticalFragment$onViewCreated$5(this.f23897b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoriesNavGraphViewModel k02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f23896a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            k02 = this.f23897b.k0();
            SharedFlow<Pair<Integer, ListingDetailsOwnerActions>> L0 = k02.L0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f23897b, null);
            this.f23896a = 1;
            if (FlowKt.collectLatest(L0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((VerticalFragment$onViewCreated$5) create(aVar)).invokeSuspend(p.f75480a);
    }
}
