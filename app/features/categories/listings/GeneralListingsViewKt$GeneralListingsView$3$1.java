package com.forsale.app.features.categories.listings;

import com.forsale.app.datalayer.network.requestsbodies.MyListingsType;
import com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel;
import g00.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsView.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class GeneralListingsViewKt$GeneralListingsView$3$1 extends FunctionReferenceImpl implements l<MyListingsType, p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GeneralListingsViewKt$GeneralListingsView$3$1(Object obj) {
        super(1, obj, GeneralListingsViewModel.class, "setSelectedFilter", "setSelectedFilter(Lcom/forsale/app/datalayer/network/requestsbodies/MyListingsType;)V", 0);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(MyListingsType myListingsType) {
        m(myListingsType);
        return p.f75480a;
    }

    public final void m(MyListingsType p02) {
        o.i(p02, "p0");
        ((GeneralListingsViewModel) this.receiver).g0(p02);
    }
}
