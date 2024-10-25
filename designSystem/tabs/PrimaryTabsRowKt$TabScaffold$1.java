package com.forsale.designSystem.tabs;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.CustomIndication;
import g00.p;
import g00.q;
import j0.d;
import j0.e1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import q1.i;
import v.j;
import v.k;
import v0.b;
import w.e;
import w.f;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrimaryTabsRow.kt */
/* loaded from: classes3.dex */
public final class PrimaryTabsRowKt$TabScaffold$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f42117a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f42118b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42119c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ q<e, a, Integer, wz.p> f42120d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42121e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PrimaryTabsRowKt$TabScaffold$1(boolean z11, c cVar, g00.a<wz.p> aVar, q<? super e, ? super a, ? super Integer, wz.p> qVar, int i11) {
        super(2);
        this.f42117a = z11;
        this.f42118b = cVar;
        this.f42119c = aVar;
        this.f42120d = qVar;
        this.f42121e = i11;
    }

    public final void b(a aVar, int i11) {
        long j11;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-696143981, i11, -1, "com.forsale.designSystem.tabs.TabScaffold.<anonymous> (PrimaryTabsRow.kt:176)");
        }
        int g11 = i.f66253b.g();
        k a11 = j.a();
        if (this.f42117a) {
            aVar.C(-938117533);
            j11 = dk.a.f54291a.a(aVar, 6).f().i(aVar, 0);
            aVar.S();
        } else {
            aVar.C(-938117461);
            j11 = dk.a.f54291a.a(aVar, 6).e().j(aVar, 0);
            aVar.S();
        }
        c a12 = SelectableKt.a(this.f42118b, this.f42117a, a11, new CustomIndication(j11, a1.a.f56a.a(), null, new CustomIndication.c(0.16f, 0.08f, 0.0f, 0.0f, 12, null), 4, null), true, i.h(g11), this.f42119c);
        b.InterfaceC0889b g12 = b.f74009a.g();
        Arrangement.f b11 = Arrangement.f3698a.b();
        q<e, a, Integer, wz.p> qVar = this.f42120d;
        int i12 = (this.f42121e & 7168) | 432;
        aVar.C(-483455358);
        int i13 = i12 >> 3;
        a0 a13 = androidx.compose.foundation.layout.e.a(b11, g12, aVar, (i13 & 112) | (i13 & 14));
        aVar.C(-1323940314);
        int a14 = j0.e.a(aVar, 0);
        j0.k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a15 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(a12);
        int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
        if (!(aVar.k() instanceof d)) {
            j0.e.c();
        }
        aVar.I();
        if (aVar.f()) {
            aVar.y(a15);
        } else {
            aVar.t();
        }
        a a16 = Updater.a(aVar);
        Updater.c(a16, a13, companion.e());
        Updater.c(a16, s11, companion.g());
        p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
        if (a16.f() || !o.d(a16.D(), Integer.valueOf(a14))) {
            a16.u(Integer.valueOf(a14));
            a16.p(Integer.valueOf(a14), b12);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, Integer.valueOf((i14 >> 3) & 112));
        aVar.C(2058660585);
        qVar.invoke(f.f74891a, aVar, Integer.valueOf(((i12 >> 6) & 112) | 6));
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
