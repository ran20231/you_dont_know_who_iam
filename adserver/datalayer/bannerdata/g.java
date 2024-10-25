package com.forsale.adserver.datalayer.bannerdata;

import kotlin.jvm.internal.o;
/* compiled from: ItemDetailsScreenBanners.kt */
/* loaded from: classes2.dex */
public final class g extends ItemDetailsScreenBanners {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(y8.a bannerRepo) {
        super(bannerRepo);
        o.i(bannerRepo, "bannerRepo");
    }

    @Override // com.forsale.adserver.datalayer.bannerdata.ItemDetailsScreenBanners
    public ScreenBannerTypes f() {
        return ScreenBannerTypes.SLIDING_SMALL;
    }
}
