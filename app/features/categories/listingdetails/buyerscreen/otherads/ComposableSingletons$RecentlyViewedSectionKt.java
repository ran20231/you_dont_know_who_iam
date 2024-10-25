package com.forsale.app.features.categories.listingdetails.buyerscreen.otherads;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.o;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.iconography.IconKt;
import e2.h;
import g00.p;
import g00.q;
import j0.e;
import j0.e1;
import j0.k;
import p1.g;
import r0.b;
import t9.y0;
import v0.b;
import w.u;
import yj.d;
/* compiled from: RecentlyViewedSection.kt */
/* loaded from: classes2.dex */
public final class ComposableSingletons$RecentlyViewedSectionKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$RecentlyViewedSectionKt f26416a = new ComposableSingletons$RecentlyViewedSectionKt();

    /* renamed from: b  reason: collision with root package name */
    public static p<a, Integer, wz.p> f26417b = b.c(339267188, false, new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.ComposableSingletons$RecentlyViewedSectionKt$lambda-1$1
        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(339267188, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.ComposableSingletons$RecentlyViewedSectionKt.lambda-1.<anonymous> (RecentlyViewedSection.kt:47)");
            }
            String b11 = g.b(y0.f70446f1, aVar, 0);
            dk.a aVar2 = dk.a.f54291a;
            int i12 = dk.a.f54292b;
            TextKt.a(b11, null, 0, 0, false, 0, 0, null, aVar2.c(aVar, i12).l(), aVar2.a(aVar, i12).e().m(aVar, d.f76453b), 0, aVar, 0, 0, 1278);
            if (c.I()) {
                c.T();
            }
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
            b(aVar, num.intValue());
            return wz.p.f75480a;
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public static p<a, Integer, wz.p> f26418c = b.c(38723986, false, new p<a, Integer, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.ComposableSingletons$RecentlyViewedSectionKt$lambda-2$1
        public final void b(a aVar, int i11) {
            if ((i11 & 11) == 2 && aVar.i()) {
                aVar.L();
                return;
            }
            if (c.I()) {
                c.U(38723986, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.otherads.ComposableSingletons$RecentlyViewedSectionKt.lambda-2.<anonymous> (RecentlyViewedSection.kt:57)");
            }
            b.c i12 = v0.b.f74009a.i();
            aVar.C(693286680);
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            a0 a11 = o.a(Arrangement.f3698a.g(), i12, aVar, 48);
            aVar.C(-1323940314);
            int a12 = e.a(aVar, 0);
            k s11 = aVar.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, wz.p> c11 = LayoutKt.c(aVar2);
            if (!(aVar.k() instanceof j0.d)) {
                e.c();
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
            if (a14.f() || !kotlin.jvm.internal.o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(aVar)), aVar, 0);
            aVar.C(2058660585);
            u uVar = u.f74924a;
            String b12 = g.b(y0.f70497i1, aVar, 0);
            dk.a aVar3 = dk.a.f54291a;
            int i13 = dk.a.f54292b;
            androidx.compose.ui.text.a0 f11 = aVar3.c(aVar, i13).f();
            d f12 = aVar3.a(aVar, i13).f();
            int i14 = d.f76453b;
            TextKt.a(b12, null, 0, 0, false, 0, 0, null, f11, f12.i(aVar, i14), 0, aVar, 0, 0, 1278);
            IconKt.a(p1.e.d(sj.d.f68676m, aVar, 0), null, null, aVar3.a(aVar, i13).f().i(aVar, i14), false, h.l(20), aVar, 197000, 18);
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
        return f26417b;
    }

    public final p<a, Integer, wz.p> b() {
        return f26418c;
    }
}
