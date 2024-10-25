package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.SearchHistoryEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchHistoryRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SearchHistoryRepository$checkIfExceedsLimit$2", f = "SearchHistoryRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchHistoryRepository$checkIfExceedsLimit$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    final /* synthetic */ SearchHistoryEntity.SearchHistorySource $source;
    int label;
    final /* synthetic */ SearchHistoryRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHistoryRepository$checkIfExceedsLimit$2(SearchHistoryRepository searchHistoryRepository, SearchHistoryEntity.SearchHistorySource searchHistorySource, zz.a<? super SearchHistoryRepository$checkIfExceedsLimit$2> aVar) {
        super(2, aVar);
        this.this$0 = searchHistoryRepository;
        this.$source = searchHistorySource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchHistoryRepository$checkIfExceedsLimit$2(this.this$0, this.$source, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchHistoryDao searchHistoryDao;
        SearchHistoryDao searchHistoryDao2;
        kotlin.coroutines.intrinsics.b.f();
        if (this.label == 0) {
            f.b(obj);
            searchHistoryDao = this.this$0.searchHistoryDao;
            if (searchHistoryDao.getCount(this.$source) > 5) {
                searchHistoryDao2 = this.this$0.searchHistoryDao;
                searchHistoryDao2.deleteOldestRecord(this.$source);
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchHistoryRepository$checkIfExceedsLimit$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
