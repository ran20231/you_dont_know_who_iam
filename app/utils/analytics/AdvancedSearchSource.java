package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvancedSearchSource.kt */
/* loaded from: classes3.dex */
public final class AdvancedSearchSource {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AdvancedSearchSource[] $VALUES;
    private final String value;
    public static final AdvancedSearchSource HOME = new AdvancedSearchSource("HOME", 0, "Home");
    public static final AdvancedSearchSource SUB_CATEGORY = new AdvancedSearchSource("SUB_CATEGORY", 1, "SubCategory");
    public static final AdvancedSearchSource LISTINGS = new AdvancedSearchSource("LISTINGS", 2, "Listings");

    private static final /* synthetic */ AdvancedSearchSource[] $values() {
        return new AdvancedSearchSource[]{HOME, SUB_CATEGORY, LISTINGS};
    }

    static {
        AdvancedSearchSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AdvancedSearchSource(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AdvancedSearchSource> getEntries() {
        return $ENTRIES;
    }

    public static AdvancedSearchSource valueOf(String str) {
        return (AdvancedSearchSource) Enum.valueOf(AdvancedSearchSource.class, str);
    }

    public static AdvancedSearchSource[] values() {
        return (AdvancedSearchSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
