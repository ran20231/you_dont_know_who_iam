package com.forsale.app.features.categories.listings.category;

import g00.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsFragment.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class CategoryListingsFragment$registerListingsObservers$1$onChanged$1$1 extends FunctionReferenceImpl implements l<Integer, p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CategoryListingsFragment$registerListingsObservers$1$onChanged$1$1(Object obj) {
        super(1, obj, CategoryListingsViewModel.class, "setMaxScrolledItem", "setMaxScrolledItem(I)V", 0);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(Integer num) {
        m(num.intValue());
        return p.f75480a;
    }

    public final void m(int i11) {
        ((CategoryListingsViewModel) this.receiver).I3(i11);
    }
}
