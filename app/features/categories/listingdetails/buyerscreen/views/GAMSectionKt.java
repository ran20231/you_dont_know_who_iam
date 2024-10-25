package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import com.forsale.app.features.categories.listings.items.dfp.GamComposeKt;
import com.forsale.app.features.categories.listings.items.dfp.GamStates;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import e2.h;
import g00.l;
import g00.q;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.v0;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import p1.g;
import t9.y0;
import v0.b;
import wz.p;
import yj.d;
/* compiled from: GAMSection.kt */
/* loaded from: classes2.dex */
public final class GAMSectionKt {
    public static final void a(final AdManagerAdRequest gamRequest, final l<? super GamStates, p> onGamStateChanged, a aVar, final int i11) {
        List q11;
        o.i(gamRequest, "gamRequest");
        o.i(onGamStateChanged, "onGamStateChanged");
        a h11 = aVar.h(-1219193311);
        if (c.I()) {
            c.U(-1219193311, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.GAMSection (GAMSection.kt:20)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c a11 = TestTagKt.a(BackgroundKt.b(SizeKt.h(aVar2, 0.0f, 1, null), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, d.f76453b), null, 2, null), "gamSection");
        h11.C(733328855);
        b.a aVar3 = b.f74009a;
        a0 g11 = BoxKt.g(aVar3.o(), false, h11, 0);
        h11.C(-1323940314);
        int a12 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(a11);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a13);
        } else {
            h11.t();
        }
        a a14 = Updater.a(h11);
        Updater.c(a14, g11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        float f11 = 16;
        androidx.compose.ui.c e11 = BoxScopeInstance.f3756a.e(PaddingKt.l(aVar2, h.l(f11), h.l(8), h.l(f11), h.l(f11)), aVar3.e());
        String b12 = g.b(y0.f70596o, h11, 0);
        q11 = r.q(new AdSize(MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT), new AdSize(300, MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT), new AdSize(336, 280));
        AdSize[] adSizeArr = (AdSize[]) q11.toArray(new AdSize[0]);
        GamComposeKt.a(b12, (AdSize[]) Arrays.copyOf(adSizeArr, adSizeArr.length), gamRequest, false, e11, onGamStateChanged, h11, ((i11 << 12) & 458752) | 3648, 0);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.views.GAMSectionKt$GAMSection$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar4, int i12) {
                    GAMSectionKt.a(AdManagerAdRequest.this, onGamStateChanged, aVar4, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
