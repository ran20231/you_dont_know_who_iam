package com.forsale.app.ui.mapcompose;

import com.google.android.gms.stats.CodePackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MapOpenMode.kt */
/* loaded from: classes3.dex */
public final class MapOpenMode {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ MapOpenMode[] $VALUES;
    public static final MapOpenMode LOCATION = new MapOpenMode(CodePackage.LOCATION, 0);
    public static final MapOpenMode DIRECTION = new MapOpenMode("DIRECTION", 1);
    public static final MapOpenMode NAVIGATION = new MapOpenMode("NAVIGATION", 2);

    private static final /* synthetic */ MapOpenMode[] $values() {
        return new MapOpenMode[]{LOCATION, DIRECTION, NAVIGATION};
    }

    static {
        MapOpenMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MapOpenMode(String str, int i11) {
    }

    public static a00.a<MapOpenMode> getEntries() {
        return $ENTRIES;
    }

    public static MapOpenMode valueOf(String str) {
        return (MapOpenMode) Enum.valueOf(MapOpenMode.class, str);
    }

    public static MapOpenMode[] values() {
        return (MapOpenMode[]) $VALUES.clone();
    }
}
