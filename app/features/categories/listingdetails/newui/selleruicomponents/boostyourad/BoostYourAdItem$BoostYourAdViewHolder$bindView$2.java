package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.boostyourad;

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
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BoostYourAdItem.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.boostyourad.BoostYourAdItem$BoostYourAdViewHolder$bindView$2", f = "BoostYourAdItem.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BoostYourAdItem$BoostYourAdViewHolder$bindView$2 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27738a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BoostYourAdItem f27739b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BoostYourAdItem.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.boostyourad.BoostYourAdItem$BoostYourAdViewHolder$bindView$2$1", f = "BoostYourAdItem.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.boostyourad.BoostYourAdItem$BoostYourAdViewHolder$bindView$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<ListingDetailsEntity, a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27740a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f27741b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BoostYourAdItem f27742c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BoostYourAdItem boostYourAdItem, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27742c = boostYourAdItem;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(ListingDetailsEntity listingDetailsEntity, a<? super p> aVar) {
            return ((AnonymousClass1) create(listingDetailsEntity, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27742c, aVar);
            anonymousClass1.f27741b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ListingDetailsActivity listingDetailsActivity;
            b.f();
            if (this.f27740a == 0) {
                f.b(obj);
                ListingDetailsEntity listingDetailsEntity = (ListingDetailsEntity) this.f27741b;
                if (listingDetailsEntity != null) {
                    androidx.fragment.app.p activity = this.f27742c.f27734g.getActivity();
                    if (activity instanceof ListingDetailsActivity) {
                        listingDetailsActivity = (ListingDetailsActivity) activity;
                    } else {
                        listingDetailsActivity = null;
                    }
                    if (listingDetailsActivity != null) {
                        listingDetailsActivity.z1(new a.C0991a(null, PostListingIntention.BOOST, listingDetailsEntity, 1, null));
                    }
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoostYourAdItem$BoostYourAdViewHolder$bindView$2(BoostYourAdItem boostYourAdItem, zz.a<? super BoostYourAdItem$BoostYourAdViewHolder$bindView$2> aVar) {
        super(1, aVar);
        this.f27739b = boostYourAdItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new BoostYourAdItem$BoostYourAdViewHolder$bindView$2(this.f27739b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27738a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<ListingDetailsEntity> c11 = this.f27739b.f27733f.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27739b, null);
            this.f27738a = 1;
            if (FlowKt.collectLatest(c11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((BoostYourAdItem$BoostYourAdViewHolder$bindView$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
