package com.forsale.app.features.categories.listings;

import com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel;
import g00.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsView.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class GeneralListingsViewKt$GeneralListingsView$3$3 extends FunctionReferenceImpl implements l<Integer, p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GeneralListingsViewKt$GeneralListingsView$3$3(Object obj) {
        super(1, obj, GeneralListingsViewModel.class, "setMaxScrolledItem", "setMaxScrolledItem(I)V", 0);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(Integer num) {
        m(num.intValue());
        return p.f75480a;
    }

    public final void m(int i11) {
        ((GeneralListingsViewModel) this.receiver).f0(i11);
    }
}
