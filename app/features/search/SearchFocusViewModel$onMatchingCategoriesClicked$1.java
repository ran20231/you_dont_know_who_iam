package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.analytics.SearchSource;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$onMatchingCategoriesClicked$1", f = "SearchFocusViewModel.kt", l = {310, 309}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$onMatchingCategoriesClicked$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f36779a;

    /* renamed from: b  reason: collision with root package name */
    int f36780b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36781c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f36782d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ SearchAnalyticsData.SearchSource f36783e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel$onMatchingCategoriesClicked$1(SearchFocusViewModel searchFocusViewModel, CategoryEntity categoryEntity, SearchAnalyticsData.SearchSource searchSource, zz.a<? super SearchFocusViewModel$onMatchingCategoriesClicked$1> aVar) {
        super(2, aVar);
        this.f36781c = searchFocusViewModel;
        this.f36782d = categoryEntity;
        this.f36783e = searchSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusViewModel$onMatchingCategoriesClicked$1(this.f36781c, this.f36782d, this.f36783e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Channel channel;
        MatchingCategoriesRepository matchingCategoriesRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36780b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            channel = (Channel) this.f36779a;
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            channel = this.f36781c.H0;
            matchingCategoriesRepository = this.f36781c.f36709t0;
            CategoryEntity categoryEntity = this.f36782d;
            SearchSource searchSource = SearchSource.MATCHING_CATEGORIES;
            SearchAnalyticsData d11 = SearchAnalyticsData.a.d(SearchAnalyticsData.f36633x, this.f36781c.U0(), null, null, this.f36783e, 6, null);
            this.f36779a = channel;
            this.f36780b = 1;
            obj = matchingCategoriesRepository.e(categoryEntity, searchSource, d11, this);
            if (obj == f11) {
                return f11;
            }
        }
        this.f36779a = null;
        this.f36780b = 2;
        if (channel.send(obj, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusViewModel$onMatchingCategoriesClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
