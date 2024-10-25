package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AWSSpot.kt */
/* loaded from: classes3.dex */
public final class AWSSpot {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AWSSpot[] $VALUES;
    public static final AWSSpot NAVIGATION_BAR = new AWSSpot("NAVIGATION_BAR", 0, "Navigation Bar");
    public static final AWSSpot POWER_PINS_BAR = new AWSSpot("POWER_PINS_BAR", 1, "Power Pins Bar");
    private final String value;

    private static final /* synthetic */ AWSSpot[] $values() {
        return new AWSSpot[]{NAVIGATION_BAR, POWER_PINS_BAR};
    }

    static {
        AWSSpot[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AWSSpot(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AWSSpot> getEntries() {
        return $ENTRIES;
    }

    public static AWSSpot valueOf(String str) {
        return (AWSSpot) Enum.valueOf(AWSSpot.class, str);
    }

    public static AWSSpot[] values() {
        return (AWSSpot[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
