package com.forsale.analytics.commercial;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommercialType.kt */
/* loaded from: classes2.dex */
public final class CommercialType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ CommercialType[] $VALUES;
    private final String value;
    public static final CommercialType BANNER = new CommercialType("BANNER", 0, "Banner");
    public static final CommercialType OFFER = new CommercialType("OFFER", 1, "Offer");
    public static final CommercialType PIN = new CommercialType("PIN", 2, "Pin");
    public static final CommercialType BUSINESS_COMMERCIAL = new CommercialType("BUSINESS_COMMERCIAL", 3, "Banner");

    private static final /* synthetic */ CommercialType[] $values() {
        return new CommercialType[]{BANNER, OFFER, PIN, BUSINESS_COMMERCIAL};
    }

    static {
        CommercialType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CommercialType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<CommercialType> getEntries() {
        return $ENTRIES;
    }

    public static CommercialType valueOf(String str) {
        return (CommercialType) Enum.valueOf(CommercialType.class, str);
    }

    public static CommercialType[] values() {
        return (CommercialType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
