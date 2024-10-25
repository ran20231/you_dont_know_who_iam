package com.forsale.designSystem.badges;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import b1.t1;
import com.forsale.designSystem.colors.ValuesKt;
import e2.h;
import g00.p;
import j0.d1;
import j0.s0;
import j0.t0;
import kotlin.jvm.internal.o;
import r0.b;
import s.g;
/* compiled from: Badges.kt */
/* loaded from: classes3.dex */
public final class BadgesKt {
    public static final void a(c cVar, long j11, float f11, a aVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        a h11 = aVar.h(-1153144884);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (h11.T(cVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.e(j11)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        int i18 = i12 & 4;
        if (i18 != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (h11.b(f11)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i13 & 731) == 146 && h11.i()) {
            h11.L();
        } else {
            if (i17 != 0) {
                cVar = c.f7566a;
            }
            if (i18 != 0) {
                f11 = uj.a.f73647a.a();
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-1153144884, i11, -1, "com.forsale.designSystem.badges.DotBadge (Badges.kt:28)");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DotBadge size ");
            sb2.append((Object) h.p(f11));
            BoxKt.a(BackgroundKt.a(BorderKt.e(SizeKt.p(cVar, f11), g.a(h.l(1), dk.a.f54291a.a(h11, 6).g().c(h11, 0)), c0.g.f()), j11, c0.g.f()), h11, 0);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        c cVar2 = cVar;
        float f12 = f11;
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new BadgesKt$DotBadge$1(cVar2, j11, f12, i11, i12));
        }
    }

    public static final void b(c cVar, long j11, p<? super a, ? super Integer, wz.p> content, a aVar, int i11, int i12) {
        c cVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        c.a aVar2;
        c cVar3;
        o.i(content, "content");
        a h11 = aVar.h(1762350739);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            cVar2 = cVar;
        } else if ((i11 & 14) == 0) {
            cVar2 = cVar;
            if (h11.T(cVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            cVar2 = cVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (h11.e(j11)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (h11.F(content)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        int i18 = i13;
        if ((i18 & 731) == 146 && h11.i()) {
            h11.L();
            cVar3 = cVar2;
        } else {
            if (i17 != 0) {
                aVar2 = c.f7566a;
            } else {
                aVar2 = cVar2;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(1762350739, i18, -1, "com.forsale.designSystem.badges.NumericValueBadge (Badges.kt:42)");
            }
            s0<t1> d11 = ValuesKt.d();
            dk.a aVar3 = dk.a.f54291a;
            CompositionLocalKt.b(new t0[]{d11.c(t1.g(aVar3.a(h11, 6).g().c(h11, 0))), com.forsale.designSystem.typography.ValuesKt.c().c(aVar3.c(h11, 6).n())}, b.b(h11, -1237640749, true, new BadgesKt$NumericValueBadge$1(aVar2, j11, content, i18)), h11, 56);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            cVar3 = aVar2;
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new BadgesKt$NumericValueBadge$2(cVar3, j11, content, i11, i12));
        }
    }
}
