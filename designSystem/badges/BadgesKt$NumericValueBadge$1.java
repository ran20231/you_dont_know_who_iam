package com.forsale.designSystem.badges;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.e;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import v0.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Badges.kt */
/* loaded from: classes3.dex */
public final class BadgesKt$NumericValueBadge$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f40772a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f40773b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<a, Integer, wz.p> f40774c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f40775d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BadgesKt$NumericValueBadge$1(c cVar, long j11, p<? super a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f40772a = cVar;
        this.f40773b = j11;
        this.f40774c = pVar;
        this.f40775d = i11;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1237640749, i11, -1, "com.forsale.designSystem.badges.NumericValueBadge.<anonymous> (Badges.kt:47)");
        }
        uj.a aVar2 = uj.a.f73647a;
        float d11 = aVar2.d();
        float c11 = aVar2.c();
        c k11 = PaddingKt.k(BackgroundKt.a(SizeKt.s(this.f40772a, d11, aVar2.b(), c11, aVar2.b()), this.f40773b, g.c(h.l(8))), h.l(4), 0.0f, 2, null);
        b e11 = b.f74009a.e();
        p<a, Integer, wz.p> pVar = this.f40774c;
        int i12 = this.f40775d;
        aVar.C(733328855);
        a0 g11 = BoxKt.g(e11, false, aVar, 6);
        aVar.C(-1323940314);
        int a11 = e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, wz.p> c12 = LayoutKt.c(k11);
        if (!(aVar.k() instanceof d)) {
            e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a12);
        } else {
            aVar.t();
        }
        a a13 = Updater.a(aVar);
        Updater.c(a13, g11, companion.e());
        Updater.c(a13, s11, companion.g());
        p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b11);
        }
        c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        pVar.invoke(aVar, Integer.valueOf((i12 >> 6) & 14));
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
