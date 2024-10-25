package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.requestsbodies.GetRecommendListingsBody;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import i10.a;
import i10.o;
/* compiled from: RecommendService.kt */
/* loaded from: classes2.dex */
public interface RecommendService {
    @o("Recommend/getListings")
    Object getRecommendListings(@a GetRecommendListingsBody getRecommendListingsBody, zz.a<? super ListingsResponse> aVar);
}
