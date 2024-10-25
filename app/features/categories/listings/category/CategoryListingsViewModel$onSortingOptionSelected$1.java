package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.CategorySortingStateHandler;
import com.forsale.app.features.categories.listings.SortingStates;
import com.forsale.app.features.categories.listings.category.f;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$onSortingOptionSelected$1", f = "CategoryListingsViewModel.kt", l = {268}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$onSortingOptionSelected$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28577a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28578b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SortingStates f28579c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$onSortingOptionSelected$1(CategoryListingsViewModel categoryListingsViewModel, SortingStates sortingStates, zz.a<? super CategoryListingsViewModel$onSortingOptionSelected$1> aVar) {
        super(2, aVar);
        this.f28578b = categoryListingsViewModel;
        this.f28579c = sortingStates;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$onSortingOptionSelected$1(this.f28578b, this.f28579c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategorySortingStateHandler categorySortingStateHandler;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28577a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            categorySortingStateHandler = this.f28578b.I0;
            f.b bVar = new f.b(this.f28579c);
            this.f28577a = 1;
            if (categorySortingStateHandler.d(bVar, this) == f11) {
                return f11;
            }
        }
        CategoryListingsViewModel.y3(this.f28578b, null, 1, null);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$onSortingOptionSelected$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
