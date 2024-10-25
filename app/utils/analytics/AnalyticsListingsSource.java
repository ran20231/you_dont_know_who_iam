package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsListingsSource.kt */
/* loaded from: classes3.dex */
public final class AnalyticsListingsSource {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AnalyticsListingsSource[] $VALUES;
    private final String value;
    public static final AnalyticsListingsSource MORE = new AnalyticsListingsSource("MORE", 0, "More");
    public static final AnalyticsListingsSource POST_LISTING = new AnalyticsListingsSource("POST_LISTING", 1, "Post Listing");
    public static final AnalyticsListingsSource EDIT_LISTING = new AnalyticsListingsSource("EDIT_LISTING", 2, "Edit Listing");
    public static final AnalyticsListingsSource Notification = new AnalyticsListingsSource("Notification", 3, "Notification");
    public static final AnalyticsListingsSource Shortcuts = new AnalyticsListingsSource("Shortcuts", 4, "Shortcuts");
    public static final AnalyticsListingsSource ListingDetailsSimilarAdsSeeAll = new AnalyticsListingsSource("ListingDetailsSimilarAdsSeeAll", 5, "Listing Details See All");
    public static final AnalyticsListingsSource Vertical = new AnalyticsListingsSource("Vertical", 6, "Vertical Page");

    private static final /* synthetic */ AnalyticsListingsSource[] $values() {
        return new AnalyticsListingsSource[]{MORE, POST_LISTING, EDIT_LISTING, Notification, Shortcuts, ListingDetailsSimilarAdsSeeAll, Vertical};
    }

    static {
        AnalyticsListingsSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AnalyticsListingsSource(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AnalyticsListingsSource> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsListingsSource valueOf(String str) {
        return (AnalyticsListingsSource) Enum.valueOf(AnalyticsListingsSource.class, str);
    }

    public static AnalyticsListingsSource[] values() {
        return (AnalyticsListingsSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
