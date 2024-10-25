package com.forsale.designSystem.layouts;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.u0;
import androidx.compose.ui.node.ComposeUiNode;
import g00.p;
import g00.q;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import w.f;
/* compiled from: ScreenLayout.kt */
/* loaded from: classes3.dex */
final class ScreenLayoutKt$ScreenLayout$3$1$1$bodyContentPlaceables$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u0 f41852a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41853b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41854c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f41855d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScreenLayoutKt$ScreenLayout$3$1$1$bodyContentPlaceables$1(u0 u0Var, int i11, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i12) {
        super(2);
        this.f41852a = u0Var;
        this.f41853b = i11;
        this.f41854c = pVar;
        this.f41855d = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-221986710, i11, -1, "com.forsale.designSystem.layouts.ScreenLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScreenLayout.kt:150)");
        }
        androidx.compose.ui.c h11 = PaddingKt.h(androidx.compose.ui.c.f7566a, PaddingKt.e(0.0f, 0.0f, 0.0f, this.f41852a.x(this.f41853b), 7, null));
        p<androidx.compose.runtime.a, Integer, wz.p> pVar = this.f41854c;
        int i12 = this.f41855d;
        aVar.C(-483455358);
        a0 a11 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar, 0);
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(h11);
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
        pVar.invoke(aVar, Integer.valueOf((i12 >> 9) & 14));
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
