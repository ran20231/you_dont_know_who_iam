package com.forsale.app.features.categories.listingdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.search.SearchAnalyticsData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ListingDetailsSearchAnalyticsData.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsSearchAnalyticsData implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final String f25327a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f25328b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f25329c;

    /* renamed from: d  reason: collision with root package name */
    private final SearchAnalyticsData.SearchSource f25330d;

    /* renamed from: e  reason: collision with root package name */
    private final ListingsIntention f25331e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f25332f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f25325g = new a(null);
    public static final Parcelable.Creator<ListingDetailsSearchAnalyticsData> CREATOR = new b();

    /* renamed from: h  reason: collision with root package name */
    public static final int f25326h = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ListingDetailsSearchAnalyticsData.kt */
    /* loaded from: classes2.dex */
    public static final class PARAMS {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ PARAMS[] $VALUES;
        private final String value;
        public static final PARAMS SOURCE_SEARCH_KEYWORD = new PARAMS("SOURCE_SEARCH_KEYWORD", 0, "SourceSearchKeyword");
        public static final PARAMS SOURCE_SEARCH_KEYWORD_CHAR_COUNT = new PARAMS("SOURCE_SEARCH_KEYWORD_CHAR_COUNT", 1, "SourceSearchKeywordCharCount");
        public static final PARAMS SOURCE_SEARCH_KEYWORD_ORDER = new PARAMS("SOURCE_SEARCH_KEYWORD_ORDER", 2, "SourceSearchKeywordOrder");
        public static final PARAMS SEARCH_SOURCE = new PARAMS("SEARCH_SOURCE", 3, "SearchSource");

        private static final /* synthetic */ PARAMS[] $values() {
            return new PARAMS[]{SOURCE_SEARCH_KEYWORD, SOURCE_SEARCH_KEYWORD_CHAR_COUNT, SOURCE_SEARCH_KEYWORD_ORDER, SEARCH_SOURCE};
        }

        static {
            PARAMS[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PARAMS(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<PARAMS> getEntries() {
            return $ENTRIES;
        }

        public static PARAMS valueOf(String str) {
            return (PARAMS) Enum.valueOf(PARAMS.class, str);
        }

        public static PARAMS[] values() {
            return (PARAMS[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: ListingDetailsSearchAnalyticsData.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ListingDetailsSearchAnalyticsData a(SearchAnalyticsData searchAnalyticsData, ListingsIntention listingsIntention) {
            String a11;
            Integer d11;
            boolean z11;
            o.i(listingsIntention, "listingsIntention");
            if (searchAnalyticsData != null) {
                SearchAnalyticsData.SearchSource e11 = searchAnalyticsData.e();
                SearchAnalyticsData.SearchSource searchSource = SearchAnalyticsData.SearchSource.MATCHING_CATEGORIES;
                if (e11 == searchSource) {
                    a11 = searchAnalyticsData.h();
                } else {
                    a11 = searchAnalyticsData.a();
                }
                String str = a11;
                if (searchAnalyticsData.e() == searchSource) {
                    d11 = searchAnalyticsData.i();
                } else {
                    d11 = searchAnalyticsData.d();
                }
                Integer num = d11;
                Integer f11 = searchAnalyticsData.f();
                SearchAnalyticsData.SearchSource e12 = searchAnalyticsData.e();
                if (searchAnalyticsData.e() == searchSource) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return new ListingDetailsSearchAnalyticsData(str, num, f11, e12, listingsIntention, z11);
            }
            return null;
        }
    }

    /* compiled from: ListingDetailsSearchAnalyticsData.kt */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<ListingDetailsSearchAnalyticsData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ListingDetailsSearchAnalyticsData createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            SearchAnalyticsData.SearchSource valueOf3;
            boolean z11;
            o.i(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = SearchAnalyticsData.SearchSource.valueOf(parcel.readString());
            }
            ListingsIntention valueOf4 = ListingsIntention.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return new ListingDetailsSearchAnalyticsData(readString, valueOf, valueOf2, valueOf3, valueOf4, z11);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ListingDetailsSearchAnalyticsData[] newArray(int i11) {
            return new ListingDetailsSearchAnalyticsData[i11];
        }
    }

    public ListingDetailsSearchAnalyticsData(String str, Integer num, Integer num2, SearchAnalyticsData.SearchSource searchSource, ListingsIntention listingsIntention, boolean z11) {
        o.i(listingsIntention, "listingsIntention");
        this.f25327a = str;
        this.f25328b = num;
        this.f25329c = num2;
        this.f25330d = searchSource;
        this.f25331e = listingsIntention;
        this.f25332f = z11;
    }

    public final ListingsIntention a() {
        return this.f25331e;
    }

    public final SearchAnalyticsData.SearchSource b() {
        return this.f25330d;
    }

    public final String c() {
        return this.f25327a;
    }

    public final Integer d() {
        return this.f25328b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.f25329c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingDetailsSearchAnalyticsData)) {
            return false;
        }
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData = (ListingDetailsSearchAnalyticsData) obj;
        if (o.d(this.f25327a, listingDetailsSearchAnalyticsData.f25327a) && o.d(this.f25328b, listingDetailsSearchAnalyticsData.f25328b) && o.d(this.f25329c, listingDetailsSearchAnalyticsData.f25329c) && this.f25330d == listingDetailsSearchAnalyticsData.f25330d && this.f25331e == listingDetailsSearchAnalyticsData.f25331e && this.f25332f == listingDetailsSearchAnalyticsData.f25332f) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f25332f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f25327a;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num = this.f25328b;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num2 = this.f25329c;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        SearchAnalyticsData.SearchSource searchSource = this.f25330d;
        if (searchSource != null) {
            i11 = searchSource.hashCode();
        }
        int hashCode4 = (((i14 + i11) * 31) + this.f25331e.hashCode()) * 31;
        boolean z11 = this.f25332f;
        int i15 = z11;
        if (z11 != 0) {
            i15 = 1;
        }
        return hashCode4 + i15;
    }

    public String toString() {
        String str = this.f25327a;
        Integer num = this.f25328b;
        Integer num2 = this.f25329c;
        SearchAnalyticsData.SearchSource searchSource = this.f25330d;
        ListingsIntention listingsIntention = this.f25331e;
        boolean z11 = this.f25332f;
        return "ListingDetailsSearchAnalyticsData(sourceSearchKeyword=" + str + ", sourceSearchKeywordCharCount=" + num + ", sourceSearchKeywordOrder=" + num2 + ", searchSource=" + searchSource + ", listingsIntention=" + listingsIntention + ", isMatchingCategories=" + z11 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.f25327a);
        Integer num = this.f25328b;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.f25329c;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        SearchAnalyticsData.SearchSource searchSource = this.f25330d;
        if (searchSource == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(searchSource.name());
        }
        out.writeString(this.f25331e.name());
        out.writeInt(this.f25332f ? 1 : 0);
    }
}
