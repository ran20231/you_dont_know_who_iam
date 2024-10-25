package com.forsale.app.features.more.newprofile.followerandfollowing;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import com.forsale.designSystem.dividers.DividersKt;
import e2.h;
import g00.q;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import w.t;
import w.u;
import wz.p;
/* compiled from: FollowerAndFollowingItemShimmer.kt */
/* loaded from: classes2.dex */
public final class FollowerAndFollowingItemShimmerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final boolean z11, androidx.compose.runtime.a aVar, final int i11) {
        int i12;
        int i13;
        androidx.compose.runtime.a h11 = aVar.h(-1780697579);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(-1780697579, i12, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.FollowerAndFollowingItemShimmer (FollowerAndFollowingItemShimmer.kt:40)");
            }
            Arrangement arrangement = Arrangement.f3698a;
            Arrangement.f o11 = arrangement.o(h.l(16));
            h11.C(-483455358);
            c.a aVar2 = androidx.compose.ui.c.f7566a;
            b.a aVar3 = b.f74009a;
            a0 a11 = e.a(o11, aVar3.k(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a13);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a14 = Updater.a(h11);
            Updater.c(a14, a11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            float f11 = 12;
            Arrangement.f o12 = arrangement.o(h.l(f11));
            b.c i14 = aVar3.i();
            h11.C(693286680);
            a0 a15 = androidx.compose.foundation.layout.o.a(o12, i14, h11, 54);
            h11.C(-1323940314);
            int a16 = j0.e.a(h11, 0);
            k s12 = h11.s();
            g00.a<ComposeUiNode> a17 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(aVar2);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a17);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a18 = Updater.a(h11);
            Updater.c(a18, a15, companion.e());
            Updater.c(a18, s12, companion.g());
            g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
            if (a18.f() || !o.d(a18.D(), Integer.valueOf(a16))) {
                a18.u(Integer.valueOf(a16));
                a18.p(Integer.valueOf(a16), b12);
            }
            c12.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            float f12 = 48;
            androidx.compose.ui.c a19 = y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(f12)), h.l(f12)), g.f());
            dk.a aVar4 = dk.a.f54291a;
            int i15 = dk.a.f54292b;
            yj.d e11 = aVar4.a(h11, i15).e();
            int i16 = yj.d.f76453b;
            int i17 = (i12 << 3) & 112;
            BoxKt.a(com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(a19, e11.h(h11, i16), null, 2, null), z11, null, 0L, 0L, h11, i17, 14), h11, 0);
            float f13 = 4;
            Arrangement.f o13 = arrangement.o(h.l(f13));
            androidx.compose.ui.c d11 = t.d(uVar, aVar2, 1.0f, false, 2, null);
            h11.C(-483455358);
            a0 a21 = e.a(o13, aVar3.k(), h11, 6);
            h11.C(-1323940314);
            int a22 = j0.e.a(h11, 0);
            k s13 = h11.s();
            g00.a<ComposeUiNode> a23 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c13 = LayoutKt.c(d11);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a23);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a24 = Updater.a(h11);
            Updater.c(a24, a21, companion.e());
            Updater.c(a24, s13, companion.g());
            g00.p<ComposeUiNode, Integer, p> b13 = companion.b();
            if (a24.f() || !o.d(a24.D(), Integer.valueOf(a22))) {
                a24.u(Integer.valueOf(a22));
                a24.p(Integer.valueOf(a22), b13);
            }
            c13.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            BoxKt.a(com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(140)), h.l(21)), g.c(h.l(f13))), aVar4.a(h11, i15).e().h(h11, i16), null, 2, null), z11, null, 0L, 0L, h11, i17, 14), h11, 0);
            BoxKt.a(com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(172)), h.l(f11)), g.c(h.l(f13))), aVar4.a(h11, i15).e().h(h11, i16), null, 2, null), z11, null, 0L, 0L, h11, i17, 14), h11, 0);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            BoxKt.a(com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(aVar2, h.l(91)), h.l(32)), g.c(h.l(f13))), aVar4.a(h11, i15).e().h(h11, i16), null, 2, null), z11, null, 0L, 0L, h11, i17, 14), h11, 0);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            DividersKt.a(null, 0.0f, 0L, h11, 0, 7);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowerAndFollowingItemShimmerKt$FollowerAndFollowingItemShimmer$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar5, int i18) {
                    FollowerAndFollowingItemShimmerKt.a(z11, aVar5, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar5, Integer num) {
                    b(aVar5, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(final boolean z11, androidx.compose.runtime.a aVar, final int i11, final int i12) {
        int i13;
        int i14;
        androidx.compose.runtime.a h11 = aVar.h(1125509258);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 11) == 2 && h11.i()) {
            h11.L();
        } else {
            if (i15 != 0) {
                z11 = false;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1125509258, i13, -1, "com.forsale.app.features.more.newprofile.followerandfollowing.LoadingShimmer (FollowerAndFollowingItemShimmer.kt:28)");
            }
            float f11 = 16;
            androidx.compose.ui.c i16 = PaddingKt.i(androidx.compose.ui.c.f7566a, h.l(f11));
            Arrangement.f o11 = Arrangement.f3698a.o(h.l(f11));
            h11.C(-483455358);
            a0 a11 = e.a(o11, b.f74009a.k(), h11, 6);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(i16);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a13);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a14 = Updater.a(h11);
            Updater.c(a14, a11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            f fVar = f.f74891a;
            h11.C(-370218205);
            for (int i17 = 0; i17 < 9; i17++) {
                a(z11, h11, i13 & 14);
            }
            h11.S();
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.FollowerAndFollowingItemShimmerKt$LoadingShimmer$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i18) {
                    FollowerAndFollowingItemShimmerKt.b(z11, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
