package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.CousinCategory;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesRepositories.kt */
@d(c = "com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoriesCousins$2", f = "CategoriesRepositories.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoriesRepositories$getCategoriesCousins$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super List<? extends CousinCategory>>, Object> {
    final /* synthetic */ List<Integer> $categoryIds;
    int label;
    final /* synthetic */ CategoriesRepositories this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesRepositories$getCategoriesCousins$2(CategoriesRepositories categoriesRepositories, List<Integer> list, zz.a<? super CategoriesRepositories$getCategoriesCousins$2> aVar) {
        super(2, aVar);
        this.this$0 = categoriesRepositories;
        this.$categoryIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoriesRepositories$getCategoriesCousins$2(this.this$0, this.$categoryIds, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super List<? extends CousinCategory>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super List<CousinCategory>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoryDao categoryDao;
        l4.a categoriesCousinsQuery;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            categoryDao = this.this$0.categoryDao;
            categoriesCousinsQuery = this.this$0.getCategoriesCousinsQuery(this.$categoryIds);
            this.label = 1;
            obj = categoryDao.getCategoriesCousins(categoriesCousinsQuery, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super List<CousinCategory>> aVar) {
        return ((CategoriesRepositories$getCategoriesCousins$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
