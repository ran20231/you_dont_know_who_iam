package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.search.MatchingCategoriesRepository;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.analytics.SearchSource;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$onSearchBreadcrumbItemClicked$1", f = "CategoryListingsViewModel.kt", l = {1008, 1008}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$onSearchBreadcrumbItemClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28570a;

    /* renamed from: b  reason: collision with root package name */
    int f28571b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28572c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryEntity f28573d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$onSearchBreadcrumbItemClicked$1(CategoryListingsViewModel categoryListingsViewModel, CategoryEntity categoryEntity, zz.a<? super CategoryListingsViewModel$onSearchBreadcrumbItemClicked$1> aVar) {
        super(2, aVar);
        this.f28572c = categoryListingsViewModel;
        this.f28573d = categoryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$onSearchBreadcrumbItemClicked$1(this.f28572c, this.f28573d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        MatchingCategoriesRepository matchingCategoriesRepository;
        Object e11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28571b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableSharedFlow = (MutableSharedFlow) this.f28570a;
            kotlin.f.b(obj);
            e11 = obj;
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f28572c.f28380r1;
            matchingCategoriesRepository = this.f28572c.f28395z0;
            CategoryEntity categoryEntity = this.f28573d;
            SearchSource searchSource = SearchSource.SEARCH_BREADCRUMBS;
            SearchAnalyticsData searchAnalyticsData = new SearchAnalyticsData(null, null, null, null, null, null, null, null, SearchAnalyticsData.SearchSource.SEARCH_BREADCRUMBS, false, 655, null);
            this.f28570a = mutableSharedFlow;
            this.f28571b = 1;
            e11 = matchingCategoriesRepository.e(categoryEntity, searchSource, searchAnalyticsData, this);
            if (e11 == f11) {
                return f11;
            }
        }
        this.f28570a = null;
        this.f28571b = 2;
        if (mutableSharedFlow.emit(e11, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$onSearchBreadcrumbItemClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
