package com.forsale.app.ui.bottomsheets.filterselector;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FilterSelectorDisplayType.kt */
/* loaded from: classes3.dex */
public final class FilterSelectorDisplayType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FilterSelectorDisplayType[] $VALUES;
    public static final FilterSelectorDisplayType LIST = new FilterSelectorDisplayType("LIST", 0);
    public static final FilterSelectorDisplayType GRID = new FilterSelectorDisplayType("GRID", 1);

    private static final /* synthetic */ FilterSelectorDisplayType[] $values() {
        return new FilterSelectorDisplayType[]{LIST, GRID};
    }

    static {
        FilterSelectorDisplayType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FilterSelectorDisplayType(String str, int i11) {
    }

    public static a<FilterSelectorDisplayType> getEntries() {
        return $ENTRIES;
    }

    public static FilterSelectorDisplayType valueOf(String str) {
        return (FilterSelectorDisplayType) Enum.valueOf(FilterSelectorDisplayType.class, str);
    }

    public static FilterSelectorDisplayType[] values() {
        return (FilterSelectorDisplayType[]) $VALUES.clone();
    }
}
