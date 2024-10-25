package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HomeVisitedAnalytics.kt */
/* loaded from: classes3.dex */
public final class HomeVisitedSources {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ HomeVisitedSources[] $VALUES;
    private final String value;
    public static final HomeVisitedSources HOME_PAGE = new HomeVisitedSources("HOME_PAGE", 0, "Home Page");
    public static final HomeVisitedSources NAV_BAR = new HomeVisitedSources("NAV_BAR", 1, "Nav Bar");
    public static final HomeVisitedSources SUBCATEGORY_PAGE = new HomeVisitedSources("SUBCATEGORY_PAGE", 2, "Sub Category Page");
    public static final HomeVisitedSources SEARCH_CATEGORY = new HomeVisitedSources("SEARCH_CATEGORY", 3, "Search Category");
    public static final HomeVisitedSources RECENT_SEARCH_CATEGORIES = new HomeVisitedSources("RECENT_SEARCH_CATEGORIES", 4, "Recent Search Categories");
    public static final HomeVisitedSources SEARCH_BREADCRUMBS = new HomeVisitedSources("SEARCH_BREADCRUMBS", 5, "Search Breadcrumbs");

    private static final /* synthetic */ HomeVisitedSources[] $values() {
        return new HomeVisitedSources[]{HOME_PAGE, NAV_BAR, SUBCATEGORY_PAGE, SEARCH_CATEGORY, RECENT_SEARCH_CATEGORIES, SEARCH_BREADCRUMBS};
    }

    static {
        HomeVisitedSources[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private HomeVisitedSources(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<HomeVisitedSources> getEntries() {
        return $ENTRIES;
    }

    public static HomeVisitedSources valueOf(String str) {
        return (HomeVisitedSources) Enum.valueOf(HomeVisitedSources.class, str);
    }

    public static HomeVisitedSources[] values() {
        return (HomeVisitedSources[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
