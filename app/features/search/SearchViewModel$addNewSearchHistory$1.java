package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.SearchHistoryEntity;
import com.forsale.app.datalayer.repositories.SearchHistoryRepository;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchViewModel$addNewSearchHistory$1", f = "SearchViewModel.kt", l = {378}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchViewModel$addNewSearchHistory$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36848a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchViewModel f36849b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SearchHistoryEntity f36850c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SearchHistoryEntity.SearchHistorySource f36851d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$addNewSearchHistory$1(SearchViewModel searchViewModel, SearchHistoryEntity searchHistoryEntity, SearchHistoryEntity.SearchHistorySource searchHistorySource, zz.a<? super SearchViewModel$addNewSearchHistory$1> aVar) {
        super(2, aVar);
        this.f36849b = searchViewModel;
        this.f36850c = searchHistoryEntity;
        this.f36851d = searchHistorySource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchViewModel$addNewSearchHistory$1(this.f36849b, this.f36850c, this.f36851d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        SearchHistoryRepository searchHistoryRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36848a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            searchHistoryRepository = this.f36849b.f36838q0;
            SearchHistoryEntity searchHistoryEntity = this.f36850c;
            SearchHistoryEntity.SearchHistorySource searchHistorySource = this.f36851d;
            this.f36848a = 1;
            if (searchHistoryRepository.insertNew(searchHistoryEntity, searchHistorySource, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchViewModel$addNewSearchHistory$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
