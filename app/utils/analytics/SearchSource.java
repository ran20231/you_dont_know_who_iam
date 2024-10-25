package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchSource.kt */
/* loaded from: classes3.dex */
public final class SearchSource {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ SearchSource[] $VALUES;
    private final String value;
    public static final SearchSource TRENDING = new SearchSource("TRENDING", 0, "Trending");
    public static final SearchSource SEARCH_BAR = new SearchSource("SEARCH_BAR", 1, "Search Bar");
    public static final SearchSource AUTOCOMPLETE = new SearchSource("AUTOCOMPLETE", 2, "Autocomplete");
    public static final SearchSource MATCHING_CATEGORIES = new SearchSource("MATCHING_CATEGORIES", 3, "MatchingCategories");
    public static final SearchSource SEARCH_BREADCRUMBS = new SearchSource("SEARCH_BREADCRUMBS", 4, "SearchBreadcrumbs");
    public static final SearchSource TRENDING_NO_SEARCH_RESULT = new SearchSource("TRENDING_NO_SEARCH_RESULT", 5, "TrendingNoSearchResult");
    public static final SearchSource NONE = new SearchSource("NONE", 6, "");

    private static final /* synthetic */ SearchSource[] $values() {
        return new SearchSource[]{TRENDING, SEARCH_BAR, AUTOCOMPLETE, MATCHING_CATEGORIES, SEARCH_BREADCRUMBS, TRENDING_NO_SEARCH_RESULT, NONE};
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
