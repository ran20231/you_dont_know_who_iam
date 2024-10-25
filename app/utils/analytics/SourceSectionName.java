package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SourceSectionName.kt */
/* loaded from: classes3.dex */
public final class SourceSectionName {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ SourceSectionName[] $VALUES;
    private final String value;
    public static final SourceSectionName HOME_RECOMMENDED_VERTICAL = new SourceSectionName("HOME_RECOMMENDED_VERTICAL", 0, "Home Recommended Vertical");
    public static final SourceSectionName CATEGORY_RECOMMENDED_FILTERS = new SourceSectionName("CATEGORY_RECOMMENDED_FILTERS", 1, "Category Recommended Filters");
    public static final SourceSectionName HOT_ZONE = new SourceSectionName("HOT_ZONE", 2, "Hot Zone");

    private static final /* synthetic */ SourceSectionName[] $values() {
        return new SourceSectionName[]{HOME_RECOMMENDED_VERTICAL, CATEGORY_RECOMMENDED_FILTERS, HOT_ZONE};
    }

    static {
        SourceSectionName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SourceSectionName(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<SourceSectionName> getEntries() {
        return $ENTRIES;
    }

    public static SourceSectionName valueOf(String str) {
        return (SourceSectionName) Enum.valueOf(SourceSectionName.class, str);
    }

    public static SourceSectionName[] values() {
        return (SourceSectionName[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
