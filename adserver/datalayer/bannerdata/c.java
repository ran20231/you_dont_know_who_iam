package com.forsale.adserver.datalayer.bannerdata;

import kotlin.jvm.internal.o;
/* compiled from: HomeScreenBanners.kt */
/* loaded from: classes2.dex */
public final class c extends HomeScreenBanners {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y8.a bannerRepo) {
        super(bannerRepo);
        o.i(bannerRepo, "bannerRepo");
    }

    @Override // com.forsale.adserver.datalayer.bannerdata.HomeScreenBanners
    public ScreenBannerTypes f() {
        return ScreenBannerTypes.LANDING_PAGE;
    }
}
