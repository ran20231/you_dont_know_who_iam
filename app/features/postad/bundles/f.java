package com.forsale.app.features.postad.bundles;

import android.os.Bundle;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.k0;
import t9.r0;
import z3.n;
/* compiled from: PostAdBundlesFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final d f35078a = new d(null);

    /* compiled from: PostAdBundlesFragmentDirections.kt */
    /* loaded from: classes2.dex */
    private static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f35079a;

        /* renamed from: b  reason: collision with root package name */
        private final String f35080b;

        /* renamed from: c  reason: collision with root package name */
        private final int f35081c;

        public a() {
            this(false, null, 3, null);
        }

        @Override // z3.n
        public int a() {
            return this.f35081c;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("from_plf", this.f35079a);
            bundle.putString("plf_intention", this.f35080b);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f35079a == aVar.f35079a && o.d(this.f35080b, aVar.f35080b)) {
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
            boolean z11 = this.f35079a;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int i11 = r02 * 31;
            String str = this.f35080b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return i11 + hashCode;
        }

        public String toString() {
            boolean z11 = this.f35079a;
            String str = this.f35080b;
            return "ActionPostAdBundlesFragmentToPaymentOptionsFragment(fromPlf=" + z11 + ", plfIntention=" + str + ")";
        }

        public a(boolean z11, String str) {
            this.f35079a = z11;
            this.f35080b = str;
            this.f35081c = r0.f69843b0;
        }

        public /* synthetic */ a(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PostAdBundlesFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        private final ListingDetailsEntity f35082a;

        /* renamed from: b  reason: collision with root package name */
        private final PostListingIntention f35083b;

        /* renamed from: c  reason: collision with root package name */
        private final int f35084c;

        public b() {
            this(null, null, 3, null);
        }

        @Override // z3.n
        public int a() {
            return this.f35084c;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ListingDetailsEntity.class)) {
                bundle.putParcelable("listingDetails", this.f35082a);
            } else if (Serializable.class.isAssignableFrom(ListingDetailsEntity.class)) {
                bundle.putSerializable("listingDetails", (Serializable) this.f35082a);
            }
            if (Parcelable.class.isAssignableFrom(PostListingIntention.class)) {
                PostListingIntention postListingIntention = this.f35083b;
                o.g(postListingIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("postListingIntention", (Parcelable) postListingIntention);
            } else if (Serializable.class.isAssignableFrom(PostListingIntention.class)) {
                PostListingIntention postListingIntention2 = this.f35083b;
                o.g(postListingIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("postListingIntention", postListingIntention2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (o.d(this.f35082a, bVar.f35082a) && this.f35083b == bVar.f35083b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            ListingDetailsEntity listingDetailsEntity = this.f35082a;
            if (listingDetailsEntity == null) {
                hashCode = 0;
            } else {
                hashCode = listingDetailsEntity.hashCode();
            }
            return (hashCode * 31) + this.f35083b.hashCode();
        }

        public String toString() {
            ListingDetailsEntity listingDetailsEntity = this.f35082a;
            PostListingIntention postListingIntention = this.f35083b;
            return "ActionPostAdBundlesFragmentToPostAdAddonsFragment(listingDetails=" + listingDetailsEntity + ", postListingIntention=" + postListingIntention + ")";
        }

        public b(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            this.f35082a = listingDetailsEntity;
            this.f35083b = postListingIntention;
            this.f35084c = r0.f69856c0;
        }

        public /* synthetic */ b(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : listingDetailsEntity, (i11 & 2) != 0 ? PostListingIntention.NON : postListingIntention);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PostAdBundlesFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class c implements n {

        /* renamed from: a  reason: collision with root package name */
        private final PostListingIntention f35085a;

        /* renamed from: b  reason: collision with root package name */
        private final int f35086b;

        public c() {
            this(null, 1, null);
        }

        @Override // z3.n
        public int a() {
            return this.f35086b;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(PostListingIntention.class)) {
                PostListingIntention postListingIntention = this.f35085a;
                o.g(postListingIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("postListingIntention", (Parcelable) postListingIntention);
            } else if (Serializable.class.isAssignableFrom(PostListingIntention.class)) {
                PostListingIntention postListingIntention2 = this.f35085a;
                o.g(postListingIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("postListingIntention", postListingIntention2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.f35085a == ((c) obj).f35085a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f35085a.hashCode();
        }

        public String toString() {
            PostListingIntention postListingIntention = this.f35085a;
            return "ActionPostAdBundlesFragmentToPostAdPlansFragment(postListingIntention=" + postListingIntention + ")";
        }

        public c(PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            this.f35085a = postListingIntention;
            this.f35086b = r0.f69869d0;
        }

        public /* synthetic */ c(PostListingIntention postListingIntention, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? PostListingIntention.NON : postListingIntention);
        }
    }

    /* compiled from: PostAdBundlesFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n f(d dVar, ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                listingDetailsEntity = null;
            }
            if ((i11 & 2) != 0) {
                postListingIntention = PostListingIntention.NON;
            }
            return dVar.e(listingDetailsEntity, postListingIntention);
        }

        public static /* synthetic */ n h(d dVar, PostListingIntention postListingIntention, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                postListingIntention = PostListingIntention.NON;
            }
            return dVar.g(postListingIntention);
        }

        public final n a(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            return k0.f69302a.b(listingDetailsEntity, postListingIntention);
        }

        public final n b(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            return k0.f69302a.d(listingDetailsEntity, postListingIntention);
        }

        public final n c() {
            return new z3.a(r0.f69830a0);
        }

        public final n d(boolean z11, String str) {
            return new a(z11, str);
        }

        public final n e(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            return new b(listingDetailsEntity, postListingIntention);
        }

        public final n g(PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            return new c(postListingIntention);
        }
    }
}
