package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics;

import com.leanplum.internal.Constants;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingMediaType.kt */
/* loaded from: classes2.dex */
public final class ListingMediaType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ListingMediaType[] $VALUES;
    private final String value;
    public static final ListingMediaType Image = new ListingMediaType(Constants.Keys.INBOX_IMAGE, 0, Constants.Keys.INBOX_IMAGE);
    public static final ListingMediaType Video = new ListingMediaType("Video", 1, "Video");
    public static final ListingMediaType ThreeDTour = new ListingMediaType("ThreeDTour", 2, "3D Tour");
    public static final ListingMediaType PDF = new ListingMediaType("PDF", 3, "PDF");
    public static final ListingMediaType Map = new ListingMediaType("Map", 4, "Map");

    private static final /* synthetic */ ListingMediaType[] $values() {
        return new ListingMediaType[]{Image, Video, ThreeDTour, PDF, Map};
    }

    static {
        ListingMediaType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingMediaType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<ListingMediaType> getEntries() {
        return $ENTRIES;
    }

    public static ListingMediaType valueOf(String str) {
        return (ListingMediaType) Enum.valueOf(ListingMediaType.class, str);
    }

    public static ListingMediaType[] values() {
        return (ListingMediaType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
