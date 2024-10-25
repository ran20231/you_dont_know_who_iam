package com.forsale.app.datalayer.repositories;

import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesRepositories.kt */
@d(c = "com.forsale.app.datalayer.repositories.CategoriesRepositories$intersectCategories$2", f = "CategoriesRepositories.kt", l = {204}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoriesRepositories$intersectCategories$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super List<? extends Integer>>, Object> {
    final /* synthetic */ List<Integer> $childrenIds;
    final /* synthetic */ List<Integer> $parentIds;
    int label;
    final /* synthetic */ CategoriesRepositories this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesRepositories$intersectCategories$2(CategoriesRepositories categoriesRepositories, List<Integer> list, List<Integer> list2, zz.a<? super CategoriesRepositories$intersectCategories$2> aVar) {
        super(2, aVar);
        this.this$0 = categoriesRepositories;
        this.$parentIds = list;
        this.$childrenIds = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoriesRepositories$intersectCategories$2(this.this$0, this.$parentIds, this.$childrenIds, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super List<? extends Integer>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super List<Integer>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoryDao categoryDao;
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
            List<Integer> list = this.$parentIds;
            List<Integer> list2 = this.$childrenIds;
            this.label = 1;
            obj = categoryDao.intersectCategories(list, list2, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super List<Integer>> aVar) {
        return ((CategoriesRepositories$intersectCategories$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
