package com.forsale.ui.components.cards;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
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
/* compiled from: SeeAllCard.kt */
/* loaded from: classes3.dex */
final class SeeAllCardKt$SeeAllCard$3 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42620a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42621b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f42622c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeeAllCardKt$SeeAllCard$3(g00.a<wz.p> aVar, int i11, String str) {
        super(2);
        this.f42620a = aVar;
        this.f42621b = i11;
        this.f42622c = str;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-91642886, i11, -1, "com.forsale.ui.components.cards.SeeAllCard.<anonymous> (SeeAllCard.kt:29)");
        }
        Arrangement arrangement = Arrangement.f3698a;
        float l11 = h.l(8);
        b.a aVar2 = b.f74009a;
        Arrangement.m q11 = arrangement.q(l11, aVar2.i());
        b.InterfaceC0889b g11 = aVar2.g();
        g00.a<wz.p> aVar3 = this.f42620a;
        int i12 = this.f42621b;
        String str = this.f42622c;
        aVar.C(-483455358);
        c.a aVar4 = androidx.compose.ui.c.f7566a;
        a0 a11 = e.a(q11, g11, aVar, 54);
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(aVar4);
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
        IconKt.a(p1.e.d(gk.a.f56933b, aVar, 0), null, "check all icon", dk.a.f54291a.a(aVar, dk.a.f54292b).f().i(aVar, yj.d.f76453b), false, h.l(40), aVar, 197000, 18);
        ButtonsKt.k(aVar3, null, ButtonData.f40994a.e(), false, false, null, r0.b.b(aVar, 2041077482, true, new SeeAllCardKt$SeeAllCard$3$1$1(str, i12)), aVar, ((i12 >> 6) & 14) | 1572864 | (ButtonData.f40995b << 6), 58);
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
