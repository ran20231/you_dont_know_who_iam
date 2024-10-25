package com.forsale.app.features.auth;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AuthUiState.kt */
/* loaded from: classes2.dex */
public abstract class b {

    /* compiled from: AuthUiState.kt */
    /* loaded from: classes2.dex */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        private final String f22615a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String errorMessage) {
            super(null);
            o.i(errorMessage, "errorMessage");
            this.f22615a = errorMessage;
        }

        public final String a() {
            return this.f22615a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && o.d(this.f22615a, ((a) obj).f22615a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f22615a.hashCode();
        }

        public String toString() {
            String str = this.f22615a;
            return "Failed(errorMessage=" + str + ")";
        }
    }

    /* compiled from: AuthUiState.kt */
    /* renamed from: com.forsale.app.features.auth.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0253b extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0253b f22616a = new C0253b();

        private C0253b() {
            super(null);
        }
    }

    /* compiled from: AuthUiState.kt */
    /* loaded from: classes2.dex */
    public static final class c extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f22617a = new c();

        private c() {
            super(null);
        }
    }

    /* compiled from: AuthUiState.kt */
    /* loaded from: classes2.dex */
    public static final class d extends b {

        /* renamed from: a  reason: collision with root package name */
        private final String f22618a;

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f22619b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String successMessage, Boolean bool) {
            super(null);
            o.i(successMessage, "successMessage");
            this.f22618a = successMessage;
            this.f22619b = bool;
        }

        public final Boolean a() {
            return this.f22619b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (o.d(this.f22618a, dVar.f22618a) && o.d(this.f22619b, dVar.f22619b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f22618a.hashCode() * 31;
            Boolean bool = this.f22619b;
            if (bool == null) {
                hashCode = 0;
            } else {
                hashCode = bool.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            String str = this.f22618a;
            Boolean bool = this.f22619b;
            return "Success(successMessage=" + str + ", needFeedBack=" + bool + ")";
        }

        public /* synthetic */ d(String str, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? Boolean.TRUE : bool);
        }
    }

    private b() {
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
