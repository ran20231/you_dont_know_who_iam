package com.forsale.designSystem.notificationsystem;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import b1.t1;
import c0.g;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.typography.ValuesKt;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.e;
import j0.e1;
import j0.k;
import j0.s0;
import j0.t0;
import kotlin.jvm.internal.Lambda;
import v0.b;
import w.f;
import w.t;
import w.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InlineAlert.kt */
/* loaded from: classes3.dex */
public final class InlineAlertKt$InlineAlert$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f41915a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ InlineAlertState f41916b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41917c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41918d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41919e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41920f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41921g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41922h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41923i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InlineAlertKt$InlineAlert$1(c cVar, InlineAlertState inlineAlertState, int i11, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar3, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar4, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar5, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar6) {
        super(2);
        this.f41915a = cVar;
        this.f41916b = inlineAlertState;
        this.f41917c = i11;
        this.f41918d = pVar;
        this.f41919e = pVar2;
        this.f41920f = pVar3;
        this.f41921g = pVar4;
        this.f41922h = pVar5;
        this.f41923i = pVar6;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        float f11;
        float f12;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar2;
        float a11;
        float f13;
        int i12;
        float f14;
        float f15;
        float f16;
        float f17;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1402241649, i11, -1, "com.forsale.designSystem.notificationsystem.InlineAlert.<anonymous> (InlineAlert.kt:53)");
        }
        c g11 = InlineAlertKt.g(BackgroundKt.a(SizeKt.h(this.f41915a, 0.0f, 1, null), this.f41916b.a(aVar, (this.f41917c >> 3) & 14), g.c(h.l(8))), (LayoutDirection) aVar.q(CompositionLocalsKt.j()), 0.0f, this.f41916b.c(aVar, (this.f41917c >> 3) & 14), 2, null);
        f11 = InlineAlertKt.f41911a;
        f12 = InlineAlertKt.f41911a;
        c m11 = PaddingKt.m(g11, 0.0f, f11, this.f41918d == null ? InlineAlertKt.f41913c : InlineAlertKt.f41914d, f12, 1, null);
        Arrangement arrangement = Arrangement.f3698a;
        Arrangement.f e11 = arrangement.e();
        p<androidx.compose.runtime.a, Integer, wz.p> pVar3 = this.f41919e;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar4 = this.f41918d;
        InlineAlertState inlineAlertState = this.f41916b;
        int i13 = this.f41917c;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar5 = this.f41920f;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar6 = this.f41921g;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar7 = this.f41922h;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar8 = this.f41923i;
        aVar.C(693286680);
        b.a aVar2 = b.f74009a;
        a0 a12 = o.a(e11, aVar2.l(), aVar, 6);
        aVar.C(-1323940314);
        int a13 = e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a14 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(m11);
        if (!(aVar.k() instanceof d)) {
            e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a14);
        } else {
            aVar.t();
        }
        androidx.compose.runtime.a a15 = Updater.a(aVar);
        Updater.c(a15, a12, companion.e());
        Updater.c(a15, s11, companion.g());
        p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
        if (a15.f() || !kotlin.jvm.internal.o.d(a15.D(), Integer.valueOf(a13))) {
            a15.u(Integer.valueOf(a13));
            a15.p(Integer.valueOf(a13), b11);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        u uVar = u.f74924a;
        aVar.C(-213122987);
        if (pVar3 != null) {
            c.a aVar3 = c.f7566a;
            f16 = InlineAlertKt.f41912b;
            f17 = InlineAlertKt.f41911a;
            c m12 = PaddingKt.m(aVar3, f16, 0.0f, f17, 0.0f, 10, null);
            aVar.C(-483455358);
            a0 a16 = androidx.compose.foundation.layout.e.a(arrangement.h(), aVar2.k(), aVar, 0);
            aVar.C(-1323940314);
            int a17 = e.a(aVar, 0);
            k s12 = aVar.s();
            pVar = pVar4;
            g00.a<ComposeUiNode> a18 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(m12);
            pVar2 = pVar8;
            if (!(aVar.k() instanceof d)) {
                e.c();
            }
            aVar.I();
            if (aVar.f()) {
                aVar.y(a18);
            } else {
                aVar.t();
            }
            androidx.compose.runtime.a a19 = Updater.a(aVar);
            Updater.c(a19, a16, companion.e());
            Updater.c(a19, s12, companion.g());
            p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
            if (a19.f() || !kotlin.jvm.internal.o.d(a19.D(), Integer.valueOf(a17))) {
                a19.u(Integer.valueOf(a17));
                a19.p(Integer.valueOf(a17), b12);
            }
            c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            f fVar = f.f74891a;
            pVar3.invoke(aVar, Integer.valueOf((i13 >> 6) & 14));
            aVar.S();
            aVar.w();
            aVar.S();
            aVar.S();
        } else {
            pVar = pVar4;
            pVar2 = pVar8;
        }
        aVar.S();
        b.InterfaceC0889b k11 = aVar2.k();
        c.a aVar4 = c.f7566a;
        if (pVar3 == null) {
            a11 = InlineAlertKt.f41912b;
        } else {
            a11 = h.f54555b.a();
        }
        f13 = InlineAlertKt.f41911a;
        c d11 = t.d(uVar, PaddingKt.m(aVar4, a11, 0.0f, f13, 0.0f, 10, null), 0.8f, false, 2, null);
        aVar.C(-483455358);
        a0 a21 = androidx.compose.foundation.layout.e.a(arrangement.h(), k11, aVar, 48);
        aVar.C(-1323940314);
        int a22 = e.a(aVar, 0);
        k s13 = aVar.s();
        g00.a<ComposeUiNode> a23 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c13 = LayoutKt.c(d11);
        if (!(aVar.k() instanceof d)) {
            e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a23);
        } else {
            aVar.t();
        }
        androidx.compose.runtime.a a24 = Updater.a(aVar);
        Updater.c(a24, a21, companion.e());
        Updater.c(a24, s13, companion.g());
        p<ComposeUiNode, Integer, wz.p> b13 = companion.b();
        if (a24.f() || !kotlin.jvm.internal.o.d(a24.D(), Integer.valueOf(a22))) {
            a24.u(Integer.valueOf(a22));
            a24.p(Integer.valueOf(a22), b13);
        }
        c13.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        f fVar2 = f.f74891a;
        aVar.C(2110996979);
        if (pVar5 != null) {
            s0<androidx.compose.ui.text.a0> c14 = ValuesKt.c();
            dk.a aVar5 = dk.a.f54291a;
            CompositionLocalKt.b(new t0[]{c14.c(aVar5.c(aVar, 6).c()), com.forsale.designSystem.colors.ValuesKt.d().c(t1.g(aVar5.a(aVar, 6).e().m(aVar, 0))), TextKt.i().c(1)}, r0.b.b(aVar, 507533060, true, new InlineAlertKt$InlineAlert$1$1$2$1(pVar5, i13)), aVar, 56);
            f15 = InlineAlertKt.f41913c;
            i12 = 6;
            SpacerKt.a(SizeKt.i(aVar4, f15), aVar, 6);
        } else {
            i12 = 6;
        }
        aVar.S();
        s0<androidx.compose.ui.text.a0> c15 = ValuesKt.c();
        dk.a aVar6 = dk.a.f54291a;
        CompositionLocalKt.b(new t0[]{c15.c(aVar6.c(aVar, i12).d()), com.forsale.designSystem.colors.ValuesKt.d().c(t1.g(aVar6.a(aVar, i12).e().m(aVar, 0))), TextKt.i().c(2)}, r0.b.b(aVar, -1627827159, true, new InlineAlertKt$InlineAlert$1$1$2$2(pVar7, i13)), aVar, 56);
        aVar.C(-213121366);
        if (pVar6 != null) {
            f14 = InlineAlertKt.f41911a;
            SpacerKt.a(SizeKt.i(aVar4, f14), aVar, 6);
            CompositionLocalKt.b(new t0[]{ValuesKt.c().c(aVar6.c(aVar, 6).f()), com.forsale.designSystem.colors.ValuesKt.d().c(t1.g(inlineAlertState.c(aVar, (i13 >> 3) & 14))), TextKt.i().c(1)}, r0.b.b(aVar, -1516689157, true, new InlineAlertKt$InlineAlert$1$1$2$3(inlineAlertState, pVar6, i13, pVar2)), aVar, 56);
        }
        aVar.S();
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        aVar.C(466396074);
        if (pVar != null) {
            CompositionLocalKt.a(com.forsale.designSystem.colors.ValuesKt.d().c(t1.g(inlineAlertState.c(aVar, (i13 >> 3) & 14))), r0.b.b(aVar, -1089823355, true, new InlineAlertKt$InlineAlert$1$1$3(uVar, inlineAlertState, i13, pVar)), aVar, t0.f59917d | 0 | 48);
        }
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
