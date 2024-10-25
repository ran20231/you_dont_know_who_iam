package com.forsale.app.features.categories.listings.category;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.analytics.SearchSource;
import com.google.android.gms.ads.AdRequest;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import z3.h;
/* compiled from: CategoryListingsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: k  reason: collision with root package name */
    public static final C0311a f28659k = new C0311a(null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f28660l = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CategoryEntity f28661a;

    /* renamed from: b  reason: collision with root package name */
    private final String f28662b;

    /* renamed from: c  reason: collision with root package name */
    private final String f28663c;

    /* renamed from: d  reason: collision with root package name */
    private final ListingsIntention f28664d;

    /* renamed from: e  reason: collision with root package name */
    private final AdvancedSearchBody f28665e;

    /* renamed from: f  reason: collision with root package name */
    private final CategoryListingsAnalyticSource f28666f;

    /* renamed from: g  reason: collision with root package name */
    private final GetListingsBody.FiltrationData f28667g;

    /* renamed from: h  reason: collision with root package name */
    private final SearchSource f28668h;

    /* renamed from: i  reason: collision with root package name */
    private final SearchAnalyticsData f28669i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f28670j;

    /* compiled from: CategoryListingsFragmentArgs.kt */
    /* renamed from: com.forsale.app.features.categories.listings.category.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0311a {
        private C0311a() {
        }

        public /* synthetic */ C0311a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Bundle bundle) {
            CategoryEntity categoryEntity;
            String str;
            String str2;
            ListingsIntention listingsIntention;
            AdvancedSearchBody advancedSearchBody;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource;
            GetListingsBody.FiltrationData filtrationData;
            SearchSource searchSource;
            boolean z11;
            o.i(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            SearchAnalyticsData searchAnalyticsData = null;
            if (bundle.containsKey("parentCategory")) {
                if (!Parcelable.class.isAssignableFrom(CategoryEntity.class) && !Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                    throw new UnsupportedOperationException(CategoryEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                categoryEntity = (CategoryEntity) bundle.get("parentCategory");
            } else {
                categoryEntity = null;
            }
            if (bundle.containsKey("CATEGORY_TITLE")) {
                str = bundle.getString("CATEGORY_TITLE");
            } else {
                str = null;
            }
            if (bundle.containsKey("searchKeyword")) {
                str2 = bundle.getString("searchKeyword");
            } else {
                str2 = null;
            }
            if (bundle.containsKey("intention")) {
                if (!Parcelable.class.isAssignableFrom(ListingsIntention.class) && !Serializable.class.isAssignableFrom(ListingsIntention.class)) {
                    throw new UnsupportedOperationException(ListingsIntention.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                listingsIntention = (ListingsIntention) bundle.get("intention");
                if (listingsIntention == null) {
                    throw new IllegalArgumentException("Argument \"intention\" is marked as non-null but was passed a null value.");
                }
            } else {
                listingsIntention = ListingsIntention.LISTINGS;
            }
            ListingsIntention listingsIntention2 = listingsIntention;
            if (bundle.containsKey("initAdvancedSearchBody")) {
                if (!Parcelable.class.isAssignableFrom(AdvancedSearchBody.class) && !Serializable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                    throw new UnsupportedOperationException(AdvancedSearchBody.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                advancedSearchBody = (AdvancedSearchBody) bundle.get("initAdvancedSearchBody");
            } else {
                advancedSearchBody = null;
            }
            if (bundle.containsKey("analyticSource")) {
                if (!Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class) && !Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                    throw new UnsupportedOperationException(CategoryListingsAnalyticSource.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                categoryListingsAnalyticSource = (CategoryListingsAnalyticSource) bundle.get("analyticSource");
            } else {
                categoryListingsAnalyticSource = null;
            }
            if (bundle.containsKey("predefinedFilters")) {
                if (!Parcelable.class.isAssignableFrom(GetListingsBody.FiltrationData.class) && !Serializable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                    throw new UnsupportedOperationException(GetListingsBody.FiltrationData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                filtrationData = (GetListingsBody.FiltrationData) bundle.get("predefinedFilters");
            } else {
                filtrationData = null;
            }
            if (bundle.containsKey("searchSource")) {
                if (!Parcelable.class.isAssignableFrom(SearchSource.class) && !Serializable.class.isAssignableFrom(SearchSource.class)) {
                    throw new UnsupportedOperationException(SearchSource.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                searchSource = (SearchSource) bundle.get("searchSource");
                if (searchSource == null) {
                    throw new IllegalArgumentException("Argument \"searchSource\" is marked as non-null but was passed a null value.");
                }
            } else {
                searchSource = SearchSource.NONE;
            }
            SearchSource searchSource2 = searchSource;
            if (bundle.containsKey("searchAnalyticsData")) {
                if (!Parcelable.class.isAssignableFrom(SearchAnalyticsData.class) && !Serializable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                    throw new UnsupportedOperationException(SearchAnalyticsData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                searchAnalyticsData = (SearchAnalyticsData) bundle.get("searchAnalyticsData");
            }
            SearchAnalyticsData searchAnalyticsData2 = searchAnalyticsData;
            if (bundle.containsKey("fromBreadCrumbs")) {
                z11 = bundle.getBoolean("fromBreadCrumbs");
            } else {
                z11 = false;
            }
            return new a(categoryEntity, str, str2, listingsIntention2, advancedSearchBody, categoryListingsAnalyticSource, filtrationData, searchSource2, searchAnalyticsData2, z11);
        }

        public final a b(k0 savedStateHandle) {
            CategoryEntity categoryEntity;
            String str;
            String str2;
            ListingsIntention listingsIntention;
            AdvancedSearchBody advancedSearchBody;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource;
            GetListingsBody.FiltrationData filtrationData;
            SearchSource searchSource;
            Boolean bool;
            o.i(savedStateHandle, "savedStateHandle");
            SearchAnalyticsData searchAnalyticsData = null;
            if (savedStateHandle.e("parentCategory")) {
                if (!Parcelable.class.isAssignableFrom(CategoryEntity.class) && !Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                    throw new UnsupportedOperationException(CategoryEntity.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                categoryEntity = (CategoryEntity) savedStateHandle.f("parentCategory");
            } else {
                categoryEntity = null;
            }
            if (savedStateHandle.e("CATEGORY_TITLE")) {
                str = (String) savedStateHandle.f("CATEGORY_TITLE");
            } else {
                str = null;
            }
            if (savedStateHandle.e("searchKeyword")) {
                str2 = (String) savedStateHandle.f("searchKeyword");
            } else {
                str2 = null;
            }
            if (savedStateHandle.e("intention")) {
                if (!Parcelable.class.isAssignableFrom(ListingsIntention.class) && !Serializable.class.isAssignableFrom(ListingsIntention.class)) {
                    throw new UnsupportedOperationException(ListingsIntention.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                listingsIntention = (ListingsIntention) savedStateHandle.f("intention");
                if (listingsIntention == null) {
                    throw new IllegalArgumentException("Argument \"intention\" is marked as non-null but was passed a null value");
                }
            } else {
                listingsIntention = ListingsIntention.LISTINGS;
            }
            ListingsIntention listingsIntention2 = listingsIntention;
            if (savedStateHandle.e("initAdvancedSearchBody")) {
                if (!Parcelable.class.isAssignableFrom(AdvancedSearchBody.class) && !Serializable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                    throw new UnsupportedOperationException(AdvancedSearchBody.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                advancedSearchBody = (AdvancedSearchBody) savedStateHandle.f("initAdvancedSearchBody");
            } else {
                advancedSearchBody = null;
            }
            if (savedStateHandle.e("analyticSource")) {
                if (!Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class) && !Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                    throw new UnsupportedOperationException(CategoryListingsAnalyticSource.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                categoryListingsAnalyticSource = (CategoryListingsAnalyticSource) savedStateHandle.f("analyticSource");
            } else {
                categoryListingsAnalyticSource = null;
            }
            if (savedStateHandle.e("predefinedFilters")) {
                if (!Parcelable.class.isAssignableFrom(GetListingsBody.FiltrationData.class) && !Serializable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                    throw new UnsupportedOperationException(GetListingsBody.FiltrationData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                filtrationData = (GetListingsBody.FiltrationData) savedStateHandle.f("predefinedFilters");
            } else {
                filtrationData = null;
            }
            if (savedStateHandle.e("searchSource")) {
                if (!Parcelable.class.isAssignableFrom(SearchSource.class) && !Serializable.class.isAssignableFrom(SearchSource.class)) {
                    throw new UnsupportedOperationException(SearchSource.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                searchSource = (SearchSource) savedStateHandle.f("searchSource");
                if (searchSource == null) {
                    throw new IllegalArgumentException("Argument \"searchSource\" is marked as non-null but was passed a null value");
                }
            } else {
                searchSource = SearchSource.NONE;
            }
            SearchSource searchSource2 = searchSource;
            if (savedStateHandle.e("searchAnalyticsData")) {
                if (!Parcelable.class.isAssignableFrom(SearchAnalyticsData.class) && !Serializable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                    throw new UnsupportedOperationException(SearchAnalyticsData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                searchAnalyticsData = (SearchAnalyticsData) savedStateHandle.f("searchAnalyticsData");
            }
            SearchAnalyticsData searchAnalyticsData2 = searchAnalyticsData;
            if (savedStateHandle.e("fromBreadCrumbs")) {
                bool = (Boolean) savedStateHandle.f("fromBreadCrumbs");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"fromBreadCrumbs\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.FALSE;
            }
            return new a(categoryEntity, str, str2, listingsIntention2, advancedSearchBody, categoryListingsAnalyticSource, filtrationData, searchSource2, searchAnalyticsData2, bool.booleanValue());
        }
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, false, 1023, null);
    }

    public static final a fromBundle(Bundle bundle) {
        return f28659k.a(bundle);
    }

    public final CategoryListingsAnalyticSource a() {
        return this.f28666f;
    }

    public final boolean b() {
        return this.f28670j;
    }

    public final ListingsIntention c() {
        return this.f28664d;
    }

    public final CategoryEntity d() {
        return this.f28661a;
    }

    public final GetListingsBody.FiltrationData e() {
        return this.f28667g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (o.d(this.f28661a, aVar.f28661a) && o.d(this.f28662b, aVar.f28662b) && o.d(this.f28663c, aVar.f28663c) && this.f28664d == aVar.f28664d && o.d(this.f28665e, aVar.f28665e) && o.d(this.f28666f, aVar.f28666f) && o.d(this.f28667g, aVar.f28667g) && this.f28668h == aVar.f28668h && o.d(this.f28669i, aVar.f28669i) && this.f28670j == aVar.f28670j) {
            return true;
        }
        return false;
    }

    public final SearchAnalyticsData f() {
        return this.f28669i;
    }

    public final String g() {
        return this.f28663c;
    }

    public final SearchSource h() {
        return this.f28668h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        CategoryEntity categoryEntity = this.f28661a;
        int i11 = 0;
        if (categoryEntity == null) {
            hashCode = 0;
        } else {
            hashCode = categoryEntity.hashCode();
        }
        int i12 = hashCode * 31;
        String str = this.f28662b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str2 = this.f28663c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode7 = (((i13 + hashCode3) * 31) + this.f28664d.hashCode()) * 31;
        AdvancedSearchBody advancedSearchBody = this.f28665e;
        if (advancedSearchBody == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = advancedSearchBody.hashCode();
        }
        int i14 = (hashCode7 + hashCode4) * 31;
        CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f28666f;
        if (categoryListingsAnalyticSource == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = categoryListingsAnalyticSource.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        GetListingsBody.FiltrationData filtrationData = this.f28667g;
        if (filtrationData == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = filtrationData.hashCode();
        }
        int hashCode8 = (((i15 + hashCode6) * 31) + this.f28668h.hashCode()) * 31;
        SearchAnalyticsData searchAnalyticsData = this.f28669i;
        if (searchAnalyticsData != null) {
            i11 = searchAnalyticsData.hashCode();
        }
        int i16 = (hashCode8 + i11) * 31;
        boolean z11 = this.f28670j;
        int i17 = z11;
        if (z11 != 0) {
            i17 = 1;
        }
        return i16 + i17;
    }

    public String toString() {
        CategoryEntity categoryEntity = this.f28661a;
        String str = this.f28662b;
        String str2 = this.f28663c;
        ListingsIntention listingsIntention = this.f28664d;
        AdvancedSearchBody advancedSearchBody = this.f28665e;
        CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f28666f;
        GetListingsBody.FiltrationData filtrationData = this.f28667g;
        SearchSource searchSource = this.f28668h;
        SearchAnalyticsData searchAnalyticsData = this.f28669i;
        boolean z11 = this.f28670j;
        return "CategoryListingsFragmentArgs(parentCategory=" + categoryEntity + ", CATEGORYTITLE=" + str + ", searchKeyword=" + str2 + ", intention=" + listingsIntention + ", initAdvancedSearchBody=" + advancedSearchBody + ", analyticSource=" + categoryListingsAnalyticSource + ", predefinedFilters=" + filtrationData + ", searchSource=" + searchSource + ", searchAnalyticsData=" + searchAnalyticsData + ", fromBreadCrumbs=" + z11 + ")";
    }

    public a(CategoryEntity categoryEntity, String str, String str2, ListingsIntention intention, AdvancedSearchBody advancedSearchBody, CategoryListingsAnalyticSource categoryListingsAnalyticSource, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
        o.i(intention, "intention");
        o.i(searchSource, "searchSource");
        this.f28661a = categoryEntity;
        this.f28662b = str;
        this.f28663c = str2;
        this.f28664d = intention;
        this.f28665e = advancedSearchBody;
        this.f28666f = categoryListingsAnalyticSource;
        this.f28667g = filtrationData;
        this.f28668h = searchSource;
        this.f28669i = searchAnalyticsData;
        this.f28670j = z11;
    }

    public /* synthetic */ a(CategoryEntity categoryEntity, String str, String str2, ListingsIntention listingsIntention, AdvancedSearchBody advancedSearchBody, CategoryListingsAnalyticSource categoryListingsAnalyticSource, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? ListingsIntention.LISTINGS : listingsIntention, (i11 & 16) != 0 ? null : advancedSearchBody, (i11 & 32) != 0 ? null : categoryListingsAnalyticSource, (i11 & 64) != 0 ? null : filtrationData, (i11 & 128) != 0 ? SearchSource.NONE : searchSource, (i11 & 256) == 0 ? searchAnalyticsData : null, (i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? false : z11);
    }
}
