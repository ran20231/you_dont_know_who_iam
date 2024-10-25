package com.forsale.app.features.categories.home.propertyhome;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.categories.normal.SubCategoryAnalyticsSource;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.analytics.AnalyticListingsPayload;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import com.forsale.app.utils.analytics.SearchSource;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import com.google.android.gms.ads.AdRequest;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.p0;
import t9.r0;
import z3.n;
/* compiled from: PropertyHomeFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final d f24983a = new d(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PropertyHomeFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f24984a;

        /* renamed from: b  reason: collision with root package name */
        private final String f24985b;

        /* renamed from: c  reason: collision with root package name */
        private final CategoryListingsAnalyticSource f24986c;

        /* renamed from: d  reason: collision with root package name */
        private final String f24987d;

        /* renamed from: e  reason: collision with root package name */
        private final ListingsIntention f24988e;

        /* renamed from: f  reason: collision with root package name */
        private final GetListingsBody.FiltrationData f24989f;

        /* renamed from: g  reason: collision with root package name */
        private final SearchSource f24990g;

        /* renamed from: h  reason: collision with root package name */
        private final SearchAnalyticsData f24991h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f24992i;

        /* renamed from: j  reason: collision with root package name */
        private final int f24993j;

        public a() {
            this(null, null, null, null, null, null, null, null, false, 511, null);
        }

        @Override // z3.n
        public int a() {
            return this.f24993j;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("parentCategory", this.f24984a);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("parentCategory", (Serializable) this.f24984a);
            }
            bundle.putString("CATEGORY_TITLE", this.f24985b);
            if (Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putParcelable("analyticSource", this.f24986c);
            } else if (Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f24986c);
            }
            bundle.putString("searchKeyword", this.f24987d);
            if (Parcelable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention = this.f24988e;
                o.g(listingsIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("intention", (Parcelable) listingsIntention);
            } else if (Serializable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention2 = this.f24988e;
                o.g(listingsIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("intention", listingsIntention2);
            }
            if (Parcelable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putParcelable("predefinedFilters", this.f24989f);
            } else if (Serializable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putSerializable("predefinedFilters", (Serializable) this.f24989f);
            }
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f24990g;
                o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f24990g;
                o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            if (Parcelable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putParcelable("searchAnalyticsData", this.f24991h);
            } else if (Serializable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putSerializable("searchAnalyticsData", (Serializable) this.f24991h);
            }
            bundle.putBoolean("fromBreadCrumbs", this.f24992i);
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
            if (o.d(this.f24984a, aVar.f24984a) && o.d(this.f24985b, aVar.f24985b) && o.d(this.f24986c, aVar.f24986c) && o.d(this.f24987d, aVar.f24987d) && this.f24988e == aVar.f24988e && o.d(this.f24989f, aVar.f24989f) && this.f24990g == aVar.f24990g && o.d(this.f24991h, aVar.f24991h) && this.f24992i == aVar.f24992i) {
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
            CategoryEntity categoryEntity = this.f24984a;
            int i11 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i12 = hashCode * 31;
            String str = this.f24985b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f24986c;
            if (categoryListingsAnalyticSource == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = categoryListingsAnalyticSource.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            String str2 = this.f24987d;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int hashCode6 = (((i14 + hashCode4) * 31) + this.f24988e.hashCode()) * 31;
            GetListingsBody.FiltrationData filtrationData = this.f24989f;
            if (filtrationData == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = filtrationData.hashCode();
            }
            int hashCode7 = (((hashCode6 + hashCode5) * 31) + this.f24990g.hashCode()) * 31;
            SearchAnalyticsData searchAnalyticsData = this.f24991h;
            if (searchAnalyticsData != null) {
                i11 = searchAnalyticsData.hashCode();
            }
            int i15 = (hashCode7 + i11) * 31;
            boolean z11 = this.f24992i;
            int i16 = z11;
            if (z11 != 0) {
                i16 = 1;
            }
            return i15 + i16;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f24984a;
            String str = this.f24985b;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f24986c;
            String str2 = this.f24987d;
            ListingsIntention listingsIntention = this.f24988e;
            GetListingsBody.FiltrationData filtrationData = this.f24989f;
            SearchSource searchSource = this.f24990g;
            SearchAnalyticsData searchAnalyticsData = this.f24991h;
            boolean z11 = this.f24992i;
            return "ActionPropertyHomeFragmentToCategoryListingsFragment(parentCategory=" + categoryEntity + ", CATEGORYTITLE=" + str + ", analyticSource=" + categoryListingsAnalyticSource + ", searchKeyword=" + str2 + ", intention=" + listingsIntention + ", predefinedFilters=" + filtrationData + ", searchSource=" + searchSource + ", searchAnalyticsData=" + searchAnalyticsData + ", fromBreadCrumbs=" + z11 + ")";
        }

        public a(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            this.f24984a = categoryEntity;
            this.f24985b = str;
            this.f24986c = categoryListingsAnalyticSource;
            this.f24987d = str2;
            this.f24988e = intention;
            this.f24989f = filtrationData;
            this.f24990g = searchSource;
            this.f24991h = searchAnalyticsData;
            this.f24992i = z11;
            this.f24993j = r0.f70025p0;
        }

        public /* synthetic */ a(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention listingsIntention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : categoryListingsAnalyticSource, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? ListingsIntention.LISTINGS : listingsIntention, (i11 & 32) != 0 ? null : filtrationData, (i11 & 64) != 0 ? SearchSource.NONE : searchSource, (i11 & 128) == 0 ? searchAnalyticsData : null, (i11 & 256) != 0 ? false : z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PropertyHomeFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        private final ListingsTypes f24994a;

        /* renamed from: b  reason: collision with root package name */
        private final String f24995b;

        /* renamed from: c  reason: collision with root package name */
        private final int f24996c;

        /* renamed from: d  reason: collision with root package name */
        private final String f24997d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f24998e;

        /* renamed from: f  reason: collision with root package name */
        private final AnalyticsListingsSource f24999f;

        /* renamed from: g  reason: collision with root package name */
        private final int f25000g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f25001h;

        /* renamed from: i  reason: collision with root package name */
        private final int f25002i;

        /* renamed from: j  reason: collision with root package name */
        private final int f25003j;

        /* renamed from: k  reason: collision with root package name */
        private final String f25004k;

        /* renamed from: l  reason: collision with root package name */
        private final SearchSource f25005l;

        /* renamed from: m  reason: collision with root package name */
        private final int f25006m;

        /* renamed from: n  reason: collision with root package name */
        private final AnalyticListingsPayload f25007n;

        /* renamed from: o  reason: collision with root package name */
        private final int f25008o;

        public b() {
            this(null, null, 0, null, null, null, 0, false, 0, 0, null, null, 0, null, 16383, null);
        }

        @Override // z3.n
        public int a() {
            return this.f25008o;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ListingsTypes.class)) {
                ListingsTypes listingsTypes = this.f24994a;
                o.g(listingsTypes, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("listingTypes", (Parcelable) listingsTypes);
            } else if (Serializable.class.isAssignableFrom(ListingsTypes.class)) {
                ListingsTypes listingsTypes2 = this.f24994a;
                o.g(listingsTypes2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("listingTypes", listingsTypes2);
            }
            bundle.putString("listingTitle", this.f24995b);
            bundle.putInt("wantedItemsCategoryId", this.f24996c);
            bundle.putString("wantedItemsSearchQuery", this.f24997d);
            bundle.putIntArray("districtIds", this.f24998e);
            if (Parcelable.class.isAssignableFrom(AnalyticsListingsSource.class)) {
                AnalyticsListingsSource analyticsListingsSource = this.f24999f;
                o.g(analyticsListingsSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("listingSource", (Parcelable) analyticsListingsSource);
            } else if (Serializable.class.isAssignableFrom(AnalyticsListingsSource.class)) {
                AnalyticsListingsSource analyticsListingsSource2 = this.f24999f;
                o.g(analyticsListingsSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("listingSource", analyticsListingsSource2);
            }
            bundle.putInt("categoryId", this.f25000g);
            bundle.putBoolean("showTitle", this.f25001h);
            bundle.putInt("topMargin", this.f25002i);
            bundle.putInt("advID", this.f25003j);
            bundle.putString("ownerPhone", this.f25004k);
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f25005l;
                o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f25005l;
                o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            bundle.putInt("searchHistoryCount", this.f25006m);
            if (Parcelable.class.isAssignableFrom(AnalyticListingsPayload.class)) {
                bundle.putParcelable("analyticListingsPayload", this.f25007n);
            } else if (Serializable.class.isAssignableFrom(AnalyticListingsPayload.class)) {
                bundle.putSerializable("analyticListingsPayload", (Serializable) this.f25007n);
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
            if (this.f24994a == bVar.f24994a && o.d(this.f24995b, bVar.f24995b) && this.f24996c == bVar.f24996c && o.d(this.f24997d, bVar.f24997d) && o.d(this.f24998e, bVar.f24998e) && this.f24999f == bVar.f24999f && this.f25000g == bVar.f25000g && this.f25001h == bVar.f25001h && this.f25002i == bVar.f25002i && this.f25003j == bVar.f25003j && o.d(this.f25004k, bVar.f25004k) && this.f25005l == bVar.f25005l && this.f25006m == bVar.f25006m && o.d(this.f25007n, bVar.f25007n)) {
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
            int hashCode5 = this.f24994a.hashCode() * 31;
            String str = this.f24995b;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode6 = (((hashCode5 + hashCode) * 31) + Integer.hashCode(this.f24996c)) * 31;
            String str2 = this.f24997d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i12 = (hashCode6 + hashCode2) * 31;
            int[] iArr = this.f24998e;
            if (iArr == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = Arrays.hashCode(iArr);
            }
            int hashCode7 = (((((i12 + hashCode3) * 31) + this.f24999f.hashCode()) * 31) + Integer.hashCode(this.f25000g)) * 31;
            boolean z11 = this.f25001h;
            int i13 = z11;
            if (z11 != 0) {
                i13 = 1;
            }
            int hashCode8 = (((((hashCode7 + i13) * 31) + Integer.hashCode(this.f25002i)) * 31) + Integer.hashCode(this.f25003j)) * 31;
            String str3 = this.f25004k;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int hashCode9 = (((((hashCode8 + hashCode4) * 31) + this.f25005l.hashCode()) * 31) + Integer.hashCode(this.f25006m)) * 31;
            AnalyticListingsPayload analyticListingsPayload = this.f25007n;
            if (analyticListingsPayload != null) {
                i11 = analyticListingsPayload.hashCode();
            }
            return hashCode9 + i11;
        }

        public String toString() {
            ListingsTypes listingsTypes = this.f24994a;
            String str = this.f24995b;
            int i11 = this.f24996c;
            String str2 = this.f24997d;
            String arrays = Arrays.toString(this.f24998e);
            AnalyticsListingsSource analyticsListingsSource = this.f24999f;
            int i12 = this.f25000g;
            boolean z11 = this.f25001h;
            int i13 = this.f25002i;
            int i14 = this.f25003j;
            String str3 = this.f25004k;
            SearchSource searchSource = this.f25005l;
            int i15 = this.f25006m;
            AnalyticListingsPayload analyticListingsPayload = this.f25007n;
            return "ActionPropertyHomeFragmentToGeneralListing(listingTypes=" + listingsTypes + ", listingTitle=" + str + ", wantedItemsCategoryId=" + i11 + ", wantedItemsSearchQuery=" + str2 + ", districtIds=" + arrays + ", listingSource=" + analyticsListingsSource + ", categoryId=" + i12 + ", showTitle=" + z11 + ", topMargin=" + i13 + ", advID=" + i14 + ", ownerPhone=" + str3 + ", searchSource=" + searchSource + ", searchHistoryCount=" + i15 + ", analyticListingsPayload=" + analyticListingsPayload + ")";
        }

        public b(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AnalyticsListingsSource listingSource, int i12, boolean z11, int i13, int i14, String str3, SearchSource searchSource, int i15, AnalyticListingsPayload analyticListingsPayload) {
            o.i(listingTypes, "listingTypes");
            o.i(listingSource, "listingSource");
            o.i(searchSource, "searchSource");
            this.f24994a = listingTypes;
            this.f24995b = str;
            this.f24996c = i11;
            this.f24997d = str2;
            this.f24998e = iArr;
            this.f24999f = listingSource;
            this.f25000g = i12;
            this.f25001h = z11;
            this.f25002i = i13;
            this.f25003j = i14;
            this.f25004k = str3;
            this.f25005l = searchSource;
            this.f25006m = i15;
            this.f25007n = analyticListingsPayload;
            this.f25008o = r0.f70038q0;
        }

        public /* synthetic */ b(ListingsTypes listingsTypes, String str, int i11, String str2, int[] iArr, AnalyticsListingsSource analyticsListingsSource, int i12, boolean z11, int i13, int i14, String str3, SearchSource searchSource, int i15, AnalyticListingsPayload analyticListingsPayload, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? ListingsTypes.USER_ITEMS : listingsTypes, (i16 & 2) != 0 ? null : str, (i16 & 4) != 0 ? -1 : i11, (i16 & 8) != 0 ? null : str2, (i16 & 16) != 0 ? null : iArr, (i16 & 32) != 0 ? AnalyticsListingsSource.MORE : analyticsListingsSource, (i16 & 64) != 0 ? -1 : i12, (i16 & 128) != 0 ? true : z11, (i16 & 256) != 0 ? p0.f69709i : i13, (i16 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? i14 : -1, (i16 & 1024) != 0 ? null : str3, (i16 & RecyclerView.l.FLAG_MOVED) != 0 ? SearchSource.SEARCH_BAR : searchSource, (i16 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 0 : i15, (i16 & 8192) == 0 ? analyticListingsPayload : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PropertyHomeFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.categories.home.propertyhome.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0273c implements n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f25009a;

        /* renamed from: b  reason: collision with root package name */
        private final String f25010b;

        /* renamed from: c  reason: collision with root package name */
        private final SubCategoriesPosition f25011c;

        /* renamed from: d  reason: collision with root package name */
        private final SubCategoryAnalyticsSource f25012d;

        /* renamed from: e  reason: collision with root package name */
        private final int f25013e;

        public C0273c() {
            this(null, null, null, null, 15, null);
        }

        @Override // z3.n
        public int a() {
            return this.f25013e;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("PARENT_CATEGORY", this.f25009a);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("PARENT_CATEGORY", (Serializable) this.f25009a);
            }
            bundle.putString("CATEGORY_TITLE", this.f25010b);
            if (Parcelable.class.isAssignableFrom(SubCategoriesPosition.class)) {
                SubCategoriesPosition subCategoriesPosition = this.f25011c;
                o.g(subCategoriesPosition, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("SUB_CATEGORIES_POSITION", (Parcelable) subCategoriesPosition);
            } else if (Serializable.class.isAssignableFrom(SubCategoriesPosition.class)) {
                SubCategoriesPosition subCategoriesPosition2 = this.f25011c;
                o.g(subCategoriesPosition2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("SUB_CATEGORIES_POSITION", subCategoriesPosition2);
            }
            if (Parcelable.class.isAssignableFrom(SubCategoryAnalyticsSource.class)) {
                bundle.putParcelable("analyticSource", this.f25012d);
            } else if (Serializable.class.isAssignableFrom(SubCategoryAnalyticsSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f25012d);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0273c)) {
                return false;
            }
            C0273c c0273c = (C0273c) obj;
            if (o.d(this.f25009a, c0273c.f25009a) && o.d(this.f25010b, c0273c.f25010b) && this.f25011c == c0273c.f25011c && o.d(this.f25012d, c0273c.f25012d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            CategoryEntity categoryEntity = this.f25009a;
            int i11 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i12 = hashCode * 31;
            String str = this.f25010b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int hashCode3 = (((i12 + hashCode2) * 31) + this.f25011c.hashCode()) * 31;
            SubCategoryAnalyticsSource subCategoryAnalyticsSource = this.f25012d;
            if (subCategoryAnalyticsSource != null) {
                i11 = subCategoryAnalyticsSource.hashCode();
            }
            return hashCode3 + i11;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f25009a;
            String str = this.f25010b;
            SubCategoriesPosition subCategoriesPosition = this.f25011c;
            SubCategoryAnalyticsSource subCategoryAnalyticsSource = this.f25012d;
            return "ActionPropertyHomeFragmentToSubCategoriesFragment(PARENTCATEGORY=" + categoryEntity + ", CATEGORYTITLE=" + str + ", SUBCATEGORIESPOSITION=" + subCategoriesPosition + ", analyticSource=" + subCategoryAnalyticsSource + ")";
        }

        public C0273c(CategoryEntity categoryEntity, String str, SubCategoriesPosition SUBCATEGORIESPOSITION, SubCategoryAnalyticsSource subCategoryAnalyticsSource) {
            o.i(SUBCATEGORIESPOSITION, "SUBCATEGORIESPOSITION");
            this.f25009a = categoryEntity;
            this.f25010b = str;
            this.f25011c = SUBCATEGORIESPOSITION;
            this.f25012d = subCategoryAnalyticsSource;
            this.f25013e = r0.f70051r0;
        }

        public /* synthetic */ C0273c(CategoryEntity categoryEntity, String str, SubCategoriesPosition subCategoriesPosition, SubCategoryAnalyticsSource subCategoryAnalyticsSource, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? SubCategoriesPosition.DEFAULT : subCategoriesPosition, (i11 & 8) != 0 ? null : subCategoryAnalyticsSource);
        }
    }

    /* compiled from: PropertyHomeFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n b(d dVar, CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention listingsIntention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                categoryEntity = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                categoryListingsAnalyticSource = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            if ((i11 & 16) != 0) {
                listingsIntention = ListingsIntention.LISTINGS;
            }
            if ((i11 & 32) != 0) {
                filtrationData = null;
            }
            if ((i11 & 64) != 0) {
                searchSource = SearchSource.NONE;
            }
            if ((i11 & 128) != 0) {
                searchAnalyticsData = null;
            }
            if ((i11 & 256) != 0) {
                z11 = false;
            }
            return dVar.a(categoryEntity, str, categoryListingsAnalyticSource, str2, listingsIntention, filtrationData, searchSource, searchAnalyticsData, z11);
        }

        public static /* synthetic */ n d(d dVar, ListingsTypes listingsTypes, String str, int i11, String str2, int[] iArr, AnalyticsListingsSource analyticsListingsSource, int i12, boolean z11, int i13, int i14, String str3, SearchSource searchSource, int i15, AnalyticListingsPayload analyticListingsPayload, int i16, Object obj) {
            ListingsTypes listingsTypes2;
            String str4;
            int i17;
            String str5;
            int[] iArr2;
            AnalyticsListingsSource analyticsListingsSource2;
            int i18;
            boolean z12;
            int i19;
            String str6;
            SearchSource searchSource2;
            int i21;
            if ((i16 & 1) != 0) {
                listingsTypes2 = ListingsTypes.USER_ITEMS;
            } else {
                listingsTypes2 = listingsTypes;
            }
            AnalyticListingsPayload analyticListingsPayload2 = null;
            if ((i16 & 2) != 0) {
                str4 = null;
            } else {
                str4 = str;
            }
            int i22 = -1;
            if ((i16 & 4) != 0) {
                i17 = -1;
            } else {
                i17 = i11;
            }
            if ((i16 & 8) != 0) {
                str5 = null;
            } else {
                str5 = str2;
            }
            if ((i16 & 16) != 0) {
                iArr2 = null;
            } else {
                iArr2 = iArr;
            }
            if ((i16 & 32) != 0) {
                analyticsListingsSource2 = AnalyticsListingsSource.MORE;
            } else {
                analyticsListingsSource2 = analyticsListingsSource;
            }
            if ((i16 & 64) != 0) {
                i18 = -1;
            } else {
                i18 = i12;
            }
            if ((i16 & 128) != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if ((i16 & 256) != 0) {
                i19 = p0.f69709i;
            } else {
                i19 = i13;
            }
            if ((i16 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
                i22 = i14;
            }
            if ((i16 & 1024) != 0) {
                str6 = null;
            } else {
                str6 = str3;
            }
            if ((i16 & RecyclerView.l.FLAG_MOVED) != 0) {
                searchSource2 = SearchSource.SEARCH_BAR;
            } else {
                searchSource2 = searchSource;
            }
            if ((i16 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                i21 = 0;
            } else {
                i21 = i15;
            }
            if ((i16 & 8192) == 0) {
                analyticListingsPayload2 = analyticListingsPayload;
            }
            return dVar.c(listingsTypes2, str4, i17, str5, iArr2, analyticsListingsSource2, i18, z12, i19, i22, str6, searchSource2, i21, analyticListingsPayload2);
        }

        public static /* synthetic */ n f(d dVar, CategoryEntity categoryEntity, String str, SubCategoriesPosition subCategoriesPosition, SubCategoryAnalyticsSource subCategoryAnalyticsSource, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                categoryEntity = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                subCategoriesPosition = SubCategoriesPosition.DEFAULT;
            }
            if ((i11 & 8) != 0) {
                subCategoryAnalyticsSource = null;
            }
            return dVar.e(categoryEntity, str, subCategoriesPosition, subCategoryAnalyticsSource);
        }

        public final n a(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            return new a(categoryEntity, str, categoryListingsAnalyticSource, str2, intention, filtrationData, searchSource, searchAnalyticsData, z11);
        }

        public final n c(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AnalyticsListingsSource listingSource, int i12, boolean z11, int i13, int i14, String str3, SearchSource searchSource, int i15, AnalyticListingsPayload analyticListingsPayload) {
            o.i(listingTypes, "listingTypes");
            o.i(listingSource, "listingSource");
            o.i(searchSource, "searchSource");
            return new b(listingTypes, str, i11, str2, iArr, listingSource, i12, z11, i13, i14, str3, searchSource, i15, analyticListingsPayload);
        }

        public final n e(CategoryEntity categoryEntity, String str, SubCategoriesPosition SUBCATEGORIESPOSITION, SubCategoryAnalyticsSource subCategoryAnalyticsSource) {
            o.i(SUBCATEGORIESPOSITION, "SUBCATEGORIESPOSITION");
            return new C0273c(categoryEntity, str, SUBCATEGORIESPOSITION, subCategoryAnalyticsSource);
        }
    }
}
