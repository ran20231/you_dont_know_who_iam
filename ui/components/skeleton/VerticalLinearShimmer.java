package com.forsale.ui.components.skeleton;

import a1.l;
import b1.j1;
import b1.t1;
import g2.b;
import java.util.List;
import kotlin.collections.r;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r.n0;
import wz.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: skeleton.kt */
/* loaded from: classes3.dex */
public final class VerticalLinearShimmer implements mk.a {

    /* renamed from: a  reason: collision with root package name */
    private final long f42755a;

    /* renamed from: b  reason: collision with root package name */
    private final float f42756b;

    /* renamed from: c  reason: collision with root package name */
    private final h f42757c;

    public /* synthetic */ VerticalLinearShimmer(long j11, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, f11);
    }

    @Override // mk.a
    public j1 a(float f11, long j11) {
        List q11;
        j1.a aVar = j1.f15927b;
        q11 = r.q(t1.g(t1.o(this.f42755a, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), t1.g(this.f42755a), t1.g(t1.o(this.f42755a, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)));
        float f12 = 256;
        return j1.a.b(aVar, q11, (l.i(j11) * f11) - f12, (l.i(j11) + f12) * f11, 0, 8, null);
    }

    @Override // mk.a
    public n0<Float> b() {
        return (n0) this.f42757c.getValue();
    }

    @Override // mk.a
    public float c(float f11) {
        float f12 = this.f42756b;
        if (f11 <= f12) {
            return b.a(0.0f, 1.0f, f11 / f12);
        }
        return b.a(1.0f, 0.0f, (f11 - f12) / (1.0f - f12));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalLinearShimmer)) {
            return false;
        }
        VerticalLinearShimmer verticalLinearShimmer = (VerticalLinearShimmer) obj;
        if (t1.q(this.f42755a, verticalLinearShimmer.f42755a) && Float.compare(this.f42756b, verticalLinearShimmer.f42756b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (t1.w(this.f42755a) * 31) + Float.hashCode(this.f42756b);
    }

    public String toString() {
        return "VerticalLinearShimmer(highlightColor=" + ((Object) t1.x(this.f42755a)) + ", progressForMaxAlpha=" + this.f42756b + ')';
    }

    private VerticalLinearShimmer(long j11, float f11) {
        h a11;
        this.f42755a = j11;
        this.f42756b = f11;
        a11 = d.a(VerticalLinearShimmer$animationSpec$2.f42758a);
        this.f42757c = a11;
    }

    public /* synthetic */ VerticalLinearShimmer(long j11, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i11 & 2) != 0 ? 0.6f : f11, null);
    }
}
