package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class KnetPaymentType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ KnetPaymentType[] $VALUES;
    private final String value;
    public static final KnetPaymentType PACKAGE = new KnetPaymentType("PACKAGE", 0, "Package");
    public static final KnetPaymentType ADDONS = new KnetPaymentType("ADDONS", 1, "Addons");
    public static final KnetPaymentType LISTING = new KnetPaymentType("LISTING", 2, "Listing");
    public static final KnetPaymentType LISTING_WITH_ADDONS = new KnetPaymentType("LISTING_WITH_ADDONS", 3, "ListingWithAddons");

    private static final /* synthetic */ KnetPaymentType[] $values() {
        return new KnetPaymentType[]{PACKAGE, ADDONS, LISTING, LISTING_WITH_ADDONS};
    }

    static {
        KnetPaymentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private KnetPaymentType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<KnetPaymentType> getEntries() {
        return $ENTRIES;
    }

    public static KnetPaymentType valueOf(String str) {
        return (KnetPaymentType) Enum.valueOf(KnetPaymentType.class, str);
    }

    public static KnetPaymentType[] values() {
        return (KnetPaymentType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}
