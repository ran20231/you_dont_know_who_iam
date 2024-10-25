package com.forsale.app.features.categories.listings;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingsTypes.kt */
/* loaded from: classes2.dex */
public final class ListingsTypes {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListingsTypes[] $VALUES;
    public static final ListingsTypes NORMAL_LISTINGS = new ListingsTypes("NORMAL_LISTINGS", 0);
    public static final ListingsTypes MY_FAVORITES = new ListingsTypes("MY_FAVORITES", 1);
    public static final ListingsTypes MY_LISTINGS = new ListingsTypes("MY_LISTINGS", 2);
    public static final ListingsTypes SPOTLIGHT = new ListingsTypes("SPOTLIGHT", 3);
    public static final ListingsTypes SPOTLIGHT_ALL = new ListingsTypes("SPOTLIGHT_ALL", 4);
    public static final ListingsTypes WANTED_ITEMS = new ListingsTypes("WANTED_ITEMS", 5);
    public static final ListingsTypes OTHER_USER_ITEMS = new ListingsTypes("OTHER_USER_ITEMS", 6);
    public static final ListingsTypes USER_ITEMS = new ListingsTypes("USER_ITEMS", 7);
    public static final ListingsTypes MY_VIEW_HISTORY = new ListingsTypes("MY_VIEW_HISTORY", 8);
    public static final ListingsTypes SEARCH_SCREEN = new ListingsTypes("SEARCH_SCREEN", 9);
    public static final ListingsTypes HOT_ZONES = new ListingsTypes("HOT_ZONES", 10);
    public static final ListingsTypes NEW_ARRIVALS = new ListingsTypes("NEW_ARRIVALS", 11);
    public static final ListingsTypes RECOMMENDED_LISTINGS = new ListingsTypes("RECOMMENDED_LISTINGS", 12);
    public static final ListingsTypes FOR_SALE_REALTY = new ListingsTypes("FOR_SALE_REALTY", 13);
    public static final ListingsTypes FEATURED = new ListingsTypes("FEATURED", 14);
    public static final ListingsTypes BUSINESS_COMMERCIAL = new ListingsTypes("BUSINESS_COMMERCIAL", 15);

    private static final /* synthetic */ ListingsTypes[] $values() {
        return new ListingsTypes[]{NORMAL_LISTINGS, MY_FAVORITES, MY_LISTINGS, SPOTLIGHT, SPOTLIGHT_ALL, WANTED_ITEMS, OTHER_USER_ITEMS, USER_ITEMS, MY_VIEW_HISTORY, SEARCH_SCREEN, HOT_ZONES, NEW_ARRIVALS, RECOMMENDED_LISTINGS, FOR_SALE_REALTY, FEATURED, BUSINESS_COMMERCIAL};
    }

    static {
        ListingsTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingsTypes(String str, int i11) {
    }

    public static a<ListingsTypes> getEntries() {
        return $ENTRIES;
    }

    public static ListingsTypes valueOf(String str) {
        return (ListingsTypes) Enum.valueOf(ListingsTypes.class, str);
    }

    public static ListingsTypes[] values() {
        return (ListingsTypes[]) $VALUES.clone();
    }
}
