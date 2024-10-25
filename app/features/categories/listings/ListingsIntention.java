package com.forsale.app.features.categories.listings;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingsIntention.kt */
/* loaded from: classes2.dex */
public final class ListingsIntention {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListingsIntention[] $VALUES;
    public static final ListingsIntention LISTINGS = new ListingsIntention("LISTINGS", 0);
    public static final ListingsIntention SEARCH = new ListingsIntention("SEARCH", 1);
    public static final ListingsIntention RESET_SEARCH = new ListingsIntention("RESET_SEARCH", 2);

    private static final /* synthetic */ ListingsIntention[] $values() {
        return new ListingsIntention[]{LISTINGS, SEARCH, RESET_SEARCH};
    }

    static {
        ListingsIntention[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingsIntention(String str, int i11) {
    }

    public static a<ListingsIntention> getEntries() {
        return $ENTRIES;
    }

    public static ListingsIntention valueOf(String str) {
        return (ListingsIntention) Enum.valueOf(ListingsIntention.class, str);
    }

    public static ListingsIntention[] values() {
        return (ListingsIntention[]) $VALUES.clone();
    }
}
