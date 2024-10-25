package com.forsale.app.features.categories.home.allverticals;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.analytics.AnalyticListingsPayload;
import com.forsale.app.utils.analytics.AnalyticsListingsSource;
import com.forsale.app.utils.analytics.HomeVisitedSources;
import com.forsale.app.utils.analytics.SearchSource;
import com.google.android.gms.ads.AdRequest;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.h0;
import t9.p0;
import t9.r0;
import z3.n;
/* compiled from: AllVerticalsFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final C0261c f23790a = new C0261c(null);

    /* compiled from: AllVerticalsFragmentDirections.kt */
    /* loaded from: classes2.dex */
    private static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f23791a;

        /* renamed from: b  reason: collision with root package name */
        private final HomeVisitedSources f23792b;

        /* renamed from: c  reason: collision with root package name */
        private final CategoryListingsAnalyticSource f23793c;

        /* renamed from: d  reason: collision with root package name */
        private final int f23794d;

        public a(CategoryEntity category, HomeVisitedSources verticalSource, CategoryListingsAnalyticSource categoryListingsAnalyticSource) {
            o.i(category, "category");
            o.i(verticalSource, "verticalSource");
            this.f23791a = category;
            this.f23792b = verticalSource;
            this.f23793c = categoryListingsAnalyticSource;
            this.f23794d = r0.f69920h;
        }

        @Override // z3.n
        public int a() {
            return this.f23794d;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                CategoryEntity categoryEntity = this.f23791a;
                o.g(categoryEntity, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("category", categoryEntity);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                CategoryEntity categoryEntity2 = this.f23791a;
                o.g(categoryEntity2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("category", (Serializable) categoryEntity2);
            } else {
                String name = CategoryEntity.class.getName();
                throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
            }
            if (Parcelable.class.isAssignableFrom(HomeVisitedSources.class)) {
                HomeVisitedSources homeVisitedSources = this.f23792b;
                o.g(homeVisitedSources, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("verticalSource", (Parcelable) homeVisitedSources);
            } else if (Serializable.class.isAssignableFrom(HomeVisitedSources.class)) {
                HomeVisitedSources homeVisitedSources2 = this.f23792b;
                o.g(homeVisitedSources2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("verticalSource", homeVisitedSources2);
            }
            if (Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putParcelable("analyticSource", this.f23793c);
            } else if (Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f23793c);
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
            if (o.d(this.f23791a, aVar.f23791a) && this.f23792b == aVar.f23792b && o.d(this.f23793c, aVar.f23793c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f23791a.hashCode() * 31) + this.f23792b.hashCode()) * 31;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f23793c;
            if (categoryListingsAnalyticSource == null) {
                hashCode = 0;
            } else {
                hashCode = categoryListingsAnalyticSource.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f23791a;
            HomeVisitedSources homeVisitedSources = this.f23792b;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f23793c;
            return "ActionAllVerticalsFragmentSelf(category=" + categoryEntity + ", verticalSource=" + homeVisitedSources + ", analyticSource=" + categoryListingsAnalyticSource + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AllVerticalsFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class b implements n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f23795a;

        /* renamed from: b  reason: collision with root package name */
        private final String f23796b;

        /* renamed from: c  reason: collision with root package name */
        private final CategoryListingsAnalyticSource f23797c;

        /* renamed from: d  reason: collision with root package name */
        private final String f23798d;

        /* renamed from: e  reason: collision with root package name */
        private final ListingsIntention f23799e;

        /* renamed from: f  reason: collision with root package name */
        private final GetListingsBody.FiltrationData f23800f;

        /* renamed from: g  reason: collision with root package name */
        private final SearchSource f23801g;

        /* renamed from: h  reason: collision with root package name */
        private final SearchAnalyticsData f23802h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f23803i;

        /* renamed from: j  reason: collision with root package name */
        private final int f23804j;

        public b() {
            this(null, null, null, null, null, null, null, null, false, 511, null);
        }

        @Override // z3.n
        public int a() {
            return this.f23804j;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("parentCategory", this.f23795a);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("parentCategory", (Serializable) this.f23795a);
            }
            bundle.putString("CATEGORY_TITLE", this.f23796b);
            if (Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putParcelable("analyticSource", this.f23797c);
            } else if (Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f23797c);
            }
            bundle.putString("searchKeyword", this.f23798d);
            if (Parcelable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention = this.f23799e;
                o.g(listingsIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("intention", (Parcelable) listingsIntention);
            } else if (Serializable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention2 = this.f23799e;
                o.g(listingsIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("intention", listingsIntention2);
            }
            if (Parcelable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putParcelable("predefinedFilters", this.f23800f);
            } else if (Serializable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putSerializable("predefinedFilters", (Serializable) this.f23800f);
            }
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f23801g;
                o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f23801g;
                o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            if (Parcelable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putParcelable("searchAnalyticsData", this.f23802h);
            } else if (Serializable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putSerializable("searchAnalyticsData", (Serializable) this.f23802h);
            }
            bundle.putBoolean("fromBreadCrumbs", this.f23803i);
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
            if (o.d(this.f23795a, bVar.f23795a) && o.d(this.f23796b, bVar.f23796b) && o.d(this.f23797c, bVar.f23797c) && o.d(this.f23798d, bVar.f23798d) && this.f23799e == bVar.f23799e && o.d(this.f23800f, bVar.f23800f) && this.f23801g == bVar.f23801g && o.d(this.f23802h, bVar.f23802h) && this.f23803i == bVar.f23803i) {
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
            CategoryEntity categoryEntity = this.f23795a;
            int i11 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i12 = hashCode * 31;
            String str = this.f23796b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f23797c;
            if (categoryListingsAnalyticSource == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = categoryListingsAnalyticSource.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            String str2 = this.f23798d;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int hashCode6 = (((i14 + hashCode4) * 31) + this.f23799e.hashCode()) * 31;
            GetListingsBody.FiltrationData filtrationData = this.f23800f;
            if (filtrationData == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = filtrationData.hashCode();
            }
            int hashCode7 = (((hashCode6 + hashCode5) * 31) + this.f23801g.hashCode()) * 31;
            SearchAnalyticsData searchAnalyticsData = this.f23802h;
            if (searchAnalyticsData != null) {
                i11 = searchAnalyticsData.hashCode();
            }
            int i15 = (hashCode7 + i11) * 31;
            boolean z11 = this.f23803i;
            int i16 = z11;
            if (z11 != 0) {
                i16 = 1;
            }
            return i15 + i16;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f23795a;
            String str = this.f23796b;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f23797c;
            String str2 = this.f23798d;
            ListingsIntention listingsIntention = this.f23799e;
            GetListingsBody.FiltrationData filtrationData = this.f23800f;
            SearchSource searchSource = this.f23801g;
            SearchAnalyticsData searchAnalyticsData = this.f23802h;
            boolean z11 = this.f23803i;
            return "ActionAllVerticalsFragmentToCategoryListingsFragment(parentCategory=" + categoryEntity + ", CATEGORYTITLE=" + str + ", analyticSource=" + categoryListingsAnalyticSource + ", searchKeyword=" + str2 + ", intention=" + listingsIntention + ", predefinedFilters=" + filtrationData + ", searchSource=" + searchSource + ", searchAnalyticsData=" + searchAnalyticsData + ", fromBreadCrumbs=" + z11 + ")";
        }

        public b(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            this.f23795a = categoryEntity;
            this.f23796b = str;
            this.f23797c = categoryListingsAnalyticSource;
            this.f23798d = str2;
            this.f23799e = intention;
            this.f23800f = filtrationData;
            this.f23801g = searchSource;
            this.f23802h = searchAnalyticsData;
            this.f23803i = z11;
            this.f23804j = r0.f69933i;
        }

        public /* synthetic */ b(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention listingsIntention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : categoryListingsAnalyticSource, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? ListingsIntention.LISTINGS : listingsIntention, (i11 & 32) != 0 ? null : filtrationData, (i11 & 64) != 0 ? SearchSource.NONE : searchSource, (i11 & 128) == 0 ? searchAnalyticsData : null, (i11 & 256) != 0 ? false : z11);
        }
    }

    /* compiled from: AllVerticalsFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.categories.home.allverticals.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0261c {
        private C0261c() {
        }

        public /* synthetic */ C0261c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n c(C0261c c0261c, CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention listingsIntention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, Object obj) {
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
            return c0261c.b(categoryEntity, str, categoryListingsAnalyticSource, str2, listingsIntention, filtrationData, searchSource, searchAnalyticsData, z11);
        }

        public static /* synthetic */ n e(C0261c c0261c, ListingsTypes listingsTypes, String str, int i11, String str2, int[] iArr, AnalyticsListingsSource analyticsListingsSource, int i12, boolean z11, int i13, int i14, String str3, SearchSource searchSource, int i15, AnalyticListingsPayload analyticListingsPayload, int i16, Object obj) {
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
            return c0261c.d(listingsTypes2, str4, i17, str5, iArr2, analyticsListingsSource2, i18, z12, i19, i22, str6, searchSource2, i21, analyticListingsPayload2);
        }

        public final n a(CategoryEntity category, HomeVisitedSources verticalSource, CategoryListingsAnalyticSource categoryListingsAnalyticSource) {
            o.i(category, "category");
            o.i(verticalSource, "verticalSource");
            return new a(category, verticalSource, categoryListingsAnalyticSource);
        }

        public final n b(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            return new b(categoryEntity, str, categoryListingsAnalyticSource, str2, intention, filtrationData, searchSource, searchAnalyticsData, z11);
        }

        public final n d(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AnalyticsListingsSource listingSource, int i12, boolean z11, int i13, int i14, String str3, SearchSource searchSource, int i15, AnalyticListingsPayload analyticListingsPayload) {
            o.i(listingTypes, "listingTypes");
            o.i(listingSource, "listingSource");
            o.i(searchSource, "searchSource");
            return h0.f69222a.b(listingTypes, str, i11, str2, iArr, listingSource, i12, z11, i13, i14, str3, searchSource, i15, analyticListingsPayload);
        }
    }
}
