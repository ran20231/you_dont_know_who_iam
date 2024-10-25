package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime;

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
/* compiled from: ListingLifeTimeItem.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$3", f = "ListingLifeTimeItem.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$3 extends SuspendLambda implements l<a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27796a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingLifeTimeItem f27797b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListingLifeTimeItem.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$3$1", f = "ListingLifeTimeItem.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$3$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<ListingDetailsEntity, a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27798a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f27799b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ListingLifeTimeItem f27800c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ListingLifeTimeItem listingLifeTimeItem, a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27800c = listingLifeTimeItem;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(ListingDetailsEntity listingDetailsEntity, a<? super p> aVar) {
            return ((AnonymousClass1) create(listingDetailsEntity, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final a<p> create(Object obj, a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27800c, aVar);
            anonymousClass1.f27799b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            androidx.fragment.app.p activity;
            ListingDetailsActivity listingDetailsActivity;
            b.f();
            if (this.f27798a == 0) {
                f.b(obj);
                ListingDetailsEntity listingDetailsEntity = (ListingDetailsEntity) this.f27799b;
                if (listingDetailsEntity != null && (activity = this.f27800c.v().getActivity()) != null) {
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
    public ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$3(ListingLifeTimeItem listingLifeTimeItem, zz.a<? super ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$3> aVar) {
        super(1, aVar);
        this.f27797b = listingLifeTimeItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$3(this.f27797b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f27796a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<ListingDetailsEntity> g11 = this.f27797b.x().g();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27797b, null);
            this.f27796a = 1;
            if (FlowKt.collectLatest(g11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((ListingLifeTimeItem$ListingLifeTimeViewHolder$bindView$3) create(aVar)).invokeSuspend(p.f75480a);
    }
}
