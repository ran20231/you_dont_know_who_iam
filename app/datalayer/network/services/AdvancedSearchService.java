package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import i10.a;
import i10.o;
/* compiled from: AdvancedSearchService.kt */
/* loaded from: classes2.dex */
public interface AdvancedSearchService {
    @o("Listings/advancedSearch")
    Object advancedSearch(@a AdvancedSearchBody advancedSearchBody, zz.a<? super ListingsResponse> aVar);
}
