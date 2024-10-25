package com.forsale.app.features.categories.home.maincategories;

import android.os.Bundle;
import android.os.Parcelable;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.app.utils.analytics.SearchSource;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.h0;
import t9.r0;
import z3.n;
/* compiled from: MainCategoriesFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f24404a = new c(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MainCategoriesFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.categories.home.maincategories.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0271a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f24405a;

        /* renamed from: b  reason: collision with root package name */
        private final HomeVisitedSources f24406b;

        /* renamed from: c  reason: collision with root package name */
        private final CategoryListingsAnalyticSource f24407c;

        /* renamed from: d  reason: collision with root package name */
        private final int f24408d;

        public C0271a(CategoryEntity category, HomeVisitedSources verticalSource, CategoryListingsAnalyticSource categoryListingsAnalyticSource) {
            o.i(category, "category");
            o.i(verticalSource, "verticalSource");
            this.f24405a = category;
            this.f24406b = verticalSource;
            this.f24407c = categoryListingsAnalyticSource;
            this.f24408d = r0.I;
        }

        @Override // z3.n
        public int a() {
            return this.f24408d;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                CategoryEntity categoryEntity = this.f24405a;
                o.g(categoryEntity, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("category", categoryEntity);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                CategoryEntity categoryEntity2 = this.f24405a;
                o.g(categoryEntity2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("category", (Serializable) categoryEntity2);
            } else {
                String name = CategoryEntity.class.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            if (Parcelable.class.isAssignableFrom(HomeVisitedSources.class)) {
                HomeVisitedSources homeVisitedSources = this.f24406b;
                o.g(homeVisitedSources, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("verticalSource", (Parcelable) homeVisitedSources);
            } else if (Serializable.class.isAssignableFrom(HomeVisitedSources.class)) {
                HomeVisitedSources homeVisitedSources2 = this.f24406b;
                o.g(homeVisitedSources2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("verticalSource", homeVisitedSources2);
            }
            if (Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putParcelable("analyticSource", this.f24407c);
            } else if (Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f24407c);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0271a)) {
                return false;
            }
            C0271a c0271a = (C0271a) obj;
            if (o.d(this.f24405a, c0271a.f24405a) && this.f24406b == c0271a.f24406b && o.d(this.f24407c, c0271a.f24407c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f24405a.hashCode() * 31) + this.f24406b.hashCode()) * 31;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f24407c;
            if (categoryListingsAnalyticSource == null) {
                hashCode = 0;
            } else {
                hashCode = categoryListingsAnalyticSource.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f24405a;
            HomeVisitedSources homeVisitedSources = this.f24406b;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f24407c;
            return "ActionMainCategoriesFragmentToAllVerticalsFragment(category=" + categoryEntity + ", verticalSource=" + homeVisitedSources + ", analyticSource=" + categoryListingsAnalyticSource + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MainCategoriesFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f24409a;

        /* renamed from: b  reason: collision with root package name */
        private final String f24410b;

        /* renamed from: c  reason: collision with root package name */
        private final CategoryListingsAnalyticSource f24411c;

        /* renamed from: d  reason: collision with root package name */
        private final String f24412d;

        /* renamed from: e  reason: collision with root package name */
        private final ListingsIntention f24413e;

        /* renamed from: f  reason: collision with root package name */
        private final GetListingsBody.FiltrationData f24414f;

        /* renamed from: g  reason: collision with root package name */
        private final SearchSource f24415g;

        /* renamed from: h  reason: collision with root package name */
        private final SearchAnalyticsData f24416h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f24417i;

        /* renamed from: j  reason: collision with root package name */
        private final int f24418j;

        public b() {
            this(null, null, null, null, null, null, null, null, false, 511, null);
        }

        @Override // z3.n
        public int a() {
            return this.f24418j;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("parentCategory", this.f24409a);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("parentCategory", (Serializable) this.f24409a);
            }
            bundle.putString("CATEGORY_TITLE", this.f24410b);
            if (Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putParcelable("analyticSource", this.f24411c);
            } else if (Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f24411c);
            }
            bundle.putString("searchKeyword", this.f24412d);
            if (Parcelable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention = this.f24413e;
                o.g(listingsIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("intention", (Parcelable) listingsIntention);
            } else if (Serializable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention2 = this.f24413e;
                o.g(listingsIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("intention", listingsIntention2);
            }
            if (Parcelable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putParcelable("predefinedFilters", this.f24414f);
            } else if (Serializable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putSerializable("predefinedFilters", (Serializable) this.f24414f);
            }
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f24415g;
                o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f24415g;
                o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            if (Parcelable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putParcelable("searchAnalyticsData", this.f24416h);
            } else if (Serializable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putSerializable("searchAnalyticsData", (Serializable) this.f24416h);
            }
            bundle.putBoolean("fromBreadCrumbs", this.f24417i);
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
            if (o.d(this.f24409a, bVar.f24409a) && o.d(this.f24410b, bVar.f24410b) && o.d(this.f24411c, bVar.f24411c) && o.d(this.f24412d, bVar.f24412d) && this.f24413e == bVar.f24413e && o.d(this.f24414f, bVar.f24414f) && this.f24415g == bVar.f24415g && o.d(this.f24416h, bVar.f24416h) && this.f24417i == bVar.f24417i) {
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
            CategoryEntity categoryEntity = this.f24409a;
            int i11 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i12 = hashCode * 31;
            String str = this.f24410b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f24411c;
            if (categoryListingsAnalyticSource == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = categoryListingsAnalyticSource.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            String str2 = this.f24412d;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int hashCode6 = (((i14 + hashCode4) * 31) + this.f24413e.hashCode()) * 31;
            GetListingsBody.FiltrationData filtrationData = this.f24414f;
            if (filtrationData == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = filtrationData.hashCode();
            }
            int hashCode7 = (((hashCode6 + hashCode5) * 31) + this.f24415g.hashCode()) * 31;
            SearchAnalyticsData searchAnalyticsData = this.f24416h;
            if (searchAnalyticsData != null) {
                i11 = searchAnalyticsData.hashCode();
            }
            int i15 = (hashCode7 + i11) * 31;
            boolean z11 = this.f24417i;
            int i16 = z11;
            if (z11 != 0) {
                i16 = 1;
            }
            return i15 + i16;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f24409a;
            String str = this.f24410b;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f24411c;
            String str2 = this.f24412d;
            ListingsIntention listingsIntention = this.f24413e;
            GetListingsBody.FiltrationData filtrationData = this.f24414f;
            SearchSource searchSource = this.f24415g;
            SearchAnalyticsData searchAnalyticsData = this.f24416h;
            boolean z11 = this.f24417i;
            return "ActionMainCategoriesFragmentToCategoryListingsFragment(parentCategory=" + categoryEntity + ", CATEGORYTITLE=" + str + ", analyticSource=" + categoryListingsAnalyticSource + ", searchKeyword=" + str2 + ", intention=" + listingsIntention + ", predefinedFilters=" + filtrationData + ", searchSource=" + searchSource + ", searchAnalyticsData=" + searchAnalyticsData + ", fromBreadCrumbs=" + z11 + ")";
        }

        public b(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            this.f24409a = categoryEntity;
            this.f24410b = str;
            this.f24411c = categoryListingsAnalyticSource;
            this.f24412d = str2;
            this.f24413e = intention;
            this.f24414f = filtrationData;
            this.f24415g = searchSource;
            this.f24416h = searchAnalyticsData;
            this.f24417i = z11;
            this.f24418j = r0.J;
        }

        public /* synthetic */ b(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention listingsIntention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : categoryListingsAnalyticSource, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? ListingsIntention.LISTINGS : listingsIntention, (i11 & 32) != 0 ? null : filtrationData, (i11 & 64) != 0 ? SearchSource.NONE : searchSource, (i11 & 128) == 0 ? searchAnalyticsData : null, (i11 & 256) != 0 ? false : z11);
        }
    }

    /* compiled from: MainCategoriesFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n b(c cVar, CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention listingsIntention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, Object obj) {
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
            return cVar.a(categoryEntity, str, categoryListingsAnalyticSource, str2, listingsIntention, filtrationData, searchSource, searchAnalyticsData, z11);
        }

        public static /* synthetic */ n d(c cVar, CategoryEntity categoryEntity, HomeVisitedSources homeVisitedSources, CategoryListingsAnalyticSource categoryListingsAnalyticSource, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                homeVisitedSources = HomeVisitedSources.HOME_PAGE;
            }
            if ((i11 & 4) != 0) {
                categoryListingsAnalyticSource = null;
            }
            return cVar.c(categoryEntity, homeVisitedSources, categoryListingsAnalyticSource);
        }

        public static /* synthetic */ n f(c cVar, CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention listingsIntention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, Object obj) {
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
            return cVar.e(categoryEntity, str, categoryListingsAnalyticSource, str2, listingsIntention, filtrationData, searchSource, searchAnalyticsData, z11);
        }

        public final n a(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            return h0.f69222a.a(categoryEntity, str, categoryListingsAnalyticSource, str2, intention, filtrationData, searchSource, searchAnalyticsData, z11);
        }

        public final n c(CategoryEntity category, HomeVisitedSources verticalSource, CategoryListingsAnalyticSource categoryListingsAnalyticSource) {
            o.i(category, "category");
            o.i(verticalSource, "verticalSource");
            return new C0271a(category, verticalSource, categoryListingsAnalyticSource);
        }

        public final n e(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            return new b(categoryEntity, str, categoryListingsAnalyticSource, str2, intention, filtrationData, searchSource, searchAnalyticsData, z11);
        }
    }
}
