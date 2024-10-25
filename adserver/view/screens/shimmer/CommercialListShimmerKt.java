package com.forsale.adserver.view.screens.shimmer;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import c0.g;
import e2.h;
import g00.l;
import g00.r;
import j0.d1;
import j0.v0;
import kotlin.jvm.internal.o;
import r0.b;
import wz.p;
import y.a;
import y.k;
import y0.e;
import yj.d;
/* compiled from: CommercialListShimmer.kt */
/* loaded from: classes2.dex */
public final class CommercialListShimmerKt {
    public static final void a(boolean z11, a aVar, final int i11, final int i12) {
        boolean z12;
        final int i13;
        int i14;
        final boolean z13;
        final boolean z14;
        a aVar2;
        a h11 = aVar.h(981248512);
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
            aVar2 = h11;
        } else {
            if (i15 != 0) {
                z13 = false;
            } else {
                z13 = z12;
            }
            if (c.I()) {
                c.U(981248512, i13, -1, "com.forsale.adserver.view.screens.shimmer.CommercialListShimmer (CommercialListShimmer.kt:23)");
            }
            a.C0936a c0936a = new a.C0936a(2);
            Arrangement arrangement = Arrangement.f3698a;
            float f11 = 12;
            Arrangement.f o11 = arrangement.o(h.l(f11));
            Arrangement.f o12 = arrangement.o(h.l(f11));
            androidx.compose.ui.c k11 = PaddingKt.k(androidx.compose.ui.c.f7566a, h.l(16), 0.0f, 2, null);
            Boolean valueOf = Boolean.valueOf(z13);
            h11.C(1157296644);
            boolean T = h11.T(valueOf);
            Object D = h11.D();
            if (T || D == androidx.compose.runtime.a.f7182a.a()) {
                D = new l<LazyGridScope, p>() { // from class: com.forsale.adserver.view.screens.shimmer.CommercialListShimmerKt$CommercialListShimmer$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(LazyGridScope LazyVerticalGrid) {
                        o.i(LazyVerticalGrid, "$this$LazyVerticalGrid");
                        final boolean z15 = z13;
                        final int i16 = i13;
                        LazyGridScope.j(LazyVerticalGrid, 6, null, null, null, b.c(1364468587, true, new r<k, Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.adserver.view.screens.shimmer.CommercialListShimmerKt$CommercialListShimmer$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }

                            public final void b(k items, int i17, androidx.compose.runtime.a aVar3, int i18) {
                                o.i(items, "$this$items");
                                if ((i18 & 641) == 128 && aVar3.i()) {
                                    aVar3.L();
                                    return;
                                }
                                if (c.I()) {
                                    c.U(1364468587, i18, -1, "com.forsale.adserver.view.screens.shimmer.CommercialListShimmer.<anonymous>.<anonymous>.<anonymous> (CommercialListShimmer.kt:32)");
                                }
                                BoxKt.a(com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(e.a(SizeKt.i(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), h.l(256)), g.c(h.l(8))), dk.a.f54291a.a(aVar3, dk.a.f54292b).e().h(aVar3, d.f76453b), null, 2, null), z15, null, 0L, 0L, aVar3, (i16 << 3) & 112, 14), aVar3, 0);
                                if (c.I()) {
                                    c.T();
                                }
                            }

                            @Override // g00.r
                            public /* bridge */ /* synthetic */ p d(k kVar, Integer num, androidx.compose.runtime.a aVar3, Integer num2) {
                                b(kVar, num.intValue(), aVar3, num2.intValue());
                                return p.f75480a;
                            }
                        }), 14, null);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(LazyGridScope lazyGridScope) {
                        b(lazyGridScope);
                        return p.f75480a;
                    }
                };
                h11.u(D);
            }
            h11.S();
            z14 = z13;
            aVar2 = h11;
            LazyGridDslKt.b(c0936a, k11, null, null, false, o12, o11, null, false, (l) D, h11, 102432816, 156);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = aVar2.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.adserver.view.screens.shimmer.CommercialListShimmerKt$CommercialListShimmer$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i16) {
                    CommercialListShimmerKt.a(z14, aVar3, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}
