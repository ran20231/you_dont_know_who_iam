package com.forsale.app.features.categories.listings;

import a00.a;
import t9.y0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SortingStates.kt */
/* loaded from: classes2.dex */
public final class SortingStates {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SortingStates[] $VALUES;
    private final String key;
    private final int title;
    private final String value;
    public static final SortingStates DEFAULT = new SortingStates("DEFAULT", 0, y0.f70425de, "", "");
    public static final SortingStates PRICE_LOW_TO_HIGH = new SortingStates("PRICE_LOW_TO_HIGH", 1, y0.f70408ce, "low_price", "Low Price");
    public static final SortingStates PRICE_HIGH_TO_LOW = new SortingStates("PRICE_HIGH_TO_LOW", 2, y0.f70391be, "high_price", "High Price");
    public static final SortingStates DATE_NEWEST_TO_OLDEST = new SortingStates("DATE_NEWEST_TO_OLDEST", 3, y0.Zd, "newest", "New");
    public static final SortingStates DATE_OLDEST_TO_NEWEST = new SortingStates("DATE_OLDEST_TO_NEWEST", 4, y0.f70374ae, "oldest", "Old");

    private static final /* synthetic */ SortingStates[] $values() {
        return new SortingStates[]{DEFAULT, PRICE_LOW_TO_HIGH, PRICE_HIGH_TO_LOW, DATE_NEWEST_TO_OLDEST, DATE_OLDEST_TO_NEWEST};
    }

    static {
        SortingStates[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SortingStates(String str, int i11, int i12, String str2, String str3) {
        this.title = i12;
        this.key = str2;
        this.value = str3;
    }

    public static a<SortingStates> getEntries() {
        return $ENTRIES;
    }

    public static SortingStates valueOf(String str) {
        return (SortingStates) Enum.valueOf(SortingStates.class, str);
    }

    public static SortingStates[] values() {
        return (SortingStates[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    public final int getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }
}
