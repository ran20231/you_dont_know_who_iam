package com.forsale.adserver.datalayer.bannerdata;

import kotlin.jvm.internal.o;
/* compiled from: CategoriesScreenBanners.kt */
/* loaded from: classes2.dex */
public final class b extends CategoriesScreenBanners {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y8.a bannerRepo) {
        super(bannerRepo);
        o.i(bannerRepo, "bannerRepo");
    }

    @Override // com.forsale.adserver.datalayer.bannerdata.CategoriesScreenBanners
    public ScreenBannerTypes f() {
        return ScreenBannerTypes.CATEGORIES_SLIDING;
    }
}
