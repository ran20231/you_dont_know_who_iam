package com.forsale.app.utils;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IntegerCompareState.kt */
/* loaded from: classes3.dex */
public final class IntegerCompareState {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ IntegerCompareState[] $VALUES;
    private final int value;
    public static final IntegerCompareState VALID = new IntegerCompareState("VALID", 0, 1);
    public static final IntegerCompareState LOWER = new IntegerCompareState("LOWER", 1, -1);
    public static final IntegerCompareState HIGHER = new IntegerCompareState("HIGHER", 2, -2);
    public static final IntegerCompareState INVALID = new IntegerCompareState("INVALID", 3, -3);

    private static final /* synthetic */ IntegerCompareState[] $values() {
        return new IntegerCompareState[]{VALID, LOWER, HIGHER, INVALID};
    }

    static {
        IntegerCompareState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private IntegerCompareState(String str, int i11, int i12) {
        this.value = i12;
    }

    public static a00.a<IntegerCompareState> getEntries() {
        return $ENTRIES;
    }

    public static IntegerCompareState valueOf(String str) {
        return (IntegerCompareState) Enum.valueOf(IntegerCompareState.class, str);
    }

    public static IntegerCompareState[] values() {
        return (IntegerCompareState[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
