package com.forsale.app.features.postad;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingOperation.kt */
/* loaded from: classes2.dex */
public final class ListingOperation {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ListingOperation[] $VALUES;
    public static final ListingOperation NEW_LISTING = new ListingOperation("NEW_LISTING", 0);
    public static final ListingOperation EDIT_LISTING = new ListingOperation("EDIT_LISTING", 1);

    private static final /* synthetic */ ListingOperation[] $values() {
        return new ListingOperation[]{NEW_LISTING, EDIT_LISTING};
    }

    static {
        ListingOperation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingOperation(String str, int i11) {
    }

    public static a00.a<ListingOperation> getEntries() {
        return $ENTRIES;
    }

    public static ListingOperation valueOf(String str) {
        return (ListingOperation) Enum.valueOf(ListingOperation.class, str);
    }

    public static ListingOperation[] values() {
        return (ListingOperation[]) $VALUES.clone();
    }
}
