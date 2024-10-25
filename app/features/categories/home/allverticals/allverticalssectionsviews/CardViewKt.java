package com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.listings.ListingCardDisplayStyle;
import com.forsale.app.features.categories.listings.items.listingItems.featuredListingItem.VerticalListingItemViewModel;
import com.forsale.designSystem.layouts.c;
import com.forsale.ui.components.cards.CardsKt;
import e2.h;
import g00.q;
import hk.a;
import j0.d1;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: CardView.kt */
/* loaded from: classes2.dex */
public final class CardViewKt {
    public static final void a(final VerticalListingItemViewModel vm2, final q<? super ListingItemBrief, ? super Integer, ? super List<Integer>, p> onListingItemClicked, final int i11, a aVar, final int i12) {
        int i13;
        a aVar2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i14;
        int i15;
        int i16;
        o.i(vm2, "vm");
        o.i(onListingItemClicked, "onListingItemClicked");
        a h11 = aVar.h(770015573);
        if ((i12 & 14) == 0) {
            if (h11.T(vm2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i13 = i16 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (h11.F(onListingItemClicked)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 896) == 0) {
            if (h11.d(i11)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i13 & 731) == 146 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (c.I()) {
                c.U(770015573, i13, -1, "com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CardView (CardView.kt:27)");
            }
            n1 n1Var = null;
            if (vm2.T() == ListingCardDisplayStyle.FULL_SCREEN_NO_IMAGE) {
                h11.C(1996605167);
                androidx.compose.ui.c u11 = SizeKt.u(androidx.compose.ui.c.f7566a, h.l(296));
                LiveData<? extends String> o11 = vm2.o();
                h11.C(1996605378);
                if (o11 != null) {
                    n1Var = LiveDataAdapterKt.a(o11, h11, 8);
                }
                h11.S();
                if (n1Var == null || (str5 = (String) n1Var.getValue()) == null) {
                    str4 = "";
                } else {
                    str4 = str5;
                }
                String M = vm2.M();
                String description = vm2.m().getDescription();
                if (description == null) {
                    description = "";
                }
                String G = vm2.G();
                if (G == null) {
                    G = "";
                }
                a.b A = vm2.A();
                a.C0648a y11 = vm2.y();
                Integer valueOf = Integer.valueOf(i11);
                h11.C(1618982084);
                boolean T = h11.T(onListingItemClicked) | h11.T(vm2) | h11.T(valueOf);
                Object D = h11.D();
                if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                    D = new g00.a<p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CardViewKt$CardView$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            onListingItemClicked.invoke(vm2.m(), Integer.valueOf(i11 + 1), vm2.K());
                        }
                    };
                    h11.u(D);
                }
                h11.S();
                String str6 = description;
                aVar2 = h11;
                CardsKt.g(u11, (g00.a) D, str4, M, str6, G, y11, null, null, null, A, null, aVar2, (a.C0648a.f57518c << 18) | 6, a.b.f57519c, 2944);
                aVar2.S();
            } else {
                aVar2 = h11;
                aVar2.C(1996605633);
                c.a aVar3 = new c.a();
                String L = vm2.L();
                LiveData<? extends String> o12 = vm2.o();
                aVar2.C(1996605885);
                if (o12 != null) {
                    n1Var = LiveDataAdapterKt.a(o12, aVar2, 8);
                }
                aVar2.S();
                if (n1Var == null || (str3 = (String) n1Var.getValue()) == null) {
                    str = "";
                } else {
                    str = str3;
                }
                String G2 = vm2.G();
                if (G2 == null) {
                    str2 = "";
                } else {
                    str2 = G2;
                }
                String D2 = vm2.D();
                hk.a N = vm2.N();
                String M2 = vm2.M();
                a.b A2 = vm2.A();
                a.C0648a y12 = vm2.y();
                List<String> U = vm2.U();
                Integer valueOf2 = Integer.valueOf(i11);
                aVar2.C(1618982084);
                boolean T2 = aVar2.T(valueOf2) | aVar2.T(onListingItemClicked) | aVar2.T(vm2);
                Object D3 = aVar2.D();
                if (T2 || D3 == androidx.compose.runtime.a.f7182a.a()) {
                    D3 = new g00.a<p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CardViewKt$CardView$2$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ p invoke() {
                            invoke2();
                            return p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            onListingItemClicked.invoke(vm2.m(), Integer.valueOf(i11 + 1), vm2.K());
                        }
                    };
                    aVar2.u(D3);
                }
                aVar2.S();
                CardsKt.h((g00.a) D3, aVar3, L, str, M2, U, str2, null, y12, null, N, A2, null, D2, null, null, aVar2, (c.a.f41901f << 3) | 262144 | (a.C0648a.f57518c << 24), hk.a.f57516b | (a.b.f57519c << 3), 53888);
                aVar2.S();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.allverticals.allverticalssectionsviews.CardViewKt$CardView$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i17) {
                    CardViewKt.a(VerticalListingItemViewModel.this, onListingItemClicked, i11, aVar4, v0.a(i12 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
