package com.forsale.app.features.categories.home;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.layouts.ListItemKt;
import e2.h;
import g00.a;
import g00.q;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import oa.g;
import r0.b;
import t9.y0;
import w.t;
import wz.p;
import yj.d;
/* compiled from: ContinueBrowsingUi.kt */
/* loaded from: classes2.dex */
public final class ContinueBrowsingUiKt {
    public static final void a(final boolean z11, final g gVar, final a<p> aVar, androidx.compose.runtime.a aVar2, final int i11) {
        androidx.compose.runtime.a aVar3;
        androidx.compose.runtime.a h11 = aVar2.h(1664973505);
        if (c.I()) {
            c.U(1664973505, i11, -1, "com.forsale.app.features.categories.home.ContinueBrowsing (ContinueBrowsingUi.kt:27)");
        }
        if (!z11 && gVar != null) {
            h11.C(2143054160);
            c.a aVar4 = androidx.compose.ui.c.f7566a;
            float f11 = 8;
            androidx.compose.ui.c a11 = TestTagKt.a(PaddingKt.i(BorderKt.f(aVar4, h.l(1.0f), dk.a.f54291a.a(h11, dk.a.f54292b).e().d(h11, d.f76453b), c0.g.c(h.l(f11))), h.l(12)), "continueBrowsingSection");
            float l11 = h.l(2);
            r0.a b11 = b.b(h11, 1460662820, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.ContinueBrowsingUiKt$ContinueBrowsing$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                public final void b(t ListItem, androidx.compose.runtime.a aVar5, int i12) {
                    o.i(ListItem, "$this$ListItem");
                    if ((i12 & 81) == 16 && aVar5.i()) {
                        aVar5.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(1460662820, i12, -1, "com.forsale.app.features.categories.home.ContinueBrowsing.<anonymous> (ContinueBrowsingUi.kt:38)");
                    }
                    c.a aVar6 = androidx.compose.ui.c.f7566a;
                    androidx.compose.ui.c i13 = PaddingKt.i(BackgroundKt.a(aVar6, dk.a.f54291a.a(aVar5, dk.a.f54292b).e().h(aVar5, d.f76453b), c0.g.c(h.l(8))), h.l(6));
                    g gVar2 = g.this;
                    aVar5.C(733328855);
                    a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, aVar5, 0);
                    aVar5.C(-1323940314);
                    int a12 = e.a(aVar5, 0);
                    k s11 = aVar5.s();
                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                    a<ComposeUiNode> a13 = companion.a();
                    q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(i13);
                    if (!(aVar5.k() instanceof j0.d)) {
                        e.c();
                    }
                    aVar5.I();
                    if (aVar5.f()) {
                        aVar5.y(a13);
                    } else {
                        aVar5.t();
                    }
                    androidx.compose.runtime.a a14 = Updater.a(aVar5);
                    Updater.c(a14, g11, companion.e());
                    Updater.c(a14, s11, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                    if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                        a14.u(Integer.valueOf(a12));
                        a14.p(Integer.valueOf(a12), b12);
                    }
                    c11.invoke(e1.a(e1.b(aVar5)), aVar5, 0);
                    aVar5.C(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
                    ImageKt.a(h5.d.a(gVar2.a().getImage(), null, null, null, 0, aVar5, 0, 30), null, SizeKt.p(aVar6, h.l(32)), null, null, 0.0f, null, aVar5, 432, 120);
                    aVar5.S();
                    aVar5.w();
                    aVar5.S();
                    aVar5.S();
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar5, Integer num) {
                    b(tVar, aVar5, num.intValue());
                    return p.f75480a;
                }
            });
            ComposableSingletons$ContinueBrowsingUiKt composableSingletons$ContinueBrowsingUiKt = ComposableSingletons$ContinueBrowsingUiKt.f23313a;
            ListItemKt.a(a11, false, b11, composableSingletons$ContinueBrowsingUiKt.a(), null, b.b(h11, -1048204465, true, new q<w.e, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.ContinueBrowsingUiKt$ContinueBrowsing$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                public final void b(w.e ListItem, androidx.compose.runtime.a aVar5, int i12) {
                    String name;
                    o.i(ListItem, "$this$ListItem");
                    if ((i12 & 81) == 16 && aVar5.i()) {
                        aVar5.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1048204465, i12, -1, "com.forsale.app.features.categories.home.ContinueBrowsing.<anonymous> (ContinueBrowsingUi.kt:57)");
                    }
                    aVar5.C(884250195);
                    if (g.this.b() != null && g.this.b().getCount() != 0) {
                        int i13 = y0.Y1;
                        String T = TypeExtensionsKt.T(g.this.b().getCount());
                        o.h(T, "localizeDigits(...)");
                        name = p1.g.c(i13, new Object[]{g.this.a().getName(), T}, aVar5, 64);
                    } else {
                        name = g.this.a().getName();
                    }
                    aVar5.S();
                    dk.a aVar6 = dk.a.f54291a;
                    int i14 = dk.a.f54292b;
                    TextKt.a(name, null, 0, 0, false, 1, 0, null, aVar6.c(aVar5, i14).c(), aVar6.a(aVar5, i14).f().i(aVar5, d.f76453b), 0, aVar5, 196608, 0, 1246);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(w.e eVar, androidx.compose.runtime.a aVar5, Integer num) {
                    b(eVar, aVar5, num.intValue());
                    return p.f75480a;
                }
            }), null, null, composableSingletons$ContinueBrowsingUiKt.b(), false, l11, 0.0f, 0.0f, aVar, h11, 100863360, ((i11 << 3) & 7168) | 6, 6866);
            aVar3 = h11;
            SpacerKt.a(SizeKt.i(aVar4, h.l(f11)), aVar3, 6);
            aVar3.S();
        } else {
            aVar3 = h11;
            aVar3.C(2143056476);
            SpacerKt.a(SizeKt.i(androidx.compose.ui.c.f7566a, h.l(16)), aVar3, 6);
            aVar3.S();
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l12 = aVar3.l();
        if (l12 != null) {
            l12.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.home.ContinueBrowsingUiKt$ContinueBrowsing$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i12) {
                    ContinueBrowsingUiKt.a(z11, gVar, aVar, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
