package com.forsale.designSystem.buttons;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import b1.t1;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.iconography.IconKt;
import com.forsale.designSystem.typography.ValuesKt;
import e2.h;
import g00.p;
import g00.q;
import j0.e;
import j0.e1;
import j0.k;
import j0.s0;
import j0.t0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import w.t;
/* compiled from: ExtendedFAB.kt */
/* loaded from: classes3.dex */
final class ExtendedFABKt$ExtendedFAB$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41144a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41145b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedFABKt$ExtendedFAB$2(q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, int i11) {
        super(2);
        this.f41144a = qVar;
        this.f41145b = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-313228236, i11, -1, "com.forsale.designSystem.buttons.ExtendedFAB.<anonymous> (ExtendedFAB.kt:67)");
        }
        float f11 = 8;
        androidx.compose.ui.c l11 = PaddingKt.l(SizeKt.i(androidx.compose.ui.c.f7566a, h.l(40)), h.l(16), h.l(f11), h.l(12), h.l(f11));
        q<t, androidx.compose.runtime.a, Integer, wz.p> qVar = this.f41144a;
        int i12 = this.f41145b;
        aVar.C(733328855);
        a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, aVar, 0);
        aVar.C(-1323940314);
        int a11 = e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(l11);
        if (!(aVar.k() instanceof j0.d)) {
            e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a12);
        } else {
            aVar.t();
        }
        androidx.compose.runtime.a a13 = Updater.a(aVar);
        Updater.c(a13, g11, companion.e());
        Updater.c(a13, s11, companion.g());
        p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b11);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        s0<androidx.compose.ui.text.a0> c12 = ValuesKt.c();
        dk.a aVar2 = dk.a.f54291a;
        CompositionLocalKt.b(new t0[]{IconKt.d().c(h.f(h.l(24))), TextKt.i().c(1), c12.c(aVar2.c(aVar, 6).f()), com.forsale.designSystem.colors.ValuesKt.d().c(t1.g(aVar2.a(aVar, 6).e().m(aVar, 0)))}, r0.b.b(aVar, 1442403886, true, new ExtendedFABKt$ExtendedFAB$2$1$1(qVar, i12)), aVar, 56);
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
