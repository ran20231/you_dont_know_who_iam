package com.forsale.app.features.categories.home.homelandingscreen;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.utils.CoroutinesExtensionsKt;
import com.forsale.app.utils.ErrorHandlingExtensionsKt;
import com.forsale.app.utils.itemutils.TextHolder;
import g00.l;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerticalViewModel.kt */
@d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadNewArrivalsAsync$1", f = "VerticalViewModel.kt", l = {379}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerticalViewModel$loadNewArrivalsAsync$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super Throwable>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24028a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f24029b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VerticalViewModel f24030c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f24031d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerticalViewModel.kt */
    @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadNewArrivalsAsync$1$1", f = "VerticalViewModel.kt", l = {380, 380}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadNewArrivalsAsync$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements l<zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f24032a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VerticalViewModel f24033b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f24034c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: VerticalViewModel.kt */
        @d(c = "com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadNewArrivalsAsync$1$1$1", f = "VerticalViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.VerticalViewModel$loadNewArrivalsAsync$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C02641 extends SuspendLambda implements p<ListingsResponse, zz.a<? super wz.p>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f24035a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f24036b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ VerticalViewModel f24037c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02641(VerticalViewModel verticalViewModel, zz.a<? super C02641> aVar) {
                super(2, aVar);
                this.f24037c = verticalViewModel;
            }

            @Override // g00.p
            /* renamed from: b */
            public final Object invoke(ListingsResponse listingsResponse, zz.a<? super wz.p> aVar) {
                return ((C02641) create(listingsResponse, aVar)).invokeSuspend(wz.p.f75480a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                C02641 c02641 = new C02641(this.f24037c, aVar);
                c02641.f24036b = obj;
                return c02641;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                b0 b0Var;
                b0 b0Var2;
                b0 b0Var3;
                boolean z11;
                int y11;
                b0 b0Var4;
                qc.b P1;
                kotlin.coroutines.intrinsics.b.f();
                if (this.f24035a == 0) {
                    f.b(obj);
                    ListingsResponse listingsResponse = (ListingsResponse) this.f24036b;
                    b0Var = this.f24037c.f23945i1;
                    ListingsResponse.UISettings.Label title = listingsResponse.getUiSettings().getPinningSettings().getTitle();
                    b0Var.postValue(new TextHolder(null, new TextHolder.LocalizedText(title.getAr(), title.getEn()), null, 5, null));
                    b0Var2 = this.f24037c.f23946j1;
                    ListingsResponse.UISettings.Label subtitle = listingsResponse.getUiSettings().getPinningSettings().getSubtitle();
                    b0Var2.postValue(new TextHolder(null, new TextHolder.LocalizedText(subtitle.getAr(), subtitle.getEn()), null, 5, null));
                    b0Var3 = this.f24037c.f23947k1;
                    if (listingsResponse.getUiSettings().getPinningSettings().getTitle().getLocalized().length() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b0Var3.postValue(kotlin.coroutines.jvm.internal.a.a(z11));
                    List<ListingItemBrief> normalItems = listingsResponse.getListings().getNormalItems();
                    VerticalViewModel verticalViewModel = this.f24037c;
                    y11 = s.y(normalItems, 10);
                    ArrayList arrayList = new ArrayList(y11);
                    for (ListingItemBrief listingItemBrief : normalItems) {
                        P1 = verticalViewModel.P1(listingItemBrief, listingsResponse.getUiSettings().getListingsSettings(), true, ListingsTypes.NEW_ARRIVALS);
                        arrayList.add(P1);
                    }
                    b0Var4 = this.f24037c.f23944h1;
                    b0Var4.postValue(arrayList);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VerticalViewModel verticalViewModel, int i11, zz.a<? super AnonymousClass1> aVar) {
            super(1, aVar);
            this.f24033b = verticalViewModel;
            this.f24034c = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(zz.a<?> aVar) {
            return new AnonymousClass1(this.f24033b, this.f24034c, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            VerticalRepository verticalRepository;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f24032a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        f.b(obj);
                        return wz.p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            } else {
                f.b(obj);
                verticalRepository = this.f24033b.f23948l0;
                int i12 = this.f24034c;
                this.f24032a = 1;
                obj = verticalRepository.c(i12, this);
                if (obj == f11) {
                    return f11;
                }
            }
            C02641 c02641 = new C02641(this.f24033b, null);
            this.f24032a = 2;
            if (CoroutinesExtensionsKt.a(obj, c02641, this) == f11) {
                return f11;
            }
            return wz.p.f75480a;
        }

        @Override // g00.l
        public final Object invoke(zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalViewModel$loadNewArrivalsAsync$1(boolean z11, VerticalViewModel verticalViewModel, int i11, zz.a<? super VerticalViewModel$loadNewArrivalsAsync$1> aVar) {
        super(2, aVar);
        this.f24029b = z11;
        this.f24030c = verticalViewModel;
        this.f24031d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerticalViewModel$loadNewArrivalsAsync$1(this.f24029b, this.f24030c, this.f24031d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24028a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            boolean z11 = this.f24029b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24030c, this.f24031d, null);
            this.f24028a = 1;
            obj = ErrorHandlingExtensionsKt.b(z11, anonymousClass1, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super Throwable> aVar) {
        return ((VerticalViewModel$loadNewArrivalsAsync$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
