package com.forsale.adserver.datalayer.bannerdata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: createBanner.kt */
/* loaded from: classes2.dex */
public final class FeatureAdType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ FeatureAdType[] $VALUES;
    private final String type;
    public static final FeatureAdType UNKNOWN = new FeatureAdType("UNKNOWN", 0, "");
    public static final FeatureAdType OFFER = new FeatureAdType("OFFER", 1, "offers");
    public static final FeatureAdType BANNER = new FeatureAdType("BANNER", 2, "splashes");

    private static final /* synthetic */ FeatureAdType[] $values() {
        return new FeatureAdType[]{UNKNOWN, OFFER, BANNER};
    }

    static {
        FeatureAdType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FeatureAdType(String str, int i11, String str2) {
        this.type = str2;
    }

    public static a00.a<FeatureAdType> getEntries() {
        return $ENTRIES;
    }

    public static FeatureAdType valueOf(String str) {
        return (FeatureAdType) Enum.valueOf(FeatureAdType.class, str);
    }

    public static FeatureAdType[] values() {
        return (FeatureAdType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}
