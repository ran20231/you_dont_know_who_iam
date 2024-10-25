package com.forsale.app.features.categories.listings.category;

import androidx.room.RoomDatabase;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$loadSearchBreadcrumbs$2", f = "CategoryListingsViewModel.kt", l = {997, RoomDatabase.MAX_BIND_PARAMETER_CNT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$loadSearchBreadcrumbs$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28533a;

    /* renamed from: b  reason: collision with root package name */
    Object f28534b;

    /* renamed from: c  reason: collision with root package name */
    int f28535c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28536d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$loadSearchBreadcrumbs$2(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$loadSearchBreadcrumbs$2> aVar) {
        super(2, aVar);
        this.f28536d = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$loadSearchBreadcrumbs$2(this.f28536d, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f28535c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r7)
            goto L60
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f28534b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r3 = r6.f28533a
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r3 = (com.forsale.app.features.categories.listings.category.CategoryListingsViewModel) r3
            kotlin.f.b(r7)
            goto L47
        L26:
            kotlin.f.b(r7)
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r7 = r6.f28536d
            java.lang.String r1 = r7.H2()
            if (r1 == 0) goto L60
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r7 = r6.f28536d
            com.forsale.app.features.search.MatchingCategoriesRepository r4 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.f1(r7)
            r6.f28533a = r7
            r6.f28534b = r1
            r6.f28535c = r3
            java.lang.Object r3 = r4.d(r1, r6)
            if (r3 != r0) goto L44
            return r0
        L44:
            r5 = r3
            r3 = r7
            r7 = r5
        L47:
            r4 = r7
            java.util.List r4 = (java.util.List) r4
            kotlinx.coroutines.flow.MutableStateFlow r3 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.F1(r3)
            kotlin.Pair r1 = wz.i.a(r1, r4)
            r6.f28533a = r7
            r7 = 0
            r6.f28534b = r7
            r6.f28535c = r2
            java.lang.Object r7 = r3.emit(r1, r6)
            if (r7 != r0) goto L60
            return r0
        L60:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$loadSearchBreadcrumbs$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$loadSearchBreadcrumbs$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
