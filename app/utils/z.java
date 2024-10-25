package com.forsale.app.utils;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Result.kt */
/* loaded from: classes3.dex */
public abstract class z {

    /* compiled from: Result.kt */
    /* loaded from: classes3.dex */
    public static final class a extends z {

        /* renamed from: a  reason: collision with root package name */
        public static final a f40550a = new a();

        private a() {
            super(null);
        }
    }

    /* compiled from: Result.kt */
    /* loaded from: classes3.dex */
    public static final class b<T> extends z {

        /* renamed from: a  reason: collision with root package name */
        private final T f40551a;

        public b(T t11) {
            super(null);
            this.f40551a = t11;
        }

        public final T a() {
            return this.f40551a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && kotlin.jvm.internal.o.d(this.f40551a, ((b) obj).f40551a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            T t11 = this.f40551a;
            if (t11 == null) {
                return 0;
            }
            return t11.hashCode();
        }

        public String toString() {
            T t11 = this.f40551a;
            return "Success(data=" + t11 + ")";
        }
    }

    private z() {
    }

    public /* synthetic */ z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
