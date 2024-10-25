package com.forsale.designSystem.layouts;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import g00.p;
import g00.q;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
/* compiled from: ScreenLayout.kt */
/* loaded from: classes3.dex */
final class ScreenLayoutKt$ScreenLayout$3$1$1$snackbarPlaceables$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41859a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41860b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScreenLayoutKt$ScreenLayout$3$1$1$snackbarPlaceables$1(p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f41859a = pVar;
        this.f41860b = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        float f11;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1075822538, i11, -1, "com.forsale.designSystem.layouts.ScreenLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScreenLayout.kt:74)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        f11 = ScreenLayoutKt.f41810c;
        androidx.compose.ui.c k11 = PaddingKt.k(aVar2, f11, 0.0f, 2, null);
        p<androidx.compose.runtime.a, Integer, wz.p> pVar = this.f41859a;
        int i12 = this.f41860b;
        aVar.C(733328855);
        a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, aVar, 0);
        aVar.C(-1323940314);
        int a11 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(k11);
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
        p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b11);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        pVar.invoke(aVar, Integer.valueOf((i12 >> 12) & 14));
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
