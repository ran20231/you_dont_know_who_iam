package com.forsale.app.datalayer.network.entities;

import a00.a;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingDetailsEntity.kt */
/* loaded from: classes2.dex */
public final class Location {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Location[] $VALUES;
    @c("disabled")
    public static final Location DISABLED = new Location("DISABLED", 0);
    @c("approximate")
    public static final Location APPROXIMATE = new Location("APPROXIMATE", 1);
    @c("exact")
    public static final Location EXACT = new Location("EXACT", 2);

    private static final /* synthetic */ Location[] $values() {
        return new Location[]{DISABLED, APPROXIMATE, EXACT};
    }

    static {
        Location[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private Location(String str, int i11) {
    }

    public static a<Location> getEntries() {
        return $ENTRIES;
    }

    public static Location valueOf(String str) {
        return (Location) Enum.valueOf(Location.class, str);
    }

    public static Location[] values() {
        return (Location[]) $VALUES.clone();
    }
}
