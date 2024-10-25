package com.forsale.app.datalayer.network.entities;

import a00.a;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ListingDetailsEntity.kt */
/* loaded from: classes2.dex */
public final class BusinessType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BusinessType[] $VALUES;
    @c("personal")
    public static final BusinessType PERSONAL = new BusinessType("PERSONAL", 0);
    @c("business")
    public static final BusinessType BUSINESS = new BusinessType("BUSINESS", 1);

    private static final /* synthetic */ BusinessType[] $values() {
        return new BusinessType[]{PERSONAL, BUSINESS};
    }

    static {
        BusinessType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BusinessType(String str, int i11) {
    }

    public static a<BusinessType> getEntries() {
        return $ENTRIES;
    }

    public static BusinessType valueOf(String str) {
        return (BusinessType) Enum.valueOf(BusinessType.class, str);
    }

    public static BusinessType[] values() {
        return (BusinessType[]) $VALUES.clone();
    }
}
