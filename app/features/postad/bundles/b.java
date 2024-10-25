package com.forsale.app.features.postad.bundles;

import com.forsale.app.datalayer.network.responses.Bundle;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: BundlesState.kt */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: BundlesState.kt */
    /* loaded from: classes2.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f35064a;

        public a(boolean z11) {
            this.f35064a = z11;
        }

        public final boolean a() {
            return this.f35064a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f35064a == ((a) obj).f35064a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            boolean z11 = this.f35064a;
            if (z11) {
                return 1;
            }
            return z11 ? 1 : 0;
        }

        public String toString() {
            boolean z11 = this.f35064a;
            return "Error(isConnectionError=" + z11 + ")";
        }
    }

    /* compiled from: BundlesState.kt */
    /* renamed from: com.forsale.app.features.postad.bundles.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0393b implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final C0393b f35065a = new C0393b();

        private C0393b() {
        }
    }

    /* compiled from: BundlesState.kt */
    /* loaded from: classes2.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f35066a = new c();

        private c() {
        }
    }

    /* compiled from: BundlesState.kt */
    /* loaded from: classes2.dex */
    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        private final List<Bundle> f35067a;

        public d(List<Bundle> bundles) {
            o.i(bundles, "bundles");
            this.f35067a = bundles;
        }

        public final List<Bundle> a() {
            return this.f35067a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && o.d(this.f35067a, ((d) obj).f35067a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f35067a.hashCode();
        }

        public String toString() {
            List<Bundle> list = this.f35067a;
            return "Success(bundles=" + list + ")";
        }
    }
}
