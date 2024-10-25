package com.forsale.designSystem.layouts;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import b1.t1;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.typography.ValuesKt;
import e2.h;
import g00.p;
import g00.q;
import j0.e1;
import j0.k;
import j0.s0;
import j0.t0;
import kotlin.jvm.internal.Lambda;
import v0.b;
import w.t;
import w.u;
/* compiled from: CardSub.kt */
/* loaded from: classes3.dex */
final class CardSubKt$CardSubRectangle$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f41584a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41585b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41586c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardSubKt$CardSubRectangle$1(Painter painter, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f41584a = painter;
        this.f41585b = pVar;
        this.f41586c = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-948539805, i11, -1, "com.forsale.designSystem.layouts.CardSubRectangle.<anonymous> (CardSub.kt:38)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        float f11 = 8;
        androidx.compose.ui.c b11 = AspectRatioKt.b(PaddingKt.j(aVar2, h.l(f11), h.l(4)), 3.4375f, false, 2, null);
        Arrangement.f o11 = Arrangement.f3698a.o(h.l(f11));
        b.a aVar3 = v0.b.f74009a;
        b.c i12 = aVar3.i();
        Painter painter = this.f41584a;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar = this.f41585b;
        int i13 = this.f41586c;
        aVar.C(693286680);
        a0 a11 = o.a(o11, i12, aVar, 54);
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(b11);
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
        p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b12);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        androidx.compose.ui.c d11 = t.d(u.f74924a, aVar2, 1.0f, false, 2, null);
        aVar.C(733328855);
        a0 g11 = BoxKt.g(aVar3.o(), false, aVar, 0);
        aVar.C(-1323940314);
        int a15 = j0.e.a(aVar, 0);
        k s12 = aVar.s();
        g00.a<ComposeUiNode> a16 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(d11);
        if (!(aVar.k() instanceof j0.d)) {
            j0.e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a16);
        } else {
            aVar.t();
        }
        androidx.compose.runtime.a a17 = Updater.a(aVar);
        Updater.c(a17, g11, companion.e());
        Updater.c(a17, s12, companion.g());
        p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
        if (a17.f() || !kotlin.jvm.internal.o.d(a17.D(), Integer.valueOf(a15))) {
            a17.u(Integer.valueOf(a15));
            a17.p(Integer.valueOf(a15), b13);
        }
        c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        s0<androidx.compose.ui.text.a0> c13 = ValuesKt.c();
        dk.a aVar4 = dk.a.f54291a;
        CompositionLocalKt.b(new t0[]{TextKt.i().c(2), c13.c(aVar4.c(aVar, 6).c()), com.forsale.designSystem.colors.ValuesKt.d().c(t1.g(aVar4.a(aVar, 6).e().m(aVar, 0)))}, pVar, aVar, (i13 & 112) | 8);
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        androidx.compose.ui.c b14 = androidx.compose.ui.draw.c.b(AspectRatioKt.b(SizeKt.d(aVar2, 0.0f, 1, null), 1.0f, false, 2, null), painter, false, null, null, 0.0f, null, 62, null);
        CardSubKt$CardSubRectangle$1$1$3 cardSubKt$CardSubRectangle$1$1$3 = CardSubKt$CardSubRectangle$1$1$3.f41587a;
        aVar.C(-1323940314);
        int a18 = j0.e.a(aVar, 0);
        k s13 = aVar.s();
        g00.a<ComposeUiNode> a19 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c14 = LayoutKt.c(b14);
        if (!(aVar.k() instanceof j0.d)) {
            j0.e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a19);
        } else {
            aVar.t();
        }
        androidx.compose.runtime.a a21 = Updater.a(aVar);
        Updater.c(a21, cardSubKt$CardSubRectangle$1$1$3, companion.e());
        Updater.c(a21, s13, companion.g());
        p<ComposeUiNode, Integer, wz.p> b15 = companion.b();
        if (a21.f() || !kotlin.jvm.internal.o.d(a21.D(), Integer.valueOf(a18))) {
            a21.u(Integer.valueOf(a18));
            a21.p(Integer.valueOf(a18), b15);
        }
        c14.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        aVar.S();
        aVar.w();
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
