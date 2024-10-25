package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.CategoryEntity;
import g00.p;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesRepositories.kt */
@d(c = "com.forsale.app.datalayer.repositories.CategoriesRepositories$getMatchedCategories$2", f = "CategoriesRepositories.kt", l = {350}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoriesRepositories$getMatchedCategories$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super List<? extends CategoryEntity>>, Object> {
    final /* synthetic */ List<String> $keywords;
    final /* synthetic */ String $searchText;
    int label;
    final /* synthetic */ CategoriesRepositories this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesRepositories$getMatchedCategories$2(CategoriesRepositories categoriesRepositories, String str, List<String> list, zz.a<? super CategoriesRepositories$getMatchedCategories$2> aVar) {
        super(2, aVar);
        this.this$0 = categoriesRepositories;
        this.$searchText = str;
        this.$keywords = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoriesRepositories$getMatchedCategories$2(this.this$0, this.$searchText, this.$keywords, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super List<? extends CategoryEntity>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super List<CategoryEntity>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        List n11;
        CategoryDao categoryDao;
        l4.a matchedCategoriesQueryArabicKeywords;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                categoryDao = this.this$0.categoryDao;
                matchedCategoriesQueryArabicKeywords = this.this$0.getMatchedCategoriesQueryArabicKeywords(this.$searchText, this.$keywords);
                this.label = 1;
                obj = categoryDao.getMatchedCategoriesQuery(matchedCategoriesQueryArabicKeywords, this);
                if (obj == f11) {
                    return f11;
                }
            }
            return (List) obj;
        } catch (Exception unused) {
            x10.a.b("Search:: InValid Query", new Object[0]);
            n11 = r.n();
            return n11;
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super List<CategoryEntity>> aVar) {
        return ((CategoriesRepositories$getMatchedCategories$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
