package com.forsale.designSystem.notificationsystem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.typography.ValuesKt;
import g00.p;
import g00.q;
import j0.d;
import j0.e;
import j0.e1;
import j0.k;
import j0.t0;
import kotlin.jvm.internal.Lambda;
import v0.b;
import w.u;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Snackbar.kt */
/* loaded from: classes3.dex */
public final class SnackbarKt$Snackbar$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ak.a f41976a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41977b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarKt$Snackbar$1(ak.a aVar, int i11) {
        super(2);
        this.f41976a = aVar;
        this.f41977b = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        float f11;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1395860200, i11, -1, "com.forsale.designSystem.notificationsystem.Snackbar.<anonymous> (Snackbar.kt:43)");
        }
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        f11 = SnackbarKt.f41960b;
        androidx.compose.ui.c m11 = PaddingKt.m(aVar2, f11, 0.0f, 0.0f, 0.0f, 14, null);
        b.c i12 = b.f74009a.i();
        ak.a aVar3 = this.f41976a;
        int i13 = this.f41977b;
        aVar.C(693286680);
        a0 a11 = o.a(Arrangement.f3698a.g(), i12, aVar, 48);
        aVar.C(-1323940314);
        int a12 = e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(m11);
        if (!(aVar.k() instanceof d)) {
            e.c();
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
        CompositionLocalKt.b(new t0[]{ValuesKt.c().c(dk.a.f54291a.c(aVar, 6).c()), TextKt.i().c(2)}, r0.b.b(aVar, -2147112588, true, new SnackbarKt$Snackbar$1$1$1(aVar3, i13)), aVar, 56);
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
