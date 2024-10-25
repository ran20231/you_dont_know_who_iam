package com.forsale.app.features.categories.listings.generalListings;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.features.categories.listings.ListingsTypes;
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
/* compiled from: GeneralListingsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class b implements z3.h {

    /* renamed from: p  reason: collision with root package name */
    public static final a f30530p = new a(null);

    /* renamed from: q  reason: collision with root package name */
    public static final int f30531q = 8;

    /* renamed from: a  reason: collision with root package name */
    private final ListingsTypes f30532a;

    /* renamed from: b  reason: collision with root package name */
    private final String f30533b;

    /* renamed from: c  reason: collision with root package name */
    private final int f30534c;

    /* renamed from: d  reason: collision with root package name */
    private final String f30535d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f30536e;

    /* renamed from: f  reason: collision with root package name */
    private final AdvancedSearchBody f30537f;

    /* renamed from: g  reason: collision with root package name */
    private final AnalyticsListingsSource f30538g;

    /* renamed from: h  reason: collision with root package name */
    private final int f30539h;

    /* renamed from: i  reason: collision with root package name */
    private final int f30540i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f30541j;

    /* renamed from: k  reason: collision with root package name */
    private final SearchSource f30542k;

    /* renamed from: l  reason: collision with root package name */
    private final int f30543l;

    /* renamed from: m  reason: collision with root package name */
    private final String f30544m;

    /* renamed from: n  reason: collision with root package name */
    private final int f30545n;

    /* renamed from: o  reason: collision with root package name */
    private final AnalyticListingsPayload f30546o;

    /* compiled from: GeneralListingsFragmentArgs.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Bundle bundle) {
            ListingsTypes listingsTypes;
            String str;
            int i11;
            String str2;
            int[] iArr;
            AdvancedSearchBody advancedSearchBody;
            AnalyticsListingsSource analyticsListingsSource;
            int i12;
            int i13;
            boolean z11;
            SearchSource searchSource;
            int i14;
            String str3;
            int i15;
            AnalyticListingsPayload analyticListingsPayload;
            o.i(bundle, "bundle");
            bundle.setClassLoader(b.class.getClassLoader());
            if (bundle.containsKey("listingTypes")) {
                if (!Parcelable.class.isAssignableFrom(ListingsTypes.class) && !Serializable.class.isAssignableFrom(ListingsTypes.class)) {
                    throw new UnsupportedOperationException(ListingsTypes.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                listingsTypes = (ListingsTypes) bundle.get("listingTypes");
                if (listingsTypes == null) {
                    throw new IllegalArgumentException("Argument \"listingTypes\" is marked as non-null but was passed a null value.");
                }
            } else {
                listingsTypes = ListingsTypes.USER_ITEMS;
            }
            ListingsTypes listingsTypes2 = listingsTypes;
            if (bundle.containsKey("listingTitle")) {
                str = bundle.getString("listingTitle");
            } else {
                str = null;
            }
            if (bundle.containsKey("wantedItemsCategoryId")) {
                i11 = bundle.getInt("wantedItemsCategoryId");
            } else {
                i11 = -1;
            }
            if (bundle.containsKey("wantedItemsSearchQuery")) {
                str2 = bundle.getString("wantedItemsSearchQuery");
            } else {
                str2 = null;
            }
            if (bundle.containsKey("districtIds")) {
                iArr = bundle.getIntArray("districtIds");
            } else {
                iArr = null;
            }
            if (bundle.containsKey("searchBody")) {
                if (!Parcelable.class.isAssignableFrom(AdvancedSearchBody.class) && !Serializable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                    throw new UnsupportedOperationException(AdvancedSearchBody.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                advancedSearchBody = (AdvancedSearchBody) bundle.get("searchBody");
            } else {
                advancedSearchBody = null;
            }
            if (bundle.containsKey("listingSource")) {
                if (!Parcelable.class.isAssignableFrom(AnalyticsListingsSource.class) && !Serializable.class.isAssignableFrom(AnalyticsListingsSource.class)) {
                    throw new UnsupportedOperationException(AnalyticsListingsSource.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                analyticsListingsSource = (AnalyticsListingsSource) bundle.get("listingSource");
                if (analyticsListingsSource == null) {
                    throw new IllegalArgumentException("Argument \"listingSource\" is marked as non-null but was passed a null value.");
                }
            } else {
                analyticsListingsSource = AnalyticsListingsSource.MORE;
            }
            AnalyticsListingsSource analyticsListingsSource2 = analyticsListingsSource;
            if (bundle.containsKey("categoryId")) {
                i12 = bundle.getInt("categoryId");
            } else {
                i12 = -1;
            }
            if (bundle.containsKey("topMargin")) {
                i13 = bundle.getInt("topMargin");
            } else {
                i13 = p0.f69709i;
            }
            int i16 = i13;
            if (bundle.containsKey("showTitle")) {
                z11 = bundle.getBoolean("showTitle");
            } else {
                z11 = true;
            }
            boolean z12 = z11;
            if (bundle.containsKey("searchSource")) {
                if (!Parcelable.class.isAssignableFrom(SearchSource.class) && !Serializable.class.isAssignableFrom(SearchSource.class)) {
                    throw new UnsupportedOperationException(SearchSource.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                searchSource = (SearchSource) bundle.get("searchSource");
                if (searchSource == null) {
                    throw new IllegalArgumentException("Argument \"searchSource\" is marked as non-null but was passed a null value.");
                }
            } else {
                searchSource = SearchSource.SEARCH_BAR;
            }
            if (bundle.containsKey("searchHistoryCount")) {
                i14 = bundle.getInt("searchHistoryCount");
            } else {
                i14 = 0;
            }
            int i17 = i14;
            if (bundle.containsKey("ownerPhone")) {
                str3 = bundle.getString("ownerPhone");
            } else {
                str3 = null;
            }
            if (bundle.containsKey("advID")) {
                i15 = bundle.getInt("advID");
            } else {
                i15 = -1;
            }
            if (bundle.containsKey("analyticListingsPayload")) {
                if (!Parcelable.class.isAssignableFrom(AnalyticListingsPayload.class) && !Serializable.class.isAssignableFrom(AnalyticListingsPayload.class)) {
                    throw new UnsupportedOperationException(AnalyticListingsPayload.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                analyticListingsPayload = (AnalyticListingsPayload) bundle.get("analyticListingsPayload");
            } else {
                analyticListingsPayload = null;
            }
            return new b(listingsTypes2, str, i11, str2, iArr, advancedSearchBody, analyticsListingsSource2, i12, i16, z12, searchSource, i17, str3, i15, analyticListingsPayload);
        }

        public final b b(k0 savedStateHandle) {
            ListingsTypes listingsTypes;
            String str;
            Integer num;
            String str2;
            int[] iArr;
            AdvancedSearchBody advancedSearchBody;
            AnalyticsListingsSource analyticsListingsSource;
            Integer num2;
            Integer valueOf;
            Boolean bool;
            SearchSource searchSource;
            Integer num3;
            String str3;
            Integer num4;
            AnalyticListingsPayload analyticListingsPayload;
            o.i(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.e("listingTypes")) {
                if (!Parcelable.class.isAssignableFrom(ListingsTypes.class) && !Serializable.class.isAssignableFrom(ListingsTypes.class)) {
                    String name = ListingsTypes.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                listingsTypes = (ListingsTypes) savedStateHandle.f("listingTypes");
                if (listingsTypes == null) {
                    throw new IllegalArgumentException("Argument \"listingTypes\" is marked as non-null but was passed a null value");
                }
            } else {
                listingsTypes = ListingsTypes.USER_ITEMS;
            }
            ListingsTypes listingsTypes2 = listingsTypes;
            if (savedStateHandle.e("listingTitle")) {
                str = (String) savedStateHandle.f("listingTitle");
            } else {
                str = null;
            }
            if (savedStateHandle.e("wantedItemsCategoryId")) {
                num = (Integer) savedStateHandle.f("wantedItemsCategoryId");
                if (num == null) {
                    throw new IllegalArgumentException("Argument \"wantedItemsCategoryId\" of type integer does not support null values");
                }
            } else {
                num = -1;
            }
            if (savedStateHandle.e("wantedItemsSearchQuery")) {
                str2 = (String) savedStateHandle.f("wantedItemsSearchQuery");
            } else {
                str2 = null;
            }
            if (savedStateHandle.e("districtIds")) {
                iArr = (int[]) savedStateHandle.f("districtIds");
            } else {
                iArr = null;
            }
            if (savedStateHandle.e("searchBody")) {
                if (!Parcelable.class.isAssignableFrom(AdvancedSearchBody.class) && !Serializable.class.isAssignableFrom(AdvancedSearchBody.class)) {
                    String name2 = AdvancedSearchBody.class.getName();
                    throw new UnsupportedOperationException(name2 + " must implement Parcelable or Serializable or must be an Enum.");
                }
                advancedSearchBody = (AdvancedSearchBody) savedStateHandle.f("searchBody");
            } else {
                advancedSearchBody = null;
            }
            if (savedStateHandle.e("listingSource")) {
                if (!Parcelable.class.isAssignableFrom(AnalyticsListingsSource.class) && !Serializable.class.isAssignableFrom(AnalyticsListingsSource.class)) {
                    String name3 = AnalyticsListingsSource.class.getName();
                    throw new UnsupportedOperationException(name3 + " must implement Parcelable or Serializable or must be an Enum.");
                }
                analyticsListingsSource = (AnalyticsListingsSource) savedStateHandle.f("listingSource");
                if (analyticsListingsSource == null) {
                    throw new IllegalArgumentException("Argument \"listingSource\" is marked as non-null but was passed a null value");
                }
            } else {
                analyticsListingsSource = AnalyticsListingsSource.MORE;
            }
            AnalyticsListingsSource analyticsListingsSource2 = analyticsListingsSource;
            if (savedStateHandle.e("categoryId")) {
                num2 = (Integer) savedStateHandle.f("categoryId");
                if (num2 == null) {
                    throw new IllegalArgumentException("Argument \"categoryId\" of type integer does not support null values");
                }
            } else {
                num2 = -1;
            }
            if (savedStateHandle.e("topMargin")) {
                valueOf = (Integer) savedStateHandle.f("topMargin");
                if (valueOf == null) {
                    throw new IllegalArgumentException("Argument \"topMargin\" of type reference does not support null values");
                }
            } else {
                valueOf = Integer.valueOf(p0.f69709i);
            }
            if (savedStateHandle.e("showTitle")) {
                bool = (Boolean) savedStateHandle.f("showTitle");
                if (bool == null) {
                    throw new IllegalArgumentException("Argument \"showTitle\" of type boolean does not support null values");
                }
            } else {
                bool = Boolean.TRUE;
            }
            if (savedStateHandle.e("searchSource")) {
                if (!Parcelable.class.isAssignableFrom(SearchSource.class) && !Serializable.class.isAssignableFrom(SearchSource.class)) {
                    String name4 = SearchSource.class.getName();
                    throw new UnsupportedOperationException(name4 + " must implement Parcelable or Serializable or must be an Enum.");
                }
                searchSource = (SearchSource) savedStateHandle.f("searchSource");
                if (searchSource == null) {
                    throw new IllegalArgumentException("Argument \"searchSource\" is marked as non-null but was passed a null value");
                }
            } else {
                searchSource = SearchSource.SEARCH_BAR;
            }
            SearchSource searchSource2 = searchSource;
            if (savedStateHandle.e("searchHistoryCount")) {
                num3 = (Integer) savedStateHandle.f("searchHistoryCount");
                if (num3 == null) {
                    throw new IllegalArgumentException("Argument \"searchHistoryCount\" of type integer does not support null values");
                }
            } else {
                num3 = 0;
            }
            if (savedStateHandle.e("ownerPhone")) {
                str3 = (String) savedStateHandle.f("ownerPhone");
            } else {
                str3 = null;
            }
            if (savedStateHandle.e("advID")) {
                num4 = (Integer) savedStateHandle.f("advID");
                if (num4 == null) {
                    throw new IllegalArgumentException("Argument \"advID\" of type integer does not support null values");
                }
            } else {
                num4 = -1;
            }
            if (savedStateHandle.e("analyticListingsPayload")) {
                if (!Parcelable.class.isAssignableFrom(AnalyticListingsPayload.class) && !Serializable.class.isAssignableFrom(AnalyticListingsPayload.class)) {
                    String name5 = AnalyticListingsPayload.class.getName();
                    throw new UnsupportedOperationException(name5 + " must implement Parcelable or Serializable or must be an Enum.");
                }
                analyticListingsPayload = (AnalyticListingsPayload) savedStateHandle.f("analyticListingsPayload");
            } else {
                analyticListingsPayload = null;
            }
            return new b(listingsTypes2, str, num.intValue(), str2, iArr, advancedSearchBody, analyticsListingsSource2, num2.intValue(), valueOf.intValue(), bool.booleanValue(), searchSource2, num3.intValue(), str3, num4.intValue(), analyticListingsPayload);
        }
    }

    public b() {
        this(null, null, 0, null, null, null, null, 0, 0, false, null, 0, null, 0, null, 32767, null);
    }

    public static final b fromBundle(Bundle bundle) {
        return f30530p.a(bundle);
    }

    public final int a() {
        return this.f30545n;
    }

    public final AnalyticListingsPayload b() {
        return this.f30546o;
    }

    public final int c() {
        return this.f30539h;
    }

    public final int[] d() {
        return this.f30536e;
    }

    public final AnalyticsListingsSource e() {
        return this.f30538g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f30532a == bVar.f30532a && o.d(this.f30533b, bVar.f30533b) && this.f30534c == bVar.f30534c && o.d(this.f30535d, bVar.f30535d) && o.d(this.f30536e, bVar.f30536e) && o.d(this.f30537f, bVar.f30537f) && this.f30538g == bVar.f30538g && this.f30539h == bVar.f30539h && this.f30540i == bVar.f30540i && this.f30541j == bVar.f30541j && this.f30542k == bVar.f30542k && this.f30543l == bVar.f30543l && o.d(this.f30544m, bVar.f30544m) && this.f30545n == bVar.f30545n && o.d(this.f30546o, bVar.f30546o)) {
            return true;
        }
        return false;
    }

    public final ListingsTypes f() {
        return this.f30532a;
    }

    public final String g() {
        return this.f30544m;
    }

    public final AdvancedSearchBody h() {
        return this.f30537f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.f30532a.hashCode() * 31;
        String str = this.f30533b;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode7 = (((hashCode6 + hashCode) * 31) + Integer.hashCode(this.f30534c)) * 31;
        String str2 = this.f30535d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (hashCode7 + hashCode2) * 31;
        int[] iArr = this.f30536e;
        if (iArr == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = Arrays.hashCode(iArr);
        }
        int i13 = (i12 + hashCode3) * 31;
        AdvancedSearchBody advancedSearchBody = this.f30537f;
        if (advancedSearchBody == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = advancedSearchBody.hashCode();
        }
        int hashCode8 = (((((((i13 + hashCode4) * 31) + this.f30538g.hashCode()) * 31) + Integer.hashCode(this.f30539h)) * 31) + Integer.hashCode(this.f30540i)) * 31;
        boolean z11 = this.f30541j;
        int i14 = z11;
        if (z11 != 0) {
            i14 = 1;
        }
        int hashCode9 = (((((hashCode8 + i14) * 31) + this.f30542k.hashCode()) * 31) + Integer.hashCode(this.f30543l)) * 31;
        String str3 = this.f30544m;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int hashCode10 = (((hashCode9 + hashCode5) * 31) + Integer.hashCode(this.f30545n)) * 31;
        AnalyticListingsPayload analyticListingsPayload = this.f30546o;
        if (analyticListingsPayload != null) {
            i11 = analyticListingsPayload.hashCode();
        }
        return hashCode10 + i11;
    }

    public final SearchSource i() {
        return this.f30542k;
    }

    public final boolean j() {
        return this.f30541j;
    }

    public final int k() {
        return this.f30534c;
    }

    public final String l() {
        return this.f30535d;
    }

    public String toString() {
        ListingsTypes listingsTypes = this.f30532a;
        String str = this.f30533b;
        int i11 = this.f30534c;
        String str2 = this.f30535d;
        String arrays = Arrays.toString(this.f30536e);
        AdvancedSearchBody advancedSearchBody = this.f30537f;
        AnalyticsListingsSource analyticsListingsSource = this.f30538g;
        int i12 = this.f30539h;
        int i13 = this.f30540i;
        boolean z11 = this.f30541j;
        SearchSource searchSource = this.f30542k;
        int i14 = this.f30543l;
        String str3 = this.f30544m;
        int i15 = this.f30545n;
        AnalyticListingsPayload analyticListingsPayload = this.f30546o;
        return "GeneralListingsFragmentArgs(listingTypes=" + listingsTypes + ", listingTitle=" + str + ", wantedItemsCategoryId=" + i11 + ", wantedItemsSearchQuery=" + str2 + ", districtIds=" + arrays + ", searchBody=" + advancedSearchBody + ", listingSource=" + analyticsListingsSource + ", categoryId=" + i12 + ", topMargin=" + i13 + ", showTitle=" + z11 + ", searchSource=" + searchSource + ", searchHistoryCount=" + i14 + ", ownerPhone=" + str3 + ", advID=" + i15 + ", analyticListingsPayload=" + analyticListingsPayload + ")";
    }

    public b(ListingsTypes listingTypes, String str, int i11, String str2, int[] iArr, AdvancedSearchBody advancedSearchBody, AnalyticsListingsSource listingSource, int i12, int i13, boolean z11, SearchSource searchSource, int i14, String str3, int i15, AnalyticListingsPayload analyticListingsPayload) {
        o.i(listingTypes, "listingTypes");
        o.i(listingSource, "listingSource");
        o.i(searchSource, "searchSource");
        this.f30532a = listingTypes;
        this.f30533b = str;
        this.f30534c = i11;
        this.f30535d = str2;
        this.f30536e = iArr;
        this.f30537f = advancedSearchBody;
        this.f30538g = listingSource;
        this.f30539h = i12;
        this.f30540i = i13;
        this.f30541j = z11;
        this.f30542k = searchSource;
        this.f30543l = i14;
        this.f30544m = str3;
        this.f30545n = i15;
        this.f30546o = analyticListingsPayload;
    }

    public /* synthetic */ b(ListingsTypes listingsTypes, String str, int i11, String str2, int[] iArr, AdvancedSearchBody advancedSearchBody, AnalyticsListingsSource analyticsListingsSource, int i12, int i13, boolean z11, SearchSource searchSource, int i14, String str3, int i15, AnalyticListingsPayload analyticListingsPayload, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? ListingsTypes.USER_ITEMS : listingsTypes, (i16 & 2) != 0 ? null : str, (i16 & 4) != 0 ? -1 : i11, (i16 & 8) != 0 ? null : str2, (i16 & 16) != 0 ? null : iArr, (i16 & 32) != 0 ? null : advancedSearchBody, (i16 & 64) != 0 ? AnalyticsListingsSource.MORE : analyticsListingsSource, (i16 & 128) != 0 ? -1 : i12, (i16 & 256) != 0 ? p0.f69709i : i13, (i16 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? true : z11, (i16 & 1024) != 0 ? SearchSource.SEARCH_BAR : searchSource, (i16 & RecyclerView.l.FLAG_MOVED) != 0 ? 0 : i14, (i16 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str3, (i16 & 8192) == 0 ? i15 : -1, (i16 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : analyticListingsPayload);
    }
}
