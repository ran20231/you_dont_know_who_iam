package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsListingStatus.kt */
/* loaded from: classes2.dex */
public final class AnalyticsListingStatus {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AnalyticsListingStatus[] $VALUES;
    private final String value;
    public static final AnalyticsListingStatus ACTIVE = new AnalyticsListingStatus("ACTIVE", 0, "Active");
    public static final AnalyticsListingStatus QUARANTINED = new AnalyticsListingStatus("QUARANTINED", 1, "Quarantined");
    public static final AnalyticsListingStatus DRAFT = new AnalyticsListingStatus("DRAFT", 2, "Draft");
    public static final AnalyticsListingStatus ARCHIVED = new AnalyticsListingStatus("ARCHIVED", 3, "Archived");

    private static final /* synthetic */ AnalyticsListingStatus[] $values() {
        return new AnalyticsListingStatus[]{ACTIVE, QUARANTINED, DRAFT, ARCHIVED};
    }

    static {
        AnalyticsListingStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AnalyticsListingStatus(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AnalyticsListingStatus> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsListingStatus valueOf(String str) {
        return (AnalyticsListingStatus) Enum.valueOf(AnalyticsListingStatus.class, str);
    }

    public static AnalyticsListingStatus[] values() {
        return (AnalyticsListingStatus[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
