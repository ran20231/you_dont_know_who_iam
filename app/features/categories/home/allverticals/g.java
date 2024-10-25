package com.forsale.app.features.categories.home.allverticals;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AllVerticalsSectionType.kt */
/* loaded from: classes2.dex */
public abstract class g {

    /* compiled from: AllVerticalsSectionType.kt */
    /* loaded from: classes2.dex */
    public static final class a<T> extends g {

        /* renamed from: a  reason: collision with root package name */
        private final T f23808a;

        public a(T t11) {
            super(null);
            this.f23808a = t11;
        }

        public final T a() {
            return this.f23808a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && o.d(this.f23808a, ((a) obj).f23808a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            T t11 = this.f23808a;
            if (t11 == null) {
                return 0;
            }
            return t11.hashCode();
        }

        public String toString() {
            T t11 = this.f23808a;
            return "Content(content=" + t11 + ")";
        }
    }

    /* compiled from: AllVerticalsSectionType.kt */
    /* loaded from: classes2.dex */
    public static final class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f23809a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable throwable) {
            super(null);
            o.i(throwable, "throwable");
            this.f23809a = throwable;
        }

        public final Throwable a() {
            return this.f23809a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && o.d(this.f23809a, ((b) obj).f23809a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f23809a.hashCode();
        }

        public String toString() {
            Throwable th2 = this.f23809a;
            return "Error(throwable=" + th2 + ")";
        }
    }

    /* compiled from: AllVerticalsSectionType.kt */
    /* loaded from: classes2.dex */
    public static final class c extends g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f23810a = new c();

        private c() {
            super(null);
        }
    }

    private g() {
    }

    public /* synthetic */ g(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
