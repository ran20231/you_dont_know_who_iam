package com.forsale.app.features.postad.addons;

import android.os.Bundle;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.k0;
import t9.r0;
import z3.n;
/* compiled from: PostAdAddonsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f34409a = new b(null);

    /* compiled from: PostAdAddonsFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.postad.addons.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0383a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f34410a;

        /* renamed from: b  reason: collision with root package name */
        private final String f34411b;

        /* renamed from: c  reason: collision with root package name */
        private final int f34412c;

        public C0383a() {
            this(false, null, 3, null);
        }

        @Override // z3.n
        public int a() {
            return this.f34412c;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("from_plf", this.f34410a);
            bundle.putString("plf_intention", this.f34411b);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0383a)) {
                return false;
            }
            C0383a c0383a = (C0383a) obj;
            if (this.f34410a == c0383a.f34410a && o.d(this.f34411b, c0383a.f34411b)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            int hashCode;
            boolean z11 = this.f34410a;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int i11 = r02 * 31;
            String str = this.f34411b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return i11 + hashCode;
        }

        public String toString() {
            boolean z11 = this.f34410a;
            String str = this.f34411b;
            return "ActionPostAdAddonsFragmentToPaymentOptionsFragment(fromPlf=" + z11 + ", plfIntention=" + str + ")";
        }

        public C0383a(boolean z11, String str) {
            this.f34410a = z11;
            this.f34411b = str;
            this.f34412c = r0.X;
        }

        public /* synthetic */ C0383a(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: PostAdAddonsFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n a(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            return k0.f69302a.a(listingDetailsEntity, postListingIntention);
        }

        public final n b() {
            return new z3.a(r0.W);
        }

        public final n c(boolean z11, String str) {
            return new C0383a(z11, str);
        }

        public final n d() {
            return new z3.a(r0.Y);
        }
    }
}
