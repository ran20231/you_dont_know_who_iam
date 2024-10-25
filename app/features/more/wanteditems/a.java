package com.forsale.app.features.more.wanteditems;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.ProhibitedKeywordEntity;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.responses.ItemSubscriptionResponse;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.maincontainer.HomeToolbars;
import com.forsale.app.utils.analytics.AnalyticListingsPayload;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import com.forsale.app.utils.analytics.SearchSource;
import com.google.android.gms.ads.AdRequest;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import t9.p0;
import t9.r0;
import z3.n;
/* compiled from: WantedItemsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a */
    public static final d f33797a = new d(null);

    /* compiled from: WantedItemsFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.more.wanteditems.a$a */
    /* loaded from: classes2.dex */
    public static final class C0368a implements n {

        /* renamed from: a */
        private final CategoryEntity f33798a;

        /* renamed from: b */
        private final String f33799b;

        /* renamed from: c */
        private final DistrictEntity f33800c;

        /* renamed from: d */
        private final int f33801d;

        public C0368a() {
            this(null, null, null, 7, null);
        }

        @Override // z3.n
        public int a() {
            return this.f33801d;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("categoryEntity", this.f33798a);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("categoryEntity", (Serializable) this.f33798a);
            }
            bundle.putString(ProhibitedKeywordEntity.KEYWORD, this.f33799b);
            if (Parcelable.class.isAssignableFrom(DistrictEntity.class)) {
                bundle.putParcelable("districtEntity", (Parcelable) this.f33800c);
            } else if (Serializable.class.isAssignableFrom(DistrictEntity.class)) {
                bundle.putSerializable("districtEntity", this.f33800c);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0368a)) {
                return false;
            }
            C0368a c0368a = (C0368a) obj;
            if (o.d(this.f33798a, c0368a.f33798a) && o.d(this.f33799b, c0368a.f33799b) && o.d(this.f33800c, c0368a.f33800c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            CategoryEntity categoryEntity = this.f33798a;
            int i11 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i12 = hashCode * 31;
            String str = this.f33799b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            DistrictEntity districtEntity = this.f33800c;
            if (districtEntity != null) {
                i11 = districtEntity.hashCode();
            }
            return i13 + i11;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f33798a;
            String str = this.f33799b;
            DistrictEntity districtEntity = this.f33800c;
            return "ActionWantedItemsFragmentToAddWantedItemBottomSheet(categoryEntity=" + categoryEntity + ", keyword=" + str + ", districtEntity=" + districtEntity + ")";
        }

        public C0368a(CategoryEntity categoryEntity, String str, DistrictEntity districtEntity) {
            this.f33798a = categoryEntity;
            this.f33799b = str;
            this.f33800c = districtEntity;
            this.f33801d = r0.f70155z0;
        }

        public /* synthetic */ C0368a(CategoryEntity categoryEntity, String str, DistrictEntity districtEntity, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : districtEntity);
        }
    }

    /* compiled from: WantedItemsFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class b implements n {

        /* renamed from: a */
        private final ItemSubscriptionResponse f33802a;

        /* renamed from: b */
        private final int f33803b;

        public b(ItemSubscriptionResponse itemSubscription) {
            o.i(itemSubscription, "itemSubscription");
            this.f33802a = itemSubscription;
            this.f33803b = r0.A0;
        }

        @Override // z3.n
        public int a() {
            return this.f33803b;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ItemSubscriptionResponse.class)) {
                ItemSubscriptionResponse itemSubscriptionResponse = this.f33802a;
                o.g(itemSubscriptionResponse, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("itemSubscription", itemSubscriptionResponse);
            } else if (Serializable.class.isAssignableFrom(ItemSubscriptionResponse.class)) {
                ItemSubscriptionResponse itemSubscriptionResponse2 = this.f33802a;
                o.g(itemSubscriptionResponse2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("itemSubscription", (Serializable) itemSubscriptionResponse2);
            } else {
                String name = ItemSubscriptionResponse.class.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && o.d(this.f33802a, ((b) obj).f33802a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f33802a.hashCode();
        }

        public String toString() {
            ItemSubscriptionResponse itemSubscriptionResponse = this.f33802a;
            return "ActionWantedItemsFragmentToDeleteWantedItemBottomSheet(itemSubscription=" + itemSubscriptionResponse + ")";
        }
    }

    /* compiled from: WantedItemsFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class c implements n {

        /* renamed from: a */
        private final ListingsTypes f33804a;

        /* renamed from: b */
        private final String f33805b;

        /* renamed from: c */
        private final int f33806c;

        /* renamed from: d */
        private final String f33807d;

        /* renamed from: e */
        private final int[] f33808e;

        /* renamed from: f */
        private final AdvancedSearchBody f33809f;

        /* renamed from: g */
        private final AnalyticsListingsSource f33810g;

        /* renamed from: h */
        private final String f33811h;

        /* renamed from: i */
        private final int f33812i;

        /* renamed from: j */
        private final int f33813j;

        /* renamed from: k */
        private final boolean f33814k;

        /* renamed from: l */
        private final int f33815l;

        /* renamed from: m */
        private final SearchSource f33816m;

        /* renamed from: n */
        private final int f33817n;

        /* renamed from: o */
        private final HomeToolbars f33818o;

        /* renamed from: p */
        private final boolean f33819p;

        /* renamed from: q */
        private final AnalyticListingsPayload f33820q;

        /* renamed from: r */
        private final int f33821r;

        public c() {
            this(null, null, 0, null, null, null, null, null, 0, 0, false, 0, null, 0, null, false, null, 131071, null);
        }

        @Override // z3.n
        public int a() {
            return this.f33821r;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ListingsTypes.class)) {
                ListingsTypes listingsTypes = this.f33804a;
                o.g(listingsTypes, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("listingTypes", (Parcelable) listingsTypes);
            } else if (Serializable.class.isAssignableFrom(ListingsTypes.class)) {
                ListingsTypes listingsTypes2 = this.f33804a;
                o.g(listingsTypes2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("listingTypes", listingsTypes2);
            }
            bundle.putString("listingTitle", this.f33805b);
            bundle.putInt("wantedItemsCategoryId", this.f33806c);
            bundle.putString("wantedItemsSearchQuery", this.f33807d);
            bundle.putIntArray("districtIds", this.f33808e);
            if (Parcelable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                bundle.putParcelable("searchBody", this.f33809f);
            } else if (Serializable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                bundle.putSerializable("searchBody", (Serializable) this.f33809f);
            }
            if (Parcelable.class.isAssignableFrom(AnalyticsListingsSource.class)) {
                AnalyticsListingsSource analyticsListingsSource = this.f33810g;
                o.g(analyticsListingsSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("listingSource", (Parcelable) analyticsListingsSource);
            } else if (Serializable.class.isAssignableFrom(AnalyticsListingsSource.class)) {
                AnalyticsListingsSource analyticsListingsSource2 = this.f33810g;
                o.g(analyticsListingsSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("listingSource", analyticsListingsSource2);
            }
            bundle.putString("ownerPhone", this.f33811h);
            bundle.putInt("advID", this.f33812i);
            bundle.putInt("categoryId", this.f33813j);
            bundle.putBoolean("showTitle", this.f33814k);
            bundle.putInt("topMargin", this.f33815l);
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f33816m;
                o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f33816m;
                o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            bundle.putInt("searchHistoryCount", this.f33817n);
            if (Parcelable.class.isAssignableFrom(HomeToolbars.class)) {
                HomeToolbars homeToolbars = this.f33818o;
                o.g(homeToolbars, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("toolbarType", (Parcelable) homeToolbars);
            } else if (Serializable.class.isAssignableFrom(HomeToolbars.class)) {
                HomeToolbars homeToolbars2 = this.f33818o;
                o.g(homeToolbars2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("toolbarType", homeToolbars2);
            }
            bundle.putBoolean("hasBottomNavigation", this.f33819p);
            if (Parcelable.class.isAssignableFrom(AnalyticListingsPayload.class)) {
                bundle.putParcelable("analyticListingsPayload", this.f33820q);
            } else if (Serializable.class.isAssignableFrom(AnalyticListingsPayload.class)) {
                bundle.putSerializable("analyticListingsPayload", (Serializable) this.f33820q);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f33804a == cVar.f33804a && o.d(this.f33805b, cVar.f33805b) && this.f33806c == cVar.f33806c && o.d(this.f33807d, cVar.f33807d) && o.d(this.f33808e, cVar.f33808e) && o.d(this.f33809f, cVar.f33809f) && this.f33810g == cVar.f33810g && o.d(this.f33811h, cVar.f33811h) && this.f33812i == cVar.f33812i && this.f33813j == cVar.f33813j && this.f33814k == cVar.f33814k && this.f33815l == cVar.f33815l && this.f33816m == cVar.f33816m && this.f33817n == cVar.f33817n && this.f33818o == cVar.f33818o && this.f33819p == cVar.f33819p && o.d(this.f33820q, cVar.f33820q)) {
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
            int hashCode6 = this.f33804a.hashCode() * 31;
            String str = this.f33805b;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode7 = (((hashCode6 + hashCode) * 31) + Integer.hashCode(this.f33806c)) * 31;
            String str2 = this.f33807d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i12 = (hashCode7 + hashCode2) * 31;
            int[] iArr = this.f33808e;
            if (iArr == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = Arrays.hashCode(iArr);
            }
            int i13 = (i12 + hashCode3) * 31;
            AdvancedSearchBody advancedSearchBody = this.f33809f;
            if (advancedSearchBody == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = advancedSearchBody.hashCode();
            }
            int hashCode8 = (((i13 + hashCode4) * 31) + this.f33810g.hashCode()) * 31;
            String str3 = this.f33811h;
            if (str3 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str3.hashCode();
            }
            int hashCode9 = (((((hashCode8 + hashCode5) * 31) + Integer.hashCode(this.f33812i)) * 31) + Integer.hashCode(this.f33813j)) * 31;
            boolean z11 = this.f33814k;
            int i14 = 1;
            int i15 = z11;
            if (z11 != 0) {
                i15 = 1;
            }
            int hashCode10 = (((((((((hashCode9 + i15) * 31) + Integer.hashCode(this.f33815l)) * 31) + this.f33816m.hashCode()) * 31) + Integer.hashCode(this.f33817n)) * 31) + this.f33818o.hashCode()) * 31;
            boolean z12 = this.f33819p;
            if (!z12) {
                i14 = z12 ? 1 : 0;
            }
            int i16 = (hashCode10 + i14) * 31;
            AnalyticListingsPayload analyticListingsPayload = this.f33820q;
            if (analyticListingsPayload != null) {
                i11 = analyticListingsPayload.hashCode();
            }
            return i16 + i11;
        }

        public String toString() {
            ListingsTypes listingsTypes = this.f33804a;
            String str = this.f33805b;
            int i11 = this.f33806c;
            String str2 = this.f33807d;
            String arrays = Arrays.toString(this.f33808e);
            AdvancedSearchBody advancedSearchBody = this.f33809f;
            AnalyticsListingsSource analyticsListingsSource = this.f33810g;
            String str3 = this.f33811h;
            int i12 = this.f33812i;
            int i13 = this.f33813j;
            boolean z11 = this.f33814k;
            int i14 = this.f33815l;
            SearchSource searchSource = this.f33816m;
            int i15 = this.f33817n;
            HomeToolbars homeToolbars = this.f33818o;
            boolean z12 = this.f33819p;
            AnalyticListingsPayload analyticListingsPayload = this.f33820q;
            return "ActionWantedItemsFragmentToGeneralListingsFragment(listingTypes=" + listingsTypes + ", listingTitle=" + str + ", wantedItemsCategoryId=" + i11 + ", wantedItemsSearchQuery=" + str2 + ", districtIds=" + arrays + ", searchBody=" + advancedSearchBody + ", listingSource=" + analyticsListingsSource + ", ownerPhone=" + str3 + ", advID=" + i12 + ", categoryId=" + i13 + ", showTitle=" + z11 + ", topMargin=" + i14 + ", searchSource=" + searchSource + ", searchHistoryCount=" + i15 + ", toolbarType=" + homeToolbars + ", hasBottomNavigation=" + z12 + ", analyticListingsPayload=" + analyticListingsPayload + ")";
        }

        public c(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AdvancedSearchBody advancedSearchBody, AnalyticsListingsSource listingSource, String str3, int i12, int i13, boolean z11, int i14, SearchSource searchSource, int i15, HomeToolbars toolbarType, boolean z12, AnalyticListingsPayload analyticListingsPayload) {
            o.i(listingTypes, "listingTypes");
            o.i(listingSource, "listingSource");
            o.i(searchSource, "searchSource");
            o.i(toolbarType, "toolbarType");
            this.f33804a = listingTypes;
            this.f33805b = str;
            this.f33806c = i11;
            this.f33807d = str2;
            this.f33808e = iArr;
            this.f33809f = advancedSearchBody;
            this.f33810g = listingSource;
            this.f33811h = str3;
            this.f33812i = i12;
            this.f33813j = i13;
            this.f33814k = z11;
            this.f33815l = i14;
            this.f33816m = searchSource;
            this.f33817n = i15;
            this.f33818o = toolbarType;
            this.f33819p = z12;
            this.f33820q = analyticListingsPayload;
            this.f33821r = r0.B0;
        }

        public /* synthetic */ c(ListingsTypes listingsTypes, String str, int i11, String str2, int[] iArr, AdvancedSearchBody advancedSearchBody, AnalyticsListingsSource analyticsListingsSource, String str3, int i12, int i13, boolean z11, int i14, SearchSource searchSource, int i15, HomeToolbars homeToolbars, boolean z12, AnalyticListingsPayload analyticListingsPayload, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? ListingsTypes.NORMAL_LISTINGS : listingsTypes, (i16 & 2) != 0 ? null : str, (i16 & 4) != 0 ? -1 : i11, (i16 & 8) != 0 ? null : str2, (i16 & 16) != 0 ? null : iArr, (i16 & 32) != 0 ? null : advancedSearchBody, (i16 & 64) != 0 ? AnalyticsListingsSource.MORE : analyticsListingsSource, (i16 & 128) != 0 ? null : str3, (i16 & 256) != 0 ? -1 : i12, (i16 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? i13 : -1, (i16 & 1024) != 0 ? true : z11, (i16 & RecyclerView.l.FLAG_MOVED) != 0 ? p0.f69709i : i14, (i16 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? SearchSource.SEARCH_BAR : searchSource, (i16 & 8192) != 0 ? 0 : i15, (i16 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? HomeToolbars.SUB_CATEGORY_TOOLBAR : homeToolbars, (i16 & 32768) == 0 ? z12 : false, (i16 & 65536) != 0 ? null : analyticListingsPayload);
        }
    }

    /* compiled from: WantedItemsFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n b(d dVar, CategoryEntity categoryEntity, String str, DistrictEntity districtEntity, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                categoryEntity = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                districtEntity = null;
            }
            return dVar.a(categoryEntity, str, districtEntity);
        }

        public final n a(CategoryEntity categoryEntity, String str, DistrictEntity districtEntity) {
            return new C0368a(categoryEntity, str, districtEntity);
        }

        public final n c(ItemSubscriptionResponse itemSubscription) {
            o.i(itemSubscription, "itemSubscription");
            return new b(itemSubscription);
        }

        public final n d(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AdvancedSearchBody advancedSearchBody, AnalyticsListingsSource listingSource, String str3, int i12, int i13, boolean z11, int i14, SearchSource searchSource, int i15, HomeToolbars toolbarType, boolean z12, AnalyticListingsPayload analyticListingsPayload) {
            o.i(listingTypes, "listingTypes");
            o.i(listingSource, "listingSource");
            o.i(searchSource, "searchSource");
            o.i(toolbarType, "toolbarType");
            return new c(listingTypes, str, i11, str2, iArr, advancedSearchBody, listingSource, str3, i12, i13, z11, i14, searchSource, i15, toolbarType, z12, analyticListingsPayload);
        }
    }
}
