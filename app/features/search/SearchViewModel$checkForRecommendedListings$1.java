package com.forsale.app.features.search;

import com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel$checkForRecommendedListings$1", f = "SearchViewModel.kt", l = {362, 364}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchViewModel$checkForRecommendedListings$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36852a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchViewModel f36853b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$checkForRecommendedListings$1(SearchViewModel searchViewModel, zz.a<? super SearchViewModel$checkForRecommendedListings$1> aVar) {
        super(2, aVar);
        this.f36853b = searchViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchViewModel$checkForRecommendedListings$1(this.f36853b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        SearchRecommendedListingsRepository searchRecommendedListingsRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36852a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            SearchViewModel searchViewModel = this.f36853b;
            this.f36852a = 1;
            obj = searchViewModel.O1(this);
            if (obj == f11) {
                return f11;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            searchRecommendedListingsRepository = this.f36853b.f36839r0;
            this.f36852a = 2;
            if (searchRecommendedListingsRepository.clearSearchRecommendedListings(this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchViewModel$checkForRecommendedListings$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
