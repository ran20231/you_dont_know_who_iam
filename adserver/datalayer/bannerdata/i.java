package com.forsale.adserver.datalayer.bannerdata;

import kotlin.jvm.internal.o;
/* compiled from: ListingsScreenBanners.kt */
/* loaded from: classes2.dex */
public final class i extends ListingsScreenBanners {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(y8.a bannerRepo) {
        super(bannerRepo);
        o.i(bannerRepo, "bannerRepo");
    }

    @Override // com.forsale.adserver.datalayer.bannerdata.ListingsScreenBanners
    public ScreenBannerTypes f() {
        return ScreenBannerTypes.LANDING_PAGE;
    }
}
