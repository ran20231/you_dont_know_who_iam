package com.forsale.app.datalayer.repositories;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrendStatus.kt */
/* loaded from: classes2.dex */
public final class TrendStatus {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ TrendStatus[] $VALUES;
    public static final TrendStatus API_HAS_DATA = new TrendStatus("API_HAS_DATA", 0);
    public static final TrendStatus API_EMPTY = new TrendStatus("API_EMPTY", 1);
    public static final TrendStatus DB_HAS_DATA = new TrendStatus("DB_HAS_DATA", 2);
    public static final TrendStatus DB_EMPTY = new TrendStatus("DB_EMPTY", 3);
    public static final TrendStatus ALL_DATA_EMPTY = new TrendStatus("ALL_DATA_EMPTY", 4);
    public static final TrendStatus HAS_DATA = new TrendStatus("HAS_DATA", 5);

    private static final /* synthetic */ TrendStatus[] $values() {
        return new TrendStatus[]{API_HAS_DATA, API_EMPTY, DB_HAS_DATA, DB_EMPTY, ALL_DATA_EMPTY, HAS_DATA};
    }

    static {
        TrendStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TrendStatus(String str, int i11) {
    }

    public static a00.a<TrendStatus> getEntries() {
        return $ENTRIES;
    }

    public static TrendStatus valueOf(String str) {
        return (TrendStatus) Enum.valueOf(TrendStatus.class, str);
    }

    public static TrendStatus[] values() {
        return (TrendStatus[]) $VALUES.clone();
    }
}
