package com.forsale.app.features.postad.location;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m00.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocationLevels.kt */
/* loaded from: classes2.dex */
public final class LocationLevels {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ LocationLevels[] $VALUES;
    public static final a Companion;
    private static final Map<Integer, LocationLevels> map;
    private final int level;
    public static final LocationLevels REGION = new LocationLevels("REGION", 0, 0);
    public static final LocationLevels DISTRICT = new LocationLevels("DISTRICT", 1, 1);
    public static final LocationLevels AREA = new LocationLevels("AREA", 2, 2);
    public static final LocationLevels BLOCK = new LocationLevels("BLOCK", 3, 3);

    /* compiled from: LocationLevels.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LocationLevels a(Integer num) {
            if (num != null) {
                num.intValue();
                return (LocationLevels) LocationLevels.map.get(num);
            }
            return null;
        }
    }

    private static final /* synthetic */ LocationLevels[] $values() {
        return new LocationLevels[]{REGION, DISTRICT, AREA, BLOCK};
    }

    static {
        int e11;
        int d11;
        LocationLevels[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        LocationLevels[] values = values();
        e11 = i0.e(values.length);
        d11 = o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (LocationLevels locationLevels : values) {
            linkedHashMap.put(Integer.valueOf(locationLevels.level), locationLevels);
        }
        map = linkedHashMap;
    }

    private LocationLevels(String str, int i11, int i12) {
        this.level = i12;
    }

    public static a00.a<LocationLevels> getEntries() {
        return $ENTRIES;
    }

    public static LocationLevels valueOf(String str) {
        return (LocationLevels) Enum.valueOf(LocationLevels.class, str);
    }

    public static LocationLevels[] values() {
        return (LocationLevels[]) $VALUES.clone();
    }

    public final int getLevel() {
        return this.level;
    }
}
