package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.features.search.SearchItemModel;
import com.forsale.app.interactors.TrendingClickInteractor;
import com.forsale.app.utils.analytics.SearchSource;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$onTrendsItemClicked$1$1", f = "CategoryListingsViewModel.kt", l = {1069, 1068}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$onTrendsItemClicked$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28580a;

    /* renamed from: b  reason: collision with root package name */
    int f28581b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28582c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f28583d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<TrendEntity> f28584e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ TrendEntity f28585f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$onTrendsItemClicked$1$1(CategoryListingsViewModel categoryListingsViewModel, String str, List<TrendEntity> list, TrendEntity trendEntity, zz.a<? super CategoryListingsViewModel$onTrendsItemClicked$1$1> aVar) {
        super(2, aVar);
        this.f28582c = categoryListingsViewModel;
        this.f28583d = str;
        this.f28584e = list;
        this.f28585f = trendEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$onTrendsItemClicked$1$1(this.f28582c, this.f28583d, this.f28584e, this.f28585f, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        TrendingClickInteractor trendingClickInteractor;
        Object d11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28581b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
            mutableSharedFlow = (MutableSharedFlow) this.f28580a;
            d11 = obj;
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f28582c.f28380r1;
            trendingClickInteractor = this.f28582c.C0;
            SearchItemModel searchItemModel = new SearchItemModel(0, this.f28583d, null, null, null, null, 0, 125, null);
            int indexOf = this.f28584e.indexOf(this.f28585f);
            SearchAnalyticsData searchAnalyticsData = new SearchAnalyticsData(null, null, null, null, null, null, kotlin.coroutines.jvm.internal.a.d(indexOf), null, SearchAnalyticsData.SearchSource.TRENDING, false, 655, null);
            String str = this.f28583d;
            SearchSource searchSource = SearchSource.TRENDING_NO_SEARCH_RESULT;
            Integer d12 = kotlin.coroutines.jvm.internal.a.d(r0.F8);
            this.f28580a = mutableSharedFlow;
            this.f28581b = 1;
            d11 = trendingClickInteractor.d(searchItemModel, searchAnalyticsData, str, searchSource, d12, this);
            if (d11 == f11) {
                return f11;
            }
        }
        this.f28580a = null;
        this.f28581b = 2;
        if (mutableSharedFlow.emit(d11, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$onTrendsItemClicked$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
