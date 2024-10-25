package com.forsale.app.features.categories.listings;

import a00.a;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingPlaceHolderImage.kt */
/* loaded from: classes2.dex */
public final class ListingPlaceHolderImage {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListingPlaceHolderImage[] $VALUES;
    private final String value;
    @c("default")
    public static final ListingPlaceHolderImage DEFAULT = new ListingPlaceHolderImage("DEFAULT", 0, "default");
    @c("automotive")
    public static final ListingPlaceHolderImage AUTOMOTIVE = new ListingPlaceHolderImage("AUTOMOTIVE", 1, "automotive");
    @c("property")
    public static final ListingPlaceHolderImage PROPERTY = new ListingPlaceHolderImage("PROPERTY", 2, "property");
    @c("jobs")
    public static final ListingPlaceHolderImage JOBS = new ListingPlaceHolderImage("JOBS", 3, "jobs");
    @c("services")
    public static final ListingPlaceHolderImage SERVICES = new ListingPlaceHolderImage("SERVICES", 4, "services");
    @c("buy_sell")
    public static final ListingPlaceHolderImage BUY_SELL = new ListingPlaceHolderImage("BUY_SELL", 5, "buy_sell");
    @c("pets")
    public static final ListingPlaceHolderImage PETS = new ListingPlaceHolderImage("PETS", 6, "pets");

    private static final /* synthetic */ ListingPlaceHolderImage[] $values() {
        return new ListingPlaceHolderImage[]{DEFAULT, AUTOMOTIVE, PROPERTY, JOBS, SERVICES, BUY_SELL, PETS};
    }

    static {
        ListingPlaceHolderImage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingPlaceHolderImage(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<ListingPlaceHolderImage> getEntries() {
        return $ENTRIES;
    }

    public static ListingPlaceHolderImage valueOf(String str) {
        return (ListingPlaceHolderImage) Enum.valueOf(ListingPlaceHolderImage.class, str);
    }

    public static ListingPlaceHolderImage[] values() {
        return (ListingPlaceHolderImage[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
