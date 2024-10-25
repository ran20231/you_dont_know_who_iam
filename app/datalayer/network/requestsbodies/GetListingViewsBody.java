package com.forsale.app.datalayer.network.requestsbodies;

import up.c;
/* compiled from: GetListingViewsBody.kt */
/* loaded from: classes2.dex */
public final class GetListingViewsBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final int advId;

    public GetListingViewsBody(int i11) {
        this.advId = i11;
    }

    public final int getAdvId() {
        return this.advId;
    }
}
