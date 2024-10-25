package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchLocation.kt */
/* loaded from: classes3.dex */
public final class SearchLocation {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ SearchLocation[] $VALUES;
    private final String value;
    public static final SearchLocation SEARCH_FOCUSED = new SearchLocation("SEARCH_FOCUSED", 0, "Search Focused");
    public static final SearchLocation SEARCH_PAGE = new SearchLocation("SEARCH_PAGE", 1, "Search Page");
    public static final SearchLocation SEARCH_RESULTS = new SearchLocation("SEARCH_RESULTS", 2, "Search Results");
    public static final SearchLocation VERTICAL = new SearchLocation("VERTICAL", 3, "Vertical");
    public static final SearchLocation SUBCATEGORY = new SearchLocation("SUBCATEGORY", 4, "Subcategory");
    public static final SearchLocation LISTINGS = new SearchLocation("LISTINGS", 5, "Listings");
    public static final SearchLocation SEARCH_HOME = new SearchLocation("SEARCH_HOME", 6, "Search Home");
    public static final SearchLocation EMPTY_PAGE = new SearchLocation("EMPTY_PAGE", 7, "Empty Page");
    public static final SearchLocation COMMERCIAL = new SearchLocation("COMMERCIAL", 8, "Commercial");
    public static final SearchLocation HOME = new SearchLocation("HOME", 9, "Home");

    private static final /* synthetic */ SearchLocation[] $values() {
        return new SearchLocation[]{SEARCH_FOCUSED, SEARCH_PAGE, SEARCH_RESULTS, VERTICAL, SUBCATEGORY, LISTINGS, SEARCH_HOME, EMPTY_PAGE, COMMERCIAL, HOME};
    }

    static {
        SearchLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SearchLocation(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<SearchLocation> getEntries() {
        return $ENTRIES;
    }

    public static SearchLocation valueOf(String str) {
        return (SearchLocation) Enum.valueOf(SearchLocation.class, str);
    }

    public static SearchLocation[] values() {
        return (SearchLocation[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
