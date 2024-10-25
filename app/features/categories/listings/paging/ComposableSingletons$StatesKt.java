package com.forsale.app.features.categories.listings.paging;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
/* compiled from: States.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$StatesKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$StatesKt f30903a = new ComposableSingletons$StatesKt();

    /* renamed from: b  reason: collision with root package name */
    public static p<androidx.compose.runtime.a, Integer, wz.p> f30904b = r0.b.c(1947201868, false, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listings.paging.ComposableSingletons$StatesKt$lambda-1$1
        public final void b(androidx.compose.runtime.a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(1947201868, i11, -1, "com.forsale.app.features.categories.listings.paging.ComposableSingletons$StatesKt.lambda-1.<anonymous> (States.kt:67)");
            }
            b.InterfaceC0889b g11 = v0.b.f74009a.g();
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            float f11 = 8;
            androidx.compose.ui.c l11 = PaddingKt.l(aVar2, h.l(f11), h.l(f11), h.l(f11), h.l(f11));
            aVar.C(-483455358);
            a0 a11 = e.a(Arrangement.f3698a.h(), g11, aVar, 48);
            aVar.C(-1323940314);
            int a12 = j0.e.a(aVar, 0);
            k s11 = aVar.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, wz.p> c11 = LayoutKt.c(l11);
            if (!(aVar.k() instanceof d)) {
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
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            f fVar = f.f74891a;
            ProgressIndicatorKt.a(SizeKt.p(aVar2, h.l(28)), dk.a.f54291a.a(aVar, dk.a.f54292b).e().m(aVar, yj.d.f76453b), h.l(3), 0L, 0, aVar, 390, 24);
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
    });

    public final p<androidx.compose.runtime.a, Integer, wz.p> a() {
        return f30904b;
    }
}
