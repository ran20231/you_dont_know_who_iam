package com.forsale.ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.TextKt;
import g00.p;
import g00.q;
import j0.d;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
/* compiled from: NavBars.kt */
/* loaded from: classes3.dex */
final class NavBarsKt$NavBarInner$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f42320a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42321b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f42322c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavBarsKt$NavBarInner$1(String str, int i11, String str2) {
        super(2);
        this.f42320a = str;
        this.f42321b = i11;
        this.f42322c = str2;
    }

    public final void b(a aVar, int i11) {
        String str;
        int i12;
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1840949141, i11, -1, "com.forsale.ui.components.NavBarInner.<anonymous> (NavBars.kt:31)");
        }
        String str2 = this.f42320a;
        int i13 = this.f42321b;
        String str3 = this.f42322c;
        aVar.C(-483455358);
        c.a aVar2 = androidx.compose.ui.c.f7566a;
        a0 a11 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), aVar, 0);
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(aVar2);
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
        aVar.C(-1361350433);
        if (str2 != null) {
            dk.a aVar3 = dk.a.f54291a;
            int i14 = dk.a.f54292b;
            str = str3;
            i12 = i13;
            TextKt.a(str2, null, 0, 0, false, 0, 0, null, aVar3.c(aVar, i14).h(), aVar3.a(aVar, i14).f().i(aVar, yj.d.f76453b), 0, aVar, (i13 >> 9) & 14, 0, 1278);
        } else {
            str = str3;
            i12 = i13;
        }
        aVar.S();
        dk.a aVar4 = dk.a.f54291a;
        int i15 = dk.a.f54292b;
        TextKt.a(str, null, 0, 0, false, 0, 0, null, aVar4.c(aVar, i15).q(), aVar4.a(aVar, i15).e().m(aVar, yj.d.f76453b), 0, aVar, (i12 >> 6) & 14, 0, 1278);
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
