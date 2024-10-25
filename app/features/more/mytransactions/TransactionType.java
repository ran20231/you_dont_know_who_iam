package com.forsale.app.features.more.mytransactions;

import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransactionType.kt */
/* loaded from: classes2.dex */
public final class TransactionType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ TransactionType[] $VALUES;
    private final String value;
    @c("pinning")
    public static final TransactionType PINNING = new TransactionType("PINNING", 0, "pinning");
    @c("pinning_waiting")
    public static final TransactionType PINNING_WAITING = new TransactionType("PINNING_WAITING", 1, "pinning_waiting");
    @c("pinning_shuffle_waiting")
    public static final TransactionType PINNING_SHUFFLE_WAITING = new TransactionType("PINNING_SHUFFLE_WAITING", 2, "pinning_shuffle_waiting");
    @c("parent_pinning")
    public static final TransactionType PARENT_PINNING = new TransactionType("PARENT_PINNING", 3, "parent_pinning");
    @c("parent_pinning_waiting")
    public static final TransactionType PARENT_PINNING_WAITING = new TransactionType("PARENT_PINNING_WAITING", 4, "parent_pinning_waiting");
    @c("grand_pinning")
    public static final TransactionType GRAND_PINNING = new TransactionType("GRAND_PINNING", 5, "grand_pinning");
    @c("listing")
    public static final TransactionType LISTING = new TransactionType("LISTING", 6, "listing");
    @c("listing_free")
    public static final TransactionType LISTING_FREE = new TransactionType("LISTING_FREE", 7, "listing_free");
    @c("video")
    public static final TransactionType VIDEO = new TransactionType("VIDEO", 8, "video");
    @c("premium")
    public static final TransactionType PREMIUM = new TransactionType("PREMIUM", 9, "premium");
    @c("promoted")
    public static final TransactionType PROMOTED = new TransactionType("PROMOTED", 10, "promoted");
    @c("promoted_parent")
    public static final TransactionType PROMOTED_PARENT = new TransactionType("PROMOTED_PARENT", 11, "promoted_parent");
    @c("promoted_grand")
    public static final TransactionType PROMOTED_GRAND = new TransactionType("PROMOTED_GRAND", 12, "promoted_grand");
    @c("listing_plan")
    public static final TransactionType LISTING_PLAN = new TransactionType("LISTING_PLAN", 13, "listing_plan");
    @c("pinning_power_pin")
    public static final TransactionType PINNING_POWER_PIN = new TransactionType("PINNING_POWER_PIN", 14, "pinning_power_pin");
    @c("pinning_power_pin_waiting")
    public static final TransactionType PINNING_POWER_PIN_WAITING = new TransactionType("PINNING_POWER_PIN_WAITING", 15, "pinning_power_pin_waiting");
    @c("parent_pinning_power_pin")
    public static final TransactionType PARENT_PINNING_POWER_PIN = new TransactionType("PARENT_PINNING_POWER_PIN", 16, "parent_pinning_power_pin");
    @c("grand_pinning_power_pin")
    public static final TransactionType GRAND_PINNING_POWER_PIN = new TransactionType("GRAND_PINNING_POWER_PIN", 17, "grand_pinning_power_pin");
    @c("extended")
    public static final TransactionType EXTENDED = new TransactionType("EXTENDED", 18, "extended");
    @c("listing_bundle")
    public static final TransactionType LISTING_BUNDLE = new TransactionType("LISTING_BUNDLE", 19, "listing_bundle");
    @c("listing_free_plan")
    public static final TransactionType LISTING_FREE_PLAN = new TransactionType("LISTING_FREE_PLAN", 20, "listing_free_plan");
    @c("listing_free_bundle")
    public static final TransactionType LISTING_FREE_BUNDLE = new TransactionType("LISTING_FREE_BUNDLE", 21, "listing_free_bundle");
    @c("none")
    public static final TransactionType NONE = new TransactionType("NONE", 22, "none");

    private static final /* synthetic */ TransactionType[] $values() {
        return new TransactionType[]{PINNING, PINNING_WAITING, PINNING_SHUFFLE_WAITING, PARENT_PINNING, PARENT_PINNING_WAITING, GRAND_PINNING, LISTING, LISTING_FREE, VIDEO, PREMIUM, PROMOTED, PROMOTED_PARENT, PROMOTED_GRAND, LISTING_PLAN, PINNING_POWER_PIN, PINNING_POWER_PIN_WAITING, PARENT_PINNING_POWER_PIN, GRAND_PINNING_POWER_PIN, EXTENDED, LISTING_BUNDLE, LISTING_FREE_PLAN, LISTING_FREE_BUNDLE, NONE};
    }

    static {
        TransactionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransactionType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<TransactionType> getEntries() {
        return $ENTRIES;
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
