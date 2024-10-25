package com.forsale.app.features.categories.listingdetails.newui;

import android.content.Context;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
import zf.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsFragment.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$27", f = "NewListingDetailsFragment.kt", l = {433}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsFragment$registerObservers$27 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27123a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsFragment f27124b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$27$1", f = "NewListingDetailsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$27$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<ListingItemDetails, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27125a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f27126b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NewListingDetailsFragment f27127c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NewListingDetailsFragment.kt */
        @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$27$1$1", f = "NewListingDetailsFragment.kt", l = {437, 440}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$27$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02891 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            Object f27128a;

            /* renamed from: b  reason: collision with root package name */
            Object f27129b;

            /* renamed from: c  reason: collision with root package name */
            int f27130c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ListingItemDetails f27131d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ NewListingDetailsFragment f27132e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02891(ListingItemDetails listingItemDetails, NewListingDetailsFragment newListingDetailsFragment, zz.a<? super C02891> aVar) {
                super(2, aVar);
                this.f27131d = listingItemDetails;
                this.f27132e = newListingDetailsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                return new C02891(this.f27131d, this.f27132e, aVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object f11;
                ListingItemDetails listingItemDetails;
                ListingDetailsEntity.Companion companion;
                androidx.activity.result.b bVar;
                androidx.activity.result.b bVar2;
                ListingDetailsEntity listingDetailsEntity;
                f11 = kotlin.coroutines.intrinsics.b.f();
                int i11 = this.f27130c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            bVar2 = (androidx.activity.result.b) this.f27129b;
                            f.b(obj);
                            listingDetailsEntity = (ListingDetailsEntity) this.f27128a;
                            Context requireContext = this.f27132e.requireContext();
                            o.h(requireContext, "requireContext(...)");
                            bVar2.a(((zf.b) obj).b(requireContext, new a.C0991a(null, PostListingIntention.RE_POST, listingDetailsEntity, 1, null)));
                            return p.f75480a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    listingItemDetails = (ListingItemDetails) this.f27129b;
                    companion = (ListingDetailsEntity.Companion) this.f27128a;
                    f.b(obj);
                } else {
                    f.b(obj);
                    ListingDetailsEntity.Companion companion2 = ListingDetailsEntity.Companion;
                    listingItemDetails = this.f27131d;
                    NewListingDetailsViewModel B = this.f27132e.B();
                    this.f27128a = companion2;
                    this.f27129b = listingItemDetails;
                    this.f27130c = 1;
                    Object I1 = B.I1(this);
                    if (I1 == f11) {
                        return f11;
                    }
                    companion = companion2;
                    obj = I1;
                }
                ListingDetailsEntity from = companion.from(listingItemDetails, (String) obj);
                bVar = this.f27132e.F;
                this.f27128a = from;
                this.f27129b = bVar;
                this.f27130c = 2;
                Object a11 = this.f27132e.h0().get().a(this);
                if (a11 == f11) {
                    return f11;
                }
                bVar2 = bVar;
                listingDetailsEntity = from;
                obj = a11;
                Context requireContext2 = this.f27132e.requireContext();
                o.h(requireContext2, "requireContext(...)");
                bVar2.a(((zf.b) obj).b(requireContext2, new a.C0991a(null, PostListingIntention.RE_POST, listingDetailsEntity, 1, null)));
                return p.f75480a;
            }

            @Override // g00.p
            public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                return ((C02891) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27127c = newListingDetailsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(ListingItemDetails listingItemDetails, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(listingItemDetails, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27127c, aVar);
            anonymousClass1.f27126b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f27125a == 0) {
                f.b(obj);
                ListingItemDetails listingItemDetails = (ListingItemDetails) this.f27126b;
                if (listingItemDetails != null) {
                    NewListingDetailsFragment newListingDetailsFragment = this.f27127c;
                    BuildersKt__Builders_commonKt.launch$default(newListingDetailsFragment, null, null, new C02891(listingItemDetails, newListingDetailsFragment, null), 3, null);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsFragment$registerObservers$27(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super NewListingDetailsFragment$registerObservers$27> aVar) {
        super(1, aVar);
        this.f27124b = newListingDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new NewListingDetailsFragment$registerObservers$27(this.f27124b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27123a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<ListingItemDetails> c22 = this.f27124b.B().c2();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27124b, null);
            this.f27123a = 1;
            if (FlowKt.collectLatest(c22, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((NewListingDetailsFragment$registerObservers$27) create(aVar)).invokeSuspend(p.f75480a);
    }
}
