package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
import wz.p;
/* compiled from: ListingDetailsEntityDao.kt */
/* loaded from: classes2.dex */
public interface ListingDetailsEntityDao {
    Object delete(zz.a<? super Integer> aVar);

    Object getSingle(zz.a<? super ListingDetailsEntity> aVar);

    Flow<ListingDetailsEntity> getUserListingFlow();

    Object insert(ListingDetailsEntity listingDetailsEntity, zz.a<? super p> aVar);

    Object update(ListingDetailsEntity listingDetailsEntity, zz.a<? super p> aVar);

    Object updateId(int i11, zz.a<? super p> aVar);

    Object updatePostUpload(int i11, int i12, List<String> list, zz.a<? super p> aVar);
}
