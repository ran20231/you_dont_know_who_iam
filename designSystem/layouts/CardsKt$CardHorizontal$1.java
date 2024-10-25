package com.forsale.designSystem.layouts;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import e2.h;
import g00.p;
import g00.q;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import v0.b;
import w.f;
import w.t;
import w.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public final class CardsKt$CardHorizontal$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> A;
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> B;

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f41616a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f41617b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41618c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41619d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q<w.c, androidx.compose.runtime.a, Integer, wz.p> f41620e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f41621f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f41622g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41623h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41624i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41625j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41626x;

    /* renamed from: y  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41627y;

    /* renamed from: z  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41628z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardsKt$CardHorizontal$1(Painter painter, boolean z11, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar2, q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar3, int i11, int i12, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar3, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar4, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar5, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar6, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar7, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar8) {
        super(2);
        this.f41616a = painter;
        this.f41617b = z11;
        this.f41618c = qVar;
        this.f41619d = qVar2;
        this.f41620e = qVar3;
        this.f41621f = i11;
        this.f41622g = i12;
        this.f41623h = pVar;
        this.f41624i = pVar2;
        this.f41625j = pVar3;
        this.f41626x = pVar4;
        this.f41627y = pVar5;
        this.f41628z = pVar6;
        this.A = pVar7;
        this.B = pVar8;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1324447371, i11, -1, "com.forsale.designSystem.layouts.CardHorizontal.<anonymous> (Cards.kt:383)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.c k11 = SizeKt.k(SizeKt.h(IntrinsicKt.a(aVar2, IntrinsicSize.Min), 0.0f, 1, null), h.l(130), 0.0f, 2, null);
        b.a aVar3 = v0.b.f74009a;
        b.c i12 = aVar3.i();
        Painter painter = this.f41616a;
        boolean z11 = this.f41617b;
        q<t, androidx.compose.runtime.a, Integer, wz.p> qVar = this.f41618c;
        q<t, androidx.compose.runtime.a, Integer, wz.p> qVar2 = this.f41619d;
        q<w.c, androidx.compose.runtime.a, Integer, wz.p> qVar3 = this.f41620e;
        int i13 = this.f41621f;
        int i14 = this.f41622g;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar = this.f41623h;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar2 = this.f41624i;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar3 = this.f41625j;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar4 = this.f41626x;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar5 = this.f41627y;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar6 = this.f41628z;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar7 = this.A;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar8 = this.B;
        aVar.C(693286680);
        Arrangement arrangement = Arrangement.f3698a;
        a0 a11 = o.a(arrangement.g(), i12, aVar, 48);
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(k11);
        if (!(aVar.k() instanceof j0.d)) {
            j0.e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a13);
        } else {
            aVar.t();
        }
        androidx.compose.runtime.a a14 = Updater.a(aVar);
        Updater.c(a14, a11, companion.e());
        Updater.c(a14, s11, companion.g());
        p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        u uVar = u.f74924a;
        float f11 = 140;
        int i15 = i14 >> 12;
        CardsKt.g(painter, 1.0f, true, z11, qVar, qVar2, qVar3, h.l(f11), h.l(f11), aVar, ((i13 << 3) & 7168) | 113246648 | (i15 & 57344) | (i15 & 458752) | ((i13 << 6) & 3670016), 0);
        androidx.compose.ui.c j11 = PaddingKt.j(aVar2, h.l(8), h.l(4));
        float f12 = 6;
        Arrangement.f o11 = arrangement.o(h.l(f12));
        aVar.C(-483455358);
        a0 a15 = androidx.compose.foundation.layout.e.a(o11, aVar3.k(), aVar, 6);
        aVar.C(-1323940314);
        int a16 = j0.e.a(aVar, 0);
        k s12 = aVar.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(j11);
        if (!(aVar.k() instanceof j0.d)) {
            j0.e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a17);
        } else {
            aVar.t();
        }
        androidx.compose.runtime.a a18 = Updater.a(aVar);
        Updater.c(a18, a15, companion.e());
        Updater.c(a18, s12, companion.g());
        p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
        if (a18.f() || !kotlin.jvm.internal.o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b12);
        }
        c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        f fVar = f.f74891a;
        CardsKt.h(pVar, aVar, (i14 >> 6) & 14);
        dk.a aVar4 = dk.a.f54291a;
        CardsKt.i(pVar2, 1, 0, aVar4.a(aVar, 6).e().m(aVar, 0), aVar4.c(aVar, 6).a(), aVar, ((i14 >> 9) & 14) | 48, 4);
        if (pVar3 != null) {
            aVar.C(-203873747);
            CardsKt.i(pVar3, 1, 1, aVar4.a(aVar, 6).e().j(aVar, 0), aVar4.c(aVar, 6).c(), aVar, (i15 & 14) | 432, 0);
            aVar.S();
        } else if (pVar4 != null) {
            aVar.C(-203873534);
            CardsKt.i(pVar4, 2, 0, aVar4.a(aVar, 6).e().j(aVar, 0), aVar4.c(aVar, 6).d(), aVar, ((i14 >> 15) & 14) | 48, 4);
            aVar.S();
        } else {
            aVar.C(-203873357);
            CardsKt.i(ComposableSingletons$CardsKt.f41737a.c(), 0, 0, 0L, null, aVar, 6, 30);
            aVar.S();
        }
        CardsKt.k(pVar5, pVar6, aVar, (i13 & 14) | (i13 & 112));
        Arrangement.f o12 = arrangement.o(h.l(f12));
        b.c a19 = aVar3.a();
        aVar.C(693286680);
        a0 a21 = o.a(o12, a19, aVar, 54);
        aVar.C(-1323940314);
        int a22 = j0.e.a(aVar, 0);
        k s13 = aVar.s();
        g00.a<ComposeUiNode> a23 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c13 = LayoutKt.c(aVar2);
        if (!(aVar.k() instanceof j0.d)) {
            j0.e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a23);
        } else {
            aVar.t();
        }
        androidx.compose.runtime.a a24 = Updater.a(aVar);
        Updater.c(a24, a21, companion.e());
        Updater.c(a24, s13, companion.g());
        p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
        if (a24.f() || !kotlin.jvm.internal.o.d(a24.D(), Integer.valueOf(a22))) {
            a24.u(Integer.valueOf(a22));
            a24.p(Integer.valueOf(a22), b13);
        }
        c13.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        CardsKt.j(pVar7, aVar, (i14 >> 18) & 14);
        aVar.C(-203873056);
        if (pVar8 != null) {
            pVar8.invoke(aVar, Integer.valueOf((i13 >> 9) & 14));
        }
        aVar.S();
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
