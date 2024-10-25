package com.forsale.adserver.view.screens.ui;

import com.forsale.adserver.view.screens.offersScreen.OffersViewModel;
import g00.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersScreen.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class OffersScreenKt$OffersScreen$3 extends FunctionReferenceImpl implements l<Integer, p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public OffersScreenKt$OffersScreen$3(Object obj) {
        super(1, obj, OffersViewModel.class, "selectedCategoryChanged", "selectedCategoryChanged(I)V", 0);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(Integer num) {
        m(num.intValue());
        return p.f75480a;
    }

    public final void m(int i11) {
        ((OffersViewModel) this.receiver).x(i11);
    }
}
