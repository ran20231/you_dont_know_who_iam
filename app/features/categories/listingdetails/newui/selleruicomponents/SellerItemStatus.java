package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SellerStatusModel.kt */
/* loaded from: classes2.dex */
public final class SellerItemStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SellerItemStatus[] $VALUES;
    public static final SellerItemStatus LIVE = new SellerItemStatus("LIVE", 0);
    public static final SellerItemStatus DRAFT = new SellerItemStatus("DRAFT", 1);
    public static final SellerItemStatus QUARANTINE = new SellerItemStatus("QUARANTINE", 2);
    public static final SellerItemStatus ARCHIVED = new SellerItemStatus("ARCHIVED", 3);

    private static final /* synthetic */ SellerItemStatus[] $values() {
        return new SellerItemStatus[]{LIVE, DRAFT, QUARANTINE, ARCHIVED};
    }

    static {
        SellerItemStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SellerItemStatus(String str, int i11) {
    }

    public static a<SellerItemStatus> getEntries() {
        return $ENTRIES;
    }

    public static SellerItemStatus valueOf(String str) {
        return (SellerItemStatus) Enum.valueOf(SellerItemStatus.class, str);
    }

    public static SellerItemStatus[] values() {
        return (SellerItemStatus[]) $VALUES.clone();
    }
}
