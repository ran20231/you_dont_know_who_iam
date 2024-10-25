package com.forsale.designSystem.typography;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.text.a0;
import androidx.compose.ui.text.font.f;
import androidx.compose.ui.text.font.p;
import androidx.recyclerview.widget.RecyclerView;
import b1.t1;
import com.google.android.gms.ads.AdRequest;
import ek.a;
import ek.b;
import ek.c;
import ek.d;
import ek.e;
import ek.g;
import ek.h;
import ek.i;
import ek.j;
import ek.k;
import ek.l;
import ek.m;
import ek.n;
import ek.p;
import ek.q;
import ek.r;
import ek.s;
import ek.t;
import ek.u;
import ek.v;
import ek.w;
import j0.s0;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
/* compiled from: Values.kt */
/* loaded from: classes3.dex */
public final class ValuesKt {

    /* renamed from: a  reason: collision with root package name */
    private static final s0<w> f42212a = CompositionLocalKt.e(ValuesKt$LocalTypographyStyles$1.f42215a);

    /* renamed from: b  reason: collision with root package name */
    private static final s0<a0> f42213b = CompositionLocalKt.d(null, ValuesKt$LocalTextTypographyStyle$1.f42214a, 1, null);

    public static final w a(f fontFamily, long j11) {
        o.i(fontFamily, "fontFamily");
        return new w(f(k.b(null, 1, null), fontFamily, j11), f(l.b(null, 1, null), fontFamily, j11), f(m.b(null, 1, null), fontFamily, j11), f(u.b(null, 1, null), fontFamily, j11), f(v.b(null, 1, null), fontFamily, j11), f(b.b(null, 1, null), fontFamily, j11), f(a.b(null, 1, null), fontFamily, j11), f(d.b(null, 1, null), fontFamily, j11), f(c.b(null, 1, null), fontFamily, j11), f(e.b(null, 1, null), fontFamily, j11), f(ek.f.b(null, 1, null), fontFamily, j11), f(g.b(null, 1, null), fontFamily, j11), f(n.b(null, 1, null), fontFamily, j11), f(ek.o.b(null, 1, null), fontFamily, j11), f(p.b(null, 1, null), fontFamily, j11), f(q.b(null, 1, null), fontFamily, j11), f(j.b(null, 1, null), fontFamily, j11), f(i.b(null, 1, null), fontFamily, j11), f(h.b(null, 1, null), fontFamily, j11), f(r.b(null, 1, null), fontFamily, j11), e(s.b(null, 1, null), fontFamily, j11), e(t.b(null, 1, null), fontFamily, j11));
    }

    public static /* synthetic */ w b(f fVar, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            int i12 = sj.e.f68692c;
            p.a aVar = androidx.compose.ui.text.font.p.f9351b;
            fVar = w1.d.a(androidx.compose.ui.text.font.h.b(i12, aVar.c(), 0, 0, 12, null), androidx.compose.ui.text.font.h.b(sj.e.f68694e, aVar.e(), 0, 0, 12, null), androidx.compose.ui.text.font.h.b(sj.e.f68693d, aVar.d(), 0, 0, 12, null), androidx.compose.ui.text.font.h.b(sj.e.f68690a, aVar.b(), 0, 0, 12, null), androidx.compose.ui.text.font.h.b(sj.e.f68691b, aVar.a(), 0, 0, 12, null));
        }
        if ((i11 & 2) != 0) {
            j11 = t1.f15974b.e();
        }
        return a(fVar, j11);
    }

    public static final s0<a0> c() {
        return f42213b;
    }

    public static final s0<w> d() {
        return f42212a;
    }

    private static final androidx.compose.ui.text.u e(androidx.compose.ui.text.u uVar, f fVar, long j11) {
        return androidx.compose.ui.text.u.b(uVar, j11, 0L, null, null, null, fVar, null, 0L, null, null, null, 0L, null, null, null, null, 65502, null);
    }

    private static final a0 f(a0 a0Var, f fVar, long j11) {
        a0 b11;
        b11 = a0Var.b((r48 & 1) != 0 ? a0Var.f9207a.g() : j11, (r48 & 2) != 0 ? a0Var.f9207a.k() : 0L, (r48 & 4) != 0 ? a0Var.f9207a.n() : null, (r48 & 8) != 0 ? a0Var.f9207a.l() : null, (r48 & 16) != 0 ? a0Var.f9207a.m() : null, (r48 & 32) != 0 ? a0Var.f9207a.i() : fVar, (r48 & 64) != 0 ? a0Var.f9207a.j() : null, (r48 & 128) != 0 ? a0Var.f9207a.o() : 0L, (r48 & 256) != 0 ? a0Var.f9207a.e() : null, (r48 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? a0Var.f9207a.u() : null, (r48 & 1024) != 0 ? a0Var.f9207a.p() : null, (r48 & RecyclerView.l.FLAG_MOVED) != 0 ? a0Var.f9207a.d() : 0L, (r48 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? a0Var.f9207a.s() : null, (r48 & 8192) != 0 ? a0Var.f9207a.r() : null, (r48 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? a0Var.f9207a.h() : null, (r48 & 32768) != 0 ? a0Var.f9208b.h() : 0, (r48 & 65536) != 0 ? a0Var.f9208b.i() : 0, (r48 & 131072) != 0 ? a0Var.f9208b.e() : 0L, (r48 & 262144) != 0 ? a0Var.f9208b.j() : null, (r48 & 524288) != 0 ? a0Var.f9209c : null, (r48 & 1048576) != 0 ? a0Var.f9208b.f() : null, (r48 & 2097152) != 0 ? a0Var.f9208b.d() : 0, (r48 & 4194304) != 0 ? a0Var.f9208b.c() : 0, (r48 & 8388608) != 0 ? a0Var.f9208b.k() : null);
        return b11;
    }
}
