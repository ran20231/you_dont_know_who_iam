package com.forsale.app.utils;

import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import java.util.List;
/* compiled from: PiningShuffler.kt */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final y f40549a = new y();

    private y() {
    }

    public final List<ListingItemBrief> a(int i11, List<ListingItemBrief> list, List<ListingItemBrief> extraItems) {
        kotlin.jvm.internal.o.i(extraItems, "extraItems");
        return fk.a.f56248a.a(i11, list, extraItems);
    }

    public final List<ListingItemBrief> b(List<ListingItemBrief> list, int i11) {
        return fk.a.f56248a.b(list, i11);
    }
}
