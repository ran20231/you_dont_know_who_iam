package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingDetailsSections.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsSections {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ListingDetailsSections[] $VALUES;
    private final String sectionTitle;
    public static final ListingDetailsSections MEDIA_SECTION = new ListingDetailsSections("MEDIA_SECTION", 0, "Media Section");
    public static final ListingDetailsSections MAIN_INFO_SECTION = new ListingDetailsSections("MAIN_INFO_SECTION", 1, "Main Information Section");
    public static final ListingDetailsSections SPECIFICATIONS_SECTION = new ListingDetailsSections("SPECIFICATIONS_SECTION", 2, "Specifications Section");
    public static final ListingDetailsSections ADDITIONAL_DETAILS_SECTION = new ListingDetailsSections("ADDITIONAL_DETAILS_SECTION", 3, "Additional Details Section");
    public static final ListingDetailsSections DESCRIPTION_SECTION = new ListingDetailsSections("DESCRIPTION_SECTION", 4, "Description Section");
    public static final ListingDetailsSections REPORT_AD_SECTION = new ListingDetailsSections("REPORT_AD_SECTION", 5, "Report Ad Section");
    public static final ListingDetailsSections LOCATION_SECTION = new ListingDetailsSections("LOCATION_SECTION", 6, "Location Section");
    public static final ListingDetailsSections SELLER_SECTION = new ListingDetailsSections("SELLER_SECTION", 7, "Seller Section");
    public static final ListingDetailsSections GAM_SECTION = new ListingDetailsSections("GAM_SECTION", 8, "GAM Section");
    public static final ListingDetailsSections RECOMMENDED_ADS_SECTION = new ListingDetailsSections("RECOMMENDED_ADS_SECTION", 9, "Recommended Ads Section");
    public static final ListingDetailsSections SIMILAR_ADS_SECTION = new ListingDetailsSections("SIMILAR_ADS_SECTION", 10, "Similar Ads Section");
    public static final ListingDetailsSections RECENTLY_VIEWED_SECTION = new ListingDetailsSections("RECENTLY_VIEWED_SECTION", 11, "Recently Viewed Section");

    private static final /* synthetic */ ListingDetailsSections[] $values() {
        return new ListingDetailsSections[]{MEDIA_SECTION, MAIN_INFO_SECTION, SPECIFICATIONS_SECTION, ADDITIONAL_DETAILS_SECTION, DESCRIPTION_SECTION, REPORT_AD_SECTION, LOCATION_SECTION, SELLER_SECTION, GAM_SECTION, RECOMMENDED_ADS_SECTION, SIMILAR_ADS_SECTION, RECENTLY_VIEWED_SECTION};
    }

    static {
        ListingDetailsSections[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingDetailsSections(String str, int i11, String str2) {
        this.sectionTitle = str2;
    }

    public static a00.a<ListingDetailsSections> getEntries() {
        return $ENTRIES;
    }

    public static ListingDetailsSections valueOf(String str) {
        return (ListingDetailsSections) Enum.valueOf(ListingDetailsSections.class, str);
    }

    public static ListingDetailsSections[] values() {
        return (ListingDetailsSections[]) $VALUES.clone();
    }

    public final String getSectionTitle() {
        return this.sectionTitle;
    }
}
