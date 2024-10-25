package com.forsale.designSystem.notificationsystem;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.dividers.DividersKt;
import g00.p;
import g00.q;
import j0.d;
import j0.e;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import v0.b;
import w.t;
import w.u;
/* compiled from: InlineAlert.kt */
/* loaded from: classes3.dex */
final class InlineAlertKt$InlineAlert$1$1$3 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t f41933a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ InlineAlertState f41934b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41935c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41936d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InlineAlertKt$InlineAlert$1$1$3(t tVar, InlineAlertState inlineAlertState, int i11, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar) {
        super(2);
        this.f41933a = tVar;
        this.f41934b = inlineAlertState;
        this.f41935c = i11;
        this.f41936d = pVar;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1089823355, i11, -1, "com.forsale.designSystem.notificationsystem.InlineAlert.<anonymous>.<anonymous>.<anonymous> (InlineAlert.kt:139)");
        }
        t tVar = this.f41933a;
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        b.a aVar3 = b.f74009a;
        androidx.compose.ui.c c11 = tVar.c(aVar2, aVar3.i());
        b.c i12 = aVar3.i();
        Arrangement.f b11 = Arrangement.f3698a.b();
        InlineAlertState inlineAlertState = this.f41934b;
        int i13 = this.f41935c;
        p<androidx.compose.runtime.a, Integer, wz.p> pVar = this.f41936d;
        aVar.C(693286680);
        a0 a11 = o.a(b11, i12, aVar, 54);
        aVar.C(-1323940314);
        int a12 = e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c12 = LayoutKt.c(c11);
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
        p<ComposeUiNode, Integer, wz.p> b12 = companion.b();
        if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
            a14.u(Integer.valueOf(a12));
            a14.p(Integer.valueOf(a12), b12);
        }
        c12.invoke(e1.a(e1.b(aVar)), aVar, 0);
        aVar.C(2058660585);
        u uVar = u.f74924a;
        DividersKt.b(null, 0.0f, 0.0f, inlineAlertState.d(aVar, (i13 >> 3) & 14), aVar, 0, 7);
        pVar.invoke(aVar, Integer.valueOf((i13 >> 21) & 14));
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
