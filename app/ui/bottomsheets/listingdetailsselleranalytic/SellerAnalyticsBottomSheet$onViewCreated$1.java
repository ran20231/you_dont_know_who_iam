package com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic;

import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: SellerAnalyticsBottomSheet.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$onViewCreated$1", f = "SellerAnalyticsBottomSheet.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SellerAnalyticsBottomSheet$onViewCreated$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38784a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerAnalyticsBottomSheet f38785b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerAnalyticsBottomSheet.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$onViewCreated$1$1", f = "SellerAnalyticsBottomSheet.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38786a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SellerAnalyticsBottomSheet f38787b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SellerAnalyticsBottomSheet sellerAnalyticsBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f38787b = sellerAnalyticsBottomSheet;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f38787b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f38786a == 0) {
                f.b(obj);
                this.f38787b.dismiss();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerAnalyticsBottomSheet$onViewCreated$1(SellerAnalyticsBottomSheet sellerAnalyticsBottomSheet, zz.a<? super SellerAnalyticsBottomSheet$onViewCreated$1> aVar) {
        super(1, aVar);
        this.f38785b = sellerAnalyticsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new SellerAnalyticsBottomSheet$onViewCreated$1(this.f38785b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f38784a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> A0 = this.f38785b.t().A0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38785b, null);
            this.f38784a = 1;
            if (FlowKt.collectLatest(A0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((SellerAnalyticsBottomSheet$onViewCreated$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
