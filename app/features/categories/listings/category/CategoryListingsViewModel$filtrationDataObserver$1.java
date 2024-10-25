package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import g00.p;
import kotlin.jvm.internal.AdaptedFunctionReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class CategoryListingsViewModel$filtrationDataObserver$1 extends AdaptedFunctionReference implements p<GetListingsBody.FiltrationData, zz.a<? super wz.p>, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CategoryListingsViewModel$filtrationDataObserver$1(Object obj) {
        super(2, obj, CategoryListingsViewModel.class, "onFiltersChange", "onFiltersChange(Lcom/forsale/app/datalayer/network/requestsbodies/GetListingsBody$FiltrationData;)V", 4);
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(GetListingsBody.FiltrationData filtrationData, zz.a<? super wz.p> aVar) {
        Object W1;
        W1 = CategoryListingsViewModel.W1((CategoryListingsViewModel) this.f61766a, filtrationData, aVar);
        return W1;
    }
}
