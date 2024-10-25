package com.forsale.ui.components.ads;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.buttons.ButtonsKt;
import g00.p;
import g00.q;
import j0.d;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
/* compiled from: AdsGeneralDetails.kt */
/* loaded from: classes3.dex */
final class AdsGeneralDetailsKt$AdNavBarHeader$1$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f42423a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42424b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsGeneralDetailsKt$AdNavBarHeader$1$1(g00.a<wz.p> aVar, int i11) {
        super(2);
        this.f42423a = aVar;
        this.f42424b = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.runtime.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10 */
    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(745207622, i11, -1, "com.forsale.ui.components.ads.AdNavBarHeader.<anonymous>.<anonymous> (AdsGeneralDetails.kt:143)");
        }
        g00.a<wz.p> aVar2 = this.f42423a;
        aVar.C(-483455358);
        c.a aVar3 = androidx.compose.ui.c.f7566a;
        a0 a11 = e.a(Arrangement.f3698a.h(), b.f74009a.k(), aVar, 0);
        aVar.C(-1323940314);
        int a12 = j0.e.a(aVar, 0);
        k s11 = aVar.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a13 = companion.a();
        q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(aVar3);
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
        aVar.C(1157296644);
        boolean T = aVar.T(aVar2);
        Object D = aVar.D();
        if (T || D == a.f7182a.a()) {
            D = new AdsGeneralDetailsKt$AdNavBarHeader$1$1$1$1$1(aVar2);
            aVar.u(D);
        }
        aVar.S();
        ButtonsKt.g(D, null, false, null, null, ComposableSingletons$AdsGeneralDetailsKt.f42462a.a(), aVar, 196608, 30);
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
