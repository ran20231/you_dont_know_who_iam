package com.forsale.app.utils.analytics.listingfiltration;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FilterPlaces.kt */
/* loaded from: classes3.dex */
public final class FilterPlaces {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ FilterPlaces[] $VALUES;
    public static final FilterPlaces ALL_FILTERS = new FilterPlaces("ALL_FILTERS", 0, "All Filters");
    public static final FilterPlaces EXPOSED_FILTERS = new FilterPlaces("EXPOSED_FILTERS", 1, "Exposed Filters");
    private final String value;

    private static final /* synthetic */ FilterPlaces[] $values() {
        return new FilterPlaces[]{ALL_FILTERS, EXPOSED_FILTERS};
    }

    static {
        FilterPlaces[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FilterPlaces(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<FilterPlaces> getEntries() {
        return $ENTRIES;
    }

    public static FilterPlaces valueOf(String str) {
        return (FilterPlaces) Enum.valueOf(FilterPlaces.class, str);
    }

    public static FilterPlaces[] values() {
        return (FilterPlaces[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
