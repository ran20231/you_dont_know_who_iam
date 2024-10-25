package com.forsale.designSystem.layouts;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import e2.h;
import g00.p;
import g00.q;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import v0.b;
import w.t;
import w.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListItem.kt */
/* loaded from: classes3.dex */
public final class ListItemKt$ListItem$2$1$1$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41750a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41751b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41752c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemKt$ListItem$2$1$1$1(q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, int i11, q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar2) {
        super(2);
        this.f41750a = qVar;
        this.f41751b = i11;
        this.f41752c = qVar2;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(388978797, i11, -1, "com.forsale.designSystem.layouts.ListItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ListItem.kt:115)");
        }
        b.c i12 = v0.b.f74009a.i();
        Arrangement.e g11 = Arrangement.f3698a.g();
        q<t, androidx.compose.runtime.a, Integer, wz.p> qVar = this.f41750a;
        int i13 = this.f41751b;
        q<t, androidx.compose.runtime.a, Integer, wz.p> qVar2 = this.f41752c;
        aVar.C(693286680);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        a0 a11 = o.a(g11, i12, aVar, 54);
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar2);
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
        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b11);
        }
        c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        u uVar = u.f74924a;
        qVar.invoke(uVar, aVar, Integer.valueOf(((i13 >> 6) & 112) | 6));
        SpacerKt.a(SizeKt.u(aVar2, h.l(8)), aVar, 6);
        aVar.C(-2105601087);
        if (qVar2 != null) {
            qVar2.invoke(uVar, aVar, Integer.valueOf(((i13 >> 9) & 112) | 6));
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
