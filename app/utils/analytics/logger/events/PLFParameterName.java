package com.forsale.app.utils.analytics.logger.events;

import a00.a;
import wi.e;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PLFParameterName.kt */
/* loaded from: classes3.dex */
public final class PLFParameterName implements e {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PLFParameterName[] $VALUES;
    private final String value;
    public static final PLFParameterName PHONE_NUMBER = new PLFParameterName("PHONE_NUMBER", 0, "PhoneNumber");
    public static final PLFParameterName CATEGORY_NAME = new PLFParameterName("CATEGORY_NAME", 1, "CategoryName");
    public static final PLFParameterName CATEGORY_ID = new PLFParameterName("CATEGORY_ID", 2, "CategoryID");
    public static final PLFParameterName LISTING_PRICE = new PLFParameterName("LISTING_PRICE", 3, "ListingPrice");
    public static final PLFParameterName BUNDLE_PRICE = new PLFParameterName("BUNDLE_PRICE", 4, "BundlePrice");
    public static final PLFParameterName TOTAL_LISTING_PRICE = new PLFParameterName("TOTAL_LISTING_PRICE", 5, "TotalListingPrice");
    public static final PLFParameterName LOCATION_NAME = new PLFParameterName("LOCATION_NAME", 6, "LocationName");
    public static final PLFParameterName HIDE_MY_NUMBER = new PLFParameterName("HIDE_MY_NUMBER", 7, "HideMyNumber");
    public static final PLFParameterName ADD_ONS_IDS = new PLFParameterName("ADD_ONS_IDS", 8, "AddOnsIDs");
    public static final PLFParameterName ADD_ONS_NAMES = new PLFParameterName("ADD_ONS_NAMES", 9, "AddOnsNames");
    public static final PLFParameterName DO_NOT_DISTURB = new PLFParameterName("DO_NOT_DISTURB", 10, "DoNotDisturb");
    public static final PLFParameterName DEVICE_ID = new PLFParameterName("DEVICE_ID", 11, "DeviceId");
    public static final PLFParameterName AMPLITUDE_USER_ID = new PLFParameterName("AMPLITUDE_USER_ID", 12, "AmplitudeUserId");
    public static final PLFParameterName PLATFORM = new PLFParameterName("PLATFORM", 13, "Platform");

    private static final /* synthetic */ PLFParameterName[] $values() {
        return new PLFParameterName[]{PHONE_NUMBER, CATEGORY_NAME, CATEGORY_ID, LISTING_PRICE, BUNDLE_PRICE, TOTAL_LISTING_PRICE, LOCATION_NAME, HIDE_MY_NUMBER, ADD_ONS_IDS, ADD_ONS_NAMES, DO_NOT_DISTURB, DEVICE_ID, AMPLITUDE_USER_ID, PLATFORM};
    }

    static {
        PLFParameterName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PLFParameterName(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<PLFParameterName> getEntries() {
        return $ENTRIES;
    }

    public static PLFParameterName valueOf(String str) {
        return (PLFParameterName) Enum.valueOf(PLFParameterName.class, str);
    }

    public static PLFParameterName[] values() {
        return (PLFParameterName[]) $VALUES.clone();
    }

    @Override // wi.e
    public String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return getValue();
    }
}
