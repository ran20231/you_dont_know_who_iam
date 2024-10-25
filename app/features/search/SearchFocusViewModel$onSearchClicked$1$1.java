package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.analytics.SearchSource;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$onSearchClicked$1$1", f = "SearchFocusViewModel.kt", l = {237}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$onSearchClicked$1$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36785a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36786b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SearchItemModel f36787c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel$onSearchClicked$1$1(SearchFocusViewModel searchFocusViewModel, SearchItemModel searchItemModel, zz.a<? super SearchFocusViewModel$onSearchClicked$1$1> aVar) {
        super(2, aVar);
        this.f36786b = searchFocusViewModel;
        this.f36787c = searchItemModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusViewModel$onSearchClicked$1$1(this.f36786b, this.f36787c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36785a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            String h11 = this.f36786b.U0().h();
            SearchSource searchSource = SearchSource.SEARCH_BAR;
            CategoryEntity c11 = this.f36787c.c();
            GetListingsBody.FiltrationData e11 = this.f36787c.e();
            SearchAnalyticsData d11 = SearchAnalyticsData.a.d(SearchAnalyticsData.f36633x, this.f36786b.U0(), this.f36787c, null, SearchAnalyticsData.SearchSource.WRITING, 4, null);
            SearchFocusViewModel searchFocusViewModel = this.f36786b;
            this.f36785a = 1;
            if (SearchFocusViewModel.j1(searchFocusViewModel, h11, searchSource, d11, c11, e11, null, this, 32, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusViewModel$onSearchClicked$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
