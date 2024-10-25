package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SubCategoriesPosition.kt */
/* loaded from: classes3.dex */
public final class SubCategoriesPosition {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ SubCategoriesPosition[] $VALUES;
    private final String value;
    public static final SubCategoriesPosition DROP_DOWN_MENU = new SubCategoriesPosition("DROP_DOWN_MENU", 0, "Drop Down Menu");
    public static final SubCategoriesPosition EXPLORE_VERTICAL = new SubCategoriesPosition("EXPLORE_VERTICAL", 1, "Explore Vertical");
    public static final SubCategoriesPosition DEEP_LINK = new SubCategoriesPosition("DEEP_LINK", 2, "deep link");
    public static final SubCategoriesPosition DEFAULT = new SubCategoriesPosition("DEFAULT", 3, "");

    private static final /* synthetic */ SubCategoriesPosition[] $values() {
        return new SubCategoriesPosition[]{DROP_DOWN_MENU, EXPLORE_VERTICAL, DEEP_LINK, DEFAULT};
    }

    static {
        SubCategoriesPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SubCategoriesPosition(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<SubCategoriesPosition> getEntries() {
        return $ENTRIES;
    }

    public static SubCategoriesPosition valueOf(String str) {
        return (SubCategoriesPosition) Enum.valueOf(SubCategoriesPosition.class, str);
    }

    public static SubCategoriesPosition[] values() {
        return (SubCategoriesPosition[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
