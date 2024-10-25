package com.forsale.app.utils.analytics.propertyhome;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerticalPageSwiped.kt */
/* loaded from: classes3.dex */
public final class VerticalPageSwiped {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VerticalPageSwiped[] $VALUES;
    private final String value;
    public static final VerticalPageSwiped VERTICAL_PAGE_SWIPED = new VerticalPageSwiped("VERTICAL_PAGE_SWIPED", 0, "Vertical Page Swiped");
    public static final VerticalPageSwiped VERTICAL = new VerticalPageSwiped("VERTICAL", 1, "Vertical");
    public static final VerticalPageSwiped MAX_ITEM_SCROLLED = new VerticalPageSwiped("MAX_ITEM_SCROLLED", 2, "MaxItemScrolled");
    public static final VerticalPageSwiped SECTION_NAME = new VerticalPageSwiped("SECTION_NAME", 3, "SectionName");
    public static final VerticalPageSwiped TOTAL_ITEM_COUNT = new VerticalPageSwiped("TOTAL_ITEM_COUNT", 4, "TotalItemsCount");

    private static final /* synthetic */ VerticalPageSwiped[] $values() {
        return new VerticalPageSwiped[]{VERTICAL_PAGE_SWIPED, VERTICAL, MAX_ITEM_SCROLLED, SECTION_NAME, TOTAL_ITEM_COUNT};
    }

    static {
        VerticalPageSwiped[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private VerticalPageSwiped(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<VerticalPageSwiped> getEntries() {
        return $ENTRIES;
    }

    public static VerticalPageSwiped valueOf(String str) {
        return (VerticalPageSwiped) Enum.valueOf(VerticalPageSwiped.class, str);
    }

    public static VerticalPageSwiped[] values() {
        return (VerticalPageSwiped[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
