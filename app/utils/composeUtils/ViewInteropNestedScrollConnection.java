package com.forsale.app.utils.composeUtils;

import a1.f;
import aj.c;
import android.view.View;
import androidx.core.view.t1;
import androidx.core.view.z0;
import e2.x;
import k1.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.m;
import kotlin.d;
import kotlin.jvm.internal.o;
import wz.h;
/* compiled from: ViewInteropNestedScrollConnection.kt */
/* loaded from: classes3.dex */
public final class ViewInteropNestedScrollConnection implements a {

    /* renamed from: a  reason: collision with root package name */
    private final View f40100a;

    /* renamed from: b  reason: collision with root package name */
    private final h f40101b;

    /* renamed from: c  reason: collision with root package name */
    private final h f40102c;

    public ViewInteropNestedScrollConnection(View view) {
        h b11;
        h b12;
        o.i(view, "view");
        this.f40100a = view;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        b11 = d.b(lazyThreadSafetyMode, ViewInteropNestedScrollConnection$tmpArray$2.f40103a);
        this.f40101b = b11;
        b12 = d.b(lazyThreadSafetyMode, new ViewInteropNestedScrollConnection$viewHelper$2(this));
        this.f40102c = b12;
        t1.G0(view, true);
    }

    private final int[] b() {
        return (int[]) this.f40101b.getValue();
    }

    private final z0 c() {
        return (z0) this.f40102c.getValue();
    }

    @Override // k1.a
    public Object G(long j11, zz.a<? super x> aVar) {
        boolean z11;
        if (!c().b(x.h(j11) * (-1.0f), x.i(j11) * (-1.0f)) && !c().a(x.h(j11) * (-1.0f), x.i(j11) * (-1.0f), true)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (c().k(0)) {
            c().r(0);
        } else if (c().k(1)) {
            c().r(1);
        }
        if (!z11) {
            j11 = x.f54591b.a();
        }
        return x.b(j11);
    }

    @Override // k1.a
    public long e1(long j11, int i11) {
        int d11;
        int g11;
        double floor;
        double floor2;
        int g12;
        long f11;
        z0 c11 = c();
        d11 = c.d(j11);
        g11 = c.g(i11);
        if (c11.p(d11, g11)) {
            int[] b11 = b();
            m.t(b11, 0, 0, 0, 6, null);
            z0 c12 = c();
            float o11 = f.o(j11);
            if (o11 >= 0.0f) {
                floor = Math.ceil(o11);
            } else {
                floor = Math.floor(o11);
            }
            int i12 = ((int) floor) * (-1);
            float p11 = f.p(j11);
            if (p11 >= 0.0f) {
                floor2 = Math.ceil(p11);
            } else {
                floor2 = Math.floor(p11);
            }
            g12 = c.g(i11);
            c12.d(i12, ((int) floor2) * (-1), b11, null, g12);
            f11 = c.f(b11, j11);
            return f11;
        }
        return f.f62b.c();
    }

    @Override // k1.a
    public long y0(long j11, long j12, int i11) {
        int d11;
        int g11;
        double floor;
        double floor2;
        double floor3;
        double floor4;
        int g12;
        long f11;
        z0 c11 = c();
        d11 = c.d(j12);
        g11 = c.g(i11);
        if (c11.p(d11, g11)) {
            int[] b11 = b();
            m.t(b11, 0, 0, 0, 6, null);
            z0 c12 = c();
            float o11 = f.o(j11);
            if (o11 >= 0.0f) {
                floor = Math.ceil(o11);
            } else {
                floor = Math.floor(o11);
            }
            int i12 = ((int) floor) * (-1);
            float p11 = f.p(j11);
            if (p11 >= 0.0f) {
                floor2 = Math.ceil(p11);
            } else {
                floor2 = Math.floor(p11);
            }
            int i13 = ((int) floor2) * (-1);
            float o12 = f.o(j12);
            if (o12 >= 0.0f) {
                floor3 = Math.ceil(o12);
            } else {
                floor3 = Math.floor(o12);
            }
            int i14 = ((int) floor3) * (-1);
            float p12 = f.p(j12);
            double d12 = p12;
            if (p12 >= 0.0f) {
                floor4 = Math.ceil(d12);
            } else {
                floor4 = Math.floor(d12);
            }
            g12 = c.g(i11);
            c12.e(i12, i13, i14, ((int) floor4) * (-1), null, g12, b11);
            f11 = c.f(b11, j12);
            return f11;
        }
        return f.f62b.c();
    }
}
