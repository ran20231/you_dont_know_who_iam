package com.forsale.designSystem.layouts;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import b1.t1;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.colors.ValuesKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.layouts.c;
import com.google.android.gms.ads.AdRequest;
import e2.h;
import g00.q;
import j0.d1;
import j0.e1;
import j0.k;
import j0.s0;
import j0.t0;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import v0.b;
import w.t;
import w.u;
import wz.p;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public final class CardsKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.c r28, b1.s4 r29, long r30, float r32, g00.a<wz.p> r33, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r34, androidx.compose.runtime.a r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.layouts.CardsKt.a(androidx.compose.ui.c, b1.s4, long, float, g00.a, g00.p, androidx.compose.runtime.a, int, int):void");
    }

    public static final void b(g00.a<p> onClick, Painter leadingPainter, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> meta, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> title, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar2, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> time, androidx.compose.ui.c cVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar2, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar3, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar4, boolean z11, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar5, q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, p> qVar3, androidx.compose.runtime.a aVar, int i11, int i12, int i13) {
        o.i(onClick, "onClick");
        o.i(leadingPainter, "leadingPainter");
        o.i(meta, "meta");
        o.i(title, "title");
        o.i(time, "time");
        androidx.compose.runtime.a h11 = aVar.h(1059588905);
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar6 = (i13 & 16) != 0 ? null : pVar;
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar7 = (i13 & 32) != 0 ? null : pVar2;
        c.a aVar2 = (i13 & 128) != 0 ? androidx.compose.ui.c.f7566a : cVar;
        q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar4 = (i13 & 256) != 0 ? null : qVar;
        q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar5 = (i13 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : qVar2;
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar8 = (i13 & 1024) != 0 ? null : pVar3;
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar9 = (i13 & RecyclerView.l.FLAG_MOVED) != 0 ? null : pVar4;
        boolean z12 = (i13 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z11;
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar10 = (i13 & 8192) != 0 ? null : pVar5;
        q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, p> qVar6 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : qVar3;
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1059588905, i11, i12, "com.forsale.designSystem.layouts.CardHorizontal (Cards.kt:381)");
        }
        a(aVar2, null, 0L, 0.0f, onClick, r0.b.b(h11, 1324447371, true, new CardsKt$CardHorizontal$1(leadingPainter, z12, qVar4, qVar5, qVar6, i12, i11, meta, title, pVar6, pVar7, pVar8, pVar9, time, pVar10)), h11, ((i11 >> 21) & 14) | 196608 | ((i11 << 12) & 57344), 14);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new CardsKt$CardHorizontal$2(onClick, leadingPainter, meta, title, pVar6, pVar7, time, aVar2, qVar4, qVar5, pVar8, pVar9, z12, pVar10, qVar6, i11, i12, i13));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.c r28, g00.a<wz.p> r29, com.forsale.designSystem.layouts.a r30, g00.q<? super w.t, ? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r31, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r32, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r33, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r34, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r35, g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r36, androidx.compose.runtime.a r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.layouts.CardsKt.c(androidx.compose.ui.c, g00.a, com.forsale.designSystem.layouts.a, g00.q, g00.p, g00.p, g00.p, g00.p, g00.p, androidx.compose.runtime.a, int, int):void");
    }

    public static final void d(g00.a<p> onClick, c dataOf, Painter leadingPainter, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> meta, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> title, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> time, androidx.compose.ui.c cVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar2, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar2, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar3, boolean z11, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar4, q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, p> qVar3, androidx.compose.runtime.a aVar, int i11, int i12, int i13) {
        o.i(onClick, "onClick");
        o.i(dataOf, "dataOf");
        o.i(leadingPainter, "leadingPainter");
        o.i(meta, "meta");
        o.i(title, "title");
        o.i(time, "time");
        androidx.compose.runtime.a h11 = aVar.h(2073306553);
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar5 = (i13 & 32) != 0 ? null : pVar;
        c.a aVar2 = (i13 & 128) != 0 ? androidx.compose.ui.c.f7566a : cVar;
        q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar4 = (i13 & 256) != 0 ? null : qVar;
        q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar5 = (i13 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : qVar2;
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar6 = (i13 & 1024) != 0 ? null : pVar2;
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar7 = (i13 & RecyclerView.l.FLAG_MOVED) != 0 ? null : pVar3;
        boolean z12 = (i13 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z11;
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar8 = (i13 & 8192) != 0 ? null : pVar4;
        q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, p> qVar6 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : qVar3;
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(2073306553, i11, i12, "com.forsale.designSystem.layouts.CardStacked (Cards.kt:195)");
        }
        androidx.compose.ui.c cVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c cVar3 = aVar2;
        a(cVar2.k(h.n(dataOf.d(), h.f54555b.c()) ? cVar2 : SizeKt.u(cVar2, dataOf.d())).k(aVar2), null, 0L, 0.0f, onClick, r0.b.b(h11, -1678022889, true, new CardsKt$CardStacked$1(leadingPainter, dataOf, z12, qVar4, qVar5, qVar6, i12, i11, meta, title, pVar5, pVar6, pVar7, time, pVar8)), h11, ((i11 << 12) & 57344) | 196608, 14);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new CardsKt$CardStacked$2(onClick, dataOf, leadingPainter, meta, title, pVar5, time, cVar3, qVar4, qVar5, pVar6, pVar7, z12, pVar8, qVar6, i11, i12, i13));
    }

    public static final void e(g00.a<p> onClick, c dataOf, Painter leadingPainter, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> meta, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> titleItems, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> time, androidx.compose.ui.c cVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar2, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar2, boolean z11, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar3, q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, p> qVar3, androidx.compose.runtime.a aVar, int i11, int i12, int i13) {
        o.i(onClick, "onClick");
        o.i(dataOf, "dataOf");
        o.i(leadingPainter, "leadingPainter");
        o.i(meta, "meta");
        o.i(titleItems, "titleItems");
        o.i(time, "time");
        androidx.compose.runtime.a h11 = aVar.h(-1771805852);
        c.a aVar2 = (i13 & 64) != 0 ? androidx.compose.ui.c.f7566a : cVar;
        q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar4 = (i13 & 128) != 0 ? null : qVar;
        q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar5 = (i13 & 256) != 0 ? null : qVar2;
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar4 = (i13 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : pVar;
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar5 = (i13 & 1024) != 0 ? null : pVar2;
        boolean z12 = (i13 & RecyclerView.l.FLAG_MOVED) != 0 ? false : z11;
        g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar6 = (i13 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : pVar3;
        q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, p> qVar6 = (i13 & 8192) != 0 ? null : qVar3;
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1771805852, i11, i12, "com.forsale.designSystem.layouts.CardStacked (Cards.kt:254)");
        }
        if (!(dataOf instanceof c.b)) {
            int i14 = i11 << 3;
            int i15 = (i11 & 14) | 25088 | (i11 & 112) | (i11 & 7168) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192);
            int i16 = i12 << 3;
            d(onClick, dataOf, leadingPainter, meta, r0.b.b(h11, -2075863780, true, new CardsKt$CardStacked$4(titleItems, i11)), null, time, aVar2, qVar4, qVar5, pVar4, pVar5, z12, pVar6, qVar6, h11, i15, ((i11 >> 27) & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168) | (i16 & 57344), 32);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 == null) {
                return;
            }
            l11.a(new CardsKt$CardStacked$5(onClick, dataOf, leadingPainter, meta, titleItems, time, aVar2, qVar4, qVar5, pVar4, pVar5, z12, pVar6, qVar6, i11, i12, i13));
            return;
        }
        throw new IllegalArgumentException("this variation of stacked card can not accept the data of CardStackedData.Small".toString());
    }

    public static final void f(t tVar, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> text, androidx.compose.runtime.a aVar, int i11, int i12) {
        Object obj;
        int i13;
        int i14;
        int i15;
        g00.p<androidx.compose.runtime.a, Integer, p> pVar2;
        o.i(tVar, "<this>");
        o.i(text, "text");
        androidx.compose.runtime.a h11 = aVar.h(254063426);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 48;
            obj = pVar;
        } else if ((i11 & 112) == 0) {
            obj = pVar;
            if (h11.F(obj)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 = i14 | i11;
        } else {
            obj = pVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (h11.F(text)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        if ((i13 & 721) == 144 && h11.i()) {
            h11.L();
            pVar2 = obj;
        } else {
            if (i16 != 0) {
                pVar2 = ComposableSingletons$CardsKt.f41737a.b();
            } else {
                pVar2 = obj;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(254063426, i13, -1, "com.forsale.designSystem.layouts.CardStackedTitleItem (Cards.kt:280)");
            }
            b.c i17 = v0.b.f74009a.i();
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(2));
            h11.C(693286680);
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            a0 a11 = androidx.compose.foundation.layout.o.a(o11, i17, h11, 54);
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
            u uVar = u.f74924a;
            s0<t1> d11 = ValuesKt.d();
            dk.a aVar3 = dk.a.f54291a;
            CompositionLocalKt.b(new t0[]{IconKt.d().c(h.f(h.l(16))), d11.c(t1.g(aVar3.a(h11, 6).e().g(h11, 0)))}, pVar2, h11, (i13 & 112) | 8);
            CompositionLocalKt.b(new t0[]{com.forsale.designSystem.typography.ValuesKt.c().c(aVar3.c(h11, 6).c()), ValuesKt.d().c(t1.g(aVar3.a(h11, 6).e().m(h11, 0)))}, text, h11, ((i13 >> 3) & 112) | 8);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new CardsKt$CardStackedTitleItem$2(tVar, pVar2, text, i11, i12));
        }
    }

    public static final void g(Painter painter, float f11, boolean z11, boolean z12, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar2, q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, p> qVar3, float f12, float f13, androidx.compose.runtime.a aVar, int i11, int i12) {
        o.i(painter, "painter");
        androidx.compose.runtime.a h11 = aVar.h(-2141455343);
        boolean z13 = (i12 & 4) != 0 ? false : z11;
        q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar4 = (i12 & 16) != 0 ? null : qVar;
        q<? super t, ? super androidx.compose.runtime.a, ? super Integer, p> qVar5 = (i12 & 32) != 0 ? null : qVar2;
        q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, p> qVar6 = (i12 & 64) == 0 ? qVar3 : null;
        float c11 = (i12 & 128) != 0 ? h.f54555b.c() : f12;
        float c12 = (i12 & 256) != 0 ? h.f54555b.c() : f13;
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-2141455343, i11, -1, "com.forsale.designSystem.layouts.ImageMolecule (Cards.kt:77)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c a11 = AspectRatioKt.a(aVar2, f11, z13);
        h.a aVar3 = h.f54555b;
        androidx.compose.ui.c k11 = a11.k(h.n(c11, aVar3.c()) ? aVar2 : SizeKt.u(aVar2, c11)).k(h.n(c12, aVar3.c()) ? aVar2 : SizeKt.i(aVar2, c12));
        h11.C(733328855);
        b.a aVar4 = v0.b.f74009a;
        a0 g11 = BoxKt.g(aVar4.o(), false, h11, 0);
        h11.C(-1323940314);
        int a12 = j0.e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(k11);
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
        Updater.c(a14, g11, companion.e());
        Updater.c(a14, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c13.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        float f14 = c12;
        ImageKt.a(painter, null, AspectRatioKt.a(aVar2, f11, z13), null, androidx.compose.ui.layout.c.f8188a.a(), 0.0f, null, h11, 24632, 104);
        h11.C(-888205302);
        if (z12) {
            PlaceHolderKt.a(AspectRatioKt.a(aVar2, f11, z13), h11, 0);
        }
        h11.S();
        h11.C(-888205157);
        if (qVar4 != null) {
            float f15 = 8;
            androidx.compose.ui.c m11 = PaddingKt.m(aVar2, h.l(f15), h.l(f15), 0.0f, 0.0f, 12, null);
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(4));
            int i13 = ((i11 >> 3) & 7168) | 48;
            h11.C(693286680);
            int i14 = i13 >> 3;
            a0 a15 = androidx.compose.foundation.layout.o.a(o11, aVar4.l(), h11, (i14 & 14) | (i14 & 112));
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c14 = LayoutKt.c(m11);
            int i15 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
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
            c14.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf((i15 >> 3) & 112));
            h11.C(2058660585);
            qVar4.invoke(u.f74924a, h11, Integer.valueOf(((i13 >> 6) & 112) | 6));
            h11.S();
            h11.w();
            h11.S();
            h11.S();
        }
        h11.S();
        h11.C(-888204974);
        if (qVar5 != null) {
            float f16 = 8;
            androidx.compose.ui.c e11 = boxScopeInstance.e(PaddingKt.m(aVar2, h.l(f16), 0.0f, 0.0f, h.l(f16), 6, null), aVar4.d());
            Arrangement.f o12 = Arrangement.f3698a.o(h.l(4));
            int i16 = ((i11 >> 6) & 7168) | 48;
            h11.C(693286680);
            int i17 = i16 >> 3;
            a0 a19 = androidx.compose.foundation.layout.o.a(o12, aVar4.l(), h11, (i17 & 112) | (i17 & 14));
            h11.C(-1323940314);
            int a21 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a22 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c15 = LayoutKt.c(e11);
            int i18 = ((((i16 << 3) & 112) << 9) & 7168) | 6;
            if (!(h11.k() instanceof j0.d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a22);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a23 = Updater.a(h11);
            Updater.c(a23, a19, companion.e());
            Updater.c(a23, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
                a23.u(Integer.valueOf(a21));
                a23.p(Integer.valueOf(a21), b13);
            }
            c15.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf((i18 >> 3) & 112));
            h11.C(2058660585);
            qVar5.invoke(u.f74924a, h11, Integer.valueOf(((i16 >> 6) & 112) | 6));
            h11.S();
            h11.w();
            h11.S();
            h11.S();
        }
        h11.S();
        h11.C(-1249282277);
        if (qVar6 != null) {
            CompositionLocalKt.a(ValuesKt.d().c(t1.g(dk.a.f54291a.a(h11, 6).g().c(h11, 0))), r0.b.b(h11, -96514389, true, new CardsKt$ImageMolecule$1$1(qVar6, i11)), h11, 0 | t0.f59917d | 48);
        }
        h11.S();
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new CardsKt$ImageMolecule$2(painter, f11, z13, z12, qVar4, qVar5, qVar6, c11, f14, i11, i12));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(-661674891);
        if ((i11 & 14) == 0) {
            if (h11.F(pVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-661674891, i12, -1, "com.forsale.designSystem.layouts.MetaMolecule (Cards.kt:112)");
            }
            s0<androidx.compose.ui.text.a0> c11 = com.forsale.designSystem.typography.ValuesKt.c();
            dk.a aVar2 = dk.a.f54291a;
            CompositionLocalKt.b(new t0[]{c11.c(aVar2.c(h11, 6).h()), ValuesKt.d().c(t1.g(aVar2.a(h11, 6).e().j(h11, 0))), TextKt.i().c(1)}, pVar, h11, ((i12 << 3) & 112) | 8);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new CardsKt$MetaMolecule$1(pVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(g00.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, wz.p> r17, int r18, int r19, long r20, androidx.compose.ui.text.a0 r22, androidx.compose.runtime.a r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.designSystem.layouts.CardsKt.i(g00.p, int, int, long, androidx.compose.ui.text.a0, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(-1964423363);
        if ((i11 & 14) == 0) {
            if (h11.F(pVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1964423363, i12, -1, "com.forsale.designSystem.layouts.TimeMolecule (Cards.kt:166)");
            }
            s0<androidx.compose.ui.text.a0> c11 = com.forsale.designSystem.typography.ValuesKt.c();
            dk.a aVar2 = dk.a.f54291a;
            CompositionLocalKt.b(new t0[]{c11.c(aVar2.c(h11, 6).h()), ValuesKt.d().c(t1.g(aVar2.a(h11, 6).e().j(h11, 0))), TextKt.i().c(1)}, pVar, h11, ((i12 << 3) & 112) | 8);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new CardsKt$TimeMolecule$1(pVar, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> pVar2, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        g00.p<androidx.compose.runtime.a, Integer, p> pVar3;
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar.h(-1059658920);
        if ((i11 & 14) == 0) {
            if (h11.F(pVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(pVar2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1059658920, i12, -1, "com.forsale.designSystem.layouts.TrailingMolecule (Cards.kt:142)");
            }
            if (pVar == null) {
                pVar3 = ComposableSingletons$CardsKt.f41737a.a();
            } else {
                pVar3 = pVar;
            }
            b.c i15 = v0.b.f74009a.i();
            h11.C(693286680);
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), i15, h11, 48);
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
            u uVar = u.f74924a;
            CompositionLocalKt.a(TextKt.i().c(1), r0.b.b(h11, 546629044, true, new CardsKt$TrailingMolecule$1$1(pVar3, pVar2, i12)), h11, t0.f59917d | 0 | 48);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new CardsKt$TrailingMolecule$2(pVar, pVar2, i11));
        }
    }
}
