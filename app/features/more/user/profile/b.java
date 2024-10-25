package com.forsale.app.features.more.user.profile;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.maincontainer.HomeToolbars;
import com.forsale.app.utils.analytics.AnalyticListingsPayload;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import com.forsale.app.utils.analytics.SearchSource;
import com.google.android.gms.ads.AdRequest;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http2.Http2;
import t9.p0;
import t9.r0;
/* compiled from: NewProfileFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f33670a = new c(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NewProfileFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class a implements z3.n {

        /* renamed from: a  reason: collision with root package name */
        private final ListingsTypes f33671a;

        /* renamed from: b  reason: collision with root package name */
        private final String f33672b;

        /* renamed from: c  reason: collision with root package name */
        private final int f33673c;

        /* renamed from: d  reason: collision with root package name */
        private final String f33674d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f33675e;

        /* renamed from: f  reason: collision with root package name */
        private final AdvancedSearchBody f33676f;

        /* renamed from: g  reason: collision with root package name */
        private final AnalyticsListingsSource f33677g;

        /* renamed from: h  reason: collision with root package name */
        private final String f33678h;

        /* renamed from: i  reason: collision with root package name */
        private final int f33679i;

        /* renamed from: j  reason: collision with root package name */
        private final int f33680j;

        /* renamed from: k  reason: collision with root package name */
        private final boolean f33681k;

        /* renamed from: l  reason: collision with root package name */
        private final int f33682l;

        /* renamed from: m  reason: collision with root package name */
        private final SearchSource f33683m;

        /* renamed from: n  reason: collision with root package name */
        private final int f33684n;

        /* renamed from: o  reason: collision with root package name */
        private final HomeToolbars f33685o;

        /* renamed from: p  reason: collision with root package name */
        private final boolean f33686p;

        /* renamed from: q  reason: collision with root package name */
        private final AnalyticListingsPayload f33687q;

        /* renamed from: r  reason: collision with root package name */
        private final int f33688r;

        public a() {
            this(null, null, 0, null, null, null, null, null, 0, 0, false, 0, null, 0, null, false, null, 131071, null);
        }

        @Override // z3.n
        public int a() {
            return this.f33688r;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ListingsTypes.class)) {
                ListingsTypes listingsTypes = this.f33671a;
                kotlin.jvm.internal.o.g(listingsTypes, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("listingTypes", (Parcelable) listingsTypes);
            } else if (Serializable.class.isAssignableFrom(ListingsTypes.class)) {
                ListingsTypes listingsTypes2 = this.f33671a;
                kotlin.jvm.internal.o.g(listingsTypes2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("listingTypes", listingsTypes2);
            }
            bundle.putString("listingTitle", this.f33672b);
            bundle.putInt("wantedItemsCategoryId", this.f33673c);
            bundle.putString("wantedItemsSearchQuery", this.f33674d);
            bundle.putIntArray("districtIds", this.f33675e);
            if (Parcelable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                bundle.putParcelable("searchBody", this.f33676f);
            } else if (Serializable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                bundle.putSerializable("searchBody", (Serializable) this.f33676f);
            }
            if (Parcelable.class.isAssignableFrom(AnalyticsListingsSource.class)) {
                AnalyticsListingsSource analyticsListingsSource = this.f33677g;
                kotlin.jvm.internal.o.g(analyticsListingsSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("listingSource", (Parcelable) analyticsListingsSource);
            } else if (Serializable.class.isAssignableFrom(AnalyticsListingsSource.class)) {
                AnalyticsListingsSource analyticsListingsSource2 = this.f33677g;
                kotlin.jvm.internal.o.g(analyticsListingsSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("listingSource", analyticsListingsSource2);
            }
            bundle.putString("ownerPhone", this.f33678h);
            bundle.putInt("advID", this.f33679i);
            bundle.putInt("categoryId", this.f33680j);
            bundle.putBoolean("showTitle", this.f33681k);
            bundle.putInt("topMargin", this.f33682l);
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f33683m;
                kotlin.jvm.internal.o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f33683m;
                kotlin.jvm.internal.o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            bundle.putInt("searchHistoryCount", this.f33684n);
            if (Parcelable.class.isAssignableFrom(HomeToolbars.class)) {
                HomeToolbars homeToolbars = this.f33685o;
                kotlin.jvm.internal.o.g(homeToolbars, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("toolbarType", (Parcelable) homeToolbars);
            } else if (Serializable.class.isAssignableFrom(HomeToolbars.class)) {
                HomeToolbars homeToolbars2 = this.f33685o;
                kotlin.jvm.internal.o.g(homeToolbars2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("toolbarType", homeToolbars2);
            }
            bundle.putBoolean("hasBottomNavigation", this.f33686p);
            if (Parcelable.class.isAssignableFrom(AnalyticListingsPayload.class)) {
                bundle.putParcelable("analyticListingsPayload", this.f33687q);
            } else if (Serializable.class.isAssignableFrom(AnalyticListingsPayload.class)) {
                bundle.putSerializable("analyticListingsPayload", (Serializable) this.f33687q);
            }
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
            if (this.f33671a == aVar.f33671a && kotlin.jvm.internal.o.d(this.f33672b, aVar.f33672b) && this.f33673c == aVar.f33673c && kotlin.jvm.internal.o.d(this.f33674d, aVar.f33674d) && kotlin.jvm.internal.o.d(this.f33675e, aVar.f33675e) && kotlin.jvm.internal.o.d(this.f33676f, aVar.f33676f) && this.f33677g == aVar.f33677g && kotlin.jvm.internal.o.d(this.f33678h, aVar.f33678h) && this.f33679i == aVar.f33679i && this.f33680j == aVar.f33680j && this.f33681k == aVar.f33681k && this.f33682l == aVar.f33682l && this.f33683m == aVar.f33683m && this.f33684n == aVar.f33684n && this.f33685o == aVar.f33685o && this.f33686p == aVar.f33686p && kotlin.jvm.internal.o.d(this.f33687q, aVar.f33687q)) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6 = this.f33671a.hashCode() * 31;
            String str = this.f33672b;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode7 = (((hashCode6 + hashCode) * 31) + Integer.hashCode(this.f33673c)) * 31;
            String str2 = this.f33674d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i12 = (hashCode7 + hashCode2) * 31;
            int[] iArr = this.f33675e;
            if (iArr == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = Arrays.hashCode(iArr);
            }
            int i13 = (i12 + hashCode3) * 31;
            AdvancedSearchBody advancedSearchBody = this.f33676f;
            if (advancedSearchBody == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = advancedSearchBody.hashCode();
            }
            int hashCode8 = (((i13 + hashCode4) * 31) + this.f33677g.hashCode()) * 31;
            String str3 = this.f33678h;
            if (str3 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str3.hashCode();
            }
            int hashCode9 = (((((hashCode8 + hashCode5) * 31) + Integer.hashCode(this.f33679i)) * 31) + Integer.hashCode(this.f33680j)) * 31;
            boolean z11 = this.f33681k;
            int i14 = 1;
            int i15 = z11;
            if (z11 != 0) {
                i15 = 1;
            }
            int hashCode10 = (((((((((hashCode9 + i15) * 31) + Integer.hashCode(this.f33682l)) * 31) + this.f33683m.hashCode()) * 31) + Integer.hashCode(this.f33684n)) * 31) + this.f33685o.hashCode()) * 31;
            boolean z12 = this.f33686p;
            if (!z12) {
                i14 = z12 ? 1 : 0;
            }
            int i16 = (hashCode10 + i14) * 31;
            AnalyticListingsPayload analyticListingsPayload = this.f33687q;
            if (analyticListingsPayload != null) {
                i11 = analyticListingsPayload.hashCode();
            }
            return i16 + i11;
        }

        public String toString() {
            ListingsTypes listingsTypes = this.f33671a;
            String str = this.f33672b;
            int i11 = this.f33673c;
            String str2 = this.f33674d;
            String arrays = Arrays.toString(this.f33675e);
            AdvancedSearchBody advancedSearchBody = this.f33676f;
            AnalyticsListingsSource analyticsListingsSource = this.f33677g;
            String str3 = this.f33678h;
            int i12 = this.f33679i;
            int i13 = this.f33680j;
            boolean z11 = this.f33681k;
            int i14 = this.f33682l;
            SearchSource searchSource = this.f33683m;
            int i15 = this.f33684n;
            HomeToolbars homeToolbars = this.f33685o;
            boolean z12 = this.f33686p;
            AnalyticListingsPayload analyticListingsPayload = this.f33687q;
            return "ActionMoreFragmentToGeneralListingsFragment(listingTypes=" + listingsTypes + ", listingTitle=" + str + ", wantedItemsCategoryId=" + i11 + ", wantedItemsSearchQuery=" + str2 + ", districtIds=" + arrays + ", searchBody=" + advancedSearchBody + ", listingSource=" + analyticsListingsSource + ", ownerPhone=" + str3 + ", advID=" + i12 + ", categoryId=" + i13 + ", showTitle=" + z11 + ", topMargin=" + i14 + ", searchSource=" + searchSource + ", searchHistoryCount=" + i15 + ", toolbarType=" + homeToolbars + ", hasBottomNavigation=" + z12 + ", analyticListingsPayload=" + analyticListingsPayload + ")";
        }

        public a(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AdvancedSearchBody advancedSearchBody, AnalyticsListingsSource listingSource, String str3, int i12, int i13, boolean z11, int i14, SearchSource searchSource, int i15, HomeToolbars toolbarType, boolean z12, AnalyticListingsPayload analyticListingsPayload) {
            kotlin.jvm.internal.o.i(listingTypes, "listingTypes");
            kotlin.jvm.internal.o.i(listingSource, "listingSource");
            kotlin.jvm.internal.o.i(searchSource, "searchSource");
            kotlin.jvm.internal.o.i(toolbarType, "toolbarType");
            this.f33671a = listingTypes;
            this.f33672b = str;
            this.f33673c = i11;
            this.f33674d = str2;
            this.f33675e = iArr;
            this.f33676f = advancedSearchBody;
            this.f33677g = listingSource;
            this.f33678h = str3;
            this.f33679i = i12;
            this.f33680j = i13;
            this.f33681k = z11;
            this.f33682l = i14;
            this.f33683m = searchSource;
            this.f33684n = i15;
            this.f33685o = toolbarType;
            this.f33686p = z12;
            this.f33687q = analyticListingsPayload;
            this.f33688r = r0.P;
        }

        public /* synthetic */ a(ListingsTypes listingsTypes, String str, int i11, String str2, int[] iArr, AdvancedSearchBody advancedSearchBody, AnalyticsListingsSource analyticsListingsSource, String str3, int i12, int i13, boolean z11, int i14, SearchSource searchSource, int i15, HomeToolbars homeToolbars, boolean z12, AnalyticListingsPayload analyticListingsPayload, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? ListingsTypes.NORMAL_LISTINGS : listingsTypes, (i16 & 2) != 0 ? null : str, (i16 & 4) != 0 ? -1 : i11, (i16 & 8) != 0 ? null : str2, (i16 & 16) != 0 ? null : iArr, (i16 & 32) != 0 ? null : advancedSearchBody, (i16 & 64) != 0 ? AnalyticsListingsSource.MORE : analyticsListingsSource, (i16 & 128) != 0 ? null : str3, (i16 & 256) != 0 ? -1 : i12, (i16 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? i13 : -1, (i16 & 1024) != 0 ? true : z11, (i16 & RecyclerView.l.FLAG_MOVED) != 0 ? p0.f69709i : i14, (i16 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? SearchSource.SEARCH_BAR : searchSource, (i16 & 8192) != 0 ? 0 : i15, (i16 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? HomeToolbars.SUB_CATEGORY_TOOLBAR : homeToolbars, (i16 & 32768) == 0 ? z12 : false, (i16 & 65536) != 0 ? null : analyticListingsPayload);
        }
    }

    /* compiled from: NewProfileFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.more.user.profile.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0367b implements z3.n {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f33689a;

        /* renamed from: b  reason: collision with root package name */
        private final String f33690b;

        /* renamed from: c  reason: collision with root package name */
        private final int f33691c;

        public C0367b() {
            this(false, null, 3, null);
        }

        @Override // z3.n
        public int a() {
            return this.f33691c;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("from_plf", this.f33689a);
            bundle.putString("plf_intention", this.f33690b);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0367b)) {
                return false;
            }
            C0367b c0367b = (C0367b) obj;
            if (this.f33689a == c0367b.f33689a && kotlin.jvm.internal.o.d(this.f33690b, c0367b.f33690b)) {
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
            boolean z11 = this.f33689a;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            int i11 = r02 * 31;
            String str = this.f33690b;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return i11 + hashCode;
        }

        public String toString() {
            boolean z11 = this.f33689a;
            String str = this.f33690b;
            return "ActionMoreFragmentToPaymentOptionsFragment(fromPlf=" + z11 + ", plfIntention=" + str + ")";
        }

        public C0367b(boolean z11, String str) {
            this.f33689a = z11;
            this.f33690b = str;
            this.f33691c = r0.S;
        }

        public /* synthetic */ C0367b(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: NewProfileFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z3.n a() {
            return new z3.a(r0.K);
        }

        public final z3.n b() {
            return new z3.a(r0.L);
        }

        public final z3.n c() {
            return new z3.a(r0.M);
        }

        public final z3.n d() {
            return new z3.a(r0.N);
        }

        public final z3.n e() {
            return new z3.a(r0.O);
        }

        public final z3.n f(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AdvancedSearchBody advancedSearchBody, AnalyticsListingsSource listingSource, String str3, int i12, int i13, boolean z11, int i14, SearchSource searchSource, int i15, HomeToolbars toolbarType, boolean z12, AnalyticListingsPayload analyticListingsPayload) {
            kotlin.jvm.internal.o.i(listingTypes, "listingTypes");
            kotlin.jvm.internal.o.i(listingSource, "listingSource");
            kotlin.jvm.internal.o.i(searchSource, "searchSource");
            kotlin.jvm.internal.o.i(toolbarType, "toolbarType");
            return new a(listingTypes, str, i11, str2, iArr, advancedSearchBody, listingSource, str3, i12, i13, z11, i14, searchSource, i15, toolbarType, z12, analyticListingsPayload);
        }

        public final z3.n h() {
            return new z3.a(r0.Q);
        }

        public final z3.n i() {
            return new z3.a(r0.R);
        }

        public final z3.n j(boolean z11, String str) {
            return new C0367b(z11, str);
        }

        public final z3.n k() {
            return new z3.a(r0.T);
        }
    }
}
