package com.forsale.app.features.categories.listings.category;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import g00.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$filterState$1", f = "CategoryListingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$filterState$1 extends SuspendLambda implements q<CategoryListingsViewModel.b, CategoryListingsViewModel.c, zz.a<? super CategoryListingsViewModel.b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28483a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f28484b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f28485c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28486d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$filterState$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$filterState$1> aVar) {
        super(3, aVar);
        this.f28486d = categoryListingsViewModel;
    }

    @Override // g00.q
    /* renamed from: b */
    public final Object invoke(CategoryListingsViewModel.b bVar, CategoryListingsViewModel.c cVar, zz.a<? super CategoryListingsViewModel.b> aVar) {
        CategoryListingsViewModel$filterState$1 categoryListingsViewModel$filterState$1 = new CategoryListingsViewModel$filterState$1(this.f28486d, aVar);
        categoryListingsViewModel$filterState$1.f28484b = bVar;
        categoryListingsViewModel$filterState$1.f28485c = cVar;
        return categoryListingsViewModel$filterState$1.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        b0 b0Var2;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f28483a == 0) {
            kotlin.f.b(obj);
            CategoryListingsViewModel.b bVar = (CategoryListingsViewModel.b) this.f28484b;
            CategoryListingsViewModel.c cVar = (CategoryListingsViewModel.c) this.f28485c;
            if (this.f28486d.z2() == null) {
                return e.f28697a;
            }
            if (this.f28486d.z2().getCategoryType() != CategoryEntity.CategoryType.LISTINGS && this.f28486d.z2().getCategoryType() != CategoryEntity.CategoryType.SUB_CATEGORIES) {
                b0Var = this.f28486d.L0;
                if (b0Var.getValue() != 0 || !(cVar instanceof CategoryListingsViewModel.c.e)) {
                    b0Var2 = this.f28486d.L0;
                    if (b0Var2.getValue() == 0 && (cVar instanceof CategoryListingsViewModel.c.C0310c)) {
                        return e.f28697a;
                    }
                    return bVar;
                }
                return CategoryListingsViewModel.b.a.f28460a;
            }
            return e.f28697a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
