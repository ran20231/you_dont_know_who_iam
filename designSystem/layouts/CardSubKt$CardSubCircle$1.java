package com.forsale.designSystem.layouts;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.a0;
import androidx.recyclerview.widget.RecyclerView;
import b1.t1;
import c0.g;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.typography.ValuesKt;
import com.google.android.gms.ads.AdRequest;
import e2.h;
import g00.p;
import g00.q;
import j0.e1;
import j0.k;
import j0.s0;
import j0.t0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import v0.b;
import w.f;
/* compiled from: CardSub.kt */
/* loaded from: classes3.dex */
final class CardSubKt$CardSubCircle$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41571a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41572b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Painter f41573c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f41574d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardSubKt$CardSubCircle$1(p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i11, Painter painter, boolean z11) {
        super(2);
        this.f41571a = pVar;
        this.f41572b = i11;
        this.f41573c = painter;
        this.f41574d = z11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        a0 b11;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1588487376, i11, -1, "com.forsale.designSystem.layouts.CardSubCircle.<anonymous> (CardSub.kt:128)");
        }
        Arrangement.f o11 = Arrangement.f3698a.o(h.l(8));
        b.a aVar2 = v0.b.f74009a;
        b.InterfaceC0889b g11 = aVar2.g();
        p<androidx.compose.runtime.a, Integer, wz.p> pVar = this.f41571a;
        int i12 = this.f41572b;
        Painter painter = this.f41573c;
        boolean z11 = this.f41574d;
        aVar.C(-483455358);
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        androidx.compose.ui.layout.a0 a11 = androidx.compose.foundation.layout.e.a(o11, g11, aVar, 54);
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar3);
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
        if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b12);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        f fVar = f.f74891a;
        dk.a aVar4 = dk.a.f54291a;
        androidx.compose.ui.c a15 = BackgroundKt.a(aVar3, aVar4.a(aVar, 6).e().h(aVar, 0), g.f());
        v0.b e11 = aVar2.e();
        aVar.C(733328855);
        androidx.compose.ui.layout.a0 g12 = BoxKt.g(e11, false, aVar, 6);
        aVar.C(-1323940314);
        int a16 = j0.e.a(aVar, 0);
        k s12 = aVar.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(a15);
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
        Updater.c(a18, g12, companion.e());
        Updater.c(a18, s12, companion.g());
        p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
        if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
            a18.u(Integer.valueOf(a16));
            a18.p(Integer.valueOf(a16), b13);
        }
        c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        androidx.compose.ui.c a19 = AspectRatioKt.a(androidx.compose.ui.draw.c.b(aVar3, painter, false, null, null, 0.0f, null, 62, null), 1.0f, !z11);
        CardSubKt$CardSubCircle$1$1$1$2 cardSubKt$CardSubCircle$1$1$1$2 = CardSubKt$CardSubCircle$1$1$1$2.f41575a;
        aVar.C(-1323940314);
        int a21 = j0.e.a(aVar, 0);
        k s13 = aVar.s();
        g00.a<ComposeUiNode> a22 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c13 = LayoutKt.c(a19);
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
        Updater.c(a23, cardSubKt$CardSubCircle$1$1$1$2, companion.e());
        Updater.c(a23, s13, companion.g());
        p<ComposeUiNode, Integer, wz.p> b14 = companion.b();
        if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
            a23.u(Integer.valueOf(a21));
            a23.p(Integer.valueOf(a21), b14);
        }
        c13.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        s0<a0> c14 = ValuesKt.c();
        b11 = r19.b((r48 & 1) != 0 ? r19.f9207a.g() : 0L, (r48 & 2) != 0 ? r19.f9207a.k() : 0L, (r48 & 4) != 0 ? r19.f9207a.n() : null, (r48 & 8) != 0 ? r19.f9207a.l() : null, (r48 & 16) != 0 ? r19.f9207a.m() : null, (r48 & 32) != 0 ? r19.f9207a.i() : null, (r48 & 64) != 0 ? r19.f9207a.j() : null, (r48 & 128) != 0 ? r19.f9207a.o() : 0L, (r48 & 256) != 0 ? r19.f9207a.e() : null, (r48 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? r19.f9207a.u() : null, (r48 & 1024) != 0 ? r19.f9207a.p() : null, (r48 & RecyclerView.l.FLAG_MOVED) != 0 ? r19.f9207a.d() : 0L, (r48 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? r19.f9207a.s() : null, (r48 & 8192) != 0 ? r19.f9207a.r() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r19.f9207a.h() : null, (r48 & 32768) != 0 ? r19.f9208b.h() : b2.f.f16081b.a(), (r48 & 65536) != 0 ? r19.f9208b.i() : 0, (r48 & 131072) != 0 ? r19.f9208b.e() : 0L, (r48 & 262144) != 0 ? r19.f9208b.j() : null, (r48 & 524288) != 0 ? r19.f9209c : null, (r48 & 1048576) != 0 ? r19.f9208b.f() : null, (r48 & 2097152) != 0 ? r19.f9208b.d() : 0, (r48 & 4194304) != 0 ? r19.f9208b.c() : 0, (r48 & 8388608) != 0 ? aVar4.c(aVar, 6).h().f9208b.k() : null);
        CompositionLocalKt.b(new t0[]{TextKt.i().c(2), c14.c(b11), com.forsale.designSystem.colors.ValuesKt.d().c(t1.g(aVar4.a(aVar, 6).e().m(aVar, 0)))}, pVar, aVar, (i12 & 112) | 8);
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
