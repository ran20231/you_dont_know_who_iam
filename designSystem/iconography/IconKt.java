package com.forsale.designSystem.iconography;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.a;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.b;
import androidx.compose.ui.graphics.painter.Painter;
import b1.t1;
import b1.u1;
import com.forsale.designSystem.colors.ValuesKt;
import e2.h;
import g00.l;
import j0.d1;
import j0.s0;
import kotlin.jvm.internal.o;
import q1.n;
/* compiled from: Icon.kt */
/* loaded from: classes3.dex */
public final class IconKt {

    /* renamed from: a  reason: collision with root package name */
    private static final s0<h> f41333a = CompositionLocalKt.d(null, IconKt$LocalIconSize$1.f41352a, 1, null);

    public static final void a(Painter painter, c cVar, String str, long j11, boolean z11, float f11, a aVar, int i11, int i12) {
        c.a aVar2;
        String str2;
        long j12;
        int i13;
        boolean z12;
        float f12;
        o.i(painter, "painter");
        a h11 = aVar.h(-1041104083);
        if ((i12 & 2) != 0) {
            aVar2 = c.f7566a;
        } else {
            aVar2 = cVar;
        }
        if ((i12 & 4) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i12 & 8) != 0) {
            i13 = i11 & (-7169);
            j12 = ((t1) h11.q(ValuesKt.d())).y();
        } else {
            j12 = j11;
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if ((i12 & 32) != 0) {
            i13 &= -458753;
            f12 = ((h) h11.q(f41333a)).q();
        } else {
            f12 = f11;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1041104083, i13, -1, "com.forsale.designSystem.iconography.Icon (Icon.kt:58)");
        }
        b(painter, aVar2, str2, j12, z12, f12, false, h11, (i13 & 112) | 1572872 | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (458752 & i13), 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new IconKt$Icon$2(painter, aVar2, str2, j12, z12, f12, i11, i12));
        }
    }

    public static final void b(Painter painter, c cVar, String str, long j11, boolean z11, float f11, boolean z12, a aVar, int i11, int i12) {
        c.a aVar2;
        String str2;
        long j12;
        int i13;
        boolean z13;
        float f12;
        boolean z14;
        u1 b11;
        c cVar2;
        o.i(painter, "painter");
        a h11 = aVar.h(1659146321);
        if ((i12 & 2) != 0) {
            aVar2 = c.f7566a;
        } else {
            aVar2 = cVar;
        }
        if ((i12 & 4) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i12 & 8) != 0) {
            i13 = i11 & (-7169);
            j12 = ((t1) h11.q(ValuesKt.d())).y();
        } else {
            j12 = j11;
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            z13 = true;
        } else {
            z13 = z11;
        }
        if ((i12 & 32) != 0) {
            i13 &= -458753;
            f12 = ((h) h11.q(f41333a)).q();
        } else {
            f12 = f11;
        }
        if ((i12 & 64) != 0) {
            z14 = false;
        } else {
            z14 = z12;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1659146321, i13, -1, "com.forsale.designSystem.iconography.Icon (Icon.kt:80)");
        }
        if (t1.q(j12, t1.f15974b.e())) {
            b11 = null;
        } else {
            b11 = u1.a.b(u1.f15992b, j12, 0, 2, null);
        }
        h11.C(575238228);
        if (str2 != null) {
            c.a aVar3 = c.f7566a;
            h11.C(1157296644);
            boolean T = h11.T(str2);
            Object D = h11.D();
            if (T || D == a.f7182a.a()) {
                D = new IconKt$Icon$semantics$1$1(str2);
                h11.u(D);
            }
            h11.S();
            cVar2 = n.c(aVar3, false, (l) D, 1, null);
        } else {
            cVar2 = c.f7566a;
        }
        c cVar3 = cVar2;
        h11.S();
        c cVar4 = c.f7566a;
        if (z14) {
            cVar4 = f(cVar4);
        }
        u1 u1Var = b11;
        float f13 = f12;
        boolean z15 = z13;
        BoxKt.a(androidx.compose.ui.draw.c.b(c(b.d(aVar2.k(cVar4)), painter, f12, z13), painter, false, null, androidx.compose.ui.layout.c.f8188a.d(), 0.0f, u1Var, 22, null).k(cVar3), h11, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new IconKt$Icon$3(painter, aVar2, str2, j12, z15, f13, z14, i11, i12));
        }
    }

    private static final c c(c cVar, Painter painter, float f11, boolean z11) {
        c p11;
        if (!a1.l.f(painter.k(), a1.l.f83b.a()) && !e(painter.k()) && !z11) {
            p11 = c.f7566a;
        } else {
            p11 = SizeKt.p(c.f7566a, f11);
        }
        return cVar.k(p11);
    }

    public static final s0<h> d() {
        return f41333a;
    }

    private static final boolean e(long j11) {
        if (Float.isInfinite(a1.l.i(j11)) && Float.isInfinite(a1.l.g(j11))) {
            return true;
        }
        return false;
    }

    private static final c f(c cVar) {
        return ComposedModifierKt.b(cVar, null, IconKt$mirror$1.f41353a, 1, null);
    }
}
