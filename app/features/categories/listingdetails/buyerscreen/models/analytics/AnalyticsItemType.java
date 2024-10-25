package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsItemType.kt */
/* loaded from: classes2.dex */
public final class AnalyticsItemType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AnalyticsItemType[] $VALUES;
    private final String value;
    public static final AnalyticsItemType NORMAL_LISTING = new AnalyticsItemType("NORMAL_LISTING", 0, "Normal Listing");
    public static final AnalyticsItemType PINNED_LISTING = new AnalyticsItemType("PINNED_LISTING", 1, "Pinned Listing");
    public static final AnalyticsItemType COMMERCIAL_LISTING = new AnalyticsItemType("COMMERCIAL_LISTING", 2, "Commercial Listing");

    private static final /* synthetic */ AnalyticsItemType[] $values() {
        return new AnalyticsItemType[]{NORMAL_LISTING, PINNED_LISTING, COMMERCIAL_LISTING};
    }

    static {
        AnalyticsItemType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AnalyticsItemType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AnalyticsItemType> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsItemType valueOf(String str) {
        return (AnalyticsItemType) Enum.valueOf(AnalyticsItemType.class, str);
    }

    public static AnalyticsItemType[] values() {
        return (AnalyticsItemType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
