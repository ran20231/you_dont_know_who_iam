package com.forsale.app.features.categories.home.homelandingscreen;

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
/* compiled from: VerticalFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final d f24084a = new d(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VerticalFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f24085a;

        /* renamed from: b  reason: collision with root package name */
        private final String f24086b;

        /* renamed from: c  reason: collision with root package name */
        private final CategoryListingsAnalyticSource f24087c;

        /* renamed from: d  reason: collision with root package name */
        private final String f24088d;

        /* renamed from: e  reason: collision with root package name */
        private final ListingsIntention f24089e;

        /* renamed from: f  reason: collision with root package name */
        private final GetListingsBody.FiltrationData f24090f;

        /* renamed from: g  reason: collision with root package name */
        private final SearchSource f24091g;

        /* renamed from: h  reason: collision with root package name */
        private final SearchAnalyticsData f24092h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f24093i;

        /* renamed from: j  reason: collision with root package name */
        private final int f24094j;

        public a() {
            this(null, null, null, null, null, null, null, null, false, 511, null);
        }

        @Override // z3.n
        public int a() {
            return this.f24094j;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("parentCategory", this.f24085a);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("parentCategory", (Serializable) this.f24085a);
            }
            bundle.putString("CATEGORY_TITLE", this.f24086b);
            if (Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putParcelable("analyticSource", this.f24087c);
            } else if (Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f24087c);
            }
            bundle.putString("searchKeyword", this.f24088d);
            if (Parcelable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention = this.f24089e;
                o.g(listingsIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("intention", (Parcelable) listingsIntention);
            } else if (Serializable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention2 = this.f24089e;
                o.g(listingsIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("intention", listingsIntention2);
            }
            if (Parcelable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putParcelable("predefinedFilters", this.f24090f);
            } else if (Serializable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putSerializable("predefinedFilters", (Serializable) this.f24090f);
            }
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f24091g;
                o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f24091g;
                o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            if (Parcelable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putParcelable("searchAnalyticsData", this.f24092h);
            } else if (Serializable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putSerializable("searchAnalyticsData", (Serializable) this.f24092h);
            }
            bundle.putBoolean("fromBreadCrumbs", this.f24093i);
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
            if (o.d(this.f24085a, aVar.f24085a) && o.d(this.f24086b, aVar.f24086b) && o.d(this.f24087c, aVar.f24087c) && o.d(this.f24088d, aVar.f24088d) && this.f24089e == aVar.f24089e && o.d(this.f24090f, aVar.f24090f) && this.f24091g == aVar.f24091g && o.d(this.f24092h, aVar.f24092h) && this.f24093i == aVar.f24093i) {
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
            CategoryEntity categoryEntity = this.f24085a;
            int i11 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i12 = hashCode * 31;
            String str = this.f24086b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f24087c;
            if (categoryListingsAnalyticSource == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = categoryListingsAnalyticSource.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            String str2 = this.f24088d;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int hashCode6 = (((i14 + hashCode4) * 31) + this.f24089e.hashCode()) * 31;
            GetListingsBody.FiltrationData filtrationData = this.f24090f;
            if (filtrationData == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = filtrationData.hashCode();
            }
            int hashCode7 = (((hashCode6 + hashCode5) * 31) + this.f24091g.hashCode()) * 31;
            SearchAnalyticsData searchAnalyticsData = this.f24092h;
            if (searchAnalyticsData != null) {
                i11 = searchAnalyticsData.hashCode();
            }
            int i15 = (hashCode7 + i11) * 31;
            boolean z11 = this.f24093i;
            int i16 = z11;
            if (z11 != 0) {
                i16 = 1;
            }
            return i15 + i16;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f24085a;
            String str = this.f24086b;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f24087c;
            String str2 = this.f24088d;
            ListingsIntention listingsIntention = this.f24089e;
            GetListingsBody.FiltrationData filtrationData = this.f24090f;
            SearchSource searchSource = this.f24091g;
            SearchAnalyticsData searchAnalyticsData = this.f24092h;
            boolean z11 = this.f24093i;
            return "ActionVerticalFragmentToCategoryListingsFragment(parentCategory=" + categoryEntity + ", CATEGORYTITLE=" + str + ", analyticSource=" + categoryListingsAnalyticSource + ", searchKeyword=" + str2 + ", intention=" + listingsIntention + ", predefinedFilters=" + filtrationData + ", searchSource=" + searchSource + ", searchAnalyticsData=" + searchAnalyticsData + ", fromBreadCrumbs=" + z11 + ")";
        }

        public a(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            this.f24085a = categoryEntity;
            this.f24086b = str;
            this.f24087c = categoryListingsAnalyticSource;
            this.f24088d = str2;
            this.f24089e = intention;
            this.f24090f = filtrationData;
            this.f24091g = searchSource;
            this.f24092h = searchAnalyticsData;
            this.f24093i = z11;
            this.f24094j = r0.f70129x0;
        }

        public /* synthetic */ a(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention listingsIntention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : categoryListingsAnalyticSource, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? ListingsIntention.LISTINGS : listingsIntention, (i11 & 32) != 0 ? null : filtrationData, (i11 & 64) != 0 ? SearchSource.NONE : searchSource, (i11 & 128) == 0 ? searchAnalyticsData : null, (i11 & 256) != 0 ? false : z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VerticalFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.categories.home.homelandingscreen.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0266b implements n {

        /* renamed from: a  reason: collision with root package name */
        private final ListingsTypes f24095a;

        /* renamed from: b  reason: collision with root package name */
        private final String f24096b;

        /* renamed from: c  reason: collision with root package name */
        private final int f24097c;

        /* renamed from: d  reason: collision with root package name */
        private final String f24098d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f24099e;

        /* renamed from: f  reason: collision with root package name */
        private final AnalyticsListingsSource f24100f;

        /* renamed from: g  reason: collision with root package name */
        private final int f24101g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f24102h;

        /* renamed from: i  reason: collision with root package name */
        private final int f24103i;

        /* renamed from: j  reason: collision with root package name */
        private final int f24104j;

        /* renamed from: k  reason: collision with root package name */
        private final String f24105k;

        /* renamed from: l  reason: collision with root package name */
        private final SearchSource f24106l;

        /* renamed from: m  reason: collision with root package name */
        private final int f24107m;

        /* renamed from: n  reason: collision with root package name */
        private final AnalyticListingsPayload f24108n;

        /* renamed from: o  reason: collision with root package name */
        private final int f24109o;

        public C0266b() {
            this(null, null, 0, null, null, null, 0, false, 0, 0, null, null, 0, null, 16383, null);
        }

        @Override // z3.n
        public int a() {
            return this.f24109o;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(ListingsTypes.class)) {
                ListingsTypes listingsTypes = this.f24095a;
                o.g(listingsTypes, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("listingTypes", (Parcelable) listingsTypes);
            } else if (Serializable.class.isAssignableFrom(ListingsTypes.class)) {
                ListingsTypes listingsTypes2 = this.f24095a;
                o.g(listingsTypes2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("listingTypes", listingsTypes2);
            }
            bundle.putString("listingTitle", this.f24096b);
            bundle.putInt("wantedItemsCategoryId", this.f24097c);
            bundle.putString("wantedItemsSearchQuery", this.f24098d);
            bundle.putIntArray("districtIds", this.f24099e);
            if (Parcelable.class.isAssignableFrom(AnalyticsListingsSource.class)) {
                AnalyticsListingsSource analyticsListingsSource = this.f24100f;
                o.g(analyticsListingsSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("listingSource", (Parcelable) analyticsListingsSource);
            } else if (Serializable.class.isAssignableFrom(AnalyticsListingsSource.class)) {
                AnalyticsListingsSource analyticsListingsSource2 = this.f24100f;
                o.g(analyticsListingsSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("listingSource", analyticsListingsSource2);
            }
            bundle.putInt("categoryId", this.f24101g);
            bundle.putBoolean("showTitle", this.f24102h);
            bundle.putInt("topMargin", this.f24103i);
            bundle.putInt("advID", this.f24104j);
            bundle.putString("ownerPhone", this.f24105k);
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f24106l;
                o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f24106l;
                o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            bundle.putInt("searchHistoryCount", this.f24107m);
            if (Parcelable.class.isAssignableFrom(AnalyticListingsPayload.class)) {
                bundle.putParcelable("analyticListingsPayload", this.f24108n);
            } else if (Serializable.class.isAssignableFrom(AnalyticListingsPayload.class)) {
                bundle.putSerializable("analyticListingsPayload", (Serializable) this.f24108n);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0266b)) {
                return false;
            }
            C0266b c0266b = (C0266b) obj;
            if (this.f24095a == c0266b.f24095a && o.d(this.f24096b, c0266b.f24096b) && this.f24097c == c0266b.f24097c && o.d(this.f24098d, c0266b.f24098d) && o.d(this.f24099e, c0266b.f24099e) && this.f24100f == c0266b.f24100f && this.f24101g == c0266b.f24101g && this.f24102h == c0266b.f24102h && this.f24103i == c0266b.f24103i && this.f24104j == c0266b.f24104j && o.d(this.f24105k, c0266b.f24105k) && this.f24106l == c0266b.f24106l && this.f24107m == c0266b.f24107m && o.d(this.f24108n, c0266b.f24108n)) {
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
            int hashCode5 = this.f24095a.hashCode() * 31;
            String str = this.f24096b;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode6 = (((hashCode5 + hashCode) * 31) + Integer.hashCode(this.f24097c)) * 31;
            String str2 = this.f24098d;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i12 = (hashCode6 + hashCode2) * 31;
            int[] iArr = this.f24099e;
            if (iArr == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = Arrays.hashCode(iArr);
            }
            int hashCode7 = (((((i12 + hashCode3) * 31) + this.f24100f.hashCode()) * 31) + Integer.hashCode(this.f24101g)) * 31;
            boolean z11 = this.f24102h;
            int i13 = z11;
            if (z11 != 0) {
                i13 = 1;
            }
            int hashCode8 = (((((hashCode7 + i13) * 31) + Integer.hashCode(this.f24103i)) * 31) + Integer.hashCode(this.f24104j)) * 31;
            String str3 = this.f24105k;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int hashCode9 = (((((hashCode8 + hashCode4) * 31) + this.f24106l.hashCode()) * 31) + Integer.hashCode(this.f24107m)) * 31;
            AnalyticListingsPayload analyticListingsPayload = this.f24108n;
            if (analyticListingsPayload != null) {
                i11 = analyticListingsPayload.hashCode();
            }
            return hashCode9 + i11;
        }

        public String toString() {
            ListingsTypes listingsTypes = this.f24095a;
            String str = this.f24096b;
            int i11 = this.f24097c;
            String str2 = this.f24098d;
            String arrays = Arrays.toString(this.f24099e);
            AnalyticsListingsSource analyticsListingsSource = this.f24100f;
            int i12 = this.f24101g;
            boolean z11 = this.f24102h;
            int i13 = this.f24103i;
            int i14 = this.f24104j;
            String str3 = this.f24105k;
            SearchSource searchSource = this.f24106l;
            int i15 = this.f24107m;
            AnalyticListingsPayload analyticListingsPayload = this.f24108n;
            return "ActionVerticalFragmentToGeneralListingsFragment(listingTypes=" + listingsTypes + ", listingTitle=" + str + ", wantedItemsCategoryId=" + i11 + ", wantedItemsSearchQuery=" + str2 + ", districtIds=" + arrays + ", listingSource=" + analyticsListingsSource + ", categoryId=" + i12 + ", showTitle=" + z11 + ", topMargin=" + i13 + ", advID=" + i14 + ", ownerPhone=" + str3 + ", searchSource=" + searchSource + ", searchHistoryCount=" + i15 + ", analyticListingsPayload=" + analyticListingsPayload + ")";
        }

        public C0266b(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AnalyticsListingsSource listingSource, int i12, boolean z11, int i13, int i14, String str3, SearchSource searchSource, int i15, AnalyticListingsPayload analyticListingsPayload) {
            o.i(listingTypes, "listingTypes");
            o.i(listingSource, "listingSource");
            o.i(searchSource, "searchSource");
            this.f24095a = listingTypes;
            this.f24096b = str;
            this.f24097c = i11;
            this.f24098d = str2;
            this.f24099e = iArr;
            this.f24100f = listingSource;
            this.f24101g = i12;
            this.f24102h = z11;
            this.f24103i = i13;
            this.f24104j = i14;
            this.f24105k = str3;
            this.f24106l = searchSource;
            this.f24107m = i15;
            this.f24108n = analyticListingsPayload;
            this.f24109o = r0.f70116w0;
        }

        public /* synthetic */ C0266b(ListingsTypes listingsTypes, String str, int i11, String str2, int[] iArr, AnalyticsListingsSource analyticsListingsSource, int i12, boolean z11, int i13, int i14, String str3, SearchSource searchSource, int i15, AnalyticListingsPayload analyticListingsPayload, int i16, DefaultConstructorMarker defaultConstructorMarker) {
            this((i16 & 1) != 0 ? ListingsTypes.USER_ITEMS : listingsTypes, (i16 & 2) != 0 ? null : str, (i16 & 4) != 0 ? -1 : i11, (i16 & 8) != 0 ? null : str2, (i16 & 16) != 0 ? null : iArr, (i16 & 32) != 0 ? AnalyticsListingsSource.MORE : analyticsListingsSource, (i16 & 64) != 0 ? -1 : i12, (i16 & 128) != 0 ? true : z11, (i16 & 256) != 0 ? p0.f69709i : i13, (i16 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 ? i14 : -1, (i16 & 1024) != 0 ? null : str3, (i16 & RecyclerView.l.FLAG_MOVED) != 0 ? SearchSource.SEARCH_BAR : searchSource, (i16 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 0 : i15, (i16 & 8192) == 0 ? analyticListingsPayload : null);
        }
    }

    /* compiled from: VerticalFragmentDirections.kt */
    /* loaded from: classes2.dex */
    private static final class c implements n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f24110a;

        /* renamed from: b  reason: collision with root package name */
        private final String f24111b;

        /* renamed from: c  reason: collision with root package name */
        private final SubCategoriesPosition f24112c;

        /* renamed from: d  reason: collision with root package name */
        private final SubCategoryAnalyticsSource f24113d;

        /* renamed from: e  reason: collision with root package name */
        private final int f24114e;

        public c() {
            this(null, null, null, null, 15, null);
        }

        @Override // z3.n
        public int a() {
            return this.f24114e;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("PARENT_CATEGORY", this.f24110a);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("PARENT_CATEGORY", (Serializable) this.f24110a);
            }
            bundle.putString("CATEGORY_TITLE", this.f24111b);
            if (Parcelable.class.isAssignableFrom(SubCategoriesPosition.class)) {
                SubCategoriesPosition subCategoriesPosition = this.f24112c;
                o.g(subCategoriesPosition, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("SUB_CATEGORIES_POSITION", (Parcelable) subCategoriesPosition);
            } else if (Serializable.class.isAssignableFrom(SubCategoriesPosition.class)) {
                SubCategoriesPosition subCategoriesPosition2 = this.f24112c;
                o.g(subCategoriesPosition2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("SUB_CATEGORIES_POSITION", subCategoriesPosition2);
            }
            if (Parcelable.class.isAssignableFrom(SubCategoryAnalyticsSource.class)) {
                bundle.putParcelable("analyticSource", this.f24113d);
            } else if (Serializable.class.isAssignableFrom(SubCategoryAnalyticsSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f24113d);
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
            if (o.d(this.f24110a, cVar.f24110a) && o.d(this.f24111b, cVar.f24111b) && this.f24112c == cVar.f24112c && o.d(this.f24113d, cVar.f24113d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            CategoryEntity categoryEntity = this.f24110a;
            int i11 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i12 = hashCode * 31;
            String str = this.f24111b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int hashCode3 = (((i12 + hashCode2) * 31) + this.f24112c.hashCode()) * 31;
            SubCategoryAnalyticsSource subCategoryAnalyticsSource = this.f24113d;
            if (subCategoryAnalyticsSource != null) {
                i11 = subCategoryAnalyticsSource.hashCode();
            }
            return hashCode3 + i11;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f24110a;
            String str = this.f24111b;
            SubCategoriesPosition subCategoriesPosition = this.f24112c;
            SubCategoryAnalyticsSource subCategoryAnalyticsSource = this.f24113d;
            return "ActionVerticalFragmentToSubCategoriesFragment(PARENTCATEGORY=" + categoryEntity + ", CATEGORYTITLE=" + str + ", SUBCATEGORIESPOSITION=" + subCategoriesPosition + ", analyticSource=" + subCategoryAnalyticsSource + ")";
        }

        public c(CategoryEntity categoryEntity, String str, SubCategoriesPosition SUBCATEGORIESPOSITION, SubCategoryAnalyticsSource subCategoryAnalyticsSource) {
            o.i(SUBCATEGORIESPOSITION, "SUBCATEGORIESPOSITION");
            this.f24110a = categoryEntity;
            this.f24111b = str;
            this.f24112c = SUBCATEGORIESPOSITION;
            this.f24113d = subCategoryAnalyticsSource;
            this.f24114e = r0.f70142y0;
        }

        public /* synthetic */ c(CategoryEntity categoryEntity, String str, SubCategoriesPosition subCategoriesPosition, SubCategoryAnalyticsSource subCategoryAnalyticsSource, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? SubCategoriesPosition.DEFAULT : subCategoriesPosition, (i11 & 8) != 0 ? null : subCategoryAnalyticsSource);
        }
    }

    /* compiled from: VerticalFragmentDirections.kt */
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

        public final n a(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            return new a(categoryEntity, str, categoryListingsAnalyticSource, str2, intention, filtrationData, searchSource, searchAnalyticsData, z11);
        }

        public final n c(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AnalyticsListingsSource listingSource, int i12, boolean z11, int i13, int i14, String str3, SearchSource searchSource, int i15, AnalyticListingsPayload analyticListingsPayload) {
            o.i(listingTypes, "listingTypes");
            o.i(listingSource, "listingSource");
            o.i(searchSource, "searchSource");
            return new C0266b(listingTypes, str, i11, str2, iArr, listingSource, i12, z11, i13, i14, str3, searchSource, i15, analyticListingsPayload);
        }

        public final n e(CategoryEntity categoryEntity, String str, SubCategoriesPosition SUBCATEGORIESPOSITION, SubCategoryAnalyticsSource subCategoryAnalyticsSource) {
            o.i(SUBCATEGORIESPOSITION, "SUBCATEGORIESPOSITION");
            return new c(categoryEntity, str, SUBCATEGORIESPOSITION, subCategoryAnalyticsSource);
        }
    }
}
