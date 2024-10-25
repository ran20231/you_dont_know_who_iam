package com.forsale.app.features.search;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import j0.d1;
import j0.v0;
import v0.b;
/* compiled from: SearchComponentAnimatedVisibility.kt */
/* loaded from: classes2.dex */
public final class SearchComponentAnimatedVisibilityKt {
    public static final void a(final boolean z11, final g00.q<? super q.c, ? super androidx.compose.runtime.a, ? super Integer, wz.p> content, androidx.compose.runtime.a aVar, final int i11) {
        final int i12;
        int i13;
        int i14;
        kotlin.jvm.internal.o.i(content, "content");
        androidx.compose.runtime.a h11 = aVar.h(1593952772);
        if ((i11 & 14) == 0) {
            if (h11.a(z11)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(content)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        if ((i12 & 91) == 18 && h11.i()) {
            h11.L();
        } else {
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1593952772, i12, -1, "com.forsale.app.features.search.SearchComponentAnimatedVisibility (SearchComponentAnimatedVisibility.kt:17)");
            }
            androidx.compose.animation.d B = EnterExitTransitionKt.B(null, null, 3, null);
            b.a aVar2 = v0.b.f74009a;
            AnimatedVisibilityKt.d(z11, null, B.c(EnterExitTransitionKt.m(null, aVar2.l(), false, null, 13, null)).c(EnterExitTransitionKt.o(null, 0.3f, 1, null)), EnterExitTransitionKt.E(null, null, 3, null).c(EnterExitTransitionKt.y(null, aVar2.l(), false, null, 13, null)), null, r0.b.b(h11, -1056663508, true, new g00.q<q.c, androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchComponentAnimatedVisibilityKt$SearchComponentAnimatedVisibility$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void b(q.c AnimatedVisibility, androidx.compose.runtime.a aVar3, int i15) {
                    kotlin.jvm.internal.o.i(AnimatedVisibility, "$this$AnimatedVisibility");
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1056663508, i15, -1, "com.forsale.app.features.search.SearchComponentAnimatedVisibility.<anonymous> (SearchComponentAnimatedVisibility.kt:25)");
                    }
                    content.invoke(AnimatedVisibility, aVar3, Integer.valueOf((i12 & 112) | 8));
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ wz.p invoke(q.c cVar, androidx.compose.runtime.a aVar3, Integer num) {
                    b(cVar, aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            }), h11, (i12 & 14) | 200064, 18);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchComponentAnimatedVisibilityKt$SearchComponentAnimatedVisibility$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i15) {
                    SearchComponentAnimatedVisibilityKt.a(z11, content, aVar3, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }
}
