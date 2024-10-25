package com.forsale.app.features.categories.listings;

import a00.a;
import com.leanplum.core.BuildConfig;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingsTypes.kt */
/* loaded from: classes2.dex */
public final class ListingScreenID {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListingScreenID[] $VALUES;
    private final String value;
    public static final ListingScreenID MY_VIEW_HISTORY = new ListingScreenID("MY_VIEW_HISTORY", 0, BuildConfig.BUILD_NUMBER);
    public static final ListingScreenID WANTED_ITEMS = new ListingScreenID("WANTED_ITEMS", 1, "1");
    public static final ListingScreenID MY_FAVORITES = new ListingScreenID("MY_FAVORITES", 2, "2");

    private static final /* synthetic */ ListingScreenID[] $values() {
        return new ListingScreenID[]{MY_VIEW_HISTORY, WANTED_ITEMS, MY_FAVORITES};
    }

    static {
        ListingScreenID[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingScreenID(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<ListingScreenID> getEntries() {
        return $ENTRIES;
    }

    public static ListingScreenID valueOf(String str) {
        return (ListingScreenID) Enum.valueOf(ListingScreenID.class, str);
    }

    public static ListingScreenID[] values() {
        return (ListingScreenID[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
