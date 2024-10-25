package com.forsale.app.features.categories.listings;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingCardDisplayStyle.kt */
/* loaded from: classes2.dex */
public final class ListingDecoratorTypes {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListingDecoratorTypes[] $VALUES;
    public static final ListingDecoratorTypes CATEGORY_LISTINGS = new ListingDecoratorTypes("CATEGORY_LISTINGS", 0, ListingCardDisplayStyle.GENERAL);
    public static final ListingDecoratorTypes DEFAULT;
    public static final ListingDecoratorTypes GENERAL_LISTINGS;
    private final ListingCardDisplayStyle defaultItem;

    private static final /* synthetic */ ListingDecoratorTypes[] $values() {
        return new ListingDecoratorTypes[]{CATEGORY_LISTINGS, GENERAL_LISTINGS, DEFAULT};
    }

    static {
        ListingCardDisplayStyle listingCardDisplayStyle = ListingCardDisplayStyle.HALF_SCREEN;
        GENERAL_LISTINGS = new ListingDecoratorTypes("GENERAL_LISTINGS", 1, listingCardDisplayStyle);
        DEFAULT = new ListingDecoratorTypes("DEFAULT", 2, listingCardDisplayStyle);
        ListingDecoratorTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingDecoratorTypes(String str, int i11, ListingCardDisplayStyle listingCardDisplayStyle) {
        this.defaultItem = listingCardDisplayStyle;
    }

    public static a<ListingDecoratorTypes> getEntries() {
        return $ENTRIES;
    }

    public static ListingDecoratorTypes valueOf(String str) {
        return (ListingDecoratorTypes) Enum.valueOf(ListingDecoratorTypes.class, str);
    }

    public static ListingDecoratorTypes[] values() {
        return (ListingDecoratorTypes[]) $VALUES.clone();
    }

    public final ListingCardDisplayStyle getDefaultItem() {
        return this.defaultItem;
    }
}
