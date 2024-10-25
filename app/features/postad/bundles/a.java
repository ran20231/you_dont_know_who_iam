package com.forsale.app.features.postad.bundles;

import kotlin.jvm.internal.o;
/* compiled from: BundlesActions.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: BundlesActions.kt */
    /* renamed from: com.forsale.app.features.postad.bundles.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0392a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final String f35060a;

        /* renamed from: b  reason: collision with root package name */
        private final String f35061b;

        public C0392a(String title, String url) {
            o.i(title, "title");
            o.i(url, "url");
            this.f35060a = title;
            this.f35061b = url;
        }

        public final String a() {
            return this.f35060a;
        }

        public final String b() {
            return this.f35061b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0392a)) {
                return false;
            }
            C0392a c0392a = (C0392a) obj;
            if (o.d(this.f35060a, c0392a.f35060a) && o.d(this.f35061b, c0392a.f35061b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f35060a.hashCode() * 31) + this.f35061b.hashCode();
        }

        public String toString() {
            String str = this.f35060a;
            String str2 = this.f35061b;
            return "DoubleViewsScreen(title=" + str + ", url=" + str2 + ")";
        }
    }

    /* compiled from: BundlesActions.kt */
    /* loaded from: classes2.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f35062a = new b();

        private b() {
        }
    }

    /* compiled from: BundlesActions.kt */
    /* loaded from: classes2.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f35063a = new c();

        private c() {
        }
    }
}
