package com.forsale.app.utils.facades.map;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: XMarker.kt */
/* loaded from: classes3.dex */
public final class MarkerType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ MarkerType[] $VALUES;
    public static final MarkerType PIN = new MarkerType("PIN", 0);
    public static final MarkerType CIRCLE = new MarkerType("CIRCLE", 1);

    private static final /* synthetic */ MarkerType[] $values() {
        return new MarkerType[]{PIN, CIRCLE};
    }

    static {
        MarkerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MarkerType(String str, int i11) {
    }

    public static a00.a<MarkerType> getEntries() {
        return $ENTRIES;
    }

    public static MarkerType valueOf(String str) {
        return (MarkerType) Enum.valueOf(MarkerType.class, str);
    }

    public static MarkerType[] values() {
        return (MarkerType[]) $VALUES.clone();
    }
}
