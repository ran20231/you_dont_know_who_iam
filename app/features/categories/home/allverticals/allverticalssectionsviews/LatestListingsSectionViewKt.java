package com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.platform.TestTagKt;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel;
import com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel;
import com.forsale.designSystem.TextKt;
import g00.l;
import g00.q;
import g00.r;
import j0.d1;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import r0.b;
import wz.p;
/* compiled from: LatestListingsSectionView.kt */
/* loaded from: classes2.dex */
public final class LatestListingsSectionViewKt {
    public static final void a(final AllVerticalsViewModel.d latestListingsContent, final q<? super ListingItemBrief, ? super Integer, ? super List<Integer>, p> onListingItemClicked, final l<? super Integer, p> onSectionSwiped, a aVar, final int i11) {
        o.i(latestListingsContent, "latestListingsContent");
        o.i(onListingItemClicked, "onListingItemClicked");
        o.i(onSectionSwiped, "onSectionSwiped");
        a h11 = aVar.h(-1979374904);
        if (c.I()) {
            c.U(-1979374904, i11, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.NewArrivalsSectionContent (LatestListingsSectionView.kt:18)");
        }
        CommonViewsKt.a(new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.LatestListingsSectionViewKt$NewArrivalsSectionContent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(LazyListScope ListingsCarousel) {
                o.i(ListingsCarousel, "$this$ListingsCarousel");
                LatestListingsSectionViewKt.c(ListingsCarousel, AllVerticalsViewModel.d.this.b(), onListingItemClicked);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                b(lazyListScope);
                return p.f75480a;
            }
        }, 0, b.b(h11, -1922864630, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.LatestListingsSectionViewKt$NewArrivalsSectionContent$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(a aVar2, int i12) {
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (c.I()) {
                    c.U(-1922864630, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.NewArrivalsSectionContent.<anonymous> (LatestListingsSectionView.kt:27)");
                }
                TextKt.a(AllVerticalsViewModel.d.this.d().getLocalized(), TestTagKt.a(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), "newArrivalsTitle"), 0, 0, false, 0, 0, null, null, 0L, 0, aVar2, 48, 0, 2044);
                if (c.I()) {
                    c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                b(aVar2, num.intValue());
                return p.f75480a;
            }
        }), b.b(h11, -628445783, true, new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.LatestListingsSectionViewKt$NewArrivalsSectionContent$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(a aVar2, int i12) {
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (c.I()) {
                    c.U(-628445783, i12, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.NewArrivalsSectionContent.<anonymous> (LatestListingsSectionView.kt:35)");
                }
                TextKt.a(AllVerticalsViewModel.d.this.c().getLocalized(), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar2, 0, 0, 2046);
                if (c.I()) {
                    c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                b(aVar2, num.intValue());
                return p.f75480a;
            }
        }), null, onSectionSwiped, h11, ((i11 << 9) & 458752) | 3456, 18);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.LatestListingsSectionViewKt$NewArrivalsSectionContent$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    LatestListingsSectionViewKt.a(AllVerticalsViewModel.d.this, onListingItemClicked, onSectionSwiped, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(LazyListScope lazyListScope, final List<VerticalListingItemViewModel> list, final q<? super ListingItemBrief, ? super Integer, ? super List<Integer>, p> qVar) {
        lazyListScope.f(list.size(), null, new l<Integer, Object>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.LatestListingsSectionViewKt$latestListingsList$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final Object b(int i11) {
                list.get(i11);
                return null;
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return b(num.intValue());
            }
        }, b.c(-1091073711, true, new r<x.a, Integer, a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.LatestListingsSectionViewKt$latestListingsList$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            public final void b(x.a aVar, int i11, a aVar2, int i12) {
                int i13;
                int i14;
                int i15;
                if ((i12 & 14) == 0) {
                    if (aVar2.T(aVar)) {
                        i15 = 4;
                    } else {
                        i15 = 2;
                    }
                    i13 = i15 | i12;
                } else {
                    i13 = i12;
                }
                if ((i12 & 112) == 0) {
                    if (aVar2.d(i11)) {
                        i14 = 32;
                    } else {
                        i14 = 16;
                    }
                    i13 |= i14;
                }
                if ((i13 & 731) == 146 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (c.I()) {
                    c.U(-1091073711, i13, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:183)");
                }
                int i16 = (i13 & 112) | (i13 & 14);
                CardViewKt.a((VerticalListingItemViewModel) list.get(i11), qVar, i11, aVar2, ((i16 << 3) & 896) | ((i16 >> 6) & 14));
                if (c.I()) {
                    c.T();
                }
            }

            @Override // g00.r
            public /* bridge */ /* synthetic */ p d(x.a aVar, Integer num, a aVar2, Integer num2) {
                b(aVar, num.intValue(), aVar2, num2.intValue());
                return p.f75480a;
            }
        }));
    }
}
