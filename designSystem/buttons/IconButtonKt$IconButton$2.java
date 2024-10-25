package com.forsale.designSystem.buttons;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.CustomIndication;
import com.forsale.designSystem.iconography.IconKt;
import e2.h;
import g00.p;
import g00.q;
import j0.e;
import j0.e1;
import j0.t0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import v.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IconButton.kt */
/* loaded from: classes3.dex */
public final class IconButtonKt$IconButton$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f41167a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f41168b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CustomIndication f41169c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Painter f41170d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f41171e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonKt$IconButton$2(c cVar, k kVar, CustomIndication customIndication, Painter painter, long j11) {
        super(2);
        this.f41167a = cVar;
        this.f41168b = kVar;
        this.f41169c = customIndication;
        this.f41170d = painter;
        this.f41171e = j11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(2086793538, i11, -1, "com.forsale.designSystem.buttons.IconButton.<anonymous> (IconButton.kt:72)");
        }
        androidx.compose.ui.c b11 = IndicationKt.b(SizeKt.q(androidx.compose.ui.c.f7566a, this.f41167a.a()), this.f41168b, this.f41169c);
        v0.b e11 = v0.b.f74009a.e();
        c cVar = this.f41167a;
        Painter painter = this.f41170d;
        long j11 = this.f41171e;
        aVar.C(733328855);
        a0 g11 = BoxKt.g(e11, false, aVar, 6);
        aVar.C(-1323940314);
        int a11 = e.a(aVar, 0);
        j0.k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(b11);
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
        p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b12);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        CompositionLocalKt.a(IconKt.d().c(h.f(cVar.c())), r0.b.b(aVar, -93878776, true, new IconButtonKt$IconButton$2$1$1(cVar, painter, j11)), aVar, t0.f59917d | 0 | 48);
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
