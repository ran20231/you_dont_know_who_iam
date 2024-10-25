package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsLocation.kt */
/* loaded from: classes2.dex */
public final class AnalyticsLocation {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AnalyticsLocation[] $VALUES;
    private final String value;
    public static final AnalyticsLocation DISABLED = new AnalyticsLocation("DISABLED", 0, "Disable Location");
    public static final AnalyticsLocation APPROXIMATE = new AnalyticsLocation("APPROXIMATE", 1, "Approximate Location");
    public static final AnalyticsLocation EXACT = new AnalyticsLocation("EXACT", 2, "Exact Location");

    private static final /* synthetic */ AnalyticsLocation[] $values() {
        return new AnalyticsLocation[]{DISABLED, APPROXIMATE, EXACT};
    }

    static {
        AnalyticsLocation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AnalyticsLocation(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AnalyticsLocation> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsLocation valueOf(String str) {
        return (AnalyticsLocation) Enum.valueOf(AnalyticsLocation.class, str);
    }

    public static AnalyticsLocation[] values() {
        return (AnalyticsLocation[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
