package com.forsale.app.features.search;

import com.forsale.app.features.categories.listings.items.horizontalListing.HorizontalListingsItemViewModel;
import com.forsale.app.features.search.bannerItem.SearchHomeBannerItem;
import com.forsale.app.features.search.bannerItem.SearchHomeBannerItemViewModel;
import com.forsale.app.ui.recyclerviewitems.horizontalChips.HorizontalChipsItemViewModel;
/* compiled from: SearchAdapter.kt */
/* loaded from: classes2.dex */
public final class g {
    public static final /* synthetic */ kr.m a(x9.b bVar, androidx.lifecycle.s sVar) {
        return b(bVar, sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kr.m<?> b(x9.b<?> bVar, androidx.lifecycle.s sVar) {
        if (bVar instanceof HorizontalListingsItemViewModel) {
            return new ad.a((HorizontalListingsItemViewModel) bVar, sVar);
        }
        if (bVar instanceof gd.b) {
            return new gd.a((gd.b) bVar, sVar);
        }
        if (bVar instanceof SearchHomeBannerItemViewModel) {
            return new SearchHomeBannerItem((SearchHomeBannerItemViewModel) bVar, sVar);
        }
        if (bVar instanceof li.b) {
            return new li.a((li.b) bVar, sVar);
        }
        if (bVar instanceof HorizontalChipsItemViewModel) {
            return new di.a((HorizontalChipsItemViewModel) bVar, sVar);
        }
        if (bVar instanceof df.b) {
            return new df.a((df.b) bVar, sVar);
        }
        return null;
    }
}
