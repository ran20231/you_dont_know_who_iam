package com.forsale.app.datalayer.repositories;

import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesRepositories.kt */
@d(c = "com.forsale.app.datalayer.repositories.CategoriesRepositories$getCategoriesIdsInParentIds$2", f = "CategoriesRepositories.kt", l = {236, 236}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoriesRepositories$getCategoriesIdsInParentIds$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super List<? extends Integer>>, Object> {
    final /* synthetic */ List<Integer> $parentIds;
    Object L$0;
    int label;
    final /* synthetic */ CategoriesRepositories this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesRepositories$getCategoriesIdsInParentIds$2(CategoriesRepositories categoriesRepositories, List<Integer> list, zz.a<? super CategoriesRepositories$getCategoriesIdsInParentIds$2> aVar) {
        super(2, aVar);
        this.this$0 = categoriesRepositories;
        this.$parentIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoriesRepositories$getCategoriesIdsInParentIds$2(this.this$0, this.$parentIds, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super List<? extends Integer>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super List<Integer>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategoryDao categoryDao;
        RegionsRepository regionsRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            categoryDao = (CategoryDao) this.L$0;
            f.b(obj);
        } else {
            f.b(obj);
            categoryDao = this.this$0.categoryDao;
            regionsRepository = this.this$0.regionsRepository;
            this.L$0 = categoryDao;
            this.label = 1;
            obj = regionsRepository.getCurrentRegionId(this);
            if (obj == f11) {
                return f11;
            }
        }
        int intValue = ((Number) obj).intValue();
        List<Integer> list = this.$parentIds;
        this.L$0 = null;
        this.label = 2;
        obj = categoryDao.getCategoriesIdsInParentIds(intValue, list, this);
        if (obj == f11) {
            return f11;
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super List<Integer>> aVar) {
        return ((CategoriesRepositories$getCategoriesIdsInParentIds$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
