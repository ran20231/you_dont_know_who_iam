package com.forsale.app.features.categories.listings.items;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ResetAllPosition.kt */
/* loaded from: classes2.dex */
public final class ResetAllPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ResetAllPosition[] $VALUES;
    private final String value;
    public static final ResetAllPosition LISTINGS = new ResetAllPosition("LISTINGS", 0, "Listings");
    public static final ResetAllPosition ADVANCED_SEARCH = new ResetAllPosition("ADVANCED_SEARCH", 1, "Advanced Search");

    private static final /* synthetic */ ResetAllPosition[] $values() {
        return new ResetAllPosition[]{LISTINGS, ADVANCED_SEARCH};
    }

    static {
        ResetAllPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ResetAllPosition(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<ResetAllPosition> getEntries() {
        return $ENTRIES;
    }

    public static ResetAllPosition valueOf(String str) {
        return (ResetAllPosition) Enum.valueOf(ResetAllPosition.class, str);
    }

    public static ResetAllPosition[] values() {
        return (ResetAllPosition[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
