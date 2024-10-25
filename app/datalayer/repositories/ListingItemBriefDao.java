package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import java.util.List;
/* compiled from: ListingItemBriefDao.kt */
/* loaded from: classes2.dex */
public interface ListingItemBriefDao {
    Object deleteAllListingItems(zz.a<? super Integer> aVar);

    Object getAllListingItems(zz.a<? super List<ListingItemBrief>> aVar);

    Object insertAllListingItems(List<ListingItemBrief> list, zz.a<? super List<Long>> aVar);
}
