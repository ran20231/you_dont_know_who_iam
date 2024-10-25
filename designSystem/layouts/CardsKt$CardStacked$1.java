package com.forsale.designSystem.layouts;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import w.t;
import w.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public final class CardsKt$CardStacked$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> A;
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> B;

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f41661a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f41662b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f41663c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41664d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41665e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ q<w.c, androidx.compose.runtime.a, Integer, wz.p> f41666f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f41667g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f41668h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41669i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41670j;

    /* renamed from: x  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41671x;

    /* renamed from: y  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41672y;

    /* renamed from: z  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41673z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardsKt$CardStacked$1(Painter painter, c cVar, boolean z11, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar2, q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar3, int i11, int i12, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar3, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar4, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar5, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar6, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar7) {
        super(2);
        this.f41661a = painter;
        this.f41662b = cVar;
        this.f41663c = z11;
        this.f41664d = qVar;
        this.f41665e = qVar2;
        this.f41666f = qVar3;
        this.f41667g = i11;
        this.f41668h = i12;
        this.f41669i = pVar;
        this.f41670j = pVar2;
        this.f41671x = pVar3;
        this.f41672y = pVar4;
        this.f41673z = pVar5;
        this.A = pVar6;
        this.B = pVar7;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        int i12;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1678022889, i11, -1, "com.forsale.designSystem.layouts.CardStacked.<anonymous> (Cards.kt:200)");
        }
        Painter painter = this.f41661a;
        c cVar = this.f41662b;
        boolean z11 = this.f41663c;
        q<t, androidx.compose.runtime.a, Integer, wz.p> qVar = this.f41664d;
        q<t, androidx.compose.runtime.a, Integer, wz.p> qVar2 = this.f41665e;
        q<w.c, androidx.compose.runtime.a, Integer, wz.p> qVar3 = this.f41666f;
        int i13 = this.f41667g;
        int i14 = this.f41668h;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar = this.f41669i;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar2 = this.f41670j;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar3 = this.f41671x;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar4 = this.f41672y;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar5 = this.f41673z;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar6 = this.A;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar7 = this.B;
        aVar.C(-483455358);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.m h11 = arrangement.h();
        b.a aVar3 = v0.b.f74009a;
        a0 a11 = androidx.compose.foundation.layout.e.a(h11, aVar3.k(), aVar, 0);
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar2);
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
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        f fVar = f.f74891a;
        int i15 = i14 >> 12;
        CardsKt.g(painter, cVar.a(), false, z11, qVar, qVar2, qVar3, 0.0f, 0.0f, aVar, ((i13 << 3) & 7168) | 8 | (i15 & 57344) | (i15 & 458752) | ((i13 << 6) & 3670016), 388);
        androidx.compose.ui.c h12 = SizeKt.h(PaddingKt.i(aVar2, h.l(8)), 0.0f, 1, null);
        float f11 = 6;
        Arrangement.f o11 = arrangement.o(h.l(f11));
        aVar.C(-483455358);
        a0 a15 = androidx.compose.foundation.layout.e.a(o11, aVar3.k(), aVar, 6);
        aVar.C(-1323940314);
        int a16 = j0.e.a(aVar, 0);
        k s12 = aVar.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(h12);
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
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b12);
        }
        c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        CardsKt.h(pVar, aVar, (i14 >> 9) & 14);
        CardsKt.i(pVar2, cVar.c(), cVar.c(), 0L, null, aVar, i15 & 14, 24);
        aVar.C(-1188938257);
        if (pVar3 != null) {
            int b13 = cVar.b();
            int b14 = cVar.b();
            dk.a aVar4 = dk.a.f54291a;
            i12 = 0;
            CardsKt.i(pVar3, b13, b14, aVar4.a(aVar, 6).e().j(aVar, 0), aVar4.c(aVar, 6).c(), aVar, (i14 >> 15) & 14, 0);
        } else {
            i12 = 0;
        }
        aVar.S();
        CardsKt.k(pVar4, pVar5, aVar, (i13 & 14) | (i13 & 112));
        Arrangement.f o12 = arrangement.o(h.l(f11));
        aVar.C(693286680);
        a0 a19 = androidx.compose.foundation.layout.o.a(o12, aVar3.l(), aVar, 6);
        aVar.C(-1323940314);
        int a21 = j0.e.a(aVar, i12);
        k s13 = aVar.s();
        g00.a<ComposeUiNode> a22 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c13 = LayoutKt.c(aVar2);
        if (!(aVar.k() instanceof j0.d)) {
            j0.e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a22);
        } else {
            aVar.t();
        }
        androidx.compose.runtime.a a23 = Updater.a(aVar);
        Updater.c(a23, a19, companion.e());
        Updater.c(a23, s13, companion.g());
        p<ComposeUiNode, Integer, wz.p> b15 = companion.b();
        if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
            a23.u(Integer.valueOf(a21));
            a23.p(Integer.valueOf(a21), b15);
        }
        c13.invoke(e1.a(e1.b(aVar)), aVar, Integer.valueOf(i12));
        aVar.C(2058660585);
        u uVar = u.f74924a;
        CardsKt.j(pVar6, aVar, (i14 >> 18) & 14);
        aVar.C(-1188937620);
        if (pVar7 != null) {
            pVar7.invoke(aVar, Integer.valueOf((i13 >> 9) & 14));
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
