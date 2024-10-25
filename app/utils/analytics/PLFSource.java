package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PLFSource.kt */
/* loaded from: classes3.dex */
public final class PLFSource {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ PLFSource[] $VALUES;
    private final String value;
    public static final PLFSource SEARCH_EMPTY_SPOTLIGHT = new PLFSource("SEARCH_EMPTY_SPOTLIGHT", 0, "Search Empty Spotlight");
    public static final PLFSource SEARCH_SPOTLIGHT = new PLFSource("SEARCH_SPOTLIGHT", 1, "Search Spotlight");
    public static final PLFSource SEARCH_SPOTLIGHT_SEE_ALL = new PLFSource("SEARCH_SPOTLIGHT_SEE_ALL", 2, "Search Spotlight See All");
    public static final PLFSource HOT_ZONE_FILLER = new PLFSource("HOT_ZONE_FILLER", 3, "Hot Zone Filler");
    public static final PLFSource HOT_ZONE_SEE_ALL_FILLER = new PLFSource("HOT_ZONE_SEE_ALL_FILLER", 4, "Hot Zone See All Filler");
    public static final PLFSource HOT_ZONE_EMPTY_FILLER = new PLFSource("HOT_ZONE_EMPTY_FILLER", 5, "Hot Zone Empty Filler");
    public static final PLFSource PROFILE = new PLFSource("PROFILE", 6, "Profile");
    public static final PLFSource EDIT_LISTING = new PLFSource("EDIT_LISTING", 7, "Edit Listing");
    public static final PLFSource ADD_LISTING = new PLFSource("ADD_LISTING", 8, "Add Listing");
    public static final PLFSource PLF = new PLFSource("PLF", 9, "PLF");
    public static final PLFSource CHANGE_CATEGORY_ALERT = new PLFSource("CHANGE_CATEGORY_ALERT", 10, "Change Category Alert");
    public static final PLFSource DIRECT_LINK = new PLFSource("DIRECT_LINK", 11, "Direct Link");
    public static final PLFSource ADD_LISTING_SUCCESS = new PLFSource("ADD_LISTING_SUCCESS", 12, "Add Listing - Success");
    public static final PLFSource NAVBAR = new PLFSource("NAVBAR", 13, "Navbar");
    public static final PLFSource UPLOAD_LISTING_SUCCESS_ALERT = new PLFSource("UPLOAD_LISTING_SUCCESS_ALERT", 14, "Upload Listing Success Alert");

    private static final /* synthetic */ PLFSource[] $values() {
        return new PLFSource[]{SEARCH_EMPTY_SPOTLIGHT, SEARCH_SPOTLIGHT, SEARCH_SPOTLIGHT_SEE_ALL, HOT_ZONE_FILLER, HOT_ZONE_SEE_ALL_FILLER, HOT_ZONE_EMPTY_FILLER, PROFILE, EDIT_LISTING, ADD_LISTING, PLF, CHANGE_CATEGORY_ALERT, DIRECT_LINK, ADD_LISTING_SUCCESS, NAVBAR, UPLOAD_LISTING_SUCCESS_ALERT};
    }

    static {
        PLFSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PLFSource(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<PLFSource> getEntries() {
        return $ENTRIES;
    }

    public static PLFSource valueOf(String str) {
        return (PLFSource) Enum.valueOf(PLFSource.class, str);
    }

    public static PLFSource[] values() {
        return (PLFSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
