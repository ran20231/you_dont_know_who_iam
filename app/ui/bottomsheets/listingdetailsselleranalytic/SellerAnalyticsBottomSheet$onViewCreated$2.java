package com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic;

import android.content.Context;
import com.forsale.app.features.more.mylistings.AnalyticModel;
import com.forsale.app.features.more.mylistings.MyListingAnalyticsActivity;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: SellerAnalyticsBottomSheet.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$onViewCreated$2", f = "SellerAnalyticsBottomSheet.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SellerAnalyticsBottomSheet$onViewCreated$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38788a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerAnalyticsBottomSheet f38789b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerAnalyticsBottomSheet.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$onViewCreated$2$1", f = "SellerAnalyticsBottomSheet.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$onViewCreated$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<AnalyticModel, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38790a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38791b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SellerAnalyticsBottomSheet f38792c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SellerAnalyticsBottomSheet sellerAnalyticsBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f38792c = sellerAnalyticsBottomSheet;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(AnalyticModel analyticModel, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(analyticModel, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38792c, aVar);
            anonymousClass1.f38791b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f38790a == 0) {
                f.b(obj);
                AnalyticModel analyticModel = (AnalyticModel) this.f38791b;
                Context context = this.f38792c.getContext();
                if (context != null) {
                    MyListingAnalyticsActivity.f31905z.a(context, analyticModel);
                }
                this.f38792c.dismiss();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerAnalyticsBottomSheet$onViewCreated$2(SellerAnalyticsBottomSheet sellerAnalyticsBottomSheet, zz.a<? super SellerAnalyticsBottomSheet$onViewCreated$2> aVar) {
        super(1, aVar);
        this.f38789b = sellerAnalyticsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new SellerAnalyticsBottomSheet$onViewCreated$2(this.f38789b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f38788a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<AnalyticModel> y02 = this.f38789b.t().y0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38789b, null);
            this.f38788a = 1;
            if (FlowKt.collectLatest(y02, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((SellerAnalyticsBottomSheet$onViewCreated$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
