package com.forsale.app.features.categories.listingdetails.newui.structure;

import a00.a;
import com.google.android.gms.stats.CodePackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingDetailsComponentTypes.kt */
/* loaded from: classes2.dex */
public final class BuyerListingDetailsTypes {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BuyerListingDetailsTypes[] $VALUES;
    public static final BuyerListingDetailsTypes BUYER_NAVIGATION_ACTIONS = new BuyerListingDetailsTypes("BUYER_NAVIGATION_ACTIONS", 0);
    public static final BuyerListingDetailsTypes MEDIA_SLIDER = new BuyerListingDetailsTypes("MEDIA_SLIDER", 1);
    public static final BuyerListingDetailsTypes MAIN_INFO = new BuyerListingDetailsTypes("MAIN_INFO", 2);
    public static final BuyerListingDetailsTypes USER_INFO = new BuyerListingDetailsTypes("USER_INFO", 3);
    public static final BuyerListingDetailsTypes ATTRIBUTES = new BuyerListingDetailsTypes("ATTRIBUTES", 4);
    public static final BuyerListingDetailsTypes DESCRIPTION = new BuyerListingDetailsTypes("DESCRIPTION", 5);
    public static final BuyerListingDetailsTypes DISTRICTS = new BuyerListingDetailsTypes("DISTRICTS", 6);
    public static final BuyerListingDetailsTypes LOCATION = new BuyerListingDetailsTypes(CodePackage.LOCATION, 7);
    public static final BuyerListingDetailsTypes CALL_USER = new BuyerListingDetailsTypes("CALL_USER", 8);
    public static final BuyerListingDetailsTypes CONTACT_USER_MORE = new BuyerListingDetailsTypes("CONTACT_USER_MORE", 9);
    public static final BuyerListingDetailsTypes USER_ACTIONS = new BuyerListingDetailsTypes("USER_ACTIONS", 10);
    public static final BuyerListingDetailsTypes RECOMMENDED = new BuyerListingDetailsTypes("RECOMMENDED", 11);
    public static final BuyerListingDetailsTypes PREVIEW_HINT = new BuyerListingDetailsTypes("PREVIEW_HINT", 12);
    public static final BuyerListingDetailsTypes DFP_BANNER1 = new BuyerListingDetailsTypes("DFP_BANNER1", 13);
    public static final BuyerListingDetailsTypes DFP_BANNER2 = new BuyerListingDetailsTypes("DFP_BANNER2", 14);
    public static final BuyerListingDetailsTypes TEADS_BANNER = new BuyerListingDetailsTypes("TEADS_BANNER", 15);
    public static final BuyerListingDetailsTypes MEDIA_TYPES = new BuyerListingDetailsTypes("MEDIA_TYPES", 16);

    private static final /* synthetic */ BuyerListingDetailsTypes[] $values() {
        return new BuyerListingDetailsTypes[]{BUYER_NAVIGATION_ACTIONS, MEDIA_SLIDER, MAIN_INFO, USER_INFO, ATTRIBUTES, DESCRIPTION, DISTRICTS, LOCATION, CALL_USER, CONTACT_USER_MORE, USER_ACTIONS, RECOMMENDED, PREVIEW_HINT, DFP_BANNER1, DFP_BANNER2, TEADS_BANNER, MEDIA_TYPES};
    }

    static {
        BuyerListingDetailsTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BuyerListingDetailsTypes(String str, int i11) {
    }

    public static a<BuyerListingDetailsTypes> getEntries() {
        return $ENTRIES;
    }

    public static BuyerListingDetailsTypes valueOf(String str) {
        return (BuyerListingDetailsTypes) Enum.valueOf(BuyerListingDetailsTypes.class, str);
    }

    public static BuyerListingDetailsTypes[] values() {
        return (BuyerListingDetailsTypes[]) $VALUES.clone();
    }
}
