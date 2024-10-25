package com.forsale.app.datalayer.network.responses.listingdetails;

import a00.a;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingPinOptionType.kt */
/* loaded from: classes2.dex */
public final class ListingPinOptionType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListingPinOptionType[] $VALUES;
    private final String value;
    @c("waiting")
    public static final ListingPinOptionType WAITING = new ListingPinOptionType("WAITING", 0, "waiting");
    @c("pinning")
    public static final ListingPinOptionType PINING = new ListingPinOptionType("PINING", 1, "pinning");
    @c("pinning_shuffle_waiting")
    public static final ListingPinOptionType PINNING_SHUFFLE_WAITING = new ListingPinOptionType("PINNING_SHUFFLE_WAITING", 2, "pinning_shuffle_waiting");
    @c("pinning_shuffle")
    public static final ListingPinOptionType PINNING_SHUFFLE = new ListingPinOptionType("PINNING_SHUFFLE", 3, "pinning_shuffle");
    @c("promoted")
    public static final ListingPinOptionType PROMOTED = new ListingPinOptionType("PROMOTED", 4, "promoted");
    @c("pinning_power_pin")
    public static final ListingPinOptionType PINNING_POWER_PIN = new ListingPinOptionType("PINNING_POWER_PIN", 5, "pinning_power_pin");
    @c("pinning_power_pin_waiting")
    public static final ListingPinOptionType PINNING_POWER_PIN_WAITING = new ListingPinOptionType("PINNING_POWER_PIN_WAITING", 6, "pinning_power_pin_waiting");

    private static final /* synthetic */ ListingPinOptionType[] $values() {
        return new ListingPinOptionType[]{WAITING, PINING, PINNING_SHUFFLE_WAITING, PINNING_SHUFFLE, PROMOTED, PINNING_POWER_PIN, PINNING_POWER_PIN_WAITING};
    }

    static {
        ListingPinOptionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingPinOptionType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<ListingPinOptionType> getEntries() {
        return $ENTRIES;
    }

    public static ListingPinOptionType valueOf(String str) {
        return (ListingPinOptionType) Enum.valueOf(ListingPinOptionType.class, str);
    }

    public static ListingPinOptionType[] values() {
        return (ListingPinOptionType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
