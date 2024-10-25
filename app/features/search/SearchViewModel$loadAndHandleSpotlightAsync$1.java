package com.forsale.app.features.search;

import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ListingsRepository;
import com.forsale.app.utils.itemutils.TextHolder;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel$loadAndHandleSpotlightAsync$1", f = "SearchViewModel.kt", l = {216}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchViewModel$loadAndHandleSpotlightAsync$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36874a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchViewModel f36875b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel$loadAndHandleSpotlightAsync$1$1", f = "SearchViewModel.kt", l = {217}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.search.SearchViewModel$loadAndHandleSpotlightAsync$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.l<zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f36876a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SearchViewModel f36877b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SearchViewModel searchViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(1, aVar);
            this.f36877b = searchViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(zz.a<?> aVar) {
            return new AnonymousClass1(this.f36877b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            ListingsRepository listingsRepository;
            androidx.lifecycle.b0 b0Var;
            androidx.lifecycle.b0 b0Var2;
            androidx.lifecycle.b0 b0Var3;
            int i11;
            boolean z11;
            androidx.lifecycle.b0 b0Var4;
            androidx.lifecycle.b0 b0Var5;
            List g12;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i12 = this.f36876a;
            if (i12 != 0) {
                if (i12 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                listingsRepository = this.f36877b.f36834m0;
                this.f36876a = 1;
                obj = listingsRepository.getSpotlightListings(this);
                if (obj == f11) {
                    return f11;
                }
            }
            SearchViewModel searchViewModel = this.f36877b;
            ListingsResponse listingsResponse = (ListingsResponse) obj;
            ListingsResponse.UISettings.PinningSettings pinningSettings = listingsResponse.getUiSettings().getPinningSettings();
            b0Var = searchViewModel.B0;
            b0Var.postValue(new TextHolder(null, new TextHolder.LocalizedText(pinningSettings.getTitle().getAr(), pinningSettings.getTitle().getEn()), null, 5, null));
            b0Var2 = searchViewModel.C0;
            b0Var2.postValue(new TextHolder(null, new TextHolder.LocalizedText(pinningSettings.getSubtitle().getAr(), pinningSettings.getSubtitle().getEn()), null, 5, null));
            ListingsResponse.Listings listings = listingsResponse.getListings();
            b0Var3 = searchViewModel.F0;
            List<ListingItemBrief> pinnedShuffleItems = listings.getPinnedShuffleItems();
            boolean z12 = false;
            if (pinnedShuffleItems != null) {
                i11 = pinnedShuffleItems.size();
            } else {
                i11 = 0;
            }
            if (i11 > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            b0Var3.postValue(kotlin.coroutines.jvm.internal.a.a(z11));
            b0Var4 = searchViewModel.E0;
            List<ListingItemBrief> pinnedShuffleItems2 = listings.getPinnedShuffleItems();
            if (pinnedShuffleItems2 != null) {
                z12 = !pinnedShuffleItems2.isEmpty();
            }
            b0Var4.postValue(kotlin.coroutines.jvm.internal.a.a(z12));
            b0Var5 = searchViewModel.D0;
            g12 = searchViewModel.g1(listingsResponse);
            b0Var5.postValue(g12);
            return wz.p.f75480a;
        }

        @Override // g00.l
        public final Object invoke(zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$loadAndHandleSpotlightAsync$1(SearchViewModel searchViewModel, zz.a<? super SearchViewModel$loadAndHandleSpotlightAsync$1> aVar) {
        super(2, aVar);
        this.f36875b = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchViewModel$loadAndHandleSpotlightAsync$1(this.f36875b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object E1;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36874a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SearchViewModel searchViewModel = this.f36875b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(searchViewModel, null);
            this.f36874a = 1;
            E1 = searchViewModel.E1(false, anonymousClass1, this);
            if (E1 == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchViewModel$loadAndHandleSpotlightAsync$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
