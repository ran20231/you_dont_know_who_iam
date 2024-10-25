package com.forsale.adserver.view.screens.shimmer;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import c0.g;
import e2.h;
import g00.p;
import j0.d1;
import j0.v0;
import y0.e;
import yj.d;
/* compiled from: GamShimmer.kt */
/* loaded from: classes2.dex */
public final class GamShimmerKt {
    public static final void a(final boolean z11, a aVar, final int i11, final int i12) {
        int i13;
        int i14;
        a h11 = aVar.h(1498444216);
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
            if (c.I()) {
                c.U(1498444216, i13, -1, "com.forsale.adserver.view.screens.shimmer.GamShimmer (GamShimmer.kt:19)");
            }
            BoxKt.a(com.forsale.ui.components.skeleton.a.a(BackgroundKt.b(e.a(SizeKt.i(SizeKt.u(androidx.compose.ui.c.f7566a, h.l(320)), h.l(50)), g.c(h.l(8))), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, d.f76453b), null, 2, null), z11, null, 0L, 0L, h11, (i13 << 3) & 112, 14), h11, 0);
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<a, Integer, wz.p>() { // from class: com.forsale.adserver.view.screens.shimmer.GamShimmerKt$GamShimmer$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(a aVar2, int i16) {
                    GamShimmerKt.a(z11, aVar2, v0.a(i11 | 1), i12);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
