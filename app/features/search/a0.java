package com.forsale.app.features.search;

import android.os.Bundle;
import android.os.Parcelable;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.app.utils.analytics.SearchSource;
import com.google.android.gms.ads.AdRequest;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.r0;
/* compiled from: SearchFocusFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c f36940a = new c(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SearchFocusFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class a implements z3.n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f36941a;

        /* renamed from: b  reason: collision with root package name */
        private final HomeVisitedSources f36942b;

        /* renamed from: c  reason: collision with root package name */
        private final CategoryListingsAnalyticSource f36943c;

        /* renamed from: d  reason: collision with root package name */
        private final int f36944d;

        public a(CategoryEntity category, HomeVisitedSources verticalSource, CategoryListingsAnalyticSource categoryListingsAnalyticSource) {
            kotlin.jvm.internal.o.i(category, "category");
            kotlin.jvm.internal.o.i(verticalSource, "verticalSource");
            this.f36941a = category;
            this.f36942b = verticalSource;
            this.f36943c = categoryListingsAnalyticSource;
            this.f36944d = r0.f69868d;
        }

        @Override // z3.n
        public int a() {
            return this.f36944d;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                CategoryEntity categoryEntity = this.f36941a;
                kotlin.jvm.internal.o.g(categoryEntity, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("category", categoryEntity);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                CategoryEntity categoryEntity2 = this.f36941a;
                kotlin.jvm.internal.o.g(categoryEntity2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("category", (Serializable) categoryEntity2);
            } else {
                String name = CategoryEntity.class.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            if (Parcelable.class.isAssignableFrom(HomeVisitedSources.class)) {
                HomeVisitedSources homeVisitedSources = this.f36942b;
                kotlin.jvm.internal.o.g(homeVisitedSources, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("verticalSource", (Parcelable) homeVisitedSources);
            } else if (Serializable.class.isAssignableFrom(HomeVisitedSources.class)) {
                HomeVisitedSources homeVisitedSources2 = this.f36942b;
                kotlin.jvm.internal.o.g(homeVisitedSources2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("verticalSource", homeVisitedSources2);
            }
            if (Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putParcelable("analyticSource", this.f36943c);
            } else if (Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f36943c);
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
            if (kotlin.jvm.internal.o.d(this.f36941a, aVar.f36941a) && this.f36942b == aVar.f36942b && kotlin.jvm.internal.o.d(this.f36943c, aVar.f36943c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f36941a.hashCode() * 31) + this.f36942b.hashCode()) * 31;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f36943c;
            if (categoryListingsAnalyticSource == null) {
                hashCode = 0;
            } else {
                hashCode = categoryListingsAnalyticSource.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f36941a;
            HomeVisitedSources homeVisitedSources = this.f36942b;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f36943c;
            return "ActionSearchFocusFragmentToAllVerticalsFragment(category=" + categoryEntity + ", verticalSource=" + homeVisitedSources + ", analyticSource=" + categoryListingsAnalyticSource + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SearchFocusFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class b implements z3.n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f36945a;

        /* renamed from: b  reason: collision with root package name */
        private final String f36946b;

        /* renamed from: c  reason: collision with root package name */
        private final String f36947c;

        /* renamed from: d  reason: collision with root package name */
        private final ListingsIntention f36948d;

        /* renamed from: e  reason: collision with root package name */
        private final AdvancedSearchBody f36949e;

        /* renamed from: f  reason: collision with root package name */
        private final CategoryListingsAnalyticSource f36950f;

        /* renamed from: g  reason: collision with root package name */
        private final GetListingsBody.FiltrationData f36951g;

        /* renamed from: h  reason: collision with root package name */
        private final SearchSource f36952h;

        /* renamed from: i  reason: collision with root package name */
        private final SearchAnalyticsData f36953i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f36954j;

        /* renamed from: k  reason: collision with root package name */
        private final int f36955k;

        public b() {
            this(null, null, null, null, null, null, null, null, null, false, 1023, null);
        }

        @Override // z3.n
        public int a() {
            return this.f36955k;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("parentCategory", this.f36945a);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("parentCategory", (Serializable) this.f36945a);
            }
            bundle.putString("CATEGORY_TITLE", this.f36946b);
            bundle.putString("searchKeyword", this.f36947c);
            if (Parcelable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention = this.f36948d;
                kotlin.jvm.internal.o.g(listingsIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("intention", (Parcelable) listingsIntention);
            } else if (Serializable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention2 = this.f36948d;
                kotlin.jvm.internal.o.g(listingsIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("intention", listingsIntention2);
            }
            if (Parcelable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                bundle.putParcelable("initAdvancedSearchBody", this.f36949e);
            } else if (Serializable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                bundle.putSerializable("initAdvancedSearchBody", (Serializable) this.f36949e);
            }
            if (Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putParcelable("analyticSource", this.f36950f);
            } else if (Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f36950f);
            }
            if (Parcelable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putParcelable("predefinedFilters", this.f36951g);
            } else if (Serializable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putSerializable("predefinedFilters", (Serializable) this.f36951g);
            }
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f36952h;
                kotlin.jvm.internal.o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f36952h;
                kotlin.jvm.internal.o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            if (Parcelable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putParcelable("searchAnalyticsData", this.f36953i);
            } else if (Serializable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putSerializable("searchAnalyticsData", (Serializable) this.f36953i);
            }
            bundle.putBoolean("fromBreadCrumbs", this.f36954j);
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
            if (kotlin.jvm.internal.o.d(this.f36945a, bVar.f36945a) && kotlin.jvm.internal.o.d(this.f36946b, bVar.f36946b) && kotlin.jvm.internal.o.d(this.f36947c, bVar.f36947c) && this.f36948d == bVar.f36948d && kotlin.jvm.internal.o.d(this.f36949e, bVar.f36949e) && kotlin.jvm.internal.o.d(this.f36950f, bVar.f36950f) && kotlin.jvm.internal.o.d(this.f36951g, bVar.f36951g) && this.f36952h == bVar.f36952h && kotlin.jvm.internal.o.d(this.f36953i, bVar.f36953i) && this.f36954j == bVar.f36954j) {
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
            int hashCode6;
            CategoryEntity categoryEntity = this.f36945a;
            int i11 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i12 = hashCode * 31;
            String str = this.f36946b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str2 = this.f36947c;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int hashCode7 = (((i13 + hashCode3) * 31) + this.f36948d.hashCode()) * 31;
            AdvancedSearchBody advancedSearchBody = this.f36949e;
            if (advancedSearchBody == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = advancedSearchBody.hashCode();
            }
            int i14 = (hashCode7 + hashCode4) * 31;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f36950f;
            if (categoryListingsAnalyticSource == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = categoryListingsAnalyticSource.hashCode();
            }
            int i15 = (i14 + hashCode5) * 31;
            GetListingsBody.FiltrationData filtrationData = this.f36951g;
            if (filtrationData == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = filtrationData.hashCode();
            }
            int hashCode8 = (((i15 + hashCode6) * 31) + this.f36952h.hashCode()) * 31;
            SearchAnalyticsData searchAnalyticsData = this.f36953i;
            if (searchAnalyticsData != null) {
                i11 = searchAnalyticsData.hashCode();
            }
            int i16 = (hashCode8 + i11) * 31;
            boolean z11 = this.f36954j;
            int i17 = z11;
            if (z11 != 0) {
                i17 = 1;
            }
            return i16 + i17;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f36945a;
            String str = this.f36946b;
            String str2 = this.f36947c;
            ListingsIntention listingsIntention = this.f36948d;
            AdvancedSearchBody advancedSearchBody = this.f36949e;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f36950f;
            GetListingsBody.FiltrationData filtrationData = this.f36951g;
            SearchSource searchSource = this.f36952h;
            SearchAnalyticsData searchAnalyticsData = this.f36953i;
            boolean z11 = this.f36954j;
            return "ActionSearchFocusFragmentToCategoryListingsFragment(parentCategory=" + categoryEntity + ", CATEGORYTITLE=" + str + ", searchKeyword=" + str2 + ", intention=" + listingsIntention + ", initAdvancedSearchBody=" + advancedSearchBody + ", analyticSource=" + categoryListingsAnalyticSource + ", predefinedFilters=" + filtrationData + ", searchSource=" + searchSource + ", searchAnalyticsData=" + searchAnalyticsData + ", fromBreadCrumbs=" + z11 + ")";
        }

        public b(CategoryEntity categoryEntity, String str, String str2, ListingsIntention intention, AdvancedSearchBody advancedSearchBody, CategoryListingsAnalyticSource categoryListingsAnalyticSource, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            kotlin.jvm.internal.o.i(intention, "intention");
            kotlin.jvm.internal.o.i(searchSource, "searchSource");
            this.f36945a = categoryEntity;
            this.f36946b = str;
            this.f36947c = str2;
            this.f36948d = intention;
            this.f36949e = advancedSearchBody;
            this.f36950f = categoryListingsAnalyticSource;
            this.f36951g = filtrationData;
            this.f36952h = searchSource;
            this.f36953i = searchAnalyticsData;
            this.f36954j = z11;
            this.f36955k = r0.f69881e;
        }

        public /* synthetic */ b(CategoryEntity categoryEntity, String str, String str2, ListingsIntention listingsIntention, AdvancedSearchBody advancedSearchBody, CategoryListingsAnalyticSource categoryListingsAnalyticSource, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? ListingsIntention.LISTINGS : listingsIntention, (i11 & 16) != 0 ? null : advancedSearchBody, (i11 & 32) != 0 ? null : categoryListingsAnalyticSource, (i11 & 64) != 0 ? null : filtrationData, (i11 & 128) != 0 ? SearchSource.NONE : searchSource, (i11 & 256) == 0 ? searchAnalyticsData : null, (i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? false : z11);
        }
    }

    /* compiled from: SearchFocusFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ z3.n b(c cVar, CategoryEntity categoryEntity, HomeVisitedSources homeVisitedSources, CategoryListingsAnalyticSource categoryListingsAnalyticSource, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                homeVisitedSources = HomeVisitedSources.HOME_PAGE;
            }
            if ((i11 & 4) != 0) {
                categoryListingsAnalyticSource = null;
            }
            return cVar.a(categoryEntity, homeVisitedSources, categoryListingsAnalyticSource);
        }

        public static /* synthetic */ z3.n d(c cVar, CategoryEntity categoryEntity, String str, String str2, ListingsIntention listingsIntention, AdvancedSearchBody advancedSearchBody, CategoryListingsAnalyticSource categoryListingsAnalyticSource, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                categoryEntity = null;
            }
            if ((i11 & 2) != 0) {
                str = null;
            }
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            if ((i11 & 8) != 0) {
                listingsIntention = ListingsIntention.LISTINGS;
            }
            if ((i11 & 16) != 0) {
                advancedSearchBody = null;
            }
            if ((i11 & 32) != 0) {
                categoryListingsAnalyticSource = null;
            }
            if ((i11 & 64) != 0) {
                filtrationData = null;
            }
            if ((i11 & 128) != 0) {
                searchSource = SearchSource.NONE;
            }
            if ((i11 & 256) != 0) {
                searchAnalyticsData = null;
            }
            if ((i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                z11 = false;
            }
            return cVar.c(categoryEntity, str, str2, listingsIntention, advancedSearchBody, categoryListingsAnalyticSource, filtrationData, searchSource, searchAnalyticsData, z11);
        }

        public final z3.n a(CategoryEntity category, HomeVisitedSources verticalSource, CategoryListingsAnalyticSource categoryListingsAnalyticSource) {
            kotlin.jvm.internal.o.i(category, "category");
            kotlin.jvm.internal.o.i(verticalSource, "verticalSource");
            return new a(category, verticalSource, categoryListingsAnalyticSource);
        }

        public final z3.n c(CategoryEntity categoryEntity, String str, String str2, ListingsIntention intention, AdvancedSearchBody advancedSearchBody, CategoryListingsAnalyticSource categoryListingsAnalyticSource, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            kotlin.jvm.internal.o.i(intention, "intention");
            kotlin.jvm.internal.o.i(searchSource, "searchSource");
            return new b(categoryEntity, str, str2, intention, advancedSearchBody, categoryListingsAnalyticSource, filtrationData, searchSource, searchAnalyticsData, z11);
        }
    }
}
