package com.forsale.app.features.search;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.features.categories.listings.ListingsTypes;
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
/* compiled from: SearchFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c f36983a = new c(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SearchFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class a implements z3.n {

        /* renamed from: a  reason: collision with root package name */
        private final ListingsTypes f36984a;

        /* renamed from: b  reason: collision with root package name */
        private final String f36985b;

        /* renamed from: c  reason: collision with root package name */
        private final int f36986c;

        /* renamed from: d  reason: collision with root package name */
        private final String f36987d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f36988e;

        /* renamed from: f  reason: collision with root package name */
        private final AdvancedSearchBody f36989f;

        /* renamed from: g  reason: collision with root package name */
        private final AnalyticsListingsSource f36990g;

        /* renamed from: h  reason: collision with root package name */
        private final String f36991h;

        /* renamed from: i  reason: collision with root package name */
        private final int f36992i;

        /* renamed from: j  reason: collision with root package name */
        private final SearchSource f36993j;

        /* renamed from: k  reason: collision with root package name */
        private final int f36994k;

        /* renamed from: l  reason: collision with root package name */
        private final int f36995l;

        /* renamed from: m  reason: collision with root package name */
        private final boolean f36996m;

        /* renamed from: n  reason: collision with root package name */
        private final int f36997n;

        /* renamed from: o  reason: collision with root package name */
        private final AnalyticListingsPayload f36998o;

        /* renamed from: p  reason: collision with root package name */
        private final int f36999p;

        public a() {
            this(null, null, 0, null, null, null, null, null, 0, null, 0, 0, false, 0, null, 32767, null);
        }

        @Override // z3.n
        public int a() {
            return this.f36999p;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ListingsTypes.class)) {
                ListingsTypes listingsTypes = this.f36984a;
                kotlin.jvm.internal.o.g(listingsTypes, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("listingTypes", (Parcelable) listingsTypes);
            } else if (Serializable.class.isAssignableFrom(ListingsTypes.class)) {
                ListingsTypes listingsTypes2 = this.f36984a;
                kotlin.jvm.internal.o.g(listingsTypes2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("listingTypes", listingsTypes2);
            }
            bundle.putString("listingTitle", this.f36985b);
            bundle.putInt("wantedItemsCategoryId", this.f36986c);
            bundle.putString("wantedItemsSearchQuery", this.f36987d);
            bundle.putIntArray("districtIds", this.f36988e);
            if (Parcelable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                bundle.putParcelable("searchBody", this.f36989f);
            } else if (Serializable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                bundle.putSerializable("searchBody", (Serializable) this.f36989f);
            }
            if (Parcelable.class.isAssignableFrom(AnalyticsListingsSource.class)) {
                AnalyticsListingsSource analyticsListingsSource = this.f36990g;
                kotlin.jvm.internal.o.g(analyticsListingsSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("listingSource", (Parcelable) analyticsListingsSource);
            } else if (Serializable.class.isAssignableFrom(AnalyticsListingsSource.class)) {
                AnalyticsListingsSource analyticsListingsSource2 = this.f36990g;
                kotlin.jvm.internal.o.g(analyticsListingsSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("listingSource", analyticsListingsSource2);
            }
            bundle.putString("ownerPhone", this.f36991h);
            bundle.putInt("advID", this.f36992i);
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f36993j;
                kotlin.jvm.internal.o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f36993j;
                kotlin.jvm.internal.o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            bundle.putInt("searchHistoryCount", this.f36994k);
            bundle.putInt("categoryId", this.f36995l);
            bundle.putBoolean("showTitle", this.f36996m);
            bundle.putInt("topMargin", this.f36997n);
            if (Parcelable.class.isAssignableFrom(AnalyticListingsPayload.class)) {
                bundle.putParcelable("analyticListingsPayload", this.f36998o);
            } else if (Serializable.class.isAssignableFrom(AnalyticListingsPayload.class)) {
                bundle.putSerializable("analyticListingsPayload", (Serializable) this.f36998o);
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
            if (this.f36984a == aVar.f36984a && kotlin.jvm.internal.o.d(this.f36985b, aVar.f36985b) && this.f36986c == aVar.f36986c && kotlin.jvm.internal.o.d(this.f36987d, aVar.f36987d) && kotlin.jvm.internal.o.d(this.f36988e, aVar.f36988e) && kotlin.jvm.internal.o.d(this.f36989f, aVar.f36989f) && this.f36990g == aVar.f36990g && kotlin.jvm.internal.o.d(this.f36991h, aVar.f36991h) && this.f36992i == aVar.f36992i && this.f36993j == aVar.f36993j && this.f36994k == aVar.f36994k && this.f36995l == aVar.f36995l && this.f36996m == aVar.f36996m && this.f36997n == aVar.f36997n && kotlin.jvm.internal.o.d(this.f36998o, aVar.f36998o)) {
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
            int hashCode6 = this.f36984a.hashCode() * 31;
            String str = this.f36985b;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode7 = (((hashCode6 + hashCode) * 31) + Integer.hashCode(this.f36986c)) * 31;
            String str2 = this.f36987d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i12 = (hashCode7 + hashCode2) * 31;
            int[] iArr = this.f36988e;
            if (iArr == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = Arrays.hashCode(iArr);
            }
            int i13 = (i12 + hashCode3) * 31;
            AdvancedSearchBody advancedSearchBody = this.f36989f;
            if (advancedSearchBody == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = advancedSearchBody.hashCode();
            }
            int hashCode8 = (((i13 + hashCode4) * 31) + this.f36990g.hashCode()) * 31;
            String str3 = this.f36991h;
            if (str3 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str3.hashCode();
            }
            int hashCode9 = (((((((((hashCode8 + hashCode5) * 31) + Integer.hashCode(this.f36992i)) * 31) + this.f36993j.hashCode()) * 31) + Integer.hashCode(this.f36994k)) * 31) + Integer.hashCode(this.f36995l)) * 31;
            boolean z11 = this.f36996m;
            int i14 = z11;
            if (z11 != 0) {
                i14 = 1;
            }
            int hashCode10 = (((hashCode9 + i14) * 31) + Integer.hashCode(this.f36997n)) * 31;
            AnalyticListingsPayload analyticListingsPayload = this.f36998o;
            if (analyticListingsPayload != null) {
                i11 = analyticListingsPayload.hashCode();
            }
            return hashCode10 + i11;
        }

        public String toString() {
            ListingsTypes listingsTypes = this.f36984a;
            String str = this.f36985b;
            int i11 = this.f36986c;
            String str2 = this.f36987d;
            String arrays = Arrays.toString(this.f36988e);
            AdvancedSearchBody advancedSearchBody = this.f36989f;
            AnalyticsListingsSource analyticsListingsSource = this.f36990g;
            String str3 = this.f36991h;
            int i12 = this.f36992i;
            SearchSource searchSource = this.f36993j;
            int i13 = this.f36994k;
            int i14 = this.f36995l;
            boolean z11 = this.f36996m;
            int i15 = this.f36997n;
            AnalyticListingsPayload analyticListingsPayload = this.f36998o;
            return "ActionSearchFragmentToGeneralListingsFragment(listingTypes=" + listingsTypes + ", listingTitle=" + str + ", wantedItemsCategoryId=" + i11 + ", wantedItemsSearchQuery=" + str2 + ", districtIds=" + arrays + ", searchBody=" + advancedSearchBody + ", listingSource=" + analyticsListingsSource + ", ownerPhone=" + str3 + ", advID=" + i12 + ", searchSource=" + searchSource + ", searchHistoryCount=" + i13 + ", categoryId=" + i14 + ", showTitle=" + z11 + ", topMargin=" + i15 + ", analyticListingsPayload=" + analyticListingsPayload + ")";
        }

        public a(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AdvancedSearchBody advancedSearchBody, AnalyticsListingsSource listingSource, String str3, int i12, SearchSource searchSource, int i13, int i14, boolean z11, int i15, AnalyticListingsPayload analyticListingsPayload) {
            kotlin.jvm.internal.o.i(listingTypes, "listingTypes");
            kotlin.jvm.internal.o.i(listingSource, "listingSource");
            kotlin.jvm.internal.o.i(searchSource, "searchSource");
            this.f36984a = listingTypes;
            this.f36985b = str;
            this.f36986c = i11;
            this.f36987d = str2;
            this.f36988e = iArr;
            this.f36989f = advancedSearchBody;
            this.f36990g = listingSource;
            this.f36991h = str3;
            this.f36992i = i12;
            this.f36993j = searchSource;
            this.f36994k = i13;
            this.f36995l = i14;
            this.f36996m = z11;
            this.f36997n = i15;
            this.f36998o = analyticListingsPayload;
            this.f36999p = r0.f70064s0;
        }

        public /* synthetic */ a(ListingsTypes listingsTypes, String str, int i11, String str2, int[] iArr, AdvancedSearchBody advancedSearchBody, AnalyticsListingsSource analyticsListingsSource, String str3, int i12, SearchSource searchSource, int i13, int i14, boolean z11, int i15, AnalyticListingsPayload analyticListingsPayload, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? ListingsTypes.NORMAL_LISTINGS : listingsTypes, (i16 & 2) != 0 ? null : str, (i16 & 4) != 0 ? -1 : i11, (i16 & 8) != 0 ? null : str2, (i16 & 16) != 0 ? null : iArr, (i16 & 32) != 0 ? null : advancedSearchBody, (i16 & 64) != 0 ? AnalyticsListingsSource.MORE : analyticsListingsSource, (i16 & 128) != 0 ? null : str3, (i16 & 256) != 0 ? -1 : i12, (i16 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? SearchSource.SEARCH_BAR : searchSource, (i16 & 1024) != 0 ? 0 : i13, (i16 & RecyclerView.l.FLAG_MOVED) == 0 ? i14 : -1, (i16 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? true : z11, (i16 & 8192) != 0 ? p0.f69709i : i15, (i16 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? analyticListingsPayload : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SearchFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class b implements z3.n {

        /* renamed from: a  reason: collision with root package name */
        private final String f37000a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f37001b;

        /* renamed from: c  reason: collision with root package name */
        private final SearchSource f37002c;

        /* renamed from: d  reason: collision with root package name */
        private final int f37003d;

        /* renamed from: e  reason: collision with root package name */
        private final int f37004e;

        /* renamed from: f  reason: collision with root package name */
        private final int f37005f;

        public b() {
            this(null, false, null, 0, 0, 31, null);
        }

        @Override // z3.n
        public int a() {
            return this.f37005f;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putString("SEARCH_KEYWORD", this.f37000a);
            bundle.putBoolean("GO_TO_SEARCH_RESULTS", this.f37001b);
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f37002c;
                kotlin.jvm.internal.o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("SEARCH_SOURCE", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f37002c;
                kotlin.jvm.internal.o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("SEARCH_SOURCE", searchSource2);
            }
            bundle.putInt("SEARCH_HISTORY_COUNT", this.f37003d);
            bundle.putInt("SEARCH_ITEM_ORDER", this.f37004e);
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
            if (kotlin.jvm.internal.o.d(this.f37000a, bVar.f37000a) && this.f37001b == bVar.f37001b && this.f37002c == bVar.f37002c && this.f37003d == bVar.f37003d && this.f37004e == bVar.f37004e) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            String str = this.f37000a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i11 = hashCode * 31;
            boolean z11 = this.f37001b;
            int i12 = z11;
            if (z11 != 0) {
                i12 = 1;
            }
            return ((((((i11 + i12) * 31) + this.f37002c.hashCode()) * 31) + Integer.hashCode(this.f37003d)) * 31) + Integer.hashCode(this.f37004e);
        }

        public String toString() {
            String str = this.f37000a;
            boolean z11 = this.f37001b;
            SearchSource searchSource = this.f37002c;
            int i11 = this.f37003d;
            int i12 = this.f37004e;
            return "ActionSearchFragmentToSearchFocusNavGraph(SEARCHKEYWORD=" + str + ", GOTOSEARCHRESULTS=" + z11 + ", SEARCHSOURCE=" + searchSource + ", SEARCHHISTORYCOUNT=" + i11 + ", SEARCHITEMORDER=" + i12 + ")";
        }

        public b(String str, boolean z11, SearchSource SEARCHSOURCE, int i11, int i12) {
            kotlin.jvm.internal.o.i(SEARCHSOURCE, "SEARCHSOURCE");
            this.f37000a = str;
            this.f37001b = z11;
            this.f37002c = SEARCHSOURCE;
            this.f37003d = i11;
            this.f37004e = i12;
            this.f37005f = r0.f70077t0;
        }

        public /* synthetic */ b(String str, boolean z11, SearchSource searchSource, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? false : z11, (i13 & 4) != 0 ? SearchSource.SEARCH_BAR : searchSource, (i13 & 8) != 0 ? 0 : i11, (i13 & 16) == 0 ? i12 : 0);
        }
    }

    /* compiled from: SearchFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ z3.n d(c cVar, String str, boolean z11, SearchSource searchSource, int i11, int i12, int i13, Object obj) {
            boolean z12;
            int i14;
            if ((i13 & 1) != 0) {
                str = null;
            }
            int i15 = 0;
            if ((i13 & 2) != 0) {
                z12 = false;
            } else {
                z12 = z11;
            }
            if ((i13 & 4) != 0) {
                searchSource = SearchSource.SEARCH_BAR;
            }
            SearchSource searchSource2 = searchSource;
            if ((i13 & 8) != 0) {
                i14 = 0;
            } else {
                i14 = i11;
            }
            if ((i13 & 16) == 0) {
                i15 = i12;
            }
            return cVar.c(str, z12, searchSource2, i14, i15);
        }

        public final z3.n a(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AdvancedSearchBody advancedSearchBody, AnalyticsListingsSource listingSource, String str3, int i12, SearchSource searchSource, int i13, int i14, boolean z11, int i15, AnalyticListingsPayload analyticListingsPayload) {
            kotlin.jvm.internal.o.i(listingTypes, "listingTypes");
            kotlin.jvm.internal.o.i(listingSource, "listingSource");
            kotlin.jvm.internal.o.i(searchSource, "searchSource");
            return new a(listingTypes, str, i11, str2, iArr, advancedSearchBody, listingSource, str3, i12, searchSource, i13, i14, z11, i15, analyticListingsPayload);
        }

        public final z3.n c(String str, boolean z11, SearchSource SEARCHSOURCE, int i11, int i12) {
            kotlin.jvm.internal.o.i(SEARCHSOURCE, "SEARCHSOURCE");
            return new b(str, z11, SEARCHSOURCE, i11, i12);
        }
    }
}
