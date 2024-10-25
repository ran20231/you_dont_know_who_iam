package com.forsale.app.features.postad.addons.featured.selector;

import g00.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeaturedAddonsSelectorViewModel.kt */
/* loaded from: classes2.dex */
public /* synthetic */ class FeaturedAddonsSelectorViewModel$addonGroupViewModel$1 extends FunctionReferenceImpl implements p<String, Boolean, wz.p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public FeaturedAddonsSelectorViewModel$addonGroupViewModel$1(Object obj) {
        super(2, obj, FeaturedAddonsSelectorViewModel.class, "recordAddonsSelection", "recordAddonsSelection(Ljava/lang/String;Z)V", 0);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(String str, Boolean bool) {
        m(str, bool.booleanValue());
        return wz.p.f75480a;
    }

    public final void m(String p02, boolean z11) {
        o.i(p02, "p0");
        ((FeaturedAddonsSelectorViewModel) this.receiver).M0(p02, z11);
    }
}
