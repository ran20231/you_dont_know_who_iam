package com.forsale.app.features.categories.listingdetails.buyerscreen;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BuyerListingDetailsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class k implements z3.h {

    /* renamed from: l  reason: collision with root package name */
    public static final a f26043l = new a(null);

    /* renamed from: m  reason: collision with root package name */
    public static final int f26044m = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f26045a;

    /* renamed from: b  reason: collision with root package name */
    private final int f26046b;

    /* renamed from: c  reason: collision with root package name */
    private final int f26047c;

    /* renamed from: d  reason: collision with root package name */
    private final String f26048d;

    /* renamed from: e  reason: collision with root package name */
    private final String f26049e;

    /* renamed from: f  reason: collision with root package name */
    private final ListingDetailsAnalyticSource f26050f;

    /* renamed from: g  reason: collision with root package name */
    private final String f26051g;

    /* renamed from: h  reason: collision with root package name */
    private final String f26052h;

    /* renamed from: i  reason: collision with root package name */
    private final ListingDetailsSearchAnalyticsData f26053i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f26054j;

    /* renamed from: k  reason: collision with root package name */
    private final String f26055k;

    /* compiled from: BuyerListingDetailsFragmentArgs.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(Bundle bundle) {
            int i11;
            int i12;
            String str;
            String str2;
            ListingDetailsAnalyticSource listingDetailsAnalyticSource;
            String str3;
            String str4;
            ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData;
            boolean z11;
            String str5;
            kotlin.jvm.internal.o.i(bundle, "bundle");
            bundle.setClassLoader(k.class.getClassLoader());
            if (bundle.containsKey("adv_id_list")) {
                int[] intArray = bundle.getIntArray("adv_id_list");
                if (intArray != null) {
                    if (bundle.containsKey("current_adv_id_index")) {
                        i11 = bundle.getInt("current_adv_id_index");
                    } else {
                        i11 = -1;
                    }
                    if (bundle.containsKey("item_position")) {
                        i12 = bundle.getInt("item_position");
                    } else {
                        i12 = -1;
                    }
                    if (bundle.containsKey("listing_source")) {
                        str = bundle.getString("listing_source");
                    } else {
                        str = null;
                    }
                    if (bundle.containsKey("listing_status")) {
                        str2 = bundle.getString("listing_status");
                    } else {
                        str2 = null;
                    }
                    if (bundle.containsKey("analytics_source")) {
                        if (!Parcelable.class.isAssignableFrom(ListingDetailsAnalyticSource.class) && !Serializable.class.isAssignableFrom(ListingDetailsAnalyticSource.class)) {
                            throw new UnsupportedOperationException(ListingDetailsAnalyticSource.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                        listingDetailsAnalyticSource = (ListingDetailsAnalyticSource) bundle.get("analytics_source");
                    } else {
                        listingDetailsAnalyticSource = null;
                    }
                    if (bundle.containsKey("source_filter_name")) {
                        str3 = bundle.getString("source_filter_name");
                    } else {
                        str3 = null;
                    }
                    if (bundle.containsKey("filters_place")) {
                        str4 = bundle.getString("filters_place");
                    } else {
                        str4 = null;
                    }
                    if (bundle.containsKey("search_analytics_data")) {
                        if (!Parcelable.class.isAssignableFrom(ListingDetailsSearchAnalyticsData.class) && !Serializable.class.isAssignableFrom(ListingDetailsSearchAnalyticsData.class)) {
                            throw new UnsupportedOperationException(ListingDetailsSearchAnalyticsData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                        listingDetailsSearchAnalyticsData = (ListingDetailsSearchAnalyticsData) bundle.get("search_analytics_data");
                    } else {
                        listingDetailsSearchAnalyticsData = null;
                    }
                    if (bundle.containsKey("from_details")) {
                        z11 = bundle.getBoolean("from_details");
                    } else {
                        z11 = true;
                    }
                    boolean z12 = z11;
                    if (bundle.containsKey(CategoryEntity.SLUG)) {
                        str5 = bundle.getString(CategoryEntity.SLUG);
                    } else {
                        str5 = null;
                    }
                    return new k(intArray, i11, i12, str, str2, listingDetailsAnalyticSource, str3, str4, listingDetailsSearchAnalyticsData, z12, str5);
                }
                throw new IllegalArgumentException("Argument \"adv_id_list\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"adv_id_list\" is missing and does not have an android:defaultValue");
        }

        public final k b(k0 savedStateHandle) {
            Integer num;
            Integer num2;
            String str;
            String str2;
            ListingDetailsAnalyticSource listingDetailsAnalyticSource;
            String str3;
            String str4;
            ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData;
            Boolean bool;
            String str5;
            kotlin.jvm.internal.o.i(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.e("adv_id_list")) {
                int[] iArr = (int[]) savedStateHandle.f("adv_id_list");
                if (iArr != null) {
                    if (savedStateHandle.e("current_adv_id_index")) {
                        num = (Integer) savedStateHandle.f("current_adv_id_index");
                        if (num == null) {
                            throw new IllegalArgumentException("Argument \"current_adv_id_index\" of type integer does not support null values");
                        }
                    } else {
                        num = -1;
                    }
                    if (savedStateHandle.e("item_position")) {
                        num2 = (Integer) savedStateHandle.f("item_position");
                        if (num2 == null) {
                            throw new IllegalArgumentException("Argument \"item_position\" of type integer does not support null values");
                        }
                    } else {
                        num2 = -1;
                    }
                    if (savedStateHandle.e("listing_source")) {
                        str = (String) savedStateHandle.f("listing_source");
                    } else {
                        str = null;
                    }
                    if (savedStateHandle.e("listing_status")) {
                        str2 = (String) savedStateHandle.f("listing_status");
                    } else {
                        str2 = null;
                    }
                    if (savedStateHandle.e("analytics_source")) {
                        if (!Parcelable.class.isAssignableFrom(ListingDetailsAnalyticSource.class) && !Serializable.class.isAssignableFrom(ListingDetailsAnalyticSource.class)) {
                            throw new UnsupportedOperationException(ListingDetailsAnalyticSource.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                        listingDetailsAnalyticSource = (ListingDetailsAnalyticSource) savedStateHandle.f("analytics_source");
                    } else {
                        listingDetailsAnalyticSource = null;
                    }
                    if (savedStateHandle.e("source_filter_name")) {
                        str3 = (String) savedStateHandle.f("source_filter_name");
                    } else {
                        str3 = null;
                    }
                    if (savedStateHandle.e("filters_place")) {
                        str4 = (String) savedStateHandle.f("filters_place");
                    } else {
                        str4 = null;
                    }
                    if (savedStateHandle.e("search_analytics_data")) {
                        if (!Parcelable.class.isAssignableFrom(ListingDetailsSearchAnalyticsData.class) && !Serializable.class.isAssignableFrom(ListingDetailsSearchAnalyticsData.class)) {
                            throw new UnsupportedOperationException(ListingDetailsSearchAnalyticsData.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                        }
                        listingDetailsSearchAnalyticsData = (ListingDetailsSearchAnalyticsData) savedStateHandle.f("search_analytics_data");
                    } else {
                        listingDetailsSearchAnalyticsData = null;
                    }
                    if (savedStateHandle.e("from_details")) {
                        bool = (Boolean) savedStateHandle.f("from_details");
                        if (bool == null) {
                            throw new IllegalArgumentException("Argument \"from_details\" of type boolean does not support null values");
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    if (savedStateHandle.e(CategoryEntity.SLUG)) {
                        str5 = (String) savedStateHandle.f(CategoryEntity.SLUG);
                    } else {
                        str5 = null;
                    }
                    return new k(iArr, num.intValue(), num2.intValue(), str, str2, listingDetailsAnalyticSource, str3, str4, listingDetailsSearchAnalyticsData, bool.booleanValue(), str5);
                }
                throw new IllegalArgumentException("Argument \"adv_id_list\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"adv_id_list\" is missing and does not have an android:defaultValue");
        }
    }

    public k(int[] advIdList, int i11, int i12, String str, String str2, ListingDetailsAnalyticSource listingDetailsAnalyticSource, String str3, String str4, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, boolean z11, String str5) {
        kotlin.jvm.internal.o.i(advIdList, "advIdList");
        this.f26045a = advIdList;
        this.f26046b = i11;
        this.f26047c = i12;
        this.f26048d = str;
        this.f26049e = str2;
        this.f26050f = listingDetailsAnalyticSource;
        this.f26051g = str3;
        this.f26052h = str4;
        this.f26053i = listingDetailsSearchAnalyticsData;
        this.f26054j = z11;
        this.f26055k = str5;
    }

    public static final k fromBundle(Bundle bundle) {
        return f26043l.a(bundle);
    }

    public final int[] a() {
        return this.f26045a;
    }

    public final ListingDetailsAnalyticSource b() {
        return this.f26050f;
    }

    public final int c() {
        return this.f26046b;
    }

    public final String d() {
        return this.f26052h;
    }

    public final boolean e() {
        return this.f26054j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kotlin.jvm.internal.o.d(this.f26045a, kVar.f26045a) && this.f26046b == kVar.f26046b && this.f26047c == kVar.f26047c && kotlin.jvm.internal.o.d(this.f26048d, kVar.f26048d) && kotlin.jvm.internal.o.d(this.f26049e, kVar.f26049e) && kotlin.jvm.internal.o.d(this.f26050f, kVar.f26050f) && kotlin.jvm.internal.o.d(this.f26051g, kVar.f26051g) && kotlin.jvm.internal.o.d(this.f26052h, kVar.f26052h) && kotlin.jvm.internal.o.d(this.f26053i, kVar.f26053i) && this.f26054j == kVar.f26054j && kotlin.jvm.internal.o.d(this.f26055k, kVar.f26055k)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f26047c;
    }

    public final String g() {
        return this.f26048d;
    }

    public final String h() {
        return this.f26049e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = ((((Arrays.hashCode(this.f26045a) * 31) + Integer.hashCode(this.f26046b)) * 31) + Integer.hashCode(this.f26047c)) * 31;
        String str = this.f26048d;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode7 + hashCode) * 31;
        String str2 = this.f26049e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        ListingDetailsAnalyticSource listingDetailsAnalyticSource = this.f26050f;
        if (listingDetailsAnalyticSource == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = listingDetailsAnalyticSource.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str3 = this.f26051g;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str4 = this.f26052h;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData = this.f26053i;
        if (listingDetailsSearchAnalyticsData == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = listingDetailsSearchAnalyticsData.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        boolean z11 = this.f26054j;
        int i18 = z11;
        if (z11 != 0) {
            i18 = 1;
        }
        int i19 = (i17 + i18) * 31;
        String str5 = this.f26055k;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        return i19 + i11;
    }

    public final ListingDetailsSearchAnalyticsData i() {
        return this.f26053i;
    }

    public final String j() {
        return this.f26055k;
    }

    public final String k() {
        return this.f26051g;
    }

    public String toString() {
        String arrays = Arrays.toString(this.f26045a);
        int i11 = this.f26046b;
        int i12 = this.f26047c;
        String str = this.f26048d;
        String str2 = this.f26049e;
        ListingDetailsAnalyticSource listingDetailsAnalyticSource = this.f26050f;
        String str3 = this.f26051g;
        String str4 = this.f26052h;
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData = this.f26053i;
        boolean z11 = this.f26054j;
        String str5 = this.f26055k;
        return "BuyerListingDetailsFragmentArgs(advIdList=" + arrays + ", currentAdvIdIndex=" + i11 + ", itemPosition=" + i12 + ", listingSource=" + str + ", listingStatus=" + str2 + ", analyticsSource=" + listingDetailsAnalyticSource + ", sourceFilterName=" + str3 + ", filtersPlace=" + str4 + ", searchAnalyticsData=" + listingDetailsSearchAnalyticsData + ", fromDetails=" + z11 + ", slug=" + str5 + ")";
    }
}
