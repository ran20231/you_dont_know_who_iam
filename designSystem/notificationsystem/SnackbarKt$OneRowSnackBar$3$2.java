package com.forsale.designSystem.notificationsystem;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.n;
import androidx.compose.ui.node.ComposeUiNode;
import g00.p;
import g00.q;
import j0.d;
import j0.e;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import v0.b;
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
final class SnackbarKt$OneRowSnackBar$3$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ak.a f41973a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$OneRowSnackBar$3$2(ak.a aVar) {
        super(2);
        this.f41973a = aVar;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(182879082, i11, -1, "com.forsale.designSystem.notificationsystem.OneRowSnackBar.<anonymous>.<anonymous> (Snackbar.kt:118)");
        }
        androidx.compose.ui.c b11 = n.b(androidx.compose.ui.c.f7566a, "action");
        ak.a aVar2 = this.f41973a;
        aVar.C(733328855);
        a0 g11 = BoxKt.g(b.f74009a.o(), false, aVar, 0);
        aVar.C(-1323940314);
        int a11 = e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(b11);
        if (!(aVar.k() instanceof d)) {
            e.c();
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
        p<androidx.compose.runtime.a, Integer, wz.p> f11 = aVar2.f();
        aVar.C(880815780);
        if (f11 != null) {
            f11.invoke(aVar, 0);
        }
        aVar.S();
        aVar.S();
        aVar.w();
        aVar.S();
        aVar.S();
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
