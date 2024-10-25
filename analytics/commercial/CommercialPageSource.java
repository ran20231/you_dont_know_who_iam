package com.forsale.analytics.commercial;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommercialPageSource.kt */
/* loaded from: classes2.dex */
public final class CommercialPageSource {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ CommercialPageSource[] $VALUES;
    private final String value;
    public static final CommercialPageSource HOME_PAGE = new CommercialPageSource("HOME_PAGE", 0, "Home Page");
    public static final CommercialPageSource VERTICAL_PAGE = new CommercialPageSource("VERTICAL_PAGE", 1, "Vertical Page");
    public static final CommercialPageSource NAVBAR = new CommercialPageSource("NAVBAR", 2, "Navbar");
    public static final CommercialPageSource COMMERCIAL_ADS_CAROUSEL = new CommercialPageSource("COMMERCIAL_ADS_CAROUSEL", 3, "Commercial Ads Carousel");
    public static final CommercialPageSource COMMERCIAL_ITEM_DETAILS_PAGE_CHECK_ALL = new CommercialPageSource("COMMERCIAL_ITEM_DETAILS_PAGE_CHECK_ALL", 4, "Commercial Item Details Page - Check All");
    public static final CommercialPageSource COMMERCIAL_ITEM_DETAILS_PAGE_BUTTON = new CommercialPageSource("COMMERCIAL_ITEM_DETAILS_PAGE_BUTTON", 5, "Commercial Item Details Page - Button");
    public static final CommercialPageSource VERTICAL_PAGE_BANNER_LOCATION = new CommercialPageSource("VERTICAL_PAGE_BANNER_LOCATION", 6, "Vertical Page Banner Location");

    private static final /* synthetic */ CommercialPageSource[] $values() {
        return new CommercialPageSource[]{HOME_PAGE, VERTICAL_PAGE, NAVBAR, COMMERCIAL_ADS_CAROUSEL, COMMERCIAL_ITEM_DETAILS_PAGE_CHECK_ALL, COMMERCIAL_ITEM_DETAILS_PAGE_BUTTON, VERTICAL_PAGE_BANNER_LOCATION};
    }

    static {
        CommercialPageSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CommercialPageSource(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<CommercialPageSource> getEntries() {
        return $ENTRIES;
    }

    public static CommercialPageSource valueOf(String str) {
        return (CommercialPageSource) Enum.valueOf(CommercialPageSource.class, str);
    }

    public static CommercialPageSource[] values() {
        return (CommercialPageSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
