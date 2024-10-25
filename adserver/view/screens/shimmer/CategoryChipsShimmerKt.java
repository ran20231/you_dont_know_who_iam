package com.forsale.adserver.view.screens.shimmer;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import c0.g;
import com.forsale.designSystem.dividers.DividersKt;
import e2.h;
import g00.l;
import g00.q;
import g00.r;
import j0.d;
import j0.d1;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import v0.b;
import w.f;
import wz.p;
/* compiled from: CategoryChipsShimmer.kt */
/* loaded from: classes2.dex */
public final class CategoryChipsShimmerKt {
    public static final void a(boolean z11, a aVar, final int i11, final int i12) {
        boolean z12;
        final int i13;
        int i14;
        final boolean z13;
        final boolean z14;
        a h11 = aVar.h(131567416);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
            z12 = z11;
        } else if ((i11 & 14) == 0) {
            z12 = z11;
            if (h11.a(z12)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            z12 = z11;
            i13 = i11;
        }
        if ((i13 & 11) == 2 && h11.i()) {
            h11.L();
            z14 = z12;
        } else {
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (c.I()) {
                c.U(131567416, i13, -1, "com.forsale.adserver.view.screens.shimmer.CategoryChipsShimmer (CategoryChipsShimmer.kt:24)");
            }
            float f11 = 8;
            androidx.compose.ui.c m11 = PaddingKt.m(androidx.compose.ui.c.f7566a, h.l(16), h.l(f11), 0.0f, 0.0f, 12, null);
            h11.C(-483455358);
            Arrangement arrangement = Arrangement.f3698a;
            a0 a11 = e.a(arrangement.h(), b.f74009a.k(), h11, 0);
            h11.C(-1323940314);
            int a12 = j0.e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            g00.a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, a, Integer, p> c11 = LayoutKt.c(m11);
            if (!(h11.k() instanceof d)) {
                j0.e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a13);
            } else {
                h11.t();
            }
            a a14 = Updater.a(h11);
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
            Arrangement.f o11 = arrangement.o(h.l(f11));
            Boolean valueOf = Boolean.valueOf(z13);
            h11.C(1157296644);
            boolean T = h11.T(valueOf);
            Object D = h11.D();
            if (T || D == a.f7182a.a()) {
                D = new l<LazyListScope, p>() { // from class: com.forsale.adserver.view.screens.shimmer.CategoryChipsShimmerKt$CategoryChipsShimmer$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(LazyListScope LazyRow) {
                        o.i(LazyRow, "$this$LazyRow");
                        final boolean z15 = z13;
                        final int i16 = i13;
                        LazyListScope.e(LazyRow, 6, null, null, r0.b.c(-1683675667, true, new r<x.a, Integer, a, Integer, p>() { // from class: com.forsale.adserver.view.screens.shimmer.CategoryChipsShimmerKt$CategoryChipsShimmer$1$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            public final void b(x.a items, int i17, a aVar2, int i18) {
                                o.i(items, "$this$items");
                                if ((i18 & 641) == 128 && aVar2.i()) {
                                    aVar2.L();
                                    return;
                                }
                                if (c.I()) {
                                    c.U(-1683675667, i18, -1, "com.forsale.adserver.view.screens.shimmer.CategoryChipsShimmer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CategoryChipsShimmer.kt:30)");
                                }
                                BoxKt.a(com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(y0.e.a(SizeKt.i(SizeKt.u(androidx.compose.ui.c.f7566a, h.l(66)), h.l(32)), g.c(h.l(24))), dk.a.f54291a.a(aVar2, dk.a.f54292b).e().h(aVar2, yj.d.f76453b), null, 2, null), z15, null, 0L, 0L, aVar2, (i16 << 3) & 112, 14), aVar2, 0);
                                if (c.I()) {
                                    c.T();
                                }
                            }

                            @Override // g00.r
                            public /* bridge */ /* synthetic */ p d(x.a aVar2, Integer num, a aVar3, Integer num2) {
                                b(aVar2, num.intValue(), aVar3, num2.intValue());
                                return p.f75480a;
                            }
                        }), 6, null);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                        b(lazyListScope);
                        return p.f75480a;
                    }
                };
                h11.u(D);
            }
            h11.S();
            z14 = z13;
            LazyDslKt.b(null, null, null, false, o11, null, null, false, (l) D, h11, 24576, 239);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            DividersKt.a(null, 0.0f, 0L, h11, 0, 7);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.adserver.view.screens.shimmer.CategoryChipsShimmerKt$CategoryChipsShimmer$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i16) {
                    CategoryChipsShimmerKt.a(z14, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
