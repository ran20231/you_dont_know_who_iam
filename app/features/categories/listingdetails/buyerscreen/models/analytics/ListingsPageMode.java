package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingsPageMode.kt */
/* loaded from: classes2.dex */
public final class ListingsPageMode {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ListingsPageMode[] $VALUES;
    public static final ListingsPageMode LISTINGS = new ListingsPageMode("LISTINGS", 0, "Listings");
    public static final ListingsPageMode SEARCH = new ListingsPageMode("SEARCH", 1, "Search");
    private final String value;

    private static final /* synthetic */ ListingsPageMode[] $values() {
        return new ListingsPageMode[]{LISTINGS, SEARCH};
    }

    static {
        ListingsPageMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingsPageMode(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<ListingsPageMode> getEntries() {
        return $ENTRIES;
    }

    public static ListingsPageMode valueOf(String str) {
        return (ListingsPageMode) Enum.valueOf(ListingsPageMode.class, str);
    }

    public static ListingsPageMode[] values() {
        return (ListingsPageMode[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
