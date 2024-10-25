package com.forsale.app.features.categories.listings.paging;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.requestsbodies.MyListingsType;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.items.dfp.GamComposeKt;
import com.forsale.app.features.categories.listings.items.dfp.gamGeneric.a;
import com.forsale.app.features.categories.listings.items.listingItems.fullScreenAttributes.AttributesListingItemViewModel;
import com.forsale.app.features.categories.listings.items.listingItems.fullScreenDescription.DescriptionListingItemViewModel;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.chips.ChipsData;
import com.forsale.designSystem.chips.ChipsKt;
import com.forsale.designSystem.dividers.DividersKt;
import com.forsale.designSystem.layouts.SectionTitleKt;
import com.forsale.ui.components.cards.CardsKt;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import e2.h;
import g00.l;
import g00.q;
import hk.a;
import j0.d1;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import p1.g;
import t9.y0;
import v0.b;
import w.f;
import w.u;
import wz.p;
import yj.d;
/* compiled from: ListingsCards.kt */
/* loaded from: classes2.dex */
public final class ListingsCardsKt {
    public static final void a(final AttributesListingItemViewModel currentItem, final int i11, final Context context, androidx.compose.runtime.a aVar, final int i12) {
        n1 b11;
        String str;
        String str2;
        o.i(currentItem, "currentItem");
        o.i(context, "context");
        androidx.compose.runtime.a h11 = aVar.h(-567639276);
        if (c.I()) {
            c.U(-567639276, i12, -1, "com.forsale.app.features.categories.listings.paging.AttributesListingItem (ListingsCards.kt:95)");
        }
        androidx.compose.ui.c j11 = PaddingKt.j(androidx.compose.ui.c.f7566a, h.l(16), h.l(6));
        String L = currentItem.L();
        LiveData<? extends String> o11 = currentItem.o();
        h11.C(1900338595);
        if (o11 == null) {
            b11 = null;
        } else {
            b11 = LiveDataAdapterKt.b(o11, "", h11, 56);
        }
        h11.S();
        if (b11 == null || (str2 = (String) b11.getValue()) == null) {
            str = "";
        } else {
            str = str2;
        }
        String G = currentItem.G();
        String D = currentItem.D();
        String M = currentItem.M();
        a.C0648a y11 = currentItem.y();
        a.b A = currentItem.A();
        hk.a N = currentItem.N();
        CardsKt.b(j11, new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$AttributesListingItem$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                ListingsCardsKt.l(context, currentItem.m(), currentItem.n(), currentItem.W(), currentItem.g(i11), currentItem.J(), currentItem.k(), currentItem.U(), currentItem.K());
            }
        }, L, currentItem.X(context), str, M, currentItem.T(), D, null, G, y11, null, N, null, A, currentItem.V(), h11, 2097158, a.C0648a.f57518c | (hk.a.f57516b << 6) | (a.b.f57519c << 12), 10496);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$AttributesListingItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i13) {
                    ListingsCardsKt.a(AttributesListingItemViewModel.this, i11, context, aVar2, v0.a(i12 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final DescriptionListingItemViewModel currentItem, final int i11, final Context context, androidx.compose.runtime.a aVar, final int i12) {
        n1 b11;
        String str;
        String str2;
        o.i(currentItem, "currentItem");
        o.i(context, "context");
        androidx.compose.runtime.a h11 = aVar.h(-1746214396);
        if (c.I()) {
            c.U(-1746214396, i12, -1, "com.forsale.app.features.categories.listings.paging.DescriptionListingItem (ListingsCards.kt:132)");
        }
        androidx.compose.ui.c j11 = PaddingKt.j(androidx.compose.ui.c.f7566a, h.l(16), h.l(6));
        String L = currentItem.L();
        LiveData<? extends String> o11 = currentItem.o();
        h11.C(6169837);
        if (o11 == null) {
            b11 = null;
        } else {
            b11 = LiveDataAdapterKt.b(o11, "", h11, 56);
        }
        h11.S();
        if (b11 == null || (str2 = (String) b11.getValue()) == null) {
            str = "";
        } else {
            str = str2;
        }
        String G = currentItem.G();
        String M = currentItem.M();
        a.C0648a y11 = currentItem.y();
        hk.a N = currentItem.N();
        String T = currentItem.T();
        Integer V = currentItem.V();
        CardsKt.a(j11, new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$DescriptionListingItem$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                ListingsCardsKt.l(context, currentItem.m(), currentItem.n(), currentItem.W(), currentItem.g(i11), currentItem.J(), currentItem.k(), currentItem.U(), currentItem.K());
            }
        }, L, currentItem.X(context), str, M, T, null, null, G, y11, null, N, null, currentItem.A(), V, h11, 0, a.C0648a.f57518c | (hk.a.f57516b << 6) | (a.b.f57519c << 12), 10624);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$DescriptionListingItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i13) {
                    ListingsCardsKt.b(DescriptionListingItemViewModel.this, i11, context, aVar2, v0.a(i12 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final MyListingsType myListingsType, final MyListingsType myListingsType2, final l<? super MyListingsType, p> lVar, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        boolean z11;
        androidx.compose.runtime.a aVar2;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a h11 = aVar.h(-2143035203);
        if ((i11 & 14) == 0) {
            if (h11.T(myListingsType)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.T(myListingsType2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(lVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && h11.i()) {
            h11.L();
            aVar2 = h11;
        } else {
            if (c.I()) {
                c.U(-2143035203, i12, -1, "com.forsale.app.features.categories.listings.paging.Filter (ListingsCards.kt:293)");
            }
            ChipsData b11 = ChipsData.f41251a.b();
            if (myListingsType2 == myListingsType) {
                z11 = true;
            } else {
                z11 = false;
            }
            r0.a b12 = r0.b.b(h11, 180276955, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$Filter$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i16) {
                    int i17;
                    if ((i16 & 11) == 2 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (c.I()) {
                        c.U(180276955, i16, -1, "com.forsale.app.features.categories.listings.paging.Filter.<anonymous> (ListingsCards.kt:299)");
                    }
                    Integer choicableResId = MyListingsType.this.getChoicableResId();
                    if (choicableResId != null) {
                        i17 = choicableResId.intValue();
                    } else {
                        i17 = y0.f70590na;
                    }
                    TextKt.a(g.b(i17, aVar3, 0), null, 0, 0, false, 1, 0, null, null, dk.a.f54291a.a(aVar3, dk.a.f54292b).g().d(aVar3, d.f76453b), 0, aVar3, 196608, 0, 1502);
                    if (c.I()) {
                        c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
            h11.C(511388516);
            boolean T = h11.T(lVar) | h11.T(myListingsType);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new l<Boolean, p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$Filter$2$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return p.f75480a;
                    }

                    public final void invoke(boolean z12) {
                        lVar.invoke(myListingsType);
                    }
                };
                h11.u(D);
            }
            h11.S();
            aVar2 = h11;
            ChipsKt.b(null, b11, null, z11, true, null, b12, null, (l) D, null, h11, 1597440, 677);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$Filter$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i16) {
                    ListingsCardsKt.c(MyListingsType.this, myListingsType2, lVar, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void d(final yc.b currentItem, final int i11, final Context context, androidx.compose.runtime.a aVar, final int i12) {
        n1 a11;
        o.i(currentItem, "currentItem");
        o.i(context, "context");
        androidx.compose.runtime.a h11 = aVar.h(1723395014);
        if (c.I()) {
            c.U(1723395014, i12, -1, "com.forsale.app.features.categories.listings.paging.FullScreenNoImageItem (ListingsCards.kt:171)");
        }
        androidx.compose.ui.c j11 = PaddingKt.j(androidx.compose.ui.c.f7566a, h.l(16), h.l(6));
        g00.a<p> aVar2 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$FullScreenNoImageItem$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                ListingsCardsKt.l(context, currentItem.m(), currentItem.n(), false, currentItem.g(i11), currentItem.J(), currentItem.k(), currentItem.T(), currentItem.K());
            }
        };
        LiveData<? extends String> o11 = currentItem.o();
        h11.C(-1602016276);
        if (o11 == null) {
            a11 = null;
        } else {
            a11 = LiveDataAdapterKt.a(o11, h11, 8);
        }
        h11.S();
        String str = (a11 == null || (str = (String) a11.getValue()) == null) ? "" : "";
        String M = currentItem.M();
        String description = currentItem.m().getDescription();
        if (description == null) {
            description = "";
        }
        CardsKt.g(j11, aVar2, str, M, description, currentItem.G(), currentItem.y(), null, currentItem.N(), null, null, null, h11, (a.C0648a.f57518c << 18) | (hk.a.f57516b << 24), 0, 3712);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$FullScreenNoImageItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i13) {
                    ListingsCardsKt.d(yc.b.this, i11, context, aVar3, v0.a(i12 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(final com.forsale.app.features.categories.listings.items.dfp.gamGeneric.b bVar, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(220759171);
        if (c.I()) {
            c.U(220759171, i11, -1, "com.forsale.app.features.categories.listings.paging.GeneralGam (ListingsCards.kt:245)");
        }
        String b11 = bVar.e().b();
        boolean z11 = false;
        AdSize[] adSizeArr = {bVar.e().a()};
        AdManagerAdRequest f11 = bVar.f();
        if (bVar.e() instanceof a.C0335a) {
            z11 = ((a.C0335a) bVar.e()).f();
        }
        GamComposeKt.a(b11, adSizeArr, f11, z11, PaddingKt.k(androidx.compose.ui.c.f7566a, 0.0f, h.l(6), 1, null), null, h11, 25152, 32);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$GeneralGam$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    ListingsCardsKt.e(com.forsale.app.features.categories.listings.items.dfp.gamGeneric.b.this, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void f(final x9.b<?> bVar, final int i11, androidx.compose.runtime.a aVar, final int i12) {
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a h11 = aVar.h(683192407);
        if ((i12 & 14) == 0) {
            if (h11.T(bVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i13 = i15 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (h11.d(i11)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 |= i14;
        }
        if ((i13 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(683192407, i13, -1, "com.forsale.app.features.categories.listings.paging.LoadComposableCard (ListingsCards.kt:78)");
            }
            Context context = (Context) h11.q(AndroidCompositionLocals_androidKt.g());
            if (bVar instanceof fd.b) {
                h11.C(-1030236100);
                h((fd.b) bVar, h11, 8);
                h11.S();
            } else if (bVar instanceof DescriptionListingItemViewModel) {
                h11.C(-1030236038);
                b((DescriptionListingItemViewModel) bVar, i11, context, h11, (i13 & 112) | AdRequest.MAX_CONTENT_URL_LENGTH);
                h11.S();
            } else if (bVar instanceof AttributesListingItemViewModel) {
                h11.C(-1030235948);
                a((AttributesListingItemViewModel) bVar, i11, context, h11, (i13 & 112) | AdRequest.MAX_CONTENT_URL_LENGTH);
                h11.S();
            } else if (bVar instanceof yc.b) {
                h11.C(-1030235852);
                d((yc.b) bVar, i11, context, h11, (i13 & 112) | AdRequest.MAX_CONTENT_URL_LENGTH);
                h11.S();
            } else if (bVar instanceof com.forsale.app.features.categories.listings.items.dfp.gamGeneric.b) {
                h11.C(-1030235774);
                e((com.forsale.app.features.categories.listings.items.dfp.gamGeneric.b) bVar, h11, 8);
                h11.S();
            } else {
                h11.C(-1030235752);
                h11.S();
            }
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$LoadComposableCard$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i16) {
                    ListingsCardsKt.f(bVar, i11, aVar2, v0.a(i12 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void g(final MyListingsType selectedFilter, final List<? extends MyListingsType> allFilters, final l<? super MyListingsType, p> onSingleFilterSelect, androidx.compose.runtime.a aVar, final int i11) {
        o.i(selectedFilter, "selectedFilter");
        o.i(allFilters, "allFilters");
        o.i(onSingleFilterSelect, "onSingleFilterSelect");
        androidx.compose.runtime.a h11 = aVar.h(-1710106776);
        if (c.I()) {
            c.U(-1710106776, i11, -1, "com.forsale.app.features.categories.listings.paging.MyListingsFilters (ListingsCards.kt:263)");
        }
        Arrangement arrangement = Arrangement.f3698a;
        float f11 = 8;
        Arrangement.f o11 = arrangement.o(h.l(f11));
        h11.C(-483455358);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        b.a aVar3 = v0.b.f74009a;
        a0 a11 = e.a(o11, aVar3.k(), h11, 6);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a14 = Updater.a(h11);
        Updater.c(a14, a11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        float f12 = 16;
        androidx.compose.ui.c l11 = PaddingKt.l(SizeKt.h(aVar2, 0.0f, 1, null), h.l(f12), h.l(f11), h.l(f12), h.l(f11));
        Arrangement.f o12 = arrangement.o(h.l(f11));
        h11.C(693286680);
        a0 a15 = androidx.compose.foundation.layout.o.a(o12, aVar3.l(), h11, 6);
        h11.C(-1323940314);
        int a16 = j0.e.a(h11, 0);
        k s12 = h11.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(l11);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a17);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a18 = Updater.a(h11);
        Updater.c(a18, a15, companion.e());
        Updater.c(a18, s12, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b12);
        }
        c12.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        u uVar = u.f74924a;
        h11.C(1722312330);
        for (final MyListingsType myListingsType : allFilters) {
            h11.C(511388516);
            boolean T = h11.T(onSingleFilterSelect) | h11.T(myListingsType);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new l<MyListingsType, p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$MyListingsFilters$1$1$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void b(MyListingsType it2) {
                        o.i(it2, "it");
                        onSingleFilterSelect.invoke(myListingsType);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(MyListingsType myListingsType2) {
                        b(myListingsType2);
                        return p.f75480a;
                    }
                };
                h11.u(D);
            }
            h11.S();
            c(myListingsType, selectedFilter, (l) D, h11, (i11 << 3) & 112);
        }
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        DividersKt.a(null, 0.0f, 0L, h11, 0, 7);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l12 = h11.l();
        if (l12 != null) {
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$MyListingsFilters$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i12) {
                    ListingsCardsKt.g(MyListingsType.this, allFilters, onSingleFilterSelect, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void h(final fd.b currentItem, androidx.compose.runtime.a aVar, final int i11) {
        o.i(currentItem, "currentItem");
        androidx.compose.runtime.a h11 = aVar.h(978776432);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(978776432, i11, -1, "com.forsale.app.features.categories.listings.paging.TitleItem (ListingsCards.kt:200)");
        }
        h11.C(-483455358);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        a0 a11 = e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
        if (!(h11.k() instanceof j0.d)) {
            j0.e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a14 = Updater.a(h11);
        Updater.c(a14, a11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        f fVar = f.f74891a;
        dk.a aVar3 = dk.a.f54291a;
        int i12 = dk.a.f54292b;
        d e11 = aVar3.a(h11, i12).e();
        int i13 = d.f76453b;
        float f11 = 8;
        float f12 = 16;
        SectionTitleKt.a(PaddingKt.l(BackgroundKt.b(aVar2, e11.h(h11, i13), null, 2, null), h.l(f12), h.l(f11), h.l(f12), h.l(f11)), null, r0.b.b(h11, -1164282648, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$TitleItem$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x0119, code lost:
                if (r5 == null) goto L32;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(androidx.compose.runtime.a r19, int r20) {
                /*
                    Method dump skipped, instructions count: 370
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$TitleItem$1$1.b(androidx.compose.runtime.a, int):void");
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                b(aVar4, num.intValue());
                return p.f75480a;
            }
        }), null, null, null, h11, 384, 58);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        SpacerKt.a(BackgroundKt.b(SizeKt.i(SizeKt.h(aVar2, 0.0f, 1, null), h.l(f12)), aVar3.a(h11, i12).g().c(h11, i13), null, 2, null), h11, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.paging.ListingsCardsKt$TitleItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i14) {
                    ListingsCardsKt.h(fd.b.this, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(Context context, ListingItemBrief listingItemBrief, String str, boolean z11, int i11, List<String> list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, List<Integer> list2) {
        ListingDetailsActivity.R.a(context, (r33 & 1) != 0 ? null : listingItemBrief, (r33 & 2) != 0 ? null : 1000, (r33 & 4) != 0 ? -1 : 0, (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : str, (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : null, (r33 & 256) != 0 ? null : null, (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : listingDetailsSearchAnalyticsData, (r33 & 1024) != 0 ? false : z11, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? i11 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : list, (r33 & 8192) == 0 ? listingsAnalytics$FiltersPlace : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r.n() : list2);
    }
}
