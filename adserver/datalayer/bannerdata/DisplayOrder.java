package com.forsale.adserver.datalayer.bannerdata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: createBanner.kt */
/* loaded from: classes2.dex */
public final class DisplayOrder {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ DisplayOrder[] $VALUES;
    public static final DisplayOrder ASC = new DisplayOrder("ASC", 0, "ASC");
    public static final DisplayOrder DSC = new DisplayOrder("DSC", 1, "DSC");
    private final String order;

    private static final /* synthetic */ DisplayOrder[] $values() {
        return new DisplayOrder[]{ASC, DSC};
    }

    static {
        DisplayOrder[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DisplayOrder(String str, int i11, String str2) {
        this.order = str2;
    }

    public static a00.a<DisplayOrder> getEntries() {
        return $ENTRIES;
    }

    public static DisplayOrder valueOf(String str) {
        return (DisplayOrder) Enum.valueOf(DisplayOrder.class, str);
    }

    public static DisplayOrder[] values() {
        return (DisplayOrder[]) $VALUES.clone();
    }

    public final String getOrder() {
        return this.order;
    }
}
