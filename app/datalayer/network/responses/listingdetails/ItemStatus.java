package com.forsale.app.datalayer.network.responses.listingdetails;

import a00.a;
import com.adjust.sdk.Constants;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ItemStatus.kt */
/* loaded from: classes2.dex */
public final class ItemStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ItemStatus[] $VALUES;
    private final String value;
    @c(Constants.NORMAL)
    public static final ItemStatus NORMAL = new ItemStatus("NORMAL", 0, Constants.NORMAL);
    @c("pinned")
    public static final ItemStatus PINNED = new ItemStatus("PINNED", 1, "pinned");
    @c("waiting")
    public static final ItemStatus WAITING = new ItemStatus("WAITING", 2, "waiting");
    @c("commercial")
    public static final ItemStatus COMMERCIAL = new ItemStatus("COMMERCIAL", 3, "commercial");
    @c("commercial_banner")
    public static final ItemStatus COMMERCIAL_BANNER = new ItemStatus("COMMERCIAL_BANNER", 4, "commercial_banner");
    @c("draft")
    public static final ItemStatus DRAFT = new ItemStatus("DRAFT", 5, "draft");
    @c("default")
    public static final ItemStatus DEFAULT = new ItemStatus("DEFAULT", 6, "default");
    @c("quarantine")
    public static final ItemStatus QUARANTINE = new ItemStatus("QUARANTINE", 7, "quarantine");

    private static final /* synthetic */ ItemStatus[] $values() {
        return new ItemStatus[]{NORMAL, PINNED, WAITING, COMMERCIAL, COMMERCIAL_BANNER, DRAFT, DEFAULT, QUARANTINE};
    }

    static {
        ItemStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ItemStatus(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<ItemStatus> getEntries() {
        return $ENTRIES;
    }

    public static ItemStatus valueOf(String str) {
        return (ItemStatus) Enum.valueOf(ItemStatus.class, str);
    }

    public static ItemStatus[] values() {
        return (ItemStatus[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
