package com.forsale.designSystem.layouts;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
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
public final class CardsKt$CardSimple$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41642a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f41643b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41644c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41645d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41646e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41647f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41648g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41649h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardsKt$CardSimple$1(p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, a aVar, int i11, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar3, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar4, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar5) {
        super(2);
        this.f41642a = pVar;
        this.f41643b = aVar;
        this.f41644c = i11;
        this.f41645d = pVar2;
        this.f41646e = qVar;
        this.f41647f = pVar3;
        this.f41648g = pVar4;
        this.f41649h = pVar5;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1123349136, i11, -1, "com.forsale.designSystem.layouts.CardSimple.<anonymous> (Cards.kt:440)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        float f11 = 8;
        androidx.compose.ui.c i12 = PaddingKt.i(aVar2, h.l(f11));
        p<androidx.compose.runtime.a, Integer, wz.p> pVar = this.f41642a;
        a aVar3 = this.f41643b;
        int i13 = this.f41644c;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar2 = this.f41645d;
        q<t, androidx.compose.runtime.a, Integer, wz.p> qVar = this.f41646e;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar3 = this.f41647f;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar4 = this.f41648g;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar5 = this.f41649h;
        aVar.C(-483455358);
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.m h11 = arrangement.h();
        b.a aVar4 = v0.b.f74009a;
        a0 a11 = androidx.compose.foundation.layout.e.a(h11, aVar4.k(), aVar, 0);
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(i12);
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
        float f12 = 6;
        Arrangement.f o11 = arrangement.o(h.l(f12));
        b.c i14 = aVar4.i();
        aVar.C(693286680);
        a0 a15 = androidx.compose.foundation.layout.o.a(o11, i14, aVar, 54);
        aVar.C(-1323940314);
        int a16 = j0.e.a(aVar, 0);
        k s12 = aVar.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(aVar2);
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
        u uVar = u.f74924a;
        aVar.C(-659196432);
        if (qVar != null) {
            qVar.invoke(uVar, aVar, Integer.valueOf(((i13 >> 6) & 112) | 6));
        }
        aVar.S();
        CardsKt.h(pVar3, aVar, (i13 >> 12) & 14);
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        SpacerKt.a(SizeKt.i(aVar2, h.l(f11)), aVar, 6);
        CardsKt.i(pVar, aVar3.d(), 0, 0L, aVar3.e(), aVar, (i13 >> 15) & 14, 12);
        SpacerKt.a(SizeKt.i(aVar2, h.l(4)), aVar, 6);
        CardsKt.i(pVar2, aVar3.c(), 0, aVar3.a(), aVar3.b(), aVar, (i13 >> 18) & 14, 4);
        SpacerKt.a(SizeKt.i(aVar2, h.l(f11)), aVar, 6);
        Arrangement.f o12 = arrangement.o(h.l(f12));
        b.c i15 = aVar4.i();
        aVar.C(693286680);
        a0 a19 = androidx.compose.foundation.layout.o.a(o12, i15, aVar, 54);
        aVar.C(-1323940314);
        int a21 = j0.e.a(aVar, 0);
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
        p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
        if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
            a23.u(Integer.valueOf(a21));
            a23.p(Integer.valueOf(a21), b13);
        }
        c13.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        CardsKt.j(pVar4, aVar, (i13 >> 21) & 14);
        aVar.C(-868333969);
        if (pVar5 != null) {
            pVar5.invoke(aVar, Integer.valueOf((i13 >> 24) & 14));
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
