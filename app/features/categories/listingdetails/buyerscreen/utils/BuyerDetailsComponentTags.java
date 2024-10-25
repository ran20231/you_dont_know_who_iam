package com.forsale.app.features.categories.listingdetails.buyerscreen.utils;

import a00.a;
import com.google.android.gms.stats.CodePackage;
import falcon.chat.entities.Constants;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BuyerDetailsComponentTags.kt */
/* loaded from: classes2.dex */
public final class BuyerDetailsComponentTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BuyerDetailsComponentTags[] $VALUES;
    private final String tag;
    public static final BuyerDetailsComponentTags VIEWS_COUNT = new BuyerDetailsComponentTags("VIEWS_COUNT", 0, "ListingViewCount");
    public static final BuyerDetailsComponentTags DATE_SORT = new BuyerDetailsComponentTags("DATE_SORT", 1, "ListingDateSort");
    public static final BuyerDetailsComponentTags TITLE = new BuyerDetailsComponentTags(Constants.ITEM_TITLE, 2, "ListingTitle");
    public static final BuyerDetailsComponentTags PRICE = new BuyerDetailsComponentTags("PRICE", 3, "ListingPrice");
    public static final BuyerDetailsComponentTags LOCATION = new BuyerDetailsComponentTags(CodePackage.LOCATION, 4, "ListingLocation");
    public static final BuyerDetailsComponentTags LISTING_DETAILS_NAVBAR_FAVOURITE_ICON = new BuyerDetailsComponentTags("LISTING_DETAILS_NAVBAR_FAVOURITE_ICON", 5, "favourite_icon");
    public static final BuyerDetailsComponentTags LISTING_DETAILS_NAVBAR_SHARE_ICON = new BuyerDetailsComponentTags("LISTING_DETAILS_NAVBAR_SHARE_ICON", 6, "share_icon");
    public static final BuyerDetailsComponentTags LISTING_DETAILS_NAVBAR_DOWNLOAD_ICON = new BuyerDetailsComponentTags("LISTING_DETAILS_NAVBAR_DOWNLOAD_ICON", 7, "download_icon");
    public static final BuyerDetailsComponentTags NAV_TITLE = new BuyerDetailsComponentTags("NAV_TITLE", 8, "NavBarListingTitle");
    public static final BuyerDetailsComponentTags NAV_PRICE = new BuyerDetailsComponentTags("NAV_PRICE", 9, "NavBarListingPrice");

    private static final /* synthetic */ BuyerDetailsComponentTags[] $values() {
        return new BuyerDetailsComponentTags[]{VIEWS_COUNT, DATE_SORT, TITLE, PRICE, LOCATION, LISTING_DETAILS_NAVBAR_FAVOURITE_ICON, LISTING_DETAILS_NAVBAR_SHARE_ICON, LISTING_DETAILS_NAVBAR_DOWNLOAD_ICON, NAV_TITLE, NAV_PRICE};
    }

    static {
        BuyerDetailsComponentTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BuyerDetailsComponentTags(String str, int i11, String str2) {
        this.tag = str2;
    }

    public static a<BuyerDetailsComponentTags> getEntries() {
        return $ENTRIES;
    }

    public static BuyerDetailsComponentTags valueOf(String str) {
        return (BuyerDetailsComponentTags) Enum.valueOf(BuyerDetailsComponentTags.class, str);
    }

    public static BuyerDetailsComponentTags[] values() {
        return (BuyerDetailsComponentTags[]) $VALUES.clone();
    }

    public final String getTag() {
        return this.tag;
    }
}
