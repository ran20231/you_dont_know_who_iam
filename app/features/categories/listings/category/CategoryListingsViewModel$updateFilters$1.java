package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$updateFilters$1", f = "CategoryListingsViewModel.kt", l = {494, 505, 506, 507}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$updateFilters$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f28624a;

    /* renamed from: b  reason: collision with root package name */
    int f28625b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28626c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ListingsAnalytics$FiltersPlace f28627d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ GetListingsBody.FiltrationData f28628e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$updateFilters$1(CategoryListingsViewModel categoryListingsViewModel, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, GetListingsBody.FiltrationData filtrationData, zz.a<? super CategoryListingsViewModel$updateFilters$1> aVar) {
        super(2, aVar);
        this.f28626c = categoryListingsViewModel;
        this.f28627d = listingsAnalytics$FiltersPlace;
        this.f28628e = filtrationData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$updateFilters$1(this.f28626c, this.f28627d, this.f28628e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[LOOP:0: B:22:0x007d->B:24:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0118 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$updateFilters$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$updateFilters$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
