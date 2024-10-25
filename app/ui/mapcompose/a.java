package com.forsale.app.ui.mapcompose;

import b1.t1;
import com.google.android.gms.maps.model.PatternItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: MapSettings.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: MapSettings.kt */
    /* renamed from: com.forsale.app.ui.mapcompose.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0444a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final double f39426a;

        /* renamed from: b  reason: collision with root package name */
        private final t1 f39427b;

        /* renamed from: c  reason: collision with root package name */
        private final t1 f39428c;

        /* renamed from: d  reason: collision with root package name */
        private final List<PatternItem> f39429d;

        /* renamed from: e  reason: collision with root package name */
        private final float f39430e;

        public /* synthetic */ C0444a(double d11, t1 t1Var, t1 t1Var2, List list, float f11, DefaultConstructorMarker defaultConstructorMarker) {
            this(d11, t1Var, t1Var2, list, f11);
        }

        public final t1 a() {
            return this.f39427b;
        }

        public final double b() {
            return this.f39426a;
        }

        public final t1 c() {
            return this.f39428c;
        }

        public final float d() {
            return this.f39430e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0444a)) {
                return false;
            }
            C0444a c0444a = (C0444a) obj;
            if (Double.compare(this.f39426a, c0444a.f39426a) == 0 && o.d(this.f39427b, c0444a.f39427b) && o.d(this.f39428c, c0444a.f39428c) && o.d(this.f39429d, c0444a.f39429d) && Float.compare(this.f39430e, c0444a.f39430e) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int w11;
            int w12;
            int hashCode = Double.hashCode(this.f39426a) * 31;
            t1 t1Var = this.f39427b;
            int i11 = 0;
            if (t1Var == null) {
                w11 = 0;
            } else {
                w11 = t1.w(t1Var.y());
            }
            int i12 = (hashCode + w11) * 31;
            t1 t1Var2 = this.f39428c;
            if (t1Var2 == null) {
                w12 = 0;
            } else {
                w12 = t1.w(t1Var2.y());
            }
            int i13 = (i12 + w12) * 31;
            List<PatternItem> list = this.f39429d;
            if (list != null) {
                i11 = list.hashCode();
            }
            return ((i13 + i11) * 31) + Float.hashCode(this.f39430e);
        }

        public String toString() {
            double d11 = this.f39426a;
            t1 t1Var = this.f39427b;
            t1 t1Var2 = this.f39428c;
            List<PatternItem> list = this.f39429d;
            float f11 = this.f39430e;
            return "Circle(radius=" + d11 + ", fillColor=" + t1Var + ", strokeColor=" + t1Var2 + ", strokePattern=" + list + ", strokeWidth=" + f11 + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private C0444a(double d11, t1 t1Var, t1 t1Var2, List<? extends PatternItem> list, float f11) {
            this.f39426a = d11;
            this.f39427b = t1Var;
            this.f39428c = t1Var2;
            this.f39429d = list;
            this.f39430e = f11;
        }

        public /* synthetic */ C0444a(double d11, t1 t1Var, t1 t1Var2, List list, float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(d11, (i11 & 2) != 0 ? null : t1Var, (i11 & 4) != 0 ? null : t1Var2, (i11 & 8) != 0 ? null : list, (i11 & 16) != 0 ? 10.0f : f11, null);
        }
    }

    /* compiled from: MapSettings.kt */
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final Integer f39431a;

        public b() {
            this(null, 1, null);
        }

        public final Integer a() {
            return this.f39431a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && o.d(this.f39431a, ((b) obj).f39431a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.f39431a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            Integer num = this.f39431a;
            return "Pin(iconResourceId=" + num + ")";
        }

        public b(Integer num) {
            this.f39431a = num;
        }

        public /* synthetic */ b(Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num);
        }
    }
}
