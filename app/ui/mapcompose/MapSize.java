package com.forsale.app.ui.mapcompose;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MapSize.kt */
/* loaded from: classes3.dex */
public final class MapSize {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ MapSize[] $VALUES;
    public static final MapSize SMALL = new MapSize("SMALL", 0);
    public static final MapSize LARGE = new MapSize("LARGE", 1);

    private static final /* synthetic */ MapSize[] $values() {
        return new MapSize[]{SMALL, LARGE};
    }

    static {
        MapSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MapSize(String str, int i11) {
    }

    public static a00.a<MapSize> getEntries() {
        return $ENTRIES;
    }

    public static MapSize valueOf(String str) {
        return (MapSize) Enum.valueOf(MapSize.class, str);
    }

    public static MapSize[] values() {
        return (MapSize[]) $VALUES.clone();
    }
}
