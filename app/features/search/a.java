package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.app.utils.analytics.SearchSource;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CategoriesNavigationEvent.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: CategoriesNavigationEvent.kt */
    /* renamed from: com.forsale.app.features.search.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0422a implements a {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f36931a;

        /* renamed from: b  reason: collision with root package name */
        private final HomeVisitedSources f36932b;

        public C0422a(CategoryEntity category, HomeVisitedSources HomeVisitedSource) {
            kotlin.jvm.internal.o.i(category, "category");
            kotlin.jvm.internal.o.i(HomeVisitedSource, "HomeVisitedSource");
            this.f36931a = category;
            this.f36932b = HomeVisitedSource;
        }

        public final CategoryEntity a() {
            return this.f36931a;
        }

        public final HomeVisitedSources b() {
            return this.f36932b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0422a)) {
                return false;
            }
            C0422a c0422a = (C0422a) obj;
            if (kotlin.jvm.internal.o.d(this.f36931a, c0422a.f36931a) && this.f36932b == c0422a.f36932b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f36931a.hashCode() * 31) + this.f36932b.hashCode();
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f36931a;
            HomeVisitedSources homeVisitedSources = this.f36932b;
            return "NavigateToCategory(category=" + categoryEntity + ", HomeVisitedSource=" + homeVisitedSources + ")";
        }

        public /* synthetic */ C0422a(CategoryEntity categoryEntity, HomeVisitedSources homeVisitedSources, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(categoryEntity, (i11 & 2) != 0 ? HomeVisitedSources.HOME_PAGE : homeVisitedSources);
        }
    }

    /* compiled from: CategoriesNavigationEvent.kt */
    /* loaded from: classes2.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        private final String f36933a;

        /* renamed from: b  reason: collision with root package name */
        private final SearchSource f36934b;

        /* renamed from: c  reason: collision with root package name */
        private final SearchAnalyticsData f36935c;

        /* renamed from: d  reason: collision with root package name */
        private final CategoryEntity f36936d;

        /* renamed from: e  reason: collision with root package name */
        private final GetListingsBody.FiltrationData f36937e;

        /* renamed from: f  reason: collision with root package name */
        private final ListingsIntention f36938f;

        /* renamed from: g  reason: collision with root package name */
        private final Integer f36939g;

        public b(String searchQuery, SearchSource searchSource, SearchAnalyticsData searchAnalytics, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, ListingsIntention listingsIntention, Integer num) {
            kotlin.jvm.internal.o.i(searchQuery, "searchQuery");
            kotlin.jvm.internal.o.i(searchSource, "searchSource");
            kotlin.jvm.internal.o.i(searchAnalytics, "searchAnalytics");
            kotlin.jvm.internal.o.i(listingsIntention, "listingsIntention");
            this.f36933a = searchQuery;
            this.f36934b = searchSource;
            this.f36935c = searchAnalytics;
            this.f36936d = categoryEntity;
            this.f36937e = filtrationData;
            this.f36938f = listingsIntention;
            this.f36939g = num;
        }

        public final CategoryEntity a() {
            return this.f36936d;
        }

        public final GetListingsBody.FiltrationData b() {
            return this.f36937e;
        }

        public final ListingsIntention c() {
            return this.f36938f;
        }

        public final Integer d() {
            return this.f36939g;
        }

        public final SearchAnalyticsData e() {
            return this.f36935c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (kotlin.jvm.internal.o.d(this.f36933a, bVar.f36933a) && this.f36934b == bVar.f36934b && kotlin.jvm.internal.o.d(this.f36935c, bVar.f36935c) && kotlin.jvm.internal.o.d(this.f36936d, bVar.f36936d) && kotlin.jvm.internal.o.d(this.f36937e, bVar.f36937e) && this.f36938f == bVar.f36938f && kotlin.jvm.internal.o.d(this.f36939g, bVar.f36939g)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f36933a;
        }

        public final SearchSource g() {
            return this.f36934b;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = ((((this.f36933a.hashCode() * 31) + this.f36934b.hashCode()) * 31) + this.f36935c.hashCode()) * 31;
            CategoryEntity categoryEntity = this.f36936d;
            int i11 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i12 = (hashCode3 + hashCode) * 31;
            GetListingsBody.FiltrationData filtrationData = this.f36937e;
            if (filtrationData == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = filtrationData.hashCode();
            }
            int hashCode4 = (((i12 + hashCode2) * 31) + this.f36938f.hashCode()) * 31;
            Integer num = this.f36939g;
            if (num != null) {
                i11 = num.hashCode();
            }
            return hashCode4 + i11;
        }

        public String toString() {
            String str = this.f36933a;
            SearchSource searchSource = this.f36934b;
            SearchAnalyticsData searchAnalyticsData = this.f36935c;
            CategoryEntity categoryEntity = this.f36936d;
            GetListingsBody.FiltrationData filtrationData = this.f36937e;
            ListingsIntention listingsIntention = this.f36938f;
            Integer num = this.f36939g;
            return "NavigateToListings(searchQuery=" + str + ", searchSource=" + searchSource + ", searchAnalytics=" + searchAnalyticsData + ", category=" + categoryEntity + ", filtrationData=" + filtrationData + ", listingsIntention=" + listingsIntention + ", popupToDestination=" + num + ")";
        }

        public /* synthetic */ b(String str, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, ListingsIntention listingsIntention, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, searchSource, searchAnalyticsData, categoryEntity, filtrationData, (i11 & 32) != 0 ? ListingsIntention.SEARCH : listingsIntention, (i11 & 64) != 0 ? null : num);
        }
    }
}
