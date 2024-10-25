package com.forsale.app.utils.analytics;

import com.forsale.app.features.categories.listings.ListingsTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsDetailsSource.kt */
/* loaded from: classes3.dex */
public final class AnalyticsDetailsSource {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AnalyticsDetailsSource[] $VALUES;
    public static final a Companion;
    private final String value;
    public static final AnalyticsDetailsSource GRAND_PINNING_LISTINGS = new AnalyticsDetailsSource("GRAND_PINNING_LISTINGS", 0, "Grand Pinning Listings");
    public static final AnalyticsDetailsSource RECOMMENDED_LISTINGS = new AnalyticsDetailsSource("RECOMMENDED_LISTINGS", 1, "Reco");
    public static final AnalyticsDetailsSource RELATED_LISTINGS = new AnalyticsDetailsSource("RELATED_LISTINGS", 2, "Related Listings");
    public static final AnalyticsDetailsSource ADVANCED_SEARCH_RESULTS = new AnalyticsDetailsSource("ADVANCED_SEARCH_RESULTS", 3, "Advanced Search Results");
    public static final AnalyticsDetailsSource MY_LISTINGS = new AnalyticsDetailsSource("MY_LISTINGS", 4, "My Listings");
    public static final AnalyticsDetailsSource LISTINGS = new AnalyticsDetailsSource("LISTINGS", 5, "Listings");
    public static final AnalyticsDetailsSource DEEP_LINK = new AnalyticsDetailsSource("DEEP_LINK", 6, "Deep Link");
    public static final AnalyticsDetailsSource GLOBAL_SEARCH_RESULTS = new AnalyticsDetailsSource("GLOBAL_SEARCH_RESULTS", 7, "Global Search Results");
    public static final AnalyticsDetailsSource LISTINGS_OF_THE_DAY = new AnalyticsDetailsSource("LISTINGS_OF_THE_DAY", 8, "Listings Of The Day");
    public static final AnalyticsDetailsSource FAVORITES = new AnalyticsDetailsSource("FAVORITES", 9, "Favorites");
    public static final AnalyticsDetailsSource RECENTLY_VIEWED = new AnalyticsDetailsSource("RECENTLY_VIEWED", 10, "Recently Viewed");
    public static final AnalyticsDetailsSource WANTED_LISTINGS = new AnalyticsDetailsSource("WANTED_LISTINGS", 11, "Wanted Listings");
    public static final AnalyticsDetailsSource PROMOTED_LISTING = new AnalyticsDetailsSource("PROMOTED_LISTING", 12, "Promoted Listing");
    public static final AnalyticsDetailsSource IN_APP_MESSAGE = new AnalyticsDetailsSource("IN_APP_MESSAGE", 13, "In-App Message");
    public static final AnalyticsDetailsSource NOTIFICATION = new AnalyticsDetailsSource("NOTIFICATION", 14, "Notification");
    public static final AnalyticsDetailsSource POWER_PINS = new AnalyticsDetailsSource("POWER_PINS", 15, "Power Pins");
    public static final AnalyticsDetailsSource SEARCH_SPOTLIGHT = new AnalyticsDetailsSource("SEARCH_SPOTLIGHT", 16, "Search Spotlight");
    public static final AnalyticsDetailsSource SEARCH_SPOTLIGHT_SEE_ALL = new AnalyticsDetailsSource("SEARCH_SPOTLIGHT_SEE_ALL", 17, "Search Spotlight See All");
    public static final AnalyticsDetailsSource SEARCH_RESULTS = new AnalyticsDetailsSource("SEARCH_RESULTS", 18, "Search Result");
    public static final AnalyticsDetailsSource HOT_ZONE = new AnalyticsDetailsSource("HOT_ZONE", 19, "Hot Zone");
    public static final AnalyticsDetailsSource NEW_ARRIVALS = new AnalyticsDetailsSource("NEW_ARRIVALS", 20, "New Arrivals");
    public static final AnalyticsDetailsSource USER_PROFILE_LISTINGS = new AnalyticsDetailsSource("USER_PROFILE_LISTINGS", 21, "User Profile Listings");
    public static final AnalyticsDetailsSource ADD_LISTING_UPLOADED_WITH_CONDITIONS = new AnalyticsDetailsSource("ADD_LISTING_UPLOADED_WITH_CONDITIONS", 22, "Add Listing - Uploaded With Conditions");
    public static final AnalyticsDetailsSource FOR_SALE_REALITY_SEE_ALL = new AnalyticsDetailsSource("FOR_SALE_REALITY_SEE_ALL", 23, "4sale Reality See All");
    public static final AnalyticsDetailsSource HOT_ZONE_SEE_ALL = new AnalyticsDetailsSource("HOT_ZONE_SEE_ALL", 24, "Hot Zone See All");
    public static final AnalyticsDetailsSource RECOMMENDED_FILTER = new AnalyticsDetailsSource("RECOMMENDED_FILTER", 25, "Recommended Filter");
    public static final AnalyticsDetailsSource FOR_SALE_REALTY_PIN = new AnalyticsDetailsSource("FOR_SALE_REALTY_PIN", 26, "4sale Realty Pin");
    public static final AnalyticsDetailsSource PINNED_ITEM = new AnalyticsDetailsSource("PINNED_ITEM", 27, "Pinned Listings");

