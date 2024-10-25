package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.c;
import c0.g;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.postad.bundles.BundlesViewKt;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.dividers.DividersKt;
import e2.h;
import g00.p;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import r0.b;
import v0.b;
import w.f;
import w.u;
import yj.d;
/* compiled from: SellerBundle.kt */
/* loaded from: classes2.dex */
public final class SellerBundleKt {
    public static final void a(final ListingItemDetails.BundleDetails bundle, final String currency, a aVar, final int i11) {
        o.i(bundle, "bundle");
        o.i(currency, "currency");
        a h11 = aVar.h(1264877027);
        if (c.I()) {
            c.U(1264877027, i11, -1, "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.BundleCard (SellerBundle.kt:26)");
        }
        SurfaceKt.c(PaddingKt.j(androidx.compose.ui.c.f7566a, h.l(12), h.l(16)), g.c(h.l(8)), 0L, 0L, s.g.a(h.l(1), dk.a.f54291a.a(h11, dk.a.f54292b).e().d(h11, d.f76453b)), 0.0f, b.b(h11, 285896735, true, new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.SellerBundleKt$BundleCard$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void b(a aVar2, int i12) {
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (c.I()) {
                    c.U(285896735, i12, -1, "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.BundleCard.<anonymous> (SellerBundle.kt:33)");
                }
                c.a aVar3 = androidx.compose.ui.c.f7566a;
                float f11 = 12;
                float f12 = 8;
                androidx.compose.ui.c l11 = PaddingKt.l(SizeKt.f(aVar3, 0.0f, 1, null), h.l(f11), h.l(f11), h.l(f11), h.l(f12));
                ListingItemDetails.BundleDetails bundleDetails = ListingItemDetails.BundleDetails.this;
                String str = currency;
                aVar2.C(-483455358);
                Arrangement arrangement = Arrangement.f3698a;
                Arrangement.m h12 = arrangement.h();
                b.a aVar4 = v0.b.f74009a;
                a0 a11 = e.a(h12, aVar4.k(), aVar2, 0);
                aVar2.C(-1323940314);
                int a12 = j0.e.a(aVar2, 0);
                k s11 = aVar2.s();
                ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                g00.a<ComposeUiNode> a13 = companion.a();
                q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(l11);
                if (!(aVar2.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar2.I();
                if (aVar2.f()) {
                    aVar2.y(a13);
                } else {
                    aVar2.t();
                }
                a a14 = Updater.a(aVar2);
                Updater.c(a14, a11, companion.e());
                Updater.c(a14, s11, companion.g());
                p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
                if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.p(Integer.valueOf(a12), b11);
                }
                c11.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                aVar2.C(2058660585);
                f fVar = f.f74891a;
                androidx.compose.ui.c h13 = SizeKt.h(aVar3, 0.0f, 1, null);
                Arrangement.f e11 = arrangement.e();
                aVar2.C(693286680);
                a0 a15 = androidx.compose.foundation.layout.o.a(e11, aVar4.l(), aVar2, 6);
                aVar2.C(-1323940314);
                int a16 = j0.e.a(aVar2, 0);
                k s12 = aVar2.s();
                g00.a<ComposeUiNode> a17 = companion.a();
                q<e1<ComposeUiNode>, a, Integer, wz.p> c12 = LayoutKt.c(h13);
                if (!(aVar2.k() instanceof j0.d)) {
                    j0.e.c();
                }
                aVar2.I();
                if (aVar2.f()) {
                    aVar2.y(a17);
                } else {
                    aVar2.t();
                }
                a a18 = Updater.a(aVar2);
                Updater.c(a18, a15, companion.e());
                Updater.c(a18, s12, companion.g());
                p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
                if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                    a18.u(Integer.valueOf(a16));
                    a18.p(Integer.valueOf(a16), b12);
                }
                c12.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                aVar2.C(2058660585);
                u uVar = u.f74924a;
                String name = bundleDetails.getName();
                dk.a aVar5 = dk.a.f54291a;
                int i13 = dk.a.f54292b;
                androidx.compose.ui.text.a0 l12 = aVar5.c(aVar2, i13).l();
                d e12 = aVar5.a(aVar2, i13).e();
                int i14 = d.f76453b;
                TextKt.a(name, null, 0, 0, false, 0, 0, null, l12, e12.m(aVar2, i14), 0, aVar2, 0, 0, 1278);
                aVar2.C(-2106125894);
                c.a aVar6 = new c.a(0, 1, null);
                int l13 = aVar6.l(androidx.compose.ui.text.u.b(aVar5.c(aVar2, i13).l().M(), aVar5.a(aVar2, i13).e().m(aVar2, i14), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    aVar6.h(TypeExtensionsKt.p(bundleDetails.getPrice()) + " ");
                    wz.p pVar = wz.p.f75480a;
                    aVar6.j(l13);
                    l13 = aVar6.l(androidx.compose.ui.text.u.b(aVar5.c(aVar2, i13).b().M(), aVar5.a(aVar2, i13).e().j(aVar2, i14), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                    try {
                        aVar6.h(str);
                        aVar6.j(l13);
                        androidx.compose.ui.text.c m11 = aVar6.m();
                        aVar2.S();
                        TextKt.b(m11, null, 0L, 0, 0, false, 0, 0, null, null, null, aVar2, 0, 0, 2046);
                        aVar2.S();
                        aVar2.w();
                        aVar2.S();
                        aVar2.S();
                        DividersKt.a(null, 0.0f, 0L, aVar2, 0, 7);
                        SpacerKt.a(SizeKt.i(SizeKt.h(aVar3, 0.0f, 1, null), h.l(f12)), aVar2, 6);
                        List<ListingItemDetails.BundleDetails.BundleStatus> bundleStatus = bundleDetails.getBundleStatus();
                        aVar2.C(1156859928);
                        if (bundleStatus != null) {
                            for (ListingItemDetails.BundleDetails.BundleStatus bundleStatus2 : bundleStatus) {
                                BundlesViewKt.b(bundleStatus2.getText(), bundleStatus2.getIcon(), bundleStatus2.getHint(), aVar2, 0, 0);
                            }
                            wz.p pVar2 = wz.p.f75480a;
                        }
                        aVar2.S();
                        aVar2.S();
                        aVar2.w();
                        aVar2.S();
                        aVar2.S();
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    } finally {
                    }
                } finally {
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                b(aVar2, num.intValue());
                return wz.p.f75480a;
            }
        }), h11, 1572870, 44);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.listinglifetime.SellerBundleKt$BundleCard$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i12) {
                    SellerBundleKt.a(ListingItemDetails.BundleDetails.this, currency, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
