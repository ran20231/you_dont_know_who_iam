package com.forsale.designSystem.pagerindicator;

import a1.f;
import b1.t1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import r.g;
import r.r1;
/* compiled from: DotAnimation.kt */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C0471a f42057d = new C0471a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f42058e = 8;

    /* renamed from: f  reason: collision with root package name */
    private static final a f42059f = new a(g.i(0.0f, 0.0f, null, 7, null), g.i(0.0f, 0.0f, f.d(r1.c(f.f62b)), 3, null), g.i(0.0f, 0.0f, null, 7, null));

    /* renamed from: a  reason: collision with root package name */
    private final r.f<Float> f42060a;

    /* renamed from: b  reason: collision with root package name */
    private final r.f<f> f42061b;

    /* renamed from: c  reason: collision with root package name */
    private final r.f<t1> f42062c;

    /* compiled from: DotAnimation.kt */
    /* renamed from: com.forsale.designSystem.pagerindicator.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0471a {
        private C0471a() {
        }

        public /* synthetic */ C0471a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a() {
            return a.f42059f;
        }
    }

    public a(r.f<Float> sizeAnim, r.f<f> offsetAnim, r.f<t1> colorAnim) {
        o.i(sizeAnim, "sizeAnim");
        o.i(offsetAnim, "offsetAnim");
        o.i(colorAnim, "colorAnim");
        this.f42060a = sizeAnim;
        this.f42061b = offsetAnim;
        this.f42062c = colorAnim;
    }

    public final r.f<t1> b() {
        return this.f42062c;
    }

    public final r.f<f> c() {
        return this.f42061b;
    }

    public final r.f<Float> d() {
        return this.f42060a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (o.d(this.f42060a, aVar.f42060a) && o.d(this.f42061b, aVar.f42061b) && o.d(this.f42062c, aVar.f42062c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f42060a.hashCode() * 31) + this.f42061b.hashCode()) * 31) + this.f42062c.hashCode();
    }

    public String toString() {
        return "DotAnimation(sizeAnim=" + this.f42060a + ", offsetAnim=" + this.f42061b + ", colorAnim=" + this.f42062c + ')';
    }
}
