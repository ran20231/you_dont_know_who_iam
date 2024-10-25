package com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import g00.l;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
import zf.a;
/* compiled from: SellerAnalyticsBottomSheet.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$onViewCreated$3", f = "SellerAnalyticsBottomSheet.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SellerAnalyticsBottomSheet$onViewCreated$3 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38793a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerAnalyticsBottomSheet f38794b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SellerAnalyticsBottomSheet.kt */
    @d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$onViewCreated$3$1", f = "SellerAnalyticsBottomSheet.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsBottomSheet$onViewCreated$3$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<ListingDetailsEntity, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f38795a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f38796b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SellerAnalyticsBottomSheet f38797c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SellerAnalyticsBottomSheet sellerAnalyticsBottomSheet, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f38797c = sellerAnalyticsBottomSheet;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(ListingDetailsEntity listingDetailsEntity, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(listingDetailsEntity, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38797c, aVar);
            anonymousClass1.f38796b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ListingDetailsActivity listingDetailsActivity;
            b.f();
            if (this.f38795a == 0) {
                f.b(obj);
                ListingDetailsEntity listingDetailsEntity = (ListingDetailsEntity) this.f38796b;
                if (listingDetailsEntity != null) {
                    androidx.fragment.app.p activity = this.f38797c.getActivity();
                    if (activity instanceof ListingDetailsActivity) {
                        listingDetailsActivity = (ListingDetailsActivity) activity;
                    } else {
                        listingDetailsActivity = null;
                    }
                    if (listingDetailsActivity != null) {
                        listingDetailsActivity.z1(new a.C0991a(null, PostListingIntention.BOOST, listingDetailsEntity, 1, null));
                    }
                }
                this.f38797c.dismiss();
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerAnalyticsBottomSheet$onViewCreated$3(SellerAnalyticsBottomSheet sellerAnalyticsBottomSheet, zz.a<? super SellerAnalyticsBottomSheet$onViewCreated$3> aVar) {
        super(1, aVar);
        this.f38794b = sellerAnalyticsBottomSheet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new SellerAnalyticsBottomSheet$onViewCreated$3(this.f38794b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f38793a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<ListingDetailsEntity> z02 = this.f38794b.t().z0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f38794b, null);
            this.f38793a = 1;
            if (FlowKt.collectLatest(z02, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((SellerAnalyticsBottomSheet$onViewCreated$3) create(aVar)).invokeSuspend(p.f75480a);
    }
}
