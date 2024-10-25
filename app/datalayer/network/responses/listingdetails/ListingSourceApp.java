package com.forsale.app.datalayer.network.responses.listingdetails;

import a00.a;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingSourceApp.kt */
/* loaded from: classes2.dex */
public final class ListingSourceApp {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListingSourceApp[] $VALUES;
    @c("4sale")
    public static final ListingSourceApp FORSALE = new ListingSourceApp("FORSALE", 0, "4sale");
    @c("q8car")
    public static final ListingSourceApp Q8CAR = new ListingSourceApp("Q8CAR", 1, "q8car");
    private final String value;

    private static final /* synthetic */ ListingSourceApp[] $values() {
        return new ListingSourceApp[]{FORSALE, Q8CAR};
    }

    static {
        ListingSourceApp[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingSourceApp(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<ListingSourceApp> getEntries() {
        return $ENTRIES;
    }

    public static ListingSourceApp valueOf(String str) {
        return (ListingSourceApp) Enum.valueOf(ListingSourceApp.class, str);
    }

    public static ListingSourceApp[] values() {
        return (ListingSourceApp[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
