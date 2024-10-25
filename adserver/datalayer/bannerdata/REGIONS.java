package com.forsale.adserver.datalayer.bannerdata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: createBanner.kt */
/* loaded from: classes2.dex */
public final class REGIONS {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ REGIONS[] $VALUES;
    public static final REGIONS KWT = new REGIONS("KWT", 0, 1);
    private final int regionId;

    private static final /* synthetic */ REGIONS[] $values() {
        return new REGIONS[]{KWT};
    }

    static {
        REGIONS[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private REGIONS(String str, int i11, int i12) {
        this.regionId = i12;
    }

    public static a00.a<REGIONS> getEntries() {
        return $ENTRIES;
    }

    public static REGIONS valueOf(String str) {
        return (REGIONS) Enum.valueOf(REGIONS.class, str);
    }

    public static REGIONS[] values() {
        return (REGIONS[]) $VALUES.clone();
    }

    public final int getRegionId() {
        return this.regionId;
    }
}
