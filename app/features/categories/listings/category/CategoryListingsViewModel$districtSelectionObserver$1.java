package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.database.DistrictEntity;
import g00.p;
import kotlin.jvm.internal.AdaptedFunctionReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class CategoryListingsViewModel$districtSelectionObserver$1 extends AdaptedFunctionReference implements p<DistrictEntity, zz.a<? super wz.p>, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CategoryListingsViewModel$districtSelectionObserver$1(Object obj) {
        super(2, obj, CategoryListingsViewModel.class, "onDistrictChange", "onDistrictChange(Lcom/forsale/app/datalayer/database/DistrictEntity;)V", 4);
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(DistrictEntity districtEntity, zz.a<? super wz.p> aVar) {
        Object S1;
        S1 = CategoryListingsViewModel.S1((CategoryListingsViewModel) this.f61766a, districtEntity, aVar);
        return S1;
    }
}
