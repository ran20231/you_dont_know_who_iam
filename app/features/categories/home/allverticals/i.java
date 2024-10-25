package com.forsale.app.features.categories.home.allverticals;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AllVerticalsSectionsState.kt */
/* loaded from: classes2.dex */
public abstract class i {

    /* compiled from: AllVerticalsSectionsState.kt */
    /* loaded from: classes2.dex */
    public static final class a extends i {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f23812a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable error) {
            super(null);
            o.i(error, "error");
            this.f23812a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && o.d(this.f23812a, ((a) obj).f23812a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f23812a.hashCode();
        }

        public String toString() {
            Throwable th2 = this.f23812a;
            return "Error(error=" + th2 + ")";
        }
    }

    /* compiled from: AllVerticalsSectionsState.kt */
    /* loaded from: classes2.dex */
    public static final class b extends i {

        /* renamed from: a  reason: collision with root package name */
        public static final b f23813a = new b();

        private b() {
            super(null);
        }
    }

    /* compiled from: AllVerticalsSectionsState.kt */
    /* loaded from: classes2.dex */
    public static final class c extends i {

        /* renamed from: a  reason: collision with root package name */
        private final List<f> f23814a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<f> data) {
            super(null);
            o.i(data, "data");
            this.f23814a = data;
        }

        public final List<f> a() {
            return this.f23814a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && o.d(this.f23814a, ((c) obj).f23814a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f23814a.hashCode();
        }

        public String toString() {
            List<f> list = this.f23814a;
            return "Success(data=" + list + ")";
        }
    }

    private i() {
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
