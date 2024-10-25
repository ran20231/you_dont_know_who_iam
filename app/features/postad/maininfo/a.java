package com.forsale.app.features.postad.maininfo;

import android.os.Bundle;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.features.maincontainer.HomeToolbars;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.k0;
import t9.r0;
import z3.n;
/* compiled from: PostAdMainInfoFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f35899a = new c(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PostAdMainInfoFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.postad.maininfo.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0415a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f35900a;

        /* renamed from: b  reason: collision with root package name */
        private final int f35901b;

        public C0415a() {
            this(false, 1, null);
        }

        @Override // z3.n
        public int a() {
            return this.f35901b;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("categoryAllowUploadOnly", this.f35900a);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0415a) && this.f35900a == ((C0415a) obj).f35900a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            boolean z11 = this.f35900a;
            if (z11) {
                return 1;
            }
            return z11 ? 1 : 0;
        }

        public String toString() {
            boolean z11 = this.f35900a;
            return "ActionPostAdMainInfoFragmentToCategorySelectionFragment2(categoryAllowUploadOnly=" + z11 + ")";
        }

        public C0415a(boolean z11) {
            this.f35900a = z11;
            this.f35901b = r0.f69921h0;
        }

        public /* synthetic */ C0415a(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? true : z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PostAdMainInfoFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        private final int f35902a;

        /* renamed from: b  reason: collision with root package name */
        private final HomeToolbars f35903b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f35904c;

        /* renamed from: d  reason: collision with root package name */
        private final int f35905d;

        public b() {
            this(0, null, false, 7, null);
        }

        @Override // z3.n
        public int a() {
            return this.f35905d;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putInt("locationId", this.f35902a);
            if (Parcelable.class.isAssignableFrom(HomeToolbars.class)) {
                HomeToolbars homeToolbars = this.f35903b;
                o.g(homeToolbars, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("toolbarType", (Parcelable) homeToolbars);
            } else if (Serializable.class.isAssignableFrom(HomeToolbars.class)) {
                HomeToolbars homeToolbars2 = this.f35903b;
                o.g(homeToolbars2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("toolbarType", homeToolbars2);
            }
            bundle.putBoolean("hasBottomNavigation", this.f35904c);
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
            if (this.f35902a == bVar.f35902a && this.f35903b == bVar.f35903b && this.f35904c == bVar.f35904c) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((Integer.hashCode(this.f35902a) * 31) + this.f35903b.hashCode()) * 31;
            boolean z11 = this.f35904c;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        public String toString() {
            int i11 = this.f35902a;
            HomeToolbars homeToolbars = this.f35903b;
            boolean z11 = this.f35904c;
            return "ActionPostAdMainInfoFragmentToPostAdLocationFragment(locationId=" + i11 + ", toolbarType=" + homeToolbars + ", hasBottomNavigation=" + z11 + ")";
        }

        public b(int i11, HomeToolbars toolbarType, boolean z11) {
            o.i(toolbarType, "toolbarType");
            this.f35902a = i11;
            this.f35903b = toolbarType;
            this.f35904c = z11;
            this.f35905d = r0.f69960k0;
        }

        public /* synthetic */ b(int i11, HomeToolbars homeToolbars, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? -1 : i11, (i12 & 2) != 0 ? HomeToolbars.NONE : homeToolbars, (i12 & 4) != 0 ? false : z11);
        }
    }

    /* compiled from: PostAdMainInfoFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n c(c cVar, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = true;
            }
            return cVar.b(z11);
        }

        public static /* synthetic */ n g(c cVar, int i11, HomeToolbars homeToolbars, boolean z11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = -1;
            }
            if ((i12 & 2) != 0) {
                homeToolbars = HomeToolbars.NONE;
            }
            if ((i12 & 4) != 0) {
                z11 = false;
            }
            return cVar.f(i11, homeToolbars, z11);
        }

        public final n a(ListingDetailsEntity listingDetailsEntity, PostListingIntention postListingIntention) {
            o.i(postListingIntention, "postListingIntention");
            return k0.f69302a.c(listingDetailsEntity, postListingIntention);
        }

        public final n b(boolean z11) {
            return new C0415a(z11);
        }

        public final n d() {
            return new z3.a(r0.f69934i0);
        }

        public final n e() {
            return new z3.a(r0.f69947j0);
        }

        public final n f(int i11, HomeToolbars toolbarType, boolean z11) {
            o.i(toolbarType, "toolbarType");
            return new b(i11, toolbarType, z11);
        }

        public final n h() {
            return new z3.a(r0.f69973l0);
        }
    }
}
