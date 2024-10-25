package com.forsale.app.features.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.features.search.SearchFocusViewModel;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SearchAnalyticsData.kt */
/* loaded from: classes2.dex */
public final class SearchAnalyticsData implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final String f36635a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f36636b;

    /* renamed from: c  reason: collision with root package name */
    private final String f36637c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f36638d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f36639e;

    /* renamed from: f  reason: collision with root package name */
    private final String f36640f;

    /* renamed from: g  reason: collision with root package name */
    private final Integer f36641g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f36642h;

    /* renamed from: i  reason: collision with root package name */
    private final SearchSource f36643i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f36644j;

    /* renamed from: x  reason: collision with root package name */
    public static final a f36633x = new a(null);
    public static final Parcelable.Creator<SearchAnalyticsData> CREATOR = new b();

    /* renamed from: y  reason: collision with root package name */
    public static final int f36634y = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchAnalyticsData.kt */
    /* loaded from: classes2.dex */
    public static final class PARAMS {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ PARAMS[] $VALUES;
        private final String value;
        public static final PARAMS KEYWORD = new PARAMS("KEYWORD", 0, "Keyword");
        public static final PARAMS KEYWORD_CHAR_COUNT = new PARAMS("KEYWORD_CHAR_COUNT", 1, "KeywordCharCount");
        public static final PARAMS TYPED_KEYWORD = new PARAMS("TYPED_KEYWORD", 2, "TypedKeyword");
        public static final PARAMS TYPED_KEYWORD_CHAR_COUNT = new PARAMS("TYPED_KEYWORD_CHAR_COUNT", 3, "TypedKeywordCharCount");
        public static final PARAMS KEYWORD_CATEGORY_ID = new PARAMS("KEYWORD_CATEGORY_ID", 4, "KeywordCategoryID");
        public static final PARAMS KEYWORD_CATEGORY_NAME = new PARAMS("KEYWORD_CATEGORY_NAME", 5, "KeywordCategoryName");
        public static final PARAMS SELECTED_KEYWORD_ORDER = new PARAMS("SELECTED_KEYWORD_ORDER", 6, "SelectedKeywordOrder");
        public static final PARAMS SUGGESTED_KEYWORDS_COUNT = new PARAMS("SUGGESTED_KEYWORDS_COUNT", 7, "SuggestedKeywordsCount");
        public static final PARAMS SEARCH_SOURCE = new PARAMS("SEARCH_SOURCE", 8, "SearchSource");
        public static final PARAMS SOURCE = new PARAMS("SOURCE", 9, "Source");

        private static final /* synthetic */ PARAMS[] $values() {
            return new PARAMS[]{KEYWORD, KEYWORD_CHAR_COUNT, TYPED_KEYWORD, TYPED_KEYWORD_CHAR_COUNT, KEYWORD_CATEGORY_ID, KEYWORD_CATEGORY_NAME, SELECTED_KEYWORD_ORDER, SUGGESTED_KEYWORDS_COUNT, SEARCH_SOURCE, SOURCE};
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

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchAnalyticsData.kt */
    /* loaded from: classes2.dex */
    public static final class SearchSource {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ SearchSource[] $VALUES;
        private final String value;
        public static final SearchSource TRENDING = new SearchSource("TRENDING", 0, "Trending");
        public static final SearchSource WRITING = new SearchSource("WRITING", 1, "Writing");
        public static final SearchSource SCOPED_SEARCH = new SearchSource("SCOPED_SEARCH", 2, "Scoped Search");
        public static final SearchSource SEARCH_HISTORY = new SearchSource("SEARCH_HISTORY", 3, "Search History");
        public static final SearchSource MATCHING_CATEGORIES = new SearchSource("MATCHING_CATEGORIES", 4, "Matching Categories");
        public static final SearchSource RECENT_SEARCH_CATEGORIES = new SearchSource("RECENT_SEARCH_CATEGORIES", 5, "Recent Search Categories");
        public static final SearchSource SEARCH_BREADCRUMBS = new SearchSource("SEARCH_BREADCRUMBS", 6, "Search Breadcrumbs");
        public static final SearchSource CONTINUE_BROWSING = new SearchSource("CONTINUE_BROWSING", 7, "Continue Browsing");

        private static final /* synthetic */ SearchSource[] $values() {
            return new SearchSource[]{TRENDING, WRITING, SCOPED_SEARCH, SEARCH_HISTORY, MATCHING_CATEGORIES, RECENT_SEARCH_CATEGORIES, SEARCH_BREADCRUMBS, CONTINUE_BROWSING};
        }

        static {
            SearchSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SearchSource(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<SearchSource> getEntries() {
            return $ENTRIES;
        }

        public static SearchSource valueOf(String str) {
            return (SearchSource) Enum.valueOf(SearchSource.class, str);
        }

        public static SearchSource[] values() {
            return (SearchSource[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchAnalyticsData.kt */
    /* loaded from: classes2.dex */
    public static final class SourceMode {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ SourceMode[] $VALUES;
        private final String value;
        public static final SourceMode SEARCH_RESULT = new SourceMode("SEARCH_RESULT", 0, "Search Results");
        public static final SourceMode LISTINGS = new SourceMode("LISTINGS", 1, "Listings");

        private static final /* synthetic */ SourceMode[] $values() {
            return new SourceMode[]{SEARCH_RESULT, LISTINGS};
        }

        static {
            SourceMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SourceMode(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<SourceMode> getEntries() {
            return $ENTRIES;
        }

        public static SourceMode valueOf(String str) {
            return (SourceMode) Enum.valueOf(SourceMode.class, str);
        }

        public static SourceMode[] values() {
            return (SourceMode[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: SearchAnalyticsData.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Integer> a(GetListingsBody.FiltrationData filtrationData) {
            List<Integer> subCategory;
            if (filtrationData == null || (subCategory = filtrationData.getSubCategory()) == null) {
                if (filtrationData != null) {
                    return filtrationData.getCategory();
                }
                return null;
            }
            return subCategory;
        }

        private final Integer b(SearchFocusViewModel.SearchState searchState, SearchSource searchSource) {
            List q11;
            boolean b02;
            q11 = kotlin.collections.r.q(SearchSource.WRITING, SearchSource.SCOPED_SEARCH, SearchSource.MATCHING_CATEGORIES);
            b02 = CollectionsKt___CollectionsKt.b0(q11, searchSource);
            if (b02) {
                return searchState.d();
            }
            return null;
        }

        public static /* synthetic */ SearchAnalyticsData d(a aVar, SearchFocusViewModel.SearchState searchState, SearchItemModel searchItemModel, Integer num, SearchSource searchSource, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                searchItemModel = null;
            }
            if ((i11 & 4) != 0) {
                num = null;
            }
            if ((i11 & 8) != 0) {
                searchSource = null;
            }
            return aVar.c(searchState, searchItemModel, num, searchSource);
        }

        public final SearchAnalyticsData c(SearchFocusViewModel.SearchState state, SearchItemModel searchItemModel, Integer num, SearchSource searchSource) {
            Integer num2;
            String str;
            Integer num3;
            GetListingsBody.FiltrationData filtrationData;
            Integer num4;
            SearchSource searchSource2;
            String str2;
            Object m02;
            String i11;
            kotlin.jvm.internal.o.i(state, "state");
            String k11 = state.k();
            String k12 = state.k();
            if (k12 != null) {
                num2 = Integer.valueOf(k12.length());
            } else {
                num2 = null;
            }
            if (searchItemModel != null) {
                str = searchItemModel.i();
            } else {
                str = null;
            }
            if (searchItemModel != null && (i11 = searchItemModel.i()) != null) {
                num3 = Integer.valueOf(i11.length());
            } else {
                num3 = null;
            }
            if (searchItemModel != null) {
                filtrationData = searchItemModel.e();
            } else {
                filtrationData = null;
            }
            List<Integer> a11 = a(filtrationData);
            if (a11 != null) {
                m02 = CollectionsKt___CollectionsKt.m0(a11);
                num4 = (Integer) m02;
            } else {
                num4 = null;
            }
            if (searchItemModel != null) {
                str2 = searchItemModel.d();
                searchSource2 = searchSource;
            } else {
                searchSource2 = searchSource;
                str2 = null;
            }
            return new SearchAnalyticsData(str, num3, k11, num2, num4, str2, num, b(state, searchSource2), searchSource, false, AdRequest.MAX_CONTENT_URL_LENGTH, null);
        }
    }

    /* compiled from: SearchAnalyticsData.kt */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<SearchAnalyticsData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final SearchAnalyticsData createFromParcel(Parcel parcel) {
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            Integer valueOf4;
            Integer valueOf5;
            SearchSource valueOf6;
            boolean z11;
            kotlin.jvm.internal.o.i(parcel, "parcel");
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(parcel.readInt());
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = SearchSource.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            return new SearchAnalyticsData(readString, valueOf, readString2, valueOf2, valueOf3, readString3, valueOf4, valueOf5, valueOf6, z11);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final SearchAnalyticsData[] newArray(int i11) {
            return new SearchAnalyticsData[i11];
        }
    }

    public SearchAnalyticsData(String str, Integer num, String str2, Integer num2, Integer num3, String str3, Integer num4, Integer num5, SearchSource searchSource, boolean z11) {
        this.f36635a = str;
        this.f36636b = num;
        this.f36637c = str2;
        this.f36638d = num2;
        this.f36639e = num3;
        this.f36640f = str3;
        this.f36641g = num4;
        this.f36642h = num5;
        this.f36643i = searchSource;
        this.f36644j = z11;
    }

    public final String a() {
        return this.f36635a;
    }

    public final Integer b() {
        return this.f36639e;
    }

    public final String c() {
        return this.f36640f;
    }

    public final Integer d() {
        return this.f36636b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final SearchSource e() {
        return this.f36643i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchAnalyticsData)) {
            return false;
        }
        SearchAnalyticsData searchAnalyticsData = (SearchAnalyticsData) obj;
        if (kotlin.jvm.internal.o.d(this.f36635a, searchAnalyticsData.f36635a) && kotlin.jvm.internal.o.d(this.f36636b, searchAnalyticsData.f36636b) && kotlin.jvm.internal.o.d(this.f36637c, searchAnalyticsData.f36637c) && kotlin.jvm.internal.o.d(this.f36638d, searchAnalyticsData.f36638d) && kotlin.jvm.internal.o.d(this.f36639e, searchAnalyticsData.f36639e) && kotlin.jvm.internal.o.d(this.f36640f, searchAnalyticsData.f36640f) && kotlin.jvm.internal.o.d(this.f36641g, searchAnalyticsData.f36641g) && kotlin.jvm.internal.o.d(this.f36642h, searchAnalyticsData.f36642h) && this.f36643i == searchAnalyticsData.f36643i && this.f36644j == searchAnalyticsData.f36644j) {
            return true;
        }
        return false;
    }

    public final Integer f() {
        return this.f36641g;
    }

    public final Integer g() {
        return this.f36642h;
    }

    public final String h() {
        return this.f36637c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        String str = this.f36635a;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num = this.f36636b;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str2 = this.f36637c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Integer num2 = this.f36638d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Integer num3 = this.f36639e;
        if (num3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num3.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        String str3 = this.f36640f;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        Integer num4 = this.f36641g;
        if (num4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num4.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        Integer num5 = this.f36642h;
        if (num5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num5.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        SearchSource searchSource = this.f36643i;
        if (searchSource != null) {
            i11 = searchSource.hashCode();
        }
        int i21 = (i19 + i11) * 31;
        boolean z11 = this.f36644j;
        int i22 = z11;
        if (z11 != 0) {
            i22 = 1;
        }
        return i21 + i22;
    }

    public final Integer i() {
        return this.f36638d;
    }

    public final boolean j() {
        return this.f36644j;
    }

    public String toString() {
        String str = this.f36635a;
        Integer num = this.f36636b;
        String str2 = this.f36637c;
        Integer num2 = this.f36638d;
        Integer num3 = this.f36639e;
        String str3 = this.f36640f;
        Integer num4 = this.f36641g;
        Integer num5 = this.f36642h;
        SearchSource searchSource = this.f36643i;
        boolean z11 = this.f36644j;
        return "SearchAnalyticsData(keyword=" + str + ", keywordCharCount=" + num + ", typedKeyword=" + str2 + ", typedKeywordCharCount=" + num2 + ", keywordCategoryID=" + num3 + ", keywordCategoryName=" + str3 + ", selectedKeywordOrder=" + num4 + ", suggestedKeywordsCount=" + num5 + ", searchSource=" + searchSource + ", isMatchingCategories=" + z11 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.o.i(out, "out");
        out.writeString(this.f36635a);
        Integer num = this.f36636b;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.f36637c);
        Integer num2 = this.f36638d;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.f36639e;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        out.writeString(this.f36640f);
        Integer num4 = this.f36641g;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        Integer num5 = this.f36642h;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num5.intValue());
        }
        SearchSource searchSource = this.f36643i;
        if (searchSource == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(searchSource.name());
        }
        out.writeInt(this.f36644j ? 1 : 0);
    }

    public /* synthetic */ SearchAnalyticsData(String str, Integer num, String str2, Integer num2, Integer num3, String str3, Integer num4, Integer num5, SearchSource searchSource, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : num2, num3, str3, num4, (i11 & 128) != 0 ? null : num5, searchSource, (i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? false : z11);
    }
}
