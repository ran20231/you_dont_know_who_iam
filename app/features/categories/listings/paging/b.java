package com.forsale.app.features.categories.listings.paging;
/* compiled from: PagingState.kt */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: PagingState.kt */
    /* loaded from: classes2.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f31001a;

        public a(boolean z11) {
            this.f31001a = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f31001a == ((a) obj).f31001a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            boolean z11 = this.f31001a;
            if (z11) {
                return 1;
            }
            return z11 ? 1 : 0;
        }

        public String toString() {
            boolean z11 = this.f31001a;
            return "Empty(withFilters=" + z11 + ")";
        }
    }

    /* compiled from: PagingState.kt */
    /* renamed from: com.forsale.app.features.categories.listings.paging.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0337b implements b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f31002a;

        public C0337b(boolean z11) {
            this.f31002a = z11;
        }

        public final boolean a() {
            return this.f31002a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0337b) && this.f31002a == ((C0337b) obj).f31002a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            boolean z11 = this.f31002a;
            if (z11) {
                return 1;
            }
            return z11 ? 1 : 0;
        }

        public String toString() {
            boolean z11 = this.f31002a;
            return "Error(isConnectivityError=" + z11 + ")";
        }
    }

    /* compiled from: PagingState.kt */
    /* loaded from: classes2.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f31003a = new c();

        private c() {
        }
    }

    /* compiled from: PagingState.kt */
    /* loaded from: classes2.dex */
    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f31004a = new d();

        private d() {
        }
    }
}
