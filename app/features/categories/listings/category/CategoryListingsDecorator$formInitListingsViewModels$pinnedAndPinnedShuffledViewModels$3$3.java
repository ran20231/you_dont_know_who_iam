package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.network.responses.ListingsResponse;
import g00.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class CategoryListingsDecorator$formInitListingsViewModels$pinnedAndPinnedShuffledViewModels$3$3 extends FunctionReferenceImpl implements p<Integer, ListingsResponse.UISettings, Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CategoryListingsDecorator$formInitListingsViewModels$pinnedAndPinnedShuffledViewModels$3$3(Object obj) {
        super(2, obj, CategoryListingsDecorator.class, "pinnedFillerPredicate", "pinnedFillerPredicate(ILcom/forsale/app/datalayer/network/responses/ListingsResponse$UISettings;)Z", 0);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, ListingsResponse.UISettings uISettings) {
        return m(num.intValue(), uISettings);
    }

    public final Boolean m(int i11, ListingsResponse.UISettings p12) {
        boolean S0;
        o.i(p12, "p1");
        S0 = ((CategoryListingsDecorator) this.receiver).S0(i11, p12);
        return Boolean.valueOf(S0);
    }
}
