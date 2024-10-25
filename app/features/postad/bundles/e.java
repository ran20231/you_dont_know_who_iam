package com.forsale.app.features.postad.bundles;

import android.os.Bundle;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: PostAdBundlesFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class e implements z3.h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f35076b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final PostListingIntention f35077a;

    /* compiled from: PostAdBundlesFragmentArgs.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(Bundle bundle) {
            PostListingIntention postListingIntention;
            o.i(bundle, "bundle");
            bundle.setClassLoader(e.class.getClassLoader());
            if (bundle.containsKey("postListingIntention")) {
                if (!Parcelable.class.isAssignableFrom(PostListingIntention.class) && !Serializable.class.isAssignableFrom(PostListingIntention.class)) {
                    String name = PostListingIntention.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                postListingIntention = (PostListingIntention) bundle.get("postListingIntention");
                if (postListingIntention == null) {
                    throw new IllegalArgumentException("Argument \"postListingIntention\" is marked as non-null but was passed a null value.");
                }
            } else {
                postListingIntention = PostListingIntention.NON;
            }
            return new e(postListingIntention);
        }
    }

    public e() {
        this(null, 1, null);
    }

    public static final e fromBundle(Bundle bundle) {
        return f35076b.a(bundle);
    }

    public final PostListingIntention a() {
        return this.f35077a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && this.f35077a == ((e) obj).f35077a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f35077a.hashCode();
    }

    public String toString() {
        PostListingIntention postListingIntention = this.f35077a;
        return "PostAdBundlesFragmentArgs(postListingIntention=" + postListingIntention + ")";
    }

    public e(PostListingIntention postListingIntention) {
        o.i(postListingIntention, "postListingIntention");
        this.f35077a = postListingIntention;
    }

    public /* synthetic */ e(PostListingIntention postListingIntention, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? PostListingIntention.NON : postListingIntention);
    }
}
