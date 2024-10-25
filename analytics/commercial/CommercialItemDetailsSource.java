package com.forsale.analytics.commercial;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommercialItemDetailsSource.kt */
/* loaded from: classes2.dex */
public final class CommercialItemDetailsSource {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ CommercialItemDetailsSource[] $VALUES;
    private final String value;
    public static final CommercialItemDetailsSource HOME_SCREEN_COMMERCIAL = new CommercialItemDetailsSource("HOME_SCREEN_COMMERCIAL", 0, "Home Screen Commercial");
    public static final CommercialItemDetailsSource HOME_SCREEN_RECOMMENDATION = new CommercialItemDetailsSource("HOME_SCREEN_RECOMMENDATION", 1, "Home Screen Recommendation");
    public static final CommercialItemDetailsSource COMMERCIAL_SCREEN = new CommercialItemDetailsSource("COMMERCIAL_SCREEN", 2, "Commercial Screen");
    public static final CommercialItemDetailsSource COMMERCIAL_ITEM_DETAILS = new CommercialItemDetailsSource("COMMERCIAL_ITEM_DETAILS", 3, "Commercial Item Details");
    public static final CommercialItemDetailsSource IN_APP_MESSAGE = new CommercialItemDetailsSource("IN_APP_MESSAGE", 4, "In App Message");
    public static final CommercialItemDetailsSource PUSH_NOTIFICATION = new CommercialItemDetailsSource("PUSH_NOTIFICATION", 5, "Push Notification");
    public static final CommercialItemDetailsSource VERTICAL_SCREEN_BANNER_LOCATION = new CommercialItemDetailsSource("VERTICAL_SCREEN_BANNER_LOCATION", 6, "Vertical Screen Banner Location");
    public static final CommercialItemDetailsSource SUB_CATEGORIES_SCREEN_BANNER_LOCATION = new CommercialItemDetailsSource("SUB_CATEGORIES_SCREEN_BANNER_LOCATION", 7, "Sub Categories Screen Banner Location");
    public static final CommercialItemDetailsSource VERTICAL_PAGE = new CommercialItemDetailsSource("VERTICAL_PAGE", 8, "Vertical Page");
    public static final CommercialItemDetailsSource SUB_CATEGORIES_SCREEN = new CommercialItemDetailsSource("SUB_CATEGORIES_SCREEN", 9, "Sub Categories Screen");
    public static final CommercialItemDetailsSource NOTIFICATIONS_SCREEN = new CommercialItemDetailsSource("NOTIFICATIONS_SCREEN", 10, "Notifications Screen");
    public static final CommercialItemDetailsSource SPLASH = new CommercialItemDetailsSource("SPLASH", 11, "Splash");
    public static final CommercialItemDetailsSource LISTINGS = new CommercialItemDetailsSource("LISTINGS", 12, "Listings");
    public static final CommercialItemDetailsSource DEEP_LINK = new CommercialItemDetailsSource("DEEP_LINK", 13, "Deep Link");
    public static final CommercialItemDetailsSource DIRECT_LINK = new CommercialItemDetailsSource("DIRECT_LINK", 14, "Direct Link");

    private static final /* synthetic */ CommercialItemDetailsSource[] $values() {
        return new CommercialItemDetailsSource[]{HOME_SCREEN_COMMERCIAL, HOME_SCREEN_RECOMMENDATION, COMMERCIAL_SCREEN, COMMERCIAL_ITEM_DETAILS, IN_APP_MESSAGE, PUSH_NOTIFICATION, VERTICAL_SCREEN_BANNER_LOCATION, SUB_CATEGORIES_SCREEN_BANNER_LOCATION, VERTICAL_PAGE, SUB_CATEGORIES_SCREEN, NOTIFICATIONS_SCREEN, SPLASH, LISTINGS, DEEP_LINK, DIRECT_LINK};
    }

    static {
        CommercialItemDetailsSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CommercialItemDetailsSource(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<CommercialItemDetailsSource> getEntries() {
        return $ENTRIES;
    }

    public static CommercialItemDetailsSource valueOf(String str) {
        return (CommercialItemDetailsSource) Enum.valueOf(CommercialItemDetailsSource.class, str);
    }

    public static CommercialItemDetailsSource[] values() {
        return (CommercialItemDetailsSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
