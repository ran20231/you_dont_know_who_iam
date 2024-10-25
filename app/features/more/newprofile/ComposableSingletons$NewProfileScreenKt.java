package com.forsale.app.features.more.newprofile;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.badges.BadgesKt;
import com.forsale.designSystem.iconography.IconKt;
import e2.h;
import g00.p;
import g00.q;
import j0.d;
import j0.e;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.o;
import r0.b;
import t9.q0;
import v0.b;
import v0.i;
/* compiled from: NewProfileScreen.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$NewProfileScreenKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$NewProfileScreenKt f32056a = new ComposableSingletons$NewProfileScreenKt();

    /* renamed from: b  reason: collision with root package name */
    public static p<a, Integer, wz.p> f32057b = b.c(1693302961, false, new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.more.newprofile.ComposableSingletons$NewProfileScreenKt$lambda-1$1
        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(1693302961, i11, -1, "com.forsale.app.features.more.newprofile.ComposableSingletons$NewProfileScreenKt.lambda-1.<anonymous> (NewProfileScreen.kt:62)");
            }
            b.a aVar2 = v0.b.f74009a;
            v0.b e11 = aVar2.e();
            aVar.C(733328855);
            c.a aVar3 = androidx.compose.ui.c.f7566a;
            a0 g11 = BoxKt.g(e11, false, aVar, 6);
            aVar.C(-1323940314);
            int a11 = e.a(aVar, 0);
            k s11 = aVar.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a12 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(aVar3);
            if (!(aVar.k() instanceof d)) {
                e.c();
            }
            aVar.I();
            if (aVar.f()) {
                aVar.y(a12);
            } else {
                aVar.t();
            }
            a a13 = Updater.a(aVar);
            Updater.c(a13, g11, companion.e());
            Updater.c(a13, s11, companion.g());
            p<ComposeUiNode, Integer, wz.p> b11 = companion.b();
            if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.p(Integer.valueOf(a11), b11);
            }
            c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
            IconKt.a(p1.e.d(q0.J2, aVar, 0), null, null, 0L, false, 0.0f, aVar, 8, 62);
            float f11 = 2;
            BadgesKt.a(boxScopeInstance.e(i.a(PaddingKt.m(aVar3, 0.0f, h.l(f11), h.l(f11), 0.0f, 9, null), 2.0f), aVar2.n()), dk.a.f54291a.a(aVar, dk.a.f54292b).d().i(aVar, yj.d.f76453b), 0.0f, aVar, 0, 4);
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
    });

    public final p<a, Integer, wz.p> a() {
        return f32057b;
    }
}
