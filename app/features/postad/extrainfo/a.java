package com.forsale.app.features.postad.extrainfo;

import android.os.Bundle;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.r0;
import z3.n;
/* compiled from: PostAdExtraInfoFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final d f35571a = new d(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PostAdExtraInfoFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.postad.extrainfo.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0411a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final ListingDetailsEntity f35572a;

        /* renamed from: b  reason: collision with root package name */
        private final PostListingIntention f35573b;

        /* renamed from: c  reason: collision with root package name */
        private final int f35574c;

        public C0411a() {
            this(null, null, 3, null);
        }

        @Override // z3.n
        public int a() {
            return this.f35574c;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ListingDetailsEntity.class)) {
                bundle.putParcelable("listingDetails", this.f35572a);
            } else if (Serializable.class.isAssignableFrom(ListingDetailsEntity.class)) {
                bundle.putSerializable("listingDetails", (Serializable) this.f35572a);
            }
            if (Parcelable.class.isAssignableFrom(PostListingIntention.class)) {
                PostListingIntention postListingIntention = this.f35573b;
                o.g(postListingIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("postListingIntention", (Parcelable) postListingIntention);
            } else if (Serializable.class.isAssignableFrom(PostListingIntention.class)) {
                PostListingIntention postListingIntention2 = this.f35573b;
                o.g(postListingIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("postListingIntention", postListingIntention2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0411a)) {
                return false;
            }
            C0411a c0411a = (C0411a) obj;
            if (o.d(this.f35572a, c0411a.f35572a) && this.f35573b == c0411a.f35573b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            ListingDetailsEntity listingDetailsEntity = this.f35572a;
            if (listingDetailsEntity == null) {
                hashCode = 0;
            } else {
                hashCode = listingDetailsEntity.hashCode();
            }
            return (hashCode * 31) + this.f35573b.hashCode();
        }

        public String toString() {
            ListingDetailsEntity listingDetailsEntity = this.f35572a;
            PostListingIntention postListingIntention = this.f35573b;
            return "ActionPostAdExtraInfoFragmentToPostAdAddonsFragment(listingDetails=" + listingDetailsEntity + ", postListingIntention=" + postListingIntention + ")";
        }

        public C0411a(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            this.f35572a = listingDetailsEntity;
            this.f35573b = postListingIntention;
            this.f35574c = r0.f69882e0;
        }

        public /* synthetic */ C0411a(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : listingDetailsEntity, (i11 & 2) != 0 ? PostListingIntention.NON : postListingIntention);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PostAdExtraInfoFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        private final PostListingIntention f35575a;

        /* renamed from: b  reason: collision with root package name */
        private final int f35576b;

        public b() {
            this(null, 1, null);
        }

        @Override // z3.n
        public int a() {
            return this.f35576b;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(PostListingIntention.class)) {
                PostListingIntention postListingIntention = this.f35575a;
                o.g(postListingIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("postListingIntention", (Parcelable) postListingIntention);
            } else if (Serializable.class.isAssignableFrom(PostListingIntention.class)) {
                PostListingIntention postListingIntention2 = this.f35575a;
                o.g(postListingIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("postListingIntention", postListingIntention2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.f35575a == ((b) obj).f35575a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f35575a.hashCode();
        }

        public String toString() {
            PostListingIntention postListingIntention = this.f35575a;
            return "ActionPostAdExtraInfoFragmentToPostAdBundlesFragment(postListingIntention=" + postListingIntention + ")";
        }

        public b(PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            this.f35575a = postListingIntention;
            this.f35576b = r0.f69895f0;
        }

        public /* synthetic */ b(PostListingIntention postListingIntention, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? PostListingIntention.NON : postListingIntention);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PostAdExtraInfoFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class c implements n {

        /* renamed from: a  reason: collision with root package name */
        private final PostListingIntention f35577a;

        /* renamed from: b  reason: collision with root package name */
        private final int f35578b;

        public c() {
            this(null, 1, null);
        }

        @Override // z3.n
        public int a() {
            return this.f35578b;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(PostListingIntention.class)) {
                PostListingIntention postListingIntention = this.f35577a;
                o.g(postListingIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("postListingIntention", (Parcelable) postListingIntention);
            } else if (Serializable.class.isAssignableFrom(PostListingIntention.class)) {
                PostListingIntention postListingIntention2 = this.f35577a;
                o.g(postListingIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("postListingIntention", postListingIntention2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.f35577a == ((c) obj).f35577a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f35577a.hashCode();
        }

        public String toString() {
            PostListingIntention postListingIntention = this.f35577a;
            return "ActionPostAdExtraInfoFragmentToPostAdPlansFragment(postListingIntention=" + postListingIntention + ")";
        }

        public c(PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            this.f35577a = postListingIntention;
            this.f35578b = r0.f69908g0;
        }

        public /* synthetic */ c(PostListingIntention postListingIntention, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? PostListingIntention.NON : postListingIntention);
        }
    }

    /* compiled from: PostAdExtraInfoFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n b(d dVar, ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                listingDetailsEntity = null;
            }
            if ((i11 & 2) != 0) {
                postListingIntention = PostListingIntention.NON;
            }
            return dVar.a(listingDetailsEntity, postListingIntention);
        }

        public static /* synthetic */ n d(d dVar, PostListingIntention postListingIntention, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                postListingIntention = PostListingIntention.NON;
            }
            return dVar.c(postListingIntention);
        }

        public static /* synthetic */ n f(d dVar, PostListingIntention postListingIntention, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                postListingIntention = PostListingIntention.NON;
            }
            return dVar.e(postListingIntention);
        }

        public final n a(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            return new C0411a(listingDetailsEntity, postListingIntention);
        }

        public final n c(PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            return new b(postListingIntention);
        }

        public final n e(PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            return new c(postListingIntention);
        }
    }
}
