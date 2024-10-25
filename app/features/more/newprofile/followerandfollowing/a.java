package com.forsale.app.features.more.newprofile.followerandfollowing;

import androidx.paging.compose.LazyPagingItems;
import kotlin.jvm.internal.o;
/* compiled from: FollowerAndFollowingIntention.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: FollowerAndFollowingIntention.kt */
    /* renamed from: com.forsale.app.features.more.newprofile.followerandfollowing.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0354a implements a {

        /* renamed from: b  reason: collision with root package name */
        public static final int f32256b = LazyPagingItems.f14078h;

        /* renamed from: a  reason: collision with root package name */
        private final LazyPagingItems<yd.a> f32257a;

        public C0354a(LazyPagingItems<yd.a> followersList) {
            o.i(followersList, "followersList");
            this.f32257a = followersList;
        }

        public final LazyPagingItems<yd.a> a() {
            return this.f32257a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0354a) && o.d(this.f32257a, ((C0354a) obj).f32257a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f32257a.hashCode();
        }

        public String toString() {
            LazyPagingItems<yd.a> lazyPagingItems = this.f32257a;
            return "Follower(followersList=" + lazyPagingItems + ")";
        }
    }

    /* compiled from: FollowerAndFollowingIntention.kt */
    /* loaded from: classes2.dex */
    public static final class b implements a {

        /* renamed from: b  reason: collision with root package name */
        public static final int f32258b = LazyPagingItems.f14078h;

        /* renamed from: a  reason: collision with root package name */
        private final LazyPagingItems<yd.a> f32259a;

        public b(LazyPagingItems<yd.a> followingList) {
            o.i(followingList, "followingList");
            this.f32259a = followingList;
        }

        public final LazyPagingItems<yd.a> a() {
            return this.f32259a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && o.d(this.f32259a, ((b) obj).f32259a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f32259a.hashCode();
        }

        public String toString() {
            LazyPagingItems<yd.a> lazyPagingItems = this.f32259a;
            return "Following(followingList=" + lazyPagingItems + ")";
        }
    }
}
