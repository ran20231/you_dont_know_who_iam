package com.forsale.app.features.categories.listings.category;

import com.forsale.app.utils.analytics.FillerType;
import g00.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class CategoryListingsDecorator$formInitListingsViewModels$pinnedAndPinnedShuffledViewModels$3$1 extends FunctionReferenceImpl implements l<FillerType, p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CategoryListingsDecorator$formInitListingsViewModels$pinnedAndPinnedShuffledViewModels$3$1(Object obj) {
        super(1, obj, CategoryListingsDecorator.class, "logFillerAnalytics", "logFillerAnalytics(Lcom/forsale/app/utils/analytics/FillerType;)V", 0);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(FillerType fillerType) {
        m(fillerType);
        return p.f75480a;
    }

    public final void m(FillerType p02) {
        o.i(p02, "p0");
        ((CategoryListingsDecorator) this.receiver).P0(p02);
    }
}
