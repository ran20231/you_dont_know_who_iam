package com.forsale.app.features.categories.listingdetails;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingDetailsOwnerActions.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsOwnerActions {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ListingDetailsOwnerActions[] $VALUES;
    public static final ListingDetailsOwnerActions BOOST_ADDONS = new ListingDetailsOwnerActions("BOOST_ADDONS", 0, "addons");
    private final String value;

    private static final /* synthetic */ ListingDetailsOwnerActions[] $values() {
        return new ListingDetailsOwnerActions[]{BOOST_ADDONS};
    }

    static {
        ListingDetailsOwnerActions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingDetailsOwnerActions(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<ListingDetailsOwnerActions> getEntries() {
        return $ENTRIES;
    }

    public static ListingDetailsOwnerActions valueOf(String str) {
        return (ListingDetailsOwnerActions) Enum.valueOf(ListingDetailsOwnerActions.class, str);
    }

    public static ListingDetailsOwnerActions[] values() {
        return (ListingDetailsOwnerActions[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
