package com.forsale.designSystem.buttons;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.iconography.IconKt;
import g00.p;
import g00.q;
import j0.e;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IconButton.kt */
/* loaded from: classes3.dex */
public final class IconButtonKt$IconButton$2$1$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f41172a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Painter f41173b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f41174c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconButtonKt$IconButton$2$1$1(c cVar, Painter painter, long j11) {
        super(2);
        this.f41172a = cVar;
        this.f41173b = painter;
        this.f41174c = j11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-93878776, i11, -1, "com.forsale.designSystem.buttons.IconButton.<anonymous>.<anonymous>.<anonymous> (IconButton.kt:79)");
        }
        androidx.compose.ui.c h11 = PaddingKt.h(androidx.compose.ui.c.f7566a, this.f41172a.b());
        v0.b e11 = v0.b.f74009a.e();
        Painter painter = this.f41173b;
        long j11 = this.f41174c;
        aVar.C(733328855);
        a0 g11 = BoxKt.g(e11, false, aVar, 6);
        aVar.C(-1323940314);
        int a11 = e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(h11);
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
        IconKt.a(painter, null, null, j11, false, 0.0f, aVar, 8, 54);
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
