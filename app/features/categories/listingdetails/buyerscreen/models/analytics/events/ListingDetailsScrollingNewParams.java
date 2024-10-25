package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingDetailsScrollingEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsScrollingNewParams {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListingDetailsScrollingNewParams[] $VALUES;
    public static final ListingDetailsScrollingNewParams LISTING_MAX_VISITED_SECTION_NAME = new ListingDetailsScrollingNewParams("LISTING_MAX_VISITED_SECTION_NAME", 0, "MaxVisitedSectionName");
    public static final ListingDetailsScrollingNewParams LISTING_MAX_VISITED_SECTION_NUMBER = new ListingDetailsScrollingNewParams("LISTING_MAX_VISITED_SECTION_NUMBER", 1, "MaxVisitedSectionNumber");
    private final String key;

    private static final /* synthetic */ ListingDetailsScrollingNewParams[] $values() {
        return new ListingDetailsScrollingNewParams[]{LISTING_MAX_VISITED_SECTION_NAME, LISTING_MAX_VISITED_SECTION_NUMBER};
    }

    static {
        ListingDetailsScrollingNewParams[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingDetailsScrollingNewParams(String str, int i11, String str2) {
        this.key = str2;
    }

    public static a<ListingDetailsScrollingNewParams> getEntries() {
        return $ENTRIES;
    }

    public static ListingDetailsScrollingNewParams valueOf(String str) {
        return (ListingDetailsScrollingNewParams) Enum.valueOf(ListingDetailsScrollingNewParams.class, str);
    }

    public static ListingDetailsScrollingNewParams[] values() {
        return (ListingDetailsScrollingNewParams[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}
