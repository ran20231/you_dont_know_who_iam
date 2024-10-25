package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.SearchHistoryEntity;
import com.forsale.app.datalayer.repositories.SearchHistoryRepository;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$addSearchHistory$1", f = "SearchFocusViewModel.kt", l = {412}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$addSearchHistory$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36729a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchItemModel f36730b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SearchHistoryEntity.SearchHistorySource f36731c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36732d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel$addSearchHistory$1(SearchItemModel searchItemModel, SearchHistoryEntity.SearchHistorySource searchHistorySource, SearchFocusViewModel searchFocusViewModel, zz.a<? super SearchFocusViewModel$addSearchHistory$1> aVar) {
        super(2, aVar);
        this.f36730b = searchItemModel;
        this.f36731c = searchHistorySource;
        this.f36732d = searchFocusViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusViewModel$addSearchHistory$1(this.f36730b, this.f36731c, this.f36732d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        SearchHistoryRepository searchHistoryRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36729a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SearchHistoryEntity e11 = SearchItemModel.f36813h.e(this.f36730b, this.f36731c);
            if (e11 != null) {
                SearchFocusViewModel searchFocusViewModel = this.f36732d;
                SearchHistoryEntity.SearchHistorySource searchHistorySource = this.f36731c;
                searchHistoryRepository = searchFocusViewModel.f36705p0;
                this.f36729a = 1;
                if (searchHistoryRepository.insertNew(e11, searchHistorySource, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusViewModel$addSearchHistory$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
