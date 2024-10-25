package com.forsale.app.features.categories.listings.generalListings;

import com.forsale.app.datalayer.network.requestsbodies.MyListingsDateRange;
import g00.p;
import kotlin.jvm.internal.AdaptedFunctionReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsViewModel.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class GeneralListingsViewModel$archivedFilterSelectorObserver$1 extends AdaptedFunctionReference implements p<MyListingsDateRange, zz.a<? super wz.p>, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GeneralListingsViewModel$archivedFilterSelectorObserver$1(Object obj) {
        super(2, obj, GeneralListingsViewModel.class, "onArchivedFilterChange", "onArchivedFilterChange(Lcom/forsale/app/datalayer/network/requestsbodies/MyListingsDateRange;)V", 4);
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(MyListingsDateRange myListingsDateRange, zz.a<? super wz.p> aVar) {
        Object B;
        B = GeneralListingsViewModel.B((GeneralListingsViewModel) this.f61766a, myListingsDateRange, aVar);
        return B;
    }
}
