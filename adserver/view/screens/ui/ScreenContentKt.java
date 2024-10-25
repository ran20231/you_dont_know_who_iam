package com.forsale.adserver.view.screens.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.adserver.view.screens.offersScreen.OffersViewModel;
import com.forsale.analytics.commercial.CommercialPageSource;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import commercial.CommercialTabName;
import g00.l;
import g00.q;
import g9.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import java.util.List;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import wz.p;
/* compiled from: ScreenContent.kt */
/* loaded from: classes2.dex */
public final class ScreenContentKt {
    public static final void a(final List<d> list, final List<n9.a> categories, final AdManagerAdRequest adManagerAdRequest, final OffersViewModel.c currentSelectedCategory, final q<? super AdManagerAdRequest, ? super androidx.compose.runtime.a, ? super Integer, p> gamView, final l<? super Integer, p> onCategoryChanged, final l<? super CommercialPageSource, p> checkAllOffersClicked, Boolean bool, CommercialTabName commercialTabName, final g00.a<p> onOfferSupportItemClicked, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        Boolean bool2;
        CommercialTabName commercialTabName2;
        o.i(categories, "categories");
        o.i(currentSelectedCategory, "currentSelectedCategory");
        o.i(gamView, "gamView");
        o.i(onCategoryChanged, "onCategoryChanged");
        o.i(checkAllOffersClicked, "checkAllOffersClicked");
        o.i(onOfferSupportItemClicked, "onOfferSupportItemClicked");
        androidx.compose.runtime.a h11 = aVar.h(729423299);
        if ((i12 & 128) != 0) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        if ((i12 & 256) != 0) {
            commercialTabName2 = null;
        } else {
            commercialTabName2 = commercialTabName;
        }
        if (c.I()) {
            c.U(729423299, i11, -1, "com.forsale.adserver.view.screens.ui.ScreenContent (ScreenContent.kt:30)");
        }
        androidx.compose.ui.c f11 = SizeKt.f(androidx.compose.ui.c.f7566a, 0.0f, 1, null);
        b.InterfaceC0889b g11 = b.f74009a.g();
        h11.C(-483455358);
        a0 a11 = e.a(Arrangement.f3698a.h(), g11, h11, 48);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(f11);
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
        h11.C(-437957797);
        if (!categories.isEmpty()) {
            int i13 = i11 >> 9;
            CategoryChipsKt.a(currentSelectedCategory, categories, onCategoryChanged, h11, (i13 & 896) | (i13 & 14) | 64);
        }
        h11.S();
        gamView.invoke(adManagerAdRequest, h11, Integer.valueOf(((i11 >> 9) & 112) | 8));
        int i14 = i11 >> 15;
        CommercialOffersSectionKt.f(list, checkAllOffersClicked, bool2, commercialTabName2, onOfferSupportItemClicked, h11, (i14 & 112) | 8 | (i14 & 896) | (i14 & 7168) | (i14 & 57344), 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final Boolean bool3 = bool2;
            final CommercialTabName commercialTabName3 = commercialTabName2;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.adserver.view.screens.ui.ScreenContentKt$ScreenContent$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i15) {
                    ScreenContentKt.a(list, categories, adManagerAdRequest, currentSelectedCategory, gamView, onCategoryChanged, checkAllOffersClicked, bool3, commercialTabName3, onOfferSupportItemClicked, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
