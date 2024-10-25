package com.forsale.app.features.categories.listingdetails.newui.structure;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingDetailsComponentTypes.kt */
/* loaded from: classes2.dex */
public final class SellerListingDetailsTypes {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SellerListingDetailsTypes[] $VALUES;
    public static final SellerListingDetailsTypes SOURCE_ITEM = new SellerListingDetailsTypes("SOURCE_ITEM", 0);
    public static final SellerListingDetailsTypes PREVIEW_CARD = new SellerListingDetailsTypes("PREVIEW_CARD", 1);
    public static final SellerListingDetailsTypes LISTING_LIFE_TIME = new SellerListingDetailsTypes("LISTING_LIFE_TIME", 2);
    public static final SellerListingDetailsTypes ANALYTIC_CARD = new SellerListingDetailsTypes("ANALYTIC_CARD", 3);
    public static final SellerListingDetailsTypes BOOST_YOUR_AD = new SellerListingDetailsTypes("BOOST_YOUR_AD", 4);
    public static final SellerListingDetailsTypes AUTO_REPOST = new SellerListingDetailsTypes("AUTO_REPOST", 5);
    public static final SellerListingDetailsTypes DONT_DISTURB = new SellerListingDetailsTypes("DONT_DISTURB", 6);
    public static final SellerListingDetailsTypes ARCHIVE_CARD = new SellerListingDetailsTypes("ARCHIVE_CARD", 7);
    public static final SellerListingDetailsTypes QUARANTINE_CARD = new SellerListingDetailsTypes("QUARANTINE_CARD", 8);
    public static final SellerListingDetailsTypes DRAFT_CARD = new SellerListingDetailsTypes("DRAFT_CARD", 9);

    private static final /* synthetic */ SellerListingDetailsTypes[] $values() {
        return new SellerListingDetailsTypes[]{SOURCE_ITEM, PREVIEW_CARD, LISTING_LIFE_TIME, ANALYTIC_CARD, BOOST_YOUR_AD, AUTO_REPOST, DONT_DISTURB, ARCHIVE_CARD, QUARANTINE_CARD, DRAFT_CARD};
    }

    static {
        SellerListingDetailsTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SellerListingDetailsTypes(String str, int i11) {
    }

    public static a<SellerListingDetailsTypes> getEntries() {
        return $ENTRIES;
    }

    public static SellerListingDetailsTypes valueOf(String str) {
        return (SellerListingDetailsTypes) Enum.valueOf(SellerListingDetailsTypes.class, str);
    }

    public static SellerListingDetailsTypes[] values() {
        return (SellerListingDetailsTypes[]) $VALUES.clone();
    }
}
