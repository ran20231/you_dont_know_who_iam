package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.CategoryEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesRepositories.kt */
@d(c = "com.forsale.app.datalayer.repositories.CategoriesRepositories$getRealtyCategory$2", f = "CategoriesRepositories.kt", l = {344}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoriesRepositories$getRealtyCategory$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super CategoryEntity>, Object> {
    int label;
    final /* synthetic */ CategoriesRepositories this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesRepositories$getRealtyCategory$2(CategoriesRepositories categoriesRepositories, zz.a<? super CategoriesRepositories$getRealtyCategory$2> aVar) {
        super(2, aVar);
        this.this$0 = categoriesRepositories;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoriesRepositories$getRealtyCategory$2(this.this$0, aVar);
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
            CategoryEntity.Classification classification = CategoryEntity.Classification.PROPERTY;
            this.label = 1;
            obj = categoryDao.getParentCategoryByClassification(classification, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super CategoryEntity> aVar) {
        return ((CategoriesRepositories$getRealtyCategory$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}