package com.forsale.ui.components.ads;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import com.forsale.designSystem.SurfaceKt;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.iconography.IconKt;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import w.t;
import w.u;
/* compiled from: AdsGeneralDetails.kt */
/* loaded from: classes3.dex */
final class AdsGeneralDetailsKt$AdsGeneralDetails$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42438a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f42439b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42440c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42441d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42442e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f42443f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ String f42444g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsGeneralDetailsKt$AdsGeneralDetails$1(String str, String str2, int i11, g00.a<wz.p> aVar, g00.a<wz.p> aVar2, String str3, String str4) {
        super(2);
        this.f42438a = str;
        this.f42439b = str2;
        this.f42440c = i11;
        this.f42441d = aVar;
        this.f42442e = aVar2;
        this.f42443f = str3;
        this.f42444g = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r40v0, types: [androidx.compose.runtime.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v20 */
    public final void b(a aVar, int i11) {
        Arrangement arrangement;
        c.a aVar2;
        float f11;
        int i12;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1569091892, i11, -1, "com.forsale.ui.components.ads.AdsGeneralDetails.<anonymous> (AdsGeneralDetails.kt:52)");
        }
        String str = this.f42438a;
        String str2 = this.f42439b;
        int i13 = this.f42440c;
        g00.a<wz.p> aVar3 = this.f42441d;
        g00.a<wz.p> aVar4 = this.f42442e;
        String str3 = this.f42443f;
        String str4 = this.f42444g;
        aVar.C(-483455358);
        c.a aVar5 = c.f7566a;
        Arrangement arrangement2 = Arrangement.f3698a;
        Arrangement.m h11 = arrangement2.h();
        b.a aVar6 = b.f74009a;
        a0 a11 = e.a(h11, aVar6.k(), aVar, 0);
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(aVar5);
        if (!(aVar.k() instanceof d)) {
            j0.e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a13);
        } else {
            aVar.t();
        }
        a a14 = Updater.a(aVar);
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
        aVar.C(693286680);
        a0 a15 = androidx.compose.foundation.layout.o.a(arrangement2.g(), aVar6.l(), aVar, 0);
        aVar.C(-1323940314);
        int a16 = j0.e.a(aVar, 0);
        k s12 = aVar.s();
        g00.a<ComposeUiNode> a17 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, wz.p> c12 = LayoutKt.c(aVar5);
        if (!(aVar.k() instanceof d)) {
            j0.e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a17);
        } else {
            aVar.t();
        }
        a a18 = Updater.a(aVar);
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
        float f12 = 8;
        SurfaceKt.c(null, g.c(h.l(f12)), 0L, 0L, null, 0.0f, r0.b.b(aVar, -1339082038, true, new AdsGeneralDetailsKt$AdsGeneralDetails$1$1$1$1(str)), aVar, 1572864, 61);
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        float f13 = 16;
        SpacerKt.a(SizeKt.i(aVar5, h.l(f13)), aVar, 6);
        c h12 = SizeKt.h(aVar5, 0.0f, 1, null);
        Arrangement.f o11 = arrangement2.o(h.l(4));
        aVar.C(693286680);
        a0 a19 = androidx.compose.foundation.layout.o.a(o11, aVar6.l(), aVar, 6);
        aVar.C(-1323940314);
        int a21 = j0.e.a(aVar, 0);
        k s13 = aVar.s();
        g00.a<ComposeUiNode> a22 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, wz.p> c13 = LayoutKt.c(h12);
        if (!(aVar.k() instanceof d)) {
            j0.e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a22);
        } else {
            aVar.t();
        }
        a a23 = Updater.a(aVar);
        Updater.c(a23, a19, companion.e());
        Updater.c(a23, s13, companion.g());
        p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
        if (a23.f() || !o.d(a23.D(), Integer.valueOf(a21))) {
            a23.u(Integer.valueOf(a21));
            a23.p(Integer.valueOf(a21), b13);
        }
        c13.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        aVar.C(-1130432044);
        if (str2 != null) {
            Painter d11 = p1.e.d(sj.d.N, aVar, 0);
            dk.a aVar7 = dk.a.f54291a;
            int i14 = dk.a.f54292b;
            yj.d g11 = aVar7.a(aVar, i14).g();
            int i15 = yj.d.f76453b;
            arrangement = arrangement2;
            aVar2 = aVar5;
            IconKt.b(d11, null, null, g11.c(aVar, i15), false, 0.0f, true, aVar, 1573256, 50);
            f11 = f13;
            i12 = i13;
            TextKt.a(str2, null, 0, 0, false, 0, 0, null, aVar7.c(aVar, i14).c(), aVar7.a(aVar, i14).g().c(aVar, i15), 0, aVar, (i13 >> 15) & 14, 0, 1278);
        } else {
            arrangement = arrangement2;
            aVar2 = aVar5;
            f11 = f13;
            i12 = i13;
        }
        aVar.S();
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        c.a aVar8 = aVar2;
        SpacerKt.a(SizeKt.i(aVar8, h.l(f11)), aVar, 6);
        c h13 = SizeKt.h(aVar8, 0.0f, 1, null);
        Arrangement.f o12 = arrangement.o(h.l(f12));
        aVar.C(693286680);
        a0 a24 = androidx.compose.foundation.layout.o.a(o12, aVar6.l(), aVar, 6);
        aVar.C(-1323940314);
        int a25 = j0.e.a(aVar, 0);
        k s14 = aVar.s();
        g00.a<ComposeUiNode> a26 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, wz.p> c14 = LayoutKt.c(h13);
        if (!(aVar.k() instanceof d)) {
            j0.e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a26);
        } else {
            aVar.t();
        }
        a a27 = Updater.a(aVar);
        Updater.c(a27, a24, companion.e());
        Updater.c(a27, s14, companion.g());
        p<ComposeUiNode, Integer, wz.p> b14 = companion.b();
        if (a27.f() || !o.d(a27.D(), Integer.valueOf(a25))) {
            a27.u(Integer.valueOf(a25));
            a27.p(Integer.valueOf(a25), b14);
        }
        c14.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        ButtonData.a aVar9 = ButtonData.f40994a;
        ButtonData a28 = aVar9.a();
        c d12 = t.d(uVar, aVar8, 1.0f, false, 2, null);
        aVar.C(1157296644);
        boolean T = aVar.T(aVar3);
        Object D = aVar.D();
        if (T || D == a.f7182a.a()) {
            D = new AdsGeneralDetailsKt$AdsGeneralDetails$1$1$3$1$1(aVar3);
            aVar.u(D);
        }
        aVar.S();
        r0.a b15 = r0.b.b(aVar, -1331353952, true, new AdsGeneralDetailsKt$AdsGeneralDetails$1$1$3$2(str3, i12));
        int i16 = ButtonData.f40995b;
        ButtonsKt.j(D, d12, a28, null, false, false, null, b15, aVar, (i16 << 6) | 12582912, 120);
        ButtonData a29 = aVar9.a();
        yj.d h14 = dk.a.f54291a.a(aVar, dk.a.f54292b).h();
        c d13 = t.d(uVar, aVar8, 1.0f, false, 2, null);
        aVar.C(1157296644);
        boolean T2 = aVar.T(aVar4);
        Object D2 = aVar.D();
        if (T2 || D2 == a.f7182a.a()) {
            D2 = new AdsGeneralDetailsKt$AdsGeneralDetails$1$1$3$3$1(aVar4);
            aVar.u(D2);
        }
        aVar.S();
        ButtonsKt.j(D2, d13, a29, h14, false, false, null, r0.b.b(aVar, -1008315753, true, new AdsGeneralDetailsKt$AdsGeneralDetails$1$1$3$4(str4, i12)), aVar, (i16 << 6) | 12582912 | (yj.d.f76453b << 9), 112);
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        SpacerKt.a(SizeKt.i(aVar8, h.l(f11)), aVar, 6);
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
