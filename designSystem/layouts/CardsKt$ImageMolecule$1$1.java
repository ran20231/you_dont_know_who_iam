package com.forsale.designSystem.layouts;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import b1.t1;
import g00.p;
import g00.q;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
final class CardsKt$ImageMolecule$1$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q<w.c, androidx.compose.runtime.a, Integer, wz.p> f41707a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41708b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardsKt$ImageMolecule$1$1(q<? super w.c, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, int i11) {
        super(2);
        this.f41707a = qVar;
        this.f41708b = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-96514389, i11, -1, "com.forsale.designSystem.layouts.ImageMolecule.<anonymous>.<anonymous> (Cards.kt:99)");
        }
        androidx.compose.ui.c b11 = BackgroundKt.b(SizeKt.f(androidx.compose.ui.c.f7566a, 0.0f, 1, null), t1.o(dk.a.f54291a.a(aVar, 6).g().d(aVar, 0), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
        q<w.c, androidx.compose.runtime.a, Integer, wz.p> qVar = this.f41707a;
        int i12 = (this.f41708b >> 9) & 7168;
        aVar.C(733328855);
        int i13 = i12 >> 3;
        a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, aVar, (i13 & 112) | (i13 & 14));
        aVar.C(-1323940314);
        int a11 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(b11);
        int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
        if (!(aVar.k() instanceof j0.d)) {
            j0.e.c();
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
        p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b12);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, Integer.valueOf((i14 >> 3) & 112));
        aVar.C(2058660585);
        qVar.invoke(BoxScopeInstance.f3756a, aVar, Integer.valueOf(6 | ((i12 >> 6) & 112)));
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
