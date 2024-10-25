package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
import zf.a;
/* compiled from: NewListingDetailsFragment.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$26", f = "NewListingDetailsFragment.kt", l = {424}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NewListingDetailsFragment$registerObservers$26 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27118a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsFragment f27119b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$26$1", f = "NewListingDetailsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$26$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<ListingDetailsEntity, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27120a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f27121b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NewListingDetailsFragment f27122c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27122c = newListingDetailsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(ListingDetailsEntity listingDetailsEntity, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(listingDetailsEntity, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27122c, aVar);
            anonymousClass1.f27121b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ListingDetailsActivity listingDetailsActivity;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f27120a == 0) {
                f.b(obj);
                ListingDetailsEntity listingDetailsEntity = (ListingDetailsEntity) this.f27121b;
                if (listingDetailsEntity != null) {
                    androidx.fragment.app.p activity = this.f27122c.getActivity();
                    if (activity instanceof ListingDetailsActivity) {
                        listingDetailsActivity = (ListingDetailsActivity) activity;
                    } else {
                        listingDetailsActivity = null;
                    }
                    if (listingDetailsActivity != null) {
                        listingDetailsActivity.z1(new a.C0991a(null, null, listingDetailsEntity, 3, null));
                    }
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsFragment$registerObservers$26(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super NewListingDetailsFragment$registerObservers$26> aVar) {
        super(1, aVar);
        this.f27119b = newListingDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new NewListingDetailsFragment$registerObservers$26(this.f27119b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27118a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<ListingDetailsEntity> J1 = this.f27119b.B().J1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27119b, null);
            this.f27118a = 1;
            if (FlowKt.collectLatest(J1, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((NewListingDetailsFragment$registerObservers$26) create(aVar)).invokeSuspend(p.f75480a);
    }
}
