package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.features.search.SearchFocusViewModel;
import com.forsale.app.utils.analytics.SearchSource;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$onApiSuggestionClicked$1", f = "SearchFocusViewModel.kt", l = {514}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$onApiSuggestionClicked$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36771a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchItemModel f36772b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36773c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel$onApiSuggestionClicked$1(SearchItemModel searchItemModel, SearchFocusViewModel searchFocusViewModel, zz.a<? super SearchFocusViewModel$onApiSuggestionClicked$1> aVar) {
        super(2, aVar);
        this.f36772b = searchItemModel;
        this.f36773c = searchFocusViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusViewModel$onApiSuggestionClicked$1(this.f36772b, this.f36773c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36771a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            String i12 = this.f36772b.i();
            SearchSource searchSource = SearchSource.AUTOCOMPLETE;
            CategoryEntity c11 = this.f36772b.c();
            GetListingsBody.FiltrationData e11 = this.f36772b.e();
            SearchAnalyticsData.a aVar = SearchAnalyticsData.f36633x;
            SearchFocusViewModel.SearchState U0 = this.f36773c.U0();
            SearchItemModel searchItemModel = this.f36772b;
            SearchAnalyticsData c12 = aVar.c(U0, searchItemModel, kotlin.coroutines.jvm.internal.a.d(searchItemModel.h()), SearchAnalyticsData.SearchSource.SCOPED_SEARCH);
            SearchFocusViewModel searchFocusViewModel = this.f36773c;
            this.f36771a = 1;
            if (SearchFocusViewModel.j1(searchFocusViewModel, i12, searchSource, c12, c11, e11, null, this, 32, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusViewModel$onApiSuggestionClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
