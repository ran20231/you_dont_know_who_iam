package com.forsale.app.datalayer.network.responses;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
/* compiled from: ListingItemBrief.kt */
/* loaded from: classes2.dex */
public final class ListingItemBriefKt {
    public static final List<Integer> itemsIds(List<ListingItemBrief> list) {
        int y11;
        o.i(list, "<this>");
        List<ListingItemBrief> list2 = list;
        y11 = s.y(list2, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (ListingItemBrief listingItemBrief : list2) {
            arrayList.add(Integer.valueOf(listingItemBrief.getId()));
        }
        return arrayList;
    }
}
