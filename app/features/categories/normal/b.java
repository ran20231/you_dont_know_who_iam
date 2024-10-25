package com.forsale.app.features.categories.normal;

import android.os.Bundle;
import android.os.Parcelable;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.categories.listings.category.CategoryListingsAnalyticSource;
import com.forsale.app.features.search.SearchAnalyticsData;
import com.forsale.app.utils.analytics.SearchSource;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.r0;
import z3.n;
/* compiled from: SubCategoriesFragmentDirections.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final c f31081a = new c(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SubCategoriesFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class a implements n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f31082a;

        /* renamed from: b  reason: collision with root package name */
        private final String f31083b;

        /* renamed from: c  reason: collision with root package name */
        private final SubCategoriesPosition f31084c;

        /* renamed from: d  reason: collision with root package name */
        private final SubCategoryAnalyticsSource f31085d;

        /* renamed from: e  reason: collision with root package name */
        private final int f31086e;

        public a() {
            this(null, null, null, null, 15, null);
        }

        @Override // z3.n
        public int a() {
            return this.f31086e;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("PARENT_CATEGORY", this.f31082a);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("PARENT_CATEGORY", (Serializable) this.f31082a);
            }
            bundle.putString("CATEGORY_TITLE", this.f31083b);
            if (Parcelable.class.isAssignableFrom(SubCategoriesPosition.class)) {
                SubCategoriesPosition subCategoriesPosition = this.f31084c;
                o.g(subCategoriesPosition, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("SUB_CATEGORIES_POSITION", (Parcelable) subCategoriesPosition);
            } else if (Serializable.class.isAssignableFrom(SubCategoriesPosition.class)) {
                SubCategoriesPosition subCategoriesPosition2 = this.f31084c;
                o.g(subCategoriesPosition2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("SUB_CATEGORIES_POSITION", subCategoriesPosition2);
            }
            if (Parcelable.class.isAssignableFrom(SubCategoryAnalyticsSource.class)) {
                bundle.putParcelable("analyticSource", this.f31085d);
            } else if (Serializable.class.isAssignableFrom(SubCategoryAnalyticsSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f31085d);
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
            if (o.d(this.f31082a, aVar.f31082a) && o.d(this.f31083b, aVar.f31083b) && this.f31084c == aVar.f31084c && o.d(this.f31085d, aVar.f31085d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            CategoryEntity categoryEntity = this.f31082a;
            int i11 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i12 = hashCode * 31;
            String str = this.f31083b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int hashCode3 = (((i12 + hashCode2) * 31) + this.f31084c.hashCode()) * 31;
            SubCategoryAnalyticsSource subCategoryAnalyticsSource = this.f31085d;
            if (subCategoryAnalyticsSource != null) {
                i11 = subCategoryAnalyticsSource.hashCode();
            }
            return hashCode3 + i11;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f31082a;
            String str = this.f31083b;
            SubCategoriesPosition subCategoriesPosition = this.f31084c;
            SubCategoryAnalyticsSource subCategoryAnalyticsSource = this.f31085d;
            return "ActionSubCategoriesFragmentSelf(PARENTCATEGORY=" + categoryEntity + ", CATEGORYTITLE=" + str + ", SUBCATEGORIESPOSITION=" + subCategoriesPosition + ", analyticSource=" + subCategoryAnalyticsSource + ")";
        }

        public a(CategoryEntity categoryEntity, String str, SubCategoriesPosition SUBCATEGORIESPOSITION, SubCategoryAnalyticsSource subCategoryAnalyticsSource) {
            o.i(SUBCATEGORIESPOSITION, "SUBCATEGORIESPOSITION");
            this.f31082a = categoryEntity;
            this.f31083b = str;
            this.f31084c = SUBCATEGORIESPOSITION;
            this.f31085d = subCategoryAnalyticsSource;
            this.f31086e = r0.f70090u0;
        }

        public /* synthetic */ a(CategoryEntity categoryEntity, String str, SubCategoriesPosition subCategoriesPosition, SubCategoryAnalyticsSource subCategoryAnalyticsSource, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? SubCategoriesPosition.DEFAULT : subCategoriesPosition, (i11 & 8) != 0 ? null : subCategoryAnalyticsSource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SubCategoriesFragmentDirections.kt */
    /* renamed from: com.forsale.app.features.categories.normal.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0340b implements n {

        /* renamed from: a  reason: collision with root package name */
        private final CategoryEntity f31087a;

        /* renamed from: b  reason: collision with root package name */
        private final String f31088b;

        /* renamed from: c  reason: collision with root package name */
        private final CategoryListingsAnalyticSource f31089c;

        /* renamed from: d  reason: collision with root package name */
        private final String f31090d;

        /* renamed from: e  reason: collision with root package name */
        private final ListingsIntention f31091e;

        /* renamed from: f  reason: collision with root package name */
        private final GetListingsBody.FiltrationData f31092f;

        /* renamed from: g  reason: collision with root package name */
        private final SearchSource f31093g;

        /* renamed from: h  reason: collision with root package name */
        private final SearchAnalyticsData f31094h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f31095i;

        /* renamed from: j  reason: collision with root package name */
        private final int f31096j;

        public C0340b() {
            this(null, null, null, null, null, null, null, null, false, 511, null);
        }

        @Override // z3.n
        public int a() {
            return this.f31096j;
        }

        @Override // z3.n
        public Bundle b() {
            Bundle bundle = new Bundle();
            if (Parcelable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putParcelable("parentCategory", this.f31087a);
            } else if (Serializable.class.isAssignableFrom(CategoryEntity.class)) {
                bundle.putSerializable("parentCategory", (Serializable) this.f31087a);
            }
            bundle.putString("CATEGORY_TITLE", this.f31088b);
            if (Parcelable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putParcelable("analyticSource", this.f31089c);
            } else if (Serializable.class.isAssignableFrom(CategoryListingsAnalyticSource.class)) {
                bundle.putSerializable("analyticSource", (Serializable) this.f31089c);
            }
            bundle.putString("searchKeyword", this.f31090d);
            if (Parcelable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention = this.f31091e;
                o.g(listingsIntention, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("intention", (Parcelable) listingsIntention);
            } else if (Serializable.class.isAssignableFrom(ListingsIntention.class)) {
                ListingsIntention listingsIntention2 = this.f31091e;
                o.g(listingsIntention2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("intention", listingsIntention2);
            }
            if (Parcelable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putParcelable("predefinedFilters", this.f31092f);
            } else if (Serializable.class.isAssignableFrom(GetListingsBody.FiltrationData.class)) {
                bundle.putSerializable("predefinedFilters", (Serializable) this.f31092f);
            }
            if (Parcelable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource = this.f31093g;
                o.g(searchSource, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("searchSource", (Parcelable) searchSource);
            } else if (Serializable.class.isAssignableFrom(SearchSource.class)) {
                SearchSource searchSource2 = this.f31093g;
                o.g(searchSource2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("searchSource", searchSource2);
            }
            if (Parcelable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putParcelable("searchAnalyticsData", this.f31094h);
            } else if (Serializable.class.isAssignableFrom(SearchAnalyticsData.class)) {
                bundle.putSerializable("searchAnalyticsData", (Serializable) this.f31094h);
            }
            bundle.putBoolean("fromBreadCrumbs", this.f31095i);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0340b)) {
                return false;
            }
            C0340b c0340b = (C0340b) obj;
            if (o.d(this.f31087a, c0340b.f31087a) && o.d(this.f31088b, c0340b.f31088b) && o.d(this.f31089c, c0340b.f31089c) && o.d(this.f31090d, c0340b.f31090d) && this.f31091e == c0340b.f31091e && o.d(this.f31092f, c0340b.f31092f) && this.f31093g == c0340b.f31093g && o.d(this.f31094h, c0340b.f31094h) && this.f31095i == c0340b.f31095i) {
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
            CategoryEntity categoryEntity = this.f31087a;
            int i11 = 0;
            if (categoryEntity == null) {
                hashCode = 0;
            } else {
                hashCode = categoryEntity.hashCode();
            }
            int i12 = hashCode * 31;
            String str = this.f31088b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f31089c;
            if (categoryListingsAnalyticSource == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = categoryListingsAnalyticSource.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            String str2 = this.f31090d;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int hashCode6 = (((i14 + hashCode4) * 31) + this.f31091e.hashCode()) * 31;
            GetListingsBody.FiltrationData filtrationData = this.f31092f;
            if (filtrationData == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = filtrationData.hashCode();
            }
            int hashCode7 = (((hashCode6 + hashCode5) * 31) + this.f31093g.hashCode()) * 31;
            SearchAnalyticsData searchAnalyticsData = this.f31094h;
            if (searchAnalyticsData != null) {
                i11 = searchAnalyticsData.hashCode();
            }
            int i15 = (hashCode7 + i11) * 31;
            boolean z11 = this.f31095i;
            int i16 = z11;
            if (z11 != 0) {
                i16 = 1;
            }
            return i15 + i16;
        }

        public String toString() {
            CategoryEntity categoryEntity = this.f31087a;
            String str = this.f31088b;
            CategoryListingsAnalyticSource categoryListingsAnalyticSource = this.f31089c;
            String str2 = this.f31090d;
            ListingsIntention listingsIntention = this.f31091e;
            GetListingsBody.FiltrationData filtrationData = this.f31092f;
            SearchSource searchSource = this.f31093g;
            SearchAnalyticsData searchAnalyticsData = this.f31094h;
            boolean z11 = this.f31095i;
            return "ActionSubCategoriesFragmentToCategoryListingsFragment(parentCategory=" + categoryEntity + ", CATEGORYTITLE=" + str + ", analyticSource=" + categoryListingsAnalyticSource + ", searchKeyword=" + str2 + ", intention=" + listingsIntention + ", predefinedFilters=" + filtrationData + ", searchSource=" + searchSource + ", searchAnalyticsData=" + searchAnalyticsData + ", fromBreadCrumbs=" + z11 + ")";
        }

        public C0340b(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            this.f31087a = categoryEntity;
            this.f31088b = str;
            this.f31089c = categoryListingsAnalyticSource;
            this.f31090d = str2;
            this.f31091e = intention;
            this.f31092f = filtrationData;
            this.f31093g = searchSource;
            this.f31094h = searchAnalyticsData;
            this.f31095i = z11;
            this.f31096j = r0.f70103v0;
        }

        public /* synthetic */ C0340b(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention listingsIntention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : categoryEntity, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : categoryListingsAnalyticSource, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? ListingsIntention.LISTINGS : listingsIntention, (i11 & 32) != 0 ? null : filtrationData, (i11 & 64) != 0 ? SearchSource.NONE : searchSource, (i11 & 128) == 0 ? searchAnalyticsData : null, (i11 & 256) != 0 ? false : z11);
        }
    }

    /* compiled from: SubCategoriesFragmentDirections.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ n b(c cVar, CategoryEntity categoryEntity, String str, SubCategoriesPosition subCategoriesPosition, SubCategoryAnalyticsSource subCategoryAnalyticsSource, int i11, Object obj) {
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
            return cVar.a(categoryEntity, str, subCategoriesPosition, subCategoryAnalyticsSource);
        }

        public static /* synthetic */ n d(c cVar, CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention listingsIntention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11, int i11, Object obj) {
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
            return cVar.c(categoryEntity, str, categoryListingsAnalyticSource, str2, listingsIntention, filtrationData, searchSource, searchAnalyticsData, z11);
        }

        public final n a(CategoryEntity categoryEntity, String str, SubCategoriesPosition SUBCATEGORIESPOSITION, SubCategoryAnalyticsSource subCategoryAnalyticsSource) {
            o.i(SUBCATEGORIESPOSITION, "SUBCATEGORIESPOSITION");
            return new a(categoryEntity, str, SUBCATEGORIESPOSITION, subCategoryAnalyticsSource);
        }

        public final n c(CategoryEntity categoryEntity, String str, CategoryListingsAnalyticSource categoryListingsAnalyticSource, String str2, ListingsIntention intention, GetListingsBody.FiltrationData filtrationData, SearchSource searchSource, SearchAnalyticsData searchAnalyticsData, boolean z11) {
            o.i(intention, "intention");
            o.i(searchSource, "searchSource");
            return new C0340b(categoryEntity, str, categoryListingsAnalyticSource, str2, intention, filtrationData, searchSource, searchAnalyticsData, z11);
        }
    }
}
