package com.forsale.app.datalayer.network.responses.listingdetails;

import a00.a;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingArchivedBy.kt */
/* loaded from: classes2.dex */
public final class ListingArchivedBy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ListingArchivedBy[] $VALUES;
    private final String value;
    @c("admin")
    public static final ListingArchivedBy ADMIN = new ListingArchivedBy("ADMIN", 0, "admin");
    @c("user")
    public static final ListingArchivedBy USER = new ListingArchivedBy("USER", 1, "user");
    @c("expired")
    public static final ListingArchivedBy EXPIRED = new ListingArchivedBy("EXPIRED", 2, "expired");

    private static final /* synthetic */ ListingArchivedBy[] $values() {
        return new ListingArchivedBy[]{ADMIN, USER, EXPIRED};
    }

    static {
        ListingArchivedBy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ListingArchivedBy(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<ListingArchivedBy> getEntries() {
        return $ENTRIES;
    }

    public static ListingArchivedBy valueOf(String str) {
        return (ListingArchivedBy) Enum.valueOf(ListingArchivedBy.class, str);
    }

    public static ListingArchivedBy[] values() {
        return (ListingArchivedBy[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
