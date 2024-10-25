package com.forsale.app.features.search;

import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.features.search.SearchFocusViewModel;
import com.forsale.app.utils.analytics.SearchSource;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$handleSearchResults$1", f = "SearchFocusViewModel.kt", l = {FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$handleSearchResults$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36744a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36745b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel$handleSearchResults$1(SearchFocusViewModel searchFocusViewModel, zz.a<? super SearchFocusViewModel$handleSearchResults$1> aVar) {
        super(2, aVar);
        this.f36745b = searchFocusViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusViewModel$handleSearchResults$1(this.f36745b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        String str;
        SearchSource searchSource;
        Integer num;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36744a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            str = this.f36745b.f36700k0;
            if (str == null) {
                str = this.f36745b.U0().h();
            }
            String str2 = str;
            searchSource = this.f36745b.f36703n0;
            SearchAnalyticsData.a aVar = SearchAnalyticsData.f36633x;
            SearchFocusViewModel.SearchState U0 = this.f36745b.U0();
            SearchItemModel searchItemModel = new SearchItemModel(0, this.f36745b.U0().h(), null, null, null, null, 0, 125, null);
            SearchAnalyticsData.SearchSource searchSource2 = SearchAnalyticsData.SearchSource.TRENDING;
            num = this.f36745b.f36704o0;
            SearchAnalyticsData c11 = aVar.c(U0, searchItemModel, num, searchSource2);
            SearchFocusViewModel searchFocusViewModel = this.f36745b;
            this.f36744a = 1;
            if (SearchFocusViewModel.j1(searchFocusViewModel, str2, searchSource, c11, null, null, null, this, 32, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusViewModel$handleSearchResults$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
