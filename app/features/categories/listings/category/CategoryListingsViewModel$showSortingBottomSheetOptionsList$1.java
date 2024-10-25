package com.forsale.app.features.categories.listings.category;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$showSortingBottomSheetOptionsList$1", f = "CategoryListingsViewModel.kt", l = {252, 254, 258}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$showSortingBottomSheetOptionsList$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28613a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28614b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$showSortingBottomSheetOptionsList$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$showSortingBottomSheetOptionsList$1> aVar) {
        super(2, aVar);
        this.f28614b = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$showSortingBottomSheetOptionsList$1(this.f28614b, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f28613a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 == r3) goto L11
            if (r1 != r2) goto L16
        L11:
            kotlin.f.b(r8)
            goto L93
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.f.b(r8)
            goto L40
        L22:
            kotlin.f.b(r8)
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r8 = r7.f28614b
            com.forsale.app.datalayer.database.CategoryEntity r8 = r8.z2()
            if (r8 == 0) goto L43
            int r8 = r8.getId()
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r1 = r7.f28614b
            com.forsale.app.datalayer.repositories.CategoriesRepositories r1 = r1.s()
            r7.f28613a = r4
            java.lang.Object r8 = r1.getCategoryRuleSet(r8, r7)
            if (r8 != r0) goto L40
            return r0
        L40:
            com.forsale.app.datalayer.database.CategoryRuleSet$RuleSet r8 = (com.forsale.app.datalayer.database.CategoryRuleSet.RuleSet) r8
            goto L44
        L43:
            r8 = 0
        L44:
            r1 = 0
            if (r8 == 0) goto L55
            com.forsale.app.datalayer.database.CategoryRuleSet$IntConfiguration r5 = r8.getPrice()
            if (r5 == 0) goto L55
            boolean r5 = r5.getEnabled()
            if (r5 != r4) goto L55
            r5 = r4
            goto L56
        L55:
            r5 = r1
        L56:
            if (r5 != 0) goto L7c
            if (r8 != 0) goto L5b
            goto L7c
        L5b:
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r8 = r7.f28614b
            kotlinx.coroutines.flow.MutableStateFlow r8 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.y1(r8)
            com.forsale.app.features.categories.listings.SortingStates[] r5 = com.forsale.app.features.categories.listings.SortingStates.values()
            com.forsale.app.features.categories.listings.SortingStates[] r3 = new com.forsale.app.features.categories.listings.SortingStates[r3]
            com.forsale.app.features.categories.listings.SortingStates r6 = com.forsale.app.features.categories.listings.SortingStates.PRICE_HIGH_TO_LOW
            r3[r1] = r6
            com.forsale.app.features.categories.listings.SortingStates r1 = com.forsale.app.features.categories.listings.SortingStates.PRICE_LOW_TO_HIGH
            r3[r4] = r1
            java.util.List r1 = yb.c.a(r5, r3)
            r7.f28613a = r2
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L93
            return r0
        L7c:
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r8 = r7.f28614b
            kotlinx.coroutines.flow.MutableStateFlow r8 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.y1(r8)
            com.forsale.app.features.categories.listings.SortingStates[] r1 = com.forsale.app.features.categories.listings.SortingStates.values()
            java.util.List r1 = kotlin.collections.j.t0(r1)
            r7.f28613a = r3
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L93
            return r0
        L93:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$showSortingBottomSheetOptionsList$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$showSortingBottomSheetOptionsList$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
