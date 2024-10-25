package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.SearchHistoryEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchHistoryRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SearchHistoryRepository$getSingle$2", f = "SearchHistoryRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchHistoryRepository$getSingle$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super SearchHistoryEntity>, Object> {
    final /* synthetic */ CategoryEntity $category;
    final /* synthetic */ String $searchText;
    final /* synthetic */ SearchHistoryEntity.SearchHistorySource $source;
    int label;
    final /* synthetic */ SearchHistoryRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHistoryRepository$getSingle$2(CategoryEntity categoryEntity, String str, SearchHistoryRepository searchHistoryRepository, SearchHistoryEntity.SearchHistorySource searchHistorySource, zz.a<? super SearchHistoryRepository$getSingle$2> aVar) {
        super(2, aVar);
        this.$category = categoryEntity;
        this.$searchText = str;
        this.this$0 = searchHistoryRepository;
        this.$source = searchHistorySource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchHistoryRepository$getSingle$2(this.$category, this.$searchText, this.this$0, this.$source, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SearchHistoryDao searchHistoryDao;
        SearchHistoryDao searchHistoryDao2;
        boolean z11;
        SearchHistoryDao searchHistoryDao3;
        kotlin.coroutines.intrinsics.b.f();
        if (this.label == 0) {
            f.b(obj);
            boolean z12 = true;
            if (this.$category != null) {
                if (this.$searchText.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    searchHistoryDao3 = this.this$0.searchHistoryDao;
                    return searchHistoryDao3.getSingleBySearchTextAndId(this.$searchText, this.$category.getId(), this.$source);
                }
            }
            if (this.$category != null) {
                if (this.$searchText.length() != 0) {
                    z12 = false;
                }
                if (z12) {
                    searchHistoryDao2 = this.this$0.searchHistoryDao;
                    return searchHistoryDao2.getSingleByCategoryId(this.$category.getId(), this.$source);
                }
            }
            searchHistoryDao = this.this$0.searchHistoryDao;
            return searchHistoryDao.getSingleBySearchText(this.$searchText, this.$source);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super SearchHistoryEntity> aVar) {
        return ((SearchHistoryRepository$getSingle$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
