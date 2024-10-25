package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import android.content.Context;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.auth.e;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel;
import com.forsale.app.features.categories.listingdetails.buyerscreen.FavouriteState;
import com.forsale.app.features.categories.listingdetails.buyerscreen.c;
import com.forsale.app.features.categories.listingdetails.buyerscreen.g;
import com.forsale.app.features.categories.listingdetails.buyerscreen.h;
import com.forsale.app.features.categories.listingdetails.buyerscreen.i;
import com.forsale.app.features.categories.listingdetails.buyerscreen.j;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.ui.bottomsheets.listingdetailschat.b;
import com.forsale.app.utils.ContextExtensionsKt;
import g00.l;
import g00.p;
import g00.q;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerScaffold.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$RenderBuyerScreenEvents$1", f = "BuyerScaffold.kt", l = {300}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerScaffoldKt$RenderBuyerScreenEvents$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26632a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f26633b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e f26634c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f26635d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l<UserProfileData, wz.p> f26636e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ q<Integer, ListingItemBrief, List<Integer>, wz.p> f26637f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Context f26638g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ l<DetailsModel, wz.p> f26639h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ l<b, wz.p> f26640i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyerScaffold.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$RenderBuyerScreenEvents$1$1", f = "BuyerScaffold.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$RenderBuyerScreenEvents$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<j, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26641a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f26642b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BuyerListingDetailsScreenViewModel f26643c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ e f26644d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g00.a<wz.p> f26645e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ l<UserProfileData, wz.p> f26646f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q<Integer, ListingItemBrief, List<Integer>, wz.p> f26647g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f26648h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ l<DetailsModel, wz.p> f26649i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ l<b, wz.p> f26650j;

        /* compiled from: BuyerScaffold.kt */
        /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt$RenderBuyerScreenEvents$1$1$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f26656a;

            static {
                int[] iArr = new int[FavouriteState.values().length];
                try {
                    iArr[FavouriteState.PENDING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f26656a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, e eVar, g00.a<wz.p> aVar, l<? super UserProfileData, wz.p> lVar, q<? super Integer, ? super ListingItemBrief, ? super List<Integer>, wz.p> qVar, Context context, l<? super DetailsModel, wz.p> lVar2, l<? super b, wz.p> lVar3, zz.a<? super AnonymousClass1> aVar2) {
            super(2, aVar2);
            this.f26643c = buyerListingDetailsScreenViewModel;
            this.f26644d = eVar;
            this.f26645e = aVar;
            this.f26646f = lVar;
            this.f26647g = qVar;
            this.f26648h = context;
            this.f26649i = lVar2;
            this.f26650j = lVar3;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(j jVar, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(jVar, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26643c, this.f26644d, this.f26645e, this.f26646f, this.f26647g, this.f26648h, this.f26649i, this.f26650j, aVar);
            anonymousClass1.f26642b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f26641a == 0) {
                f.b(obj);
                final j jVar = (j) this.f26642b;
                if (jVar instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.b) {
                    ShareText a11 = ((com.forsale.app.features.categories.listingdetails.buyerscreen.b) jVar).a();
                    ContextExtensionsKt.P(this.f26648h, a11.c(), a11.b());
                } else if (jVar instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.a) {
                    com.forsale.app.features.categories.listingdetails.buyerscreen.a aVar = (com.forsale.app.features.categories.listingdetails.buyerscreen.a) jVar;
                    if (a.f26656a[aVar.a().ordinal()] == 1) {
                        boolean b11 = aVar.b();
                        x10.a.b("isUser:: FavouriteState.PENDING: " + b11, new Object[0]);
                        if (aVar.b()) {
                            this.f26643c.p1();
                        } else {
                            this.f26643c.d0();
                        }
                    }
                } else if (jVar instanceof g) {
                    e eVar = this.f26644d;
                    SignInIntention a12 = ((g) jVar).a();
                    final BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = this.f26643c;
                    BuyerScaffoldKt.q(eVar, a12, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt.RenderBuyerScreenEvents.1.1.2
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BuyerListingDetailsScreenViewModel.this.o1();
                        }
                    });
                } else if (jVar instanceof h) {
                    e eVar2 = this.f26644d;
                    SignInIntention b12 = ((h) jVar).b();
                    final l<DetailsModel, wz.p> lVar = this.f26649i;
                    BuyerScaffoldKt.q(eVar2, b12, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt.RenderBuyerScreenEvents.1.1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            lVar.invoke(((h) jVar).a());
                        }
                    });
                } else if (jVar instanceof i) {
                    e eVar3 = this.f26644d;
                    SignInIntention b13 = ((i) jVar).b();
                    final l<b, wz.p> lVar2 = this.f26650j;
                    BuyerScaffoldKt.q(eVar3, b13, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.BuyerScaffoldKt.RenderBuyerScreenEvents.1.1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            lVar2.invoke(((i) jVar).a());
                        }
                    });
                } else if (jVar instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.f) {
                    this.f26645e.invoke();
                } else if (jVar instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.e) {
                    this.f26643c.r1(((com.forsale.app.features.categories.listingdetails.buyerscreen.e) jVar).a());
                    this.f26643c.j1();
                } else if (jVar instanceof com.forsale.app.features.categories.listingdetails.buyerscreen.d) {
                    this.f26646f.invoke(((com.forsale.app.features.categories.listingdetails.buyerscreen.d) jVar).a());
                } else if (jVar instanceof c) {
                    q<Integer, ListingItemBrief, List<Integer>, wz.p> qVar = this.f26647g;
                    c cVar = (c) jVar;
                    Integer d11 = kotlin.coroutines.jvm.internal.a.d(cVar.a());
                    ListingItemBrief b14 = cVar.b();
                    List<Integer> c11 = cVar.c();
                    if (c11 == null) {
                        c11 = r.n();
                    }
                    qVar.invoke(d11, b14, c11);
                }
                return wz.p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BuyerScaffoldKt$RenderBuyerScreenEvents$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, e eVar, g00.a<wz.p> aVar, l<? super UserProfileData, wz.p> lVar, q<? super Integer, ? super ListingItemBrief, ? super List<Integer>, wz.p> qVar, Context context, l<? super DetailsModel, wz.p> lVar2, l<? super b, wz.p> lVar3, a<? super BuyerScaffoldKt$RenderBuyerScreenEvents$1> aVar2) {
        super(2, aVar2);
        this.f26633b = buyerListingDetailsScreenViewModel;
        this.f26634c = eVar;
        this.f26635d = aVar;
        this.f26636e = lVar;
        this.f26637f = qVar;
        this.f26638g = context;
        this.f26639h = lVar2;
        this.f26640i = lVar3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BuyerScaffoldKt$RenderBuyerScreenEvents$1(this.f26633b, this.f26634c, this.f26635d, this.f26636e, this.f26637f, this.f26638g, this.f26639h, this.f26640i, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26632a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<j> j02 = this.f26633b.j0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26633b, this.f26634c, this.f26635d, this.f26636e, this.f26637f, this.f26638g, this.f26639h, this.f26640i, null);
            this.f26632a = 1;
            if (FlowKt.collectLatest(j02, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BuyerScaffoldKt$RenderBuyerScreenEvents$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
