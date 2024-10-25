package com.forsale.app.features.postad.plans;

import android.os.Bundle;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.r0;
import z3.n;
/* compiled from: PostAdPlansFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f36389a = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PostAdPlansFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.postad.plans.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0418a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final ListingDetailsEntity f36390a;

        /* renamed from: b  reason: collision with root package name */
        private final PostListingIntention f36391b;

        /* renamed from: c  reason: collision with root package name */
        private final int f36392c;

        public C0418a() {
            this(null, null, 3, null);
        }

        @Override // z3.n
        public int a() {
            return this.f36392c;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ListingDetailsEntity.class)) {
                bundle.putParcelable("listingDetails", this.f36390a);
            } else if (Serializable.class.isAssignableFrom(ListingDetailsEntity.class)) {
                bundle.putSerializable("listingDetails", (Serializable) this.f36390a);
            }
            if (Parcelable.class.isAssignableFrom(PostListingIntention.class)) {
                PostListingIntention postListingIntention = this.f36391b;
                o.g(postListingIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("postListingIntention", (Parcelable) postListingIntention);
            } else if (Serializable.class.isAssignableFrom(PostListingIntention.class)) {
                PostListingIntention postListingIntention2 = this.f36391b;
                o.g(postListingIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("postListingIntention", postListingIntention2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0418a)) {
                return false;
            }
            C0418a c0418a = (C0418a) obj;
            if (o.d(this.f36390a, c0418a.f36390a) && this.f36391b == c0418a.f36391b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            ListingDetailsEntity listingDetailsEntity = this.f36390a;
            if (listingDetailsEntity == null) {
                hashCode = 0;
            } else {
                hashCode = listingDetailsEntity.hashCode();
            }
            return (hashCode * 31) + this.f36391b.hashCode();
        }

        public String toString() {
            ListingDetailsEntity listingDetailsEntity = this.f36390a;
            PostListingIntention postListingIntention = this.f36391b;
            return "ActionPostAdPlansFragmentToPostAdAddonsFragment(listingDetails=" + listingDetailsEntity + ", postListingIntention=" + postListingIntention + ")";
        }

        public C0418a(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            this.f36390a = listingDetailsEntity;
            this.f36391b = postListingIntention;
            this.f36392c = r0.f70012o0;
        }

        public /* synthetic */ C0418a(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : listingDetailsEntity, (i11 & 2) != 0 ? PostListingIntention.NON : postListingIntention);
        }
    }

    /* compiled from: PostAdPlansFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n b(b bVar, ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                listingDetailsEntity = null;
            }
            if ((i11 & 2) != 0) {
                postListingIntention = PostListingIntention.NON;
            }
            return bVar.a(listingDetailsEntity, postListingIntention);
        }

        public final n a(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            return new C0418a(listingDetailsEntity, postListingIntention);
        }
    }
}
