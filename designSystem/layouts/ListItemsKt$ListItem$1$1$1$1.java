package com.forsale.designSystem.layouts;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.o;
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
import w.t;
import w.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListItems.kt */
/* loaded from: classes3.dex */
public final class ListItemsKt$ListItem$1$1$1$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q<t, androidx.compose.runtime.a, Integer, wz.p> f41766a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41767b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListItemsKt$ListItem$1$1$1$1(q<? super t, ? super androidx.compose.runtime.a, ? super Integer, wz.p> qVar, int i11) {
        super(2);
        this.f41766a = qVar;
        this.f41767b = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-827199589, i11, -1, "com.forsale.designSystem.layouts.ListItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ListItems.kt:56)");
        }
        q<t, androidx.compose.runtime.a, Integer, wz.p> qVar = this.f41766a;
        int i12 = (this.f41767b << 3) & 7168;
        aVar.C(693286680);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        int i13 = i12 >> 3;
        a0 a11 = o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), aVar, (i13 & 112) | (i13 & 14));
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(aVar2);
        int i14 = ((((i12 << 3) & 112) << 9) & 7168) | 6;
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
        c11.invoke(e1.a(e1.b(aVar)), aVar, Integer.valueOf((i14 >> 3) & 112));
        aVar.C(2058660585);
        qVar.invoke(u.f74924a, aVar, Integer.valueOf(((i12 >> 6) & 112) | 6));
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
