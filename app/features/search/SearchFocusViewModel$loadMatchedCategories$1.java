package com.forsale.app.features.search;

import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.features.search.SearchFocusViewModel;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$loadMatchedCategories$1", f = "SearchFocusViewModel.kt", l = {532}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$loadMatchedCategories$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36749a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36750b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f36751c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel$loadMatchedCategories$1(SearchFocusViewModel searchFocusViewModel, String str, zz.a<? super SearchFocusViewModel$loadMatchedCategories$1> aVar) {
        super(2, aVar);
        this.f36750b = searchFocusViewModel;
        this.f36751c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusViewModel$loadMatchedCategories$1(this.f36750b, this.f36751c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MatchingCategoriesRepository matchingCategoriesRepository;
        Object d11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36749a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
                d11 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            matchingCategoriesRepository = this.f36750b.f36709t0;
            String str = this.f36751c;
            this.f36749a = 1;
            d11 = matchingCategoriesRepository.d(str, this);
            if (d11 == f11) {
                return f11;
            }
        }
        SearchFocusViewModel searchFocusViewModel = this.f36750b;
        searchFocusViewModel.z1(SearchFocusViewModel.SearchState.b(searchFocusViewModel.U0(), null, null, null, null, null, null, false, null, (List) d11, null, SearchAnalyticsData.SearchSource.MATCHING_CATEGORIES, 767, null));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusViewModel$loadMatchedCategories$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
