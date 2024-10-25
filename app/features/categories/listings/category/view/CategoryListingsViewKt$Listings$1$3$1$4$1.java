package com.forsale.app.features.categories.listings.category.view;

import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import g00.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: CategoryListingsView.kt */
/* loaded from: classes2.dex */
/* synthetic */ class CategoryListingsViewKt$Listings$1$3$1$4$1 extends FunctionReferenceImpl implements l<TrendEntity, p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CategoryListingsViewKt$Listings$1$3$1$4$1(Object obj) {
        super(1, obj, CategoryListingsViewModel.class, "onTrendsItemClicked", "onTrendsItemClicked(Lcom/forsale/app/datalayer/database/TrendEntity;)V", 0);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(TrendEntity trendEntity) {
        m(trendEntity);
        return p.f75480a;
    }

    public final void m(TrendEntity p02) {
        o.i(p02, "p0");
        ((CategoryListingsViewModel) this.receiver).p3(p02);
    }
}
