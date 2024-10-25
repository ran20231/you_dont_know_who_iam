package com.forsale.app.datalayer.repositories;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchRecommendedListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SearchRecommendedListingsRepository", f = "SearchRecommendedListingsRepository.kt", l = {FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS, FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION}, m = "saveSearchRecommendedListings")
/* loaded from: classes2.dex */
public final class SearchRecommendedListingsRepository$saveSearchRecommendedListings$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SearchRecommendedListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRecommendedListingsRepository$saveSearchRecommendedListings$1(SearchRecommendedListingsRepository searchRecommendedListingsRepository, zz.a<? super SearchRecommendedListingsRepository$saveSearchRecommendedListings$1> aVar) {
        super(aVar);
        this.this$0 = searchRecommendedListingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object saveSearchRecommendedListings;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        saveSearchRecommendedListings = this.this$0.saveSearchRecommendedListings(null, this);
        return saveSearchRecommendedListings;
    }
}
