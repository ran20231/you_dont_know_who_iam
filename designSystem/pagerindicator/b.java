package com.forsale.designSystem.pagerindicator;

import androidx.compose.runtime.c;
import b1.t1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DotStyle.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f42063j = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final float f42064a;

    /* renamed from: b  reason: collision with root package name */
    private final float f42065b;

    /* renamed from: c  reason: collision with root package name */
    private final float f42066c;

    /* renamed from: d  reason: collision with root package name */
    private final float f42067d;

    /* renamed from: e  reason: collision with root package name */
    private final int f42068e;

    /* renamed from: f  reason: collision with root package name */
    private final long f42069f;

    /* renamed from: g  reason: collision with root package name */
    private final long f42070g;

    /* renamed from: h  reason: collision with root package name */
    private final int f42071h;

    /* renamed from: i  reason: collision with root package name */
    private final float f42072i;

    /* compiled from: DotStyle.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(long j11, long j12, androidx.compose.runtime.a aVar, int i11, int i12) {
            long j13;
            long j14;
            aVar.C(1429829083);
            if ((i12 & 1) != 0) {
                j13 = dk.a.f54291a.a(aVar, 6).f().i(aVar, 0);
            } else {
                j13 = j11;
            }
            if ((i12 & 2) != 0) {
                j14 = dk.a.f54291a.a(aVar, 6).e().d(aVar, 0);
            } else {
                j14 = j12;
            }
            if (c.I()) {
                c.U(1429829083, i11, -1, "com.forsale.designSystem.pagerindicator.DotStyle.Companion.defaultDotStyle (DotStyle.kt:37)");
            }
            b bVar = new b(8.0f, 6.0f, 8.0f, 24.0f, 5, j13, j14, 5, 8.0f, null);
            if (c.I()) {
                c.T();
            }
            aVar.S();
            return bVar;
        }
    }

    public /* synthetic */ b(float f11, float f12, float f13, float f14, int i11, long j11, long j12, int i12, float f15, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, i11, j11, j12, i12, f15);
    }

    public final long a() {
        return this.f42069f;
    }

    public final float b() {
        return this.f42064a;
    }

    public final float c() {
        return this.f42067d;
    }

    public final int d() {
        return this.f42071h;
    }

    public final float e() {
        return this.f42072i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Float.compare(this.f42064a, bVar.f42064a) == 0 && Float.compare(this.f42065b, bVar.f42065b) == 0 && Float.compare(this.f42066c, bVar.f42066c) == 0 && Float.compare(this.f42067d, bVar.f42067d) == 0 && this.f42068e == bVar.f42068e && t1.q(this.f42069f, bVar.f42069f) && t1.q(this.f42070g, bVar.f42070g) && this.f42071h == bVar.f42071h && Float.compare(this.f42072i, bVar.f42072i) == 0) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.f42065b;
    }

    public final long g() {
        return this.f42070g;
    }

    public final float h() {
        return this.f42066c;
    }

    public int hashCode() {
        return (((((((((((((((Float.hashCode(this.f42064a) * 31) + Float.hashCode(this.f42065b)) * 31) + Float.hashCode(this.f42066c)) * 31) + Float.hashCode(this.f42067d)) * 31) + Integer.hashCode(this.f42068e)) * 31) + t1.w(this.f42069f)) * 31) + t1.w(this.f42070g)) * 31) + Integer.hashCode(this.f42071h)) * 31) + Float.hashCode(this.f42072i);
    }

    public final int i() {
        return this.f42068e;
    }

    public String toString() {
        return "DotStyle(currentDotRadius=" + this.f42064a + ", notLastDotRadius=" + this.f42065b + ", regularDotRadius=" + this.f42066c + ", dotMargin=" + this.f42067d + ", visibleDotCount=" + this.f42068e + ", currentDotColor=" + ((Object) t1.x(this.f42069f)) + ", regularDotColor=" + ((Object) t1.x(this.f42070g)) + ", maxVisibleDotNormalSizeCount=" + this.f42071h + ", normalDotRadius=" + this.f42072i + ')';
    }

    private b(float f11, float f12, float f13, float f14, int i11, long j11, long j12, int i12, float f15) {
        this.f42064a = f11;
        this.f42065b = f12;
        this.f42066c = f13;
        this.f42067d = f14;
        this.f42068e = i11;
        this.f42069f = j11;
        this.f42070g = j12;
        this.f42071h = i12;
        this.f42072i = f15;
        if (!(i11 > 2)) {
            throw new IllegalArgumentException("Visible dot count must be greater than 2".toString());
        }
        if (!(f11 > 0.0f)) {
            throw new IllegalArgumentException("Current dot radius must be greater than 0F".toString());
        }
        if (!(f12 > 0.0f)) {
            throw new IllegalArgumentException("Not last dot radius must be greater than 0F".toString());
        }
        if (!(f13 > 0.0f)) {
            throw new IllegalArgumentException("Regular dot radius must be greater than 0F".toString());
        }
        if (!(f14 > 0.0f)) {
            throw new IllegalArgumentException("Dot margin must be greater than 0F".toString());
        }
    }
}
