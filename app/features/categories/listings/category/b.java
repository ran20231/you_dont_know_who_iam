package com.forsale.app.features.categories.listings.category;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.AllFiltersPayload;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.app.utils.analytics.SearchSource;
import com.google.android.gms.ads.AdRequest;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.r0;
import z3.n;
/* compiled from: CategoryListingsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final d f28671a = new d(null);

    /* compiled from: CategoryListingsFragmentDirections.kt */
    /* loaded from: classes2.dex */
    private static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f28672a;

        /* renamed from: b  reason: collision with root package name */
        private final String f28673b;

        /* renamed from: c  reason: collision with root package name */
        private final ListingsIntention f28674c;

        /* renamed from: d  reason: collision with root package name */
        private final GetListingsBody.FiltrationData f28675d;

        /* renamed from: e  reason: collision with root package name */
        private final SearchSource f28676e;

        /* renamed from: f  reason: collision with root package name */
        private final SearchAnalyticsData f28677f;

        /* renamed from: g  reason: collision with root package name */
        private final int f28678g;

        public a() {
            this(null, null, null, null, null, null, 63, null);
        }

        @Override // z3.n
        public int a() {
            return this.f28678g;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("parentCategory", this.f28672a);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("parentCategory", (Serializable) this.f28672a);
            }
            bundle.putString("searchKeyword", this.f28673b);
            if (Parcelable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention = this.f28674c;
                o.g(listingsIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("intention", (Parcelable) listingsIntention);
            } else if (Serializable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention2 = this.f28674c;
                o.g(listingsIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("intention", listingsIntention2);
            }
            if (Parcelable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putParcelable("predefinedFilters", this.f28675d);
            } else if (Serializable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putSerializable("predefinedFilters", (Serializable) this.f28675d);
            }
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f28676e;
                o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f28676e;
                o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            if (Parcelable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putParcelable("searchAnalyticsData", this.f28677f);
            } else if (Serializable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putSerializable("searchAnalyticsData", (Serializable) this.f28677f);
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
            if (o.d(this.f28672a, aVar.f28672a) && o.d(this.f28673b, aVar.f28673b) && this.f28674c == aVar.f28674c && o.d(this.f28675d, aVar.f28675d) && this.f28676e == aVar.f28676e && o.d(this.f28677f, aVar.f28677f)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            CategoryEntity categoryEntity = this.f28672a;
            int i11 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i12 = hashCode * 31;
            String str = this.f28673b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int hashCode4 = (((i12 + hashCode2) * 31) + this.f28674c.hashCode()) * 31;
            GetListingsBody.FiltrationData filtrationData = this.f28675d;
            if (filtrationData == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = filtrationData.hashCode();
            }
            int hashCode5 = (((hashCode4 + hashCode3) * 31) + this.f28676e.hashCode()) * 31;
            SearchAnalyticsData searchAnalyticsData = this.f28677f;
            if (searchAnalyticsData != null) {
                i11 = searchAnalyticsData.hashCode();
            }
            return hashCode5 + i11;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f28672a;
            String str = this.f28673b;
            ListingsIntention listingsIntention = this.f28674c;
            GetListingsBody.FiltrationData filtrationData = this.f28675d;
            SearchSource searchSource = this.f28676e;
            SearchAnalyticsData searchAnalyticsData = this.f28677f;
            return "ActionCategoryListingsFragmentSelf(parentCategory=" + categoryEntity + ", searchKeyword=" + str + ", intention=" + listingsIntention + ", predefinedFilters=" + filtrationData + ", searchSource=" + searchSource + ", searchAnalyticsData=" + searchAnalyticsData + ")";
        }

        public a(CategoryEntity categoryEntity, String str, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            this.f28672a = categoryEntity;
            this.f28673b = str;
            this.f28674c = intention;
            this.f28675d = filtrationData;
            this.f28676e = searchSource;
            this.f28677f = searchAnalyticsData;
            this.f28678g = r0.f69985m;
        }

        public /* synthetic */ a(CategoryEntity categoryEntity, String str, ListingsIntention listingsIntention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? ListingsIntention.LISTINGS : listingsIntention, (i11 & 8) != 0 ? null : filtrationData, (i11 & 16) != 0 ? SearchSource.NONE : searchSource, (i11 & 32) != 0 ? null : searchAnalyticsData);
        }
    }

    /* compiled from: CategoryListingsFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.categories.listings.category.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private static final class C0312b implements n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f28679a;

        /* renamed from: b  reason: collision with root package name */
        private final HomeVisitedSources f28680b;

        /* renamed from: c  reason: collision with root package name */
        private final int f28681c;

        public C0312b() {
            this(null, null, 3, null);
        }

        @Override // z3.n
        public int a() {
            return this.f28681c;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("category", this.f28679a);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("category", (Serializable) this.f28679a);
            }
            if (Parcelable.class.isAssignableFrom(HomeVisitedSources.class)) {
                HomeVisitedSources homeVisitedSources = this.f28680b;
                o.g(homeVisitedSources, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("verticalSource", (Parcelable) homeVisitedSources);
            } else if (Serializable.class.isAssignableFrom(HomeVisitedSources.class)) {
                HomeVisitedSources homeVisitedSources2 = this.f28680b;
                o.g(homeVisitedSources2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("verticalSource", homeVisitedSources2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0312b)) {
                return false;
            }
            C0312b c0312b = (C0312b) obj;
            if (o.d(this.f28679a, c0312b.f28679a) && this.f28680b == c0312b.f28680b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            CategoryEntity categoryEntity = this.f28679a;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            return (hashCode * 31) + this.f28680b.hashCode();
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f28679a;
            HomeVisitedSources homeVisitedSources = this.f28680b;
            return "ActionCategoryListingsFragmentToAllVerticalsFragment(category=" + categoryEntity + ", verticalSource=" + homeVisitedSources + ")";
        }

        public C0312b(CategoryEntity categoryEntity, HomeVisitedSources verticalSource) {
            o.i(verticalSource, "verticalSource");
            this.f28679a = categoryEntity;
            this.f28680b = verticalSource;
            this.f28681c = r0.f69998n;
        }

        public /* synthetic */ C0312b(CategoryEntity categoryEntity, HomeVisitedSources homeVisitedSources, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? HomeVisitedSources.HOME_PAGE : homeVisitedSources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CategoryListingsFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class c implements n {

        /* renamed from: a  reason: collision with root package name */
        private final AllFiltersPayload f28682a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f28683b;

        /* renamed from: c  reason: collision with root package name */
        private final CategoryEntity f28684c;

        /* renamed from: d  reason: collision with root package name */
        private final String f28685d;

        /* renamed from: e  reason: collision with root package name */
        private final String f28686e;

        /* renamed from: f  reason: collision with root package name */
        private final ListingsIntention f28687f;

        /* renamed from: g  reason: collision with root package name */
        private final AdvancedSearchBody f28688g;

        /* renamed from: h  reason: collision with root package name */
        private final CategoryListingsAnalyticSource f28689h;

        /* renamed from: i  reason: collision with root package name */
        private final GetListingsBody.FiltrationData f28690i;

        /* renamed from: j  reason: collision with root package name */
        private final SearchSource f28691j;

        /* renamed from: k  reason: collision with root package name */
        private final SearchAnalyticsData f28692k;

        /* renamed from: l  reason: collision with root package name */
        private final int f28693l;

        /* renamed from: m  reason: collision with root package name */
        private final int f28694m;

        public c(AllFiltersPayload filterPayload, boolean z11, CategoryEntity categoryEntity, String str, String str2, ListingsIntention intention, AdvancedSearchBody advancedSearchBody, CategoryListingsAnalyticSource categoryListingsAnalyticSource, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, int i11) {
            o.i(filterPayload, "filterPayload");
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            this.f28682a = filterPayload;
            this.f28683b = z11;
            this.f28684c = categoryEntity;
            this.f28685d = str;
            this.f28686e = str2;
            this.f28687f = intention;
            this.f28688g = advancedSearchBody;
            this.f28689h = categoryListingsAnalyticSource;
            this.f28690i = filtrationData;
            this.f28691j = searchSource;
            this.f28692k = searchAnalyticsData;
            this.f28693l = i11;
            this.f28694m = r0.f70011o;
        }

        @Override // z3.n
        public int a() {
            return this.f28694m;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(AllFiltersPayload.class)) {
                AllFiltersPayload allFiltersPayload = this.f28682a;
                o.g(allFiltersPayload, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("filterPayload", allFiltersPayload);
            } else if (Serializable.class.isAssignableFrom(AllFiltersPayload.class)) {
                AllFiltersPayload allFiltersPayload2 = this.f28682a;
                o.g(allFiltersPayload2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("filterPayload", (Serializable) allFiltersPayload2);
            } else {
                String name = AllFiltersPayload.class.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            bundle.putBoolean("fromBreadCrumbs", this.f28683b);
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("parentCategory", this.f28684c);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("parentCategory", (Serializable) this.f28684c);
            }
            bundle.putString("CATEGORY_TITLE", this.f28685d);
            bundle.putString("searchKeyword", this.f28686e);
            if (Parcelable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention = this.f28687f;
                o.g(listingsIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("intention", (Parcelable) listingsIntention);
            } else if (Serializable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention2 = this.f28687f;
                o.g(listingsIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("intention", listingsIntention2);
            }
            if (Parcelable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                bundle.putParcelable("initAdvancedSearchBody", this.f28688g);
            } else if (Serializable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                bundle.putSerializable("initAdvancedSearchBody", (Serializable) this.f28688g);
            }
            if (Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putParcelable("analyticSource", this.f28689h);
            } else if (Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f28689h);
            }
            if (Parcelable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putParcelable("predefinedFilters", this.f28690i);
            } else if (Serializable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putSerializable("predefinedFilters", (Serializable) this.f28690i);
            }
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f28691j;
                o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f28691j;
                o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            if (Parcelable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putParcelable("searchAnalyticsData", this.f28692k);
            } else if (Serializable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putSerializable("searchAnalyticsData", (Serializable) this.f28692k);
            }
            bundle.putInt("SEARCH_ITEM_ORDER", this.f28693l);
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
            if (o.d(this.f28682a, cVar.f28682a) && this.f28683b == cVar.f28683b && o.d(this.f28684c, cVar.f28684c) && o.d(this.f28685d, cVar.f28685d) && o.d(this.f28686e, cVar.f28686e) && this.f28687f == cVar.f28687f && o.d(this.f28688g, cVar.f28688g) && o.d(this.f28689h, cVar.f28689h) && o.d(this.f28690i, cVar.f28690i) && this.f28691j == cVar.f28691j && o.d(this.f28692k, cVar.f28692k) && this.f28693l == cVar.f28693l) {
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
            int hashCode7 = this.f28682a.hashCode() * 31;
            boolean z11 = this.f28683b;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode7 + i11) * 31;
            CategoryEntity categoryEntity = this.f28684c;
            int i13 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i14 = (i12 + hashCode) * 31;
            String str = this.f28685d;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i15 = (i14 + hashCode2) * 31;
            String str2 = this.f28686e;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int hashCode8 = (((i15 + hashCode3) * 31) + this.f28687f.hashCode()) * 31;
            AdvancedSearchBody advancedSearchBody = this.f28688g;
            if (advancedSearchBody == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = advancedSearchBody.hashCode();
            }
            int i16 = (hashCode8 + hashCode4) * 31;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f28689h;
            if (categoryListingsAnalyticSource == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = categoryListingsAnalyticSource.hashCode();
            }
            int i17 = (i16 + hashCode5) * 31;
            GetListingsBody.FiltrationData filtrationData = this.f28690i;
            if (filtrationData == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = filtrationData.hashCode();
            }
            int hashCode9 = (((i17 + hashCode6) * 31) + this.f28691j.hashCode()) * 31;
            SearchAnalyticsData searchAnalyticsData = this.f28692k;
            if (searchAnalyticsData != null) {
                i13 = searchAnalyticsData.hashCode();
            }
            return ((hashCode9 + i13) * 31) + Integer.hashCode(this.f28693l);
        }

        public String toString() {
            AllFiltersPayload allFiltersPayload = this.f28682a;
            boolean z11 = this.f28683b;
            CategoryEntity categoryEntity = this.f28684c;
            String str = this.f28685d;
            String str2 = this.f28686e;
            ListingsIntention listingsIntention = this.f28687f;
            AdvancedSearchBody advancedSearchBody = this.f28688g;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f28689h;
            GetListingsBody.FiltrationData filtrationData = this.f28690i;
            SearchSource searchSource = this.f28691j;
            SearchAnalyticsData searchAnalyticsData = this.f28692k;
            int i11 = this.f28693l;
            return "ActionCategoryListingsFragmentToNavgraphAllFilters(filterPayload=" + allFiltersPayload + ", fromBreadCrumbs=" + z11 + ", parentCategory=" + categoryEntity + ", CATEGORYTITLE=" + str + ", searchKeyword=" + str2 + ", intention=" + listingsIntention + ", initAdvancedSearchBody=" + advancedSearchBody + ", analyticSource=" + categoryListingsAnalyticSource + ", predefinedFilters=" + filtrationData + ", searchSource=" + searchSource + ", searchAnalyticsData=" + searchAnalyticsData + ", SEARCHITEMORDER=" + i11 + ")";
        }
    }

    /* compiled from: CategoryListingsFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n e(d dVar, AllFiltersPayload allFiltersPayload, boolean z11, CategoryEntity categoryEntity, String str, String str2, ListingsIntention listingsIntention, AdvancedSearchBody advancedSearchBody, CategoryListingsAnalyticSource categoryListingsAnalyticSource, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, int i11, int i12, Object obj) {
            boolean z12;
            CategoryEntity categoryEntity2;
            String str3;
            String str4;
            ListingsIntention listingsIntention2;
            AdvancedSearchBody advancedSearchBody2;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource2;
            GetListingsBody.FiltrationData filtrationData2;
            SearchSource searchSource2;
            int i13 = 0;
            if ((i12 & 2) != 0) {
                z12 = false;
            } else {
                z12 = z11;
            }
            SearchAnalyticsData searchAnalyticsData2 = null;
            if ((i12 & 4) != 0) {
                categoryEntity2 = null;
            } else {
                categoryEntity2 = categoryEntity;
            }
            if ((i12 & 8) != 0) {
                str3 = null;
            } else {
                str3 = str;
            }
            if ((i12 & 16) != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if ((i12 & 32) != 0) {
                listingsIntention2 = ListingsIntention.LISTINGS;
            } else {
                listingsIntention2 = listingsIntention;
            }
            if ((i12 & 64) != 0) {
                advancedSearchBody2 = null;
            } else {
                advancedSearchBody2 = advancedSearchBody;
            }
            if ((i12 & 128) != 0) {
                categoryListingsAnalyticSource2 = null;
            } else {
                categoryListingsAnalyticSource2 = categoryListingsAnalyticSource;
            }
            if ((i12 & 256) != 0) {
                filtrationData2 = null;
            } else {
                filtrationData2 = filtrationData;
            }
            if ((i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                searchSource2 = SearchSource.NONE;
            } else {
                searchSource2 = searchSource;
            }
            if ((i12 & 1024) == 0) {
                searchAnalyticsData2 = searchAnalyticsData;
            }
            if ((i12 & RecyclerView.l.FLAG_MOVED) == 0) {
                i13 = i11;
            }
            return dVar.d(allFiltersPayload, z12, categoryEntity2, str3, str4, listingsIntention2, advancedSearchBody2, categoryListingsAnalyticSource2, filtrationData2, searchSource2, searchAnalyticsData2, i13);
        }

        public final n a() {
            return new z3.a(r0.f69855c);
        }

        public final n b(CategoryEntity categoryEntity, String str, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            return new a(categoryEntity, str, intention, filtrationData, searchSource, searchAnalyticsData);
        }

        public final n c(CategoryEntity categoryEntity, HomeVisitedSources verticalSource) {
            o.i(verticalSource, "verticalSource");
            return new C0312b(categoryEntity, verticalSource);
        }

        public final n d(AllFiltersPayload filterPayload, boolean z11, CategoryEntity categoryEntity, String str, String str2, ListingsIntention intention, AdvancedSearchBody advancedSearchBody, CategoryListingsAnalyticSource categoryListingsAnalyticSource, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, int i11) {
            o.i(filterPayload, "filterPayload");
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            return new c(filterPayload, z11, categoryEntity, str, str2, intention, advancedSearchBody, categoryListingsAnalyticSource, filtrationData, searchSource, searchAnalyticsData, i11);
        }
    }
}
