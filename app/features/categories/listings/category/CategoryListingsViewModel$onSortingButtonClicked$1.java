package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.CategorySortingStateHandler;
import com.forsale.app.features.categories.listings.SortingStates;
import com.forsale.app.features.categories.listings.category.f;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$onSortingButtonClicked$1", f = "CategoryListingsViewModel.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$onSortingButtonClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28574a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28575b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SortingStates f28576c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$onSortingButtonClicked$1(CategoryListingsViewModel categoryListingsViewModel, SortingStates sortingStates, zz.a<? super CategoryListingsViewModel$onSortingButtonClicked$1> aVar) {
        super(2, aVar);
        this.f28575b = categoryListingsViewModel;
        this.f28576c = sortingStates;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$onSortingButtonClicked$1(this.f28575b, this.f28576c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        CategorySortingStateHandler categorySortingStateHandler;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28574a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            categorySortingStateHandler = this.f28575b.I0;
            f.a aVar = new f.a(this.f28576c);
            this.f28574a = 1;
            if (categorySortingStateHandler.d(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$onSortingButtonClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