    /* compiled from: AnalyticsDetailsSource.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: AnalyticsDetailsSource.kt */
        /* renamed from: com.forsale.app.utils.analytics.AnalyticsDetailsSource$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0452a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f39972a;

            static {
                int[] iArr = new int[ListingsTypes.values().length];
                try {
                    iArr[ListingsTypes.MY_FAVORITES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ListingsTypes.MY_VIEW_HISTORY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ListingsTypes.MY_LISTINGS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ListingsTypes.WANTED_ITEMS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ListingsTypes.NORMAL_LISTINGS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ListingsTypes.SPOTLIGHT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ListingsTypes.SPOTLIGHT_ALL.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ListingsTypes.SEARCH_SCREEN.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ListingsTypes.HOT_ZONES.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ListingsTypes.NEW_ARRIVALS.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ListingsTypes.USER_ITEMS.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ListingsTypes.RECOMMENDED_LISTINGS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ListingsTypes.FOR_SALE_REALTY.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                f39972a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AnalyticsDetailsSource a(ListingsTypes listingsTypes) {
            o.i(listingsTypes, "listingsTypes");
            switch (C0452a.f39972a[listingsTypes.ordinal()]) {
                case 1:
                    return AnalyticsDetailsSource.FAVORITES;
                case 2:
                    return AnalyticsDetailsSource.RECENTLY_VIEWED;
                case 3:
                    return AnalyticsDetailsSource.MY_LISTINGS;
                case 4:
                    return AnalyticsDetailsSource.WANTED_LISTINGS;
                case 5:
                    return AnalyticsDetailsSource.LISTINGS;
                case 6:
                    return AnalyticsDetailsSource.SEARCH_SPOTLIGHT;
                case 7:
                    return AnalyticsDetailsSource.SEARCH_SPOTLIGHT_SEE_ALL;
                case 8:
                    return AnalyticsDetailsSource.SEARCH_RESULTS;
                case 9:
                    return AnalyticsDetailsSource.HOT_ZONE;
                case 10:
                    return AnalyticsDetailsSource.NEW_ARRIVALS;
                case 11:
                    return AnalyticsDetailsSource.USER_PROFILE_LISTINGS;
                case 12:
                    return AnalyticsDetailsSource.RECOMMENDED_LISTINGS;
                case 13:
                    return AnalyticsDetailsSource.FOR_SALE_REALITY_SEE_ALL;
                default:
                    return AnalyticsDetailsSource.LISTINGS;
            }
        }
    }

    private static final /* synthetic */ AnalyticsDetailsSource[] $values() {
        return new AnalyticsDetailsSource[]{GRAND_PINNING_LISTINGS, RECOMMENDED_LISTINGS, RELATED_LISTINGS, ADVANCED_SEARCH_RESULTS, MY_LISTINGS, LISTINGS, DEEP_LINK, GLOBAL_SEARCH_RESULTS, LISTINGS_OF_THE_DAY, FAVORITES, RECENTLY_VIEWED, WANTED_LISTINGS, PROMOTED_LISTING, IN_APP_MESSAGE, NOTIFICATION, POWER_PINS, SEARCH_SPOTLIGHT, SEARCH_SPOTLIGHT_SEE_ALL, SEARCH_RESULTS, HOT_ZONE, NEW_ARRIVALS, USER_PROFILE_LISTINGS, ADD_LISTING_UPLOADED_WITH_CONDITIONS, FOR_SALE_REALITY_SEE_ALL, HOT_ZONE_SEE_ALL, RECOMMENDED_FILTER, FOR_SALE_REALTY_PIN, PINNED_ITEM};
    }

    static {
        AnalyticsDetailsSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private AnalyticsDetailsSource(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AnalyticsDetailsSource> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsDetailsSource valueOf(String str) {
        return (AnalyticsDetailsSource) Enum.valueOf(AnalyticsDetailsSource.class, str);
    }

    public static AnalyticsDetailsSource[] values() {
        return (AnalyticsDetailsSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
