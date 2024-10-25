package com.forsale.app.features.categories.listingdetails;

import androidx.navigation.NavController;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.auth.e;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import g00.p;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import t9.i0;
import t9.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$registerObservers$1", f = "ListingDetailsActivity.kt", l = {151, 169}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsActivity$registerObservers$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25122a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsActivity f25123b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListingDetailsActivity.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$registerObservers$1$1", f = "ListingDetailsActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$registerObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Boolean, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f25124a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f25125b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ListingDetailsActivity f25126c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ListingDetailsActivity listingDetailsActivity, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f25126c = listingDetailsActivity;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Boolean bool, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(bool, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25126c, aVar);
            anonymousClass1.f25125b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int[] d12;
            int f12;
            int i12;
            String n12;
            String o12;
            ListingDetailsAnalyticSource j12;
            ArrayList v12;
            String str;
            ListingsAnalytics$FiltersPlace g12;
            ListingDetailsSearchAnalyticsData t12;
            ListingItemBrief h12;
            String u12;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f25124a == 0) {
                kotlin.f.b(obj);
                boolean z11 = false;
                if (o.d((Boolean) this.f25125b, kotlin.coroutines.jvm.internal.a.a(false))) {
                    NavController a11 = z3.b.a(this.f25126c, r0.f70160z5);
                    i0.e eVar = i0.f69248a;
                    d12 = this.f25126c.d1();
                    f12 = this.f25126c.f1();
                    i12 = this.f25126c.i1();
                    n12 = this.f25126c.n1();
                    o12 = this.f25126c.o1();
                    j12 = this.f25126c.j1();
                    v12 = this.f25126c.v1();
                    String str2 = null;
                    if (v12 != null) {
                        str = CollectionsKt___CollectionsKt.t0(v12, ",", null, null, 0, null, null, 62, null);
                    } else {
                        str = null;
                    }
                    g12 = this.f25126c.g1();
                    if (g12 != null) {
                        str2 = g12.getKeyName();
                    }
                    String str3 = str2;
                    t12 = this.f25126c.t1();
                    h12 = this.f25126c.h1();
                    if (h12 != null) {
                        z11 = true;
                    }
                    u12 = this.f25126c.u1();
                    a11.d0(i0.e.c(eVar, d12, 0, i12, n12, o12, j12, str, str3, t12, z11, f12, u12, 2, null));
                }
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsActivity$registerObservers$1(ListingDetailsActivity listingDetailsActivity, zz.a<? super ListingDetailsActivity$registerObservers$1> aVar) {
        super(2, aVar);
        this.f25123b = listingDetailsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsActivity$registerObservers$1(this.f25123b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25122a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
                throw new KotlinNothingValueException();
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            Boolean value = this.f25123b.x0().A1().getValue();
            x10.a.b("Details:: isSeller:: " + value, new Object[0]);
            StateFlow<Boolean> A1 = this.f25123b.x0().A1();
            if (A1 != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25123b, null);
                this.f25122a = 1;
                if (FlowKt.collectLatest(A1, anonymousClass1, this) == f11) {
                    return f11;
                }
            }
        }
        SharedFlow<SignInIntention> f12 = this.f25123b.x0().f1();
        final ListingDetailsActivity listingDetailsActivity = this.f25123b;
        FlowCollector<SignInIntention> flowCollector = new FlowCollector<SignInIntention>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$registerObservers$1.2
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(SignInIntention signInIntention, zz.a<? super wz.p> aVar) {
                e.a.a(ListingDetailsActivity.this.e1(), signInIntention.getAuthenticationSourcePage(), signInIntention, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsActivity$registerObservers$1$2$emit$2
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }
                }, 4, null);
                return wz.p.f75480a;
            }
        };
        this.f25122a = 2;
        if (f12.collect(flowCollector, this) == f11) {
            return f11;
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsActivity$registerObservers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
