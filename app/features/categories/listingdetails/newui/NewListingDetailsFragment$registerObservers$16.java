package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsFragment.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$16", f = "NewListingDetailsFragment.kt", l = {355}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsFragment$registerObservers$16 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27091a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsFragment f27092b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$16$1", f = "NewListingDetailsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$16$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<ListingItemDetails, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27093a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f27094b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NewListingDetailsFragment f27095c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27095c = newListingDetailsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(ListingItemDetails listingItemDetails, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(listingItemDetails, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27095c, aVar);
            anonymousClass1.f27094b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f27093a == 0) {
                f.b(obj);
                ListingItemDetails listingItemDetails = (ListingItemDetails) this.f27094b;
                if (listingItemDetails != null) {
                    NewListingDetailsFragment newListingDetailsFragment = this.f27095c;
                    newListingDetailsFragment.z0(listingItemDetails, newListingDetailsFragment.B().O1(), null);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsFragment$registerObservers$16(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super NewListingDetailsFragment$registerObservers$16> aVar) {
        super(1, aVar);
        this.f27092b = newListingDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new NewListingDetailsFragment$registerObservers$16(this.f27092b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27091a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<ListingItemDetails> f22 = this.f27092b.B().f2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27092b, null);
            this.f27091a = 1;
            if (FlowKt.collectLatest(f22, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((NewListingDetailsFragment$registerObservers$16) create(aVar)).invokeSuspend(p.f75480a);
    }
}
