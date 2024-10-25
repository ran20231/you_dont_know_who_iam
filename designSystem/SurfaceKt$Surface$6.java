package com.forsale.designSystem;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import b1.s4;
import g00.p;
import g00.q;
import j0.d;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import s.f;
import y0.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Surface.kt */
/* loaded from: classes3.dex */
public final class SurfaceKt$Surface$6 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f40689a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ float f40690b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s4 f40691c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ f f40692d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f40693e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c f40694f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f40695g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f40696h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SurfaceKt$Surface$6(c cVar, float f11, s4 s4Var, f fVar, long j11, c cVar2, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f40689a = cVar;
        this.f40690b = f11;
        this.f40691c = s4Var;
        this.f40692d = fVar;
        this.f40693e = j11;
        this.f40694f = cVar2;
        this.f40695g = pVar;
        this.f40696h = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        c cVar;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1029522197, i11, -1, "com.forsale.designSystem.Surface.<anonymous> (Surface.kt:96)");
        }
        c b11 = ShadowKt.b(this.f40689a, this.f40690b, this.f40691c, false, 0L, 0L, 24, null);
        f fVar = this.f40692d;
        if (fVar != null) {
            cVar = BorderKt.e(c.f7566a, fVar, this.f40691c);
        } else {
            cVar = c.f7566a;
        }
        c k11 = e.a(BackgroundKt.a(b11.k(cVar), this.f40693e, this.f40691c), this.f40691c).k(this.f40694f);
        p<androidx.compose.runtime.a, Integer, wz.p> pVar = this.f40695g;
        int i12 = this.f40696h;
        aVar.C(733328855);
        a0 g11 = BoxKt.g(v0.b.f74009a.o(), true, aVar, 48);
        aVar.C(-1323940314);
        int a11 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(k11);
        if (!(aVar.k() instanceof d)) {
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
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        pVar.invoke(aVar, Integer.valueOf((i12 >> 21) & 14));
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
