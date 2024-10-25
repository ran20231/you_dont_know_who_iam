package com.forsale.app.features.categories.listings.category;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$openAllFiltersScreen$1", f = "CategoryListingsViewModel.kt", l = {727, 733, 728}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$openAllFiltersScreen$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28586a;

    /* renamed from: b  reason: collision with root package name */
    Object f28587b;

    /* renamed from: c  reason: collision with root package name */
    Object f28588c;

    /* renamed from: d  reason: collision with root package name */
    int f28589d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28590e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$openAllFiltersScreen$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$openAllFiltersScreen$1> aVar) {
        super(2, aVar);
        this.f28590e = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$openAllFiltersScreen$1(this.f28590e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r8.f28589d
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2e
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r9)
            goto La4
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.f28588c
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r3 = r8.f28587b
            com.forsale.app.datalayer.database.CategoryEntity r3 = (com.forsale.app.datalayer.database.CategoryEntity) r3
            java.lang.Object r4 = r8.f28586a
            kotlinx.coroutines.flow.MutableSharedFlow r4 = (kotlinx.coroutines.flow.MutableSharedFlow) r4
            kotlin.f.b(r9)
            goto L80
        L2e:
            kotlin.f.b(r9)
            goto L56
        L32:
            kotlin.f.b(r9)
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r9 = r8.f28590e
            com.forsale.app.datalayer.database.CategoryEntity r9 = r9.z2()
            if (r9 == 0) goto La4
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r9 = r8.f28590e
            com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics r9 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.b1(r9)
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r1 = r8.f28590e
            com.forsale.app.datalayer.database.CategoryEntity r1 = r1.z2()
            int r1 = r1.getId()
            r8.f28589d = r4
            java.lang.Object r9 = r9.o(r1, r8)
            if (r9 != r0) goto L56
            return r0
        L56:
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r9 = r8.f28590e
            kotlinx.coroutines.flow.MutableSharedFlow r4 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.z1(r9)
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r9 = r8.f28590e
            com.forsale.app.datalayer.database.CategoryEntity r9 = r9.z2()
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r1 = r8.f28590e
            java.util.List r1 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.P0(r1)
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel r5 = r8.f28590e
            kotlinx.coroutines.Deferred r5 = com.forsale.app.features.categories.listings.category.CategoryListingsViewModel.M0(r5)
            r8.f28586a = r4
            r8.f28587b = r9
            r8.f28588c = r1
            r8.f28589d = r3
            java.lang.Object r3 = r5.await(r8)
            if (r3 != r0) goto L7d
            return r0
        L7d:
            r7 = r3
            r3 = r9
            r9 = r7
        L80:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator r9 = (com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator) r9
            r5 = 0
            if (r9 == 0) goto L8a
            com.forsale.app.datalayer.network.requestsbodies.GetListingsBody$FiltrationData r9 = r9.j()
            goto L8b
        L8a:
            r9 = r5
        L8b:
            com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.AllFiltersPayload r6 = new com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.AllFiltersPayload
            r6.<init>(r3, r1, r9)
            com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$a$a r9 = new com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$a$a
            r9.<init>(r6)
            r8.f28586a = r5
            r8.f28587b = r5
            r8.f28588c = r5
            r8.f28589d = r2
            java.lang.Object r9 = r4.emit(r9, r8)
            if (r9 != r0) goto La4
            return r0
        La4:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$openAllFiltersScreen$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$openAllFiltersScreen$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
