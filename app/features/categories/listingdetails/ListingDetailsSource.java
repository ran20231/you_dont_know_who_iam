package com.forsale.app.features.categories.listingdetails;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingDetailsAnalyticPayload.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsSource {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ListingDetailsSource[] $VALUES;

    private static final /* synthetic */ ListingDetailsSource[] $values() {
        return new ListingDetailsSource[0];
    }

    static {
        ListingDetailsSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingDetailsSource(String str, int i11) {
    }

    public static a00.a<ListingDetailsSource> getEntries() {
        return $ENTRIES;
    }

    public static ListingDetailsSource valueOf(String str) {
        return (ListingDetailsSource) Enum.valueOf(ListingDetailsSource.class, str);
    }

    public static ListingDetailsSource[] values() {
        return (ListingDetailsSource[]) $VALUES.clone();
    }
}
