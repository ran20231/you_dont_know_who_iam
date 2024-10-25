package com.forsale.app.features.categories.listingdetails.buyerscreen.utils;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.runtime.a;
import androidx.recyclerview.widget.RecyclerView;
import g00.q;
import j0.d1;
import j0.v0;
import kotlin.jvm.internal.o;
import q.c;
import r.g;
import r.y;
import r0.b;
import wz.p;
/* compiled from: AnimatedVisibiltyWithFade.kt */
/* loaded from: classes2.dex */
public final class AnimatedVisibiltyWithFadeKt {
    public static final void a(final boolean z11, final int i11, final y easing, final q<? super c, ? super a, ? super Integer, p> content, a aVar, final int i12) {
        final int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        o.i(easing, "easing");
        o.i(content, "content");
        a h11 = aVar.h(490455030);
        if ((i12 & 14) == 0) {
            if (h11.a(z11)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i13 = i17 | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            if (h11.d(i11)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i13 |= i16;
        }
        if ((i12 & 896) == 0) {
            if (h11.T(easing)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        if ((i12 & 7168) == 0) {
            if (h11.F(content)) {
                i14 = RecyclerView.l.FLAG_MOVED;
            } else {
                i14 = 1024;
            }
            i13 |= i14;
        }
        if ((i13 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(490455030, i13, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.utils.AnimatedVisibiltyWithFade (AnimatedVisibiltyWithFade.kt:20)");
            }
            AnimatedVisibilityKt.d(z11, null, EnterExitTransitionKt.o(g.k(i11, 0, easing, 2, null), 0.0f, 2, null), EnterExitTransitionKt.q(g.k(i11, 0, easing, 2, null), 0.0f, 2, null), null, b.b(h11, 977006110, true, new q<c, a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.utils.AnimatedVisibiltyWithFadeKt$AnimatedVisibiltyWithFade$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(c AnimatedVisibility, a aVar2, int i18) {
                    o.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(977006110, i18, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.utils.AnimatedVisibiltyWithFade.<anonymous> (AnimatedVisibiltyWithFade.kt:36)");
                    }
                    content.invoke(AnimatedVisibility, aVar2, Integer.valueOf(((i13 >> 6) & 112) | 8));
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(c cVar, a aVar2, Integer num) {
                    b(cVar, aVar2, num.intValue());
                    return p.f75480a;
                }
            }), h11, (i13 & 14) | 196608, 18);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<a, Integer, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.utils.AnimatedVisibiltyWithFadeKt$AnimatedVisibiltyWithFade$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(a aVar2, int i18) {
                    AnimatedVisibiltyWithFadeKt.a(z11, i11, easing, content, aVar2, v0.a(i12 | 1));
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
