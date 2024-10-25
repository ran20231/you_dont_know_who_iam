package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.network.responses.ListingsResponse;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.o;
/* compiled from: ListingsResponse.kt */
/* loaded from: classes2.dex */
public final class ListingsResponseKt {
    public static final List<ListingItemBrief> aggregatePinnedAndNormal(ListingsResponse.Listings listings) {
        List<ListingItemBrief> E0;
        o.i(listings, "<this>");
        E0 = CollectionsKt___CollectionsKt.E0(listings.getPinnedItems(), listings.getNormalItems());
        return E0;
    }
}
